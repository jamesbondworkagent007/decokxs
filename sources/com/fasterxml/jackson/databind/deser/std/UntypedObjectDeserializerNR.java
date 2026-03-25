package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.AbstractC5597Xv;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
final class UntypedObjectDeserializerNR extends StdDeserializer<Object> {
    private static final long serialVersionUID = 1;
    protected final boolean _nonMerging;
    protected static final Object[] NO_OBJECTS = new Object[0];
    public static final UntypedObjectDeserializerNR std = new UntypedObjectDeserializerNR();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        if (this._nonMerging) {
            return Boolean.FALSE;
        }
        return null;
    }

    public UntypedObjectDeserializerNR() {
        this(false);
    }

    public UntypedObjectDeserializerNR(boolean z) {
        super((Class<?>) Object.class);
        this._nonMerging = z;
    }

    public static UntypedObjectDeserializerNR instance(boolean z) {
        return z ? new UntypedObjectDeserializerNR(true) : std;
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // o.AbstractC5548Vy
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        switch (jsonParser.valueOf()) {
            case 1:
                return _deserializeNR(jsonParser, deserializationContext, Application.OLrzqt(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)));
            case 2:
                return Application.copydefault();
            case 3:
                return _deserializeNR(jsonParser, deserializationContext, Application.KWHzl());
            case 4:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 5:
                return _deserializeObjectAtName(jsonParser, deserializationContext);
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
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        int iValueOf = jsonParser.valueOf();
        if (iValueOf == 1 || iValueOf == 3 || iValueOf == 5) {
            return abstractC5597Xv.deserializeTypedFromAny(jsonParser, deserializationContext);
        }
        return _deserializeAnyScalar(jsonParser, deserializationContext, jsonParser.valueOf());
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

    private Object _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj_deserializeNR;
        Application applicationOLrzqt = Application.OLrzqt(deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES));
        String strKWHzl = jsonParser.KWHzl();
        while (strKWHzl != null) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == null) {
                jsonTokenRcXXUw = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenRcXXUw.id();
            if (iId == 1) {
                obj_deserializeNR = _deserializeNR(jsonParser, deserializationContext, applicationOLrzqt.AEQbTJ());
            } else {
                if (iId == 2) {
                    return applicationOLrzqt.gEmmrt();
                }
                if (iId == 3) {
                    obj_deserializeNR = _deserializeNR(jsonParser, deserializationContext, applicationOLrzqt.EZpvd());
                } else {
                    obj_deserializeNR = _deserializeAnyScalar(jsonParser, deserializationContext, jsonTokenRcXXUw.id());
                }
            }
            applicationOLrzqt.AEQbTJ(strKWHzl, obj_deserializeNR);
            strKWHzl = jsonParser.QbewEr();
        }
        return applicationOLrzqt.gEmmrt();
    }

    private Object _deserializeNR(JsonParser jsonParser, DeserializationContext deserializationContext, Application application) throws IOException {
        Object objZLjUOn;
        Object objZLjUOn2;
        boolean zHasSomeOfFeatures = deserializationContext.hasSomeOfFeatures(StdDeserializer.F_MASK_INT_COERCIONS);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Application applicationAYXKKw = application;
        while (true) {
            if (applicationAYXKKw.AhwBna()) {
                String strQbewEr = jsonParser.QbewEr();
                while (true) {
                    if (strQbewEr != null) {
                        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                        if (jsonTokenRcXXUw == null) {
                            jsonTokenRcXXUw = JsonToken.NOT_AVAILABLE;
                        }
                        int iId = jsonTokenRcXXUw.id();
                        if (iId == 1) {
                            applicationAYXKKw = applicationAYXKKw.copydefault(strQbewEr);
                        } else if (iId == 3) {
                            applicationAYXKKw = applicationAYXKKw.OLrzqt(strQbewEr);
                        } else {
                            switch (iId) {
                                case 6:
                                    objZLjUOn = jsonParser.zLjUOn();
                                    break;
                                case 7:
                                    objZLjUOn = !zHasSomeOfFeatures ? jsonParser.hDKMBd() : _coerceIntegral(jsonParser, deserializationContext);
                                    break;
                                case 8:
                                    objZLjUOn = !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.hDKMBd() : jsonParser.fJNWhG();
                                    break;
                                case 9:
                                    objZLjUOn = Boolean.TRUE;
                                    break;
                                case 10:
                                    objZLjUOn = Boolean.FALSE;
                                    break;
                                case 11:
                                    objZLjUOn = null;
                                    break;
                                case 12:
                                    objZLjUOn = jsonParser.AuCTel();
                                    break;
                                default:
                                    return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                            }
                            applicationAYXKKw.AEQbTJ(strQbewEr, objZLjUOn);
                        }
                        strQbewEr = jsonParser.QbewEr();
                    } else {
                        if (applicationAYXKKw == application) {
                            return applicationAYXKKw.gEmmrt();
                        }
                        applicationAYXKKw = applicationAYXKKw.AYXKKw();
                    }
                }
            } else {
                while (true) {
                    JsonToken jsonTokenRcXXUw2 = jsonParser.RcXXUw();
                    if (jsonTokenRcXXUw2 == null) {
                        jsonTokenRcXXUw2 = JsonToken.NOT_AVAILABLE;
                    }
                    switch (jsonTokenRcXXUw2.id()) {
                        case 1:
                            applicationAYXKKw = applicationAYXKKw.AEQbTJ();
                            continue;
                        case 2:
                        case 5:
                        default:
                            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                        case 3:
                            applicationAYXKKw = applicationAYXKKw.EZpvd();
                            continue;
                        case 4:
                            if (applicationAYXKKw == application) {
                                return applicationAYXKKw.EZpvd(zIsEnabled);
                            }
                            applicationAYXKKw = applicationAYXKKw.copydefault(zIsEnabled);
                            continue;
                            break;
                        case 6:
                            objZLjUOn2 = jsonParser.zLjUOn();
                            break;
                        case 7:
                            objZLjUOn2 = !zHasSomeOfFeatures ? jsonParser.hDKMBd() : _coerceIntegral(jsonParser, deserializationContext);
                            break;
                        case 8:
                            objZLjUOn2 = !deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.hDKMBd() : jsonParser.fJNWhG();
                            break;
                        case 9:
                            objZLjUOn2 = Boolean.TRUE;
                            break;
                        case 10:
                            objZLjUOn2 = Boolean.FALSE;
                            break;
                        case 11:
                            objZLjUOn2 = null;
                            break;
                        case 12:
                            objZLjUOn2 = jsonParser.AuCTel();
                            break;
                    }
                    applicationAYXKKw.OLrzqt(objZLjUOn2);
                }
            }
        }
    }

    private Object _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext, int i) throws IOException {
        switch (i) {
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
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
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

    public static final class Application {
        public Application AEQbTJ;
        public boolean AhwBna;
        public String EZpvd;
        public boolean KWHzl;
        public List<Object> OLrzqt;
        public Map<String, Object> copydefault;
        public final Application gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(boolean z) {
            this.KWHzl = true;
            this.AhwBna = z;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application djBIcL() {
            this.KWHzl = false;
            return this;
        }

        public Application(Application application) {
            this.gEmmrt = application;
            this.KWHzl = false;
            this.AhwBna = false;
        }

        public Application(Application application, boolean z, boolean z2) {
            this.gEmmrt = application;
            this.KWHzl = z;
            this.AhwBna = z2;
        }

        public static Application OLrzqt(boolean z) {
            return new Application(null, true, z);
        }

        public static Application KWHzl() {
            return new Application(null);
        }

        public Application AEQbTJ() {
            Application application = this.AEQbTJ;
            if (application == null) {
                return new Application(this, true, this.AhwBna);
            }
            return application.KWHzl(this.AhwBna);
        }

        public Application copydefault(String str) {
            this.EZpvd = str;
            Application application = this.AEQbTJ;
            if (application == null) {
                return new Application(this, true, this.AhwBna);
            }
            return application.KWHzl(this.AhwBna);
        }

        public Application EZpvd() {
            Application application = this.AEQbTJ;
            if (application == null) {
                return new Application(this);
            }
            return application.djBIcL();
        }

        public Application OLrzqt(String str) {
            this.EZpvd = str;
            Application application = this.AEQbTJ;
            if (application == null) {
                return new Application(this);
            }
            return application.djBIcL();
        }

        public void AEQbTJ(String str, Object obj) {
            if (this.AhwBna) {
                KWHzl(str, obj);
                return;
            }
            if (this.copydefault == null) {
                this.copydefault = new LinkedHashMap();
            }
            this.copydefault.put(str, obj);
        }

        public Application copydefault(Object obj) {
            String str = this.EZpvd;
            Objects.requireNonNull(str);
            this.EZpvd = null;
            if (this.AhwBna) {
                KWHzl(str, obj);
                return this;
            }
            if (this.copydefault == null) {
                this.copydefault = new LinkedHashMap();
            }
            this.copydefault.put(str, obj);
            return this;
        }

        public void OLrzqt(Object obj) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new ArrayList();
            }
            this.OLrzqt.add(obj);
        }

        public Object gEmmrt() {
            Map<String, Object> map = this.copydefault;
            return map == null ? copydefault() : map;
        }

        public Application AYXKKw() {
            Object linkedHashMap = this.copydefault;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                this.copydefault = null;
            }
            if (this.gEmmrt.AhwBna()) {
                return this.gEmmrt.copydefault(linkedHashMap);
            }
            this.gEmmrt.OLrzqt(linkedHashMap);
            return this.gEmmrt;
        }

        public Object EZpvd(boolean z) {
            List<Object> list = this.OLrzqt;
            if (list != null) {
                return z ? list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS) : list;
            }
            if (z) {
                return UntypedObjectDeserializerNR.NO_OBJECTS;
            }
            return OLrzqt();
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public Application copydefault(boolean z) {
            Object objOLrzqt;
            List<Object> list = this.OLrzqt;
            Object array = list;
            if (list != null) {
                if (z) {
                    array = list.toArray(UntypedObjectDeserializerNR.NO_OBJECTS);
                }
                this.OLrzqt = null;
                objOLrzqt = array;
            } else if (z) {
                objOLrzqt = UntypedObjectDeserializerNR.NO_OBJECTS;
            } else {
                objOLrzqt = OLrzqt();
            }
            if (this.gEmmrt.AhwBna()) {
                return this.gEmmrt.copydefault(objOLrzqt);
            }
            this.gEmmrt.OLrzqt(objOLrzqt);
            return this.gEmmrt;
        }

        public final void KWHzl(String str, Object obj) {
            Map<String, Object> map = this.copydefault;
            if (map == null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                this.copydefault = linkedHashMap;
                linkedHashMap.put(str, obj);
                return;
            }
            Object objPut = map.put(str, obj);
            if (objPut != null) {
                if (objPut instanceof List) {
                    ((List) objPut).add(obj);
                    this.copydefault.put(str, objPut);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(objPut);
                    arrayList.add(obj);
                    this.copydefault.put(str, arrayList);
                }
            }
        }

        public static Map<String, Object> copydefault() {
            return new LinkedHashMap(2);
        }

        public static List<Object> OLrzqt() {
            return new ArrayList(2);
        }
    }
}
