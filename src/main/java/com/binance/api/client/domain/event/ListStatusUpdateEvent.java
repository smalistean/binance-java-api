package com.binance.api.client.domain.event;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.ContingencyType;
import com.binance.api.client.domain.OCOOrderStatus;
import com.binance.api.client.domain.OCOStatus;
import com.binance.api.client.domain.OrderRejectReason;
import com.binance.api.client.domain.account.OrderReport;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ListStatusUpdateEvent {

    @JsonProperty("e")
    private String eventType;

    @JsonProperty("E")
    private Long eventTime;

    @JsonProperty("s")
    private String symbol;

    @JsonProperty("l")
    private OCOStatus listStatusType;

    @JsonProperty("g")
    private Long orderListId;

    @JsonProperty("c")
    private ContingencyType contingencyType;

    @JsonProperty("L")
    private OCOOrderStatus listOrderStatus;

    @JsonProperty("r")
    private OrderRejectReason listRejectReason;

    @JsonProperty("C")
    private String listClientOrderId;

    @JsonProperty("T")
    private Long transactionTime;

    @JsonProperty("O")
    @JsonDeserialize(contentUsing = OrderReportDeserializer.class)
    private List<OrderReport> orderReports;

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("eventType", eventType)
                .append("eventTime", eventTime)
                .append("symbol", symbol)
                .append("listStatusType", listStatusType)
                .append("orderListId", orderListId)
                .append("contingencyType", contingencyType)
                .append("listOrderStatus", listOrderStatus)
                .append("listRejectReason", listRejectReason)
                .append("listClientOrderId", listClientOrderId)
                .append("transactionTime", transactionTime)
                .append("orderReports", orderReports)
                .toString();
    }
}

