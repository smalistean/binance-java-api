package com.binance.api.client.domain.event;

import com.binance.api.client.domain.account.OrderReport;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;


public class OrderReportDeserializer extends JsonDeserializer<OrderReport> {

    @Override
    public OrderReport deserialize(JsonParser jp, DeserializationContext ctx) throws IOException {
        ObjectCodec oc = jp.getCodec();
        JsonNode node = oc.readTree(jp);
        final String symbol = node.get("s").asText();
        final Long orderId = node.get("i").asLong();
        final String clientOrderId = node.get("c").asText();
        OrderReport report = new OrderReport();
        report.setSymbol(symbol);
        report.setOrderId(orderId);
        report.setClientOrderId(clientOrderId);
        return report;
    }
}
