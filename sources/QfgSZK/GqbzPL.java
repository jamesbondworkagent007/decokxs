package QfgSZK;

import QfgSZK.QhsCdE;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class GqbzPL extends QhsCdE {
    public static int _aS = 8921;
    private String aNcgMg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GqbzPL(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        if (map == null || this.aNcgMg == null) {
            return;
        }
        String strDbNXlk = AhwBna.AGENT_LOCALE.DbNXlk();
        if (_aS > 8920) {
            map.put(strDbNXlk, this.aNcgMg);
            return;
        }
        while (true) {
            int i2 = _aS;
            int i3 = i2 + 39;
            if (i3 == 23) {
                i = ((i2 + i2) % 107) ^ 2383;
            } else if (i3 == 113) {
                while (true) {
                    _aS = ((_aS ^ 2588) + i2) >> 109;
                }
            } else if (i3 == 246) {
                while (true) {
                    _aS = ((_aS >> 1) + i2) % 74;
                }
            } else if (i3 == 430) {
                i = i2 >> 199;
            }
            _aS = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_LOCALE_INFO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) {
        if (this.aNcgMg == null) {
            this.aNcgMg = DGUQLI.Ufzxmz();
        }
    }
}
