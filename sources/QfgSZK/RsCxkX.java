package QfgSZK;

import QfgSZK.QhsCdE;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class RsCxkX extends QhsCdE {
    public static int Ous = 2386;
    public static int RNv = 5565;
    private ZaDspl gzsDlC;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RsCxkX(long j) {
        super(j);
        this.gzsDlC = ZaDspl.NOT_CHECKED;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:25:0x0053) to fix multi-entry loop: BACK_EDGE: B:24:0x004a -> B:25:0x0053 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        String strIdentifier;
        int i;
        int i2;
        if (map == null) {
            return;
        }
        String strDbNXlk = AhwBna.SELINUX_MODE.DbNXlk();
        if ((RNv ^ 5565) == 0) {
            ZaDspl zaDspl = this.gzsDlC;
            if (zaDspl != null) {
                strIdentifier = zaDspl.identifier();
            } else if ((Ous ^ 2386) != 0) {
                while (true) {
                    int i3 = Ous;
                    int i4 = i3 + 52;
                    if (i4 == 5) {
                        i = ((i3 % 28) >> 13) * 70;
                    } else if (i4 == 25) {
                        i = ((i3 >> 72) * 9) ^ 1704;
                    } else if (i4 == 107) {
                        Ous = (Ous ^ 4288) * 2037;
                    } else if (i4 == 129) {
                        i = ((i3 >> 125) % 97) ^ 3079;
                    }
                    Ous = i;
                    Ous = (Ous ^ 4288) * 2037;
                }
            } else {
                strIdentifier = null;
            }
            map.put(strDbNXlk, strIdentifier);
            return;
        }
        while (true) {
            int i5 = RNv;
            int i6 = i5 + 52;
            if (i6 != 4) {
                if (i6 == 170) {
                    while (true) {
                        RNv = ((RNv + i5) + i5) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                    }
                } else if (i6 == 286) {
                    RNv = (i5 >> 120) % 57;
                    if (Ous <= 2385) {
                        while (true) {
                            i2 = Ous;
                            int i7 = i2 + 78;
                            if (i7 == 61) {
                                Ous = (i2 ^ 2979) % 27;
                            } else if (i7 != 106) {
                                if (i7 == 213) {
                                    Ous = (Ous ^ 1164) + i2;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            Ous = ((Ous % 2) + i2) % 69;
                            Ous = (Ous ^ 1164) + i2;
                        }
                    }
                } else if (i6 == 457) {
                    while (true) {
                        RNv = ((RNv >> 51) ^ 2272) % 106;
                    }
                }
            }
            RNv ^= 3055;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_SELINUX_MODE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        this.gzsDlC = DGUQLI.dNCPSb();
    }
}
