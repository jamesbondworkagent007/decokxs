package QfgSZK;

import android.content.Context;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
final class OUcgGI extends SaJVGb {

    /* JADX INFO: Incorrect field signature: Lint; */
    static String ORzhKI;
    public static int __Y;
    public static int cXU;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String fxTgnr;
    private Object zfVMAw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x003d) to fix multi-entry loop: BACK_EDGE: B:15:0x0035 -> B:16:0x003d */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static {
        /*
            r0 = 3987(0xf93, float:5.587E-42)
            QfgSZK.GCXiNH.Cwg = r0
            r0 = 5758(0x167e, float:8.069E-42)
            QfgSZK.OUcgGI.cXU = r0
            r0 = 2270(0x8de, float:3.181E-42)
            QfgSZK.GCXiNH.OHr = r0
            int r0 = QfgSZK.OUcgGI.cXU
            r1 = 5757(0x167d, float:8.067E-42)
            if (r0 > r1) goto L46
        L12:
            int r0 = QfgSZK.OUcgGI.cXU
            int r1 = r0 + 13
            r2 = 7
            if (r1 == r2) goto L2d
            r2 = 119(0x77, float:1.67E-43)
            if (r1 == r2) goto L35
            r2 = 303(0x12f, float:4.25E-43)
            if (r1 == r2) goto L26
            r0 = 307(0x133, float:4.3E-43)
            if (r1 == r0) goto L3d
            goto L12
        L26:
            int r0 = r0 * 37
            int r0 = r0 >> 105
            QfgSZK.OUcgGI.cXU = r0
            goto L46
        L2d:
            int r0 = QfgSZK.OUcgGI.cXU
            int r0 = r0 >> 34
            r0 = r0 ^ 5303(0x14b7, float:7.431E-42)
            QfgSZK.OUcgGI.cXU = r0
        L35:
            int r0 = QfgSZK.OUcgGI.cXU
            int r0 = r0 % 76
            int r0 = r0 * 364
            QfgSZK.OUcgGI.cXU = r0
        L3d:
            int r0 = QfgSZK.OUcgGI.cXU
            int r0 = r0 * 63
            int r0 = r0 % 3
            QfgSZK.OUcgGI.cXU = r0
            goto L2d
        L46:
            r0 = 2394(0x95a, float:3.355E-42)
            QfgSZK.OUcgGI.__Y = r0
            r0 = 0
            FF(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.OUcgGI.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:58:0x00c5) to fix multi-entry loop: BACK_EDGE: B:57:0x00bf -> B:58:0x00c5 */
    public OUcgGI(Object obj, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        super(obj, str);
        if (!(obj instanceof Map)) {
            return;
        }
        if ((__Y ^ 2394) != 0) {
            if ((cXU ^ 5758) != 0) {
                while (true) {
                    int i7 = cXU;
                    int i8 = i7 + 39;
                    if (i8 == 92) {
                        i6 = ((i7 + i7) * 19) % 48;
                        break;
                    }
                    if (i8 == 113) {
                        i6 = (i7 % 34) % 123;
                        break;
                    } else if (i8 == 306) {
                        while (true) {
                            cXU = (cXU % 76) * 76;
                        }
                    } else if (i8 == 364) {
                        i6 = (i7 + i7) >> CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
                        break;
                    }
                }
                cXU = i6;
            }
            while (true) {
                int i9 = __Y;
                int i10 = cXU;
                if (i10 <= 5757) {
                    do {
                        i3 = cXU;
                    } while (i3 + 130 != 34);
                    while (true) {
                        cXU = (cXU >> 16) + i3;
                    }
                } else {
                    int i11 = i9 + 26;
                    if (i11 != 28) {
                        if (i11 == 177) {
                            do {
                                __Y = (__Y ^ 5469) + i9;
                            } while ((cXU ^ 5758) == 0);
                            while (true) {
                                i5 = cXU;
                                int i12 = i5 + 78;
                                if (i12 == 34) {
                                    break;
                                } else if (i12 == 69) {
                                    cXU = ((i5 >> 32) + i5) % 98;
                                }
                            }
                            while (true) {
                                cXU = (cXU ^ 5188) + i5;
                            }
                        } else if (i11 == 262) {
                            __Y = (i9 + i9) * 390;
                            break;
                        }
                    } else if ((i10 ^ 5758) != 0) {
                        while (true) {
                            int i13 = cXU;
                            int i14 = i13 + 104;
                            if (i14 != 89) {
                                if (i14 != 137) {
                                    if (i14 == 318) {
                                        cXU = ((i13 + i13) * 15) % 59;
                                        break;
                                    } else if (i14 == 507) {
                                        cXU = ((i13 >> 105) * 12) + i13;
                                    }
                                } else {
                                    break;
                                }
                            }
                            cXU = (cXU >> 118) % 121;
                        }
                        while (true) {
                            cXU = (cXU >> 23) ^ 3101;
                        }
                    } else {
                        __Y = (i9 >> 55) * 768;
                        if (i10 <= 5757) {
                            do {
                                i4 = cXU;
                            } while (i4 + 26 != 70);
                            cXU = (i4 >> 32) % 92;
                        }
                    }
                }
            }
        }
        Map map = (Map) obj;
        if (cXU > 5757) {
            this.zfVMAw = map.get(fxTgnr);
            return;
        }
        while (true) {
            i = cXU;
            int i15 = i + 52;
            if (i15 == 34) {
                i2 = (i + i) % 60;
            } else {
                if (i15 == 69) {
                    break;
                }
                if (i15 == 221) {
                    i2 = i + i + i;
                } else if (i15 == 376) {
                    cXU = ((cXU >> 119) * 38) + i;
                }
            }
            cXU = i2;
            cXU = ((cXU >> 119) * 38) + i;
        }
        while (true) {
            cXU = ((cXU % WalletImportError.ERROR_CODE_AA_CREATE_KEY) + i) % 48;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void FF(boolean z) {
        int i;
        if (z) {
            FF(false);
        }
        if ((__Y ^ 2394) != 0) {
            while (true) {
                i = __Y;
                int i2 = i + 26;
                if (i2 == 53) {
                    break;
                }
                if (i2 == 114) {
                    if (cXU <= 5757) {
                        while (cXU + 78 != 39) {
                        }
                        while (true) {
                            cXU = ((cXU >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) % 49) >> 68;
                        }
                    } else {
                        __Y = ((i * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) % 65) * 13;
                    }
                }
            }
            __Y = (__Y ^ 1631) + i;
        }
        ORzhKI = GCXiNH.fsw("ICnI");
        fxTgnr = GCXiNH.fsw("nrZbcPoz`MP");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.SaJVGb
    public boolean aJZHYI() {
        int i;
        if (!super.aJZHYI() || !fruYXx(this.zfVMAw)) {
            return false;
        }
        if (__Y > 2393) {
            return true;
        }
        while (true) {
            int i2 = __Y;
            int i3 = i2 + 26;
            if (i3 == 12) {
                __Y = (i2 >> 12) ^ 3553;
            } else if (i3 == 180) {
                break;
            }
        }
        do {
            int i4 = __Y;
            if (cXU <= 5757) {
                do {
                    int i5 = cXU;
                    i = i5 + 78;
                    if (i == 4) {
                        cXU = (i5 % 21) * 43;
                    }
                } while (i != 141);
                while (true) {
                    cXU = (cXU >> 109) % 90;
                }
            }
            __Y = ((i4 % 30) % 91) * 47;
        } while ((cXU ^ 5758) == 0);
        while (cXU + 65 != 1) {
        }
        while (true) {
            cXU *= 2989;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean spnCvw(Context context, boolean z, long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList = new ArrayList(1);
        ikcuIV((Method) this.zfVMAw, false, context, Boolean.valueOf(z), Long.valueOf(j), Integer.valueOf(i), arrayList);
        if (arrayList.isEmpty() || !((String) arrayList.get(0)).equalsIgnoreCase(ORzhKI)) {
            return false;
        }
        if (__Y > 2393) {
            return true;
        }
        while (true) {
            i2 = __Y;
            int i6 = i2 + 26;
            if (i6 == 13) {
                __Y = (i2 ^ 4029) >> 28;
                if ((cXU ^ 5758) != 0) {
                    do {
                        i5 = cXU;
                    } while (i5 + 39 != 80);
                    while (true) {
                        cXU = (cXU + i5) % 70;
                    }
                }
            } else {
                if (i6 == 30) {
                    __Y = (i2 % 17) * 61;
                    break;
                }
                if (i6 == 162) {
                    __Y = ((i2 + i2) >> 80) % 102;
                    if ((cXU ^ 5758) != 0) {
                        while (true) {
                            i4 = cXU;
                            int i7 = i4 + 91;
                            if (i7 == 30) {
                                cXU = (i4 + i4) >> 53;
                            } else if (i7 == 54) {
                                break;
                            }
                        }
                        cXU = ((i4 >> 24) ^ 2551) + i4;
                    }
                } else if (i6 == 175) {
                    break;
                }
            }
        }
        __Y = ((__Y + i2) * 5) + i2;
        if ((cXU ^ 5758) == 0) {
            return true;
        }
        while (true) {
            i3 = cXU;
            int i8 = i3 + 26;
            if (i8 == 7) {
                cXU = (i3 * 41) + i3;
                break;
            }
            if (i8 != 161) {
                if (i8 == 219) {
                    break;
                }
            } else {
                break;
            }
        }
        cXU = ((cXU + i3) + i3) ^ 5495;
        cXU = (cXU ^ 6491) + i3;
        return true;
    }
}
