package QfgSZK;

import QfgSZK.AuCTel;
import QfgSZK.FQMcgE;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class ZxnNGp extends AuCTel {
    private static String DlIaRS;
    private static final Class<?> USLgSW;
    public static int Ugl;
    public static int cdG;
    private static final Method dXLZxr;
    private Display gAKMSI;
    private Point hEeDHH;
    private DisplayMetrics zaKtac = new DisplayMetrics();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:48:0x00ce) to fix multi-entry loop: BACK_EDGE: B:47:0x00c4 -> B:48:0x00ce */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0051 A[SYNTHETIC] */
    static {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        FQMcgE.RQa = 9057;
        Ugl = 6980;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        cdG = 3038;
        if (Ugl <= 6979) {
            do {
                i5 = Ugl;
                i6 = i5 + 130;
                if (i6 == 46) {
                    while (true) {
                        Ugl = (Ugl % 6) ^ 3950;
                    }
                }
            } while (i6 != 183);
            Ugl = (i5 >> 73) + i5 + i5;
        }
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(ZxnNGp.class);
        Class<?> clsWlaJM = AuCTel.wlaJM(AuCTel.auCTel.WINDOW_MANAGER);
        USLgSW = clsWlaJM;
        if (cdG > 3037) {
            dXLZxr = AuCTel.zsXlph(clsWlaJM, GCXiNH.fsw("ztOHNW`k`\\fJYYDFO"), new Class[0]);
            return;
        }
        while (true) {
            int i7 = cdG;
            int i8 = i7 + 13;
            if (i8 != 85) {
                if (i8 == 196) {
                    cdG = ((i7 % 60) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) + i7;
                    if ((Ugl ^ 6980) != 0) {
                        while (true) {
                            int i9 = Ugl;
                            int i10 = i9 + 65;
                            if (i10 == 68) {
                                Ugl = ((i9 ^ 1635) * 35) ^ 1037;
                            } else if (i10 == 98) {
                                i = (i9 >> 123) * 4784;
                                break;
                            } else if (i10 != 219) {
                                if (i10 == 349) {
                                    i = i9 ^ 5261;
                                    break;
                                }
                            }
                            Ugl = ((Ugl * 122) ^ 2144) + i9;
                        }
                        Ugl = i;
                    }
                } else if (i8 != 200) {
                    if (i8 != 336) {
                        continue;
                    } else {
                        cdG = (cdG >> 98) % 52;
                        if (Ugl > 6979) {
                            while (Ugl + 26 != 28) {
                            }
                            while (true) {
                                Ugl = ((Ugl % 122) >> 122) * 66;
                            }
                        }
                    }
                }
                int i11 = cdG;
                int i12 = Ugl;
                if (i12 <= 6979) {
                    do {
                        i2 = Ugl;
                        i3 = i2 + 117;
                        if (i3 != 63) {
                            if (i3 == 240) {
                                Ugl = (Ugl % 108) * 61;
                            }
                        }
                        while (true) {
                            Ugl = ((Ugl >> 35) % 8) ^ 2883;
                            Ugl = (Ugl % 108) * 61;
                        }
                    } while (i3 != 291);
                    while (true) {
                        Ugl = ((Ugl + i2) >> 94) ^ 2955;
                    }
                } else {
                    cdG = ((i11 ^ 1627) + i7) * 77;
                    if ((i12 ^ 6980) != 0) {
                        do {
                            i4 = Ugl;
                        } while (i4 + 78 != 98);
                        Ugl = ((i4 % 114) ^ 2749) + i4;
                    }
                    cdG = (cdG >> 98) % 52;
                    if (Ugl > 6979) {
                    }
                }
            } else {
                do {
                    cdG = ((cdG * 3) % 94) + i7;
                } while (Ugl > 6979);
                while (true) {
                    int i13 = Ugl;
                    if (i13 + 39 == 98) {
                        Ugl = (i13 + i13) % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZxnNGp(ZqidTP zqidTP) {
        int i;
        int i2;
        if (dXLZxr == null) {
            return;
        }
        try {
            Object systemService = zqidTP.Umbazn.getSystemService(GCXiNH.fsw("jxUhDF"));
            if (systemService instanceof WindowManager) {
                this.gAKMSI = ((WindowManager) systemService).getDefaultDisplay();
                this.hEeDHH = dHAKvv();
                this.gAKMSI.getMetrics(this.zaKtac);
            }
        } catch (SecurityException e) {
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("Hb^~\u000bCdxy[G\u0003M[IIB\\ZT\u0012AU]STOHSVV\u0017]x"), e.toString());
            DwQSDd.glVQsU(e);
            ORrpqH.uzCIH().seuMaA(e);
            if (cdG > 3037) {
                return;
            }
            do {
                i = cdG + 39;
                if (i == 33) {
                    while (true) {
                        cdG = ((cdG * 16) ^ 1964) >> 69;
                    }
                }
            } while (i != 231);
            do {
                cdG = ((cdG >> WalletImportError.ERROR_CODE_AA_CREATE_KEY) * 51) % 47;
            } while ((Ugl ^ 6980) == 0);
            do {
                int i3 = Ugl;
                i2 = i3 + 78;
                if (i2 == 23) {
                    while (true) {
                        Ugl = (Ugl % 43) + i3;
                    }
                }
            } while (i2 != 210);
            while (true) {
                Ugl = (Ugl * 65) ^ InputDeviceCompat.SOURCE_GAMEPAD;
            }
        } catch (Exception e2) {
            FQMcgE.OijiEz(DlIaRS, e2.toString());
            ORrpqH.uzCIH().seuMaA(e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Point dHAKvv() {
        Point point = new Point();
        this.gAKMSI.getRealSize(point);
        if (point.x == 0 || point.y == 0) {
            return null;
        }
        return point;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DbvGUJ() {
        return this.zaKtac.heightPixels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DhEJvI() {
        return this.zaKtac.widthPixels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int DjzMc() {
        if (this.gAKMSI == null) {
            return 0;
        }
        Point point = this.hEeDHH;
        if (point != null) {
            return point.y;
        }
        Point point2 = new Point();
        this.gAKMSI.getSize(point2);
        return point2.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:27:0x0052) to fix multi-entry loop: BACK_EDGE: B:26:0x004c -> B:27:0x0052 */
    /* JADX DEBUG: Duplicate block (B:47:0x00a0) to fix multi-entry loop: BACK_EDGE: B:47:0x00a0 -> B:48:0x00a2 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public float dESsmu() {
        /*
            r5 = this;
            android.graphics.Point r0 = r5.hEeDHH
            if (r0 == 0) goto Lde
            int r1 = QfgSZK.ZxnNGp.Ugl
            r1 = r1 ^ 6980(0x1b44, float:9.781E-42)
            r2 = 78
            if (r1 == 0) goto L1e
        Lc:
            int r3 = QfgSZK.ZxnNGp.Ugl
            int r0 = r3 + 26
            r1 = 97
            if (r0 == r1) goto L15
            goto Lc
        L15:
            int r0 = QfgSZK.ZxnNGp.Ugl
            int r0 = r0 * r2
            int r0 = r0 % 35
            int r0 = r0 + r3
            QfgSZK.ZxnNGp.Ugl = r0
            goto L15
        L1e:
            android.view.Display r3 = r5.gAKMSI
            if (r3 != 0) goto L24
            goto Lde
        L24:
            int r3 = r0.y
            int r0 = r0.x
            if (r1 == 0) goto L5d
        L2a:
            int r0 = QfgSZK.ZxnNGp.Ugl
            int r1 = r0 + 104
            r2 = 89
            if (r1 == r2) goto L45
            r2 = 282(0x11a, float:3.95E-43)
            if (r1 == r2) goto L3f
            r0 = 378(0x17a, float:5.3E-43)
            if (r1 == r0) goto L4c
            r0 = 545(0x221, float:7.64E-43)
            if (r1 == r0) goto L52
            goto L2a
        L3f:
            r1 = r0 ^ 1541(0x605, float:2.16E-42)
            int r1 = r1 + r0
            QfgSZK.ZxnNGp.Ugl = r1
            goto L2a
        L45:
            int r0 = QfgSZK.ZxnNGp.Ugl
            r1 = 160(0xa0, float:2.24E-43)
            int r0 = r0 >> r1
            QfgSZK.ZxnNGp.Ugl = r0
        L4c:
            int r0 = QfgSZK.ZxnNGp.Ugl
            r0 = r0 ^ 7695(0x1e0f, float:1.0783E-41)
            QfgSZK.ZxnNGp.Ugl = r0
        L52:
            int r0 = QfgSZK.ZxnNGp.Ugl
            r0 = r0 ^ 3763(0xeb3, float:5.273E-42)
            int r0 = r0 % 5
            int r0 = r0 * 12
            QfgSZK.ZxnNGp.Ugl = r0
            goto L45
        L5d:
            int r0 = java.lang.Math.max(r3, r0)
            int r1 = QfgSZK.ZxnNGp.cdG
            r1 = r1 ^ 3038(0xbde, float:4.257E-42)
            if (r1 == 0) goto La9
        L67:
            int r1 = QfgSZK.ZxnNGp.cdG
            int r3 = r1 + 39
            r4 = 13
            if (r3 == r4) goto L70
            goto L67
        L70:
            int r3 = r1 + r1
            int r3 = r3 + r1
            QfgSZK.ZxnNGp.cdG = r3
            int r1 = QfgSZK.ZxnNGp.Ugl
            r1 = r1 ^ 6980(0x1b44, float:9.781E-42)
            if (r1 == 0) goto La9
        L7b:
            int r1 = QfgSZK.ZxnNGp.Ugl
            int r3 = r1 + 39
            if (r3 == r2) goto L93
            r4 = 159(0x9f, float:2.23E-43)
            if (r3 == r4) goto L9b
            r4 = 323(0x143, float:4.53E-43)
            if (r3 == r4) goto La2
            r4 = 482(0x1e2, float:6.75E-43)
            if (r3 == r4) goto L8e
            goto L7b
        L8e:
            r1 = r1 ^ 7624(0x1dc8, float:1.0683E-41)
            QfgSZK.ZxnNGp.Ugl = r1
            goto La9
        L93:
            int r0 = r1 * 62
            r0 = r0 ^ 2026(0x7ea, float:2.839E-42)
            int r0 = r0 % 62
            QfgSZK.ZxnNGp.Ugl = r0
        L9b:
            int r0 = QfgSZK.ZxnNGp.Ugl
            int r0 = r0 % 72
            int r0 = r0 + r1
        La0:
            QfgSZK.ZxnNGp.Ugl = r0
        La2:
            int r0 = QfgSZK.ZxnNGp.Ugl
            int r0 = r0 >> 65
            r0 = r0 ^ 3931(0xf5b, float:5.509E-42)
            goto La0
        La9:
            float r0 = (float) r0
            int r1 = QfgSZK.ZxnNGp.Ugl
            r2 = 6979(0x1b43, float:9.78E-42)
            if (r1 > r2) goto Ld8
        Lb0:
            int r1 = QfgSZK.ZxnNGp.Ugl
            int r2 = r1 + 65
            r3 = 92
            if (r2 == r3) goto Lce
            r3 = 223(0xdf, float:3.12E-43)
            if (r2 == r3) goto Lc8
            r3 = 404(0x194, float:5.66E-43)
            if (r2 == r3) goto Lc1
            goto Lb0
        Lc1:
            int r1 = r1 * 7
            int r1 = r1 % 29
            int r1 = r1 * 44
            goto Ld6
        Lc8:
            int r1 = r1 % 64
            int r1 = r1 * 25
            QfgSZK.ZxnNGp.Ugl = r1
        Lce:
            int r1 = QfgSZK.ZxnNGp.Ugl
            r1 = r1 ^ 2480(0x9b0, float:3.475E-42)
            int r1 = r1 % 117
            int r1 = r1 % 84
        Ld6:
            QfgSZK.ZxnNGp.Ugl = r1
        Ld8:
            android.util.DisplayMetrics r1 = r5.zaKtac
            float r1 = r1.ydpi
            float r0 = r0 / r1
            return r0
        Lde:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.ZxnNGp.dESsmu():float");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:39:0x0088) to fix multi-entry loop: BACK_EDGE: B:39:0x0088 -> B:40:0x008a */
    public float dcEsSD() {
        int i;
        if (this.hEeDHH == null) {
            return 0.0f;
        }
        if ((Ugl ^ 6980) != 0) {
            while (true) {
                int i2 = Ugl;
                int i3 = i2 + 26;
                if (i3 == 95) {
                    Ugl = i2 ^ 7704;
                } else if (i3 != 209) {
                    if (i3 == 292) {
                        Ugl = (i2 % 33) * 4;
                        break;
                    }
                    if (i3 == 445) {
                        while (true) {
                            Ugl = ((Ugl >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) ^ 4147) + i2;
                        }
                    }
                }
                Ugl = ((Ugl ^ 4808) % 77) >> 12;
            }
        }
        if (this.gAKMSI == null) {
            return 0.0f;
        }
        Point point = this.hEeDHH;
        int iMin = Math.min(point.y, point.x);
        if (Ugl <= 6979) {
            do {
                int i4 = Ugl;
                i = i4 + 78;
                if (i == 98) {
                    Ugl = (i4 >> 76) ^ 2602;
                }
            } while (i != 240);
            while (true) {
                Ugl = (Ugl * 59) ^ 7502;
            }
        }
        float f = iMin;
        if ((Ugl ^ 6980) == 0) {
            return f / this.zaKtac.xdpi;
        }
        while (true) {
            int i5 = Ugl;
            int i6 = i5 + 65;
            if (i6 == 19) {
                Ugl = (i5 ^ 4920) % 34;
                break;
            }
            if (i6 == 196) {
                break;
            }
        }
        while (true) {
            Ugl = (Ugl * 15) % 3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float dxTXDv() {
        return this.zaKtac.ydpi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int sGvRiA() {
        if (this.gAKMSI == null) {
            return 0;
        }
        Point point = this.hEeDHH;
        if (point != null) {
            return point.x;
        }
        Point point2 = new Point();
        this.gAKMSI.getSize(point2);
        return point2.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float sjbWxX() {
        return this.zaKtac.xdpi;
    }
}
