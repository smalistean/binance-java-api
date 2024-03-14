package com.binance.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Filters define trading rules on a symbol or an exchange. Filters come in two forms: symbol filters and exchange filters.
 *
 * The PRICE_FILTER defines the price rules for a symbol.
 *
 * The LOT_SIZE filter defines the quantity (aka "lots" in auction terms) rules for a symbol.
 *
 * The MIN_NOTIONAL filter defines the minimum notional value allowed for an order on a symbol. An order's notional value is the price * quantity.
 *
 * The MAX_NUM_ORDERS filter defines the maximum number of orders an account is allowed to have open on a symbol. Note that both "algo" orders and normal orders are counted for this filter.
 *
 * The MAX_ALGO_ORDERS filter defines the maximum number of "algo" orders an account is allowed to have open on a symbol. "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SymbolFilter {

  // PRICE_FILTER

  private FilterType filterType;

  /**
   * Defines the minimum price/stopPrice allowed.
   */
  private String minPrice;

  /**
   * Defines the maximum price/stopPrice allowed.
   */
  private String maxPrice;

  /**
   * Defines the intervals that a price/stopPrice can be increased/decreased by.
   */
  private String tickSize;


  // LOT_SIZE

  /**
   * Defines the minimum quantity/icebergQty allowed.
   */
  private String minQty;

  /**
   * Defines the maximum quantity/icebergQty allowed.
   */
  private String maxQty;

  /**
   * Defines the intervals that a quantity/icebergQty can be increased/decreased by.
   */
  private String stepSize;

//  // MIN_NOTIONAL
//
//  /**
//   * Defines the minimum notional value allowed for an order on a symbol. An order's notional value is the price * quantity.
//   */
//  private String minNotional;


  // MAX_NUM_ALGO_ORDERS

  /**
   * Defines the maximum number of "algo" orders an account is allowed to have open on a symbol. "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
   */
  private String maxNumAlgoOrders;

  /**
   * MAX_NUM_ORDERS filter defines the maximum number of orders an account is allowed to have open on a symbol. Note that both "algo" orders and normal orders are counted for this filter.
   * MAX_ALGO_ORDERS filter defines the maximum number of "algo" orders an account is allowed to have open on a symbol. "Algo" orders are STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders.
   * ICEBERG_PARTS filter defines the maximum parts an iceberg order can have. The number of ICEBERG_PARTS is defined as CEIL(qty / icebergQty).
   */
  private String limit;

  //TRAILING_DELTA
  private String minTrailingAboveDelta;
  private String maxTrailingAboveDelta;
  private String minTrailingBelowDelta;
  private String maxTrailingBelowDelta;

  //PERCENT_PRICE_BY_SIDE
  private String bidMultiplierUp;
  private String bidMultiplierDown;
  private String askMultiplierUp;
  private String askMultiplierDown;
  private Integer avgPriceMins;

  //NOTIONAL
  private String minNotional;
  private Boolean applyMinToMarket;
  private String maxNotional;
  private Boolean applyMaxToMarket;

  public FilterType getFilterType() {
    return filterType;
  }

  public void setFilterType(FilterType filterType) {
    this.filterType = filterType;
  }

  public String getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(String minPrice) {
    this.minPrice = minPrice;
  }

  public String getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(String maxPrice) {
    this.maxPrice = maxPrice;
  }

  public String getTickSize() {
    return tickSize;
  }

  public void setTickSize(String tickSize) {
    this.tickSize = tickSize;
  }

  public String getMinQty() {
    return minQty;
  }

  public void setMinQty(String minQty) {
    this.minQty = minQty;
  }

  public String getMaxQty() {
    return maxQty;
  }

  public void setMaxQty(String maxQty) {
    this.maxQty = maxQty;
  }

  public String getStepSize() {
    return stepSize;
  }

  public void setStepSize(String stepSize) {
    this.stepSize = stepSize;
  }

//  public String getMinNotional() {
//    return minNotional;
//  }

