package com.RedBus.User.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @Column(name = "booking_id")
    private String bookingId;
    @Column(name = "bus_id")
    private String busId;
    @Column(name = "ticket_id")
    private String ticketId;
    @Column(name = "bus_company")
    private String busCompany;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    private String mobile;
    private double price;
    @Column(name = "`to`")
    private String to;
    @Column(name = "`from`") // Use backticks to escape the reserved keyword "from" //
    private String from;
}

