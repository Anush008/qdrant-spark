package io.qdrant.spark;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.assertEquals;

public class TestQdrantOptions {

    @Test
    public void testQdrantOptions() {
        Map<String, String> options = new HashMap<>();
        options.put("qdrant_url", "http://localhost:6333");
        options.put("api_key", "my-api-key");
        options.put("collection_name", "my-collection");
        options.put("embedding_field", "my-embedding-field");
        options.put("id_field", "my-id-field");

        QdrantOptions qdrantOptions = new QdrantOptions(options);

        assertEquals("http://localhost:6333", qdrantOptions.qdrantUrl);
        assertEquals("my-api-key", qdrantOptions.apiKey);
        assertEquals("my-collection", qdrantOptions.collectionName);
        assertEquals("my-embedding-field", qdrantOptions.embeddingField);
        assertEquals("my-id-field", qdrantOptions.idField);

        // Test default values
        assertEquals(100, qdrantOptions.batchSize);
        assertEquals(3, qdrantOptions.retries);
    }
}