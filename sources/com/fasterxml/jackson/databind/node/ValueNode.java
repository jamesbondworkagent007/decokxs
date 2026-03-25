package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;
import java.util.List;
import o.AbstractC5601Xz;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ValueNode extends BaseJsonNode {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode _at(JsonPointer jsonPointer) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.InterfaceC5509Um
    public abstract JsonToken asToken();

    @Override // com.fasterxml.jackson.databind.JsonNode
    public <T extends JsonNode> T deepCopy() {
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: findParent(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    public final ObjectNode findParent(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final List<JsonNode> findParents(String str, List<JsonNode> list) {
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final JsonNode findValue(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final List<JsonNode> findValues(String str, List<JsonNode> list) {
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final List<String> findValuesAsText(String str, List<String> list) {
        return list;
    }

    /* JADX DEBUG: Method merged with bridge method: get(I)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: get */
    public final JsonNode mo6122get(int i) {
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/String;)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: get */
    public final JsonNode mo6123get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final boolean has(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final boolean has(String str) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final boolean hasNonNull(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final boolean hasNonNull(String str) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, o.VF
    public void serializeWithType(JsonGenerator jsonGenerator, VI vi, AbstractC5601Xz abstractC5601Xz) throws IOException {
        WritableTypeId writableTypeIdAEQbTJ = abstractC5601Xz.AEQbTJ(jsonGenerator, abstractC5601Xz.AEQbTJ(this, asToken()));
        serialize(jsonGenerator, vi);
        abstractC5601Xz.copydefault(jsonGenerator, writableTypeIdAEQbTJ);
    }

    /* JADX DEBUG: Method merged with bridge method: path(I)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: path */
    public final JsonNode mo6124path(int i) {
        return MissingNode.getInstance();
    }

    /* JADX DEBUG: Method merged with bridge method: path(Ljava/lang/String;)Lo/Um; */
    @Override // com.fasterxml.jackson.databind.JsonNode
    /* JADX INFO: renamed from: path */
    public final JsonNode mo6125path(String str) {
        return MissingNode.getInstance();
    }
}
