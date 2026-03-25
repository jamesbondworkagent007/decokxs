package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import o.AbstractC5601Xz;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
@Deprecated
public abstract class NonTypedScalarSerializerBase<T> extends StdScalarSerializer<T> {
    public NonTypedScalarSerializerBase(Class<T> cls) {
        super(cls);
    }

    public NonTypedScalarSerializerBase(Class<?> cls, boolean z) {
        super(cls, z);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, o.VD
    public final void serializeWithType(T t, JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        serialize(t, jsonGenerator, vi);
    }
}
