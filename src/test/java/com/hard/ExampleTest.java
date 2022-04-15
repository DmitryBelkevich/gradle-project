package com.hard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Example test")
public class ExampleTest {
    @Test
    @DisplayName("should show assertion")
    public void shouldShowAssertion() {
        assertEquals(4, 2 + 2);
    }
}