package QfgSZK;

import com.engagelab.privates.push.constants.MTPushConstants;

/* JADX INFO: loaded from: classes.dex */
class AkhnZx extends OGitdB {
    private static String DlIaRS;
    public static int fIq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        fIq = 6295;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        DlIaRS = FQMcgE.hfdhUn(AkhnZx.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:26:0x0068) to fix multi-entry loop: BACK_EDGE: B:26:0x0068 -> B:27:0x0072 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // QfgSZK.RIsQag
    public void fetchVPNInfo(android.content.Context r3) {
        /*
            r2 = this;
            android.net.ConnectivityManager r3 = r2.getConnectivityMgr(r3)     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L30
            if (r3 != 0) goto L7
            return
        L7:
            r0 = 0
            r2.irBVsV = r0     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L30
            android.net.Network r0 = r3.getActiveNetwork()     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L30
            if (r0 == 0) goto L84
            android.net.NetworkCapabilities r3 = r3.getNetworkCapabilities(r0)     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L30
            if (r3 == 0) goto L84
            r0 = 4
            boolean r3 = r3.hasTransport(r0)     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L30
            r2.irBVsV = r3     // Catch: java.lang.Exception -> L1e java.lang.SecurityException -> L30
            goto L84
        L1e:
            r3 = move-exception
            java.lang.String r0 = QfgSZK.AkhnZx.DlIaRS
            java.lang.String r1 = r3.toString()
            QfgSZK.FQMcgE.OijiEz(r0, r1)
            QfgSZK.ORrpqH r0 = QfgSZK.ORrpqH.uzCIH()
            r0.seuMaA(r3)
            goto L84
        L30:
            r3 = move-exception
            java.lang.String r0 = QfgSZK.AkhnZx.DlIaRS
            java.lang.String r1 = r3.toString()
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r0, r1)
            QfgSZK.DwQSDd.glVQsU(r3)
            QfgSZK.ORrpqH r0 = QfgSZK.ORrpqH.uzCIH()
            r0.seuMaA(r3)
            int r3 = QfgSZK.AkhnZx.fIq
            r3 = r3 ^ 6295(0x1897, float:8.821E-42)
            if (r3 == 0) goto L84
        L4a:
            int r3 = QfgSZK.AkhnZx.fIq
            int r0 = r3 + 39
            r1 = 83
            if (r0 == r1) goto L68
            r1 = 171(0xab, float:2.4E-43)
            if (r0 == r1) goto L7c
            r1 = 283(0x11b, float:3.97E-43)
            if (r0 == r1) goto L72
            r3 = 333(0x14d, float:4.67E-43)
            if (r0 == r3) goto L5f
            goto L4a
        L5f:
            int r3 = QfgSZK.AkhnZx.fIq
            int r3 = r3 >> 66
            int r3 = r3 * 35
            QfgSZK.AkhnZx.fIq = r3
            goto L5f
        L68:
            int r0 = QfgSZK.AkhnZx.fIq
            int r0 = r0 >> 75
            r0 = r0 ^ 4936(0x1348, float:6.917E-42)
            int r0 = r0 >> 108
            QfgSZK.AkhnZx.fIq = r0
        L72:
            int r0 = QfgSZK.AkhnZx.fIq
            int r0 = r0 % 82
            int r0 = r0 % 79
            int r0 = r0 % 102
            QfgSZK.AkhnZx.fIq = r0
        L7c:
            int r0 = QfgSZK.AkhnZx.fIq
            int r0 = r0 + r3
            int r0 = r0 >> 40
            QfgSZK.AkhnZx.fIq = r0
            goto L68
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.AkhnZx.fetchVPNInfo(android.content.Context):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.RIsQag
    public boolean isConnected() {
        return this.irBVsV;
    }
}
