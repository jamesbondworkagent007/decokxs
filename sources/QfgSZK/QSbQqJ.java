package QfgSZK;

import QfgSZK.QhsCdE;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class QSbQqJ extends QhsCdE {
    public static int hXS = 2271;
    private String gFPeAa;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QSbQqJ(long j, boolean z) {
        super(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null || !UPbYzn.RAaltf(this.gFPeAa)) {
            return;
        }
        map.put(AhwBna.DRM_ID.DbNXlk(), this.gFPeAa);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_DRM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        this.gFPeAa = DGUQLI.QXDzTk();
    }
}
