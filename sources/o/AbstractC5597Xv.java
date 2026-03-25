package o;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: renamed from: o.Xv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5597Xv {
    public abstract java.lang.Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws java.io.IOException;

    public abstract java.lang.Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws java.io.IOException;

    public abstract java.lang.Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws java.io.IOException;

    public abstract java.lang.Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws java.io.IOException;

    public abstract AbstractC5597Xv forProperty(BeanProperty beanProperty);

    public abstract java.lang.Class<?> getDefaultImpl();

    public abstract java.lang.String getPropertyName();

    public abstract XB getTypeIdResolver();

    public abstract JsonTypeInfo.As getTypeInclusion();

    public boolean hasDefaultImpl() {
        return getDefaultImpl() != null;
    }

    public static java.lang.Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws java.io.IOException {
        return deserializeIfNatural(jsonParser, deserializationContext, javaType.getRawClass());
    }

    public static java.lang.Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, java.lang.Class<?> cls) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == null) {
            return null;
        }
        int i = AnonymousClass2.EZpvd[jsonTokenDjBIcL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (cls.isAssignableFrom(java.lang.Boolean.class)) {
                            return java.lang.Boolean.TRUE;
                        }
                    } else if (i == 5 && cls.isAssignableFrom(java.lang.Boolean.class)) {
                        return java.lang.Boolean.FALSE;
                    }
                } else if (cls.isAssignableFrom(java.lang.Double.class)) {
                    return java.lang.Double.valueOf(jsonParser.fARcdN());
                }
            } else if (cls.isAssignableFrom(java.lang.Integer.class)) {
                return java.lang.Integer.valueOf(jsonParser.getFieldNames());
            }
        } else if (cls.isAssignableFrom(java.lang.String.class)) {
            return jsonParser.zLjUOn();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.Xv$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[com.fasterxml.jackson.core.JsonToken.values().length];
            EZpvd = iArr;
            try {
                iArr[com.fasterxml.jackson.core.JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_TRUE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_FALSE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }
}
