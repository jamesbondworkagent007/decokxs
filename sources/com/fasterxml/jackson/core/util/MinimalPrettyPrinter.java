package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC5504Uh;

/* JADX INFO: loaded from: classes21.dex */
public class MinimalPrettyPrinter implements InterfaceC5504Uh, Serializable {
    private static final long serialVersionUID = 1;
    protected String _rootValueSeparator;
    protected Separators _separators;

    @Override // o.InterfaceC5504Uh
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    @Override // o.InterfaceC5504Uh
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MinimalPrettyPrinter setSeparators(Separators separators) {
        this._separators = separators;
        return this;
    }

    public MinimalPrettyPrinter() {
        this(InterfaceC5504Uh.KWHzl.toString());
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
        this._separators = InterfaceC5504Uh.EZpvd;
    }

    @Override // o.InterfaceC5504Uh
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.copydefault(str);
        }
    }

    @Override // o.InterfaceC5504Uh
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(AbstractJsonLexerKt.BEGIN_OBJ);
    }

    @Override // o.InterfaceC5504Uh
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(this._separators.getObjectFieldValueSeparator());
    }

    @Override // o.InterfaceC5504Uh
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(this._separators.getObjectEntrySeparator());
    }

    @Override // o.InterfaceC5504Uh
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.copydefault(AbstractJsonLexerKt.END_OBJ);
    }

    @Override // o.InterfaceC5504Uh
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // o.InterfaceC5504Uh
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(this._separators.getArrayValueSeparator());
    }

    @Override // o.InterfaceC5504Uh
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.copydefault(AbstractJsonLexerKt.END_LIST);
    }
}
