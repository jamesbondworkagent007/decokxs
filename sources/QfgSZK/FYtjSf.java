package QfgSZK;

import QfgSZK.AuCTel;
import QfgSZK.FQMcgE;
import QfgSZK.GQzpsZ;
import QfgSZK.HJWChP;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class FYtjSf {
    public static int CGG = 0;
    private static String DWEiFI = null;
    private static String DlIaRS = null;
    private static String OqOWks = null;
    private static String RLaLZr = null;
    private static String gJjPaY = null;
    private static String gjElmd = null;
    private static String spDZvi = null;
    public static int ure = 8728;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        FQMcgE.usN = 6842;
        CGG = 1916;
        GCXiNH.OHr = 2270;
        RLaLZr = GCXiNH.fsw("Jx]exR`p");
        gJjPaY = GCXiNH.fsw("NtXyYXugXQRF");
        gjElmd = GCXiNH.fsw("JAz");
        String strFsw = GCXiNH.fsw("JAz,h^ln`ACM^");
        if (ure > 8727) {
            DWEiFI = strFsw;
            spDZvi = GCXiNH.fsw("JTk");
            OqOWks = GCXiNH.fsw("Ra^b");
            DlIaRS = FQMcgE.hfdhUn(FYtjSf.class);
            return;
        }
        while (true) {
            int i = ure;
            int i2 = i + 13;
            if (i2 == 8) {
                break;
            } else if (i2 == 33) {
                ure = ((i % 73) * 91) % 37;
            }
        }
        while (true) {
            ure = ((ure >> 30) ^ 5208) >> 105;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FYtjSf() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void DuXjdv(Context context) {
        int i;
        int i2;
        HJWChP.OZOJIj oZOJIj = new HJWChP.OZOJIj(context);
        if (HJWChP.DXdlte.gdLjtZ() && oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001apzp~h{bkr|pgdrDPF"), context.getPackageName())) {
            try {
                WifiManager wifiManagerGbIfDn = gbIfDn(context);
                if (wifiManagerGbIfDn != null) {
                    wifiManagerGbIfDn.startScan();
                }
            } catch (SecurityException e) {
                DwQSDd.glVQsU(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001apzp~h{bkr|pgdrDPF"), DlIaRS);
                ORrpqH.uzCIH().seuMaA(e);
                if ((CGG ^ 1916) != 0) {
                    while (true) {
                        int i3 = CGG;
                        int i4 = i3 + 13;
                        if (i4 == 17) {
                            CGG = ((i3 + i3) ^ 4323) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                            if ((ure ^ 8728) == 0) {
                                return;
                            }
                        } else if (i4 == 89) {
                            CGG = (i3 >> 37) * 7221;
                            if (ure > 8727) {
                                return;
                            }
                        }
                    }
                    do {
                        i = ure;
                        i2 = i + 13;
                        if (i2 == 18) {
                            while (true) {
                                ure = (ure ^ 4808) >> CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384;
                            }
                        } else if (i2 == 198) {
                            while (true) {
                                ure = (ure * 94) >> 95;
                            }
                        }
                    } while (i2 != 279);
                    ure = (i + i) % 25;
                }
            } catch (Exception e2) {
                FQMcgE.OijiEz(DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:66:0x00fd) to fix multi-entry loop: BACK_EDGE: B:66:0x00fd -> B:65:0x00fb */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00fb, code lost:
    
        r7 = (QfgSZK.FYtjSf.ure * 36) ^ 3123;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] GFUIi(Context context) {
        int i;
        int i2;
        int i3;
        String strSVvuFk = null;
        if (!HJWChP.DXdlte.hcetpZ()) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(GCXiNH.fsw("|\u007f_~DXe0bMV\rIFFI\u0018v{}|ts{wkuocf{\u007fgKCF"));
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver == null) {
            return null;
        }
        String[] strArr = new String[5];
        int intExtra = intentRegisterReceiver.getIntExtra(GCXiNH.fsw("stO{DCjJuXG"), -99);
        Bundle extras = intentRegisterReceiver.getExtras();
        if (extras == null) {
            return null;
        }
        NetworkInfo networkInfo = (NetworkInfo) extras.get(GCXiNH.fsw("stO{DCjWbNM"));
        if (networkInfo != null) {
            if (networkInfo.getState() != NetworkInfo.State.CONNECTED) {
                return null;
            }
            if (intExtra == -99) {
                try {
                    intExtra = networkInfo.getType();
                } catch (SecurityException e) {
                    e = e;
                    DwQSDd.glVQsU(e, DlIaRS);
                    ORrpqH.uzCIH().seuMaA(e);
                    return null;
                } catch (Exception e2) {
                    e = e2;
                    FQMcgE.OijiEz(DlIaRS, e.toString());
                    ORrpqH.uzCIH().seuMaA(e);
                    return null;
                }
            }
        }
        String strGVEiQJ = gVEiQJ(intExtra);
        strArr[3] = strGVEiQJ;
        if (strGVEiQJ == null) {
            return null;
        }
        if (strGVEiQJ.equals(GQzpsZ.gQzpsZ.WIFI.getValue())) {
            if (networkInfo != null) {
                strSVvuFk = sVvuFk(networkInfo.getExtraInfo());
            } else if (CGG <= 1915) {
                if (ure > 8727) {
                    while (true) {
                        int i4 = CGG;
                        int i5 = i4 + 117;
                        if (i5 != 63) {
                            if (i5 == 89) {
                                CGG = ((i4 + i4) * 86) >> 60;
                            } else if (i5 != 156) {
                                continue;
                            }
                            CGG = (CGG + i4) * 60;
                            if ((ure ^ 8728) != 0) {
                                break;
                            }
                        } else {
                            do {
                                CGG *= 2880;
                            } while (ure > 8727);
                            while (true) {
                                int i6 = ure;
                                int i7 = i6 + 221;
                                if (i7 == 85) {
                                    break;
                                }
                                if (i7 != 257) {
                                    if (i7 == 426) {
                                        ure = (i6 ^ 4934) + i6;
                                        break;
                                    }
                                    if (i7 == 531) {
                                        ure = ((i6 % 94) + i6) >> 68;
                                        break;
                                    }
                                }
                                i3 = (ure * 36) ^ 3123;
                            }
                            i3 = (ure % 19) ^ 2427;
                            while (true) {
                                ure = i3;
                                i3 = (ure * 36) ^ 3123;
                            }
                        }
                    }
                }
                while (ure + 130 != 67) {
                }
                while (true) {
                    ure = ((ure ^ 2173) % 31) >> 14;
                }
            }
            String strFMBJsc = fMBJsc((String) extras.get(GCXiNH.fsw("\u007fbHeO")));
            if (strFMBJsc != null) {
                strArr[0] = strFMBJsc;
            }
            if (strSVvuFk != null) {
                strArr[1] = strSVvuFk;
            }
            if (CGG <= 1915) {
                if ((ure ^ 8728) != 0) {
                    do {
                        i2 = ure;
                    } while (i2 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 != 61);
                    while (true) {
                        ure = ((ure ^ 3462) + i2) ^ 3907;
                    }
                } else {
                    while (true) {
                        i = CGG;
                        int i8 = i + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                        if (i8 == 98) {
                            CGG = ((i >> 14) + i) % 41;
                            break;
                        }
                        if (i8 == 283) {
                            break;
                        }
                    }
                    do {
                        CGG = ((CGG % 79) ^ 3173) + i;
                    } while ((ure ^ 8728) == 0);
                    while (ure + 208 != 9) {
                    }
                    while (true) {
                        ure = (ure ^ 3300) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                    }
                }
            }
        } else if (strArr[3].equals(GQzpsZ.gQzpsZ.VPN.getValue())) {
            strArr[4] = GCXiNH.fsw("icNi");
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:97:0x01b8) to fix multi-entry loop: BACK_EDGE: B:97:0x01b8 -> B:96:0x01b6 */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b6, code lost:
    
        r11 = ((QfgSZK.FYtjSf.ure % 40) >> 125) % 34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Map<String, String> NRYds(Context context, String str) {
        WifiManager wifiManagerGbIfDn;
        int i;
        int i2;
        int i3;
        String strFsw;
        String str2;
        String strFsw2;
        HJWChP.OZOJIj oZOJIj = new HJWChP.OZOJIj(context);
        if (!HJWChP.DXdlte.aappFQ() || !oZOJIj.RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbkr|pgdrDPF"), context.getPackageName()) || (wifiManagerGbIfDn = gbIfDn(context)) == null) {
            return null;
        }
        List<ScanResult> scanResults = wifiManagerGbIfDn.getScanResults();
        StringBuilder sb = new StringBuilder(scanResults.size() * 30);
        HashMap map = new HashMap(2);
        try {
            boolean z = true;
            for (ScanResult scanResult : scanResults) {
                String strFMBJsc = fMBJsc(scanResult.BSSID);
                if (strFMBJsc != null) {
                    if (strFMBJsc.equals(str)) {
                        String str3 = scanResult.capabilities;
                        if (str3.contains(GCXiNH.fsw("JAz"))) {
                            strFsw = GCXiNH.fsw("NtXyYXugXQRF");
                            str2 = "JAz,h^ln`ACM^";
                        } else if (str3.contains(GCXiNH.fsw("JTk"))) {
                            strFsw = GCXiNH.fsw("NtXyYXugXQRF");
                            strFsw2 = GCXiNH.fsw("JTk");
                            map.put(strFsw, strFsw2);
                        } else {
                            strFsw = GCXiNH.fsw("NtXyYXugXQRF");
                            str2 = "Ra^b";
                        }
                        strFsw2 = GCXiNH.fsw(str2);
                        map.put(strFsw, strFsw2);
                    } else {
                        if (z) {
                            z = false;
                        } else {
                            sb.append(":");
                        }
                        sb.append(strFMBJsc.replace(":", ""));
                        sb.append(";");
                        sb.append(scanResult.level);
                    }
                }
            }
            map.put(GCXiNH.fsw("Jx]exR`p"), sb.toString());
            return map;
        } catch (SecurityException e) {
            DwQSDd.glVQsU(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbkr|pgdrDPF"), DlIaRS);
            ORrpqH.uzCIH().seuMaA(e);
            if ((CGG ^ 1916) != 0) {
                if (ure > 8727) {
                    while (true) {
                        int i4 = CGG;
                        int i5 = i4 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                        if (i5 == 46) {
                            CGG = ((i4 ^ 1652) % 37) * 107;
                            if (ure <= 8727) {
                                break;
                            }
                        } else if (i5 == 201) {
                            CGG = (i4 % 2) ^ 4838;
                            if ((ure ^ 8728) != 0) {
                                while (true) {
                                    int i6 = ure;
                                    int i7 = i6 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                    if (i7 == 10) {
                                        while (true) {
                                            ure = (ure * 70) >> 9;
                                        }
                                    } else if (i7 == 209) {
                                        while (true) {
                                            ure = (ure * 2) % 7;
                                        }
                                    } else {
                                        if (i7 == 319) {
                                            ure = ((i6 >> 89) ^ 2660) % 50;
                                            break;
                                        }
                                        if (i7 == 363) {
                                            ure = i6 >> 90;
                                        }
                                    }
                                }
                            }
                        } else if (i5 == 212) {
                            CGG = ((i4 * 45) % 104) ^ 4958;
                        } else if (i5 == 230) {
                            do {
                                CGG = (CGG + i4) ^ 1212;
                            } while ((ure ^ 8728) == 0);
                            while (true) {
                                i2 = ure;
                                int i8 = i2 + 234;
                                if (i8 != 94) {
                                    if (i8 != 249) {
                                        if (i8 == 406) {
                                            break;
                                        }
                                    } else {
                                        i3 = ((i2 >> 86) + i2) % 118;
                                    }
                                } else {
                                    i3 = (i2 >> CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256) + i2;
                                }
                                ure = i3;
                            }
                            while (true) {
                                ure = ((ure >> 57) + i2) >> WalletImportError.ERROR_CODE_AA_EXIST;
                            }
                        }
                    }
                }
                while (true) {
                    int i9 = ure;
                    int i10 = i9 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                    if (i10 == 2) {
                        ure = (i9 + i9) >> 7;
                        break;
                    }
                    if (i10 != 170) {
                        if (i10 != 324) {
                            if (i10 == 460) {
                                break;
                            }
                        } else {
                            while (true) {
                                ure = ((ure % 40) + i9) >> 99;
                            }
                        }
                    }
                    i = ((ure % 40) >> 125) % 34;
                }
                i = ure ^ 4967;
                while (true) {
                    ure = i;
                    i = ((ure % 40) >> 125) % 34;
                }
            }
            return null;
        } catch (Exception e2) {
            FQMcgE.OijiEz(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String UJEglR(String str) {
        if (UPbYzn.iSpHlg(str)) {
            return null;
        }
        String strTrim = str.trim();
        if (UPbYzn.iSpHlg(strTrim)) {
            return null;
        }
        String lowerCase = strTrim.toLowerCase(Locale.US);
        if (lowerCase.startsWith(GCXiNH.fsw("ihKi"))) {
            lowerCase = lowerCase.replaceFirst(GCXiNH.fsw("ihKi"), "");
        }
        return lowerCase.replace("_", " ").trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String[] dlRikr(Context context) {
        int i;
        String strSVvuFk;
        if (HJWChP.DXdlte.iLWfRf() && new HJWChP.OZOJIj(context).RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbkr|pgdrDPF"), context.getPackageName())) {
            try {
                WifiManager wifiManagerGbIfDn = gbIfDn(context);
                if (wifiManagerGbIfDn == null) {
                    return null;
                }
                WifiInfo connectionInfo = wifiManagerGbIfDn.getConnectionInfo();
                String strFMBJsc = fMBJsc(connectionInfo.getBSSID());
                if (strFMBJsc == null || (strSVvuFk = sVvuFk(connectionInfo.getSSID())) == null) {
                    return null;
                }
                int rssi = connectionInfo.getRssi();
                String[] strArr = new String[5];
                strArr[0] = strFMBJsc;
                strArr[1] = strSVvuFk;
                strArr[2] = String.valueOf(rssi);
                strArr[3] = GQzpsZ.gQzpsZ.WIFI.getValue();
                return strArr;
            } catch (SecurityException e) {
                DwQSDd.glVQsU(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbkr|pgdrDPF"), DlIaRS);
                ORrpqH.uzCIH().seuMaA(e);
                if ((ure ^ 8728) != 0) {
                    do {
                        i = ure;
                    } while (i + 26 != 56);
                    ure = ((i + i) * 41) >> 5;
                }
            } catch (Exception e2) {
                FQMcgE.OijiEz(DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String fMBJsc(String str) {
        if (UPbYzn.iSpHlg(str)) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:54:0x00af) to fix multi-entry loop: BACK_EDGE: B:54:0x00af -> B:55:0x00b1 */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b1, code lost:
    
        QfgSZK.FYtjSf.ure *= 6675;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String gVEiQJ(int i) {
        GQzpsZ.gQzpsZ gqzpsz;
        int i2;
        int i3;
        if (i == -99) {
            return null;
        }
        if (i == 4) {
            gqzpsz = GQzpsZ.gQzpsZ.MOBILE_DUN;
        } else if (i == 7) {
            gqzpsz = GQzpsZ.gQzpsZ.BLUETOOTH;
        } else if (i == 9) {
            gqzpsz = GQzpsZ.gQzpsZ.ETHERNET;
        } else if (i == 0) {
            gqzpsz = GQzpsZ.gQzpsZ.CELLULAR;
        } else if (i == 1) {
            gqzpsz = GQzpsZ.gQzpsZ.WIFI;
        } else {
            if (HJWChP.RGtXKC.DKRTZD.diCPdz < HJWChP.RGtXKC.C0004RGtXKC.gSmTbb || !SdSTJp.RZOtbZ(i)) {
                Field[] fieldArrHDKMBd = AuCTel.hDKMBd(AuCTel.wlaJM(AuCTel.auCTel.CONNECTIVITY_MANAGER));
                if (fieldArrHDKMBd == null) {
                    return null;
                }
                int length = fieldArrHDKMBd.length;
                int i4 = 0;
                while (i4 < length) {
                    Field field = fieldArrHDKMBd[i4];
                    if (field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers())) {
                        try {
                            if (field.getInt(null) == i) {
                                String name = field.getName();
                                if (UPbYzn.dTTfOR(name) && name.startsWith(GCXiNH.fsw("IHkIt"))) {
                                    return UJEglR(name);
                                }
                            }
                            if (CGG <= 1915) {
                                do {
                                    i3 = CGG;
                                } while (i3 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 15);
                                do {
                                    CGG = ((CGG + i3) >> 28) * 61;
                                } while (ure > 8727);
                                while (true) {
                                    int i5 = ure;
                                    int i6 = i5 + 208;
                                    if (i6 == 25) {
                                        ure = (i5 * 47) >> 190;
                                        break;
                                    }
                                    if (i6 == 45) {
                                        ure = (i5 >> 21) % 11;
                                    } else {
                                        if (i6 == 217) {
                                            break;
                                        }
                                        if (i6 == 383) {
                                            break;
                                        }
                                    }
                                }
                                while (true) {
                                    ure = ((ure >> 109) % 4) ^ 4825;
                                }
                            }
                        } catch (Throwable th) {
                            ORrpqH.uzCIH().seuMaA(th);
                        }
                    }
                    i4++;
                    if ((CGG ^ 1916) != 0) {
                        if ((ure ^ 8728) != 0) {
                            do {
                                i2 = ure;
                            } while (i2 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 != 14);
                            while (true) {
                                ure = (ure + i2) * 742;
                            }
                        } else {
                            while (CGG + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 94) {
                            }
                            while (true) {
                                CGG = ((CGG * 2) % 56) ^ 1869;
                            }
                        }
                    }
                }
                return null;
            }
            gqzpsz = GQzpsZ.gQzpsZ.VPN;
        }
        return gqzpsz.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static WifiManager gbIfDn(Context context) {
        Object systemService = context.getApplicationContext().getSystemService(GCXiNH.fsw("jx]e"));
        if (systemService instanceof WifiManager) {
            return (WifiManager) systemService;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:33:0x008b) to fix multi-entry loop: BACK_EDGE: B:33:0x008b -> B:34:0x008d */
    public static String[] hbZCHz(Context context) {
        int i;
        if (!HJWChP.DXdlte.dXcUrg()) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(GCXiNH.fsw("|\u007f_~DXe0bMV\r]@NN\u0018f`rftolv|r|\u007f"));
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver == null) {
            return null;
        }
        String[] strArr = new String[5];
        WifiInfo wifiInfo = (WifiInfo) intentRegisterReceiver.getParcelableExtra(GCXiNH.fsw("jx]eb_gq"));
        if (wifiInfo != null) {
            String strFMBJsc = fMBJsc(wifiInfo.getBSSID());
            String strSVvuFk = sVvuFk(wifiInfo.getSSID());
            int rssi = wifiInfo.getRssi();
            if (strFMBJsc != null) {
                strArr[0] = strFMBJsc;
            }
            if (strSVvuFk != null) {
                strArr[1] = strSVvuFk;
            }
            strArr[2] = String.valueOf(rssi);
            strArr[3] = GQzpsZ.gQzpsZ.WIFI.getValue();
            if ((strArr[0] == null || strArr[1] == null || strArr[2] == null) && (ure ^ 8728) != 0) {
                while (true) {
                    i = ure;
                    int i2 = i + 91;
                    if (i2 == 99) {
                        ure = (i ^ 6550) + i;
                        break;
                    }
                    if (i2 == 166) {
                        break;
                    }
                    if (i2 == 241) {
                        ure = ((i + i) % 43) % 124;
                    }
                }
                while (true) {
                    ure = ((ure + i) % 21) % 97;
                }
            }
        } else {
            Bundle extras = intentRegisterReceiver.getExtras();
            NetworkInfo networkInfo = (NetworkInfo) extras.get(GCXiNH.fsw("stO{DCjWbNM"));
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                String strSVvuFk2 = sVvuFk(networkInfo.getExtraInfo());
                String strFMBJsc2 = fMBJsc((String) extras.get(GCXiNH.fsw("\u007fbHeO")));
                if (strFMBJsc2 != null) {
                    strArr[0] = strFMBJsc2;
                }
                if (strSVvuFk2 != null) {
                    strArr[1] = strSVvuFk2;
                }
                strArr[3] = GQzpsZ.gQzpsZ.WIFI.getValue();
            }
        }
        return strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:34:0x0074) to fix multi-entry loop: BACK_EDGE: B:34:0x0074 -> B:35:0x007e */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.String sVvuFk(java.lang.String r5) {
        /*
            if (r5 == 0) goto L99
            java.lang.String r0 = "h\u007fPbDFo>\u007f[KG"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L99
            int r0 = r5.length()
            r1 = 1
            if (r0 >= r1) goto L17
            goto L99
        L17:
            r0 = 0
            char r2 = r5.charAt(r0)
            r3 = 34
            if (r2 != r3) goto L24
            java.lang.String r5 = r5.substring(r1)
        L24:
            int r2 = r5.length()
            if (r2 < r1) goto L92
            int r2 = r5.length()
            int r4 = QfgSZK.FYtjSf.CGG
            r4 = r4 ^ 1916(0x77c, float:2.685E-42)
            if (r4 == 0) goto L46
        L34:
            int r5 = QfgSZK.FYtjSf.CGG
            int r5 = r5 + 78
            r0 = 18
            if (r5 == r0) goto L3d
            goto L34
        L3d:
            int r5 = QfgSZK.FYtjSf.CGG
            int r5 = r5 % 110
            int r5 = r5 * 111
            QfgSZK.FYtjSf.CGG = r5
            goto L3d
        L46:
            int r2 = r2 - r1
            char r2 = r5.charAt(r2)
            if (r2 != r3) goto L92
            int r2 = QfgSZK.FYtjSf.ure
            r3 = 8727(0x2217, float:1.2229E-41)
            if (r2 > r3) goto L89
        L53:
            int r5 = QfgSZK.FYtjSf.ure
            int r0 = r5 + 156
            r1 = 24
            if (r0 == r1) goto L74
            r1 = 195(0xc3, float:2.73E-43)
            if (r0 == r1) goto L6f
            r5 = 284(0x11c, float:3.98E-43)
            if (r0 == r5) goto L68
            r5 = 333(0x14d, float:4.67E-43)
            if (r0 == r5) goto L7e
            goto L53
        L68:
            int r5 = QfgSZK.FYtjSf.ure
            r5 = r5 ^ 2080(0x820, float:2.915E-42)
            QfgSZK.FYtjSf.ure = r5
            goto L68
        L6f:
            int r5 = r5 * 67
            int r5 = r5 >> 44
            goto L86
        L74:
            int r5 = QfgSZK.FYtjSf.ure
            int r5 = r5 * 23
            r5 = r5 ^ 5395(0x1513, float:7.56E-42)
            int r5 = r5 >> 7
            QfgSZK.FYtjSf.ure = r5
        L7e:
            int r5 = QfgSZK.FYtjSf.ure
            r5 = r5 ^ 1800(0x708, float:2.522E-42)
            int r5 = r5 * 41
            r5 = r5 ^ 2572(0xa0c, float:3.604E-42)
        L86:
            QfgSZK.FYtjSf.ure = r5
            goto L74
        L89:
            int r2 = r5.length()
            int r2 = r2 - r1
            java.lang.String r5 = r5.substring(r0, r2)
        L92:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L99
            return r5
        L99:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.FYtjSf.sVvuFk(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static GQzpsZ sYcwUD(Context context) throws InterruptedException {
        int i;
        int i2;
        int dataState;
        RIsQag rIsQagDDjgSw = OqhRBM.uzCIH().DDjgSw();
        if (rIsQagDDjgSw != null) {
            rIsQagDDjgSw.fetchVPNInfo(context);
        }
        GQzpsZ gQzpsZ = new GQzpsZ();
        boolean z = false;
        if (!gQzpsZ.OgHfcT(AxsJAY.uzCIH().OcIXYQ()) && !gQzpsZ.OgHfcT(dlRikr(context))) {
            if (!gQzpsZ.OgHfcT(hbZCHz(context))) {
                gQzpsZ.OgHfcT(GFUIi(context));
                z = true;
            }
            if (gQzpsZ.gAnGwV() == null && HJWChP.fvRMlC.iRgjgR()) {
                try {
                    try {
                        Object systemService = context.getSystemService(GCXiNH.fsw("myTbN"));
                        if ((systemService instanceof TelephonyManager) && ((dataState = ((TelephonyManager) systemService).getDataState()) == 2 || dataState == 1 || dataState == 3)) {
                            gQzpsZ.DBAlnt(GQzpsZ.gQzpsZ.CELLULAR.getValue());
                        }
                        gQzpsZ.DQnQnb();
                    } catch (SecurityException e) {
                        DwQSDd.glVQsU(GCXiNH.fsw("myTbN"), DlIaRS);
                        ORrpqH.uzCIH().seuMaA(e);
                        gQzpsZ.DQnQnb();
                        if (CGG <= 1915) {
                            while (true) {
                                int i3 = CGG;
                                int i4 = i3 + 26;
                                if (i4 == 15) {
                                    while (true) {
                                        CGG = ((CGG % 93) >> 2) ^ 1189;
                                        if (ure <= 8727) {
                                            do {
                                                i = ure;
                                            } while (i + 130 != 25);
                                            ure = (i ^ 3275) >> 78;
                                        }
                                    }
                                } else if (i4 == 83) {
                                    CGG = (i3 >> 124) ^ 2697;
                                    if (ure <= 8727) {
                                    }
                                } else if (i4 == 161) {
                                    CGG = ((i3 ^ 3563) + i3) % 16;
                                    if (ure <= 8727) {
                                        while (true) {
                                            int i5 = ure;
                                            int i6 = i5 + 78;
                                            if (i6 == 91) {
                                                break;
                                            }
                                            if (i6 == 235) {
                                                ure = (i5 * 37) % 125;
                                            } else if (i6 != 386) {
                                            }
                                            ure = (ure * 17) ^ 5180;
                                        }
                                        while (true) {
                                            ure = (ure ^ 5009) * 5;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        FQMcgE.OijiEz(DlIaRS, e2.toString());
                        ORrpqH.uzCIH().seuMaA(e2);
                        gQzpsZ.DQnQnb();
                    }
                    if (ure <= 8727) {
                        while (true) {
                            i2 = ure;
                            int i7 = i2 + 26;
                            if (i7 == 92) {
                                ure = ((i2 ^ 4226) + i2) >> 39;
                                break;
                            }
                            if (i7 == 170) {
                                while (true) {
                                    ure = (ure % 85) * 118;
                                }
                            } else {
                                if (i7 == 349) {
                                    ure = ((i2 % 81) ^ 4202) % 123;
                                    break;
                                }
                                if (i7 == 361) {
                                    break;
                                }
                            }
                        }
                        ure = (ure + i2) % 16;
                    }
                } catch (Throwable th) {
                    gQzpsZ.DQnQnb();
                    throw th;
                }
            }
        }
        if (gQzpsZ.inahnb() == null && rIsQagDDjgSw != null && rIsQagDDjgSw.isConnected()) {
            gQzpsZ.drbYRJ(GCXiNH.fsw("icNi"));
        }
        if (!z && gQzpsZ.inahnb() == null) {
            gQzpsZ.OgHfcT(GFUIi(context));
        }
        Map<String, String> mapNRYds = NRYds(context, gQzpsZ.sRzUNh());
        if (mapNRYds != null && !mapNRYds.isEmpty()) {
            gQzpsZ.RLmrWm(mapNRYds.get(GCXiNH.fsw("Jx]exR`p")));
            gQzpsZ.QiTXOm(mapNRYds.get(GCXiNH.fsw("NtXyYXugXQRF")));
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("StO{DCj>EFDL\n\u0001nNXTX\u0013DP\\Z[N\u0015\u001bxjk~b?$") + gQzpsZ.sRzUNh() + GCXiNH.fsw("=BhEo\u000b!") + gQzpsZ.zXhzOT() + GCXiNH.fsw("=Ch_b\u000b!") + gQzpsZ.QnnRaN() + GCXiNH.fsw("=EB|N\u000b!") + gQzpsZ.gAnGwV());
        return gQzpsZ;
    }
}
