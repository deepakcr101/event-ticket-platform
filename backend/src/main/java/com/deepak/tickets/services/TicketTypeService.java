package com.deepak.tickets.services;

import com.deepak.tickets.domain.entities.Ticket;
import java.util.UUID;

public interface TicketTypeService {
  Ticket purchaseTicket(UUID userId, UUID ticketTypeId);
}
