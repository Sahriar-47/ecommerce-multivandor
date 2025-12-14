package com.nushops.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Seller  seller;
    private Long totalEarnings = 0L;
    private Long totalSales = 0L;
    private Long totalRefounds = 0L;
    private Long totalTax = 0L;
    private Long nerEarnings = 0L;
    private Integer totalOrders = 0;
    private Integer cancelledOrders = 0;
    private Integer totalTransactions = 0;
}
