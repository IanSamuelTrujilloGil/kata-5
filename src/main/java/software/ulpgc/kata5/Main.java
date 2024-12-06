package software.ulpgc.kata5;

import software.ulpgc.kata5.io.QuotableIOQuoteAdapter;
import software.ulpgc.kata5.io.QuotableIOQuoteDeserializer;
import software.ulpgc.kata5.io.QuotableIORandomQuoteReader;
import software.ulpgc.kata5.io.QuoteLoader;

public class Main {
    public static void main(String[] args) {
        QuoteLoader loader = new QuoteLoader(new QuotableIORandomQuoteReader(),
                new QuotableIOQuoteDeserializer(),
                new QuotableIOQuoteAdapter());
        for (int i = 0; i < 10; i++) {
            System.out.println(loader.load());
        }
    }
}
