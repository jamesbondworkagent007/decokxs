package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: renamed from: o.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5529Vf extends AbstractC5508Ul {
    public int AxsJAYaxsJAY;
    public int dNCPSb;
    public int dvKsVJ;
    public boolean dxcTrN;
    public int fFgQHt;
    public int fZBcTu;
    public int finit;
    public int flVtFt;
    public int fvQaOB;
    public int gGvvIC;
    public int gasjUx;
    public int giSNqX;
    public int gkJEwt;
    public int hUfVAv;
    public int[] iRxXKY;
    public final C5532Vi iZzfmt;
    public static final java.lang.String[] UeEOUB = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public static final double[] RcXXUw = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};

    public static final int EZpvd(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public C5541Vr<StreamReadCapability> AubY() {
        return AbstractC5508Ul.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final com.fasterxml.jackson.core.JsonToken KWHzl(com.fasterxml.jackson.core.JsonToken jsonToken) throws java.io.IOException {
        this.finit = this.fZBcTu;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5508Ul
    public void djSkpj() throws java.io.IOException {
        this.dNCPSb = 0;
        this.isConnected = 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC5505Ui values() {
        return null;
    }

    public AbstractC5529Vf(C5517Ut c5517Ut, int i, C5532Vi c5532Vi) {
        super(c5517Ut, i);
        this.iRxXKY = new int[8];
        this.dxcTrN = false;
        this.dNCPSb = 0;
        this.dvKsVJ = 1;
        this.iZzfmt = c5532Vi;
        this.QVAiDq = null;
        this.finit = 0;
        this.fZBcTu = 1;
    }

    @Override // o.AbstractC5508Ul
    public void fvQaOB() throws java.io.IOException {
        super.fvQaOB();
        this.iZzfmt.AhwBna();
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public boolean DTwDnp() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return this.zsXlph.DbNXlk();
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return this.fARcdN;
        }
        return false;
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation fetchVPNInfo() {
        int i = this.fetchVPNInfo;
        int i2 = this.AYXKKw;
        int iMax = java.lang.Math.max(this.AhwBna, this.dvKsVJ);
        return new JsonLocation(dvKsVJ(), ((long) (this.fetchVPNInfo - this.dNCPSb)) + this.gEmmrt, -1L, iMax, (i - i2) + 1);
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation gHZMYf() {
        return new JsonLocation(dvKsVJ(), this.AxsJAY, -1L, this.gHZMYf, this.sSMYrx);
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String zLjUOn() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return this.zsXlph.copydefault();
        }
        return OLrzqt(jsonToken);
    }

    public final java.lang.String OLrzqt(com.fasterxml.jackson.core.JsonToken jsonToken) {
        int iId;
        if (jsonToken == null || (iId = jsonToken.id()) == -1) {
            return null;
        }
        if (iId == 5) {
            return this.AubY.copydefault();
        }
        if (iId == 6 || iId == 7 || iId == 8) {
            return this.zsXlph.copydefault();
        }
        return jsonToken.asString();
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String QKVWgx() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return this.zsXlph.copydefault();
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return isConnected();
        }
        return super.AEQbTJ((java.lang.String) null);
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String AEQbTJ(java.lang.String str) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return this.zsXlph.copydefault();
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return isConnected();
        }
        return super.AEQbTJ(str);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] sSMYrx() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            if (iId == 6 || iId == 7 || iId == 8) {
                return this.zsXlph.valueOf();
            }
            return this.QVAiDq.asCharArray();
        }
        if (!this.fARcdN) {
            java.lang.String strCopydefault = this.AubY.copydefault();
            int length = strCopydefault.length();
            char[] cArr = this.fJNWhG;
            if (cArr == null) {
                this.fJNWhG = this.AuCTel.AEQbTJ(length);
            } else if (cArr.length < length) {
                this.fJNWhG = new char[length];
            }
            strCopydefault.getChars(0, length, this.fJNWhG, 0);
            this.fARcdN = true;
        }
        return this.fJNWhG;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int AwvSrB() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this.AubY.copydefault().length();
        }
        if (iId == 6 || iId == 7 || iId == 8) {
            return this.zsXlph.values();
        }
        return this.QVAiDq.asCharArray().length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int zuBGHE() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == null) {
            return 0;
        }
        int iId = jsonToken.id();
        if (iId == 6 || iId == 7 || iId == 8) {
            return this.zsXlph.isConnected();
        }
        return 0;
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public byte[] copydefault(Base64Variant base64Variant) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            EZpvd("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", (java.lang.Object) jsonToken);
        }
        if (this.OLrzqt == null) {
            C5537Vn c5537VnFlVtFt = flVtFt();
            KWHzl(zLjUOn(), c5537VnFlVtFt, base64Variant);
            this.OLrzqt = c5537VnFlVtFt.AYXKKw();
        }
        return this.OLrzqt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int KWHzl(Base64Variant base64Variant, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArrCopydefault = copydefault(base64Variant);
        outputStream.write(bArrCopydefault);
        return bArrCopydefault.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.Object AuCTel() throws java.io.IOException {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this.OLrzqt;
        }
        return null;
    }

    public final com.fasterxml.jackson.core.JsonToken QHmsKR() throws java.io.IOException {
        this.AubY = this.AubY.copydefault(-1, -1);
        this.finit = 5;
        this.fZBcTu = 6;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken RKDWNf() throws java.io.IOException {
        this.AubY = this.AubY.OLrzqt(-1, -1);
        this.finit = 2;
        this.fZBcTu = 3;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken OuxcSI() throws java.io.IOException {
        int i;
        if (!this.AubY.valueOf()) {
            copydefault(93, AbstractJsonLexerKt.END_OBJ);
        }
        UU uuAEQbTJ = this.AubY.AEQbTJ();
        this.AubY = uuAEQbTJ;
        if (uuAEQbTJ.djBIcL()) {
            i = 3;
        } else {
            i = uuAEQbTJ.valueOf() ? 6 : 1;
        }
        this.finit = i;
        this.fZBcTu = i;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken zuWLRA() throws java.io.IOException {
        int i;
        if (!this.AubY.djBIcL()) {
            copydefault(125, AbstractJsonLexerKt.END_LIST);
        }
        UU uuAEQbTJ = this.AubY.AEQbTJ();
        this.AubY = uuAEQbTJ;
        if (uuAEQbTJ.djBIcL()) {
            i = 3;
        } else {
            i = uuAEQbTJ.valueOf() ? 6 : 1;
        }
        this.finit = i;
        this.fZBcTu = i;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final java.lang.String KWHzl(int i, int i2) throws JsonParseException {
        int iEZpvd = EZpvd(i, i2);
        java.lang.String strAYXKKw = this.iZzfmt.AYXKKw(iEZpvd);
        if (strAYXKKw != null) {
            return strAYXKKw;
        }
        int[] iArr = this.iRxXKY;
        iArr[0] = iEZpvd;
        return AEQbTJ(iArr, 1, i2);
    }

    public final java.lang.String KWHzl(int i, int i2, int i3) throws JsonParseException {
        int iEZpvd = EZpvd(i2, i3);
        java.lang.String strCopydefault = this.iZzfmt.copydefault(i, iEZpvd);
        if (strCopydefault != null) {
            return strCopydefault;
        }
        int[] iArr = this.iRxXKY;
        iArr[0] = i;
        iArr[1] = iEZpvd;
        return AEQbTJ(iArr, 2, i3);
    }

    public final java.lang.String AEQbTJ(int i, int i2, int i3, int i4) throws JsonParseException {
        int iEZpvd = EZpvd(i3, i4);
        java.lang.String strAEQbTJ = this.iZzfmt.AEQbTJ(i, i2, iEZpvd);
        if (strAEQbTJ != null) {
            return strAEQbTJ;
        }
        int[] iArr = this.iRxXKY;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = EZpvd(iEZpvd, i4);
        return AEQbTJ(iArr, 3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[PHI: r5 r14
  0x00bf: PHI (r5v17 int) = (r5v16 int), (r5v32 int) binds: [B:28:0x0081, B:37:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r14v6 int) = (r14v5 int), (r14v15 int) binds: [B:28:0x0081, B:37:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(int[] iArr, int i, int i2) throws JsonParseException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i9 = i - 1;
            i3 = iArr[i9];
            iArr[i9] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = iArr[i10 >> 2] >> ((3 - (i10 & 3)) << 3);
            int i13 = i12 & 255;
            int i14 = i10 + 1;
            if (i13 > 127) {
                if ((i12 & 224) == 192) {
                    i4 = i12 & 31;
                } else {
                    if ((i12 & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                        i4 = i12 & 15;
                        i5 = 2;
                    } else if ((i12 & 248) == 240) {
                        i4 = i12 & 7;
                        i5 = 3;
                    } else {
                        isConnected(i13);
                        i4 = 1;
                    }
                    if (i14 + i5 > i8) {
                        OLrzqt(" in field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                    i14 = i10 + 2;
                    if ((i6 & 192) != 128) {
                        DbNXlk(i6);
                    }
                    int i15 = (i4 << 6) | (i6 & 63);
                    if (i5 <= 1) {
                        int i16 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                        i14 = i10 + 3;
                        if ((i16 & 192) != 128) {
                            DbNXlk(i16);
                        }
                        int i17 = (i15 << 6) | (i16 & 63);
                        if (i5 > 2) {
                            int i18 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                            i14 = i10 + 4;
                            if ((i18 & 192) != 128) {
                                DbNXlk(i18 & 255);
                            }
                            i15 = (i17 << 6) | (i18 & 63);
                            i13 = i15;
                            i7 = 2;
                            if (i5 > i7) {
                                int i19 = i13 - 65536;
                                if (i11 >= cArrEZpvd.length) {
                                    cArrEZpvd = this.zsXlph.OLrzqt();
                                }
                                cArrEZpvd[i11] = (char) ((i19 >> 10) + 55296);
                                i13 = (i19 & 1023) | Utf8.LOG_SURROGATE_HEADER;
                                i11++;
                            }
                        } else {
                            i13 = i17;
                            i7 = 2;
                            if (i5 > i7) {
                            }
                        }
                    } else {
                        i13 = i15;
                        i7 = 2;
                        if (i5 > i7) {
                        }
                    }
                }
                i5 = 1;
                if (i14 + i5 > i8) {
                }
                i6 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                i14 = i10 + 2;
                if ((i6 & 192) != 128) {
                }
                int i152 = (i4 << 6) | (i6 & 63);
                if (i5 <= 1) {
                }
            }
            i10 = i14;
            if (i11 >= cArrEZpvd.length) {
                cArrEZpvd = this.zsXlph.OLrzqt();
            }
            cArrEZpvd[i11] = (char) i13;
            i11++;
        }
        java.lang.String str = new java.lang.String(cArrEZpvd, 0, i11);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.iZzfmt.EZpvd(str, iArr, i);
    }

    public final com.fasterxml.jackson.core.JsonToken OBJEWx() throws java.io.IOException {
        this.finit = 7;
        if (!this.AubY.isConnected()) {
            gGvvIC();
        }
        close();
        this.QVAiDq = null;
        return null;
    }

    public final com.fasterxml.jackson.core.JsonToken AhwBna(java.lang.String str) throws java.io.IOException {
        this.finit = 4;
        this.AubY.KWHzl(str);
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken copydefault(int i, java.lang.String str) throws java.io.IOException {
        this.zsXlph.KWHzl(str);
        this.values = str.length();
        this.ejfBZ = 1;
        this.getNewProxyInstance = i;
        this.finit = this.fZBcTu;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken values(int i) throws java.io.IOException {
        java.lang.String str = UeEOUB[i];
        this.zsXlph.KWHzl(str);
        if (!copydefault(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            EZpvd("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        this.values = 0;
        this.ejfBZ = 8;
        this.uzCIH = RcXXUw[i];
        this.finit = this.fZBcTu;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final java.lang.String fetchVPNInfo(int i) {
        return UeEOUB[i];
    }

    public final void QSBOWP() {
        this.gHZMYf = java.lang.Math.max(this.AhwBna, this.dvKsVJ);
        int i = this.fetchVPNInfo;
        this.sSMYrx = i - this.AYXKKw;
        this.AxsJAY = this.gEmmrt + ((long) (i - this.dNCPSb));
    }

    public void AkhnZx(int i) throws JsonParseException {
        if (i < 32) {
            djBIcL(i);
        }
        isConnected(i);
    }

    public void isConnected(int i) throws JsonParseException {
        valueOf("Invalid UTF-8 start byte 0x" + java.lang.Integer.toHexString(i));
    }

    public void gEmmrt(int i, int i2) throws JsonParseException {
        this.fetchVPNInfo = i2;
        DbNXlk(i);
    }

    public void DbNXlk(int i) throws JsonParseException {
        valueOf("Invalid UTF-8 middle byte 0x" + java.lang.Integer.toHexString(i));
    }
}
