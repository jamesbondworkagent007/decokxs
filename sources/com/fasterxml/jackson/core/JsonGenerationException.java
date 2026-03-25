package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;

/* JADX INFO: loaded from: classes21.dex */
public class JsonGenerationException extends StreamWriteException {
    private static final long serialVersionUID = 123;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getProcessor()Ljava/lang/Object; */
    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public JsonGenerator getProcessor() {
        return this._processor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: withGenerator(Lcom/fasterxml/jackson/core/JsonGenerator;)Lcom/fasterxml/jackson/core/exc/StreamWriteException; */
    @Override // com.fasterxml.jackson.core.exc.StreamWriteException
    public JsonGenerationException withGenerator(JsonGenerator jsonGenerator) {
        this._processor = jsonGenerator;
        return this;
    }

    @Deprecated
    public JsonGenerationException(Throwable th) {
        super(th, (JsonGenerator) null);
    }

    @Deprecated
    public JsonGenerationException(String str) {
        super(str, (JsonGenerator) null);
    }

    @Deprecated
    public JsonGenerationException(String str, Throwable th) {
        super(str, th, null);
    }

    public JsonGenerationException(Throwable th, JsonGenerator jsonGenerator) {
        super(th, jsonGenerator);
    }

    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, jsonGenerator);
        this._processor = jsonGenerator;
    }

    public JsonGenerationException(String str, Throwable th, JsonGenerator jsonGenerator) {
        super(str, th, jsonGenerator);
        this._processor = jsonGenerator;
    }
}
