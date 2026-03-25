package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.io.IOException;
import o.AbstractC5548Vy;

/* JADX INFO: loaded from: classes21.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;
    protected final AbstractC5548Vy<?> _adapterDeserializer;

    public static final class TaskDescription {
        public String AYXKKw;
        public String copydefault;
        public String valueOf;
        public String OLrzqt = "";
        public String AEQbTJ = "";
        public String EZpvd = "";
        public int KWHzl = -1;
    }

    @Deprecated
    public StackTraceElementDeserializer() {
        this(null);
    }

    public StackTraceElementDeserializer(AbstractC5548Vy<?> abstractC5548Vy) {
        super((Class<?>) StackTraceElement.class);
        this._adapterDeserializer = abstractC5548Vy;
    }

    public static AbstractC5548Vy<?> construct(DeserializationContext deserializationContext) throws JsonMappingException {
        if (deserializationContext == null) {
            return new StackTraceElementDeserializer();
        }
        return new StackTraceElementDeserializer(deserializationContext.findNonContextualValueDeserializer(deserializationContext.constructType(TaskDescription.class)));
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        TaskDescription taskDescription;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT || jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            AbstractC5548Vy<?> abstractC5548Vy = this._adapterDeserializer;
            if (abstractC5548Vy == null) {
                taskDescription = (TaskDescription) deserializationContext.readValue(jsonParser, TaskDescription.class);
            } else {
                taskDescription = (TaskDescription) abstractC5548Vy.deserialize(jsonParser, deserializationContext);
            }
            return constructValue(deserializationContext, taskDescription);
        }
        if (jsonTokenDjBIcL == JsonToken.START_ARRAY && deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            jsonParser.RcXXUw();
            StackTraceElement stackTraceElementDeserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.RcXXUw() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return stackTraceElementDeserialize;
        }
        return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, TaskDescription taskDescription) {
        return constructValue(deserializationContext, taskDescription.OLrzqt, taskDescription.EZpvd, taskDescription.AEQbTJ, taskDescription.KWHzl, taskDescription.valueOf, taskDescription.AYXKKw, taskDescription.copydefault);
    }

    @Deprecated
    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5) {
        return constructValue(deserializationContext, str, str2, str3, i, str4, str5, null);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i);
    }
}
