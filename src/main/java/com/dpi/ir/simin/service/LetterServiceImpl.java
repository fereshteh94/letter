package com.dpi.ir.simin.service;

import com.dpi.ir.simin.Exception.DuplicateLetterNumberException;
import com.dpi.ir.simin.Exception.LetterNotFoundException;
import com.dpi.ir.simin.controller.LetterController;
import com.dpi.ir.simin.dto.LetterDTO;
import com.dpi.ir.simin.dto.LetterReferenceDTO;
import com.dpi.ir.simin.entity.Letter;
import com.dpi.ir.simin.entity.LetterReference;
import com.dpi.ir.simin.mapper.LetterMapper;
import com.dpi.ir.simin.repository.LetterReferenceRepository;
import com.dpi.ir.simin.repository.TblLetterRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class LetterServiceImpl implements LetterService {

     final private TblLetterRepository letterRepository;

    final private LetterReferenceRepository letterReferenceRepository;
    private final LetterController letterController;


    public LetterServiceImpl(TblLetterRepository letterRepository, LetterReferenceRepository letterReferenceRepository, LetterController letterController) {
        this.letterRepository = letterRepository;
        this.letterReferenceRepository = letterReferenceRepository;
        this.letterController = letterController;
    }

    @Override
    @Transactional
    public void createLetter(LetterDTO letterDTO) {

        String letterNumber=letterDTO.getLetterNumber();
        Optional<Letter> existingLetter =letterRepository.findByLetterNumber(letterNumber);

        if (existingLetter.isPresent()) {

            throw new DuplicateLetterNumberException("Letter with number " + letterDTO.getLetterNumber() + " already exists.");
        } else {

//            Letter letter = new Letter();
          Letter letter =LetterMapper.toEntity(letterDTO);
            letterRepository.save(letter);
        }

    }


    @Override
    @Transactional
    public Letter updateLetter( LetterDTO letterDTO) throws Exception {
      String letterNumber=  letterDTO.getLetterNumber();
        Optional<Letter> existLetter = letterRepository.findByLetterNumber(letterNumber);

        if (existLetter.isPresent()) {

            Letter existingLetter = existLetter.get();


            LetterMapper.updateEntityFromDTO(letterDTO, existingLetter);

            return letterRepository.save(existingLetter);
        } else {

            throw new LetterNotFoundException("Letter with letterNumber " + letterNumber + " not found.");
        }
    }

    @Override
    public List<LetterReference> getAllLetterReferences(LetterReferenceDTO letterReferenceDTO) {
        String letterNumber=  letterReferenceDTO.getLetterNumber();
        return letterReferenceRepository.findByLetterReferencesByletterNumber(letterNumber);
    }





}
