package software.ulpgc.kata5.io;

import com.google.gson.Gson;
import software.ulpgc.kata5.io.pojos.QuotableIOGetResponse;

public class QuotableIOQuoteDeserializer implements QuoteDeserializer{
    @Override
    public Object deserialize(String json) {
        return new Gson().fromJson(json, QuotableIOGetResponse.class);
    }
}
