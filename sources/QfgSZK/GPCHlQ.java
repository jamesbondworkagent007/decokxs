package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
class GPCHlQ {
    private static String DlIaRS = null;
    private static final Pattern Dsurib;
    public static int OJO = 5423;
    public static int zYl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        zYl = 4373;
        DlIaRS = FQMcgE.hfdhUn(GPCHlQ.class);
        int i2 = zYl;
        if (OJO <= 5422) {
            do {
                i = OJO + 13;
                if (i == 40) {
                    while (true) {
                        OJO = (OJO % 31) ^ 4143;
                    }
                }
            } while (i != 179);
            while (true) {
                OJO = (OJO >> 42) ^ 1376;
            }
        } else if (i2 > 4372) {
            Dsurib = Pattern.compile(GCXiNH.fsw("C!\u0010("));
        } else {
            while (zYl + 13 != 49) {
            }
            while (true) {
                zYl = (zYl % 36) * 71;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GPCHlQ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String OAhWiU(DPHsZd dPHsZd) throws InterruptedException {
        String strDrNnAm = null;
        if (!HJWChP.HhYHK.gGvvIC()) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("NyZ~NUQliNGQOGKBE\u0015CRA_\u0017[\u001e[SNT]\u0014\u0017Bj$mmu YIgayk}m'Ezrgepbj>TX"));
            return null;
        }
        try {
            strDrNnAm = dPHsZd.DrNnAm(GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy"));
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        } catch (ClassCastException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("T\u007fXcFA`jeJNF\n]QWS\u0015R\\@\u0011wzwy"));
            ORrpqH.uzCIH().seuMaA(e);
        }
        if (!UPbYzn.iSpHlg(strDrNnAm)) {
            return strDrNnAm;
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[~NbO\u0011oqx@KMM\tAI\u0016F\\R@TT\u000fNOY]I\u0015\u0018PCkaqcuiPK)C^CM"));
        String lowerCase = UUID.randomUUID().toString().replace("-", "").toLowerCase(Locale.US);
        dPHsZd.ihnvzI(GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy"), lowerCase);
        return lowerCase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static boolean aQtmcU(String str) {
        if (!UPbYzn.iSpHlg(str) && !str.equals(GCXiNH.fsw("$&\f8O\u00047z:\u0010\u0010F\u001f\u001d\u0011D")) && str.length() >= 15 && !Dsurib.matcher(str).find()) {
            return false;
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("\\_\u007f^dxEAEl\u0002@EG\\F_[G\u0013\\^DGWS[\u001bOJ]QSi>#") + str);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String dbUqJD(ZqidTP zqidTP) {
        return HJWChP.iaHEvk.hwXsuq(zqidTP.Umbazn.getContentResolver(), GCXiNH.fsw("|\u007f_~DXeAeL"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String sILrnl(String str) {
        if (aQtmcU(str)) {
            return null;
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("hbRbL\u0011@PHzmjnvac\u0016S[A\u0012e`l\u0004") + str);
        return zeUYeG(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:37:0x006d) to fix multi-entry loop: BACK_EDGE: B:37:0x006d -> B:38:0x0075 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.String zeUYeG(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 == 0) goto Ld3
            int r1 = QfgSZK.GPCHlQ.OJO
            r1 = r1 ^ 5423(0x152f, float:7.599E-42)
            if (r1 == 0) goto L31
        L9:
            int r1 = QfgSZK.GPCHlQ.OJO
            int r3 = r1 + 26
            r0 = 54
            if (r3 == r0) goto L29
            r0 = 134(0x86, float:1.88E-43)
            if (r3 == r0) goto L1a
            r0 = 278(0x116, float:3.9E-43)
            if (r3 == r0) goto L20
            goto L9
        L1a:
            r3 = r1 ^ 1360(0x550, float:1.906E-42)
            int r3 = r3 % 47
            QfgSZK.GPCHlQ.OJO = r3
        L20:
            int r3 = QfgSZK.GPCHlQ.OJO
            int r3 = r3 * 80
            int r3 = r3 % 92
            QfgSZK.GPCHlQ.OJO = r3
            goto L9
        L29:
            int r3 = QfgSZK.GPCHlQ.OJO
            int r3 = r3 + r1
            int r3 = r3 * 114
            QfgSZK.GPCHlQ.OJO = r3
            goto L29
        L31:
            int r1 = r3.length()
            if (r1 != 0) goto L39
            goto Ld3
        L39:
            int r1 = r3.length()
            r2 = 32
            if (r1 != r2) goto L42
            return r3
        L42:
            int r1 = r3.length()
            if (r1 >= r2) goto Lce
            int r1 = QfgSZK.GPCHlQ.OJO
            r1 = r1 ^ 5423(0x152f, float:7.599E-42)
            if (r1 == 0) goto L81
        L4e:
            int r1 = QfgSZK.GPCHlQ.OJO
            int r3 = r1 + 65
            r0 = 6
            if (r3 == r0) goto L6d
            r0 = 132(0x84, float:1.85E-43)
            if (r3 == r0) goto L67
            r0 = 234(0xea, float:3.28E-43)
            if (r3 == r0) goto L77
            r0 = 371(0x173, float:5.2E-43)
            if (r3 == r0) goto L62
            goto L4e
        L62:
            int r3 = r1 * 60
            int r3 = r3 % 12
            goto L75
        L67:
            int r1 = r1 + r1
            int r1 = r1 % 28
            QfgSZK.GPCHlQ.OJO = r1
            goto L4e
        L6d:
            int r3 = QfgSZK.GPCHlQ.OJO
            int r3 = r3 % 106
            int r3 = r3 >> 53
            r3 = r3 ^ 1401(0x579, float:1.963E-42)
        L75:
            QfgSZK.GPCHlQ.OJO = r3
        L77:
            int r3 = QfgSZK.GPCHlQ.OJO
            int r3 = r3 % 88
            int r3 = r3 >> 89
            int r3 = r3 + r1
            QfgSZK.GPCHlQ.OJO = r3
            goto L6d
        L81:
            java.lang.String r1 = QfgSZK.UPbYzn.DRuYWY(r3)
            if (r1 != 0) goto L88
            return r0
        L88:
            int r0 = r3.length()
            int r2 = r2 - r0
            int r0 = r1.length()
            if (r2 <= r0) goto L97
            int r2 = r1.length()
        L97:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r3 = 0
            java.lang.String r3 = r1.substring(r3, r2)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            int r0 = QfgSZK.GPCHlQ.OJO
            r1 = 5422(0x152e, float:7.598E-42)
            if (r0 > r1) goto Ld2
        Lb1:
            int r3 = QfgSZK.GPCHlQ.OJO
            int r0 = r3 + 91
            r1 = 72
            if (r0 == r1) goto Lc7
            r1 = 245(0xf5, float:3.43E-43)
            if (r0 == r1) goto Lbe
            goto Lb1
        Lbe:
            int r3 = r3 >> 49
            int r3 = r3 * 65
            int r3 = r3 % 125
            QfgSZK.GPCHlQ.OJO = r3
            goto Lb1
        Lc7:
            int r3 = QfgSZK.GPCHlQ.OJO
            r3 = r3 ^ 3403(0xd4b, float:4.769E-42)
            QfgSZK.GPCHlQ.OJO = r3
            goto Lc7
        Lce:
            java.lang.String r3 = QfgSZK.UPbYzn.DRuYWY(r3)
        Ld2:
            return r3
        Ld3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.GPCHlQ.zeUYeG(java.lang.String):java.lang.String");
    }
}
