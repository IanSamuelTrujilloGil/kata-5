package software.ulpgc.kata5.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

import static org.jsoup.Connection.Method.GET;

public class QuotableIORandomQuoteReader implements QuoteReader{
    @Override
    public String read() {
        try {
            return read("http://api.quotable.io/random");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String read(String url) throws IOException {
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .method(GET)
                .execute();
        if(response.statusCode() != 200) throw new RuntimeException();
        return response.body();
    }
}