//  public void setMinNotional(String minNotional) {
//    this.minNotional = minNotional;
//  }

  public String getMaxNumAlgoOrders() {
    return maxNumAlgoOrders;
  }

  public SymbolFilter setMaxNumAlgoOrders(String maxNumAlgoOrders) {
    this.maxNumAlgoOrders = maxNumAlgoOrders;
    return this;
  }

  public String getLimit() {
    return limit;
  }

  public void setLimit(String limit) {
    this.limit = limit;
  }

  public String getMinTrailingAboveDelta() {
    return minTrailingAboveDelta;
  }

  public void setMinTrailingAboveDelta(String minTrailingAboveDelta) {
    this.minTrailingAboveDelta = minTrailingAboveDelta;
  }

  public String getMaxTrailingAboveDelta() {
    return maxTrailingAboveDelta;
  }

  public void setMaxTrailingAboveDelta(String maxTrailingAboveDelta) {
    this.maxTrailingAboveDelta = maxTrailingAboveDelta;
  }

  public String getMinTrailingBelowDelta() {
    return minTrailingBelowDelta;
  }

  public void setMinTrailingBelowDelta(String minTrailingBelowDelta) {
    this.minTrailingBelowDelta = minTrailingBelowDelta;
  }

  public String getMaxTrailingBelowDelta() {
    return maxTrailingBelowDelta;
  }

  public void setMaxTrailingBelowDelta(String maxTrailingBelowDelta) {
    this.maxTrailingBelowDelta = maxTrailingBelowDelta;
  }

  public String getBidMultiplierUp() {
    return bidMultiplierUp;
  }

  public void setBidMultiplierUp(String bidMultiplierUp) {
    this.bidMultiplierUp = bidMultiplierUp;
  }

  public String getBidMultiplierDown() {
    return bidMultiplierDown;
  }

  public void setBidMultiplierDown(String bidMultiplierDown) {
    this.bidMultiplierDown = bidMultiplierDown;
  }

  public String getAskMultiplierUp() {
    return askMultiplierUp;
  }

  public void setAskMultiplierUp(String askMultiplierUp) {
    this.askMultiplierUp = askMultiplierUp;
  }

  public String getAskMultiplierDown() {
    return askMultiplierDown;
  }

  public void setAskMultiplierDown(String askMultiplierDown) {
    this.askMultiplierDown = askMultiplierDown;
  }

  public Integer getAvgPriceMins() {
    return avgPriceMins;
  }

  public String getMinNotional() {
    return minNotional;
  }

  public void setMinNotional(String minNotional) {
    this.minNotional = minNotional;
  }

  public Boolean getApplyMinToMarket() {
    return applyMinToMarket;
  }

  public void setApplyMinToMarket(Boolean applyMinToMarket) {
    this.applyMinToMarket = applyMinToMarket;
  }

  public String getMaxNotional() {
    return maxNotional;
  }

  public void setMaxNotional(String maxNotional) {
    this.maxNotional = maxNotional;
  }

  public Boolean getApplyMaxToMarket() {
    return applyMaxToMarket;
  }

  public void setApplyMaxToMarket(Boolean applyMaxToMarket) {
    this.applyMaxToMarket = applyMaxToMarket;
  }

  public void setAvgPriceMins(Integer avgPriceMins) {
    this.avgPriceMins = avgPriceMins;
  }

  @Override
  public String toString() {
    return "SymbolFilter{" +
            "filterType=" + filterType +
            ", minPrice='" + minPrice + '\'' +
            ", maxPrice='" + maxPrice + '\'' +
            ", tickSize='" + tickSize + '\'' +
            ", minQty='" + minQty + '\'' +
            ", maxQty='" + maxQty + '\'' +
            ", stepSize='" + stepSize + '\'' +
            ", maxNumAlgoOrders='" + maxNumAlgoOrders + '\'' +
            ", limit='" + limit + '\'' +
            ", minTrailingAboveDelta='" + minTrailingAboveDelta + '\'' +
            ", maxTrailingAboveDelta='" + maxTrailingAboveDelta + '\'' +
            ", minTrailingBelowDelta='" + minTrailingBelowDelta + '\'' +
            ", maxTrailingBelowDelta='" + maxTrailingBelowDelta + '\'' +
            ", bidMultiplierUp='" + bidMultiplierUp + '\'' +
            ", bidMultiplierDown='" + bidMultiplierDown + '\'' +
            ", askMultiplierUp='" + askMultiplierUp + '\'' +
            ", askMultiplierDown='" + askMultiplierDown + '\'' +
            ", avgPriceMins=" + avgPriceMins +
            ", minNotional='" + minNotional + '\'' +
            ", applyMinToMarket=" + applyMinToMarket +
            ", maxNotional='" + maxNotional + '\'' +
            ", applyMaxToMarket=" + applyMaxToMarket +
            '}';
  }
}

