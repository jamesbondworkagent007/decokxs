package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import o.AbstractC5549Vz;
import o.InterfaceC5501Ue;
import o.InterfaceC5584Xi;
import o.InterfaceC5591Xp;
import o.VD;
import o.VI;
import o.VK;
import o.XT;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements XT {
    private static final long serialVersionUID = 1;
    protected final Boolean _serializeAsIndex;
    protected final EnumValues _values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EnumValues getEnumValues() {
        return this._values;
    }

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.getEnumClass(), false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
    }

    public static EnumSerializer construct(Class<?> cls, SerializationConfig serializationConfig, AbstractC5549Vz abstractC5549Vz, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.constructFromName(serializationConfig, cls), _isShapeWrittenUsingIndex(cls, value, true, null));
    }

    @Override // o.XT
    public VD<?> createContextual(VI vi, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(vi, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            Boolean bool_isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(handledType(), valueFindFormatOverrides, false, this._serializeAsIndex);
            if (!Objects.equals(bool_isShapeWrittenUsingIndex, this._serializeAsIndex)) {
                return new EnumSerializer(this._values, bool_isShapeWrittenUsingIndex);
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Lcom/fasterxml/jackson/core/JsonGenerator;Lo/VI;)V */
    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public final void serialize(Enum<?> r2, JsonGenerator jsonGenerator, VI vi) throws IOException {
        if (_serializeAsIndex(vi)) {
            jsonGenerator.copydefault(r2.ordinal());
        } else if (vi.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.AhwBna(r2.toString());
        } else {
            jsonGenerator.EZpvd(this._values.serializedValueFor(r2));
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.InterfaceC5598Xw
    public JsonNode getSchema(VI vi, Type type) {
        if (_serializeAsIndex(vi)) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode("string", true);
        if (type != null && vi.constructType(type).isEnumType()) {
            ArrayNode arrayNodePutArray = objectNodeCreateSchemaNode.putArray("enum");
            Iterator<InterfaceC5501Ue> it = this._values.values().iterator();
            while (it.hasNext()) {
                arrayNodePutArray.add(it.next().getValue());
            }
        }
        return objectNodeCreateSchemaNode;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, o.VD
    public void acceptJsonFormatVisitor(InterfaceC5584Xi interfaceC5584Xi, JavaType javaType) throws JsonMappingException {
        VI viAEQbTJ = interfaceC5584Xi.AEQbTJ();
        if (_serializeAsIndex(viAEQbTJ)) {
            visitIntFormat(interfaceC5584Xi, javaType, JsonParser.NumberType.INT);
            return;
        }
        InterfaceC5591Xp interfaceC5591XpValueOf = interfaceC5584Xi.valueOf(javaType);
        if (interfaceC5591XpValueOf != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (viAEQbTJ != null && viAEQbTJ.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                Iterator<Enum<?>> it = this._values.enums().iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next().toString());
                }
            } else {
                Iterator<InterfaceC5501Ue> it2 = this._values.values().iterator();
                while (it2.hasNext()) {
                    linkedHashSet.add(it2.next().getValue());
                }
            }
            interfaceC5591XpValueOf.EZpvd(linkedHashSet);
        }
    }

    public final boolean _serializeAsIndex(VI vi) {
        Boolean bool = this._serializeAsIndex;
        if (bool != null) {
            return bool.booleanValue();
        }
        return vi.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    public static Boolean _isShapeWrittenUsingIndex(Class<?> cls, JsonFormat.Value value, boolean z, Boolean bool) {
        JsonFormat.Shape shape = value == null ? null : value.getShape();
        if (shape == null || shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        Object[] objArr = new Object[3];
        objArr[0] = shape;
        objArr[1] = cls.getName();
        objArr[2] = z ? "class" : "property";
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", objArr));
    }
}
