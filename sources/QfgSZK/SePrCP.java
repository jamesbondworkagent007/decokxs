package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import android.content.Context;
import android.os.PowerManager;
import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: loaded from: classes.dex */
class SePrCP {
    private static String DlIaRS;
    public static int cp_;
    public static int rQp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        cp_ = 5076;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        if ((5076 ^ cp_) == 0) {
            rQp = 6638;
            FQMcgE.usN = 6842;
            DlIaRS = FQMcgE.hfdhUn(SePrCP.class);
            return;
        }
        while (cp_ + 13 != 84) {
        }
        while (true) {
            cp_ = ((cp_ % 28) ^ 5467) >> 120;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SePrCP() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:31:0x0086) to fix multi-entry loop: BACK_EDGE: B:31:0x0086 -> B:32:0x0088 */
    public static boolean sVXHln(Context context) {
        int i;
        int i2;
        if (HJWChP.UUMfbK.BVXAa() && HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.dWbSXj) {
            try {
                Object systemService = context.getSystemService(GCXiNH.fsw("m~LiY"));
                if (systemService instanceof PowerManager) {
                    return ((PowerManager) systemService).isInteractive();
                }
                return true;
            } catch (SecurityException e) {
                FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017]x"), e.toString());
                DwQSDd.glVQsU(e);
                ORrpqH.uzCIH().seuMaA(e);
                if (rQp <= 6637) {
                    if ((cp_ ^ 5076) != 0) {
                        do {
                            int i3 = cp_;
                            i2 = i3 + 52;
                            if (i2 == 65) {
                                cp_ = (i3 + i3) >> 74;
                            } else if (i2 == 182) {
                                while (true) {
                                    cp_ = ((cp_ >> 67) * 95) + i3;
                                }
                            } else if (i2 != 354) {
                            }
                            cp_ *= 1159536;
                            break;
                        } while (i2 != 523);
                        while (true) {
                            cp_ = (cp_ % 26) * 9;
                        }
                    } else {
                        do {
                            i = rQp;
                        } while (i + 26 != 72);
                        rQp = i + i + i;
                    }
                }
            } catch (Exception e2) {
                FQMcgE.OijiEz(DlIaRS, e2.toString());
                ORrpqH.uzCIH().seuMaA(e2);
            }
        }
        return true;
    }
}
