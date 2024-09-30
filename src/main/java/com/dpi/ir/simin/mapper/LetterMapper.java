package com.dpi.ir.simin.mapper;

import com.dpi.ir.simin.dto.LetterDTO;
import com.dpi.ir.simin.entity.Letter;

public class LetterMapper {

    public static Letter toEntity(LetterDTO dto) {
        Letter letter = new Letter();
        letter.setLetterNumber(dto.getLetterNumber());
        letter.setReferenceNo(dto.getReferenceNo());
        letter.setIndictmentNo(dto.getIndictmentNo());
        letter.setLetterType(dto.getLetterType());
        letter.setCustomerType(dto.getCustomerType());
        letter.setLetterDate(dto.getLetterDate());
        letter.setSendDate(dto.getSendDate());
        letter.setLetterText(dto.getLetterText());
        letter.setBlockAmount(dto.getBlockAmount());
        letter.setBlockType(dto.getBlockType());
        letter.setMonthBlockedDuration(dto.getMonthBlockedDuration());
        letter.setIsAmountLimited(dto.getIsAmountLimited());
        letter.setSubscriberName(dto.getSubscriberName());
        letter.setPriority(dto.getPriority());
        letter.setNationalCode(dto.getNationalCode());
        letter.setFirstName(dto.getFirstName());
        letter.setLastName(dto.getLastName());
        letter.setFatherName(dto.getFatherName());
        letter.setBirthdate(dto.getBirthdate());
        letter.setIssuePlace(dto.getIssuePlace());
        letter.setIdNumber(dto.getIdNumber());
        letter.setJudgeName(dto.getJudgeName());
        letter.setCourtCode(dto.getCourtCode());
        letter.setCourtBranchCode(dto.getCourtBranchCode());
        letter.setCourtBranchName(dto.getCourtBranchName());
        letter.setBranchCodeFilter(dto.getBranchCodeFilter());
        letter.setOldLetter(dto.getOldLetter());
        letter.setFileName(dto.getFileName());
        letter.setRowNoPhysical(dto.getRowNoPhysical());
        letter.setTrackingNo(dto.getTrackingNo());
        letter.setRelatedDocNo(dto.getRelatedDocNo());
        return letter;
    }


    public static void updateEntityFromDTO(LetterDTO dto, Letter letter) {
        letter.setReferenceNo(dto.getReferenceNo());
        letter.setIndictmentNo(dto.getIndictmentNo());
        letter.setLetterType(dto.getLetterType());
        letter.setCustomerType(dto.getCustomerType());
        letter.setLetterDate(dto.getLetterDate());
        letter.setSendDate(dto.getSendDate());
        letter.setLetterText(dto.getLetterText());
        letter.setBlockAmount(dto.getBlockAmount());
        letter.setBlockType(dto.getBlockType());
        letter.setMonthBlockedDuration(dto.getMonthBlockedDuration());
        letter.setIsAmountLimited(dto.getIsAmountLimited());
        letter.setSubscriberName(dto.getSubscriberName());
        letter.setPriority(dto.getPriority());
        letter.setNationalCode(dto.getNationalCode());
        letter.setFirstName(dto.getFirstName());
        letter.setLastName(dto.getLastName());
        letter.setFatherName(dto.getFatherName());
        letter.setBirthdate(dto.getBirthdate());
        letter.setIssuePlace(dto.getIssuePlace());
        letter.setIdNumber(dto.getIdNumber());
        letter.setJudgeName(dto.getJudgeName());
        letter.setCourtCode(dto.getCourtCode());
        letter.setCourtBranchCode(dto.getCourtBranchCode());
        letter.setCourtBranchName(dto.getCourtBranchName());
        letter.setBranchCodeFilter(dto.getBranchCodeFilter());
        letter.setOldLetter(dto.getOldLetter());
        letter.setFileName(dto.getFileName());
        letter.setRowNoPhysical(dto.getRowNoPhysical());
        letter.setTrackingNo(dto.getTrackingNo());
        letter.setRelatedDocNo(dto.getRelatedDocNo());
    }

    public static LetterDTO toDTO(Letter letter) {
        LetterDTO dto = new LetterDTO();
        dto.setLetterNumber(letter.getLetterNumber());
        dto.setReferenceNo(letter.getReferenceNo());
        dto.setIndictmentNo(letter.getIndictmentNo());
        dto.setLetterType(letter.getLetterType());
        dto.setCustomerType(letter.getCustomerType());
        dto.setLetterDate(letter.getLetterDate());
        dto.setSendDate(letter.getSendDate());
        dto.setLetterText(letter.getLetterText());
        dto.setBlockAmount(letter.getBlockAmount());
        dto.setBlockType(letter.getBlockType());
        dto.setMonthBlockedDuration(letter.getMonthBlockedDuration());
        dto.setIsAmountLimited(letter.getIsAmountLimited());
        dto.setSubscriberName(letter.getSubscriberName());
        dto.setPriority(letter.getPriority());
        dto.setNationalCode(letter.getNationalCode());
        dto.setFirstName(letter.getFirstName());
        dto.setLastName(letter.getLastName());
        dto.setFatherName(letter.getFatherName());
        dto.setBirthdate(letter.getBirthdate());
        dto.setIssuePlace(letter.getIssuePlace());
        dto.setIdNumber(letter.getIdNumber());
        dto.setJudgeName(letter.getJudgeName());
        dto.setCourtCode(letter.getCourtCode());
        dto.setCourtBranchCode(letter.getCourtBranchCode());
        dto.setCourtBranchName(letter.getCourtBranchName());
        dto.setBranchCodeFilter(letter.getBranchCodeFilter());
        dto.setOldLetter(letter.getOldLetter());
        dto.setFileName(letter.getFileName());
        dto.setRowNoPhysical(letter.getRowNoPhysical());
        dto.setTrackingNo(letter.getTrackingNo());
        dto.setRelatedDocNo(letter.getRelatedDocNo());
        return dto;
    }
}
