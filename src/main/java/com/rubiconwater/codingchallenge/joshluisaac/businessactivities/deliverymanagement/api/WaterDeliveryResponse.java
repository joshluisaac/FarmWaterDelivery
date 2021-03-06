package com.rubiconwater.codingchallenge.joshluisaac.businessactivities.deliverymanagement.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class WaterDeliveryResponse {

  @JsonProperty(value = "order_id")
  private UUID orderId;

  @JsonProperty(value = "delivery_status")
  private String deliveryStatus;

  @JsonProperty("delivery_start_date")
  private LocalDateTime deliveryStartDate;

  @JsonProperty("delivery_end_date")
  private LocalDateTime deliveryEndDate;

  private int duration;
}
