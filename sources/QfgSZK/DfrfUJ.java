package QfgSZK;

import QfgSZK.DGUQLI;
import QfgSZK.QhsCdE;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
class DfrfUJ extends QhsCdE {
    public static int sxQ = 5720;
    private int QqLhMg;
    private int aTiIlJ;
    private String frzTET;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DfrfUJ(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(AhwBna.TIMEZONE_GMT_OFFSET.DbNXlk(), String.valueOf(this.aTiIlJ));
        String strDbNXlk = AhwBna.TIMEZONE_DST_DIFF.DbNXlk();
        if ((sxQ ^ 5720) == 0) {
            map.put(strDbNXlk, String.valueOf(this.QqLhMg));
            map.put(AhwBna.TIMEZONE_NAME.DbNXlk(), this.frzTET);
            return;
        }
        while (true) {
            int i = sxQ;
            int i2 = i + 26;
            if (i2 != 51) {
                if (i2 == 224) {
                    sxQ = (i ^ 1189) + i;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            sxQ = (sxQ ^ 3267) >> 41;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_TIMEZONE_INFO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) {
        this.QqLhMg = 0;
        this.aTiIlJ = 0;
        this.frzTET = null;
        DGUQLI.hJrIAr hjriar = new DGUQLI.hJrIAr();
        if (DGUQLI.fsSxsn(hjriar)) {
            this.QqLhMg = hjriar.hpWntT;
            this.aTiIlJ = hjriar.zCOrnd;
        }
        this.frzTET = TimeZone.getDefault().getID();
    }
}
