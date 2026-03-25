package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

/* JADX INFO: renamed from: o.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5552Wc {
    public static final java.lang.Object OLrzqt = new java.lang.Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object AEQbTJ(DeserializationContext deserializationContext, JavaType javaType, java.lang.Object obj, JsonParser jsonParser) throws java.io.IOException {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @java.lang.Deprecated
    public java.lang.Object AEQbTJ(DeserializationContext deserializationContext, java.lang.Class<?> cls, JsonParser jsonParser, java.lang.String str) throws java.io.IOException {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object EZpvd(DeserializationContext deserializationContext, java.lang.Class<?> cls, java.lang.Number number, java.lang.String str) throws java.io.IOException {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object KWHzl(DeserializationContext deserializationContext, java.lang.Class<?> cls, java.lang.Object obj, java.lang.Throwable th) throws java.io.IOException {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object KWHzl(DeserializationContext deserializationContext, java.lang.Class<?> cls, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return OLrzqt;
    }

    public boolean KWHzl(DeserializationContext deserializationContext, JsonParser jsonParser, AbstractC5548Vy<?> abstractC5548Vy, java.lang.Object obj, java.lang.String str) throws java.io.IOException {
        return false;
    }

    public JavaType OLrzqt(DeserializationContext deserializationContext, JavaType javaType, java.lang.String str, XB xb, java.lang.String str2) throws java.io.IOException {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @java.lang.Deprecated
    public java.lang.Object OLrzqt(DeserializationContext deserializationContext, java.lang.Class<?> cls, com.fasterxml.jackson.core.JsonToken jsonToken, JsonParser jsonParser, java.lang.String str) throws java.io.IOException {
        return OLrzqt;
    }

    public JavaType copydefault(DeserializationContext deserializationContext, JavaType javaType, XB xb, java.lang.String str) throws java.io.IOException {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Object copydefault(DeserializationContext deserializationContext, java.lang.Class<?> cls, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        return OLrzqt;
    }

    public java.lang.Object AEQbTJ(DeserializationContext deserializationContext, JavaType javaType, com.fasterxml.jackson.core.JsonToken jsonToken, JsonParser jsonParser, java.lang.String str) throws java.io.IOException {
        return OLrzqt(deserializationContext, javaType.getRawClass(), jsonToken, jsonParser, str);
    }

    public java.lang.Object KWHzl(DeserializationContext deserializationContext, java.lang.Class<?> cls, ValueInstantiator valueInstantiator, JsonParser jsonParser, java.lang.String str) throws java.io.IOException {
        return AEQbTJ(deserializationContext, cls, jsonParser, str);
    }
}
