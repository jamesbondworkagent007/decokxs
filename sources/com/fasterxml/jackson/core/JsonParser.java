package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.util.RequestPayload;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import o.AbstractC5503Ug;
import o.AbstractC5505Ui;
import o.C5541Vr;
import o.InterfaceC5497Ua;
import o.TZ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class JsonParser implements Closeable {
    public static final C5541Vr<StreamReadCapability> AEQbTJ = C5541Vr.copydefault(StreamReadCapability.values());
    public int EZpvd;
    public transient RequestPayload copydefault;

    public enum NumberType {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    public int AEQbTJ(int i) throws IOException {
        return i;
    }

    public long AEQbTJ(long j) throws IOException {
        return j;
    }

    public abstract String AEQbTJ(String str) throws IOException;

    public boolean AEQbTJ() {
        return false;
    }

    public Object AuCTel() throws IOException {
        return null;
    }

    public Object AuCTelauCTel() throws IOException {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5541Vr<StreamReadCapability> AubY() {
        return AEQbTJ;
    }

    public abstract int AwvSrB() throws IOException;

    public Object AxsJAY() throws IOException {
        return null;
    }

    public abstract boolean DTwDnp();

    public abstract JsonToken DbNXlk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public JsonParser EZpvd(int i) {
        this.EZpvd = i;
        return this;
    }

    public boolean EZpvd() {
        return false;
    }

    public JsonParser OLrzqt(int i, int i2) {
        return this;
    }

    public abstract void OLrzqt();

    public abstract boolean OLrzqt(int i);

    public abstract boolean QOLQEE();

    public boolean QfsBiF() throws IOException {
        return false;
    }

    public abstract JsonToken RcXXUw() throws IOException;

    public abstract JsonParser UeEOUB() throws IOException;

    public boolean aKErDB() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public abstract boolean copydefault(JsonToken jsonToken);

    public abstract byte[] copydefault(Base64Variant base64Variant) throws IOException;

    public abstract float ejfBZ() throws IOException;

    public abstract double fARcdN() throws IOException;

    @Deprecated
    public abstract int fIwbmz();

    public abstract BigDecimal fJNWhG() throws IOException;

    public abstract JsonLocation fetchVPNInfo();

    public abstract BigInteger gEmmrt() throws IOException;

    public abstract JsonLocation gHZMYf();

    public abstract int getFieldNames() throws IOException;

    public abstract long getNewProxyInstance() throws IOException;

    public abstract Number hDKMBd() throws IOException;

    public abstract String isConnected() throws IOException;

    public abstract char[] sSMYrx() throws IOException;

    public abstract NumberType uzCIH() throws IOException;

    public abstract AbstractC5505Ui values();

    public abstract AbstractC5503Ug wlaJM();

    public abstract String zLjUOn() throws IOException;

    public abstract int zuBGHE() throws IOException;

    public enum Feature {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true),
        USE_FAST_DOUBLE_PARSER(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getMask() {
            return this._mask;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }
    }

    public JsonParser() {
        this.EZpvd = JsonFactory.DEFAULT_PARSER_FEATURE_FLAGS;
    }

    public JsonParser(int i) {
        this.EZpvd = i;
    }

    public void EZpvd(InterfaceC5497Ua interfaceC5497Ua) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + interfaceC5497Ua.OLrzqt() + "'");
    }

    public void KWHzl(Object obj) {
        AbstractC5503Ug abstractC5503UgWlaJM = wlaJM();
        if (abstractC5503UgWlaJM != null) {
            abstractC5503UgWlaJM.copydefault(obj);
        }
    }

    public JsonParser EZpvd(Feature feature) {
        this.EZpvd = feature.getMask() | this.EZpvd;
        return this;
    }

    public boolean copydefault(Feature feature) {
        return feature.enabledIn(this.EZpvd);
    }

    public boolean KWHzl(StreamReadFeature streamReadFeature) {
        return streamReadFeature.mappedFeature().enabledIn(this.EZpvd);
    }

    public JsonParser AEQbTJ(int i, int i2) {
        return EZpvd((i & i2) | ((~i2) & this.EZpvd));
    }

    public String QbewEr() throws IOException {
        if (RcXXUw() == JsonToken.FIELD_NAME) {
            return isConnected();
        }
        return null;
    }

    public String dNCPSb() throws IOException {
        if (RcXXUw() == JsonToken.VALUE_STRING) {
            return zLjUOn();
        }
        return null;
    }

    public JsonToken djBIcL() {
        return DbNXlk();
    }

    public int valueOf() {
        return fIwbmz();
    }

    public boolean RJOkX() {
        return djBIcL() == JsonToken.START_ARRAY;
    }

    public boolean QVAiDq() {
        return djBIcL() == JsonToken.START_OBJECT;
    }

    public boolean QUSxYX() {
        return djBIcL() == JsonToken.VALUE_NUMBER_INT;
    }

    public String KWHzl() throws IOException {
        return isConnected();
    }

    public Number iwGUEr() throws IOException {
        return hDKMBd();
    }

    public byte AkhnZx() throws IOException {
        int fieldNames = getFieldNames();
        if (fieldNames < -128 || fieldNames > 255) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java byte", zLjUOn()), JsonToken.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) fieldNames;
    }

    public short zsXlph() throws IOException {
        int fieldNames = getFieldNames();
        if (fieldNames < -32768 || fieldNames > 32767) {
            throw new InputCoercionException(this, String.format("Numeric value (%s) out of range of Java short", zLjUOn()), JsonToken.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) fieldNames;
    }

    public boolean AYXKKw() throws IOException {
        JsonToken jsonTokenDjBIcL = djBIcL();
        if (jsonTokenDjBIcL == JsonToken.VALUE_TRUE) {
            return true;
        }
        if (jsonTokenDjBIcL == JsonToken.VALUE_FALSE) {
            return false;
        }
        throw new JsonParseException(this, String.format("Current token (%s) not of boolean type", jsonTokenDjBIcL)).withRequestPayload(this.copydefault);
    }

    public byte[] AhwBna() throws IOException {
        return copydefault(TZ.AEQbTJ());
    }

    public int KWHzl(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        copydefault();
        return 0;
    }

    public int OcIXYQ() throws IOException {
        return AEQbTJ(0);
    }

    public long ORxRYg() throws IOException {
        return AEQbTJ(0L);
    }

    public String QKVWgx() throws IOException {
        return AEQbTJ((String) null);
    }

    public JsonParseException EZpvd(String str) {
        return new JsonParseException(this, str).withRequestPayload(this.copydefault);
    }

    public void copydefault() {
        throw new UnsupportedOperationException("Operation not supported by parser of type " + getClass().getName());
    }
}
