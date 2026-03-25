package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.core.view.InputDeviceCompat;
import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: loaded from: classes.dex */
class SFHvfS extends OGitdB {
    private static String DlIaRS = null;
    public static int zQT = 4389;
    private final aKzXkR ORTiki = new aKzXkR();
    private ConnectivityManager DPdSYB = null;

    public class aKzXkR extends ConnectivityManager.NetworkCallback {
        public static int _bM = 2237;
        public static int sci = 7553;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public aKzXkR() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:57:0x00dd) to fix multi-entry loop: BACK_EDGE: B:56:0x00d8 -> B:57:0x00dd */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00dd, code lost:
        
            QfgSZK.SFHvfS.aKzXkR.sci = r3;
         */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onAvailable(Network network) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            super.onAvailable(network);
            if (SFHvfS.this.DPdSYB == null) {
                return;
            }
            try {
                NetworkCapabilities networkCapabilities = SFHvfS.this.DPdSYB.getNetworkCapabilities(network);
                if (networkCapabilities == null || !networkCapabilities.hasTransport(4)) {
                    return;
                }
                SFHvfS.this.irBVsV = true;
            } catch (SecurityException e) {
                DwQSDd.glVQsU(e);
                ORrpqH.uzCIH().seuMaA(e);
                if (_bM > 2236) {
                    return;
                }
                if (sci <= 7552) {
                    do {
                        i4 = sci;
                        i5 = i4 + 52;
                        if (i5 == 42) {
                            sci = (i4 ^ 2277) * 54;
                        } else if (i5 == 137) {
                            break;
                        } else if (i5 != 178) {
                        }
                        i6 = (sci ^ 4047) * 41;
                        break;
                    } while (i5 != 373);
                    i6 = (i4 % 121) * 2;
                    sci = i6;
                    sci = (sci >> 108) % 14;
                }
                while (true) {
                    int i7 = _bM;
                    int i8 = i7 + 39;
                    if (i8 == 17) {
                        _bM = ((i7 * 96) ^ 1891) >> 62;
                        if ((sci ^ 7553) != 0) {
                            while (true) {
                                i = sci;
                                int i9 = i + 91;
                                if (i9 == 91) {
                                    break;
                                }
                                if (i9 == 205) {
                                    while (true) {
                                        sci = (sci >> 13) % 47;
                                    }
                                } else if (i9 == 240) {
                                    i2 = ((i % 33) >> 109) ^ 3150;
                                    break;
                                } else if (i9 == 267) {
                                    i2 = (i + i) ^ 2820;
                                    break;
                                }
                            }
                            while (true) {
                                sci = (sci ^ 4183) + i;
                            }
                        }
                    } else if (i8 == 56) {
                        while (true) {
                            _bM = (_bM ^ 5366) >> 33;
                        }
                    } else if (i8 != 243) {
                        if (i8 == 396) {
                            _bM = ((_bM + i7) >> 75) % 109;
                        }
                    }
                    _bM = ((_bM ^ 3257) >> 81) * 69;
                    if ((sci ^ 7553) != 0) {
                        do {
                            i3 = sci;
                        } while (i3 + 104 != 22);
                        while (true) {
                            sci = (sci ^ InputDeviceCompat.SOURCE_TOUCHSCREEN) + i3;
                        }
                    }
                    _bM = ((_bM + i7) >> 75) % 109;
                }
            } catch (Exception e2) {
                FQMcgE.OijiEz(SFHvfS.DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            if ((sci ^ 7553) == 0) {
                SFHvfS.this.irBVsV = false;
            } else {
                while (true) {
                    int i = sci;
                    if (i + 13 == 68) {
                        sci = ((i >> 6) ^ 2053) % 17;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        DlIaRS = FQMcgE.hfdhUn(SFHvfS.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.RIsQag
    public void fetchVPNInfo(Context context) {
        int i;
        try {
            ConnectivityManager connectivityMgr = getConnectivityMgr(context);
            this.DPdSYB = connectivityMgr;
            if (connectivityMgr == null) {
                return;
            }
            this.irBVsV = false;
            if (new HJWChP.OZOJIj(context).RcvFxC(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001arqru|mbr~nnwemZWWCUE"), context.getPackageName())) {
                this.DPdSYB.registerDefaultNetworkCallback(this.ORTiki);
            }
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, e.toString());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            if (zQT > 4388) {
                return;
            }
            do {
                i = zQT + 39;
                if (i == 87) {
                    while (true) {
                        zQT = ((zQT ^ 2789) * 39) ^ 1133;
                    }
                }
            } while (i != 148);
            while (true) {
                zQT = (zQT ^ 4839) >> 135;
            }
        } catch (Exception e2) {
            FQMcgE.OijiEz(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.RIsQag
    public boolean isConnected() {
        ConnectivityManager connectivityManager = this.DPdSYB;
        if (connectivityManager == null) {
            return false;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.ORTiki);
        } catch (Exception e) {
            FQMcgE.OijiEz(DlIaRS, e.toString());
            ORrpqH.uzCIH().seuMaA(e);
        }
        return this.irBVsV;
    }
}
