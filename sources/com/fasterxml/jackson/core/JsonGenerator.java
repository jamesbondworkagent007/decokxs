package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.AbstractC5503Ug;
import o.C5541Vr;
import o.C5546Vw;
import o.InterfaceC5497Ua;
import o.InterfaceC5501Ue;
import o.InterfaceC5504Uh;
import o.TZ;

/* JADX INFO: loaded from: classes21.dex */
public abstract class JsonGenerator implements Closeable, Flushable {
    public static final C5541Vr<StreamWriteCapability> AEQbTJ;
    public static final C5541Vr<StreamWriteCapability> EZpvd;
    public static final C5541Vr<StreamWriteCapability> KWHzl;
    public InterfaceC5504Uh copydefault;

    @Deprecated
    public abstract JsonGenerator AEQbTJ(int i);

    public abstract void AEQbTJ(float f) throws IOException;

    public abstract void AEQbTJ(char[] cArr, int i, int i2) throws IOException;

    public boolean AEQbTJ() {
        return false;
    }

    public abstract void AYXKKw(String str) throws IOException;

    public boolean AYXKKw() {
        return false;
    }

    public abstract JsonGenerator AhwBna();

    public abstract void AhwBna(String str) throws IOException;

    public abstract void AkhnZx() throws IOException;

    public abstract void DbNXlk() throws IOException;

