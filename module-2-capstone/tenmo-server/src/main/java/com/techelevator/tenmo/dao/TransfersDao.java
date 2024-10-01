package com.techelevator.tenmo.dao;

import com.techelevator.tenmo.model.Transfers;

import java.math.BigDecimal;
import java.util.List;

public interface TransfersDao {
    List<Transfers> getAllTransfers(long userId);
    List<Transfers> getPendingRequests(long userId);
    Transfers getTransferById(long transferId);
    String sendTransfer(long userFrom, long userTo, BigDecimal amount);
    String requestTransfer(long userFrom, long userTo, BigDecimal amount);
    String updateTransferRequest(Transfers transfers, int statusId);
}
