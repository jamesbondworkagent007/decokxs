package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.primitives.UnsignedBytes;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: renamed from: o.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5527Vd extends AbstractC5508Ul {
    public int AxsJAYaxsJAY;
    public boolean QKudOq;
    public boolean flVtFt;
    public java.io.InputStream fvQaOB;
    public int gGvvIC;
    public int gasjUx;
    public byte[] giSNqX;
    public AbstractC5505Ui gkJEwt;
    public int[] hUfVAv;
    public int iRxXKY;
    public final C5532Vi iZzfmt;
    public static final int finit = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int fZBcTu = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int dvKsVJ = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int aKErDB = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int UeEOUB = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int RcXXUw = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int djSkpj = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int dNCPSb = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] dxcTrN = C5521Ux.AEQbTJ();
    public static final int[] fFgQHt = C5521Ux.EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void QwvEab() {
        this.gHZMYf = this.AhwBna;
        int i = this.fetchVPNInfo;
        this.AxsJAY = this.gEmmrt + ((long) i);
        this.sSMYrx = i - this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final void UlJrfe() {
        this.AxsJAYaxsJAY = this.AhwBna;
        int i = this.fetchVPNInfo;
        this.gGvvIC = i;
        this.gasjUx = i - this.AYXKKw;
    }

    private static final int djBIcL(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public C5541Vr<StreamReadCapability> AubY() {
        return AbstractC5508Ul.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC5505Ui values() {
        return this.gkJEwt;
    }

    public C5527Vd(C5517Ut c5517Ut, int i, java.io.InputStream inputStream, AbstractC5505Ui abstractC5505Ui, C5532Vi c5532Vi, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(c5517Ut, i);
        this.hUfVAv = new int[16];
        this.fvQaOB = inputStream;
        this.gkJEwt = abstractC5505Ui;
        this.iZzfmt = c5532Vi;
        this.giSNqX = bArr;
        this.fetchVPNInfo = i2;
        this.isConnected = i3;
        this.AYXKKw = i2 - i4;
        this.gEmmrt = (-i2) + i4;
        this.flVtFt = z;
    }

    public final boolean QHmsKR() throws java.io.IOException {
        byte[] bArr;
        int length;
        java.io.InputStream inputStream = this.fvQaOB;
        if (inputStream == null || (length = (bArr = this.giSNqX).length) == 0) {
            return false;
        }
        int i = inputStream.read(bArr, 0, length);
        if (i > 0) {
            int i2 = this.isConnected;
            this.gEmmrt += (long) i2;
            this.AYXKKw -= i2;
            this.gGvvIC -= i2;
            this.fetchVPNInfo = 0;
            this.isConnected = i;
            return true;
        }
        djSkpj();
        if (i == 0) {
            throw new java.io.IOException("InputStream.read() returned 0 characters when trying to read " + this.giSNqX.length + " bytes");
        }
        return false;
    }

    @Override // o.AbstractC5508Ul
    public void djSkpj() throws java.io.IOException {
        if (this.fvQaOB != null) {
            if (this.AuCTel.AhwBna() || copydefault(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.fvQaOB.close();
            }
            this.fvQaOB = null;
        }
    }

    @Override // o.AbstractC5508Ul
    public void fvQaOB() throws java.io.IOException {
        byte[] bArr;
        byte[] bArr2;
        super.fvQaOB();
        this.iZzfmt.AhwBna();
        if (!this.flVtFt || (bArr = this.giSNqX) == null || bArr == (bArr2 = AbstractC5514Ur.QUSxYX)) {
            return;
        }
        this.giSNqX = bArr2;
        this.AuCTel.copydefault(bArr);
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String zLjUOn() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return AEQbTJ(jsonToken);
        }
        if (this.QKudOq) {
            this.QKudOq = false;
            return OuxcSI();
        }
        return this.zsXlph.copydefault();
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String QKVWgx() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
                return isConnected();
            }
            return super.AEQbTJ((java.lang.String) null);
        }
        if (this.QKudOq) {
            this.QKudOq = false;
            return OuxcSI();
        }
        return this.zsXlph.copydefault();
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String AEQbTJ(java.lang.String str) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
                return isConnected();
            }
            return super.AEQbTJ(str);
        }
        if (this.QKudOq) {
            this.QKudOq = false;
            return OuxcSI();
        }
        return this.zsXlph.copydefault();
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public int OcIXYQ() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT && jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
            return super.AEQbTJ(0);
        }
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

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public int AEQbTJ(int i) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT && jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
            return super.AEQbTJ(i);
        }
        int i2 = this.ejfBZ;
        int i3 = i2 & 1;
        if (i3 == 0) {
            if (i2 == 0) {
                return gasjUx();
            }
            if (i3 == 0) {
                RlQdEF();
            }
        }
        return this.getNewProxyInstance;
    }

    public final java.lang.String AEQbTJ(com.fasterxml.jackson.core.JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId == 5) {
            return this.AubY.copydefault();
        }
        if (iId == 6 || iId == 7 || iId == 8) {
            return this.zsXlph.copydefault();
        }
        return jsonToken.asString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] sSMYrx() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == null) {
            return null;
        }
        int iId = jsonToken.id();
        if (iId != 5) {
            if (iId != 6) {
                if (iId != 7 && iId != 8) {
                    return this.QVAiDq.asCharArray();
                }
            } else if (this.QKudOq) {
                this.QKudOq = false;
                fFgQHt();
            }
            return this.zsXlph.valueOf();
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
        if (iId != 6) {
            if (iId != 7 && iId != 8) {
                return this.QVAiDq.asCharArray().length;
            }
        } else if (this.QKudOq) {
            this.QKudOq = false;
            fFgQHt();
        }
        return this.zsXlph.values();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int zuBGHE() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != null) {
            int iId = jsonToken.id();
            if (iId != 6) {
                if (iId != 7) {
                }
            } else if (this.QKudOq) {
                this.QKudOq = false;
                fFgQHt();
            }
            return this.zsXlph.isConnected();
        }
        return 0;
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public byte[] copydefault(Base64Variant base64Variant) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING && (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT || this.OLrzqt == null)) {
            valueOf("Current token (" + this.QVAiDq + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.QKudOq) {
            try {
                this.OLrzqt = AEQbTJ(base64Variant);
                this.QKudOq = false;
            } catch (java.lang.IllegalArgumentException e) {
                throw EZpvd("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this.OLrzqt == null) {
            C5537Vn c5537VnFlVtFt = flVtFt();
            KWHzl(zLjUOn(), c5537VnFlVtFt, base64Variant);
            this.OLrzqt = c5537VnFlVtFt.AYXKKw();
        }
        return this.OLrzqt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int KWHzl(Base64Variant base64Variant, java.io.OutputStream outputStream) throws java.io.IOException {
        if (!this.QKudOq || this.QVAiDq != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            byte[] bArrCopydefault = copydefault(base64Variant);
            outputStream.write(bArrCopydefault);
            return bArrCopydefault.length;
        }
        byte[] bArrKWHzl = this.AuCTel.KWHzl();
        try {
            return copydefault(base64Variant, outputStream, bArrKWHzl);
        } finally {
            this.AuCTel.AEQbTJ(bArrKWHzl);
        }
    }

    public int copydefault(Base64Variant base64Variant, java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected) {
                RKDWNf();
            }
            byte[] bArr2 = this.giSNqX;
            int i3 = this.fetchVPNInfo;
            this.fetchVPNInfo = i3 + 1;
            int i4 = bArr2[i3] & UnsignedBytes.MAX_VALUE;
            if (i4 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i4);
                if (iDecodeBase64Char < 0) {
                    if (i4 == 34) {
                        break;
                    }
                    iDecodeBase64Char = OLrzqt(base64Variant, i4, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i > length - 3) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                if (this.fetchVPNInfo >= this.isConnected) {
                    RKDWNf();
                }
                byte[] bArr3 = this.giSNqX;
                int i5 = this.fetchVPNInfo;
                this.fetchVPNInfo = i5 + 1;
                int i6 = bArr3[i5] & UnsignedBytes.MAX_VALUE;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i6);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = OLrzqt(base64Variant, i6, 1);
                }
                int i7 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.fetchVPNInfo >= this.isConnected) {
                    RKDWNf();
                }
                byte[] bArr4 = this.giSNqX;
                int i8 = this.fetchVPNInfo;
                this.fetchVPNInfo = i8 + 1;
                int i9 = bArr4[i8] & UnsignedBytes.MAX_VALUE;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i9);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i9 == 34) {
                            bArr[i] = (byte) (i7 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            i++;
                        } else {
                            iDecodeBase64Char3 = OLrzqt(base64Variant, i9, 2);
                        }
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.fetchVPNInfo >= this.isConnected) {
                            RKDWNf();
                        }
                        byte[] bArr5 = this.giSNqX;
                        int i10 = this.fetchVPNInfo;
                        this.fetchVPNInfo = i10 + 1;
                        int i11 = bArr5[i10] & UnsignedBytes.MAX_VALUE;
                        if (!base64Variant.usesPaddingChar(i11) && OLrzqt(base64Variant, i11, 3) != -2) {
                            throw KWHzl(base64Variant, i11, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i] = (byte) (i7 >> 4);
                        i++;
                    }
                }
                int i12 = (i7 << 6) | iDecodeBase64Char3;
                if (this.fetchVPNInfo >= this.isConnected) {
                    RKDWNf();
                }
                byte[] bArr6 = this.giSNqX;
                int i13 = this.fetchVPNInfo;
                this.fetchVPNInfo = i13 + 1;
                int i14 = bArr6[i13] & UnsignedBytes.MAX_VALUE;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i14);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i14 == 34) {
                            bArr[i] = (byte) (i12 >> 10);
                            int i15 = i + 2;
                            bArr[i + 1] = (byte) (i12 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            i = i15;
                        } else {
                            iDecodeBase64Char4 = OLrzqt(base64Variant, i14, 3);
                        }
                    }
                    if (iDecodeBase64Char4 == -2) {
                        bArr[i] = (byte) (i12 >> 10);
                        bArr[i + 1] = (byte) (i12 >> 2);
                        i += 2;
                    }
                }
                int i16 = (i12 << 6) | iDecodeBase64Char4;
                bArr[i] = (byte) (i16 >> 16);
                bArr[i + 1] = (byte) (i16 >> 8);
                bArr[i + 2] = (byte) i16;
                i += 3;
            }
        }
        this.QKudOq = false;
        if (i <= 0) {
            return i2;
        }
        int i17 = i2 + i;
        outputStream.write(bArr, 0, i);
        return i17;
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenAkhnZx;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return hrNTAI();
        }
        this.ejfBZ = 0;
        if (this.QKudOq) {
            hBpjJd();
        }
        int iAUsmxb = aUsmxb();
        if (iAUsmxb < 0) {
            close();
            this.QVAiDq = null;
            return null;
        }
        this.OLrzqt = null;
        if (iAUsmxb == 93) {
            zuWLRA();
            com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
            this.QVAiDq = jsonToken3;
            return jsonToken3;
        }
        if (iAUsmxb == 125) {
            DCUTEI();
            com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
            this.QVAiDq = jsonToken4;
            return jsonToken4;
        }
        if (this.AubY.values()) {
            if (iAUsmxb != 44) {
                OLrzqt(iAUsmxb, "was expecting comma to separate " + this.AubY.DbNXlk() + " entries");
            }
            iAUsmxb = OxVOHk();
            if ((this.EZpvd & finit) != 0 && (iAUsmxb == 93 || iAUsmxb == 125)) {
                return AhwBna(iAUsmxb);
            }
        }
        if (!this.AubY.djBIcL()) {
            QwvEab();
            return iwGUEr(iAUsmxb);
        }
        UlJrfe();
        this.AubY.KWHzl(DbNXlk(iAUsmxb));
        this.QVAiDq = jsonToken2;
        int iODXsMY = ODXsMY();
        QwvEab();
        if (iODXsMY == 34) {
            this.QKudOq = true;
            this.fIwbmz = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            return this.QVAiDq;
        }
        if (iODXsMY != 43) {
            if (iODXsMY == 91) {
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            } else if (iODXsMY == 102) {
                QSBOWP();
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            } else if (iODXsMY == 110) {
                QkdxfA();
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            } else if (iODXsMY == 116) {
                OBJEWx();
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            } else if (iODXsMY == 123) {
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            } else if (iODXsMY == 45) {
                jsonTokenAkhnZx = AEQbTJ(true);
            } else if (iODXsMY == 46) {
                jsonTokenAkhnZx = KWHzl(false, false);
            } else {
                switch (iODXsMY) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonTokenAkhnZx = fJNWhG(iODXsMY);
                        break;
                    default:
                        jsonTokenAkhnZx = AkhnZx(iODXsMY);
                        break;
                }
            }
        } else if (copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonTokenAkhnZx = AEQbTJ(false);
        } else {
            jsonTokenAkhnZx = AkhnZx(iODXsMY);
        }
        this.fIwbmz = jsonTokenAkhnZx;
        return this.QVAiDq;
    }

    private final com.fasterxml.jackson.core.JsonToken iwGUEr(int i) throws java.io.IOException {
        if (i == 34) {
            this.QKudOq = true;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        if (i == 43) {
            if (!copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                com.fasterxml.jackson.core.JsonToken jsonTokenAkhnZx = AkhnZx(i);
                this.QVAiDq = jsonTokenAkhnZx;
                return jsonTokenAkhnZx;
            }
            com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ = AEQbTJ(false);
            this.QVAiDq = jsonTokenAEQbTJ;
            return jsonTokenAEQbTJ;
        }
        if (i == 91) {
            this.AubY = this.AubY.copydefault(this.gHZMYf, this.sSMYrx);
            com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            this.QVAiDq = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            QSBOWP();
            com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            this.QVAiDq = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            QkdxfA();
            com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            this.QVAiDq = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            OBJEWx();
            com.fasterxml.jackson.core.JsonToken jsonToken5 = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            this.QVAiDq = jsonToken5;
            return jsonToken5;
        }
        if (i == 123) {
            this.AubY = this.AubY.OLrzqt(this.gHZMYf, this.sSMYrx);
            com.fasterxml.jackson.core.JsonToken jsonToken6 = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            this.QVAiDq = jsonToken6;
            return jsonToken6;
        }
        if (i == 45) {
            com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ2 = AEQbTJ(true);
            this.QVAiDq = jsonTokenAEQbTJ2;
            return jsonTokenAEQbTJ2;
        }
        if (i == 46) {
            com.fasterxml.jackson.core.JsonToken jsonTokenKWHzl = KWHzl(false, false);
            this.QVAiDq = jsonTokenKWHzl;
            return jsonTokenKWHzl;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                com.fasterxml.jackson.core.JsonToken jsonTokenFJNWhG = fJNWhG(i);
                this.QVAiDq = jsonTokenFJNWhG;
                return jsonTokenFJNWhG;
            default:
                com.fasterxml.jackson.core.JsonToken jsonTokenAkhnZx2 = AkhnZx(i);
                this.QVAiDq = jsonTokenAkhnZx2;
                return jsonTokenAkhnZx2;
        }
    }

    private final com.fasterxml.jackson.core.JsonToken hrNTAI() {
        this.fARcdN = false;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.fIwbmz;
        this.fIwbmz = null;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            this.AubY = this.AubY.copydefault(this.gHZMYf, this.sSMYrx);
        } else if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
            this.AubY = this.AubY.OLrzqt(this.gHZMYf, this.sSMYrx);
        }
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.String QbewEr() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenAkhnZx;
        this.ejfBZ = 0;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            hrNTAI();
            return null;
        }
        if (this.QKudOq) {
            hBpjJd();
        }
        int iAUsmxb = aUsmxb();
        if (iAUsmxb < 0) {
            close();
            this.QVAiDq = null;
            return null;
        }
        this.OLrzqt = null;
        if (iAUsmxb == 93) {
            zuWLRA();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
            return null;
        }
        if (iAUsmxb == 125) {
            DCUTEI();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
            return null;
        }
        if (this.AubY.values()) {
            if (iAUsmxb != 44) {
                OLrzqt(iAUsmxb, "was expecting comma to separate " + this.AubY.DbNXlk() + " entries");
            }
            iAUsmxb = OxVOHk();
            if ((this.EZpvd & finit) != 0 && (iAUsmxb == 93 || iAUsmxb == 125)) {
                AhwBna(iAUsmxb);
                return null;
            }
        }
        if (!this.AubY.djBIcL()) {
            QwvEab();
            iwGUEr(iAUsmxb);
            return null;
        }
        UlJrfe();
        java.lang.String strDbNXlk = DbNXlk(iAUsmxb);
        this.AubY.KWHzl(strDbNXlk);
        this.QVAiDq = jsonToken2;
        int iODXsMY = ODXsMY();
        QwvEab();
        if (iODXsMY == 34) {
            this.QKudOq = true;
            this.fIwbmz = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            return strDbNXlk;
        }
        if (iODXsMY != 43) {
            if (iODXsMY == 91) {
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            } else if (iODXsMY == 102) {
                QSBOWP();
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            } else if (iODXsMY == 110) {
                QkdxfA();
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            } else if (iODXsMY == 116) {
                OBJEWx();
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            } else if (iODXsMY == 123) {
                jsonTokenAkhnZx = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            } else if (iODXsMY == 45) {
                jsonTokenAkhnZx = AEQbTJ(true);
            } else if (iODXsMY == 46) {
                jsonTokenAkhnZx = KWHzl(false, false);
            } else {
                switch (iODXsMY) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonTokenAkhnZx = fJNWhG(iODXsMY);
                        break;
                    default:
                        jsonTokenAkhnZx = AkhnZx(iODXsMY);
                        break;
                }
            }
        } else if (copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonTokenAkhnZx = AEQbTJ(false);
        } else {
            jsonTokenAkhnZx = AkhnZx(iODXsMY);
        }
        this.fIwbmz = jsonTokenAkhnZx;
        return strDbNXlk;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.String dNCPSb() throws java.io.IOException {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            this.fARcdN = false;
            com.fasterxml.jackson.core.JsonToken jsonToken = this.fIwbmz;
            this.fIwbmz = null;
            this.QVAiDq = jsonToken;
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
                if (this.QKudOq) {
                    this.QKudOq = false;
                    return OuxcSI();
                }
                return this.zsXlph.copydefault();
            }
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
                this.AubY = this.AubY.copydefault(this.gHZMYf, this.sSMYrx);
            } else if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
                this.AubY = this.AubY.OLrzqt(this.gHZMYf, this.sSMYrx);
            }
            return null;
        }
        if (RcXXUw() == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return zLjUOn();
        }
        return null;
    }

    public final com.fasterxml.jackson.core.JsonToken KWHzl(boolean z, boolean z2) throws java.io.IOException {
        if (!copydefault(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return AkhnZx(46);
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int i = 0;
        if (z) {
            cArrEZpvd[0] = '-';
            i = 1;
        }
        return AEQbTJ(cArrEZpvd, i, 46, z, 0);
    }

    public com.fasterxml.jackson.core.JsonToken fJNWhG(int i) throws java.io.IOException {
        int i2;
        int i3;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        if (i == 48) {
            i = dmfpNf();
        }
        cArrEZpvd[0] = (char) i;
        int iMin = java.lang.Math.min(this.isConnected, (this.fetchVPNInfo + cArrEZpvd.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            i2 = this.fetchVPNInfo;
            if (i2 >= iMin) {
                return OLrzqt(cArrEZpvd, i4, false, i5);
            }
            byte[] bArr = this.giSNqX;
            this.fetchVPNInfo = i2 + 1;
            i3 = bArr[i2] & UnsignedBytes.MAX_VALUE;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            cArrEZpvd[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return AEQbTJ(cArrEZpvd, i4, i3, false, i5);
        }
        this.fetchVPNInfo = i2;
        this.zsXlph.copydefault(i4);
        if (this.AubY.isConnected()) {
            AuCTelauCTel(i3);
        }
        return KWHzl(false, i5);
    }

    private final com.fasterxml.jackson.core.JsonToken AEQbTJ(boolean z) throws java.io.IOException {
        int i;
        int i2;
        int i3;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int i4 = 1;
        int i5 = 0;
        if (z) {
            cArrEZpvd[0] = '-';
            i5 = 1;
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i6 = this.fetchVPNInfo;
        this.fetchVPNInfo = i6 + 1;
        int iDmfpNf = bArr[i6] & UnsignedBytes.MAX_VALUE;
        if (iDmfpNf <= 48) {
            if (iDmfpNf != 48) {
                if (iDmfpNf == 46) {
                    return KWHzl(z, true);
                }
                return copydefault(iDmfpNf, z, true);
            }
            iDmfpNf = dmfpNf();
        } else if (iDmfpNf > 57) {
            return copydefault(iDmfpNf, z, true);
        }
        int i7 = i5 + 1;
        cArrEZpvd[i5] = (char) iDmfpNf;
        int iMin = java.lang.Math.min(this.isConnected, (this.fetchVPNInfo + cArrEZpvd.length) - i7);
        while (true) {
            i = i7;
            i2 = this.fetchVPNInfo;
            if (i2 >= iMin) {
                return OLrzqt(cArrEZpvd, i, z, i4);
            }
            byte[] bArr2 = this.giSNqX;
            this.fetchVPNInfo = i2 + 1;
            i3 = bArr2[i2] & UnsignedBytes.MAX_VALUE;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i4++;
            i7 = i + 1;
            cArrEZpvd[i] = (char) i3;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return AEQbTJ(cArrEZpvd, i, i3, z, i4);
        }
        this.fetchVPNInfo = i2;
        this.zsXlph.copydefault(i);
        if (this.AubY.isConnected()) {
            AuCTelauCTel(i3);
        }
        return KWHzl(z, i4);
    }

    public final com.fasterxml.jackson.core.JsonToken OLrzqt(char[] cArr, int i, boolean z, int i2) throws java.io.IOException {
        int i3;
        int i4;
        char[] cArrGEmmrt = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                this.zsXlph.copydefault(i5);
                return KWHzl(z, i6);
            }
            byte[] bArr = this.giSNqX;
            i3 = this.fetchVPNInfo;
            this.fetchVPNInfo = i3 + 1;
            i4 = bArr[i3] & UnsignedBytes.MAX_VALUE;
            if (i4 > 57 || i4 < 48) {
                break;
            }
            if (i5 >= cArrGEmmrt.length) {
                i5 = 0;
                cArrGEmmrt = this.zsXlph.gEmmrt();
            }
            cArrGEmmrt[i5] = (char) i4;
            i6++;
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return AEQbTJ(cArrGEmmrt, i5, i4, z, i6);
        }
        this.fetchVPNInfo = i3;
        this.zsXlph.copydefault(i5);
        if (this.AubY.isConnected()) {
            AuCTelauCTel(this.giSNqX[this.fetchVPNInfo] & UnsignedBytes.MAX_VALUE);
        }
        return KWHzl(z, i6);
    }

    public final int dmfpNf() throws java.io.IOException {
        int i;
        if ((this.fetchVPNInfo >= this.isConnected && !QHmsKR()) || (i = this.giSNqX[this.fetchVPNInfo] & UnsignedBytes.MAX_VALUE) < 48 || i > 57) {
            return 48;
        }
        if ((this.EZpvd & fZBcTu) == 0) {
            AYXKKw("Leading zeroes not allowed");
        }
        this.fetchVPNInfo++;
        if (i == 48) {
            do {
                if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                    break;
                }
                byte[] bArr = this.giSNqX;
                int i2 = this.fetchVPNInfo;
                i = bArr[i2] & UnsignedBytes.MAX_VALUE;
                if (i < 48 || i > 57) {
                    return 48;
                }
                this.fetchVPNInfo = i2 + 1;
            } while (i == 48);
        }
        return i;
    }

    private final com.fasterxml.jackson.core.JsonToken AEQbTJ(char[] cArr, int i, int i2, boolean z, int i3) throws java.io.IOException {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.zsXlph.gEmmrt();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.giSNqX;
                int i6 = this.fetchVPNInfo;
                this.fetchVPNInfo = i6 + 1;
                i2 = bArr[i6] & UnsignedBytes.MAX_VALUE;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this.zsXlph.gEmmrt();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0 && !copydefault(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                AEQbTJ(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.zsXlph.gEmmrt();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this.fetchVPNInfo >= this.isConnected) {
                RKDWNf();
            }
            byte[] bArr2 = this.giSNqX;
            int i8 = this.fetchVPNInfo;
            this.fetchVPNInfo = i8 + 1;
            int i9 = bArr2[i8] & UnsignedBytes.MAX_VALUE;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.zsXlph.gEmmrt();
                    i7 = 0;
                }
                cArr[i7] = (char) i9;
                if (this.fetchVPNInfo >= this.isConnected) {
                    RKDWNf();
                }
                byte[] bArr3 = this.giSNqX;
                int i10 = this.fetchVPNInfo;
                this.fetchVPNInfo = i10 + 1;
                i9 = bArr3[i10] & UnsignedBytes.MAX_VALUE;
                i7++;
            }
            i2 = i9;
            int i11 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i11++;
                if (i7 >= cArr.length) {
                    cArr = this.zsXlph.gEmmrt();
                    i7 = 0;
                }
                int i12 = i7 + 1;
                cArr[i7] = (char) i2;
                if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                    i5 = i11;
                    z2 = true;
                    i = i12;
                    break;
                }
                byte[] bArr4 = this.giSNqX;
                int i13 = this.fetchVPNInfo;
                this.fetchVPNInfo = i13 + 1;
                i2 = bArr4[i13] & UnsignedBytes.MAX_VALUE;
                i7 = i12;
            }
            i5 = i11;
            i = i7;
            if (i5 == 0) {
                AEQbTJ(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.fetchVPNInfo--;
            if (this.AubY.isConnected()) {
                AuCTelauCTel(i2);
            }
        }
        this.zsXlph.copydefault(i);
        return copydefault(z, i3, i4, i5);
    }

    private final void AuCTelauCTel(int i) throws java.io.IOException {
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        if (i != 9) {
            if (i == 10) {
                this.AhwBna++;
                this.AYXKKw = i3;
            } else if (i == 13) {
                this.fetchVPNInfo = i2;
            } else if (i != 32) {
                valueOf(i);
            }
        }
    }

    public final java.lang.String DbNXlk(int i) throws java.io.IOException {
        if (i != 34) {
            return fetchVPNInfo(i);
        }
        int i2 = this.fetchVPNInfo;
        if (i2 + 13 > this.isConnected) {
            return DLWbHP();
        }
        byte[] bArr = this.giSNqX;
        int[] iArr = fFgQHt;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        if (iArr[i4] != 0) {
            return i4 == 34 ? "" : EZpvd(0, i4, 0);
        }
        int i5 = i2 + 2;
        this.fetchVPNInfo = i5;
        int i6 = bArr[i3] & UnsignedBytes.MAX_VALUE;
        if (iArr[i6] != 0) {
            if (i6 == 34) {
                return valueOf(i4, 1);
            }
            return EZpvd(i4, i6, 1);
        }
        int i7 = i6 | (i4 << 8);
        int i8 = i2 + 3;
        this.fetchVPNInfo = i8;
        int i9 = bArr[i5] & UnsignedBytes.MAX_VALUE;
        if (iArr[i9] != 0) {
            if (i9 == 34) {
                return valueOf(i7, 2);
            }
            return EZpvd(i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 4;
        this.fetchVPNInfo = i11;
        int i12 = bArr[i8] & UnsignedBytes.MAX_VALUE;
        if (iArr[i12] != 0) {
            if (i12 == 34) {
                return valueOf(i10, 3);
            }
            return EZpvd(i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this.fetchVPNInfo = i2 + 5;
        int i14 = bArr[i11] & UnsignedBytes.MAX_VALUE;
        if (iArr[i14] == 0) {
            this.iRxXKY = i13;
            return hDKMBd(i14);
        }
        if (i14 == 34) {
            return valueOf(i13, 4);
        }
        return EZpvd(i13, i14, 4);
    }

    public final java.lang.String hDKMBd(int i) throws java.io.IOException {
        byte[] bArr = this.giSNqX;
        int[] iArr = fFgQHt;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        int i4 = bArr[i2] & UnsignedBytes.MAX_VALUE;
        if (iArr[i4] != 0) {
            if (i4 == 34) {
                return copydefault(this.iRxXKY, i, 1);
            }
            return KWHzl(this.iRxXKY, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = i2 + 2;
        this.fetchVPNInfo = i6;
        int i7 = bArr[i3] & UnsignedBytes.MAX_VALUE;
        if (iArr[i7] != 0) {
            if (i7 == 34) {
                return copydefault(this.iRxXKY, i5, 2);
            }
            return KWHzl(this.iRxXKY, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i2 + 3;
        this.fetchVPNInfo = i9;
        int i10 = bArr[i6] & UnsignedBytes.MAX_VALUE;
        if (iArr[i10] != 0) {
            if (i10 == 34) {
                return copydefault(this.iRxXKY, i8, 3);
            }
            return KWHzl(this.iRxXKY, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        this.fetchVPNInfo = i2 + 4;
        int i12 = bArr[i9] & UnsignedBytes.MAX_VALUE;
        if (iArr[i12] == 0) {
            return KWHzl(i12, i11);
        }
        if (i12 == 34) {
            return copydefault(this.iRxXKY, i11, 4);
        }
        return KWHzl(this.iRxXKY, i11, i12, 4);
    }

    public final java.lang.String KWHzl(int i, int i2) throws java.io.IOException {
        byte[] bArr = this.giSNqX;
        int[] iArr = fFgQHt;
        int i3 = this.fetchVPNInfo;
        int i4 = i3 + 1;
        this.fetchVPNInfo = i4;
        int i5 = bArr[i3] & UnsignedBytes.MAX_VALUE;
        if (iArr[i5] != 0) {
            if (i5 == 34) {
                return EZpvd(this.iRxXKY, i2, i, 1);
            }
            return copydefault(this.iRxXKY, i2, i, i5, 1);
        }
        int i6 = (i << 8) | i5;
        int i7 = i3 + 2;
        this.fetchVPNInfo = i7;
        int i8 = bArr[i4] & UnsignedBytes.MAX_VALUE;
        if (iArr[i8] != 0) {
            if (i8 == 34) {
                return EZpvd(this.iRxXKY, i2, i6, 2);
            }
            return copydefault(this.iRxXKY, i2, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i3 + 3;
        this.fetchVPNInfo = i10;
        int i11 = bArr[i7] & UnsignedBytes.MAX_VALUE;
        if (iArr[i11] != 0) {
            if (i11 == 34) {
                return EZpvd(this.iRxXKY, i2, i9, 3);
            }
            return copydefault(this.iRxXKY, i2, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this.fetchVPNInfo = i3 + 4;
        int i13 = bArr[i10] & UnsignedBytes.MAX_VALUE;
        if (iArr[i13] == 0) {
            return AEQbTJ(i13, i2, i12);
        }
        if (i13 == 34) {
            return EZpvd(this.iRxXKY, i2, i12, 4);
        }
        return copydefault(this.iRxXKY, i2, i12, i13, 4);
    }

    public final java.lang.String AEQbTJ(int i, int i2, int i3) throws java.io.IOException {
        int[] iArr = this.hUfVAv;
        iArr[0] = this.iRxXKY;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this.giSNqX;
        int[] iArr2 = fFgQHt;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int i6 = this.fetchVPNInfo;
            int i7 = i6 + 4;
            if (i7 <= this.isConnected) {
                int i8 = i6 + 1;
                this.fetchVPNInfo = i8;
                int i9 = bArr[i6] & UnsignedBytes.MAX_VALUE;
                if (iArr2[i9] != 0) {
                    if (i9 == 34) {
                        return OLrzqt(this.hUfVAv, i5, i4, 1);
                    }
                    return copydefault(this.hUfVAv, i5, i4, i9, 1);
                }
                int i10 = (i4 << 8) | i9;
                int i11 = i6 + 2;
                this.fetchVPNInfo = i11;
                int i12 = bArr[i8] & UnsignedBytes.MAX_VALUE;
                if (iArr2[i12] != 0) {
                    if (i12 == 34) {
                        return OLrzqt(this.hUfVAv, i5, i10, 2);
                    }
                    return copydefault(this.hUfVAv, i5, i10, i12, 2);
                }
                int i13 = (i10 << 8) | i12;
                int i14 = i6 + 3;
                this.fetchVPNInfo = i14;
                int i15 = bArr[i11] & UnsignedBytes.MAX_VALUE;
                if (iArr2[i15] != 0) {
                    if (i15 == 34) {
                        return OLrzqt(this.hUfVAv, i5, i13, 3);
                    }
                    return copydefault(this.hUfVAv, i5, i13, i15, 3);
                }
                int i16 = (i13 << 8) | i15;
                this.fetchVPNInfo = i7;
                int i17 = bArr[i14] & UnsignedBytes.MAX_VALUE;
                if (iArr2[i17] != 0) {
                    if (i17 == 34) {
                        return OLrzqt(this.hUfVAv, i5, i16, 4);
                    }
                    return copydefault(this.hUfVAv, i5, i16, i17, 4);
                }
                int[] iArr3 = this.hUfVAv;
                if (i5 >= iArr3.length) {
                    this.hUfVAv = AbstractC5508Ul.EZpvd(iArr3, i5);
                }
                this.hUfVAv[i5] = i16;
                i5++;
                i4 = i17;
            } else {
                return copydefault(this.hUfVAv, i5, 0, i4, 0);
            }
        }
    }

    public java.lang.String DLWbHP() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
            OLrzqt(": was expecting closing '\"' for name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
        return i2 == 34 ? "" : copydefault(this.hUfVAv, 0, 0, i2, 0);
    }

    private final java.lang.String EZpvd(int i, int i2, int i3) throws java.io.IOException {
        return copydefault(this.hUfVAv, 0, i, i2, i3);
    }

    private final java.lang.String KWHzl(int i, int i2, int i3, int i4) throws java.io.IOException {
        int[] iArr = this.hUfVAv;
        iArr[0] = i;
        return copydefault(iArr, 1, i2, i3, i4);
    }

    private final java.lang.String copydefault(int i, int i2, int i3, int i4, int i5) throws java.io.IOException {
        int[] iArr = this.hUfVAv;
        iArr[0] = i;
        iArr[1] = i2;
        return copydefault(iArr, 2, i3, i4, i5);
    }

    public final java.lang.String copydefault(int[] iArr, int i, int i2, int i3, int i4) throws java.io.IOException {
        int[] iArr2 = fFgQHt;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    EZpvd(i3, "name");
                } else {
                    i3 = fZBcTu();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = AbstractC5508Ul.EZpvd(iArr, iArr.length);
                            this.hUfVAv = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i6 = i2 << 8;
                    if (i3 < 2048) {
                        i2 = i6 | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i7 = i6 | (i3 >> 12) | 224;
                        int i8 = i4 + 1;
                        if (i8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = AbstractC5508Ul.EZpvd(iArr, iArr.length);
                                this.hUfVAv = iArr;
                            }
                            iArr[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i5 = i7;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i8 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = AbstractC5508Ul.EZpvd(iArr, iArr.length);
                    this.hUfVAv = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i3;
                i4 = 1;
            }
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                OLrzqt(" in field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.giSNqX;
            int i9 = this.fetchVPNInfo;
            this.fetchVPNInfo = i9 + 1;
            i3 = bArr[i9] & UnsignedBytes.MAX_VALUE;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = AbstractC5508Ul.EZpvd(iArr, iArr.length);
                this.hUfVAv = iArr;
            }
            iArr[i] = djBIcL(i2, i4);
            i++;
        }
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArr, i);
        return strOLrzqt == null ? KWHzl(iArr, i, i4) : strOLrzqt;
    }

    public java.lang.String fetchVPNInfo(int i) throws java.io.IOException {
        if (i == 39 && (this.EZpvd & UeEOUB) != 0) {
            return gwTjWJ();
        }
        if ((this.EZpvd & RcXXUw) == 0) {
            OLrzqt((char) isConnected(i), "was expecting double-quote to start field name");
        }
        int[] iArrAhwBna = C5521Ux.AhwBna();
        if (iArrAhwBna[i] != 0) {
            OLrzqt(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrEZpvd = this.hUfVAv;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i |= i4 << 8;
            } else {
                if (i3 >= iArrEZpvd.length) {
                    iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                    this.hUfVAv = iArrEZpvd;
                }
                iArrEZpvd[i3] = i4;
                i3++;
                i2 = 1;
            }
            i4 = i;
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                OLrzqt(" in field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
            }
            byte[] bArr = this.giSNqX;
            int i5 = this.fetchVPNInfo;
            i = bArr[i5] & UnsignedBytes.MAX_VALUE;
            if (iArrAhwBna[i] != 0) {
                break;
            }
            this.fetchVPNInfo = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArrEZpvd.length) {
                int[] iArrEZpvd2 = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                this.hUfVAv = iArrEZpvd2;
                iArrEZpvd = iArrEZpvd2;
            }
            iArrEZpvd[i3] = i4;
            i3++;
        }
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArrEZpvd, i3);
        return strOLrzqt == null ? KWHzl(iArrEZpvd, i3, i2) : strOLrzqt;
    }

    public java.lang.String gwTjWJ() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
            OLrzqt(": was expecting closing ''' for field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        int iFZBcTu = bArr[i] & UnsignedBytes.MAX_VALUE;
        if (iFZBcTu == 39) {
            return "";
        }
        int[] iArrEZpvd = this.hUfVAv;
        int[] iArr = fFgQHt;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (iFZBcTu != 39) {
            if (iArr[iFZBcTu] != 0 && iFZBcTu != 34) {
                if (iFZBcTu != 92) {
                    EZpvd(iFZBcTu, "name");
                } else {
                    iFZBcTu = fZBcTu();
                }
                if (iFZBcTu > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArrEZpvd.length) {
                            iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                            this.hUfVAv = iArrEZpvd;
                        }
                        iArrEZpvd[i3] = i4;
                        i3++;
                        i2 = 0;
                        i4 = 0;
                    }
                    int i5 = i4 << 8;
                    if (iFZBcTu < 2048) {
                        i4 = i5 | (iFZBcTu >> 6) | 192;
                        i2++;
                    } else {
                        int i6 = i5 | (iFZBcTu >> 12) | 224;
                        int i7 = i2 + 1;
                        if (i7 >= 4) {
                            if (i3 >= iArrEZpvd.length) {
                                iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                                this.hUfVAv = iArrEZpvd;
                            }
                            iArrEZpvd[i3] = i6;
                            i3++;
                            i7 = 0;
                            i6 = 0;
                        }
                        i4 = (i6 << 8) | ((iFZBcTu >> 6) & 63) | 128;
                        i2 = i7 + 1;
                    }
                    iFZBcTu = (iFZBcTu & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = iFZBcTu | (i4 << 8);
            } else {
                if (i3 >= iArrEZpvd.length) {
                    iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                    this.hUfVAv = iArrEZpvd;
                }
                iArrEZpvd[i3] = i4;
                i3++;
                i4 = iFZBcTu;
                i2 = 1;
            }
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                OLrzqt(" in field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this.giSNqX;
            int i8 = this.fetchVPNInfo;
            this.fetchVPNInfo = i8 + 1;
            iFZBcTu = bArr2[i8] & UnsignedBytes.MAX_VALUE;
        }
        if (i2 > 0) {
            if (i3 >= iArrEZpvd.length) {
                int[] iArrEZpvd2 = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                this.hUfVAv = iArrEZpvd2;
                iArrEZpvd = iArrEZpvd2;
            }
            iArrEZpvd[i3] = djBIcL(i4, i2);
            i3++;
        }
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArrEZpvd, i3);
        return strOLrzqt == null ? KWHzl(iArrEZpvd, i3, i2) : strOLrzqt;
    }

    private final java.lang.String valueOf(int i, int i2) throws JsonParseException {
        int iDjBIcL = djBIcL(i, i2);
        java.lang.String strAYXKKw = this.iZzfmt.AYXKKw(iDjBIcL);
        if (strAYXKKw != null) {
            return strAYXKKw;
        }
        int[] iArr = this.hUfVAv;
        iArr[0] = iDjBIcL;
        return KWHzl(iArr, 1, i2);
    }

    private final java.lang.String copydefault(int i, int i2, int i3) throws JsonParseException {
        int iDjBIcL = djBIcL(i2, i3);
        java.lang.String strCopydefault = this.iZzfmt.copydefault(i, iDjBIcL);
        if (strCopydefault != null) {
            return strCopydefault;
        }
        int[] iArr = this.hUfVAv;
        iArr[0] = i;
        iArr[1] = iDjBIcL;
        return KWHzl(iArr, 2, i3);
    }

    private final java.lang.String EZpvd(int i, int i2, int i3, int i4) throws JsonParseException {
        int iDjBIcL = djBIcL(i3, i4);
        java.lang.String strAEQbTJ = this.iZzfmt.AEQbTJ(i, i2, iDjBIcL);
        if (strAEQbTJ != null) {
            return strAEQbTJ;
        }
        int[] iArr = this.hUfVAv;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = djBIcL(iDjBIcL, i4);
        return KWHzl(iArr, 3, i4);
    }

    private final java.lang.String OLrzqt(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = AbstractC5508Ul.EZpvd(iArr, iArr.length);
            this.hUfVAv = iArr;
        }
        int i4 = i + 1;
        iArr[i] = djBIcL(i2, i3);
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArr, i4);
        return strOLrzqt == null ? KWHzl(iArr, i4, i3) : strOLrzqt;
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
    private final java.lang.String KWHzl(int[] iArr, int i, int i2) throws JsonParseException {
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
                        AuCTel(i13);
                        i4 = 1;
                    }
                    if (i14 + i5 > i8) {
                        OLrzqt(" in field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                    i14 = i10 + 2;
                    if ((i6 & 192) != 128) {
                        ejfBZ(i6);
                    }
                    int i15 = (i4 << 6) | (i6 & 63);
                    if (i5 <= 1) {
                        int i16 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                        i14 = i10 + 3;
                        if ((i16 & 192) != 128) {
                            ejfBZ(i16);
                        }
                        int i17 = (i15 << 6) | (i16 & 63);
                        if (i5 > 2) {
                            int i18 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                            i14 = i10 + 4;
                            if ((i18 & 192) != 128) {
                                ejfBZ(i18 & 255);
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

    public void RKDWNf() throws java.io.IOException {
        if (QHmsKR()) {
            return;
        }
        ODWQjV();
    }

    @Override // o.AbstractC5508Ul
    public void fFgQHt() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        if (i >= this.isConnected) {
            RKDWNf();
            i = this.fetchVPNInfo;
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = dxcTrN;
        int iMin = java.lang.Math.min(this.isConnected, cArrEZpvd.length + i);
        byte[] bArr = this.giSNqX;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
            if (iArr[i3] == 0) {
                i++;
                cArrEZpvd[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.fetchVPNInfo = i + 1;
                this.zsXlph.copydefault(i2);
                return;
            }
        }
        this.fetchVPNInfo = i;
        copydefault(cArrEZpvd, i2);
    }

    public java.lang.String OuxcSI() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        if (i >= this.isConnected) {
            RKDWNf();
            i = this.fetchVPNInfo;
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = dxcTrN;
        int iMin = java.lang.Math.min(this.isConnected, cArrEZpvd.length + i);
        byte[] bArr = this.giSNqX;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
            if (iArr[i3] == 0) {
                i++;
                cArrEZpvd[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this.fetchVPNInfo = i + 1;
                return this.zsXlph.KWHzl(i2);
            }
        }
        this.fetchVPNInfo = i;
        copydefault(cArrEZpvd, i2);
        return this.zsXlph.copydefault();
    }

    public final void copydefault(char[] cArr, int i) throws java.io.IOException {
        int[] iArr = dxcTrN;
        byte[] bArr = this.giSNqX;
        while (true) {
            int i2 = this.fetchVPNInfo;
            if (i2 >= this.isConnected) {
                RKDWNf();
                i2 = this.fetchVPNInfo;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this.zsXlph.gEmmrt();
                i = 0;
            }
            int iMin = java.lang.Math.min(this.isConnected, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= iMin) {
                    this.fetchVPNInfo = i2;
                    break;
                }
                int i4 = i2 + 1;
                int iFZBcTu = bArr[i2] & UnsignedBytes.MAX_VALUE;
                int i5 = iArr[iFZBcTu];
                if (i5 != 0) {
                    this.fetchVPNInfo = i4;
                    if (iFZBcTu != 34) {
                        if (i5 == 1) {
                            iFZBcTu = fZBcTu();
                        } else if (i5 == 2) {
                            iFZBcTu = getNewProxyInstance(iFZBcTu);
                        } else if (i5 == 3) {
                            iFZBcTu = this.isConnected - i4 >= 2 ? values(iFZBcTu) : getFieldNames(iFZBcTu);
                        } else if (i5 == 4) {
                            int iUzCIH = uzCIH(iFZBcTu);
                            int i6 = i + 1;
                            cArr[i] = (char) ((iUzCIH >> 10) | 55296);
                            if (i6 >= cArr.length) {
                                cArr = this.zsXlph.gEmmrt();
                                i = 0;
                            } else {
                                i = i6;
                            }
                            iFZBcTu = (iUzCIH & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        } else if (iFZBcTu < 32) {
                            EZpvd(iFZBcTu, "string value");
                        } else {
                            fARcdN(iFZBcTu);
                        }
                        if (i >= cArr.length) {
                            cArr = this.zsXlph.gEmmrt();
                        } else {
                            i3 = i;
                        }
                        i = i3 + 1;
                        cArr[i3] = (char) iFZBcTu;
                    } else {
                        this.zsXlph.copydefault(i);
                        return;
                    }
                } else {
                    cArr[i] = (char) iFZBcTu;
                    i++;
                    i2 = i4;
                }
            }
        }
    }

    public void hBpjJd() throws java.io.IOException {
        this.QKudOq = false;
        int[] iArr = dxcTrN;
        byte[] bArr = this.giSNqX;
        while (true) {
            int i = this.fetchVPNInfo;
            int i2 = this.isConnected;
            if (i >= i2) {
                RKDWNf();
                i = this.fetchVPNInfo;
                i2 = this.isConnected;
            }
            while (true) {
                if (i >= i2) {
                    this.fetchVPNInfo = i;
                    break;
                }
                int i3 = i + 1;
                int i4 = bArr[i] & UnsignedBytes.MAX_VALUE;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    this.fetchVPNInfo = i3;
                    if (i4 == 34) {
                        return;
                    }
                    if (i5 == 1) {
                        fZBcTu();
                    } else if (i5 == 2) {
                        QCjLjM();
                    } else if (i5 == 3) {
                        QVsKAR();
                    } else if (i5 == 4) {
                        fIwbmz(i4);
                    } else if (i4 < 32) {
                        EZpvd(i4, "string value");
                    } else {
                        fARcdN(i4);
                    }
                } else {
                    i = i3;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3.AubY.valueOf() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r3.AubY.isConnected() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if ((r3.EZpvd & o.C5527Vd.aKErDB) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r3.fetchVPNInfo--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken AkhnZx(int i) throws java.io.IOException {
        if (i == 39) {
            if ((this.EZpvd & UeEOUB) != 0) {
                return ffGIBT();
            }
        } else if (i == 73) {
            AEQbTJ("Infinity", 1);
            if ((this.EZpvd & dvKsVJ) != 0) {
                return EZpvd("Infinity", Double.POSITIVE_INFINITY);
            }
            valueOf("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        } else if (i != 78) {
            if (i != 93) {
                if (i != 125) {
                    if (i == 43) {
                        if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                            EZpvd(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
                        }
                        byte[] bArr = this.giSNqX;
                        int i2 = this.fetchVPNInfo;
                        this.fetchVPNInfo = i2 + 1;
                        return copydefault(bArr[i2] & UnsignedBytes.MAX_VALUE, false, true);
                    }
                }
            }
            OLrzqt(i, "expected a value");
            if ((this.EZpvd & UeEOUB) != 0) {
            }
        } else {
            AEQbTJ("NaN", 1);
            if ((this.EZpvd & dvKsVJ) != 0) {
                return EZpvd("NaN", Double.NaN);
            }
            valueOf("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (java.lang.Character.isJavaIdentifierStart(i)) {
            KWHzl("" + ((char) i), AxsJAYaxsJAY());
        }
        OLrzqt(i, "expected a valid value " + iRxXKY());
        return null;
    }

    public com.fasterxml.jackson.core.JsonToken ffGIBT() throws java.io.IOException {
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = dxcTrN;
        byte[] bArr = this.giSNqX;
        int i = 0;
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected) {
                RKDWNf();
            }
            if (i >= cArrEZpvd.length) {
                cArrEZpvd = this.zsXlph.gEmmrt();
                i = 0;
            }
            int i2 = this.isConnected;
            int length = this.fetchVPNInfo + (cArrEZpvd.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this.fetchVPNInfo;
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    this.fetchVPNInfo = i4;
                    int iFZBcTu = bArr[i3] & UnsignedBytes.MAX_VALUE;
                    if (iFZBcTu != 39) {
                        int i5 = iArr[iFZBcTu];
                        if (i5 == 0 || iFZBcTu == 34) {
                            cArrEZpvd[i] = (char) iFZBcTu;
                            i++;
                        } else {
                            if (i5 == 1) {
                                iFZBcTu = fZBcTu();
                            } else if (i5 == 2) {
                                iFZBcTu = getNewProxyInstance(iFZBcTu);
                            } else if (i5 != 3) {
                                if (i5 == 4) {
                                    int iUzCIH = uzCIH(iFZBcTu);
                                    int i6 = i + 1;
                                    cArrEZpvd[i] = (char) ((iUzCIH >> 10) | 55296);
                                    if (i6 >= cArrEZpvd.length) {
                                        cArrEZpvd = this.zsXlph.gEmmrt();
                                        i = 0;
                                    } else {
                                        i = i6;
                                    }
                                    iFZBcTu = (iUzCIH & 1023) | Utf8.LOG_SURROGATE_HEADER;
                                } else {
                                    if (iFZBcTu < 32) {
                                        EZpvd(iFZBcTu, "string value");
                                    }
                                    fARcdN(iFZBcTu);
                                }
                            } else if (this.isConnected - i4 >= 2) {
                                iFZBcTu = values(iFZBcTu);
                            } else {
                                iFZBcTu = getFieldNames(iFZBcTu);
                            }
                            if (i >= cArrEZpvd.length) {
                                cArrEZpvd = this.zsXlph.gEmmrt();
                                i = 0;
                            }
                            cArrEZpvd[i] = (char) iFZBcTu;
                            i++;
                        }
                    } else {
                        this.zsXlph.copydefault(i);
                        return com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
                    }
                }
            }
        }
    }

    public com.fasterxml.jackson.core.JsonToken copydefault(int i, boolean z, boolean z2) throws java.io.IOException {
        java.lang.String str;
        while (i == 73) {
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                EZpvd(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this.giSNqX;
            int i2 = this.fetchVPNInfo;
            this.fetchVPNInfo = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            AEQbTJ(str, 3);
            if ((this.EZpvd & dvKsVJ) != 0) {
                return EZpvd(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            EZpvd("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        if (!copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z2 && !z) {
            AEQbTJ(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        AEQbTJ(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    public final void OBJEWx() throws java.io.IOException {
        int i;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 3;
        if (i3 < this.isConnected) {
            byte[] bArr = this.giSNqX;
            if (bArr[i2] == 114 && bArr[i2 + 1] == 117 && bArr[i2 + 2] == 101 && ((i = bArr[i3] & UnsignedBytes.MAX_VALUE) < 48 || i == 93 || i == 125)) {
                this.fetchVPNInfo = i3;
                return;
            }
        }
        KWHzl("true", 1);
    }

    public final void QSBOWP() throws java.io.IOException {
        int i;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 4;
        if (i3 < this.isConnected) {
            byte[] bArr = this.giSNqX;
            if (bArr[i2] == 97 && bArr[i2 + 1] == 108 && bArr[i2 + 2] == 115 && bArr[i2 + 3] == 101 && ((i = bArr[i3] & UnsignedBytes.MAX_VALUE) < 48 || i == 93 || i == 125)) {
                this.fetchVPNInfo = i3;
                return;
            }
        }
        KWHzl("false", 1);
    }

    public final void QkdxfA() throws java.io.IOException {
        int i;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 3;
        if (i3 < this.isConnected) {
            byte[] bArr = this.giSNqX;
            if (bArr[i2] == 117 && bArr[i2 + 1] == 108 && bArr[i2 + 2] == 108 && ((i = bArr[i3] & UnsignedBytes.MAX_VALUE) < 48 || i == 93 || i == 125)) {
                this.fetchVPNInfo = i3;
                return;
            }
        }
        KWHzl(AbstractJsonLexerKt.NULL, 1);
    }

    public final void AEQbTJ(java.lang.String str, int i) throws java.io.IOException {
        int i2;
        int length = str.length();
        if (this.fetchVPNInfo + length >= this.isConnected) {
            KWHzl(str, i);
            return;
        }
        do {
            if (this.giSNqX[this.fetchVPNInfo] != str.charAt(i)) {
                AhwBna(str.substring(0, i));
            }
            i2 = this.fetchVPNInfo + 1;
            this.fetchVPNInfo = i2;
            i++;
        } while (i < length);
        int i3 = this.giSNqX[i2] & UnsignedBytes.MAX_VALUE;
        if (i3 < 48 || i3 == 93 || i3 == 125) {
            return;
        }
        copydefault(str, i, i3);
    }

    private final void KWHzl(java.lang.String str, int i) throws java.io.IOException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.fetchVPNInfo >= this.isConnected && !QHmsKR()) || this.giSNqX[this.fetchVPNInfo] != str.charAt(i)) {
                AhwBna(str.substring(0, i));
            }
            i2 = this.fetchVPNInfo + 1;
            this.fetchVPNInfo = i2;
            i++;
        } while (i < length);
        if ((i2 < this.isConnected || QHmsKR()) && (i3 = this.giSNqX[this.fetchVPNInfo] & UnsignedBytes.MAX_VALUE) >= 48 && i3 != 93 && i3 != 125) {
            copydefault(str, i, i3);
        }
    }

    private final void copydefault(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (java.lang.Character.isJavaIdentifierPart((char) isConnected(i2))) {
            AhwBna(str.substring(0, i));
        }
    }

    private final int OxVOHk() throws java.io.IOException {
        while (true) {
            int i = this.fetchVPNInfo;
            if (i < this.isConnected) {
                byte[] bArr = this.giSNqX;
                int i2 = i + 1;
                this.fetchVPNInfo = i2;
                int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
                if (i3 > 32) {
                    if (i3 != 47 && i3 != 35) {
                        return i3;
                    }
                    this.fetchVPNInfo = i;
                    return RdAHlO();
                }
                if (i3 != 32) {
                    if (i3 == 10) {
                        this.AhwBna++;
                        this.AYXKKw = i2;
                    } else if (i3 == 13) {
                        dHguZz();
                    } else if (i3 != 9) {
                        djBIcL(i3);
                    }
                }
            } else {
                return RdAHlO();
            }
        }
    }

    public final int RdAHlO() throws java.io.IOException {
        int i;
        while (true) {
            if (this.fetchVPNInfo < this.isConnected || QHmsKR()) {
                byte[] bArr = this.giSNqX;
                int i2 = this.fetchVPNInfo;
                int i3 = i2 + 1;
                this.fetchVPNInfo = i3;
                i = bArr[i2] & UnsignedBytes.MAX_VALUE;
                if (i > 32) {
                    if (i == 47) {
                        QSLkRj();
                    } else if (i != 35 || !dUDNAs()) {
                        break;
                    }
                } else if (i != 32) {
                    if (i == 10) {
                        this.AhwBna++;
                        this.AYXKKw = i3;
                    } else if (i == 13) {
                        dHguZz();
                    } else if (i != 9) {
                        djBIcL(i);
                    }
                }
            } else {
                throw EZpvd("Unexpected end-of-input within/between " + this.AubY.DbNXlk() + " entries");
            }
        }
        return i;
    }

    private final int aUsmxb() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
            return dxcTrN();
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        int i2 = i + 1;
        this.fetchVPNInfo = i2;
        int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this.fetchVPNInfo = i;
            return USBtdM();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this.AhwBna++;
                this.AYXKKw = i2;
            } else if (i3 == 13) {
                dHguZz();
            } else if (i3 != 9) {
                djBIcL(i3);
            }
        }
        while (true) {
            int i4 = this.fetchVPNInfo;
            if (i4 < this.isConnected) {
                byte[] bArr2 = this.giSNqX;
                int i5 = i4 + 1;
                this.fetchVPNInfo = i5;
                int i6 = bArr2[i4] & UnsignedBytes.MAX_VALUE;
                if (i6 > 32) {
                    if (i6 != 47 && i6 != 35) {
                        return i6;
                    }
                    this.fetchVPNInfo = i4;
                    return USBtdM();
                }
                if (i6 != 32) {
                    if (i6 == 10) {
                        this.AhwBna++;
                        this.AYXKKw = i5;
                    } else if (i6 == 13) {
                        dHguZz();
                    } else if (i6 != 9) {
                        djBIcL(i6);
                    }
                }
            } else {
                return USBtdM();
            }
        }
    }

    private final int USBtdM() throws java.io.IOException {
        int i;
        while (true) {
            if (this.fetchVPNInfo < this.isConnected || QHmsKR()) {
                byte[] bArr = this.giSNqX;
                int i2 = this.fetchVPNInfo;
                int i3 = i2 + 1;
                this.fetchVPNInfo = i3;
                i = bArr[i2] & UnsignedBytes.MAX_VALUE;
                if (i > 32) {
                    if (i == 47) {
                        QSLkRj();
                    } else if (i != 35 || !dUDNAs()) {
                        break;
                    }
                } else if (i != 32) {
                    if (i == 10) {
                        this.AhwBna++;
                        this.AYXKKw = i3;
                    } else if (i == 13) {
                        dHguZz();
                    } else if (i != 9) {
                        djBIcL(i);
                    }
                }
            } else {
                return dxcTrN();
            }
        }
        return i;
    }

    private final int ODXsMY() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        if (i + 4 >= this.isConnected) {
            return OLrzqt(false);
        }
        byte[] bArr = this.giSNqX;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this.fetchVPNInfo = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return OLrzqt(true);
                }
                this.fetchVPNInfo = i + 2;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i + 2;
                this.fetchVPNInfo = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return OLrzqt(true);
                    }
                    this.fetchVPNInfo = i + 3;
                    return b3;
                }
            }
            return OLrzqt(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this.fetchVPNInfo = i4;
            b = bArr[i4];
        }
        if (b == 58) {
            int i5 = this.fetchVPNInfo;
            int i6 = i5 + 1;
            this.fetchVPNInfo = i6;
            byte b4 = bArr[i6];
            if (b4 > 32) {
                if (b4 == 47 || b4 == 35) {
                    return OLrzqt(true);
                }
                this.fetchVPNInfo = i5 + 2;
                return b4;
            }
            if (b4 == 32 || b4 == 9) {
                int i7 = i5 + 2;
                this.fetchVPNInfo = i7;
                byte b5 = bArr[i7];
                if (b5 > 32) {
                    if (b5 == 47 || b5 == 35) {
                        return OLrzqt(true);
                    }
                    this.fetchVPNInfo = i5 + 3;
                    return b5;
                }
            }
            return OLrzqt(true);
        }
        return OLrzqt(false);
    }

    private final int OLrzqt(boolean z) throws java.io.IOException {
        while (true) {
            if (this.fetchVPNInfo < this.isConnected || QHmsKR()) {
                byte[] bArr = this.giSNqX;
                int i = this.fetchVPNInfo;
                int i2 = i + 1;
                this.fetchVPNInfo = i2;
                int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
                if (i3 > 32) {
                    if (i3 == 47) {
                        QSLkRj();
                    } else if (i3 != 35 || !dUDNAs()) {
                        if (z) {
                            return i3;
                        }
                        if (i3 != 58) {
                            OLrzqt(i3, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (i3 != 32) {
                    if (i3 == 10) {
                        this.AhwBna++;
                        this.AYXKKw = i2;
                    } else if (i3 == 13) {
                        dHguZz();
                    } else if (i3 != 9) {
                        djBIcL(i3);
                    }
                }
            } else {
                OLrzqt(" within/between " + this.AubY.DbNXlk() + " entries", (com.fasterxml.jackson.core.JsonToken) null);
                return -1;
            }
        }
    }

    private final void QSLkRj() throws java.io.IOException {
        if ((this.EZpvd & djSkpj) == 0) {
            OLrzqt(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
            OLrzqt(" in a comment", (com.fasterxml.jackson.core.JsonToken) null);
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
        if (i2 == 47) {
            OJuSTm();
        } else if (i2 == 42) {
            OFhtUX();
        } else {
            OLrzqt(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        OLrzqt(" in a comment", (com.fasterxml.jackson.core.JsonToken) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OFhtUX() throws java.io.IOException {
        int[] iArrKWHzl = C5521Ux.KWHzl();
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                break;
            }
            byte[] bArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            int i2 = i + 1;
            this.fetchVPNInfo = i2;
            int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
            int i4 = iArrKWHzl[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    QCjLjM();
                } else if (i4 == 3) {
                    QVsKAR();
                } else if (i4 == 4) {
                    fIwbmz(i3);
                } else if (i4 == 10) {
                    this.AhwBna++;
                    this.AYXKKw = i2;
                } else if (i4 == 13) {
                    dHguZz();
                } else if (i4 == 42) {
                    if (i2 >= this.isConnected && !QHmsKR()) {
                        break;
                    }
                    byte[] bArr2 = this.giSNqX;
                    int i5 = this.fetchVPNInfo;
                    if (bArr2[i5] == 47) {
                        this.fetchVPNInfo = i5 + 1;
                        return;
                    }
                } else {
                    fARcdN(i3);
                }
            }
        }
    }

    private final boolean dUDNAs() throws java.io.IOException {
        if ((this.EZpvd & dNCPSb) == 0) {
            return false;
        }
        OJuSTm();
        return true;
    }

    private final void OJuSTm() throws java.io.IOException {
        int[] iArrKWHzl = C5521Ux.KWHzl();
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                return;
            }
            byte[] bArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            int i2 = i + 1;
            this.fetchVPNInfo = i2;
            int i3 = bArr[i] & UnsignedBytes.MAX_VALUE;
            int i4 = iArrKWHzl[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    QCjLjM();
                } else if (i4 == 3) {
                    QVsKAR();
                } else if (i4 == 4) {
                    fIwbmz(i3);
                } else if (i4 == 10) {
                    this.AhwBna++;
                    this.AYXKKw = i2;
                    return;
                } else if (i4 == 13) {
                    dHguZz();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    fARcdN(i3);
                }
            }
        }
    }

    @Override // o.AbstractC5508Ul
    public char fZBcTu() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
            OLrzqt(" in character escape sequence", com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            return copydefault((char) isConnected(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                OLrzqt(" in character escape sequence", com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this.giSNqX;
            int i4 = this.fetchVPNInfo;
            this.fetchVPNInfo = i4 + 1;
            byte b2 = bArr2[i4];
            int iKWHzl = C5521Ux.KWHzl(b2);
            if (iKWHzl < 0) {
                OLrzqt(b2 & UnsignedBytes.MAX_VALUE, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iKWHzl;
        }
        return (char) i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int isConnected(int i) throws java.io.IOException {
        int i2;
        char c;
        int iOHqIaq;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & 224) != 192) {
            if ((i & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                i2 = i & 15;
                c = 2;
            } else if ((i & 248) == 240) {
                i2 = i & 7;
                c = 3;
            } else {
                AuCTel(i3);
            }
            iOHqIaq = OHqIaq();
            if ((iOHqIaq & 192) != 128) {
                ejfBZ(iOHqIaq & 255);
            }
            int i4 = (i2 << 6) | (iOHqIaq & 63);
            if (c > 1) {
                int iOHqIaq2 = OHqIaq();
                if ((iOHqIaq2 & 192) != 128) {
                    ejfBZ(iOHqIaq2 & 255);
                }
                i4 = (i4 << 6) | (iOHqIaq2 & 63);
                if (c > 2) {
                    int iOHqIaq3 = OHqIaq();
                    if ((iOHqIaq3 & 192) != 128) {
                        ejfBZ(iOHqIaq3 & 255);
                    }
                    return (iOHqIaq3 & 63) | (i4 << 6);
                }
            }
            return i4;
        }
        i3 = i & 31;
        i2 = i3;
        c = 1;
        iOHqIaq = OHqIaq();
        if ((iOHqIaq & 192) != 128) {
        }
        int i42 = (i2 << 6) | (iOHqIaq & 63);
        if (c > 1) {
        }
        return i42;
    }

    private final int getNewProxyInstance(int i) throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            EZpvd(b & UnsignedBytes.MAX_VALUE, i3);
        }
        return ((i & 31) << 6) | (b & Utf8.REPLACEMENT_BYTE);
    }

    private final int getFieldNames(int i) throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            EZpvd(b & UnsignedBytes.MAX_VALUE, i3);
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr2 = this.giSNqX;
        int i4 = this.fetchVPNInfo;
        int i5 = i4 + 1;
        this.fetchVPNInfo = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            EZpvd(b2 & UnsignedBytes.MAX_VALUE, i5);
        }
        return ((((i & 15) << 6) | (b & Utf8.REPLACEMENT_BYTE)) << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
    }

    public final int values(int i) throws java.io.IOException {
        byte[] bArr = this.giSNqX;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            EZpvd(b & UnsignedBytes.MAX_VALUE, i3);
        }
        byte[] bArr2 = this.giSNqX;
        int i4 = this.fetchVPNInfo;
        int i5 = i4 + 1;
        this.fetchVPNInfo = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            EZpvd(b2 & UnsignedBytes.MAX_VALUE, i5);
        }
        return ((((i & 15) << 6) | (b & Utf8.REPLACEMENT_BYTE)) << 6) | (b2 & Utf8.REPLACEMENT_BYTE);
    }

    private final int uzCIH(int i) throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            EZpvd(b & UnsignedBytes.MAX_VALUE, i3);
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr2 = this.giSNqX;
        int i4 = this.fetchVPNInfo;
        int i5 = i4 + 1;
        this.fetchVPNInfo = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            EZpvd(b2 & UnsignedBytes.MAX_VALUE, i5);
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr3 = this.giSNqX;
        int i6 = this.fetchVPNInfo;
        int i7 = i6 + 1;
        this.fetchVPNInfo = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            EZpvd(b3 & UnsignedBytes.MAX_VALUE, i7);
        }
        return (((((((i & 7) << 6) | (b & Utf8.REPLACEMENT_BYTE)) << 6) | (b2 & Utf8.REPLACEMENT_BYTE)) << 6) | (b3 & Utf8.REPLACEMENT_BYTE)) - 65536;
    }

    private final void QCjLjM() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        int i2 = i + 1;
        this.fetchVPNInfo = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            EZpvd(b & UnsignedBytes.MAX_VALUE, i2);
        }
    }

    private final void QVsKAR() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        int i2 = i + 1;
        this.fetchVPNInfo = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            EZpvd(b & UnsignedBytes.MAX_VALUE, i2);
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr2 = this.giSNqX;
        int i3 = this.fetchVPNInfo;
        int i4 = i3 + 1;
        this.fetchVPNInfo = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            EZpvd(b2 & UnsignedBytes.MAX_VALUE, i4);
        }
    }

    public final void fIwbmz(int i) throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i2 = this.fetchVPNInfo;
        int i3 = i2 + 1;
        this.fetchVPNInfo = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            EZpvd(b & UnsignedBytes.MAX_VALUE, i3);
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr2 = this.giSNqX;
        int i4 = this.fetchVPNInfo;
        int i5 = i4 + 1;
        this.fetchVPNInfo = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            EZpvd(b2 & UnsignedBytes.MAX_VALUE, i5);
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr3 = this.giSNqX;
        int i6 = this.fetchVPNInfo;
        int i7 = i6 + 1;
        this.fetchVPNInfo = i7;
        byte b3 = bArr3[i6];
        if ((b3 & 192) != 128) {
            EZpvd(b3 & UnsignedBytes.MAX_VALUE, i7);
        }
    }

    public final void dHguZz() throws java.io.IOException {
        if (this.fetchVPNInfo < this.isConnected || QHmsKR()) {
            byte[] bArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            if (bArr[i] == 10) {
                this.fetchVPNInfo = i + 1;
            }
        }
        this.AhwBna++;
        this.AYXKKw = this.fetchVPNInfo;
    }

    public final int OHqIaq() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            RKDWNf();
        }
        byte[] bArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    public void AhwBna(java.lang.String str) throws java.io.IOException {
        KWHzl(str, AxsJAYaxsJAY());
    }

    public void KWHzl(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !QHmsKR()) {
                break;
            }
            byte[] bArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            this.fetchVPNInfo = i + 1;
            char cIsConnected = (char) isConnected(bArr[i]);
            if (!java.lang.Character.isJavaIdentifierPart(cIsConnected)) {
                break;
            }
            sb.append(cIsConnected);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        EZpvd("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public void fARcdN(int i) throws JsonParseException {
        if (i < 32) {
            djBIcL(i);
        }
        AuCTel(i);
    }

    public void AuCTel(int i) throws JsonParseException {
        valueOf("Invalid UTF-8 start byte 0x" + java.lang.Integer.toHexString(i));
    }

    public void ejfBZ(int i) throws JsonParseException {
        valueOf("Invalid UTF-8 middle byte 0x" + java.lang.Integer.toHexString(i));
    }

    public void EZpvd(int i, int i2) throws JsonParseException {
        this.fetchVPNInfo = i2;
        ejfBZ(i);
    }

    public final byte[] AEQbTJ(Base64Variant base64Variant) throws java.io.IOException {
        C5537Vn c5537VnFlVtFt = flVtFt();
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected) {
                RKDWNf();
            }
            byte[] bArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            this.fetchVPNInfo = i + 1;
            int i2 = bArr[i] & UnsignedBytes.MAX_VALUE;
            if (i2 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i2);
                if (iDecodeBase64Char < 0) {
                    if (i2 == 34) {
                        return c5537VnFlVtFt.AYXKKw();
                    }
                    iDecodeBase64Char = OLrzqt(base64Variant, i2, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.fetchVPNInfo >= this.isConnected) {
                    RKDWNf();
                }
                byte[] bArr2 = this.giSNqX;
                int i3 = this.fetchVPNInfo;
                this.fetchVPNInfo = i3 + 1;
                int i4 = bArr2[i3] & UnsignedBytes.MAX_VALUE;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = OLrzqt(base64Variant, i4, 1);
                }
                int i5 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.fetchVPNInfo >= this.isConnected) {
                    RKDWNf();
                }
                byte[] bArr3 = this.giSNqX;
                int i6 = this.fetchVPNInfo;
                this.fetchVPNInfo = i6 + 1;
                int i7 = bArr3[i6] & UnsignedBytes.MAX_VALUE;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i7);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i7 == 34) {
                            c5537VnFlVtFt.copydefault(i5 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            return c5537VnFlVtFt.AYXKKw();
                        }
                        iDecodeBase64Char3 = OLrzqt(base64Variant, i7, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.fetchVPNInfo >= this.isConnected) {
                            RKDWNf();
                        }
                        byte[] bArr4 = this.giSNqX;
                        int i8 = this.fetchVPNInfo;
                        this.fetchVPNInfo = i8 + 1;
                        int i9 = bArr4[i8] & UnsignedBytes.MAX_VALUE;
                        if (!base64Variant.usesPaddingChar(i9) && OLrzqt(base64Variant, i9, 3) != -2) {
                            throw KWHzl(base64Variant, i9, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        c5537VnFlVtFt.copydefault(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | iDecodeBase64Char3;
                if (this.fetchVPNInfo >= this.isConnected) {
                    RKDWNf();
                }
                byte[] bArr5 = this.giSNqX;
                int i11 = this.fetchVPNInfo;
                this.fetchVPNInfo = i11 + 1;
                int i12 = bArr5[i11] & UnsignedBytes.MAX_VALUE;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i12);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i12 == 34) {
                            c5537VnFlVtFt.OLrzqt(i10 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            return c5537VnFlVtFt.AYXKKw();
                        }
                        iDecodeBase64Char4 = OLrzqt(base64Variant, i12, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        c5537VnFlVtFt.OLrzqt(i10 >> 2);
                    }
                }
                c5537VnFlVtFt.EZpvd((i10 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation gHZMYf() {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return new JsonLocation(dvKsVJ(), this.gEmmrt + ((long) (this.gGvvIC - 1)), -1L, this.AxsJAYaxsJAY, this.gasjUx);
        }
        return new JsonLocation(dvKsVJ(), this.AxsJAY - 1, -1L, this.gHZMYf, this.sSMYrx);
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation fetchVPNInfo() {
        return new JsonLocation(dvKsVJ(), this.gEmmrt + ((long) this.fetchVPNInfo), -1L, this.AhwBna, (this.fetchVPNInfo - this.AYXKKw) + 1);
    }

    public final com.fasterxml.jackson.core.JsonToken AhwBna(int i) throws JsonParseException {
        if (i == 125) {
            DCUTEI();
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        zuWLRA();
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
        this.QVAiDq = jsonToken2;
        return jsonToken2;
    }

    public final void zuWLRA() throws JsonParseException {
        QwvEab();
        if (!this.AubY.valueOf()) {
            copydefault(93, AbstractJsonLexerKt.END_OBJ);
        }
        this.AubY = this.AubY.fetchVPNInfo();
    }

    public final void DCUTEI() throws JsonParseException {
        QwvEab();
        if (!this.AubY.djBIcL()) {
            copydefault(125, AbstractJsonLexerKt.END_LIST);
        }
        this.AubY = this.AubY.fetchVPNInfo();
    }
}
