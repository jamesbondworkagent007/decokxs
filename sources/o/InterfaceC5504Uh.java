package o;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;

/* JADX INFO: renamed from: o.Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC5504Uh {
    public static final Separators EZpvd = Separators.createDefaultInstance();
    public static final SerializedString KWHzl = new SerializedString(" ");

    void beforeArrayValues(JsonGenerator jsonGenerator) throws java.io.IOException;

    void beforeObjectEntries(JsonGenerator jsonGenerator) throws java.io.IOException;

    void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws java.io.IOException;

    void writeEndArray(JsonGenerator jsonGenerator, int i) throws java.io.IOException;

    void writeEndObject(JsonGenerator jsonGenerator, int i) throws java.io.IOException;

    void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws java.io.IOException;

    void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws java.io.IOException;

    void writeRootValueSeparator(JsonGenerator jsonGenerator) throws java.io.IOException;

    void writeStartArray(JsonGenerator jsonGenerator) throws java.io.IOException;

    void writeStartObject(JsonGenerator jsonGenerator) throws java.io.IOException;
}
