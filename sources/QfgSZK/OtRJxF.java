package QfgSZK;

import QfgSZK.AuCTel;
import QfgSZK.FQMcgE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.lang.reflect.Method;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class OtRJxF {
    private static final Method DgALqY;
    private static String DlIaRS;
    private static Object EGTnL;
    private static final Method RIqlJS;
    private static final Method aQmmbt;
    public static int cmb;
    private static final Method gUCdZh;
    private static final Method hVriXV;
    private static final boolean iRLLBr;
    public static int kUc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:105:0x01c3) to fix multi-entry loop: BACK_EDGE: B:104:0x01bf -> B:105:0x01c3 */
    /* JADX DEBUG: Duplicate block (B:147:0x0290) to fix multi-entry loop: BACK_EDGE: B:146:0x028a -> B:147:0x0290 */
    /* JADX DEBUG: Duplicate block (B:37:0x00bc) to fix multi-entry loop: BACK_EDGE: B:37:0x00bc -> B:38:0x00bf */
    /* JADX DEBUG: Duplicate block (B:40:0x00cd) to fix multi-entry loop: BACK_EDGE: B:39:0x00c6 -> B:40:0x00cd */
    /* JADX DEBUG: Duplicate block (B:60:0x011c) to fix multi-entry loop: BACK_EDGE: B:60:0x011c -> B:61:0x011e */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00cd, code lost:
    
        QfgSZK.OtRJxF.kUc = ((QfgSZK.OtRJxF.kUc % 93) % 101) ^ 5036;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        QfgSZK.OtRJxF.kUc = (QfgSZK.OtRJxF.kUc + r0) >> 47;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    static {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        FQMcgE.RQa = 9057;
        AuCTel.ztU = 4889;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.fQMcgE.CEb = 9231;
        kUc = 4312;
        FQMcgE.usN = 6842;
        AuCTel.kWh = 9383;
        GCXiNH.OHr = 2270;
        cmb = 7268;
        DlIaRS = FQMcgE.hfdhUn(OtRJxF.class);
        Class clsWlaJM = AuCTel.wlaJM(AuCTel.auCTel.FIREBASE_INSTANCE_ID);
        Class clsWlaJM2 = AuCTel.wlaJM(AuCTel.auCTel.FIREBASE_MESSAGING);
        Class clsWlaJM3 = AuCTel.wlaJM(AuCTel.auCTel.TASK);
        Method methodZsXlph = AuCTel.zsXlph(clsWlaJM, GCXiNH.fsw("ztOEEBu\u007fbKG"), new Class[0]);
        if (cmb <= 7267) {
            if ((kUc ^ 4312) != 0) {
                do {
                    i10 = kUc;
                    i11 = i10 + 26;
                    if (i11 == 9) {
                        while (true) {
                            kUc = ((kUc >> 100) + i10) ^ 4163;
                        }
                    } else if (i11 == 53) {
                        while (true) {
                            kUc = (kUc + i10) >> 54;
                        }
                    }
                } while (i11 != 214);
                while (true) {
                    kUc = (kUc + i10) * 18;
                }
            } else {
                do {
                    i4 = cmb;
                    i5 = i4 + 39;
                    if (i5 != 84) {
                        if (i5 == 158) {
                            int i12 = kUc;
                            if (i12 <= 4311) {
                                while (kUc + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 20) {
                                }
                                while (true) {
                                    kUc = ((kUc * 64) ^ 1596) % 32;
                                }
                            } else {
                                cmb = (i4 >> 123) * 47;
                                if ((i12 ^ 4312) == 0) {
                                }
                                while (true) {
                                    int i13 = kUc;
                                    i6 = i13 + 78;
                                    if (i6 != 35) {
                                        i7 = (i13 ^ 3415) * 105;
                                    } else if (i6 == 141) {
                                        i7 = (i13 * 13) >> 90;
                                    } else if (i6 == 250) {
                                        kUc = kUc + i13 + i13;
                                    }
                                    kUc = i7;
                                    kUc = kUc + i13 + i13;
                                }
                            }
                        } else if (i5 == 349) {
                            cmb = ((i4 % 70) >> 6) % 11;
                        }
                    }
                    loop11: do {
                        int i14 = cmb;
                        if ((kUc ^ 4312) != 0) {
                            while (true) {
                                i8 = kUc;
                                int i15 = i8 + 130;
                                if (i15 == 72) {
                                    kUc = i8 * 1350;
                                    break;
                                } else if (i15 == 93) {
                                    kUc = i8 * 1710;
                                    break loop11;
                                } else if (i15 == 119) {
                                    break loop11;
                                }
                            }
                            while (true) {
                                kUc = ((kUc + i8) * 64) >> 73;
                            }
                        }
                        if (kUc <= 4311) {
                            while (true) {
                                int i16 = kUc;
                                int i17 = i16 + 234;
                                if (i17 == 30) {
                                    kUc = ((i16 + i16) >> 62) ^ 2751;
                                } else if (i17 == 219) {
                                    kUc = (i16 + i16) ^ 3247;
                                    break;
                                } else if (i17 == 313) {
                                    while (true) {
                                        kUc = (kUc % 27) + i16;
                                    }
                                } else if (i17 == 427) {
                                    while (true) {
                                        kUc = (kUc + i16) >> 72;
                                    }
                                }
                            }
                        }
                        cmb = ((i14 >> 70) % 109) ^ 3774;
                    } while ((kUc ^ 4312) == 0);
                    while (true) {
                        int i132 = kUc;
                        i6 = i132 + 78;
                        if (i6 != 35) {
                        }
                        kUc = i7;
                        kUc = kUc + i132 + i132;
                    }
                } while (i5 != 462);
                do {
                    cmb = (cmb + i4) >> 48;
                } while (kUc > 4311);
                while (true) {
                    i9 = kUc;
                    int i18 = i9 + 117;
                    if (i18 != 55) {
                        if (i18 == 198) {
                            kUc = (i9 ^ 2758) + i9;
                            break;
                        } else if (i18 == 240) {
                            kUc = ((kUc % 93) % 101) ^ 5036;
                            break;
                        } else if (i18 == 289) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    kUc = ((kUc * 48) ^ 1956) + i9;
                }
            }
        }
        String strFsw = GCXiNH.fsw("ztOXDZdp");
        Class[] clsArr = new Class[0];
        if ((4312 ^ kUc) == 0) {
            Method methodZsXlph2 = AuCTel.zsXlph(clsWlaJM, strFsw, clsArr);
            if (methodZsXlph == null || methodZsXlph2 == null) {
                methodZsXlph = AuCTel.zsXlph(clsWlaJM2, GCXiNH.fsw("ztOEEBu\u007fbKG"), new Class[0]);
                methodZsXlph2 = AuCTel.zsXlph(clsWlaJM2, GCXiNH.fsw("ztOXDZdp"), new Class[0]);
                hVriXV = AuCTel.zsXlph(clsWlaJM3, GCXiNH.fsw("tbxcFAm{xM"), new Class[0]);
                if (kUc <= 4311) {
                    while (true) {
                        i = kUc;
                        int i19 = i + 39;
                        if (i19 == 77) {
                            break;
                        }
                        if (i19 != 236) {
                            if (i19 == 334) {
                                kUc = (i * 20) % 40;
                            }
                        }
                        kUc = kUc + i + i;
                    }
                    while (true) {
                        kUc = (kUc + i + i) * 49;
                    }
                } else {
                    DgALqY = AuCTel.zsXlph(clsWlaJM3, GCXiNH.fsw("tbhyHRdm\u007fNWO"), new Class[0]);
                    String strFsw2 = GCXiNH.fsw("ztO^NBtrx");
                    if (kUc <= 4311) {
                        while (true) {
                            int i20 = kUc;
                            int i21 = i20 + 208;
                            if (i21 != 94) {
                                if (i21 == 138) {
                                    kUc = ((i20 % 5) + i20) >> 67;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            kUc *= 777546;
                        }
                    } else {
                        RIqlJS = AuCTel.zsXlph(clsWlaJM3, strFsw2, new Class[0]);
                        iRLLBr = false;
                    }
                }
            } else {
                iRLLBr = true;
                hVriXV = null;
                DgALqY = null;
                RIqlJS = null;
                if (kUc <= 4311) {
                    while (true) {
                        int i22 = kUc;
                        int i23 = i22 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                        if (i23 == 79) {
                            i2 = (i22 ^ 1740) % WebSocketProtocol.PAYLOAD_SHORT;
                        } else if (i23 == 162) {
                            i2 = ((i22 + i22) % 9) % 64;
                        } else if (i23 == 185) {
                            i2 = (i22 % 75) + i22;
                        } else if (i23 == 283) {
                            kUc = (kUc ^ 1875) + i22;
                        }
                        kUc = i2;
                        kUc = (kUc ^ 1875) + i22;
                    }
                }
            }
            aQmmbt = methodZsXlph;
            gUCdZh = methodZsXlph2;
            return;
        }
        while (true) {
            i3 = kUc;
            int i24 = i3 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
            if (i24 == 44) {
                while (true) {
                    kUc >>= CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA;
                }
            } else if (i24 != 168) {
                if (i24 == 314) {
                    kUc = ((i3 % 96) ^ 1001) * 19;
                    break;
                } else if (i24 == 512) {
                    break;
                }
            } else {
                break;
            }
        }
        kUc = (kUc ^ 2834) + i3;
        while (true) {
            kUc = (kUc ^ 4413) + i3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OtRJxF() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:30:0x0079) to fix multi-entry loop: BACK_EDGE: B:29:0x0072 -> B:30:0x0079 */
    /* JADX DEBUG: Duplicate block (B:48:0x00c7) to fix multi-entry loop: BACK_EDGE: B:47:0x00bf -> B:48:0x00c7 */
    public static String hBUiXU() {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        Object obj = EGTnL;
        String str3 = null;
        if (obj == null) {
            return null;
        }
        if (!iRLLBr) {
            Object objFIwbmz = AuCTel.fIwbmz(obj, hVriXV, new Object[0]);
            Object objFIwbmz2 = AuCTel.fIwbmz(EGTnL, DgALqY, new Object[0]);
            if ((objFIwbmz instanceof Boolean) && (objFIwbmz2 instanceof Boolean)) {
                Boolean bool = Boolean.FALSE;
                if (bool.equals(objFIwbmz) || bool.equals(objFIwbmz2)) {
                    str = DlIaRS;
                    str2 = "U~Hx\u000bPqn,@CP\noAUSWU@W|U\\M\\[RT^\u0014\u0017Rdwh\"hs\u001eBfp+ifewzp`vv1\u007f}>j}ht>l7tPFGx}]VwI";
                } else {
                    Object objFIwbmz3 = AuCTel.fIwbmz(EGTnL, RIqlJS, new Object[0]);
                    if (objFIwbmz3 instanceof String) {
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("U~Hx\u000bPqn,@CP\noAUSWU@W|U\\M\\[RT^\u0014\u0017Rjofl!iM\f") + objFIwbmz3);
                        return (String) objFIwbmz3;
                    }
                    str = DlIaRS;
                    str2 = "U~Hx\u000bPqn,@CP\noAUSWU@W|U\\M\\[RT^\u0014\u0017Dpp#edtlIzqg~)at6{{g2wb`s=};yvjebFQ\u0004iw^U";
                }
            } else {
                str = DlIaRS;
                str2 = "U~Hx\u000bPqn,@CP\noAUSWU@W|U\\M\\[RT^\u0014\u0017Dpp#krCQAyhn~l(ne5z|f1v}qp<z:zweu@FP=zW@g";
            }
            FQMcgE.fQMcgE.sIqKDg(str, GCXiNH.fsw(str2));
            return null;
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("U~Hx\u000bPqn,@CP\noAUSWU@Wx^\\J\\RX_p\\\u001b\u0006qkhgo W_)") + EGTnL);
        Object obj2 = EGTnL;
        if (obj2 instanceof String) {
            str3 = (String) obj2;
            if ((cmb ^ 7268) != 0) {
                while (true) {
                    int i4 = cmb;
                    int i5 = i4 + 52;
                    if (i5 == 73) {
                        do {
                            cmb = ((cmb ^ 4810) % 123) ^ 1853;
                        } while ((kUc ^ 4312) == 0);
                        while (true) {
                            i = kUc;
                            int i6 = i + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                            if (i6 != 93) {
                                if (i6 == 162) {
                                    kUc = ((kUc ^ 1086) * 58) + i;
                                    break;
                                }
                                if (i6 == 330) {
                                    kUc = (i ^ 3549) % 28;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            kUc = (kUc ^ 2120) * 41;
                            kUc = ((kUc ^ 1086) * 58) + i;
                        }
                    } else if (i5 == 256) {
                        cmb = (i4 * 108) % 68;
                        if (kUc <= 4311) {
                            do {
                                i2 = kUc;
                            } while (i2 + 52 != 81);
                            kUc = ((i2 % 76) + i2) ^ 3779;
                        }
                    } else if (i5 == 438) {
                        cmb = (i4 >> CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256) % 91;
                        if (kUc <= 4311) {
                            while (true) {
                                i3 = kUc;
                                int i7 = i3 + 65;
                                if (i7 == 83) {
                                    break;
                                }
                                if (i7 == 207) {
                                    while (true) {
                                        kUc = (kUc >> 72) ^ 7704;
                                    }
                                } else if (i7 == 377) {
                                    kUc = (i3 % 94) ^ 1638;
                                    break;
                                }
                            }
                            while (true) {
                                kUc = ((kUc * 82) + i3) % 72;
                            }
                        }
                    }
                }
            }
        }
        return str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void zAGdSp() {
        Object objFIwbmz;
        if (zEkrwr() && (objFIwbmz = AuCTel.fIwbmz(null, aQmmbt, new Object[0])) != null) {
            EGTnL = AuCTel.fIwbmz(objFIwbmz, gUCdZh, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c0, code lost:
    
        QfgSZK.OtRJxF.kUc = (QfgSZK.OtRJxF.kUc >> 191) * 84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zEkrwr() {
        boolean z;
        int i;
        int i2;
        int i3;
        if (aQmmbt == null || gUCdZh == null) {
            z = false;
        } else {
            if (kUc <= 4311) {
                while (true) {
                    int i4 = kUc;
                    int i5 = i4 + 26;
                    if (i5 == 49) {
                        kUc = ((i4 >> 70) ^ 2397) % 117;
                    } else {
                        if (i5 == 96) {
                            kUc = ((i4 * 109) + i4) % 5;
                            break;
                        }
                        if (i5 == 295) {
                            kUc = (i4 + i4) ^ 3095;
                            break;
                        }
                        if (i5 != 457) {
                        }
                    }
                    kUc = ((kUc + i4) >> 79) ^ 3970;
                }
            }
            z = true;
        }
        if (iRLLBr) {
            return z;
        }
        if (z && RIqlJS != null) {
            if ((kUc ^ 4312) != 0) {
                do {
                    i3 = kUc;
                } while (i3 + 65 != 73);
                kUc = (i3 % 52) % WebSocketProtocol.PAYLOAD_SHORT;
            }
            if (hVriXV != null) {
                if ((cmb ^ 7268) == 0) {
                    return true;
                }
                if (kUc <= 4311) {
                    do {
                        i2 = kUc;
                    } while (i2 + 91 != 65);
                    kUc = i2 * 14399;
                }
                loop3: while (true) {
                    int i6 = cmb;
                    int i7 = i6 + 65;
                    if (i7 != 30) {
                        if (i7 != 57) {
                            if (i7 == 159) {
                                while (true) {
                                    int i8 = cmb;
                                    if (kUc <= 4311) {
                                        break;
                                    }
                                    cmb = (i8 >> 38) % 97;
                                }
                                do {
                                    i = kUc;
                                } while (i + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 != 46);
                                while (true) {
                                    kUc = ((kUc * 65) + i) * 35;
                                }
                            } else if (i7 == 234) {
                                cmb = (i6 ^ 1786) * 21;
                                if ((kUc ^ 4312) != 0) {
                                    while (true) {
                                        int i9 = kUc;
                                        int i10 = i9 + 117;
                                        if (i10 == 44) {
                                            kUc = (i9 + i9) * WebSocketProtocol.PAYLOAD_SHORT;
                                            break loop3;
                                        }
                                        if (i10 == 208) {
                                            kUc = (i9 + i9) * 79;
                                            break;
                                        }
                                        if (i10 == 250) {
                                            break;
                                        }
                                        if (i10 == 361) {
                                            break loop3;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                        int i11 = cmb;
                        if (kUc <= 4311) {
                            while (true) {
                                int i12 = kUc;
                                int i13 = i12 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                                if (i13 == 15) {
                                    break;
                                }
                                if (i13 == 18) {
                                    kUc = (i12 + i12) * 8;
                                }
                            }
                            while (true) {
                                kUc = (kUc * 38) >> 10;
                            }
                        } else {
                            cmb = ((i11 % 105) + i6) % 4;
                        }
                    }
                    cmb = (cmb >> 15) + i6;
                }
                while (true) {
                    kUc = (kUc ^ 4532) * 69;
                }
            }
        }
        return false;
    }
}