    public JsonGenerator EZpvd(int i) {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonGenerator EZpvd(InterfaceC5504Uh interfaceC5504Uh) {
        this.copydefault = interfaceC5504Uh;
        return this;
    }

    public abstract void EZpvd(long j) throws IOException;

    public abstract void EZpvd(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException;

    public abstract void EZpvd(Object obj) throws IOException;

    public abstract void EZpvd(String str) throws IOException;

    public abstract void EZpvd(InterfaceC5501Ue interfaceC5501Ue) throws IOException;

    public boolean EZpvd() {
        return false;
    }

    public abstract int KWHzl(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException;

    public abstract JsonGenerator KWHzl(Feature feature);

    public abstract void KWHzl(double d) throws IOException;

    public abstract void KWHzl(String str) throws IOException;

    public abstract void KWHzl(BigInteger bigInteger) throws IOException;

    public abstract void KWHzl(char[] cArr, int i, int i2) throws IOException;

    public void OLrzqt(String str) throws IOException {
    }

    public abstract void OLrzqt(BigDecimal bigDecimal) throws IOException;

    public abstract void OLrzqt(boolean z) throws IOException;

    public boolean OLrzqt() {
        return true;
    }

    public abstract boolean OLrzqt(Feature feature);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public JsonGenerator copydefault(int i, int i2) {
        return this;
    }

    public JsonGenerator copydefault(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract void copydefault(char c) throws IOException;

    public abstract void copydefault(int i) throws IOException;

    public abstract void copydefault(String str) throws IOException;

    public abstract void copydefault(InterfaceC5501Ue interfaceC5501Ue) throws IOException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC5504Uh djBIcL() {
        return this.copydefault;
    }

    public abstract void fetchVPNInfo() throws IOException;

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public abstract int gEmmrt();

    public abstract void isConnected() throws IOException;

    public abstract AbstractC5503Ug valueOf();

    public abstract void values() throws IOException;

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.Vr<F extends o.Vq>, o.Vr<com.fasterxml.jackson.core.StreamWriteCapability> */
    /* JADX DEBUG: Type inference failed for r1v1. Raw type applied. Possible types: o.Vr<F extends o.Vq>, o.Vr<com.fasterxml.jackson.core.StreamWriteCapability> */
    static {
        C5541Vr<StreamWriteCapability> c5541VrCopydefault = C5541Vr.copydefault(StreamWriteCapability.values());
        AEQbTJ = c5541VrCopydefault;
        EZpvd = c5541VrCopydefault.copydefault(StreamWriteCapability.CAN_WRITE_FORMATTED_NUMBERS);
        KWHzl = c5541VrCopydefault.copydefault(StreamWriteCapability.CAN_WRITE_BINARY_NATIVELY);
    }

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false),
        USE_FAST_DOUBLE_WRITER(false),
        WRITE_HEX_UPPER_CASE(true);

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

    public void KWHzl(Object obj) {
        AbstractC5503Ug abstractC5503UgValueOf = valueOf();
        if (abstractC5503UgValueOf != null) {
            abstractC5503UgValueOf.copydefault(obj);
        }
    }

    public JsonGenerator AEQbTJ(int i, int i2) {
        return AEQbTJ((i & i2) | ((~i2) & gEmmrt()));
    }

    public void copydefault(InterfaceC5497Ua interfaceC5497Ua) {
        throw new UnsupportedOperationException(String.format("Generator of type %s does not support schema of type '%s'", getClass().getName(), interfaceC5497Ua.OLrzqt()));
    }

    public JsonGenerator KWHzl(InterfaceC5501Ue interfaceC5501Ue) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public void KWHzl(int i) throws IOException {
        values();
    }

    public void gEmmrt(Object obj) throws IOException {
        values();
        KWHzl(obj);
    }

    public void AEQbTJ(Object obj, int i) throws IOException {
        KWHzl(i);
        KWHzl(obj);
    }

    public void AYXKKw(Object obj) throws IOException {
        AkhnZx();
        KWHzl(obj);
    }

    public void EZpvd(Object obj, int i) throws IOException {
        AYXKKw(obj);
    }

    public void AEQbTJ(long j) throws IOException {
        KWHzl(Long.toString(j));
    }

    public void KWHzl(int[] iArr, int i, int i2) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        copydefault(iArr.length, i, i2);
        AEQbTJ(iArr, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            copydefault(iArr[i3]);
        }
        fetchVPNInfo();
    }

    public void OLrzqt(long[] jArr, int i, int i2) throws IOException {
        if (jArr == null) {
            throw new IllegalArgumentException("null array");
        }
        copydefault(jArr.length, i, i2);
        AEQbTJ(jArr, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            EZpvd(jArr[i3]);
        }
        fetchVPNInfo();
    }

    public void KWHzl(double[] dArr, int i, int i2) throws IOException {
        if (dArr == null) {
            throw new IllegalArgumentException("null array");
        }
        copydefault(dArr.length, i, i2);
        AEQbTJ(dArr, i2);
        for (int i3 = i; i3 < i2 + i; i3++) {
            KWHzl(dArr[i3]);
        }
        fetchVPNInfo();
    }

    public void OLrzqt(InterfaceC5501Ue interfaceC5501Ue) throws IOException {
        copydefault(interfaceC5501Ue.getValue());
    }

    public void AEQbTJ(InterfaceC5501Ue interfaceC5501Ue) throws IOException {
        AYXKKw(interfaceC5501Ue.getValue());
    }

    public void EZpvd(byte[] bArr, int i, int i2) throws IOException {
        EZpvd(TZ.AEQbTJ(), bArr, i, i2);
    }

    public void AEQbTJ(byte[] bArr) throws IOException {
        EZpvd(TZ.AEQbTJ(), bArr, 0, bArr.length);
    }

    public int KWHzl(InputStream inputStream, int i) throws IOException {
        return KWHzl(TZ.AEQbTJ(), inputStream, i);
    }

    public void OLrzqt(short s) throws IOException {
        copydefault(s);
    }

    public void copydefault(Object obj) throws IOException {
        if (obj == null) {
            isConnected();
        } else {
            if (obj instanceof byte[]) {
                AEQbTJ((byte[]) obj);
                return;
            }
            throw new JsonGenerationException("No native support for writing embedded objects of type " + obj.getClass().getName(), this);
        }
    }

    public void AEQbTJ(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void AhwBna(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void valueOf(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId EZpvd(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.EZpvd;
        JsonToken jsonToken = writableTypeId.gEmmrt;
        if (AYXKKw()) {
            writableTypeId.valueOf = false;
            valueOf(obj);
        } else {
            String strValueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.valueOf = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.KWHzl;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.KWHzl = inclusion;
            }
            int i = AnonymousClass4.copydefault[inclusion.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    AYXKKw(writableTypeId.OLrzqt);
                    EZpvd(writableTypeId.copydefault, strValueOf);
                    return writableTypeId;
                }
                if (i == 4) {
                    AkhnZx();
                    KWHzl(strValueOf);
                } else {
                    values();
                    AhwBna(strValueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            AYXKKw(writableTypeId.OLrzqt);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            values();
        }
        return writableTypeId;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.core.JsonGenerator$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            copydefault = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                copydefault[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                copydefault[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                copydefault[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                copydefault[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public WritableTypeId copydefault(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.gEmmrt;
        if (jsonToken == JsonToken.START_OBJECT) {
            DbNXlk();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            fetchVPNInfo();
        }
        if (writableTypeId.valueOf) {
            int i = AnonymousClass4.copydefault[writableTypeId.KWHzl.ordinal()];
            if (i == 1) {
                Object obj = writableTypeId.EZpvd;
                EZpvd(writableTypeId.copydefault, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i != 2 && i != 3) {
                if (i == 5) {
                    fetchVPNInfo();
                } else {
                    DbNXlk();
                }
            }
        }
        return writableTypeId;
    }

    public void EZpvd(String str, String str2) throws IOException {
        KWHzl(str);
        AhwBna(str2);
    }

    public void copydefault(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        switch (jsonTokenDjBIcL == null ? -1 : jsonTokenDjBIcL.id()) {
            case -1:
                AEQbTJ("No current event to copy");
                return;
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + jsonTokenDjBIcL);
            case 1:
                AkhnZx();
                return;
            case 2:
                DbNXlk();
                return;
            case 3:
                values();
                return;
            case 4:
                fetchVPNInfo();
                return;
            case 5:
                KWHzl(jsonParser.isConnected());
                return;
            case 6:
                if (jsonParser.DTwDnp()) {
                    KWHzl(jsonParser.sSMYrx(), jsonParser.zuBGHE(), jsonParser.AwvSrB());
                    return;
                } else {
                    AhwBna(jsonParser.zLjUOn());
                    return;
                }
            case 7:
                JsonParser.NumberType numberTypeUzCIH = jsonParser.uzCIH();
                if (numberTypeUzCIH == JsonParser.NumberType.INT) {
                    copydefault(jsonParser.getFieldNames());
                    return;
                } else if (numberTypeUzCIH == JsonParser.NumberType.BIG_INTEGER) {
                    KWHzl(jsonParser.gEmmrt());
                    return;
                } else {
                    EZpvd(jsonParser.getNewProxyInstance());
                    return;
                }
            case 8:
                JsonParser.NumberType numberTypeUzCIH2 = jsonParser.uzCIH();
                if (numberTypeUzCIH2 == JsonParser.NumberType.BIG_DECIMAL) {
                    OLrzqt(jsonParser.fJNWhG());
                    return;
                } else if (numberTypeUzCIH2 == JsonParser.NumberType.FLOAT) {
                    AEQbTJ(jsonParser.ejfBZ());
                    return;
                } else {
                    KWHzl(jsonParser.fARcdN());
                    return;
                }
            case 9:
                OLrzqt(true);
                return;
            case 10:
                OLrzqt(false);
                return;
            case 11:
                isConnected();
                return;
            case 12:
                EZpvd(jsonParser.AuCTel());
                return;
        }
    }

    public void EZpvd(JsonParser jsonParser) throws IOException {
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        int iId = jsonTokenDjBIcL == null ? -1 : jsonTokenDjBIcL.id();
        if (iId == 5) {
            KWHzl(jsonParser.isConnected());
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            iId = jsonTokenRcXXUw != null ? jsonTokenRcXXUw.id() : -1;
        }
        if (iId == 1) {
            AkhnZx();
            AEQbTJ(jsonParser);
        } else if (iId == 3) {
            values();
            AEQbTJ(jsonParser);
        } else {
            copydefault(jsonParser);
        }
    }

    public void AEQbTJ(JsonParser jsonParser) throws IOException {
        int i = 1;
        while (true) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == null) {
                return;
            }
            switch (jsonTokenRcXXUw.id()) {
                case 1:
                    AkhnZx();
                    break;
                case 2:
                    DbNXlk();
                    i--;
                    if (i != 0) {
                        continue;
                    } else {
                        return;
                    }
                    break;
                case 3:
                    values();
                    break;
                case 4:
                    fetchVPNInfo();
                    i--;
                    if (i != 0) {
                        continue;
                    } else {
                        return;
                    }
                    break;
                case 5:
                    KWHzl(jsonParser.isConnected());
                    continue;
                case 6:
                    if (jsonParser.DTwDnp()) {
                        KWHzl(jsonParser.sSMYrx(), jsonParser.zuBGHE(), jsonParser.AwvSrB());
                    } else {
                        AhwBna(jsonParser.zLjUOn());
                        continue;
                    }
                    break;
                case 7:
                    JsonParser.NumberType numberTypeUzCIH = jsonParser.uzCIH();
                    if (numberTypeUzCIH == JsonParser.NumberType.INT) {
                        copydefault(jsonParser.getFieldNames());
                    } else if (numberTypeUzCIH == JsonParser.NumberType.BIG_INTEGER) {
                        KWHzl(jsonParser.gEmmrt());
                    } else {
                        EZpvd(jsonParser.getNewProxyInstance());
                        continue;
                    }
                    break;
                case 8:
                    JsonParser.NumberType numberTypeUzCIH2 = jsonParser.uzCIH();
                    if (numberTypeUzCIH2 == JsonParser.NumberType.BIG_DECIMAL) {
                        OLrzqt(jsonParser.fJNWhG());
                    } else if (numberTypeUzCIH2 == JsonParser.NumberType.FLOAT) {
                        AEQbTJ(jsonParser.ejfBZ());
                    } else {
                        KWHzl(jsonParser.fARcdN());
                        continue;
                    }
                    break;
                case 9:
                    OLrzqt(true);
                    continue;
                case 10:
                    OLrzqt(false);
                    continue;
                case 11:
                    isConnected();
                    continue;
                case 12:
                    EZpvd(jsonParser.AuCTel());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + jsonTokenRcXXUw);
            }
            i++;
        }
    }

    public void AEQbTJ(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public final void KWHzl() {
        C5546Vw.OLrzqt();
    }

    public void copydefault() {
        throw new UnsupportedOperationException("Operation not supported by generator of type " + getClass().getName());
    }

    public final void copydefault(int i, int i2, int i3) {
        if (i2 < 0 || i2 + i3 > i) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i)));
        }
    }

    public void OLrzqt(Object obj) throws IOException {
        if (obj == null) {
            isConnected();
            return;
        }
        if (obj instanceof String) {
            AhwBna((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                copydefault(number.intValue());
                return;
            }
            if (number instanceof Long) {
                EZpvd(number.longValue());
                return;
            }
            if (number instanceof Double) {
                KWHzl(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                AEQbTJ(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                OLrzqt(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                OLrzqt(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                KWHzl((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                OLrzqt((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                copydefault(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                EZpvd(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            AEQbTJ((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            OLrzqt(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            OLrzqt(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }
}
