package QfgSZK;

import QfgSZK.HJWChP;
import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class SlnMSS extends QhsCdE {
    public static int CTq;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String DRIWdP;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String OmpQPG;
    public static int OnS;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String UJdzUJ;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String aGikij;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String fHctFR;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String sGPepg;
    String fzWcWG;
    String sqbdZi;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        OnS = 6371;
        CTq = 3210;
        GCXiNH.OHr = 2270;
        DdI(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SlnMSS(long j, boolean z) {
        super(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:33:0x007b) to fix multi-entry loop: BACK_EDGE: B:32:0x0075 -> B:33:0x007b */
    public static /* synthetic */ void DdI(boolean z) {
        int i;
        int i2;
        int i3;
        if (z) {
            DdI(false);
        }
        String strFsw = GCXiNH.fsw("e)\rS\u001d\u0005");
        if (OnS <= 6370) {
            while (true) {
                i2 = OnS;
                int i4 = i2 + 39;
                if (i4 != 12) {
                    if (i4 == 41) {
                        break;
                    }
                    if (i4 == 111) {
                        i3 = ((i2 >> 46) ^ 1261) >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                        OnS = i3;
                    } else if (i4 == 244) {
                        OnS = (i2 * 73) + i2 + i2;
                    }
                }
                i3 = ((OnS * 28) % 90) * 123;
                OnS = i3;
            }
            OnS = ((i2 * 88) % 108) % 36;
        }
        aGikij = strFsw;
        sGPepg = GCXiNH.fsw("e)\r");
        if (OnS <= 6370) {
            while (true) {
                int i5 = OnS;
                int i6 = i5 + 26;
                if (i6 == 50) {
                    OnS = ((i5 % 19) * 124) ^ 2721;
                } else {
                    if (i6 == 189) {
                        break;
                    }
                    if (i6 == 309) {
                        while (true) {
                            OnS = ((OnS % 65) * 56) + i5;
                        }
                    } else if (i6 == 344) {
                        OnS = ((OnS ^ 3400) * 84) >> 98;
                        break;
                    }
                }
            }
            while (true) {
                OnS ^= 54;
                OnS = ((OnS ^ 3400) * 84) >> 98;
            }
        } else {
            fHctFR = GCXiNH.fsw("|cV:\u001f\u001crwa]NB^FZ");
            DRIWdP = GCXiNH.fsw("~aNSJSh$");
            if ((OnS ^ 6371) == 0) {
                OmpQPG = GCXiNH.fsw("t\"\u0003:");
                UJdzUJ = GCXiNH.fsw("|cXd\u0011");
                return;
            }
            while (true) {
                int i7 = OnS;
                int i8 = i7 + 52;
                if (i8 == 69) {
                    i = (i7 + i7 + i7) * 98;
                } else if (i8 == 122) {
                    i = (i7 >> 74) + i7;
                } else if (i8 == 132) {
                    break;
                }
                OnS = i;
            }
            while (true) {
                OnS >>= 119;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(AhwBna.EM_PATH_COUNT.DbNXlk(), this.fzWcWG);
        map.put(AhwBna.EM_PATH_STR.DbNXlk(), UPbYzn.RgaQzq(this.sqbdZi, 1024));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:12:0x0026) to fix multi-entry loop: BACK_EDGE: B:11:0x001f -> B:12:0x0026 */
    /* JADX DEBUG: Duplicate block (B:70:0x00f0) to fix multi-entry loop: BACK_EDGE: B:69:0x00ea -> B:70:0x00f0 */
    public String ibrGus() {
        String[] strArr;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = HJWChP.RGtXKC.OhTeiS;
        if ((OnS ^ 6371) == 0) {
            if (zMXLsR(str)) {
                return str;
            }
            String str2 = HJWChP.RGtXKC.iOwuVQ;
            if (OnS <= 6370) {
                while (true) {
                    i5 = OnS;
                    int i7 = i5 + 26;
                    if (i7 == 10) {
                        break;
                    }
                    if (i7 != 13) {
                        if (i7 == 151) {
                            OnS = (i5 * 43) % 121;
                            break;
                        }
                    } else {
                        while (true) {
                            OnS = ((OnS * 81) % 68) % 80;
                        }
                    }
                }
                OnS = (OnS + i5) * 32;
            }
            if (zMXLsR(str2)) {
                return str2;
            }
            if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.gSmTbb && (strArr = HJWChP.RGtXKC.RBPaJJ) != null && strArr.length != 0) {
                for (String str3 : strArr) {
                    if ((CTq ^ 3210) != 0) {
                        if (OnS <= 6370) {
                            while (true) {
                                i2 = OnS;
                                int i8 = i2 + 104;
                                if (i8 != 47) {
                                    if (i8 == 130) {
                                        break;
                                    }
                                    if (i8 == 156) {
                                        OnS = ((i2 % 21) % 55) >> 54;
                                    }
                                }
                                OnS ^= 3549;
                            }
                            OnS = (i2 * 244) + i2;
                        }
                        while (CTq + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 7) {
                        }
                        do {
                            CTq = (CTq * 73) % 92;
                        } while (OnS > 6370);
                        while (true) {
                            i = OnS;
                            int i9 = i + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                            if (i9 == 51) {
                                break;
                            }
                            if (i9 == 177) {
                                OnS = (i * 21) >> 118;
                                break;
                            }
                            if (i9 == 295) {
                                break;
                            }
                        }
                        OnS = ((OnS + i) % WebSocketProtocol.PAYLOAD_SHORT) ^ 4923;
                        while (true) {
                            OnS = (OnS * 125) % 9;
                        }
                    } else {
                        if ((OnS ^ 6371) != 0) {
                            do {
                                i3 = OnS;
                                i4 = i3 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                if (i4 == 30) {
                                    while (true) {
                                        OnS = ((OnS % 71) >> 63) + i3;
                                    }
                                }
                            } while (i4 != 48);
                            while (true) {
                                OnS = ((OnS + i3) ^ 3388) % 52;
                            }
                        } else {
                            if (zMXLsR(str3)) {
                                return str3;
                            }
                        }
                    }
                }
            }
            return null;
        }
        while (true) {
            i6 = OnS;
            int i10 = i6 + 13;
            if (i10 == 3) {
                break;
            }
            if (i10 != 52) {
                if (i10 == 57) {
                    OnS = ((OnS * 54) ^ 4656) % 82;
                    break;
                }
            } else {
                while (true) {
                    OnS = OnS + i6 + i6;
                }
            }
        }
        while (true) {
            OnS = (OnS * 7888) + i6;
            OnS = ((OnS * 54) ^ 4656) % 82;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_EMULATOR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean zMXLsR(String str) {
        if (!aGikij.equals(str) && !sGPepg.equals(str) && !OmpQPG.equals(str)) {
            String str2 = fHctFR;
            if ((OnS ^ 6371) != 0) {
                while (true) {
                    int i = OnS;
                    int i2 = i + 39;
                    if (i2 == 69) {
                        OnS = (i % 10) % 16;
                        break;
                    }
                    if (i2 != 115) {
                        if (i2 != 299) {
                            if (i2 == 381) {
                                OnS = (i ^ 4574) * 6;
                            }
                        }
                        OnS = (OnS ^ 5554) + i;
                    } else {
                        while (true) {
                            OnS = ((OnS * 17) + i) % 98;
                        }
                    }
                }
            }
            if (!str2.equals(str)) {
                return false;
            }
        }
        if (OnS > 6370) {
            return true;
        }
        while (OnS + 78 != 65) {
        }
        while (true) {
            OnS >>= 103;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        ArrayList arrayList = new ArrayList(2);
        String strIbrGus = ibrGus();
        if (strIbrGus != null) {
            arrayList.add(DRIWdP + strIbrGus);
        }
        String strIZzfmt = AxsJAY.uzCIH().iZzfmt();
        if (strIZzfmt != null && zMXLsR(strIZzfmt)) {
            arrayList.add(UJdzUJ + strIZzfmt);
        }
        if (qSusPL.aPFruk() != null && qSusPL.gBtXYZ() != null && !qSusPL.gBtXYZ().gWqxQL.isEmpty()) {
            arrayList.addAll(DGUQLI.fZBcTu(qSusPL.aPFruk(), qSusPL.gBtXYZ().gWqxQL));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.fzWcWG = String.valueOf(arrayList.size());
        this.sqbdZi = UPbYzn.zUtmHU(arrayList, ";", true);
    }
}
