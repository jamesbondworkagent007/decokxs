package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.format.MatchStrength;
import java.io.IOException;
import o.InterfaceC5513Uq;

/* JADX INFO: loaded from: classes21.dex */
public class MappingJsonFactory extends JsonFactory {
    private static final long serialVersionUID = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonFactory, com.fasterxml.jackson.core.TokenStreamFactory
    public String getFormatName() {
        return JsonFactory.FORMAT_NAME_JSON;
    }

    public MappingJsonFactory() {
        this(null);
    }

    public MappingJsonFactory(ObjectMapper objectMapper) {
        super(objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper(this));
        }
    }

    public MappingJsonFactory(JsonFactory jsonFactory, ObjectMapper objectMapper) {
        super(jsonFactory, objectMapper);
        if (objectMapper == null) {
            setCodec(new ObjectMapper(this));
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getCodec()Lo/Ui; */
    @Override // com.fasterxml.jackson.core.JsonFactory
    public final ObjectMapper getCodec() {
        return (ObjectMapper) this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public JsonFactory copy() {
        _checkInvalidCopy(MappingJsonFactory.class);
        return new MappingJsonFactory(this, null);
    }

    @Override // com.fasterxml.jackson.core.JsonFactory
    public MatchStrength hasFormat(InterfaceC5513Uq interfaceC5513Uq) throws IOException {
        if (getClass() == MappingJsonFactory.class) {
            return hasJSONFormat(interfaceC5513Uq);
        }
        return null;
    }
}
