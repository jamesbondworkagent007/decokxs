package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class AubY extends QhsCdE {
    private static String imAnZh = null;
    private static String lmDTV = null;
    public static int snQ = 0;
    public static int zER = 2953;
    int QTOTCL;
    String feIwXk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        snQ = 2336;
        GCXiNH.OHr = 2270;
        imAnZh = GCXiNH.fsw("~tW`^]`l");
        lmDTV = GCXiNH.fsw("k~R|");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AubY(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:15:0x0033) to fix multi-entry loop: BACK_EDGE: B:14:0x002e -> B:15:0x0033 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        if (map == null) {
            return;
        }
        map.put(AhwBna.IN_CALL_STATUS.DbNXlk(), String.valueOf(this.QTOTCL));
        if ((zER ^ 2953) == 0) {
            if (this.feIwXk != null) {
                map.put(AhwBna.IN_CALL_TYPE.DbNXlk(), this.feIwXk);
                return;
            }
            return;
        }
        while (true) {
            i = zER;
            int i2 = i + 26;
            if (i2 == 75) {
                zER = (i * 98) ^ 2586;
            } else if (i2 != 252) {
                if (i2 == 271) {
                    zER = (i + i) % WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            zER = (zER >> 23) + i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_PHONE_CALL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:105:0x018a) to fix multi-entry loop: BACK_EDGE: B:105:0x018a -> B:106:0x018c */
    /* JADX DEBUG: Duplicate block (B:136:0x01f8) to fix multi-entry loop: BACK_EDGE: B:136:0x01f8 -> B:137:0x01ff */
    /* JADX DEBUG: Duplicate block (B:200:0x02e4) to fix multi-entry loop: BACK_EDGE: B:199:0x02dd -> B:200:0x02e4 */
    /* JADX DEBUG: Duplicate block (B:60:0x00d8) to fix multi-entry loop: BACK_EDGE: B:60:0x00d8 -> B:61:0x00da */
    /* JADX DEBUG: Duplicate block (B:62:0x00e1) to fix multi-entry loop: BACK_EDGE: B:62:0x00e1 -> B:47:0x00ae */
    /* JADX DEBUG: Duplicate block (B:77:0x011f) to fix multi-entry loop: BACK_EDGE: B:77:0x011f -> B:78:0x0128 */
    /* JADX WARN: Path cross not found for [B:237:?, B:233:?], limit reached: 301 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QfgSZK.QSusPL r11, java.util.Map<java.lang.String, java.lang.String> r12) throws java.lang.InterruptedException {
        /*
            r10 = this;
            QfgSZK.ZqidTP r12 = r11.aPFruk()
            if (r12 != 0) goto L7
            return
        L7:
            r12 = 0
            r10.QTOTCL = r12
            r12 = 0
            r10.feIwXk = r12
            int r12 = QfgSZK.AubY.zER
            r0 = 69
            r1 = 2952(0xb88, float:4.137E-42)
            if (r12 > r1) goto L22
        L15:
            int r12 = QfgSZK.AubY.zER
            int r2 = r12 + 26
            if (r2 == r0) goto L1c
            goto L15
        L1c:
            r12 = r12 ^ 5159(0x1427, float:7.229E-42)
            int r12 = r12 % 73
            QfgSZK.AubY.zER = r12
        L22:
            QfgSZK.ZqidTP r11 = r11.aPFruk()
            int r12 = QfgSZK.AubY.snQ
            r2 = 66
            r3 = 2335(0x91f, float:3.272E-42)
            r4 = 84
            r5 = 54
            r6 = 35
            if (r12 > r3) goto Lea
            int r11 = QfgSZK.AubY.zER
            if (r11 > r1) goto L46
        L38:
            int r11 = QfgSZK.AubY.zER
            int r12 = r11 + 234
            r0 = 5
            if (r12 == r0) goto L40
            goto L38
        L40:
            int r11 = r11 * 7
            int r11 = r11 >> r2
            QfgSZK.AubY.zER = r11
            goto L38
        L46:
            int r12 = QfgSZK.AubY.snQ
            int r11 = r12 + 65
            r2 = 34
            if (r11 == r2) goto Lae
            r2 = 128(0x80, float:1.794E-43)
            if (r11 == r2) goto L9a
            r2 = 195(0xc3, float:2.73E-43)
            if (r11 == r2) goto L9f
            r2 = 388(0x184, float:5.44E-43)
            if (r11 == r2) goto L5b
            goto L46
        L5b:
            int r11 = r12 % 60
            int r11 = r11 * r0
            QfgSZK.AubY.snQ = r11
            int r11 = QfgSZK.AubY.zER
            r11 = r11 ^ 2953(0xb89, float:4.138E-42)
            if (r11 == 0) goto L9f
        L66:
            int r11 = QfgSZK.AubY.zER
            int r0 = r11 + 273
            r2 = 46
            if (r0 == r2) goto L91
            r2 = 141(0x8d, float:1.98E-43)
            if (r0 == r2) goto L83
            r2 = 319(0x13f, float:4.47E-43)
            if (r0 == r2) goto L89
            r11 = 324(0x144, float:4.54E-43)
            if (r0 == r11) goto L7b
            goto L66
        L7b:
            int r11 = QfgSZK.AubY.zER
            r11 = r11 ^ 1556(0x614, float:2.18E-42)
            int r11 = r11 >> r4
            QfgSZK.AubY.zER = r11
            goto L7b
        L83:
            r0 = r11 ^ 3200(0xc80, float:4.484E-42)
            int r0 = r0 >> 61
            QfgSZK.AubY.zER = r0
        L89:
            int r0 = QfgSZK.AubY.zER
            int r0 = r0 >> 27
            r0 = r0 ^ 1220(0x4c4, float:1.71E-42)
            QfgSZK.AubY.zER = r0
        L91:
            int r0 = QfgSZK.AubY.zER
            int r0 = r0 * 48
            int r0 = r0 + r11
            int r0 = r0 + r11
            QfgSZK.AubY.zER = r0
            goto L9f
        L9a:
            int r11 = r12 >> 58
            int r11 = r11 + r12
            QfgSZK.AubY.snQ = r11
        L9f:
            int r11 = QfgSZK.AubY.snQ
            int r11 = r11 * 6
            r11 = r11 ^ 1933(0x78d, float:2.709E-42)
            QfgSZK.AubY.snQ = r11
            int r11 = QfgSZK.AubY.zER
            r11 = r11 ^ 2953(0xb89, float:4.138E-42)
            if (r11 == 0) goto Lae
            goto Lb9
        Lae:
            int r11 = QfgSZK.AubY.snQ
            int r11 = r11 + r12
            int r11 = r11 * 86
            QfgSZK.AubY.snQ = r11
            int r11 = QfgSZK.AubY.zER
            if (r11 > r1) goto Lae
        Lb9:
            int r11 = QfgSZK.AubY.zER
            int r0 = r11 + 247
            if (r0 == r6) goto Le1
            r2 = 59
            if (r0 == r2) goto Ld3
            r2 = 81
            if (r0 == r2) goto Lcc
            r2 = 184(0xb8, float:2.58E-43)
            if (r0 == r2) goto Lda
            goto Lb9
        Lcc:
            int r11 = r11 % 27
            int r11 = r11 >> 119
            QfgSZK.AubY.zER = r11
            goto Le1
        Ld3:
            int r12 = r11 * 56
            int r12 = r12 % 60
            int r12 = r12 >> r5
        Ld8:
            QfgSZK.AubY.zER = r12
        Lda:
            int r12 = QfgSZK.AubY.zER
            int r12 = r12 + r11
            r12 = r12 ^ 5196(0x144c, float:7.281E-42)
            int r12 = r12 + r11
            goto Ld8
        Le1:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 >> 75
            int r11 = r11 * 45
            QfgSZK.AubY.zER = r11
            goto Lae
        Lea:
            android.content.Context r11 = r11.Umbazn
            java.lang.String r12 = "|d_eD"
            java.lang.String r12 = QfgSZK.GCXiNH.fsw(r12)
            java.lang.Object r11 = r11.getSystemService(r12)
            int r12 = QfgSZK.AubY.zER
            r12 = r12 ^ 2953(0xb89, float:4.138E-42)
            if (r12 == 0) goto L12d
        Lfc:
            int r12 = QfgSZK.AubY.zER
            int r11 = r12 + 78
            r0 = 41
            if (r11 == r0) goto L11a
            r0 = 220(0xdc, float:3.08E-43)
            if (r11 == r0) goto L11f
            r0 = 229(0xe5, float:3.21E-43)
            if (r11 == r0) goto L128
            r12 = 301(0x12d, float:4.22E-43)
            if (r11 == r12) goto L111
            goto Lfc
        L111:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 >> 11
            r11 = r11 ^ 5483(0x156b, float:7.683E-42)
            QfgSZK.AubY.zER = r11
            goto L111
        L11a:
            int r11 = r12 >> 6
        L11c:
            int r11 = r11 + r12
            QfgSZK.AubY.zER = r11
        L11f:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 >> 110
            int r11 = r11 % 126
            int r11 = r11 + r12
            QfgSZK.AubY.zER = r11
        L128:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 >> 29
            goto L11c
        L12d:
            boolean r12 = r11 instanceof android.media.AudioManager
            if (r12 != 0) goto L132
            return
        L132:
            android.media.AudioManager r11 = (android.media.AudioManager) r11
            int r11 = r11.getMode()
            int r12 = QfgSZK.AubY.zER
            r7 = 1
            r8 = 97
            if (r12 > r1) goto L156
        L13f:
            int r12 = QfgSZK.AubY.zER
            int r9 = r12 + 39
            if (r9 == r7) goto L150
            if (r9 == r0) goto L148
            goto L13f
        L148:
            int r12 = r12 >> 13
            int r12 = r12 % r8
            int r12 = r12 * 95
            QfgSZK.AubY.zER = r12
            goto L156
        L150:
            int r12 = r12 + r12
            int r12 = r12 >> 71
            QfgSZK.AubY.zER = r12
            goto L13f
        L156:
            r12 = 2
            r0 = 105(0x69, float:1.47E-43)
            r9 = 77
            if (r11 != r12) goto L20d
            r10.QTOTCL = r7
            int r11 = QfgSZK.AubY.zER
            if (r11 > r1) goto L192
        L163:
            int r11 = QfgSZK.AubY.zER
            int r12 = r11 + 91
            if (r12 == r5) goto L182
            if (r12 == r0) goto L17b
            r6 = 214(0xd6, float:3.0E-43)
            if (r12 == r6) goto L174
            r6 = 280(0x118, float:3.92E-43)
            if (r12 == r6) goto L18c
            goto L163
        L174:
            int r11 = r11 >> 17
            int r11 = r11 % 50
            QfgSZK.AubY.zER = r11
            goto L192
        L17b:
            r12 = r11 ^ 1917(0x77d, float:2.686E-42)
            int r12 = r12 + r11
            r12 = r12 ^ 3459(0xd83, float:4.847E-42)
            QfgSZK.AubY.zER = r12
        L182:
            int r12 = QfgSZK.AubY.zER
            int r12 = r12 * 116
            r12 = r12 ^ 3719(0xe87, float:5.211E-42)
            int r12 = r12 >> 104
        L18a:
            QfgSZK.AubY.zER = r12
        L18c:
            int r12 = QfgSZK.AubY.zER
            int r12 = r12 * 121
            int r12 = r12 + r11
            goto L18a
        L192:
            java.lang.String r11 = "~tW`^]`l"
            java.lang.String r11 = QfgSZK.GCXiNH.fsw(r11)
            r10.feIwXk = r11
            int r11 = QfgSZK.AubY.snQ
            if (r11 > r3) goto L309
        L19e:
            int r11 = QfgSZK.AubY.snQ
            int r12 = r11 + 52
            r0 = 90
            if (r12 == r0) goto L1d3
            r0 = 102(0x66, float:1.43E-43)
            if (r12 == r0) goto L1ab
            goto L19e
        L1ab:
            int r12 = QfgSZK.AubY.snQ
            int r12 = r12 + r11
            r12 = r12 ^ 7512(0x1d58, float:1.0527E-41)
            QfgSZK.AubY.snQ = r12
            int r12 = QfgSZK.AubY.zER
            r12 = r12 ^ 2953(0xb89, float:4.138E-42)
            if (r12 == 0) goto L1ab
        L1b8:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 + 130
            if (r11 == r2) goto L1cb
            r12 = 78
            if (r11 == r12) goto L1c3
            goto L1b8
        L1c3:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 % 73
            int r11 = r11 * r4
            QfgSZK.AubY.zER = r11
            goto L1c3
        L1cb:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 * 119
            int r11 = r11 % r9
            QfgSZK.AubY.zER = r11
            goto L1cb
        L1d3:
            int r11 = QfgSZK.AubY.snQ
            r11 = r11 ^ 1728(0x6c0, float:2.421E-42)
            QfgSZK.AubY.snQ = r11
            int r11 = QfgSZK.AubY.zER
            if (r11 > r1) goto L1d3
        L1dd:
            int r11 = QfgSZK.AubY.zER
            int r12 = r11 + 117
            if (r12 == r4) goto L206
            r0 = 251(0xfb, float:3.52E-43)
            if (r12 == r0) goto L1f0
            r0 = 392(0x188, float:5.5E-43)
            if (r12 == r0) goto L1f8
            r0 = 543(0x21f, float:7.61E-43)
            if (r12 == r0) goto L1ff
            goto L1dd
        L1f0:
            r12 = r11 ^ 4215(0x1077, float:5.906E-42)
            int r12 = r12 % 123
            r12 = r12 ^ 1637(0x665, float:2.294E-42)
        L1f6:
            QfgSZK.AubY.zER = r12
        L1f8:
            int r12 = QfgSZK.AubY.zER
            r12 = r12 ^ 5215(0x145f, float:7.308E-42)
            int r12 = r12 * r9
            QfgSZK.AubY.zER = r12
        L1ff:
            int r12 = QfgSZK.AubY.zER
            r0 = 138(0x8a, float:1.93E-43)
            int r12 = r12 >> r0
            int r12 = r12 + r11
            goto L1f6
        L206:
            int r12 = QfgSZK.AubY.zER
            int r12 = r12 + r11
            int r12 = r12 % r8
            QfgSZK.AubY.zER = r12
            goto L206
        L20d:
            r12 = 3
            if (r11 != r12) goto L309
            int r11 = QfgSZK.AubY.snQ
            r11 = r11 ^ 2336(0x920, float:3.273E-42)
            if (r11 == 0) goto L2ff
        L216:
            int r11 = QfgSZK.AubY.snQ
            int r2 = QfgSZK.AubY.zER
            if (r2 > r1) goto L239
        L21c:
            int r11 = QfgSZK.AubY.zER
            int r0 = r11 + 364
            if (r0 == r12) goto L232
            r11 = 192(0xc0, float:2.69E-43)
            if (r0 == r11) goto L227
            goto L21c
        L227:
            int r11 = QfgSZK.AubY.zER
            r11 = r11 ^ 3792(0xed0, float:5.314E-42)
            int r11 = r11 % 43
            int r11 = r11 * 53
            QfgSZK.AubY.zER = r11
            goto L227
        L232:
            int r11 = r11 * 49
            int r11 = r11 % 38
            QfgSZK.AubY.zER = r11
            goto L21c
        L239:
            int r3 = r11 + 91
            r4 = 32
            if (r3 == r4) goto L29d
            r4 = 96
            if (r3 == r4) goto L268
            r4 = 259(0x103, float:3.63E-43)
            if (r3 == r4) goto L26d
            r4 = 381(0x17d, float:5.34E-43)
            if (r3 == r4) goto L24c
            goto L216
        L24c:
            int r3 = r11 + r11
            r3 = r3 ^ 2357(0x935, float:3.303E-42)
            int r3 = r3 * 116
            QfgSZK.AubY.snQ = r3
            if (r2 > r1) goto L29d
        L256:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 + 156
            r12 = 89
            if (r11 == r12) goto L25f
            goto L256
        L25f:
            int r11 = QfgSZK.AubY.zER
            r11 = r11 ^ 4219(0x107b, float:5.912E-42)
            int r11 = r11 * 40
            QfgSZK.AubY.zER = r11
            goto L25f
        L268:
            int r12 = r11 % 97
            int r12 = r12 % r0
            QfgSZK.AubY.snQ = r12
        L26d:
            int r12 = QfgSZK.AubY.snQ
            int r12 = r12 + r11
            int r12 = r12 + r11
            QfgSZK.AubY.snQ = r12
            if (r2 > r1) goto L2ff
        L275:
            int r11 = QfgSZK.AubY.zER
            int r12 = r11 + 221
            r0 = 63
            if (r12 == r0) goto L294
            if (r12 == r8) goto L28d
            r11 = 153(0x99, float:2.14E-43)
            if (r12 == r11) goto L284
            goto L275
        L284:
            int r11 = QfgSZK.AubY.zER
            r11 = r11 ^ 1473(0x5c1, float:2.064E-42)
            int r11 = r11 % 82
            QfgSZK.AubY.zER = r11
            goto L284
        L28d:
            int r12 = r11 % 76
            r0 = 182(0xb6, float:2.55E-43)
            int r12 = r12 >> r0
            QfgSZK.AubY.zER = r12
        L294:
            int r12 = QfgSZK.AubY.zER
            int r12 = r12 + r11
            r11 = r12 ^ 5384(0x1508, float:7.545E-42)
            QfgSZK.AubY.zER = r11
            goto L2ff
        L29d:
            int r3 = QfgSZK.AubY.snQ
            if (r2 > r1) goto L2b0
        L2a1:
            int r11 = QfgSZK.AubY.zER
            int r12 = r11 + 208
            if (r12 == r6) goto L2a8
            goto L2a1
        L2a8:
            int r12 = r11 % 54
            int r12 = r12 + r11
            int r12 = r12 * 108
            QfgSZK.AubY.zER = r12
            goto L2a1
        L2b0:
            r2 = r2 ^ 2953(0xb89, float:4.138E-42)
            if (r2 == 0) goto L2e7
        L2b4:
            int r11 = QfgSZK.AubY.zER
            int r12 = r11 + 390
            r0 = 19
            if (r12 == r0) goto L2dd
            r0 = 190(0xbe, float:2.66E-43)
            if (r12 == r0) goto L2d6
            r0 = 193(0xc1, float:2.7E-43)
            if (r12 == r0) goto L2cf
            r0 = 277(0x115, float:3.88E-43)
            if (r12 == r0) goto L2c9
            goto L2b4
        L2c9:
            int r11 = r11 + r11
            int r11 = r11 >> 11
            QfgSZK.AubY.zER = r11
            goto L2d6
        L2cf:
            int r11 = r11 * 45
            int r11 = r11 % 88
            QfgSZK.AubY.zER = r11
            goto L2b4
        L2d6:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 * 42
            int r11 = r11 % 67
            goto L2e4
        L2dd:
            int r11 = QfgSZK.AubY.zER
            r11 = r11 ^ 4545(0x11c1, float:6.369E-42)
            r12 = 244(0xf4, float:3.42E-43)
            int r11 = r11 >> r12
        L2e4:
            QfgSZK.AubY.zER = r11
            goto L2dd
        L2e7:
            int r3 = r3 * 111
            int r3 = r3 % 28
            int r3 = r3 + r11
            QfgSZK.AubY.snQ = r3
            if (r2 == 0) goto L216
        L2f0:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 + 143
            if (r11 == r9) goto L2f7
            goto L2f0
        L2f7:
            int r11 = QfgSZK.AubY.zER
            int r11 = r11 * r6
            int r11 = r11 % 49
            QfgSZK.AubY.zER = r11
            goto L2f7
        L2ff:
            r10.QTOTCL = r7
            java.lang.String r11 = "k~R|"
            java.lang.String r11 = QfgSZK.GCXiNH.fsw(r11)
            r10.feIwXk = r11
        L309:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.AubY.zuBGHE(QfgSZK.QSusPL, java.util.Map):void");
    }
}
