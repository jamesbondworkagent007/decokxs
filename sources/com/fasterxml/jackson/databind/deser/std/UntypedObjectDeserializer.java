package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5619Yr;
import o.C5626Yz;
import o.InterfaceC5554We;
import o.InterfaceC5557Wh;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class UntypedObjectDeserializer extends StdDeserializer<Object> implements InterfaceC5557Wh, InterfaceC5554We {
    protected static final Object[] NO_OBJECTS = new Object[0];
    private static final long serialVersionUID = 1;
    protected AbstractC5548Vy<Object> _listDeserializer;
    protected JavaType _listType;
    protected AbstractC5548Vy<Object> _mapDeserializer;
    protected JavaType _mapType;
    protected final boolean _nonMerging;
    protected AbstractC5548Vy<Object> _numberDeserializer;
    protected AbstractC5548Vy<Object> _stringDeserializer;

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return true;
    }

    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return null;
    }

    @Deprecated
    public UntypedObjectDeserializer() {
        this((JavaType) null, (JavaType) null);
    }

    public UntypedObjectDeserializer(JavaType javaType, JavaType javaType2) {
        super((Class<?>) Object.class);
        this._listType = javaType;
        this._mapType = javaType2;
        this._nonMerging = false;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, AbstractC5548Vy<?> abstractC5548Vy, AbstractC5548Vy<?> abstractC5548Vy2, AbstractC5548Vy<?> abstractC5548Vy3, AbstractC5548Vy<?> abstractC5548Vy4) {
        super((Class<?>) Object.class);
        this._mapDeserializer = abstractC5548Vy;
        this._listDeserializer = abstractC5548Vy2;
        this._stringDeserializer = abstractC5548Vy3;
        this._numberDeserializer = abstractC5548Vy4;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = untypedObjectDeserializer._nonMerging;
    }

    public UntypedObjectDeserializer(UntypedObjectDeserializer untypedObjectDeserializer, boolean z) {
        super((Class<?>) Object.class);
        this._mapDeserializer = untypedObjectDeserializer._mapDeserializer;
        this._listDeserializer = untypedObjectDeserializer._listDeserializer;
        this._stringDeserializer = untypedObjectDeserializer._stringDeserializer;
        this._numberDeserializer = untypedObjectDeserializer._numberDeserializer;
        this._listType = untypedObjectDeserializer._listType;
        this._mapType = untypedObjectDeserializer._mapType;
        this._nonMerging = z;
    }

    @Override // o.InterfaceC5557Wh
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType javaTypeConstructType = deserializationContext.constructType(Object.class);
        JavaType javaTypeConstructType2 = deserializationContext.constructType(String.class);
        TypeFactory typeFactory = deserializationContext.getTypeFactory();
        JavaType javaType = this._listType;
        if (javaType == null) {
            this._listDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructCollectionType(List.class, javaTypeConstructType)));
        } else {
            this._listDeserializer = _findCustomDeser(deserializationContext, javaType);
        }
        JavaType javaType2 = this._mapType;
        if (javaType2 == null) {
            this._mapDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructMapType(Map.class, javaTypeConstructType2, javaTypeConstructType)));
        } else {
            this._mapDeserializer = _findCustomDeser(deserializationContext, javaType2);
        }
        this._stringDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, javaTypeConstructType2));
        this._numberDeserializer = _clearIfStdImpl(_findCustomDeser(deserializationContext, typeFactory.constructType(Number.class)));
        JavaType javaTypeUnknownType = TypeFactory.unknownType();
        this._mapDeserializer = deserializationContext.handleSecondaryContextualization(this._mapDeserializer, null, javaTypeUnknownType);
        this._listDeserializer = deserializationContext.handleSecondaryContextualization(this._listDeserializer, null, javaTypeUnknownType);
        this._stringDeserializer = deserializationContext.handleSecondaryContextualization(this._stringDeserializer, null, javaTypeUnknownType);
        this._numberDeserializer = deserializationContext.handleSecondaryContextualization(this._numberDeserializer, null, javaTypeUnknownType);
    }

    public AbstractC5548Vy<Object> _findCustomDeser(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        return deserializationContext.findNonContextualValueDeserializer(javaType);
    }

    public AbstractC5548Vy<Object> _clearIfStdImpl(AbstractC5548Vy<Object> abstractC5548Vy) {
        if (C5619Yr.AEQbTJ(abstractC5548Vy)) {
            return null;
        }
        return abstractC5548Vy;
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        boolean z = beanProperty == null && Boolean.FALSE.equals(deserializationContext.getConfig().getDefaultMergeable(Object.class));
        if (this._stringDeserializer == null && this._numberDeserializer == null && this._mapDeserializer == null && this._listDeserializer == null && getClass() == UntypedObjectDeserializer.class) {
            return UntypedObjectDeserializerNR.instance(z);
        }
        return z != this._nonMerging ? new UntypedObjectDeserializer(this, z) : this;
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.valueOf()) {
            case 1:
            case 2:
            case 5:
                AbstractC5548Vy<Object> abstractC5548Vy = this._mapDeserializer;
                if (abstractC5548Vy != null) {
                    return abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                }
                return mapObject(jsonParser, deserializationContext);
            case 3:
                if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return mapArrayToArray(jsonParser, deserializationContext);
                }
                AbstractC5548Vy<Object> abstractC5548Vy2 = this._listDeserializer;
                if (abstractC5548Vy2 != null) {
                    return abstractC5548Vy2.deserialize(jsonParser, deserializationContext);
                }
                return mapArray(jsonParser, deserializationContext);
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            case 6:
                AbstractC5548Vy<Object> abstractC5548Vy3 = this._stringDeserializer;
                if (abstractC5548Vy3 != null) {
                    return abstractC5548Vy3.deserialize(jsonParser, deserializationContext);
                }
                return jsonParser.zLjUOn();
            case 7:
                AbstractC5548Vy<Object> abstractC5548Vy4 = this._numberDeserializer;
                if (abstractC5548Vy4 != null) {
                    return abstractC5548Vy4.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    return _coerceIntegral(jsonParser, deserializationContext);
                }
                return jsonParser.hDKMBd();
            case 8:
                AbstractC5548Vy<Object> abstractC5548Vy5 = this._numberDeserializer;
                if (abstractC5548Vy5 != null) {
                    return abstractC5548Vy5.deserialize(jsonParser, deserializationContext);
                }
                if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    return jsonParser.fJNWhG();
                }
                return jsonParser.hDKMBd();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jsonParser.AuCTel();
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        int iValueOf = jsonParser.valueOf();
        if (iValueOf != 1 && iValueOf != 3) {
            switch (iValueOf) {
                case 5:
                    break;
                case 6:
                    AbstractC5548Vy<Object> abstractC5548Vy = this._stringDeserializer;
                    if (abstractC5548Vy != null) {
                        return abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                    }
                    return jsonParser.zLjUOn();
                case 7:
                    AbstractC5548Vy<Object> abstractC5548Vy2 = this._numberDeserializer;
                    if (abstractC5548Vy2 != null) {
                        return abstractC5548Vy2.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.hDKMBd();
                case 8:
                    AbstractC5548Vy<Object> abstractC5548Vy3 = this._numberDeserializer;
                    if (abstractC5548Vy3 != null) {
                        return abstractC5548Vy3.deserialize(jsonParser, deserializationContext);
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.fJNWhG();
                    }
                    return jsonParser.hDKMBd();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.AuCTel();
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
            }
        }
        return abstractC5597Xv.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (this._nonMerging) {
            return deserialize(jsonParser, deserializationContext);
        }
        switch (jsonParser.valueOf()) {
            case 1:
            case 2:
            case 5:
                AbstractC5548Vy<Object> abstractC5548Vy = this._mapDeserializer;
                if (abstractC5548Vy == null) {
                    if (!(obj instanceof Map)) {
                    }
                }
                break;
            case 3:
                AbstractC5548Vy<Object> abstractC5548Vy2 = this._listDeserializer;
                if (abstractC5548Vy2 == null) {
                    if (!(obj instanceof Collection)) {
                        if (!deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        }
                    }
                }
                break;
            case 6:
                AbstractC5548Vy<Object> abstractC5548Vy3 = this._stringDeserializer;
                if (abstractC5548Vy3 == null) {
                }
                break;
            case 7:
                AbstractC5548Vy<Object> abstractC5548Vy4 = this._numberDeserializer;
                if (abstractC5548Vy4 == null) {
                    if (!deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                    }
                }
                break;
            case 8:
                AbstractC5548Vy<Object> abstractC5548Vy5 = this._numberDeserializer;
                if (abstractC5548Vy5 == null) {
                    if (!deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    }
                }
                break;
        }
        return deserialize(jsonParser, deserializationContext);
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
        JsonToken jsonToken = JsonToken.END_ARRAY;
        int i = 2;
        if (jsonTokenRcXXUw == jsonToken) {
            return new ArrayList(2);
        }
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        if (jsonParser.RcXXUw() == jsonToken) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objDeserialize);
            return arrayList;
        }
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        if (jsonParser.RcXXUw() == jsonToken) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objDeserialize);
            arrayList2.add(objDeserialize2);
            return arrayList2;
        }
        C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrOLrzqt = c5626YzLeaseObjectBuffer.OLrzqt();
        objArrOLrzqt[0] = objDeserialize;
        objArrOLrzqt[1] = objDeserialize2;
        int i2 = 2;
        while (true) {
            Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
            i++;
            if (i2 >= objArrOLrzqt.length) {
                objArrOLrzqt = c5626YzLeaseObjectBuffer.AEQbTJ(objArrOLrzqt);
                i2 = 0;
            }
            int i3 = i2 + 1;
            objArrOLrzqt[i2] = objDeserialize3;
            if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i);
                c5626YzLeaseObjectBuffer.OLrzqt(objArrOLrzqt, i3, arrayList3);
                deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
                return arrayList3;
            }
            i2 = i3;
        }
    }

    public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        while (jsonParser.RcXXUw() != JsonToken.END_ARRAY) {
            collection.add(deserialize(jsonParser, deserializationContext));
        }
        return collection;
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strKWHzl;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
            strKWHzl = jsonParser.QbewEr();
        } else if (jsonTokenDjBIcL == JsonToken.FIELD_NAME) {
            strKWHzl = jsonParser.KWHzl();
        } else {
            if (jsonTokenDjBIcL != JsonToken.END_OBJECT) {
                return deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
            }
            strKWHzl = null;
        }
        String str = strKWHzl;
        if (str == null) {
            return new LinkedHashMap(2);
        }
        jsonParser.RcXXUw();
        Object objDeserialize = deserialize(jsonParser, deserializationContext);
        String strQbewEr = jsonParser.QbewEr();
        if (strQbewEr == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, objDeserialize);
            return linkedHashMap;
        }
        jsonParser.RcXXUw();
        Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
        String strQbewEr2 = jsonParser.QbewEr();
        if (strQbewEr2 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, objDeserialize);
            return linkedHashMap2.put(strQbewEr, objDeserialize2) != null ? _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, str, objDeserialize, objDeserialize2, strQbewEr2) : linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, objDeserialize);
        if (linkedHashMap3.put(strQbewEr, objDeserialize2) != null) {
            return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, str, objDeserialize, objDeserialize2, strQbewEr2);
        }
        do {
            jsonParser.RcXXUw();
            Object objDeserialize3 = deserialize(jsonParser, deserializationContext);
            Object objPut = linkedHashMap3.put(strQbewEr2, objDeserialize3);
            if (objPut != null) {
                return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap3, strQbewEr2, objPut, objDeserialize3, jsonParser.QbewEr());
            }
            strQbewEr2 = jsonParser.QbewEr();
        } while (strQbewEr2 != null);
        return linkedHashMap3;
    }

    public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
        boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
        if (zIsEnabled) {
            _squashDups(map, str, obj, obj2);
        }
        while (str2 != null) {
            jsonParser.RcXXUw();
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            Object objPut = map.put(str2, objDeserialize);
            if (objPut != null && zIsEnabled) {
                _squashDups(map, str, objPut, objDeserialize);
            }
            str2 = jsonParser.QbewEr();
        }
        return map;
    }

    private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }
    }

    public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
            return NO_OBJECTS;
        }
        C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] objArrOLrzqt = c5626YzLeaseObjectBuffer.OLrzqt();
        int i = 0;
        while (true) {
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            if (i >= objArrOLrzqt.length) {
                objArrOLrzqt = c5626YzLeaseObjectBuffer.AEQbTJ(objArrOLrzqt);
                i = 0;
            }
            int i2 = i + 1;
            objArrOLrzqt[i] = objDeserialize;
            if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
                Object[] objArrEZpvd = c5626YzLeaseObjectBuffer.EZpvd(objArrOLrzqt, i2);
                deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
                return objArrEZpvd;
            }
            i = i2;
        }
    }

    public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        Object objDeserialize;
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == JsonToken.START_OBJECT) {
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        }
        if (jsonTokenDjBIcL == JsonToken.END_OBJECT) {
            return map;
        }
        String strKWHzl = jsonParser.KWHzl();
        do {
            jsonParser.RcXXUw();
            Object obj = map.get(strKWHzl);
            if (obj != null) {
                objDeserialize = deserialize(jsonParser, deserializationContext, obj);
            } else {
                objDeserialize = deserialize(jsonParser, deserializationContext);
            }
            if (objDeserialize != obj) {
                map.put(strKWHzl, objDeserialize);
            }
            strKWHzl = jsonParser.QbewEr();
        } while (strKWHzl != null);
        return map;
    }

    @VK
    @Deprecated
    public static class Vanilla extends StdDeserializer<Object> {
        private static final long serialVersionUID = 1;
        public static final Vanilla std = new Vanilla();
        protected final boolean _nonMerging;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC5548Vy
        public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
            if (this._nonMerging) {
                return Boolean.FALSE;
            }
            return null;
        }

        public Vanilla() {
            this(false);
        }

        public Vanilla(boolean z) {
            super((Class<?>) Object.class);
            this._nonMerging = z;
        }

        public static Vanilla instance(boolean z) {
            return z ? new Vanilla(true) : std;
        }

        @Override // o.AbstractC5548Vy
        public LogicalType logicalType() {
            return LogicalType.Untyped;
        }

        @Override // o.AbstractC5548Vy
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            switch (jsonParser.valueOf()) {
                case 1:
                    if (jsonParser.RcXXUw() == JsonToken.END_OBJECT) {
                        return new LinkedHashMap(2);
                    }
                    break;
                case 2:
                    return new LinkedHashMap(2);
                case 3:
                    if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                            return UntypedObjectDeserializer.NO_OBJECTS;
                        }
                        return new ArrayList(2);
                    }
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        return mapArrayToArray(jsonParser, deserializationContext);
                    }
                    return mapArray(jsonParser, deserializationContext);
                case 4:
                default:
                    return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                case 5:
                    break;
                case 6:
                    return jsonParser.zLjUOn();
                case 7:
                    if (deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS)) {
                        return _coerceIntegral(jsonParser, deserializationContext);
                    }
                    return jsonParser.hDKMBd();
                case 8:
                    if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                        return jsonParser.fJNWhG();
                    }
                    return jsonParser.hDKMBd();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jsonParser.AuCTel();
            }
            return mapObject(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
        public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
            int iValueOf = jsonParser.valueOf();
            if (iValueOf != 1 && iValueOf != 3) {
                switch (iValueOf) {
                    case 5:
                        break;
                    case 6:
                        return jsonParser.zLjUOn();
                    case 7:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS)) {
                            return jsonParser.gEmmrt();
                        }
                        return jsonParser.hDKMBd();
                    case 8:
                        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
                            return jsonParser.fJNWhG();
                        }
                        return jsonParser.hDKMBd();
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    case 12:
                        return jsonParser.AuCTel();
                    default:
                        return deserializationContext.handleUnexpectedToken(Object.class, jsonParser);
                }
            }
            return abstractC5597Xv.deserializeTypedFromAny(jsonParser, deserializationContext);
        }

        @Override // o.AbstractC5548Vy
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            Object objDeserialize;
            if (this._nonMerging) {
                return deserialize(jsonParser, deserializationContext);
            }
            int iValueOf = jsonParser.valueOf();
            if (iValueOf != 1) {
                if (iValueOf != 2) {
                    if (iValueOf == 3) {
                        if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
                            return obj;
                        }
                        if (obj instanceof Collection) {
                            Collection collection = (Collection) obj;
                            do {
                                collection.add(deserialize(jsonParser, deserializationContext));
                            } while (jsonParser.RcXXUw() != JsonToken.END_ARRAY);
                        }
                        return deserialize(jsonParser, deserializationContext);
                    }
                    if (iValueOf != 4) {
                        if (iValueOf == 5) {
                        }
                        return deserialize(jsonParser, deserializationContext);
                    }
                }
                return obj;
            }
            if (jsonParser.RcXXUw() == JsonToken.END_OBJECT) {
                return obj;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                String strKWHzl = jsonParser.KWHzl();
                do {
                    jsonParser.RcXXUw();
                    Object obj2 = map.get(strKWHzl);
                    if (obj2 != null) {
                        objDeserialize = deserialize(jsonParser, deserializationContext, obj2);
                    } else {
                        objDeserialize = deserialize(jsonParser, deserializationContext);
                    }
                    if (objDeserialize != obj2) {
                        map.put(strKWHzl, objDeserialize);
                    }
                    strKWHzl = jsonParser.QbewEr();
                } while (strKWHzl != null);
                return obj;
            }
            return deserialize(jsonParser, deserializationContext);
        }

        public Object mapArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(objDeserialize);
                return arrayList;
            }
            C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrOLrzqt = c5626YzLeaseObjectBuffer.OLrzqt();
            objArrOLrzqt[0] = objDeserialize;
            int i = 1;
            int i2 = 1;
            while (true) {
                Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
                i++;
                if (i2 >= objArrOLrzqt.length) {
                    objArrOLrzqt = c5626YzLeaseObjectBuffer.AEQbTJ(objArrOLrzqt);
                    i2 = 0;
                }
                int i3 = i2 + 1;
                objArrOLrzqt[i2] = objDeserialize2;
                if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
                    ArrayList arrayList2 = new ArrayList(i);
                    c5626YzLeaseObjectBuffer.OLrzqt(objArrOLrzqt, i3, arrayList2);
                    deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
                    return arrayList2;
                }
                i2 = i3;
            }
        }

        public Object[] mapArrayToArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            C5626Yz c5626YzLeaseObjectBuffer = deserializationContext.leaseObjectBuffer();
            Object[] objArrOLrzqt = c5626YzLeaseObjectBuffer.OLrzqt();
            int i = 0;
            while (true) {
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                if (i >= objArrOLrzqt.length) {
                    objArrOLrzqt = c5626YzLeaseObjectBuffer.AEQbTJ(objArrOLrzqt);
                    i = 0;
                }
                int i2 = i + 1;
                objArrOLrzqt[i] = objDeserialize;
                if (jsonParser.RcXXUw() == JsonToken.END_ARRAY) {
                    Object[] objArrEZpvd = c5626YzLeaseObjectBuffer.EZpvd(objArrOLrzqt, i2);
                    deserializationContext.returnObjectBuffer(c5626YzLeaseObjectBuffer);
                    return objArrEZpvd;
                }
                i = i2;
            }
        }

        public Object mapObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strKWHzl = jsonParser.KWHzl();
            jsonParser.RcXXUw();
            Object objDeserialize = deserialize(jsonParser, deserializationContext);
            String strQbewEr = jsonParser.QbewEr();
            if (strQbewEr == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                linkedHashMap.put(strKWHzl, objDeserialize);
                return linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(strKWHzl, objDeserialize);
            String strQbewEr2 = strQbewEr;
            do {
                jsonParser.RcXXUw();
                Object objDeserialize2 = deserialize(jsonParser, deserializationContext);
                Object objPut = linkedHashMap2.put(strQbewEr2, objDeserialize2);
                if (objPut != null) {
                    return _mapObjectWithDups(jsonParser, deserializationContext, linkedHashMap2, strQbewEr2, objPut, objDeserialize2, jsonParser.QbewEr());
                }
                strQbewEr2 = jsonParser.QbewEr();
            } while (strQbewEr2 != null);
            return linkedHashMap2;
        }

        public Object _mapObjectWithDups(JsonParser jsonParser, DeserializationContext deserializationContext, Map<String, Object> map, String str, Object obj, Object obj2, String str2) throws IOException {
            boolean zIsEnabled = deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES);
            if (zIsEnabled) {
                _squashDups(map, str, obj, obj2);
            }
            while (str2 != null) {
                jsonParser.RcXXUw();
                Object objDeserialize = deserialize(jsonParser, deserializationContext);
                Object objPut = map.put(str2, objDeserialize);
                if (objPut != null && zIsEnabled) {
                    _squashDups(map, str2, objPut, objDeserialize);
                }
                str2 = jsonParser.QbewEr();
            }
            return map;
        }

        private void _squashDups(Map<String, Object> map, String str, Object obj, Object obj2) {
            if (obj instanceof List) {
                ((List) obj).add(obj2);
                map.put(str, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                arrayList.add(obj2);
                map.put(str, arrayList);
            }
        }
    }
}
