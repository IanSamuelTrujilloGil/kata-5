package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.Quote;

public class QuoteLoader {
    private final QuoteReader reader;
    private final QuoteDeserializer deserializer;
    private final QuoteAdapter adapter;

    public QuoteLoader(QuoteReader reader, QuoteDeserializer deserializer, QuoteAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public Quote load(){
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
