package o;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.google.common.primitives.UnsignedBytes;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Utf8;

/* JADX INFO: renamed from: o.Vl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5535Vl extends AbstractC5529Vf {
    public static final int DXXBbs = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int DCJXGO = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int accept = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int RlQdEF = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int AxsJAYsNCnLh = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int QKudOq = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int DAIeex = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] DarRvM = C5521Ux.AEQbTJ();
    public static final int[] OqFWZa = C5521Ux.EZpvd();

    public abstract byte AhwBna(int i);

    public abstract int DCUTEI();

    public abstract byte ffGIBT();

    public AbstractC5535Vl(C5517Ut c5517Ut, int i, C5532Vi c5532Vi) {
        super(c5517Ut, i, c5532Vi);
    }

    @Override // o.AbstractC5508Ul
    public char fZBcTu() throws java.io.IOException {
        C5546Vw.OLrzqt();
        return ' ';
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        if (i >= this.isConnected) {
            if (this.djBIcL) {
                return null;
            }
            if (this.dxcTrN) {
                if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE) {
                    return OxVOHk();
                }
                return OBJEWx();
            }
            return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        }
        if (this.QVAiDq == com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE) {
            return QSLkRj();
        }
        this.ejfBZ = 0;
        this.AxsJAY = this.gEmmrt + ((long) i);
        this.OLrzqt = null;
        int iDCUTEI = DCUTEI();
        switch (this.finit) {
            case 0:
                return getFieldNames(iDCUTEI);
            case 1:
                return AuCTelauCTel(iDCUTEI);
            case 2:
                return uzCIH(iDCUTEI);
            case 3:
                return zLjUOn(iDCUTEI);
            case 4:
                return zuBGHE(iDCUTEI);
            case 5:
                return AuCTelauCTel(iDCUTEI);
            case 6:
                return AxsJAY(iDCUTEI);
            default:
                C5546Vw.OLrzqt();
                return null;
        }
    }

    public final com.fasterxml.jackson.core.JsonToken QSLkRj() throws java.io.IOException {
        int i = this.fFgQHt;
        if (i == 1) {
            return fJNWhG(this.flVtFt);
        }
        if (i == 4) {
            return uzCIH(DCUTEI());
        }
        if (i == 5) {
            return zLjUOn(DCUTEI());
        }
        switch (i) {
            case 7:
                return AYXKKw(this.gkJEwt, this.flVtFt, this.gasjUx);
            case 8:
                return hrNTAI();
            case 9:
                return OLrzqt(this.gkJEwt, this.flVtFt, this.gasjUx);
            case 10:
                return gEmmrt(this.gkJEwt, this.flVtFt, this.gasjUx);
            default:
                switch (i) {
                    case 12:
                        return AuCTelauCTel(DCUTEI());
                    case 13:
                        return AxsJAY(DCUTEI());
                    case 14:
                        return zuBGHE(DCUTEI());
                    case 15:
                        return AubY(DCUTEI());
                    case 16:
                        return copydefault(AbstractJsonLexerKt.NULL, this.flVtFt, com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
                    case 17:
                        return copydefault("true", this.flVtFt, com.fasterxml.jackson.core.JsonToken.VALUE_TRUE);
                    case 18:
                        return copydefault("false", this.flVtFt, com.fasterxml.jackson.core.JsonToken.VALUE_FALSE);
                    case 19:
                        return AYXKKw(this.giSNqX, this.flVtFt);
                    default:
                        switch (i) {
                            case 22:
                                return AuCTel(DCUTEI());
                            case 23:
                                return fIwbmz(DCUTEI());
                            case 24:
                                return ODXsMY();
                            case 25:
                                return OHqIaq();
                            case 26:
                                return OLrzqt(this.zsXlph.AYXKKw(), this.zsXlph.djBIcL());
                            default:
                                switch (i) {
                                    case 30:
                                        return DLWbHP();
                                    case 31:
                                        return OLrzqt(true, DCUTEI());
                                    case 32:
                                        return OLrzqt(false, DCUTEI());
                                    default:
                                        switch (i) {
                                            case 40:
                                                return QVsKAR();
                                            case 41:
                                                int iAhwBna = AhwBna(this.AxsJAYaxsJAY, this.hUfVAv);
                                                if (iAhwBna < 0) {
                                                    return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                                                }
                                                this.zsXlph.KWHzl((char) iAhwBna);
                                                if (this.fvQaOB == 45) {
                                                    return dHguZz();
                                                }
                                                return QVsKAR();
                                            case 42:
                                                this.zsXlph.KWHzl((char) valueOf(this.flVtFt, ffGIBT()));
                                                if (this.fvQaOB == 45) {
                                                    return dHguZz();
                                                }
                                                return QVsKAR();
                                            case 43:
                                                if (!EZpvd(this.flVtFt, this.gasjUx, ffGIBT())) {
                                                    return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                                                }
                                                if (this.fvQaOB == 45) {
                                                    return dHguZz();
                                                }
                                                return QVsKAR();
                                            case 44:
                                                if (!copydefault(this.flVtFt, this.gasjUx, ffGIBT())) {
                                                    return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                                                }
                                                if (this.fvQaOB == 45) {
                                                    return dHguZz();
                                                }
                                                return QVsKAR();
                                            case 45:
                                                return dHguZz();
                                            default:
                                                switch (i) {
                                                    case 50:
                                                        return RdAHlO();
                                                    case 51:
                                                        return wlaJM(this.flVtFt);
                                                    case 52:
                                                        return OLrzqt(this.flVtFt, true);
                                                    case 53:
                                                        return OLrzqt(this.flVtFt, false);
                                                    case 54:
                                                        return fARcdN(this.flVtFt);
                                                    case 55:
                                                        return ejfBZ(this.flVtFt);
                                                    default:
                                                        C5546Vw.OLrzqt();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final com.fasterxml.jackson.core.JsonToken OxVOHk() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        int i = this.fFgQHt;
        if (i == 3) {
            return OBJEWx();
        }
        if (i == 12) {
            return OBJEWx();
        }
        if (i != 50) {
            switch (i) {
                case 16:
                    return KWHzl(AbstractJsonLexerKt.NULL, this.flVtFt, com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
                case 17:
                    return KWHzl("true", this.flVtFt, com.fasterxml.jackson.core.JsonToken.VALUE_TRUE);
                case 18:
                    return KWHzl("false", this.flVtFt, com.fasterxml.jackson.core.JsonToken.VALUE_FALSE);
                case 19:
                    return djBIcL(this.giSNqX, this.flVtFt);
                default:
                    switch (i) {
                        case 24:
                        case 25:
                            return copydefault(0, "0");
                        case 26:
                            int iDjBIcL = this.zsXlph.djBIcL();
                            if (this.wlaJM) {
                                iDjBIcL--;
                            }
                            this.values = iDjBIcL;
                            return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
                        default:
                            switch (i) {
                                case 30:
                                    this.DbNXlk = 0;
                                    return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
                                case 31:
                                    OLrzqt(": was expecting fraction after exponent marker", com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
                                    OLrzqt(": was expecting closing '*/' for comment", com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE);
                                    return OBJEWx();
                                case 32:
                                    return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
                                default:
                                    switch (i) {
                                        case 52:
                                        case 53:
                                            OLrzqt(": was expecting closing '*/' for comment", com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE);
                                            break;
                                        case 54:
                                        case 55:
                                            break;
                                        default:
                                            OLrzqt(": was expecting rest of token (internal state: " + this.fFgQHt + ")", this.QVAiDq);
                                            return jsonToken;
                                    }
                                    return OBJEWx();
                            }
                    }
            }
        }
        return gwTjWJ();
    }

    public final com.fasterxml.jackson.core.JsonToken getFieldNames(int i) throws java.io.IOException {
        int iDCUTEI = i & 255;
        if (iDCUTEI == 239 && this.fFgQHt != 1) {
            return fJNWhG(1);
        }
        while (iDCUTEI <= 32) {
            if (iDCUTEI != 32) {
                if (iDCUTEI == 10) {
                    this.AhwBna++;
                } else if (iDCUTEI == 13) {
                    this.dvKsVJ++;
                } else if (iDCUTEI != 9) {
                    djBIcL(iDCUTEI);
                }
                this.AYXKKw = this.fetchVPNInfo;
            }
            if (this.fetchVPNInfo >= this.isConnected) {
                this.fFgQHt = 3;
                if (this.djBIcL) {
                    return null;
                }
                if (this.dxcTrN) {
                    return OBJEWx();
                }
                return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            }
            iDCUTEI = DCUTEI();
        }
        return AuCTelauCTel(iDCUTEI);
    }

    public final com.fasterxml.jackson.core.JsonToken fJNWhG(int i) throws java.io.IOException {
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.gEmmrt -= 3;
                        return getFieldNames(iDCUTEI);
                    }
                } else if (iDCUTEI != 191) {
                    EZpvd("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", java.lang.Integer.valueOf(iDCUTEI));
                }
            } else if (iDCUTEI != 187) {
                EZpvd("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", java.lang.Integer.valueOf(iDCUTEI));
            }
            i++;
        }
        this.flVtFt = i;
        this.fFgQHt = 1;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken uzCIH(int i) throws java.io.IOException {
        java.lang.String strDmfpNf;
        if (i <= 32 && (i = getNewProxyInstance(i)) <= 0) {
            this.fFgQHt = 4;
            return this.QVAiDq;
        }
        QSBOWP();
        if (i != 34) {
            if (i == 125) {
                return zuWLRA();
            }
            return iwGUEr(i);
        }
        if (this.fetchVPNInfo + 13 <= this.isConnected && (strDmfpNf = dmfpNf()) != null) {
            return AhwBna(strDmfpNf);
        }
        return AYXKKw(0, 0, 0);
    }

    public final com.fasterxml.jackson.core.JsonToken zLjUOn(int i) throws java.io.IOException {
        java.lang.String strDmfpNf;
        if (i <= 32 && (i = getNewProxyInstance(i)) <= 0) {
            this.fFgQHt = 5;
            return this.QVAiDq;
        }
        if (i != 44) {
            if (i == 125) {
                return zuWLRA();
            }
            if (i == 35) {
                return ejfBZ(5);
            }
            if (i == 47) {
                return wlaJM(5);
            }
            OLrzqt(i, "was expecting comma to separate " + this.AubY.DbNXlk() + " entries");
        }
        int i2 = this.fetchVPNInfo;
        if (i2 >= this.isConnected) {
            this.fFgQHt = 4;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int iAhwBna = AhwBna(i2);
        this.fetchVPNInfo = i2 + 1;
        if (iAhwBna <= 32 && (iAhwBna = getNewProxyInstance(iAhwBna)) <= 0) {
            this.fFgQHt = 4;
            return this.QVAiDq;
        }
        QSBOWP();
        if (iAhwBna != 34) {
            if (iAhwBna == 125 && (this.EZpvd & DXXBbs) != 0) {
                return zuWLRA();
            }
            return iwGUEr(iAhwBna);
        }
        if (this.fetchVPNInfo + 13 <= this.isConnected && (strDmfpNf = dmfpNf()) != null) {
            return AhwBna(strDmfpNf);
        }
        return AYXKKw(0, 0, 0);
    }

    public final com.fasterxml.jackson.core.JsonToken AuCTelauCTel(int i) throws java.io.IOException {
        if (i <= 32 && (i = getNewProxyInstance(i)) <= 0) {
            this.fFgQHt = 12;
            return this.QVAiDq;
        }
        QSBOWP();
        this.AubY.values();
        if (i == 34) {
            return igXuih();
        }
        if (i == 35) {
            return ejfBZ(12);
        }
        if (i == 43) {
            return QwvEab();
        }
        if (i == 91) {
            return QHmsKR();
        }
        if (i == 93) {
            return OuxcSI();
        }
        if (i == 102) {
            return QCjLjM();
        }
        if (i == 110) {
            return aUsmxb();
        }
        if (i == 116) {
            return fjfviF();
        }
        if (i == 123) {
            return RKDWNf();
        }
        if (i != 125) {
            switch (i) {
                case 45:
                    return dUDNAs();
                case 46:
                    if (copydefault(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                        return UlJrfe();
                    }
                    break;
                case 47:
                    return wlaJM(12);
                case 48:
                    return USBtdM();
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return zsXlph(i);
            }
            return EZpvd(false, i);
        }
        return zuWLRA();
    }

    public final com.fasterxml.jackson.core.JsonToken AxsJAY(int i) throws java.io.IOException {
        if (i <= 32 && (i = getNewProxyInstance(i)) <= 0) {
            this.fFgQHt = 13;
            return this.QVAiDq;
        }
        if (i != 44) {
            if (i == 93) {
                return OuxcSI();
            }
            if (i == 125) {
                return zuWLRA();
            }
            if (i == 47) {
                return wlaJM(13);
            }
            if (i == 35) {
                return ejfBZ(13);
            }
            OLrzqt(i, "was expecting comma to separate " + this.AubY.DbNXlk() + " entries");
        }
        this.AubY.values();
        int i2 = this.fetchVPNInfo;
        if (i2 >= this.isConnected) {
            this.fFgQHt = 15;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int iAhwBna = AhwBna(i2);
        this.fetchVPNInfo = i2 + 1;
        if (iAhwBna <= 32 && (iAhwBna = getNewProxyInstance(iAhwBna)) <= 0) {
            this.fFgQHt = 15;
            return this.QVAiDq;
        }
        QSBOWP();
        if (iAhwBna == 34) {
            return igXuih();
        }
        if (iAhwBna == 35) {
            return ejfBZ(15);
        }
        if (iAhwBna == 43) {
            return QwvEab();
        }
        if (iAhwBna == 45) {
            return dUDNAs();
        }
        if (iAhwBna == 91) {
            return QHmsKR();
        }
        if (iAhwBna != 93) {
            if (iAhwBna == 102) {
                return QCjLjM();
            }
            if (iAhwBna == 110) {
                return aUsmxb();
            }
            if (iAhwBna == 116) {
                return fjfviF();
            }
            if (iAhwBna == 123) {
                return RKDWNf();
            }
            if (iAhwBna != 125) {
                switch (iAhwBna) {
                    case 47:
                        return wlaJM(15);
                    case 48:
                        return USBtdM();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return zsXlph(iAhwBna);
                }
            }
            if ((this.EZpvd & DXXBbs) != 0) {
                return zuWLRA();
            }
        } else if ((this.EZpvd & DXXBbs) != 0) {
            return OuxcSI();
        }
        return EZpvd(true, iAhwBna);
    }

    public final com.fasterxml.jackson.core.JsonToken zuBGHE(int i) throws java.io.IOException {
        if (i <= 32 && (i = getNewProxyInstance(i)) <= 0) {
            this.fFgQHt = 14;
            return this.QVAiDq;
        }
        if (i != 58) {
            if (i == 47) {
                return wlaJM(14);
            }
            if (i == 35) {
                return ejfBZ(14);
            }
            OLrzqt(i, "was expecting a colon to separate field name and value");
        }
        int i2 = this.fetchVPNInfo;
        if (i2 >= this.isConnected) {
            this.fFgQHt = 12;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int iAhwBna = AhwBna(i2);
        this.fetchVPNInfo = i2 + 1;
        if (iAhwBna <= 32 && (iAhwBna = getNewProxyInstance(iAhwBna)) <= 0) {
            this.fFgQHt = 12;
            return this.QVAiDq;
        }
        QSBOWP();
        if (iAhwBna == 34) {
            return igXuih();
        }
        if (iAhwBna == 35) {
            return ejfBZ(12);
        }
        if (iAhwBna == 43) {
            return QwvEab();
        }
        if (iAhwBna == 45) {
            return dUDNAs();
        }
        if (iAhwBna == 91) {
            return QHmsKR();
        }
        if (iAhwBna == 102) {
            return QCjLjM();
        }
        if (iAhwBna == 110) {
            return aUsmxb();
        }
        if (iAhwBna == 116) {
            return fjfviF();
        }
        if (iAhwBna != 123) {
            switch (iAhwBna) {
                case 47:
                    return wlaJM(12);
                case 48:
                    return USBtdM();
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return zsXlph(iAhwBna);
                default:
                    return EZpvd(false, iAhwBna);
            }
        }
        return RKDWNf();
    }

    public final com.fasterxml.jackson.core.JsonToken AubY(int i) throws java.io.IOException {
        if (i <= 32 && (i = getNewProxyInstance(i)) <= 0) {
            this.fFgQHt = 15;
            return this.QVAiDq;
        }
        QSBOWP();
        if (i == 34) {
            return igXuih();
        }
        if (i == 35) {
            return ejfBZ(15);
        }
        if (i == 43) {
            return QwvEab();
        }
        if (i == 45) {
            return dUDNAs();
        }
        if (i == 91) {
            return QHmsKR();
        }
        if (i != 93) {
            if (i == 102) {
                return QCjLjM();
            }
            if (i == 110) {
                return aUsmxb();
            }
            if (i == 116) {
                return fjfviF();
            }
            if (i == 123) {
                return RKDWNf();
            }
            if (i != 125) {
                switch (i) {
                    case 47:
                        return wlaJM(15);
                    case 48:
                        return USBtdM();
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        return zsXlph(i);
                }
            }
            if ((this.EZpvd & DXXBbs) != 0) {
                return zuWLRA();
            }
        } else if ((this.EZpvd & DXXBbs) != 0) {
            return OuxcSI();
        }
        return EZpvd(true, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken EZpvd(boolean z, int i) throws java.io.IOException {
        if (i != 39) {
            if (i == 73) {
                return AYXKKw(1, 1);
            }
            if (i == 78) {
                return AYXKKw(0, 1);
            }
            if (i != 93) {
                if (i != 125) {
                    if (i == 43) {
                        return AYXKKw(2, 1);
                    }
                    if (i == 44) {
                        if (!this.AubY.isConnected() && (this.EZpvd & accept) != 0) {
                            this.fetchVPNInfo--;
                            return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
                        }
                    }
                }
            } else if (this.AubY.valueOf()) {
            }
        } else if ((this.EZpvd & RlQdEF) != 0) {
            return OJuSTm();
        }
        OLrzqt(i, "expected a valid value " + iRxXKY());
        return null;
    }

    public final int getNewProxyInstance(int i) throws java.io.IOException {
        do {
            if (i != 32) {
                if (i == 10) {
                    this.AhwBna++;
                } else if (i == 13) {
                    this.dvKsVJ++;
                } else if (i != 9) {
                    djBIcL(i);
                }
                this.AYXKKw = this.fetchVPNInfo;
            }
            if (this.fetchVPNInfo >= this.isConnected) {
                this.QVAiDq = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                return 0;
            }
            i = DCUTEI();
        } while (i <= 32);
        return i;
    }

    public final com.fasterxml.jackson.core.JsonToken wlaJM(int i) throws java.io.IOException {
        if ((this.EZpvd & QKudOq) == 0) {
            OLrzqt(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.fetchVPNInfo >= this.isConnected) {
            this.flVtFt = i;
            this.fFgQHt = 51;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        byte bFfGIBT = ffGIBT();
        if (bFfGIBT == 42) {
            return OLrzqt(i, false);
        }
        if (bFfGIBT == 47) {
            return fARcdN(i);
        }
        OLrzqt(bFfGIBT & UnsignedBytes.MAX_VALUE, "was expecting either '*' or '/' for a comment");
        return null;
    }

    public final com.fasterxml.jackson.core.JsonToken ejfBZ(int i) throws java.io.IOException {
        if ((this.EZpvd & DAIeex) == 0) {
            OLrzqt(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (iDCUTEI < 32) {
                if (iDCUTEI == 10) {
                    this.AhwBna++;
                } else if (iDCUTEI == 13) {
                    this.dvKsVJ++;
                } else if (iDCUTEI != 9) {
                    djBIcL(iDCUTEI);
                }
                this.AYXKKw = this.fetchVPNInfo;
                return hDKMBd(i);
            }
        }
        this.fFgQHt = 55;
        this.flVtFt = i;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken fARcdN(int i) throws java.io.IOException {
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (iDCUTEI < 32) {
                if (iDCUTEI == 10) {
                    this.AhwBna++;
                } else if (iDCUTEI == 13) {
                    this.dvKsVJ++;
                } else if (iDCUTEI != 9) {
                    djBIcL(iDCUTEI);
                }
                this.AYXKKw = this.fetchVPNInfo;
                return hDKMBd(i);
            }
        }
        this.fFgQHt = 54;
        this.flVtFt = i;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken OLrzqt(int i, boolean z) throws java.io.IOException {
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (iDCUTEI < 32) {
                if (iDCUTEI == 10) {
                    this.AhwBna++;
                } else if (iDCUTEI == 13) {
                    this.dvKsVJ++;
                } else if (iDCUTEI != 9) {
                    djBIcL(iDCUTEI);
                }
                this.AYXKKw = this.fetchVPNInfo;
            } else if (iDCUTEI == 42) {
                z = true;
            } else if (iDCUTEI == 47 && z) {
                return hDKMBd(i);
            }
            z = false;
        }
        this.fFgQHt = z ? 52 : 53;
        this.flVtFt = i;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public final com.fasterxml.jackson.core.JsonToken hDKMBd(int i) throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            this.fFgQHt = i;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int iDCUTEI = DCUTEI();
        if (i == 4) {
            return uzCIH(iDCUTEI);
        }
        if (i == 5) {
            return zLjUOn(iDCUTEI);
        }
        switch (i) {
            case 12:
                return AuCTelauCTel(iDCUTEI);
            case 13:
                return AxsJAY(iDCUTEI);
            case 14:
                return zuBGHE(iDCUTEI);
            case 15:
                return AubY(iDCUTEI);
            default:
                C5546Vw.OLrzqt();
                return null;
        }
    }

    public com.fasterxml.jackson.core.JsonToken QCjLjM() throws java.io.IOException {
        int iAhwBna;
        int i = this.fetchVPNInfo;
        int i2 = i + 4;
        if (i2 < this.isConnected && AhwBna(i) == 97 && AhwBna(i + 1) == 108 && AhwBna(i + 2) == 115 && AhwBna(i + 3) == 101 && ((iAhwBna = AhwBna(i2) & UnsignedBytes.MAX_VALUE) < 48 || iAhwBna == 93 || iAhwBna == 125)) {
            this.fetchVPNInfo = i2;
            return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_FALSE);
        }
        this.fFgQHt = 18;
        return copydefault("false", 1, com.fasterxml.jackson.core.JsonToken.VALUE_FALSE);
    }

    public com.fasterxml.jackson.core.JsonToken fjfviF() throws java.io.IOException {
        int iAhwBna;
        int i = this.fetchVPNInfo;
        int i2 = i + 3;
        if (i2 < this.isConnected && AhwBna(i) == 114 && AhwBna(i + 1) == 117 && AhwBna(i + 2) == 101 && ((iAhwBna = AhwBna(i2) & UnsignedBytes.MAX_VALUE) < 48 || iAhwBna == 93 || iAhwBna == 125)) {
            this.fetchVPNInfo = i2;
            return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_TRUE);
        }
        this.fFgQHt = 17;
        return copydefault("true", 1, com.fasterxml.jackson.core.JsonToken.VALUE_TRUE);
    }

    public com.fasterxml.jackson.core.JsonToken aUsmxb() throws java.io.IOException {
        int iAhwBna;
        int i = this.fetchVPNInfo;
        int i2 = i + 3;
        if (i2 < this.isConnected && AhwBna(i) == 117 && AhwBna(i + 1) == 108 && AhwBna(i + 2) == 108 && ((iAhwBna = AhwBna(i2) & UnsignedBytes.MAX_VALUE) < 48 || iAhwBna == 93 || iAhwBna == 125)) {
            this.fetchVPNInfo = i2;
            return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
        }
        this.fFgQHt = 16;
        return copydefault(AbstractJsonLexerKt.NULL, 1, com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        r3.fFgQHt = 50;
        r3.zsXlph.AEQbTJ(r4, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        return RdAHlO();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken copydefault(java.lang.String str, int i, com.fasterxml.jackson.core.JsonToken jsonToken) throws java.io.IOException {
        int length = str.length();
        while (true) {
            int i2 = this.fetchVPNInfo;
            if (i2 >= this.isConnected) {
                this.flVtFt = i;
                com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                this.QVAiDq = jsonToken2;
                return jsonToken2;
            }
            char cAhwBna = AhwBna(i2);
            if (i == length) {
                if (cAhwBna < '0' || cAhwBna == ']' || cAhwBna == '}') {
                    return KWHzl(jsonToken);
                }
            } else {
                if (cAhwBna != str.charAt(i)) {
                    break;
                }
                i++;
                this.fetchVPNInfo++;
            }
        }
    }

    public com.fasterxml.jackson.core.JsonToken KWHzl(java.lang.String str, int i, com.fasterxml.jackson.core.JsonToken jsonToken) throws java.io.IOException {
        if (i == str.length()) {
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        this.zsXlph.AEQbTJ(str, 0, i);
        return gwTjWJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r4.fFgQHt = 50;
        r4.zsXlph.AEQbTJ(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        return RdAHlO();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken AYXKKw(int i, int i2) throws java.io.IOException {
        java.lang.String strFetchVPNInfo = fetchVPNInfo(i);
        int length = strFetchVPNInfo.length();
        while (true) {
            int i3 = this.fetchVPNInfo;
            if (i3 >= this.isConnected) {
                this.giSNqX = i;
                this.flVtFt = i2;
                this.fFgQHt = 19;
                com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                this.QVAiDq = jsonToken;
                return jsonToken;
            }
            char cAhwBna = AhwBna(i3);
            if (i2 == length) {
                if (cAhwBna < '0' || cAhwBna == ']' || cAhwBna == '}') {
                    return values(i);
                }
            } else {
                if (cAhwBna != strFetchVPNInfo.charAt(i2)) {
                    break;
                }
                i2++;
                this.fetchVPNInfo++;
            }
        }
    }

    public com.fasterxml.jackson.core.JsonToken djBIcL(int i, int i2) throws java.io.IOException {
        java.lang.String strFetchVPNInfo = fetchVPNInfo(i);
        if (i2 == strFetchVPNInfo.length()) {
            return values(i);
        }
        this.zsXlph.AEQbTJ(strFetchVPNInfo, 0, i2);
        return gwTjWJ();
    }

    public com.fasterxml.jackson.core.JsonToken RdAHlO() throws java.io.IOException {
        while (this.fetchVPNInfo < this.isConnected) {
            char cFfGIBT = (char) ffGIBT();
            if (java.lang.Character.isJavaIdentifierPart(cFfGIBT)) {
                this.zsXlph.KWHzl(cFfGIBT);
                if (this.zsXlph.values() < 256) {
                }
            }
            return fetchVPNInfo(this.zsXlph.copydefault());
        }
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public com.fasterxml.jackson.core.JsonToken gwTjWJ() throws java.io.IOException {
        return fetchVPNInfo(this.zsXlph.copydefault());
    }

    public com.fasterxml.jackson.core.JsonToken fetchVPNInfo(java.lang.String str) throws java.io.IOException {
        EZpvd("Unrecognized token '%s': was expecting %s", this.zsXlph.copydefault(), AxsJAYaxsJAY());
        return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
    }

    public com.fasterxml.jackson.core.JsonToken UlJrfe() throws java.io.IOException {
        this.wlaJM = false;
        this.values = 0;
        return copydefault(this.zsXlph.EZpvd(), 0, 46);
    }

    public com.fasterxml.jackson.core.JsonToken zsXlph(int i) throws java.io.IOException {
        this.wlaJM = false;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        cArrEZpvd[0] = (char) i;
        int i2 = this.fetchVPNInfo;
        if (i2 >= this.isConnected) {
            this.fFgQHt = 26;
            this.zsXlph.copydefault(1);
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int iAhwBna = AhwBna(i2) & UnsignedBytes.MAX_VALUE;
        int i3 = 1;
        while (true) {
            if (iAhwBna < 48) {
                if (iAhwBna == 46) {
                    this.values = i3;
                    this.fetchVPNInfo++;
                    return copydefault(cArrEZpvd, i3, iAhwBna);
                }
            } else if (iAhwBna <= 57) {
                if (i3 >= cArrEZpvd.length) {
                    cArrEZpvd = this.zsXlph.OLrzqt();
                }
                int i4 = i3 + 1;
                cArrEZpvd[i3] = (char) iAhwBna;
                int i5 = this.fetchVPNInfo + 1;
                this.fetchVPNInfo = i5;
                if (i5 >= this.isConnected) {
                    this.fFgQHt = 26;
                    this.zsXlph.copydefault(i4);
                    com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                    this.QVAiDq = jsonToken2;
                    return jsonToken2;
                }
                iAhwBna = AhwBna(i5) & UnsignedBytes.MAX_VALUE;
                i3 = i4;
            } else if (iAhwBna == 101 || iAhwBna == 69) {
                this.values = i3;
                this.fetchVPNInfo++;
                return copydefault(cArrEZpvd, i3, iAhwBna);
            }
        }
        this.values = i3;
        this.zsXlph.copydefault(i3);
        return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
    }

    public com.fasterxml.jackson.core.JsonToken dUDNAs() throws java.io.IOException {
        this.wlaJM = true;
        if (this.fetchVPNInfo >= this.isConnected) {
            this.fFgQHt = 23;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int iDCUTEI = DCUTEI();
        int i = 2;
        if (iDCUTEI <= 48) {
            if (iDCUTEI == 48) {
                return OHqIaq();
            }
            AEQbTJ(iDCUTEI, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (iDCUTEI > 57) {
            if (iDCUTEI == 73) {
                return AYXKKw(3, 2);
            }
            AEQbTJ(iDCUTEI, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        cArrEZpvd[0] = '-';
        cArrEZpvd[1] = (char) iDCUTEI;
        int i2 = this.fetchVPNInfo;
        if (i2 >= this.isConnected) {
            this.fFgQHt = 26;
            this.zsXlph.copydefault(2);
            this.values = 1;
            com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken2;
            return jsonToken2;
        }
        int iAhwBna = AhwBna(i2);
        while (true) {
            if (iAhwBna < 48) {
                if (iAhwBna == 46) {
                    this.values = i - 1;
                    this.fetchVPNInfo++;
                    return copydefault(cArrEZpvd, i, iAhwBna);
                }
            } else if (iAhwBna <= 57) {
                if (i >= cArrEZpvd.length) {
                    cArrEZpvd = this.zsXlph.OLrzqt();
                }
                int i3 = i + 1;
                cArrEZpvd[i] = (char) iAhwBna;
                int i4 = this.fetchVPNInfo + 1;
                this.fetchVPNInfo = i4;
                if (i4 >= this.isConnected) {
                    this.fFgQHt = 26;
                    this.zsXlph.copydefault(i3);
                    com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                    this.QVAiDq = jsonToken3;
                    return jsonToken3;
                }
                iAhwBna = AhwBna(i4) & UnsignedBytes.MAX_VALUE;
                i = i3;
            } else if (iAhwBna == 101 || iAhwBna == 69) {
                this.values = i - 1;
                this.fetchVPNInfo++;
                return copydefault(cArrEZpvd, i, iAhwBna);
            }
        }
        this.values = i - 1;
        this.zsXlph.copydefault(i);
        return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
    }

    public com.fasterxml.jackson.core.JsonToken QwvEab() throws java.io.IOException {
        this.wlaJM = false;
        if (this.fetchVPNInfo >= this.isConnected) {
            this.fFgQHt = 22;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int iDCUTEI = DCUTEI();
        int i = 2;
        if (iDCUTEI <= 48) {
            if (iDCUTEI == 48) {
                if (!copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    AEQbTJ(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return OFhtUX();
            }
            AEQbTJ(iDCUTEI, "expected digit (0-9) to follow plus sign, for valid numeric value");
        } else if (iDCUTEI > 57) {
            if (iDCUTEI == 73) {
                return AYXKKw(2, 2);
            }
            AEQbTJ(iDCUTEI, "expected digit (0-9) to follow plus sign, for valid numeric value");
        }
        if (!copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            AEQbTJ(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        cArrEZpvd[0] = '+';
        cArrEZpvd[1] = (char) iDCUTEI;
        int i2 = this.fetchVPNInfo;
        if (i2 >= this.isConnected) {
            this.fFgQHt = 26;
            this.zsXlph.copydefault(2);
            this.values = 1;
            com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken2;
            return jsonToken2;
        }
        int iAhwBna = AhwBna(i2);
        while (true) {
            if (iAhwBna < 48) {
                if (iAhwBna == 46) {
                    this.values = i - 1;
                    this.fetchVPNInfo++;
                    return copydefault(cArrEZpvd, i, iAhwBna);
                }
            } else if (iAhwBna <= 57) {
                if (i >= cArrEZpvd.length) {
                    cArrEZpvd = this.zsXlph.OLrzqt();
                }
                int i3 = i + 1;
                cArrEZpvd[i] = (char) iAhwBna;
                int i4 = this.fetchVPNInfo + 1;
                this.fetchVPNInfo = i4;
                if (i4 >= this.isConnected) {
                    this.fFgQHt = 26;
                    this.zsXlph.copydefault(i3);
                    com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                    this.QVAiDq = jsonToken3;
                    return jsonToken3;
                }
                iAhwBna = AhwBna(i4) & UnsignedBytes.MAX_VALUE;
                i = i3;
            } else if (iAhwBna == 101 || iAhwBna == 69) {
                this.values = i - 1;
                this.fetchVPNInfo++;
                return copydefault(cArrEZpvd, i, iAhwBna);
            }
        }
        this.values = i - 1;
        this.zsXlph.copydefault(i);
        return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
    }

    public com.fasterxml.jackson.core.JsonToken USBtdM() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        if (i >= this.isConnected) {
            this.fFgQHt = 24;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        int i2 = i + 1;
        int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
        if (iAhwBna < 48) {
            if (iAhwBna == 46) {
                this.fetchVPNInfo = i2;
                this.values = 1;
                char[] cArrEZpvd = this.zsXlph.EZpvd();
                cArrEZpvd[0] = '0';
                return copydefault(cArrEZpvd, 1, iAhwBna);
            }
        } else {
            if (iAhwBna <= 57) {
                return ODXsMY();
            }
            if (iAhwBna == 101 || iAhwBna == 69) {
                this.fetchVPNInfo = i2;
                this.values = 1;
                char[] cArrEZpvd2 = this.zsXlph.EZpvd();
                cArrEZpvd2[0] = '0';
                return copydefault(cArrEZpvd2, 1, iAhwBna);
            }
            if (iAhwBna != 93 && iAhwBna != 125) {
                AEQbTJ(iAhwBna, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return copydefault(0, "0");
    }

    public com.fasterxml.jackson.core.JsonToken fIwbmz(int i) throws java.io.IOException {
        return EZpvd(i, true);
    }

    public com.fasterxml.jackson.core.JsonToken AuCTel(int i) throws java.io.IOException {
        return EZpvd(i, false);
    }

    public com.fasterxml.jackson.core.JsonToken EZpvd(int i, boolean z) throws java.io.IOException {
        if (i <= 48) {
            if (i == 48) {
                if (z) {
                    return OHqIaq();
                }
                if (!copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    AEQbTJ(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                return OFhtUX();
            }
            if (i == 46 && copydefault(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                if (z) {
                    this.fetchVPNInfo--;
                    return OHqIaq();
                }
                if (!copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                    AEQbTJ(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
                }
                this.fetchVPNInfo--;
                return OFhtUX();
            }
            AEQbTJ(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        } else if (i > 57) {
            if (i == 73) {
                return AYXKKw(z ? 3 : 2, 2);
            }
            AEQbTJ(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        }
        if (!z && !copydefault(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            AEQbTJ(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        cArrEZpvd[0] = z ? '-' : '+';
        cArrEZpvd[1] = (char) i;
        this.values = 1;
        return OLrzqt(cArrEZpvd, 2);
    }

    public com.fasterxml.jackson.core.JsonToken ODXsMY() throws java.io.IOException {
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (iDCUTEI < 48) {
                if (iDCUTEI == 46) {
                    char[] cArrEZpvd = this.zsXlph.EZpvd();
                    cArrEZpvd[0] = '0';
                    this.values = 1;
                    return copydefault(cArrEZpvd, 1, iDCUTEI);
                }
            } else if (iDCUTEI <= 57) {
                if ((this.EZpvd & DCJXGO) == 0) {
                    AYXKKw("Leading zeroes not allowed");
                }
                if (iDCUTEI != 48) {
                    char[] cArrEZpvd2 = this.zsXlph.EZpvd();
                    cArrEZpvd2[0] = (char) iDCUTEI;
                    this.values = 1;
                    return OLrzqt(cArrEZpvd2, 1);
                }
            } else {
                if (iDCUTEI == 101 || iDCUTEI == 69) {
                    char[] cArrEZpvd3 = this.zsXlph.EZpvd();
                    cArrEZpvd3[0] = '0';
                    this.values = 1;
                    return copydefault(cArrEZpvd3, 1, iDCUTEI);
                }
                if (iDCUTEI != 93 && iDCUTEI != 125) {
                    AEQbTJ(iDCUTEI, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            }
            this.fetchVPNInfo--;
            return copydefault(0, "0");
        }
        this.fFgQHt = 24;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    public com.fasterxml.jackson.core.JsonToken OHqIaq() throws java.io.IOException {
        return KWHzl(true);
    }

    public com.fasterxml.jackson.core.JsonToken OFhtUX() throws java.io.IOException {
        return KWHzl(false);
    }

    public com.fasterxml.jackson.core.JsonToken KWHzl(boolean z) throws java.io.IOException {
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (iDCUTEI < 48) {
                if (iDCUTEI == 46) {
                    char[] cArrEZpvd = this.zsXlph.EZpvd();
                    cArrEZpvd[0] = z ? '-' : '+';
                    cArrEZpvd[1] = '0';
                    this.values = 1;
                    return copydefault(cArrEZpvd, 2, iDCUTEI);
                }
            } else if (iDCUTEI <= 57) {
                if ((this.EZpvd & DCJXGO) == 0) {
                    AYXKKw("Leading zeroes not allowed");
                }
                if (iDCUTEI != 48) {
                    char[] cArrEZpvd2 = this.zsXlph.EZpvd();
                    cArrEZpvd2[0] = z ? '-' : '+';
                    cArrEZpvd2[1] = (char) iDCUTEI;
                    this.values = 1;
                    return OLrzqt(cArrEZpvd2, 2);
                }
            } else {
                if (iDCUTEI == 101 || iDCUTEI == 69) {
                    char[] cArrEZpvd3 = this.zsXlph.EZpvd();
                    cArrEZpvd3[0] = z ? '-' : '+';
                    cArrEZpvd3[1] = '0';
                    this.values = 1;
                    return copydefault(cArrEZpvd3, 2, iDCUTEI);
                }
                if (iDCUTEI != 93 && iDCUTEI != 125) {
                    AEQbTJ(iDCUTEI, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            }
            this.fetchVPNInfo--;
            return copydefault(0, "0");
        }
        this.fFgQHt = z ? 25 : 24;
        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken;
        return jsonToken;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r3.values = r0 + r5;
        r3.zsXlph.copydefault(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken OLrzqt(char[] cArr, int i) throws java.io.IOException {
        int i2 = this.wlaJM ? -1 : 0;
        while (true) {
            int i3 = this.fetchVPNInfo;
            if (i3 >= this.isConnected) {
                this.fFgQHt = 26;
                this.zsXlph.copydefault(i);
                com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                this.QVAiDq = jsonToken;
                return jsonToken;
            }
            int iAhwBna = AhwBna(i3) & UnsignedBytes.MAX_VALUE;
            if (iAhwBna < 48) {
                if (iAhwBna == 46) {
                    this.values = i2 + i;
                    this.fetchVPNInfo++;
                    return copydefault(cArr, i, iAhwBna);
                }
            } else if (iAhwBna <= 57) {
                this.fetchVPNInfo++;
                if (i >= cArr.length) {
                    cArr = this.zsXlph.OLrzqt();
                }
                cArr[i] = (char) iAhwBna;
                i++;
            } else if (iAhwBna == 101 || iAhwBna == 69) {
                this.values = i2 + i;
                this.fetchVPNInfo++;
                return copydefault(cArr, i, iAhwBna);
            }
        }
    }

    public com.fasterxml.jackson.core.JsonToken copydefault(char[] cArr, int i, int i2) throws java.io.IOException {
        int i3;
        int i4;
        byte bFfGIBT;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this.zsXlph.OLrzqt();
            }
            cArr[i] = '.';
            i++;
            i4 = 0;
            while (this.fetchVPNInfo < this.isConnected) {
                byte bFfGIBT2 = ffGIBT();
                if (bFfGIBT2 < 48 || bFfGIBT2 > 57) {
                    i3 = bFfGIBT2 & UnsignedBytes.MAX_VALUE;
                    if (i4 == 0 && !copydefault(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                        AEQbTJ(i3, "Decimal point not followed by a digit");
                    }
                } else {
                    if (i >= cArr.length) {
                        cArr = this.zsXlph.OLrzqt();
                    }
                    cArr[i] = (char) bFfGIBT2;
                    i4++;
                    i++;
                }
            }
            this.zsXlph.copydefault(i);
            this.fFgQHt = 30;
            this.AkhnZx = i4;
            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            this.QVAiDq = jsonToken;
            return jsonToken;
        }
        i3 = i2;
        i4 = 0;
        this.AkhnZx = i4;
        if (i3 == 101 || i3 == 69) {
            if (i >= cArr.length) {
                cArr = this.zsXlph.OLrzqt();
            }
            int i6 = i + 1;
            cArr[i] = (char) i3;
            if (this.fetchVPNInfo >= this.isConnected) {
                this.zsXlph.copydefault(i6);
                this.fFgQHt = 31;
                this.DbNXlk = 0;
                com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                this.QVAiDq = jsonToken2;
                return jsonToken2;
            }
            byte bFfGIBT3 = ffGIBT();
            if (bFfGIBT3 == 45 || bFfGIBT3 == 43) {
                if (i6 >= cArr.length) {
                    cArr = this.zsXlph.OLrzqt();
                }
                i += 2;
                cArr[i6] = (char) bFfGIBT3;
                if (this.fetchVPNInfo >= this.isConnected) {
                    this.zsXlph.copydefault(i);
                    this.fFgQHt = 32;
                    this.DbNXlk = 0;
                    com.fasterxml.jackson.core.JsonToken jsonToken3 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                    this.QVAiDq = jsonToken3;
                    return jsonToken3;
                }
                bFfGIBT = ffGIBT();
            } else {
                i = i6;
                bFfGIBT = bFfGIBT3;
            }
            while (bFfGIBT >= 48 && bFfGIBT <= 57) {
                i5++;
                if (i >= cArr.length) {
                    cArr = this.zsXlph.OLrzqt();
                }
                int i7 = i + 1;
                cArr[i] = (char) bFfGIBT;
                if (this.fetchVPNInfo >= this.isConnected) {
                    this.zsXlph.copydefault(i7);
                    this.fFgQHt = 32;
                    this.DbNXlk = i5;
                    com.fasterxml.jackson.core.JsonToken jsonToken4 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                    this.QVAiDq = jsonToken4;
                    return jsonToken4;
                }
                bFfGIBT = ffGIBT();
                i = i7;
            }
            if (i5 == 0) {
                AEQbTJ(bFfGIBT & UnsignedBytes.MAX_VALUE, "Exponent indicator not followed by a digit");
            }
        }
        this.fetchVPNInfo--;
        this.zsXlph.copydefault(i);
        this.DbNXlk = i5;
        return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
    }

    public com.fasterxml.jackson.core.JsonToken DLWbHP() throws java.io.IOException {
        int i = this.AkhnZx;
        char[] cArrAYXKKw = this.zsXlph.AYXKKw();
        int iDjBIcL = this.zsXlph.djBIcL();
        byte bFfGIBT = ffGIBT();
        boolean z = true;
        while (z) {
            if (bFfGIBT >= 48 && bFfGIBT <= 57) {
                i++;
                if (iDjBIcL >= cArrAYXKKw.length) {
                    cArrAYXKKw = this.zsXlph.OLrzqt();
                }
                int i2 = iDjBIcL + 1;
                cArrAYXKKw[iDjBIcL] = (char) bFfGIBT;
                if (this.fetchVPNInfo >= this.isConnected) {
                    this.zsXlph.copydefault(i2);
                    this.AkhnZx = i;
                    return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                }
                bFfGIBT = ffGIBT();
                iDjBIcL = i2;
            } else if (bFfGIBT == 102 || bFfGIBT == 100 || bFfGIBT == 70 || bFfGIBT == 68) {
                AEQbTJ(bFfGIBT, "JSON does not support parsing numbers that have 'f' or 'd' suffixes");
            } else if (bFfGIBT == 46) {
                AEQbTJ(bFfGIBT, "Cannot parse number with more than one decimal point");
            } else {
                z = false;
            }
        }
        if (i == 0 && !copydefault(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            AEQbTJ(bFfGIBT, "Decimal point not followed by a digit");
        }
        this.AkhnZx = i;
        this.zsXlph.copydefault(iDjBIcL);
        if (bFfGIBT == 101 || bFfGIBT == 69) {
            this.zsXlph.KWHzl((char) bFfGIBT);
            this.DbNXlk = 0;
            if (this.fetchVPNInfo >= this.isConnected) {
                this.fFgQHt = 31;
                return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            }
            this.fFgQHt = 32;
            return OLrzqt(true, DCUTEI());
        }
        this.fetchVPNInfo--;
        this.zsXlph.copydefault(iDjBIcL);
        this.DbNXlk = 0;
        return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
    }

    public com.fasterxml.jackson.core.JsonToken OLrzqt(boolean z, int i) throws java.io.IOException {
        if (z) {
            this.fFgQHt = 32;
            if (i == 45 || i == 43) {
                this.zsXlph.KWHzl((char) i);
                if (this.fetchVPNInfo >= this.isConnected) {
                    this.fFgQHt = 32;
                    this.DbNXlk = 0;
                    return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                }
                i = ffGIBT();
            }
        }
        char[] cArrAYXKKw = this.zsXlph.AYXKKw();
        int iDjBIcL = this.zsXlph.djBIcL();
        int i2 = this.DbNXlk;
        while (i >= 48 && i <= 57) {
            i2++;
            if (iDjBIcL >= cArrAYXKKw.length) {
                cArrAYXKKw = this.zsXlph.OLrzqt();
            }
            int i3 = iDjBIcL + 1;
            cArrAYXKKw[iDjBIcL] = (char) i;
            if (this.fetchVPNInfo >= this.isConnected) {
                this.zsXlph.copydefault(i3);
                this.DbNXlk = i2;
                return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
            }
            i = ffGIBT();
            iDjBIcL = i3;
        }
        if (i2 == 0) {
            AEQbTJ(i & 255, "Exponent indicator not followed by a digit");
        }
        this.fetchVPNInfo--;
        this.zsXlph.copydefault(iDjBIcL);
        this.DbNXlk = i2;
        return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT);
    }

    public final java.lang.String dmfpNf() throws java.io.IOException {
        int[] iArr = OqFWZa;
        int i = this.fetchVPNInfo;
        int i2 = i + 1;
        int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna] != 0) {
            if (iAhwBna != 34) {
                return null;
            }
            this.fetchVPNInfo = i2;
            return "";
        }
        int i3 = i + 2;
        int iAhwBna2 = AhwBna(i2) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna2] != 0) {
            if (iAhwBna2 != 34) {
                return null;
            }
            this.fetchVPNInfo = i3;
            return KWHzl(iAhwBna, 1);
        }
        int i4 = iAhwBna2 | (iAhwBna << 8);
        int i5 = i + 3;
        int iAhwBna3 = AhwBna(i3) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna3] != 0) {
            if (iAhwBna3 != 34) {
                return null;
            }
            this.fetchVPNInfo = i5;
            return KWHzl(i4, 2);
        }
        int i6 = (i4 << 8) | iAhwBna3;
        int i7 = i + 4;
        int iAhwBna4 = AhwBna(i5) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna4] != 0) {
            if (iAhwBna4 != 34) {
                return null;
            }
            this.fetchVPNInfo = i7;
            return KWHzl(i6, 3);
        }
        int i8 = (i6 << 8) | iAhwBna4;
        int i9 = i + 5;
        int iAhwBna5 = AhwBna(i7) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna5] == 0) {
            this.gGvvIC = i8;
            return isConnected(i9, iAhwBna5);
        }
        if (iAhwBna5 != 34) {
            return null;
        }
        this.fetchVPNInfo = i9;
        return KWHzl(i8, 4);
    }

    public final java.lang.String isConnected(int i, int i2) throws java.io.IOException {
        int[] iArr = OqFWZa;
        int i3 = i + 1;
        int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna] != 0) {
            if (iAhwBna != 34) {
                return null;
            }
            this.fetchVPNInfo = i3;
            return KWHzl(this.gGvvIC, i2, 1);
        }
        int i4 = (i2 << 8) | iAhwBna;
        int i5 = i + 2;
        int iAhwBna2 = AhwBna(i3) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna2] != 0) {
            if (iAhwBna2 != 34) {
                return null;
            }
            this.fetchVPNInfo = i5;
            return KWHzl(this.gGvvIC, i4, 2);
        }
        int i6 = (i4 << 8) | iAhwBna2;
        int i7 = i + 3;
        int iAhwBna3 = AhwBna(i5) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna3] != 0) {
            if (iAhwBna3 != 34) {
                return null;
            }
            this.fetchVPNInfo = i7;
            return KWHzl(this.gGvvIC, i6, 3);
        }
        int i8 = (i6 << 8) | iAhwBna3;
        int i9 = i + 4;
        int iAhwBna4 = AhwBna(i7) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna4] == 0) {
            return valueOf(i9, iAhwBna4, i8);
        }
        if (iAhwBna4 != 34) {
            return null;
        }
        this.fetchVPNInfo = i9;
        return KWHzl(this.gGvvIC, i8, 4);
    }

    public final java.lang.String valueOf(int i, int i2, int i3) throws java.io.IOException {
        int[] iArr = OqFWZa;
        int i4 = i + 1;
        int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna] != 0) {
            if (iAhwBna != 34) {
                return null;
            }
            this.fetchVPNInfo = i4;
            return AEQbTJ(this.gGvvIC, i3, i2, 1);
        }
        int i5 = (i2 << 8) | iAhwBna;
        int i6 = i + 2;
        int iAhwBna2 = AhwBna(i4) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna2] != 0) {
            if (iAhwBna2 != 34) {
                return null;
            }
            this.fetchVPNInfo = i6;
            return AEQbTJ(this.gGvvIC, i3, i5, 2);
        }
        int i7 = (i5 << 8) | iAhwBna2;
        int i8 = i + 3;
        int iAhwBna3 = AhwBna(i6) & UnsignedBytes.MAX_VALUE;
        if (iArr[iAhwBna3] != 0) {
            if (iAhwBna3 != 34) {
                return null;
            }
            this.fetchVPNInfo = i8;
            return AEQbTJ(this.gGvvIC, i3, i7, 3);
        }
        if ((AhwBna(i8) & UnsignedBytes.MAX_VALUE) != 34) {
            return null;
        }
        this.fetchVPNInfo = i + 4;
        return AEQbTJ(this.gGvvIC, i3, (i7 << 8) | iAhwBna3, 4);
    }

    public final com.fasterxml.jackson.core.JsonToken AYXKKw(int i, int i2, int i3) throws java.io.IOException {
        int i4;
        int[] iArrEZpvd = this.iRxXKY;
        int[] iArr = OqFWZa;
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (iArr[iDCUTEI] == 0) {
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | iDCUTEI;
                } else {
                    if (i >= iArrEZpvd.length) {
                        iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                        this.iRxXKY = iArrEZpvd;
                    }
                    i4 = i + 1;
                    iArrEZpvd[i] = i2;
                    i = i4;
                    i2 = iDCUTEI;
                    i3 = 1;
                }
            } else if (iDCUTEI != 34) {
                if (iDCUTEI != 92) {
                    EZpvd(iDCUTEI, "name");
                } else {
                    iDCUTEI = QkdxfA();
                    if (iDCUTEI < 0) {
                        this.fFgQHt = 8;
                        this.fvQaOB = 7;
                        this.gkJEwt = i;
                        this.flVtFt = i2;
                        this.gasjUx = i3;
                        com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                        this.QVAiDq = jsonToken;
                        return jsonToken;
                    }
                }
                if (i >= iArrEZpvd.length) {
                    iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                    this.iRxXKY = iArrEZpvd;
                }
                if (iDCUTEI > 127) {
                    int i5 = 0;
                    if (i3 >= 4) {
                        iArrEZpvd[i] = i2;
                        i++;
                        i2 = 0;
                        i3 = 0;
                    }
                    int i6 = i2 << 8;
                    if (iDCUTEI < 2048) {
                        i2 = i6 | (iDCUTEI >> 6) | 192;
                        i3++;
                    } else {
                        int i7 = i6 | (iDCUTEI >> 12) | 224;
                        int i8 = i3 + 1;
                        if (i8 >= 4) {
                            iArrEZpvd[i] = i7;
                            i++;
                            i8 = 0;
                        } else {
                            i5 = i7;
                        }
                        i2 = (i5 << 8) | ((iDCUTEI >> 6) & 63) | 128;
                        i3 = i8 + 1;
                    }
                    iDCUTEI = (iDCUTEI & 63) | 128;
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | iDCUTEI;
                } else {
                    i4 = i + 1;
                    iArrEZpvd[i] = i2;
                    i = i4;
                    i2 = iDCUTEI;
                    i3 = 1;
                }
            } else {
                if (i3 > 0) {
                    if (i >= iArrEZpvd.length) {
                        iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                        this.iRxXKY = iArrEZpvd;
                    }
                    iArrEZpvd[i] = AbstractC5529Vf.EZpvd(i2, i3);
                    i++;
                } else if (i == 0) {
                    return AhwBna("");
                }
                java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArrEZpvd, i);
                if (strOLrzqt == null) {
                    strOLrzqt = AEQbTJ(iArrEZpvd, i, i3);
                }
                return AhwBna(strOLrzqt);
            }
        }
        this.gkJEwt = i;
        this.flVtFt = i2;
        this.gasjUx = i3;
        this.fFgQHt = 7;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken2;
        return jsonToken2;
    }

    public final com.fasterxml.jackson.core.JsonToken iwGUEr(int i) throws java.io.IOException {
        if (i != 35) {
            if (i != 39) {
                if (i == 47) {
                    return wlaJM(4);
                }
                if (i == 93) {
                    return OuxcSI();
                }
            } else if ((this.EZpvd & RlQdEF) != 0) {
                return OLrzqt(0, 0, 0);
            }
        } else if ((this.EZpvd & DAIeex) != 0) {
            return ejfBZ(4);
        }
        if ((this.EZpvd & AxsJAYsNCnLh) == 0) {
            OLrzqt((char) i, "was expecting double-quote to start field name");
        }
        if (C5521Ux.AhwBna()[i] != 0) {
            OLrzqt(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return gEmmrt(0, i, 1);
    }

    public final com.fasterxml.jackson.core.JsonToken gEmmrt(int i, int i2, int i3) throws java.io.IOException {
        int[] iArrEZpvd = this.iRxXKY;
        int[] iArrAhwBna = C5521Ux.AhwBna();
        while (true) {
            int i4 = this.fetchVPNInfo;
            if (i4 >= this.isConnected) {
                this.gkJEwt = i;
                this.flVtFt = i2;
                this.gasjUx = i3;
                this.fFgQHt = 10;
                com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                this.QVAiDq = jsonToken;
                return jsonToken;
            }
            int iAhwBna = AhwBna(i4) & UnsignedBytes.MAX_VALUE;
            if (iArrAhwBna[iAhwBna] != 0) {
                if (i3 > 0) {
                    if (i >= iArrEZpvd.length) {
                        iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                        this.iRxXKY = iArrEZpvd;
                    }
                    iArrEZpvd[i] = i2;
                    i++;
                }
                java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArrEZpvd, i);
                if (strOLrzqt == null) {
                    strOLrzqt = AEQbTJ(iArrEZpvd, i, i3);
                }
                return AhwBna(strOLrzqt);
            }
            this.fetchVPNInfo++;
            if (i3 < 4) {
                i3++;
                i2 = (i2 << 8) | iAhwBna;
            } else {
                if (i >= iArrEZpvd.length) {
                    int[] iArrEZpvd2 = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                    this.iRxXKY = iArrEZpvd2;
                    iArrEZpvd = iArrEZpvd2;
                }
                iArrEZpvd[i] = i2;
                i++;
                i2 = iAhwBna;
                i3 = 1;
            }
        }
    }

    public final com.fasterxml.jackson.core.JsonToken OLrzqt(int i, int i2, int i3) throws java.io.IOException {
        int[] iArrEZpvd = this.iRxXKY;
        int[] iArr = OqFWZa;
        while (this.fetchVPNInfo < this.isConnected) {
            int iDCUTEI = DCUTEI();
            if (iDCUTEI != 39) {
                if (iDCUTEI != 34 && iArr[iDCUTEI] != 0) {
                    if (iDCUTEI != 92) {
                        EZpvd(iDCUTEI, "name");
                    } else {
                        iDCUTEI = QkdxfA();
                        if (iDCUTEI < 0) {
                            this.fFgQHt = 8;
                            this.fvQaOB = 9;
                            this.gkJEwt = i;
                            this.flVtFt = i2;
                            this.gasjUx = i3;
                            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                            this.QVAiDq = jsonToken;
                            return jsonToken;
                        }
                    }
                    if (iDCUTEI > 127) {
                        int i4 = 0;
                        if (i3 >= 4) {
                            if (i >= iArrEZpvd.length) {
                                iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                                this.iRxXKY = iArrEZpvd;
                            }
                            iArrEZpvd[i] = i2;
                            i++;
                            i2 = 0;
                            i3 = 0;
                        }
                        int i5 = i2 << 8;
                        if (iDCUTEI < 2048) {
                            i2 = i5 | (iDCUTEI >> 6) | 192;
                            i3++;
                        } else {
                            int i6 = i5 | (iDCUTEI >> 12) | 224;
                            int i7 = i3 + 1;
                            if (i7 >= 4) {
                                if (i >= iArrEZpvd.length) {
                                    iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                                    this.iRxXKY = iArrEZpvd;
                                }
                                iArrEZpvd[i] = i6;
                                i++;
                                i7 = 0;
                            } else {
                                i4 = i6;
                            }
                            i2 = (i4 << 8) | ((iDCUTEI >> 6) & 63) | 128;
                            i3 = i7 + 1;
                        }
                        iDCUTEI = (iDCUTEI & 63) | 128;
                    }
                }
                if (i3 < 4) {
                    i3++;
                    i2 = (i2 << 8) | iDCUTEI;
                } else {
                    if (i >= iArrEZpvd.length) {
                        int[] iArrEZpvd2 = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                        this.iRxXKY = iArrEZpvd2;
                        iArrEZpvd = iArrEZpvd2;
                    }
                    iArrEZpvd[i] = i2;
                    i++;
                    i2 = iDCUTEI;
                    i3 = 1;
                }
            } else {
                if (i3 > 0) {
                    if (i >= iArrEZpvd.length) {
                        iArrEZpvd = AbstractC5508Ul.EZpvd(iArrEZpvd, iArrEZpvd.length);
                        this.iRxXKY = iArrEZpvd;
                    }
                    iArrEZpvd[i] = AbstractC5529Vf.EZpvd(i2, i3);
                    i++;
                } else if (i == 0) {
                    return AhwBna("");
                }
                java.lang.String strOLrzqt = this.iZzfmt.OLrzqt(iArrEZpvd, i);
                if (strOLrzqt == null) {
                    strOLrzqt = AEQbTJ(iArrEZpvd, i, i3);
                }
                return AhwBna(strOLrzqt);
            }
        }
        this.gkJEwt = i;
        this.flVtFt = i2;
        this.gasjUx = i3;
        this.fFgQHt = 9;
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken2;
        return jsonToken2;
    }

    public final com.fasterxml.jackson.core.JsonToken hrNTAI() throws java.io.IOException {
        int i;
        int iAhwBna = AhwBna(this.AxsJAYaxsJAY, this.hUfVAv);
        if (iAhwBna < 0) {
            this.fFgQHt = 8;
            return com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        }
        int i2 = this.gkJEwt;
        int[] iArr = this.iRxXKY;
        if (i2 >= iArr.length) {
            this.iRxXKY = AbstractC5508Ul.EZpvd(iArr, 32);
        }
        int i3 = this.flVtFt;
        int i4 = this.gasjUx;
        int i5 = 1;
        if (iAhwBna > 127) {
            int i6 = 0;
            if (i4 >= 4) {
                int[] iArr2 = this.iRxXKY;
                int i7 = this.gkJEwt;
                this.gkJEwt = i7 + 1;
                iArr2[i7] = i3;
                i3 = 0;
                i4 = 0;
            }
            int i8 = i3 << 8;
            if (iAhwBna < 2048) {
                i = (iAhwBna >> 6) | 192;
            } else {
                int i9 = i8 | (iAhwBna >> 12) | 224;
                i4++;
                if (i4 >= 4) {
                    int[] iArr3 = this.iRxXKY;
                    int i10 = this.gkJEwt;
                    this.gkJEwt = i10 + 1;
                    iArr3[i10] = i9;
                    i4 = 0;
                } else {
                    i6 = i9;
                }
                i8 = i6 << 8;
                i = ((iAhwBna >> 6) & 63) | 128;
            }
            i3 = i8 | i;
            i4++;
            iAhwBna = (iAhwBna & 63) | 128;
        }
        if (i4 < 4) {
            i5 = 1 + i4;
            iAhwBna |= i3 << 8;
        } else {
            int[] iArr4 = this.iRxXKY;
            int i11 = this.gkJEwt;
            this.gkJEwt = i11 + 1;
            iArr4[i11] = i3;
        }
        if (this.fvQaOB == 9) {
            return OLrzqt(this.gkJEwt, iAhwBna, i5);
        }
        return AYXKKw(this.gkJEwt, iAhwBna, i5);
    }

    public final int AhwBna(int i, int i2) throws java.io.IOException {
        if (this.fetchVPNInfo >= this.isConnected) {
            this.AxsJAYaxsJAY = i;
            this.hUfVAv = i2;
            return -1;
        }
        byte bFfGIBT = ffGIBT();
        if (i2 == -1) {
            if (bFfGIBT == 34 || bFfGIBT == 47 || bFfGIBT == 92) {
                return bFfGIBT;
            }
            if (bFfGIBT == 98) {
                return 8;
            }
            if (bFfGIBT == 102) {
                return 12;
            }
            if (bFfGIBT == 110) {
                return 10;
            }
            if (bFfGIBT == 114) {
                return 13;
            }
            if (bFfGIBT == 116) {
                return 9;
            }
            if (bFfGIBT != 117) {
                return copydefault((char) bFfGIBT);
            }
            if (this.fetchVPNInfo >= this.isConnected) {
                this.hUfVAv = 0;
                this.AxsJAYaxsJAY = 0;
                return -1;
            }
            bFfGIBT = ffGIBT();
            i2 = 0;
        }
        int iDCUTEI = bFfGIBT & UnsignedBytes.MAX_VALUE;
        while (true) {
            int iKWHzl = C5521Ux.KWHzl(iDCUTEI);
            if (iKWHzl < 0) {
                OLrzqt(iDCUTEI & 255, "expected a hex-digit for character escape sequence");
            }
            i = (i << 4) | iKWHzl;
            i2++;
            if (i2 == 4) {
                return i;
            }
            if (this.fetchVPNInfo >= this.isConnected) {
                this.hUfVAv = i2;
                this.AxsJAYaxsJAY = i;
                return -1;
            }
            iDCUTEI = DCUTEI();
        }
    }

    public com.fasterxml.jackson.core.JsonToken igXuih() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = DarRvM;
        int iMin = java.lang.Math.min(this.isConnected, cArrEZpvd.length + i);
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
            if (iArr[iAhwBna] == 0) {
                i++;
                cArrEZpvd[i2] = (char) iAhwBna;
                i2++;
            } else if (iAhwBna == 34) {
                this.fetchVPNInfo = i + 1;
                this.zsXlph.copydefault(i2);
                return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
            }
        }
        this.zsXlph.copydefault(i2);
        this.fetchVPNInfo = i;
        return QVsKAR();
    }

    public final com.fasterxml.jackson.core.JsonToken QVsKAR() throws java.io.IOException {
        int[] iArr = DarRvM;
        char[] cArrAYXKKw = this.zsXlph.AYXKKw();
        int iDjBIcL = this.zsXlph.djBIcL();
        int i = this.fetchVPNInfo;
        int i2 = this.isConnected;
        while (i < this.isConnected) {
            int i3 = 0;
            if (iDjBIcL >= cArrAYXKKw.length) {
                cArrAYXKKw = this.zsXlph.gEmmrt();
                iDjBIcL = 0;
            }
            int iMin = java.lang.Math.min(this.isConnected, (cArrAYXKKw.length - iDjBIcL) + i);
            while (true) {
                if (i < iMin) {
                    int i4 = i + 1;
                    int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
                    int i5 = iArr[iAhwBna];
                    if (i5 == 0) {
                        cArrAYXKKw[iDjBIcL] = (char) iAhwBna;
                        iDjBIcL++;
                        i = i4;
                    } else {
                        if (iAhwBna == 34) {
                            this.fetchVPNInfo = i4;
                            this.zsXlph.copydefault(iDjBIcL);
                            return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
                        }
                        if (i4 >= i2 - 5) {
                            this.fetchVPNInfo = i4;
                            this.zsXlph.copydefault(iDjBIcL);
                            if (!EZpvd(iAhwBna, iArr[iAhwBna], i4 < this.isConnected)) {
                                this.fvQaOB = 40;
                                com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                                this.QVAiDq = jsonToken;
                                return jsonToken;
                            }
                            cArrAYXKKw = this.zsXlph.AYXKKw();
                            iDjBIcL = this.zsXlph.djBIcL();
                            i = this.fetchVPNInfo;
                        } else {
                            if (i5 == 1) {
                                this.fetchVPNInfo = i4;
                                iAhwBna = hBpjJd();
                                i = this.fetchVPNInfo;
                            } else if (i5 == 2) {
                                i += 2;
                                iAhwBna = valueOf(iAhwBna, AhwBna(i4));
                            } else if (i5 != 3) {
                                if (i5 == 4) {
                                    i4 = i + 4;
                                    int iOLrzqt = OLrzqt(iAhwBna, AhwBna(i4), AhwBna(i + 2), AhwBna(i + 3));
                                    int i6 = iDjBIcL + 1;
                                    cArrAYXKKw[iDjBIcL] = (char) ((iOLrzqt >> 10) | 55296);
                                    if (i6 >= cArrAYXKKw.length) {
                                        cArrAYXKKw = this.zsXlph.gEmmrt();
                                        iDjBIcL = 0;
                                    } else {
                                        iDjBIcL = i6;
                                    }
                                    iAhwBna = (iOLrzqt & 1023) | Utf8.LOG_SURROGATE_HEADER;
                                } else if (iAhwBna < 32) {
                                    EZpvd(iAhwBna, "string value");
                                } else {
                                    AkhnZx(iAhwBna);
                                }
                                i = i4;
                            } else {
                                iAhwBna = AEQbTJ(iAhwBna, AhwBna(i4), AhwBna(i + 2));
                                i += 3;
                            }
                            if (iDjBIcL >= cArrAYXKKw.length) {
                                cArrAYXKKw = this.zsXlph.gEmmrt();
                            } else {
                                i3 = iDjBIcL;
                            }
                            iDjBIcL = i3 + 1;
                            cArrAYXKKw[i3] = (char) iAhwBna;
                        }
                    }
                }
            }
        }
        this.fetchVPNInfo = i;
        this.fFgQHt = 40;
        this.zsXlph.copydefault(iDjBIcL);
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken2;
        return jsonToken2;
    }

    public com.fasterxml.jackson.core.JsonToken OJuSTm() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        char[] cArrEZpvd = this.zsXlph.EZpvd();
        int[] iArr = DarRvM;
        int iMin = java.lang.Math.min(this.isConnected, cArrEZpvd.length + i);
        int i2 = 0;
        while (i < iMin) {
            int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
            if (iAhwBna == 39) {
                this.fetchVPNInfo = i + 1;
                this.zsXlph.copydefault(i2);
                return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
            }
            if (iArr[iAhwBna] != 0) {
                break;
            }
            i++;
            cArrEZpvd[i2] = (char) iAhwBna;
            i2++;
        }
        this.zsXlph.copydefault(i2);
        this.fetchVPNInfo = i;
        return dHguZz();
    }

    public final com.fasterxml.jackson.core.JsonToken dHguZz() throws java.io.IOException {
        int[] iArr = DarRvM;
        char[] cArrAYXKKw = this.zsXlph.AYXKKw();
        int iDjBIcL = this.zsXlph.djBIcL();
        int i = this.fetchVPNInfo;
        int i2 = this.isConnected;
        while (i < this.isConnected) {
            int i3 = 0;
            if (iDjBIcL >= cArrAYXKKw.length) {
                cArrAYXKKw = this.zsXlph.gEmmrt();
                iDjBIcL = 0;
            }
            int iMin = java.lang.Math.min(this.isConnected, (cArrAYXKKw.length - iDjBIcL) + i);
            while (true) {
                if (i < iMin) {
                    int i4 = i + 1;
                    int iAhwBna = AhwBna(i) & UnsignedBytes.MAX_VALUE;
                    int i5 = iArr[iAhwBna];
                    if (i5 == 0 || iAhwBna == 34) {
                        if (iAhwBna == 39) {
                            this.fetchVPNInfo = i4;
                            this.zsXlph.copydefault(iDjBIcL);
                            return KWHzl(com.fasterxml.jackson.core.JsonToken.VALUE_STRING);
                        }
                        cArrAYXKKw[iDjBIcL] = (char) iAhwBna;
                        iDjBIcL++;
                        i = i4;
                    } else if (i4 >= i2 - 5) {
                        this.fetchVPNInfo = i4;
                        this.zsXlph.copydefault(iDjBIcL);
                        if (!EZpvd(iAhwBna, iArr[iAhwBna], i4 < this.isConnected)) {
                            this.fvQaOB = 45;
                            com.fasterxml.jackson.core.JsonToken jsonToken = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
                            this.QVAiDq = jsonToken;
                            return jsonToken;
                        }
                        cArrAYXKKw = this.zsXlph.AYXKKw();
                        iDjBIcL = this.zsXlph.djBIcL();
                        i = this.fetchVPNInfo;
                    } else {
                        if (i5 == 1) {
                            this.fetchVPNInfo = i4;
                            iAhwBna = hBpjJd();
                            i = this.fetchVPNInfo;
                        } else if (i5 == 2) {
                            i += 2;
                            iAhwBna = valueOf(iAhwBna, AhwBna(i4));
                        } else if (i5 != 3) {
                            if (i5 == 4) {
                                i4 = i + 4;
                                int iOLrzqt = OLrzqt(iAhwBna, AhwBna(i4), AhwBna(i + 2), AhwBna(i + 3));
                                int i6 = iDjBIcL + 1;
                                cArrAYXKKw[iDjBIcL] = (char) ((iOLrzqt >> 10) | 55296);
                                if (i6 >= cArrAYXKKw.length) {
                                    cArrAYXKKw = this.zsXlph.gEmmrt();
                                    iDjBIcL = 0;
                                } else {
                                    iDjBIcL = i6;
                                }
                                iAhwBna = (iOLrzqt & 1023) | Utf8.LOG_SURROGATE_HEADER;
                            } else if (iAhwBna < 32) {
                                EZpvd(iAhwBna, "string value");
                            } else {
                                AkhnZx(iAhwBna);
                            }
                            i = i4;
                        } else {
                            iAhwBna = AEQbTJ(iAhwBna, AhwBna(i4), AhwBna(i + 2));
                            i += 3;
                        }
                        if (iDjBIcL >= cArrAYXKKw.length) {
                            cArrAYXKKw = this.zsXlph.gEmmrt();
                        } else {
                            i3 = iDjBIcL;
                        }
                        iDjBIcL = i3 + 1;
                        cArrAYXKKw[i3] = (char) iAhwBna;
                    }
                }
            }
        }
        this.fetchVPNInfo = i;
        this.fFgQHt = 45;
        this.zsXlph.copydefault(iDjBIcL);
        com.fasterxml.jackson.core.JsonToken jsonToken2 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE;
        this.QVAiDq = jsonToken2;
        return jsonToken2;
    }

    public final boolean EZpvd(int i, int i2, boolean z) throws java.io.IOException {
        if (i2 == 1) {
            int iAhwBna = AhwBna(0, -1);
            if (iAhwBna < 0) {
                this.fFgQHt = 41;
                return false;
            }
            this.zsXlph.KWHzl((char) iAhwBna);
            return true;
        }
        if (i2 == 2) {
            if (z) {
                this.zsXlph.KWHzl((char) valueOf(i, ffGIBT()));
                return true;
            }
            this.fFgQHt = 42;
            this.flVtFt = i;
            return false;
        }
        if (i2 == 3) {
            int i3 = i & 15;
            if (z) {
                return EZpvd(i3, 1, ffGIBT());
            }
            this.fFgQHt = 43;
            this.flVtFt = i3;
            this.gasjUx = 1;
            return false;
        }
        if (i2 != 4) {
            if (i < 32) {
                EZpvd(i, "string value");
            } else {
                AkhnZx(i);
            }
            this.zsXlph.KWHzl((char) i);
            return true;
        }
        int i4 = i & 7;
        if (z) {
            return copydefault(i4, 1, ffGIBT());
        }
        this.flVtFt = i4;
        this.gasjUx = 1;
        this.fFgQHt = 44;
        return false;
    }

    public final boolean EZpvd(int i, int i2, int i3) throws java.io.IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                gEmmrt(i3 & 255, this.fetchVPNInfo);
            }
            i = (i << 6) | (i3 & 63);
            if (this.fetchVPNInfo >= this.isConnected) {
                this.fFgQHt = 43;
                this.flVtFt = i;
                this.gasjUx = 2;
                return false;
            }
            i3 = ffGIBT();
        }
        if ((i3 & 192) != 128) {
            gEmmrt(i3 & 255, this.fetchVPNInfo);
        }
        this.zsXlph.KWHzl((char) ((i << 6) | (i3 & 63)));
        return true;
    }

    public final boolean copydefault(int i, int i2, int i3) throws java.io.IOException {
        if (i2 == 1) {
            if ((i3 & 192) != 128) {
                gEmmrt(i3 & 255, this.fetchVPNInfo);
            }
            i = (i << 6) | (i3 & 63);
            if (this.fetchVPNInfo >= this.isConnected) {
                this.fFgQHt = 44;
                this.flVtFt = i;
                this.gasjUx = 2;
                return false;
            }
            i3 = ffGIBT();
            i2 = 2;
        }
        if (i2 == 2) {
            if ((i3 & 192) != 128) {
                gEmmrt(i3 & 255, this.fetchVPNInfo);
            }
            i = (i << 6) | (i3 & 63);
            if (this.fetchVPNInfo >= this.isConnected) {
                this.fFgQHt = 44;
                this.flVtFt = i;
                this.gasjUx = 3;
                return false;
            }
            i3 = ffGIBT();
        }
        if ((i3 & 192) != 128) {
            gEmmrt(i3 & 255, this.fetchVPNInfo);
        }
        int i4 = ((i << 6) | (i3 & 63)) - 65536;
        this.zsXlph.KWHzl((char) ((i4 >> 10) | 55296));
        this.zsXlph.KWHzl((char) ((i4 & 1023) | Utf8.LOG_SURROGATE_HEADER));
        return true;
    }

    public final int QkdxfA() throws java.io.IOException {
        if (this.isConnected - this.fetchVPNInfo < 5) {
            return AhwBna(0, -1);
        }
        return hBpjJd();
    }

    public final int hBpjJd() throws java.io.IOException {
        int iKWHzl;
        int iKWHzl2;
        int iKWHzl3;
        byte bFfGIBT = ffGIBT();
        if (bFfGIBT == 34 || bFfGIBT == 47 || bFfGIBT == 92) {
            return (char) bFfGIBT;
        }
        if (bFfGIBT == 98) {
            return 8;
        }
        if (bFfGIBT == 102) {
            return 12;
        }
        if (bFfGIBT == 110) {
            return 10;
        }
        if (bFfGIBT == 114) {
            return 13;
        }
        if (bFfGIBT == 116) {
            return 9;
        }
        if (bFfGIBT != 117) {
            return copydefault((char) bFfGIBT);
        }
        byte bFfGIBT2 = ffGIBT();
        int iKWHzl4 = C5521Ux.KWHzl(bFfGIBT2);
        if (iKWHzl4 >= 0 && (iKWHzl = C5521Ux.KWHzl((bFfGIBT2 = ffGIBT()))) >= 0 && (iKWHzl2 = C5521Ux.KWHzl((bFfGIBT2 = ffGIBT()))) >= 0 && (iKWHzl3 = C5521Ux.KWHzl((bFfGIBT2 = ffGIBT()))) >= 0) {
            return (((((iKWHzl4 << 4) | iKWHzl) << 4) | iKWHzl2) << 4) | iKWHzl3;
        }
        OLrzqt(bFfGIBT2 & UnsignedBytes.MAX_VALUE, "expected a hex-digit for character escape sequence");
        return -1;
    }

    public final int valueOf(int i, int i2) throws java.io.IOException {
        if ((i2 & 192) != 128) {
            gEmmrt(i2 & 255, this.fetchVPNInfo);
        }
        return ((i & 31) << 6) | (i2 & 63);
    }

    public final int AEQbTJ(int i, int i2, int i3) throws java.io.IOException {
        if ((i2 & 192) != 128) {
            gEmmrt(i2 & 255, this.fetchVPNInfo);
        }
        if ((i3 & 192) != 128) {
            gEmmrt(i3 & 255, this.fetchVPNInfo);
        }
        return ((((i & 15) << 6) | (i2 & 63)) << 6) | (i3 & 63);
    }

    public final int OLrzqt(int i, int i2, int i3, int i4) throws java.io.IOException {
        if ((i2 & 192) != 128) {
            gEmmrt(i2 & 255, this.fetchVPNInfo);
        }
        if ((i3 & 192) != 128) {
            gEmmrt(i3 & 255, this.fetchVPNInfo);
        }
        if ((i4 & 192) != 128) {
            gEmmrt(i4 & 255, this.fetchVPNInfo);
        }
        return (((((((i & 7) << 6) | (i2 & 63)) << 6) | (i3 & 63)) << 6) | (i4 & 63)) - 65536;
    }
}
