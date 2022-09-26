package ch.heigvd.dai.chill.domain.Charles101010;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CamoGenuineAleTest {

  @Test
  void thePriceAndNameForCamo_Genuine_AleShouldBeCorrect() {
    CamoGenuineAle beer = new CamoGenuineAle();
    assertEquals(beer.getName(), CamoGenuineAle.NAME);
    assertEquals(beer.getPrice(), CamoGenuineAle.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForCamo_Genuine_Ale() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.Charles101010.CamoGenuineAle";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = CamoGenuineAle.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
