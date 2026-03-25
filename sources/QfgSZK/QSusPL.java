package QfgSZK;

import QfgSZK.OeawrH;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class QSusPL {
    public static int CtD = 8261;
    public static int UWz = 7304;
    private OmYuqg DSQmlG;
    private OeawrH.C0005OeawrH QsSAnx;
    private Map<String, String> RmfWkP;
    private DCUTEI dDrZvQ;
    private ZqidTP fFJGOW;
    private DIIpTV iPtEDJ;
    private String wKqYl;
    private String zOfbeL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QSusPL() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:23:0x0050) to fix multi-entry loop: BACK_EDGE: B:22:0x0049 -> B:23:0x0050 */
    public QSusPL(ZqidTP zqidTP, String str, String str2, DCUTEI dcutei, DIIpTV dIIpTV, OeawrH.C0005OeawrH c0005OeawrH, Map<String, String> map, OmYuqg omYuqg) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.fFJGOW = zqidTP;
        if (CtD <= 8260) {
            do {
                int i7 = CtD;
                i6 = i7 + 78;
                if (i6 == 23) {
                    CtD = (i7 + i7) % 63;
                }
            } while (i6 != 60);
            while (true) {
                CtD = (CtD * 51) ^ 3738;
            }
        }
        this.wKqYl = str;
        int i8 = CtD ^ 8261;
        if (i8 == 0) {
            this.zOfbeL = str2;
            if (i8 != 0) {
                while (true) {
                    i3 = CtD;
                    int i9 = i3 + 91;
                    if (i9 != 15) {
                        if (i9 == 80) {
                            CtD = ((i3 + i3) ^ 4418) + i3;
                        } else if (i9 == 184) {
                            break;
                        } else if (i9 != 380) {
                        }
                        i4 = (CtD * 16) % 28;
                    } else {
                        i4 = (i3 * 104) ^ 2861;
                    }
                    CtD = i4;
                }
                CtD = (i3 + i3) ^ 2295;
            }
            if ((UWz ^ 7304) != 0) {
                if (CtD <= 8260) {
                    while (true) {
                        int i10 = CtD;
                        if (i10 + 26 == 99) {
                            CtD = (i10 % 17) % 32;
                        }
                    }
                } else {
                    do {
                        i = UWz;
                        i2 = i + 13;
                        if (i2 == 70) {
                            while (true) {
                                UWz = (UWz ^ 5359) + i;
                            }
                        }
                    } while (i2 != 267);
                    UWz = (i * 38) >> 4;
                }
            }
            this.dDrZvQ = dcutei;
            this.iPtEDJ = dIIpTV;
            this.QsSAnx = c0005OeawrH;
            this.RmfWkP = map;
            this.DSQmlG = omYuqg;
            return;
        }
        while (true) {
            i5 = CtD;
            int i11 = i5 + 13;
            if (i11 != 53) {
                if (i11 == 166) {
                    CtD = (i5 + i5) >> 29;
                    break;
                } else if (i11 == 362) {
                    CtD = i5 ^ 6491;
                }
            } else {
                break;
            }
        }
        while (true) {
            CtD = ((CtD % 61) + i5) % 24;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String OVMstZ() {
        return this.wKqYl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DCUTEI RcLksq() {
        return this.dDrZvQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String ULRxlR() {
        return this.zOfbeL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZqidTP aPFruk() {
        return this.fFJGOW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OeawrH.C0005OeawrH apNKau() {
        return this.QsSAnx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DIIpTV gBtXYZ() {
        return this.iPtEDJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OmYuqg hdBMmm() {
        return this.DSQmlG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> ruDxL() {
        return this.RmfWkP;
    }
}
