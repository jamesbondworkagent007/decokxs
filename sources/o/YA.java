package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.math.BigDecimal;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public class YA extends JsonGenerator {
    public static final int OLrzqt = JsonGenerator.Feature.collectDefaults();
    public boolean AYXKKw;
    public boolean AhwBna;
    public boolean AkhnZx;
    public AbstractC5503Ug AuCTel;
    public TaskDescription DbNXlk;
    public int djBIcL;
    public java.lang.Object ejfBZ;
    public AbstractC5505Ui fARcdN;
    public java.lang.Object fJNWhG;
    public boolean fetchVPNInfo;
    public TaskDescription gEmmrt;
    public boolean isConnected;
    public boolean values = false;
    public int valueOf = OLrzqt;
    public UX fIwbmz = UX.EZpvd((UV) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    @java.lang.Deprecated
    public JsonGenerator AEQbTJ(int i) {
        this.valueOf = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(java.lang.Object obj) {
        this.ejfBZ = obj;
        this.values = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean AEQbTJ() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean AYXKKw() {
        return this.isConnected;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator AhwBna() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public YA EZpvd(boolean z) {
        this.AYXKKw = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean EZpvd() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.AhwBna = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: valueOf()Lo/Ug; */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    /* JADX INFO: renamed from: ejfBZ, reason: merged with bridge method [inline-methods] */
    public final UX valueOf() {
        return this.fIwbmz;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws java.io.IOException {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void valueOf(java.lang.Object obj) {
        this.fJNWhG = obj;
        this.values = true;
    }

    public YA(AbstractC5505Ui abstractC5505Ui, boolean z) {
        this.fARcdN = abstractC5505Ui;
        TaskDescription taskDescription = new TaskDescription();
        this.DbNXlk = taskDescription;
        this.gEmmrt = taskDescription;
        this.djBIcL = 0;
        this.isConnected = z;
        this.fetchVPNInfo = z;
        this.AkhnZx = z || z;
    }

    public YA(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this.fARcdN = jsonParser.values();
        this.AuCTel = jsonParser.wlaJM();
        TaskDescription taskDescription = new TaskDescription();
        this.DbNXlk = taskDescription;
        this.gEmmrt = taskDescription;
        this.djBIcL = 0;
        this.isConnected = jsonParser.AEQbTJ();
        boolean zEZpvd = jsonParser.EZpvd();
        this.fetchVPNInfo = zEZpvd;
        this.AkhnZx = this.isConnected || zEZpvd;
        this.AYXKKw = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }

    public JsonParser fIwbmz() {
        return copydefault(this.fARcdN);
    }

    public JsonParser fARcdN() throws java.io.IOException {
        JsonParser jsonParserCopydefault = copydefault(this.fARcdN);
        jsonParserCopydefault.RcXXUw();
        return jsonParserCopydefault;
    }

    public JsonParser copydefault(AbstractC5505Ui abstractC5505Ui) {
        return new Application(this.gEmmrt, abstractC5505Ui, this.isConnected, this.fetchVPNInfo, this.AuCTel);
    }

    public JsonParser gEmmrt(JsonParser jsonParser) {
        Application application = new Application(this.gEmmrt, jsonParser.values(), this.isConnected, this.fetchVPNInfo, this.AuCTel);
        application.AEQbTJ(jsonParser.gHZMYf());
        return application;
    }

    public com.fasterxml.jackson.core.JsonToken AuCTel() {
        return this.gEmmrt.djBIcL(0);
    }

    public YA AEQbTJ(YA ya) throws java.io.IOException {
        if (!this.isConnected) {
            this.isConnected = ya.AYXKKw();
        }
        if (!this.fetchVPNInfo) {
            this.fetchVPNInfo = ya.EZpvd();
        }
        this.AkhnZx = this.isConnected || this.fetchVPNInfo;
        JsonParser jsonParserFIwbmz = ya.fIwbmz();
        while (jsonParserFIwbmz.RcXXUw() != null) {
            EZpvd(jsonParserFIwbmz);
        }
        return this;
    }

    public void KWHzl(JsonGenerator jsonGenerator) throws java.io.IOException {
        TaskDescription taskDescriptionEZpvd = this.gEmmrt;
        boolean z = this.AkhnZx;
        boolean z2 = z && taskDescriptionEZpvd.copydefault();
        int i = -1;
        while (true) {
            i++;
            if (i >= 16) {
                taskDescriptionEZpvd = taskDescriptionEZpvd.EZpvd();
                if (taskDescriptionEZpvd == null) {
                    return;
                }
                z2 = z && taskDescriptionEZpvd.copydefault();
                i = 0;
            }
            com.fasterxml.jackson.core.JsonToken jsonTokenDjBIcL = taskDescriptionEZpvd.djBIcL(i);
            if (jsonTokenDjBIcL == null) {
                return;
            }
            if (z2) {
                java.lang.Object objKWHzl = taskDescriptionEZpvd.KWHzl(i);
                if (objKWHzl != null) {
                    jsonGenerator.AEQbTJ(objKWHzl);
                }
                java.lang.Object objAEQbTJ = taskDescriptionEZpvd.AEQbTJ(i);
                if (objAEQbTJ != null) {
                    jsonGenerator.valueOf(objAEQbTJ);
                }
            }
            switch (AnonymousClass1.EZpvd[jsonTokenDjBIcL.ordinal()]) {
                case 1:
                    jsonGenerator.AkhnZx();
                    break;
                case 2:
                    jsonGenerator.DbNXlk();
                    break;
                case 3:
                    jsonGenerator.values();
                    break;
                case 4:
                    jsonGenerator.fetchVPNInfo();
                    break;
                case 5:
                    java.lang.Object objEZpvd = taskDescriptionEZpvd.EZpvd(i);
                    if (objEZpvd instanceof InterfaceC5501Ue) {
                        jsonGenerator.copydefault((InterfaceC5501Ue) objEZpvd);
                    } else {
                        jsonGenerator.KWHzl((java.lang.String) objEZpvd);
                    }
                    break;
                case 6:
                    java.lang.Object objEZpvd2 = taskDescriptionEZpvd.EZpvd(i);
                    if (objEZpvd2 instanceof InterfaceC5501Ue) {
                        jsonGenerator.EZpvd((InterfaceC5501Ue) objEZpvd2);
                    } else {
                        jsonGenerator.AhwBna((java.lang.String) objEZpvd2);
                    }
                    break;
                case 7:
                    java.lang.Object objEZpvd3 = taskDescriptionEZpvd.EZpvd(i);
                    if (objEZpvd3 instanceof java.lang.Integer) {
                        jsonGenerator.copydefault(((java.lang.Integer) objEZpvd3).intValue());
                    } else if (objEZpvd3 instanceof java.math.BigInteger) {
                        jsonGenerator.KWHzl((java.math.BigInteger) objEZpvd3);
                    } else if (objEZpvd3 instanceof java.lang.Long) {
                        jsonGenerator.EZpvd(((java.lang.Long) objEZpvd3).longValue());
                    } else if (objEZpvd3 instanceof java.lang.Short) {
                        jsonGenerator.OLrzqt(((java.lang.Short) objEZpvd3).shortValue());
                    } else {
                        jsonGenerator.copydefault(((java.lang.Number) objEZpvd3).intValue());
                    }
                    break;
                case 8:
                    java.lang.Object objEZpvd4 = taskDescriptionEZpvd.EZpvd(i);
                    if (objEZpvd4 instanceof java.lang.Double) {
                        jsonGenerator.KWHzl(((java.lang.Double) objEZpvd4).doubleValue());
                    } else if (objEZpvd4 instanceof BigDecimal) {
                        jsonGenerator.OLrzqt((BigDecimal) objEZpvd4);
                    } else if (objEZpvd4 instanceof java.lang.Float) {
                        jsonGenerator.AEQbTJ(((java.lang.Float) objEZpvd4).floatValue());
                    } else if (objEZpvd4 == null) {
                        jsonGenerator.isConnected();
                    } else if (objEZpvd4 instanceof java.lang.String) {
                        jsonGenerator.EZpvd((java.lang.String) objEZpvd4);
                    } else {
                        AEQbTJ(java.lang.String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", objEZpvd4.getClass().getName()));
                    }
                    break;
                case 9:
                    jsonGenerator.OLrzqt(true);
                    break;
                case 10:
                    jsonGenerator.OLrzqt(false);
                    break;
                case 11:
                    jsonGenerator.isConnected();
                    break;
                case 12:
                    java.lang.Object objEZpvd5 = taskDescriptionEZpvd.EZpvd(i);
                    if (objEZpvd5 instanceof C5624Yx) {
                        ((C5624Yx) objEZpvd5).EZpvd(jsonGenerator);
                    } else if (objEZpvd5 instanceof VF) {
                        jsonGenerator.EZpvd(objEZpvd5);
                    } else {
                        jsonGenerator.copydefault(objEZpvd5);
                    }
                    break;
                default:
                    throw new java.lang.RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    public YA AEQbTJ(JsonParser jsonParser, DeserializationContext deserializationContext) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw;
        if (!jsonParser.copydefault(com.fasterxml.jackson.core.JsonToken.FIELD_NAME)) {
            EZpvd(jsonParser);
            return this;
        }
        AkhnZx();
        do {
            EZpvd(jsonParser);
            jsonTokenRcXXUw = jsonParser.RcXXUw();
        } while (jsonTokenRcXXUw == com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        if (jsonTokenRcXXUw != jsonToken) {
            deserializationContext.reportWrongTokenException(YA.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + jsonTokenRcXXUw, new java.lang.Object[0]);
        }
        DbNXlk();
        return this;
    }

    public java.lang.String toString() {
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("[TokenBuffer: ");
        JsonParser jsonParserFIwbmz = fIwbmz();
        boolean z = false;
        if (this.isConnected || this.fetchVPNInfo) {
            z = true;
            i = 0;
        } else {
            i = 0;
        }
        while (true) {
            try {
                com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = jsonParserFIwbmz.RcXXUw();
                if (jsonTokenRcXXUw == null) {
                    break;
                }
                if (z) {
                    OLrzqt(sb);
                }
                if (i < 100) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(jsonTokenRcXXUw.toString());
                    if (jsonTokenRcXXUw == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
                        sb.append('(');
                        sb.append(jsonParserFIwbmz.KWHzl());
                        sb.append(')');
                    }
                }
                i++;
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
        if (i >= 100) {
            sb.append(" ... (truncated ");
            sb.append(i - 100);
            sb.append(" entries)");
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final void OLrzqt(java.lang.StringBuilder sb) {
        java.lang.Object objKWHzl = this.DbNXlk.KWHzl(this.djBIcL - 1);
        if (objKWHzl != null) {
            sb.append("[objectId=");
            sb.append(java.lang.String.valueOf(objKWHzl));
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
        java.lang.Object objAEQbTJ = this.DbNXlk.AEQbTJ(this.djBIcL - 1);
        if (objAEQbTJ != null) {
            sb.append("[typeId=");
            sb.append(java.lang.String.valueOf(objAEQbTJ));
            sb.append(AbstractJsonLexerKt.END_LIST);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator KWHzl(JsonGenerator.Feature feature) {
        this.valueOf = (~feature.getMask()) & this.valueOf;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean OLrzqt(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.valueOf) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator AEQbTJ(int i, int i2) {
        this.valueOf = (i & i2) | ((~i2) & gEmmrt());
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void values() throws java.io.IOException {
        this.fIwbmz.fIwbmz();
        AEQbTJ(com.fasterxml.jackson.core.JsonToken.START_ARRAY);
        this.fIwbmz = this.fIwbmz.AkhnZx();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void gEmmrt(java.lang.Object obj) throws java.io.IOException {
        this.fIwbmz.fIwbmz();
        AEQbTJ(com.fasterxml.jackson.core.JsonToken.START_ARRAY);
        this.fIwbmz = this.fIwbmz.EZpvd(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(java.lang.Object obj, int i) throws java.io.IOException {
        this.fIwbmz.fIwbmz();
        AEQbTJ(com.fasterxml.jackson.core.JsonToken.START_ARRAY);
        this.fIwbmz = this.fIwbmz.EZpvd(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void fetchVPNInfo() throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.END_ARRAY);
        UX uxAEQbTJ = this.fIwbmz.AEQbTJ();
        if (uxAEQbTJ != null) {
            this.fIwbmz = uxAEQbTJ;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void AkhnZx() throws java.io.IOException {
        this.fIwbmz.fIwbmz();
        AEQbTJ(com.fasterxml.jackson.core.JsonToken.START_OBJECT);
        this.fIwbmz = this.fIwbmz.values();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AYXKKw(java.lang.Object obj) throws java.io.IOException {
        this.fIwbmz.fIwbmz();
        AEQbTJ(com.fasterxml.jackson.core.JsonToken.START_OBJECT);
        this.fIwbmz = this.fIwbmz.AEQbTJ(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.Object obj, int i) throws java.io.IOException {
        this.fIwbmz.fIwbmz();
        AEQbTJ(com.fasterxml.jackson.core.JsonToken.START_OBJECT);
        this.fIwbmz = this.fIwbmz.AEQbTJ(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void DbNXlk() throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.END_OBJECT);
        UX uxAEQbTJ = this.fIwbmz.AEQbTJ();
        if (uxAEQbTJ != null) {
            this.fIwbmz = uxAEQbTJ;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void KWHzl(java.lang.String str) throws java.io.IOException {
        this.fIwbmz.copydefault(str);
        djBIcL(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        this.fIwbmz.copydefault(interfaceC5501Ue.getValue());
        djBIcL(interfaceC5501Ue);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AhwBna(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            isConnected();
        } else {
            copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(char[] cArr, int i, int i2) throws java.io.IOException {
        AhwBna(new java.lang.String(cArr, i, i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        if (interfaceC5501Ue == null) {
            isConnected();
        } else {
            copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_STRING, interfaceC5501Ue);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(java.lang.String str) throws java.io.IOException {
        copydefault();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        copydefault();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(char[] cArr, int i, int i2) throws java.io.IOException {
        copydefault();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(char c) throws java.io.IOException {
        copydefault();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AYXKKw(java.lang.String str) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT, new C5624Yx(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(short s) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT, java.lang.Short.valueOf(s));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(int i) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT, java.lang.Integer.valueOf(i));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(long j) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT, java.lang.Long.valueOf(j));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(double d) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT, java.lang.Double.valueOf(d));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(float f) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT, java.lang.Float.valueOf(f));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(BigDecimal bigDecimal) throws java.io.IOException {
        if (bigDecimal == null) {
            isConnected();
        } else {
            copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(java.math.BigInteger bigInteger) throws java.io.IOException {
        if (bigInteger == null) {
            isConnected();
        } else {
            copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.String str) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(boolean z) throws java.io.IOException {
        EZpvd(z ? com.fasterxml.jackson.core.JsonToken.VALUE_TRUE : com.fasterxml.jackson.core.JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void isConnected() throws java.io.IOException {
        EZpvd(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            isConnected();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof C5624Yx)) {
            copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        AbstractC5505Ui abstractC5505Ui = this.fARcdN;
        if (abstractC5505Ui == null) {
            copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            abstractC5505Ui.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws java.io.IOException {
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        EZpvd(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int KWHzl(Base64Variant base64Variant, java.io.InputStream inputStream, int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(java.lang.Object obj) throws java.io.IOException {
        copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(JsonParser jsonParser) throws java.io.IOException {
        if (this.AkhnZx) {
            KWHzl(jsonParser);
        }
        switch (AnonymousClass1.EZpvd[jsonParser.djBIcL().ordinal()]) {
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
                KWHzl(jsonParser.KWHzl());
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
                int i = AnonymousClass1.KWHzl[jsonParser.uzCIH().ordinal()];
                if (i == 1) {
                    copydefault(jsonParser.getFieldNames());
                    return;
                } else if (i == 2) {
                    KWHzl(jsonParser.gEmmrt());
                    return;
                } else {
                    EZpvd(jsonParser.getNewProxyInstance());
                    return;
                }
            case 8:
                if (this.AYXKKw) {
                    OLrzqt(jsonParser.fJNWhG());
                    return;
                }
                int i2 = AnonymousClass1.KWHzl[jsonParser.uzCIH().ordinal()];
                if (i2 == 3) {
                    OLrzqt(jsonParser.fJNWhG());
                    return;
                } else if (i2 == 4) {
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
            default:
                throw new java.lang.RuntimeException("Internal error: unexpected token: " + jsonParser.djBIcL());
        }
    }

    /* JADX INFO: renamed from: o.YA$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            KWHzl = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                KWHzl[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[com.fasterxml.jackson.core.JsonToken.values().length];
            EZpvd = iArr2;
            try {
                iArr2[com.fasterxml.jackson.core.JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(JsonParser jsonParser) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            if (this.AkhnZx) {
                KWHzl(jsonParser);
            }
            KWHzl(jsonParser.KWHzl());
            jsonTokenDjBIcL = jsonParser.RcXXUw();
        } else if (jsonTokenDjBIcL == null) {
            throw new java.lang.IllegalStateException("No token available from argument `JsonParser`");
        }
        int i = AnonymousClass1.EZpvd[jsonTokenDjBIcL.ordinal()];
        if (i == 1) {
            if (this.AkhnZx) {
                KWHzl(jsonParser);
            }
            AkhnZx();
            OLrzqt(jsonParser);
            return;
        }
        if (i == 2) {
            DbNXlk();
            return;
        }
        if (i != 3) {
            if (i == 4) {
                fetchVPNInfo();
                return;
            } else {
                EZpvd(jsonParser, jsonTokenDjBIcL);
                return;
            }
        }
        if (this.AkhnZx) {
            KWHzl(jsonParser);
        }
        values();
        OLrzqt(jsonParser);
    }

    public void OLrzqt(JsonParser jsonParser) throws java.io.IOException {
        int i = 1;
        while (true) {
            com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == null) {
                return;
            }
            int i2 = AnonymousClass1.EZpvd[jsonTokenRcXXUw.ordinal()];
            if (i2 == 1) {
                if (this.AkhnZx) {
                    KWHzl(jsonParser);
                }
                AkhnZx();
            } else if (i2 == 2) {
                DbNXlk();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (i2 == 3) {
                if (this.AkhnZx) {
                    KWHzl(jsonParser);
                }
                values();
            } else if (i2 == 4) {
                fetchVPNInfo();
                i--;
                if (i == 0) {
                    return;
                }
            } else if (i2 == 5) {
                if (this.AkhnZx) {
                    KWHzl(jsonParser);
                }
                KWHzl(jsonParser.KWHzl());
            } else {
                EZpvd(jsonParser, jsonTokenRcXXUw);
            }
            i++;
        }
    }

    public final void EZpvd(JsonParser jsonParser, com.fasterxml.jackson.core.JsonToken jsonToken) throws java.io.IOException {
        if (this.AkhnZx) {
            KWHzl(jsonParser);
        }
        switch (AnonymousClass1.EZpvd[jsonToken.ordinal()]) {
            case 6:
                if (jsonParser.DTwDnp()) {
                    KWHzl(jsonParser.sSMYrx(), jsonParser.zuBGHE(), jsonParser.AwvSrB());
                    return;
                } else {
                    AhwBna(jsonParser.zLjUOn());
                    return;
                }
            case 7:
                int i = AnonymousClass1.KWHzl[jsonParser.uzCIH().ordinal()];
                if (i == 1) {
                    copydefault(jsonParser.getFieldNames());
                    return;
                } else if (i == 2) {
                    KWHzl(jsonParser.gEmmrt());
                    return;
                } else {
                    EZpvd(jsonParser.getNewProxyInstance());
                    return;
                }
            case 8:
                if (this.AYXKKw) {
                    OLrzqt(jsonParser.fJNWhG());
                    return;
                } else {
                    copydefault(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT, jsonParser.iwGUEr());
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
            default:
                throw new java.lang.RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    public final void KWHzl(JsonParser jsonParser) throws java.io.IOException {
        java.lang.Object objAxsJAY = jsonParser.AxsJAY();
        this.fJNWhG = objAxsJAY;
        if (objAxsJAY != null) {
            this.values = true;
        }
        java.lang.Object objAuCTelauCTel = jsonParser.AuCTelauCTel();
        this.ejfBZ = objAuCTelauCTel;
        if (objAuCTelauCTel != null) {
            this.values = true;
        }
    }

    public final void EZpvd(com.fasterxml.jackson.core.JsonToken jsonToken) {
        TaskDescription taskDescriptionAEQbTJ;
        this.fIwbmz.fIwbmz();
        if (this.values) {
            taskDescriptionAEQbTJ = this.DbNXlk.KWHzl(this.djBIcL, jsonToken, this.ejfBZ, this.fJNWhG);
        } else {
            taskDescriptionAEQbTJ = this.DbNXlk.AEQbTJ(this.djBIcL, jsonToken);
        }
        if (taskDescriptionAEQbTJ == null) {
            this.djBIcL++;
        } else {
            this.DbNXlk = taskDescriptionAEQbTJ;
            this.djBIcL = 1;
        }
    }

    public final void copydefault(com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj) {
        TaskDescription taskDescriptionEZpvd;
        this.fIwbmz.fIwbmz();
        if (this.values) {
            taskDescriptionEZpvd = this.DbNXlk.OLrzqt(this.djBIcL, jsonToken, obj, this.ejfBZ, this.fJNWhG);
        } else {
            taskDescriptionEZpvd = this.DbNXlk.EZpvd(this.djBIcL, jsonToken, obj);
        }
        if (taskDescriptionEZpvd == null) {
            this.djBIcL++;
        } else {
            this.DbNXlk = taskDescriptionEZpvd;
            this.djBIcL = 1;
        }
    }

    public final void djBIcL(java.lang.Object obj) {
        TaskDescription taskDescriptionEZpvd;
        if (this.values) {
            taskDescriptionEZpvd = this.DbNXlk.OLrzqt(this.djBIcL, com.fasterxml.jackson.core.JsonToken.FIELD_NAME, obj, this.ejfBZ, this.fJNWhG);
        } else {
            taskDescriptionEZpvd = this.DbNXlk.EZpvd(this.djBIcL, com.fasterxml.jackson.core.JsonToken.FIELD_NAME, obj);
        }
        if (taskDescriptionEZpvd == null) {
            this.djBIcL++;
        } else {
            this.DbNXlk = taskDescriptionEZpvd;
            this.djBIcL = 1;
        }
    }

    public final void AEQbTJ(com.fasterxml.jackson.core.JsonToken jsonToken) {
        TaskDescription taskDescriptionAEQbTJ;
        if (this.values) {
            taskDescriptionAEQbTJ = this.DbNXlk.KWHzl(this.djBIcL, jsonToken, this.ejfBZ, this.fJNWhG);
        } else {
            taskDescriptionAEQbTJ = this.DbNXlk.AEQbTJ(this.djBIcL, jsonToken);
        }
        if (taskDescriptionAEQbTJ == null) {
            this.djBIcL++;
        } else {
            this.DbNXlk = taskDescriptionAEQbTJ;
            this.djBIcL = 1;
        }
    }

    public final void copydefault(com.fasterxml.jackson.core.JsonToken jsonToken) {
        TaskDescription taskDescriptionAEQbTJ = this.DbNXlk.AEQbTJ(this.djBIcL, jsonToken);
        if (taskDescriptionAEQbTJ == null) {
            this.djBIcL++;
        } else {
            this.DbNXlk = taskDescriptionAEQbTJ;
            this.djBIcL = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault() {
        throw new java.lang.UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public static final class Application extends AbstractC5514Ur {
        public AbstractC5505Ui AYXKKw;
        public final boolean AhwBna;
        public YC DbNXlk;
        public boolean KWHzl;
        public transient C5537Vn OLrzqt;
        public final boolean djBIcL;
        public TaskDescription isConnected;
        public final boolean valueOf;
        public JsonLocation gEmmrt = null;
        public int values = -1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void AEQbTJ(JsonLocation jsonLocation) {
            this.gEmmrt = jsonLocation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.core.JsonParser
        public C5541Vr<StreamReadCapability> AubY() {
            return JsonParser.AEQbTJ;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean DTwDnp() {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            if (this.KWHzl) {
                return;
            }
            this.KWHzl = true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.core.JsonParser
        public AbstractC5505Ui values() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.fasterxml.jackson.core.JsonParser
        public AbstractC5503Ug wlaJM() {
            return this.DbNXlk;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int zuBGHE() {
            return 0;
        }

        public Application(TaskDescription taskDescription, AbstractC5505Ui abstractC5505Ui, boolean z, boolean z2, AbstractC5503Ug abstractC5503Ug) {
            this.isConnected = taskDescription;
            this.AYXKKw = abstractC5505Ui;
            this.DbNXlk = YC.AEQbTJ(abstractC5503Ug);
            this.djBIcL = z;
            this.AhwBna = z2;
            this.valueOf = z || z2;
        }

        @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
        public com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
            TaskDescription taskDescription;
            if (this.KWHzl || (taskDescription = this.isConnected) == null) {
                return null;
            }
            int i = this.values + 1;
            this.values = i;
            if (i >= 16) {
                this.values = 0;
                TaskDescription taskDescriptionEZpvd = taskDescription.EZpvd();
                this.isConnected = taskDescriptionEZpvd;
                if (taskDescriptionEZpvd == null) {
                    return null;
                }
            }
            com.fasterxml.jackson.core.JsonToken jsonTokenDjBIcL = this.isConnected.djBIcL(this.values);
            this.QVAiDq = jsonTokenDjBIcL;
            if (jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
                java.lang.Object objDxcTrN = dxcTrN();
                this.DbNXlk.EZpvd(objDxcTrN instanceof java.lang.String ? (java.lang.String) objDxcTrN : objDxcTrN.toString());
            } else if (jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
                this.DbNXlk = this.DbNXlk.values();
            } else if (jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
                this.DbNXlk = this.DbNXlk.AkhnZx();
            } else if (jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.END_OBJECT || jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                this.DbNXlk = this.DbNXlk.fetchVPNInfo();
            } else {
                this.DbNXlk.fARcdN();
            }
            return this.QVAiDq;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public java.lang.String QbewEr() throws java.io.IOException {
            TaskDescription taskDescription;
            if (!this.KWHzl && (taskDescription = this.isConnected) != null) {
                int i = this.values + 1;
                if (i < 16) {
                    com.fasterxml.jackson.core.JsonToken jsonTokenDjBIcL = taskDescription.djBIcL(i);
                    com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
                    if (jsonTokenDjBIcL == jsonToken) {
                        this.values = i;
                        this.QVAiDq = jsonToken;
                        java.lang.Object objEZpvd = this.isConnected.EZpvd(i);
                        java.lang.String string = objEZpvd instanceof java.lang.String ? (java.lang.String) objEZpvd : objEZpvd.toString();
                        this.DbNXlk.EZpvd(string);
                        return string;
                    }
                }
                if (RcXXUw() == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
                    return KWHzl();
                }
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation gHZMYf() {
            return fetchVPNInfo();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation fetchVPNInfo() {
            JsonLocation jsonLocation = this.gEmmrt;
            return jsonLocation == null ? JsonLocation.NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public java.lang.String KWHzl() {
            com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT || jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
                return this.DbNXlk.AEQbTJ().copydefault();
            }
            return this.DbNXlk.copydefault();
        }

        @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
        public java.lang.String isConnected() {
            return KWHzl();
        }

        @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
        public java.lang.String zLjUOn() {
            com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING || jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
                java.lang.Object objDxcTrN = dxcTrN();
                if (objDxcTrN instanceof java.lang.String) {
                    return (java.lang.String) objDxcTrN;
                }
                return C5619Yr.EZpvd(objDxcTrN);
            }
            if (jsonToken == null) {
                return null;
            }
            int i = AnonymousClass1.EZpvd[jsonToken.ordinal()];
            if (i == 7 || i == 8) {
                return C5619Yr.EZpvd(dxcTrN());
            }
            return this.QVAiDq.asString();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public char[] sSMYrx() {
            java.lang.String strZLjUOn = zLjUOn();
            if (strZLjUOn == null) {
                return null;
            }
            return strZLjUOn.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int AwvSrB() {
            java.lang.String strZLjUOn = zLjUOn();
            if (strZLjUOn == null) {
                return 0;
            }
            return strZLjUOn.length();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean QfsBiF() {
            if (this.QVAiDq != com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            java.lang.Object objDxcTrN = dxcTrN();
            if (objDxcTrN instanceof java.lang.Double) {
                java.lang.Double d = (java.lang.Double) objDxcTrN;
                return d.isNaN() || d.isInfinite();
            }
            if (!(objDxcTrN instanceof java.lang.Float)) {
                return false;
            }
            java.lang.Float f = (java.lang.Float) objDxcTrN;
            return f.isNaN() || f.isInfinite();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public java.math.BigInteger gEmmrt() throws java.io.IOException {
            java.lang.Number numberHDKMBd = hDKMBd();
            if (numberHDKMBd instanceof java.math.BigInteger) {
                return (java.math.BigInteger) numberHDKMBd;
            }
            if (uzCIH() == JsonParser.NumberType.BIG_DECIMAL) {
                return ((BigDecimal) numberHDKMBd).toBigInteger();
            }
            return java.math.BigInteger.valueOf(numberHDKMBd.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal fJNWhG() throws java.io.IOException {
            java.lang.Number numberHDKMBd = hDKMBd();
            if (numberHDKMBd instanceof BigDecimal) {
                return (BigDecimal) numberHDKMBd;
            }
            int i = AnonymousClass1.KWHzl[uzCIH().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new BigDecimal((java.math.BigInteger) numberHDKMBd);
                }
                if (i != 5) {
                    return BigDecimal.valueOf(numberHDKMBd.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberHDKMBd.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double fARcdN() throws java.io.IOException {
            return hDKMBd().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float ejfBZ() throws java.io.IOException {
            return hDKMBd().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getFieldNames() throws java.io.IOException {
            java.lang.Number numberHDKMBd = this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT ? (java.lang.Number) dxcTrN() : hDKMBd();
            if ((numberHDKMBd instanceof java.lang.Integer) || AEQbTJ(numberHDKMBd)) {
                return numberHDKMBd.intValue();
            }
            return copydefault(numberHDKMBd);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long getNewProxyInstance() throws java.io.IOException {
            java.lang.Number numberHDKMBd = this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT ? (java.lang.Number) dxcTrN() : hDKMBd();
            if ((numberHDKMBd instanceof java.lang.Long) || OLrzqt(numberHDKMBd)) {
                return numberHDKMBd.longValue();
            }
            return EZpvd(numberHDKMBd);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType uzCIH() throws java.io.IOException {
            java.lang.Number numberHDKMBd = hDKMBd();
            if (numberHDKMBd instanceof java.lang.Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberHDKMBd instanceof java.lang.Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberHDKMBd instanceof java.lang.Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberHDKMBd instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberHDKMBd instanceof java.math.BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberHDKMBd instanceof java.lang.Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberHDKMBd instanceof java.lang.Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final java.lang.Number hDKMBd() throws java.io.IOException {
            djSkpj();
            java.lang.Object objDxcTrN = dxcTrN();
            if (objDxcTrN instanceof java.lang.Number) {
                return (java.lang.Number) objDxcTrN;
            }
            if (objDxcTrN instanceof java.lang.String) {
                java.lang.String str = (java.lang.String) objDxcTrN;
                if (str.indexOf(46) >= 0) {
                    return java.lang.Double.valueOf(C5522Uy.KWHzl(str, KWHzl(StreamReadFeature.USE_FAST_DOUBLE_PARSER)));
                }
                return java.lang.Long.valueOf(C5522Uy.AYXKKw(str));
            }
            if (objDxcTrN == null) {
                return null;
            }
            throw new java.lang.IllegalStateException("Internal error: entry should be a Number, but is of type " + objDxcTrN.getClass().getName());
        }

        public final boolean AEQbTJ(java.lang.Number number) {
            return (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
        }

        public final boolean OLrzqt(java.lang.Number number) {
            return (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
        }

        public int copydefault(java.lang.Number number) throws java.io.IOException {
            if (number instanceof java.lang.Long) {
                long jLongValue = number.longValue();
                int i = (int) jLongValue;
                if (i != jLongValue) {
                    DXXBbs();
                }
                return i;
            }
            if (number instanceof java.math.BigInteger) {
                java.math.BigInteger bigInteger = (java.math.BigInteger) number;
                if (AbstractC5514Ur.DTwDnp.compareTo(bigInteger) > 0 || AbstractC5514Ur.ORxRYg.compareTo(bigInteger) < 0) {
                    DXXBbs();
                }
            } else {
                if ((number instanceof java.lang.Double) || (number instanceof java.lang.Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d) {
                        DXXBbs();
                    }
                    return (int) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (AbstractC5514Ur.QOLQEE.compareTo(bigDecimal) > 0 || AbstractC5514Ur.AwvSrB.compareTo(bigDecimal) < 0) {
                        DXXBbs();
                    }
                } else {
                    DarRvM();
                }
            }
            return number.intValue();
        }

        public long EZpvd(java.lang.Number number) throws java.io.IOException {
            if (number instanceof java.math.BigInteger) {
                java.math.BigInteger bigInteger = (java.math.BigInteger) number;
                if (AbstractC5514Ur.QbewEr.compareTo(bigInteger) > 0 || AbstractC5514Ur.OcIXYQ.compareTo(bigInteger) < 0) {
                    getPostValueLengthLimit();
                }
            } else {
                if ((number instanceof java.lang.Double) || (number instanceof java.lang.Float)) {
                    double dDoubleValue = number.doubleValue();
                    if (dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                        getPostValueLengthLimit();
                    }
                    return (long) dDoubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (AbstractC5514Ur.QKVWgx.compareTo(bigDecimal) > 0 || AbstractC5514Ur.zuBGHE.compareTo(bigDecimal) < 0) {
                        getPostValueLengthLimit();
                    }
                } else {
                    DarRvM();
                }
            }
            return number.longValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public java.lang.Object AuCTel() {
            if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT) {
                return dxcTrN();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public byte[] copydefault(Base64Variant base64Variant) throws java.io.IOException {
            if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT) {
                java.lang.Object objDxcTrN = dxcTrN();
                if (objDxcTrN instanceof byte[]) {
                    return (byte[]) objDxcTrN;
                }
            }
            if (this.QVAiDq != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
                throw EZpvd("Current token (" + this.QVAiDq + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            java.lang.String strZLjUOn = zLjUOn();
            if (strZLjUOn == null) {
                return null;
            }
            C5537Vn c5537Vn = this.OLrzqt;
            if (c5537Vn == null) {
                c5537Vn = new C5537Vn(100);
                this.OLrzqt = c5537Vn;
            } else {
                c5537Vn.djBIcL();
            }
            KWHzl(strZLjUOn, c5537Vn, base64Variant);
            return c5537Vn.AYXKKw();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int KWHzl(Base64Variant base64Variant, java.io.OutputStream outputStream) throws java.io.IOException {
            byte[] bArrCopydefault = copydefault(base64Variant);
            if (bArrCopydefault == null) {
                return 0;
            }
            outputStream.write(bArrCopydefault, 0, bArrCopydefault.length);
            return bArrCopydefault.length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public java.lang.Object AxsJAY() {
            return this.isConnected.AEQbTJ(this.values);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public java.lang.Object AuCTelauCTel() {
            return this.isConnected.KWHzl(this.values);
        }

        public final java.lang.Object dxcTrN() {
            return this.isConnected.EZpvd(this.values);
        }

        public final void djSkpj() throws JacksonException {
            com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                throw EZpvd("Current token (" + this.QVAiDq + ") not numeric, cannot use numeric value accessors");
            }
        }

        @Override // o.AbstractC5514Ur
        public void gGvvIC() {
            DarRvM();
        }
    }

    public static final class TaskDescription {
        public static final com.fasterxml.jackson.core.JsonToken[] AEQbTJ;
        public TaskDescription EZpvd;
        public long KWHzl;
        public final java.lang.Object[] OLrzqt = new java.lang.Object[16];
        public TreeMap<java.lang.Integer, java.lang.Object> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription EZpvd() {
            return this.EZpvd;
        }

        public final int OLrzqt(int i) {
            return i + i;
        }

        public final int copydefault(int i) {
            return i + i + 1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean copydefault() {
            return this.copydefault != null;
        }

        static {
            com.fasterxml.jackson.core.JsonToken[] jsonTokenArr = new com.fasterxml.jackson.core.JsonToken[16];
            AEQbTJ = jsonTokenArr;
            com.fasterxml.jackson.core.JsonToken[] jsonTokenArrValues = com.fasterxml.jackson.core.JsonToken.values();
            java.lang.System.arraycopy(jsonTokenArrValues, 1, jsonTokenArr, 1, java.lang.Math.min(15, jsonTokenArrValues.length - 1));
        }

        public com.fasterxml.jackson.core.JsonToken djBIcL(int i) {
            long j = this.KWHzl;
            if (i > 0) {
                j >>= i << 2;
            }
            return AEQbTJ[((int) j) & 15];
        }

        public java.lang.Object EZpvd(int i) {
            return this.OLrzqt[i];
        }

        public TaskDescription AEQbTJ(int i, com.fasterxml.jackson.core.JsonToken jsonToken) {
            if (i < 16) {
                copydefault(i, jsonToken);
                return null;
            }
            TaskDescription taskDescription = new TaskDescription();
            this.EZpvd = taskDescription;
            taskDescription.copydefault(0, jsonToken);
            return this.EZpvd;
        }

        public TaskDescription KWHzl(int i, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj, java.lang.Object obj2) {
            if (i < 16) {
                EZpvd(i, jsonToken, obj, obj2);
                return null;
            }
            TaskDescription taskDescription = new TaskDescription();
            this.EZpvd = taskDescription;
            taskDescription.EZpvd(0, jsonToken, obj, obj2);
            return this.EZpvd;
        }

        public TaskDescription EZpvd(int i, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj) {
            if (i < 16) {
                KWHzl(i, jsonToken, obj);
                return null;
            }
            TaskDescription taskDescription = new TaskDescription();
            this.EZpvd = taskDescription;
            taskDescription.KWHzl(0, jsonToken, obj);
            return this.EZpvd;
        }

        public TaskDescription OLrzqt(int i, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            if (i < 16) {
                EZpvd(i, jsonToken, obj, obj2, obj3);
                return null;
            }
            TaskDescription taskDescription = new TaskDescription();
            this.EZpvd = taskDescription;
            taskDescription.EZpvd(0, jsonToken, obj, obj2, obj3);
            return this.EZpvd;
        }

        public final void copydefault(int i, com.fasterxml.jackson.core.JsonToken jsonToken) {
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.KWHzl |= jOrdinal;
        }

        public final void EZpvd(int i, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj, java.lang.Object obj2) {
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.KWHzl = jOrdinal | this.KWHzl;
            copydefault(i, obj, obj2);
        }

        public final void KWHzl(int i, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj) {
            this.OLrzqt[i] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.KWHzl |= jOrdinal;
        }

        public final void EZpvd(int i, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            this.OLrzqt[i] = obj;
            long jOrdinal = jsonToken.ordinal();
            if (i > 0) {
                jOrdinal <<= i << 2;
            }
            this.KWHzl = jOrdinal | this.KWHzl;
            copydefault(i, obj2, obj3);
        }

        public final void copydefault(int i, java.lang.Object obj, java.lang.Object obj2) {
            if (this.copydefault == null) {
                this.copydefault = new TreeMap<>();
            }
            if (obj != null) {
                this.copydefault.put(java.lang.Integer.valueOf(copydefault(i)), obj);
            }
            if (obj2 != null) {
                this.copydefault.put(java.lang.Integer.valueOf(OLrzqt(i)), obj2);
            }
        }

        public java.lang.Object KWHzl(int i) {
            TreeMap<java.lang.Integer, java.lang.Object> treeMap = this.copydefault;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(java.lang.Integer.valueOf(copydefault(i)));
        }

        public java.lang.Object AEQbTJ(int i) {
            TreeMap<java.lang.Integer, java.lang.Object> treeMap = this.copydefault;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(java.lang.Integer.valueOf(OLrzqt(i)));
        }
    }
}
