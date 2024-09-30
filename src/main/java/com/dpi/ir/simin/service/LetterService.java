package com.dpi.ir.simin.service;

import com.dpi.ir.simin.dto.LetterDTO;
import com.dpi.ir.simin.entity.Letter;

public interface LetterService {


    void createLetter(LetterDTO letterDTO);

    Letter updateLetter(LetterDTO letterDTO) throws Exception;
}
