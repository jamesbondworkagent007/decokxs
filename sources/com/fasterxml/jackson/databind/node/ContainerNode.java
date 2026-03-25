package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.C5624Yx;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    private static final long serialVersionUID = 1;
    protected final JsonNodeFactory _nodeFactory;

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public abstract ObjectNode _withObject(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return "";
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC5509Um
    public abstract JsonToken asToken();

    /* JADX DEBUG: Method merged with bridge method: get(I)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: get */
    public abstract JsonNode mo6122get(int i);

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/String;)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: get */
    public abstract JsonNode mo6123get(String str);

    public abstract T removeAll();

    @Override // com.fasterxml.jackson.databind.JsonNode
    public abstract int size();

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }

    public ContainerNode() {
        this._nodeFactory = null;
    }

    /* JADX DEBUG: Method merged with bridge method: booleanNode(Z)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: booleanNode, reason: merged with bridge method [inline-methods] */
    public final BooleanNode m6129booleanNode(boolean z) {
        return this._nodeFactory.m6140booleanNode(z);
    }

    public JsonNode missingNode() {
        return this._nodeFactory.missingNode();
    }

    /* JADX DEBUG: Method merged with bridge method: nullNode()Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: nullNode, reason: merged with bridge method [inline-methods] */
    public final NullNode m6130nullNode() {
        return this._nodeFactory.m6141nullNode();
    }

    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    public final ArrayNode arrayNode(int i) {
        return this._nodeFactory.arrayNode(i);
    }

    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(B)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m6131numberNode(byte b) {
        return this._nodeFactory.m6142numberNode(b);
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(S)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m6136numberNode(short s) {
        return this._nodeFactory.m6147numberNode(s);
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(I)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m6134numberNode(int i) {
        return this._nodeFactory.m6145numberNode(i);
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(J)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m6135numberNode(long j) {
        return this._nodeFactory.m6146numberNode(j);
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(F)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m6133numberNode(float f) {
        return this._nodeFactory.m6144numberNode(f);
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(D)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public final NumericNode m6132numberNode(double d) {
        return this._nodeFactory.m6143numberNode(d);
    }

    public final ValueNode numberNode(BigInteger bigInteger) {
        return this._nodeFactory.numberNode(bigInteger);
    }

    public final ValueNode numberNode(BigDecimal bigDecimal) {
        return this._nodeFactory.numberNode(bigDecimal);
    }

    public final ValueNode numberNode(Byte b) {
        return this._nodeFactory.numberNode(b);
    }

    public final ValueNode numberNode(Short sh) {
        return this._nodeFactory.numberNode(sh);
    }

    public final ValueNode numberNode(Integer num) {
        return this._nodeFactory.numberNode(num);
    }

    public final ValueNode numberNode(Long l) {
        return this._nodeFactory.numberNode(l);
    }

    public final ValueNode numberNode(Float f) {
        return this._nodeFactory.numberNode(f);
    }

    public final ValueNode numberNode(Double d) {
        return this._nodeFactory.numberNode(d);
    }

    /* JADX DEBUG: Method merged with bridge method: textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: textNode, reason: merged with bridge method [inline-methods] */
    public final TextNode m6137textNode(String str) {
        return this._nodeFactory.m6148textNode(str);
    }

    /* JADX DEBUG: Method merged with bridge method: binaryNode([B)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public final BinaryNode m6127binaryNode(byte[] bArr) {
        return this._nodeFactory.m6138binaryNode(bArr);
    }

    /* JADX DEBUG: Method merged with bridge method: binaryNode([BII)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public final BinaryNode m6128binaryNode(byte[] bArr, int i, int i2) {
        return this._nodeFactory.m6139binaryNode(bArr, i, i2);
    }

    public final ValueNode pojoNode(Object obj) {
        return this._nodeFactory.pojoNode(obj);
    }

    public final ValueNode rawValueNode(C5624Yx c5624Yx) {
        return this._nodeFactory.rawValueNode(c5624Yx);
    }
}
