package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
@Deprecated
public class StdKeySerializer extends StdSerializer<Object> {
    public StdKeySerializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.KWHzl(obj.toString());
    }
}
