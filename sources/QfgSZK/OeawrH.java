package QfgSZK;

import QfgSZK.FQMcgE;
import QfgSZK.HJWChP;
import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.ibm.icu.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class OeawrH {
    private static String DlIaRS = null;
    static final boolean IS_BETA_RELEASE = false;
    public static int _Wi = 8274;
    public static int sXz;
    public static String version;
    String DrTEiU;
    String TpLtq;
    final long UgUpud;
    final ZqidTP Umbazn;
    String adICYR;
    private final AtomicLong dMpqQQ;
    long fhjTWk;
    private final long gJfQNs;
    String zCCxYO;
    String zbwZFc;

    /* JADX INFO: renamed from: QfgSZK.OeawrH$OeawrH, reason: collision with other inner class name */
    public static class C0005OeawrH {
        public static int dAz = 5806;
        public static int fIq = 2663;
        final Float FTfFr;
        final double UujxLL;
        final double fXepZn;
        final boolean gXFWUg;
        final boolean hPQPsJ;
        final double ibflGa;
        final Float idBaO;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:17:0x003d) to fix multi-entry loop: BACK_EDGE: B:16:0x0033 -> B:17:0x003d */
        /* JADX DEBUG: Duplicate block (B:69:0x0102) to fix multi-entry loop: BACK_EDGE: B:68:0x00f9 -> B:69:0x0102 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00d9 -> B:71:0x0114). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0139 -> B:85:0x013b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public C0005OeawrH(double r1, double r3, double r5, java.lang.Float r7, java.lang.Float r8, boolean r9, boolean r10) {
            /*
                r0 = this;
                r0.<init>()
                r0.UujxLL = r1
                r0.ibflGa = r3
                r0.idBaO = r7
                int r1 = QfgSZK.OeawrH.C0005OeawrH.dAz
                r1 = r1 ^ 5806(0x16ae, float:8.136E-42)
                if (r1 == 0) goto L172
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                r2 = 87
                r3 = 2662(0xa66, float:3.73E-42)
                if (r1 > r3) goto L4d
            L17:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r4 = r1 + 26
                r5 = 6
                if (r4 == r5) goto L46
                r5 = 133(0x85, float:1.86E-43)
                if (r4 == r5) goto L33
                r5 = 196(0xc4, float:2.75E-43)
                if (r4 == r5) goto L2b
                r5 = 255(0xff, float:3.57E-43)
                if (r4 == r5) goto L3d
                goto L17
            L2b:
                int r4 = r1 + r1
                r4 = r4 ^ 4581(0x11e5, float:6.42E-42)
                int r4 = r4 >> r2
                QfgSZK.OeawrH.C0005OeawrH.fIq = r4
                goto L46
            L33:
                int r2 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r2 = r2 % 121
                int r2 = r2 * 62
                int r2 = r2 >> 76
                QfgSZK.OeawrH.C0005OeawrH.fIq = r2
            L3d:
                int r2 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r2 = r2 + r1
                int r2 = r2 + r1
                int r2 = r2 % 78
                QfgSZK.OeawrH.C0005OeawrH.fIq = r2
                goto L33
            L46:
                int r4 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r4 = r4 * 17
                int r4 = r4 + r1
                QfgSZK.OeawrH.C0005OeawrH.fIq = r4
            L4d:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.dAz
                int r4 = r1 + 13
                r5 = 91
                if (r4 == r5) goto L7f
                r5 = 131(0x83, float:1.84E-43)
                if (r4 == r5) goto Lba
                r5 = 271(0x10f, float:3.8E-43)
                if (r4 == r5) goto L62
                r5 = 285(0x11d, float:4.0E-43)
                if (r4 == r5) goto L114
                goto L4d
            L62:
                int r4 = QfgSZK.OeawrH.C0005OeawrH.fIq
                if (r4 > r3) goto L76
            L66:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r1 + 104
                r2 = 10
                if (r1 == r2) goto L6f
                goto L66
            L6f:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r1 * 1760
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto L6f
            L76:
                int r4 = r1 * 32
                int r4 = r4 + r1
                int r4 = r4 * 38
                QfgSZK.OeawrH.C0005OeawrH.dAz = r4
                goto L114
            L7f:
                int r4 = QfgSZK.OeawrH.C0005OeawrH.dAz
                int r5 = QfgSZK.OeawrH.C0005OeawrH.fIq
                if (r5 > r3) goto L95
            L85:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r2 = r1 + 130
                r3 = 77
                if (r2 == r3) goto L8e
                goto L85
            L8e:
                r1 = r1 ^ 3485(0xd9d, float:4.884E-42)
                int r1 = r1 * 109
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto L85
            L95:
                int r4 = r4 % 113
                int r4 = r4 + r1
                int r4 = r4 >> 70
                QfgSZK.OeawrH.C0005OeawrH.dAz = r4
                if (r5 > r3) goto Lba
            L9e:
                int r4 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r5 = r4 + 52
                r6 = 82
                if (r5 == r6) goto Lb5
                r6 = 186(0xba, float:2.6E-43)
                if (r5 == r6) goto Lab
                goto L9e
            Lab:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r1 % 31
                r1 = r1 ^ 1253(0x4e5, float:1.756E-42)
                int r1 = r1 + r4
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto Lab
            Lb5:
                int r4 = r4 + r4
                r4 = r4 ^ 4859(0x12fb, float:6.809E-42)
                QfgSZK.OeawrH.C0005OeawrH.fIq = r4
            Lba:
                int r4 = QfgSZK.OeawrH.C0005OeawrH.dAz
                int r5 = QfgSZK.OeawrH.C0005OeawrH.fIq
                r5 = r5 ^ 2663(0xa67, float:3.732E-42)
                if (r5 == 0) goto Ld4
            Lc2:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r2 = r1 + 91
                r3 = 93
                if (r2 == r3) goto Lcb
                goto Lc2
            Lcb:
                int r1 = r1 % 22
                int r1 = r1 % 94
                r1 = r1 ^ 2571(0xa0b, float:3.603E-42)
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto Lc2
            Ld4:
                int r4 = r4 * 9000
                int r4 = r4 + r1
                QfgSZK.OeawrH.C0005OeawrH.dAz = r4
                if (r5 == 0) goto L114
            Ldb:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r2 = r1 + 78
                r3 = 74
                if (r2 == r3) goto L10b
                r3 = 97
                if (r2 == r3) goto Lf9
                r3 = 269(0x10d, float:3.77E-43)
                if (r2 == r3) goto Lf0
                r3 = 381(0x17d, float:5.34E-43)
                if (r2 == r3) goto L102
                goto Ldb
            Lf0:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r1 % 71
                int r1 = r1 * 7828
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto Lf0
            Lf9:
                int r2 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r2 = r2 >> 16
                int r2 = r2 % 122
                int r2 = r2 + r1
                QfgSZK.OeawrH.C0005OeawrH.fIq = r2
            L102:
                int r2 = QfgSZK.OeawrH.C0005OeawrH.fIq
                r2 = r2 ^ 4214(0x1076, float:5.905E-42)
                int r2 = r2 * 100
                QfgSZK.OeawrH.C0005OeawrH.fIq = r2
                goto Lf9
            L10b:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r1 % 49
                r1 = r1 ^ 3935(0xf5f, float:5.514E-42)
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto L10b
            L114:
                int r4 = QfgSZK.OeawrH.C0005OeawrH.dAz
                int r5 = QfgSZK.OeawrH.C0005OeawrH.fIq
                r6 = r5 ^ 2663(0xa67, float:3.732E-42)
                if (r6 == 0) goto L14d
            L11c:
                int r6 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r6 + 117
                if (r1 == r2) goto L143
                r3 = 205(0xcd, float:2.87E-43)
                if (r1 == r3) goto L135
                r3 = 334(0x14e, float:4.68E-43)
                if (r1 == r3) goto L12f
                r3 = 476(0x1dc, float:6.67E-43)
                if (r1 == r3) goto L13b
                goto L11c
            L12f:
                int r1 = r6 >> 122
                int r1 = r1 + r6
                int r1 = r1 % 83
                goto L139
            L135:
                r1 = r6 ^ 5059(0x13c3, float:7.089E-42)
                int r1 = r1 >> 118
            L139:
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
            L13b:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                r1 = r1 ^ 2949(0xb85, float:4.132E-42)
                int r1 = r1 + r6
                int r1 = r1 * 59
                goto L139
            L143:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r1 >> 90
                int r1 = r1 + r6
                int r1 = r1 % 116
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto L143
            L14d:
                int r4 = r4 % 29
                r6 = 143(0x8f, float:2.0E-43)
                int r4 = r4 >> r6
                QfgSZK.OeawrH.C0005OeawrH.dAz = r4
                if (r5 > r3) goto L7f
            L156:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r2 = r1 + 39
                r3 = 60
                if (r2 == r3) goto L169
                r3 = 169(0xa9, float:2.37E-43)
                if (r2 == r3) goto L163
                goto L156
            L163:
                int r1 = r1 % 78
                r1 = r1 ^ 4532(0x11b4, float:6.35E-42)
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
            L169:
                int r1 = QfgSZK.OeawrH.C0005OeawrH.fIq
                int r1 = r1 % 61
                int r1 = r1 * 2684
                QfgSZK.OeawrH.C0005OeawrH.fIq = r1
                goto L156
            L172:
                r0.fXepZn = r5
                r0.FTfFr = r8
                r0.hPQPsJ = r9
                r0.gXFWUg = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.OeawrH.C0005OeawrH.<init>(double, double, double, java.lang.Float, java.lang.Float, boolean, boolean):void");
        }
    }

    public static class RnVkix {
        public static int RjO = 7501;
        public static int zIK = 6947;
        final int DcEADc;
        final int awZGGp;
        final int dMZcpz;
        final boolean fUsOZj;
        final int fbTQEA;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:15:0x002a) to fix multi-entry loop: BACK_EDGE: B:15:0x002a -> B:16:0x002c */
        public RnVkix(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6;
            int i7;
            this.fbTQEA = i;
            if (zIK <= 6946) {
                do {
                    i6 = zIK;
                    i7 = i6 + 13;
                    if (i7 != 29) {
                        if (i7 == 128) {
                            zIK = (i6 ^ 4665) % 83;
                        } else if (i7 != 280) {
                        }
                        while (true) {
                            zIK = (zIK % 37) ^ 4956;
                        }
                    } else {
                        while (true) {
                            zIK = ((zIK * 46) % 1) >> 85;
                        }
                    }
                } while (i7 != 315);
                zIK = i6 >> CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
            }
            this.awZGGp = i2;
            if (zIK > 6946) {
                this.DcEADc = i3;
                this.dMZcpz = i4;
                this.fUsOZj = z;
            } else {
                do {
                    i5 = zIK;
                } while (i5 + 26 != 57);
                while (true) {
                    zIK = (zIK % 13) + i5;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        sXz = 7672;
        FQMcgE.usN = 6842;
        GCXiNH.OHr = 2270;
        version = GCXiNH.fsw("%?\u000b!\u0013\t");
        DlIaRS = FQMcgE.hfdhUn(OeawrH.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OeawrH(ZqidTP zqidTP, long j, AtomicLong atomicLong, long j2, DPHsZd dPHsZd) {
        this.UgUpud = j;
        this.dMpqQQ = atomicLong;
        this.Umbazn = zqidTP;
        String strDbUqJD = GPCHlQ.dbUqJD(zqidTP);
        this.zCCxYO = strDbUqJD;
        this.adICYR = GPCHlQ.sILrnl(strDbUqJD);
        String strGeAOna = zqidTP.geAOna();
        strGeAOna = UPbYzn.iSpHlg(strGeAOna) ? GCXiNH.fsw("IcN\u007f_udxiFFFXzll") : strGeAOna;
        this.DrTEiU = GCXiNH.fsw("ueO|\u0011\u001e.") + strGeAOna;
        this.TpLtq = GCXiNH.fsw("ueO|\u0011\u001e.") + strGeAOna + GCXiNH.fsw("2|TnB]d");
        this.zbwZFc = UPbYzn.ikEgkI(UlpNxW.gRtANS(zqidTP));
        this.gJfQNs = j2;
        this.fhjTWk = 0L;
        OFqMGB.uzCIH().zbGDDc(dPHsZd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private List<String> OqHLSf(DCUTEI dcutei) {
        String str = this.Umbazn.Umbazn.getApplicationInfo().nativeLibraryDir;
        String strConcat = str.concat(GCXiNH.fsw("2}Rn").concat(GCXiNH.fsw("I\\c\\Y^gw`ALD\u0007\u0011\u0006\u0017\u001b\r\f\u001eX_Y")).concat(GCXiNH.fsw("3bT")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(strConcat);
        String strOJuSTm = dcutei.OJuSTm(GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs"));
        if (UPbYzn.dTTfOR(strOJuSTm)) {
            String strConcat2 = str.concat(GCXiNH.fsw("2}Rn").concat(strOJuSTm).concat(GCXiNH.fsw("3bT")));
            if (UPbYzn.dTTfOR(strConcat2)) {
                arrayList.add(strConcat2);
            }
        }
        String strOJuSTm2 = dcutei.OJuSTm(GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie"));
        if (UPbYzn.dTTfOR(strOJuSTm2)) {
            String strConcat3 = str.concat(GCXiNH.fsw("2}Rn").concat(strOJuSTm2).concat(GCXiNH.fsw("3bT")));
            if (UPbYzn.dTTfOR(strConcat3)) {
                arrayList.add(strConcat3);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01c9, code lost:
    
        QfgSZK.OeawrH.sXz = (QfgSZK.OeawrH.sXz >> 89) ^ 5356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d5, code lost:
    
        if ((QfgSZK.OeawrH._Wi ^ 8274) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d7, code lost:
    
        r1 = QfgSZK.OeawrH._Wi;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01dc, code lost:
    
        if ((r1 + org.spongycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384) == 6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01df, code lost:
    
        QfgSZK.OeawrH._Wi = ((QfgSZK.OeawrH._Wi % 87) + r1) * 63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DCJXGO RidNCX(DIIpTV dIIpTV, String str, String str2, C0005OeawrH c0005OeawrH, Map<String, String> map, DCUTEI dcutei, boolean z) throws InterruptedException {
        String strGCiISl;
        OFqMGB.uzCIH().ardYFU(this.dMpqQQ.get(), new QSusPL(this.Umbazn, this.zCCxYO, "", DcMfJK.iGmINl, dIIpTV, c0005OeawrH, map, null), true);
        long jDNxZaP = HJWChP.dNQGVJ.dNxZaP();
        Map<String, String> mapZSsVtY = OFqMGB.uzCIH().zSsVtY(this.dMpqQQ.get());
        DCJXGO dcjxgo = new DCJXGO();
        dcjxgo.ffGIBT(255);
        dcjxgo.DarRvM("w", dIIpTV.DFbvW);
        dcjxgo.DarRvM(GCXiNH.fsw("qy"), this.TpLtq, true);
        dcjxgo.DarRvM(GCXiNH.fsw("yc"), this.DrTEiU, true);
        dcjxgo.DarRvM(GCXiNH.fsw("uy"), UPbYzn.DRuYWY(str + str2));
        dcjxgo.DarRvM(GCXiNH.fsw("q`"), this.zbwZFc);
        dcjxgo.DarRvM(GCXiNH.fsw("|\u007fR"), this.zCCxYO);
        if (map != null && !map.isEmpty()) {
            dcjxgo.OqFWZa(map);
        }
        dcjxgo.DarRvM(GCXiNH.fsw("|a_"), String.valueOf(HrMTQN.uzCIH().zlzhuY()));
        dcjxgo.DarRvM(GCXiNH.fsw("|eI"), dkJJWw(dcutei.QSLkRj(), OqHLSf(dcutei), mapZSsVtY), (Integer) 2048);
        if (dIIpTV.UzSCpO > 0 && (strGCiISl = Ohcwxs.gCiISl(HrMTQN.uzCIH().hPlhRW())) != null) {
            dcjxgo.DarRvM(GCXiNH.fsw("paO"), strGCiISl);
        }
        if (z && (this.dMpqQQ.get() & 9007199254740992L) != 0) {
            dcjxgo.DarRvM(GCXiNH.fsw("obK"), new DzkRMH().QKDJJA(this.Umbazn.Umbazn, str, dIIpTV.UsdiHV), (Integer) (-1));
        }
        DCJXGO dcjxgo2 = new DCJXGO();
        dcjxgo2.DarRvM(GCXiNH.fsw("rc\\SBU"), str);
        dcjxgo2.DarRvM(GCXiNH.fsw("ntH\u007fB^oAeL"), str2);
        dcjxgo2.DarRvM(GCXiNH.fsw("s~UoN"), dIIpTV.sfBaYs);
        dcjxgo2.DarRvM("h", "0");
        dcjxgo2.DarRvM(DateFormat.MINUTE, "2");
        loop0: for (Map.Entry<String, String> entry : mapZSsVtY.entrySet()) {
            if (!entry.getKey().startsWith(GCXiNH.fsw("BN"))) {
                if (entry.getKey().startsWith(GCXiNH.fsw("nx_S"))) {
                    dcjxgo2.DarRvM(entry.getKey(), entry.getValue());
                } else {
                    dcjxgo.DarRvM(entry.getKey(), entry.getValue(), (Integer) (-1));
                }
                if ((sXz ^ 7672) != 0) {
                    while (true) {
                        int i = sXz;
                        int i2 = i + 78;
                        if (i2 == 17) {
                            sXz = ((i + i) ^ 1474) % 102;
                            break;
                        }
                        if (i2 == 150) {
                            break loop0;
                        }
                        if (i2 == 212) {
                            sXz = ((i % 22) * 118) % 54;
                            break loop0;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        Map<String, String> mapDLWbHP = dcutei.DLWbHP(this.dMpqQQ.get());
        if (mapDLWbHP != null) {
            AhwBna ahwBna = AhwBna.APP_HASHES;
            if (mapDLWbHP.containsKey(ahwBna.DbNXlk())) {
                dcjxgo2.DarRvM(ahwBna.DbNXlk(), mapDLWbHP.get(ahwBna.DbNXlk()));
            }
        }
        Ohcwxs.uzCIH().DarRvM(GCXiNH.fsw("mfC"), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP));
        if (ORrpqH.uzCIH().gZKUVK() > 0) {
            dcjxgo.DarRvM(AhwBna.REGISTERED_EXCEPTION.DbNXlk(), ORrpqH.uzCIH().uLLnq());
            ORrpqH.uzCIH().dGrqPl();
        }
        long jDNxZaP2 = HJWChP.dNQGVJ.dNxZaP();
        String strOuxcSI = dcjxgo.OuxcSI();
        Ohcwxs.uzCIH().DarRvM(GCXiNH.fsw("ht"), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP2));
        long jDNxZaP3 = HJWChP.dNQGVJ.dNxZaP();
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("x\u007fXcOTe>fI\u0002\u001e\n") + dcjxgo);
        dcjxgo2.DarRvM(GCXiNH.fsw("wp"), UPbYzn.dxcTrN(strOuxcSI, str2));
        Ohcwxs.uzCIH().DarRvM(GCXiNH.fsw("mi_"), Long.valueOf(HJWChP.dNQGVJ.dNxZaP() - jDNxZaP3));
        return dcjxgo2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:79:0x0266) to fix multi-entry loop: BACK_EDGE: B:79:0x0266 -> B:68:0x023d */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x023d, code lost:
    
        QfgSZK.OeawrH._Wi >>= 109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023a, code lost:
    
        if (QfgSZK.OeawrH._Wi <= 8273) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x023d, code lost:
    
        r1 = QfgSZK.OeawrH.sXz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0243, code lost:
    
        if ((r1 + org.spongycastle.crypto.tls.CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256) == 46) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0246, code lost:
    
        QfgSZK.OeawrH.sXz = ((r1 + r1) * 22) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0251, code lost:
    
        if ((QfgSZK.OeawrH._Wi ^ 8274) == 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0253, code lost:
    
        r1 = QfgSZK.OeawrH._Wi;
        r2 = r1 + org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0259, code lost:
    
        if (r2 == 53) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x025d, code lost:
    
        if (r2 == 222) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0260, code lost:
    
        QfgSZK.OeawrH._Wi = (r1 >> okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT) * 45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0266, code lost:
    
        QfgSZK.OeawrH._Wi >>= 109;
     */
    /* JADX WARN: Path cross not found for [B:166:?, B:163:?], limit reached: 196 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String dkJJWw(Set<String> set, List<String> list, Map<String, String> map) {
        String str;
        String string;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String strDjSkpj;
        int i6;
        int i7;
        String strAHXSQp = DGUQLI.aHXSQp(this.Umbazn);
        HrMTQN hrMTQNUzCIH = HrMTQN.uzCIH();
        String str2 = "";
        if (map == null || (str = map.get(GCXiNH.fsw("BNT~BTojm\\KLD"))) == null) {
            str = "";
        }
        String str3 = GCXiNH.fsw("f3X|D\u0013;") + this.UgUpud + GCXiNH.fsw("13_uD\u0013;") + this.dMpqQQ.longValue() + GCXiNH.fsw("13K\u007fB\u0013;") + hrMTQNUzCIH.QOeQqh() + GCXiNH.fsw("13K~B\u0013;") + this.fhjTWk + GCXiNH.fsw("13X|B\u0013;") + hrMTQNUzCIH.zlzhuY() + GCXiNH.fsw("13T~B\u0013;") + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR;
        if (hrMTQNUzCIH.QOeQqh() > 1) {
            str3 = str3 + GCXiNH.fsw("13W\u007fB\u0013;<") + hrMTQNUzCIH.DPVBvL() + GCXiNH.fsw("?=\u0019`[B#$.") + hrMTQNUzCIH.OKSWiw() + GCXiNH.fsw("?=\u0019`[X#$") + hrMTQNUzCIH.DAgZj();
        }
        if ((this.dMpqQQ.get() & 1073741824) != 0) {
            String strFXHmeK = DGUQLI.fXHmeK(this.Umbazn);
            String strTIwhY = DGUQLI.tIwhY();
            if (list != null) {
                strDjSkpj = "";
                for (String str4 : list) {
                    if (!Boolean.parseBoolean(strDjSkpj)) {
                        strDjSkpj = AxsJAY.uzCIH().djSkpj(str4);
                    }
                    if (_Wi <= 8273) {
                        do {
                            i6 = _Wi;
                            i7 = i6 + 78;
                            if (i7 != 91) {
                                if (i7 == 237) {
                                    _Wi = (i6 >> 104) + i6;
                                } else if (i7 != 303) {
                                }
                                _Wi = (_Wi >> 219) + i6;
                            } else {
                                while (true) {
                                    _Wi = (_Wi ^ 4989) % 80;
                                }
                            }
                        } while (i7 != 385);
                        while (true) {
                            _Wi = (_Wi * 21) + i6;
                        }
                    }
                }
            } else {
                strDjSkpj = "";
            }
            if (UPbYzn.dTTfOR(strFXHmeK)) {
                str3 = str3 + GCXiNH.fsw("13_nL\u0013;") + strFXHmeK;
            }
            if (UPbYzn.dTTfOR(strTIwhY)) {
                str3 = str3 + GCXiNH.fsw("13Qh\\A#$") + strTIwhY;
            }
            if (UPbYzn.dTTfOR(strDjSkpj)) {
                str3 = str3 + GCXiNH.fsw("13_fEX#$") + strDjSkpj;
            }
        }
        if (UPbYzn.dTTfOR(strAHXSQp)) {
            str3 = str3 + GCXiNH.fsw("13ZhI\u0013;") + strAHXSQp;
        }
        DwQSDd.OqFWZa(set);
        String strQSLkRj = DwQSDd.QSLkRj();
        if (UPbYzn.dTTfOR(strQSLkRj)) {
            str3 = str3 + GCXiNH.fsw("13_|NC#$") + strQSLkRj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(GCXiNH.fsw("13VeM\u0013;<"));
        long j = this.gJfQNs;
        if (j > 0) {
            string = Long.toString(j);
            if ((_Wi ^ 8274) != 0) {
                while (true) {
                    int i8 = _Wi;
                    if (i8 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 == 65) {
                        _Wi = (i8 >> CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA) ^ 3531;
                    }
                }
            }
        } else {
            string = "";
        }
        sb.append(string);
        sb.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        String string2 = sb.toString();
        if (map != null) {
            str2 = map.get(AhwBna.CRASH_LOG_STRING.DbNXlk());
            if (sXz <= 7671) {
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        sb2.append(GCXiNH.fsw("13X~X\u0013;<"));
        sb2.append(UPbYzn.dTTfOR(str2) ? "1" : "0");
        sb2.append(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
        String string3 = sb2.toString();
        Map<String, String> mapZblBkD = DcMfJK.iGmINl.zblBkD();
        StringBuilder sb3 = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : mapZblBkD.entrySet()) {
            if (z) {
                if ((sXz ^ 7672) != 0) {
                    do {
                        i3 = sXz;
                        i4 = i3 + 247;
                        if (i4 == 64) {
                            sXz = (i3 >> 53) + i3;
                        } else if (i4 != 130) {
                        }
                        do {
                            sXz = (sXz * 52) ^ 4653;
                        } while ((_Wi ^ 8274) == 0);
                        while (true) {
                            int i9 = _Wi;
                            int i10 = i9 + 325;
                            if (i10 != 7) {
                                if (i10 == 95) {
                                    break;
                                }
                            } else {
                                _Wi = i9 >> 216;
                            }
                        }
                        while (true) {
                            _Wi = (_Wi >> 11) % 10;
                        }
                    } while (i4 != 274);
                    sXz = ((i3 + i3) ^ 3536) % 38;
                    if (_Wi <= 8273) {
                        do {
                            i5 = _Wi + 260;
                            if (i5 == 8) {
                                while (true) {
                                    _Wi = (_Wi >> 63) ^ 4662;
                                }
                            }
                        } while (i5 != 185);
                        while (true) {
                            _Wi ^= 4539;
                        }
                    }
                }
                z = false;
            } else {
                sb3.append(",");
            }
            sb3.append(entry.getKey());
            sb3.append(":");
            sb3.append(entry.getValue());
            if ((sXz ^ 7672) != 0) {
                do {
                    i = sXz;
                    i2 = i + 260;
                    if (i2 == 84) {
                        while (true) {
                            sXz = ((sXz >> 106) % 23) + i;
                            if ((_Wi ^ 8274) != 0) {
                                while (true) {
                                    int i11 = _Wi;
                                    int i12 = i11 + 351;
                                    if (i12 == 43) {
                                        break;
                                    }
                                    if (i12 == 89) {
                                        break;
                                    }
                                    if (i12 == 194) {
                                        _Wi = i11 + i11 + i11;
                                        break;
                                    }
                                    if (i12 == 300) {
                                        break;
                                    }
                                }
                                _Wi = (_Wi ^ 1250) >> 77;
                                _Wi = (_Wi % 12) ^ 4362;
                            }
                        }
                        while (true) {
                            _Wi = (_Wi % 103) >> 8;
                        }
                    }
                } while (i2 != 211);
                while (true) {
                    sXz = ((sXz + i) ^ 3245) >> 14;
                }
            }
        }
        return (string3 + GCXiNH.fsw("13VcO\u0013;<") + ((Object) sb3) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR) + "}";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fmdvVn(String str, OmYuqg omYuqg) throws InterruptedException {
        long jQSAYLr = HJWChP.dNQGVJ.QSAYLr();
        OFqMGB.uzCIH().ardYFU(this.dMpqQQ.get(), new QSusPL(this.Umbazn, this.zCCxYO, str, DcMfJK.iGmINl, null, null, null, omYuqg), false);
        this.fhjTWk = HJWChP.dNQGVJ.QSAYLr() - jQSAYLr;
    }
}
