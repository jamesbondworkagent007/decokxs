package com.fasterxml.jackson.databind;

import androidx.camera.video.AudioStats;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C5619Yr;
import o.InterfaceC5509Um;
import o.VF;

/* JADX INFO: loaded from: classes17.dex */
public abstract class JsonNode extends VF.Application implements InterfaceC5509Um, Iterable<JsonNode> {

    /* JADX INFO: loaded from: classes21.dex */
    public enum OverwriteMode {
        NONE,
        NULLS,
        SCALARS,
        ALL
    }

    public abstract JsonNode _at(JsonPointer jsonPointer);

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.fasterxml.jackson.databind.JsonNode */
    /* JADX WARN: Multi-variable type inference failed */
    public <T extends JsonNode> T _this() {
        return this;
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public double asDouble(double d) {
        return d;
    }

    public int asInt(int i) {
        return i;
    }

    public long asLong(long j) {
        return j;
    }

    public abstract String asText();

    public byte[] binaryValue() throws IOException {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public abstract <T extends JsonNode> T deepCopy();

    public double doubleValue() {
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public abstract boolean equals(Object obj);

    public abstract JsonNode findParent(String str);

    public abstract List<JsonNode> findParents(String str, List<JsonNode> list);

    public abstract JsonNode findPath(String str);

    public abstract JsonNode findValue(String str);

    public abstract List<JsonNode> findValues(String str, List<JsonNode> list);

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public float floatValue() {
        return 0.0f;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Lo/Um; */
    @Override // 
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public abstract JsonNode mo6122get(int i);

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/String;)Lo/Um; */
    @Override // 
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public JsonNode mo6123get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public int intValue() {
        return 0;
    }

    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    public boolean isMissingNode() {
        return false;
    }

    public boolean isObject() {
        return false;
    }

    public boolean isShort() {
        return false;
    }

    public long longValue() {
        return 0L;
    }

    public Number numberValue() {
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: path(I)Lo/Um; */
    @Override // 
    /* JADX INFO: renamed from: path, reason: merged with bridge method [inline-methods] */
    public abstract JsonNode mo6124path(int i);

    /* JADX DEBUG: Method merged with bridge method: path(Ljava/lang/String;)Lo/Um; */
    @Override // 
    /* JADX INFO: renamed from: path, reason: merged with bridge method [inline-methods] */
    public abstract JsonNode mo6125path(String str);

    public short shortValue() {
        return (short) 0;
    }

    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public abstract String toString();

    public boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.JsonNode$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[JsonNodeType.values().length];
            OLrzqt = iArr;
            try {
                iArr[JsonNodeType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[JsonNodeType.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[JsonNodeType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final boolean isValueNode() {
        int i = AnonymousClass3.OLrzqt[getNodeType().ordinal()];
        return (i == 1 || i == 2 || i == 3) ? false : true;
    }

    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        return nodeType == JsonNodeType.OBJECT || nodeType == JsonNodeType.ARRAY;
    }

    public Iterator<String> fieldNames() {
        return C5619Yr.KWHzl();
    }

    /* JADX DEBUG: Method merged with bridge method: at(Lcom/fasterxml/jackson/core/JsonPointer;)Lo/Um; */
    /* JADX INFO: renamed from: at, reason: merged with bridge method [inline-methods] */
    public final JsonNode m6120at(JsonPointer jsonPointer) {
        if (jsonPointer.matches()) {
            return this;
        }
        JsonNode jsonNode_at = _at(jsonPointer);
        if (jsonNode_at == null) {
            return MissingNode.getInstance();
        }
        return jsonNode_at.m6120at(jsonPointer.tail());
    }

    /* JADX DEBUG: Method merged with bridge method: at(Ljava/lang/String;)Lo/Um; */
    /* JADX INFO: renamed from: at, reason: merged with bridge method [inline-methods] */
    public final JsonNode m6121at(String str) {
        return m6120at(JsonPointer.compile(str));
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    public final boolean isTextual() {
        return getNodeType() == JsonNodeType.STRING;
    }

    public final boolean isBoolean() {
        return getNodeType() == JsonNodeType.BOOLEAN;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public boolean canConvertToExactIntegral() {
        return isIntegralNumber();
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public String asText(String str) {
        String strAsText = asText();
        return strAsText == null ? str : strAsText;
    }

    public int asInt() {
        return asInt(0);
    }

    public long asLong() {
        return asLong(0L);
    }

    public double asDouble() {
        return asDouble(AudioStats.AUDIO_AMPLITUDE_NONE);
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public <T extends JsonNode> T require() throws IllegalArgumentException {
        return (T) _this();
    }

    public <T extends JsonNode> T requireNonNull() throws IllegalArgumentException {
        return (T) _this();
    }

    public JsonNode required(String str) throws IllegalArgumentException {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getName());
    }

    public JsonNode required(int i) throws IllegalArgumentException {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getName());
    }

    public JsonNode requiredAt(String str) throws IllegalArgumentException {
        return requiredAt(JsonPointer.compile(str));
    }

    public final JsonNode requiredAt(JsonPointer jsonPointer) throws IllegalArgumentException {
        JsonNode jsonNode_at = this;
        for (JsonPointer jsonPointerTail = jsonPointer; !jsonPointerTail.matches(); jsonPointerTail = jsonPointerTail.tail()) {
            jsonNode_at = jsonNode_at._at(jsonPointerTail);
            if (jsonNode_at == null) {
                _reportRequiredViolation("No node at '%s' (unmatched part: '%s')", jsonPointer, jsonPointerTail);
            }
        }
        return jsonNode_at;
    }

    public boolean has(String str) {
        return mo6123get(str) != null;
    }

    public boolean has(int i) {
        return mo6122get(i) != null;
    }

    public boolean hasNonNull(String str) {
        JsonNode jsonNodeMo6123get = mo6123get(str);
        return (jsonNodeMo6123get == null || jsonNodeMo6123get.isNull()) ? false : true;
    }

    public boolean hasNonNull(int i) {
        JsonNode jsonNodeMo6122get = mo6122get(i);
        return (jsonNodeMo6122get == null || jsonNodeMo6122get.isNull()) ? false : true;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public Iterator<JsonNode> elements() {
        return C5619Yr.KWHzl();
    }

    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return C5619Yr.KWHzl();
    }

    public final List<JsonNode> findValues(String str) {
        List<JsonNode> listFindValues = findValues(str, null);
        return listFindValues == null ? Collections.emptyList() : listFindValues;
    }

    public final List<String> findValuesAsText(String str) {
        List<String> listFindValuesAsText = findValuesAsText(str, null);
        return listFindValuesAsText == null ? Collections.emptyList() : listFindValuesAsText;
    }

    public final List<JsonNode> findParents(String str) {
        List<JsonNode> listFindParents = findParents(str, null);
        return listFindParents == null ? Collections.emptyList() : listFindParents;
    }

    public final ObjectNode withObject(String str) {
        return withObject(JsonPointer.compile(str));
    }

    public final ObjectNode withObject(String str, OverwriteMode overwriteMode, boolean z) {
        return withObject(JsonPointer.compile(str), overwriteMode, z);
    }

    public final ObjectNode withObject(JsonPointer jsonPointer) {
        return withObject(jsonPointer, OverwriteMode.NULLS, true);
    }

    public ObjectNode withObject(JsonPointer jsonPointer, OverwriteMode overwriteMode, boolean z) {
        throw new UnsupportedOperationException("`withObject(JsonPointer)` not implemented by `" + getClass().getName() + "`");
    }

    @Deprecated
    public <T extends JsonNode> T with(String str) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but " + getClass().getName() + "), cannot call `with(String)` on it");
    }

    public <T extends JsonNode> T withArray(String str) {
        throw new UnsupportedOperationException("`JsonNode` not of type `ObjectNode` (but `" + getClass().getName() + ")`, cannot call `withArray()` on it");
    }

    public ArrayNode withArray(String str, OverwriteMode overwriteMode, boolean z) {
        return withArray(JsonPointer.compile(str), overwriteMode, z);
    }

    public final ArrayNode withArray(JsonPointer jsonPointer) {
        return withArray(jsonPointer, OverwriteMode.NULLS, true);
    }

    public ArrayNode withArray(JsonPointer jsonPointer, OverwriteMode overwriteMode, boolean z) {
        throw new UnsupportedOperationException("`withArray(JsonPointer)` not implemented by " + getClass().getName());
    }

    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        return comparator.compare(this, jsonNode) == 0;
    }

    public String toPrettyString() {
        return toString();
    }

    public <T> T _reportRequiredViolation(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }
}
