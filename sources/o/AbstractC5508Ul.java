package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.io.ContentReference;
import java.math.BigDecimal;

/* JADX INFO: renamed from: o.Ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5508Ul extends AbstractC5514Ur {
    public static final C5541Vr<StreamReadCapability> KWHzl = JsonParser.AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public final C5517Ut AuCTel;
    public java.lang.String AuCTelauCTel;
    public UU AubY;
    public long AxsJAY;
    public int DbNXlk;
    public byte[] OLrzqt;
    public boolean djBIcL;
    public int ejfBZ;
    public boolean fARcdN;
    public com.fasterxml.jackson.core.JsonToken fIwbmz;
    public char[] fJNWhG;
    public int fetchVPNInfo;
    public long gEmmrt;
    public int gHZMYf;
    public float getFieldNames;
    public int getNewProxyInstance;
    public java.math.BigInteger hDKMBd;
    public int isConnected;
    public BigDecimal iwGUEr;
    public int sSMYrx;
    public double uzCIH;
    public C5537Vn valueOf;
    public int values;
    public boolean wlaJM;
    public long zLjUOn;
    public final C5544Vu zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: wlaJM()Lo/Ug; */
    @Override // com.fasterxml.jackson.core.JsonParser
    /* JADX INFO: renamed from: AxsJAYsNCnLh, reason: merged with bridge method [inline-methods] */
    public UU wlaJM() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DCJXGO() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OqFWZa() {
        int i = this.sSMYrx;
        return i < 0 ? i : i + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long accept() {
        return this.AxsJAY;
    }

    public abstract void djSkpj() throws java.io.IOException;

    public void fFgQHt() throws java.io.IOException {
    }

    public AbstractC5508Ul(C5517Ut c5517Ut, int i) {
        super(i);
        this.AhwBna = 1;
        this.gHZMYf = 1;
        this.ejfBZ = 0;
        this.AuCTel = c5517Ut;
        this.zsXlph = c5517Ut.djBIcL();
        this.AubY = UU.AEQbTJ(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? UV.copydefault(this) : null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void KWHzl(java.lang.Object obj) {
        this.AubY.copydefault(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser EZpvd(JsonParser.Feature feature) {
        this.EZpvd |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this.AubY.AkhnZx() == null) {
            this.AubY = this.AubY.copydefault(UV.copydefault(this));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @java.lang.Deprecated
    public JsonParser EZpvd(int i) {
        int i2 = this.EZpvd ^ i;
        if (i2 != 0) {
            this.EZpvd = i;
            copydefault(i, i2);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser AEQbTJ(int i, int i2) {
        int i3 = this.EZpvd;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.EZpvd = i4;
            copydefault(i4, i5);
        }
        return this;
    }

    public void copydefault(int i, int i2) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i2 & mask) == 0 || (i & mask) == 0) {
            return;
        }
        if (this.AubY.AkhnZx() == null) {
            this.AubY = this.AubY.copydefault(UV.copydefault(this));
        } else {
            this.AubY = this.AubY.copydefault((UV) null);
        }
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String isConnected() throws java.io.IOException {
        UU uuAEQbTJ;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if ((jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT || jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) && (uuAEQbTJ = this.AubY.AEQbTJ()) != null) {
            return uuAEQbTJ.copydefault();
        }
        return this.AubY.copydefault();
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.djBIcL) {
            return;
        }
        this.fetchVPNInfo = java.lang.Math.max(this.fetchVPNInfo, this.isConnected);
        this.djBIcL = true;
        try {
            djSkpj();
        } finally {
            fvQaOB();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation gHZMYf() {
        return new JsonLocation(dvKsVJ(), -1L, accept(), DCJXGO(), OqFWZa());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation fetchVPNInfo() {
        return new JsonLocation(dvKsVJ(), -1L, this.gEmmrt + ((long) this.fetchVPNInfo), this.AhwBna, (this.fetchVPNInfo - this.AYXKKw) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean DTwDnp() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return this.fARcdN;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] copydefault(Base64Variant base64Variant) throws java.io.IOException {
        if (this.OLrzqt == null) {
            if (this.QVAiDq != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
                valueOf("Current token (" + this.QVAiDq + ") not VALUE_STRING, can not access as binary");
            }
            C5537Vn c5537VnFlVtFt = flVtFt();
            KWHzl(zLjUOn(), c5537VnFlVtFt, base64Variant);
            this.OLrzqt = c5537VnFlVtFt.AYXKKw();
        }
        return this.OLrzqt;
    }

    public void fvQaOB() throws java.io.IOException {
        this.zsXlph.fetchVPNInfo();
        char[] cArr = this.fJNWhG;
        if (cArr != null) {
            this.fJNWhG = null;
            this.AuCTel.copydefault(cArr);
        }
    }

    @Override // o.AbstractC5514Ur
    public void gGvvIC() throws JsonParseException {
        if (this.AubY.isConnected()) {
            return;
        }
        OLrzqt(java.lang.String.format(": expected close marker for %s (start marker at %s)", this.AubY.valueOf() ? "Array" : "Object", this.AubY.OLrzqt(dvKsVJ())), (com.fasterxml.jackson.core.JsonToken) null);
    }

    public final int dxcTrN() throws JsonParseException {
        gGvvIC();
        return -1;
    }

    public C5537Vn flVtFt() {
        C5537Vn c5537Vn = this.valueOf;
        if (c5537Vn == null) {
            this.valueOf = new C5537Vn();
        } else {
            c5537Vn.djBIcL();
        }
        return this.valueOf;
    }

    public final com.fasterxml.jackson.core.JsonToken KWHzl(boolean z, int i) {
        this.wlaJM = z;
        this.values = i;
        this.AkhnZx = 0;
        this.DbNXlk = 0;
        this.ejfBZ = 0;
        return com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    }

    public final com.fasterxml.jackson.core.JsonToken copydefault(boolean z, int i, int i2, int i3) {
        this.wlaJM = z;
        this.values = i;
        this.AkhnZx = i2;
        this.DbNXlk = i3;
        this.ejfBZ = 0;
        return com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final com.fasterxml.jackson.core.JsonToken EZpvd(java.lang.String str, double d) {
        this.zsXlph.KWHzl(str);
        this.uzCIH = d;
        this.ejfBZ = 8;
        return com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean QfsBiF() {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT && (this.ejfBZ & 8) != 0) {
            double d = this.uzCIH;
            if (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.Number hDKMBd() throws java.io.IOException {
        if (this.ejfBZ == 0) {
            copydefault(0);
        }
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT) {
            int i = this.ejfBZ;
            if ((i & 1) != 0) {
                return java.lang.Integer.valueOf(this.getNewProxyInstance);
            }
            if ((i & 2) != 0) {
                return java.lang.Long.valueOf(this.zLjUOn);
            }
            if ((i & 4) != 0) {
                return giSNqX();
            }
            DarRvM();
        }
        int i2 = this.ejfBZ;
        if ((i2 & 16) != 0) {
            return finit();
        }
        if ((i2 & 32) != 0) {
            return java.lang.Float.valueOf(this.getFieldNames);
        }
        if ((i2 & 8) == 0) {
            DarRvM();
        }
        return java.lang.Double.valueOf(this.uzCIH);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.Number iwGUEr() throws java.io.IOException {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT) {
            if (this.ejfBZ == 0) {
                copydefault(0);
            }
            int i = this.ejfBZ;
            if ((i & 1) != 0) {
                return java.lang.Integer.valueOf(this.getNewProxyInstance);
            }
            if ((i & 2) != 0) {
                return java.lang.Long.valueOf(this.zLjUOn);
            }
            if ((i & 4) != 0) {
                return giSNqX();
            }
            DarRvM();
        }
        if (this.ejfBZ == 0) {
            copydefault(16);
        }
        int i2 = this.ejfBZ;
        if ((i2 & 16) != 0) {
            return finit();
        }
        if ((i2 & 32) != 0) {
            return java.lang.Float.valueOf(this.getFieldNames);
        }
        if ((i2 & 8) == 0) {
            DarRvM();
        }
        return java.lang.Double.valueOf(this.uzCIH);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType uzCIH() throws java.io.IOException {
        if (this.ejfBZ == 0) {
            copydefault(0);
        }
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT) {
            int i = this.ejfBZ;
            if ((i & 1) != 0) {
                return JsonParser.NumberType.INT;
            }
            if ((i & 2) != 0) {
                return JsonParser.NumberType.LONG;
            }
            return JsonParser.NumberType.BIG_INTEGER;
        }
        int i2 = this.ejfBZ;
        if ((i2 & 16) != 0) {
            return JsonParser.NumberType.BIG_DECIMAL;
        }
        if ((i2 & 32) != 0) {
            return JsonParser.NumberType.FLOAT;
        }
        return JsonParser.NumberType.DOUBLE;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getFieldNames() throws java.io.IOException {
        int i = this.ejfBZ;
        int i2 = i & 1;
        if (i2 == 0) {
            if (i == 0) {
                return gasjUx();
            }
            if (i2 == 0) {
                RlQdEF();
            }
        }
        return this.getNewProxyInstance;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getNewProxyInstance() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 2) == 0) {
            if (i == 0) {
                copydefault(2);
            }
            if ((this.ejfBZ & 2) == 0) {
                QKudOq();
            }
        }
        return this.zLjUOn;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.math.BigInteger gEmmrt() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 4) == 0) {
            if (i == 0) {
                copydefault(4);
            }
            if ((this.ejfBZ & 4) == 0) {
                iZzfmt();
            }
        }
        return giSNqX();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float ejfBZ() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 32) == 0) {
            if (i == 0) {
                copydefault(32);
            }
            if ((this.ejfBZ & 32) == 0) {
                DAIeex();
            }
        }
        return this.getFieldNames;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double fARcdN() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 8) == 0) {
            if (i == 0) {
                copydefault(8);
            }
            if ((this.ejfBZ & 8) == 0) {
                hUfVAv();
            }
        }
        return this.uzCIH;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal fJNWhG() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 16) == 0) {
            if (i == 0) {
                copydefault(16);
            }
            if ((this.ejfBZ & 16) == 0) {
                gkJEwt();
            }
        }
        return finit();
    }

    public void copydefault(int i) throws java.io.IOException {
        if (this.djBIcL) {
            valueOf("Internal error: _parseNumericValue called when parser instance closed");
        }
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
                KWHzl(i);
                return;
            } else {
                EZpvd("Current token (%s) not numeric, can not use numeric value accessors", (java.lang.Object) jsonToken);
                return;
            }
        }
        int i2 = this.values;
        if (i2 <= 9) {
            this.getNewProxyInstance = this.zsXlph.EZpvd(this.wlaJM);
            this.ejfBZ = 1;
            return;
        }
        if (i2 <= 18) {
            long jKWHzl = this.zsXlph.KWHzl(this.wlaJM);
            if (i2 == 10) {
                if (this.wlaJM) {
                    if (jKWHzl >= -2147483648L) {
                        this.getNewProxyInstance = (int) jKWHzl;
                        this.ejfBZ = 1;
                        return;
                    }
                } else if (jKWHzl <= 2147483647L) {
                    this.getNewProxyInstance = (int) jKWHzl;
                    this.ejfBZ = 1;
                    return;
                }
            }
            this.zLjUOn = jKWHzl;
            this.ejfBZ = 2;
            return;
        }
        gEmmrt(i);
    }

    public int gasjUx() throws java.io.IOException {
        if (this.djBIcL) {
            valueOf("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT && this.values <= 9) {
            int iEZpvd = this.zsXlph.EZpvd(this.wlaJM);
            this.getNewProxyInstance = iEZpvd;
            this.ejfBZ = 1;
            return iEZpvd;
        }
        copydefault(1);
        if ((this.ejfBZ & 1) == 0) {
            RlQdEF();
        }
        return this.getNewProxyInstance;
    }

    public final void KWHzl(int i) throws java.io.IOException {
        try {
            if (i == 16) {
                this.iwGUEr = null;
                this.AuCTelauCTel = this.zsXlph.copydefault();
                this.ejfBZ = 16;
            } else if (i == 32) {
                this.getFieldNames = this.zsXlph.OLrzqt(copydefault(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
                this.ejfBZ = 32;
            } else {
                this.uzCIH = this.zsXlph.AEQbTJ(copydefault(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
                this.ejfBZ = 8;
            }
        } catch (java.lang.NumberFormatException e) {
            EZpvd("Malformed numeric value (" + copydefault(this.zsXlph.copydefault()) + ")", (java.lang.Throwable) e);
        }
    }

    public final void gEmmrt(int i) throws java.io.IOException {
        java.lang.String strCopydefault = this.zsXlph.copydefault();
        try {
            int i2 = this.values;
            char[] cArrValueOf = this.zsXlph.valueOf();
            int iIsConnected = this.zsXlph.isConnected();
            boolean z = this.wlaJM;
            if (z) {
                iIsConnected++;
            }
            if (C5522Uy.OLrzqt(cArrValueOf, iIsConnected, i2, z)) {
                this.zLjUOn = java.lang.Long.parseLong(strCopydefault);
                this.ejfBZ = 2;
                return;
            }
            if (i == 1 || i == 2) {
                KWHzl(i, strCopydefault);
            }
            if (i != 8 && i != 32) {
                this.hDKMBd = null;
                this.AuCTelauCTel = strCopydefault;
                this.ejfBZ = 4;
                return;
            }
            this.uzCIH = C5522Uy.KWHzl(strCopydefault, copydefault(JsonParser.Feature.USE_FAST_DOUBLE_PARSER));
            this.ejfBZ = 8;
        } catch (java.lang.NumberFormatException e) {
            EZpvd("Malformed numeric value (" + copydefault(strCopydefault) + ")", (java.lang.Throwable) e);
        }
    }

    public void KWHzl(int i, java.lang.String str) throws java.io.IOException {
        if (i == 1) {
            djBIcL(str);
        } else {
            gEmmrt(str);
        }
    }

    public void RlQdEF() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 2) != 0) {
            long j = this.zLjUOn;
            int i2 = (int) j;
            if (i2 != j) {
                EZpvd(zLjUOn(), djBIcL());
            }
            this.getNewProxyInstance = i2;
        } else if ((i & 4) != 0) {
            java.math.BigInteger bigIntegerGiSNqX = giSNqX();
            if (AbstractC5514Ur.DTwDnp.compareTo(bigIntegerGiSNqX) > 0 || AbstractC5514Ur.ORxRYg.compareTo(bigIntegerGiSNqX) < 0) {
                DXXBbs();
            }
            this.getNewProxyInstance = bigIntegerGiSNqX.intValue();
        } else if ((i & 8) != 0) {
            double d = this.uzCIH;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                DXXBbs();
            }
            this.getNewProxyInstance = (int) this.uzCIH;
        } else if ((i & 16) != 0) {
            BigDecimal bigDecimalFinit = finit();
            if (AbstractC5514Ur.QOLQEE.compareTo(bigDecimalFinit) > 0 || AbstractC5514Ur.AwvSrB.compareTo(bigDecimalFinit) < 0) {
                DXXBbs();
            }
            this.getNewProxyInstance = bigDecimalFinit.intValue();
        } else {
            DarRvM();
        }
        this.ejfBZ |= 1;
    }

    public void QKudOq() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 1) != 0) {
            this.zLjUOn = this.getNewProxyInstance;
        } else if ((i & 4) != 0) {
            java.math.BigInteger bigIntegerGiSNqX = giSNqX();
            if (AbstractC5514Ur.QbewEr.compareTo(bigIntegerGiSNqX) > 0 || AbstractC5514Ur.OcIXYQ.compareTo(bigIntegerGiSNqX) < 0) {
                getPostValueLengthLimit();
            }
            this.zLjUOn = bigIntegerGiSNqX.longValue();
        } else if ((i & 8) != 0) {
            double d = this.uzCIH;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                getPostValueLengthLimit();
            }
            this.zLjUOn = (long) this.uzCIH;
        } else if ((i & 16) != 0) {
            BigDecimal bigDecimalFinit = finit();
            if (AbstractC5514Ur.QKVWgx.compareTo(bigDecimalFinit) > 0 || AbstractC5514Ur.zuBGHE.compareTo(bigDecimalFinit) < 0) {
                getPostValueLengthLimit();
            }
            this.zLjUOn = bigDecimalFinit.longValue();
        } else {
            DarRvM();
        }
        this.ejfBZ |= 2;
    }

    public void iZzfmt() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 16) != 0) {
            this.hDKMBd = finit().toBigInteger();
        } else if ((i & 2) != 0) {
            this.hDKMBd = java.math.BigInteger.valueOf(this.zLjUOn);
        } else if ((i & 1) != 0) {
            this.hDKMBd = java.math.BigInteger.valueOf(this.getNewProxyInstance);
        } else if ((i & 8) != 0) {
            this.hDKMBd = BigDecimal.valueOf(this.uzCIH).toBigInteger();
        } else {
            DarRvM();
        }
        this.ejfBZ |= 4;
    }

    public void hUfVAv() throws java.io.IOException {
        double dDoubleValue;
        int i = this.ejfBZ;
        if ((i & 16) != 0) {
            this.uzCIH = finit().doubleValue();
        } else {
            if ((i & 4) != 0) {
                dDoubleValue = giSNqX().doubleValue();
            } else if ((i & 2) != 0) {
                dDoubleValue = this.zLjUOn;
            } else if ((i & 1) != 0) {
                dDoubleValue = this.getNewProxyInstance;
            } else if ((i & 32) != 0) {
                dDoubleValue = this.getFieldNames;
            } else {
                DarRvM();
            }
            this.uzCIH = dDoubleValue;
        }
        this.ejfBZ |= 8;
    }

    public void DAIeex() throws java.io.IOException {
        float fFloatValue;
        int i = this.ejfBZ;
        if ((i & 16) != 0) {
            this.getFieldNames = finit().floatValue();
        } else {
            if ((i & 4) != 0) {
                fFloatValue = giSNqX().floatValue();
            } else if ((i & 2) != 0) {
                fFloatValue = this.zLjUOn;
            } else if ((i & 1) != 0) {
                fFloatValue = this.getNewProxyInstance;
            } else if ((i & 8) != 0) {
                fFloatValue = (float) this.uzCIH;
            } else {
                DarRvM();
            }
            this.getFieldNames = fFloatValue;
        }
        this.ejfBZ |= 32;
    }

    public void gkJEwt() throws java.io.IOException {
        int i = this.ejfBZ;
        if ((i & 8) != 0) {
            this.iwGUEr = C5522Uy.OLrzqt(zLjUOn());
        } else if ((i & 4) != 0) {
            this.iwGUEr = new BigDecimal(giSNqX());
        } else if ((i & 2) != 0) {
            this.iwGUEr = BigDecimal.valueOf(this.zLjUOn);
        } else if ((i & 1) != 0) {
            this.iwGUEr = BigDecimal.valueOf(this.getNewProxyInstance);
        } else {
            DarRvM();
        }
        this.ejfBZ |= 16;
    }

    public java.math.BigInteger giSNqX() {
        java.math.BigInteger bigInteger = this.hDKMBd;
        if (bigInteger != null) {
            return bigInteger;
        }
        java.lang.String str = this.AuCTelauCTel;
        if (str == null) {
            throw new java.lang.IllegalStateException("cannot get BigInteger from current parser state");
        }
        java.math.BigInteger bigIntegerKWHzl = C5522Uy.KWHzl(str);
        this.hDKMBd = bigIntegerKWHzl;
        this.AuCTelauCTel = null;
        return bigIntegerKWHzl;
    }

    public BigDecimal finit() {
        BigDecimal bigDecimal = this.iwGUEr;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        java.lang.String str = this.AuCTelauCTel;
        if (str == null) {
            throw new java.lang.IllegalStateException("cannot get BigDecimal from current parser state");
        }
        BigDecimal bigDecimalOLrzqt = C5522Uy.OLrzqt(str);
        this.iwGUEr = bigDecimalOLrzqt;
        this.AuCTelauCTel = null;
        return bigDecimalOLrzqt;
    }

    public void copydefault(int i, char c) throws JsonParseException {
        UU uuWlaJM = wlaJM();
        valueOf(java.lang.String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", java.lang.Character.valueOf((char) i), java.lang.Character.valueOf(c), uuWlaJM.DbNXlk(), uuWlaJM.OLrzqt(dvKsVJ())));
    }

    public char copydefault(char c) throws JsonProcessingException {
        if (copydefault(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c;
        }
        if (c == '\'' && copydefault(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c;
        }
        valueOf("Unrecognized character escape " + AbstractC5514Ur.AYXKKw(c));
        return c;
    }

    public void EZpvd(int i, java.lang.String str) throws JsonParseException {
        if (!copydefault(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32) {
            valueOf("Illegal unquoted character (" + AbstractC5514Ur.AYXKKw((char) i) + "): has to be escaped using backslash to be included in " + str);
        }
    }

    public java.lang.String AxsJAYaxsJAY() throws java.io.IOException {
        return iRxXKY();
    }

    public java.lang.String iRxXKY() throws java.io.IOException {
        return copydefault(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public char fZBcTu() throws java.io.IOException {
        throw new java.lang.UnsupportedOperationException();
    }

    public final int OLrzqt(Base64Variant base64Variant, int i, int i2) throws java.io.IOException {
        if (i != 92) {
            throw copydefault(base64Variant, i, i2);
        }
        char cFZBcTu = fZBcTu();
        if (cFZBcTu <= ' ' && i2 == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char((int) cFZBcTu);
        if (iDecodeBase64Char >= 0 || iDecodeBase64Char == -2) {
            return iDecodeBase64Char;
        }
        throw copydefault(base64Variant, cFZBcTu, i2);
    }

    public final int KWHzl(Base64Variant base64Variant, char c, int i) throws java.io.IOException {
        if (c != '\\') {
            throw copydefault(base64Variant, c, i);
        }
        char cFZBcTu = fZBcTu();
        if (cFZBcTu <= ' ' && i == 0) {
            return -1;
        }
        int iDecodeBase64Char = base64Variant.decodeBase64Char(cFZBcTu);
        if (iDecodeBase64Char >= 0 || (iDecodeBase64Char == -2 && i >= 2)) {
            return iDecodeBase64Char;
        }
        throw copydefault(base64Variant, cFZBcTu, i);
    }

    public java.lang.IllegalArgumentException copydefault(Base64Variant base64Variant, int i, int i2) throws java.lang.IllegalArgumentException {
        return KWHzl(base64Variant, i, i2, null);
    }

    public java.lang.IllegalArgumentException KWHzl(Base64Variant base64Variant, int i, int i2, java.lang.String str) throws java.lang.IllegalArgumentException {
        java.lang.String str2;
        if (i <= 32) {
            str2 = java.lang.String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", java.lang.Integer.toHexString(i), java.lang.Integer.valueOf(i2 + 1));
        } else if (base64Variant.usesPaddingChar(i)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i2 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!java.lang.Character.isDefined(i) || java.lang.Character.isISOControl(i)) {
            str2 = "Illegal character (code 0x" + java.lang.Integer.toHexString(i) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + ((char) i) + "' (code 0x" + java.lang.Integer.toHexString(i) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        return new java.lang.IllegalArgumentException(str2);
    }

    public void EZpvd(Base64Variant base64Variant) throws java.io.IOException {
        valueOf(base64Variant.missingPaddingMessage());
    }

    public ContentReference dvKsVJ() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.EZpvd)) {
            return this.AuCTel.valueOf();
        }
        return ContentReference.unknown();
    }

    public static int[] EZpvd(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return java.util.Arrays.copyOf(iArr, iArr.length + i);
    }
}
