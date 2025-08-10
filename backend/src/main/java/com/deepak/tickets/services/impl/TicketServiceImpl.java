package com.deepak.tickets.services.impl;

import com.deepak.tickets.domain.entities.Ticket;
import com.deepak.tickets.repositories.TicketRepository;
import com.deepak.tickets.services.TicketService;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {

  private final TicketRepository ticketRepository;

  @Override
  public Page<Ticket> listTicketsForUser(UUID userId, Pageable pageable) {
    return ticketRepository.findByPurchaserId(userId, pageable);
  }

  @Override
  public Optional<Ticket> getTicketForUser(UUID userId, UUID ticketId) {
    return ticketRepository.findByIdAndPurchaserId(ticketId, userId);
  }
}
