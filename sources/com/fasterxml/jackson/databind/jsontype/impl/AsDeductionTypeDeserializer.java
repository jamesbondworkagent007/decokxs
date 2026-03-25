package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.io.IOException;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import o.AbstractC5597Xv;
import o.C5619Yr;
import o.WT;
import o.XB;
import o.YA;

/* JADX INFO: loaded from: classes21.dex */
public class AsDeductionTypeDeserializer extends AsPropertyTypeDeserializer {
    private static final BitSet EMPTY_CLASS_FINGERPRINT = new BitSet(0);
    private static final long serialVersionUID = 1;
    private final Map<String, Integer> fieldBitIndex;
    private final Map<BitSet, String> subtypeFingerprints;

    public AsDeductionTypeDeserializer(JavaType javaType, XB xb, JavaType javaType2, DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        super(javaType, xb, null, false, javaType2, null);
        this.fieldBitIndex = new HashMap();
        this.subtypeFingerprints = buildFingerprints(deserializationConfig, collection);
    }

    public AsDeductionTypeDeserializer(AsDeductionTypeDeserializer asDeductionTypeDeserializer, BeanProperty beanProperty) {
        super(asDeductionTypeDeserializer, beanProperty);
        this.fieldBitIndex = asDeductionTypeDeserializer.fieldBitIndex;
        this.subtypeFingerprints = asDeductionTypeDeserializer.subtypeFingerprints;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, o.AbstractC5597Xv
    public AbstractC5597Xv forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsDeductionTypeDeserializer(this, beanProperty);
    }

    public Map<BitSet, String> buildFingerprints(DeserializationConfig deserializationConfig, Collection<NamedType> collection) {
        boolean zIsEnabled = deserializationConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map = new HashMap();
        int i = 0;
        for (NamedType namedType : collection) {
            List<WT> listIsConnected = deserializationConfig.introspect(deserializationConfig.getTypeFactory().constructType(namedType.getType())).isConnected();
            BitSet bitSet = new BitSet(listIsConnected.size() + i);
            Iterator<WT> it = listIsConnected.iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                if (zIsEnabled) {
                    name = name.toLowerCase();
                }
                Integer numValueOf = this.fieldBitIndex.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i);
                    this.fieldBitIndex.put(name, Integer.valueOf(i));
                    i++;
                }
                bitSet.set(numValueOf.intValue());
            }
            String str = (String) map.put(bitSet, namedType.getType().getName());
            if (str != null) {
                throw new IllegalStateException(String.format("Subtypes %s and %s have the same signature and cannot be uniquely deduced.", str, namedType.getType().getName()));
            }
        }
        return map;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, o.AbstractC5597Xv
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        } else if (jsonTokenDjBIcL != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, "Unexpected input");
        }
        if (jsonTokenDjBIcL == JsonToken.END_OBJECT && (str = this.subtypeFingerprints.get(EMPTY_CLASS_FINGERPRINT)) != null) {
            return _deserializeTypedForId(jsonParser, deserializationContext, null, str);
        }
        LinkedList linkedList = new LinkedList(this.subtypeFingerprints.keySet());
        YA yaBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            String strKWHzl = jsonParser.KWHzl();
            if (zIsEnabled) {
                strKWHzl = strKWHzl.toLowerCase();
            }
            yaBufferForInputBuffering.EZpvd(jsonParser);
            Integer num = this.fieldBitIndex.get(strKWHzl);
            if (num != null) {
                prune(linkedList, num.intValue());
                if (linkedList.size() == 1) {
                    return _deserializeTypedForId(jsonParser, deserializationContext, yaBufferForInputBuffering, this.subtypeFingerprints.get(linkedList.get(0)));
                }
            }
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, yaBufferForInputBuffering, String.format("Cannot deduce unique subtype of %s (%d candidates match)", C5619Yr.copydefault(this._baseType), Integer.valueOf(linkedList.size())));
    }

    private static void prune(List<BitSet> list, int i) {
        Iterator<BitSet> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().get(i)) {
                it.remove();
            }
        }
    }
}
