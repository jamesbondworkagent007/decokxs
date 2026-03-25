package aeiGEO;

import com.google.mlkit.common.MlKitException;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections;
import java.io.IOException;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public class ArkbYM implements Runnable {
    private static String DlIaRS;
    public static int JGW;
    public static int cwu;
    private final ZpNRhN QLLKwQ;
    private final int Ried;
    private String TpLtq;
    private final TMXProfilingConnectionsInterface.HttpMethod UsvJLJ;
    private final TMXProfilingConnectionsInterface.TMXCallback dJutej;
    private final byte[] gZATrX;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        GVpNrs.OTr = 9103;
        TMXProfilingConnections.OQs = 6659;
        JGW = 9179;
        GVpNrs.dqk = 9094;
        cwu = 1934;
        if ((9179 ^ JGW) != 0) {
            do {
                i = JGW;
            } while (i + 13 != 84);
            JGW = (i ^ 4517) % 82;
        }
        TMXProfilingConnections.OHr = 2270;
        DlIaRS = GVpNrs.hfdhUn(ArkbYM.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ArkbYM(ZpNRhN zpNRhN, TMXProfilingConnectionsInterface.HttpMethod httpMethod, String str, Map<String, String> map, byte[] bArr, int i, TMXProfilingConnectionsInterface.TMXCallback tMXCallback) {
        this.QLLKwQ = zpNRhN;
        if (map != null && !map.isEmpty()) {
            zpNRhN.RYPzIz(map);
        }
        this.UsvJLJ = httpMethod;
        this.gZATrX = bArr;
        this.dJutej = tMXCallback;
        this.TpLtq = str;
        this.Ried = Math.max(i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:43:0x00bf) to fix multi-entry loop: BACK_EDGE: B:42:0x00b7 -> B:43:0x00bf */
    /* JADX DEBUG: Duplicate block (B:77:0x0191) to fix multi-entry loop: BACK_EDGE: B:76:0x018f -> B:77:0x0191 */
    /* JADX DEBUG: Duplicate block (B:91:0x01c4) to fix multi-entry loop: BACK_EDGE: B:90:0x01bc -> B:91:0x01c4 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void fVBECu(boolean r9) throws java.lang.Throwable {
        /*
            r8 = this;
            long r0 = java.lang.System.nanoTime()
            java.lang.String r2 = aeiGEO.ArkbYM.DlIaRS
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fl\u001b~NEswi^CO\u0010\t"
            java.lang.String r4 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r4)
            r3.append(r4)
            java.lang.String r4 = r8.TpLtq
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            if (r9 == 0) goto L4c
            java.lang.String r9 = "otO~RXoy"
            java.lang.String r9 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r9)
            int r4 = aeiGEO.ArkbYM.JGW
            r4 = r4 ^ 9179(0x23db, float:1.2863E-41)
            if (r4 == 0) goto L52
        L2b:
            int r9 = aeiGEO.ArkbYM.JGW
            int r9 = r9 + 26
            r0 = 53
            if (r9 == r0) goto L41
            r0 = 144(0x90, float:2.02E-43)
            if (r9 == r0) goto L38
            goto L2b
        L38:
            int r9 = aeiGEO.ArkbYM.JGW
            int r9 = r9 >> 25
            r9 = r9 ^ 2001(0x7d1, float:2.804E-42)
            aeiGEO.ArkbYM.JGW = r9
            goto L38
        L41:
            int r9 = aeiGEO.ArkbYM.JGW
            int r9 = r9 >> 122
            int r9 = r9 % 116
            int r9 = r9 * 45
            aeiGEO.ArkbYM.JGW = r9
            goto L41
        L4c:
            java.lang.String r9 = "neZ~_Xoy"
            java.lang.String r9 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r9)
        L52:
            aeiGEO.GVpNrs.fQMcgE.sIqKDg(r2, r3, r9)
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$HttpMethod r9 = r8.UsvJLJ
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$HttpMethod r2 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.HttpMethod.GET
            r3 = 64
            r4 = 9178(0x23da, float:1.2861E-41)
            if (r9 != r2) goto Lf9
            aeiGEO.ZpNRhN r9 = r8.QLLKwQ
            java.lang.String r2 = r8.TpLtq
            int r9 = r9.zLnOGN(r2)
            int r2 = aeiGEO.ArkbYM.cwu
            r2 = r2 ^ 1934(0x78e, float:2.71E-42)
            if (r2 == 0) goto L109
            int r9 = aeiGEO.ArkbYM.JGW
            r9 = r9 ^ 9179(0x23db, float:1.2863E-41)
            if (r9 == 0) goto L8b
        L73:
            int r9 = aeiGEO.ArkbYM.JGW
            int r0 = r9 + 65
            r1 = 82
            if (r0 == r1) goto L84
            r1 = 173(0xad, float:2.42E-43)
            if (r0 == r1) goto L80
            goto L73
        L80:
            r0 = 153(0x99, float:2.14E-43)
            int r9 = r9 >> r0
            goto L89
        L84:
            int r9 = r9 % r3
            r9 = r9 ^ 4121(0x1019, float:5.775E-42)
            int r9 = r9 * 113
        L89:
            aeiGEO.ArkbYM.JGW = r9
        L8b:
            int r9 = aeiGEO.ArkbYM.cwu
            int r0 = r9 + 52
            r1 = 76
            if (r0 == r1) goto Lf1
            r1 = 209(0xd1, float:2.93E-43)
            if (r0 == r1) goto Lc7
            r9 = 344(0x158, float:4.82E-43)
            if (r0 == r9) goto L9c
            goto L8b
        L9c:
            int r9 = aeiGEO.ArkbYM.cwu
            r9 = r9 ^ 3890(0xf32, float:5.451E-42)
            int r9 = r9 % 27
            aeiGEO.ArkbYM.cwu = r9
            int r9 = aeiGEO.ArkbYM.JGW
            r9 = r9 ^ 9179(0x23db, float:1.2863E-41)
            if (r9 == 0) goto L9c
        Laa:
            int r9 = aeiGEO.ArkbYM.JGW
            int r0 = r9 + 143
            r1 = 48
            if (r0 == r1) goto Lb7
            r1 = 189(0xbd, float:2.65E-43)
            if (r0 == r1) goto Lbf
            goto Laa
        Lb7:
            int r0 = aeiGEO.ArkbYM.JGW
            int r0 = r0 + r9
            r1 = 175(0xaf, float:2.45E-43)
            int r0 = r0 >> r1
            aeiGEO.ArkbYM.JGW = r0
        Lbf:
            int r0 = aeiGEO.ArkbYM.JGW
            int r0 = r0 * 123
            int r0 = r0 + r9
            aeiGEO.ArkbYM.JGW = r0
            goto Lb7
        Lc7:
            int r0 = r9 * 57
            r0 = r0 ^ 2315(0x90b, float:3.244E-42)
            aeiGEO.ArkbYM.cwu = r0
            int r0 = aeiGEO.ArkbYM.JGW
            if (r0 > r4) goto Lf1
        Ld1:
            int r9 = aeiGEO.ArkbYM.JGW
            int r0 = r9 + 117
            r1 = 91
            if (r0 == r1) goto Le8
            r1 = 106(0x6a, float:1.49E-43)
            if (r0 == r1) goto Lde
            goto Ld1
        Lde:
            int r0 = aeiGEO.ArkbYM.JGW
            int r0 = r0 * 19
            int r0 = r0 + r9
            int r0 = r0 % 31
            aeiGEO.ArkbYM.JGW = r0
            goto Lde
        Le8:
            int r9 = aeiGEO.ArkbYM.JGW
            int r9 = r9 >> 84
            int r9 = r9 * 52
            aeiGEO.ArkbYM.JGW = r9
            goto Le8
        Lf1:
            int r0 = aeiGEO.ArkbYM.cwu
            int r0 = r0 % 18
            int r0 = r0 + r9
            aeiGEO.ArkbYM.cwu = r0
            goto L8b
        Lf9:
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$HttpMethod r2 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.HttpMethod.POST
            if (r9 != r2) goto L108
            aeiGEO.ZpNRhN r9 = r8.QLLKwQ
            java.lang.String r2 = r8.TpLtq
            byte[] r5 = r8.gZATrX
            int r9 = r9.ddauOi(r2, r5)
            goto L109
        L108:
            r9 = -1
        L109:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r0
            java.lang.String r0 = "pb"
            java.lang.String r1 = "=xU,"
            if (r9 >= 0) goto L1f4
            java.lang.String r9 = aeiGEO.ArkbYM.DlIaRS
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "{pR`NU!jc\bPF^[AB@P\u0014U@^]\u000f"
            java.lang.String r7 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r7)
            r2.append(r7)
            java.lang.String r7 = r8.TpLtq
            r2.append(r7)
            java.lang.String r7 = "=fRxC\u0011"
            java.lang.String r7 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r7)
            r2.append(r7)
            aeiGEO.ZpNRhN r7 = r8.QLLKwQ
            com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface$TMXHttpResponseCode r7 = r7.OBzZra()
            java.lang.String r7 = r7.toString()
            r2.append(r7)
            java.lang.String r1 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r1)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            aeiGEO.GVpNrs.DFbvW(r9, r0)
            int r9 = aeiGEO.ArkbYM.cwu
            r0 = 1933(0x78d, float:2.709E-42)
            if (r9 > r0) goto L225
            int r9 = aeiGEO.ArkbYM.JGW
            if (r9 > r4) goto L19a
        L165:
            int r9 = aeiGEO.ArkbYM.JGW
            int r0 = r9 + 104
            r1 = 90
            if (r0 == r1) goto L188
            r1 = 268(0x10c, float:3.76E-43)
            if (r0 == r1) goto L17a
            r1 = 385(0x181, float:5.4E-43)
            if (r0 == r1) goto L180
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L191
            goto L165
        L17a:
            r0 = r9 ^ 2698(0xa8a, float:3.781E-42)
            int r0 = r0 % 113
            aeiGEO.ArkbYM.JGW = r0
        L180:
            int r0 = aeiGEO.ArkbYM.JGW
            int r0 = r0 + r9
            int r0 = r0 % 60
            int r0 = r0 >> 88
            goto L18f
        L188:
            int r0 = aeiGEO.ArkbYM.JGW
            int r0 = r0 * 27
            int r0 = r0 + r9
            int r0 = r0 >> 75
        L18f:
            aeiGEO.ArkbYM.JGW = r0
        L191:
            int r0 = aeiGEO.ArkbYM.JGW
            int r0 = r0 + r9
            int r0 = r0 >> 122
            int r0 = r0 + r9
            aeiGEO.ArkbYM.JGW = r0
            goto L188
        L19a:
            int r9 = aeiGEO.ArkbYM.cwu
            int r0 = r9 + 78
            r1 = 41
            if (r0 == r1) goto L1ce
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 == r1) goto L1bc
            r1 = 311(0x137, float:4.36E-43)
            if (r0 == r1) goto L1af
            r1 = 331(0x14b, float:4.64E-43)
            if (r0 == r1) goto L1c4
            goto L19a
        L1af:
            int r0 = r9 % 50
            int r0 = r0 % 70
            aeiGEO.ArkbYM.cwu = r0
            int r0 = aeiGEO.ArkbYM.JGW
            r0 = r0 ^ 9179(0x23db, float:1.2863E-41)
            if (r0 == 0) goto L1ce
            goto L1d9
        L1bc:
            int r0 = aeiGEO.ArkbYM.cwu
            r0 = r0 ^ 2256(0x8d0, float:3.161E-42)
            int r0 = r0 * 110
            aeiGEO.ArkbYM.cwu = r0
        L1c4:
            int r0 = aeiGEO.ArkbYM.cwu
            int r0 = r0 + r9
            int r0 = r0 >> 22
            int r0 = r0 * 39
            aeiGEO.ArkbYM.cwu = r0
            goto L1bc
        L1ce:
            int r0 = aeiGEO.ArkbYM.cwu
            int r0 = r0 + r9
            int r0 = r0 * 103
            aeiGEO.ArkbYM.cwu = r0
            int r0 = aeiGEO.ArkbYM.JGW
            if (r0 > r4) goto L1ce
        L1d9:
            int r9 = aeiGEO.ArkbYM.JGW
            int r0 = r9 + 156
            if (r0 == r3) goto L1ed
            r9 = 71
            if (r0 == r9) goto L1e4
            goto L1d9
        L1e4:
            int r9 = aeiGEO.ArkbYM.JGW
            int r9 = r9 * 87
            int r9 = r9 % 40
            aeiGEO.ArkbYM.JGW = r9
            goto L1e4
        L1ed:
            int r9 = r9 * 72
            int r9 = r9 % 6
            aeiGEO.ArkbYM.JGW = r9
            goto L1d9
        L1f4:
            java.lang.String r9 = aeiGEO.ArkbYM.DlIaRS
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "otO~BTw{h\u0012\u0002"
            java.lang.String r3 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r3)
            r2.append(r3)
            aeiGEO.ZpNRhN r3 = r8.QLLKwQ
            java.lang.String r3 = r3.sTbpmZ()
            r2.append(r3)
            java.lang.String r1 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r1)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            aeiGEO.GVpNrs.fQMcgE.sIqKDg(r9, r0)
        L225:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aeiGEO.ArkbYM.fVBECu(boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:27:0x0063) to fix multi-entry loop: BACK_EDGE: B:26:0x005c -> B:27:0x0063 */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c3, code lost:
    
        if (r2 == 371) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c6, code lost:
    
        aeiGEO.ArkbYM.JGW = ((aeiGEO.ArkbYM.JGW ^ 2362) * 75) ^ 4631;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d1, code lost:
    
        aeiGEO.ArkbYM.JGW = (r0 >> org.spongycastle.crypto.tls.CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d8, code lost:
    
        aeiGEO.ArkbYM.JGW = ((aeiGEO.ArkbYM.JGW >> 38) % 33) >> 77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e2, code lost:
    
        aeiGEO.ArkbYM.JGW = (aeiGEO.ArkbYM.JGW % 91) * 80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01eb, code lost:
    
        r0 = aeiGEO.ArkbYM.cwu;
        r2 = r0 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f1, code lost:
    
        if (r2 == 8) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f3, code lost:
    
        if (r2 == 33) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f7, code lost:
    
        if (r2 == 86) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01f9, code lost:
    
        if (r2 == 97) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01fc, code lost:
    
        aeiGEO.ArkbYM.cwu = (r0 >> 70) * 2622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0206, code lost:
    
        if ((aeiGEO.ArkbYM.JGW ^ 9179) == 0) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0209, code lost:
    
        aeiGEO.ArkbYM.cwu = ((aeiGEO.ArkbYM.cwu ^ 3441) % 107) >> 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0217, code lost:
    
        if ((aeiGEO.ArkbYM.JGW ^ 9179) == 0) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0219, code lost:
    
        r0 = aeiGEO.ArkbYM.JGW;
        r1 = r0 + 234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x021d, code lost:
    
        if (r1 == 78) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0221, code lost:
    
        if (r1 == 232) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0225, code lost:
    
        if (r1 == 286) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0229, code lost:
    
        if (r1 == 337) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x022c, code lost:
    
        r0 = (r0 % 72) >> 38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0230, code lost:
    
        aeiGEO.ArkbYM.JGW = ((aeiGEO.ArkbYM.JGW + r0) * 42) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0239, code lost:
    
        r0 = (r0 % 86) * 600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023c, code lost:
    
        aeiGEO.ArkbYM.JGW = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x023e, code lost:
    
        r0 = (aeiGEO.ArkbYM.JGW % 107) ^ 5354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0245, code lost:
    
        aeiGEO.ArkbYM.cwu = ((aeiGEO.ArkbYM.cwu ^ 4043) + r0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024e, code lost:
    
        aeiGEO.ArkbYM.cwu = (r0 + r0) ^ 3562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0257, code lost:
    
        if ((aeiGEO.ArkbYM.JGW ^ 9179) == 0) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0259, code lost:
    
        r0 = aeiGEO.ArkbYM.JGW;
        r1 = r0 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025d, code lost:
    
        if (r1 == 13) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0261, code lost:
    
        if (r1 == 34) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0264, code lost:
    
        r0 = (r0 >> org.spongycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA) * 101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x026a, code lost:
    
        r0 = ((r0 * 62) >> 9) ^ 5286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0270, code lost:
    
        aeiGEO.ArkbYM.JGW = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0272, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016c, code lost:
    
        if ((aeiGEO.ArkbYM.JGW ^ 9179) != 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01af, code lost:
    
        if ((aeiGEO.ArkbYM.JGW ^ 9179) != 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b1, code lost:
    
        r0 = aeiGEO.ArkbYM.JGW;
        r2 = r0 + 130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b7, code lost:
    
        if (r2 == 48) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        if (r2 == 163) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bf, code lost:
    
        if (r2 == 293) goto L203;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x023c -> B:132:0x023e). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() throws Throwable {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCodeOBzZra = this.QLLKwQ.OBzZra();
        int i6 = 0;
        loop0: while (i6 <= this.Ried && !tMXHttpResponseCodeOBzZra.succeeded() && tMXHttpResponseCodeOBzZra.getHttpResponseCode() != -6 && tMXHttpResponseCodeOBzZra.getHttpResponseCode() != -5) {
            if (i6 != 0) {
                if (cwu <= 1933) {
                    do {
                        i4 = cwu;
                    } while (i4 + 39 != 5);
                    cwu = ((i4 * 76) + i4) ^ 4302;
                    if (JGW <= 9178) {
                        while (true) {
                            i5 = JGW;
                            int i7 = i5 + 39;
                            if (i7 != 20) {
                                if (i7 == 110) {
                                    JGW = ((i5 * 92) % 12) ^ 4016;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        while (true) {
                            JGW = ((JGW * 98) + i5) ^ 3859;
                        }
                    }
                }
                z = true;
            } else {
                z = false;
            }
            fVBECu(z);
            i6++;
            TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCodeOBzZra2 = this.QLLKwQ.OBzZra();
            if (!tMXHttpResponseCodeOBzZra2.succeeded()) {
                GVpNrs.DFbvW(DlIaRS, TMXProfilingConnections.fsw("xcIcY\u0011)") + tMXHttpResponseCodeOBzZra2.getHttpResponseCode() + TMXProfilingConnections.fsw("41HxJEtm,GL\u0003XLYRSF@\u0013F^\u0010") + this.TpLtq);
                if ((cwu ^ 1934) == 0) {
                    continue;
                } else {
                    if (JGW > 9178) {
                        while (true) {
                            int i8 = cwu;
                            int i9 = i8 + 52;
                            if (i9 == 87) {
                                cwu = (i8 ^ 1766) >> CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;
                                if ((JGW ^ 9179) != 0) {
                                    do {
                                        i = JGW;
                                    } while (i + 65 != 72);
                                    JGW = (i ^ 4327) % 43;
                                }
                            } else if (i9 == 215) {
                                cwu = (i8 * 3264) ^ 2734;
                                if ((JGW ^ 9179) != 0) {
                                    break loop0;
                                }
                            } else if (i9 == 389) {
                                while (true) {
                                    cwu = (cwu + i8) >> 89;
                                    if (JGW <= 9178) {
                                        do {
                                            i2 = JGW;
                                        } while (i2 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 13);
                                        JGW = (i2 >> 75) + i2 + i2;
                                    }
                                }
                            } else if (i9 == 440) {
                                while (true) {
                                    cwu = ((cwu ^ 2475) % 51) % 70;
                                    if ((JGW ^ 9179) != 0) {
                                        while (true) {
                                            i3 = JGW;
                                            int i10 = i3 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                                            if (i10 == 28) {
                                                break;
                                            } else if (i10 == 46) {
                                                JGW = (i3 + i3) >> MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
                                            }
                                        }
                                        JGW = (i3 ^ 5322) % 2;
                                    }
                                }
                            }
                        }
                    }
                    while (JGW + 78 != 57) {
                    }
                    while (true) {
                        JGW = ((JGW ^ 5305) % 1) % 97;
                    }
                }
            }
            tMXHttpResponseCodeOBzZra = tMXHttpResponseCodeOBzZra2;
        }
        try {
            try {
                if (this.dJutej != null) {
                    this.dJutej.onComplete(tMXHttpResponseCodeOBzZra, tMXHttpResponseCodeOBzZra.getHttpResponseCode() == 200 ? this.QLLKwQ.arDRxL() : null);
                }
                this.QLLKwQ.OmPrLP();
                if ((cwu ^ 1934) == 0) {
                }
            } catch (IOException unused) {
                GVpNrs.svhCHd(DlIaRS, TMXProfilingConnections.fsw("T^~tHTqjeGL\u0003\u0002") + tMXHttpResponseCodeOBzZra.toString() + TMXProfilingConnections.fsw("41HxJEtm,GL\u0003XLYRSF@\u0013F^\u0010") + this.QLLKwQ.hijVBL());
                this.QLLKwQ.OmPrLP();
                if ((cwu ^ 1934) == 0) {
                }
            }
        } catch (Throwable th) {
            this.QLLKwQ.OmPrLP();
            throw th;
        }
    }
}
