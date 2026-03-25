package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;
import java.io.IOException;
import java.nio.file.Path;
import o.AbstractC5601Xz;
import o.C5574Wy;
import o.VI;
import o.WB;

/* JADX INFO: loaded from: classes21.dex */
public class NioPathSerializer extends StdScalarSerializer<Path> {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public /* synthetic */ void serialize(Object obj, JsonGenerator jsonGenerator, VI vi) throws IOException {
        serialize(WB.cA_(obj), jsonGenerator, vi);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
    public /* synthetic */ void serializeWithType(Object obj, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        serializeWithType(WB.cA_(obj), jsonGenerator, vi, abstractC5601Xz);
    }

    public NioPathSerializer() {
        super(C5574Wy.EZpvd());
    }

    public void serialize(Path path, JsonGenerator jsonGenerator, VI vi) throws IOException {
        jsonGenerator.AhwBna(path.toUri().toString());
    }

    public void serializeWithType(Path path, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.copydefault(path, C5574Wy.EZpvd(), JsonToken.VALUE_STRING));
        serialize(path, jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }
}
