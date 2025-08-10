package com.deepak.tickets.mappers;

import com.deepak.tickets.domain.CreateEventRequest;
import com.deepak.tickets.domain.CreateTicketTypeRequest;
import com.deepak.tickets.domain.UpdateEventRequest;
import com.deepak.tickets.domain.UpdateTicketTypeRequest;
import com.deepak.tickets.domain.dtos.CreateEventRequestDto;
import com.deepak.tickets.domain.dtos.CreateEventResponseDto;
import com.deepak.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.deepak.tickets.domain.dtos.GetEventDetailsResponseDto;
import com.deepak.tickets.domain.dtos.GetEventDetailsTicketTypesResponseDto;
import com.deepak.tickets.domain.dtos.GetPublishedEventDetailsResponseDto;
import com.deepak.tickets.domain.dtos.GetPublishedEventDetailsTicketTypesResponseDto;
import com.deepak.tickets.domain.dtos.ListEventResponseDto;
import com.deepak.tickets.domain.dtos.ListEventTicketTypeResponseDto;
import com.deepak.tickets.domain.dtos.ListPublishedEventResponseDto;
import com.deepak.tickets.domain.dtos.UpdateEventRequestDto;
import com.deepak.tickets.domain.dtos.UpdateEventResponseDto;
import com.deepak.tickets.domain.dtos.UpdateTicketTypeRequestDto;
import com.deepak.tickets.domain.dtos.UpdateTicketTypeResponseDto;
import com.deepak.tickets.domain.entities.Event;
import com.deepak.tickets.domain.entities.TicketType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

  CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

  CreateEventRequest fromDto(CreateEventRequestDto dto);

  CreateEventResponseDto toDto(Event event);

  ListEventTicketTypeResponseDto toDto(TicketType ticketType);

  ListEventResponseDto toListEventResponseDto(Event event);

  GetEventDetailsTicketTypesResponseDto toGetEventDetailsTicketTypesResponseDto(
      TicketType ticketType);

  GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event);

  UpdateTicketTypeRequest fromDto(UpdateTicketTypeRequestDto dto);

  UpdateEventRequest fromDto(UpdateEventRequestDto dto);

  UpdateTicketTypeResponseDto toUpdateTicketTypeResponseDto(TicketType ticketType);

  UpdateEventResponseDto toUpdateEventResponseDto(Event event);

  ListPublishedEventResponseDto toListPublishedEventResponseDto(Event event);

  GetPublishedEventDetailsTicketTypesResponseDto toGetPublishedEventDetailsTicketTypesResponseDto(
      TicketType ticketType);

  GetPublishedEventDetailsResponseDto toGetPublishedEventDetailsResponseDto(Event event);
}
