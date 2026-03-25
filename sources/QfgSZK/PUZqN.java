package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.QhsCdE;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class PUZqN extends QhsCdE {
    private static String DlIaRS = null;
    public static int ckM = 0;
    private static final int dGiNTm = 1;
    private static final int iBCOEp = 4;
    public static int kst = 0;
    private static final int szMiFC = 2;
    int QJbMZm;
    private final DPHsZd fYfYcz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        int i2;
        FQMcgE.RQa = 9057;
        ckM = 5423;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        kst = MTAnalysisConstants.MainWhat.ON_EVENT;
        if (ckM <= 5422) {
            while (true) {
                i = ckM;
                int i3 = i + 13;
                if (i3 == 50) {
                    i2 = i * 1780;
                    break;
                } else if (i3 == 84) {
                    ckM = (i + i) * CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA;
                } else if (i3 == 235) {
                    ckM = ((i % 9) >> 31) % 72;
                    break;
                } else if (i3 == 386) {
                    break;
                }
            }
            i2 = (ckM + i) >> 108;
            ckM = i2;
        }
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(PUZqN.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PUZqN(long j, boolean z, DPHsZd dPHsZd) {
        super(j, z);
        this.fYfYcz = dPHsZd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private int hQufeQ(ZqidTP zqidTP, String str, String str2) {
        int i;
        String strHvKCwS = DGUQLI.hvKCwS();
        if (strHvKCwS != null) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("U~TgB_f>mXROCJIS_ZZ\u0013VTDJ]IY_\u001a") + strHvKCwS);
            i = 1;
        } else {
            i = 0;
        }
        if (!AxsJAY.uzCIH().gGvvIC() && AxsJAY.uzCIH().iRxXKY()) {
            i |= 2;
        }
        if (UPbYzn.ahrCSq(str) && fraLem(GCXiNH.fsw("NY~BjbDAM"), str, null, false)) {
            i |= 4;
        }
        return fraLem(GCXiNH.fsw("NY~BjbDAH"), str2, GPCHlQ.dbUqJD(zqidTP), true) ? i | 4 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:74:0x0107) to fix multi-entry loop: BACK_EDGE: B:74:0x0107 -> B:75:0x0109 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public boolean fraLem(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            QfgSZK.DPHsZd r5 = r0.fYfYcz
            r6 = 0
            if (r5 != 0) goto L10
            return r6
        L10:
            boolean r5 = QfgSZK.UPbYzn.iSpHlg(r18)
            r7 = 25
            java.lang.String r8 = ""
            r9 = 4001(0xfa1, float:5.607E-42)
            r10 = 5422(0x152e, float:7.598E-42)
            if (r5 == 0) goto L7b
            int r5 = QfgSZK.PUZqN.ckM
            r11 = 14
            if (r5 > r10) goto L3f
        L24:
            int r12 = QfgSZK.PUZqN.ckM
            int r1 = r12 + 39
            if (r1 == r11) goto L36
            r2 = 179(0xb3, float:2.51E-43)
            if (r1 == r2) goto L2f
            goto L24
        L2f:
            int r1 = QfgSZK.PUZqN.ckM
            r1 = r1 ^ 461(0x1cd, float:6.46E-43)
            QfgSZK.PUZqN.ckM = r1
            goto L2f
        L36:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 + r12
            int r1 = r1 + r12
            r1 = r1 ^ 5320(0x14c8, float:7.455E-42)
            QfgSZK.PUZqN.ckM = r1
            goto L36
        L3f:
            int r12 = QfgSZK.PUZqN.kst
            if (r12 > r9) goto L79
            if (r5 > r10) goto L53
        L45:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 + 377
            if (r1 == r11) goto L4c
            goto L45
        L4c:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 * 968
            QfgSZK.PUZqN.ckM = r1
            goto L4c
        L53:
            int r5 = QfgSZK.PUZqN.kst
            int r11 = r5 + 39
            r12 = 38
            if (r11 == r12) goto L5c
            goto L53
        L5c:
            r5 = r5 ^ 7249(0x1c51, float:1.0158E-41)
            int r5 = r5 * r12
            QfgSZK.PUZqN.kst = r5
            int r5 = QfgSZK.PUZqN.ckM
            if (r5 > r10) goto L79
        L65:
            int r5 = QfgSZK.PUZqN.ckM
            int r11 = r5 + 403
            if (r11 == r7) goto L75
            r12 = 45
            if (r11 == r12) goto L70
            goto L65
        L70:
            int r5 = r5 * 72
            int r5 = r5 % 50
            goto L77
        L75:
            r5 = r5 ^ 7777(0x1e61, float:1.0898E-41)
        L77:
            QfgSZK.PUZqN.ckM = r5
        L79:
            r5 = r8
            goto L87
        L7b:
            java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset()
            byte[] r5 = r2.getBytes(r5)
            java.lang.String r5 = QfgSZK.UPbYzn.fvQaOB(r5)
        L87:
            boolean r11 = QfgSZK.UPbYzn.iSpHlg(r19)
            r12 = 279(0x117, float:3.91E-43)
            if (r11 == 0) goto L113
            int r11 = QfgSZK.PUZqN.kst
            if (r11 > r9) goto L11f
        L93:
            int r1 = QfgSZK.PUZqN.kst
            int r2 = r1 + 65
            r3 = 97
            if (r2 == r3) goto Lba
            if (r2 == r12) goto Lad
            r3 = 367(0x16f, float:5.14E-43)
            if (r2 == r3) goto Ld6
            r3 = 545(0x221, float:7.64E-43)
            if (r2 == r3) goto La6
            goto L93
        La6:
            int r1 = r1 * 26
            int r1 = r1 % 95
            QfgSZK.PUZqN.kst = r1
            goto L93
        Lad:
            int r1 = r1 % 59
            int r1 = r1 * 112
            int r1 = r1 >> 63
            QfgSZK.PUZqN.kst = r1
            int r1 = QfgSZK.PUZqN.ckM
            if (r1 > r10) goto Ld6
            goto Lc4
        Lba:
            int r1 = r1 * 46
            int r1 = r1 >> 57
            QfgSZK.PUZqN.kst = r1
            int r1 = QfgSZK.PUZqN.ckM
            if (r1 > r10) goto Ld6
        Lc4:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 + 351
            r2 = 30
            if (r1 == r2) goto Lcd
            goto Lc4
        Lcd:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 % 73
            int r1 = r1 >> 31
            QfgSZK.PUZqN.ckM = r1
            goto Lcd
        Ld6:
            int r1 = QfgSZK.PUZqN.kst
            int r1 = r1 % 105
            r1 = r1 ^ 3474(0xd92, float:4.868E-42)
            QfgSZK.PUZqN.kst = r1
            int r1 = QfgSZK.PUZqN.ckM
            r1 = r1 ^ 5423(0x152f, float:7.599E-42)
            if (r1 == 0) goto L93
        Le4:
            int r1 = QfgSZK.PUZqN.ckM
            int r2 = r1 + 312
            r3 = 32
            if (r2 == r3) goto L102
            r3 = 205(0xcd, float:2.87E-43)
            if (r2 == r3) goto Lfe
            r3 = 248(0xf8, float:3.48E-43)
            if (r2 == r3) goto Lf9
            r3 = 337(0x151, float:4.72E-43)
            if (r2 == r3) goto L109
            goto Le4
        Lf9:
            int r2 = r1 >> 67
            r2 = r2 ^ 4814(0x12ce, float:6.746E-42)
            goto L107
        Lfe:
            int r2 = r1 >> 93
            int r2 = r2 + r1
            goto L110
        L102:
            int r2 = QfgSZK.PUZqN.ckM
            int r2 = r2 + r1
            r2 = r2 ^ 4780(0x12ac, float:6.698E-42)
        L107:
            QfgSZK.PUZqN.ckM = r2
        L109:
            int r2 = QfgSZK.PUZqN.ckM
            int r2 = r2 + r1
            int r2 = r2 >> 61
            r2 = r2 ^ 4284(0x10bc, float:6.003E-42)
        L110:
            QfgSZK.PUZqN.ckM = r2
            goto L102
        L113:
            java.nio.charset.Charset r8 = java.nio.charset.Charset.defaultCharset()
            byte[] r8 = r3.getBytes(r8)
            java.lang.String r8 = QfgSZK.UPbYzn.fvQaOB(r8)
        L11f:
            QfgSZK.DPHsZd r11 = r0.fYfYcz
            java.lang.String r11 = r11.DrNnAm(r1)
            boolean r13 = QfgSZK.UPbYzn.iSpHlg(r11)
            r14 = 1
            if (r13 == 0) goto L132
            boolean r13 = QfgSZK.UPbYzn.dTTfOR(r5)
            if (r13 != 0) goto L13a
        L132:
            if (r2 == 0) goto L216
            boolean r13 = r2.equalsIgnoreCase(r11)
            if (r13 == 0) goto L216
        L13a:
            java.lang.String r13 = QfgSZK.PUZqN.DlIaRS
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            boolean r11 = QfgSZK.UPbYzn.iSpHlg(r11)
            if (r11 == 0) goto L1eb
            java.lang.String r11 = "NeT~B_f>"
            java.lang.String r11 = QfgSZK.GCXiNH.fsw(r11)
            int r6 = QfgSZK.PUZqN.kst
            r6 = r6 ^ 4002(0xfa2, float:5.608E-42)
            if (r6 == 0) goto L1f1
            int r6 = QfgSZK.PUZqN.ckM
            r6 = r6 ^ 5423(0x152f, float:7.599E-42)
            if (r6 == 0) goto L18e
        L159:
            int r6 = QfgSZK.PUZqN.ckM
            int r7 = r6 + 130
            r9 = 12
            if (r7 == r9) goto L181
            r9 = 83
            if (r7 == r9) goto L178
            if (r7 == r12) goto L187
            r9 = 309(0x135, float:4.33E-43)
            if (r7 == r9) goto L170
            r7 = 25
            r9 = 4001(0xfa1, float:5.607E-42)
            goto L159
        L170:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 + r6
            int r1 = r1 % 111
            QfgSZK.PUZqN.ckM = r1
            goto L170
        L178:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 + r6
            int r1 = r1 % 8
            int r1 = r1 + r6
            QfgSZK.PUZqN.ckM = r1
            goto L178
        L181:
            int r7 = r6 * 23
            int r7 = r7 % 44
            QfgSZK.PUZqN.ckM = r7
        L187:
            int r7 = QfgSZK.PUZqN.ckM
            int r7 = r7 >> 78
            int r7 = r7 + r6
            QfgSZK.PUZqN.ckM = r7
        L18e:
            int r6 = QfgSZK.PUZqN.kst
            int r7 = r6 + 130
            r9 = 24
            if (r7 == r9) goto L19b
            r6 = 217(0xd9, float:3.04E-43)
            if (r7 == r6) goto L1b3
            goto L18e
        L19b:
            int r6 = r6 % 89
            r6 = r6 ^ 3791(0xecf, float:5.312E-42)
            QfgSZK.PUZqN.kst = r6
            int r6 = QfgSZK.PUZqN.ckM
            if (r6 > r10) goto L1b3
        L1a5:
            int r6 = QfgSZK.PUZqN.ckM
            int r7 = r6 + 429
            if (r7 == r14) goto L1ac
            goto L1a5
        L1ac:
            int r6 = r6 + r6
            r6 = r6 ^ 4146(0x1032, float:5.81E-42)
            int r6 = r6 >> 85
            QfgSZK.PUZqN.ckM = r6
        L1b3:
            int r6 = QfgSZK.PUZqN.kst
            int r6 = r6 % 42
            r7 = 29
            int r6 = r6 >> r7
            r6 = r6 ^ 3940(0xf64, float:5.521E-42)
            QfgSZK.PUZqN.kst = r6
            int r6 = QfgSZK.PUZqN.ckM
            if (r6 > r10) goto L1f1
        L1c2:
            int r6 = QfgSZK.PUZqN.ckM
            int r9 = r6 + 117
            if (r9 == r7) goto L1e2
            r12 = 135(0x87, float:1.89E-43)
            if (r9 == r12) goto L1d7
            r12 = 162(0xa2, float:2.27E-43)
            if (r9 == r12) goto L1d1
            goto L1c2
        L1d1:
            int r6 = r6 + r6
            int r6 = r6 % 74
            QfgSZK.PUZqN.ckM = r6
            goto L1f1
        L1d7:
            int r1 = QfgSZK.PUZqN.ckM
            r1 = r1 ^ 3076(0xc04, float:4.31E-42)
            int r1 = r1 % 35
            int r1 = r1 % 70
            QfgSZK.PUZqN.ckM = r1
            goto L1d7
        L1e2:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 >> 4
            r1 = r1 ^ 4250(0x109a, float:5.956E-42)
            QfgSZK.PUZqN.ckM = r1
            goto L1e2
        L1eb:
            java.lang.String r6 = "Ha_m_Xoy,"
            java.lang.String r11 = QfgSZK.GCXiNH.fsw(r6)
        L1f1:
            r15.append(r11)
            java.lang.String r6 = "=gZ`^T!qj\b"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r15.append(r6)
            r15.append(r1)
            java.lang.String r6 = "=xU,[CdxiZGMIL\b"
            java.lang.String r6 = QfgSZK.GCXiNH.fsw(r6)
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r13, r6)
            QfgSZK.DPHsZd r6 = r0.fYfYcz
            r6.ihnvzI(r1, r5)
            r11 = r5
        L216:
            java.lang.String r6 = QfgSZK.PUZqN.DlIaRS
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "npMiO\u0011hz,NMQ\nBM^\u0016"
            java.lang.String r9 = QfgSZK.GCXiNH.fsw(r9)
            r7.append(r9)
            r7.append(r1)
            java.lang.String r1 = "=xH,"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            r7.append(r1)
            r7.append(r11)
            java.lang.String r1 = "=wR~XEW\u007f`\bKP\n"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            r7.append(r1)
            r7.append(r2)
            java.lang.String r1 = "=b^oD_eHmD\u0002JY\t"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            r7.append(r1)
            r7.append(r3)
            java.lang.String r1 = "=xH,XTbqbL\u0002UKEAC\u0016"
            java.lang.String r1 = QfgSZK.GCXiNH.fsw(r1)
            r7.append(r1)
            r7.append(r4)
            java.lang.String r1 = r7.toString()
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r6, r1)
            boolean r1 = QfgSZK.UPbYzn.iSpHlg(r5)
            if (r1 == 0) goto L296
            if (r4 == 0) goto L26e
            boolean r1 = QfgSZK.UPbYzn.dTTfOR(r8)
            if (r1 != 0) goto L274
        L26e:
            boolean r1 = QfgSZK.UPbYzn.dTTfOR(r11)
            if (r1 == 0) goto L294
        L274:
            int r1 = QfgSZK.PUZqN.kst
            r2 = 4001(0xfa1, float:5.607E-42)
            if (r1 > r2) goto L292
        L27a:
            int r1 = QfgSZK.PUZqN.kst
            int r2 = r1 + 195
            r3 = 51
            if (r2 == r3) goto L28d
            r3 = 234(0xea, float:3.28E-43)
            if (r2 == r3) goto L287
            goto L27a
        L287:
            int r1 = r1 + r1
            int r1 = r1 >> 52
            QfgSZK.PUZqN.kst = r1
            goto L27a
        L28d:
            int r2 = r1 % 123
            int r2 = r2 + r1
            QfgSZK.PUZqN.kst = r2
        L292:
            r6 = r14
            goto L295
        L294:
            r6 = 0
        L295:
            return r6
        L296:
            if (r4 == 0) goto L29e
            boolean r1 = r5.equalsIgnoreCase(r8)
            if (r1 == 0) goto L2a4
        L29e:
            boolean r1 = r5.equalsIgnoreCase(r11)
            if (r1 != 0) goto L327
        L2a4:
            int r1 = QfgSZK.PUZqN.kst
            r2 = 4001(0xfa1, float:5.607E-42)
            if (r1 > r2) goto L325
            int r1 = QfgSZK.PUZqN.ckM
            r1 = r1 ^ 5423(0x152f, float:7.599E-42)
            if (r1 == 0) goto L2dc
        L2b0:
            int r1 = QfgSZK.PUZqN.ckM
            int r2 = r1 + 273
            r3 = 55
            if (r2 == r3) goto L2d2
            r1 = 114(0x72, float:1.6E-43)
            if (r2 == r1) goto L2c9
            r1 = 208(0xd0, float:2.91E-43)
            if (r2 == r1) goto L2c1
            goto L2b0
        L2c1:
            int r1 = QfgSZK.PUZqN.ckM
            r1 = r1 ^ 4101(0x1005, float:5.747E-42)
            int r1 = r1 * r3
            QfgSZK.PUZqN.ckM = r1
            goto L2c1
        L2c9:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 % 4
            int r1 = r1 % 64
            QfgSZK.PUZqN.ckM = r1
            goto L2c9
        L2d2:
            int r2 = QfgSZK.PUZqN.ckM
            int r2 = r2 + r1
            int r2 = r2 >> 95
            r2 = r2 ^ 3039(0xbdf, float:4.259E-42)
            QfgSZK.PUZqN.ckM = r2
            goto L2d2
        L2dc:
            int r1 = QfgSZK.PUZqN.kst
            int r2 = r1 + 247
            r3 = 77
            if (r2 == r3) goto L2e5
            goto L2dc
        L2e5:
            int r1 = r1 % 90
            int r1 = r1 % 91
            QfgSZK.PUZqN.kst = r1
            int r1 = QfgSZK.PUZqN.ckM
            if (r1 > r10) goto L325
        L2ef:
            int r1 = QfgSZK.PUZqN.ckM
            int r2 = r1 + 260
            r3 = 6
            if (r2 == r3) goto L31d
            r3 = 136(0x88, float:1.9E-43)
            if (r2 == r3) goto L312
            r3 = 178(0xb2, float:2.5E-43)
            if (r2 == r3) goto L30a
            r3 = 271(0x10f, float:3.8E-43)
            if (r2 == r3) goto L303
            goto L2ef
        L303:
            int r2 = r1 * 79
            int r2 = r2 + r1
            r3 = 25
            int r2 = r2 % r3
            goto L322
        L30a:
            r2 = r1 ^ 3623(0xe27, float:5.077E-42)
            int r2 = r2 + r1
            r1 = r2 ^ 2901(0xb55, float:4.065E-42)
            QfgSZK.PUZqN.ckM = r1
            goto L325
        L312:
            int r1 = QfgSZK.PUZqN.ckM
            int r1 = r1 * 37
            int r1 = r1 >> 50
            r1 = r1 ^ 5305(0x14b9, float:7.434E-42)
            QfgSZK.PUZqN.ckM = r1
            goto L312
        L31d:
            r3 = 25
            r2 = r1 ^ 1026(0x402, float:1.438E-42)
            int r2 = r2 + r1
        L322:
            QfgSZK.PUZqN.ckM = r2
            goto L2ef
        L325:
            r6 = r14
            goto L328
        L327:
            r6 = 0
        L328:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.PUZqN.fraLem(java.lang.String, java.lang.String, java.lang.String, boolean):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null || this.QJbMZm == 0) {
            return;
        }
        map.put(AhwBna.MALICIOUS_APP_STATUS.DbNXlk(), String.valueOf(this.QJbMZm));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_MALICIOUS_APPS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:38:0x0086) to fix multi-entry loop: BACK_EDGE: B:37:0x007d -> B:38:0x0086 */
    /* JADX DEBUG: Duplicate block (B:47:0x00aa) to fix multi-entry loop: BACK_EDGE: B:46:0x00a2 -> B:47:0x00aa */
    /* JADX DEBUG: Duplicate block (B:59:0x00d3) to fix multi-entry loop: BACK_EDGE: B:59:0x00d3 -> B:60:0x00d5 */
    /* JADX DEBUG: Duplicate block (B:70:0x00fa) to fix multi-entry loop: BACK_EDGE: B:70:0x00fa -> B:15:0x0032 */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if ((QfgSZK.PUZqN.ckM ^ 5423) != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        r4 = QfgSZK.PUZqN.kst;
        r5 = QfgSZK.PUZqN.ckM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ((r5 ^ 5423) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if ((QfgSZK.PUZqN.ckM + 208) == 94) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        QfgSZK.PUZqN.ckM = (QfgSZK.PUZqN.ckM * 33) % 71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        r0 = r4 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r0 == 23) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r0 == 82) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r0 == 109) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r0 == 275) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0061, code lost:
    
        QfgSZK.PUZqN.kst = ((QfgSZK.PUZqN.kst ^ 1045) + r4) >> 50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if ((QfgSZK.PUZqN.ckM ^ 5423) == 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r5 = QfgSZK.PUZqN.ckM;
        r4 = r5 + org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r4 == 96) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r4 == 143) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        QfgSZK.PUZqN.ckM = ((QfgSZK.PUZqN.ckM >> 68) + r5) % 106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
    
        QfgSZK.PUZqN.ckM = ((QfgSZK.PUZqN.ckM ^ 4749) + r5) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if (r5 > 5422) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r4 = QfgSZK.PUZqN.ckM;
        r5 = r4 + 221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        if (r5 == 12) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        if (r5 == 177) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        QfgSZK.PUZqN.ckM = (r4 ^ 2607) * 109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ad, code lost:
    
        QfgSZK.PUZqN.kst = (r4 >> org.spongycastle.crypto.tls.CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        if (r5 > 5422) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
    
        r0 = QfgSZK.PUZqN.ckM;
        r4 = r0 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        if (r4 == 79) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r4 == 227) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
    
        if (r4 == 381) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
    
        QfgSZK.PUZqN.ckM = (QfgSZK.PUZqN.ckM + r0) % 48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
    
        QfgSZK.PUZqN.ckM = (QfgSZK.PUZqN.ckM + r0) >> org.spongycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_NULL_SHA256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        QfgSZK.PUZqN.kst = (QfgSZK.PUZqN.kst + r4) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r5 > 5422) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e4, code lost:
    
        r4 = QfgSZK.PUZqN.ckM;
        r5 = r4 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        if (r5 == 13) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ee, code lost:
    
        if (r5 == 207) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fa, code lost:
    
        QfgSZK.PUZqN.ckM = (r4 + r4) ^ 5485;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fe, code lost:
    
        if (r5 > 5422) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0100, code lost:
    
        r5 = QfgSZK.PUZqN.ckM;
        r0 = r5 + org.spongycastle.crypto.tls.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0106, code lost:
    
        if (r0 == 97) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
    
        if (r0 == 174) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010e, code lost:
    
        if (r0 == 314) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0111, code lost:
    
        QfgSZK.PUZqN.ckM = (r5 % 57) ^ 2939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0117, code lost:
    
        r5 = ((QfgSZK.PUZqN.ckM + r5) >> 55) ^ 2775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        r5 = (r5 ^ 2833) % 35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0123, code lost:
    
        QfgSZK.PUZqN.ckM = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0125, code lost:
    
        QfgSZK.PUZqN.kst = (r4 * 625) ^ 1796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0086, code lost:
    
        QfgSZK.PUZqN.ckM = ((QfgSZK.PUZqN.ckM ^ 4749) + r5) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00aa, code lost:
    
        QfgSZK.PUZqN.ckM = ((QfgSZK.PUZqN.ckM * 61) >> 17) ^ 1233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d5, code lost:
    
        QfgSZK.PUZqN.ckM = (r0 >> 109) % 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0032, code lost:
    
        QfgSZK.PUZqN.ckM = ((r4 * 117) + r4) >> 60;
     */
    /* JADX WARN: Path cross not found for [B:109:?, B:106:?], limit reached: 130 */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (qSusPL.aPFruk() == null || qSusPL.RcLksq() == null || map == null || this.QJbMZm != 0) {
            return;
        }
        ZqidTP zqidTPAPFruk = qSusPL.aPFruk();
        String str = map.get(AhwBna.ADVERTISING_ID.DbNXlk());
        if ((kst ^ MTAnalysisConstants.MainWhat.ON_EVENT) == 0) {
            this.QJbMZm = hQufeQ(zqidTPAPFruk, str, qSusPL.OVMstZ());
            if (qSusPL.RcLksq().igXuih()) {
                this.QJbMZm |= 2;
            }
        }
    }
}
