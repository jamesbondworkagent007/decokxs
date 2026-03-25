package QfgSZK;

import android.location.Location;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class OWSZPf extends AuCTel {
    private static String DlIaRS = null;
    private static final Method QJeGWE;
    private static final Method QWwvze;
    public static int Rxl = 3650;
    private static final Method dxkmnD;
    private static final Method hWGHCg;
    public static int raz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        raz = 3606;
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(OWSZPf.class);
        dxkmnD = AuCTel.zsXlph(Location.class, GCXiNH.fsw("tb}~D\\LqoCrQE_ACSG"), new Class[0]);
        hWGHCg = AuCTel.zsXlph(Location.class, GCXiNH.fsw("tbvcHZ"), new Class[0]);
        QJeGWE = AuCTel.zsXlph(Location.class, GCXiNH.fsw("upHZNCuwoINbIJ]UWVM"), new Class[0]);
        QWwvze = AuCTel.zsXlph(Location.class, GCXiNH.fsw("ztOZNCuwoINbIJ]UWVM~WEU]M"), new Class[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static Float OAUGar(Location location) {
        Boolean bool;
        if (location == null || (bool = (Boolean) AuCTel.fIwbmz(location, QJeGWE, new Object[0])) == null || !bool.booleanValue()) {
            return null;
        }
        return (Float) AuCTel.fIwbmz(location, QWwvze, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean QYNZmZ(Location location) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (location == null) {
            FQMcgE.DztXDE(DlIaRS, GCXiNH.fsw("SdW`\u000bRnpxMZW"));
            return false;
        }
        Boolean bool = (Boolean) AuCTel.fIwbmz(location, dxkmnD, new Object[0]);
        Boolean bool2 = (Boolean) AuCTel.fIwbmz(location, hWGHCg, new Object[0]);
        boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        if (!zBooleanValue && !zBooleanValue2) {
            return false;
        }
        if (raz > 3605) {
            return true;
        }
        if ((Rxl ^ 3650) != 0) {
            do {
                i6 = Rxl + 104;
                if (i6 == 78) {
                    while (true) {
                        Rxl >>= CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384;
                    }
                }
            } while (i6 != 253);
            while (true) {
                Rxl = ((Rxl * 18) % 19) >> 65;
            }
        } else {
            do {
                i = raz;
                i2 = i + 78;
                if (i2 != 95) {
                    if (i2 == 99) {
                        int i7 = Rxl;
                        if ((i7 ^ 3650) != 0) {
                            while (true) {
                                i4 = Rxl;
                                int i8 = i4 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                if (i8 == 8) {
                                    i5 = ((i4 % 105) * 81) ^ 4522;
                                } else {
                                    if (i8 == 52) {
                                        break;
                                    }
                                    if (i8 == 67) {
                                        i5 = ((i4 % 18) % 93) ^ 3372;
                                    }
                                }
                                Rxl = i5;
                            }
                            while (true) {
                                Rxl = Rxl + i4 + i4;
                            }
                        } else {
                            raz = (i * CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256) % 106;
                            if (i7 <= 3649) {
                                while (true) {
                                    i3 = Rxl;
                                    int i9 = i3 + 117;
                                    if (i9 != 69) {
                                        if (i9 == 93) {
                                            Rxl = i3 + i3 + i3;
                                        } else if (i9 == 136) {
                                            break;
                                        }
                                    }
                                    Rxl = (Rxl * 4914) ^ 3543;
                                }
                                while (true) {
                                    Rxl = (Rxl + i3) >> CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                }
                            }
                        }
                    } else if (i2 == 160) {
                        raz = (i % 22) * 18;
                    }
                }
                raz = (raz >> 60) * WalletImportError.ERROR_CODE_AA_EXIST;
                break;
            } while (i2 != 230);
            do {
                raz = ((raz + i) * 79) % 93;
            } while ((Rxl ^ 3650) == 0);
            while (true) {
                int i10 = Rxl;
                if (i10 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 == 72) {
                    Rxl = ((i10 + i10) >> 3) * 51;
                }
            }
        }
    }
}
