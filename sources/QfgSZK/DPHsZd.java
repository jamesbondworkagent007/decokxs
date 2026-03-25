package QfgSZK;

import QfgSZK.HJWChP;
import android.content.SharedPreferences;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DPHsZd {
    static String DEeZsp = null;
    static String DQZnqk = null;
    private static final int DSUDrg = 0;
    static String DSWBpf = null;
    private static String DlIaRS = null;
    public static int Jxv = 6933;
    static String OClAXb = null;
    private static final int SqjlM = 6;
    static String UYMPrY = null;
    private static final int UiEhHd = 2;
    private static final int ajelcP = 5;
    private static final int akRzNP = 1;
    static String dFiEKX = null;
    public static int dTU = 0;
    private static final int dZRLBb = 7;
    static String dtjOGa = null;
    private static final int fFiniC = 4;
    private static final int fPiRmf = 9;
    private static final int gShasH = 3;
    static String hFxPzX = null;
    static String hGhXlD = null;
    private static final int sFYmcg = 1;
    static String sZzPFz = null;
    private static final int sllEhF = 8;
    static String zVOlMq;
    static String zZgxXf;
    static String znWJzv;
    private int EESEk;
    private volatile String OuEEPx;
    private String RSKqwx;
    private String aYGmbG;
    private String dnzOAG;
    private final ZqidTP fFJGOW;
    private boolean zLAIeZ;
    private String zOaCsY;
    private String zSULAs;
    private volatile String zSVOUs;
    private long fqVTOY = 0;
    private long UnJFsM = 0;
    private String irBrEI = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        int i2;
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        GCXiNH.OHr = 2270;
        dTU = 1826;
        dtjOGa = GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy");
        String strFsw = GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy");
        if (Jxv <= 6932) {
            do {
                i = Jxv;
                i2 = i + 39;
                if (i2 == 54) {
                    Jxv = ((i * 67) >> 10) + i;
                }
            } while (i2 != 89);
            while (true) {
                Jxv = (Jxv >> 63) + i;
            }
        }
        DSWBpf = strFsw;
        hFxPzX = GCXiNH.fsw("NY~BjbDAH");
        DQZnqk = GCXiNH.fsw("NY~BjbDAD");
        DEeZsp = GCXiNH.fsw("NY~BjbDA_");
        zZgxXf = GCXiNH.fsw("NY~BjbDAM");
        hGhXlD = GCXiNH.fsw("x\u007fZnGTNnxAMMY");
        if ((Jxv ^ 6933) != 0) {
            while (true) {
                int i3 = Jxv;
                int i4 = i3 + 13;
                if (i4 == 58) {
                    while (true) {
                        Jxv = ((Jxv + i3) % 85) % 52;
                    }
                } else if (i4 == 88) {
                    Jxv = (i3 ^ 3152) >> 108;
                    break;
                } else if (i4 == 201) {
                    Jxv = (i3 % 87) + i3;
                }
            }
        }
        znWJzv = GCXiNH.fsw("yxHmI]dQ|\\KLDZ");
        dFiEKX = GCXiNH.fsw("ldRi_adleGF");
        OClAXb = GCXiNH.fsw("nuPZNCrwcF");
        sZzPFz = GCXiNH.fsw("I\\cSftSYIl}so{nx}pm");
        UYMPrY = GCXiNH.fsw("=cW");
        zVOlMq = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        DlIaRS = FQMcgE.hfdhUn(DPHsZd.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:47:0x00c8) to fix multi-entry loop: BACK_EDGE: B:46:0x00c0 -> B:47:0x00c8 */
    public DPHsZd(ZqidTP zqidTP, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        this.zSVOUs = null;
        if (Jxv > 6932) {
            this.EESEk = 0;
            this.dnzOAG = null;
            this.zSULAs = null;
            if ((dTU ^ 1826) != 0) {
                while (true) {
                    int i5 = dTU;
                    int i6 = i5 + 39;
                    if (i6 == 17) {
                        dTU = ((i5 % 71) >> 13) ^ 2474;
                        if (Jxv <= 6932) {
                            do {
                                int i7 = Jxv;
                                i = i7 + 78;
                                if (i == 18) {
                                    while (true) {
                                        Jxv = ((Jxv * 11) % 92) + i7;
                                    }
                                }
                            } while (i != 92);
                            while (true) {
                                Jxv *= 6789;
                            }
                        }
                    } else if (i6 == 177) {
                        break;
                    }
                }
                dTU = (dTU % 23) ^ 3491;
                if ((Jxv ^ 6933) != 0) {
                    do {
                        i2 = Jxv;
                        i3 = i2 + 13;
                        if (i3 != 48) {
                            if (i3 == 230) {
                                while (true) {
                                    Jxv ^= 2149;
                                }
                            } else if (i3 == 239) {
                                Jxv = Jxv + i2 + i2;
                            }
                        }
                        while (true) {
                            Jxv = (Jxv % 27) * 3;
                            Jxv = Jxv + i2 + i2;
                        }
                    } while (i3 != 331);
                    while (true) {
                        Jxv = (Jxv + i2 + i2) * 95;
                    }
                }
            }
            this.zOaCsY = null;
            this.RSKqwx = null;
            this.aYGmbG = null;
            this.zLAIeZ = false;
            this.fFJGOW = zqidTP;
            this.OuEEPx = str;
            if (zqidTP == null || UPbYzn.iSpHlg(this.OuEEPx)) {
                return;
            }
            this.zSVOUs = zqidTP.geAOna() + GCXiNH.fsw("IUv") + str;
            return;
        }
        while (true) {
            int i8 = Jxv;
            int i9 = i8 + 91;
            if (i9 == 33) {
                Jxv = ((i8 >> 35) * 104) + i8;
            } else if (i9 != 125) {
                if (i9 == 130) {
                    i4 = ((i8 ^ 3361) * 114) % 120;
                    Jxv = i4;
                } else if (i9 == 314) {
                    i4 = (Jxv >> 99) * 208;
                    Jxv = i4;
                }
            }
            Jxv = ((Jxv % 45) ^ 2777) * 51;
            i4 = (Jxv >> 99) * 208;
            Jxv = i4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DPHNDa(String str) {
        if (UPbYzn.iSpHlg(str)) {
            return 0;
        }
        if (Jxv > 6932) {
            if (dTU <= 1825) {
                while (true) {
                    int i = dTU;
                    int i2 = i + 39;
                    if (i2 == 60) {
                        while (true) {
                            dTU = ((dTU * 94) >> 2) ^ 4575;
                        }
                    } else {
                        if (i2 == 249) {
                            dTU = ((i % 80) * 54) % 66;
                            break;
                        }
                        if (i2 == 385) {
                            dTU = (i ^ 2458) + i;
                            break;
                        }
                    }
                }
            }
            if (str.equals(GCXiNH.fsw("ldRi_adleGF"))) {
                return this.EESEk;
            }
            return 0;
        }
        while (true) {
            int i3 = Jxv;
            if (i3 + 104 == 83) {
                Jxv = (i3 % 36) % 30;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DPhTBN() {
        boolean zGeLlBI;
        synchronized (this) {
            zGeLlBI = geLlBI();
        }
        return zGeLlBI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:46:0x00a5) to fix multi-entry loop: BACK_EDGE: B:46:0x00a5 -> B:47:0x00a7 */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException
     */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:186)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public java.lang.String DrNnAm(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = QfgSZK.UPbYzn.iSpHlg(r11)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r11.hashCode()
            r2 = 3
            r3 = 4
            r4 = 2
            r5 = 1
            r6 = 27
            r7 = 6932(0x1b14, float:9.714E-42)
            r8 = 5
            switch(r0) {
                case -1962630338: goto L14c;
                case -89133479: goto L106;
                case 342316631: goto Lb2;
                case 342316634: goto L72;
                case 342316638: goto L5b;
                case 342316649: goto L1a;
                default: goto L18;
            }
        L18:
            goto L15a
        L1a:
            java.lang.String r0 = "NY~BjbDA_"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r11 = r11.equals(r0)
            int r0 = QfgSZK.DPHsZd.Jxv
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L50
        L2a:
            int r0 = QfgSZK.DPHsZd.Jxv
            int r6 = r0 + 143
            r9 = 73
            if (r6 == r9) goto L49
            r9 = 120(0x78, float:1.68E-43)
            if (r6 == r9) goto L40
            r9 = 314(0x13a, float:4.4E-43)
            if (r6 == r9) goto L3b
            goto L2a
        L3b:
            int r6 = r0 >> 39
            int r6 = r6 + r0
            QfgSZK.DPHsZd.Jxv = r6
        L40:
            int r0 = QfgSZK.DPHsZd.Jxv
            int r0 = r0 * 90
            r0 = r0 ^ 5196(0x144c, float:7.281E-42)
            QfgSZK.DPHsZd.Jxv = r0
            goto L50
        L49:
            int r0 = r0 * 12996
            int r0 = r0 >> 113
            QfgSZK.DPHsZd.Jxv = r0
            goto L2a
        L50:
            if (r11 == 0) goto L15a
            int r11 = QfgSZK.DPHsZd.Jxv
            if (r11 > r7) goto L58
            goto L118
        L58:
            r11 = r2
            goto L15b
        L5b:
            java.lang.String r0 = "NY~BjbDAD"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L15a
            int r11 = QfgSZK.DPHsZd.Jxv
            r11 = r11 ^ 6933(0x1b15, float:9.715E-42)
            if (r11 == 0) goto L6f
            goto L118
        L6f:
            r11 = r4
            goto L15b
        L72:
            java.lang.String r0 = "NY~BjbDAH"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L15a
            int r11 = QfgSZK.DPHsZd.dTU
            r11 = r11 ^ 1826(0x722, float:2.559E-42)
            if (r11 == 0) goto Laf
        L84:
            int r11 = QfgSZK.DPHsZd.dTU
            int r0 = r11 + 26
            if (r0 == r6) goto L8b
            goto L84
        L8b:
            r0 = 170(0xaa, float:2.38E-43)
            int r11 = r11 >> r0
            QfgSZK.DPHsZd.dTU = r11
            int r11 = QfgSZK.DPHsZd.Jxv
            r11 = r11 ^ 6933(0x1b15, float:9.715E-42)
            if (r11 == 0) goto L84
        L96:
            int r11 = QfgSZK.DPHsZd.Jxv
            int r0 = r11 + 273
            r1 = 11
            if (r0 == r1) goto La3
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 == r1) goto La7
            goto L96
        La3:
            r0 = r11 ^ 743(0x2e7, float:1.041E-42)
        La5:
            QfgSZK.DPHsZd.Jxv = r0
        La7:
            int r0 = QfgSZK.DPHsZd.Jxv
            int r0 = r0 % 30
            int r0 = r0 + r11
            int r0 = r0 >> 9
            goto La5
        Laf:
            r11 = r5
            goto L15b
        Lb2:
            java.lang.String r0 = "NY~BjbDAM"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r11 = r11.equals(r0)
            int r0 = QfgSZK.DPHsZd.dTU
            r9 = 1825(0x721, float:2.557E-42)
            if (r0 > r9) goto Lfd
        Lc2:
            int r11 = QfgSZK.DPHsZd.dTU
            int r0 = r11 + 221
            r1 = 7
            if (r0 == r1) goto Ld6
            r1 = 82
            if (r0 == r1) goto Lce
            goto Lc2
        Lce:
            int r0 = r11 * 72
            r0 = r0 ^ 1283(0x503, float:1.798E-42)
            int r0 = r0 + r11
            QfgSZK.DPHsZd.dTU = r0
            goto Lc2
        Ld6:
            int r11 = QfgSZK.DPHsZd.dTU
            int r11 = r11 * 122
            int r11 = r11 >> 117
            QfgSZK.DPHsZd.dTU = r11
            int r11 = QfgSZK.DPHsZd.Jxv
            if (r11 > r7) goto Ld6
        Le2:
            int r11 = QfgSZK.DPHsZd.Jxv
            int r0 = r11 + 299
            r1 = 96
            if (r0 == r1) goto Lf5
            r1 = 143(0x8f, float:2.0E-43)
            if (r0 == r1) goto Lef
            goto Le2
        Lef:
            int r0 = r11 * 44
            int r0 = r0 + r11
            int r0 = r0 % r6
            QfgSZK.DPHsZd.Jxv = r0
        Lf5:
            int r11 = QfgSZK.DPHsZd.Jxv
            r0 = 291(0x123, float:4.08E-43)
            int r11 = r11 >> r0
            QfgSZK.DPHsZd.Jxv = r11
            goto Lf5
        Lfd:
            if (r11 == 0) goto L15a
            int r11 = QfgSZK.DPHsZd.Jxv
            if (r11 > r7) goto L104
            goto L118
        L104:
            r11 = r3
            goto L15b
        L106:
            java.lang.String r0 = "IyIiJEL{xZK[gFJNZPgwy"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L15a
            int r11 = QfgSZK.DPHsZd.Jxv
            r11 = r11 ^ 6933(0x1b15, float:9.715E-42)
            if (r11 == 0) goto L14a
        L118:
            int r11 = QfgSZK.DPHsZd.Jxv
            int r0 = r11 + 26
            if (r0 == r8) goto L141
            r1 = 174(0xae, float:2.44E-43)
            if (r0 == r1) goto L13a
            r1 = 310(0x136, float:4.34E-43)
            if (r0 == r1) goto L131
            r1 = 328(0x148, float:4.6E-43)
            if (r0 == r1) goto L12b
            goto L118
        L12b:
            int r11 = r11 % 52
            int r11 = r11 >> 66
            QfgSZK.DPHsZd.Jxv = r11
        L131:
            int r11 = QfgSZK.DPHsZd.Jxv
            r11 = r11 ^ 4249(0x1099, float:5.954E-42)
            int r11 = r11 >> 92
            QfgSZK.DPHsZd.Jxv = r11
            goto L118
        L13a:
            int r11 = QfgSZK.DPHsZd.Jxv
            int r11 = r11 >> 14
            QfgSZK.DPHsZd.Jxv = r11
            goto L13a
        L141:
            int r0 = QfgSZK.DPHsZd.Jxv
            r0 = r0 ^ 2054(0x806, float:2.878E-42)
            int r0 = r0 + r11
            int r0 = r0 + r11
            QfgSZK.DPHsZd.Jxv = r0
            goto L141
        L14a:
            r11 = 0
            goto L15b
        L14c:
            java.lang.String r0 = "nuPZNCrwcF"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L15a
            r11 = r8
            goto L15b
        L15a:
            r11 = -1
        L15b:
            if (r11 == 0) goto L177
            if (r11 == r5) goto L174
            if (r11 == r4) goto L171
            if (r11 == r2) goto L16e
            if (r11 == r3) goto L16b
            if (r11 == r8) goto L168
            return r1
        L168:
            java.lang.String r11 = r10.irBrEI
            return r11
        L16b:
            java.lang.String r11 = r10.dnzOAG
            return r11
        L16e:
            java.lang.String r11 = r10.RSKqwx
            return r11
        L171:
            java.lang.String r11 = r10.zOaCsY
            return r11
        L174:
            java.lang.String r11 = r10.zSULAs
            return r11
        L177:
            java.lang.String r11 = r10.aYGmbG
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DPHsZd.DrNnAm(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean RAQtXZ() {
        String str;
        synchronized (this) {
            if (HJWChP.HhYHK.gGvvIC() && this.fFJGOW != null && !UPbYzn.iSpHlg(this.zSVOUs) && !UPbYzn.iSpHlg(this.OuEEPx)) {
                SharedPreferences sharedPreferences = this.fFJGOW.Umbazn.getSharedPreferences(this.zSVOUs, 0);
                if (!HJWChP.HhYHK.gFTCsA(sharedPreferences, GCXiNH.fsw("I\\cSftSYIl}so{nx}pm"))) {
                    return false;
                }
                try {
                    String strSZqaRl = HJWChP.HhYHK.sZqaRl(sharedPreferences, GCXiNH.fsw("I\\cSftSYIl}so{nx}pm"), "");
                    if (UPbYzn.iSpHlg(strSZqaRl)) {
                        return false;
                    }
                    String strDsfknC = IKQXqd.DsfknC(strSZqaRl, this.OuEEPx, GCXiNH.fsw("\\Th#heS1\\cap\u001fyICR\\ZT"));
                    if (UPbYzn.iSpHlg(strDsfknC)) {
                        return false;
                    }
                    String[] strArrSplit = strDsfknC.split(GCXiNH.fsw("Am"), -1);
                    if (strArrSplit.length != 9) {
                        strArrSplit = strDsfknC.split(":", -1);
                        if (strArrSplit.length != 9 && strArrSplit.length != 10) {
                            return false;
                        }
                    }
                    String str2 = strArrSplit[3];
                    this.irBrEI = str2;
                    if (UPbYzn.iSpHlg(str2)) {
                        return false;
                    }
                    this.fqVTOY = Long.parseLong(strArrSplit[0]);
                    this.UnJFsM = Long.parseLong(strArrSplit[1]);
                    this.EESEk = Integer.parseInt(strArrSplit[2]);
                    if (strArrSplit.length == 10 && strArrSplit[4].equalsIgnoreCase(GCXiNH.fsw("=cW"))) {
                        this.irBrEI += GCXiNH.fsw("'1I`");
                        this.dnzOAG = strArrSplit[5];
                        this.zSULAs = strArrSplit[6];
                        this.zOaCsY = strArrSplit[7];
                        this.RSKqwx = strArrSplit[8];
                        str = strArrSplit[9];
                    } else {
                        this.dnzOAG = strArrSplit[4];
                        this.zSULAs = strArrSplit[5];
                        this.zOaCsY = strArrSplit[6];
                        this.RSKqwx = strArrSplit[7];
                        str = strArrSplit[8];
                    }
                    this.aYGmbG = str;
                    return true;
                } catch (ClassCastException | NumberFormatException e) {
                    FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("otZh\u000bTslcZ\u0002\u000e\nJGIB\\ZFW"), e.toString());
                    ORrpqH.uzCIH().seuMaA(e);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean RvdRAu() {
        ZqidTP zqidTP;
        boolean z;
        synchronized (this) {
            if (HJWChP.HhYHK.gGvvIC() && (zqidTP = this.fFJGOW) != null && zqidTP.Umbazn != null && !UPbYzn.iSpHlg(this.zSVOUs)) {
                SharedPreferences sharedPreferences = this.fFJGOW.Umbazn.getSharedPreferences(GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy"), 0);
                boolean z2 = true;
                if (HJWChP.HhYHK.gFTCsA(sharedPreferences, GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy"))) {
                    try {
                        this.aYGmbG = HJWChP.HhYHK.sZqaRl(sharedPreferences, GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy"), "");
                    } catch (ClassCastException e) {
                        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[~NbO\u0011qliNGQOGKB\u0016ZR\u0013VXVI[OYUN\u0019LNV`"), e.toString());
                        ORrpqH.uzCIH().seuMaA(e);
                    }
                    this.zLAIeZ = true;
                    SharedPreferences.Editor editorOxbLUn = HJWChP.HhYHK.OxbLUn(sharedPreferences);
                    if (editorOxbLUn != null) {
                        editorOxbLUn.remove(GCXiNH.fsw("IyIiJEL{xZK[gFJNZPgwy"));
                        editorOxbLUn.apply();
                    }
                    z = true;
                } else {
                    z = false;
                }
                SharedPreferences sharedPreferences2 = this.fFJGOW.Umbazn.getSharedPreferences(this.zSVOUs, 0);
                try {
                    if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("x\u007fZnGTNnxAMMY"))) {
                        this.fqVTOY = HJWChP.HhYHK.dSJNDS(sharedPreferences2, GCXiNH.fsw("x\u007fZnGTNnxAMMY"), 0L);
                        z = true;
                    }
                    if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("yxHmI]dQ|\\KLDZ"))) {
                        this.UnJFsM = HJWChP.HhYHK.dSJNDS(sharedPreferences2, GCXiNH.fsw("yxHmI]dQ|\\KLDZ"), 0L);
                        z = true;
                    }
                    if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("nuPZNCrwcF"))) {
                        this.irBrEI = HJWChP.HhYHK.sZqaRl(sharedPreferences2, GCXiNH.fsw("nuPZNCrwcF"), "");
                        z = true;
                    }
                    if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("ldRi_adleGF"))) {
                        this.EESEk = HJWChP.HhYHK.Qsauvs(sharedPreferences2, GCXiNH.fsw("ldRi_adleGF"), 0);
                        z = true;
                    }
                    if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("NY~BjbDAM"))) {
                        this.dnzOAG = HJWChP.HhYHK.sZqaRl(sharedPreferences2, GCXiNH.fsw("NY~BjbDAM"), "");
                        z = true;
                    }
                    if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("NY~BjbDAH"))) {
                        this.zSULAs = HJWChP.HhYHK.sZqaRl(sharedPreferences2, GCXiNH.fsw("NY~BjbDAH"), "");
                        z = true;
                    }
                    if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("NY~BjbDAD"))) {
                        this.zOaCsY = HJWChP.HhYHK.sZqaRl(sharedPreferences2, GCXiNH.fsw("NY~BjbDAD"), "");
                        z = true;
                    }
                } catch (ClassCastException e2) {
                    FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[~NbO\u0011qliNGQOGKB\u0016ZR\u0013VXVI[OYUN\u0019LNV`"), e2.toString());
                    ORrpqH.uzCIH().seuMaA(e2);
                }
                if (HJWChP.HhYHK.gFTCsA(sharedPreferences2, GCXiNH.fsw("NY~BjbDA_"))) {
                    this.RSKqwx = HJWChP.HhYHK.sZqaRl(sharedPreferences2, GCXiNH.fsw("NY~BjbDA_"), "");
                } else {
                    z2 = z;
                }
                SharedPreferences.Editor editorOxbLUn2 = HJWChP.HhYHK.OxbLUn(sharedPreferences2);
                if (editorOxbLUn2 != null) {
                    editorOxbLUn2.remove(GCXiNH.fsw("x\u007fZnGTNnxAMMY"));
                    editorOxbLUn2.remove(GCXiNH.fsw("yxHmI]dQ|\\KLDZ"));
                    editorOxbLUn2.remove(GCXiNH.fsw("nuPZNCrwcF"));
                    editorOxbLUn2.remove(GCXiNH.fsw("ldRi_adleGF"));
                    editorOxbLUn2.remove(GCXiNH.fsw("NY~BjbDAM"));
                    editorOxbLUn2.remove(GCXiNH.fsw("NY~BjbDA_"));
                    editorOxbLUn2.remove(GCXiNH.fsw("NY~BjbDAD"));
                    editorOxbLUn2.remove(GCXiNH.fsw("NY~BjbDAH"));
                    editorOxbLUn2.apply();
                }
                return z2;
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long Swccd(String str) {
        byte b;
        if (UPbYzn.iSpHlg(str)) {
            return 0L;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -130003045) {
            b = (iHashCode == 325543574 && str.equals(GCXiNH.fsw("yxHmI]dQ|\\KLDZ"))) ? (byte) 1 : (byte) -1;
        } else if (str.equals(GCXiNH.fsw("x\u007fZnGTNnxAMMY"))) {
            b = 0;
        }
        if (b == 0) {
            return this.fqVTOY;
        }
        if (b != 1) {
            return 0L;
        }
        return this.UnJFsM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void fkESqH() {
        int i;
        synchronized (this) {
            if (!HJWChP.HhYHK.gGvvIC()) {
                FQMcgE.DztXDE(DlIaRS, GCXiNH.fsw("T\u007fMmGXe>\u007f\\CWO\u0005\bAW\\XVV\u0011D@\u001e\\_X_JK\u0017Vwae"));
                return;
            }
            if (this.fFJGOW != null && !UPbYzn.iSpHlg(this.zSVOUs)) {
                if (RAQtXZ()) {
                    return;
                }
                if (RvdRAu()) {
                    String str = DlIaRS;
                    if ((Jxv ^ 6933) != 0) {
                        while (true) {
                            i = Jxv;
                            int i2 = i + 78;
                            if (i2 != 23) {
                                if (i2 == 39) {
                                    Jxv = (i ^ 2715) + i;
                                    break;
                                } else if (i2 == 94) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        Jxv = (Jxv % 18) >> 107;
                        while (true) {
                            Jxv = ((Jxv >> 66) + i) * 16;
                        }
                    } else {
                        FQMcgE.OijiEz(str, GCXiNH.fsw("[~NbO\u0011nrh\bQKK[MC\u0016EFVTTBJP^Y"));
                        geLlBI();
                    }
                }
                return;
            }
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("T\u007fMmGXe>oGLWOQ\\\u0007YG\u0014C@TVJLXRX_\u0019VVK`"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:61:0x00d9) to fix multi-entry loop: BACK_EDGE: B:60:0x00d2 -> B:61:0x00d9 */
    /* JADX DEBUG: Duplicate block (B:63:0x00ee) to fix multi-entry loop: BACK_EDGE: B:52:0x00bf -> B:63:0x00ee */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019a A[Catch: all -> 0x04c2, LOOP:12: B:101:0x019a->B:109:0x01ac, LOOP_START, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0012, B:14:0x0023, B:13:0x001d, B:15:0x002c, B:19:0x0036, B:22:0x003d, B:23:0x0043, B:25:0x004b, B:28:0x0055, B:30:0x006d, B:32:0x0073, B:37:0x007e, B:38:0x0086, B:39:0x008d, B:45:0x009c, B:47:0x00a6, B:50:0x00af, B:63:0x00ee, B:51:0x00b4, B:53:0x00c1, B:61:0x00d9, B:60:0x00d2, B:62:0x00e3, B:64:0x00f6, B:66:0x0102, B:70:0x0108, B:74:0x013a, B:76:0x013e, B:99:0x018d, B:101:0x019a, B:110:0x01ad, B:112:0x01bb, B:114:0x01c8, B:111:0x01b6, B:113:0x01c2, B:115:0x01ca, B:84:0x014f, B:86:0x015b, B:95:0x0170, B:96:0x0176, B:98:0x0185, B:97:0x017f, B:116:0x01d4, B:118:0x01e0, B:122:0x01f4, B:124:0x01fa, B:126:0x01fe, B:129:0x0205, B:130:0x020d, B:133:0x0215, B:135:0x0223, B:144:0x0238, B:145:0x0240, B:146:0x0245, B:147:0x024b, B:149:0x0255, B:152:0x0267, B:154:0x026b, B:156:0x026f, B:165:0x028e, B:163:0x027e, B:164:0x0286, B:166:0x0295, B:174:0x02aa, B:176:0x02b8, B:179:0x02bf, B:173:0x02a4, B:180:0x02c7, B:182:0x02d2, B:185:0x02e4, B:187:0x02ea, B:193:0x02f9, B:198:0x0310, B:207:0x0325, B:208:0x032e, B:209:0x0336, B:210:0x033d, B:196:0x0304, B:211:0x0346, B:213:0x0354, B:217:0x035f, B:218:0x0369, B:220:0x0376, B:223:0x0388, B:225:0x038e, B:227:0x0394, B:232:0x03a1, B:233:0x03ab, B:234:0x03b2, B:243:0x03c5, B:244:0x03cb, B:246:0x03d4, B:251:0x03e1, B:252:0x03e8, B:253:0x03f3, B:254:0x03fe, B:256:0x0408, B:259:0x041a, B:261:0x041e, B:288:0x0479, B:292:0x0482, B:293:0x048a, B:264:0x0423, B:271:0x0434, B:276:0x044a, B:283:0x045b, B:284:0x0463, B:285:0x046b, B:274:0x0441, B:286:0x0471, B:295:0x0491, B:301:0x04ae, B:294:0x048f, B:255:0x0406, B:219:0x0374, B:181:0x02d0, B:148:0x0253, B:117:0x01de), top: B:310:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015b A[Catch: all -> 0x04c2, LOOP:14: B:86:0x015b->B:354:0x015b, LOOP_START, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0012, B:14:0x0023, B:13:0x001d, B:15:0x002c, B:19:0x0036, B:22:0x003d, B:23:0x0043, B:25:0x004b, B:28:0x0055, B:30:0x006d, B:32:0x0073, B:37:0x007e, B:38:0x0086, B:39:0x008d, B:45:0x009c, B:47:0x00a6, B:50:0x00af, B:63:0x00ee, B:51:0x00b4, B:53:0x00c1, B:61:0x00d9, B:60:0x00d2, B:62:0x00e3, B:64:0x00f6, B:66:0x0102, B:70:0x0108, B:74:0x013a, B:76:0x013e, B:99:0x018d, B:101:0x019a, B:110:0x01ad, B:112:0x01bb, B:114:0x01c8, B:111:0x01b6, B:113:0x01c2, B:115:0x01ca, B:84:0x014f, B:86:0x015b, B:95:0x0170, B:96:0x0176, B:98:0x0185, B:97:0x017f, B:116:0x01d4, B:118:0x01e0, B:122:0x01f4, B:124:0x01fa, B:126:0x01fe, B:129:0x0205, B:130:0x020d, B:133:0x0215, B:135:0x0223, B:144:0x0238, B:145:0x0240, B:146:0x0245, B:147:0x024b, B:149:0x0255, B:152:0x0267, B:154:0x026b, B:156:0x026f, B:165:0x028e, B:163:0x027e, B:164:0x0286, B:166:0x0295, B:174:0x02aa, B:176:0x02b8, B:179:0x02bf, B:173:0x02a4, B:180:0x02c7, B:182:0x02d2, B:185:0x02e4, B:187:0x02ea, B:193:0x02f9, B:198:0x0310, B:207:0x0325, B:208:0x032e, B:209:0x0336, B:210:0x033d, B:196:0x0304, B:211:0x0346, B:213:0x0354, B:217:0x035f, B:218:0x0369, B:220:0x0376, B:223:0x0388, B:225:0x038e, B:227:0x0394, B:232:0x03a1, B:233:0x03ab, B:234:0x03b2, B:243:0x03c5, B:244:0x03cb, B:246:0x03d4, B:251:0x03e1, B:252:0x03e8, B:253:0x03f3, B:254:0x03fe, B:256:0x0408, B:259:0x041a, B:261:0x041e, B:288:0x0479, B:292:0x0482, B:293:0x048a, B:264:0x0423, B:271:0x0434, B:276:0x044a, B:283:0x045b, B:284:0x0463, B:285:0x046b, B:274:0x0441, B:286:0x0471, B:295:0x0491, B:301:0x04ae, B:294:0x048f, B:255:0x0406, B:219:0x0374, B:181:0x02d0, B:148:0x0253, B:117:0x01de), top: B:310:0x0003 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:197:0x030e -> B:198:0x0310). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0159 -> B:99:0x018d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean geLlBI() {
        /*
            r16 = this;
            r1 = r16
            monitor-enter(r16)
            QfgSZK.ZqidTP r0 = r1.fFJGOW     // Catch: java.lang.Throwable -> L4c2
            r2 = 0
            if (r0 == 0) goto L4bf
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r4 = r3 ^ 6933(0x1b15, float:9.715E-42)
            r5 = 92
            r6 = 95
            if (r4 == 0) goto L2c
        L12:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 624
            if (r2 == r6) goto L1d
            r0 = 280(0x118, float:3.92E-43)
            if (r2 == r0) goto L23
            goto L12
        L1d:
            int r2 = r0 + r0
            int r2 = r2 + r0
            int r2 = r2 % r5
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
        L23:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r0 = r0 ^ 1939(0x793, float:2.717E-42)
            int r0 = r0 % 9
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L23
        L2c:
            android.content.Context r0 = r0.Umbazn     // Catch: java.lang.Throwable -> L4c2
            if (r0 == 0) goto L4bf
            r0 = 38
            r4 = 6932(0x1b14, float:9.714E-42)
            if (r3 > r4) goto L43
        L36:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r3 = r2 + 26
            if (r3 == r0) goto L3d
            goto L36
        L3d:
            r3 = r2 ^ 3794(0xed2, float:5.317E-42)
            int r3 = r3 + r2
            QfgSZK.DPHsZd.Jxv = r3     // Catch: java.lang.Throwable -> L4c2
            goto L36
        L43:
            java.lang.String r3 = r1.zSVOUs     // Catch: java.lang.Throwable -> L4c2
            boolean r3 = QfgSZK.UPbYzn.iSpHlg(r3)     // Catch: java.lang.Throwable -> L4c2
            if (r3 != 0) goto L4bf
            java.lang.String r3 = r1.OuEEPx     // Catch: java.lang.Throwable -> L4c2
            boolean r3 = QfgSZK.UPbYzn.iSpHlg(r3)     // Catch: java.lang.Throwable -> L4c2
            if (r3 == 0) goto L55
            goto L4bf
        L55:
            QfgSZK.ZqidTP r3 = r1.fFJGOW     // Catch: java.lang.Throwable -> L4c2
            android.content.Context r3 = r3.Umbazn     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r7 = r1.zSVOUs     // Catch: java.lang.Throwable -> L4c2
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r7, r2)     // Catch: java.lang.Throwable -> L4c2
            int r7 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            r8 = 31
            r9 = 70
            r10 = 20
            r11 = 56
            r12 = 1825(0x721, float:2.557E-42)
            if (r7 > r12) goto Lf6
            int r7 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r7 = r7 ^ 6933(0x1b15, float:9.715E-42)
            if (r7 == 0) goto L8d
        L73:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 416
            if (r2 == r10) goto L86
            r3 = 58
            if (r2 == r3) goto L7e
            goto L73
        L7e:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 + r0
            int r2 = r2 % 13
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L7e
        L86:
            int r0 = r0 % 118
            r0 = r0 ^ 4400(0x1130, float:6.166E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L73
        L8d:
            int r7 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r13 = r7 + 221
            r14 = 109(0x6d, float:1.53E-43)
            if (r13 == r8) goto Lb4
            if (r13 == r14) goto Lee
            r14 = 213(0xd5, float:2.98E-43)
            if (r13 == r14) goto L9c
            goto L8d
        L9c:
            int r7 = r7 >> 69
            int r7 = r7 % 51
            QfgSZK.DPHsZd.dTU = r7     // Catch: java.lang.Throwable -> L4c2
            int r7 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r7 > r4) goto Lf6
        La6:
            int r7 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r13 = r7 + 468
            r14 = 21
            if (r13 == r14) goto Laf
            goto La6
        Laf:
            int r7 = r7 + r7
            int r7 = r7 >> r9
            QfgSZK.DPHsZd.Jxv = r7     // Catch: java.lang.Throwable -> L4c2
            goto Lf6
        Lb4:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 + r7
            int r0 = r0 % 53
            int r0 = r0 >> 7
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r0 > r4) goto Lee
        Lc1:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 + 442
            r2 = 80
            if (r0 == r2) goto Le3
            r2 = 132(0x84, float:1.85E-43)
            if (r0 == r2) goto Ld2
            r2 = 171(0xab, float:2.4E-43)
            if (r0 == r2) goto Ld9
            goto Lc1
        Ld2:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 % r11
            int r0 = r0 >> 10
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
        Ld9:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r0 = r0 ^ 3639(0xe37, float:5.1E-42)
            int r0 = r0 * 34
            int r0 = r0 >> r14
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto Ld2
        Le3:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 % 72
            int r0 = r0 >> 27
            r0 = r0 ^ 4947(0x1353, float:6.932E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto Le3
        Lee:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            r2 = 217(0xd9, float:3.04E-43)
            int r0 = r0 >> r2
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            goto Lb4
        Lf6:
            java.lang.String r7 = "I\\cSftSYIl}so{nx}pm"
            java.lang.String r7 = QfgSZK.GCXiNH.fsw(r7)     // Catch: java.lang.Throwable -> L4c2
            boolean r3 = QfgSZK.HJWChP.HhYHK.gFTCsA(r3, r7)     // Catch: java.lang.Throwable -> L4c2
            if (r3 == 0) goto L108
            boolean r3 = r1.zLAIeZ     // Catch: java.lang.Throwable -> L4c2
            if (r3 != 0) goto L108
            monitor-exit(r16)
            return r2
        L108:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c2
            r3.<init>()     // Catch: java.lang.Throwable -> L4c2
            long r13 = r1.fqVTOY     // Catch: java.lang.Throwable -> L4c2
            r3.append(r13)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r7 = "|"
            r3.append(r7)     // Catch: java.lang.Throwable -> L4c2
            long r13 = r1.UnJFsM     // Catch: java.lang.Throwable -> L4c2
            r3.append(r13)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r7 = "|"
            r3.append(r7)     // Catch: java.lang.Throwable -> L4c2
            int r7 = r1.EESEk     // Catch: java.lang.Throwable -> L4c2
            r3.append(r7)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r7 = "|"
            r3.append(r7)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r7 = r1.irBrEI     // Catch: java.lang.Throwable -> L4c2
            boolean r7 = QfgSZK.UPbYzn.iSpHlg(r7)     // Catch: java.lang.Throwable -> L4c2
            r13 = 1
            r14 = 35
            r15 = 91
            if (r7 == 0) goto L1de
            java.lang.String r7 = ""
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            if (r2 > r12) goto L1e0
        L13e:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 65
            if (r2 == r14) goto L1d4
            r3 = 60
            if (r2 == r3) goto L14f
            if (r2 == r9) goto L1ca
            r3 = 147(0x93, float:2.06E-43)
            if (r2 == r3) goto L18d
            goto L13e
        L14f:
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 + r0
            int r2 = r2 + r0
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L4c2
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r2 = r2 ^ 6933(0x1b15, float:9.715E-42)
            if (r2 == 0) goto L18d
        L15b:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 403
            r3 = 52
            if (r2 == r3) goto L17f
            r3 = 140(0x8c, float:1.96E-43)
            if (r2 == r3) goto L185
            r3 = 191(0xbf, float:2.68E-43)
            if (r2 == r3) goto L176
            r3 = 326(0x146, float:4.57E-43)
            if (r2 == r3) goto L170
            goto L15b
        L170:
            int r2 = r0 * 33
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L185
        L176:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 * 13
            int r2 = r2 + r0
            int r2 = r2 % r13
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L176
        L17f:
            int r2 = r0 * 12
            int r2 = r2 >> 30
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
        L185:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 + r0
            int r0 = r2 >> 91
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L15b
        L18d:
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            r3 = 205(0xcd, float:2.87E-43)
            int r2 = r2 >> r3
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L4c2
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r2 = r2 ^ 6933(0x1b15, float:9.715E-42)
            if (r2 == 0) goto L1ca
        L19a:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r3 = r2 + 390
            if (r3 == r11) goto L1c2
            r4 = 229(0xe5, float:3.21E-43)
            if (r3 == r4) goto L1b6
            r2 = 293(0x125, float:4.1E-43)
            if (r3 == r2) goto L1bb
            r2 = 467(0x1d3, float:6.54E-43)
            if (r3 == r2) goto L1ad
            goto L19a
        L1ad:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r0 = r0 ^ 8101(0x1fa5, float:1.1352E-41)
            int r0 = r0 * 26
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L1ad
        L1b6:
            int r3 = r2 * 79
            int r3 = r3 + r2
            QfgSZK.DPHsZd.Jxv = r3     // Catch: java.lang.Throwable -> L4c2
        L1bb:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 >> 106
            int r2 = r2 % 98
            goto L1c8
        L1c2:
            int r2 = r2 * 73
            int r2 = r2 % 16
            int r2 = r2 % 23
        L1c8:
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
        L1ca:
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 * 120
            r2 = r2 ^ 1630(0x65e, float:2.284E-42)
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L4c2
            goto L14f
        L1d4:
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 * 18
            int r2 = r2 + r0
            int r2 = r2 % 108
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L4c2
            goto L1d4
        L1de:
            java.lang.String r7 = r1.irBrEI     // Catch: java.lang.Throwable -> L4c2
        L1e0:
            r3.append(r7)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = "|"
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = r1.dnzOAG     // Catch: java.lang.Throwable -> L4c2
            boolean r2 = QfgSZK.UPbYzn.iSpHlg(r2)     // Catch: java.lang.Throwable -> L4c2
            r7 = 42
            if (r2 == 0) goto L253
            java.lang.String r2 = ""
            int r9 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            r9 = r9 ^ 1826(0x722, float:2.559E-42)
            if (r9 == 0) goto L255
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r0 > r4) goto L20d
        L1fe:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 + 117
            if (r0 == r7) goto L205
            goto L1fe
        L205:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 * r8
            r0 = r0 ^ 3917(0xf4d, float:5.489E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L205
        L20d:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 + r15
            r2 = 12
            if (r0 == r2) goto L215
            goto L20d
        L215:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            r0 = r0 ^ 2655(0xa5f, float:3.72E-42)
            int r0 = r0 >> 86
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L215
        L223:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 481
            r3 = 72
            if (r2 == r3) goto L24b
            r3 = 263(0x107, float:3.69E-43)
            if (r2 == r3) goto L245
            r3 = 459(0x1cb, float:6.43E-43)
            if (r2 == r3) goto L240
            r0 = 611(0x263, float:8.56E-43)
            if (r2 == r0) goto L238
            goto L223
        L238:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 >> r10
            int r0 = r0 * 30
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L238
        L240:
            int r2 = r0 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L24b
        L245:
            int r2 = r0 % 41
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L223
        L24b:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 + r0
            r0 = r2 ^ 3686(0xe66, float:5.165E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L223
        L253:
            java.lang.String r2 = r1.dnzOAG     // Catch: java.lang.Throwable -> L4c2
        L255:
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = "|"
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = r1.zSULAs     // Catch: java.lang.Throwable -> L4c2
            boolean r2 = QfgSZK.UPbYzn.iSpHlg(r2)     // Catch: java.lang.Throwable -> L4c2
            if (r2 == 0) goto L2d0
            java.lang.String r2 = ""
            int r8 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            if (r8 > r12) goto L2d2
            int r8 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r8 > r4) goto L295
        L26f:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 156
            if (r2 == r11) goto L286
            r3 = 145(0x91, float:2.03E-43)
            if (r2 == r3) goto L27e
            r3 = 239(0xef, float:3.35E-43)
            if (r2 == r3) goto L28e
            goto L26f
        L27e:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 >> 11
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L27e
        L286:
            int r2 = r0 >> 35
            int r2 = r2 % 53
            int r2 = r2 >> 74
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
        L28e:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 % r6
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L26f
        L295:
            int r8 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r9 = r8 + 117
            if (r9 == r13) goto L2c7
            r10 = 187(0xbb, float:2.62E-43)
            if (r9 == r10) goto L2a4
            r8 = 236(0xec, float:3.31E-43)
            if (r9 == r8) goto L2aa
            goto L295
        L2a4:
            r8 = r8 ^ 3184(0xc70, float:4.462E-42)
            int r8 = r8 >> 118
            QfgSZK.DPHsZd.dTU = r8     // Catch: java.lang.Throwable -> L4c2
        L2aa:
            int r8 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r8 = r8 % 18
            int r8 = r8 >> 18
            int r8 = r8 % 17
            QfgSZK.DPHsZd.dTU = r8     // Catch: java.lang.Throwable -> L4c2
            int r8 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r8 > r4) goto L2d2
        L2b8:
            int r8 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r9 = r8 + 143
            if (r9 == r0) goto L2bf
            goto L2b8
        L2bf:
            r8 = r8 ^ 4625(0x1211, float:6.481E-42)
            int r8 = r8 % r7
            int r8 = r8 >> 5
            QfgSZK.DPHsZd.Jxv = r8     // Catch: java.lang.Throwable -> L4c2
            goto L2d2
        L2c7:
            int r8 = r8 >> 122
            int r8 = r8 * 17
            int r8 = r8 >> 84
            QfgSZK.DPHsZd.dTU = r8     // Catch: java.lang.Throwable -> L4c2
            goto L295
        L2d0:
            java.lang.String r2 = r1.zSULAs     // Catch: java.lang.Throwable -> L4c2
        L2d2:
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = "|"
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = r1.zOaCsY     // Catch: java.lang.Throwable -> L4c2
            boolean r2 = QfgSZK.UPbYzn.iSpHlg(r2)     // Catch: java.lang.Throwable -> L4c2
            if (r2 == 0) goto L374
            java.lang.String r2 = ""
            int r8 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            r8 = r8 ^ 1826(0x722, float:2.559E-42)
            if (r8 == 0) goto L376
        L2ea:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 143
            r3 = 49
            if (r2 == r3) goto L346
            if (r2 == r15) goto L304
            r3 = 261(0x105, float:3.66E-43)
            if (r2 == r3) goto L2f9
            goto L2ea
        L2f9:
            int r0 = r0 * 360
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L304
            goto L310
        L304:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 % r5
            r0 = r0 ^ 2124(0x84c, float:2.976E-42)
            int r0 = r0 * r14
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r0 > r4) goto L304
        L310:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 546
            r3 = 40
            if (r2 == r3) goto L33d
            r3 = 229(0xe5, float:3.21E-43)
            if (r2 == r3) goto L336
            r3 = 329(0x149, float:4.61E-43)
            if (r2 == r3) goto L32e
            r0 = 355(0x163, float:4.97E-43)
            if (r2 == r0) goto L325
            goto L310
        L325:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 * 8432
            r0 = r0 ^ 1902(0x76e, float:2.665E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L325
        L32e:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 + r0
            int r2 = r2 % 73
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L32e
        L336:
            int r2 = r0 >> 20
            int r2 = r2 * r11
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L304
        L33d:
            r0 = r0 ^ 2422(0x976, float:3.394E-42)
            int r0 = r0 >> 14
            int r0 = r0 % 27
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L304
        L346:
            int r0 = r0 * 46
            int r0 = r0 % 50
            r0 = r0 ^ 4644(0x1224, float:6.508E-42)
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L2ea
        L354:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 195
            r3 = 79
            if (r2 == r3) goto L369
            if (r2 == r6) goto L35f
            goto L354
        L35f:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 >> 67
            int r2 = r2 + r0
            int r2 = r2 >> 62
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L35f
        L369:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 % 68
            r0 = r0 ^ 4185(0x1059, float:5.864E-42)
            int r0 = r0 * 80
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L369
        L374:
            java.lang.String r2 = r1.zOaCsY     // Catch: java.lang.Throwable -> L4c2
        L376:
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = "|"
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = r1.RSKqwx     // Catch: java.lang.Throwable -> L4c2
            boolean r2 = QfgSZK.UPbYzn.iSpHlg(r2)     // Catch: java.lang.Throwable -> L4c2
            if (r2 == 0) goto L406
            java.lang.String r2 = ""
            int r6 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            r6 = r6 ^ 1826(0x722, float:2.559E-42)
            if (r6 == 0) goto L408
            int r6 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r6 = r6 ^ 6933(0x1b15, float:9.715E-42)
            if (r6 == 0) goto L3b2
        L394:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 234
            r3 = 32
            if (r2 == r3) goto L3ab
            r3 = 159(0x9f, float:2.23E-43)
            if (r2 == r3) goto L3a1
            goto L394
        L3a1:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 % 47
            int r2 = r2 % 112
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L3a1
        L3ab:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 + r0
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L3ab
        L3b2:
            int r6 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r8 = r6 + 169
            if (r8 == r0) goto L3fe
            r9 = 87
            if (r8 == r9) goto L3f3
            r9 = 254(0xfe, float:3.56E-43)
            if (r8 == r9) goto L3cb
            r9 = 271(0x10f, float:3.8E-43)
            if (r8 == r9) goto L3c5
            goto L3b2
        L3c5:
            int r6 = r6 + r6
            int r6 = r6 >> 90
            QfgSZK.DPHsZd.dTU = r6     // Catch: java.lang.Throwable -> L4c2
            goto L3b2
        L3cb:
            int r0 = r6 * 620
            int r0 = r0 + r6
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r0 > r4) goto L3fe
        L3d4:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 312
            r3 = 90
            if (r2 == r3) goto L3e8
            r3 = 160(0xa0, float:2.24E-43)
            if (r2 == r3) goto L3e1
            goto L3d4
        L3e1:
            int r0 = r0 % 114
            int r0 = r0 * 1144
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L3fe
        L3e8:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 >> 71
            r0 = r0 ^ 4078(0xfee, float:5.714E-42)
            int r0 = r0 % 46
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L3e8
        L3f3:
            int r6 = r6 * 121
            r0 = 70
            int r0 = r6 >> 70
            r0 = r0 ^ 5205(0x1455, float:7.294E-42)
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            goto L408
        L3fe:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 * 7
            int r0 = r0 + r6
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L4c2
            goto L3fe
        L406:
            java.lang.String r2 = r1.RSKqwx     // Catch: java.lang.Throwable -> L4c2
        L408:
            r3.append(r2)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r0 = "|"
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r0 = r1.aYGmbG     // Catch: java.lang.Throwable -> L4c2
            boolean r0 = QfgSZK.UPbYzn.iSpHlg(r0)     // Catch: java.lang.Throwable -> L4c2
            if (r0 == 0) goto L48f
            java.lang.String r0 = ""
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            if (r2 > r12) goto L491
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r2 > r4) goto L423
            goto L479
        L423:
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L4c2
            int r6 = r2 + 195
            r8 = 49
            if (r6 == r8) goto L471
            r8 = 131(0x83, float:1.84E-43)
            if (r6 == r8) goto L441
            r8 = 150(0x96, float:2.1E-43)
            if (r6 == r8) goto L434
            goto L423
        L434:
            int r2 = r2 % 123
            r2 = r2 ^ 2479(0x9af, float:3.474E-42)
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L4c2
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            r2 = r2 ^ 6933(0x1b15, float:9.715E-42)
            if (r2 == 0) goto L491
            goto L44a
        L441:
            int r2 = r2 * r15
            int r2 = r2 >> 113
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L4c2
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r2 > r4) goto L491
        L44a:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r4 = r2 + 260
            r5 = 88
            if (r4 == r5) goto L46b
            r5 = 184(0xb8, float:2.58E-43)
            if (r4 == r5) goto L463
            r5 = 306(0x132, float:4.29E-43)
            if (r4 == r5) goto L45b
            goto L44a
        L45b:
            int r0 = r2 + r2
            r0 = r0 ^ 1267(0x4f3, float:1.775E-42)
            int r0 = r0 % 32
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
        L463:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r0 = r0 + r2
            r0 = r0 ^ 2641(0xa51, float:3.701E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L463
        L46b:
            int r2 = r2 + r2
            int r2 = r2 >> 26
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L491
        L471:
            r2 = r2 ^ 2203(0x89b, float:3.087E-42)
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L4c2
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            if (r2 > r4) goto L423
        L479:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r0 + 273
            if (r2 == r7) goto L48a
            if (r2 == r5) goto L482
            goto L479
        L482:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L4c2
            int r2 = r2 + r0
            r2 = r2 ^ 1976(0x7b8, float:2.769E-42)
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L4c2
            goto L482
        L48a:
            int r0 = r0 * 1508
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L4c2
            goto L479
        L48f:
            java.lang.String r0 = r1.aYGmbG     // Catch: java.lang.Throwable -> L4c2
        L491:
            r3.append(r0)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r2 = r1.OuEEPx     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r3 = "\\Th#heS1\\cap\u001fyICR\\ZT"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r0 = QfgSZK.IKQXqd.apLTlu(r0, r2, r3)     // Catch: java.lang.Throwable -> L4c2
            boolean r2 = QfgSZK.UPbYzn.iSpHlg(r0)     // Catch: java.lang.Throwable -> L4c2
            if (r2 == 0) goto L4ad
            monitor-exit(r16)
            r2 = 0
            return r2
        L4ad:
            r2 = 0
            QfgSZK.ZqidTP r3 = r1.fFJGOW     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r4 = r1.zSVOUs     // Catch: java.lang.Throwable -> L4c2
            java.lang.String r5 = "I\\cSftSYIl}so{nx}pm"
            java.lang.String r5 = QfgSZK.GCXiNH.fsw(r5)     // Catch: java.lang.Throwable -> L4c2
            QfgSZK.HJWChP.HhYHK.hwkNQP(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L4c2
            r1.zLAIeZ = r2     // Catch: java.lang.Throwable -> L4c2
            monitor-exit(r16)
            return r13
        L4bf:
            monitor-exit(r16)
            r0 = 0
            return r0
        L4c2:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DPHsZd.geLlBI():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean ihnvzI(String str, int i) {
        int i2;
        int i3;
        synchronized (this) {
            if (str != null) {
                int i4 = dTU;
                if ((Jxv ^ 6933) != 0) {
                    do {
                        i3 = Jxv;
                    } while (i3 + 91 != 96);
                    while (true) {
                        Jxv = ((Jxv ^ 1665) % 12) + i3;
                    }
                } else {
                    if (i4 <= 1825) {
                        do {
                            i2 = dTU;
                        } while (i2 + 39 != 5);
                        if ((Jxv ^ 6933) != 0) {
                            while (true) {
                                int i5 = Jxv;
                                int i6 = i5 + 78;
                                if (i6 == 57) {
                                    Jxv = ((i5 >> 10) * 91) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                                } else if (i6 == 198) {
                                    break;
                                }
                            }
                            while (true) {
                                Jxv = ((Jxv ^ 4767) * 124) ^ 4148;
                            }
                        } else {
                            dTU = ((i2 + i2) * 10) ^ 3955;
                        }
                    }
                    if (str.equals(GCXiNH.fsw("ldRi_adleGF"))) {
                        this.EESEk = i;
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean ihnvzI(String str, long j) {
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        synchronized (this) {
            boolean z = false;
            if (UPbYzn.iSpHlg(str)) {
                return false;
            }
            if (Jxv > 6932) {
                int iHashCode = str.hashCode();
                if (iHashCode != -130003045) {
                    b = (iHashCode == 325543574 && str.equals(GCXiNH.fsw("yxHmI]dQ|\\KLDZ"))) ? (byte) 1 : (byte) -1;
                } else if (str.equals(GCXiNH.fsw("x\u007fZnGTNnxAMMY"))) {
                    int i10 = Jxv;
                    if (i10 <= 6932) {
                        while (Jxv + 377 != 66) {
                        }
                        while (true) {
                            Jxv = (Jxv % 118) >> 70;
                        }
                    } else if ((dTU ^ 1826) == 0) {
                        b = 0;
                    } else if (i10 <= 6932) {
                        do {
                            i2 = Jxv;
                        } while (i2 + 286 != 76);
                        while (true) {
                            Jxv = ((Jxv >> 49) + i2) * 43;
                        }
                    } else {
                        while (true) {
                            i = dTU;
                            int i11 = i + 26;
                            if (i11 == 31) {
                                break;
                            }
                            if (i11 == 190) {
                                break;
                            }
                            if (i11 == 235) {
                                if (Jxv <= 6932) {
                                    while (Jxv + 338 != 54) {
                                    }
                                    while (true) {
                                        Jxv = (Jxv % 89) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                                    }
                                } else {
                                    dTU = ((i >> 85) ^ 5025) * 33;
                                }
                            }
                        }
                        dTU = (dTU ^ 3649) % 44;
                        if (Jxv > 6932) {
                            do {
                                dTU = (dTU >> 87) + i;
                            } while (Jxv > 6932);
                        }
                        while (Jxv + 299 != 60) {
                        }
                        while (true) {
                            Jxv = (Jxv * 29) ^ 4833;
                        }
                    }
                }
                if (b == 0) {
                    int i12 = dTU ^ 1826;
                    if (i12 != 0) {
                        while (true) {
                            int i13 = dTU;
                            if (Jxv <= 6932) {
                                while (true) {
                                    int i14 = Jxv;
                                    int i15 = i14 + 364;
                                    if (i15 == 96) {
                                        Jxv = (i14 + i14) >> 41;
                                    } else if (i15 == 205) {
                                        break;
                                    }
                                }
                                while (true) {
                                    Jxv = (Jxv >> 105) % 81;
                                }
                            } else {
                                int i16 = i13 + 117;
                                if (i16 == 98) {
                                    while (true) {
                                        int i17 = dTU;
                                        if ((Jxv ^ 6933) != 0) {
                                            break;
                                        }
                                        dTU = ((i17 ^ 4154) >> 36) * 64;
                                    }
                                    while (true) {
                                        int i18 = Jxv;
                                        int i19 = i18 + 273;
                                        if (i19 == 71) {
                                            Jxv = (i18 >> 123) % 33;
                                        } else if (i19 == 147) {
                                            Jxv = (i18 >> 23) * 93;
                                        }
                                    }
                                } else if (i16 == 191) {
                                    dTU = (i13 ^ 1930) >> 40;
                                } else if (i16 == 271) {
                                    while (true) {
                                        dTU = (dTU * 55) % 89;
                                    }
                                }
                            }
                        }
                    } else {
                        if (this.fqVTOY != j) {
                            this.fqVTOY = j;
                            this.zLAIeZ = true;
                            if (i12 != 0) {
                                do {
                                    int i20 = dTU;
                                    i3 = i20 + 104;
                                    if (i3 != 76) {
                                    }
                                } while (i3 != 269);
                                while (true) {
                                    dTU = (dTU % 17) % 9;
                                    if ((Jxv ^ 6933) == 0) {
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                } else if (b == 1) {
                    if (this.UnJFsM != j) {
                        this.UnJFsM = j;
                        this.zLAIeZ = true;
                        if ((dTU ^ 1826) != 0) {
                            if (Jxv <= 6932) {
                                do {
                                    i7 = Jxv;
                                    i8 = i7 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                    if (i8 != 86) {
                                        if (i8 == 144) {
                                            Jxv = ((i7 + i7) >> 88) * 54;
                                        }
                                    }
                                    while (true) {
                                        Jxv ^= 290;
                                    }
                                } while (i8 != 284);
                                while (true) {
                                    Jxv = ((Jxv + i7) * 70) % 47;
                                }
                            }
                            do {
                                int i202 = dTU;
                                i3 = i202 + 104;
                                if (i3 != 76) {
                                    if (Jxv <= 6932) {
                                        while (true) {
                                            i6 = Jxv;
                                            int i21 = i6 + 221;
                                            if (i21 == 91) {
                                                break;
                                            }
                                            if (i21 == 241) {
                                                Jxv = (i6 >> 91) % 22;
                                            }
                                        }
                                        Jxv = (i6 >> 35) * 2856;
                                    }
                                    if (Jxv <= 6932) {
                                        while (true) {
                                            i5 = Jxv;
                                            int i22 = i5 + 390;
                                            if (i22 == 67) {
                                                Jxv = ((i5 % 62) % 55) + i5;
                                            } else {
                                                if (i22 == 136) {
                                                    break;
                                                }
                                                if (i22 != 213) {
                                                }
                                            }
                                            Jxv = (Jxv + i5) >> 17;
                                        }
                                        Jxv = i5 * 5520;
                                    }
                                    dTU = ((i202 % 33) ^ 1423) % 37;
                                    if ((Jxv ^ 6933) != 0) {
                                        do {
                                            i4 = Jxv;
                                        } while (i4 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 86);
                                        Jxv = (i4 + i4) >> 13;
                                    }
                                }
                            } while (i3 != 269);
                            while (true) {
                                dTU = (dTU % 17) % 9;
                                if ((Jxv ^ 6933) == 0) {
                                    while (true) {
                                        int i23 = Jxv;
                                        int i24 = i23 + 208;
                                        if (i24 == 94) {
                                            Jxv = (i23 >> 87) % 8;
                                            break;
                                        }
                                        if (i24 == 187) {
                                            Jxv = (i23 + i23) >> 97;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                }
                return z;
            }
            do {
                i9 = Jxv;
            } while (i9 + 351 != 70);
            while (true) {
                Jxv = (Jxv ^ 3239) + i9;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:148:0x0232) to fix multi-entry loop: BACK_EDGE: B:148:0x0232 -> B:149:0x023a */
    /* JADX DEBUG: Duplicate block (B:172:0x0296) to fix multi-entry loop: BACK_EDGE: B:172:0x0296 -> B:171:0x028c */
    /* JADX DEBUG: Duplicate block (B:188:0x02dc) to fix multi-entry loop: BACK_EDGE: B:187:0x02d4 -> B:188:0x02dc */
    /* JADX WARN: Failed to build post-dominance tree
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0148 -> B:85:0x014a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getId()" because "imPostDom" is null
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:186)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SynchronizedRegionMaker.process(SynchronizedRegionMaker.java:87)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:118)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public boolean ihnvzI(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            monitor-enter(r16)
            boolean r3 = QfgSZK.UPbYzn.iSpHlg(r17)     // Catch: java.lang.Throwable -> L53e
            if (r3 != 0) goto L53b
            if (r2 != 0) goto L11
            goto L53b
        L11:
            int r3 = r17.hashCode()     // Catch: java.lang.Throwable -> L53e
            int r5 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r6 = 6932(0x1b14, float:9.714E-42)
            if (r5 > r6) goto L51
        L1b:
            int r5 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r7 = r5 + 39
            r8 = 89
            if (r7 == r8) goto L48
            r8 = 208(0xd0, float:2.91E-43)
            if (r7 == r8) goto L37
            r8 = 235(0xeb, float:3.3E-43)
            if (r7 == r8) goto L3d
            r8 = 314(0x13a, float:4.4E-43)
            if (r7 == r8) goto L30
            goto L1b
        L30:
            int r5 = r5 % 72
            int r5 = r5 * 83
            QfgSZK.DPHsZd.Jxv = r5     // Catch: java.lang.Throwable -> L53e
            goto L51
        L37:
            int r5 = r5 * 80
            r0 = r5 ^ 2736(0xab0, float:3.834E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
        L3d:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 >> 9
            int r0 = r0 * 86
            int r0 = r0 >> 123
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L3d
        L48:
            int r5 = r5 % 9
            int r5 = r5 >> 99
            int r5 = r5 % 44
            QfgSZK.DPHsZd.Jxv = r5     // Catch: java.lang.Throwable -> L53e
            goto L1b
        L51:
            r5 = 68
            r8 = 115(0x73, float:1.61E-43)
            r9 = 98
            r10 = 70
            r11 = 3
            r12 = 1825(0x721, float:2.557E-42)
            r13 = 5
            r14 = 23
            r15 = 56
            r4 = 4
            r7 = 1
            switch(r3) {
                case -1962630338: goto L314;
                case -89133479: goto L2e9;
                case 342316631: goto L20b;
                case 342316634: goto L1d3;
                case 342316638: goto L18d;
                case 342316649: goto L68;
                default: goto L66;
            }     // Catch: java.lang.Throwable -> L53e
        L66:
            goto L322
        L68:
            java.lang.String r3 = "NY~BjbDA_"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            if (r3 > r12) goto L16e
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            r2 = 39
            if (r0 == 0) goto L80
            goto L14a
        L80:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r3 = r0 + 351
            r5 = 55
            if (r3 == r5) goto Lf1
            r5 = 250(0xfa, float:3.5E-43)
            if (r3 == r5) goto L13d
            r5 = 289(0x121, float:4.05E-43)
            if (r3 == r5) goto L91
            goto L80
        L91:
            int r3 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r4 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r4 = r4 ^ 6933(0x1b15, float:9.715E-42)
            if (r4 == 0) goto Ld0
        L99:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 806
            r3 = 62
            if (r2 == r3) goto Lc8
            r3 = 152(0x98, float:2.13E-43)
            if (r2 == r3) goto Lbf
            r3 = 268(0x10c, float:3.76E-43)
            if (r2 == r3) goto Lb7
            r0 = 406(0x196, float:5.69E-43)
            if (r2 == r0) goto Lae
            goto L99
        Lae:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 * r14
            int r0 = r0 % 33
            int r0 = r0 >> r15
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto Lae
        Lb7:
            int r2 = r0 + r0
            int r2 = r2 * 49
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto Lc8
        Lbf:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 >> 95
            r0 = r0 ^ 4887(0x1317, float:6.848E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto Lbf
        Lc8:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 + r0
            int r2 = r2 >> 48
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto Lc8
        Ld0:
            int r3 = r3 + r0
            int r3 = r3 * 8910
            QfgSZK.DPHsZd.dTU = r3     // Catch: java.lang.Throwable -> L53e
            if (r4 == 0) goto L91
        Ld7:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r3 = r0 + 663
            r4 = 96
            if (r3 == r4) goto Lea
            r4 = 278(0x116, float:3.9E-43)
            if (r3 == r4) goto Le4
            goto Ld7
        Le4:
            int r3 = r0 + r0
            int r3 = r3 + r0
            QfgSZK.DPHsZd.Jxv = r3     // Catch: java.lang.Throwable -> L53e
            goto Ld7
        Lea:
            int r0 = r0 * 75
            int r0 = r0 % r2
            int r0 = r0 % r15
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto Ld7
        Lf1:
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            if (r3 > r6) goto L122
        Lf5:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 832
            if (r2 == r4) goto L11c
            r3 = 151(0x97, float:2.12E-43)
            if (r2 == r3) goto L108
            r0 = 268(0x10c, float:3.76E-43)
            if (r2 == r0) goto L115
            r0 = 432(0x1b0, float:6.05E-43)
            if (r2 == r0) goto L10e
            goto Lf5
        L108:
            int r0 = r0 % 125
            int r0 = r0 * 9
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
        L10e:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 * 64
            int r0 = r0 % r13
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
        L115:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 824(0x338, float:1.155E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L115
        L11c:
            r2 = 134(0x86, float:1.88E-43)
            int r0 = r0 >> r2
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto Lf5
        L122:
            r5 = r0 ^ 4354(0x1102, float:6.101E-42)
            int r5 = r5 % 75
            int r5 = r5 >> 95
            QfgSZK.DPHsZd.dTU = r5     // Catch: java.lang.Throwable -> L53e
            r3 = r3 ^ 6933(0x1b15, float:9.715E-42)
            if (r3 == 0) goto L13d
        L12e:
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r5 = r3 + 650
            if (r5 == r4) goto L135
            goto L12e
        L135:
            int r3 = r3 % 109
            r3 = r3 ^ 2092(0x82c, float:2.932E-42)
            int r3 = r3 * 111
            QfgSZK.DPHsZd.Jxv = r3     // Catch: java.lang.Throwable -> L53e
        L13d:
            int r3 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r3 = r3 + r0
            r0 = r3 ^ 3640(0xe38, float:5.101E-42)
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L53e
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L80
        L14a:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r3 = r0 + 624
            if (r3 == r2) goto L167
            r5 = 118(0x76, float:1.65E-43)
            if (r3 == r5) goto L160
            r5 = 227(0xe3, float:3.18E-43)
            if (r3 == r5) goto L159
            goto L14a
        L159:
            int r0 = r0 >> 40
            int r0 = r0 % r8
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L80
        L160:
            int r3 = r0 * 1424
            int r3 = r3 + r0
            QfgSZK.DPHsZd.Jxv = r3     // Catch: java.lang.Throwable -> L53e
            goto L80
        L167:
            int r0 = r0 * 99
            int r0 = r0 >> 94
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L14a
        L16e:
            if (r0 == 0) goto L322
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L18a
        L176:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 + 117
            r2 = 85
            if (r0 == r2) goto L17f
            goto L176
        L17f:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 * 109
            r0 = r0 ^ 1249(0x4e1, float:1.75E-42)
            int r0 = r0 >> 104
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L17f
        L18a:
            r0 = r11
            goto L323
        L18d:
            java.lang.String r3 = "NY~BjbDAD"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L322
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r14 = r3 ^ 6933(0x1b15, float:9.715E-42)
            if (r14 == 0) goto L1c8
        L1a1:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 494
            r3 = 85
            if (r2 == r3) goto L1c0
            r3 = 276(0x114, float:3.87E-43)
            if (r2 == r3) goto L1b9
            r3 = 448(0x1c0, float:6.28E-43)
            if (r2 == r3) goto L1b2
            goto L1a1
        L1b2:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 + r0
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L1b2
        L1b9:
            int r2 = r0 * 36
            r3 = 165(0xa5, float:2.31E-43)
            int r2 = r2 >> r3
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
        L1c0:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 + r0
            int r0 = r2 >> 33
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L1a1
        L1c8:
            r0 = r0 ^ 1826(0x722, float:2.559E-42)
            if (r0 == 0) goto L1d0
            if (r3 > r6) goto L258
            goto L2b0
        L1d0:
            r0 = 2
            goto L323
        L1d3:
            java.lang.String r3 = "NY~BjbDAH"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            if (r3 > r12) goto L206
        L1e1:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 325
            r3 = 42
            if (r2 == r3) goto L1ea
            goto L1e1
        L1ea:
            r0 = r0 ^ 7267(0x1c63, float:1.0183E-41)
            int r0 = r0 >> 74
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L53e
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L1e1
        L1f6:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 + 65
            if (r0 == r9) goto L1fd
            goto L1f6
        L1fd:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 * 97
            r0 = r0 ^ 1243(0x4db, float:1.742E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L1fd
        L206:
            if (r0 == 0) goto L322
            r0 = r7
            goto L323
        L20b:
            java.lang.String r3 = "NY~BjbDAM"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L322
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            if (r3 > r6) goto L254
        L21d:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 741
            r3 = 97
            if (r2 == r3) goto L232
            r3 = 248(0xf8, float:3.48E-43)
            if (r2 == r3) goto L24b
            r3 = 301(0x12d, float:4.22E-43)
            if (r2 == r3) goto L243
            r3 = 321(0x141, float:4.5E-43)
            if (r2 == r3) goto L23a
            goto L21d
        L232:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r2 = r2 ^ 5472(0x1560, float:7.668E-42)
            int r2 = r2 + r0
            int r2 = r2 % r10
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
        L23a:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 >> 13
            int r2 = r2 + r0
            int r2 = r2 >> 30
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
        L243:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 * 122
            int r2 = r2 % 25
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
        L24b:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 % 88
            r2 = r2 ^ 3542(0xdd6, float:4.963E-42)
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L232
        L254:
            r0 = r0 ^ 1826(0x722, float:2.559E-42)
            if (r0 == 0) goto L2e7
        L258:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 39
            if (r2 == r15) goto L263
            r3 = 69
            if (r2 == r3) goto L26a
            goto L258
        L263:
            int r2 = r0 % 15
            int r2 = r2 % 108
            int r2 = r2 + r0
            QfgSZK.DPHsZd.dTU = r2     // Catch: java.lang.Throwable -> L53e
        L26a:
            int r2 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r4 = r3 ^ 6933(0x1b15, float:9.715E-42)
            if (r4 == 0) goto L2a7
        L272:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 598
            r3 = 27
            if (r2 == r3) goto L2a0
            if (r2 == r9) goto L285
            r3 = 131(0x83, float:1.84E-43)
            if (r2 == r3) goto L296
            r3 = 136(0x88, float:1.9E-43)
            if (r2 == r3) goto L28c
            goto L272
        L285:
            int r2 = r0 * 24
            int r2 = r2 + r0
            int r2 = r2 >> 60
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
        L28c:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 % 126
            int r2 = r2 * 99
            r2 = r2 ^ 2902(0xb56, float:4.067E-42)
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
        L296:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r2 = r2 ^ 3829(0xef5, float:5.366E-42)
            int r2 = r2 * 74
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L28c
        L2a0:
            r0 = r0 ^ 5197(0x144d, float:7.283E-42)
            int r0 = r0 >> 108
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L272
        L2a7:
            r2 = r2 ^ 5121(0x1401, float:7.176E-42)
            int r2 = r2 + r0
            r0 = r2 ^ 5139(0x1413, float:7.201E-42)
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L53e
            if (r3 > r6) goto L258
        L2b0:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 507
            if (r2 == r11) goto L2d4
            r3 = 156(0x9c, float:2.19E-43)
            if (r2 == r3) goto L2cc
            r0 = 341(0x155, float:4.78E-43)
            if (r2 == r0) goto L2c3
            r0 = 459(0x1cb, float:6.43E-43)
            if (r2 == r0) goto L2dc
            goto L2b0
        L2c3:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 % 36
            int r0 = r0 >> 69
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L2c3
        L2cc:
            int r2 = r0 + r0
            int r2 = r2 + r0
            int r2 = r2 % 87
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L2b0
        L2d4:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 * 53
            int r0 = r0 >> 112
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
        L2dc:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 3655(0xe47, float:5.122E-42)
            int r0 = r0 % 126
            r0 = r0 ^ 4289(0x10c1, float:6.01E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L2d4
        L2e7:
            r0 = r4
            goto L323
        L2e9:
            java.lang.String r3 = "IyIiJEL{xZK[gFJNZPgwy"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L53e
            int r14 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            if (r14 > r6) goto L30c
        L2f3:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 481
            if (r2 == r7) goto L304
            r3 = 144(0x90, float:2.02E-43)
            if (r2 == r3) goto L2fe
            goto L2f3
        L2fe:
            int r0 = r0 + r0
            r0 = r0 ^ 4311(0x10d7, float:6.041E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L2f3
        L304:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 % 121
            int r0 = r0 * r5
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L304
        L30c:
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L322
            r0 = 0
            goto L323
        L314:
            java.lang.String r3 = "nuPZNCrwcF"
            java.lang.String r3 = QfgSZK.GCXiNH.fsw(r3)     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L322
            r0 = r13
            goto L323
        L322:
            r0 = -1
        L323:
            if (r0 == 0) goto L522
            if (r0 == r7) goto L4a6
            r3 = 2
            if (r0 == r3) goto L43a
            if (r0 == r11) goto L411
            if (r0 == r4) goto L382
            if (r0 == r13) goto L333
            r4 = 0
            goto L539
        L333:
            java.lang.String r0 = r1.irBrEI     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L37e
            boolean r0 = QfgSZK.UPbYzn.dTTfOR(r0)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L538
            java.lang.String r0 = r1.irBrEI     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r3 = r3 ^ 6933(0x1b15, float:9.715E-42)
            if (r3 == 0) goto L378
        L345:
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r4 = r3 + 390
            if (r4 == r10) goto L369
            r5 = 264(0x108, float:3.7E-43)
            if (r4 == r5) goto L360
            r5 = 378(0x17a, float:5.3E-43)
            if (r4 == r5) goto L358
            r3 = 480(0x1e0, float:6.73E-43)
            if (r4 == r3) goto L36f
            goto L345
        L358:
            int r4 = r3 >> 23
            r4 = r4 ^ 5153(0x1421, float:7.221E-42)
            int r4 = r4 + r3
            QfgSZK.DPHsZd.Jxv = r4     // Catch: java.lang.Throwable -> L53e
            goto L378
        L360:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 >> 78
            r0 = r0 ^ 1374(0x55e, float:1.925E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L360
        L369:
            r0 = r3 ^ 5209(0x1459, float:7.3E-42)
            int r0 = r0 * 107
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
        L36f:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 >> 7
            int r0 = r0 * 90
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L36f
        L378:
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L53e
            if (r0 != 0) goto L538
        L37e:
            r1.irBrEI = r2     // Catch: java.lang.Throwable -> L53e
            goto L536
        L382:
            java.lang.String r0 = r1.dnzOAG     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L3ec
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r3 = r3 ^ 6933(0x1b15, float:9.715E-42)
            if (r3 == 0) goto L3a6
        L38c:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 364
            r3 = 81
            if (r2 == r3) goto L3a0
            r0 = 164(0xa4, float:2.3E-43)
            if (r2 == r0) goto L399
            goto L38c
        L399:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 * 909
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L399
        L3a0:
            r0 = r0 ^ 3345(0xd11, float:4.687E-42)
            int r0 = r0 % r10
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L38c
        L3a6:
            boolean r0 = QfgSZK.UPbYzn.dTTfOR(r0)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L538
            java.lang.String r0 = r1.dnzOAG     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r3 = r3 ^ 6933(0x1b15, float:9.715E-42)
            if (r3 == 0) goto L3e6
        L3b4:
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r4 = r3 + 702
            r5 = 11
            if (r4 == r5) goto L3dd
            r5 = 92
            if (r4 == r5) goto L3d4
            r5 = 219(0xdb, float:3.07E-43)
            if (r4 == r5) goto L3ce
            r5 = 297(0x129, float:4.16E-43)
            if (r4 == r5) goto L3c9
            goto L3b4
        L3c9:
            int r3 = r3 + r3
            int r3 = r3 >> r15
            QfgSZK.DPHsZd.Jxv = r3     // Catch: java.lang.Throwable -> L53e
            goto L3e6
        L3ce:
            int r3 = r3 % 90
            int r3 = r3 * 77
            QfgSZK.DPHsZd.Jxv = r3     // Catch: java.lang.Throwable -> L53e
        L3d4:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 * 1900
            int r0 = r0 >> 10
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L3d4
        L3dd:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 >> 121
            r0 = r0 ^ 1192(0x4a8, float:1.67E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L3dd
        L3e6:
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L53e
            if (r0 != 0) goto L538
        L3ec:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            if (r0 > r6) goto L40d
        L3f0:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r3 = r0 + 767
            r4 = 53
            if (r3 == r4) goto L403
            if (r3 == r8) goto L3fb
            goto L3f0
        L3fb:
            int r3 = r0 >> 45
            int r3 = r3 + r0
            int r0 = r3 >> 63
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L40d
        L403:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 >> r8
            r0 = r0 ^ 2088(0x828, float:2.926E-42)
            int r0 = r0 % 43
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L403
        L40d:
            r1.dnzOAG = r2     // Catch: java.lang.Throwable -> L53e
            goto L536
        L411:
            java.lang.String r0 = r1.RSKqwx     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L436
            boolean r0 = QfgSZK.UPbYzn.dTTfOR(r0)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L538
            java.lang.String r0 = r1.RSKqwx     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            if (r3 > r12) goto L430
        L421:
            int r3 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r4 = r3 + 403
            if (r4 == r7) goto L428
            goto L421
        L428:
            int r3 = r3 * 7
            int r3 = r3 % 6
            int r3 = r3 % 15
            QfgSZK.DPHsZd.dTU = r3     // Catch: java.lang.Throwable -> L53e
        L430:
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L53e
            if (r0 != 0) goto L538
        L436:
            r1.RSKqwx = r2     // Catch: java.lang.Throwable -> L53e
            goto L536
        L43a:
            java.lang.String r0 = r1.zOaCsY     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L47d
            boolean r0 = QfgSZK.UPbYzn.dTTfOR(r0)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L538
            java.lang.String r0 = r1.zOaCsY     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L53e
            int r3 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            if (r3 > r6) goto L47b
        L44e:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 299
            r3 = 96
            if (r2 == r3) goto L471
            r3 = 240(0xf0, float:3.36E-43)
            if (r2 == r3) goto L469
            r0 = 427(0x1ab, float:5.98E-43)
            if (r2 == r0) goto L45f
            goto L44e
        L45f:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 4210(0x1072, float:5.9E-42)
            r2 = 181(0xb5, float:2.54E-43)
            int r0 = r0 >> r2
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L45f
        L469:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 % 22
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L469
        L471:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 + r0
            int r2 = r2 % 17
            r2 = r2 ^ 5001(0x1389, float:7.008E-42)
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L471
        L47b:
            if (r0 != 0) goto L538
        L47d:
            r1.zOaCsY = r2     // Catch: java.lang.Throwable -> L53e
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            if (r0 > r6) goto L49d
        L483:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 819
            if (r2 == r9) goto L497
            r3 = 266(0x10a, float:3.73E-43)
            if (r2 == r3) goto L48e
            goto L483
        L48e:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r3 = 23
            int r2 = r2 >> r3
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L48e
        L497:
            int r0 = r0 >> 109
            r0 = r0 ^ 4922(0x133a, float:6.897E-42)
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
        L49d:
            r1.zLAIeZ = r7     // Catch: java.lang.Throwable -> L53e
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 1826(0x722, float:2.559E-42)
            if (r0 == 0) goto L538
            goto L4e5
        L4a6:
            java.lang.String r0 = r1.zSULAs     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L4b8
            boolean r0 = QfgSZK.UPbYzn.dTTfOR(r0)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L538
            java.lang.String r0 = r1.zSULAs     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L53e
            if (r0 != 0) goto L538
        L4b8:
            r1.zSULAs = r2     // Catch: java.lang.Throwable -> L53e
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L4dd
        L4c0:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 754
            r3 = 28
            if (r2 == r3) goto L4d4
            if (r2 == r5) goto L4cb
            goto L4c0
        L4cb:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 + r0
            int r2 = r2 * 77
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L4cb
        L4d4:
            int r2 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r2 >> 107
            int r2 = r2 + r0
            int r2 = r2 + r0
            QfgSZK.DPHsZd.Jxv = r2     // Catch: java.lang.Throwable -> L53e
            goto L4d4
        L4dd:
            r1.zLAIeZ = r7     // Catch: java.lang.Throwable -> L53e
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 1826(0x722, float:2.559E-42)
            if (r0 == 0) goto L538
        L4e5:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            int r0 = r0 + 234
            r2 = 23
            if (r0 == r2) goto L4ee
            goto L4e5
        L4ee:
            int r0 = QfgSZK.DPHsZd.dTU     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 124(0x7c, float:1.74E-43)
            QfgSZK.DPHsZd.dTU = r0     // Catch: java.lang.Throwable -> L53e
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r0 = r0 ^ 6933(0x1b15, float:9.715E-42)
            if (r0 == 0) goto L4ee
        L4fa:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            int r2 = r0 + 546
            r3 = 55
            if (r2 == r3) goto L51a
            r3 = 177(0xb1, float:2.48E-43)
            if (r2 == r3) goto L513
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 == r3) goto L50b
            goto L4fa
        L50b:
            int r0 = r0 + r0
            int r0 = r0 * 34
            int r0 = r0 % 22
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L4fa
        L513:
            r0 = r0 ^ 2071(0x817, float:2.902E-42)
            int r0 = r0 % 113
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L4ee
        L51a:
            int r0 = QfgSZK.DPHsZd.Jxv     // Catch: java.lang.Throwable -> L53e
            r2 = 143(0x8f, float:2.0E-43)
            int r0 = r0 >> r2
            QfgSZK.DPHsZd.Jxv = r0     // Catch: java.lang.Throwable -> L53e
            goto L51a
        L522:
            java.lang.String r0 = r1.aYGmbG     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L534
            boolean r0 = QfgSZK.UPbYzn.dTTfOR(r0)     // Catch: java.lang.Throwable -> L53e
            if (r0 == 0) goto L538
            java.lang.String r0 = r1.aYGmbG     // Catch: java.lang.Throwable -> L53e
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L53e
            if (r0 != 0) goto L538
        L534:
            r1.aYGmbG = r2     // Catch: java.lang.Throwable -> L53e
        L536:
            r1.zLAIeZ = r7     // Catch: java.lang.Throwable -> L53e
        L538:
            r4 = r7
        L539:
            monitor-exit(r16)
            return r4
        L53b:
            monitor-exit(r16)
            r0 = 0
            return r0
        L53e:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DPHsZd.ihnvzI(java.lang.String, java.lang.String):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x005c) to fix multi-entry loop: BACK_EDGE: B:24:0x005c -> B:25:0x005f */
    public void reset() {
        int i;
        int i2;
        this.fqVTOY = 0L;
        int i3 = Jxv;
        if (i3 <= 6932) {
            while (true) {
                i2 = Jxv;
                int i4 = i2 + 52;
                if (i4 == 23) {
                    break;
                } else if (i4 == 47) {
                    Jxv = (i2 >> 98) * 8352;
                }
            }
            while (true) {
                Jxv = ((Jxv >> 89) * 94) + i2;
            }
        } else {
            this.UnJFsM = 0L;
            this.irBrEI = null;
            this.EESEk = 0;
            if (i3 > 6932) {
                this.dnzOAG = null;
                this.zSULAs = null;
                this.zOaCsY = null;
                this.RSKqwx = null;
                this.aYGmbG = null;
                return;
            }
            while (true) {
                i = Jxv;
                int i5 = i + 39;
                if (i5 == 65) {
                    Jxv = ((i % 89) >> 47) + i;
                    break;
                }
                if (i5 != 133) {
                    if (i5 == 166) {
                        Jxv = ((i % 18) + i) ^ 2266;
                    } else if (i5 == 207) {
                        break;
                    }
                }
                Jxv = ((Jxv >> 29) % 44) ^ 4226;
            }
            while (true) {
                Jxv = (Jxv ^ 2816) + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:14:0x0028) to fix multi-entry loop: BACK_EDGE: B:14:0x0028 -> B:15:0x002a */
    public boolean zLAIeZ(long j, long j2, String str, int i) {
        int i2;
        int i3;
        if (j == this.fqVTOY && j2 == this.UnJFsM) {
            boolean zEquals = str.equals(this.irBrEI);
            if (Jxv <= 6932) {
                while (true) {
                    int i4 = Jxv;
                    int i5 = i4 + 26;
                    if (i5 == 37) {
                        Jxv = (i4 + i4) ^ 4091;
                        break;
                    }
                    if (i5 == 125) {
                        break;
                    }
                }
                while (true) {
                    Jxv = (Jxv >> 14) % 90;
                }
            } else if (zEquals && i == this.EESEk) {
                return false;
            }
        }
        if (dTU > 1825) {
            return true;
        }
        if ((Jxv ^ 6933) != 0) {
            while (true) {
                int i6 = Jxv;
                int i7 = i6 + 39;
                if (i7 == 49) {
                    Jxv = ((i6 ^ 3266) + i6) >> 100;
                    break;
                }
                if (i7 == 184) {
                    Jxv = (i6 * 45) + i6;
                    break;
                }
            }
        }
        while (true) {
            i2 = dTU;
            int i8 = i2 + 39;
            if (i8 == 38) {
                break;
            }
            if (i8 == 146) {
                dTU = ((i2 % 82) + i2) >> 58;
                if (Jxv <= 6932) {
                    do {
                        i3 = Jxv;
                    } while (i3 + 52 != 50);
                    Jxv = ((i3 * 44) ^ 3359) % 44;
                }
            }
        }
        while (true) {
            dTU = ((dTU + i2) + i2) ^ 1032;
        }
    }
}
