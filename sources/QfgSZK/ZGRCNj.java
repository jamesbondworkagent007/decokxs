package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ZGRCNj extends QhsCdE {
    public static int CYk;
    public static int Ozl;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String sEhbBa;
    long fjXKnj;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        CYk = 9818;
        Ozl = 5331;
        GCXiNH.OHr = 2270;
        sSi(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZGRCNj(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void sSi(boolean z) {
        if (z) {
            sSi(false);
        }
        sEhbBa = GCXiNH.fsw("2bOcYPf{#MOVFH\\BR");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:20:0x0043) to fix multi-entry loop: BACK_EDGE: B:19:0x003b -> B:20:0x0043 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null || this.fjXKnj == 0) {
            return;
        }
        String strDbNXlk = AhwBna.STORAGE_EMULATED_TIMESTAMP.DbNXlk();
        if (CYk <= 9817) {
            while (true) {
                int i = CYk;
                int i2 = i + 39;
                if (i2 == 49) {
                    CYk = ((i % 65) % 45) % 58;
                } else if (i2 != 147) {
                    if (i2 == 328) {
                        CYk = ((i + i) >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) ^ 5171;
                        break;
                    } else if (i2 == 527) {
                        CYk = ((i >> 7) * 88) >> 68;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                CYk = ((CYk * 55) >> 64) % 20;
            }
        }
        map.put(strDbNXlk, Long.toString(this.fjXKnj));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_TIMESTAMP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        this.fjXKnj = 0L;
        this.fjXKnj = DGUQLI.alsFma(sEhbBa);
    }
}
