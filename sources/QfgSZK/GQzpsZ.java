package QfgSZK;

import QfgSZK.FQMcgE;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class GQzpsZ {
    static final int ARRAY_LENGTH = 5;
    static final int BSSID_INDEX = 0;
    private static String DlIaRS = null;
    public static int EvO = 0;
    static final int INVALID_TYPE = -99;
    static final int RSSI_INDEX = 2;
    static final int SSID_INDEX = 1;
    static final int TYPE_INDEX = 3;
    static final int VPN_INDEX = 4;
    public static int cmA;
    private String gGamLp;
    private String gdvvxR;
    private String zDvNhw;
    private String dlhqIF = null;
    private String bRwgb = null;
    private String RNqxeV = null;
    private String iedYWY = null;
    private String spnCvw = null;
    private String swNzFA = null;
    private String UrIxFn = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class gQzpsZ {
        public static final gQzpsZ BLUETOOTH;
        public static final gQzpsZ CELLULAR;
        public static final gQzpsZ ETHERNET;
        public static final gQzpsZ MOBILE;
        public static final gQzpsZ MOBILE_DUN;
        public static final gQzpsZ VPN;
        public static final gQzpsZ WIFI;
        private static final /* synthetic */ gQzpsZ[] gkhjaB;
        public static int uOf = 0;
        public static int uUX = 9270;
        final String DbNXlk;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            GCXiNH.OHr = 2270;
            uOf = 6793;
            BLUETOOTH = new gQzpsZ(GCXiNH.fsw("_]nI\u007f~NJD"), 0, GCXiNH.fsw("\u007f}Ni_^njd\bVF^AMU_[S"));
            CELLULAR = new gQzpsZ(GCXiNH.fsw("^Tw@~}@L"), 1, GCXiNH.fsw("~tW`^]`l"));
            MOBILE = new gQzpsZ(GCXiNH.fsw("P^yEgt"), 2, GCXiNH.fsw("p~YeGT"));
            WIFI = new gQzpsZ(GCXiNH.fsw("JX}E"), 3, GCXiNH.fsw("jx]e"));
            ETHERNET = new gQzpsZ(GCXiNH.fsw("XEsIy\u007fDJ"), 4, GCXiNH.fsw("xeSiY_dj"));
            VPN = new gQzpsZ(GCXiNH.fsw("KAu"), 5, GCXiNH.fsw("kaU"));
            MOBILE_DUN = new gQzpsZ(GCXiNH.fsw("P^yEgt^ZYf"), 6, GCXiNH.fsw("p~YeGT^zyF"));
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:67:0x00f1) to fix multi-entry loop: BACK_EDGE: B:67:0x00f1 -> B:68:0x00f3 */
        /* JADX DEBUG: Duplicate block (B:78:0x011a) to fix multi-entry loop: BACK_EDGE: B:78:0x011a -> B:56:0x00d0 */
        /* JADX WARN: Path cross not found for [B:100:?, B:97:?], limit reached: 118 */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00d6 A[EDGE_INSN: B:96:0x00d6->B:58:0x00d6 BREAK  A[LOOP:5: B:56:0x00d0->B:101:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0116 A[EDGE_INSN: B:98:0x0116->B:77:0x0116 BREAK  A[LOOP:8: B:71:0x0105->B:107:?], SYNTHETIC] */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private gQzpsZ(java.lang.String r5, int r6, java.lang.String r7) {
            /*
                r4 = this;
                r4.<init>(r5, r6)
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                r6 = 9269(0x2435, float:1.2989E-41)
                if (r5 > r6) goto L2a
            L9:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r5 = r5 + 13
                r6 = 73
                if (r5 == r6) goto L1f
                r6 = 182(0xb6, float:2.55E-43)
                if (r5 == r6) goto L16
                goto L9
            L16:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r5 = r5 % 122
                int r5 = r5 >> 106
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto L16
            L1f:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                r5 = r5 ^ 3169(0xc61, float:4.441E-42)
                int r5 = r5 % 51
                int r5 = r5 >> 44
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto L1f
            L2a:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uOf
                r5 = r5 ^ 6793(0x1a89, float:9.519E-42)
                if (r5 == 0) goto L11d
            L30:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uOf
                int r7 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                if (r7 > r6) goto L62
            L36:
                int r0 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r5 = r0 + 117
                r6 = 57
                if (r5 == r6) goto L5a
                r6 = 221(0xdd, float:3.1E-43)
                if (r5 == r6) goto L4f
                r6 = 344(0x158, float:4.82E-43)
                if (r5 == r6) goto L47
                goto L36
            L47:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r5 = r5 + r0
                int r5 = r5 >> 5
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto L47
            L4f:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r5 = r5 % 30
                int r5 = r5 * 28
                int r5 = r5 >> 53
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto L4f
            L5a:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r5 = r5 * 1476
                int r5 = r5 + r0
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto L5a
            L62:
                int r0 = r5 + 13
                r1 = 2
                if (r0 == r1) goto Ld0
                r2 = 142(0x8e, float:1.99E-43)
                r3 = 41
                if (r0 == r2) goto L92
                r2 = 222(0xde, float:3.11E-43)
                if (r0 == r2) goto L72
                goto L30
            L72:
                r7 = r7 ^ 9270(0x2436, float:1.299E-41)
                if (r7 == 0) goto L84
            L76:
                int r7 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r0 = r7 + 130
                r2 = 83
                if (r0 == r2) goto L7f
                goto L76
            L7f:
                r7 = r7 ^ 3683(0xe63, float:5.161E-42)
                int r7 = r7 % r3
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r7
            L84:
                int r5 = r5 >> 84
                int r5 = r5 % 18
                r5 = r5 ^ 5429(0x1535, float:7.608E-42)
                QfgSZK.GQzpsZ.gQzpsZ.uOf = r5
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                if (r5 > r6) goto Ld0
                goto L105
            L92:
                int r7 = QfgSZK.GQzpsZ.gQzpsZ.uOf
                int r7 = r7 + r5
                r7 = r7 ^ 7132(0x1bdc, float:9.994E-42)
                QfgSZK.GQzpsZ.gQzpsZ.uOf = r7
                int r7 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                if (r7 > r6) goto L92
            L9d:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r6 = r5 + 52
                if (r6 == r3) goto Lc8
                r7 = 154(0x9a, float:2.16E-43)
                if (r6 == r7) goto Lbd
                r7 = 280(0x118, float:3.92E-43)
                if (r6 == r7) goto Lb5
                r7 = 478(0x1de, float:6.7E-43)
                if (r6 == r7) goto Lb0
                goto L9d
            Lb0:
                r6 = r5 ^ 3439(0xd6f, float:4.819E-42)
                int r6 = r6 + r5
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r6
            Lb5:
                int r6 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r6 = r6 >> 114
                int r6 = r6 + r5
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r6
                goto L9d
            Lbd:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r5 = r5 * 115
                int r5 = r5 >> 70
                r5 = r5 ^ 3922(0xf52, float:5.496E-42)
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto Lbd
            Lc8:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                r5 = r5 ^ 4866(0x1302, float:6.819E-42)
                int r5 = r5 >> r1
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto Lc8
            Ld0:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uOf
                int r7 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                if (r7 > r6) goto Lfb
            Ld6:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r6 = r5 + 78
                r7 = 95
                if (r6 == r7) goto Lef
                r7 = 213(0xd5, float:2.98E-43)
                if (r6 == r7) goto Lf3
                r7 = 282(0x11a, float:3.95E-43)
                if (r6 == r7) goto Le7
                goto Ld6
            Le7:
                int r6 = r5 + r5
                int r6 = r6 * 16
                int r6 = r6 + r5
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r6
                goto Lf3
            Lef:
                int r5 = r5 * 5984
            Lf1:
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
            Lf3:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                r5 = r5 ^ 1322(0x52a, float:1.853E-42)
                r6 = 192(0xc0, float:2.69E-43)
                int r5 = r5 >> r6
                goto Lf1
            Lfb:
                r5 = r5 ^ 4972(0x136c, float:6.967E-42)
                int r5 = r5 % 25
                r5 = r5 ^ 3339(0xd0b, float:4.679E-42)
                QfgSZK.GQzpsZ.gQzpsZ.uOf = r5
                if (r7 > r6) goto Ld0
            L105:
                int r5 = QfgSZK.GQzpsZ.gQzpsZ.uUX
                int r7 = r5 + 39
                if (r7 == r1) goto L116
                r0 = 118(0x76, float:1.65E-43)
                if (r7 == r0) goto L110
                goto L105
            L110:
                r7 = r5 ^ 2556(0x9fc, float:3.582E-42)
                int r7 = r7 + r5
                int r5 = r7 >> 64
                goto L11a
            L116:
                r5 = r5 ^ 4085(0xff5, float:5.724E-42)
                int r5 = r5 % 36
            L11a:
                QfgSZK.GQzpsZ.gQzpsZ.uUX = r5
                goto Ld0
            L11d:
                r4.DbNXlk = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: QfgSZK.GQzpsZ.gQzpsZ.<init>(java.lang.String, int, java.lang.String):void");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            QfgSZK.GQzpsZ.gQzpsZ.uUX = (QfgSZK.GQzpsZ.gQzpsZ.uUX % 32) >> 90;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ gQzpsZ[] gEmmrt() {
            gQzpsZ[] gqzpszArr = new gQzpsZ[7];
            gqzpszArr[0] = BLUETOOTH;
            gqzpszArr[1] = CELLULAR;
            gqzpszArr[2] = MOBILE;
            if (uUX <= 9269) {
                while (true) {
                    int i = uUX;
                    int i2 = i + 13;
                    if (i2 == 43) {
                        uUX = (i % 12) * 7176;
                        break;
                    }
                    if (i2 == 223) {
                        break;
                    }
                    if (i2 == 233) {
                        uUX = (i ^ 1897) % 55;
                    } else if (i2 == 253) {
                        uUX = (i % 19) + i;
                        break;
                    }
                }
            }
            gqzpszArr[3] = WIFI;
            gqzpszArr[4] = ETHERNET;
            gqzpszArr[5] = VPN;
            gqzpszArr[6] = MOBILE_DUN;
            return gqzpszArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static gQzpsZ valueOf(String str) {
            return (gQzpsZ) Enum.valueOf(gQzpsZ.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static gQzpsZ[] values() {
            return (gQzpsZ[]) gkhjaB.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getValue() {
            return this.DbNXlk;
        }
    }

    public static class sQwTVT {
        public static int OhL = 4013;
        public static int RvP = 2924;
        String QQOvnj;
        final InetAddress[] cOMPQ;
        String gkmLqh;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public sQwTVT(String str, String str2, InetAddress[] inetAddressArr) {
            this.QQOvnj = str;
            if (RvP > 2923) {
                this.gkmLqh = str2;
                this.cOMPQ = inetAddressArr;
                return;
            }
            while (true) {
                int i = RvP;
                int i2 = i + 13;
                if (i2 == 97) {
                    while (true) {
                        RvP = (RvP % 120) * 13;
                    }
                } else if (i2 == 271) {
                    while (true) {
                        RvP = ((RvP ^ 1981) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 4;
                    }
                } else if (i2 == 460) {
                    RvP = (i % 123) % 78;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:15:0x0041) to fix multi-entry loop: BACK_EDGE: B:14:0x0037 -> B:15:0x0041 */
    static {
        int i;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        cmA = 8334;
        FQMcgE.usN = 6842;
        EvO = 3306;
        if ((8334 ^ cmA) == 0) {
            GCXiNH.OHr = 2270;
            DlIaRS = FQMcgE.hfdhUn(GQzpsZ.class);
            return;
        }
        do {
            int i2 = cmA;
            i = i2 + 13;
            if (i != 94) {
                if (i != 258) {
                    if (i == 330) {
                        cmA = ((cmA + i2) * 89) + i2;
                    }
                }
                while (true) {
                    cmA = ((cmA ^ 4444) % 105) * 16;
                    cmA = ((cmA + i2) * 89) + i2;
                }
            } else {
                while (true) {
                    cmA >>= 109;
                }
            }
        } while (i != 507);
        while (true) {
            cmA = (cmA >> 64) ^ 4262;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GQzpsZ() {
        int i;
        int i2;
        int i3;
        this.gdvvxR = null;
        this.gGamLp = null;
        this.zDvNhw = null;
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        TreeMap treeMap3 = new TreeMap();
        sQwTVT[] sqwtvtArrDTwDnp = AxsJAY.DTwDnp();
        if (sqwtvtArrDTwDnp == null || sqwtvtArrDTwDnp.length <= 0) {
            OrsvgJ(treeMap, treeMap2, treeMap3);
        } else {
            int length = sqwtvtArrDTwDnp.length;
            int i4 = 0;
            while (i4 < length) {
                sQwTVT sqwtvt = sqwtvtArrDTwDnp[i4];
                if (UPbYzn.dPaqAf(sqwtvt.gkmLqh)) {
                    treeMap3.put(sqwtvt.gkmLqh, sqwtvt.QQOvnj);
                }
                if (!sqwtvt.QQOvnj.startsWith(GCXiNH.fsw("ydVaR"))) {
                    OzhFjl(sqwtvt.cOMPQ, sqwtvt.QQOvnj, treeMap, treeMap2);
                }
                i4++;
                if (EvO <= 3305) {
                    if (cmA <= 8333) {
                        while (true) {
                            int i5 = cmA;
                            int i6 = i5 + 78;
                            if (i6 == 27) {
                                break;
                            } else if (i6 == 173) {
                                cmA = (i5 + i5) * 1083;
                            }
                        }
                        while (true) {
                            cmA = ((cmA % 7) % 51) % 96;
                        }
                    } else {
                        do {
                            i = EvO;
                            i2 = i + 65;
                            if (i2 == 72) {
                                while (true) {
                                    EvO = EvO + i + i;
                                }
                            }
                        } while (i2 != 124);
                        while (true) {
                            EvO = EvO + i + i;
                            if ((cmA ^ 8334) != 0) {
                                while (true) {
                                    i3 = cmA;
                                    int i7 = i3 + 117;
                                    if (i7 == 8) {
                                        cmA = (i3 % 27) >> 48;
                                    } else if (i7 == 103) {
                                        cmA = (i3 % 45) * 22;
                                        break;
                                    } else if (i7 == 190) {
                                        break;
                                    }
                                }
                            }
                        }
                        while (true) {
                            cmA = (cmA + i3) >> 94;
                        }
                    }
                }
            }
        }
        this.gdvvxR = UPbYzn.hErYDe(treeMap);
        this.gGamLp = UPbYzn.hErYDe(treeMap2, false, -1);
        this.zDvNhw = UPbYzn.hErYDe(treeMap3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void OzhFjl(InetAddress inetAddress, String str, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        if (inetAddress.isLoopbackAddress()) {
            return;
        }
        if (inetAddress instanceof Inet4Address) {
            map.put(inetAddress.getHostAddress(), str);
            return;
        }
        if (inetAddress instanceof Inet6Address) {
            String hostAddress = inetAddress.getHostAddress();
            int iIndexOf = hostAddress.indexOf("%");
            if ((EvO ^ 3306) != 0) {
                if ((cmA ^ 8334) != 0) {
                    while (cmA + 104 != 90) {
                    }
                    while (true) {
                        cmA = (cmA * 2) ^ 2023;
                    }
                } else {
                    while (true) {
                        int i2 = EvO;
                        int i3 = i2 + 65;
                        if (i3 == 27) {
                            EvO = (i2 >> 43) * 29;
                            if (cmA > 8333) {
                                break;
                            }
                        } else if (i3 == 172) {
                            EvO = (i2 >> CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256) % 36;
                            break;
                        } else if (i3 == 267) {
                            EvO = ((i2 ^ 4035) % 4) % 70;
                            if (cmA > 8333) {
                                break;
                            }
                        } else if (i3 == 460) {
                            break;
                        }
                    }
                    do {
                        EvO = (EvO % 8) * 115;
                    } while ((cmA ^ 8334) == 0);
                    while (true) {
                        int i4 = cmA;
                        if (i4 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256 == 97) {
                            cmA = (i4 % 42) + i4;
                        }
                    }
                }
            }
            if (iIndexOf > 0) {
                if ((cmA ^ 8334) != 0) {
                    while (true) {
                        int i5 = cmA;
                        int i6 = i5 + 91;
                        if (i6 == 87) {
                            while (true) {
                                cmA = (cmA ^ 3472) >> 81;
                            }
                        } else if (i6 == 203) {
                            while (true) {
                                cmA = (cmA * 63) % 4;
                            }
                        } else if (i6 == 383) {
                            cmA = ((i5 ^ 1797) >> 85) * 82;
                        }
                    }
                } else {
                    hostAddress = hostAddress.substring(0, iIndexOf);
                }
            }
            if (cmA <= 8333) {
                while (true) {
                    i = cmA;
                    int i7 = i + 65;
                    if (i7 == 93) {
                        break;
                    } else if (i7 == 103) {
                        cmA = ((i % WalletImportError.ERROR_CODE_AA_EXIST) * 2) % 68;
                    }
                }
                cmA = ((i + i) * 104) + i;
            }
            map2.put(hostAddress, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:45:0x00a6) to fix multi-entry loop: BACK_EDGE: B:44:0x009f -> B:45:0x00a6 */
    private void OzhFjl(Enumeration<InetAddress> enumeration, String str, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (enumeration == null) {
            return;
        }
        while (enumeration.hasMoreElements()) {
            if (cmA <= 8333) {
                while (true) {
                    int i6 = cmA;
                    if (i6 + 39 == 42) {
                        cmA = ((i6 * 48) ^ 4620) % 69;
                    }
                }
            } else {
                OzhFjl(enumeration.nextElement(), str, map, map2);
                if (EvO <= 3305) {
                    while (true) {
                        int i7 = EvO;
                        int i8 = i7 + 13;
                        if (i8 != 18) {
                            if (i8 == 79) {
                                EvO = (i7 ^ 1015) * 4;
                                if ((cmA ^ 8334) != 0) {
                                    while (true) {
                                        i = cmA;
                                        int i9 = i + 91;
                                        if (i9 == 93) {
                                            while (true) {
                                                cmA = (cmA % 13) ^ 2251;
                                            }
                                        } else {
                                            if (i9 == 150) {
                                                break;
                                            }
                                            if (i9 == 299) {
                                                while (true) {
                                                    cmA = (cmA >> 230) * 123;
                                                }
                                            } else if (i9 == 375) {
                                                cmA = ((cmA % 21) ^ 1091) * 101;
                                                break;
                                            }
                                        }
                                    }
                                    while (true) {
                                        cmA = (cmA + i) >> 71;
                                        cmA = ((cmA % 21) ^ 1091) * 101;
                                    }
                                }
                            } else if (i8 != 253) {
                                if (i8 == 387) {
                                    do {
                                        EvO = (EvO % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) ^ 2700;
                                    } while ((cmA ^ 8334) == 0);
                                    do {
                                        i4 = cmA;
                                        i5 = i4 + 104;
                                        if (i5 == 46) {
                                            while (true) {
                                                cmA = ((cmA % 38) >> 107) * 43;
                                            }
                                        }
                                    } while (i5 != 224);
                                    while (true) {
                                        cmA = (cmA * 34) + i4 + i4;
                                    }
                                }
                            }
                            EvO = ((EvO * 57) ^ 3099) >> 52;
                            if ((cmA ^ 8334) != 0) {
                                do {
                                    i2 = cmA;
                                    i3 = i2 + 52;
                                    if (i3 == 51) {
                                        while (true) {
                                            cmA = (cmA % 83) % 85;
                                        }
                                    }
                                } while (i3 != 179);
                                while (true) {
                                    cmA = (cmA % 121) + i2;
                                }
                            }
                        } else {
                            do {
                                EvO = (EvO * 44) ^ 3931;
                            } while ((cmA ^ 8334) == 0);
                            while (true) {
                                int i10 = cmA;
                                if (i10 + 65 == 23) {
                                    cmA = (i10 % 87) * 32;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x003e) to fix multi-entry loop: BACK_EDGE: B:24:0x003e -> B:25:0x0040 */
    private void OzhFjl(InetAddress[] inetAddressArr, String str, Map<String, Object> map, Map<String, Object> map2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (inetAddressArr == null || inetAddressArr.length == 0) {
            return;
        }
        int length = inetAddressArr.length;
        int i9 = 0;
        do {
            int i10 = cmA;
            if (i10 <= 8333) {
                while (cmA + 221 != 55) {
                }
                while (true) {
                    cmA = (cmA >> 9) ^ 4442;
                }
            } else {
                if (i9 >= length) {
                    return;
                }
                if ((EvO ^ 3306) == 0) {
                    OzhFjl(inetAddressArr[i9], str, map, map2);
                    if (cmA <= 8333) {
                        do {
                            i6 = cmA;
                        } while (i6 + 78 != 13);
                        while (true) {
                            cmA = ((cmA + i6) >> 88) % 67;
                        }
                    } else {
                        i9++;
                    }
                } else if (i10 <= 8333) {
                    while (true) {
                        int i11 = cmA;
                        int i12 = i11 + 65;
                        if (i12 == 84) {
                            cmA = i11 + i11 + i11;
                            break;
                        } else if (i12 == 176) {
                            break;
                        }
                    }
                    while (true) {
                        cmA = (cmA % 6) ^ 3642;
                    }
                } else {
                    do {
                        i = EvO;
                        i2 = i + 65;
                        if (i2 == 88) {
                            while (true) {
                                int i13 = EvO;
                                int i14 = cmA;
                                if (i14 <= 8333) {
                                    do {
                                        i3 = cmA;
                                    } while (i3 + 130 != 91);
                                    while (true) {
                                        cmA = (cmA + i3) >> WalletImportError.ERROR_CODE_AA_EXIST;
                                    }
                                } else if (i14 <= 8333) {
                                    while (cmA + 299 != 23) {
                                    }
                                    while (true) {
                                        cmA = (cmA % 23) * 83;
                                    }
                                } else {
                                    EvO = ((i13 ^ 1884) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) + i;
                                }
                            }
                        } else if (i2 == 219) {
                            do {
                                int i15 = EvO;
                                if (cmA <= 8333) {
                                    do {
                                        int i16 = cmA;
                                        i5 = i16 + 260;
                                        if (i5 == 84) {
                                            cmA = i16 ^ 1254;
                                        } else if (i5 == 94) {
                                            while (true) {
                                                cmA = ((cmA % 88) % 2) % 85;
                                            }
                                        }
                                    } while (i5 != 202);
                                    while (true) {
                                        cmA >>= 99;
                                    }
                                }
                                EvO = ((i15 % 31) * 29) + i;
                            } while (cmA > 8333);
                            do {
                                i4 = cmA;
                            } while (i4 + 104 != 10);
                            while (true) {
                                cmA = ((cmA * 89) >> 33) + i4;
                            }
                        }
                    } while (i2 != 413);
                    while (true) {
                        EvO = ((EvO ^ 5291) >> 93) + i;
                    }
                }
            }
        } while (EvO > 3305);
        while (true) {
            int i17 = EvO;
            int i18 = i17 + 52;
            if (i18 == 62) {
                if (cmA <= 8333) {
                    while (true) {
                        i8 = cmA;
                        int i19 = i8 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                        if (i19 != 3) {
                            if (i19 == 49) {
                                break;
                            } else if (i19 == 55) {
                                cmA = ((i8 + i8) * 97) >> 67;
                            }
                        }
                        cmA = (cmA ^ 2985) + i8;
                    }
                    cmA = (i8 >> 41) + i8;
                }
                EvO = ((i17 ^ 3251) % 95) >> 42;
                if (cmA <= 8333) {
                    do {
                        int i20 = cmA;
                        i7 = i20 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                        if (i7 == 60) {
                            while (true) {
                                cmA = (cmA * 3304) ^ 4268;
                            }
                        } else if (i7 == 115) {
                            cmA = i20 >> 221;
                        }
                    } while (i7 != 178);
                    while (true) {
                        cmA = ((cmA >> 35) % 120) ^ 5407;
                    }
                } else {
                    continue;
                }
            } else if (i18 == 146) {
                while (true) {
                    EvO = EvO + i17 + i17 + i17;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DBAlnt(String str) {
        this.RNqxeV = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void DQnQnb() {
        this.bRwgb = null;
        this.dlhqIF = null;
        this.iedYWY = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:106:0x0159) to fix multi-entry loop: BACK_EDGE: B:105:0x0154 -> B:106:0x0159 */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0159, code lost:
    
        QfgSZK.GQzpsZ.cmA = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean OgHfcT(String[] strArr) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        int i6;
        if (strArr != null && strArr.length >= 5) {
            if (this.bRwgb == null) {
                String str3 = strArr[0];
                if (cmA <= 8333) {
                    while (true) {
                        int i7 = cmA;
                        int i8 = i7 + 208;
                        if (i8 != 56) {
                            if (i8 == 213) {
                                cmA = ((i7 >> 40) % 120) * 37;
                            } else if (i8 != 252) {
                                if (i8 == 335) {
                                    while (true) {
                                        cmA = ((cmA ^ 1213) + i7) % 18;
                                    }
                                }
                            }
                            cmA *= 731;
                        } else {
                            while (true) {
                                cmA = (cmA * 121) ^ 2004;
                            }
                        }
                    }
                } else if (str3 != null) {
                    this.bRwgb = FYtjSf.fMBJsc(str3);
                }
            }
            if (this.dlhqIF == null) {
                if ((cmA ^ 8334) != 0) {
                    do {
                        int i9 = cmA;
                        i6 = i9 + 52;
                        if (i6 == 31) {
                            while (true) {
                                cmA = (cmA + i9) % 14;
                            }
                        }
                    } while (i6 != 96);
                    while (true) {
                        cmA = (cmA >> 63) % 82;
                    }
                } else {
                    String str4 = strArr[1];
                    if (str4 != null) {
                        this.dlhqIF = FYtjSf.sVvuFk(str4);
                    }
                }
            }
            if (this.iedYWY == null) {
                if ((cmA ^ 8334) != 0) {
                    while (true) {
                        int i10 = cmA;
                        int i11 = i10 + 221;
                        if (i11 == 37) {
                            cmA = ((i10 + i10) >> 73) * 12;
                            break;
                        }
                        if (i11 == 212) {
                            cmA = ((i10 >> 4) + i10) % 65;
                            break;
                        }
                    }
                }
                String str5 = strArr[2];
                if (str5 != null) {
                    if (EvO <= 3305) {
                        do {
                            i5 = EvO;
                        } while (i5 + 104 != 85);
                        while (true) {
                            EvO = ((EvO + i5) % 12) % 66;
                        }
                    } else {
                        this.iedYWY = str5;
                    }
                }
            }
            if (this.RNqxeV == null && (str2 = strArr[3]) != null) {
                this.RNqxeV = str2;
            }
            if (this.swNzFA == null && (str = strArr[4]) != null) {
                this.swNzFA = str;
            }
        }
        if (this.bRwgb == null || this.dlhqIF == null) {
            return false;
        }
        if (cmA <= 8333) {
            while (true) {
                i4 = cmA;
                int i12 = i4 + 234;
                if (i12 != 13) {
                    if (i12 == 58) {
                        break;
                    }
                    if (i12 == 167) {
                        cmA = ((i4 >> 106) * 122) ^ 1127;
                    }
                }
                cmA = ((cmA >> 100) % 59) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            }
            cmA = (i4 >> 108) % 43;
        }
        if (this.iedYWY == null || this.RNqxeV == null) {
            return false;
        }
        if ((EvO ^ 3306) == 0) {
            return true;
        }
        if (cmA <= 8333) {
            while (true) {
                i2 = cmA;
                int i13 = i2 + 130;
                if (i13 != 72) {
                    if (i13 == 140) {
                        cmA = ((i2 + i2) >> 7) + i2;
                        break;
                    }
                    if (i13 == 146) {
                        i3 = ((i2 ^ 3963) >> 28) ^ 1621;
                        break;
                    }
                    if (i13 == 274) {
                        i3 = (i2 * 14) ^ 2173;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                cmA = (cmA ^ 1869) + i2;
            }
        }
        do {
            i = EvO;
        } while (i + 91 != 82);
        while (true) {
            EvO = (EvO >> 117) + i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:63:0x011d) to fix multi-entry loop: BACK_EDGE: B:63:0x011d -> B:62:0x0117 */
    public void OrsvgJ(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        int i;
        int i2;
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    String name = networkInterfaceNextElement.getName();
                    if (networkInterfaceNextElement.getHardwareAddress() != null) {
                        String strFObYrO = UPbYzn.fObYrO(networkInterfaceNextElement.getHardwareAddress());
                        if (UPbYzn.dPaqAf(strFObYrO)) {
                            map3.put(strFObYrO, name);
                        }
                    }
                    if (!name.startsWith(GCXiNH.fsw("ydVaR"))) {
                        OzhFjl(networkInterfaceNextElement.getInetAddresses(), name, map, map2);
                    }
                }
            }
        } catch (SocketException e) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("YtX`JCdz,MZ@OY\\NY[\u000e\u0013qP^\bJ\u001d[^N\u0019qg\u0006D`gpdsMIz$o\u007fl(sy5G|qzu{[e\u007f~jmqxi\u0005\u001f_`."), e.toString());
            ORrpqH.uzCIH().seuMaA(e);
            if (EvO > 3305) {
                return;
            }
            if ((cmA ^ 8334) == 0) {
                while (true) {
                    int i3 = EvO;
                    int i4 = i3 + 65;
                    if (i4 == 44) {
                        loop5: while (true) {
                            EvO = ((EvO ^ 1686) + i3) >> 26;
                            if ((cmA ^ 8334) != 0) {
                                while (true) {
                                    int i5 = cmA;
                                    int i6 = i5 + 91;
                                    if (i6 == 2) {
                                        cmA = (i5 + i5) >> 42;
                                        break;
                                    }
                                    if (i6 == 45) {
                                        cmA = (i5 % 31) % 48;
                                        break loop5;
                                    } else if (i6 == 104) {
                                        cmA = (i5 >> 89) * 104;
                                        break loop5;
                                    } else if (i6 == 201) {
                                        break loop5;
                                    }
                                }
                            }
                        }
                        while (true) {
                            cmA = (cmA >> 71) % 25;
                        }
                    } else if (i4 == 194) {
                        EvO = ((i3 % 31) + i3) ^ 4137;
                        if (cmA > 8333) {
                            return;
                        }
                    } else if (i4 == 250) {
                        EvO = ((i3 * 18) % 108) ^ 2715;
                        if (cmA > 8333) {
                            return;
                        }
                    }
                }
                while (true) {
                    i = cmA;
                    int i7 = i + 65;
                    if (i7 == 95) {
                        i2 = ((i * 25) + i) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                        break;
                    } else if (i7 == 211) {
                        cmA = (i % 103) ^ 5308;
                        break;
                    } else if (i7 == 236) {
                        break;
                    }
                }
                i2 = (cmA >> 82) + i;
                cmA = i2;
                return;
            }
            while (cmA + 78 != 50) {
            }
            while (true) {
                cmA = (cmA * 2030) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            }
        } catch (Throwable th) {
            FQMcgE.fQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("H\u007f^t[TbjiL\u0002FRJMWB\\[]\u0012YQ_NXR^^\u0019") + th);
            ORrpqH.uzCIH().seuMaA(th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void QiTXOm(String str) {
        this.UrIxFn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String QnnRaN() {
        return this.iedYWY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String RFmUsE() {
        return this.gGamLp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void RLmrWm(String str) {
        this.spnCvw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String RXdAnZ() {
        return this.gdvvxR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void drbYRJ(String str) {
        this.swNzFA = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String gAnGwV() {
        return this.RNqxeV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String hGuIrQ() {
        return this.UrIxFn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String inahnb() {
        return this.swNzFA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String pXZxY() {
        return this.spnCvw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String sRzUNh() {
        return this.bRwgb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String zFtALg() {
        return this.zDvNhw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String zXhzOT() {
        return this.dlhqIF;
    }
}
