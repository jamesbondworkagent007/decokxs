package QfgSZK;

import android.app.Activity;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DLGVGj extends SaJVGb {
    public static int JZO;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String KQmFA;
    public static int RvP;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String UPEdFw;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String dPTprc;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String dUuww;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hCrUVe;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hmIZd;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String xPQVq;
    private Object OHaCMq;
    private Object avNaLY;
    private Object fdOvFl;
    private Object fjfviF;
    private Object gWQxPx;
    private Object htlTjW;
    private Object zdLJTd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        JZO = 7658;
        RvP = 4406;
        GCXiNH.OHr = 2270;
        fGQ(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:37:0x0093) to fix multi-entry loop: BACK_EDGE: B:36:0x008c -> B:37:0x0093 */
    /* JADX DEBUG: Duplicate block (B:51:0x00e4) to fix multi-entry loop: BACK_EDGE: B:51:0x00e4 -> B:52:0x00e6 */
    public DLGVGj(Object obj, String str) {
        int i;
        int i2;
        int i3;
        super(obj, str);
        if (!(obj instanceof Map)) {
            return;
        }
        Map map = (Map) obj;
        this.avNaLY = map.get(hCrUVe);
        this.gWQxPx = map.get(UPEdFw);
        String str2 = xPQVq;
        if ((RvP ^ 4406) != 0) {
            if ((JZO ^ 7658) != 0) {
                while (true) {
                    int i4 = JZO;
                    int i5 = i4 + 52;
                    if (i5 != 86) {
                        if (i5 != 135) {
                            if (i5 == 282) {
                                JZO = ((i4 + i4) >> 15) % 92;
                                break;
                            } else if (i5 == 326) {
                                JZO = (i4 >> 59) % 25;
                            }
                        }
                        JZO = (JZO + i4) >> 34;
                    } else {
                        while (true) {
                            JZO = (JZO % 52) >> 38;
                        }
                    }
                }
            }
            while (RvP + 26 != 11) {
            }
            while (true) {
                int i6 = RvP;
                if ((JZO ^ 7658) != 0) {
                    break;
                } else {
                    RvP = ((i6 % 60) % 57) * 89;
                }
            }
            while (true) {
                i3 = JZO;
                int i7 = i3 + 78;
                if (i7 == 87) {
                    while (true) {
                        JZO = (JZO >> 64) + i3;
                    }
                } else {
                    if (i7 == 187) {
                        break;
                    }
                    if (i7 == 276) {
                        while (true) {
                            JZO = ((JZO >> 108) % 123) + i3;
                        }
                    } else if (i7 == 334) {
                        JZO = ((JZO + i3) >> 73) + i3;
                        break;
                    }
                }
            }
            while (true) {
                JZO = (JZO + i3) ^ 2945;
                JZO = ((JZO + i3) >> 73) + i3;
            }
        } else {
            this.zdLJTd = map.get(str2);
            this.OHaCMq = map.get(KQmFA);
            Object obj2 = map.get(hmIZd);
            if ((JZO ^ 7658) == 0) {
                this.htlTjW = obj2;
                this.fjfviF = map.get(dPTprc);
                this.fdOvFl = map.get(dUuww);
                return;
            }
            do {
                i = JZO;
                i2 = i + 39;
                if (i2 == 47) {
                    JZO = (i * 2373) % 54;
                } else if (i2 != 195) {
                }
                while (true) {
                    JZO = (JZO % 99) >> 12;
                }
            } while (i2 != 212);
            while (true) {
                JZO = (JZO * 90) + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:28:0x008a) to fix multi-entry loop: BACK_EDGE: B:27:0x0086 -> B:28:0x008a */
    public static /* synthetic */ void fGQ(boolean z) {
        if (z) {
            fGQ(false);
        }
        dPTprc = GCXiNH.fsw("ntOO^Cs{b\\iFSKGFDQ`R@VU[v\\R_V\\J");
        xPQVq = GCXiNH.fsw("~}^mYcdye[VQK]AHXF|R\\U\\JL");
        KQmFA = GCXiNH.fsw("ot\\eXEdlGM[AEHZCbTFTWExNPYP^H");
        if ((JZO ^ 7658) != 0) {
            while (true) {
                int i = JZO;
                int i2 = i + 39;
                if (i2 == 40) {
                    JZO = (i ^ 3626) * 2294;
                    break;
                } else if (i2 == 106) {
                    break;
                }
            }
            JZO = (JZO ^ 3309) * 54;
        }
        UPEdFw = GCXiNH.fsw("ntO\\JVdPmEGkKGLKSG");
        hCrUVe = GCXiNH.fsw("ntUhoPu\u007fDILGFLZ");
        if (JZO > 7657) {
            dUuww = GCXiNH.fsw("~}^mYrtl~MLWaLQEYTFWfPBH[ItZT]TRT");
            hmIZd = GCXiNH.fsw("vtBnDPszXIPDO]|BNAw[S_WJZu]U^U]E");
            return;
        }
        while (true) {
            int i3 = JZO;
            int i4 = i3 + 52;
            if (i4 == 16) {
                break;
            }
            if (i4 == 86) {
                break;
            }
            if (i4 == 149) {
                while (true) {
                    JZO = ((JZO + i3) >> 68) ^ 4709;
                }
            } else if (i4 == 202) {
                JZO = ((i3 >> 97) ^ 2772) >> 104;
                break;
            }
        }
        JZO = ((JZO >> 105) * 122) >> 57;
        while (true) {
            JZO ^= 5692;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean iKEqwx(SaJVGb saJVGb) {
        int i;
        int i2;
        int i3;
        int i4;
        if ((saJVGb instanceof DLGVGj) && saJVGb.aJZHYI()) {
            if (JZO <= 7657) {
                while (true) {
                    int i5 = JZO;
                    if (i5 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 == 25) {
                        JZO = ((i5 >> 89) ^ 5200) % 79;
                    }
                }
            } else if ((RvP ^ 4406) != 0) {
                while (true) {
                    i3 = RvP;
                    int i6 = i3 + 39;
                    if (i6 == 52) {
                        RvP = (i3 * 107) >> 14;
                        if (JZO <= 7657) {
                            while (true) {
                                i4 = JZO;
                                int i7 = i4 + 39;
                                if (i7 == 31) {
                                    break;
                                }
                                if (i7 == 117) {
                                    JZO = (i4 ^ 5208) % 123;
                                }
                            }
                            while (true) {
                                JZO = ((JZO + i4) * 83) % 83;
                            }
                        }
                    } else if (i6 != 145) {
                        if (i6 != 275) {
                            if (i6 == 423) {
                                RvP = (i3 * 104) + i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                RvP >>= 50;
                if ((JZO ^ 7658) == 0) {
                    do {
                        RvP = ((RvP + i3) ^ 3109) * 19;
                    } while ((JZO ^ 7658) == 0);
                }
                while (true) {
                    int i8 = JZO;
                    int i9 = i8 + 117;
                    if (i9 != 54) {
                        if (i9 == 235) {
                            JZO = (i8 >> 91) % 122;
                        } else if (i9 != 386) {
                        }
                        JZO = (JZO ^ 3312) >> 15;
                    }
                    JZO = ((JZO + i8) >> 25) + i8;
                }
            } else if (saJVGb.OFQuKP()) {
                boolean zQTtQrx = saJVGb.QTtQrx();
                if (JZO <= 7657) {
                    do {
                        int i10 = JZO;
                        i = i10 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                        if (i != 58) {
                            if (i == 151) {
                                i2 = (i10 % 88) ^ 4829;
                                JZO = i2;
                            } else if (i == 166) {
                                JZO = ((i10 + i10) * 30) ^ 2861;
                            }
                        }
                        i2 = (JZO ^ 3482) * 17;
                        JZO = i2;
                    } while (i != 244);
                    while (true) {
                        JZO *= 7137;
                    }
                }
                if (zQTtQrx) {
                    if (RvP > 4405) {
                        return true;
                    }
                    if ((JZO ^ 7658) != 0) {
                        while (true) {
                            int i11 = JZO;
                            int i12 = i11 + 65;
                            if (i12 == 70) {
                                break;
                            }
                            if (i12 == 172) {
                                JZO = (i11 >> 92) % 26;
                            }
                        }
                        while (true) {
                            JZO = (JZO * 47) >> 96;
                        }
                    } else {
                        while (true) {
                            int i13 = RvP;
                            if (i13 + 26 == 16) {
                                RvP = (i13 + i13) % 19;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OxVOHk(Activity activity, String str) {
        Method method = (Method) this.gWQxPx;
        Object[] objArr = new Object[2];
        objArr[0] = activity;
        if ((JZO ^ 7658) != 0) {
            while (true) {
                int i = JZO;
                int i2 = i + 26;
                if (i2 == 80) {
                    while (true) {
                        JZO *= 1504;
                    }
                } else if (i2 == 187) {
                    while (true) {
                        JZO = (JZO * 26) ^ 4636;
                    }
                } else if (i2 == 267) {
                    JZO = (i >> 91) * 65;
                    break;
                } else if (i2 == 404) {
                    JZO = (i + i) % 42;
                }
            }
        }
        objArr[1] = str;
        ikcuIV(method, false, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void QVsKAR(String str, boolean z, Activity activity) {
        ikcuIV((Method) this.OHaCMq, false, str, Boolean.valueOf(z), activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        QfgSZK.DLGVGj.RvP = ((QfgSZK.DLGVGj.RvP >> 7) + r1) >> 87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
    
        if ((QfgSZK.DLGVGj.JZO ^ 7658) == 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void QwvEab() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Method method = (Method) this.avNaLY;
        if (RvP <= 4405) {
            if (JZO <= 7657) {
                do {
                    i6 = JZO;
                    i7 = i6 + 26;
                    if (i7 == 52) {
                        while (true) {
                            JZO = (JZO * 25) >> CipherSuite.TLS_PSK_WITH_NULL_SHA256;
                        }
                    }
                } while (i7 != 141);
                while (true) {
                    JZO = ((JZO * 114) ^ MTCoreConstants.MainWhat.ON_REGISTER_SUCCESS) + i6;
                }
            } else {
                while (true) {
                    i = RvP;
                    int i8 = i + 13;
                    if (i8 == 41) {
                        break;
                    }
                    if (i8 == 99) {
                        if ((JZO ^ 7658) != 0) {
                            do {
                                i3 = JZO;
                                i4 = i3 + 91;
                                if (i4 == 32) {
                                    JZO = ((i3 % 35) >> 46) % 40;
                                } else if (i4 != 66) {
                                }
                                i5 = JZO * 38;
                                break;
                            } while (i4 != 130);
                            i5 = i3 ^ 6113;
                            JZO = i5 + i3;
                        }
                        RvP = ((i ^ 4086) % 65) * 38;
                        if ((JZO ^ 7658) != 0) {
                            while (true) {
                                int i9 = JZO;
                                if (i9 + 78 == 21) {
                                    JZO = (i9 * 29) % 118;
                                }
                            }
                        }
                    } else if (i8 == 153) {
                        RvP = (i + i) >> 105;
                        break;
                    } else if (i8 == 339) {
                        break;
                    }
                }
                do {
                    RvP = (RvP + i) % 70;
                } while ((JZO ^ 7658) == 0);
                do {
                    i2 = JZO;
                } while (i2 + 39 != 3);
                while (true) {
                    JZO = (JZO ^ 1148) + i2;
                }
            }
        }
        ikcuIV(method, false, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.SaJVGb
    public boolean aJZHYI() {
        if (super.aJZHYI() && fruYXx(this.avNaLY)) {
            if (JZO <= 7657) {
                while (true) {
                    int i = JZO;
                    int i2 = i + 52;
                    if (i2 == 47) {
                        JZO = (i % 40) * 20;
                    } else if (i2 != 171) {
                        if (i2 == 220) {
                            break;
                        }
                        if (i2 == 340) {
                            JZO ^= 5353;
                        }
                    }
                    JZO = ((JZO ^ 3344) % 64) >> 47;
                    JZO ^= 5353;
                }
                while (true) {
                    JZO = (JZO % 58) ^ 1319;
                }
            } else if (fruYXx(this.gWQxPx) && fruYXx(this.zdLJTd)) {
                if ((JZO ^ 7658) != 0) {
                    while (true) {
                        int i3 = JZO;
                        int i4 = i3 + 26;
                        if (i4 == 14) {
                            JZO = ((i3 ^ 4479) * 102) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                        } else if (i4 != 50) {
                        }
                        JZO = ((JZO + i3) * 22) % 120;
                    }
                } else if (fruYXx(this.OHaCMq) && fruYXx(this.htlTjW)) {
                    if ((JZO ^ 7658) != 0) {
                        while (JZO + 65 != 78) {
                        }
                        while (true) {
                            JZO = (JZO * 33) ^ 1811;
                        }
                    } else if (fruYXx(this.fjfviF) && fruYXx(this.fdOvFl)) {
                        if ((JZO ^ 7658) != 0) {
                            while (true) {
                                int i5 = JZO;
                                int i6 = i5 + 39;
                                if (i6 != 96) {
                                    if (i6 == 229) {
                                        JZO = (i5 + i5) * 8214;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            JZO = (JZO * 120) % 8;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void aUsmxb(Activity activity) {
        ikcuIV((Method) this.zdLJTd, false, activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:10:0x001c) to fix multi-entry loop: BACK_EDGE: B:10:0x001c -> B:11:0x001e */
    /* JADX DEBUG: Duplicate block (B:26:0x0059) to fix multi-entry loop: BACK_EDGE: B:26:0x0059 -> B:27:0x005b */
    /* JADX DEBUG: Duplicate block (B:45:0x0095) to fix multi-entry loop: BACK_EDGE: B:45:0x0095 -> B:44:0x0093 */
    /* JADX DEBUG: Duplicate block (B:67:0x00ed) to fix multi-entry loop: BACK_EDGE: B:66:0x00e7 -> B:67:0x00ed */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        QfgSZK.DLGVGj.JZO = (QfgSZK.DLGVGj.JZO + r1) >> 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0093, code lost:
    
        r9 = (QfgSZK.DLGVGj.JZO + r8) >> 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fdOvFl(String str, String str2, Activity activity) {
        int i;
        int i2;
        int i3;
        Method method = (Method) this.fdOvFl;
        int i4 = JZO;
        if (i4 <= 7657) {
            while (true) {
                int i5 = JZO;
                int i6 = i5 + 65;
                if (i6 == 27) {
                    JZO = ((i5 + i5) * 45) % 45;
                    break;
                } else if (i6 == 34) {
                    break;
                }
            }
            while (true) {
                JZO = ((JZO ^ 4784) * 101) >> 24;
            }
        } else {
            Object[] objArr = new Object[3];
            int i7 = RvP;
            if (i4 <= 7657) {
                while (true) {
                    int i8 = JZO;
                    int i9 = i8 + 91;
                    if (i9 == 61) {
                        JZO = ((i8 ^ 3651) >> 119) % WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                        break;
                    } else if (i9 != 206) {
                        if (i9 == 284) {
                            JZO = ((i8 >> 42) ^ 5100) * 18;
                            break;
                        } else if (i9 == 299) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    JZO = (JZO ^ 2051) >> 55;
                }
            }
            if (i7 > 4405) {
                objArr[0] = str;
                objArr[1] = str2;
                if (JZO > 7657) {
                    objArr[2] = activity;
                    ikcuIV(method, false, objArr);
                    return;
                }
                while (true) {
                    int i10 = JZO;
                    int i11 = i10 + 78;
                    if (i11 != 74) {
                        if (i11 == 187) {
                            JZO = i10 * 6370;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    JZO = (JZO >> 72) % 5;
                }
            } else if ((JZO ^ 7658) != 0) {
                while (true) {
                    i2 = JZO;
                    int i12 = i2 + 26;
                    if (i12 == 57) {
                        i3 = (i2 >> 77) % 39;
                        break;
                    } else {
                        if (i12 == 59) {
                            break;
                        }
                        if (i12 != 160) {
                            if (i12 == 169) {
                                JZO = ((i2 % 55) % 58) + i2;
                                break;
                            }
                        }
                        i3 = (JZO + i2) >> 8;
                    }
                }
                i3 = (JZO >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) + i2 + i2;
                while (true) {
                    JZO = i3;
                    i3 = (JZO + i2) >> 8;
                }
            } else {
                while (RvP + 13 != 32) {
                }
                while (true) {
                    RvP = (RvP % 13) >> 14;
                    if ((JZO ^ 7658) != 0) {
                        while (true) {
                            i = JZO;
                            int i13 = i + 39;
                            if (i13 == 75) {
                                break;
                            } else if (i13 == 238) {
                                JZO = (i ^ 3532) * 69;
                            }
                        }
                        JZO = (i ^ 1928) * 51;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fjfviF(String str, String str2, Activity activity) {
        ikcuIV((Method) this.fjfviF, false, str, str2, activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x005b) to fix multi-entry loop: BACK_EDGE: B:24:0x005b -> B:25:0x005d */
    public void htlTjW(String str, String str2, String str3, Activity activity) {
        int i;
        int i2;
        int i3;
        int i4;
        Method method = (Method) this.htlTjW;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        int i5 = JZO;
        if (i5 <= 7657) {
            while (true) {
                int i6 = JZO;
                if (i6 + 117 == 76) {
                    JZO = (i6 * 38) ^ 5496;
                }
            }
        } else {
            if ((RvP ^ 4406) == 0) {
                objArr[1] = str2;
                if ((i5 ^ 7658) != 0) {
                    do {
                        i = JZO;
                    } while (i + 26 != 54);
                    JZO = (i >> 39) ^ 1733;
                }
                objArr[2] = str3;
                objArr[3] = activity;
                ikcuIV(method, false, objArr);
                return;
            }
            if (i5 <= 7657) {
                do {
                    i4 = JZO;
                } while (i4 + 39 != 50);
                while (true) {
                    JZO = ((JZO >> 6) + i4) % 51;
                }
            } else {
                do {
                    i2 = RvP;
                    i3 = i2 + 13;
                    if (i3 == 44) {
                        RvP = ((i2 >> 23) * 60) + i2;
                    } else if (i3 != 92) {
                    }
                    while (true) {
                        RvP = (RvP + i2) % 13;
                    }
                } while (i3 != 280);
                while (true) {
                    RvP = ((RvP >> 91) + i2) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                }
            }
        }
    }
}
