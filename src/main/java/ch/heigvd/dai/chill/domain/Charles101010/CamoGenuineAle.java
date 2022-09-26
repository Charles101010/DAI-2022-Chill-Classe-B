package ch.heigvd.dai.chill.domain.Charles101010;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class CamoGenuineAle implements IProduct {

  public final static String NAME = "Camo Genuine Ale";
  public final static BigDecimal PRICE = new BigDecimal(6.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
