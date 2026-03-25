package QfgSZK;

import QfgSZK.FQMcgE;
import com.amplifyframework.core.model.ModelIdentifier;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DwQSDd {
    private static String QFxMww = null;
    private static final Object dNUNan;
    private static String sLhXPw = null;
    private static final Set<String> zOGjXp;
    public static int zRW = 9416;
    public static int zbj;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        zbj = 7793;
        GCXiNH.OHr = 2270;
        sLhXPw = GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001a");
        QFxMww = GCXiNH.fsw("wpMm\u0005]`pk\u0006qFI\\ZNBLqKQT@[WRR\u0001\u001a");
        zOGjXp = new HashSet();
        dNUNan = new Object();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DwQSDd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OqFWZa(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            glVQsU(it.next());
            if (zRW <= 9415) {
                while (true) {
                    int i = zRW;
                    if (i + 39 == 37) {
                        zRW = i * 500200;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String QSLkRj() {
        synchronized (dNUNan) {
            Set<String> set = zOGjXp;
            if (set.isEmpty()) {
                return "";
            }
            return set.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void abAflu() {
        synchronized (dNUNan) {
            zOGjXp.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:13:0x002a) to fix multi-entry loop: BACK_EDGE: B:12:0x0023 -> B:13:0x002a */
    public static void glVQsU(Exception exc) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!(exc instanceof SecurityException)) {
            return;
        }
        String string = exc.toString();
        if ((zRW ^ 9416) != 0) {
            while (true) {
                i7 = zRW;
                int i8 = i7 + 130;
                if (i8 != 21) {
                    if (i8 == 86) {
                        zRW = ((i7 ^ 4525) >> 43) * 71;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                zRW = ((zRW + i7) ^ 3286) * 82;
            }
        } else {
            String strFsw = GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001a");
            int i9 = zbj;
            int i10 = zRW;
            if ((i10 ^ 9416) != 0) {
                do {
                    i6 = zRW;
                } while (i6 + 26 != 83);
                while (true) {
                    zRW = (zRW ^ 1556) + i6;
                }
            } else {
                if (i10 > 9415) {
                    if (i9 <= 7792) {
                        if (i10 <= 9415) {
                            do {
                                i4 = zRW;
                                i5 = i4 + 39;
                                if (i5 == 94) {
                                    while (true) {
                                        zRW = (zRW >> 103) + i4;
                                    }
                                }
                            } while (i5 != 245);
                            while (true) {
                                zRW = (zRW % 80) + i4;
                            }
                        } else {
                            while (true) {
                                int i11 = zbj;
                                int i12 = i11 + 26;
                                if (i12 == 61) {
                                    while (true) {
                                        zbj ^= 10;
                                    }
                                } else {
                                    if (i12 == 171) {
                                        zbj = (i11 + i11) ^ 3109;
                                        break;
                                    }
                                    if (i12 == 226) {
                                        break;
                                    }
                                    if (i12 == 273) {
                                        if ((zRW ^ 9416) != 0) {
                                            do {
                                                int i13 = zRW;
                                                i2 = i13 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                                if (i2 == 19) {
                                                    i3 = (i13 ^ 1986) * 66;
                                                } else if (i2 == 188) {
                                                    i3 = (i13 ^ 3100) % 67;
                                                }
                                                zRW = i3;
                                                break;
                                            } while (i2 != 287);
                                            zRW = ((zRW % 93) >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) ^ 2371;
                                        }
                                        zbj = ((i11 * 33) + i11) >> 56;
                                    }
                                }
                            }
                            do {
                                zbj = ((zbj % 8) % 89) % 102;
                            } while (zRW > 9415);
                            while (true) {
                                int i14 = zRW;
                                if (i14 + 78 == 47) {
                                    zRW = ((i14 ^ 3531) + i14) % 104;
                                }
                            }
                        }
                    }
                    String strDDxOgT = UPbYzn.DDxOgT(string, strFsw, " ", true);
                    if (zRW <= 9415) {
                        do {
                            i = zRW;
                        } while (i + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 39);
                        zRW = ((i % 67) % 8) + i;
                    }
                    if (UPbYzn.dTTfOR(strDDxOgT)) {
                        glVQsU(strDDxOgT);
                        return;
                    }
                    return;
                }
                while (zRW + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 71) {
                }
                while (true) {
                    zRW *= 553;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void glVQsU(Exception exc, String str) {
        int i;
        String strFsw = GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017]x");
        if (zRW > 9415) {
            FQMcgE.fQMcgE.sIqKDg(str, strFsw, exc.toString());
            glVQsU(exc);
            return;
        }
        while (true) {
            int i2 = zRW;
            int i3 = i2 + 13;
            if (i3 == 22) {
                i = (i2 % 41) >> 48;
            } else if (i3 != 190) {
                if (i3 == 237) {
                    zRW = (i2 ^ 3545) + i2;
                } else if (i3 != 436) {
                }
                i = ((zRW * 34) ^ 1200) * 10;
            } else {
                i = ((i2 % 39) % 11) ^ 2577;
            }
            zRW = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void glVQsU(String str) {
        String str2;
        if (str.indexOf(GCXiNH.fsw("|\u007f_~DXe0|MPNCZ[NY[\u001a")) != 0) {
            str2 = str.indexOf(GCXiNH.fsw("wpMm\u0005]`pk\u0006qFI\\ZNBLqKQT@[WRR\u0001\u001a")) == 0 ? "wpMm\u0005]`pk\u0006qFI\\ZNBLqKQT@[WRR\u0001\u001a" : "|\u007f_~DXe0|MPNCZ[NY[\u001a";
            synchronized (dNUNan) {
                zOGjXp.add(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            return;
        }
        str = str.substring(GCXiNH.fsw(str2).length());
        synchronized (dNUNan) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:14:0x002a) to fix multi-entry loop: BACK_EDGE: B:13:0x0028 -> B:14:0x002a */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void glVQsU(java.lang.String r2, java.lang.String r3) {
        /*
            java.lang.String r0 = "Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017]x"
            java.lang.String r0 = QfgSZK.GCXiNH.fsw(r0)
            int r1 = QfgSZK.DwQSDd.zRW
            r1 = r1 ^ 9416(0x24c8, float:1.3195E-41)
            if (r1 == 0) goto L32
        Lc:
            int r1 = QfgSZK.DwQSDd.zRW
            int r2 = r1 + 13
            r3 = 15
            if (r2 == r3) goto L22
            r3 = 68
            if (r2 == r3) goto L1d
            r3 = 231(0xe7, float:3.24E-43)
            if (r2 == r3) goto L2a
            goto Lc
        L1d:
            int r2 = r1 % 68
            r2 = r2 ^ 1343(0x53f, float:1.882E-42)
            goto L28
        L22:
            int r2 = QfgSZK.DwQSDd.zRW
            int r2 = r2 >> 64
            r2 = r2 ^ 5147(0x141b, float:7.212E-42)
        L28:
            QfgSZK.DwQSDd.zRW = r2
        L2a:
            int r2 = QfgSZK.DwQSDd.zRW
            int r2 = r2 + r1
            r2 = r2 ^ 4305(0x10d1, float:6.033E-42)
            QfgSZK.DwQSDd.zRW = r2
            goto L22
        L32:
            QfgSZK.FQMcgE.fQMcgE.sIqKDg(r3, r0, r2)
            glVQsU(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.DwQSDd.glVQsU(java.lang.String, java.lang.String):void");
    }
}
