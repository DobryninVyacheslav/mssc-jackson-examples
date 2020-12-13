package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.io.IOException;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserializeDto() throws IOException {
        String json = "{\"beerName\":\"BeerName\"," +
                "\"beerStyle\":\"Ale\"," +
                "\"upc\":123123123123," +
                "\"price\":\"12.99\"," +
                "\"createdDate\":\"2020-12-13T16:17:31.8951887+03:00\"," +
                "\"lastUpdatedDate\":\"2020-12-13T16:17:31.8951887+03:00\"," +
                "\"myLocalDate\":\"20201213\"," +
                "\"beerId\":\"53f60710-aa78-4338-b645-4099aa27d7cb\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }

}