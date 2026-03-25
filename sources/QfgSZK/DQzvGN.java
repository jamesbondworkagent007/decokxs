package QfgSZK;

import QfgSZK.AuCTel;
import QfgSZK.FQMcgE;
import android.content.Context;
import android.os.Handler;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DQzvGN {
    private static String CSTjI = null;
    private static String DlIaRS = null;
    private static String QuMddl = null;
    private static String aKeiJv = null;
    private static String agGLdg = null;
    public static int cSl = 0;
    static final drmXxu dauNgl;
    private static String dbPMnj = null;
    private static String ddfbYF = null;
    private static String dnzOAG = null;
    private static String gWQncO = null;
    private static String hNPXBM = null;
    private static String hrrxiP = null;
    public static int hvC = 2300;
    private static String imVBpO;
    private static String izJtVA;
    private static String slRHtw;
    private static String zqSWIl;

    public static class drmXxu {
        public static int EqZ = 0;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String ODEXqh = null;
        public static int ODs = 2652;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String QZUhIA;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String QbXAPN;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String QndtnH;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String UDadvq;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String fGPAQx;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String fbhpAn;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String gKkhJr;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String gtECct;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String hDaRlm;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String zdtQVh;
        final Class<?> DJnKnF;
        final Method OkUlEA;
        final Method QJtSfl;
        final Method QYRJVG;
        final Class<?> QlHtGM;
        final Class<?> QlXQKY;
        final Method RBUbdS;
        final Class<?> RnVNzm;
        final Method UBMjjE;
        final Class<?> UEgObq;
        final Class<?> aitBeS;
        final Method auDWpB;
        final Class<?> bUYjY;
        final Method dlMGXl;
        final Class<?> fIimqc;
        final Class<?> gBZTQr;
        final Method gxcMer;
        final Method saWdgi;
        final Method ssDeSX;
        final Class<?> zVmmTN;
        final Method zpTtYD;

        /* JADX INFO: renamed from: QfgSZK.DQzvGN$drmXxu$drmXxu, reason: collision with other inner class name */
        public class C0002drmXxu extends Exception {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0002drmXxu() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            EqZ = 7984;
            if (ODs > 2651) {
                GCXiNH.OHr = 2270;
                Th(false);
                return;
            }
            while (true) {
                int i = ODs;
                int i2 = i + 13;
                if (i2 != 70) {
                    if (i2 == 165) {
                        ODs = (i + i + i) * 10;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                ODs = (ODs >> 14) % 10;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public drmXxu() throws C0002drmXxu {
            Class<?> clsWlaJM = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_PLAY_UTILS);
            Class<?> clsWlaJM2 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_AVAILABILITY);
            Class<?> clsWlaJM3 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_API_BUILDER);
            Class<?> clsWlaJM4 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_CONNECTION_CALL_BACK);
            Class<?> clsWlaJM5 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_FAILED_CALL_BACK);
            Class<?> clsWlaJM6 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_API);
            Class<?> clsWlaJM7 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_API_CLIENT);
            Class<?> clsWlaJM8 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_PENDING_RESULT);
            Class<?> clsWlaJM9 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_STATUS);
            Class<?> clsWlaJM10 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_RESULT_CALL_BACK);
            if ((clsWlaJM == null && clsWlaJM2 == null) || clsWlaJM3 == null || clsWlaJM4 == null || clsWlaJM5 == null || clsWlaJM6 == null || clsWlaJM7 == null || clsWlaJM8 == null || clsWlaJM9 == null || clsWlaJM10 == null) {
                throw new C0002drmXxu();
            }
            this.gBZTQr = clsWlaJM;
            this.fIimqc = clsWlaJM2;
            this.RnVNzm = clsWlaJM3;
            this.zVmmTN = clsWlaJM4;
            this.bUYjY = clsWlaJM5;
            this.DJnKnF = clsWlaJM6;
            this.QlXQKY = clsWlaJM7;
            this.UEgObq = clsWlaJM8;
            this.QlHtGM = clsWlaJM9;
            this.aitBeS = clsWlaJM10;
            Method methodZsXlph = AuCTel.zsXlph(clsWlaJM3, fbhpAn, new Class[0]);
            Method methodZsXlph2 = AuCTel.zsXlph(clsWlaJM3, ODEXqh, clsWlaJM6);
            Method methodZsXlph3 = AuCTel.zsXlph(clsWlaJM3, gtECct, clsWlaJM4);
            Method methodZsXlph4 = AuCTel.zsXlph(clsWlaJM3, QZUhIA, clsWlaJM5);
            Method methodZsXlph5 = AuCTel.zsXlph(clsWlaJM3, hDaRlm, Handler.class);
            Method methodZsXlph6 = AuCTel.zsXlph(clsWlaJM7, zdtQVh, new Class[0]);
            Method methodZsXlph7 = AuCTel.zsXlph(clsWlaJM7, QndtnH, new Class[0]);
            Method methodZsXlph8 = AuCTel.zsXlph(clsWlaJM9, QbXAPN, new Class[0]);
            Method methodZsXlph9 = AuCTel.zsXlph(clsWlaJM8, UDadvq, clsWlaJM10);
            if (methodZsXlph == null || methodZsXlph6 == null || methodZsXlph8 == null || methodZsXlph7 == null || methodZsXlph2 == null || methodZsXlph3 == null || methodZsXlph4 == null || methodZsXlph9 == null || methodZsXlph5 == null) {
                throw new C0002drmXxu();
            }
            Method methodZsXlph10 = AuCTel.zsXlph(clsWlaJM2, fGPAQx, Context.class);
            Method methodZsXlph11 = AuCTel.zsXlph(clsWlaJM2, gKkhJr, new Class[0]);
            if (methodZsXlph11 == null && (methodZsXlph10 = AuCTel.zsXlph(clsWlaJM, fGPAQx, Context.class)) == null) {
                throw new C0002drmXxu();
            }
            this.dlMGXl = methodZsXlph;
            this.saWdgi = methodZsXlph6;
            this.ssDeSX = methodZsXlph8;
            this.zpTtYD = methodZsXlph7;
            this.QYRJVG = methodZsXlph2;
            this.UBMjjE = methodZsXlph5;
            this.RBUbdS = methodZsXlph3;
            this.OkUlEA = methodZsXlph4;
            this.auDWpB = methodZsXlph9;
            this.gxcMer = methodZsXlph10;
            this.QJtSfl = methodZsXlph11;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:16:0x002b) to fix multi-entry loop: BACK_EDGE: B:16:0x002b -> B:17:0x002e */
        /* JADX DEBUG: Duplicate block (B:40:0x00ad) to fix multi-entry loop: BACK_EDGE: B:40:0x00ad -> B:41:0x00b4 */
        /* JADX DEBUG: Duplicate block (B:55:0x0108) to fix multi-entry loop: BACK_EDGE: B:54:0x00fe -> B:55:0x0108 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static /* synthetic */ void Th(boolean r3) {
            /*
                if (r3 == 0) goto L6
                r3 = 0
                Th(r3)
            L6:
                java.lang.String r3 = "|u_CErnpbMAWCFFaW\\XVV}Y\\JXR^H"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                int r0 = QfgSZK.DQzvGN.drmXxu.ODs
                r1 = 2651(0xa5b, float:3.715E-42)
                if (r0 > r1) goto L41
            L12:
                int r3 = QfgSZK.DQzvGN.drmXxu.ODs
                int r0 = r3 + 104
                r1 = 37
                if (r0 == r1) goto L33
                r1 = 148(0x94, float:2.07E-43)
                if (r0 == r1) goto L27
                r1 = 153(0x99, float:2.14E-43)
                if (r0 == r1) goto L2e
                r1 = 219(0xdb, float:3.07E-43)
                if (r0 == r1) goto L39
                goto L12
            L27:
                int r0 = r3 % 51
                int r0 = r0 * 123
            L2b:
                int r0 = r0 + r3
                QfgSZK.DQzvGN.drmXxu.ODs = r0
            L2e:
                int r0 = QfgSZK.DQzvGN.drmXxu.ODs
                int r0 = r0 >> 25
                goto L2b
            L33:
                int r0 = r3 + r3
                r0 = r0 ^ 2178(0x882, float:3.052E-42)
                QfgSZK.DQzvGN.drmXxu.ODs = r0
            L39:
                int r0 = QfgSZK.DQzvGN.drmXxu.ODs
                int r0 = r0 + r3
                int r3 = r0 >> 86
                QfgSZK.DQzvGN.drmXxu.ODs = r3
                goto L12
            L41:
                QfgSZK.DQzvGN.drmXxu.QZUhIA = r3
                java.lang.String r3 = "|u_M[X"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.ODEXqh = r3
                java.lang.String r3 = "ntODJ_eriZ"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.hDaRlm = r3
                java.lang.String r3 = "~~UbNRu"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.zdtQVh = r3
                java.lang.String r3 = "\u007fdR`O"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.fbhpAn = r3
                int r3 = QfgSZK.DQzvGN.drmXxu.EqZ
                r0 = 7983(0x1f2f, float:1.1187E-41)
                if (r3 > r0) goto L85
            L69:
                int r3 = QfgSZK.DQzvGN.drmXxu.EqZ
                int r0 = r3 + 26
                r1 = 35
                if (r0 == r1) goto L7e
                r1 = 115(0x73, float:1.61E-43)
                if (r0 == r1) goto L76
                goto L69
            L76:
                int r0 = QfgSZK.DQzvGN.drmXxu.EqZ
                int r0 = r0 % 21
                int r0 = r0 + r3
                QfgSZK.DQzvGN.drmXxu.EqZ = r0
                goto L76
            L7e:
                int r3 = QfgSZK.DQzvGN.drmXxu.EqZ
                int r3 = r3 * 10324
                QfgSZK.DQzvGN.drmXxu.EqZ = r3
                goto L7e
            L85:
                java.lang.String r3 = "tbhyHRdm\u007f"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.QbXAPN = r3
                java.lang.String r3 = "ntO^NBtrxkCOFKID]"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                int r0 = QfgSZK.DQzvGN.drmXxu.ODs
                r0 = r0 ^ 2652(0xa5c, float:3.716E-42)
                if (r0 == 0) goto Lcb
            L99:
                int r0 = QfgSZK.DQzvGN.drmXxu.ODs
                int r3 = r0 + 117
                r1 = 7
                if (r3 == r1) goto Lad
                r1 = 74
                if (r3 == r1) goto Lc2
                r1 = 150(0x96, float:2.1E-43)
                if (r3 == r1) goto Lbb
                r1 = 285(0x11d, float:4.0E-43)
                if (r3 == r1) goto Lb4
                goto L99
            Lad:
                int r3 = QfgSZK.DQzvGN.drmXxu.ODs
                int r3 = r3 + r0
                r3 = r3 ^ 2668(0xa6c, float:3.739E-42)
                QfgSZK.DQzvGN.drmXxu.ODs = r3
            Lb4:
                int r3 = QfgSZK.DQzvGN.drmXxu.ODs
                int r3 = r3 * 1552
                int r3 = r3 + r0
                QfgSZK.DQzvGN.drmXxu.ODs = r3
            Lbb:
                int r3 = QfgSZK.DQzvGN.drmXxu.ODs
                int r3 = r3 + r0
                int r3 = r3 * 14
                QfgSZK.DQzvGN.drmXxu.ODs = r3
            Lc2:
                int r3 = QfgSZK.DQzvGN.drmXxu.ODs
                int r3 = r3 % 119
                int r3 = r3 * 80
                QfgSZK.DQzvGN.drmXxu.ODs = r3
                goto Lad
            Lcb:
                QfgSZK.DQzvGN.drmXxu.UDadvq = r3
                java.lang.String r3 = "tb|cDVm{\\DCZyLZQ_VQ@sGQFR\\^W_"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.fGPAQx = r3
                java.lang.String r3 = "ztOEEBu\u007fbKG"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.gKkhJr = r3
                java.lang.String r3 = "yxHoD_o{o\\"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                int r0 = QfgSZK.DQzvGN.drmXxu.ODs
                if (r0 > r1) goto L110
            Le7:
                int r0 = QfgSZK.DQzvGN.drmXxu.ODs
                int r1 = r0 + 143
                r2 = 64
                if (r1 == r2) goto Lfe
                r2 = 85
                if (r1 == r2) goto Lf8
                r2 = 139(0x8b, float:1.95E-43)
                if (r1 == r2) goto L108
                goto Le7
            Lf8:
                r1 = r0 ^ 967(0x3c7, float:1.355E-42)
                int r1 = r1 + r0
                QfgSZK.DQzvGN.drmXxu.ODs = r1
                goto L110
            Lfe:
                int r3 = QfgSZK.DQzvGN.drmXxu.ODs
                r3 = r3 ^ 4288(0x10c0, float:6.009E-42)
                int r3 = r3 * 99
                r3 = r3 ^ 1770(0x6ea, float:2.48E-42)
                QfgSZK.DQzvGN.drmXxu.ODs = r3
            L108:
                int r3 = QfgSZK.DQzvGN.drmXxu.ODs
                int r3 = r3 + r0
                int r3 = r3 % 42
                QfgSZK.DQzvGN.drmXxu.ODs = r3
                goto Lfe
            L110:
                QfgSZK.DQzvGN.drmXxu.QndtnH = r3
                java.lang.String r3 = "|u_OD_o{o\\KLDjIKZWUPYB"
                java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)
                QfgSZK.DQzvGN.drmXxu.gtECct = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DQzvGN.drmXxu.Th(boolean):void");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        ORrpqH.fYm = 8848;
        FQMcgE.fQMcgE.CEb = 9231;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        ORrpqH.Chu = 7915;
        cSl = 8296;
        GCXiNH.OHr = 2270;
        agGLdg = GCXiNH.fsw("tb|cDVm{\\DCZyLZQ_VQ@sGQFR\\^W_");
        QuMddl = GCXiNH.fsw("|u_CErnpbMAWCFFaW\\XVV}Y\\JXR^H");
        aKeiJv = GCXiNH.fsw("|u_OD_o{o\\KLDjIKZWUPYB");
        hrrxiP = GCXiNH.fsw("ztOEEBu\u007fbKG");
        izJtVA = GCXiNH.fsw("|u_M[X");
        zqSWIl = GCXiNH.fsw("ntODJ_eriZ");
        slRHtw = GCXiNH.fsw("\u007fdR`O");
        dbPMnj = GCXiNH.fsw("yxHoD_o{o\\");
        hNPXBM = GCXiNH.fsw("~~UbNRu");
        ddfbYF = GCXiNH.fsw("ntO^NBtrxkCOFKID]");
        CSTjI = GCXiNH.fsw("tbhyHRdm\u007f");
        gWQncO = GCXiNH.fsw("ztOMOGdlxAQJDNaC\u007f[R\\");
        imVBpO = GCXiNH.fsw("ztOEO");
        DlIaRS = FQMcgE.hfdhUn(DQzvGN.class);
        drmXxu drmxxu = null;
        dnzOAG = null;
        try {
            drmxxu = new drmXxu();
        } catch (drmXxu.C0002drmXxu e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("^pU+_\u0011f{x\bCOF\tZBG@]AW\\UAJN\u001cMSX\u0018ECchfauiQB"));
            ORrpqH.uzCIH().seuMaA(e);
        }
        dauNgl = drmxxu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DQzvGN() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean fXYAwm(Context context) {
        int i;
        int i2;
        int i3;
        drmXxu drmxxu = dauNgl;
        if (context == null) {
            FQMcgE.DztXDE(DlIaRS, GCXiNH.fsw("SdW`\u000bRnpxMZW"));
            return false;
        }
        if (drmxxu == null) {
            return false;
        }
        Object objFIwbmz = AuCTel.fIwbmz(null, drmxxu.QJtSfl, new Object[0]);
        if (objFIwbmz != null) {
            Method method = drmxxu.gxcMer;
            Object[] objArr = new Object[1];
            if (hvC <= 2299) {
                do {
                    i2 = hvC;
                    i3 = i2 + 52;
                    if (i3 == 28) {
                        while (true) {
                            hvC = ((hvC ^ 5195) >> 84) * 101;
                        }
                    }
                } while (i3 != 142);
                while (true) {
                    hvC = ((hvC ^ 3318) + i2) >> 118;
                }
            } else {
                objArr[0] = context;
                Object objFIwbmz2 = AuCTel.fIwbmz(objFIwbmz, method, objArr);
                if (objFIwbmz2 != null && objFIwbmz2.equals(0)) {
                    return true;
                }
            }
        }
        Object objFIwbmz3 = AuCTel.fIwbmz(null, drmxxu.gxcMer, context);
        if (objFIwbmz3 == null || !objFIwbmz3.equals(0)) {
            return false;
        }
        if (hvC <= 2299) {
            while (true) {
                i = hvC;
                int i4 = i + 78;
                if (i4 == 30) {
                    hvC = ((i >> WebSocketProtocol.PAYLOAD_SHORT) * 124) + i;
                } else if (i4 == 163) {
                    break;
                }
            }
            hvC = (i * 2368) + i;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:86:0x016a) to fix multi-entry loop: BACK_EDGE: B:86:0x016a -> B:87:0x016c */
    public static String gdmIOq(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (dnzOAG == null && fXYAwm(context)) {
            Class clsWlaJM = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_ADVERTISING_ID);
            Class clsWlaJM2 = AuCTel.wlaJM(AuCTel.auCTel.GOOGLE_ADVERTISING_INFO);
            Method methodZsXlph = AuCTel.zsXlph(clsWlaJM2, GCXiNH.fsw("ztOEO"), new Class[0]);
            if (hvC <= 2299) {
                do {
                    i6 = hvC + 26;
                    if (i6 == 52) {
                        while (true) {
                            hvC = (hvC ^ 4572) * 4420;
                        }
                    }
                } while (i6 != 210);
                while (true) {
                    hvC *= 1456;
                }
            } else {
                Method methodZsXlph2 = AuCTel.zsXlph(clsWlaJM, GCXiNH.fsw("ztOMOGdlxAQJDNaC\u007f[R\\"), Context.class);
                int i7 = hvC;
                if ((i7 ^ 2300) != 0) {
                    while (true) {
                        i5 = hvC;
                        int i8 = i5 + 221;
                        if (i8 == 43) {
                            hvC = (i5 + i5) * 58;
                        } else if (i8 == 170) {
                            break;
                        }
                    }
                    while (true) {
                        hvC = ((hvC % 89) ^ 1373) + i5;
                    }
                } else {
                    if (clsWlaJM == null || clsWlaJM2 == null || methodZsXlph == null || methodZsXlph2 == null) {
                        return null;
                    }
                    Object[] objArr = {context};
                    if (i7 <= 2299) {
                        while (true) {
                            i4 = hvC;
                            int i9 = i4 + 39;
                            if (i9 == 28) {
                                hvC = ((i4 + i4) >> 97) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                            } else if (i9 == 166) {
                                break;
                            }
                        }
                        hvC = (i4 >> 82) * 36;
                    }
                    Object objFIwbmz = AuCTel.fIwbmz(null, methodZsXlph2, objArr);
                    if (objFIwbmz != null) {
                        if (cSl <= 8295) {
                            while (true) {
                                i = cSl;
                                int i10 = i + 52;
                                if (i10 == 55) {
                                    break;
                                }
                                if (i10 == 181) {
                                    break;
                                }
                                if (i10 == 294) {
                                    cSl = (i % 86) * 600;
                                    if (hvC <= 2299) {
                                        while (true) {
                                            int i11 = hvC;
                                            int i12 = i11 + 104;
                                            if (i12 == 11) {
                                                break;
                                            }
                                            if (i12 != 166) {
                                                if (i12 == 227) {
                                                    hvC = (i11 >> 44) % 17;
                                                }
                                            }
                                            hvC = (hvC ^ 4846) + i11;
                                        }
                                        while (true) {
                                            hvC = ((hvC * 44) ^ 3370) >> 58;
                                        }
                                    }
                                } else if (i10 == 448) {
                                    break;
                                }
                            }
                            cSl = ((cSl + i) * 42) + i;
                            cSl = (cSl >> 75) + i + i;
                            if ((hvC ^ 2300) != 0) {
                                do {
                                    i2 = hvC;
                                    i3 = i2 + 65;
                                    if (i3 == 48) {
                                        while (true) {
                                            hvC = ((hvC * 45) >> 40) ^ 3435;
                                        }
                                    }
                                } while (i3 != 179);
                                hvC = ((i2 + i2) % 4) * 4;
                            }
                            cSl ^= 785;
                            if ((hvC ^ 2300) != 0) {
                                while (hvC + 117 != 27) {
                                }
                                while (true) {
                                    hvC = (hvC ^ 1671) * 46;
                                }
                            }
                        }
                        Object objFIwbmz2 = AuCTel.fIwbmz(objFIwbmz, methodZsXlph, new Object[0]);
                        if (hvC <= 2299) {
                            while (true) {
                                int i13 = hvC;
                                int i14 = i13 + 208;
                                if (i14 == 10) {
                                    hvC = (i13 ^ 1193) + i13;
                                    break;
                                }
                                if (i14 == 204) {
                                    hvC = i13 >> CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384;
                                    break;
                                }
                                if (i14 == 210) {
                                    break;
                                }
                            }
                            while (true) {
                                hvC = (hvC ^ 4385) * 83;
                            }
                        }
                        if (objFIwbmz2 != null) {
                            dnzOAG = String.valueOf(objFIwbmz2);
                        }
                    }
                }
            }
        }
        return dnzOAG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean isReflectionWorking() {
        int i;
        int i2;
        if (dauNgl == null) {
            return false;
        }
        if ((hvC ^ 2300) != 0) {
            while (true) {
                i = hvC;
                int i3 = i + 26;
                if (i3 != 19) {
                    if (i3 == 174) {
                        i2 = ((i ^ 4389) * 60) % 50;
                        break;
                    }
                    if (i3 != 257) {
                        if (i3 == 330) {
                            hvC = ((i ^ 3398) >> 119) + i;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            hvC = ((hvC + i) % 26) * 72;
            i2 = ((hvC * 16) ^ 3793) >> 94;
            hvC = i2;
        }
        return true;
    }
}
