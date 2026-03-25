package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class FailingSerializer extends StdSerializer<Object> {
    protected final String _msg;

    public FailingSerializer(String str) {
        super(Object.class);
        this._msg = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        vi.reportMappingProblem(this._msg, new Object[0]);
    }
}
