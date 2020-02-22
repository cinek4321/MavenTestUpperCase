package pl.altkom.util;

import org.junit.jupiter.api.Test;
import pl.altkom.utils.HelloUtil;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpperCaseTest {

    @Test
    void shouldReturnGreetingWithUpperCase() {
        // Given
        String passedArgument = "WORLD";

        String expectedValue = UpperCase.GREETING_UPPER+" "+passedArgument;
        // When
        String returnedValue = UpperCase.convertToUpper(passedArgument);
        // Then
        assertEquals(expectedValue, returnedValue);
    }

}
