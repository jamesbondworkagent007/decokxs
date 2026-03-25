package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.filter.TokenFilter;
import java.math.BigDecimal;

/* JADX INFO: renamed from: o.Us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5516Us extends C5545Vv {
    public TokenFilter.Inclusion AYXKKw;
    public com.fasterxml.jackson.core.JsonToken AhwBna;
    public TokenFilter DbNXlk;
    public com.fasterxml.jackson.core.JsonToken KWHzl;
    public boolean OLrzqt;
    public C5512Up djBIcL;
    public int fetchVPNInfo;
    public C5512Up gEmmrt;
    public TokenFilter valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken DbNXlk() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public void OLrzqt() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.KWHzl;
        if (jsonToken != null) {
            this.AhwBna = jsonToken;
            this.KWHzl = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public boolean QOLQEE() {
        return this.KWHzl != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public final boolean copydefault(com.fasterxml.jackson.core.JsonToken jsonToken) {
        return this.KWHzl == jsonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5503Ug djSkpj() {
        C5512Up c5512Up = this.gEmmrt;
        return c5512Up != null ? c5512Up : this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dxcTrN() throws java.io.IOException {
        int i = this.fetchVPNInfo;
        if (i != 0 && !this.OLrzqt) {
            return false;
        }
        this.fetchVPNInfo = i + 1;
        return true;
    }

    public C5516Us(JsonParser jsonParser, TokenFilter tokenFilter, TokenFilter.Inclusion inclusion, boolean z) {
        super(jsonParser);
        this.DbNXlk = tokenFilter;
        this.valueOf = tokenFilter;
        this.djBIcL = C5512Up.copydefault(tokenFilter);
        this.AYXKKw = inclusion;
        this.OLrzqt = z;
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    @java.lang.Deprecated
    public final int fIwbmz() {
        return valueOf();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public final int valueOf() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.KWHzl;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public boolean OLrzqt(int i) {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.KWHzl;
        return jsonToken == null ? i == 0 : jsonToken.id() == i;
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public boolean RJOkX() {
        return this.KWHzl == com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public boolean QVAiDq() {
        return this.KWHzl == com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public JsonLocation fetchVPNInfo() {
        return this.AkhnZx.fetchVPNInfo();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public AbstractC5503Ug wlaJM() {
        return djSkpj();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.lang.String isConnected() throws java.io.IOException {
        AbstractC5503Ug abstractC5503UgDjSkpj = djSkpj();
        com.fasterxml.jackson.core.JsonToken jsonToken = this.KWHzl;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT || jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            AbstractC5503Ug abstractC5503UgAEQbTJ = abstractC5503UgDjSkpj.AEQbTJ();
            if (abstractC5503UgAEQbTJ == null) {
                return null;
            }
            return abstractC5503UgAEQbTJ.copydefault();
        }
        return abstractC5503UgDjSkpj.copydefault();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.lang.String KWHzl() throws java.io.IOException {
        AbstractC5503Ug abstractC5503UgDjSkpj = djSkpj();
        com.fasterxml.jackson.core.JsonToken jsonToken = this.KWHzl;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT || jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            AbstractC5503Ug abstractC5503UgAEQbTJ = abstractC5503UgDjSkpj.AEQbTJ();
            if (abstractC5503UgAEQbTJ == null) {
                return null;
            }
            return abstractC5503UgAEQbTJ.copydefault();
        }
        return abstractC5503UgDjSkpj.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x019d  */
    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
        TokenFilter tokenFilterEZpvd;
        com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ;
        TokenFilter tokenFilterEZpvd2;
        com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ2;
        TokenFilter tokenFilterAEQbTJ;
        com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ3;
        TokenFilter tokenFilterEZpvd3;
        com.fasterxml.jackson.core.JsonToken jsonToken;
        if (!this.OLrzqt && (jsonToken = this.KWHzl) != null && this.gEmmrt == null && jsonToken.isScalarValue() && !this.djBIcL.AkhnZx() && this.AYXKKw == TokenFilter.Inclusion.ONLY_INCLUDE_ALL && this.valueOf == TokenFilter.KWHzl) {
            this.KWHzl = null;
            return null;
        }
        C5512Up c5512UpOLrzqt = this.gEmmrt;
        if (c5512UpOLrzqt != null) {
            do {
                com.fasterxml.jackson.core.JsonToken jsonTokenFARcdN = c5512UpOLrzqt.fARcdN();
                if (jsonTokenFARcdN != null) {
                    this.KWHzl = jsonTokenFARcdN;
                    return jsonTokenFARcdN;
                }
                C5512Up c5512Up = this.djBIcL;
                if (c5512UpOLrzqt == c5512Up) {
                    this.gEmmrt = null;
                    if (c5512UpOLrzqt.valueOf()) {
                        com.fasterxml.jackson.core.JsonToken jsonTokenDbNXlk = this.AkhnZx.DbNXlk();
                        this.KWHzl = jsonTokenDbNXlk;
                        if (jsonTokenDbNXlk == com.fasterxml.jackson.core.JsonToken.END_ARRAY) {
                            C5512Up c5512UpAEQbTJ = this.djBIcL.AEQbTJ();
                            this.djBIcL = c5512UpAEQbTJ;
                            this.valueOf = c5512UpAEQbTJ.fetchVPNInfo();
                        }
                        return jsonTokenDbNXlk;
                    }
                    com.fasterxml.jackson.core.JsonToken jsonTokenDjBIcL = this.AkhnZx.djBIcL();
                    if (jsonTokenDjBIcL == com.fasterxml.jackson.core.JsonToken.END_OBJECT) {
                        C5512Up c5512UpAEQbTJ2 = this.djBIcL.AEQbTJ();
                        this.djBIcL = c5512UpAEQbTJ2;
                        this.valueOf = c5512UpAEQbTJ2.fetchVPNInfo();
                    }
                    if (jsonTokenDjBIcL != com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
                        this.KWHzl = jsonTokenDjBIcL;
                        return jsonTokenDjBIcL;
                    }
                } else {
                    c5512UpOLrzqt = c5512Up.OLrzqt(c5512UpOLrzqt);
                    this.gEmmrt = c5512UpOLrzqt;
                }
            } while (c5512UpOLrzqt != null);
            throw EZpvd("Unexpected problem: chain of filtered context broken");
        }
        com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = this.AkhnZx.RcXXUw();
        if (jsonTokenRcXXUw == null) {
            this.KWHzl = jsonTokenRcXXUw;
            return jsonTokenRcXXUw;
        }
        int iId = jsonTokenRcXXUw.id();
        if (iId == 1) {
            TokenFilter tokenFilter = this.valueOf;
            TokenFilter tokenFilter2 = TokenFilter.KWHzl;
            if (tokenFilter == tokenFilter2) {
                this.djBIcL = this.djBIcL.OLrzqt(tokenFilter, true);
                this.KWHzl = jsonTokenRcXXUw;
                return jsonTokenRcXXUw;
            }
            if (tokenFilter == null || (tokenFilterEZpvd = this.djBIcL.EZpvd(tokenFilter)) == null) {
                this.AkhnZx.UeEOUB();
            } else {
                if (tokenFilterEZpvd != tokenFilter2) {
                    tokenFilterEZpvd = tokenFilterEZpvd.KWHzl();
                }
                this.valueOf = tokenFilterEZpvd;
                if (tokenFilterEZpvd == tokenFilter2) {
                    this.djBIcL = this.djBIcL.OLrzqt(tokenFilterEZpvd, true);
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilterEZpvd != null && this.AYXKKw == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.djBIcL = this.djBIcL.OLrzqt(tokenFilterEZpvd, true);
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                C5512Up c5512UpOLrzqt2 = this.djBIcL.OLrzqt(tokenFilterEZpvd, false);
                this.djBIcL = c5512UpOLrzqt2;
                if (this.AYXKKw == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenAEQbTJ = AEQbTJ(c5512UpOLrzqt2)) != null) {
                    this.KWHzl = jsonTokenAEQbTJ;
                    return jsonTokenAEQbTJ;
                }
            }
        } else if (iId == 2) {
            boolean zAkhnZx = this.djBIcL.AkhnZx();
            TokenFilter tokenFilterFetchVPNInfo = this.djBIcL.fetchVPNInfo();
            if (tokenFilterFetchVPNInfo != null && tokenFilterFetchVPNInfo != TokenFilter.KWHzl) {
                tokenFilterFetchVPNInfo.copydefault();
            }
            C5512Up c5512UpAEQbTJ3 = this.djBIcL.AEQbTJ();
            this.djBIcL = c5512UpAEQbTJ3;
            this.valueOf = c5512UpAEQbTJ3.fetchVPNInfo();
            if (zAkhnZx) {
                this.KWHzl = jsonTokenRcXXUw;
                return jsonTokenRcXXUw;
            }
        } else if (iId == 3) {
            TokenFilter tokenFilter3 = this.valueOf;
            TokenFilter tokenFilter4 = TokenFilter.KWHzl;
            if (tokenFilter3 == tokenFilter4) {
                this.djBIcL = this.djBIcL.copydefault(tokenFilter3, true);
                this.KWHzl = jsonTokenRcXXUw;
                return jsonTokenRcXXUw;
            }
            if (tokenFilter3 == null || (tokenFilterEZpvd2 = this.djBIcL.EZpvd(tokenFilter3)) == null) {
                this.AkhnZx.UeEOUB();
            } else {
                if (tokenFilterEZpvd2 != tokenFilter4) {
                    tokenFilterEZpvd2 = tokenFilterEZpvd2.EZpvd();
                }
                this.valueOf = tokenFilterEZpvd2;
                if (tokenFilterEZpvd2 == tokenFilter4) {
                    this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd2, true);
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilterEZpvd2 != null && this.AYXKKw == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                    this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd2, true);
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                C5512Up c5512UpCopydefault = this.djBIcL.copydefault(tokenFilterEZpvd2, false);
                this.djBIcL = c5512UpCopydefault;
                if (this.AYXKKw == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenAEQbTJ2 = AEQbTJ(c5512UpCopydefault)) != null) {
                    this.KWHzl = jsonTokenAEQbTJ2;
                    return jsonTokenAEQbTJ2;
                }
            }
        } else if (iId != 4) {
            if (iId == 5) {
                java.lang.String strIsConnected = this.AkhnZx.isConnected();
                TokenFilter tokenFilterOLrzqt = this.djBIcL.OLrzqt(strIsConnected);
                TokenFilter tokenFilter5 = TokenFilter.KWHzl;
                if (tokenFilterOLrzqt == tokenFilter5) {
                    this.valueOf = tokenFilterOLrzqt;
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilterOLrzqt == null || (tokenFilterAEQbTJ = tokenFilterOLrzqt.AEQbTJ(strIsConnected)) == null) {
                    this.AkhnZx.RcXXUw();
                    this.AkhnZx.UeEOUB();
                } else {
                    this.valueOf = tokenFilterAEQbTJ;
                    if (tokenFilterAEQbTJ == tokenFilter5) {
                        if (dxcTrN()) {
                            if (this.AYXKKw == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                this.KWHzl = jsonTokenRcXXUw;
                                return jsonTokenRcXXUw;
                            }
                        } else {
                            this.AkhnZx.RcXXUw();
                            this.AkhnZx.UeEOUB();
                        }
                    }
                    if (this.AYXKKw != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenAEQbTJ3 = AEQbTJ(this.djBIcL)) != null) {
                        this.KWHzl = jsonTokenAEQbTJ3;
                        return jsonTokenAEQbTJ3;
                    }
                }
            } else {
                TokenFilter tokenFilter6 = this.valueOf;
                TokenFilter tokenFilter7 = TokenFilter.KWHzl;
                if (tokenFilter6 == tokenFilter7) {
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilter6 != null && (((tokenFilterEZpvd3 = this.djBIcL.EZpvd(tokenFilter6)) == tokenFilter7 || (tokenFilterEZpvd3 != null && tokenFilterEZpvd3.EZpvd(this.AkhnZx))) && dxcTrN())) {
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
            }
        }
        return fZBcTu();
    }

    public final com.fasterxml.jackson.core.JsonToken fZBcTu() throws java.io.IOException {
        TokenFilter tokenFilterEZpvd;
        com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ;
        com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ2;
        com.fasterxml.jackson.core.JsonToken jsonTokenAEQbTJ3;
        while (true) {
            com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = this.AkhnZx.RcXXUw();
            if (jsonTokenRcXXUw == null) {
                this.KWHzl = jsonTokenRcXXUw;
                return jsonTokenRcXXUw;
            }
            int iId = jsonTokenRcXXUw.id();
            if (iId == 1) {
                TokenFilter tokenFilter = this.valueOf;
                TokenFilter tokenFilter2 = TokenFilter.KWHzl;
                if (tokenFilter == tokenFilter2) {
                    this.djBIcL = this.djBIcL.OLrzqt(tokenFilter, true);
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilter == null) {
                    this.AkhnZx.UeEOUB();
                } else {
                    TokenFilter tokenFilterEZpvd2 = this.djBIcL.EZpvd(tokenFilter);
                    if (tokenFilterEZpvd2 == null) {
                        this.AkhnZx.UeEOUB();
                    } else {
                        if (tokenFilterEZpvd2 != tokenFilter2) {
                            tokenFilterEZpvd2 = tokenFilterEZpvd2.KWHzl();
                        }
                        this.valueOf = tokenFilterEZpvd2;
                        if (tokenFilterEZpvd2 == tokenFilter2) {
                            this.djBIcL = this.djBIcL.OLrzqt(tokenFilterEZpvd2, true);
                            this.KWHzl = jsonTokenRcXXUw;
                            return jsonTokenRcXXUw;
                        }
                        if (tokenFilterEZpvd2 != null && this.AYXKKw == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.djBIcL = this.djBIcL.OLrzqt(tokenFilterEZpvd2, true);
                            this.KWHzl = jsonTokenRcXXUw;
                            return jsonTokenRcXXUw;
                        }
                        C5512Up c5512UpOLrzqt = this.djBIcL.OLrzqt(tokenFilterEZpvd2, false);
                        this.djBIcL = c5512UpOLrzqt;
                        if (this.AYXKKw == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenAEQbTJ3 = AEQbTJ(c5512UpOLrzqt)) != null) {
                            this.KWHzl = jsonTokenAEQbTJ3;
                            return jsonTokenAEQbTJ3;
                        }
                    }
                }
            } else if (iId == 2) {
                boolean zAkhnZx = this.djBIcL.AkhnZx();
                TokenFilter tokenFilterFetchVPNInfo = this.djBIcL.fetchVPNInfo();
                if (tokenFilterFetchVPNInfo != null && tokenFilterFetchVPNInfo != TokenFilter.KWHzl) {
                    boolean zAEQbTJ = tokenFilterFetchVPNInfo.AEQbTJ(this.djBIcL.gEmmrt());
                    tokenFilterFetchVPNInfo.OLrzqt();
                    if (zAEQbTJ) {
                        return KWHzl(this.djBIcL);
                    }
                }
                C5512Up c5512UpAEQbTJ = this.djBIcL.AEQbTJ();
                this.djBIcL = c5512UpAEQbTJ;
                this.valueOf = c5512UpAEQbTJ.fetchVPNInfo();
                if (zAkhnZx) {
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
            } else if (iId == 3) {
                TokenFilter tokenFilter3 = this.valueOf;
                TokenFilter tokenFilter4 = TokenFilter.KWHzl;
                if (tokenFilter3 == tokenFilter4) {
                    this.djBIcL = this.djBIcL.copydefault(tokenFilter3, true);
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilter3 == null) {
                    this.AkhnZx.UeEOUB();
                } else {
                    TokenFilter tokenFilterEZpvd3 = this.djBIcL.EZpvd(tokenFilter3);
                    if (tokenFilterEZpvd3 == null) {
                        this.AkhnZx.UeEOUB();
                    } else {
                        if (tokenFilterEZpvd3 != tokenFilter4) {
                            tokenFilterEZpvd3 = tokenFilterEZpvd3.EZpvd();
                        }
                        this.valueOf = tokenFilterEZpvd3;
                        if (tokenFilterEZpvd3 == tokenFilter4) {
                            this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd3, true);
                            this.KWHzl = jsonTokenRcXXUw;
                            return jsonTokenRcXXUw;
                        }
                        if (tokenFilterEZpvd3 != null && this.AYXKKw == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd3, true);
                            this.KWHzl = jsonTokenRcXXUw;
                            return jsonTokenRcXXUw;
                        }
                        C5512Up c5512UpCopydefault = this.djBIcL.copydefault(tokenFilterEZpvd3, false);
                        this.djBIcL = c5512UpCopydefault;
                        if (this.AYXKKw == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH && (jsonTokenAEQbTJ2 = AEQbTJ(c5512UpCopydefault)) != null) {
                            this.KWHzl = jsonTokenAEQbTJ2;
                            return jsonTokenAEQbTJ2;
                        }
                    }
                }
            } else if (iId == 4) {
                boolean zAkhnZx2 = this.djBIcL.AkhnZx();
                TokenFilter tokenFilterFetchVPNInfo2 = this.djBIcL.fetchVPNInfo();
                if (tokenFilterFetchVPNInfo2 != null && tokenFilterFetchVPNInfo2 != TokenFilter.KWHzl) {
                    boolean zAEQbTJ2 = tokenFilterFetchVPNInfo2.AEQbTJ(this.djBIcL.AhwBna());
                    tokenFilterFetchVPNInfo2.copydefault();
                    if (zAEQbTJ2) {
                        return KWHzl(this.djBIcL);
                    }
                }
                C5512Up c5512UpAEQbTJ2 = this.djBIcL.AEQbTJ();
                this.djBIcL = c5512UpAEQbTJ2;
                this.valueOf = c5512UpAEQbTJ2.fetchVPNInfo();
                if (zAkhnZx2) {
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
            } else if (iId == 5) {
                java.lang.String strIsConnected = this.AkhnZx.isConnected();
                TokenFilter tokenFilterOLrzqt = this.djBIcL.OLrzqt(strIsConnected);
                TokenFilter tokenFilter5 = TokenFilter.KWHzl;
                if (tokenFilterOLrzqt == tokenFilter5) {
                    this.valueOf = tokenFilterOLrzqt;
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilterOLrzqt == null) {
                    this.AkhnZx.RcXXUw();
                    this.AkhnZx.UeEOUB();
                } else {
                    TokenFilter tokenFilterAEQbTJ = tokenFilterOLrzqt.AEQbTJ(strIsConnected);
                    if (tokenFilterAEQbTJ == null) {
                        this.AkhnZx.RcXXUw();
                        this.AkhnZx.UeEOUB();
                    } else {
                        this.valueOf = tokenFilterAEQbTJ;
                        if (tokenFilterAEQbTJ == tokenFilter5) {
                            if (dxcTrN()) {
                                if (this.AYXKKw == TokenFilter.Inclusion.INCLUDE_ALL_AND_PATH) {
                                    this.KWHzl = jsonTokenRcXXUw;
                                    return jsonTokenRcXXUw;
                                }
                            } else {
                                this.AkhnZx.RcXXUw();
                                this.AkhnZx.UeEOUB();
                            }
                        } else if (this.AYXKKw != TokenFilter.Inclusion.ONLY_INCLUDE_ALL && (jsonTokenAEQbTJ = AEQbTJ(this.djBIcL)) != null) {
                            this.KWHzl = jsonTokenAEQbTJ;
                            return jsonTokenAEQbTJ;
                        }
                    }
                }
            } else {
                TokenFilter tokenFilter6 = this.valueOf;
                TokenFilter tokenFilter7 = TokenFilter.KWHzl;
                if (tokenFilter6 == tokenFilter7) {
                    this.KWHzl = jsonTokenRcXXUw;
                    return jsonTokenRcXXUw;
                }
                if (tokenFilter6 != null && ((tokenFilterEZpvd = this.djBIcL.EZpvd(tokenFilter6)) == tokenFilter7 || (tokenFilterEZpvd != null && tokenFilterEZpvd.EZpvd(this.AkhnZx)))) {
                    if (dxcTrN()) {
                        this.KWHzl = jsonTokenRcXXUw;
                        return jsonTokenRcXXUw;
                    }
                }
            }
        }
    }

    public final com.fasterxml.jackson.core.JsonToken AEQbTJ(C5512Up c5512Up) throws java.io.IOException {
        TokenFilter tokenFilterEZpvd;
        while (true) {
            com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = this.AkhnZx.RcXXUw();
            if (jsonTokenRcXXUw == null) {
                return jsonTokenRcXXUw;
            }
            int iId = jsonTokenRcXXUw.id();
            boolean z = false;
            if (iId != 1) {
                if (iId == 2) {
                    TokenFilter tokenFilterFetchVPNInfo = this.djBIcL.fetchVPNInfo();
                    if (tokenFilterFetchVPNInfo != null && tokenFilterFetchVPNInfo != TokenFilter.KWHzl) {
                        boolean zCopydefault = tokenFilterFetchVPNInfo.copydefault(this.djBIcL.gEmmrt());
                        tokenFilterFetchVPNInfo.OLrzqt();
                        if (zCopydefault) {
                            C5512Up c5512Up2 = this.djBIcL;
                            C5512Up c5512Up3 = c5512Up2.valueOf;
                            c5512Up2.OLrzqt = c5512Up3 != null ? c5512Up3.OLrzqt : null;
                            c5512Up2.djBIcL = false;
                            return KWHzl(c5512Up);
                        }
                    }
                    C5512Up c5512Up4 = this.djBIcL;
                    boolean z2 = c5512Up4 == c5512Up;
                    if (z2 && c5512Up4.AkhnZx()) {
                        z = true;
                    }
                    C5512Up c5512UpAEQbTJ = this.djBIcL.AEQbTJ();
                    this.djBIcL = c5512UpAEQbTJ;
                    this.valueOf = c5512UpAEQbTJ.fetchVPNInfo();
                    if (z) {
                        return jsonTokenRcXXUw;
                    }
                    if (z2) {
                        return null;
                    }
                } else if (iId == 3) {
                    TokenFilter tokenFilterEZpvd2 = this.djBIcL.EZpvd(this.valueOf);
                    if (tokenFilterEZpvd2 == null) {
                        this.AkhnZx.UeEOUB();
                    } else {
                        TokenFilter tokenFilter = TokenFilter.KWHzl;
                        if (tokenFilterEZpvd2 != tokenFilter) {
                            tokenFilterEZpvd2 = tokenFilterEZpvd2.EZpvd();
                        }
                        this.valueOf = tokenFilterEZpvd2;
                        if (tokenFilterEZpvd2 == tokenFilter) {
                            this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd2, true);
                            return KWHzl(c5512Up);
                        }
                        if (tokenFilterEZpvd2 != null && this.AYXKKw == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd2, true);
                            return KWHzl(c5512Up);
                        }
                        this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd2, false);
                    }
                } else if (iId == 4) {
                    TokenFilter tokenFilterFetchVPNInfo2 = this.djBIcL.fetchVPNInfo();
                    if (tokenFilterFetchVPNInfo2 != null && tokenFilterFetchVPNInfo2 != TokenFilter.KWHzl) {
                        boolean zAEQbTJ = tokenFilterFetchVPNInfo2.AEQbTJ(this.djBIcL.AhwBna());
                        tokenFilterFetchVPNInfo2.copydefault();
                        if (zAEQbTJ) {
                            return KWHzl(c5512Up);
                        }
                    }
                    C5512Up c5512Up5 = this.djBIcL;
                    boolean z3 = c5512Up5 == c5512Up;
                    if (z3 && c5512Up5.AkhnZx()) {
                        z = true;
                    }
                    C5512Up c5512UpAEQbTJ2 = this.djBIcL.AEQbTJ();
                    this.djBIcL = c5512UpAEQbTJ2;
                    this.valueOf = c5512UpAEQbTJ2.fetchVPNInfo();
                    if (z) {
                        return jsonTokenRcXXUw;
                    }
                    if (z3) {
                        return null;
                    }
                } else if (iId == 5) {
                    java.lang.String strIsConnected = this.AkhnZx.isConnected();
                    TokenFilter tokenFilterOLrzqt = this.djBIcL.OLrzqt(strIsConnected);
                    TokenFilter tokenFilter2 = TokenFilter.KWHzl;
                    if (tokenFilterOLrzqt == tokenFilter2) {
                        this.valueOf = tokenFilterOLrzqt;
                        return KWHzl(c5512Up);
                    }
                    if (tokenFilterOLrzqt == null) {
                        this.AkhnZx.RcXXUw();
                        this.AkhnZx.UeEOUB();
                    } else {
                        TokenFilter tokenFilterAEQbTJ = tokenFilterOLrzqt.AEQbTJ(strIsConnected);
                        if (tokenFilterAEQbTJ == null) {
                            this.AkhnZx.RcXXUw();
                            this.AkhnZx.UeEOUB();
                        } else {
                            this.valueOf = tokenFilterAEQbTJ;
                            if (tokenFilterAEQbTJ != tokenFilter2) {
                                continue;
                            } else {
                                if (dxcTrN()) {
                                    return KWHzl(c5512Up);
                                }
                                this.valueOf = this.djBIcL.OLrzqt(strIsConnected);
                            }
                        }
                    }
                } else {
                    TokenFilter tokenFilter3 = this.valueOf;
                    TokenFilter tokenFilter4 = TokenFilter.KWHzl;
                    if (tokenFilter3 == tokenFilter4) {
                        return KWHzl(c5512Up);
                    }
                    if (tokenFilter3 != null && ((tokenFilterEZpvd = this.djBIcL.EZpvd(tokenFilter3)) == tokenFilter4 || (tokenFilterEZpvd != null && tokenFilterEZpvd.EZpvd(this.AkhnZx)))) {
                        if (dxcTrN()) {
                            return KWHzl(c5512Up);
                        }
                    }
                }
            } else {
                TokenFilter tokenFilter5 = this.valueOf;
                TokenFilter tokenFilter6 = TokenFilter.KWHzl;
                if (tokenFilter5 == tokenFilter6) {
                    this.djBIcL = this.djBIcL.OLrzqt(tokenFilter5, true);
                    return jsonTokenRcXXUw;
                }
                if (tokenFilter5 == null) {
                    this.AkhnZx.UeEOUB();
                } else {
                    TokenFilter tokenFilterEZpvd3 = this.djBIcL.EZpvd(tokenFilter5);
                    if (tokenFilterEZpvd3 == null) {
                        this.AkhnZx.UeEOUB();
                    } else {
                        if (tokenFilterEZpvd3 != tokenFilter6) {
                            tokenFilterEZpvd3 = tokenFilterEZpvd3.KWHzl();
                        }
                        this.valueOf = tokenFilterEZpvd3;
                        if (tokenFilterEZpvd3 == tokenFilter6) {
                            this.djBIcL = this.djBIcL.OLrzqt(tokenFilterEZpvd3, true);
                            return KWHzl(c5512Up);
                        }
                        if (tokenFilterEZpvd3 != null && this.AYXKKw == TokenFilter.Inclusion.INCLUDE_NON_NULL) {
                            this.djBIcL = this.djBIcL.copydefault(tokenFilterEZpvd3, true);
                            return KWHzl(c5512Up);
                        }
                        this.djBIcL = this.djBIcL.OLrzqt(tokenFilterEZpvd3, false);
                    }
                }
            }
        }
    }

    public final com.fasterxml.jackson.core.JsonToken KWHzl(C5512Up c5512Up) throws java.io.IOException {
        this.gEmmrt = c5512Up;
        com.fasterxml.jackson.core.JsonToken jsonTokenFARcdN = c5512Up.fARcdN();
        if (jsonTokenFARcdN != null) {
            return jsonTokenFARcdN;
        }
        while (c5512Up != this.djBIcL) {
            c5512Up = this.gEmmrt.OLrzqt(c5512Up);
            this.gEmmrt = c5512Up;
            if (c5512Up == null) {
                throw EZpvd("Unexpected problem: chain of filtered context broken");
            }
            com.fasterxml.jackson.core.JsonToken jsonTokenFARcdN2 = c5512Up.fARcdN();
            if (jsonTokenFARcdN2 != null) {
                return jsonTokenFARcdN2;
            }
        }
        throw EZpvd("Internal error: failed to locate expected buffered tokens");
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public JsonParser UeEOUB() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.KWHzl;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.START_OBJECT && jsonToken != com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = RcXXUw();
            if (jsonTokenRcXXUw == null) {
                return this;
            }
            if (jsonTokenRcXXUw.isStructStart()) {
                i++;
            } else if (jsonTokenRcXXUw.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.lang.String zLjUOn() throws java.io.IOException {
        if (this.KWHzl == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return KWHzl();
        }
        return this.AkhnZx.zLjUOn();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public boolean DTwDnp() {
        if (this.KWHzl == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return false;
        }
        return this.AkhnZx.DTwDnp();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public char[] sSMYrx() throws java.io.IOException {
        if (this.KWHzl == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return KWHzl().toCharArray();
        }
        return this.AkhnZx.sSMYrx();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public int AwvSrB() throws java.io.IOException {
        if (this.KWHzl == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return KWHzl().length();
        }
        return this.AkhnZx.AwvSrB();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public int zuBGHE() throws java.io.IOException {
        if (this.KWHzl == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return 0;
        }
        return this.AkhnZx.zuBGHE();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.math.BigInteger gEmmrt() throws java.io.IOException {
        return this.AkhnZx.gEmmrt();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public boolean AYXKKw() throws java.io.IOException {
        return this.AkhnZx.AYXKKw();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public byte AkhnZx() throws java.io.IOException {
        return this.AkhnZx.AkhnZx();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public short zsXlph() throws java.io.IOException {
        return this.AkhnZx.zsXlph();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public BigDecimal fJNWhG() throws java.io.IOException {
        return this.AkhnZx.fJNWhG();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public double fARcdN() throws java.io.IOException {
        return this.AkhnZx.fARcdN();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public float ejfBZ() throws java.io.IOException {
        return this.AkhnZx.ejfBZ();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public int getFieldNames() throws java.io.IOException {
        return this.AkhnZx.getFieldNames();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public long getNewProxyInstance() throws java.io.IOException {
        return this.AkhnZx.getNewProxyInstance();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType uzCIH() throws java.io.IOException {
        return this.AkhnZx.uzCIH();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.lang.Number hDKMBd() throws java.io.IOException {
        return this.AkhnZx.hDKMBd();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public int OcIXYQ() throws java.io.IOException {
        return this.AkhnZx.OcIXYQ();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public int AEQbTJ(int i) throws java.io.IOException {
        return this.AkhnZx.AEQbTJ(i);
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public long ORxRYg() throws java.io.IOException {
        return this.AkhnZx.ORxRYg();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public long AEQbTJ(long j) throws java.io.IOException {
        return this.AkhnZx.AEQbTJ(j);
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.lang.String QKVWgx() throws java.io.IOException {
        if (this.KWHzl == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return KWHzl();
        }
        return this.AkhnZx.QKVWgx();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.lang.String AEQbTJ(java.lang.String str) throws java.io.IOException {
        if (this.KWHzl == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return KWHzl();
        }
        return this.AkhnZx.AEQbTJ(str);
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public java.lang.Object AuCTel() throws java.io.IOException {
        return this.AkhnZx.AuCTel();
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public byte[] copydefault(Base64Variant base64Variant) throws java.io.IOException {
        return this.AkhnZx.copydefault(base64Variant);
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public int KWHzl(Base64Variant base64Variant, java.io.OutputStream outputStream) throws java.io.IOException {
        return this.AkhnZx.KWHzl(base64Variant, outputStream);
    }

    @Override // o.C5545Vv, com.fasterxml.jackson.core.JsonParser
    public JsonLocation gHZMYf() {
        return this.AkhnZx.gHZMYf();
    }
}
