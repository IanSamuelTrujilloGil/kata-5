package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojos.QuotableIOGetResponse;
import software.ulpgc.kata5.model.Quote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuotableIOQuoteAdapter implements QuoteAdapter{
    @Override
    public Quote adapt(Object object) {
        return adaptOf((QuotableIOGetResponse) object);
    }

    private Quote adaptOf(QuotableIOGetResponse quotableIOGetResponse) {
        return new Quote(quotableIOGetResponse.author(), quotableIOGetResponse.content(),
                convertToEnums(quotableIOGetResponse.tags()));
    }

    private Quote.Tag[] convertToEnums(String[] tags) {
    List<Quote.Tag> tagList = new ArrayList<>();
        for (String tag : tags) {
            if(checkValidEnumValue(tag)) tagList.add(Quote.Tag.valueOf(formatForEnum(tag)));
        }
        return tagList.toArray(new Quote.Tag[0]);
    }

    private boolean checkValidEnumValue(String tag) {
        return Arrays.stream(Quote.Tag.values()).anyMatch(t-> t.name().equals(formatForEnum(tag)));
    }

    private String formatForEnum(String tag) {
        return tag.replace(" ", "_").toUpperCase();
    }
}
