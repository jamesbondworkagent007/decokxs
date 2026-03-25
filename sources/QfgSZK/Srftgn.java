package QfgSZK;

import QfgSZK.FQMcgE;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.engagelab.privates.push.constants.MTPushConstants;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class Srftgn extends OGitdB {
    public static int CSW;
    private static String DlIaRS;
    public static int cIY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        cIY = 6000;
        FQMcgE.usN = 6842;
        CSW = 8371;
        if (cIY <= 5999) {
            while (true) {
                i = cIY;
                int i2 = i + 13;
                if (i2 != 11) {
                    if (i2 == 45) {
                        cIY = ((i % 38) ^ 1164) + i;
                        break;
                    }
                } else {
                    break;
                }
            }
            cIY = ((cIY % 14) + i) * 10;
        }
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(Srftgn.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:32:0x007d) to fix multi-entry loop: BACK_EDGE: B:32:0x007d -> B:33:0x007f */
    @Override // QfgSZK.RIsQag
    public void fetchVPNInfo(Context context) {
        try {
            ConnectivityManager connectivityMgr = getConnectivityMgr(context);
            if (connectivityMgr == null) {
                return;
            }
            this.irBVsV = false;
            for (Network network : connectivityMgr.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityMgr.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                    this.irBVsV = true;
                    return;
                }
            }
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, e.toString());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            if (CSW > 8370) {
                return;
            }
            if (cIY <= 5999) {
                while (true) {
                    int i = cIY;
                    int i2 = i + 78;
                    if (i2 != 56) {
                        if (i2 != 234) {
                            if (i2 != 295) {
                                if (i2 == 464) {
                                    break;
                                }
                            } else {
                                while (true) {
                                    cIY = (cIY * 47) ^ 1787;
                                }
                            }
                        } else {
                            cIY = (i >> 118) * 81;
                            break;
                        }
                    } else {
                        while (true) {
                            cIY >>= CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA;
                        }
                    }
                }
                while (true) {
                    cIY = ((cIY ^ 5291) % 117) ^ 2247;
                }
            } else {
                while (true) {
                    int i3 = CSW;
                    int i4 = i3 + 65;
                    if (i4 != 28) {
                        if (i4 == 224) {
                            break;
                        }
                    } else {
                        CSW = ((i3 ^ 2943) + i3) % 70;
                    }
                }
                while (true) {
                    CSW = (CSW >> 105) ^ 3009;
                }
            }
        } catch (Exception e2) {
            FQMcgE.OijiEz(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.RIsQag
    public boolean isConnected() {
        return this.irBVsV;
    }
}
