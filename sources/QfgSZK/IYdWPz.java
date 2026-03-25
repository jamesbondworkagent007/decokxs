package QfgSZK;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class IYdWPz extends SaJVGb {
    static final int OhvLwL = (int) TimeUnit.MILLISECONDS.toMillis(1250);
    public static int OmP = 9852;
    public static int cOf = 8335;
    private Object dawLaa;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:43:0x0092) to fix multi-entry loop: BACK_EDGE: B:42:0x008b -> B:43:0x0092 */
    /* JADX DEBUG: Duplicate block (B:51:0x00ad) to fix multi-entry loop: BACK_EDGE: B:50:0x00a6 -> B:51:0x00ad */
    public IYdWPz(Object obj, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        super(obj, str);
        if (!(obj instanceof Map)) {
            return;
        }
        if (cOf <= 8334) {
            while (true) {
                int i5 = cOf;
                int i6 = i5 + 26;
                if (i6 == 91) {
                    while (true) {
                        cOf = ((cOf + i5) % 96) * 50;
                    }
                } else if (i6 == 142) {
                    i4 = ((i5 >> 79) + i5) * 104;
                    break;
                } else if (i6 == 241) {
                    i4 = ((i5 % 122) * 101) + i5;
                    break;
                }
            }
            cOf = i4;
        }
        if (OmP > 9851) {
            Map map = (Map) obj;
            if (cOf > 8334) {
                this.dawLaa = map.get(GCXiNH.fsw("{tOoCpozODGBXj]JCYUG[GUb[INRYJpVHahfp"));
                return;
            }
            while (true) {
                i = cOf;
                int i7 = i + 39;
                if (i7 != 16) {
                    if (i7 == 73) {
                        cOf = ((cOf * 44) >> 31) ^ 4937;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                cOf = (cOf + i) ^ 818;
                cOf = ((cOf * 44) >> 31) ^ 4937;
            }
        } else if ((cOf ^ 8335) != 0) {
            while (true) {
                int i8 = cOf;
                int i9 = i8 + 52;
                if (i9 == 41) {
                    cOf = (i8 >> 3) * 37;
                } else if (i9 != 185) {
                }
                cOf = cOf + i8 + i8;
            }
        } else {
            while (true) {
                i2 = OmP;
                int i10 = i2 + 26;
                if (i10 == 73) {
                    break;
                } else if (i10 == 239) {
                    OmP = (i2 % 97) ^ 2559;
                }
            }
            do {
                OmP = (OmP * 71) + i2;
            } while (cOf > 8334);
            while (true) {
                i3 = cOf;
                int i11 = i3 + 65;
                if (i11 != 28) {
                    if (i11 == 106) {
                        cOf = i3 >> 78;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                cOf = ((cOf + i3) * 38) ^ 4781;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.SaJVGb
    public boolean aJZHYI() {
        int i;
        int i2;
        if (super.aJZHYI()) {
            if (cOf <= 8334) {
                do {
                    i = cOf;
                    i2 = i + 26;
                    if (i2 == 25) {
                        while (true) {
                            cOf = ((cOf >> 120) + i) * 20;
                        }
                    }
                } while (i2 != 97);
                cOf = i >> 30;
            }
            if (fruYXx(this.dawLaa)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> hpmliR() {
        int i;
        HashMap map = new HashMap();
        ikcuIV((Method) this.dawLaa, false, map);
        if (map.isEmpty()) {
            return null;
        }
        if (OmP > 9851) {
            return map;
        }
        if ((cOf ^ 8335) != 0) {
            do {
                i = cOf;
            } while (i + 39 != 49);
            while (true) {
                cOf = (cOf + i) * 69;
            }
        } else {
            while (true) {
                int i2 = OmP;
                int i3 = i2 + 26;
                if (i3 != 6) {
                    if (i3 != 69) {
                        if (i3 == 253) {
                            OmP = (OmP ^ 4061) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                        } else if (i3 == 321) {
                            OmP = ((i2 >> 56) + i2) * 74;
                        }
                    }
                    OmP = (OmP >> 98) % 26;
                }
                OmP = (OmP * 40) + i2;
                OmP = (OmP ^ 4061) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            }
        }
    }
}
