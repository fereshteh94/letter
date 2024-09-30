package com.dpi.ir.simin.dto;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class LetterDTO {

    @NotNull(message = "Letter number cannot be null")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Letter number contains invalid characters")
    @Size(max = 12, message = "Letter number must be at most 12 characters long")
    private String letterNumber;

    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Reference number contains invalid characters")
    @Size(max = 16, message = "Reference number must be at most 16 characters long")
    private String referenceNo;

    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Indictment number contains invalid characters")
    @Size(max = 50, message = "Indictment number must be at most 50 characters long")
    private String indictmentNo;

    @Pattern(regexp = "^[A-Z]?$", message = "Letter type contains invalid characters")
    @Size(max = 1, message = "Letter type must be 1 character long")
    private String letterType;

    @Pattern(regexp = "^[A-Z]?$", message = "Customer type contains invalid characters")
    @Size(max = 1, message = "Customer type must be 1 character long")
    private String customerType;

    @Pattern(regexp = "^[0-9]*$", message = "Letter date contains invalid characters")
    @Size(max = 8, message = "Letter date must be 8 characters long")
    private String letterDate;

    @Pattern(regexp = "^[0-9]*$", message = "Send date contains invalid characters")
    @Size(max = 8, message = "Send date must be 8 characters long")
    private String sendDate;

    @Size(max = 1000, message = "Letter text must be at most 1000 characters long")
    private String letterText;

    private BigDecimal blockAmount;

    @Pattern(regexp = "^[A-Z]?$", message = "Block type contains invalid characters")
    @Size(max = 1, message = "Block type must be 1 character long")
    private String blockType;

    @Pattern(regexp = "^[0-9]*$", message = "Month blocked duration contains invalid characters")
    @Size(max = 2, message = "Month blocked duration must be at most 2 characters long")
    private String monthBlockedDuration;

    @Pattern(regexp = "^[A-Z]?$", message = "Is amount limited contains invalid characters")
    @Size(max = 1, message = "Is amount limited must be 1 character long")
    private String isAmountLimited;

    @Pattern(regexp = "^[a-zA-Z ]*$", message = "Subscriber name contains invalid characters")
    @Size(max = 50, message = "Subscriber name must be at most 50 characters long")
    private String subscriberName;

    @Pattern(regexp = "^[A-Z]?$", message = "Priority contains invalid characters")
    @Size(max = 1, message = "Priority must be 1 character long")
    private String priority;

    @Pattern(regexp = "^[0-9]*$", message = "National code contains invalid characters")
    @Size(max = 11, message = "National code must be at most 11 characters long")
    private String nationalCode;

    @Pattern(regexp = "^[a-zA-Z]*$", message = "First name contains invalid characters")
    @Size(max = 50, message = "First name must be at most 50 characters long")
    private String firstName;

    @Pattern(regexp = "^[a-zA-Z]*$", message = "Last name contains invalid characters")
    @Size(max = 100, message = "Last name must be at most 100 characters long")
    private String lastName;

    @Pattern(regexp = "^[a-zA-Z]*$", message = "Father's name contains invalid characters")
    @Size(max = 50, message = "Father's name must be at most 50 characters long")
    private String fatherName;

    @Pattern(regexp = "^[0-9]*$", message = "Birthdate contains invalid characters")
    @Size(max = 8, message = "Birthdate must be 8 characters long")
    private String birthdate;

    @Pattern(regexp = "^[a-zA-Z ]*$", message = "Issue place contains invalid characters")
    @Size(max = 50, message = "Issue place must be at most 50 characters long")
    private String issuePlace;

    @Pattern(regexp = "^[0-9]*$", message = "ID number contains invalid characters")
    @Size(max = 11, message = "ID number must be at most 11 characters long")
    private String idNumber;

    @Pattern(regexp = "^[a-zA-Z ]*$", message = "Judge name contains invalid characters")
    @Size(max = 50, message = "Judge name must be at most 50 characters long")
    private String judgeName;

    @Pattern(regexp = "^[0-9]*$", message = "Court code contains invalid characters")
    @Size(max = 6, message = "Court code must be at most 6 characters long")
    private String courtCode;

    @Pattern(regexp = "^[0-9]*$", message = "Court branch code contains invalid characters")
    @Size(max = 6, message = "Court branch code must be at most 6 characters long")
    private String courtBranchCode;

    @Pattern(regexp = "^[a-zA-Z ]*$", message = "Court branch name contains invalid characters")
    @Size(max = 50, message = "Court branch name must be at most 50 characters long")
    private String courtBranchName;

    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Branch code filter contains invalid characters")
    @Size(max = 3, message = "Branch code filter must be at most 3 characters long")
    private String branchCodeFilter;

    @Pattern(regexp = "^[A-Z]?$", message = "Old letter contains invalid characters")
    @Size(max = 1, message = "Old letter must be 1 character long")
    private String oldLetter;

    @Pattern(regexp = "^[a-zA-Z0-9.]*$", message = "File name contains invalid characters")
    @Size(max = 30, message = "File name must be at most 30 characters long")
    private String fileName;

    @Pattern(regexp = "^[0-9]*$", message = "Row number physical contains invalid characters")
    @Size(max = 3, message = "Row number physical must be at most 3 characters long")
    private String rowNoPhysical;

    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Tracking number contains invalid characters")
    @Size(max = 30, message = "Tracking number must be at most 30 characters long")
    private String trackingNo;

    @Size(max = 1000, message = "Related document number must be at most 1000 characters long")
    private String relatedDocNo;



}
