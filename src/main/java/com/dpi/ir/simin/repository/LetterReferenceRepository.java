package com.dpi.ir.simin.repository;


import com.dpi.ir.simin.entity.LetterReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LetterReferenceRepository extends JpaRepository<LetterReference, Long> {
    List<LetterReference> findByLetterReferencesByletterNumber(String letterNumber);
}
