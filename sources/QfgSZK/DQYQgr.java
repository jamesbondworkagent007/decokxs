package QfgSZK;

import QfgSZK.QhsCdE;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class DQYQgr extends QhsCdE {
    public static int fXj = 1305;
    public static int spi = 3782;
    private String zOfbeL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DQYQgr(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null || !UPbYzn.ahrCSq(this.zOfbeL)) {
            return;
        }
        String strDbNXlk = AhwBna.ADVERTISING_ID.DbNXlk();
        if ((fXj ^ 1305) != 0) {
            while (fXj + 39 != 33) {
            }
            while (true) {
                fXj = (fXj * 77) >> 20;
            }
        } else if ((spi ^ 3782) == 0) {
            map.put(strDbNXlk, this.zOfbeL);
        } else {
            while (true) {
                int i = spi;
                if (i + 39 == 46) {
                    spi = (i + i) % 74;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_ADVERTISING_ID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:21:0x0042) to fix multi-entry loop: BACK_EDGE: B:21:0x0042 -> B:22:0x0044 */
    /* JADX DEBUG: Duplicate block (B:39:0x0083) to fix multi-entry loop: BACK_EDGE: B:39:0x0083 -> B:40:0x0089 */
    /* JADX DEBUG: Duplicate block (B:77:0x010e) to fix multi-entry loop: BACK_EDGE: B:76:0x0106 -> B:77:0x010e */
    /* JADX DEBUG: Duplicate block (B:90:0x013e) to fix multi-entry loop: BACK_EDGE: B:89:0x0139 -> B:90:0x013e */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QfgSZK.QSusPL r8, java.util.Map<java.lang.String, java.lang.String> r9) throws java.lang.InterruptedException {
        /*
            r7 = this;
            QfgSZK.ZqidTP r9 = r8.aPFruk()
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r9 = r8.ULRxlR()
            boolean r9 = QfgSZK.UPbYzn.ahrCSq(r9)
            if (r9 == 0) goto L51
            int r9 = QfgSZK.DQYQgr.fXj
            r9 = r9 ^ 1305(0x519, float:1.829E-42)
            if (r9 == 0) goto L4a
        L17:
            int r9 = QfgSZK.DQYQgr.fXj
            int r0 = r9 + 39
            r1 = 57
            if (r0 == r1) goto L3d
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 == r1) goto L32
            r1 = 351(0x15f, float:4.92E-43)
            if (r0 == r1) goto L44
            r1 = 361(0x169, float:5.06E-43)
            if (r0 == r1) goto L2c
            goto L17
        L2c:
            r9 = r9 ^ 5154(0x1422, float:7.222E-42)
            int r9 = r9 * 107
            QfgSZK.DQYQgr.fXj = r9
        L32:
            int r9 = QfgSZK.DQYQgr.fXj
            int r9 = r9 >> 8
            int r9 = r9 * 68
            int r9 = r9 >> 74
            QfgSZK.DQYQgr.fXj = r9
            goto L4a
        L3d:
            r8 = r9 ^ 2972(0xb9c, float:4.165E-42)
            int r8 = r8 >> 15
            int r8 = r8 + r9
        L42:
            QfgSZK.DQYQgr.fXj = r8
        L44:
            int r8 = QfgSZK.DQYQgr.fXj
            int r8 = r8 + r9
            r8 = r8 ^ 3382(0xd36, float:4.739E-42)
            goto L42
        L4a:
            java.lang.String r8 = r8.ULRxlR()
            r7.zOfbeL = r8
            return
        L51:
            java.lang.String r9 = r7.zOfbeL
            boolean r9 = QfgSZK.UPbYzn.iSpHlg(r9)
            if (r9 == 0) goto L155
            int r9 = QfgSZK.DQYQgr.fXj
            r0 = 93
            r1 = 219(0xdb, float:3.07E-43)
            r2 = 40
            r3 = 77
            r4 = 1304(0x518, float:1.827E-42)
            if (r9 > r4) goto L95
        L67:
            int r5 = QfgSZK.DQYQgr.fXj
            int r8 = r5 + 65
            if (r8 == r3) goto L83
            if (r8 == r1) goto L7c
            r9 = 347(0x15b, float:4.86E-43)
            if (r8 == r9) goto L8b
            r9 = 479(0x1df, float:6.71E-43)
            if (r8 == r9) goto L78
            goto L67
        L78:
            int r8 = r5 % 125
            int r8 = r8 >> r0
            goto L89
        L7c:
            int r8 = r5 >> 47
            int r8 = r8 * 88
            QfgSZK.DQYQgr.fXj = r8
            goto L67
        L83:
            int r8 = QfgSZK.DQYQgr.fXj
            int r8 = r8 % 42
            int r8 = r8 * r2
            int r8 = r8 + r5
        L89:
            QfgSZK.DQYQgr.fXj = r8
        L8b:
            int r8 = QfgSZK.DQYQgr.fXj
            r8 = r8 ^ 3572(0xdf4, float:5.005E-42)
            int r8 = r8 % 78
            int r8 = r8 + r5
            QfgSZK.DQYQgr.fXj = r8
            goto L83
        L95:
            int r5 = QfgSZK.DQYQgr.spi
            r6 = 3781(0xec5, float:5.298E-42)
            if (r5 > r6) goto L14b
            r8 = r9 ^ 1305(0x519, float:1.829E-42)
            if (r8 == 0) goto Lb7
        L9f:
            int r8 = QfgSZK.DQYQgr.fXj
            int r9 = r8 + 78
            if (r9 == r3) goto Laf
            r5 = 91
            if (r9 == r5) goto Laa
            goto L9f
        Laa:
            int r8 = r8 + r8
            int r8 = r8 >> 98
            QfgSZK.DQYQgr.fXj = r8
        Laf:
            int r8 = QfgSZK.DQYQgr.fXj
            int r8 = r8 % 104
            int r8 = r8 % 9
            QfgSZK.DQYQgr.fXj = r8
        Lb7:
            int r8 = QfgSZK.DQYQgr.spi
            int r9 = r8 + 65
            r3 = 94
            if (r9 == r3) goto L111
            r3 = 257(0x101, float:3.6E-43)
            if (r9 == r3) goto Lc8
            r8 = 453(0x1c5, float:6.35E-43)
            if (r9 == r8) goto L141
            goto Lb7
        Lc8:
            int r9 = QfgSZK.DQYQgr.spi
            int r3 = QfgSZK.DQYQgr.fXj
            r3 = r3 ^ 1305(0x519, float:1.829E-42)
            if (r3 == 0) goto Le1
        Ld0:
            int r4 = QfgSZK.DQYQgr.fXj
            int r8 = r4 + 130
            if (r8 == r2) goto Ld7
            goto Ld0
        Ld7:
            int r8 = QfgSZK.DQYQgr.fXj
            int r8 = r8 * 92
            int r8 = r8 + r4
            r8 = r8 ^ 4590(0x11ee, float:6.432E-42)
            QfgSZK.DQYQgr.fXj = r8
            goto Ld7
        Le1:
            int r9 = r9 % 108
            r9 = r9 ^ 3151(0xc4f, float:4.415E-42)
            int r9 = r9 + r8
            QfgSZK.DQYQgr.spi = r9
            if (r3 == 0) goto Lc8
        Lea:
            int r8 = QfgSZK.DQYQgr.fXj
            int r9 = r8 + 104
            if (r9 == r0) goto L106
            if (r9 == r1) goto L102
            r8 = 224(0xe0, float:3.14E-43)
            if (r9 == r8) goto Lf7
            goto Lea
        Lf7:
            int r8 = QfgSZK.DQYQgr.fXj
            int r8 = r8 % 97
            int r8 = r8 % 102
            int r8 = r8 * 82
            QfgSZK.DQYQgr.fXj = r8
            goto Lf7
        L102:
            int r8 = r8 + r8
            int r8 = r8 * 7
            goto L10e
        L106:
            int r8 = QfgSZK.DQYQgr.fXj
            int r8 = r8 >> 22
            r8 = r8 ^ 2694(0xa86, float:3.775E-42)
            int r8 = r8 * 61
        L10e:
            QfgSZK.DQYQgr.fXj = r8
            goto L106
        L111:
            r8 = r8 ^ 4866(0x1302, float:6.819E-42)
            int r8 = r8 % 121
            QfgSZK.DQYQgr.spi = r8
            int r8 = QfgSZK.DQYQgr.fXj
            if (r8 > r4) goto L141
        L11b:
            int r8 = QfgSZK.DQYQgr.fXj
            int r9 = r8 + 117
            r0 = 34
            if (r9 == r0) goto L139
            r0 = 214(0xd6, float:3.0E-43)
            if (r9 == r0) goto L135
            r8 = 395(0x18b, float:5.54E-43)
            if (r9 == r8) goto L12c
            goto L11b
        L12c:
            int r8 = QfgSZK.DQYQgr.fXj
            int r8 = r8 * 63
            int r8 = r8 % 76
            QfgSZK.DQYQgr.fXj = r8
            goto L12c
        L135:
            r9 = r8 ^ 3461(0xd85, float:4.85E-42)
            int r9 = r9 + r8
            goto L13e
        L139:
            int r9 = QfgSZK.DQYQgr.fXj
            int r9 = r9 + r8
            int r9 = r9 * 1216
        L13e:
            QfgSZK.DQYQgr.fXj = r9
            goto L139
        L141:
            int r8 = QfgSZK.DQYQgr.spi
            r8 = r8 ^ 3203(0xc83, float:4.488E-42)
            int r8 = r8 >> 19
            QfgSZK.DQYQgr.spi = r8
            goto Lb7
        L14b:
            QfgSZK.ZqidTP r8 = r8.aPFruk()
            java.lang.String r8 = QfgSZK.DGUQLI.ULRxlR(r8)
            r7.zOfbeL = r8
        L155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DQYQgr.zuBGHE(QfgSZK.QSusPL, java.util.Map):void");
    }
}
