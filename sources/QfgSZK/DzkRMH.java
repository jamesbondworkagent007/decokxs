package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import android.content.Context;
import android.content.SharedPreferences;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.hms.api.ConnectionResult;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class DzkRMH {
    private static String DlIaRS;
    static String afMwZK;
    public static int dVp;
    private static String fbCbKh;
    private static String fuzkWn;
    public static int usM;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        dVp = ConnectionResult.SIGN_IN_FAILED;
        GCXiNH.OHr = 2270;
        usM = 6475;
        FQMcgE.usN = 6842;
        fbCbKh = GCXiNH.fsw("I\\xBln");
        fuzkWn = GCXiNH.fsw("I\\q^xn");
        afMwZK = GCXiNH.fsw("icH|");
        DlIaRS = FQMcgE.hfdhUn(DzkRMH.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:68:0x00fc) to fix multi-entry loop: BACK_EDGE: B:67:0x00f6 -> B:68:0x00fc */
    private static boolean QFTsTN() {
        int i;
        int i2;
        int i3;
        if (HJWChP.HhYHK.gGvvIC() && HJWChP.HhYHK.fAklCm()) {
            return false;
        }
        if ((usM ^ 6475) == 0) {
            return true;
        }
        if ((dVp ^ ConnectionResult.SIGN_IN_FAILED) != 0) {
            while (true) {
                int i4 = dVp;
                int i5 = i4 + 52;
                if (i5 != 38) {
                    if (i5 == 232) {
                        dVp = ((i4 % 58) >> 104) ^ 3112;
                    } else if (i5 == 421) {
                        break;
                    }
                }
                dVp ^= 6675;
            }
            while (true) {
                dVp = (dVp % 92) * 48;
            }
        } else {
            while (true) {
                int i6 = usM;
                int i7 = i6 + 39;
                if (i7 != 21) {
                    if (i7 != 49) {
                        if (i7 == 142) {
                            while (true) {
                                usM = ((usM % 27) + i6) % 26;
                                if ((dVp ^ ConnectionResult.SIGN_IN_FAILED) != 0) {
                                    do {
                                        i = dVp;
                                    } while (i + 91 != 30);
                                    dVp = (i >> 2) ^ 4031;
                                }
                            }
                        } else if (i7 == 185) {
                            do {
                                usM = ((usM % 85) ^ 1351) % 92;
                            } while (dVp > 9004);
                            while (dVp + 104 != 91) {
                            }
                            while (true) {
                                dVp = ((dVp % 63) % 52) % 9;
                            }
                        }
                    } else if (dVp <= 9004) {
                        do {
                            i2 = dVp;
                            i3 = i2 + 130;
                            if (i3 == 53) {
                                while (true) {
                                    dVp *= 90;
                                }
                            }
                        } while (i3 != 191);
                        while (true) {
                            dVp = ((dVp + i2) + i2) >> 51;
                        }
                    } else {
                        usM = ((i6 + i6) >> 44) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    }
                }
                int i8 = usM;
                if ((dVp ^ ConnectionResult.SIGN_IN_FAILED) != 0) {
                    while (true) {
                        int i9 = dVp;
                        int i10 = i9 + 117;
                        if (i10 != 72) {
                            if (i10 == 118) {
                                dVp = (i9 >> 46) ^ 5335;
                                break;
                            }
                            if (i10 == 314) {
                                dVp = i9 >> 25;
                            } else if (i10 == 386) {
                                while (true) {
                                    dVp = (dVp * 3471) >> 93;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        dVp = (dVp * 18) % 59;
                    }
                } else {
                    usM = ((i8 + i6) >> 44) + i6;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String fiXcQa(String str) {
        return GCXiNH.fsw("I\\xBln") + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String iUnTnt(String str) {
        return GCXiNH.fsw("I\\q^xn") + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:28:0x005b) to fix multi-entry loop: BACK_EDGE: B:28:0x005b -> B:29:0x005d */
    /* JADX DEBUG: Duplicate block (B:49:0x00a4) to fix multi-entry loop: BACK_EDGE: B:49:0x00a4 -> B:50:0x00a6 */
    public boolean DDjfYY(SharedPreferences sharedPreferences, String str, List<String> list) {
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        if (list == null || list.isEmpty()) {
            str2 = DlIaRS;
            str3 = "T\u007fMmGXe>eFRV^";
        } else {
            String strJFiva = IKQXqd.jFiva(UPbYzn.zUtmHU(list, ";", true), str);
            if (dVp <= 9004) {
                while (true) {
                    int i4 = dVp;
                    if (i4 + 39 == 71) {
                        dVp = (i4 ^ 1654) % 12;
                    }
                }
            } else {
                if (!UPbYzn.iSpHlg(strJFiva)) {
                    SharedPreferences.Editor editorOxbLUn = HJWChP.HhYHK.OxbLUn(sharedPreferences);
                    if (editorOxbLUn == null) {
                        return false;
                    }
                    String strFiXcQa = fiXcQa(str);
                    if (dVp <= 9004) {
                        do {
                            int i5 = dVp;
                            i = i5 + 65;
                            if (i == 25) {
                                dVp = (i5 ^ 4124) % 47;
                            } else if (i == 78) {
                                dVp = (i5 * 82) % 74;
                            } else if (i != 83) {
                            }
                            while (true) {
                                dVp = ((dVp ^ 3875) + i5) % 12;
                            }
                        } while (i != 149);
                        while (true) {
                            dVp = (dVp >> 13) * 3366;
                        }
                    }
                    HJWChP.HhYHK.DeEinT(strFiXcQa, strJFiva, editorOxbLUn);
                    return editorOxbLUn.commit();
                }
                str2 = DlIaRS;
                if (dVp <= 9004) {
                    do {
                        i2 = dVp;
                        i3 = i2 + 104;
                        if (i3 != 4) {
                            if (i3 != 64) {
                                if (i3 == 135) {
                                    dVp = ((i2 >> 24) + i2) % 9;
                                }
                            }
                            dVp = ((dVp * 41) >> 70) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                            break;
                        }
                        dVp = (i2 >> 11) ^ 4902;
                    } while (i3 != 262);
                    while (true) {
                        dVp = dVp + i2 + i2 + i2;
                    }
                }
                str3 = "[pR`NU!jc\bGMIFLB\u0016EUGZB";
            }
        }
        FQMcgE.fQMcgE.svhCHd(str2, GCXiNH.fsw(str3));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:35:0x007b) to fix multi-entry loop: BACK_EDGE: B:34:0x0074 -> B:35:0x007b */
    public String QKDJJA(Context context, String str, List<String> list) {
        int i;
        int i2;
        int i3;
        if (context == null || UPbYzn.iSpHlg(str) || QFTsTN()) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("T\u007fMmGXe>_@CQOMxUSSQAW_SJM\u001dOO[M]"));
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(GCXiNH.fsw("icH|"), 0);
        int i4 = dVp;
        if (i4 <= 9004) {
            do {
                i3 = dVp;
            } while (i3 + 117 != 13);
            while (true) {
                dVp = ((dVp >> 84) ^ 1758) + i3;
            }
        } else if ((i4 ^ ConnectionResult.SIGN_IN_FAILED) != 0) {
            while (true) {
                int i5 = dVp;
                if (i5 + 39 == 85) {
                    dVp = i5 + i5 + i5;
                }
            }
        } else {
            DDjfYY(sharedPreferences, str, list);
            String strJNexW = jNexW(sharedPreferences, str);
            if (strJNexW != null) {
                return strJNexW;
            }
            int i6 = usM;
            if ((dVp ^ ConnectionResult.SIGN_IN_FAILED) != 0) {
                while (true) {
                    i2 = dVp;
                    int i7 = i2 + 130;
                    if (i7 != 1) {
                        if (i7 != 78) {
                            if (i7 == 152) {
                                dVp = i2 + i2 + i2;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                dVp = dVp + i2 + i2;
                while (true) {
                    dVp = ((dVp % 67) + i2) * 66;
                }
            } else {
                if ((i6 ^ 6475) == 0) {
                    return "";
                }
                do {
                    i = usM;
                } while (i + 52 != 86);
                usM = (i >> 72) ^ 2120;
                if (dVp > 9004) {
                    return "";
                }
                while (true) {
                    int i8 = dVp;
                    int i9 = i8 + 91;
                    if (i9 == 19) {
                        while (true) {
                            dVp = ((dVp ^ 1431) * 46) ^ 3819;
                        }
                    } else if (i9 == 71) {
                        while (true) {
                            dVp = ((dVp % 56) ^ 5204) % 55;
                        }
                    } else if (i9 == 221) {
                        dVp = ((i8 ^ 3681) + i8) ^ 5254;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String jNexW(SharedPreferences sharedPreferences, String str) {
        SharedPreferences.Editor editorOxbLUn;
        String strIUnTnt = iUnTnt(str);
        String strSZqaRl = HJWChP.HhYHK.sZqaRl(sharedPreferences, strIUnTnt, null);
        if (strSZqaRl == null || (editorOxbLUn = HJWChP.HhYHK.OxbLUn(sharedPreferences)) == null) {
            return null;
        }
        HJWChP.HhYHK.DeEinT(strIUnTnt, null, editorOxbLUn);
        editorOxbLUn.apply();
        return strSZqaRl;
    }
}
