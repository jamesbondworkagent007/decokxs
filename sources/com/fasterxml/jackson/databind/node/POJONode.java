package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.VF;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class POJONode extends ValueNode {
    private static final long serialVersionUID = 2;
    protected final Object _value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object getPojo() {
        return this._value;
    }

    public POJONode(Object obj) {
        this._value = obj;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.POJO;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC5509Um
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() throws IOException {
        Object obj = this._value;
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return super.binaryValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        Object obj = this._value;
        return obj == null ? AbstractJsonLexerKt.NULL : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        Object obj = this._value;
        return obj == null ? str : obj.toString();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        Object obj = this._value;
        return (obj == null || !(obj instanceof Boolean)) ? z : ((Boolean) obj).booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).intValue() : i;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).longValue() : j;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d) {
        Object obj = this._value;
        return obj instanceof Number ? ((Number) obj).doubleValue() : d;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.VF
    public final void serialize(JsonGenerator jsonGenerator, VI vi) throws IOException {
        Object obj = this._value;
        if (obj == null) {
            vi.defaultSerializeNull(jsonGenerator);
        } else if (obj instanceof VF) {
            ((VF) obj).serialize(jsonGenerator, vi);
        } else {
            vi.defaultSerializeValue(obj, jsonGenerator);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof POJONode)) {
            return _pojoEquals((POJONode) obj);
        }
        return false;
    }

    public boolean _pojoEquals(POJONode pOJONode) {
        Object obj = this._value;
        if (obj == null) {
            return pOJONode._value == null;
        }
        return obj.equals(pOJONode._value);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }
}
