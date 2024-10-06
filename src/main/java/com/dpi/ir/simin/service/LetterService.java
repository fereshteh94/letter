package com.dpi.ir.simin.service;

import com.dpi.ir.simin.dto.LetterDTO;
import com.dpi.ir.simin.dto.LetterReferenceDTO;
import com.dpi.ir.simin.entity.Letter;
import com.dpi.ir.simin.entity.LetterReference;

import java.util.List;

public interface LetterService {


    void createLetter(LetterDTO letterDTO);

    Letter updateLetter(LetterDTO letterDTO) throws Exception;


    List<LetterReference> getAllLetterReferences(LetterReferenceDTO letterReferenceDTO);
}
