package QfgSZK;

import android.content.Context;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
class SaJVGb {
    public static int ChC = 4515;
    private static String DlIaRS;
    static String RRruKh;
    static String aJsTYe;
    static String aNCmdB;
    private static String aWCCDg;
    public static int cYB;
    private static String dvwgrt;
    static String faUTYO;
    static String hAYYdS;
    static String iBieBA;
    private boolean OFQuKP;
    Object ONLQiq;
    private boolean QTtQrx;
    private String RfqgtW;
    private String RsugpR;
    Object deDbSP;
    Object dicSHd;
    Object fgIkfx;
    Object fjapMg;
    Object iinWke;
    private Object zMEiwl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        FQMcgE.usN = 6842;
        cYB = 6259;
        GCXiNH.OHr = 2270;
        dvwgrt = GCXiNH.fsw("ICnI");
        aWCCDg = GCXiNH.fsw("SPoE}t^\\@gahom");
        hAYYdS = GCXiNH.fsw("P^\u007fYgt^JUxg|z{ga\u007fy}}u");
        aNCmdB = GCXiNH.fsw("P^\u007fYgt^JUxg|z{ga\u007fy}}uns`psyxnpwyu");
        RRruKh = GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb");
        aJsTYe = GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs");
        faUTYO = GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie");
        if ((ChC ^ 4515) != 0) {
            while (true) {
                i = ChC;
                int i2 = i + 26;
                if (i2 == 55) {
                    while (true) {
                        ChC = ((ChC * 3) % 19) ^ 4718;
                    }
                } else if (i2 == 222) {
                    ChC = ((i % 24) >> 109) * 103;
                    break;
                } else if (i2 == 237) {
                    break;
                }
            }
            ChC = (ChC >> 64) + i;
        }
        iBieBA = GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg");
        DlIaRS = FQMcgE.hfdhUn(SaJVGb.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:13:0x003e) to fix multi-entry loop: BACK_EDGE: B:12:0x0039 -> B:13:0x003e */
    public SaJVGb(Object obj, String str) {
        int i;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            this.iinWke = map.get(GCXiNH.fsw("p~_yGTHp\u007f\\CMIL"));
            this.ONLQiq = map.get(GCXiNH.fsw("ztOXRAdVmFFOO["));
            if (ChC <= 4514) {
                while (true) {
                    i = ChC;
                    int i2 = i + 65;
                    if (i2 != 83) {
                        if (i2 == 222) {
                            ChC = (i ^ 4171) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    ChC = (ChC % 49) + i;
                }
            } else {
                this.deDbSP = map.get(GCXiNH.fsw("~~UjBVtli`CMNEMU"));
                this.zMEiwl = map.get(GCXiNH.fsw("neZ~_u`jmkMOFLKS_ZZ{S_TC[O"));
                this.dicSHd = map.get(GCXiNH.fsw("~pUoN]I\u007fbLNFX"));
                this.fjapMg = map.get(GCXiNH.fsw("p~_yGTL{xIFB^H`FXQXV@"));
                if (ChC <= 4514) {
                    while (true) {
                        int i3 = ChC;
                        int i4 = i3 + 39;
                        if (i4 == 55) {
                            break;
                        } else if (i4 == 126) {
                            ChC = ((i3 % 102) >> 25) ^ 4141;
                        }
                    }
                    while (true) {
                        ChC = ((ChC >> 32) ^ 4650) % 4;
                    }
                } else {
                    this.fgIkfx = map.get(GCXiNH.fsw("ztOHN_h{hxGQG@[T_ZZ@zP^KRXN"));
                }
            }
        }
        this.OFQuKP = false;
        this.QTtQrx = false;
        this.RsugpR = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OFQuKP() {
        return this.OFQuKP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Long OHqIaq(int i) {
        long jLongValue;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList(1);
        if (fruYXx(this.fjapMg)) {
            ikcuIV((Method) this.fjapMg, true, Integer.valueOf(i), arrayList);
        }
        if (arrayList.isEmpty()) {
            jLongValue = 0;
        } else {
            jLongValue = ((Long) arrayList.get(0)).longValue();
            if (cYB <= 6258) {
                do {
                    int i5 = cYB;
                    i2 = i5 + 39;
                    if (i2 == 74) {
                        while (true) {
                            cYB = (cYB + i5) ^ 3379;
                        }
                    } else if (i2 == 99) {
                        cYB = (i5 + i5) % 19;
                        if (ChC <= 4514) {
                            while (true) {
                                int i6 = ChC;
                                int i7 = i6 + 39;
                                if (i7 != 43) {
                                    if (i7 == 117) {
                                        ChC = (i6 * 108) >> 33;
                                        break;
                                    }
                                    if (i7 == 227) {
                                        ChC = (i6 >> 69) + i6 + i6;
                                    } else if (i7 == 372) {
                                        ChC = ((i6 * 13) % 105) + i6;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                ChC ^= 1446;
                            }
                        }
                    }
                } while (i2 != 232);
                while (true) {
                    cYB = (cYB % 39) * 57;
                    if (ChC <= 4514) {
                        do {
                            int i8 = ChC;
                            i3 = i8 + 91;
                            if (i3 == 55) {
                                i4 = ((i8 % 123) ^ 3654) * 109;
                            } else if (i3 == 243) {
                                while (true) {
                                    ChC = ((ChC >> 102) ^ 5267) % 60;
                                }
                            } else if (i3 == 370) {
                                i4 = (i8 + i8) * 23;
                            }
                            ChC = i4;
                        } while (i3 != 425);
                        while (true) {
                            ChC = (ChC % 23) * 8;
                        }
                    }
                }
            }
        }
        return Long.valueOf(jLongValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OhRmUC(Context context, Map<String, Object> map) {
        if (!fruYXx(this.deDbSP)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(1);
        ikcuIV((Method) this.deDbSP, true, context, map, arrayList);
        if (arrayList.isEmpty()) {
            return false;
        }
        String str = (String) arrayList.get(0);
        this.RfqgtW = str;
        if (!str.equals(GCXiNH.fsw("ICnI")) && !this.RfqgtW.equals(GCXiNH.fsw("SPoE}t^\\@gahom"))) {
            return false;
        }
        if ((cYB ^ 6259) == 0) {
            return true;
        }
        while (cYB + 65 != 96) {
        }
        while (true) {
            cYB = (cYB * 3) ^ 1269;
            if ((ChC ^ 4515) != 0) {
                while (true) {
                    int i = ChC;
                    int i2 = i + 91;
                    if (i2 == 89) {
                        ChC = ((i % 56) + i) % WalletImportError.ERROR_CODE_AA_EXIST;
                        break;
                    }
                    if (i2 == 227) {
                        break;
                    }
                }
                ChC = (ChC >> 60) ^ 2907;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Set<String> QSLkRj() {
        HashSet hashSet = new HashSet();
        if (fruYXx(this.fgIkfx)) {
            ikcuIV((Method) this.fgIkfx, true, hashSet);
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean QTtQrx() {
        return this.QTtQrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void RJOkX() {
        if (fruYXx(this.dicSHd)) {
            ikcuIV((Method) this.dicSHd, true, new Object[0]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:75:0x0111) to fix multi-entry loop: BACK_EDGE: B:74:0x0108 -> B:75:0x0111 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public boolean aJZHYI() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.iinWke
            if (r0 == 0) goto L11b
            java.lang.Object r0 = r4.ONLQiq
            boolean r0 = r4.fruYXx(r0)
            if (r0 == 0) goto L11b
            java.lang.Object r0 = r4.deDbSP
            boolean r0 = r4.fruYXx(r0)
            if (r0 == 0) goto L11b
            int r0 = QfgSZK.SaJVGb.ChC
            r1 = 4514(0x11a2, float:6.325E-42)
            if (r0 > r1) goto L32
        L1a:
            int r0 = QfgSZK.SaJVGb.ChC
            int r2 = r0 + 130
            r3 = 37
            if (r2 == r3) goto L2d
            r3 = 60
            if (r2 == r3) goto L27
            goto L1a
        L27:
            r2 = r0 ^ 5871(0x16ef, float:8.227E-42)
            int r2 = r2 + r0
            QfgSZK.SaJVGb.ChC = r2
            goto L1a
        L2d:
            int r0 = r0 + r0
            int r0 = r0 % 100
            QfgSZK.SaJVGb.ChC = r0
        L32:
            java.lang.Object r0 = r4.zMEiwl
            boolean r0 = r4.fruYXx(r0)
            if (r0 == 0) goto L11b
            java.lang.Object r0 = r4.dicSHd
            boolean r0 = r4.fruYXx(r0)
            if (r0 == 0) goto L11b
            int r0 = QfgSZK.SaJVGb.ChC
            if (r0 > r1) goto L7c
        L46:
            int r0 = QfgSZK.SaJVGb.ChC
            int r1 = r0 + 117
            r2 = 82
            if (r1 == r2) goto L63
            r2 = 260(0x104, float:3.64E-43)
            if (r1 == r2) goto L5b
            r2 = 285(0x11d, float:4.0E-43)
            if (r1 == r2) goto L75
            r2 = 346(0x15a, float:4.85E-43)
            if (r1 == r2) goto L6b
            goto L46
        L5b:
            int r0 = r0 + r0
            int r0 = r0 % 97
            int r0 = r0 * 69
            QfgSZK.SaJVGb.ChC = r0
            goto L46
        L63:
            int r1 = r0 >> 103
            r1 = r1 ^ 2567(0xa07, float:3.597E-42)
            int r1 = r1 % 23
            QfgSZK.SaJVGb.ChC = r1
        L6b:
            int r1 = QfgSZK.SaJVGb.ChC
            r1 = r1 ^ 3131(0xc3b, float:4.387E-42)
            int r1 = r1 * 4
            r1 = r1 ^ 4376(0x1118, float:6.132E-42)
            QfgSZK.SaJVGb.ChC = r1
        L75:
            int r1 = QfgSZK.SaJVGb.ChC
            r1 = r1 ^ 3337(0xd09, float:4.676E-42)
            int r1 = r1 + r0
            QfgSZK.SaJVGb.ChC = r1
        L7c:
            java.lang.Object r0 = r4.fjapMg
            boolean r0 = r4.fruYXx(r0)
            if (r0 == 0) goto L11b
            java.lang.Object r0 = r4.fgIkfx
            boolean r0 = r4.fruYXx(r0)
            if (r0 == 0) goto L11b
            int r0 = QfgSZK.SaJVGb.cYB
            r1 = 6258(0x1872, float:8.77E-42)
            if (r0 > r1) goto L119
            int r0 = QfgSZK.SaJVGb.ChC
            r0 = r0 ^ 4515(0x11a3, float:6.327E-42)
            if (r0 == 0) goto Lc1
        L98:
            int r0 = QfgSZK.SaJVGb.ChC
            int r1 = r0 + 52
            r2 = 2
            if (r1 == r2) goto Lb7
            r2 = 199(0xc7, float:2.79E-43)
            if (r1 == r2) goto Lb0
            r2 = 310(0x136, float:4.34E-43)
            if (r1 == r2) goto La8
            goto L98
        La8:
            int r1 = r0 >> 108
            int r1 = r1 + r0
            int r1 = r1 >> 90
            QfgSZK.SaJVGb.ChC = r1
            goto Lb7
        Lb0:
            r0 = r0 ^ 4285(0x10bd, float:6.005E-42)
            int r0 = r0 >> 105
            r0 = r0 ^ 5353(0x14e9, float:7.501E-42)
            goto Lbe
        Lb7:
            int r1 = QfgSZK.SaJVGb.ChC
            int r1 = r1 + r0
            r0 = r1 ^ 3826(0xef2, float:5.361E-42)
            int r0 = r0 * 58
        Lbe:
            QfgSZK.SaJVGb.ChC = r0
            goto L98
        Lc1:
            int r0 = QfgSZK.SaJVGb.cYB
            int r1 = r0 + 26
            r2 = 54
            if (r1 == r2) goto Ld6
            r2 = 177(0xb1, float:2.48E-43)
            if (r1 == r2) goto Lce
            goto Lc1
        Lce:
            int r1 = QfgSZK.SaJVGb.cYB
            int r1 = r1 >> 93
            int r1 = r1 + r0
            QfgSZK.SaJVGb.cYB = r1
            goto Lce
        Ld6:
            int r1 = QfgSZK.SaJVGb.cYB
            int r1 = r1 * 73
            int r1 = r1 + r0
            QfgSZK.SaJVGb.cYB = r1
            int r1 = QfgSZK.SaJVGb.ChC
            r1 = r1 ^ 4515(0x11a3, float:6.327E-42)
            if (r1 == 0) goto Ld6
        Le3:
            int r1 = QfgSZK.SaJVGb.ChC
            int r0 = r1 + 65
            r2 = 45
            if (r0 == r2) goto L100
            r2 = 65
            if (r0 == r2) goto Lf8
            r2 = 137(0x89, float:1.92E-43)
            if (r0 == r2) goto L108
            r2 = 244(0xf4, float:3.42E-43)
            if (r0 == r2) goto L111
            goto Le3
        Lf8:
            int r0 = QfgSZK.SaJVGb.ChC
            int r0 = r0 + r1
            int r0 = r0 + r1
            int r0 = r0 + r1
            QfgSZK.SaJVGb.ChC = r0
            goto Lf8
        L100:
            int r0 = QfgSZK.SaJVGb.ChC
            int r0 = r0 + r1
            int r0 = r0 >> 13
            int r0 = r0 + r1
            QfgSZK.SaJVGb.ChC = r0
        L108:
            int r0 = QfgSZK.SaJVGb.ChC
            int r0 = r0 * 24
            int r0 = r0 + r1
            int r0 = r0 >> 3
            QfgSZK.SaJVGb.ChC = r0
        L111:
            int r0 = QfgSZK.SaJVGb.ChC
            r2 = 167(0xa7, float:2.34E-43)
            int r0 = r0 >> r2
            QfgSZK.SaJVGb.ChC = r0
            goto L100
        L119:
            r0 = 1
            goto L11c
        L11b:
            r0 = 0
        L11c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.SaJVGb.aJZHYI():boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void dXhJGx(boolean z) {
        this.OFQuKP = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fruYXx(Object obj) {
        return obj instanceof Method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String gAnGwV() {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList(1);
        if (fruYXx(this.ONLQiq)) {
            ikcuIV((Method) this.ONLQiq, true, arrayList);
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        String str = (String) arrayList.get(0);
        if ((cYB ^ 6259) == 0) {
            return str;
        }
        if (ChC <= 4514) {
            while (true) {
                int i3 = ChC;
                int i4 = i3 + 52;
                if (i4 == 10) {
                    break;
                }
                if (i4 == 92) {
                    ChC = ((i3 ^ 2772) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) % WebSocketProtocol.PAYLOAD_SHORT;
                }
            }
            while (true) {
                ChC = ((ChC >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 75) ^ 1881;
            }
        } else {
            while (cYB + 39 != 22) {
            }
            while (true) {
                cYB = ((cYB * 19) % 48) * 3;
                if (ChC <= 4514) {
                    do {
                        i = ChC;
                        i2 = i + 65;
                        if (i2 == 83) {
                            break;
                        }
                    } while (i2 != 228);
                    ChC = ((i % 96) * 33) % 96;
                }
            }
            while (true) {
                ChC = ((ChC % 44) >> 15) ^ 3571;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hCiIDQ() {
        String str = this.RfqgtW;
        if (str == null) {
            return false;
        }
        return str.equals(GCXiNH.fsw("SPoE}t^\\@gahom"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void haRtnV(boolean z) {
        this.QTtQrx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (QfgSZK.SaJVGb.ChC <= 4514) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        r6 = QfgSZK.SaJVGb.cYB;
        r0 = r6 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r0 == 40) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r0 == 115) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r0 == 203) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r0 == 369) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        QfgSZK.SaJVGb.cYB = (r6 >> 18) ^ 654;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (QfgSZK.SaJVGb.ChC > 4514) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r6 = QfgSZK.SaJVGb.ChC;
        r7 = r6 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r7 == 33) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r7 == 74) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        QfgSZK.SaJVGb.ChC = (QfgSZK.SaJVGb.ChC >> 63) % 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        QfgSZK.SaJVGb.ChC = ((r6 * 108) ^ 5323) % 85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        QfgSZK.SaJVGb.cYB = ((r6 + r6) * 17) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (QfgSZK.SaJVGb.ChC > 4514) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        r6 = QfgSZK.SaJVGb.ChC + 104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r6 == 94) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r6 == 271) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
    
        if (r6 == 343) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
    
        QfgSZK.SaJVGb.ChC = ((QfgSZK.SaJVGb.ChC ^ 3430) * 40) ^ 1275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:
    
        QfgSZK.SaJVGb.ChC = ((QfgSZK.SaJVGb.ChC ^ 5115) * 57) ^ 3921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        QfgSZK.SaJVGb.ChC = (QfgSZK.SaJVGb.ChC % 33) >> 120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        QfgSZK.SaJVGb.cYB = ((QfgSZK.SaJVGb.cYB % 80) ^ 4859) * 54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (QfgSZK.SaJVGb.ChC > 4514) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        r6 = QfgSZK.SaJVGb.ChC;
        r0 = r6 + 65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ba, code lost:
    
        if (r0 == 27) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r0 == 176) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c2, code lost:
    
        if (r0 == 284) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        if (r0 == 319) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c9, code lost:
    
        QfgSZK.SaJVGb.ChC = (r6 * 25) ^ 7347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        QfgSZK.SaJVGb.ChC = ((r6 % 92) + r6) % 94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        QfgSZK.SaJVGb.ChC = (r6 * com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        QfgSZK.SaJVGb.ChC = ((QfgSZK.SaJVGb.ChC ^ 3235) >> 30) ^ 5462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
    
        QfgSZK.SaJVGb.cYB = ((QfgSZK.SaJVGb.cYB ^ 2304) % 17) * 114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        if ((QfgSZK.SaJVGb.ChC ^ 4515) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f8, code lost:
    
        r6 = QfgSZK.SaJVGb.ChC;
        r0 = r6 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fe, code lost:
    
        if (r0 == 99) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0102, code lost:
    
        if (r0 == 101) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
    
        if (r0 == 171) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
    
        if (r0 == 252) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x010d, code lost:
    
        QfgSZK.SaJVGb.ChC = ((QfgSZK.SaJVGb.ChC ^ 3318) * 123) % 49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0118, code lost:
    
        QfgSZK.SaJVGb.ChC = (r6 * 88) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011f, code lost:
    
        QfgSZK.SaJVGb.ChC = (r6 * 21) ^ 1763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0125, code lost:
    
        QfgSZK.SaJVGb.ChC = (QfgSZK.SaJVGb.ChC % 64) >> 35;
     */
    /* JADX WARN: Path cross not found for [B:98:?, B:89:?], limit reached: 119 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0118 -> B:14:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ikcuIV(Method method, boolean z, Object... objArr) {
        Object obj;
        if (method == null || (obj = this.iinWke) == null) {
            return;
        }
        try {
            AuCTel.iwGUEr(obj, method, objArr);
        } catch (Throwable th) {
            if (z) {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011hpzGIF\n]@B\u0016XQGZ^T\u000fE@"), method.getName());
                if ((cYB ^ 6259) != 0) {
                }
            } else {
                FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("^pU+_\u0011hpzGIF\n]@B\u0016XQGZ^T"));
            }
            ORrpqH.uzCIH().seuMaA(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> sQOHWT(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (fruYXx(this.zMEiwl)) {
            ikcuIV((Method) this.zMEiwl, true, map, map2);
        }
        if (map2.isEmpty()) {
            return null;
        }
        if (ChC > 4514) {
            return map2;
        }
        while (true) {
            int i = ChC;
            int i2 = i + 39;
            if (i2 == 68) {
                ChC = (i >> 80) + i;
                break;
            }
            if (i2 == 83) {
                while (true) {
                    ChC = ((ChC % 59) % 96) + i;
                }
            } else if (i2 == 136) {
                while (true) {
                    ChC = ChC + i + i;
                }
            } else if (i2 == 144) {
                break;
            }
        }
        while (true) {
            ChC = (ChC * 47) >> 9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String zagaMW() {
        return this.RsugpR;
    }
}
