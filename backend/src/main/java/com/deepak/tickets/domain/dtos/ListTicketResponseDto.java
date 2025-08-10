package com.deepak.tickets.domain.dtos;

import com.deepak.tickets.domain.entities.TicketStatusEnum;
import com.deepak.tickets.domain.dtos.ListTicketTicketTypeResponseDto;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListTicketResponseDto {
  private UUID id;
  private TicketStatusEnum status;
  private ListTicketTicketTypeResponseDto ticketType;
}
