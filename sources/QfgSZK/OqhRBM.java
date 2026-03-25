package QfgSZK;

import QfgSZK.HJWChP;

/* JADX INFO: loaded from: classes.dex */
class OqhRBM {
    public static int cFJ = 3421;
    public static int dVR = 3843;
    private RIsQag WzWcx = null;

    public static class iKdSzF {
        private static final OqhRBM sYErk = new OqhRBM();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private iKdSzF() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static OqhRBM uzCIH() {
        return iKdSzF.sYErk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:19:0x0034) to fix multi-entry loop: BACK_EDGE: B:19:0x0034 -> B:20:0x0036 */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        if (QfgSZK.OqhRBM.cFJ <= 3420) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        QfgSZK.OqhRBM.dVR = ((QfgSZK.OqhRBM.dVR % 62) >> 40) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        if ((QfgSZK.OqhRBM.cFJ ^ 3421) != 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r0 = QfgSZK.OqhRBM.cFJ;
        r1 = r0 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ba, code lost:
    
        if (r1 == 34) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        if (r1 == 56) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        if (r1 == 156) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c6, code lost:
    
        if (r1 == 329) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c9, code lost:
    
        QfgSZK.OqhRBM.cFJ = (QfgSZK.OqhRBM.cFJ >> 104) % 122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d2, code lost:
    
        QfgSZK.OqhRBM.cFJ = (r0 >> 45) * 51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        QfgSZK.OqhRBM.cFJ = (QfgSZK.OqhRBM.cFJ >> 57) ^ 2017;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        QfgSZK.OqhRBM.cFJ = ((QfgSZK.OqhRBM.cFJ + r0) ^ 2548) >> 79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RIsQag DDjgSw() {
        int i;
        int i2;
        int i3;
        RIsQag rIsQag = this.WzWcx;
        if (rIsQag != null) {
            return rIsQag;
        }
        int i4 = HJWChP.RGtXKC.DKRTZD.diCPdz;
        if (i4 < HJWChP.RGtXKC.C0004RGtXKC.UIwVdu || i4 > HJWChP.RGtXKC.C0004RGtXKC.dspUTZ) {
            if (i4 == HJWChP.RGtXKC.C0004RGtXKC.dGmVXg) {
                this.WzWcx = new Srftgn();
            } else if (i4 >= HJWChP.RGtXKC.C0004RGtXKC.dkjVRX) {
                this.WzWcx = new SFHvfS();
            }
            return this.WzWcx;
        }
        this.WzWcx = new AkhnZx();
        if ((dVR ^ 3843) != 0) {
            if ((cFJ ^ 3421) != 0) {
                while (true) {
                    int i5 = cFJ;
                    int i6 = i5 + 52;
                    if (i6 == 58) {
                        cFJ = (i5 ^ 5438) >> 40;
                        break;
                    }
                    if (i6 == 189) {
                        break;
                    }
                }
                while (true) {
                    cFJ = ((cFJ ^ 4503) >> 71) % 48;
                }
            } else {
                while (true) {
                    i = dVR;
                    int i7 = i + 39;
                    if (i7 == 83) {
                        break;
                    }
                    if (i7 == 158) {
                        break;
                    }
                    if (i7 == 257) {
                        dVR = ((i % 20) % 77) * 114;
                        if ((cFJ ^ 3421) != 0) {
                            do {
                                i2 = cFJ;
                            } while (i2 + 78 != 40);
                            cFJ = ((i2 ^ 2808) * 61) >> 81;
                        }
                    } else if (i7 == 361) {
                        dVR = (i * 53) % 90;
                        if (cFJ <= 3420) {
                            do {
                                i3 = cFJ;
                            } while (i3 + 91 != 41);
                            cFJ = ((i3 + i3) >> 83) * 30;
                        }
                    }
                }
                dVR = (dVR >> 97) + i;
            }
        }
        return this.WzWcx;
    }
}
