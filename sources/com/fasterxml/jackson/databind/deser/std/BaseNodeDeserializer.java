package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.Arrays;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5624Yx;
import o.InterfaceC5554We;

/* JADX INFO: loaded from: classes21.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> implements InterfaceC5554We {
    protected final boolean _mergeArrays;
    protected final boolean _mergeObjects;
    protected final Boolean _supportsUpdates;

    public abstract AbstractC5548Vy<?> _createWithMerge(boolean z, boolean z2);

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
        this._mergeArrays = true;
        this._mergeObjects = true;
    }

    public BaseNodeDeserializer(BaseNodeDeserializer<?> baseNodeDeserializer, boolean z, boolean z2) {
        super(baseNodeDeserializer);
        this._supportsUpdates = baseNodeDeserializer._supportsUpdates;
        this._mergeArrays = z;
        this._mergeObjects = z2;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        Boolean defaultMergeable = config.getDefaultMergeable(ArrayNode.class);
        Boolean defaultMergeable2 = config.getDefaultMergeable(ObjectNode.class);
        Boolean defaultMergeable3 = config.getDefaultMergeable(JsonNode.class);
        boolean z_shouldMerge = _shouldMerge(defaultMergeable, defaultMergeable3);
        boolean z_shouldMerge2 = _shouldMerge(defaultMergeable2, defaultMergeable3);
        return (z_shouldMerge == this._mergeArrays && z_shouldMerge2 == this._mergeObjects) ? this : _createWithMerge(z_shouldMerge, z_shouldMerge2);
    }

    private static boolean _shouldMerge(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.booleanValue();
        }
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return true;
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws IOException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jsonNode.isArray()) {
                ((ArrayNode) jsonNode).add(jsonNode2);
                objectNode.replace(str, jsonNode);
            } else {
                ArrayNode arrayNode = jsonNodeFactory.arrayNode();
                arrayNode.add(jsonNode);
                arrayNode.add(jsonNode2);
                objectNode.replace(str, arrayNode);
            }
        }
    }

    public final ObjectNode _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, Application application) throws IOException {
        JsonNode jsonNode_deserializeContainerNoRecursion;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String strKWHzl = jsonParser.KWHzl();
        while (strKWHzl != null) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == null) {
                jsonTokenRcXXUw = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenRcXXUw.id();
            if (iId == 1) {
                jsonNode_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, application, jsonNodeFactory.objectNode());
            } else if (iId == 3) {
                jsonNode_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, application, jsonNodeFactory.arrayNode());
            } else {
                jsonNode_deserializeContainerNoRecursion = _deserializeAnyScalar(jsonParser, deserializationContext);
            }
            JsonNode jsonNode = jsonNode_deserializeContainerNoRecursion;
            JsonNode jsonNodeReplace = objectNode.replace(strKWHzl, jsonNode);
            if (jsonNodeReplace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strKWHzl, objectNode, jsonNodeReplace, jsonNode);
            }
            strKWHzl = jsonParser.QbewEr();
        }
        return objectNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode, Application application) throws IOException {
        String strKWHzl;
        JsonNode jsonNode_deserializeContainerNoRecursion;
        if (jsonParser.QVAiDq()) {
            strKWHzl = jsonParser.QbewEr();
        } else {
            if (!jsonParser.copydefault(JsonToken.FIELD_NAME)) {
                return deserialize(jsonParser, deserializationContext);
            }
            strKWHzl = jsonParser.KWHzl();
        }
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (strKWHzl != null) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            JsonNode jsonNodeMo6123get = objectNode.mo6123get(strKWHzl);
            if (jsonNodeMo6123get != null) {
                if (jsonNodeMo6123get instanceof ObjectNode) {
                    if (jsonTokenRcXXUw == JsonToken.START_OBJECT && this._mergeObjects) {
                        JsonNode jsonNodeUpdateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) jsonNodeMo6123get, application);
                        if (jsonNodeUpdateObject != jsonNodeMo6123get) {
                            objectNode.set(strKWHzl, jsonNodeUpdateObject);
                        }
                    }
                } else if ((jsonNodeMo6123get instanceof ArrayNode) && jsonTokenRcXXUw == JsonToken.START_ARRAY && this._mergeArrays) {
                    _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, application, (ArrayNode) jsonNodeMo6123get);
                }
            } else {
                if (jsonTokenRcXXUw == null) {
                    jsonTokenRcXXUw = JsonToken.NOT_AVAILABLE;
                }
                int iId = jsonTokenRcXXUw.id();
                if (iId != 1) {
                    if (iId != 3) {
                        if (iId != 6) {
                            if (iId == 7) {
                                jsonNode_deserializeContainerNoRecursion = _fromInt(jsonParser, deserializationContext, nodeFactory);
                            } else {
                                switch (iId) {
                                    case 9:
                                        jsonNode_deserializeContainerNoRecursion = nodeFactory.m6140booleanNode(true);
                                        break;
                                    case 10:
                                        jsonNode_deserializeContainerNoRecursion = nodeFactory.m6140booleanNode(false);
                                        break;
                                    case 11:
                                        if (deserializationContext.isEnabled(JsonNodeFeature.READ_NULL_PROPERTIES)) {
                                            jsonNode_deserializeContainerNoRecursion = nodeFactory.m6141nullNode();
                                        }
                                        break;
                                    default:
                                        jsonNode_deserializeContainerNoRecursion = _deserializeRareScalar(jsonParser, deserializationContext);
                                        break;
                                }
                            }
                        } else {
                            jsonNode_deserializeContainerNoRecursion = nodeFactory.m6148textNode(jsonParser.zLjUOn());
                        }
                    } else {
                        jsonNode_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, application, nodeFactory.arrayNode());
                    }
                } else {
                    jsonNode_deserializeContainerNoRecursion = _deserializeContainerNoRecursion(jsonParser, deserializationContext, nodeFactory, application, nodeFactory.objectNode());
                }
                objectNode.set(strKWHzl, jsonNode_deserializeContainerNoRecursion);
            }
            strKWHzl = jsonParser.QbewEr();
        }
        return objectNode;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContainerNode<?> _deserializeContainerNoRecursion(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, Application application, ContainerNode<?> containerNode) throws IOException {
        ObjectNode objectNode;
        JsonNode jsonNodeM6148textNode;
        ObjectNode objectNode2;
        JsonNode jsonNodeReplace;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures() & StdDeserializer.F_MASK_INT_COERCIONS;
        ContainerNode containerNodeObjectNode = containerNode;
        do {
            boolean z = true;
            if (containerNodeObjectNode instanceof ObjectNode) {
                ContainerNode containerNode2 = containerNodeObjectNode;
                ObjectNode objectNode3 = (ObjectNode) containerNodeObjectNode;
                String strQbewEr = jsonParser.QbewEr();
                while (strQbewEr != null) {
                    JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw == null) {
                        jsonTokenRcXXUw = JsonToken.NOT_AVAILABLE;
                    }
                    int iId = jsonTokenRcXXUw.id();
                    if (iId == z) {
                        ObjectNode objectNode4 = objectNode3;
                        ObjectNode objectNode5 = jsonNodeFactory.objectNode();
                        JsonNode jsonNodeReplace2 = objectNode4.replace(strQbewEr, objectNode5);
                        if (jsonNodeReplace2 != null) {
                            objectNode = objectNode5;
                            _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strQbewEr, objectNode4, jsonNodeReplace2, objectNode5);
                        } else {
                            objectNode = objectNode5;
                        }
                        application.KWHzl(containerNode2);
                        objectNode3 = objectNode;
                        containerNode2 = objectNode3;
                    } else if (iId == 3) {
                        ObjectNode objectNode6 = objectNode3;
                        ContainerNode containerNodeArrayNode = jsonNodeFactory.arrayNode();
                        JsonNode jsonNodeReplace3 = objectNode6.replace(strQbewEr, containerNodeArrayNode);
                        if (jsonNodeReplace3 != null) {
                            _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strQbewEr, objectNode6, jsonNodeReplace3, containerNodeArrayNode);
                        }
                        application.KWHzl(containerNode2);
                        containerNodeObjectNode = containerNodeArrayNode;
                    } else {
                        switch (iId) {
                            case 6:
                                jsonNodeM6148textNode = jsonNodeFactory.m6148textNode(jsonParser.zLjUOn());
                                JsonNode jsonNode = jsonNodeM6148textNode;
                                jsonNodeReplace = objectNode3.replace(strQbewEr, jsonNode);
                                if (jsonNodeReplace == null) {
                                    objectNode2 = objectNode3;
                                } else {
                                    objectNode2 = objectNode3;
                                    _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strQbewEr, objectNode3, jsonNodeReplace, jsonNode);
                                }
                                break;
                            case 7:
                                jsonNodeM6148textNode = _fromInt(jsonParser, deserializationFeatures, jsonNodeFactory);
                                JsonNode jsonNode2 = jsonNodeM6148textNode;
                                jsonNodeReplace = objectNode3.replace(strQbewEr, jsonNode2);
                                if (jsonNodeReplace == null) {
                                }
                                break;
                            case 8:
                                jsonNodeM6148textNode = _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
                                JsonNode jsonNode22 = jsonNodeM6148textNode;
                                jsonNodeReplace = objectNode3.replace(strQbewEr, jsonNode22);
                                if (jsonNodeReplace == null) {
                                }
                                break;
                            case 9:
                                jsonNodeM6148textNode = jsonNodeFactory.m6140booleanNode(z);
                                JsonNode jsonNode222 = jsonNodeM6148textNode;
                                jsonNodeReplace = objectNode3.replace(strQbewEr, jsonNode222);
                                if (jsonNodeReplace == null) {
                                }
                                break;
                            case 10:
                                jsonNodeM6148textNode = jsonNodeFactory.m6140booleanNode(false);
                                JsonNode jsonNode2222 = jsonNodeM6148textNode;
                                jsonNodeReplace = objectNode3.replace(strQbewEr, jsonNode2222);
                                if (jsonNodeReplace == null) {
                                }
                                break;
                            case 11:
                                if (deserializationContext.isEnabled(JsonNodeFeature.READ_NULL_PROPERTIES)) {
                                    jsonNodeM6148textNode = jsonNodeFactory.m6141nullNode();
                                    JsonNode jsonNode22222 = jsonNodeM6148textNode;
                                    jsonNodeReplace = objectNode3.replace(strQbewEr, jsonNode22222);
                                    if (jsonNodeReplace == null) {
                                    }
                                }
                                objectNode2 = objectNode3;
                                break;
                            default:
                                jsonNodeM6148textNode = _deserializeRareScalar(jsonParser, deserializationContext);
                                JsonNode jsonNode222222 = jsonNodeM6148textNode;
                                jsonNodeReplace = objectNode3.replace(strQbewEr, jsonNode222222);
                                if (jsonNodeReplace == null) {
                                }
                                break;
                        }
                        objectNode3 = objectNode2;
                    }
                    strQbewEr = jsonParser.QbewEr();
                    z = true;
                }
                containerNodeObjectNode = application.OLrzqt();
            } else {
                ArrayNode arrayNode = (ArrayNode) containerNodeObjectNode;
                while (true) {
                    JsonToken jsonTokenRcXXUw2 = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw2 == null) {
                        jsonTokenRcXXUw2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenRcXXUw2.id()) {
                        case 1:
                            application.KWHzl(containerNodeObjectNode);
                            containerNodeObjectNode = jsonNodeFactory.objectNode();
                            arrayNode.add(containerNodeObjectNode);
                            break;
                        case 2:
                        case 5:
                        default:
                            arrayNode.add(_deserializeRareScalar(jsonParser, deserializationContext));
                            break;
                        case 3:
                            application.KWHzl(containerNodeObjectNode);
                            containerNodeObjectNode = jsonNodeFactory.arrayNode();
                            arrayNode.add(containerNodeObjectNode);
                            break;
                        case 4:
                            break;
                        case 6:
                            arrayNode.add(jsonNodeFactory.m6148textNode(jsonParser.zLjUOn()));
                            break;
                        case 7:
                            arrayNode.add(_fromInt(jsonParser, deserializationFeatures, jsonNodeFactory));
                            break;
                        case 8:
                            arrayNode.add(_fromFloat(jsonParser, deserializationContext, jsonNodeFactory));
                            break;
                        case 9:
                            arrayNode.add(jsonNodeFactory.m6140booleanNode(true));
                            break;
                        case 10:
                            arrayNode.add(jsonNodeFactory.m6140booleanNode(false));
                            break;
                        case 11:
                            arrayNode.add(jsonNodeFactory.m6141nullNode());
                            break;
                    }
                }
            }
        } while (containerNodeObjectNode != null);
        return containerNode;
    }

    public final JsonNode _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int iValueOf = jsonParser.valueOf();
        if (iValueOf == 2) {
            return nodeFactory.objectNode();
        }
        switch (iValueOf) {
            case 6:
                return nodeFactory.m6148textNode(jsonParser.zLjUOn());
            case 7:
                return _fromInt(jsonParser, deserializationContext, nodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, nodeFactory);
            case 9:
                return nodeFactory.m6140booleanNode(true);
            case 10:
                return nodeFactory.m6140booleanNode(false);
            case 11:
                return nodeFactory.m6141nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    public final JsonNode _deserializeRareScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int iValueOf = jsonParser.valueOf();
        if (iValueOf == 2) {
            return deserializationContext.getNodeFactory().objectNode();
        }
        if (iValueOf == 8) {
            return _fromFloat(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
        }
        if (iValueOf == 12) {
            return _fromEmbedded(jsonParser, deserializationContext);
        }
        return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
    }

    public final JsonNode _fromInt(JsonParser jsonParser, int i, JsonNodeFactory jsonNodeFactory) throws IOException {
        if (i != 0) {
            if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i)) {
                return jsonNodeFactory.numberNode(jsonParser.gEmmrt());
            }
            return jsonNodeFactory.m6146numberNode(jsonParser.getNewProxyInstance());
        }
        JsonParser.NumberType numberTypeUzCIH = jsonParser.uzCIH();
        if (numberTypeUzCIH == JsonParser.NumberType.INT) {
            return jsonNodeFactory.m6145numberNode(jsonParser.getFieldNames());
        }
        if (numberTypeUzCIH == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.m6146numberNode(jsonParser.getNewProxyInstance());
        }
        return jsonNodeFactory.numberNode(jsonParser.gEmmrt());
    }

    public final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberTypeUzCIH;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) != 0) {
            if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberTypeUzCIH = JsonParser.NumberType.BIG_INTEGER;
            } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
                numberTypeUzCIH = JsonParser.NumberType.LONG;
            } else {
                numberTypeUzCIH = jsonParser.uzCIH();
            }
        } else {
            numberTypeUzCIH = jsonParser.uzCIH();
        }
        if (numberTypeUzCIH == JsonParser.NumberType.INT) {
            return jsonNodeFactory.m6145numberNode(jsonParser.getFieldNames());
        }
        if (numberTypeUzCIH == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.m6146numberNode(jsonParser.getNewProxyInstance());
        }
        return jsonNodeFactory.numberNode(jsonParser.gEmmrt());
    }

    public final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberTypeUzCIH = jsonParser.uzCIH();
        if (numberTypeUzCIH == JsonParser.NumberType.BIG_DECIMAL) {
            return jsonNodeFactory.numberNode(jsonParser.fJNWhG());
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (jsonParser.QfsBiF()) {
                return jsonNodeFactory.m6143numberNode(jsonParser.fARcdN());
            }
            return jsonNodeFactory.numberNode(jsonParser.fJNWhG());
        }
        if (numberTypeUzCIH == JsonParser.NumberType.FLOAT) {
            return jsonNodeFactory.m6144numberNode(jsonParser.ejfBZ());
        }
        return jsonNodeFactory.m6143numberNode(jsonParser.fARcdN());
    }

    public final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        Object objAuCTel = jsonParser.AuCTel();
        if (objAuCTel == null) {
            return nodeFactory.m6141nullNode();
        }
        if (objAuCTel.getClass() == byte[].class) {
            return nodeFactory.m6138binaryNode((byte[]) objAuCTel);
        }
        if (objAuCTel instanceof C5624Yx) {
            return nodeFactory.rawValueNode((C5624Yx) objAuCTel);
        }
        if (objAuCTel instanceof JsonNode) {
            return (JsonNode) objAuCTel;
        }
        return nodeFactory.pojoNode(objAuCTel);
    }

    public static final class Application {
        public int KWHzl;
        public int OLrzqt;
        public ContainerNode[] copydefault;

        public void KWHzl(ContainerNode containerNode) {
            int i = this.KWHzl;
            int i2 = this.OLrzqt;
            if (i < i2) {
                ContainerNode[] containerNodeArr = this.copydefault;
                this.KWHzl = i + 1;
                containerNodeArr[i] = containerNode;
                return;
            }
            if (this.copydefault == null) {
                this.OLrzqt = 10;
                this.copydefault = new ContainerNode[10];
            } else {
                int iMin = i2 + Math.min(4000, Math.max(20, i2 >> 1));
                this.OLrzqt = iMin;
                this.copydefault = (ContainerNode[]) Arrays.copyOf(this.copydefault, iMin);
            }
            ContainerNode[] containerNodeArr2 = this.copydefault;
            int i3 = this.KWHzl;
            this.KWHzl = i3 + 1;
            containerNodeArr2[i3] = containerNode;
        }

        public ContainerNode OLrzqt() {
            int i = this.KWHzl;
            if (i == 0) {
                return null;
            }
            ContainerNode[] containerNodeArr = this.copydefault;
            int i2 = i - 1;
            this.KWHzl = i2;
            return containerNodeArr[i2];
        }
    }
}
