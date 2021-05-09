package org.example.services.wordcloud.json;

import static org.assertj.core.api.Assertions.*;

import com.google.common.io.Resources;
import org.example.services.wordcloud.model.WeightedHitword;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

class WeightedHitwordListParserTests {

    // TODO: How to name tests?
    @Test
    public void testFromJson() throws IOException {
        // TODO: Improve loading from resources
        final var input = Resources.toString(Resources.getResource("org/example/services/wordcloud/json/wordlist.json"), StandardCharsets.UTF_8);
        final var result = WeightedHitwordListParser.fromJson(input);
        assertThat(result).isNotNull();
        assertThat(result.size()).isEqualTo(36);
        assertThat(result.get(0)).isEqualTo(WeightedHitword.create("紅樓夢", 6));
        // TODO: Add more asserts
        assertThat(result.get(35)).isEqualTo(WeightedHitword.create("bar", 1));
    }
}