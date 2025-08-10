package com.deepak.tickets.services;

import com.deepak.tickets.domain.entities.QrCode;
import com.deepak.tickets.domain.entities.Ticket;
import java.util.UUID;

public interface QrCodeService {

  QrCode generateQrCode(Ticket ticket);

  byte[] getQrCodeImageForUserAndTicket(UUID userId, UUID ticketId);
}
