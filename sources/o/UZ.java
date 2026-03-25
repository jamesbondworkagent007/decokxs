package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public class UZ extends AbstractC5508Ul {
    public boolean finit;
    public final int flVtFt;
    public int fvQaOB;
    public int gGvvIC;
    public long gasjUx;
    public char[] giSNqX;
    public final C5534Vk gkJEwt;
    public boolean hUfVAv;
    public AbstractC5505Ui iRxXKY;
    public java.io.Reader iZzfmt;
    public static final int dvKsVJ = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int dxcTrN = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int fZBcTu = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int dNCPSb = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int aKErDB = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int djSkpj = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int RcXXUw = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int UeEOUB = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] fFgQHt = C5521Ux.EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public C5541Vr<StreamReadCapability> AubY() {
        return AbstractC5508Ul.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DLWbHP() {
        int i = this.fetchVPNInfo;
        this.AxsJAY = this.gEmmrt + ((long) i);
        this.gHZMYf = this.AhwBna;
        this.sSMYrx = i - this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void hrNTAI() {
        int i = this.fetchVPNInfo;
        this.gasjUx = i;
        this.gGvvIC = this.AhwBna;
        this.fvQaOB = i - this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC5505Ui values() {
        return this.iRxXKY;
    }

    public UZ(C5517Ut c5517Ut, int i, java.io.Reader reader, AbstractC5505Ui abstractC5505Ui, C5534Vk c5534Vk, char[] cArr, int i2, int i3, boolean z) {
        super(c5517Ut, i);
        this.iZzfmt = reader;
        this.iRxXKY = abstractC5505Ui;
        this.giSNqX = cArr;
        this.fetchVPNInfo = i2;
        this.isConnected = i3;
        this.AYXKKw = i2;
        this.gEmmrt = -i2;
        this.gkJEwt = c5534Vk;
        this.flVtFt = c5534Vk.AEQbTJ();
        this.finit = z;
    }

    public UZ(C5517Ut c5517Ut, int i, java.io.Reader reader, AbstractC5505Ui abstractC5505Ui, C5534Vk c5534Vk) {
        super(c5517Ut, i);
        this.iZzfmt = reader;
        this.giSNqX = c5517Ut.OLrzqt();
        this.fetchVPNInfo = 0;
        this.isConnected = 0;
        this.iRxXKY = abstractC5505Ui;
        this.gkJEwt = c5534Vk;
        this.flVtFt = c5534Vk.AEQbTJ();
        this.finit = true;
    }

    public char KWHzl(java.lang.String str, com.fasterxml.jackson.core.JsonToken jsonToken) throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
            OLrzqt(str, jsonToken);
        }
        char[] cArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        return cArr[i];
    }

    @Override // o.AbstractC5508Ul
    public void djSkpj() throws java.io.IOException {
        if (this.iZzfmt != null) {
            if (this.AuCTel.AhwBna() || copydefault(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this.iZzfmt.close();
            }
            this.iZzfmt = null;
        }
    }

    @Override // o.AbstractC5508Ul
    public void fvQaOB() throws java.io.IOException {
        char[] cArr;
        super.fvQaOB();
        this.gkJEwt.djBIcL();
        if (!this.finit || (cArr = this.giSNqX) == null) {
            return;
        }
        this.giSNqX = null;
        this.AuCTel.EZpvd(cArr);
    }

    public void ffGIBT() throws java.io.IOException {
        if (OuxcSI()) {
            return;
        }
        ODWQjV();
    }

    public boolean OuxcSI() throws java.io.IOException {
        java.io.Reader reader = this.iZzfmt;
        if (reader != null) {
            char[] cArr = this.giSNqX;
            int i = reader.read(cArr, 0, cArr.length);
            if (i > 0) {
                int i2 = this.isConnected;
                long j = i2;
                this.gEmmrt += j;
                this.AYXKKw -= i2;
                this.gasjUx -= j;
                this.fetchVPNInfo = 0;
                this.isConnected = i;
                return true;
            }
            djSkpj();
            if (i == 0) {
                throw new java.io.IOException("Reader returned 0 characters when trying to read " + this.isConnected);
            }
        }
        return false;
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public final java.lang.String zLjUOn() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            if (this.hUfVAv) {
                this.hUfVAv = false;
                fFgQHt();
            }
            return this.zsXlph.copydefault();
        }
        return OLrzqt(jsonToken);
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public final java.lang.String QKVWgx() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            if (this.hUfVAv) {
                this.hUfVAv = false;
                fFgQHt();
            }
            return this.zsXlph.copydefault();
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return isConnected();
        }
        return super.AEQbTJ((java.lang.String) null);
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public final java.lang.String AEQbTJ(java.lang.String str) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            if (this.hUfVAv) {
                this.hUfVAv = false;
                fFgQHt();
            }
            return this.zsXlph.copydefault();
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return isConnected();
        }
        return super.AEQbTJ(str);
    }

    public final java.lang.String OLrzqt(com.fasterxml.jackson.core.JsonToken jsonToken) {
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
    public final char[] sSMYrx() throws java.io.IOException {
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
            } else if (this.hUfVAv) {
                this.hUfVAv = false;
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
    public final int AwvSrB() throws java.io.IOException {
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
        } else if (this.hUfVAv) {
            this.hUfVAv = false;
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
    public final int zuBGHE() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != null) {
            int iId = jsonToken.id();
            if (iId != 6) {
                if (iId != 7) {
                }
            } else if (this.hUfVAv) {
                this.hUfVAv = false;
                fFgQHt();
            }
            return this.zsXlph.isConnected();
        }
        return 0;
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public byte[] copydefault(Base64Variant base64Variant) throws java.io.IOException {
        byte[] bArr;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this.OLrzqt) != null) {
            return bArr;
        }
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            valueOf("Current token (" + this.QVAiDq + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.hUfVAv) {
            try {
                this.OLrzqt = AEQbTJ(base64Variant);
                this.hUfVAv = false;
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
        if (!this.hUfVAv || this.QVAiDq != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            byte[] bArrCopydefault = copydefault(base64Variant);
            outputStream.write(bArrCopydefault);
            return bArrCopydefault.length;
        }
        byte[] bArrKWHzl = this.AuCTel.KWHzl();
        try {
            return EZpvd(base64Variant, outputStream, bArrKWHzl);
        } finally {
            this.AuCTel.AEQbTJ(bArrKWHzl);
        }
    }

    public int EZpvd(Base64Variant base64Variant, java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected) {
                ffGIBT();
            }
            char[] cArr = this.giSNqX;
            int i3 = this.fetchVPNInfo;
            this.fetchVPNInfo = i3 + 1;
            char c = cArr[i3];
            if (c > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c);
                if (iDecodeBase64Char < 0) {
                    if (c == '\"') {
                        break;
                    }
                    iDecodeBase64Char = KWHzl(base64Variant, c, 0);
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
                    ffGIBT();
                }
                char[] cArr2 = this.giSNqX;
                int i4 = this.fetchVPNInfo;
                this.fetchVPNInfo = i4 + 1;
                char c2 = cArr2[i4];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = KWHzl(base64Variant, c2, 1);
                }
                int i5 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.fetchVPNInfo >= this.isConnected) {
                    ffGIBT();
                }
                char[] cArr3 = this.giSNqX;
                int i6 = this.fetchVPNInfo;
                this.fetchVPNInfo = i6 + 1;
                char c3 = cArr3[i6];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c3 == '\"') {
                            bArr[i] = (byte) (i5 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            i++;
                        } else {
                            iDecodeBase64Char3 = KWHzl(base64Variant, c3, 2);
                        }
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.fetchVPNInfo >= this.isConnected) {
                            ffGIBT();
                        }
                        char[] cArr4 = this.giSNqX;
                        int i7 = this.fetchVPNInfo;
                        this.fetchVPNInfo = i7 + 1;
                        char c4 = cArr4[i7];
                        if (!base64Variant.usesPaddingChar(c4) && KWHzl(base64Variant, c4, 3) != -2) {
                            throw KWHzl(base64Variant, c4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        bArr[i] = (byte) (i5 >> 4);
                        i++;
                    }
                }
                int i8 = (i5 << 6) | iDecodeBase64Char3;
                if (this.fetchVPNInfo >= this.isConnected) {
                    ffGIBT();
                }
                char[] cArr5 = this.giSNqX;
                int i9 = this.fetchVPNInfo;
                this.fetchVPNInfo = i9 + 1;
                char c5 = cArr5[i9];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c5 == '\"') {
                            bArr[i] = (byte) (i8 >> 10);
                            int i10 = i + 2;
                            bArr[i + 1] = (byte) (i8 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            i = i10;
                        } else {
                            iDecodeBase64Char4 = KWHzl(base64Variant, c5, 3);
                        }
                    }
                    if (iDecodeBase64Char4 == -2) {
                        bArr[i] = (byte) (i8 >> 10);
                        bArr[i + 1] = (byte) (i8 >> 2);
                        i += 2;
                    }
                }
                int i11 = (i8 << 6) | iDecodeBase64Char4;
                bArr[i] = (byte) (i11 >> 16);
                bArr[i + 1] = (byte) (i11 >> 8);
                bArr[i + 2] = (byte) i11;
                i += 3;
            }
        }
        this.hUfVAv = false;
        if (i <= 0) {
            return i2;
        }
        int i12 = i2 + i;
        outputStream.write(bArr, 0, i);
        return i12;
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public final com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenFetchVPNInfo;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return QkdxfA();
        }
        this.ejfBZ = 0;
        if (this.hUfVAv) {
            gwTjWJ();
        }
        int iOFhtUX = OFhtUX();
        if (iOFhtUX < 0) {
            close();
            this.QVAiDq = null;
            return null;
        }
        this.OLrzqt = null;
        if (iOFhtUX == 93 || iOFhtUX == 125) {
            AhwBna(iOFhtUX);
            return this.QVAiDq;
        }
        if (this.AubY.values()) {
            iOFhtUX = AkhnZx(iOFhtUX);
            if ((this.EZpvd & dvKsVJ) != 0 && (iOFhtUX == 93 || iOFhtUX == 125)) {
                AhwBna(iOFhtUX);
                return this.QVAiDq;
            }
        }
        boolean zDjBIcL = this.AubY.djBIcL();
        if (zDjBIcL) {
            hrNTAI();
            this.AubY.KWHzl(iOFhtUX == 34 ? QHmsKR() : values(iOFhtUX));
            this.QVAiDq = jsonToken2;
            iOFhtUX = dmfpNf();
        }
        DLWbHP();
        if (iOFhtUX == 34) {
            this.hUfVAv = true;
            jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
        } else if (iOFhtUX != 43) {
            if (iOFhtUX == 91) {
                if (!zDjBIcL) {
                    this.AubY = this.AubY.copydefault(this.gHZMYf, this.sSMYrx);
                }
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            } else if (iOFhtUX == 102) {
                QVsKAR();
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            } else if (iOFhtUX == 110) {
                OxVOHk();
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            } else if (iOFhtUX == 116) {
                QCjLjM();
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            } else if (iOFhtUX == 123) {
                if (!zDjBIcL) {
                    this.AubY = this.AubY.OLrzqt(this.gHZMYf, this.sSMYrx);
                }
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            } else if (iOFhtUX == 125) {
                OLrzqt(iOFhtUX, "expected a value");
                QCjLjM();
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            } else if (iOFhtUX == 45) {
                jsonTokenFetchVPNInfo = OLrzqt(true);
            } else if (iOFhtUX == 46) {
                jsonTokenFetchVPNInfo = EZpvd(false);
            } else {
                switch (iOFhtUX) {
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
                        jsonTokenFetchVPNInfo = DbNXlk(iOFhtUX);
                        break;
                    default:
                        jsonTokenFetchVPNInfo = fetchVPNInfo(iOFhtUX);
                        break;
                }
            }
        } else if (copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonTokenFetchVPNInfo = OLrzqt(false);
        } else {
            jsonTokenFetchVPNInfo = fetchVPNInfo(iOFhtUX);
        }
        if (zDjBIcL) {
            this.fIwbmz = jsonTokenFetchVPNInfo;
            return this.QVAiDq;
        }
        this.QVAiDq = jsonTokenFetchVPNInfo;
        return jsonTokenFetchVPNInfo;
    }

    public final com.fasterxml.jackson.core.JsonToken QkdxfA() {
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
        com.fasterxml.jackson.core.JsonToken jsonTokenFetchVPNInfo;
        this.ejfBZ = 0;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            QkdxfA();
            return null;
        }
        if (this.hUfVAv) {
            gwTjWJ();
        }
        int iOFhtUX = OFhtUX();
        if (iOFhtUX < 0) {
            close();
            this.QVAiDq = null;
            return null;
        }
        this.OLrzqt = null;
        if (iOFhtUX == 93 || iOFhtUX == 125) {
            AhwBna(iOFhtUX);
            return null;
        }
        if (this.AubY.values()) {
            iOFhtUX = AkhnZx(iOFhtUX);
            if ((this.EZpvd & dvKsVJ) != 0 && (iOFhtUX == 93 || iOFhtUX == 125)) {
                AhwBna(iOFhtUX);
                return null;
            }
        }
        if (!this.AubY.djBIcL()) {
            DLWbHP();
            isConnected(iOFhtUX);
            return null;
        }
        hrNTAI();
        java.lang.String strQHmsKR = iOFhtUX == 34 ? QHmsKR() : values(iOFhtUX);
        this.AubY.KWHzl(strQHmsKR);
        this.QVAiDq = jsonToken2;
        int iDmfpNf = dmfpNf();
        DLWbHP();
        if (iDmfpNf == 34) {
            this.hUfVAv = true;
            this.fIwbmz = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            return strQHmsKR;
        }
        if (iDmfpNf != 43) {
            if (iDmfpNf == 91) {
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            } else if (iDmfpNf == 102) {
                QVsKAR();
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            } else if (iDmfpNf == 110) {
                OxVOHk();
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            } else if (iDmfpNf == 116) {
                QCjLjM();
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            } else if (iDmfpNf == 123) {
                jsonTokenFetchVPNInfo = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            } else if (iDmfpNf == 45) {
                jsonTokenFetchVPNInfo = OLrzqt(true);
            } else if (iDmfpNf == 46) {
                jsonTokenFetchVPNInfo = EZpvd(false);
            } else {
                switch (iDmfpNf) {
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
                        jsonTokenFetchVPNInfo = DbNXlk(iDmfpNf);
                        break;
                    default:
                        jsonTokenFetchVPNInfo = fetchVPNInfo(iDmfpNf);
                        break;
                }
            }
        } else if (copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonTokenFetchVPNInfo = OLrzqt(false);
        } else {
            jsonTokenFetchVPNInfo = fetchVPNInfo(iDmfpNf);
        }
        this.fIwbmz = jsonTokenFetchVPNInfo;
        return strQHmsKR;
    }

    public final com.fasterxml.jackson.core.JsonToken isConnected(int i) throws java.io.IOException {
        if (i == 34) {
            this.hUfVAv = true;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        if (i == 91) {
            this.AubY = this.AubY.copydefault(this.gHZMYf, this.sSMYrx);
            com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            this.QVAiDq = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            KWHzl("false", 1);
            com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            this.QVAiDq = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            KWHzl(AbstractJsonLexerKt.NULL, 1);
            com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            this.QVAiDq = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            KWHzl("true", 1);
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
        switch (i) {
            case 44:
                if (!this.AubY.isConnected() && (this.EZpvd & dNCPSb) != 0) {
                    this.fetchVPNInfo--;
                    com.fasterxml.jackson.core.JsonToken jsonToken7 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
                    this.QVAiDq = jsonToken7;
                    return jsonToken7;
                }
                break;
            case 45:
                com.fasterxml.jackson.core.JsonToken jsonTokenOLrzqt = OLrzqt(true);
                this.QVAiDq = jsonTokenOLrzqt;
                return jsonTokenOLrzqt;
            case 46:
                com.fasterxml.jackson.core.JsonToken jsonTokenEZpvd = EZpvd(false);
                this.QVAiDq = jsonTokenEZpvd;
                return jsonTokenEZpvd;
            default:
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
                        com.fasterxml.jackson.core.JsonToken jsonTokenDbNXlk = DbNXlk(i);
                        this.QVAiDq = jsonTokenDbNXlk;
                        return jsonTokenDbNXlk;
                }
        }
        com.fasterxml.jackson.core.JsonToken jsonTokenFetchVPNInfo = fetchVPNInfo(i);
        this.QVAiDq = jsonTokenFetchVPNInfo;
        return jsonTokenFetchVPNInfo;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final java.lang.String dNCPSb() throws java.io.IOException {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            this.fARcdN = false;
            com.fasterxml.jackson.core.JsonToken jsonToken = this.fIwbmz;
            this.fIwbmz = null;
            this.QVAiDq = jsonToken;
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
                if (this.hUfVAv) {
                    this.hUfVAv = false;
                    fFgQHt();
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

    public final com.fasterxml.jackson.core.JsonToken EZpvd(boolean z) throws java.io.IOException {
        if (!copydefault(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return fetchVPNInfo(46);
        }
        int i = this.fetchVPNInfo;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return KWHzl(46, i2, i, z, 0);
    }

    public final com.fasterxml.jackson.core.JsonToken DbNXlk(int i) throws java.io.IOException {
        int i2 = this.fetchVPNInfo;
        int i3 = i2 - 1;
        int i4 = this.isConnected;
        if (i == 48) {
            return AEQbTJ(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this.giSNqX[i2];
            if (c < '0' || c > '9') {
                if (c == '.' || c == 'e' || c == 'E') {
                    this.fetchVPNInfo = i6;
                    return KWHzl(c, i3, i6, false, i5);
                }
                this.fetchVPNInfo = i2;
                if (this.AubY.isConnected()) {
                    ejfBZ(c);
                }
                this.zsXlph.EZpvd(this.giSNqX, i3, i2 - i3);
                return KWHzl(false, i5);
            }
            i5++;
            i2 = i6;
        }
        this.fetchVPNInfo = i3;
        return AEQbTJ(false, i3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken KWHzl(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final com.fasterxml.jackson.core.JsonToken OLrzqt(boolean z) throws java.io.IOException {
        int i = this.fetchVPNInfo;
        int i2 = z ? i - 1 : i;
        int i3 = this.isConnected;
        if (i >= i3) {
            return AEQbTJ(z, i2);
        }
        int i4 = i + 1;
        char c = this.giSNqX[i];
        if (c > '9' || c < '0') {
            this.fetchVPNInfo = i4;
            if (c == '.') {
                return EZpvd(z);
            }
            return OLrzqt((int) c, z, true);
        }
        if (c == '0') {
            return AEQbTJ(z, i2);
        }
        int i5 = 1;
        while (i4 < i3) {
            int i6 = i4 + 1;
            char c2 = this.giSNqX[i4];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this.fetchVPNInfo = i6;
                    return KWHzl(c2, i2, i6, z, i5);
                }
                this.fetchVPNInfo = i4;
                if (this.AubY.isConnected()) {
                    ejfBZ(c2);
                }
                this.zsXlph.EZpvd(this.giSNqX, i2, i4 - i2);
                return KWHzl(z, i5);
            }
            i5++;
            i4 = i6;
        }
        return AEQbTJ(z, i2);
    }

    public final com.fasterxml.jackson.core.JsonToken AEQbTJ(boolean z, int i) throws java.io.IOException {
        int i2;
        char cKWHzl;
        boolean z2;
        int i3;
        char cKWHzl2;
        char cKWHzl3;
        if (z) {
            i++;
        }
        this.fetchVPNInfo = i;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        if (z) {
            cArrEZpvd[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = this.fetchVPNInfo;
        if (i4 < this.isConnected) {
            char[] cArr = this.giSNqX;
            this.fetchVPNInfo = i4 + 1;
            cKWHzl = cArr[i4];
        } else {
            cKWHzl = KWHzl("No digit following minus sign", com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
        }
        if (cKWHzl == '0') {
            cKWHzl = OJuSTm();
        }
        int i5 = 0;
        while (cKWHzl >= '0' && cKWHzl <= '9') {
            i5++;
            if (i2 >= cArrEZpvd.length) {
                cArrEZpvd = this.zsXlph.gEmmrt();
                i2 = 0;
            }
            int i6 = i2 + 1;
            cArrEZpvd[i2] = cKWHzl;
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                cKWHzl = 0;
                i2 = i6;
                z2 = true;
                break;
            }
            char[] cArr2 = this.giSNqX;
            int i7 = this.fetchVPNInfo;
            this.fetchVPNInfo = i7 + 1;
            cKWHzl = cArr2[i7];
            i2 = i6;
        }
        z2 = false;
        if (i5 == 0 && !copydefault(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return copydefault(cKWHzl, z);
        }
        int i8 = -1;
        if (cKWHzl == '.') {
            if (i2 >= cArrEZpvd.length) {
                cArrEZpvd = this.zsXlph.gEmmrt();
                i2 = 0;
            }
            cArrEZpvd[i2] = cKWHzl;
            i2++;
            i3 = 0;
            while (true) {
                if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this.giSNqX;
                int i9 = this.fetchVPNInfo;
                this.fetchVPNInfo = i9 + 1;
                cKWHzl = cArr3[i9];
                if (cKWHzl < '0' || cKWHzl > '9') {
                    break;
                }
                i3++;
                if (i2 >= cArrEZpvd.length) {
                    cArrEZpvd = this.zsXlph.gEmmrt();
                    i2 = 0;
                }
                cArrEZpvd[i2] = cKWHzl;
                i2++;
            }
            if (i3 == 0 && !copydefault(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                AEQbTJ(cKWHzl, "Decimal point not followed by a digit");
            }
        } else {
            i3 = -1;
        }
        if (cKWHzl == 'e' || cKWHzl == 'E') {
            if (i2 >= cArrEZpvd.length) {
                cArrEZpvd = this.zsXlph.gEmmrt();
                i2 = 0;
            }
            int i10 = i2 + 1;
            cArrEZpvd[i2] = cKWHzl;
            int i11 = this.fetchVPNInfo;
            if (i11 < this.isConnected) {
                char[] cArr4 = this.giSNqX;
                this.fetchVPNInfo = i11 + 1;
                cKWHzl2 = cArr4[i11];
            } else {
                cKWHzl2 = KWHzl("expected a digit for number exponent", com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
            }
            if (cKWHzl2 == '-' || cKWHzl2 == '+') {
                if (i10 >= cArrEZpvd.length) {
                    cArrEZpvd = this.zsXlph.gEmmrt();
                    i10 = 0;
                }
                cArrEZpvd[i10] = cKWHzl2;
                int i12 = this.fetchVPNInfo;
                if (i12 < this.isConnected) {
                    char[] cArr5 = this.giSNqX;
                    this.fetchVPNInfo = i12 + 1;
                    cKWHzl3 = cArr5[i12];
                } else {
                    cKWHzl3 = KWHzl("expected a digit for number exponent", com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
                }
                cKWHzl2 = cKWHzl3;
                i10++;
            }
            int i13 = 0;
            cKWHzl = cKWHzl2;
            while (cKWHzl <= '9' && cKWHzl >= '0') {
                i13++;
                if (i10 >= cArrEZpvd.length) {
                    cArrEZpvd = this.zsXlph.gEmmrt();
                    i10 = 0;
                }
                i2 = i10 + 1;
                cArrEZpvd[i10] = cKWHzl;
                if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                    i8 = i13;
                    z2 = true;
                    break;
                }
                char[] cArr6 = this.giSNqX;
                int i14 = this.fetchVPNInfo;
                this.fetchVPNInfo = i14 + 1;
                cKWHzl = cArr6[i14];
                i10 = i2;
            }
            i2 = i10;
            i8 = i13;
            if (i8 == 0) {
                AEQbTJ(cKWHzl, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this.fetchVPNInfo--;
            if (this.AubY.isConnected()) {
                ejfBZ(cKWHzl);
            }
        }
        this.zsXlph.copydefault(i2);
        if (i3 < 0 && i8 < 0) {
            return KWHzl(z, i5);
        }
        return copydefault(z, i5, i3, i8);
    }

    public final char OJuSTm() throws java.io.IOException {
        char c;
        int i = this.fetchVPNInfo;
        if (i >= this.isConnected || ((c = this.giSNqX[i]) >= '0' && c <= '9')) {
            return QSLkRj();
        }
        return '0';
    }

    public final char QSLkRj() throws java.io.IOException {
        char c;
        if ((this.fetchVPNInfo >= this.isConnected && !OuxcSI()) || (c = this.giSNqX[this.fetchVPNInfo]) < '0' || c > '9') {
            return '0';
        }
        if ((this.EZpvd & dxcTrN) == 0) {
            AYXKKw("Leading zeroes not allowed");
        }
        this.fetchVPNInfo++;
        if (c == '0') {
            do {
                if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                    break;
                }
                char[] cArr = this.giSNqX;
                int i = this.fetchVPNInfo;
                c = cArr[i];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this.fetchVPNInfo = i + 1;
            } while (c == '0');
        }
        return c;
    }

    public com.fasterxml.jackson.core.JsonToken copydefault(int i, boolean z) throws java.io.IOException {
        return OLrzqt(i, z, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public com.fasterxml.jackson.core.JsonToken OLrzqt(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    public final void ejfBZ(int i) throws java.io.IOException {
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

    public final java.lang.String QHmsKR() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        int i2 = this.flVtFt;
        int[] iArr = fFgQHt;
        while (true) {
            if (i >= this.isConnected) {
                break;
            }
            char[] cArr = this.giSNqX;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this.fetchVPNInfo;
                this.fetchVPNInfo = i + 1;
                return this.gkJEwt.AEQbTJ(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this.fetchVPNInfo;
        this.fetchVPNInfo = i;
        return AEQbTJ(i4, i2, 34);
    }

    public final java.lang.String AEQbTJ(int i, int i2, int i3) throws java.io.IOException {
        this.zsXlph.EZpvd(this.giSNqX, i, this.fetchVPNInfo - i);
        char[] cArrAhwBna = this.zsXlph.AhwBna();
        int iDjBIcL = this.zsXlph.djBIcL();
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                OLrzqt(" in field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
            }
            char[] cArr = this.giSNqX;
            int i4 = this.fetchVPNInfo;
            this.fetchVPNInfo = i4 + 1;
            char cFZBcTu = cArr[i4];
            if (cFZBcTu <= '\\') {
                if (cFZBcTu == '\\') {
                    cFZBcTu = fZBcTu();
                } else if (cFZBcTu <= i3) {
                    if (cFZBcTu == i3) {
                        this.zsXlph.copydefault(iDjBIcL);
                        C5544Vu c5544Vu = this.zsXlph;
                        return this.gkJEwt.AEQbTJ(c5544Vu.valueOf(), c5544Vu.isConnected(), c5544Vu.values(), i2);
                    }
                    if (cFZBcTu < ' ') {
                        EZpvd(cFZBcTu, "name");
                    }
                }
            }
            i2 = (i2 * 33) + cFZBcTu;
            int i5 = iDjBIcL + 1;
            cArrAhwBna[iDjBIcL] = cFZBcTu;
            if (i5 >= cArrAhwBna.length) {
                cArrAhwBna = this.zsXlph.gEmmrt();
                iDjBIcL = 0;
            } else {
                iDjBIcL = i5;
            }
        }
    }

    public java.lang.String values(int i) throws java.io.IOException {
        if (i == 39 && (this.EZpvd & aKErDB) != 0) {
            return RKDWNf();
        }
        if ((this.EZpvd & djSkpj) == 0) {
            OLrzqt(i, "was expecting double-quote to start field name");
        }
        int[] iArrCopydefault = C5521Ux.copydefault();
        int length = iArrCopydefault.length;
        if (i >= length ? !java.lang.Character.isJavaIdentifierPart((char) i) : iArrCopydefault[i] != 0) {
            OLrzqt(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this.fetchVPNInfo;
        int i3 = this.flVtFt;
        int i4 = this.isConnected;
        if (i2 < i4) {
            do {
                char[] cArr = this.giSNqX;
                char c = cArr[i2];
                if (c < length) {
                    if (iArrCopydefault[c] != 0) {
                        int i5 = this.fetchVPNInfo - 1;
                        this.fetchVPNInfo = i2;
                        return this.gkJEwt.AEQbTJ(cArr, i5, i2 - i5, i3);
                    }
                } else if (!java.lang.Character.isJavaIdentifierPart(c)) {
                    int i6 = this.fetchVPNInfo - 1;
                    this.fetchVPNInfo = i2;
                    return this.gkJEwt.AEQbTJ(this.giSNqX, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c;
                i2++;
            } while (i2 < i4);
        }
        int i7 = this.fetchVPNInfo;
        this.fetchVPNInfo = i2;
        return OLrzqt(i7 - 1, i3, iArrCopydefault);
    }

    public java.lang.String RKDWNf() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        int i2 = this.flVtFt;
        int i3 = this.isConnected;
        if (i < i3) {
            int[] iArr = fFgQHt;
            int length = iArr.length;
            do {
                char[] cArr = this.giSNqX;
                char c = cArr[i];
                if (c == '\'') {
                    int i4 = this.fetchVPNInfo;
                    this.fetchVPNInfo = i + 1;
                    return this.gkJEwt.AEQbTJ(cArr, i4, i - i4, i2);
                }
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i2 = (i2 * 33) + c;
                i++;
            } while (i < i3);
        }
        int i5 = this.fetchVPNInfo;
        this.fetchVPNInfo = i;
        return AEQbTJ(i5, i2, 39);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken fetchVPNInfo(int i) throws java.io.IOException {
        if (i != 39) {
            if (i == 73) {
                KWHzl("Infinity", 1);
                if ((this.EZpvd & fZBcTu) != 0) {
                    return EZpvd("Infinity", Double.POSITIVE_INFINITY);
                }
                valueOf("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            } else if (i == 78) {
                KWHzl("NaN", 1);
                if ((this.EZpvd & fZBcTu) != 0) {
                    return EZpvd("NaN", Double.NaN);
                }
                valueOf("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            } else if (i != 93) {
                if (i == 43) {
                    if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                        EZpvd(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this.giSNqX;
                    int i2 = this.fetchVPNInfo;
                    this.fetchVPNInfo = i2 + 1;
                    return OLrzqt((int) cArr[i2], false, true);
                }
                if (i == 44) {
                    if (!this.AubY.isConnected() && (this.EZpvd & dNCPSb) != 0) {
                        this.fetchVPNInfo--;
                        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
                    }
                }
            } else if (this.AubY.valueOf()) {
            }
        } else if ((this.EZpvd & aKErDB) != 0) {
            return DCUTEI();
        }
        if (java.lang.Character.isJavaIdentifierStart(i)) {
            OLrzqt("" + ((char) i), AxsJAYaxsJAY());
        }
        OLrzqt(i, "expected a valid value " + iRxXKY());
        return null;
    }

    public com.fasterxml.jackson.core.JsonToken DCUTEI() throws java.io.IOException {
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int iDjBIcL = this.zsXlph.djBIcL();
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                OLrzqt(": was expecting closing quote for a string value", com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
            }
            char[] cArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            this.fetchVPNInfo = i + 1;
            char cFZBcTu = cArr[i];
            if (cFZBcTu <= '\\') {
                if (cFZBcTu == '\\') {
                    cFZBcTu = fZBcTu();
                } else if (cFZBcTu <= '\'') {
                    if (cFZBcTu == '\'') {
                        this.zsXlph.copydefault(iDjBIcL);
                        return com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
                    }
                    if (cFZBcTu < ' ') {
                        EZpvd(cFZBcTu, "string value");
                    }
                }
            }
            if (iDjBIcL >= cArrEZpvd.length) {
                cArrEZpvd = this.zsXlph.gEmmrt();
                iDjBIcL = 0;
            }
            cArrEZpvd[iDjBIcL] = cFZBcTu;
            iDjBIcL++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(int i, int i2, int[] iArr) throws java.io.IOException {
        int i3;
        this.zsXlph.EZpvd(this.giSNqX, i, this.fetchVPNInfo - i);
        char[] cArrAhwBna = this.zsXlph.AhwBna();
        int iDjBIcL = this.zsXlph.djBIcL();
        int length = iArr.length;
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                break;
            }
            char c = this.giSNqX[this.fetchVPNInfo];
            if (c < length) {
                if (iArr[c] != 0) {
                    break;
                }
                this.fetchVPNInfo++;
                i2 = (i2 * 33) + c;
                i3 = iDjBIcL + 1;
                cArrAhwBna[iDjBIcL] = c;
                if (i3 < cArrAhwBna.length) {
                    cArrAhwBna = this.zsXlph.gEmmrt();
                    iDjBIcL = 0;
                } else {
                    iDjBIcL = i3;
                }
            } else {
                if (!java.lang.Character.isJavaIdentifierPart(c)) {
                    break;
                }
                this.fetchVPNInfo++;
                i2 = (i2 * 33) + c;
                i3 = iDjBIcL + 1;
                cArrAhwBna[iDjBIcL] = c;
                if (i3 < cArrAhwBna.length) {
                }
            }
        }
        this.zsXlph.copydefault(iDjBIcL);
        C5544Vu c5544Vu = this.zsXlph;
        return this.gkJEwt.AEQbTJ(c5544Vu.valueOf(), c5544Vu.isConnected(), c5544Vu.values(), i2);
    }

    @Override // o.AbstractC5508Ul
    public final void fFgQHt() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        int i2 = this.isConnected;
        if (i < i2) {
            int[] iArr = fFgQHt;
            int length = iArr.length;
            while (true) {
                char[] cArr = this.giSNqX;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    C5544Vu c5544Vu = this.zsXlph;
                    int i3 = this.fetchVPNInfo;
                    c5544Vu.EZpvd(cArr, i3, i - i3);
                    this.fetchVPNInfo = i + 1;
                    return;
                }
            }
        }
        C5544Vu c5544Vu2 = this.zsXlph;
        char[] cArr2 = this.giSNqX;
        int i4 = this.fetchVPNInfo;
        c5544Vu2.copydefault(cArr2, i4, i - i4);
        this.fetchVPNInfo = i;
        zuWLRA();
    }

    public void zuWLRA() throws java.io.IOException {
        char[] cArrAhwBna = this.zsXlph.AhwBna();
        int iDjBIcL = this.zsXlph.djBIcL();
        int[] iArr = fFgQHt;
        int length = iArr.length;
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                OLrzqt(": was expecting closing quote for a string value", com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
            }
            char[] cArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            this.fetchVPNInfo = i + 1;
            char cFZBcTu = cArr[i];
            if (cFZBcTu < length && iArr[cFZBcTu] != 0) {
                if (cFZBcTu == '\"') {
                    this.zsXlph.copydefault(iDjBIcL);
                    return;
                } else if (cFZBcTu == '\\') {
                    cFZBcTu = fZBcTu();
                } else if (cFZBcTu < ' ') {
                    EZpvd(cFZBcTu, "string value");
                }
            }
            if (iDjBIcL >= cArrAhwBna.length) {
                cArrAhwBna = this.zsXlph.gEmmrt();
                iDjBIcL = 0;
            }
            cArrAhwBna[iDjBIcL] = cFZBcTu;
            iDjBIcL++;
        }
    }

    public final void gwTjWJ() throws java.io.IOException {
        this.hUfVAv = false;
        int i = this.fetchVPNInfo;
        int i2 = this.isConnected;
        char[] cArr = this.giSNqX;
        while (true) {
            if (i >= i2) {
                this.fetchVPNInfo = i;
                if (!OuxcSI()) {
                    OLrzqt(": was expecting closing quote for a string value", com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
                }
                i = this.fetchVPNInfo;
                i2 = this.isConnected;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this.fetchVPNInfo = i3;
                    fZBcTu();
                    i = this.fetchVPNInfo;
                    i2 = this.isConnected;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this.fetchVPNInfo = i3;
                        return;
                    } else if (c < ' ') {
                        this.fetchVPNInfo = i3;
                        EZpvd(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    public final void hBpjJd() throws java.io.IOException {
        if (this.fetchVPNInfo < this.isConnected || OuxcSI()) {
            char[] cArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            if (cArr[i] == '\n') {
                this.fetchVPNInfo = i + 1;
            }
        }
        this.AhwBna++;
        this.AYXKKw = this.fetchVPNInfo;
    }

    public final int dmfpNf() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        if (i + 4 >= this.isConnected) {
            return KWHzl(false);
        }
        char[] cArr = this.giSNqX;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this.fetchVPNInfo = i2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/' || c2 == '#') {
                    return KWHzl(true);
                }
                this.fetchVPNInfo = i + 2;
                return c2;
            }
            if (c2 == ' ' || c2 == '\t') {
                int i3 = i + 2;
                this.fetchVPNInfo = i3;
                char c3 = cArr[i3];
                if (c3 > ' ') {
                    if (c3 == '/' || c3 == '#') {
                        return KWHzl(true);
                    }
                    this.fetchVPNInfo = i + 3;
                    return c3;
                }
            }
            return KWHzl(true);
        }
        if (c == ' ' || c == '\t') {
            int i4 = i + 1;
            this.fetchVPNInfo = i4;
            c = cArr[i4];
        }
        if (c == ':') {
            int i5 = this.fetchVPNInfo;
            int i6 = i5 + 1;
            this.fetchVPNInfo = i6;
            char c4 = cArr[i6];
            if (c4 > ' ') {
                if (c4 == '/' || c4 == '#') {
                    return KWHzl(true);
                }
                this.fetchVPNInfo = i5 + 2;
                return c4;
            }
            if (c4 == ' ' || c4 == '\t') {
                int i7 = i5 + 2;
                this.fetchVPNInfo = i7;
                char c5 = cArr[i7];
                if (c5 > ' ') {
                    if (c5 == '/' || c5 == '#') {
                        return KWHzl(true);
                    }
                    this.fetchVPNInfo = i5 + 3;
                    return c5;
                }
            }
            return KWHzl(true);
        }
        return KWHzl(false);
    }

    public final int KWHzl(boolean z) throws java.io.IOException {
        while (true) {
            if (this.fetchVPNInfo < this.isConnected || OuxcSI()) {
                char[] cArr = this.giSNqX;
                int i = this.fetchVPNInfo;
                int i2 = i + 1;
                this.fetchVPNInfo = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        RdAHlO();
                    } else if (c != '#' || !OHqIaq()) {
                        if (z) {
                            return c;
                        }
                        if (c != ':') {
                            OLrzqt(c, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.AhwBna++;
                        this.AYXKKw = i2;
                    } else if (c == '\r') {
                        hBpjJd();
                    } else if (c != '\t') {
                        djBIcL(c);
                    }
                }
            } else {
                OLrzqt(" within/between " + this.AubY.DbNXlk() + " entries", (com.fasterxml.jackson.core.JsonToken) null);
                return -1;
            }
        }
    }

    public final int AkhnZx(int i) throws java.io.IOException {
        if (i != 44) {
            OLrzqt(i, "was expecting comma to separate " + this.AubY.DbNXlk() + " entries");
        }
        while (true) {
            int i2 = this.fetchVPNInfo;
            if (i2 < this.isConnected) {
                char[] cArr = this.giSNqX;
                int i3 = i2 + 1;
                this.fetchVPNInfo = i3;
                char c = cArr[i2];
                if (c > ' ') {
                    if (c != '/' && c != '#') {
                        return c;
                    }
                    this.fetchVPNInfo = i2;
                    return OBJEWx();
                }
                if (c < ' ') {
                    if (c == '\n') {
                        this.AhwBna++;
                        this.AYXKKw = i3;
                    } else if (c == '\r') {
                        hBpjJd();
                    } else if (c != '\t') {
                        djBIcL(c);
                    }
                }
            } else {
                return OBJEWx();
            }
        }
    }

    public final int OBJEWx() throws java.io.IOException {
        char c;
        while (true) {
            if (this.fetchVPNInfo < this.isConnected || OuxcSI()) {
                char[] cArr = this.giSNqX;
                int i = this.fetchVPNInfo;
                int i2 = i + 1;
                this.fetchVPNInfo = i2;
                c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        RdAHlO();
                    } else if (c != '#' || !OHqIaq()) {
                        break;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.AhwBna++;
                        this.AYXKKw = i2;
                    } else if (c == '\r') {
                        hBpjJd();
                    } else if (c != '\t') {
                        djBIcL(c);
                    }
                }
            } else {
                throw EZpvd("Unexpected end-of-input within/between " + this.AubY.DbNXlk() + " entries");
            }
        }
        return c;
    }

    public final int OFhtUX() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
            return dxcTrN();
        }
        char[] cArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        int i2 = i + 1;
        this.fetchVPNInfo = i2;
        char c = cArr[i];
        if (c > ' ') {
            if (c != '/' && c != '#') {
                return c;
            }
            this.fetchVPNInfo = i;
            return ODXsMY();
        }
        if (c != ' ') {
            if (c == '\n') {
                this.AhwBna++;
                this.AYXKKw = i2;
            } else if (c == '\r') {
                hBpjJd();
            } else if (c != '\t') {
                djBIcL(c);
            }
        }
        while (true) {
            int i3 = this.fetchVPNInfo;
            if (i3 < this.isConnected) {
                char[] cArr2 = this.giSNqX;
                int i4 = i3 + 1;
                this.fetchVPNInfo = i4;
                char c2 = cArr2[i3];
                if (c2 > ' ') {
                    if (c2 != '/' && c2 != '#') {
                        return c2;
                    }
                    this.fetchVPNInfo = i3;
                    return ODXsMY();
                }
                if (c2 != ' ') {
                    if (c2 == '\n') {
                        this.AhwBna++;
                        this.AYXKKw = i4;
                    } else if (c2 == '\r') {
                        hBpjJd();
                    } else if (c2 != '\t') {
                        djBIcL(c2);
                    }
                }
            } else {
                return ODXsMY();
            }
        }
    }

    public final int ODXsMY() throws java.io.IOException {
        char c;
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                return dxcTrN();
            }
            char[] cArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            int i2 = i + 1;
            this.fetchVPNInfo = i2;
            c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    RdAHlO();
                } else if (c != '#' || !OHqIaq()) {
                    break;
                }
            } else if (c != ' ') {
                if (c == '\n') {
                    this.AhwBna++;
                    this.AYXKKw = i2;
                } else if (c == '\r') {
                    hBpjJd();
                } else if (c != '\t') {
                    djBIcL(c);
                }
            }
        }
        return c;
    }

    public final void RdAHlO() throws java.io.IOException {
        if ((this.EZpvd & RcXXUw) == 0) {
            OLrzqt(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
            OLrzqt(" in a comment", (com.fasterxml.jackson.core.JsonToken) null);
        }
        char[] cArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        char c = cArr[i];
        if (c == '/') {
            dHguZz();
        } else if (c == '*') {
            QSBOWP();
        } else {
            OLrzqt(c, "was expecting either '*' or '/' for a comment");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        OLrzqt(" in a comment", (com.fasterxml.jackson.core.JsonToken) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void QSBOWP() throws java.io.IOException {
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                break;
            }
            char[] cArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            int i2 = i + 1;
            this.fetchVPNInfo = i2;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (i2 >= this.isConnected && !OuxcSI()) {
                        break;
                    }
                    char[] cArr2 = this.giSNqX;
                    int i3 = this.fetchVPNInfo;
                    if (cArr2[i3] == '/') {
                        this.fetchVPNInfo = i3 + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this.AhwBna++;
                        this.AYXKKw = i2;
                    } else if (c == '\r') {
                        hBpjJd();
                    } else if (c != '\t') {
                        djBIcL(c);
                    }
                }
            }
        }
    }

    public final boolean OHqIaq() throws java.io.IOException {
        if ((this.EZpvd & UeEOUB) == 0) {
            return false;
        }
        dHguZz();
        return true;
    }

    public final void dHguZz() throws java.io.IOException {
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                return;
            }
            char[] cArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            int i2 = i + 1;
            this.fetchVPNInfo = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.AhwBna++;
                    this.AYXKKw = i2;
                    return;
                } else if (c == '\r') {
                    hBpjJd();
                    return;
                } else if (c != '\t') {
                    djBIcL(c);
                }
            }
        }
    }

    @Override // o.AbstractC5508Ul
    public char fZBcTu() throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
            OLrzqt(" in character escape sequence", com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
        }
        char[] cArr = this.giSNqX;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            return copydefault(c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                OLrzqt(" in character escape sequence", com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this.giSNqX;
            int i4 = this.fetchVPNInfo;
            this.fetchVPNInfo = i4 + 1;
            char c2 = cArr2[i4];
            int iKWHzl = C5521Ux.KWHzl(c2);
            if (iKWHzl < 0) {
                OLrzqt(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iKWHzl;
        }
        return (char) i2;
    }

    private final void QCjLjM() throws java.io.IOException {
        char c;
        int i = this.fetchVPNInfo;
        int i2 = i + 3;
        if (i2 < this.isConnected) {
            char[] cArr = this.giSNqX;
            if (cArr[i] == 'r' && cArr[i + 1] == 'u' && cArr[i + 2] == 'e' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                this.fetchVPNInfo = i2;
                return;
            }
        }
        KWHzl("true", 1);
    }

    private final void QVsKAR() throws java.io.IOException {
        char c;
        int i = this.fetchVPNInfo;
        int i2 = i + 4;
        if (i2 < this.isConnected) {
            char[] cArr = this.giSNqX;
            if (cArr[i] == 'a' && cArr[i + 1] == 'l' && cArr[i + 2] == 's' && cArr[i + 3] == 'e' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                this.fetchVPNInfo = i2;
                return;
            }
        }
        KWHzl("false", 1);
    }

    private final void OxVOHk() throws java.io.IOException {
        char c;
        int i = this.fetchVPNInfo;
        int i2 = i + 3;
        if (i2 < this.isConnected) {
            char[] cArr = this.giSNqX;
            if (cArr[i] == 'u' && cArr[i + 1] == 'l' && cArr[i + 2] == 'l' && ((c = cArr[i2]) < '0' || c == ']' || c == '}')) {
                this.fetchVPNInfo = i2;
                return;
            }
        }
        KWHzl(AbstractJsonLexerKt.NULL, 1);
    }

    public final void KWHzl(java.lang.String str, int i) throws java.io.IOException {
        int i2;
        int length = str.length();
        if (this.fetchVPNInfo + length >= this.isConnected) {
            AEQbTJ(str, i);
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
        char c = this.giSNqX[i2];
        if (c < '0' || c == ']' || c == '}') {
            return;
        }
        OLrzqt(str, i, c);
    }

    public final void AEQbTJ(java.lang.String str, int i) throws java.io.IOException {
        int i2;
        char c;
        int length = str.length();
        do {
            if ((this.fetchVPNInfo >= this.isConnected && !OuxcSI()) || this.giSNqX[this.fetchVPNInfo] != str.charAt(i)) {
                AhwBna(str.substring(0, i));
            }
            i2 = this.fetchVPNInfo + 1;
            this.fetchVPNInfo = i2;
            i++;
        } while (i < length);
        if ((i2 < this.isConnected || OuxcSI()) && (c = this.giSNqX[this.fetchVPNInfo]) >= '0' && c != ']' && c != '}') {
            OLrzqt(str, i, c);
        }
    }

    public final void OLrzqt(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (java.lang.Character.isJavaIdentifierPart((char) i2)) {
            AhwBna(str.substring(0, i));
        }
    }

    public byte[] AEQbTJ(Base64Variant base64Variant) throws java.io.IOException {
        C5537Vn c5537VnFlVtFt = flVtFt();
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected) {
                ffGIBT();
            }
            char[] cArr = this.giSNqX;
            int i = this.fetchVPNInfo;
            this.fetchVPNInfo = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c);
                if (iDecodeBase64Char < 0) {
                    if (c == '\"') {
                        return c5537VnFlVtFt.AYXKKw();
                    }
                    iDecodeBase64Char = KWHzl(base64Variant, c, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this.fetchVPNInfo >= this.isConnected) {
                    ffGIBT();
                }
                char[] cArr2 = this.giSNqX;
                int i2 = this.fetchVPNInfo;
                this.fetchVPNInfo = i2 + 1;
                char c2 = cArr2[i2];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = KWHzl(base64Variant, c2, 1);
                }
                int i3 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this.fetchVPNInfo >= this.isConnected) {
                    ffGIBT();
                }
                char[] cArr3 = this.giSNqX;
                int i4 = this.fetchVPNInfo;
                this.fetchVPNInfo = i4 + 1;
                char c3 = cArr3[i4];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c3 == '\"') {
                            c5537VnFlVtFt.copydefault(i3 >> 4);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            return c5537VnFlVtFt.AYXKKw();
                        }
                        iDecodeBase64Char3 = KWHzl(base64Variant, c3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this.fetchVPNInfo >= this.isConnected) {
                            ffGIBT();
                        }
                        char[] cArr4 = this.giSNqX;
                        int i5 = this.fetchVPNInfo;
                        this.fetchVPNInfo = i5 + 1;
                        char c4 = cArr4[i5];
                        if (!base64Variant.usesPaddingChar(c4) && KWHzl(base64Variant, c4, 3) != -2) {
                            throw KWHzl(base64Variant, c4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        c5537VnFlVtFt.copydefault(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | iDecodeBase64Char3;
                if (this.fetchVPNInfo >= this.isConnected) {
                    ffGIBT();
                }
                char[] cArr5 = this.giSNqX;
                int i7 = this.fetchVPNInfo;
                this.fetchVPNInfo = i7 + 1;
                char c5 = cArr5[i7];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c5 == '\"') {
                            c5537VnFlVtFt.OLrzqt(i6 >> 2);
                            if (base64Variant.usesPadding()) {
                                this.fetchVPNInfo--;
                                EZpvd(base64Variant);
                            }
                            return c5537VnFlVtFt.AYXKKw();
                        }
                        iDecodeBase64Char4 = KWHzl(base64Variant, c5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        c5537VnFlVtFt.OLrzqt(i6 >> 2);
                    }
                }
                c5537VnFlVtFt.EZpvd((i6 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation gHZMYf() {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return new JsonLocation(dvKsVJ(), -1L, this.gEmmrt + (this.gasjUx - 1), this.gGvvIC, this.fvQaOB);
        }
        return new JsonLocation(dvKsVJ(), -1L, this.AxsJAY - 1, this.gHZMYf, this.sSMYrx);
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation fetchVPNInfo() {
        return new JsonLocation(dvKsVJ(), -1L, this.gEmmrt + ((long) this.fetchVPNInfo), this.AhwBna, (this.fetchVPNInfo - this.AYXKKw) + 1);
    }

    public void AhwBna(java.lang.String str) throws java.io.IOException {
        OLrzqt(str, AxsJAYaxsJAY());
    }

    public void OLrzqt(java.lang.String str, java.lang.String str2) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        while (true) {
            if (this.fetchVPNInfo >= this.isConnected && !OuxcSI()) {
                break;
            }
            char c = this.giSNqX[this.fetchVPNInfo];
            if (!java.lang.Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.fetchVPNInfo++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        EZpvd("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public final void AhwBna(int i) throws JsonParseException {
        if (i == 93) {
            DLWbHP();
            if (!this.AubY.valueOf()) {
                copydefault(i, AbstractJsonLexerKt.END_OBJ);
            }
            this.AubY = this.AubY.fetchVPNInfo();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
        }
        if (i == 125) {
            DLWbHP();
            if (!this.AubY.djBIcL()) {
                copydefault(i, AbstractJsonLexerKt.END_LIST);
            }
            this.AubY = this.AubY.fetchVPNInfo();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        }
    }
}
