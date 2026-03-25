package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import o.AbstractC5601Xz;
import o.AbstractC5604Yc;
import o.InterfaceC5501Ue;
import o.InterfaceC5584Xi;
import o.InterfaceC5593Xr;
import o.VD;
import o.VI;

/* JADX INFO: loaded from: classes21.dex */
public class UnwrappingBeanPropertyWriter extends BeanPropertyWriter implements Serializable {
    private static final long serialVersionUID = 1;
    protected final NameTransformer _nameTransformer;

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public boolean isUnwrapping() {
        return true;
    }

    public UnwrappingBeanPropertyWriter(BeanPropertyWriter beanPropertyWriter, NameTransformer nameTransformer) {
        super(beanPropertyWriter);
        this._nameTransformer = nameTransformer;
    }

    public UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter unwrappingBeanPropertyWriter, NameTransformer nameTransformer, SerializedString serializedString) {
        super(unwrappingBeanPropertyWriter, serializedString);
        this._nameTransformer = nameTransformer;
    }

    /* JADX DEBUG: Method merged with bridge method: rename(Lcom/fasterxml/jackson/databind/util/NameTransformer;)Lcom/fasterxml/jackson/databind/ser/BeanPropertyWriter; */
    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public UnwrappingBeanPropertyWriter rename(NameTransformer nameTransformer) {
        return _new(NameTransformer.chainedTransformer(nameTransformer, this._nameTransformer), new SerializedString(nameTransformer.transform(this._name.getValue())));
    }

    public UnwrappingBeanPropertyWriter _new(NameTransformer nameTransformer, SerializedString serializedString) {
        return new UnwrappingBeanPropertyWriter(this, nameTransformer, serializedString);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi) throws Exception {
        Object obj2 = get(obj);
        if (obj2 == null) {
            return;
        }
        VD<?> vd_findAndAddDynamic = this._serializer;
        if (vd_findAndAddDynamic == null) {
            Class<?> cls = obj2.getClass();
            AbstractC5604Yc abstractC5604Yc = this._dynamicSerializers;
            VD<?> vdAEQbTJ = abstractC5604Yc.AEQbTJ(cls);
            vd_findAndAddDynamic = vdAEQbTJ == null ? _findAndAddDynamic(abstractC5604Yc, cls, vi) : vdAEQbTJ;
        }
        Object obj3 = this._suppressableValue;
        if (obj3 != null) {
            if (BeanPropertyWriter.MARKER_FOR_EMPTY == obj3) {
                if (vd_findAndAddDynamic.isEmpty(vi, obj2)) {
                    return;
                }
            } else if (obj3.equals(obj2)) {
                return;
            }
        }
        if (obj2 == obj && _handleSelfReference(obj, jsonGenerator, vi, vd_findAndAddDynamic)) {
            return;
        }
        if (!vd_findAndAddDynamic.isUnwrappingSerializer()) {
            jsonGenerator.copydefault((InterfaceC5501Ue) this._name);
        }
        AbstractC5601Xz abstractC5601Xz = this._typeSerializer;
        if (abstractC5601Xz == null) {
            vd_findAndAddDynamic.serialize(obj2, jsonGenerator, vi);
        } else {
            vd_findAndAddDynamic.serializeWithType(obj2, jsonGenerator, vi, abstractC5601Xz);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void assignSerializer(VD<Object> vd) {
        if (vd != null) {
            NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
            if (vd.isUnwrappingSerializer() && (vd instanceof UnwrappingBeanSerializer)) {
                nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) vd)._nameTransformer);
            }
            vd = vd.unwrappingSerializer(nameTransformerChainedTransformer);
        }
        super.assignSerializer(vd);
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter, com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(final InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
        VD<Object> vdUnwrappingSerializer = vi.findValueSerializer(getType(), this).unwrappingSerializer(this._nameTransformer);
        if (vdUnwrappingSerializer.isUnwrappingSerializer()) {
            vdUnwrappingSerializer.acceptJsonFormatVisitor(new InterfaceC5584Xi.StateListAnimator(vi) { // from class: com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanPropertyWriter.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC5584Xi.StateListAnimator, o.InterfaceC5584Xi
                public InterfaceC5593Xr djBIcL(JavaType javaType) throws JsonMappingException {
                    return interfaceC5593Xr;
                }
            }, getType());
        } else {
            super.depositSchemaProperty(interfaceC5593Xr, vi);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public void _depositSchemaProperty(ObjectNode objectNode, JsonNode jsonNode) {
        JsonNode jsonNodeMo6123get = jsonNode.mo6123get("properties");
        if (jsonNodeMo6123get != null) {
            Iterator<Map.Entry<String, JsonNode>> itFields = jsonNodeMo6123get.fields();
            while (itFields.hasNext()) {
                Map.Entry<String, JsonNode> next = itFields.next();
                String key = next.getKey();
                NameTransformer nameTransformer = this._nameTransformer;
                if (nameTransformer != null) {
                    key = nameTransformer.transform(key);
                }
                objectNode.set(key, next.getValue());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
    public VD<Object> _findAndAddDynamic(AbstractC5604Yc abstractC5604Yc, Class<?> cls, VI vi) throws JsonMappingException {
        VD<Object> vdFindValueSerializer;
        JavaType javaType = this._nonTrivialBaseType;
        if (javaType != null) {
            vdFindValueSerializer = vi.findValueSerializer(vi.constructSpecializedType(javaType, cls), this);
        } else {
            vdFindValueSerializer = vi.findValueSerializer(cls, this);
        }
        NameTransformer nameTransformerChainedTransformer = this._nameTransformer;
        if (vdFindValueSerializer.isUnwrappingSerializer() && (vdFindValueSerializer instanceof UnwrappingBeanSerializer)) {
            nameTransformerChainedTransformer = NameTransformer.chainedTransformer(nameTransformerChainedTransformer, ((UnwrappingBeanSerializer) vdFindValueSerializer)._nameTransformer);
        }
        VD<Object> vdUnwrappingSerializer = vdFindValueSerializer.unwrappingSerializer(nameTransformerChainedTransformer);
        this._dynamicSerializers = this._dynamicSerializers.AEQbTJ(cls, vdUnwrappingSerializer);
        return vdUnwrappingSerializer;
    }
}
