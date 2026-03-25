package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class GLcwwN extends QhsCdE {
    private static String DlIaRS;
    public static int JQF;
    public static int fvQ;
    private ZAwExL zUMeWa;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        fvQ = 6723;
        JQF = 5601;
        FQMcgE.usN = 6842;
        if (fvQ > 6722) {
            GCXiNH.OHr = 2270;
            DlIaRS = FQMcgE.hfdhUn(GLcwwN.class);
        } else {
            while (fvQ + 13 != 73) {
            }
            while (true) {
                fvQ = ((fvQ ^ 3827) * 40) >> 114;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:10:0x001c) to fix multi-entry loop: BACK_EDGE: B:9:0x0016 -> B:10:0x001c */
    public GLcwwN(long j, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        super(j, z);
        int i6 = fvQ;
        if ((i6 ^ 6723) != 0) {
            while (true) {
                i5 = fvQ;
                int i7 = i5 + 13;
                if (i7 != 9) {
                    if (i7 == 193) {
                        fvQ = ((fvQ + i5) % 99) % 36;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                fvQ = fvQ + i5 + i5;
                fvQ = ((fvQ + i5) % 99) % 36;
            }
        } else {
            if ((JQF ^ 5601) == 0) {
                this.zUMeWa = null;
                return;
            }
            if (i6 <= 6722) {
                while (true) {
                    int i8 = fvQ;
                    if (i8 + 26 == 39) {
                        fvQ = (i8 ^ 1992) * 99;
                    }
                }
            } else {
                do {
                    i = JQF;
                    i2 = i + 13;
                    if (i2 == 21) {
                        do {
                            int i9 = JQF;
                            i3 = fvQ;
                            if (i3 <= 6722) {
                                while (fvQ + 117 != 15) {
                                }
                                while (true) {
                                    fvQ = (fvQ >> 9) * 10;
                                }
                            } else {
                                JQF = ((i9 + i) * 71) % WalletImportError.ERROR_CODE_AA_EXIST;
                            }
                        } while (i3 > 6722);
                        do {
                            int i10 = fvQ;
                            i4 = i10 + 39;
                            if (i4 == 53) {
                                while (true) {
                                    fvQ = (fvQ + i10) * 2640;
                                }
                            }
                        } while (i4 != 176);
                        while (true) {
                            fvQ = (fvQ * 3) % 16;
                        }
                    }
                } while (i2 != 143);
                while (true) {
                    JQF = ((JQF + i) ^ 1516) >> 84;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        ZAwExL zAwExL;
        if (map == null || (zAwExL = this.zUMeWa) == null) {
            return;
        }
        map.putAll(zAwExL.ijmTNW());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_STRONG_ID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:100:0x0181) to fix multi-entry loop: BACK_EDGE: B:99:0x017c -> B:100:0x0181 */
    /* JADX DEBUG: Duplicate block (B:28:0x0059) to fix multi-entry loop: BACK_EDGE: B:28:0x0059 -> B:27:0x0056 */
    /* JADX DEBUG: Duplicate block (B:42:0x0082) to fix multi-entry loop: BACK_EDGE: B:42:0x0082 -> B:43:0x0084 */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0056, code lost:
    
        r7 = QfgSZK.GLcwwN.fvQ * 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0179, code lost:
    
        QfgSZK.GLcwwN.fvQ = r1;
     */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (map == null || qSusPL.RcLksq() == null) {
            return;
        }
        if (JQF <= 5600) {
            if (fvQ <= 6722) {
                do {
                    i9 = fvQ;
                } while (i9 + 117 != 28);
                fvQ = (i9 ^ 2279) >> 69;
            }
            do {
                int i10 = JQF;
                int i11 = fvQ;
                int i12 = i11 ^ 6723;
                if (i12 != 0) {
                    do {
                        i4 = fvQ;
                        i5 = i4 + 221;
                        if (i5 != 39) {
                            if (i5 != 199) {
                                if (i5 == 322) {
                                    fvQ = (i4 ^ 2754) * 31;
                                }
                            }
                            i6 = fvQ * 14;
                        }
                        fvQ = ((fvQ >> 59) * 63) % 119;
                        break;
                    } while (i5 != 353);
                    i6 = (fvQ * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) >> 84;
                    while (true) {
                        fvQ = i6 + i4;
                        i6 = fvQ * 14;
                    }
                } else {
                    i7 = i10 + 91;
                    if (i7 == 21) {
                        if (i12 != 0) {
                            while (true) {
                                int i13 = fvQ;
                                int i14 = i13 + 234;
                                if (i14 == 94) {
                                    fvQ = i13 >> CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA;
                                    break;
                                } else if (i14 == 187) {
                                    break;
                                }
                            }
                            while (true) {
                                fvQ = (fvQ * 8) % 11;
                            }
                        } else {
                            JQF = (i10 % 65) + i10 + i10;
                            if (i11 <= 6722) {
                                do {
                                    i8 = fvQ;
                                } while (i8 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 85);
                                while (true) {
                                    fvQ = ((fvQ + i8) * 125) ^ 4741;
                                }
                            }
                        }
                    }
                }
            } while (i7 != 191);
            while (true) {
                JQF *= 658;
            }
        }
        if (qSusPL.aPFruk() == null || qSusPL.gBtXYZ() == null) {
            return;
        }
        String str2 = map.get(AhwBna.FIREBASE_PUSH_TOKEN.DbNXlk());
        String strConcat = str2 != null ? "".concat(str2) : "";
        if (qSusPL.ruDxL() != null && (str = qSusPL.ruDxL().get(AhwBna.STRONG_AUTH_STATUS.DbNXlk())) != null) {
            strConcat = strConcat.concat(str);
        }
        OAjjVP oAjjVPQCjLjM = qSusPL.RcLksq().QCjLjM();
        if (oAjjVPQCjLjM == null || !oAjjVPQCjLjM.QzqeNH()) {
            if (UkvvWh.isAvailable(qSusPL.aPFruk().Umbazn)) {
                if ((fvQ ^ 6723) != 0) {
                    do {
                        i3 = fvQ;
                    } while (i3 + 91 != 41);
                    fvQ = (i3 >> 45) + i3;
                }
                String str3 = qSusPL.gBtXYZ().sfBaYs;
                if ((fvQ ^ 6723) != 0) {
                    while (true) {
                        i = fvQ;
                        int i15 = i + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                        if (i15 != 91) {
                            if (i15 == 231) {
                                i2 = i * 5796;
                                break;
                            } else if (i15 == 333) {
                                i2 = (i % 106) * 80;
                                break;
                            } else if (i15 == 377) {
                                fvQ = ((i % 31) >> 34) % 61;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        fvQ = (fvQ + i) ^ 3835;
                    }
                }
                this.zUMeWa = UkvvWh.gxJrGF(str3, qSusPL.aPFruk(), strConcat);
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("UpIh\\Ps{,CGZ\n@[\u0007WCUZ^PRC["));
                return;
            }
            return;
        }
        this.zUMeWa = oAjjVPQCjLjM.dYepVG(qSusPL.gBtXYZ().sfBaYs, strConcat, qSusPL.aPFruk().Umbazn);
        if ((fvQ ^ 6723) == 0) {
            return;
        }
        while (true) {
            int i16 = fvQ;
            int i17 = i16 + 78;
            if (i17 == 47) {
                fvQ = ((i16 % 1) % 11) + i16;
                return;
            } else if (i17 == 165) {
                fvQ = ((i16 + i16) + i16) % 49;
            }
        }
    }
}
