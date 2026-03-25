package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;

/* JADX INFO: loaded from: classes21.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<JsonNode> {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public Object getAbsentValue(DeserializationContext deserializationContext) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, o.InterfaceC5554We
    public /* bridge */ /* synthetic */ AbstractC5548Vy createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        return super.createContextual(deserializationContext, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, o.AbstractC5548Vy
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, o.AbstractC5548Vy
    public /* bridge */ /* synthetic */ LogicalType logicalType() {
        return super.logicalType();
    }

    public JsonNodeDeserializer() {
        super(JsonNode.class, null);
    }

    public JsonNodeDeserializer(JsonNodeDeserializer jsonNodeDeserializer, boolean z, boolean z2) {
        super(jsonNodeDeserializer, z, z2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
    public AbstractC5548Vy<?> _createWithMerge(boolean z, boolean z2) {
        return new JsonNodeDeserializer(this, z, z2);
    }

    public static AbstractC5548Vy<? extends JsonNode> getDeserializer(Class<?> cls) {
        if (cls == ObjectNode.class) {
            return ObjectDeserializer.getInstance();
        }
        return cls == ArrayNode.class ? ArrayDeserializer.getInstance() : instance;
    }

    /* JADX DEBUG: Method merged with bridge method: getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy, o.InterfaceC5555Wf
    public JsonNode getNullValue(DeserializationContext deserializationContext) {
        return deserializationContext.getNodeFactory().m6141nullNode();
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        BaseNodeDeserializer.Application application = new BaseNodeDeserializer.Application();
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int iValueOf = jsonParser.valueOf();
        if (iValueOf == 1) {
            return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, application, nodeFactory.objectNode());
        }
        if (iValueOf == 2) {
            return nodeFactory.objectNode();
        }
        if (iValueOf == 3) {
            return _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, application, nodeFactory.arrayNode());
        }
        if (iValueOf == 5) {
            return _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, application);
        }
        return _deserializeAnyScalar(jsonParser, deserializationContext);
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        protected static final ObjectDeserializer _instance = new ObjectDeserializer();
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ObjectDeserializer getInstance() {
            return _instance;
        }

        public ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        public ObjectDeserializer(ObjectDeserializer objectDeserializer, boolean z, boolean z2) {
            super(objectDeserializer, z, z2);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
        public AbstractC5548Vy<?> _createWithMerge(boolean z, boolean z2) {
            return new ObjectDeserializer(this, z, z2);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            if (jsonParser.QVAiDq()) {
                ObjectNode objectNode = nodeFactory.objectNode();
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.Application(), objectNode);
                return objectNode;
            }
            if (jsonParser.copydefault(JsonToken.FIELD_NAME)) {
                return _deserializeObjectAtName(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.Application());
            }
            if (jsonParser.copydefault(JsonToken.END_OBJECT)) {
                return nodeFactory.objectNode();
            }
            return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
            if (jsonParser.QVAiDq() || jsonParser.copydefault(JsonToken.FIELD_NAME)) {
                return (ObjectNode) updateObject(jsonParser, deserializationContext, objectNode, new BaseNodeDeserializer.Application());
            }
            return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }
    }

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        protected static final ArrayDeserializer _instance = new ArrayDeserializer();
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static ArrayDeserializer getInstance() {
            return _instance;
        }

        public ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        public ArrayDeserializer(ArrayDeserializer arrayDeserializer, boolean z, boolean z2) {
            super(arrayDeserializer, z, z2);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer
        public AbstractC5548Vy<?> _createWithMerge(boolean z, boolean z2) {
            return new ArrayDeserializer(this, z, z2);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.RJOkX()) {
                JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
                ArrayNode arrayNode = nodeFactory.arrayNode();
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, new BaseNodeDeserializer.Application(), arrayNode);
                return arrayNode;
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }

        /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC5548Vy
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
            if (jsonParser.RJOkX()) {
                _deserializeContainerNoRecursion(jsonParser, deserializationContext, deserializationContext.getNodeFactory(), new BaseNodeDeserializer.Application(), arrayNode);
                return arrayNode;
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }
    }
}
