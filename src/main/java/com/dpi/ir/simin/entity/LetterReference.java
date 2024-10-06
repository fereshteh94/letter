package com.dpi.ir.simin.entity;


import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;

@Entity
@Table(name = "tbletterreferences")
@Data
public class LetterReference implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, precision = 24)
    private Long id;

    @Column(name = "LETTER_NUMBER", length = 12)
    private String letterNumber;

    @Column(name = "FROM_USER", length = 6)
    private String fromUser;

    @Column(name = "TO_USER", length = 6)
    private String toUser;

    @Column(name = "CREATE_DATE", length = 8)
    private String createDate;

    @Column(name = "CREATE_TIME", length = 6)
    private String createTime;

    @Column(name = "STATUS", length = 1)
    private String status;
}
