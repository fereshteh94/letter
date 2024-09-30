package com.dpi.ir.simin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "tbletter")
public class Letter {

    @Id
    @Column(name = "LETTER_NUMBER", length = 12, nullable = false)
    private String letterNumber;

    @Column(name = "REFERENCE_NO", length = 16)
    private String referenceNo;

    @Column(name = "INDICTMENT_NO", length = 50)
    private String indictmentNo;

    @Column(name = "LETTER_TYPE", length = 1)
    private String letterType;

    @Column(name = "CUSTOMER_TYPE", length = 1)
    private String customerType;

    @Column(name = "LETTER_DATE", length = 8)
    private String letterDate;

    @Column(name = "SEND_DATE", length = 8)
    private String sendDate;

    @Column(name = "LETTER_TEXT", length = 1000)
    private String letterText;

    @Column(name = "BLOCK_AMOUNT", precision = 38, scale = 0)
    private BigDecimal blockAmount;

    @Column(name = "BLOCKTYPE", length = 1)
    private String blockType;

    @Column(name = "MONTH_BLOCKED_DURATION", length = 2)
    private String monthBlockedDuration;

    @Column(name = "IS_AMOUNT_LIMITED", length = 1)
    private String isAmountLimited;

    @Column(name = "SUBSCRIBER_NAME", length = 50)
    private String subscriberName;

    @Column(name = "PRIORITY", length = 1)
    private String priority;

    @Column(name = "NATIONAL_CODE", length = 11)
    private String nationalCode;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 100)
    private String lastName;

    @Column(name = "FATHER_NAME", length = 50)
    private String fatherName;

    @Column(name = "BIRTHDATE", length = 8)
    private String birthdate;

    @Column(name = "ISSUE_PLACE", length = 50)
    private String issuePlace;

    @Column(name = "ID_NUMBER", length = 11)
    private String idNumber;

    @Column(name = "JUDGE_NAME", length = 50)
    private String judgeName;

    @Column(name = "COURT_CODE", length = 6)
    private String courtCode;

    @Column(name = "COURT_BRANCH_CODE", length = 6)
    private String courtBranchCode;

    @Column(name = "COURT_BRANCH_NAME", length = 50)
    private String courtBranchName;

    @Column(name = "BRANCH_CODE_FILTER", length = 3)
    private String branchCodeFilter;

    @Column(name = "OLD_LETTER", length = 1)
    private String oldLetter;

    @Column(name = "FILE_NAME", length = 30)
    private String fileName;

    @Column(name = "ROW_NO_PHYSICAL", length = 3)
    private String rowNoPhysical;

    @Column(name = "TRACKING_NO", length = 30)
    private String trackingNo;

    @Column(name = "RELATED_DOCNO", length = 1000)
    private String relatedDocNo;

}
