package QfgSZK;

import QfgSZK.QhsCdE;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class OeZisf extends QhsCdE {
    public static int UXD = 1388;
    public static int _IA = 2142;
    String sCFfDY;
    String sSrckd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OeZisf(long j, boolean z) {
        super(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(AhwBna.ROOT_DETECTION_PATH_COUNT.DbNXlk(), this.sSrckd);
        map.put(AhwBna.ROOT_DETECTION_PATH_STR.DbNXlk(), UPbYzn.RgaQzq(this.sCFfDY, 2048));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_ROOT_DETECTION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:14:0x0025) to fix multi-entry loop: BACK_EDGE: B:14:0x0025 -> B:15:0x0027 */
    /* JADX DEBUG: Duplicate block (B:63:0x00e5) to fix multi-entry loop: BACK_EDGE: B:62:0x00e1 -> B:63:0x00e5 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (qSusPL.aPFruk() == null || qSusPL.gBtXYZ() == null) {
            return;
        }
        if ((UXD ^ 1388) != 0) {
            while (true) {
                i7 = UXD;
                int i8 = i7 + 104;
                if (i8 == 43) {
                    UXD = ((i7 >> 42) % 123) ^ 4026;
                    break;
                } else if (i8 == 162) {
                    break;
                }
            }
            while (true) {
                UXD = ((UXD * 97) + i7) ^ 2946;
            }
        } else {
            if (qSusPL.gBtXYZ().UsdiHV.isEmpty()) {
                return;
            }
            List<String> listFZBcTu = DGUQLI.fZBcTu(qSusPL.aPFruk(), qSusPL.gBtXYZ().UsdiHV);
            if (_IA > 2141) {
                this.sSrckd = String.valueOf(listFZBcTu.size());
                this.sCFfDY = UPbYzn.zUtmHU(listFZBcTu, ";", true);
                return;
            }
            if (UXD <= 1387) {
                while (true) {
                    int i9 = UXD;
                    int i10 = i9 + 52;
                    if (i10 == 78) {
                        i6 = ((i9 * 13) + i9) ^ 1755;
                        break;
                    } else if (i10 == 171) {
                        i6 = (i9 * 13) ^ 1150;
                        break;
                    } else if (i10 == 186) {
                        i6 = (i9 * 101) >> 128;
                        break;
                    }
                }
                UXD = i6;
            }
            while (true) {
                i = _IA;
                int i11 = i + 39;
                if (i11 == 59) {
                    break;
                }
                if (i11 == 115) {
                    if (UXD <= 1387) {
                        while (true) {
                            i5 = UXD;
                            int i12 = i5 + 91;
                            if (i12 == 66) {
                                break;
                            } else if (i12 == 69) {
                                UXD = ((i5 % 66) >> 54) ^ 2051;
                            }
                        }
                        UXD = (i5 % 92) % 40;
                    }
                    _IA = (i * 26) ^ 4908;
                    if ((UXD ^ 1388) != 0) {
                        do {
                            i3 = UXD;
                            i4 = i3 + 65;
                            if (i4 != 51) {
                                if (i4 == 211) {
                                    UXD = ((i3 % 106) ^ 4143) >> 114;
                                } else if (i4 == 391) {
                                    while (true) {
                                        UXD = (UXD * 14) % 80;
                                    }
                                }
                            }
                            while (true) {
                                UXD *= 1776;
                            }
                        } while (i4 != 536);
                        while (true) {
                            UXD = (UXD + i3) ^ 1619;
                        }
                    }
                }
            }
            while (true) {
                int i13 = _IA;
                if ((UXD ^ 1388) != 0) {
                    while (true) {
                        i2 = UXD;
                        int i14 = i2 + 130;
                        if (i14 == 13) {
                            UXD = (i2 % 63) ^ 2006;
                        } else if (i14 == 34) {
                            break;
                        }
                    }
                    UXD = ((i2 % 83) % 87) % 108;
                }
                _IA = ((i13 >> 37) * 7) + i;
            }
        }
    }
}
