package com.dpi.ir.simin.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LetterReferenceDTO {

    @NotNull(message = "Letter number cannot be null")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Letter number contains invalid characters")
    @Size(max = 12, message = "Letter number must be at most 12 characters long")
    private String letterNumber;
}
