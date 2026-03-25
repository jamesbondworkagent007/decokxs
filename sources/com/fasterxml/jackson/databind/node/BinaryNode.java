package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.Arrays;
import o.TZ;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class BinaryNode extends ValueNode {
    static final BinaryNode EMPTY_BINARY_NODE = new BinaryNode(new byte[0]);
    private static final long serialVersionUID = 2;
    protected final byte[] _data;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() {
        return this._data;
    }

    public BinaryNode(byte[] bArr) {
        this._data = bArr;
    }

    public BinaryNode(byte[] bArr, int i, int i2) {
        if (i == 0 && i2 == bArr.length) {
            this._data = bArr;
            return;
        }
        byte[] bArr2 = new byte[i2];
        this._data = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static BinaryNode valueOf(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bArr.length == 0 ? EMPTY_BINARY_NODE : new BinaryNode(bArr);
    }

    public static BinaryNode valueOf(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        return i2 == 0 ? EMPTY_BINARY_NODE : new BinaryNode(bArr, i, i2);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.BINARY;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC5509Um
    public JsonToken asToken() {
        return JsonToken.VALUE_EMBEDDED_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return TZ.AEQbTJ().encode(this._data, false);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.VF
    public final void serialize(JsonGenerator jsonGenerator, VI vi) throws IOException {
        Base64Variant base64Variant = vi.getConfig().getBase64Variant();
        byte[] bArr = this._data;
        jsonGenerator.EZpvd(base64Variant, bArr, 0, bArr.length);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof BinaryNode)) {
            return Arrays.equals(((BinaryNode) obj)._data, this._data);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        byte[] bArr = this._data;
        if (bArr == null) {
            return -1;
        }
        return bArr.length;
    }
}
