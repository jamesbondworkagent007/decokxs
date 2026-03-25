package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class UnsupportedTypeSerializer extends StdSerializer<Object> {
    private static final long serialVersionUID = 1;
    protected final String _message;
    protected final JavaType _type;

    public UnsupportedTypeSerializer(JavaType javaType, String str) {
        super(Object.class);
        this._type = javaType;
        this._message = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        vi.reportBadDefinition(this._type, this._message);
    }
}
