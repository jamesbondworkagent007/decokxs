package QfgSZK;

import QfgSZK.HJWChP;
import android.content.Context;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import org.slf4j.Marker;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class UlpNxW {
    private static final TreeMap<Integer, String> EUNQI;
    private static String OUIFAO = null;
    private static String RGNzur = null;
    public static int Rm_ = 9370;
    private static String dDwsrs;
    public static int dkD;
    private static String hKBSZb;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        dkD = 5513;
        dDwsrs = GCXiNH.fsw("(\"\b\"\u001a");
        OUIFAO = GCXiNH.fsw("(\"\u000f\"\u001a\u0002");
        RGNzur = GCXiNH.fsw("(\"\u000f\"\u0018\u0001");
        hKBSZb = GCXiNH.fsw("(\"\f\"\u0018\u0007");
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        EUNQI = treeMap;
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.sfLRQx), GCXiNH.fsw("(\"\b\"\u001a"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.RFBIQ), GCXiNH.fsw("(\"\b\"\u001a"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.shQVTh), GCXiNH.fsw("(\"\b\"\u001a"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.UfmeqR), GCXiNH.fsw("(\"\b\"\u001a"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.UBjlzv), GCXiNH.fsw("(\"\u000f\"\u001a\u0002"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.ROkxAM), GCXiNH.fsw("(\"\u000f\"\u0018\u0001"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.dXsrqE), GCXiNH.fsw("(\"\u000f\"\u0018\u0001"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.hcDeve), GCXiNH.fsw("(\"\u000f\"\u0018\u0001"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.QGmuNV), GCXiNH.fsw("(\"\u000f\"\u0018\u0001"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.QkjSbJ), GCXiNH.fsw("(\"\u000f\"\u0018\u0001"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.AOWsE), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.dWbSXj), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.gSmTbb), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.mAeqR), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.UIwVdu), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.UEmJHO), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.aDxMKm), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.dUYiGO), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.dspUTZ), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.dGmVXg), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.dkjVRX), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.zXwkVS), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.dSwRaX), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.UkSMuw), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
        treeMap.put(Integer.valueOf(HJWChP.RGtXKC.C0004RGtXKC.lfgLK), GCXiNH.fsw("(\"\f\"\u0018\u0007"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UlpNxW() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static String DXTac(Context context) {
        String strIkIEnW = new HJWChP.URsaBn(context, GCXiNH.fsw("~~V\"L^ny`M\fBDMZH_Q\u001aDWSFF[J"), 128).ikIEnW();
        if (UPbYzn.dTTfOR(strIkIEnW)) {
            return GCXiNH.fsw("=RS~D\\d1").concat(strIkIEnW);
        }
        String strIkIEnW2 = new HJWChP.URsaBn(context, GCXiNH.fsw("~~V\"J_elcAF\r]LJQ_PC"), 128).ikIEnW();
        return UPbYzn.dTTfOR(strIkIEnW2) ? GCXiNH.fsw("=RS~D\\d1").concat(strIkIEnW2) : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:99:0x01c6) to fix multi-entry loop: BACK_EDGE: B:98:0x01c0 -> B:99:0x01c6 */
    public static String gRtANS(ZqidTP zqidTP) {
        String strConcat;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        Context context;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        TreeMap<Integer, String> treeMap = EUNQI;
        int i12 = HJWChP.RGtXKC.DKRTZD.diCPdz;
        String strDXTac = "";
        if (!treeMap.containsKey(Integer.valueOf(i12))) {
            Map.Entry<Integer, String> entryLastEntry = treeMap.lastEntry();
            if (entryLastEntry == null) {
                strConcat = "";
            } else if (dkD <= 5512) {
                while (true) {
                    i2 = dkD;
                    int i13 = i2 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                    if (i13 == 20) {
                        break;
                    }
                    if (i13 == 115) {
                        dkD = (i2 + i2) >> 109;
                        if (Rm_ <= 9369) {
                            do {
                                i3 = Rm_;
                                i4 = i3 + 299;
                                if (i4 == 46) {
                                    while (true) {
                                        Rm_ = ((Rm_ % 83) + i3) % 95;
                                    }
                                }
                            } while (i4 != 92);
                            while (true) {
                                Rm_ = (Rm_ + i3) * 492;
                            }
                        }
                    }
                }
                while (true) {
                    dkD = ((dkD + i2) ^ 1054) * 18;
                }
            } else {
                strConcat = entryLastEntry.getValue().concat(Marker.ANY_NON_NULL_MARKER);
                if (dkD <= 5512) {
                    do {
                        i = dkD;
                    } while (i + 52 != 72);
                    do {
                        dkD = (dkD % 51) + i + i;
                    } while ((Rm_ ^ 9370) == 0);
                    while (true) {
                        int i14 = Rm_;
                        int i15 = i14 + 286;
                        if (i15 == 99) {
                            break;
                        }
                        if (i15 == 183) {
                            Rm_ = ((i14 % 60) >> 18) + i14;
                        }
                    }
                    while (true) {
                        Rm_ = (Rm_ % 54) % 109;
                    }
                }
            }
        } else if ((Rm_ ^ 9370) != 0) {
            do {
                i11 = Rm_ + 26;
                if (i11 == 6) {
                    while (true) {
                        Rm_ = (Rm_ % 45) * 93;
                    }
                }
            } while (i11 != 106);
            while (true) {
                Rm_ = ((Rm_ * 40) % 5) >> 6;
            }
        } else {
            strConcat = treeMap.get(Integer.valueOf(i12));
            if ((dkD ^ 5513) != 0) {
                if (Rm_ <= 9369) {
                    while (Rm_ + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 != 54) {
                    }
                    while (true) {
                        Rm_ = (Rm_ % 1) >> 25;
                    }
                } else {
                    while (true) {
                        int i16 = dkD;
                        int i17 = i16 + 26;
                        if (i17 == 70) {
                            dkD = (i16 * 31) >> 82;
                            break;
                        }
                        if (i17 == 162) {
                            break;
                        }
                    }
                    while (true) {
                        dkD = (dkD * 64) % 76;
                        if (Rm_ <= 9369) {
                            while (true) {
                                int i18 = Rm_;
                                int i19 = i18 + 273;
                                if (i19 != 23) {
                                    if (i19 == 80) {
                                        Rm_ = ((i18 * 69) ^ 1337) % 43;
                                        break;
                                    }
                                    if (i19 == 153) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            Rm_ *= 1148;
                            Rm_ = (Rm_ ^ 5121) >> 78;
                        }
                    }
                }
            }
        }
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (country.isEmpty()) {
            str = language + GCXiNH.fsw("&1");
        } else {
            str = language + "-" + country + GCXiNH.fsw("&1");
            if ((dkD ^ 5513) != 0) {
                while (true) {
                    int i20 = dkD;
                    int i21 = i20 + 78;
                    if (i21 == 83) {
                        dkD = ((i20 % 49) >> 80) % 69;
                        if ((Rm_ ^ 9370) != 0) {
                            do {
                                i9 = Rm_;
                                i10 = i9 + 104;
                                if (i10 != 72) {
                                    if (i10 == 103) {
                                        Rm_ = ((i9 % 95) * 77) ^ 4295;
                                    }
                                }
                                while (true) {
                                    Rm_ = (Rm_ % 101) * 17;
                                }
                            } while (i10 != 254);
                            while (true) {
                                Rm_ = (Rm_ % 125) + i9;
                            }
                        }
                    } else if (i21 == 96) {
                        dkD = (i20 + i20 + i20) * 53;
                        if ((Rm_ ^ 9370) != 0) {
                            do {
                                i8 = Rm_;
                            } while (i8 + 91 != 71);
                            Rm_ = i8 ^ 5591;
                        }
                    }
                }
            }
        }
        String strFsw = GCXiNH.fsw("P~AeG]`19\u0006\u0012\u0003\u0002eAICM\u000f\u0013g\n\u0010nPYNTS]\u0018");
        String strFsw2 = GCXiNH.fsw("41z|[]dIiJiJ^\u0006");
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.gSmTbb) {
            strFsw = GCXiNH.fsw("P~AeG]`19\u0006\u0012\u0003\u0002eAICM\u000f\u0013s_T]QTX\u001b");
            strFsw2 = GCXiNH.fsw("&1Lz\u0002\u0011@n|DGtOKcNB\u001a");
            str = "";
        }
        if (zqidTP != null && (context = zqidTP.Umbazn) != null) {
            strDXTac = DXTac(context);
            if (dkD <= 5512) {
                if ((Rm_ ^ 9370) != 0) {
                    while (true) {
                        i6 = Rm_;
                        int i22 = i6 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                        if (i22 == 61) {
                            i7 = ((i6 + i6) * 80) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                        } else {
                            if (i22 == 228) {
                                break;
                            }
                            if (i22 == 385) {
                                i7 = ((i6 ^ 1426) % 61) * 83;
                            }
                        }
                        Rm_ = i7;
                    }
                    Rm_ = ((i6 + i6) % 3) % 29;
                }
                do {
                    i5 = dkD;
                } while (i5 + 117 != 21);
                while (true) {
                    dkD = ((dkD + i5) % 95) % 64;
                }
            }
        }
        return strFsw + HJWChP.RGtXKC.DKRTZD.RXvltA + GCXiNH.fsw("&1") + str.toLowerCase(Locale.US) + HJWChP.RGtXKC.srURBG + GCXiNH.fsw("=SNeGU.") + HJWChP.RGtXKC.hKzrhT + strFsw2 + strConcat + GCXiNH.fsw("=9pD\u007f|M2,DKHO\toBU^[\u001a\u0012gU]MTSU\u0015\r\u0016\u0007") + strDXTac + GCXiNH.fsw("=\\TnB]d>_IDBX@\u0007") + strConcat + " " + GCXiNH.fsw("%?\u000b!\u0013\t");
    }
}
