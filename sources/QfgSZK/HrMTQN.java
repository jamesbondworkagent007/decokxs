package QfgSZK;

import QfgSZK.HJWChP;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.lexisnexisrisk.threatmetrix.TMXStatusCode;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class HrMTQN {
    private static final HrMTQN UcUFhW = new HrMTQN();
    public static int _Ae = 3105;
    public static int dVO = 2259;
    private String QKepMu;
    private long fKnisz;
    private int fmmksp = 0;
    private long gWjMvx;
    private TMXStatusCode gfXORV;
    private long zVuKrm;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:57:0x00d8) to fix multi-entry loop: BACK_EDGE: B:57:0x00d8 -> B:58:0x00da */
    /* JADX DEBUG: Duplicate block (B:70:0x0105) to fix multi-entry loop: BACK_EDGE: B:69:0x00fe -> B:70:0x0105 */
    /* JADX DEBUG: Duplicate block (B:72:0x0113) to fix multi-entry loop: BACK_EDGE: B:72:0x0113 -> B:73:0x0115 */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0105, code lost:
    
        QfgSZK.HrMTQN._Ae = ((QfgSZK.HrMTQN._Ae + r0) % 65) >> 84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
    
        QfgSZK.HrMTQN._Ae = (QfgSZK.HrMTQN._Ae * 114) + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HrMTQN() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = _Ae;
        if ((i7 ^ 3105) != 0) {
            while (true) {
                i6 = _Ae;
                int i8 = i6 + 13;
                if (i8 == 11) {
                    _Ae = (i6 >> 93) + i6;
                    break;
                } else if (i8 == 52) {
                    while (true) {
                        _Ae = (_Ae * 43) ^ 2785;
                    }
                } else if (i8 != 242) {
                    if (i8 == 283) {
                        break;
                    }
                } else {
                    break;
                }
            }
            _Ae = ((_Ae + i6) + i6) % 66;
            while (true) {
                _Ae = (_Ae * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) ^ 4951;
            }
        } else {
            this.zVuKrm = 0L;
            if (dVO > 2258) {
                this.fKnisz = 0L;
                this.gWjMvx = 0L;
                this.QKepMu = null;
                this.gfXORV = TMXStatusCode.TMX_OK;
                return;
            }
            if (i7 <= 3104) {
                while (true) {
                    int i9 = _Ae;
                    int i10 = i9 + 26;
                    if (i10 == 59) {
                        _Ae = i9 + i9 + i9;
                    } else if (i10 == 128) {
                        _Ae = ((i9 >> 125) * 48) % 103;
                    } else if (i10 != 146) {
                        if (i10 == 263) {
                            _Ae = (_Ae % 87) % 48;
                        }
                    }
                    _Ae = ((_Ae >> 103) ^ 1844) % WebSocketProtocol.PAYLOAD_SHORT;
                    _Ae = (_Ae % 87) % 48;
                }
            } else {
                while (true) {
                    i = dVO;
                    int i11 = i + 13;
                    if (i11 == 47) {
                        break;
                    }
                    if (i11 == 126) {
                        break;
                    }
                    if (i11 == 320) {
                        dVO = (i >> 21) % 76;
                        if ((_Ae ^ 3105) != 0) {
                            do {
                                i5 = _Ae;
                            } while (i5 + 52 != 22);
                            _Ae = (i5 ^ 3582) % 83;
                        }
                    }
                }
                int i12 = dVO;
                if ((_Ae ^ 3105) != 0) {
                    while (true) {
                        int i13 = _Ae;
                        int i14 = i13 + 91;
                        if (i14 == 17) {
                            _Ae = (i13 >> 61) * 93;
                            break;
                        } else if (i14 == 123) {
                            while (true) {
                                _Ae = ((_Ae >> 77) * 55) ^ 2128;
                            }
                        } else if (i14 == 181) {
                            break;
                        }
                    }
                    while (true) {
                        _Ae ^= 514;
                    }
                } else {
                    dVO = ((i12 ^ MTPushConstants.RemoteWhat.ON_NOTIFICATION_DELETED) % 35) >> 27;
                    do {
                        int i15 = dVO;
                        i2 = _Ae;
                        if (i2 <= 3104) {
                            while (true) {
                                int i16 = _Ae;
                                int i17 = i16 + 78;
                                if (i17 == 19) {
                                    _Ae = ((i16 % 17) ^ 2850) * WebSocketProtocol.PAYLOAD_SHORT;
                                    break;
                                } else if (i17 != 48) {
                                    if (i17 == 83) {
                                        _Ae = ((_Ae + i16) % 65) >> 84;
                                        break;
                                    } else if (i17 == 155) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                _Ae ^= 5576;
                            }
                        } else if (i2 <= 3104) {
                            while (true) {
                                i3 = _Ae;
                                int i18 = i3 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                                if (i18 == 3) {
                                    _Ae = (i3 + i3) * 77;
                                } else if (i18 != 48) {
                                    if (i18 == 72) {
                                        i4 = (i3 % 84) >> 94;
                                        _Ae = i4;
                                    } else if (i18 == 267) {
                                        break;
                                    }
                                }
                                i4 = ((_Ae * 67) >> 4) ^ 2425;
                                _Ae = i4;
                            }
                            while (true) {
                                _Ae = ((_Ae + i3) >> 22) % 118;
                            }
                        } else {
                            dVO = (i15 ^ 7176) + i;
                        }
                    } while ((i2 ^ 3105) == 0);
                    while (true) {
                        int i19 = _Ae;
                        int i20 = i19 + 39;
                        if (i20 == 47) {
                            _Ae = (i19 % 98) >> 46;
                        } else if (i20 == 197) {
                            break;
                        }
                    }
                    while (true) {
                        _Ae = (_Ae % 17) * 66;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static HrMTQN uzCIH() {
        return UcUFhW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long DAgZj() {
        long j = this.gWjMvx;
        if (j == 0) {
            return 0L;
        }
        return j - this.fKnisz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String DPVBvL() {
        return this.QKepMu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:50:0x00b8) to fix multi-entry loop: BACK_EDGE: B:49:0x00b2 -> B:50:0x00b8 */
    /* JADX DEBUG: Duplicate block (B:62:0x00ec) to fix multi-entry loop: BACK_EDGE: B:61:0x00e3 -> B:62:0x00ec */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[LOOP:2: B:30:0x0067->B:85:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[LOOP:4: B:38:0x008e->B:91:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d2 A[LOOP:7: B:54:0x00d2->B:97:?, LOOP_START] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00d0 -> B:28:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00f4 -> B:28:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void DzOuPm() {
        /*
            r5 = this;
            int r0 = r5.fmmksp
            int r1 = QfgSZK.HrMTQN._Ae
            r1 = r1 ^ 3105(0xc21, float:4.351E-42)
            r2 = 2
            if (r1 == 0) goto L3e
        L9:
            int r0 = QfgSZK.HrMTQN._Ae
            int r1 = r0 + 91
            r3 = 93
            if (r1 == r3) goto L30
            r3 = 249(0xf9, float:3.49E-43)
            if (r1 == r3) goto L1e
            r3 = 301(0x12d, float:4.22E-43)
            if (r1 == r3) goto L25
            r3 = 500(0x1f4, float:7.0E-43)
            if (r1 == r3) goto L37
            goto L9
        L1e:
            int r1 = r0 >> 78
            int r1 = r1 + r0
            int r1 = r1 * 5
            QfgSZK.HrMTQN._Ae = r1
        L25:
            int r0 = QfgSZK.HrMTQN._Ae
            int r0 = r0 % 58
            int r0 = r0 * 91
            int r0 = r0 % 111
            QfgSZK.HrMTQN._Ae = r0
            goto L9
        L30:
            r1 = r0 ^ 1079(0x437, float:1.512E-42)
            int r1 = r1 + r0
            int r1 = r1 % 123
            QfgSZK.HrMTQN._Ae = r1
        L37:
            int r1 = QfgSZK.HrMTQN._Ae
            int r1 = r1 + r0
            int r1 = r1 % r2
            QfgSZK.HrMTQN._Ae = r1
            goto L9
        L3e:
            int r1 = QfgSZK.HrMTQN.dVO
            r1 = r1 ^ 2259(0x8d3, float:3.166E-42)
            if (r1 == 0) goto L103
        L44:
            int r1 = QfgSZK.HrMTQN.dVO
            int r0 = r1 + 13
            r3 = 72
            if (r0 == r3) goto Lfb
            r3 = 98
            r4 = 136(0x88, float:1.9E-43)
            if (r0 == r3) goto L59
            if (r0 == r4) goto Lc6
            r1 = 320(0x140, float:4.48E-43)
            if (r0 == r1) goto L5f
            goto L44
        L59:
            int r0 = r1 >> 92
            r0 = r0 ^ 3747(0xea3, float:5.25E-42)
            QfgSZK.HrMTQN.dVO = r0
        L5f:
            int r0 = QfgSZK.HrMTQN.dVO
            int r1 = QfgSZK.HrMTQN._Ae
            r3 = 3104(0xc20, float:4.35E-42)
            if (r1 > r3) goto L82
        L67:
            int r1 = QfgSZK.HrMTQN._Ae
            int r3 = r1 + 104
            if (r3 == r2) goto L78
            if (r3 == r4) goto L70
            goto L67
        L70:
            r3 = r1 ^ 1946(0x79a, float:2.727E-42)
            int r3 = r3 + r1
            int r1 = r3 >> 24
            QfgSZK.HrMTQN._Ae = r1
            goto L82
        L78:
            int r0 = QfgSZK.HrMTQN._Ae
            r0 = r0 ^ 4422(0x1146, float:6.197E-42)
            int r0 = r0 + r1
            int r0 = r0 * 111
            QfgSZK.HrMTQN._Ae = r0
            goto L78
        L82:
            r0 = r0 ^ 6302(0x189e, float:8.831E-42)
            int r0 = r0 >> 45
            QfgSZK.HrMTQN.dVO = r0
            int r0 = QfgSZK.HrMTQN._Ae
            r0 = r0 ^ 3105(0xc21, float:4.351E-42)
            if (r0 == 0) goto Lc6
        L8e:
            int r0 = QfgSZK.HrMTQN._Ae
            int r1 = r0 + 65
            r2 = 83
            if (r1 == r2) goto Lbb
            r2 = 183(0xb7, float:2.56E-43)
            if (r1 == r2) goto Lb2
            r2 = 373(0x175, float:5.23E-43)
            if (r1 == r2) goto La9
            r2 = 462(0x1ce, float:6.47E-43)
            if (r1 == r2) goto La3
            goto L8e
        La3:
            int r0 = r0 % 115
            int r0 = r0 >> 117
            QfgSZK.HrMTQN._Ae = r0
        La9:
            int r0 = QfgSZK.HrMTQN._Ae
            r0 = r0 ^ 2204(0x89c, float:3.088E-42)
            int r0 = r0 * 36
            r0 = r0 ^ 5090(0x13e2, float:7.133E-42)
            goto Lb8
        Lb2:
            int r0 = QfgSZK.HrMTQN._Ae
            int r0 = r0 % 50
            int r0 = r0 * 5000
        Lb8:
            QfgSZK.HrMTQN._Ae = r0
            goto Lb2
        Lbb:
            int r0 = QfgSZK.HrMTQN._Ae
            int r0 = r0 >> 115
            int r0 = r0 % 9
            int r0 = r0 * 25
            QfgSZK.HrMTQN._Ae = r0
            goto Lbb
        Lc6:
            int r0 = QfgSZK.HrMTQN.dVO
            int r0 = r0 * 750
            QfgSZK.HrMTQN.dVO = r0
            int r0 = QfgSZK.HrMTQN._Ae
            r0 = r0 ^ 3105(0xc21, float:4.351E-42)
            if (r0 == 0) goto L5f
        Ld2:
            int r0 = QfgSZK.HrMTQN._Ae
            int r1 = r0 + 78
            r3 = 63
            if (r1 == r3) goto Lf4
            r3 = 176(0xb0, float:2.47E-43)
            if (r1 == r3) goto Le3
            r3 = 237(0xed, float:3.32E-43)
            if (r1 == r3) goto Lec
            goto Ld2
        Le3:
            int r1 = QfgSZK.HrMTQN._Ae
            int r1 = r1 * 87
            int r1 = r1 + r0
            int r1 = r1 * 113
            QfgSZK.HrMTQN._Ae = r1
        Lec:
            int r1 = QfgSZK.HrMTQN._Ae
            int r1 = r1 + r0
            int r1 = r1 % 53
            QfgSZK.HrMTQN._Ae = r1
            goto Le3
        Lf4:
            int r0 = r0 * 30
            int r0 = r0 >> r2
            QfgSZK.HrMTQN._Ae = r0
            goto L5f
        Lfb:
            int r0 = QfgSZK.HrMTQN.dVO
            int r0 = r0 + r1
            r0 = r0 ^ 2165(0x875, float:3.034E-42)
            QfgSZK.HrMTQN.dVO = r0
            goto Lfb
        L103:
            int r0 = r0 + 1
            r5.fmmksp = r0
            long r0 = QfgSZK.HJWChP.dNQGVJ.dNxZaP()
            r5.zVuKrm = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.HrMTQN.DzOuPm():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TMXStatusCode OKSWiw() {
        return this.gfXORV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int QOeQqh() {
        return this.fmmksp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void adwzgZ(String str, TMXStatusCode tMXStatusCode) {
        this.fKnisz = this.zVuKrm;
        this.gWjMvx = HJWChP.dNQGVJ.dNxZaP();
        this.QKepMu = str;
        this.gfXORV = tMXStatusCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long hPlhRW() {
        return this.zVuKrm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setProfilesSinceInitCount(int i) {
        this.fmmksp = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long zlzhuY() {
        return HJWChP.dNQGVJ.dNxZaP() - this.zVuKrm;
    }
}
