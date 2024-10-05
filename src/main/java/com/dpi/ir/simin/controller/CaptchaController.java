package com.dpi.ir.simin.controller;
import com.dpi.ir.simin.CaptchaUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@RestController
public class CaptchaController {

    @GetMapping("/api/captcha")
    public void getCaptcha(HttpSession session, HttpServletResponse response) throws IOException {
        // Generate CAPTCHA text
        String captchaText = CaptchaUtil.generateCaptchaText(6); // 6 characters long

        // Store CAPTCHA text in session
        session.setAttribute("captcha", captchaText);

        // Generate CAPTCHA image
        byte[] captchaImage = CaptchaUtil.generateCaptchaImage(captchaText);

        // Set response headers
        response.setContentType("image/png");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        // Write the image to the response output stream
        OutputStream outputStream = response.getOutputStream();
        outputStream.write(captchaImage);
        outputStream.close();
    }

    @PostMapping("/api/validate-captcha")
    public String validateCaptcha(@RequestParam("captcha") String captchaInput, HttpSession session) {
        // Retrieve the CAPTCHA from session
        String captchaText = (String) session.getAttribute("captcha");

        // Validate user input with stored CAPTCHA
        if (captchaText != null && captchaText.equalsIgnoreCase(captchaInput)) {
            return "CAPTCHA validation passed!";
        } else {
            return "Invalid CAPTCHA!";
        }
    }
}
