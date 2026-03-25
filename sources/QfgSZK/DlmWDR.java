package QfgSZK;

import QfgSZK.QhsCdE;
import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class DlmWDR extends QhsCdE {
    public static int Jtl = 3273;
    public static int zqI = 9055;
    String dbqEUC;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DlmWDR(long j, boolean z) {
        super(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null || UPbYzn.iSpHlg(this.dbqEUC)) {
            return;
        }
        map.put(AhwBna.USER_PERMISSIONS.DbNXlk(), this.dbqEUC);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_USER_PERM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        if (qSusPL.aPFruk() == null || qSusPL.gBtXYZ() == null || qSusPL.gBtXYZ().drJYSP.isEmpty()) {
            return;
        }
        Context context = qSusPL.aPFruk().Umbazn;
        if ((zqI ^ 9055) != 0) {
            do {
                i = zqI;
            } while (i + 39 != 60);
            zqI = (i % 59) >> 19;
        }
        this.dbqEUC = DGUQLI.DaRZkR(context, qSusPL.gBtXYZ().drJYSP);
    }
}
