package com.dpi.ir.simin.controller;

import com.dpi.ir.simin.Exception.DuplicateLetterNumberException;
import com.dpi.ir.simin.Exception.LetterNotFoundException;
import com.dpi.ir.simin.dto.LetterDTO;
import com.dpi.ir.simin.dto.LetterReferenceDTO;
import com.dpi.ir.simin.entity.LetterReference;
import com.dpi.ir.simin.service.LetterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;

import java.util.List;


@RestController
@RequestMapping("/api/v1/letters")
public class LetterController {

    private final LetterService letterService;

    public LetterController(LetterService letterService) {
        this.letterService = letterService;
    }


    @PostMapping("/createPhysicalLetter")
    public ResponseEntity<String> createLetter(@Valid @RequestBody LetterDTO letterDTO) {
        try {
            letterService.createLetter(letterDTO);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (DuplicateLetterNumberException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);  
        }
    }


    @PostMapping("/updatePhysicalLetter")
    public ResponseEntity<String> updateLetter(@Valid @RequestBody LetterDTO letterDTO) {
        try {
         
                letterService.updateLetter(letterDTO);
                return new ResponseEntity<>(HttpStatus.OK);

        } catch (LetterNotFoundException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);  
        }
    }


    @PostMapping("/getAllReferences")
    public List<LetterReference> getAllLetterReferences(@Valid @RequestBody LetterReferenceDTO letterReferenceDTO) {
        return letterService.getAllLetterReferences(letterReferenceDTO);
    }
}
