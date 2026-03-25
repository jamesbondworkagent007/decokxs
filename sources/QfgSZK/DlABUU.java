package QfgSZK;

import QfgSZK.QhsCdE;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class DlABUU extends QhsCdE {
    public static int kAB = 1654;
    public static int zYN = 8948;
    private String DuPPaS;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DlABUU(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:19:0x0045) to fix multi-entry loop: BACK_EDGE: B:18:0x003e -> B:19:0x0045 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        if (map == null) {
            return;
        }
        String strDbNXlk = AhwBna.SYSTEM_PROXY.DbNXlk();
        if (kAB > 1653) {
            map.put(strDbNXlk, this.DuPPaS);
            return;
        }
        while (true) {
            i = kAB;
            int i2 = i + 26;
            if (i2 == 12) {
                break;
            }
            if (i2 == 138) {
                while (true) {
                    kAB = ((kAB ^ 2924) >> 79) + i;
                }
            } else if (i2 == 307) {
                while (true) {
                    kAB = (kAB % 49) * 38;
                }
            } else if (i2 == 504) {
                kAB = ((i * 98) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) % 83;
                break;
            }
        }
        while (true) {
            kAB = ((kAB ^ 3827) >> 5) + i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_SYSTEM_PROXY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (qSusPL.aPFruk() == null) {
            return;
        }
        this.DuPPaS = DGUQLI.QKudOq(qSusPL.aPFruk());
    }
}
