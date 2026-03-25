package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.C5624Yx;

/* JADX INFO: loaded from: classes17.dex */
public class JsonNodeFactory implements Serializable {
    protected static final int MAX_ELEMENT_INDEX_FOR_INSERT = 9999;
    private static final JsonNodeFactory decimalsAsIs;
    private static final JsonNodeFactory decimalsNormalized;
    public static final JsonNodeFactory instance;
    private static final long serialVersionUID = 1;
    private final boolean _cfgBigDecimalExact;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static JsonNodeFactory withExactBigDecimals(boolean z) {
        return z ? decimalsAsIs : decimalsNormalized;
    }

    public boolean _inIntRange(long j) {
        return ((long) ((int) j)) == j;
    }

    public int getMaxElementIndexForInsert() {
        return MAX_ELEMENT_INDEX_FOR_INSERT;
    }

    static {
        JsonNodeFactory jsonNodeFactory = new JsonNodeFactory(false);
        decimalsNormalized = jsonNodeFactory;
        decimalsAsIs = new JsonNodeFactory(true);
        instance = jsonNodeFactory;
    }

    public JsonNodeFactory(boolean z) {
        this._cfgBigDecimalExact = z;
    }

    public JsonNodeFactory() {
        this(false);
    }

    /* JADX DEBUG: Method merged with bridge method: booleanNode(Z)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: booleanNode, reason: merged with bridge method [inline-methods] */
    public BooleanNode m6140booleanNode(boolean z) {
        return z ? BooleanNode.getTrue() : BooleanNode.getFalse();
    }

    /* JADX DEBUG: Method merged with bridge method: nullNode()Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: nullNode, reason: merged with bridge method [inline-methods] */
    public NullNode m6141nullNode() {
        return NullNode.getInstance();
    }

    public JsonNode missingNode() {
        return MissingNode.getInstance();
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(B)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m6142numberNode(byte b) {
        return IntNode.valueOf(b);
    }

    public ValueNode numberNode(Byte b) {
        return b == null ? m6141nullNode() : IntNode.valueOf(b.intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(S)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m6147numberNode(short s) {
        return ShortNode.valueOf(s);
    }

    public ValueNode numberNode(Short sh) {
        return sh == null ? m6141nullNode() : ShortNode.valueOf(sh.shortValue());
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(I)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m6145numberNode(int i) {
        return IntNode.valueOf(i);
    }

    public ValueNode numberNode(Integer num) {
        return num == null ? m6141nullNode() : IntNode.valueOf(num.intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(J)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m6146numberNode(long j) {
        return LongNode.valueOf(j);
    }

    public ValueNode numberNode(Long l) {
        if (l == null) {
            return m6141nullNode();
        }
        return LongNode.valueOf(l.longValue());
    }

    public ValueNode numberNode(BigInteger bigInteger) {
        if (bigInteger == null) {
            return m6141nullNode();
        }
        return BigIntegerNode.valueOf(bigInteger);
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(F)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m6144numberNode(float f) {
        return FloatNode.valueOf(f);
    }

    public ValueNode numberNode(Float f) {
        return f == null ? m6141nullNode() : FloatNode.valueOf(f.floatValue());
    }

    /* JADX DEBUG: Method merged with bridge method: numberNode(D)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: numberNode, reason: merged with bridge method [inline-methods] */
    public NumericNode m6143numberNode(double d) {
        return DoubleNode.valueOf(d);
    }

    public ValueNode numberNode(Double d) {
        return d == null ? m6141nullNode() : DoubleNode.valueOf(d.doubleValue());
    }

    public ValueNode numberNode(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return m6141nullNode();
        }
        if (this._cfgBigDecimalExact) {
            return DecimalNode.valueOf(bigDecimal);
        }
        if (bigDecimal.signum() == 0) {
            return DecimalNode.ZERO;
        }
        try {
            bigDecimal = bigDecimal.stripTrailingZeros();
        } catch (ArithmeticException unused) {
        }
        return DecimalNode.valueOf(bigDecimal);
    }

    /* JADX DEBUG: Method merged with bridge method: textNode(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: textNode, reason: merged with bridge method [inline-methods] */
    public TextNode m6148textNode(String str) {
        return TextNode.valueOf(str);
    }

    /* JADX DEBUG: Method merged with bridge method: binaryNode([B)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public BinaryNode m6138binaryNode(byte[] bArr) {
        return BinaryNode.valueOf(bArr);
    }

    /* JADX DEBUG: Method merged with bridge method: binaryNode([BII)Lcom/fasterxml/jackson/databind/node/ValueNode; */
    /* JADX INFO: renamed from: binaryNode, reason: merged with bridge method [inline-methods] */
    public BinaryNode m6139binaryNode(byte[] bArr, int i, int i2) {
        return BinaryNode.valueOf(bArr, i, i2);
    }

    public ArrayNode arrayNode() {
        return new ArrayNode(this);
    }

    public ArrayNode arrayNode(int i) {
        return new ArrayNode(this, i);
    }

    public ObjectNode objectNode() {
        return new ObjectNode(this);
    }

    public ValueNode pojoNode(Object obj) {
        return new POJONode(obj);
    }

    public ValueNode rawValueNode(C5624Yx c5624Yx) {
        return new POJONode(c5624Yx);
    }
}
