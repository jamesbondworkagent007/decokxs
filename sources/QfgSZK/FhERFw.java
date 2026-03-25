package QfgSZK;

import QfgSZK.QhsCdE;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class FhERFw extends QhsCdE {
    public static int kcd = 7263;
    public static int zZL = 6587;
    private String QQOvnj;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FhERFw(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(AhwBna.DEVICE_NAME.DbNXlk(), this.QQOvnj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_DEVICE_NAME;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:17:0x0030) to fix multi-entry loop: BACK_EDGE: B:17:0x0030 -> B:18:0x0032 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) {
        int i;
        if (qSusPL.aPFruk() == null) {
            return;
        }
        this.QQOvnj = DGUQLI.sSMYrx(qSusPL.aPFruk());
        if ((zZL ^ 6587) != 0) {
            while (true) {
                i = zZL;
                int i2 = i + 26;
                if (i2 == 39) {
                    zZL = ((i + i) * 99) % 122;
                    break;
                } else if (i2 == 160) {
                    while (true) {
                        zZL *= 3924;
                    }
                } else if (i2 == 318) {
                    zZL = (i % 88) ^ 3199;
                    break;
                } else if (i2 == 440) {
                    break;
                }
            }
            while (true) {
                zZL = (zZL + i) * 29;
            }
        }
        if (this.QQOvnj == null) {
            this.QQOvnj = "";
        }
    }
}
