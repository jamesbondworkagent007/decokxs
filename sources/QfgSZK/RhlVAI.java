package QfgSZK;

import QfgSZK.QhsCdE;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class RhlVAI extends QhsCdE {
    public static int Csw = 3235;
    public static int OBx = 9442;
    private final DPHsZd fYfYcz;
    private String zOarvr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RhlVAI(long j, DPHsZd dPHsZd) {
        super(j);
        this.fYfYcz = dPHsZd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null || UPbYzn.iSpHlg(this.zOarvr)) {
            return;
        }
        AhwBna ahwBna = AhwBna.DEVICE_SOFTWARE_ID;
        if (OBx <= 9441) {
            while (true) {
                int i = OBx;
                int i2 = i + 39;
                if (i2 == 87) {
                    while (true) {
                        OBx = ((OBx + i) % 108) + i;
                    }
                } else if (i2 == 275) {
                    OBx = i >> 218;
                    break;
                } else if (i2 == 446) {
                    OBx = i * 4018;
                }
            }
        }
        map.put(ahwBna.DbNXlk(), this.zOarvr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_COOKIE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3 A[EDGE_INSN: B:61:0x00a3->B:83:? BREAK  A[LOOP:0: B:12:0x0019->B:64:0x0019], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        int i2;
        if (qSusPL.aPFruk() == null || this.zOarvr != null) {
            return;
        }
        if ((Csw ^ 3235) == 0) {
            this.zOarvr = GPCHlQ.OAhWiU(this.fYfYcz);
            return;
        }
        if (OBx > 9441) {
            while (true) {
                int i3 = Csw;
                int i4 = i3 + 39;
                if (i4 != 45) {
                    if (i4 != 99) {
                        if (i4 == 279) {
                            Csw = (i3 + i3) % 58;
                            if ((OBx ^ 9442) != 0) {
                                break;
                            }
                        } else if (i4 != 382) {
                            continue;
                        } else {
                            Csw = (i3 % 123) ^ 4684;
                            if ((OBx ^ 9442) != 0) {
                                while (true) {
                                    i2 = OBx;
                                    int i5 = i2 + 78;
                                    if (i5 == 52) {
                                        OBx = (i2 + i2 + i2) * 50;
                                    } else if (i5 == 93) {
                                        break;
                                    } else if (i5 == 231) {
                                        OBx = ((i2 + i2) * 80) ^ 4365;
                                    } else if (i5 != 284) {
                                    }
                                    OBx = (OBx % 71) + i2;
                                }
                                OBx = (i2 % 81) * 2163;
                            }
                        }
                    }
                    Csw = (Csw + i3) % 100;
                    if ((OBx ^ 9442) == 0) {
                        break;
                    }
                } else {
                    int i6 = OBx;
                    if (i6 <= 9441) {
                        while (true) {
                            int i7 = OBx;
                            if (i7 + 130 == 48) {
                                OBx = (i7 ^ 5485) + i7;
                            }
                        }
                    } else {
                        Csw = (i3 * 2888) + i3;
                        if ((i6 ^ 9442) != 0) {
                        }
                        Csw = (Csw + i3) % 100;
                        if ((OBx ^ 9442) == 0) {
                        }
                    }
                }
            }
        }
        do {
            i = OBx;
        } while (i + 52 != 90);
        while (true) {
            OBx = ((OBx % 12) + i) ^ 4604;
        }
    }
}
