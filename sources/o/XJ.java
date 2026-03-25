package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsDeductionTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes21.dex */
public class XJ implements InterfaceC5599Xx<XJ> {
    protected XB _customIdResolver;
    public java.lang.Class<?> _defaultImpl;
    protected JsonTypeInfo.Id _idType;
    protected JsonTypeInfo.As _includeAs;
    protected boolean _typeIdVisible;
    protected java.lang.String _typeProperty;

    public boolean allowPrimitiveTypes(MapperConfig<?> mapperConfig, JavaType javaType) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5599Xx
    public XJ defaultImpl(java.lang.Class<?> cls) {
        this._defaultImpl = cls;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5599Xx
    public java.lang.Class<?> getDefaultImpl() {
        return this._defaultImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String getTypeProperty() {
        return this._typeProperty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isTypeIdVisible() {
        return this._typeIdVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: typeIdVisibility(Z)Lo/Xx; */
    @Override // o.InterfaceC5599Xx
    public XJ typeIdVisibility(boolean z) {
        this._typeIdVisible = z;
        return this;
    }

    @Override // o.InterfaceC5599Xx
    public /* bridge */ /* synthetic */ InterfaceC5599Xx defaultImpl(java.lang.Class cls) {
        return defaultImpl((java.lang.Class<?>) cls);
    }

    @Override // o.InterfaceC5599Xx
    public /* bridge */ /* synthetic */ InterfaceC5599Xx withDefaultImpl(java.lang.Class cls) {
        return withDefaultImpl((java.lang.Class<?>) cls);
    }

    public XJ() {
        this._typeIdVisible = false;
    }

    public XJ(JsonTypeInfo.Id id, JsonTypeInfo.As as, java.lang.String str) {
        this._typeIdVisible = false;
        this._idType = id;
        this._includeAs = as;
        this._typeProperty = str;
    }

    public XJ(XJ xj, java.lang.Class<?> cls) {
        this._typeIdVisible = false;
        this._idType = xj._idType;
        this._includeAs = xj._includeAs;
        this._typeProperty = xj._typeProperty;
        this._typeIdVisible = xj._typeIdVisible;
        this._customIdResolver = xj._customIdResolver;
        this._defaultImpl = cls;
    }

    public static XJ noTypeInfoBuilder() {
        return new XJ().init(JsonTypeInfo.Id.NONE, (XB) null);
    }

    /* JADX DEBUG: Method merged with bridge method: init(Lcom/fasterxml/jackson/annotation/JsonTypeInfo$Id;Lo/XB;)Lo/Xx; */
    @Override // o.InterfaceC5599Xx
    public XJ init(JsonTypeInfo.Id id, XB xb) {
        if (id == null) {
            throw new java.lang.IllegalArgumentException("idType cannot be null");
        }
        this._idType = id;
        this._customIdResolver = xb;
        this._typeProperty = id.getDefaultPropertyName();
        return this;
    }

    @Override // o.InterfaceC5599Xx
    public AbstractC5601Xz buildTypeSerializer(SerializationConfig serializationConfig, JavaType javaType, java.util.Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(serializationConfig, javaType)) {
            return null;
        }
        if (this._idType == JsonTypeInfo.Id.DEDUCTION) {
            return XA.KWHzl();
        }
        XB xbIdResolver = idResolver(serializationConfig, javaType, subTypeValidator(serializationConfig), collection, true, false);
        int i = AnonymousClass1.KWHzl[this._includeAs.ordinal()];
        if (i == 1) {
            return new C5600Xy(xbIdResolver, null);
        }
        if (i == 2) {
            return new XF(xbIdResolver, null, this._typeProperty);
        }
        if (i == 3) {
            return new XE(xbIdResolver, null);
        }
        if (i == 4) {
            return new XC(xbIdResolver, null, this._typeProperty);
        }
        if (i == 5) {
            return new XG(xbIdResolver, null, this._typeProperty);
        }
        throw new java.lang.IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
    }

    @Override // o.InterfaceC5599Xx
    public AbstractC5597Xv buildTypeDeserializer(DeserializationConfig deserializationConfig, JavaType javaType, java.util.Collection<NamedType> collection) {
        if (this._idType == JsonTypeInfo.Id.NONE) {
            return null;
        }
        if (javaType.isPrimitive() && !allowPrimitiveTypes(deserializationConfig, javaType)) {
            return null;
        }
        XB xbIdResolver = idResolver(deserializationConfig, javaType, verifyBaseTypeValidity(deserializationConfig, javaType), collection, false, true);
        JavaType javaTypeDefineDefaultImpl = defineDefaultImpl(deserializationConfig, javaType);
        if (this._idType == JsonTypeInfo.Id.DEDUCTION) {
            return new AsDeductionTypeDeserializer(javaType, xbIdResolver, javaTypeDefineDefaultImpl, deserializationConfig, collection);
        }
        int i = AnonymousClass1.KWHzl[this._includeAs.ordinal()];
        if (i == 1) {
            return new AsArrayTypeDeserializer(javaType, xbIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
        }
        if (i != 2) {
            if (i == 3) {
                return new AsWrapperTypeDeserializer(javaType, xbIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i == 4) {
                return new AsExternalTypeDeserializer(javaType, xbIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl);
            }
            if (i != 5) {
                throw new java.lang.IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this._includeAs);
            }
        }
        return new AsPropertyTypeDeserializer(javaType, xbIdResolver, this._typeProperty, this._typeIdVisible, javaTypeDefineDefaultImpl, this._includeAs);
    }

    public JavaType defineDefaultImpl(DeserializationConfig deserializationConfig, JavaType javaType) {
        java.lang.Class<?> cls = this._defaultImpl;
        if (cls != null) {
            if (cls == java.lang.Void.class || cls == VR.class) {
                return deserializationConfig.getTypeFactory().constructType(this._defaultImpl);
            }
            if (javaType.hasRawClass(cls)) {
                return javaType;
            }
            if (javaType.isTypeOrSuperTypeOf(this._defaultImpl)) {
                return deserializationConfig.getTypeFactory().constructSpecializedType(javaType, this._defaultImpl);
            }
            if (javaType.hasRawClass(this._defaultImpl)) {
                return javaType;
            }
        }
        if (!deserializationConfig.isEnabled(MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL) || javaType.isAbstract()) {
            return null;
        }
        return javaType;
    }

    /* JADX DEBUG: Method merged with bridge method: inclusion(Lcom/fasterxml/jackson/annotation/JsonTypeInfo$As;)Lo/Xx; */
    @Override // o.InterfaceC5599Xx
    public XJ inclusion(JsonTypeInfo.As as) {
        if (as == null) {
            throw new java.lang.IllegalArgumentException("includeAs cannot be null");
        }
        this._includeAs = as;
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: typeProperty(Ljava/lang/String;)Lo/Xx; */
    @Override // o.InterfaceC5599Xx
    public XJ typeProperty(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            str = this._idType.getDefaultPropertyName();
        }
        this._typeProperty = str;
        return this;
    }

    @Override // o.InterfaceC5599Xx
    public XJ withDefaultImpl(java.lang.Class<?> cls) {
        if (this._defaultImpl == cls) {
            return this;
        }
        C5619Yr.AEQbTJ((java.lang.Class<?>) XJ.class, this, "withDefaultImpl");
        return new XJ(this, cls);
    }

    /* JADX INFO: renamed from: o.XJ$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[JsonTypeInfo.Id.values().length];
            EZpvd = iArr;
            try {
                iArr[JsonTypeInfo.Id.DEDUCTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[JsonTypeInfo.Id.CLASS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[JsonTypeInfo.Id.MINIMAL_CLASS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[JsonTypeInfo.Id.NAME.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[JsonTypeInfo.Id.NONE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[JsonTypeInfo.Id.CUSTOM.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[JsonTypeInfo.As.values().length];
            KWHzl = iArr2;
            try {
                iArr2[JsonTypeInfo.As.WRAPPER_ARRAY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                KWHzl[JsonTypeInfo.As.PROPERTY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                KWHzl[JsonTypeInfo.As.WRAPPER_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                KWHzl[JsonTypeInfo.As.EXTERNAL_PROPERTY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                KWHzl[JsonTypeInfo.As.EXISTING_PROPERTY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    public XB idResolver(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator, java.util.Collection<NamedType> collection, boolean z, boolean z2) {
        XB xb = this._customIdResolver;
        if (xb != null) {
            return xb;
        }
        JsonTypeInfo.Id id = this._idType;
        if (id == null) {
            throw new java.lang.IllegalStateException("Cannot build, 'init()' not yet called");
        }
        int i = AnonymousClass1.EZpvd[id.ordinal()];
        if (i == 1 || i == 2) {
            return XD.AEQbTJ(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i == 3) {
            return XK.EZpvd(javaType, mapperConfig, polymorphicTypeValidator);
        }
        if (i == 4) {
            return XI.copydefault(mapperConfig, javaType, collection, z, z2);
        }
        if (i == 5) {
            return null;
        }
        throw new java.lang.IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this._idType);
    }

    public PolymorphicTypeValidator subTypeValidator(MapperConfig<?> mapperConfig) {
        return mapperConfig.getPolymorphicTypeValidator();
    }

    public PolymorphicTypeValidator verifyBaseTypeValidity(MapperConfig<?> mapperConfig, JavaType javaType) {
        PolymorphicTypeValidator polymorphicTypeValidatorSubTypeValidator = subTypeValidator(mapperConfig);
        JsonTypeInfo.Id id = this._idType;
        if (id == JsonTypeInfo.Id.CLASS || id == JsonTypeInfo.Id.MINIMAL_CLASS) {
            PolymorphicTypeValidator.Validity validityValidateBaseType = polymorphicTypeValidatorSubTypeValidator.validateBaseType(mapperConfig, javaType);
            if (validityValidateBaseType == PolymorphicTypeValidator.Validity.DENIED) {
                return reportInvalidBaseType(mapperConfig, javaType, polymorphicTypeValidatorSubTypeValidator);
            }
            if (validityValidateBaseType == PolymorphicTypeValidator.Validity.ALLOWED) {
                return LaissezFaireSubTypeValidator.instance;
            }
        }
        return polymorphicTypeValidatorSubTypeValidator;
    }

    public PolymorphicTypeValidator reportInvalidBaseType(MapperConfig<?> mapperConfig, JavaType javaType, PolymorphicTypeValidator polymorphicTypeValidator) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Configured `PolymorphicTypeValidator` (of type %s) denied resolution of all subtypes of base type %s", C5619Yr.copydefault(polymorphicTypeValidator), C5619Yr.copydefault((java.lang.Object) javaType.getRawClass())));
    }
}
