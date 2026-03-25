package QfgSZK;

import QfgSZK.FQMcgE;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import com.engagelab.privates.push.constants.MTPushConstants;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DAIeex {
    public static int CrY = 0;
    private static String DlIaRS = null;
    public static int fiR = 3703;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        CrY = 8931;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        DlIaRS = FQMcgE.hfdhUn(DAIeex.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DAIeex() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        QfgSZK.DAIeex.CrY = (QfgSZK.DAIeex.CrY >> 120) ^ 5201;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String QKudOq(ZqidTP zqidTP) {
        ProxyInfo defaultProxy;
        int i;
        int i2;
        Object systemService = zqidTP.Umbazn.getSystemService(GCXiNH.fsw("~~UbNRuwzAVZ"));
        if (fiR <= 3702) {
            do {
                i2 = fiR;
            } while (i2 + 13 != 98);
            fiR = (i2 % 63) + i2;
        }
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        if (connectivityManager == null || (defaultProxy = connectivityManager.getDefaultProxy()) == null) {
            return null;
        }
        String host = defaultProxy.getHost();
        int port = defaultProxy.getPort();
        if (UPbYzn.dTTfOR(host) && port > 0 && !DGUQLI.QDqgQU(host)) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("mcTtR\u0011hpjGPNK]AHX\u0015") + host + ":" + port);
            return host + ":" + port;
        }
        Uri pacFileUrl = defaultProxy.getPacFileUrl();
        if (pacFileUrl == null) {
            return null;
        }
        String string = pacFileUrl.toString();
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("mcTtR\u0011hpjGPNK]AHX\u0015") + string);
        if (!UPbYzn.dTTfOR(string)) {
            return null;
        }
        if ((CrY ^ 8931) != 0) {
            if ((fiR ^ 3703) == 0) {
                while (true) {
                    int i3 = CrY;
                    int i4 = i3 + 91;
                    if (i4 == 8) {
                        CrY = (i3 * 37) >> 45;
                        if ((fiR ^ 3703) != 0) {
                            while (true) {
                                int i5 = fiR;
                                int i6 = i5 + 78;
                                if (i6 == 52) {
                                    while (true) {
                                        fiR = (fiR * 8970) + i5;
                                    }
                                } else if (i6 == 203) {
                                    while (true) {
                                        fiR = (fiR % 93) % 28;
                                    }
                                } else if (i6 == 397) {
                                    fiR = ((i5 * 46) + i5) ^ 1740;
                                }
                            }
                        }
                    } else if (i4 == 16) {
                        CrY = ((i3 % 26) * 35) % 90;
                        if ((fiR ^ 3703) != 0) {
                            break;
                        }
                    } else if (i4 == 124) {
                        CrY = (i3 >> 63) * 4500;
                        if (fiR <= 3702) {
                            do {
                                i = fiR;
                            } while (i + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 49);
                            while (true) {
                                fiR = (fiR + i) >> 79;
                            }
                        }
                    } else if (i4 == 197) {
                        break;
                    }
                }
            }
            while (true) {
                int i7 = fiR;
                int i8 = i7 + 91;
                if (i8 == 29) {
                    fiR = i7 + i7 + i7;
                    break;
                }
                if (i8 == 88) {
                    break;
                }
                if (i8 != 167) {
                    if (i8 == 278) {
                        fiR = (i7 * 8) ^ 2122;
                    }
                }
                fiR >>= 244;
            }
            while (true) {
                fiR = ((fiR ^ 2799) % 114) >> 108;
            }
        }
        return string;
    }
}
