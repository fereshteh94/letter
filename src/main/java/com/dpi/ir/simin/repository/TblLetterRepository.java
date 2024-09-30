package com.dpi.ir.simin.repository;

import com.dpi.ir.simin.entity.Letter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TblLetterRepository extends JpaRepository<Letter, String> {
    Optional<Letter> findByLetterNumber(String letterNumber);
}
