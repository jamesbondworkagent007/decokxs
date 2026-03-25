package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: loaded from: classes.dex */
class Slwtri extends QhsCdE {
    private static String DlIaRS = null;
    public static int JIh = 0;
    public static int RmP = 1796;
    String RHhQnc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        JIh = 9879;
        DlIaRS = FQMcgE.hfdhUn(Slwtri.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Slwtri(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:19:0x0038) to fix multi-entry loop: BACK_EDGE: B:19:0x0038 -> B:20:0x003f */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0096 -> B:45:0x009c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            QfgSZK.AhwBna r0 = QfgSZK.AhwBna.CONNECTIONS_INFO
            java.lang.String r0 = r0.DbNXlk()
            java.lang.String r1 = r4.RHhQnc
            int r2 = QfgSZK.Slwtri.JIh
            r3 = 9878(0x2696, float:1.3842E-41)
            if (r2 > r3) goto Lf1
            int r5 = QfgSZK.Slwtri.RmP
            r5 = r5 ^ 1796(0x704, float:2.517E-42)
            if (r5 == 0) goto L4b
        L17:
            int r5 = QfgSZK.Slwtri.RmP
            int r0 = r5 + 39
            r1 = 43
            if (r0 == r1) goto L31
            r1 = 93
            if (r0 == r1) goto L38
            r1 = 243(0xf3, float:3.4E-43)
            if (r0 == r1) goto L41
            r1 = 356(0x164, float:4.99E-43)
            if (r0 == r1) goto L2c
            goto L17
        L2c:
            int r0 = r5 % 61
            r0 = r0 ^ 2684(0xa7c, float:3.761E-42)
            goto L3f
        L31:
            int r0 = QfgSZK.Slwtri.RmP
            int r0 = r0 >> 85
            int r0 = r0 + r5
            QfgSZK.Slwtri.RmP = r0
        L38:
            int r0 = QfgSZK.Slwtri.RmP
            int r0 = r0 + r5
            int r0 = r0 % 59
            int r0 = r0 * 112
        L3f:
            QfgSZK.Slwtri.RmP = r0
        L41:
            int r0 = QfgSZK.Slwtri.RmP
            int r0 = r0 + r5
            int r0 = r0 % 23
            int r0 = r0 % 76
            QfgSZK.Slwtri.RmP = r0
            goto L31
        L4b:
            int r5 = QfgSZK.Slwtri.JIh
            int r0 = r5 + 26
            r1 = 7
            r2 = 89
            if (r0 == r1) goto Lc9
            r1 = 29
            if (r0 == r1) goto L96
            r1 = 68
            if (r0 == r1) goto L9e
            r1 = 238(0xee, float:3.34E-43)
            if (r0 == r1) goto L61
            goto L4b
        L61:
            int r0 = QfgSZK.Slwtri.RmP
            r0 = r0 ^ 1796(0x704, float:2.517E-42)
            if (r0 == 0) goto L8f
        L67:
            int r5 = QfgSZK.Slwtri.RmP
            int r0 = r5 + 104
            r1 = 60
            if (r0 == r1) goto L81
            r1 = 248(0xf8, float:3.48E-43)
            if (r0 == r1) goto L78
            r5 = 324(0x144, float:4.54E-43)
            if (r0 == r5) goto L86
            goto L67
        L78:
            int r0 = QfgSZK.Slwtri.RmP
            int r0 = r0 * r2
            int r0 = r0 % 56
            int r0 = r0 + r5
            QfgSZK.Slwtri.RmP = r0
            goto L78
        L81:
            int r0 = r5 + r5
            int r0 = r0 + r5
            QfgSZK.Slwtri.RmP = r0
        L86:
            int r5 = QfgSZK.Slwtri.RmP
            int r5 = r5 >> 99
            int r5 = r5 * 5888
            QfgSZK.Slwtri.RmP = r5
            goto L86
        L8f:
            int r0 = r5 % 5
            int r0 = r0 >> 116
            r0 = r0 ^ 1598(0x63e, float:2.239E-42)
            goto L9c
        L96:
            int r0 = QfgSZK.Slwtri.JIh
            int r0 = r0 * 19
            r0 = r0 ^ 2443(0x98b, float:3.423E-42)
        L9c:
            QfgSZK.Slwtri.JIh = r0
        L9e:
            int r0 = QfgSZK.Slwtri.JIh
            int r0 = r0 % 81
            int r0 = r0 + r5
            QfgSZK.Slwtri.JIh = r0
            int r0 = QfgSZK.Slwtri.RmP
            r0 = r0 ^ 1796(0x704, float:2.517E-42)
            if (r0 == 0) goto L96
        Lab:
            int r0 = QfgSZK.Slwtri.RmP
            int r1 = r0 + 65
            r2 = 70
            if (r1 == r2) goto Lbe
            r2 = 94
            if (r1 == r2) goto Lb8
            goto Lab
        Lb8:
            r0 = r0 ^ 4288(0x10c0, float:6.009E-42)
            int r0 = r0 % 105
            QfgSZK.Slwtri.RmP = r0
        Lbe:
            int r0 = QfgSZK.Slwtri.RmP
            int r0 = r0 * 15
            int r0 = r0 % 32
            int r0 = r0 % 54
            QfgSZK.Slwtri.RmP = r0
            goto L96
        Lc9:
            int r5 = QfgSZK.Slwtri.JIh
            int r5 = r5 >> 13
            int r5 = r5 % 74
            QfgSZK.Slwtri.JIh = r5
            int r5 = QfgSZK.Slwtri.RmP
            r0 = 1795(0x703, float:2.515E-42)
            if (r5 > r0) goto Lc9
        Ld7:
            int r5 = QfgSZK.Slwtri.RmP
            int r0 = r5 + 52
            if (r0 == r2) goto Leb
            r1 = 135(0x87, float:1.89E-43)
            if (r0 == r1) goto Le2
            goto Ld7
        Le2:
            int r0 = QfgSZK.Slwtri.RmP
            r0 = r0 ^ 3377(0xd31, float:4.732E-42)
            int r0 = r0 + r5
            int r0 = r0 + r5
            QfgSZK.Slwtri.RmP = r0
            goto Le2
        Leb:
            int r5 = r5 + r5
            int r5 = r5 % 2
            QfgSZK.Slwtri.RmP = r5
            goto Ld7
        Lf1:
            r2 = 1024(0x400, float:1.435E-42)
            java.lang.String r1 = QfgSZK.UPbYzn.RgaQzq(r1, r2)
            r5.put(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.Slwtri.gHZMYf(java.util.Map):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_CONNECTIONS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Path cross not found for [B:72:?, B:62:?], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00aa -> B:34:0x0080). Please report as a decompilation issue!!! */
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
    public void zuBGHE(QfgSZK.QSusPL r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.lang.InterruptedException {
        /*
            r5 = this;
            QfgSZK.ZqidTP r7 = r6.aPFruk()
            if (r7 != 0) goto L7
            return
        L7:
            QfgSZK.AxsJAY r7 = QfgSZK.AxsJAY.uzCIH()
            QfgSZK.ZqidTP r6 = r6.aPFruk()
            java.lang.String r6 = r7.aKErDB(r6)
            r5.RHhQnc = r6
            java.lang.String r6 = QfgSZK.Slwtri.DlIaRS
            int r7 = QfgSZK.Slwtri.RmP
            r0 = 254(0xfe, float:3.56E-43)
            r1 = 51
            r2 = 1795(0x703, float:2.515E-42)
            if (r7 > r2) goto L45
        L21:
            int r7 = QfgSZK.Slwtri.RmP
            int r3 = r7 + 26
            if (r3 == r1) goto L3e
            r4 = 210(0xd2, float:2.94E-43)
            if (r3 == r4) goto L33
            if (r3 == r0) goto L2e
            goto L21
        L2e:
            int r3 = r7 * 10
            int r3 = r3 + r7
            QfgSZK.Slwtri.RmP = r3
        L33:
            int r7 = QfgSZK.Slwtri.RmP
            int r7 = r7 * 39
            int r7 = r7 >> 7
            int r7 = r7 * 43
            QfgSZK.Slwtri.RmP = r7
            goto L45
        L3e:
            r3 = r7 ^ 1215(0x4bf, float:1.703E-42)
            int r3 = r3 + r7
            int r3 = r3 % 4
            QfgSZK.Slwtri.RmP = r3
        L45:
            java.lang.String r7 = r5.RHhQnc
            if (r7 != 0) goto Lc0
            java.lang.String r7 = "S~\u001boD_o{o\\KLDZ\bNXS["
            java.lang.String r7 = QfgSZK.GCXiNH.fsw(r7)
            int r3 = QfgSZK.Slwtri.JIh
            r3 = r3 ^ 9879(0x2697, float:1.3843E-41)
            if (r3 == 0) goto Ld7
            int r6 = QfgSZK.Slwtri.RmP
            if (r6 > r2) goto L68
        L59:
            int r6 = QfgSZK.Slwtri.RmP
            int r7 = r6 + 39
            r3 = 50
            if (r7 == r3) goto L62
            goto L59
        L62:
            r6 = r6 ^ 4708(0x1264, float:6.597E-42)
            int r6 = r6 * 39
            QfgSZK.Slwtri.RmP = r6
        L68:
            int r3 = QfgSZK.Slwtri.JIh
            int r6 = r3 + 39
            r7 = 27
            if (r6 == r7) goto L75
            r7 = 207(0xcf, float:2.9E-43)
            if (r6 == r7) goto L80
            goto L68
        L75:
            r6 = r3 ^ 2118(0x846, float:2.968E-42)
            int r6 = r6 >> 73
            QfgSZK.Slwtri.JIh = r6
            int r6 = QfgSZK.Slwtri.RmP
            if (r6 > r2) goto L80
            goto L8f
        L80:
            int r6 = QfgSZK.Slwtri.JIh
            r6 = r6 ^ 5323(0x14cb, float:7.459E-42)
            int r6 = r6 + r3
            int r6 = r6 >> 73
            QfgSZK.Slwtri.JIh = r6
            int r6 = QfgSZK.Slwtri.RmP
            r6 = r6 ^ 1796(0x704, float:2.517E-42)
            if (r6 == 0) goto L80
        L8f:
            int r6 = QfgSZK.Slwtri.RmP
            int r7 = r6 + 65
            if (r7 == r1) goto Lb6
            r2 = 136(0x88, float:1.9E-43)
            if (r7 == r2) goto Laf
            if (r7 == r0) goto Laa
            r2 = 336(0x150, float:4.71E-43)
            if (r7 == r2) goto La0
            goto L8f
        La0:
            int r7 = QfgSZK.Slwtri.RmP
            r7 = r7 ^ 2588(0xa1c, float:3.627E-42)
            int r7 = r7 + r6
            int r7 = r7 % 40
            QfgSZK.Slwtri.RmP = r7
            goto La0
        Laa:
            int r6 = r6 * 1408
            QfgSZK.Slwtri.RmP = r6
            goto L80
        Laf:
            int r6 = r6 % 105
            int r6 = r6 >> 3
            QfgSZK.Slwtri.RmP = r6
            goto L8f
        Lb6:
            int r7 = QfgSZK.Slwtri.RmP
            int r7 = r7 + r6
            int r7 = r7 % 28
            int r7 = r7 >> 43
            QfgSZK.Slwtri.RmP = r7
            goto Lb6
        Lc0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "ZtO,H^opiKVJEG[\u0007_[R\\"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            r7.append(r0)
            java.lang.String r0 = r5.RHhQnc
            r7.append(r0)
            java.lang.String r7 = r7.toString()
        Ld7:
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.Slwtri.zuBGHE(QfgSZK.QSusPL, java.util.Map):void");
    }
}
