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
        String json = "{\"id\":\"cb91efbd-0203-423f-ad02-e42b52cd99fb\"," +
                "\"beerName\":\"BeerName\"," +
                "\"beerStyle\":\"Ale\"," +
                "\"upc\":123123123123," +
                "\"price\":12.99," +
                "\"createdDate\":\"2020-12-06T20:21:37.6366277+03:00\"," +
                "\"lastUpdatedDate\":\"2020-12-06T20:21:37.6366277+03:00\"}";

        BeerDto dto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(dto);
    }

}