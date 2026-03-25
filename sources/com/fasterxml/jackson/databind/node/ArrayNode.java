package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o.AbstractC5601Xz;
import o.C5624Yx;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class ArrayNode extends ContainerNode<ArrayNode> implements Serializable {
    private static final long serialVersionUID = 1;
    private final List<JsonNode> _children;

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/String;)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: get */
    public JsonNode mo6123get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isArray() {
        return true;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i) {
        super(jsonNodeFactory);
        this._children = new ArrayList(i);
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<JsonNode> list) {
        super(jsonNodeFactory);
        this._children = list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode _at(JsonPointer jsonPointer) {
        return mo6122get(jsonPointer.getMatchingIndex());
    }

    /* JADX DEBUG: Method merged with bridge method: deepCopy()Lcom/fasterxml/jackson/databind/JsonNode; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            arrayNode._children.add(it.next().deepCopy());
        }
        return arrayNode;
    }

    /* JADX DEBUG: Method merged with bridge method: with(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    @Deprecated
    public ObjectNode with(String str) {
        JsonPointer jsonPointer_jsonPointerIfValid = _jsonPointerIfValid(str);
        if (jsonPointer_jsonPointerIfValid != null) {
            return withObject(jsonPointer_jsonPointerIfValid);
        }
        return (ObjectNode) super.with(str);
    }

    /* JADX DEBUG: Method merged with bridge method: withArray(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode withArray(String str) {
        JsonPointer jsonPointer_jsonPointerIfValid = _jsonPointerIfValid(str);
        if (jsonPointer_jsonPointerIfValid != null) {
            return withArray(jsonPointer_jsonPointerIfValid);
        }
        return (ArrayNode) super.withArray(str);
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode
    public ObjectNode _withObject(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        if (jsonPointer2.matches()) {
            return null;
        }
        JsonNode jsonNode_at = _at(jsonPointer2);
        if (jsonNode_at != null && (jsonNode_at instanceof BaseJsonNode)) {
            ObjectNode objectNode_withObject = ((BaseJsonNode) jsonNode_at)._withObject(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (objectNode_withObject != null) {
                return objectNode_withObject;
            }
            _withXxxVerifyReplace(jsonPointer, jsonPointer2, overwriteMode, z, jsonNode_at);
        }
        return _withObjectAddTailElement(jsonPointer2, z);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public ArrayNode _withArray(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        if (jsonPointer2.matches()) {
            return this;
        }
        JsonNode jsonNode_at = _at(jsonPointer2);
        if (jsonNode_at != null && (jsonNode_at instanceof BaseJsonNode)) {
            ArrayNode arrayNode_withArray = ((BaseJsonNode) jsonNode_at)._withArray(jsonPointer, jsonPointer2.tail(), overwriteMode, z);
            if (arrayNode_withArray != null) {
                return arrayNode_withArray;
            }
            _withXxxVerifyReplace(jsonPointer, jsonPointer2, overwriteMode, z, jsonNode_at);
        }
        return _withArrayAddTailElement(jsonPointer2, z);
    }

    public ObjectNode _withObjectAddTailElement(JsonPointer jsonPointer, boolean z) {
        int matchingIndex = jsonPointer.getMatchingIndex();
        if (matchingIndex < 0) {
            return null;
        }
        JsonPointer jsonPointerTail = jsonPointer.tail();
        if (jsonPointerTail.matches()) {
            ObjectNode objectNode = objectNode();
            _withXxxSetArrayElement(matchingIndex, objectNode);
            return objectNode;
        }
        if (z && jsonPointerTail.mayMatchElement()) {
            ArrayNode arrayNode = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode);
            return arrayNode._withObjectAddTailElement(jsonPointerTail, z);
        }
        ObjectNode objectNode2 = objectNode();
        _withXxxSetArrayElement(matchingIndex, objectNode2);
        return objectNode2._withObjectAddTailProperty(jsonPointerTail, z);
    }

    public ArrayNode _withArrayAddTailElement(JsonPointer jsonPointer, boolean z) {
        int matchingIndex = jsonPointer.getMatchingIndex();
        if (matchingIndex < 0) {
            return null;
        }
        JsonPointer jsonPointerTail = jsonPointer.tail();
        if (jsonPointerTail.matches()) {
            ArrayNode arrayNode = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode);
            return arrayNode;
        }
        if (z && jsonPointerTail.mayMatchElement()) {
            ArrayNode arrayNode2 = arrayNode();
            _withXxxSetArrayElement(matchingIndex, arrayNode2);
            return arrayNode2._withArrayAddTailElement(jsonPointerTail, z);
        }
        ArrayNode arrayNode3 = arrayNode();
        _withXxxSetArrayElement(matchingIndex, arrayNode3);
        return arrayNode3._withArrayAddTailElement(jsonPointerTail, z);
    }

    public void _withXxxSetArrayElement(int i, JsonNode jsonNode) {
        if (i >= size()) {
            int maxElementIndexForInsert = this._nodeFactory.getMaxElementIndexForInsert();
            if (i > maxElementIndexForInsert) {
                _reportWrongNodeOperation("Too big Array index (%d; max %d) to use for insert with `JsonPointer`", Integer.valueOf(i), Integer.valueOf(maxElementIndexForInsert));
            }
            while (i >= size()) {
                addNull();
            }
        }
        set(i, jsonNode);
    }

    @Override // o.VF.Application
    public boolean isEmpty(VI vi) {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC5509Um
    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    public int size() {
        return this._children.size();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.iterator();
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: get */
    public JsonNode mo6122get(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return this._children.get(i);
    }

    /* JADX DEBUG: Method merged with bridge method: path(Ljava/lang/String;)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: path */
    public JsonNode mo6125path(String str) {
        return MissingNode.getInstance();
    }

    /* JADX DEBUG: Method merged with bridge method: path(I)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: path */
    public JsonNode mo6124path(int i) {
        if (i >= 0 && i < this._children.size()) {
            return this._children.get(i);
        }
        return MissingNode.getInstance();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(int i) {
        if (i >= 0 && i < this._children.size()) {
            return this._children.get(i);
        }
        return (JsonNode) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i), Integer.valueOf(this._children.size()));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof ArrayNode)) {
            return false;
        }
        ArrayNode arrayNode = (ArrayNode) jsonNode;
        int size = this._children.size();
        if (arrayNode.size() != size) {
            return false;
        }
        List<JsonNode> list = this._children;
        List<JsonNode> list2 = arrayNode._children;
        for (int i = 0; i < size; i++) {
            if (!list.get(i).equals(comparator, list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.VF
    public void serialize(JsonGenerator jsonGenerator, VI vi) throws IOException {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.AEQbTJ(this, size);
        for (int i = 0; i < size; i++) {
            list.get(i).serialize(jsonGenerator, vi);
        }
        jsonGenerator.fetchVPNInfo();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.VF
    public void serializeWithType(JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, vi);
        }
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindValue = it.next().findValue(str);
            if (jsonNodeFindValue != null) {
                return jsonNodeFindValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValues(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValuesAsText(str, list);
        }
        return list;
    }

    /* JADX DEBUG: Method merged with bridge method: findParent(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode findParent(String str) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            JsonNode jsonNodeFindParent = it.next().findParent(str);
            if (jsonNodeFindParent != null) {
                return (ObjectNode) jsonNodeFindParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findParents(str, list);
        }
        return list;
    }

    public JsonNode set(int i, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = m6130nullNode();
        }
        if (i < 0 || i >= this._children.size()) {
            throw new IndexOutOfBoundsException("Illegal index " + i + ", array size " + size());
        }
        return this._children.set(i, jsonNode);
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = m6130nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    public ArrayNode addAll(Collection<? extends JsonNode> collection) {
        Iterator<? extends JsonNode> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }

    public ArrayNode insert(int i, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = m6130nullNode();
        }
        _insert(i, jsonNode);
        return this;
    }

    public JsonNode remove(int i) {
        if (i < 0 || i >= this._children.size()) {
            return null;
        }
        return this._children.remove(i);
    }

    /* JADX DEBUG: Method merged with bridge method: removeAll()Lcom/fasterxml/jackson/databind/node/ContainerNode; */
    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        return _add(obj == null ? m6130nullNode() : pojoNode(obj));
    }

    public ArrayNode addRawValue(C5624Yx c5624Yx) {
        return _add(c5624Yx == null ? m6130nullNode() : rawValueNode(c5624Yx));
    }

    public ArrayNode addNull() {
        return _add(m6130nullNode());
    }

    public ArrayNode add(short s) {
        return _add(m6136numberNode(s));
    }

    public ArrayNode add(Short sh) {
        return _add(sh == null ? m6130nullNode() : m6136numberNode(sh.shortValue()));
    }

    public ArrayNode add(int i) {
        return _add(m6134numberNode(i));
    }

    public ArrayNode add(Integer num) {
        return _add(num == null ? m6130nullNode() : m6134numberNode(num.intValue()));
    }

    public ArrayNode add(long j) {
        return _add(m6135numberNode(j));
    }

    public ArrayNode add(Long l) {
        return _add(l == null ? m6130nullNode() : m6135numberNode(l.longValue()));
    }

    public ArrayNode add(float f) {
        return _add(m6133numberNode(f));
    }

    public ArrayNode add(Float f) {
        return _add(f == null ? m6130nullNode() : m6133numberNode(f.floatValue()));
    }

    public ArrayNode add(double d) {
        return _add(m6132numberNode(d));
    }

    public ArrayNode add(Double d) {
        return _add(d == null ? m6130nullNode() : m6132numberNode(d.doubleValue()));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        return _add(bigDecimal == null ? m6130nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode add(BigInteger bigInteger) {
        return _add(bigInteger == null ? m6130nullNode() : numberNode(bigInteger));
    }

    public ArrayNode add(String str) {
        return _add(str == null ? m6130nullNode() : m6137textNode(str));
    }

    public ArrayNode add(boolean z) {
        return _add(m6129booleanNode(z));
    }

    public ArrayNode add(Boolean bool) {
        return _add(bool == null ? m6130nullNode() : m6129booleanNode(bool.booleanValue()));
    }

    public ArrayNode add(byte[] bArr) {
        return _add(bArr == null ? m6130nullNode() : m6127binaryNode(bArr));
    }

    public ArrayNode insertArray(int i) {
        ArrayNode arrayNode = arrayNode();
        _insert(i, arrayNode);
        return arrayNode;
    }

    public ObjectNode insertObject(int i) {
        ObjectNode objectNode = objectNode();
        _insert(i, objectNode);
        return objectNode;
    }

    public ArrayNode insertNull(int i) {
        return _insert(i, m6130nullNode());
    }

    public ArrayNode insertPOJO(int i, Object obj) {
        return _insert(i, obj == null ? m6130nullNode() : pojoNode(obj));
    }

    public ArrayNode insertRawValue(int i, C5624Yx c5624Yx) {
        return _insert(i, c5624Yx == null ? m6130nullNode() : rawValueNode(c5624Yx));
    }

    public ArrayNode insert(int i, short s) {
        return _insert(i, m6136numberNode(s));
    }

    public ArrayNode insert(int i, Short sh) {
        return _insert(i, sh == null ? m6130nullNode() : m6136numberNode(sh.shortValue()));
    }

    public ArrayNode insert(int i, int i2) {
        return _insert(i, m6134numberNode(i2));
    }

    public ArrayNode insert(int i, Integer num) {
        return _insert(i, num == null ? m6130nullNode() : m6134numberNode(num.intValue()));
    }

    public ArrayNode insert(int i, long j) {
        return _insert(i, m6135numberNode(j));
    }

    public ArrayNode insert(int i, Long l) {
        return _insert(i, l == null ? m6130nullNode() : m6135numberNode(l.longValue()));
    }

    public ArrayNode insert(int i, float f) {
        return _insert(i, m6133numberNode(f));
    }

    public ArrayNode insert(int i, Float f) {
        return _insert(i, f == null ? m6130nullNode() : m6133numberNode(f.floatValue()));
    }

    public ArrayNode insert(int i, double d) {
        return _insert(i, m6132numberNode(d));
    }

    public ArrayNode insert(int i, Double d) {
        return _insert(i, d == null ? m6130nullNode() : m6132numberNode(d.doubleValue()));
    }

    public ArrayNode insert(int i, BigDecimal bigDecimal) {
        return _insert(i, bigDecimal == null ? m6130nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode insert(int i, BigInteger bigInteger) {
        return _insert(i, bigInteger == null ? m6130nullNode() : numberNode(bigInteger));
    }

    public ArrayNode insert(int i, String str) {
        return _insert(i, str == null ? m6130nullNode() : m6137textNode(str));
    }

    public ArrayNode insert(int i, boolean z) {
        return _insert(i, m6129booleanNode(z));
    }

    public ArrayNode insert(int i, Boolean bool) {
        if (bool == null) {
            return insertNull(i);
        }
        return _insert(i, m6129booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i);
        }
        return _insert(i, m6127binaryNode(bArr));
    }

    public ArrayNode setNull(int i) {
        return _set(i, m6130nullNode());
    }

    public ArrayNode setPOJO(int i, Object obj) {
        return _set(i, obj == null ? m6130nullNode() : pojoNode(obj));
    }

    public ArrayNode setRawValue(int i, C5624Yx c5624Yx) {
        return _set(i, c5624Yx == null ? m6130nullNode() : rawValueNode(c5624Yx));
    }

    public ArrayNode set(int i, short s) {
        return _set(i, m6136numberNode(s));
    }

    public ArrayNode set(int i, Short sh) {
        return _set(i, sh == null ? m6130nullNode() : m6136numberNode(sh.shortValue()));
    }

    public ArrayNode set(int i, int i2) {
        return _set(i, m6134numberNode(i2));
    }

    public ArrayNode set(int i, Integer num) {
        return _set(i, num == null ? m6130nullNode() : m6134numberNode(num.intValue()));
    }

    public ArrayNode set(int i, long j) {
        return _set(i, m6135numberNode(j));
    }

    public ArrayNode set(int i, Long l) {
        return _set(i, l == null ? m6130nullNode() : m6135numberNode(l.longValue()));
    }

    public ArrayNode set(int i, float f) {
        return _set(i, m6133numberNode(f));
    }

    public ArrayNode set(int i, Float f) {
        return _set(i, f == null ? m6130nullNode() : m6133numberNode(f.floatValue()));
    }

    public ArrayNode set(int i, double d) {
        return _set(i, m6132numberNode(d));
    }

    public ArrayNode set(int i, Double d) {
        return _set(i, d == null ? m6130nullNode() : m6132numberNode(d.doubleValue()));
    }

    public ArrayNode set(int i, BigDecimal bigDecimal) {
        return _set(i, bigDecimal == null ? m6130nullNode() : numberNode(bigDecimal));
    }

    public ArrayNode set(int i, BigInteger bigInteger) {
        return _set(i, bigInteger == null ? m6130nullNode() : numberNode(bigInteger));
    }

    public ArrayNode set(int i, String str) {
        return _set(i, str == null ? m6130nullNode() : m6137textNode(str));
    }

    public ArrayNode set(int i, boolean z) {
        return _set(i, m6129booleanNode(z));
    }

    public ArrayNode set(int i, Boolean bool) {
        return _set(i, bool == null ? m6130nullNode() : m6129booleanNode(bool.booleanValue()));
    }

    public ArrayNode set(int i, byte[] bArr) {
        return _set(i, bArr == null ? m6130nullNode() : m6127binaryNode(bArr));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public boolean _childrenEqual(ArrayNode arrayNode) {
        return this._children.equals(arrayNode._children);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode _set(int i, JsonNode jsonNode) {
        if (i < 0 || i >= this._children.size()) {
            throw new IndexOutOfBoundsException("Illegal index " + i + ", array size " + size());
        }
        this._children.set(i, jsonNode);
        return this;
    }

    public ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    public ArrayNode _insert(int i, JsonNode jsonNode) {
        if (i < 0) {
            this._children.add(0, jsonNode);
        } else if (i >= this._children.size()) {
            this._children.add(jsonNode);
        } else {
            this._children.add(i, jsonNode);
        }
        return this;
    }
}
