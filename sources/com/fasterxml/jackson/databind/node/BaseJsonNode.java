package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.io.Serializable;
import o.AbstractC5505Ui;
import o.AbstractC5601Xz;
import o.VI;
import o.XM;
import o.XQ;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BaseJsonNode extends JsonNode implements Serializable {
    private static final long serialVersionUID = 1;

    public ArrayNode _withArray(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        return null;
    }

    public ObjectNode _withObject(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z) {
        return null;
    }

    public abstract JsonToken asToken();

    public abstract int hashCode();

    @Override // o.InterfaceC5509Um
    public JsonParser.NumberType numberType() {
        return null;
    }

    @Override // o.VF
    public abstract void serialize(JsonGenerator jsonGenerator, VI vi) throws IOException;

    @Override // o.VF
    public abstract void serializeWithType(JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException;

    public Object writeReplace() {
        return NodeSerialization.from(this);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode findPath(String str) {
        JsonNode jsonNodeFindValue = findValue(str);
        return jsonNodeFindValue == null ? MissingNode.getInstance() : jsonNodeFindValue;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(String str) {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getSimpleName());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(int i) {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getSimpleName());
    }

    public JsonParser traverse() {
        return new XQ(this);
    }

    public JsonParser traverse(AbstractC5505Ui abstractC5505Ui) {
        return new XQ(this, abstractC5505Ui);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode withObject(JsonPointer jsonPointer, JsonNode.OverwriteMode overwriteMode, boolean z) {
        if (jsonPointer.matches()) {
            if (this instanceof ObjectNode) {
                return (ObjectNode) this;
            }
            _reportWrongNodeType("Can only call `withObject()` with empty JSON Pointer on `ObjectNode`, not `%s`", getClass().getName());
        }
        ObjectNode objectNode_withObject = _withObject(jsonPointer, jsonPointer, overwriteMode, z);
        if (objectNode_withObject == null) {
            _reportWrongNodeType("Cannot replace context node (of type `%s`) using `withObject()` with  JSON Pointer '%s'", getClass().getName(), jsonPointer);
        }
        return objectNode_withObject;
    }

    public void _withXxxVerifyReplace(JsonPointer jsonPointer, JsonPointer jsonPointer2, JsonNode.OverwriteMode overwriteMode, boolean z, JsonNode jsonNode) {
        if (_withXxxMayReplace(jsonNode, overwriteMode)) {
            return;
        }
        _reportWrongNodeType("Cannot replace `JsonNode` of type `%s` for property \"%s\" in JSON Pointer \"%s\" (mode `OverwriteMode.%s`)", jsonNode.getClass().getName(), jsonPointer2.getMatchingProperty(), jsonPointer, overwriteMode);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.BaseJsonNode$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[JsonNode.OverwriteMode.values().length];
            AEQbTJ = iArr;
            try {
                iArr[JsonNode.OverwriteMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[JsonNode.OverwriteMode.NULLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[JsonNode.OverwriteMode.SCALARS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[JsonNode.OverwriteMode.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public boolean _withXxxMayReplace(JsonNode jsonNode, JsonNode.OverwriteMode overwriteMode) {
        int i = AnonymousClass5.AEQbTJ[overwriteMode.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return jsonNode.isNull();
        }
        if (i != 3) {
            return true;
        }
        return !jsonNode.isContainerNode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode withArray(JsonPointer jsonPointer, JsonNode.OverwriteMode overwriteMode, boolean z) {
        if (jsonPointer.matches()) {
            if (this instanceof ArrayNode) {
                return (ArrayNode) this;
            }
            _reportWrongNodeType("Can only call `withArray()` with empty JSON Pointer on `ArrayNode`, not `%s`", getClass().getName());
        }
        ArrayNode arrayNode_withArray = _withArray(jsonPointer, jsonPointer, overwriteMode, z);
        if (arrayNode_withArray == null) {
            _reportWrongNodeType("Cannot replace context node (of type `%s`) using `withArray()` with  JSON Pointer '%s'", getClass().getName(), jsonPointer);
        }
        return arrayNode_withArray;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String toString() {
        return XM.AEQbTJ(this);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String toPrettyString() {
        return XM.OLrzqt(this);
    }

    public <T> T _reportWrongNodeType(String str, Object... objArr) {
        throw new UnsupportedOperationException(String.format(str, objArr));
    }

    public <T> T _reportWrongNodeOperation(String str, Object... objArr) {
        throw new UnsupportedOperationException(String.format(str, objArr));
    }

    public JsonPointer _jsonPointerIfValid(String str) {
        if (str.isEmpty() || str.charAt(0) == '/') {
            return JsonPointer.compile(str);
        }
        return null;
    }
}
