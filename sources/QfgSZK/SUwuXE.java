package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class SUwuXE extends QhsCdE {
    public static int CVZ;
    private static String DlIaRS;
    public static int OSb;
    private String DlFidM;
    private String OzIMCp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        OSb = 1220;
        CVZ = 7788;
        GCXiNH.OHr = 2270;
        if (OSb <= 1219) {
            do {
                int i2 = OSb;
                i = i2 + 13;
                if (i == 42) {
                    OSb = i2 * 1736;
                }
            } while (i != 222);
            while (true) {
                OSb = (OSb ^ 4339) % 25;
            }
        }
        FQMcgE.usN = 6842;
        DlIaRS = FQMcgE.hfdhUn(SUwuXE.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SUwuXE(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x0036) to fix multi-entry loop: BACK_EDGE: B:15:0x002f -> B:16:0x0036 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        if (map == null) {
            return;
        }
        map.put(AhwBna.DEVICE_FONT_COUNT.DbNXlk(), this.OzIMCp);
        if (OSb > 1219) {
            map.put(AhwBna.DEVICE_FONT_HASH.DbNXlk(), UPbYzn.iTrKTi(this.DlFidM));
            return;
        }
        while (true) {
            i = OSb;
            int i2 = i + 26;
            if (i2 != 75) {
                if (i2 == 81) {
                    OSb = (i ^ 1542) + i;
                    break;
                } else if (i2 == 127) {
                    OSb = (i + i) >> 115;
                }
            } else {
                break;
            }
        }
        while (true) {
            OSb = ((OSb >> 82) + i) >> 22;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_FONT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (this.OzIMCp == null || this.DlFidM == null) {
            StringBuilder sb = new StringBuilder();
            String strDLBcXg = DGUQLI.dLBcXg(sb);
            this.DlFidM = strDLBcXg;
            if (strDLBcXg != null) {
                this.OzIMCp = sb.toString();
            }
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Z~O,") + this.OzIMCp + GCXiNH.fsw("=wTb_B!ye^GP\u0010\t") + this.DlFidM);
        }
    }
}
