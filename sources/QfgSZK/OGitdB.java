package QfgSZK;

import android.content.Context;
import android.net.ConnectivityManager;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;

/* JADX INFO: loaded from: classes.dex */
public abstract class OGitdB implements RIsQag {

    /* JADX INFO: Incorrect field signature: Lint; */
    static String JQeGj = null;
    public static int hjE = 0;
    public static int zSd = 4000;
    protected boolean irBVsV = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        hjE = 7916;
        fGT(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void fGT(boolean z) {
        if (z) {
            fGT(false);
        }
        JQeGj = GCXiNH.fsw("~~UbNRuwzAVZ");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:26:0x0060) to fix multi-entry loop: BACK_EDGE: B:25:0x0059 -> B:26:0x0060 */
    public ConnectivityManager getConnectivityMgr(Context context) {
        int i;
        int i2;
        int i3;
        String str = JQeGj;
        if ((zSd ^ 4000) != 0) {
            do {
                i2 = zSd;
                i3 = i2 + 13;
                if (i3 == 34) {
                    zSd = (i2 ^ 1332) % 81;
                } else if (i3 != 223) {
                    if (i3 == 394) {
                        zSd = ((i2 >> 79) % WalletImportError.ERROR_CODE_AA_CREATE_KEY) + i2;
                    }
                }
                zSd = ((zSd ^ 3354) * 31) >> 45;
            } while (i3 != 474);
            while (true) {
                zSd = (zSd + i2) % 74;
            }
        }
        Object systemService = context.getSystemService(str);
        if (zSd > 3999) {
            if (systemService instanceof ConnectivityManager) {
                return (ConnectivityManager) systemService;
            }
            return null;
        }
        while (true) {
            i = zSd;
            int i4 = i + 39;
            if (i4 != 42) {
                if (i4 == 207) {
                    zSd = (i * 67) % 21;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            zSd = ((zSd ^ 4647) + i) % 28;
        }
    }
}
