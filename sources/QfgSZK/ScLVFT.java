package QfgSZK;

import QfgSZK.OeawrH;
import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class ScLVFT extends QhsCdE {

    /* JADX INFO: Incorrect field signature: Lint; */
    static String DwBCYe = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String OqZVHZ = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String RXauQH = null;
    public static int UEW = 0;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hinHOL = null;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String nnsgc = null;
    public static int zFe = 2046;
    private OeawrH.RnVkix iwRaDl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        UEW = 7636;
        GCXiNH.OHr = 2270;
        DtA(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ScLVFT(long j, boolean z) {
        super(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void DtA(boolean z) {
        if (z) {
            DtA(false);
        }
        OqZVHZ = GCXiNH.fsw("?e_m\t\u000b");
        nnsgc = GCXiNH.fsw("?|W\u007f\t\u000b");
        if ((zFe ^ 2046) == 0) {
            RXauQH = GCXiNH.fsw("?|Wo\t\u000b");
            DwBCYe = GCXiNH.fsw("?bWo\t\u000b");
            hinHOL = GCXiNH.fsw("?bW\u007f\t\u000b");
        } else {
            while (true) {
                int i = zFe;
                int i2 = i + 26;
                if (i2 == 57) {
                    zFe = (i + i) * 1575;
                } else if (i2 != 161) {
                }
                zFe = ((zFe * 69) ^ 1071) + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:125:0x01e7) to fix multi-entry loop: BACK_EDGE: B:125:0x01e7 -> B:126:0x01f0 */
    /* JADX DEBUG: Duplicate block (B:79:0x012e) to fix multi-entry loop: BACK_EDGE: B:78:0x0126 -> B:79:0x012e */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01d2 A[LOOP:16: B:119:0x01d2->B:202:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fd A[LOOP:17: B:128:0x01fd->B:207:0x01fd, LOOP_START] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x01d0 -> B:126:0x01f0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private java.lang.String hBORwR() {
        /*
            r10 = this;
            QfgSZK.OeawrH$RnVkix r0 = r10.iwRaDl
            java.lang.String r1 = ""
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r0.<init>(r2)
            QfgSZK.OeawrH$RnVkix r2 = r10.iwRaDl
            int r2 = r2.DcEADc
            r3 = 0
            if (r2 < 0) goto L23
            java.lang.String r2 = QfgSZK.ScLVFT.RXauQH
            r0.append(r2)
            QfgSZK.OeawrH$RnVkix r2 = r10.iwRaDl
            int r2 = r2.DcEADc
            r0.append(r2)
            r2 = r3
            goto L24
        L23:
            r2 = 1
        L24:
            QfgSZK.OeawrH$RnVkix r4 = r10.iwRaDl
            int r4 = r4.dMZcpz
            r5 = 7635(0x1dd3, float:1.0699E-41)
            java.lang.String r6 = ","
            r7 = 2045(0x7fd, float:2.866E-42)
            if (r4 < 0) goto L9b
            if (r2 == 0) goto L8c
            int r2 = QfgSZK.ScLVFT.UEW
            if (r2 > r5) goto L8a
            int r0 = QfgSZK.ScLVFT.zFe
            if (r0 > r7) goto L57
        L3a:
            int r0 = QfgSZK.ScLVFT.zFe
            int r1 = r0 + 78
            r2 = 69
            if (r1 == r2) goto L4e
            r2 = 105(0x69, float:1.47E-43)
            if (r1 == r2) goto L47
            goto L3a
        L47:
            int r1 = r0 + r0
            int r1 = r1 + r0
            int r1 = r1 >> 106
            QfgSZK.ScLVFT.zFe = r1
        L4e:
            int r1 = QfgSZK.ScLVFT.zFe
            int r1 = r1 + r0
            r0 = r1 ^ 2053(0x805, float:2.877E-42)
            int r0 = r0 * 34
            QfgSZK.ScLVFT.zFe = r0
        L57:
            int r2 = QfgSZK.ScLVFT.UEW
            int r0 = r2 + 65
            r1 = 25
            if (r0 == r1) goto L82
            r1 = 50
            if (r0 == r1) goto L64
            goto L57
        L64:
            int r0 = QfgSZK.ScLVFT.UEW
            int r0 = r0 * 221
            QfgSZK.ScLVFT.UEW = r0
            int r0 = QfgSZK.ScLVFT.zFe
            if (r0 > r7) goto L64
        L6e:
            int r0 = QfgSZK.ScLVFT.zFe
            int r0 = r0 + 364
            r1 = 19
            if (r0 == r1) goto L77
            goto L6e
        L77:
            int r0 = QfgSZK.ScLVFT.zFe
            int r0 = r0 >> 123
            int r0 = r0 % 36
            int r0 = r0 % 110
            QfgSZK.ScLVFT.zFe = r0
            goto L77
        L82:
            int r0 = QfgSZK.ScLVFT.UEW
            int r0 = r0 % 55
            int r0 = r0 + r2
            QfgSZK.ScLVFT.UEW = r0
            goto L82
        L8a:
            r2 = r3
            goto L8f
        L8c:
            r0.append(r6)
        L8f:
            java.lang.String r4 = QfgSZK.ScLVFT.nnsgc
            r0.append(r4)
            QfgSZK.OeawrH$RnVkix r4 = r10.iwRaDl
            int r4 = r4.dMZcpz
            r0.append(r4)
        L9b:
            QfgSZK.OeawrH$RnVkix r4 = r10.iwRaDl
            int r4 = r4.fbTQEA
            if (r4 < 0) goto Lb4
            if (r2 == 0) goto La5
            r2 = r3
            goto La8
        La5:
            r0.append(r6)
        La8:
            java.lang.String r4 = QfgSZK.ScLVFT.DwBCYe
            r0.append(r4)
            QfgSZK.OeawrH$RnVkix r4 = r10.iwRaDl
            int r4 = r4.fbTQEA
            r0.append(r4)
        Lb4:
            QfgSZK.OeawrH$RnVkix r4 = r10.iwRaDl
            int r4 = r4.awZGGp
            r8 = 119(0x77, float:1.67E-43)
            if (r4 < 0) goto L165
            if (r2 == 0) goto L154
            int r2 = QfgSZK.ScLVFT.UEW
            if (r2 > r5) goto L158
            int r2 = QfgSZK.ScLVFT.zFe
            r4 = 42
            if (r2 > r7) goto Led
        Lc8:
            int r2 = QfgSZK.ScLVFT.zFe
            int r5 = r2 + 169
            r9 = 29
            if (r5 == r9) goto Le5
            r9 = 141(0x8d, float:1.98E-43)
            if (r5 == r9) goto Ldd
            r9 = 159(0x9f, float:2.23E-43)
            if (r5 == r9) goto Ld9
            goto Lc8
        Ld9:
            int r2 = r2 * 14880
            QfgSZK.ScLVFT.zFe = r2
        Ldd:
            int r2 = QfgSZK.ScLVFT.zFe
            int r2 = r2 * r4
            r2 = r2 ^ 3802(0xeda, float:5.328E-42)
            QfgSZK.ScLVFT.zFe = r2
            goto Led
        Le5:
            int r5 = r2 + r2
            int r5 = r5 + r2
            int r5 = r5 * 67
            QfgSZK.ScLVFT.zFe = r5
            goto Lc8
        Led:
            int r2 = QfgSZK.ScLVFT.UEW
            int r5 = r2 + 143
            r9 = 88
            if (r5 == r9) goto L13b
            r9 = 130(0x82, float:1.82E-43)
            if (r5 == r9) goto L131
            r9 = 326(0x146, float:4.57E-43)
            if (r5 == r9) goto Lfe
            goto Led
        Lfe:
            r0 = r2 ^ 2483(0x9b3, float:3.48E-42)
            int r0 = r0 >> 125
            QfgSZK.ScLVFT.UEW = r0
            int r0 = QfgSZK.ScLVFT.zFe
            if (r0 > r7) goto L131
        L108:
            int r0 = QfgSZK.ScLVFT.zFe
            int r1 = r0 + 273
            r2 = 85
            if (r1 == r2) goto L126
            if (r1 == r8) goto L11f
            r2 = 131(0x83, float:1.84E-43)
            if (r1 == r2) goto L117
            goto L108
        L117:
            int r1 = QfgSZK.ScLVFT.zFe
            int r1 = r1 + r0
            int r1 = r1 % 123
            QfgSZK.ScLVFT.zFe = r1
            goto L117
        L11f:
            int r0 = r0 % 94
            r0 = r0 ^ 1053(0x41d, float:1.476E-42)
            int r0 = r0 >> 34
            goto L12e
        L126:
            int r0 = QfgSZK.ScLVFT.zFe
            int r0 = r0 * 56
            r0 = r0 ^ 3168(0xc60, float:4.44E-42)
            int r0 = r0 >> 30
        L12e:
            QfgSZK.ScLVFT.zFe = r0
            goto L126
        L131:
            int r0 = QfgSZK.ScLVFT.UEW
            int r0 = r0 + r2
            int r0 = r0 % 123
            int r0 = r0 * 55
            QfgSZK.ScLVFT.UEW = r0
            goto L131
        L13b:
            int r2 = r2 * 125
            r2 = r2 ^ 1216(0x4c0, float:1.704E-42)
            QfgSZK.ScLVFT.UEW = r2
            int r2 = QfgSZK.ScLVFT.zFe
            if (r2 > r7) goto L158
        L145:
            int r2 = QfgSZK.ScLVFT.zFe
            int r5 = r2 + 156
            if (r5 == r4) goto L14c
            goto L145
        L14c:
            int r4 = r2 >> 7
            int r4 = r4 + r2
            r2 = r4 ^ 3939(0xf63, float:5.52E-42)
            QfgSZK.ScLVFT.zFe = r2
            goto L158
        L154:
            r0.append(r6)
            r3 = r2
        L158:
            java.lang.String r2 = QfgSZK.ScLVFT.hinHOL
            r0.append(r2)
            QfgSZK.OeawrH$RnVkix r2 = r10.iwRaDl
            int r2 = r2.awZGGp
            r0.append(r2)
            r2 = r3
        L165:
            QfgSZK.OeawrH$RnVkix r3 = r10.iwRaDl
            boolean r4 = r3.fUsOZj
            if (r4 != 0) goto L173
            int r4 = r3.DcEADc
            if (r4 >= 0) goto L173
            int r3 = r3.dMZcpz
            if (r3 < 0) goto L184
        L173:
            if (r2 != 0) goto L178
            r0.append(r6)
        L178:
            java.lang.String r2 = QfgSZK.ScLVFT.OqZVHZ
            r0.append(r2)
            QfgSZK.OeawrH$RnVkix r2 = r10.iwRaDl
            boolean r2 = r2.fUsOZj
            r0.append(r2)
        L184:
            java.lang.String r2 = "}"
            r0.append(r2)
            int r2 = r0.length()
            r3 = 2
            if (r2 <= r3) goto L271
            java.lang.String r1 = r0.toString()
            int r0 = QfgSZK.ScLVFT.UEW
            r0 = r0 ^ 7636(0x1dd4, float:1.07E-41)
            if (r0 == 0) goto L271
            int r0 = QfgSZK.ScLVFT.zFe
            r1 = 70
            if (r0 > r7) goto L1af
        L1a0:
            int r0 = QfgSZK.ScLVFT.zFe
            int r0 = r0 + 247
            if (r0 == r1) goto L1a7
            goto L1a0
        L1a7:
            int r0 = QfgSZK.ScLVFT.zFe
            int r0 = r0 * r8
            r0 = r0 ^ 4782(0x12ae, float:6.701E-42)
            QfgSZK.ScLVFT.zFe = r0
            goto L1a7
        L1af:
            int r0 = QfgSZK.ScLVFT.UEW
            int r2 = r0 + 208
            r3 = 39
            if (r2 == r3) goto L234
            r3 = 211(0xd3, float:2.96E-43)
            if (r2 == r3) goto L1c4
            r3 = 366(0x16e, float:5.13E-43)
            if (r2 == r3) goto L267
            r0 = 561(0x231, float:7.86E-43)
            if (r2 == r0) goto L1f0
            goto L1af
        L1c4:
            int r0 = QfgSZK.ScLVFT.UEW
            int r0 = r0 * 115
            r0 = r0 ^ 2597(0xa25, float:3.639E-42)
            QfgSZK.ScLVFT.UEW = r0
            int r0 = QfgSZK.ScLVFT.zFe
            r0 = r0 ^ 2046(0x7fe, float:2.867E-42)
            if (r0 == 0) goto L1f0
        L1d2:
            int r0 = QfgSZK.ScLVFT.zFe
            int r2 = r0 + 338
            r3 = 92
            if (r2 == r3) goto L1e7
            r3 = 261(0x105, float:3.66E-43)
            if (r2 == r3) goto L1df
            goto L1d2
        L1df:
            int r2 = r0 % 5
            int r2 = r2 * 93
            r2 = r2 ^ 5101(0x13ed, float:7.148E-42)
            QfgSZK.ScLVFT.zFe = r2
        L1e7:
            int r2 = QfgSZK.ScLVFT.zFe
            int r2 = r2 * 74
            int r2 = r2 % 71
            int r2 = r2 + r0
            QfgSZK.ScLVFT.zFe = r2
        L1f0:
            int r0 = QfgSZK.ScLVFT.UEW
            int r0 = r0 % r1
            int r0 = r0 * 16
            QfgSZK.ScLVFT.UEW = r0
            int r0 = QfgSZK.ScLVFT.zFe
            r0 = r0 ^ 2046(0x7fe, float:2.867E-42)
            if (r0 == 0) goto L1c4
        L1fd:
            int r0 = QfgSZK.ScLVFT.zFe
            int r1 = r0 + 312
            r2 = 20
            if (r1 == r2) goto L22b
            r2 = 87
            if (r1 == r2) goto L222
            r2 = 160(0xa0, float:2.24E-43)
            if (r1 == r2) goto L212
            r0 = 239(0xef, float:3.35E-43)
            if (r1 == r0) goto L219
            goto L1fd
        L212:
            int r1 = r0 % 30
            int r1 = r1 + r0
            int r1 = r1 * 38
            QfgSZK.ScLVFT.zFe = r1
        L219:
            int r0 = QfgSZK.ScLVFT.zFe
            int r0 = r0 >> 30
            r0 = r0 ^ 3651(0xe43, float:5.116E-42)
            QfgSZK.ScLVFT.zFe = r0
            goto L1fd
        L222:
            int r0 = QfgSZK.ScLVFT.zFe
            r0 = r0 ^ 3211(0xc8b, float:4.5E-42)
            int r0 = r0 * 15
            QfgSZK.ScLVFT.zFe = r0
            goto L222
        L22b:
            int r0 = QfgSZK.ScLVFT.zFe
            int r0 = r0 * 54
            int r0 = r0 >> 4
            QfgSZK.ScLVFT.zFe = r0
            goto L22b
        L234:
            r1 = r0 ^ 1266(0x4f2, float:1.774E-42)
            int r1 = r1 * 110
            QfgSZK.ScLVFT.UEW = r1
            int r1 = QfgSZK.ScLVFT.zFe
            r1 = r1 ^ 2046(0x7fe, float:2.867E-42)
            if (r1 == 0) goto L267
        L240:
            int r1 = QfgSZK.ScLVFT.zFe
            int r2 = r1 + 325
            r4 = 24
            if (r2 == r4) goto L25f
            r4 = 208(0xd0, float:2.91E-43)
            if (r2 == r4) goto L25a
            r4 = 248(0xf8, float:3.48E-43)
            if (r2 == r4) goto L251
            goto L240
        L251:
            int r1 = r1 * 84
            int r1 = r1 >> 15
            int r1 = r1 * 91
            QfgSZK.ScLVFT.zFe = r1
            goto L267
        L25a:
            int r1 = r1 * 112
            r1 = r1 ^ 2176(0x880, float:3.049E-42)
            goto L264
        L25f:
            r1 = r1 ^ 1151(0x47f, float:1.613E-42)
            int r1 = r1 >> 21
            int r1 = r1 * r3
        L264:
            QfgSZK.ScLVFT.zFe = r1
            goto L240
        L267:
            int r1 = QfgSZK.ScLVFT.UEW
            int r1 = r1 * 108
            r1 = r1 ^ 2244(0x8c4, float:3.145E-42)
            int r1 = r1 + r0
            QfgSZK.ScLVFT.UEW = r1
            goto L267
        L271:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.ScLVFT.hBORwR():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        map.put(AhwBna.SHARED_LIB_INFO.DbNXlk(), hBORwR());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_SHARED_LIB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (this.iwRaDl == null) {
            this.iwRaDl = DGUQLI.vLaW();
        }
    }
}
