package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import o.AbstractC5597Xv;

/* JADX INFO: loaded from: classes21.dex */
public class NullifyingDeserializer extends StdDeserializer<Object> {
    public static final NullifyingDeserializer instance = new NullifyingDeserializer();
    private static final long serialVersionUID = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    public NullifyingDeserializer() {
        super((Class<?>) Object.class);
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.copydefault(JsonToken.FIELD_NAME)) {
            jsonParser.UeEOUB();
            return null;
        }
        while (true) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == null || jsonTokenRcXXUw == JsonToken.END_OBJECT) {
                return null;
            }
            jsonParser.UeEOUB();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        int iValueOf = jsonParser.valueOf();
        if (iValueOf == 1 || iValueOf == 3 || iValueOf == 5) {
            return abstractC5597Xv.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        return null;
    }
}
