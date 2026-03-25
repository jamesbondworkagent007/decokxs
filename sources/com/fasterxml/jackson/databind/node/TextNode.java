package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import o.C5521Ux;
import o.C5522Uy;
import o.C5537Vn;
import o.TZ;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    private static final long serialVersionUID = 2;
    protected final String _value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this._value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        String str2 = this._value;
        return str2 == null ? str : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public String textValue() {
        return this._value;
    }

    public TextNode(String str) {
        this._value = str;
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.isEmpty() ? EMPTY_STRING_NODE : new TextNode(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC5509Um
    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        String strTrim = this._value.trim();
        C5537Vn c5537Vn = new C5537Vn(Math.max(16, Math.min(65536, ((strTrim.length() >> 2) * 3) + 4)));
        try {
            base64Variant.decode(strTrim, c5537Vn);
            return c5537Vn.AYXKKw();
        } catch (IllegalArgumentException e) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e.getMessage()), strTrim, byte[].class);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() throws IOException {
        return getBinaryValue(TZ.AEQbTJ());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        String str = this._value;
        if (str == null) {
            return z;
        }
        String strTrim = str.trim();
        if ("true".equals(strTrim)) {
            return true;
        }
        if ("false".equals(strTrim)) {
            return false;
        }
        return z;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i) {
        return C5522Uy.AEQbTJ(this._value, i);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j) {
        return C5522Uy.copydefault(this._value, j);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d) {
        return C5522Uy.copydefault(this._value, d);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.VF
    public final void serialize(JsonGenerator jsonGenerator, VI vi) throws IOException {
        String str = this._value;
        if (str == null) {
            jsonGenerator.isConnected();
        } else {
            jsonGenerator.AhwBna(str);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Deprecated
    public static void appendQuoted(StringBuilder sb, String str) {
        sb.append('\"');
        C5521Ux.OLrzqt(sb, str);
        sb.append('\"');
    }
}
