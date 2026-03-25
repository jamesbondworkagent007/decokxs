package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: loaded from: classes21.dex */
public class UY extends AbstractC5508Ul {
    public AbstractC5505Ui flVtFt;
    public java.io.DataInput fvQaOB;
    public int gGvvIC;
    public int gasjUx;
    public int[] giSNqX;
    public boolean hUfVAv;
    public final C5532Vi iZzfmt;
    public static final int dvKsVJ = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int finit = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int dxcTrN = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int djSkpj = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int aKErDB = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int dNCPSb = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int UeEOUB = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int RcXXUw = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] fFgQHt = C5521Ux.AEQbTJ();
    public static final int[] fZBcTu = C5521Ux.EZpvd();

    public static final int EZpvd(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public C5541Vr<StreamReadCapability> AubY() {
        return AbstractC5508Ul.KWHzl;
    }

    @Override // o.AbstractC5508Ul
    public void djSkpj() throws java.io.IOException {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC5505Ui values() {
        return this.flVtFt;
    }

    public UY(C5517Ut c5517Ut, int i, java.io.DataInput dataInput, AbstractC5505Ui abstractC5505Ui, C5532Vi c5532Vi, int i2) {
        super(c5517Ut, i);
        this.giSNqX = new int[16];
        this.flVtFt = abstractC5505Ui;
        this.iZzfmt = c5532Vi;
        this.fvQaOB = dataInput;
        this.gasjUx = i2;
    }

    @Override // o.AbstractC5508Ul
    public void fvQaOB() throws java.io.IOException {
        super.fvQaOB();
        this.iZzfmt.AhwBna();
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String zLjUOn() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return AEQbTJ(jsonToken);
        }
        if (this.hUfVAv) {
            this.hUfVAv = false;
            return gwTjWJ();
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
        if (this.hUfVAv) {
            this.hUfVAv = false;
            return gwTjWJ();
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
        if (this.hUfVAv) {
            this.hUfVAv = false;
            return gwTjWJ();
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
    public int AwvSrB() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            if (this.hUfVAv) {
                this.hUfVAv = false;
                fFgQHt();
            }
            return this.zsXlph.values();
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return this.AubY.copydefault().length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this.zsXlph.values();
        }
        return this.QVAiDq.asCharArray().length;
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
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_STRING && (jsonToken != com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT || this.OLrzqt == null)) {
            valueOf("Current token (" + this.QVAiDq + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this.hUfVAv) {
            try {
                this.OLrzqt = KWHzl(base64Variant);
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
            return OLrzqt(base64Variant, outputStream, bArrKWHzl);
        } finally {
            this.AuCTel.AEQbTJ(bArrKWHzl);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        throw KWHzl(r13, r6, 3, "expected padding character '" + r13.getPaddingChar() + "'");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int OLrzqt(Base64Variant base64Variant, java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        break;
                    }
                    iDecodeBase64Char = OLrzqt(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i > length - 3) {
                    i2 += i;
                    outputStream.write(bArr, 0, i);
                    i = 0;
                }
                int unsignedByte2 = this.fvQaOB.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = OLrzqt(base64Variant, unsignedByte2, 1);
                }
                int i3 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this.fvQaOB.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            bArr[i] = (byte) (i3 >> 4);
                            if (base64Variant.usesPadding()) {
                                EZpvd(base64Variant);
                            }
                            i++;
                        } else {
                            iDecodeBase64Char3 = OLrzqt(base64Variant, unsignedByte3, 2);
                        }
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this.fvQaOB.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || OLrzqt(base64Variant, unsignedByte4, 3) != -2)) {
                            break;
                        }
                        bArr[i] = (byte) (i3 >> 4);
                        i++;
                    }
                }
                int i4 = (i3 << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this.fvQaOB.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            bArr[i] = (byte) (i4 >> 10);
                            int i5 = i + 2;
                            bArr[i + 1] = (byte) (i4 >> 2);
                            if (base64Variant.usesPadding()) {
                                EZpvd(base64Variant);
                            }
                            i = i5;
                        } else {
                            iDecodeBase64Char4 = OLrzqt(base64Variant, unsignedByte5, 3);
                        }
                    }
                    if (iDecodeBase64Char4 == -2) {
                        bArr[i] = (byte) (i4 >> 10);
                        bArr[i + 1] = (byte) (i4 >> 2);
                        i += 2;
                    }
                }
                int i6 = (i4 << 6) | iDecodeBase64Char4;
                bArr[i] = (byte) (i6 >> 16);
                bArr[i + 1] = (byte) (i6 >> 8);
                bArr[i + 2] = (byte) i6;
                i += 3;
            }
        }
        this.hUfVAv = false;
        if (i <= 0) {
            return i2;
        }
        int i7 = i2 + i;
        outputStream.write(bArr, 0, i);
        return i7;
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenDbNXlk;
        if (this.djBIcL) {
            return null;
        }
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return hBpjJd();
        }
        this.ejfBZ = 0;
        if (this.hUfVAv) {
            RKDWNf();
        }
        int iDLWbHP = DLWbHP();
        if (iDLWbHP < 0) {
            close();
            this.QVAiDq = null;
            return null;
        }
        this.OLrzqt = null;
        this.gHZMYf = this.AhwBna;
        if (iDLWbHP == 93 || iDLWbHP == 125) {
            uzCIH(iDLWbHP);
            return this.QVAiDq;
        }
        if (this.AubY.values()) {
            if (iDLWbHP != 44) {
                OLrzqt(iDLWbHP, "was expecting comma to separate " + this.AubY.DbNXlk() + " entries");
            }
            iDLWbHP = dHguZz();
            if ((this.EZpvd & dvKsVJ) != 0 && (iDLWbHP == 93 || iDLWbHP == 125)) {
                uzCIH(iDLWbHP);
                return this.QVAiDq;
            }
        }
        if (!this.AubY.djBIcL()) {
            return getFieldNames(iDLWbHP);
        }
        this.AubY.KWHzl(fIwbmz(iDLWbHP));
        this.QVAiDq = jsonToken2;
        int iHrNTAI = hrNTAI();
        if (iHrNTAI == 34) {
            this.hUfVAv = true;
            this.fIwbmz = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            return this.QVAiDq;
        }
        if (iHrNTAI != 43) {
            if (iHrNTAI == 91) {
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            } else if (iHrNTAI == 102) {
                copydefault("false", 1);
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            } else if (iHrNTAI == 110) {
                copydefault(AbstractJsonLexerKt.NULL, 1);
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            } else if (iHrNTAI == 116) {
                copydefault("true", 1);
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            } else if (iHrNTAI == 123) {
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            } else if (iHrNTAI == 45) {
                jsonTokenDbNXlk = zuWLRA();
            } else if (iHrNTAI == 46) {
                jsonTokenDbNXlk = KWHzl(false, false);
            } else {
                switch (iHrNTAI) {
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
                        jsonTokenDbNXlk = AuCTel(iHrNTAI);
                        break;
                    default:
                        jsonTokenDbNXlk = DbNXlk(iHrNTAI);
                        break;
                }
            }
        } else if (copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonTokenDbNXlk = QSBOWP();
        } else {
            jsonTokenDbNXlk = DbNXlk(iHrNTAI);
        }
        this.fIwbmz = jsonTokenDbNXlk;
        return this.QVAiDq;
    }

    private final com.fasterxml.jackson.core.JsonToken getFieldNames(int i) throws java.io.IOException {
        if (i == 34) {
            this.hUfVAv = true;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        if (i == 43) {
            if (copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                com.fasterxml.jackson.core.JsonToken jsonTokenQSBOWP = QSBOWP();
                this.QVAiDq = jsonTokenQSBOWP;
                return jsonTokenQSBOWP;
            }
            com.fasterxml.jackson.core.JsonToken jsonTokenDbNXlk = DbNXlk(i);
            this.QVAiDq = jsonTokenDbNXlk;
            return jsonTokenDbNXlk;
        }
        if (i == 91) {
            this.AubY = this.AubY.copydefault(this.gHZMYf, this.sSMYrx);
            com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            this.QVAiDq = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            copydefault("false", 1);
            com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            this.QVAiDq = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            copydefault(AbstractJsonLexerKt.NULL, 1);
            com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            this.QVAiDq = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            copydefault("true", 1);
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
            com.fasterxml.jackson.core.JsonToken jsonTokenZuWLRA = zuWLRA();
            this.QVAiDq = jsonTokenZuWLRA;
            return jsonTokenZuWLRA;
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
                com.fasterxml.jackson.core.JsonToken jsonTokenAuCTel = AuCTel(i);
                this.QVAiDq = jsonTokenAuCTel;
                return jsonTokenAuCTel;
            default:
                com.fasterxml.jackson.core.JsonToken jsonTokenDbNXlk2 = DbNXlk(i);
                this.QVAiDq = jsonTokenDbNXlk2;
                return jsonTokenDbNXlk2;
        }
    }

    private final com.fasterxml.jackson.core.JsonToken hBpjJd() {
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
        com.fasterxml.jackson.core.JsonToken jsonTokenDbNXlk;
        this.ejfBZ = 0;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            hBpjJd();
            return null;
        }
        if (this.hUfVAv) {
            RKDWNf();
        }
        int iDHguZz = dHguZz();
        this.OLrzqt = null;
        this.gHZMYf = this.AhwBna;
        if (iDHguZz == 93 || iDHguZz == 125) {
            uzCIH(iDHguZz);
            return null;
        }
        if (this.AubY.values()) {
            if (iDHguZz != 44) {
                OLrzqt(iDHguZz, "was expecting comma to separate " + this.AubY.DbNXlk() + " entries");
            }
            iDHguZz = dHguZz();
            if ((this.EZpvd & dvKsVJ) != 0 && (iDHguZz == 93 || iDHguZz == 125)) {
                uzCIH(iDHguZz);
                return null;
            }
        }
        if (!this.AubY.djBIcL()) {
            getFieldNames(iDHguZz);
            return null;
        }
        java.lang.String strFIwbmz = fIwbmz(iDHguZz);
        this.AubY.KWHzl(strFIwbmz);
        this.QVAiDq = jsonToken2;
        int iHrNTAI = hrNTAI();
        if (iHrNTAI == 34) {
            this.hUfVAv = true;
            this.fIwbmz = com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
            return strFIwbmz;
        }
        if (iHrNTAI != 43) {
            if (iHrNTAI == 91) {
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.START_ARRAY;
            } else if (iHrNTAI == 102) {
                copydefault("false", 1);
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.VALUE_FALSE;
            } else if (iHrNTAI == 110) {
                copydefault(AbstractJsonLexerKt.NULL, 1);
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
            } else if (iHrNTAI == 116) {
                copydefault("true", 1);
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.VALUE_TRUE;
            } else if (iHrNTAI == 123) {
                jsonTokenDbNXlk = com.fasterxml.jackson.core.JsonToken.START_OBJECT;
            } else if (iHrNTAI == 45) {
                jsonTokenDbNXlk = zuWLRA();
            } else {
                if (iHrNTAI == 46) {
                    KWHzl(false, false);
                } else {
                    switch (iHrNTAI) {
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
                            break;
                        default:
                            jsonTokenDbNXlk = DbNXlk(iHrNTAI);
                            break;
                    }
                }
                jsonTokenDbNXlk = AuCTel(iHrNTAI);
            }
        } else if (copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonTokenDbNXlk = QSBOWP();
        } else {
            jsonTokenDbNXlk = DbNXlk(iHrNTAI);
        }
        this.fIwbmz = jsonTokenDbNXlk;
        return strFIwbmz;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.String dNCPSb() throws java.io.IOException {
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            this.fARcdN = false;
            com.fasterxml.jackson.core.JsonToken jsonToken = this.fIwbmz;
            this.fIwbmz = null;
            this.QVAiDq = jsonToken;
            if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
                if (this.hUfVAv) {
                    this.hUfVAv = false;
                    return gwTjWJ();
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
            return DbNXlk(46);
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int i = 0;
        if (z) {
            cArrEZpvd[0] = '-';
            i = 1;
        }
        return KWHzl(cArrEZpvd, i, 46, z, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken AuCTel(int i) throws java.io.IOException {
        int unsignedByte;
        int i2;
        int unsignedByte2;
        char[] cArrGEmmrt;
        int i3;
        int i4;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        if (i == 48) {
            unsignedByte = ffGIBT();
            if (unsignedByte <= 57 && unsignedByte >= 48) {
                i2 = 0;
                unsignedByte2 = unsignedByte;
                cArrGEmmrt = cArrEZpvd;
                i3 = i2;
                i4 = i3;
                while (unsignedByte2 <= 57 && unsignedByte2 >= 48) {
                    i4++;
                    if (i3 < cArrGEmmrt.length) {
                        cArrGEmmrt = this.zsXlph.gEmmrt();
                        i3 = 0;
                    }
                    cArrGEmmrt[i3] = (char) unsignedByte2;
                    unsignedByte2 = this.fvQaOB.readUnsignedByte();
                    i3++;
                }
                if (unsignedByte2 != 46 || unsignedByte2 == 101 || unsignedByte2 == 69) {
                    return KWHzl(cArrGEmmrt, i3, unsignedByte2, false, i4);
                }
                this.zsXlph.copydefault(i3);
                if (this.AubY.isConnected()) {
                    RdAHlO();
                } else {
                    this.gasjUx = unsignedByte2;
                }
                return KWHzl(false, i4);
            }
            if (unsignedByte == 120 || unsignedByte == 88) {
                return AEQbTJ(unsignedByte, false);
            }
            cArrEZpvd[0] = '0';
        } else {
            cArrEZpvd[0] = (char) i;
            unsignedByte = this.fvQaOB.readUnsignedByte();
        }
        i2 = 1;
        unsignedByte2 = unsignedByte;
        cArrGEmmrt = cArrEZpvd;
        i3 = i2;
        i4 = i3;
        while (unsignedByte2 <= 57) {
            i4++;
            if (i3 < cArrGEmmrt.length) {
            }
            cArrGEmmrt[i3] = (char) unsignedByte2;
            unsignedByte2 = this.fvQaOB.readUnsignedByte();
            i3++;
        }
        if (unsignedByte2 != 46) {
        }
        return KWHzl(cArrGEmmrt, i3, unsignedByte2, false, i4);
    }

    public final com.fasterxml.jackson.core.JsonToken QSBOWP() throws java.io.IOException {
        return OLrzqt(false);
    }

    public final com.fasterxml.jackson.core.JsonToken zuWLRA() throws java.io.IOException {
        return OLrzqt(true);
    }

    private final com.fasterxml.jackson.core.JsonToken OLrzqt(boolean z) throws java.io.IOException {
        int i;
        int unsignedByte;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        if (z) {
            cArrEZpvd[0] = '-';
            i = 1;
        } else {
            i = 0;
        }
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        cArrEZpvd[i] = (char) unsignedByte2;
        if (unsignedByte2 <= 48) {
            if (unsignedByte2 != 48) {
                if (unsignedByte2 == 46) {
                    return KWHzl(z, true);
                }
                return KWHzl(unsignedByte2, z, true);
            }
            unsignedByte = ffGIBT();
        } else {
            if (unsignedByte2 > 57) {
                return KWHzl(unsignedByte2, z, true);
            }
            unsignedByte = this.fvQaOB.readUnsignedByte();
        }
        char[] cArrGEmmrt = cArrEZpvd;
        int i2 = 1;
        int i3 = i + 1;
        int unsignedByte3 = unsignedByte;
        while (unsignedByte3 <= 57 && unsignedByte3 >= 48) {
            i2++;
            if (i3 >= cArrGEmmrt.length) {
                cArrGEmmrt = this.zsXlph.gEmmrt();
                i3 = 0;
            }
            cArrGEmmrt[i3] = (char) unsignedByte3;
            unsignedByte3 = this.fvQaOB.readUnsignedByte();
            i3++;
        }
        if (unsignedByte3 == 46 || unsignedByte3 == 101 || unsignedByte3 == 69) {
            return KWHzl(cArrGEmmrt, i3, unsignedByte3, z, i2);
        }
        this.zsXlph.copydefault(i3);
        this.gasjUx = unsignedByte3;
        if (this.AubY.isConnected()) {
            RdAHlO();
        }
        return KWHzl(z, i2);
    }

    public final int ffGIBT() throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if (unsignedByte >= 48 && unsignedByte <= 57) {
            if ((this.EZpvd & finit) == 0) {
                AYXKKw("Leading zeroes not allowed");
            }
            while (unsignedByte == 48) {
                unsignedByte = this.fvQaOB.readUnsignedByte();
            }
        }
        return unsignedByte;
    }

    public final com.fasterxml.jackson.core.JsonToken KWHzl(char[] cArr, int i, int i2, boolean z, int i3) throws java.io.IOException {
        int i4;
        int unsignedByte;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.zsXlph.gEmmrt();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i6 = 0;
            while (true) {
                unsignedByte = this.fvQaOB.readUnsignedByte();
                if (unsignedByte < 48 || unsignedByte > 57) {
                    break;
                }
                i6++;
                if (i >= cArr.length) {
                    cArr = this.zsXlph.gEmmrt();
                    i = 0;
                }
                cArr[i] = (char) unsignedByte;
                i++;
            }
            if (i6 == 0 && !copydefault(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                AEQbTJ(unsignedByte, "Decimal point not followed by a digit");
            }
            i4 = i6;
            i2 = unsignedByte;
        } else {
            i4 = 0;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this.zsXlph.gEmmrt();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            int unsignedByte2 = this.fvQaOB.readUnsignedByte();
            if (unsignedByte2 == 45 || unsignedByte2 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this.zsXlph.gEmmrt();
                    i7 = 0;
                }
                cArr[i7] = (char) unsignedByte2;
                unsignedByte2 = this.fvQaOB.readUnsignedByte();
                i7++;
            }
            i2 = unsignedByte2;
            i = i7;
            int i8 = 0;
            while (i2 <= 57 && i2 >= 48) {
                i8++;
                if (i >= cArr.length) {
                    cArr = this.zsXlph.gEmmrt();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this.fvQaOB.readUnsignedByte();
                i++;
            }
            if (i8 == 0) {
                AEQbTJ(i2, "Exponent indicator not followed by a digit");
            }
            i5 = i8;
        }
        this.gasjUx = i2;
        if (this.AubY.isConnected()) {
            RdAHlO();
        }
        this.zsXlph.copydefault(i);
        return copydefault(z, i3, i4, i5);
    }

    public final void RdAHlO() throws java.io.IOException {
        int i = this.gasjUx;
        if (i > 32) {
            valueOf(i);
            return;
        }
        this.gasjUx = -1;
        if (i == 13 || i == 10) {
            this.AhwBna++;
        }
    }

    public final java.lang.String fIwbmz(int i) throws java.io.IOException {
        if (i != 34) {
            return isConnected(i);
        }
        int[] iArr = fZBcTu;
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            return unsignedByte == 34 ? "" : AEQbTJ(0, unsignedByte, 0);
        }
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            if (unsignedByte2 == 34) {
                return valueOf(unsignedByte, 1);
            }
            return AEQbTJ(unsignedByte, unsignedByte2, 1);
        }
        int i2 = (unsignedByte << 8) | unsignedByte2;
        int unsignedByte3 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            if (unsignedByte3 == 34) {
                return valueOf(i2, 2);
            }
            return AEQbTJ(i2, unsignedByte3, 2);
        }
        int i3 = (i2 << 8) | unsignedByte3;
        int unsignedByte4 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte4] != 0) {
            if (unsignedByte4 == 34) {
                return valueOf(i3, 3);
            }
            return AEQbTJ(i3, unsignedByte4, 3);
        }
        int i4 = (i3 << 8) | unsignedByte4;
        int unsignedByte5 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte5] == 0) {
            this.gGvvIC = i4;
            return fJNWhG(unsignedByte5);
        }
        if (unsignedByte5 == 34) {
            return valueOf(i4, 4);
        }
        return AEQbTJ(i4, unsignedByte5, 4);
    }

    public final java.lang.String fJNWhG(int i) throws java.io.IOException {
        int[] iArr = fZBcTu;
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            if (unsignedByte == 34) {
                return KWHzl(this.gGvvIC, i, 1);
            }
            return AEQbTJ(this.gGvvIC, i, unsignedByte, 1);
        }
        int i2 = (i << 8) | unsignedByte;
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            if (unsignedByte2 == 34) {
                return KWHzl(this.gGvvIC, i2, 2);
            }
            return AEQbTJ(this.gGvvIC, i2, unsignedByte2, 2);
        }
        int i3 = (i2 << 8) | unsignedByte2;
        int unsignedByte3 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            if (unsignedByte3 == 34) {
                return KWHzl(this.gGvvIC, i3, 3);
            }
            return AEQbTJ(this.gGvvIC, i3, unsignedByte3, 3);
        }
        int i4 = (i3 << 8) | unsignedByte3;
        int unsignedByte4 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte4] == 0) {
            return KWHzl(unsignedByte4, i4);
        }
        if (unsignedByte4 == 34) {
            return KWHzl(this.gGvvIC, i4, 4);
        }
        return AEQbTJ(this.gGvvIC, i4, unsignedByte4, 4);
    }

    public final java.lang.String KWHzl(int i, int i2) throws java.io.IOException {
        int[] iArr = fZBcTu;
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte] != 0) {
            if (unsignedByte == 34) {
                return EZpvd(this.gGvvIC, i2, i, 1);
            }
            return OLrzqt(this.gGvvIC, i2, i, unsignedByte, 1);
        }
        int i3 = (i << 8) | unsignedByte;
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte2] != 0) {
            if (unsignedByte2 == 34) {
                return EZpvd(this.gGvvIC, i2, i3, 2);
            }
            return OLrzqt(this.gGvvIC, i2, i3, unsignedByte2, 2);
        }
        int i4 = (i3 << 8) | unsignedByte2;
        int unsignedByte3 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte3] != 0) {
            if (unsignedByte3 == 34) {
                return EZpvd(this.gGvvIC, i2, i4, 3);
            }
            return OLrzqt(this.gGvvIC, i2, i4, unsignedByte3, 3);
        }
        int i5 = (i4 << 8) | unsignedByte3;
        int unsignedByte4 = this.fvQaOB.readUnsignedByte();
        if (iArr[unsignedByte4] == 0) {
            return copydefault(unsignedByte4, i2, i5);
        }
        if (unsignedByte4 == 34) {
            return EZpvd(this.gGvvIC, i2, i5, 4);
        }
        return OLrzqt(this.gGvvIC, i2, i5, unsignedByte4, 4);
    }

    public final java.lang.String copydefault(int i, int i2, int i3) throws java.io.IOException {
        int[] iArr = this.giSNqX;
        iArr[0] = this.gGvvIC;
        iArr[1] = i2;
        iArr[2] = i3;
        int[] iArr2 = fZBcTu;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            if (iArr2[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return copydefault(this.giSNqX, i5, i4, 1);
                }
                return EZpvd(this.giSNqX, i5, i4, unsignedByte, 1);
            }
            int i6 = (i4 << 8) | unsignedByte;
            int unsignedByte2 = this.fvQaOB.readUnsignedByte();
            if (iArr2[unsignedByte2] != 0) {
                if (unsignedByte2 == 34) {
                    return copydefault(this.giSNqX, i5, i6, 2);
                }
                return EZpvd(this.giSNqX, i5, i6, unsignedByte2, 2);
            }
            int i7 = (i6 << 8) | unsignedByte2;
            int unsignedByte3 = this.fvQaOB.readUnsignedByte();
            if (iArr2[unsignedByte3] != 0) {
                if (unsignedByte3 == 34) {
                    return copydefault(this.giSNqX, i5, i7, 3);
                }
                return EZpvd(this.giSNqX, i5, i7, unsignedByte3, 3);
            }
            int i8 = (i7 << 8) | unsignedByte3;
            int unsignedByte4 = this.fvQaOB.readUnsignedByte();
            if (iArr2[unsignedByte4] != 0) {
                if (unsignedByte4 == 34) {
                    return copydefault(this.giSNqX, i5, i8, 4);
                }
                return EZpvd(this.giSNqX, i5, i8, unsignedByte4, 4);
            }
            int[] iArr3 = this.giSNqX;
            if (i5 >= iArr3.length) {
                this.giSNqX = AEQbTJ(iArr3, i5);
            }
            this.giSNqX[i5] = i8;
            i5++;
            i4 = unsignedByte4;
        }
    }

    public final java.lang.String AEQbTJ(int i, int i2, int i3) throws java.io.IOException {
        return EZpvd(this.giSNqX, 0, i, i2, i3);
    }

    public final java.lang.String AEQbTJ(int i, int i2, int i3, int i4) throws java.io.IOException {
        int[] iArr = this.giSNqX;
        iArr[0] = i;
        return EZpvd(iArr, 1, i2, i3, i4);
    }

    public final java.lang.String OLrzqt(int i, int i2, int i3, int i4, int i5) throws java.io.IOException {
        int[] iArr = this.giSNqX;
        iArr[0] = i;
        iArr[1] = i2;
        return EZpvd(iArr, 2, i3, i4, i5);
    }

    public final java.lang.String EZpvd(int[] iArr, int i, int i2, int i3, int i4) throws java.io.IOException {
        int[] iArr2 = fZBcTu;
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
                            iArr = AEQbTJ(iArr, iArr.length);
                            this.giSNqX = iArr;
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
                                iArr = AEQbTJ(iArr, iArr.length);
                                this.giSNqX = iArr;
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
                    iArr = AEQbTJ(iArr, iArr.length);
                    this.giSNqX = iArr;
                }
                iArr[i] = i2;
                i++;
                i2 = i3;
                i4 = 1;
            }
            i3 = this.fvQaOB.readUnsignedByte();
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = AEQbTJ(iArr, iArr.length);
                this.giSNqX = iArr;
            }
            iArr[i] = EZpvd(i2, i4);
            i++;
        }
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArr, i);
        return strOLrzqt == null ? EZpvd(iArr, i, i4) : strOLrzqt;
    }

    public java.lang.String isConnected(int i) throws java.io.IOException {
        if (i == 39 && (this.EZpvd & aKErDB) != 0) {
            return DCUTEI();
        }
        if ((this.EZpvd & dNCPSb) == 0) {
            OLrzqt((char) AhwBna(i), "was expecting double-quote to start field name");
        }
        int[] iArrAhwBna = C5521Ux.AhwBna();
        if (iArrAhwBna[i] != 0) {
            OLrzqt(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrAEQbTJ = this.giSNqX;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        do {
            if (i2 < 4) {
                i2++;
                i |= i4 << 8;
            } else {
                if (i3 >= iArrAEQbTJ.length) {
                    iArrAEQbTJ = AEQbTJ(iArrAEQbTJ, iArrAEQbTJ.length);
                    this.giSNqX = iArrAEQbTJ;
                }
                iArrAEQbTJ[i3] = i4;
                i3++;
                i2 = 1;
            }
            i4 = i;
            i = this.fvQaOB.readUnsignedByte();
        } while (iArrAhwBna[i] == 0);
        this.gasjUx = i;
        if (i2 > 0) {
            if (i3 >= iArrAEQbTJ.length) {
                int[] iArrAEQbTJ2 = AEQbTJ(iArrAEQbTJ, iArrAEQbTJ.length);
                this.giSNqX = iArrAEQbTJ2;
                iArrAEQbTJ = iArrAEQbTJ2;
            }
            iArrAEQbTJ[i3] = i4;
            i3++;
        }
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArrAEQbTJ, i3);
        return strOLrzqt == null ? EZpvd(iArrAEQbTJ, i3, i2) : strOLrzqt;
    }

    public java.lang.String DCUTEI() throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if (unsignedByte == 39) {
            return "";
        }
        int[] iArrAEQbTJ = this.giSNqX;
        int[] iArr = fZBcTu;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (unsignedByte != 39) {
            if (unsignedByte != 34 && iArr[unsignedByte] != 0) {
                if (unsignedByte != 92) {
                    EZpvd(unsignedByte, "name");
                } else {
                    unsignedByte = fZBcTu();
                }
                if (unsignedByte > 127) {
                    if (i >= 4) {
                        if (i2 >= iArrAEQbTJ.length) {
                            iArrAEQbTJ = AEQbTJ(iArrAEQbTJ, iArrAEQbTJ.length);
                            this.giSNqX = iArrAEQbTJ;
                        }
                        iArrAEQbTJ[i2] = i3;
                        i2++;
                        i = 0;
                        i3 = 0;
                    }
                    int i4 = i3 << 8;
                    if (unsignedByte < 2048) {
                        i3 = i4 | (unsignedByte >> 6) | 192;
                        i++;
                    } else {
                        int i5 = i4 | (unsignedByte >> 12) | 224;
                        int i6 = i + 1;
                        if (i6 >= 4) {
                            if (i2 >= iArrAEQbTJ.length) {
                                iArrAEQbTJ = AEQbTJ(iArrAEQbTJ, iArrAEQbTJ.length);
                                this.giSNqX = iArrAEQbTJ;
                            }
                            iArrAEQbTJ[i2] = i5;
                            i2++;
                            i6 = 0;
                            i5 = 0;
                        }
                        i3 = (i5 << 8) | ((unsignedByte >> 6) & 63) | 128;
                        i = i6 + 1;
                    }
                    unsignedByte = (unsignedByte & 63) | 128;
                }
            }
            if (i < 4) {
                i++;
                i3 = unsignedByte | (i3 << 8);
            } else {
                if (i2 >= iArrAEQbTJ.length) {
                    iArrAEQbTJ = AEQbTJ(iArrAEQbTJ, iArrAEQbTJ.length);
                    this.giSNqX = iArrAEQbTJ;
                }
                iArrAEQbTJ[i2] = i3;
                i2++;
                i3 = unsignedByte;
                i = 1;
            }
            unsignedByte = this.fvQaOB.readUnsignedByte();
        }
        if (i > 0) {
            if (i2 >= iArrAEQbTJ.length) {
                int[] iArrAEQbTJ2 = AEQbTJ(iArrAEQbTJ, iArrAEQbTJ.length);
                this.giSNqX = iArrAEQbTJ2;
                iArrAEQbTJ = iArrAEQbTJ2;
            }
            iArrAEQbTJ[i2] = EZpvd(i3, i);
            i2++;
        }
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArrAEQbTJ, i2);
        return strOLrzqt == null ? EZpvd(iArrAEQbTJ, i2, i) : strOLrzqt;
    }

    public final java.lang.String valueOf(int i, int i2) throws JsonParseException {
        int iEZpvd = EZpvd(i, i2);
        java.lang.String strAYXKKw = this.iZzfmt.AYXKKw(iEZpvd);
        if (strAYXKKw != null) {
            return strAYXKKw;
        }
        int[] iArr = this.giSNqX;
        iArr[0] = iEZpvd;
        return EZpvd(iArr, 1, i2);
    }

    public final java.lang.String KWHzl(int i, int i2, int i3) throws JsonParseException {
        int iEZpvd = EZpvd(i2, i3);
        java.lang.String strCopydefault = this.iZzfmt.copydefault(i, iEZpvd);
        if (strCopydefault != null) {
            return strCopydefault;
        }
        int[] iArr = this.giSNqX;
        iArr[0] = i;
        iArr[1] = iEZpvd;
        return EZpvd(iArr, 2, i3);
    }

    public final java.lang.String EZpvd(int i, int i2, int i3, int i4) throws JsonParseException {
        int iEZpvd = EZpvd(i3, i4);
        java.lang.String strAEQbTJ = this.iZzfmt.AEQbTJ(i, i2, iEZpvd);
        if (strAEQbTJ != null) {
            return strAEQbTJ;
        }
        int[] iArr = this.giSNqX;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = EZpvd(iEZpvd, i4);
        return EZpvd(iArr, 3, i4);
    }

    public final java.lang.String copydefault(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = AEQbTJ(iArr, iArr.length);
            this.giSNqX = iArr;
        }
        int i4 = i + 1;
        iArr[i] = EZpvd(i2, i3);
        java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArr, i4);
        return strOLrzqt == null ? EZpvd(iArr, i4, i3) : strOLrzqt;
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
    public final java.lang.String EZpvd(int[] iArr, int i, int i2) throws JsonParseException {
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
                        fARcdN(i13);
                        i4 = 1;
                    }
                    if (i14 + i5 > i8) {
                        OLrzqt(" in field name", com.fasterxml.jackson.core.JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                    i14 = i10 + 2;
                    if ((i6 & 192) != 128) {
                        getNewProxyInstance(i6);
                    }
                    int i15 = (i4 << 6) | (i6 & 63);
                    if (i5 <= 1) {
                        int i16 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                        i14 = i10 + 3;
                        if ((i16 & 192) != 128) {
                            getNewProxyInstance(i16);
                        }
                        int i17 = (i15 << 6) | (i16 & 63);
                        if (i5 > 2) {
                            int i18 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                            i14 = i10 + 4;
                            if ((i18 & 192) != 128) {
                                getNewProxyInstance(i18 & 255);
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

    @Override // o.AbstractC5508Ul
    public void fFgQHt() throws java.io.IOException {
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = fFgQHt;
        int length = cArrEZpvd.length;
        int i = 0;
        while (true) {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    this.zsXlph.copydefault(i);
                    return;
                } else {
                    EZpvd(cArrEZpvd, i, unsignedByte);
                    return;
                }
            }
            int i2 = i + 1;
            cArrEZpvd[i] = (char) unsignedByte;
            if (i2 >= length) {
                EZpvd(cArrEZpvd, i2, this.fvQaOB.readUnsignedByte());
                return;
            }
            i = i2;
        }
    }

    private java.lang.String gwTjWJ() throws java.io.IOException {
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = fFgQHt;
        int length = cArrEZpvd.length;
        int i = 0;
        while (true) {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            if (iArr[unsignedByte] != 0) {
                if (unsignedByte == 34) {
                    return this.zsXlph.KWHzl(i);
                }
                EZpvd(cArrEZpvd, i, unsignedByte);
                return this.zsXlph.copydefault();
            }
            int i2 = i + 1;
            cArrEZpvd[i] = (char) unsignedByte;
            if (i2 >= length) {
                EZpvd(cArrEZpvd, i2, this.fvQaOB.readUnsignedByte());
                return this.zsXlph.copydefault();
            }
            i = i2;
        }
    }

    public final void EZpvd(char[] cArr, int i, int i2) throws java.io.IOException {
        int[] iArr = fFgQHt;
        int length = cArr.length;
        while (true) {
            int i3 = iArr[i2];
            int i4 = 0;
            if (i3 == 0) {
                if (i >= length) {
                    cArr = this.zsXlph.gEmmrt();
                    length = cArr.length;
                    i = 0;
                }
                cArr[i] = (char) i2;
                i2 = this.fvQaOB.readUnsignedByte();
                i++;
            } else if (i2 != 34) {
                if (i3 == 1) {
                    i2 = fZBcTu();
                } else if (i3 == 2) {
                    i2 = AkhnZx(i2);
                } else if (i3 == 3) {
                    i2 = values(i2);
                } else if (i3 == 4) {
                    int iFetchVPNInfo = fetchVPNInfo(i2);
                    if (i >= cArr.length) {
                        cArr = this.zsXlph.gEmmrt();
                        length = cArr.length;
                        i = 0;
                    }
                    cArr[i] = (char) ((iFetchVPNInfo >> 10) | 55296);
                    i2 = (iFetchVPNInfo & 1023) | Utf8.LOG_SURROGATE_HEADER;
                    i++;
                } else if (i2 < 32) {
                    EZpvd(i2, "string value");
                } else {
                    ejfBZ(i2);
                }
                if (i >= cArr.length) {
                    cArr = this.zsXlph.gEmmrt();
                    length = cArr.length;
                } else {
                    i4 = i;
                }
                i = i4 + 1;
                cArr[i4] = (char) i2;
                i2 = this.fvQaOB.readUnsignedByte();
            } else {
                this.zsXlph.copydefault(i);
                return;
            }
        }
    }

    public void RKDWNf() throws java.io.IOException {
        this.hUfVAv = false;
        int[] iArr = fFgQHt;
        while (true) {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            int i = iArr[unsignedByte];
            if (i != 0) {
                if (unsignedByte == 34) {
                    return;
                }
                if (i == 1) {
                    fZBcTu();
                } else if (i == 2) {
                    OBJEWx();
                } else if (i == 3) {
                    QHmsKR();
                } else if (i == 4) {
                    QkdxfA();
                } else if (unsignedByte < 32) {
                    EZpvd(unsignedByte, "string value");
                } else {
                    ejfBZ(unsignedByte);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r3.AubY.valueOf() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
    
        if (r3.AubY.isConnected() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if ((r3.EZpvd & o.UY.djSkpj) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r3.gasjUx = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken DbNXlk(int i) throws java.io.IOException {
        if (i == 39) {
            if ((this.EZpvd & aKErDB) != 0) {
                return OuxcSI();
            }
        } else if (i == 73) {
            copydefault("Infinity", 1);
            if ((this.EZpvd & dxcTrN) != 0) {
                return EZpvd("Infinity", Double.POSITIVE_INFINITY);
            }
            valueOf("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        } else if (i != 78) {
            if (i != 93) {
                if (i != 125) {
                    if (i == 43) {
                        return KWHzl(this.fvQaOB.readUnsignedByte(), false, true);
                    }
                }
            }
            OLrzqt(i, "expected a value");
            if ((this.EZpvd & aKErDB) != 0) {
            }
        } else {
            copydefault("NaN", 1);
            if ((this.EZpvd & dxcTrN) != 0) {
                return EZpvd("NaN", Double.NaN);
            }
            valueOf("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (java.lang.Character.isJavaIdentifierStart(i)) {
            AEQbTJ(i, "" + ((char) i), AxsJAYaxsJAY());
        }
        OLrzqt(i, "expected a valid value " + iRxXKY());
        return null;
    }

    public com.fasterxml.jackson.core.JsonToken OuxcSI() throws java.io.IOException {
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = fFgQHt;
        int i = 0;
        while (true) {
            int length = cArrEZpvd.length;
            if (i >= cArrEZpvd.length) {
                cArrEZpvd = this.zsXlph.gEmmrt();
                length = cArrEZpvd.length;
                i = 0;
            }
            while (true) {
                int unsignedByte = this.fvQaOB.readUnsignedByte();
                if (unsignedByte != 39) {
                    int i2 = iArr[unsignedByte];
                    if (i2 == 0 || unsignedByte == 34) {
                        int i3 = i + 1;
                        cArrEZpvd[i] = (char) unsignedByte;
                        i = i3;
                        if (i3 >= length) {
                            break;
                        }
                    } else {
                        if (i2 == 1) {
                            unsignedByte = fZBcTu();
                        } else if (i2 == 2) {
                            unsignedByte = AkhnZx(unsignedByte);
                        } else if (i2 == 3) {
                            unsignedByte = values(unsignedByte);
                        } else if (i2 == 4) {
                            int iFetchVPNInfo = fetchVPNInfo(unsignedByte);
                            int i4 = i + 1;
                            cArrEZpvd[i] = (char) ((iFetchVPNInfo >> 10) | 55296);
                            if (i4 >= cArrEZpvd.length) {
                                cArrEZpvd = this.zsXlph.gEmmrt();
                                i = 0;
                            } else {
                                i = i4;
                            }
                            unsignedByte = (iFetchVPNInfo & 1023) | Utf8.LOG_SURROGATE_HEADER;
                        } else {
                            if (unsignedByte < 32) {
                                EZpvd(unsignedByte, "string value");
                            }
                            ejfBZ(unsignedByte);
                        }
                        if (i >= cArrEZpvd.length) {
                            cArrEZpvd = this.zsXlph.gEmmrt();
                            i = 0;
                        }
                        cArrEZpvd[i] = (char) unsignedByte;
                        i++;
                    }
                } else {
                    this.zsXlph.copydefault(i);
                    return com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
                }
            }
        }
    }

    public com.fasterxml.jackson.core.JsonToken AEQbTJ(int i, boolean z) throws java.io.IOException {
        return KWHzl(i, z, false);
    }

    public com.fasterxml.jackson.core.JsonToken KWHzl(int i, boolean z, boolean z2) throws java.io.IOException {
        java.lang.String str;
        while (i == 73) {
            i = this.fvQaOB.readUnsignedByte();
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            copydefault(str, 3);
            if ((this.EZpvd & dxcTrN) != 0) {
                return EZpvd(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            valueOf("Non-standard token '" + str + "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (!copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z2 && !z) {
            AEQbTJ(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        AEQbTJ(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    public final void copydefault(java.lang.String str, int i) throws java.io.IOException {
        int length = str.length();
        do {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            if (unsignedByte != str.charAt(i)) {
                copydefault(unsignedByte, str.substring(0, i));
            }
            i++;
        } while (i < length);
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if (unsignedByte2 >= 48 && unsignedByte2 != 93 && unsignedByte2 != 125) {
            copydefault(str, i, unsignedByte2);
        }
        this.gasjUx = unsignedByte2;
    }

    private final void copydefault(java.lang.String str, int i, int i2) throws java.io.IOException {
        char cAhwBna = (char) AhwBna(i2);
        if (java.lang.Character.isJavaIdentifierPart(cAhwBna)) {
            copydefault(cAhwBna, str.substring(0, i));
        }
    }

    public final int dHguZz() throws java.io.IOException {
        int unsignedByte = this.gasjUx;
        if (unsignedByte < 0) {
            unsignedByte = this.fvQaOB.readUnsignedByte();
        } else {
            this.gasjUx = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.AhwBna++;
            }
            unsignedByte = this.fvQaOB.readUnsignedByte();
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? hDKMBd(unsignedByte) : unsignedByte;
    }

    private final int DLWbHP() throws java.io.IOException {
        int unsignedByte = this.gasjUx;
        if (unsignedByte < 0) {
            try {
                unsignedByte = this.fvQaOB.readUnsignedByte();
            } catch (java.io.EOFException unused) {
                return dxcTrN();
            }
        } else {
            this.gasjUx = -1;
        }
        while (unsignedByte <= 32) {
            if (unsignedByte == 13 || unsignedByte == 10) {
                this.AhwBna++;
            }
            try {
                unsignedByte = this.fvQaOB.readUnsignedByte();
            } catch (java.io.EOFException unused2) {
                return dxcTrN();
            }
        }
        return (unsignedByte == 47 || unsignedByte == 35) ? hDKMBd(unsignedByte) : unsignedByte;
    }

    public final int hDKMBd(int i) throws java.io.IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    OHqIaq();
                } else if (i != 35 || !ODXsMY()) {
                    break;
                }
            } else if (i == 13 || i == 10) {
                this.AhwBna++;
            }
            i = this.fvQaOB.readUnsignedByte();
        }
        return i;
    }

    private final int hrNTAI() throws java.io.IOException {
        int unsignedByte = this.gasjUx;
        if (unsignedByte < 0) {
            unsignedByte = this.fvQaOB.readUnsignedByte();
        } else {
            this.gasjUx = -1;
        }
        if (unsignedByte == 58) {
            int unsignedByte2 = this.fvQaOB.readUnsignedByte();
            if (unsignedByte2 > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? KWHzl(unsignedByte2, true) : unsignedByte2;
            }
            if ((unsignedByte2 == 32 || unsignedByte2 == 9) && (unsignedByte2 = this.fvQaOB.readUnsignedByte()) > 32) {
                return (unsignedByte2 == 47 || unsignedByte2 == 35) ? KWHzl(unsignedByte2, true) : unsignedByte2;
            }
            return KWHzl(unsignedByte2, true);
        }
        if (unsignedByte == 32 || unsignedByte == 9) {
            unsignedByte = this.fvQaOB.readUnsignedByte();
        }
        if (unsignedByte == 58) {
            int unsignedByte3 = this.fvQaOB.readUnsignedByte();
            if (unsignedByte3 > 32) {
                return (unsignedByte3 == 47 || unsignedByte3 == 35) ? KWHzl(unsignedByte3, true) : unsignedByte3;
            }
            if ((unsignedByte3 == 32 || unsignedByte3 == 9) && (unsignedByte3 = this.fvQaOB.readUnsignedByte()) > 32) {
                return (unsignedByte3 == 47 || unsignedByte3 == 35) ? KWHzl(unsignedByte3, true) : unsignedByte3;
            }
            return KWHzl(unsignedByte3, true);
        }
        return KWHzl(unsignedByte, false);
    }

    public final int KWHzl(int i, boolean z) throws java.io.IOException {
        while (true) {
            if (i > 32) {
                if (i == 47) {
                    OHqIaq();
                } else if (i != 35 || !ODXsMY()) {
                    if (z) {
                        return i;
                    }
                    if (i != 58) {
                        OLrzqt(i, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i == 13 || i == 10) {
                this.AhwBna++;
            }
            i = this.fvQaOB.readUnsignedByte();
        }
    }

    private final void OHqIaq() throws java.io.IOException {
        if ((this.EZpvd & UeEOUB) == 0) {
            OLrzqt(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if (unsignedByte == 47) {
            OFhtUX();
        } else if (unsignedByte == 42) {
            dmfpNf();
        } else {
            OLrzqt(unsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void dmfpNf() throws java.io.IOException {
        int[] iArrKWHzl = C5521Ux.KWHzl();
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        while (true) {
            int i = iArrKWHzl[unsignedByte];
            if (i != 0) {
                if (i == 2) {
                    OBJEWx();
                } else if (i == 3) {
                    QHmsKR();
                } else if (i == 4) {
                    QkdxfA();
                } else if (i == 10 || i == 13) {
                    this.AhwBna++;
                } else if (i == 42) {
                    unsignedByte = this.fvQaOB.readUnsignedByte();
                    if (unsignedByte == 47) {
                        return;
                    }
                } else {
                    ejfBZ(unsignedByte);
                }
            }
            unsignedByte = this.fvQaOB.readUnsignedByte();
        }
    }

    private final boolean ODXsMY() throws java.io.IOException {
        if ((this.EZpvd & RcXXUw) == 0) {
            return false;
        }
        OFhtUX();
        return true;
    }

    private final void OFhtUX() throws java.io.IOException {
        int[] iArrKWHzl = C5521Ux.KWHzl();
        while (true) {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            int i = iArrKWHzl[unsignedByte];
            if (i != 0) {
                if (i == 2) {
                    OBJEWx();
                } else if (i == 3) {
                    QHmsKR();
                } else if (i == 4) {
                    QkdxfA();
                } else if (i == 10 || i == 13) {
                    break;
                } else if (i != 42 && i < 0) {
                    ejfBZ(unsignedByte);
                }
            }
        }
        this.AhwBna++;
    }

    @Override // o.AbstractC5508Ul
    public char fZBcTu() throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if (unsignedByte == 34 || unsignedByte == 47 || unsignedByte == 92) {
            return (char) unsignedByte;
        }
        if (unsignedByte == 98) {
            return '\b';
        }
        if (unsignedByte == 102) {
            return '\f';
        }
        if (unsignedByte == 110) {
            return '\n';
        }
        if (unsignedByte == 114) {
            return '\r';
        }
        if (unsignedByte == 116) {
            return '\t';
        }
        if (unsignedByte != 117) {
            return copydefault((char) AhwBna(unsignedByte));
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int unsignedByte2 = this.fvQaOB.readUnsignedByte();
            int iKWHzl = C5521Ux.KWHzl(unsignedByte2);
            if (iKWHzl < 0) {
                OLrzqt(unsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | iKWHzl;
        }
        return (char) i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int AhwBna(int i) throws java.io.IOException {
        int i2;
        char c;
        int unsignedByte;
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
                fARcdN(i3);
            }
            unsignedByte = this.fvQaOB.readUnsignedByte();
            if ((unsignedByte & 192) != 128) {
                getNewProxyInstance(unsignedByte & 255);
            }
            int i4 = (i2 << 6) | (unsignedByte & 63);
            if (c > 1) {
                int unsignedByte2 = this.fvQaOB.readUnsignedByte();
                if ((unsignedByte2 & 192) != 128) {
                    getNewProxyInstance(unsignedByte2 & 255);
                }
                i4 = (i4 << 6) | (unsignedByte2 & 63);
                if (c > 2) {
                    int unsignedByte3 = this.fvQaOB.readUnsignedByte();
                    if ((unsignedByte3 & 192) != 128) {
                        getNewProxyInstance(unsignedByte3 & 255);
                    }
                    return (unsignedByte3 & 63) | (i4 << 6);
                }
            }
            return i4;
        }
        i3 = i & 31;
        i2 = i3;
        c = 1;
        unsignedByte = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
        }
        int i42 = (i2 << 6) | (unsignedByte & 63);
        if (c > 1) {
        }
        return i42;
    }

    public final int AkhnZx(int i) throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            getNewProxyInstance(unsignedByte & 255);
        }
        return ((i & 31) << 6) | (unsignedByte & 63);
    }

    public final int values(int i) throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            getNewProxyInstance(unsignedByte & 255);
        }
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            getNewProxyInstance(unsignedByte2 & 255);
        }
        return ((((i & 15) << 6) | (unsignedByte & 63)) << 6) | (unsignedByte2 & 63);
    }

    public final int fetchVPNInfo(int i) throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            getNewProxyInstance(unsignedByte & 255);
        }
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            getNewProxyInstance(unsignedByte2 & 255);
        }
        int unsignedByte3 = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            getNewProxyInstance(unsignedByte3 & 255);
        }
        return (((((((i & 7) << 6) | (unsignedByte & 63)) << 6) | (unsignedByte2 & 63)) << 6) | (unsignedByte3 & 63)) - 65536;
    }

    public final void OBJEWx() throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            getNewProxyInstance(unsignedByte & 255);
        }
    }

    public final void QHmsKR() throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            getNewProxyInstance(unsignedByte & 255);
        }
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            getNewProxyInstance(unsignedByte2 & 255);
        }
    }

    public final void QkdxfA() throws java.io.IOException {
        int unsignedByte = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte & 192) != 128) {
            getNewProxyInstance(unsignedByte & 255);
        }
        int unsignedByte2 = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte2 & 192) != 128) {
            getNewProxyInstance(unsignedByte2 & 255);
        }
        int unsignedByte3 = this.fvQaOB.readUnsignedByte();
        if ((unsignedByte3 & 192) != 128) {
            getNewProxyInstance(unsignedByte3 & 255);
        }
    }

    public void copydefault(int i, java.lang.String str) throws java.io.IOException {
        AEQbTJ(i, str, AxsJAYaxsJAY());
    }

    public void AEQbTJ(int i, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        while (true) {
            char cAhwBna = (char) AhwBna(i);
            if (java.lang.Character.isJavaIdentifierPart(cAhwBna)) {
                sb.append(cAhwBna);
                i = this.fvQaOB.readUnsignedByte();
            } else {
                valueOf("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
                return;
            }
        }
    }

    public void ejfBZ(int i) throws JsonParseException {
        if (i < 32) {
            djBIcL(i);
        }
        fARcdN(i);
    }

    public void fARcdN(int i) throws JsonParseException {
        valueOf("Invalid UTF-8 start byte 0x" + java.lang.Integer.toHexString(i));
    }

    private void getNewProxyInstance(int i) throws JsonParseException {
        valueOf("Invalid UTF-8 middle byte 0x" + java.lang.Integer.toHexString(i));
    }

    public static int[] AEQbTJ(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return java.util.Arrays.copyOf(iArr, iArr.length + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
    
        throw KWHzl(r9, r2, 3, "expected padding character '" + r9.getPaddingChar() + "'");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] KWHzl(Base64Variant base64Variant) throws java.io.IOException {
        C5537Vn c5537VnFlVtFt = flVtFt();
        while (true) {
            int unsignedByte = this.fvQaOB.readUnsignedByte();
            if (unsignedByte > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(unsignedByte);
                if (iDecodeBase64Char < 0) {
                    if (unsignedByte == 34) {
                        return c5537VnFlVtFt.AYXKKw();
                    }
                    iDecodeBase64Char = OLrzqt(base64Variant, unsignedByte, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                int unsignedByte2 = this.fvQaOB.readUnsignedByte();
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(unsignedByte2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = OLrzqt(base64Variant, unsignedByte2, 1);
                }
                int i = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                int unsignedByte3 = this.fvQaOB.readUnsignedByte();
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(unsignedByte3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (unsignedByte3 == 34) {
                            c5537VnFlVtFt.copydefault(i >> 4);
                            if (base64Variant.usesPadding()) {
                                EZpvd(base64Variant);
                            }
                            return c5537VnFlVtFt.AYXKKw();
                        }
                        iDecodeBase64Char3 = OLrzqt(base64Variant, unsignedByte3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        int unsignedByte4 = this.fvQaOB.readUnsignedByte();
                        if (!base64Variant.usesPaddingChar(unsignedByte4) && (unsignedByte4 != 92 || OLrzqt(base64Variant, unsignedByte4, 3) != -2)) {
                            break;
                        }
                        c5537VnFlVtFt.copydefault(i >> 4);
                    }
                }
                int i2 = (i << 6) | iDecodeBase64Char3;
                int unsignedByte5 = this.fvQaOB.readUnsignedByte();
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(unsignedByte5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (unsignedByte5 == 34) {
                            c5537VnFlVtFt.OLrzqt(i2 >> 2);
                            if (base64Variant.usesPadding()) {
                                EZpvd(base64Variant);
                            }
                            return c5537VnFlVtFt.AYXKKw();
                        }
                        iDecodeBase64Char4 = OLrzqt(base64Variant, unsignedByte5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        c5537VnFlVtFt.OLrzqt(i2 >> 2);
                    }
                }
                c5537VnFlVtFt.EZpvd((i2 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation gHZMYf() {
        return new JsonLocation(dvKsVJ(), -1L, -1L, this.gHZMYf, -1);
    }

    @Override // o.AbstractC5508Ul, com.fasterxml.jackson.core.JsonParser
    public JsonLocation fetchVPNInfo() {
        return new JsonLocation(dvKsVJ(), -1L, -1L, this.AhwBna, -1);
    }

    private void uzCIH(int i) throws JsonParseException {
        if (i == 93) {
            if (!this.AubY.valueOf()) {
                copydefault(i, AbstractJsonLexerKt.END_OBJ);
            }
            this.AubY = this.AubY.fetchVPNInfo();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
        }
        if (i == 125) {
            if (!this.AubY.djBIcL()) {
                copydefault(i, AbstractJsonLexerKt.END_LIST);
            }
            this.AubY = this.AubY.fetchVPNInfo();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        }
    }
}
