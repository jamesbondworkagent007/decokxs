package QfgSZK;

import QfgSZK.QhsCdE;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DxnCrt extends QhsCdE {
    public static int __i = 4380;
    public static int fpW = 6452;
    String aacIaS;
    boolean dxULLb;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DxnCrt(long j, boolean z) {
        super(j, z);
        if (fpW <= 6451) {
            while (true) {
                int i = fpW;
                int i2 = i + 13;
                if (i2 == 41) {
                    break;
                }
                if (i2 == 81) {
                    while (true) {
                        fpW = (fpW ^ 1311) >> 86;
                    }
                } else if (i2 == 209) {
                    fpW = (i * 30) >> 100;
                    break;
                }
            }
            fpW >>= CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256;
        }
        this.dxULLb = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2 A[LOOP:9: B:56:0x00d2->B:111:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed A[LOOP:7: B:62:0x00ed->B:106:0x00ed, LOOP_START] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00d0 -> B:60:0x00e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gHZMYf(java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            boolean r0 = r7.dxULLb
            if (r0 == 0) goto L128
            java.lang.String r0 = r7.aacIaS
            int r1 = QfgSZK.DxnCrt.__i
            r1 = r1 ^ 4380(0x111c, float:6.138E-42)
            if (r1 == 0) goto L12a
            int r8 = QfgSZK.DxnCrt.fpW
            r1 = 38
            r2 = 6451(0x1933, float:9.04E-42)
            if (r8 > r2) goto L32
        L17:
            int r8 = QfgSZK.DxnCrt.fpW
            int r0 = r8 + 65
            if (r0 == r1) goto L2b
            r8 = 53
            if (r0 == r8) goto L22
            goto L17
        L22:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 * 28
            int r8 = r8 >> 19
            QfgSZK.DxnCrt.fpW = r8
            goto L22
        L2b:
            r8 = r8 ^ 5175(0x1437, float:7.252E-42)
            int r8 = r8 * 24
            QfgSZK.DxnCrt.fpW = r8
            goto L17
        L32:
            int r3 = QfgSZK.DxnCrt.__i
            int r8 = QfgSZK.DxnCrt.fpW
            r8 = r8 ^ 6452(0x1934, float:9.041E-42)
            if (r8 == 0) goto L59
        L3a:
            int r8 = QfgSZK.DxnCrt.fpW
            int r0 = r8 + 169
            r4 = 42
            if (r0 == r4) goto L52
            r8 = 181(0xb5, float:2.54E-43)
            if (r0 == r8) goto L47
            goto L3a
        L47:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 % 79
            int r8 = r8 >> 4
            int r8 = r8 % 87
            QfgSZK.DxnCrt.fpW = r8
            goto L47
        L52:
            r8 = r8 ^ 2335(0x91f, float:3.272E-42)
            r0 = 172(0xac, float:2.41E-43)
            int r8 = r8 >> r0
            QfgSZK.DxnCrt.fpW = r8
        L59:
            int r8 = r3 + 39
            r0 = 18
            r4 = 69
            if (r8 == r0) goto L93
            r0 = 30
            if (r8 == r0) goto Lc5
            r0 = 149(0x95, float:2.09E-43)
            if (r8 == r0) goto Le5
            r0 = 186(0xba, float:2.6E-43)
            if (r8 == r0) goto L6e
            goto L32
        L6e:
            int r8 = QfgSZK.DxnCrt.__i
            int r0 = QfgSZK.DxnCrt.fpW
            r0 = r0 ^ 6452(0x1934, float:9.041E-42)
            if (r0 == 0) goto L8a
        L76:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 + 182
            r0 = 66
            if (r8 == r0) goto L7f
            goto L76
        L7f:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 % 79
            r8 = r8 ^ 4354(0x1102, float:6.101E-42)
            int r8 = r8 % 120
            QfgSZK.DxnCrt.fpW = r8
            goto L7f
        L8a:
            r8 = r8 ^ 2507(0x9cb, float:3.513E-42)
            int r8 = r8 % 119
            r8 = r8 ^ 3606(0xe16, float:5.053E-42)
            QfgSZK.DxnCrt.__i = r8
            goto L32
        L93:
            int r8 = QfgSZK.DxnCrt.__i
            int r0 = QfgSZK.DxnCrt.fpW
            if (r0 > r2) goto La7
        L99:
            int r8 = QfgSZK.DxnCrt.fpW
            int r0 = r8 + 195
            if (r0 == r4) goto La0
            goto L99
        La0:
            int r8 = r8 * 63
            int r8 = r8 >> 32
            QfgSZK.DxnCrt.fpW = r8
            goto L99
        La7:
            int r8 = r8 + r3
            r8 = r8 ^ 3587(0xe03, float:5.026E-42)
            int r8 = r8 + r3
            QfgSZK.DxnCrt.__i = r8
            r8 = r0 ^ 6452(0x1934, float:9.041E-42)
            if (r8 == 0) goto Lc5
        Lb1:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 + 91
            r0 = 47
            if (r8 == r0) goto Lba
            goto Lb1
        Lba:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 % 57
            r8 = r8 ^ 1841(0x731, float:2.58E-42)
            int r8 = r8 >> 56
            QfgSZK.DxnCrt.fpW = r8
            goto Lba
        Lc5:
            int r8 = QfgSZK.DxnCrt.__i
            int r8 = r8 >> 92
            int r8 = r8 + r3
            r8 = r8 ^ 1040(0x410, float:1.457E-42)
            QfgSZK.DxnCrt.__i = r8
            int r8 = QfgSZK.DxnCrt.fpW
            if (r8 > r2) goto Le5
        Ld2:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 + 104
            r0 = 50
            if (r8 == r0) goto Ldb
            goto Ld2
        Ldb:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 >> 17
            int r8 = r8 % 73
            int r8 = r8 * r4
            QfgSZK.DxnCrt.fpW = r8
            goto Ldb
        Le5:
            int r8 = QfgSZK.DxnCrt.__i
            int r0 = QfgSZK.DxnCrt.fpW
            r0 = r0 ^ 6452(0x1934, float:9.041E-42)
            if (r0 == 0) goto L122
        Led:
            int r0 = QfgSZK.DxnCrt.fpW
            int r5 = r0 + 143
            r6 = 55
            if (r5 == r6) goto L11b
            r6 = 253(0xfd, float:3.55E-43)
            if (r5 == r6) goto L113
            r6 = 386(0x182, float:5.41E-43)
            if (r5 == r6) goto L10b
            r6 = 398(0x18e, float:5.58E-43)
            if (r5 == r6) goto L102
            goto Led
        L102:
            int r0 = r0 * 94
            r0 = r0 ^ 4611(0x1203, float:6.461E-42)
            int r0 = r0 * 26
            QfgSZK.DxnCrt.fpW = r0
            goto L122
        L10b:
            int r8 = QfgSZK.DxnCrt.fpW
            int r8 = r8 + r0
            int r8 = r8 >> 96
            QfgSZK.DxnCrt.fpW = r8
            goto L10b
        L113:
            int r5 = r0 % 11
            int r5 = r5 + r0
            r0 = r5 ^ 1956(0x7a4, float:2.741E-42)
            QfgSZK.DxnCrt.fpW = r0
            goto Led
        L11b:
            int r5 = r0 >> 101
            r5 = r5 ^ 1497(0x5d9, float:2.098E-42)
            int r5 = r5 + r0
            QfgSZK.DxnCrt.fpW = r5
        L122:
            int r8 = r8 % r1
            int r8 = r8 * 495
            QfgSZK.DxnCrt.__i = r8
            goto Lc5
        L128:
            java.lang.String r0 = QfgSZK.RjCdvp.UKISMj
        L12a:
            QfgSZK.AhwBna r1 = QfgSZK.AhwBna.PLUGIN_PATH_STR
            java.lang.String r1 = r1.DbNXlk()
            r8.put(r1, r0)
            r8 = 0
            r7.dxULLb = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DxnCrt.gHZMYf(java.util.Map):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_PLUGIN_DETECTION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (qSusPL.aPFruk() == null) {
            return;
        }
        this.aacIaS = DGUQLI.sTzBva(qSusPL.aPFruk());
        this.dxULLb = true;
    }
}
