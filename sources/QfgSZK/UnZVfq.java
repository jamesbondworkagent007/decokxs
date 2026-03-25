package QfgSZK;

import QfgSZK.HJWChP;
import QfgSZK.QhsCdE;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.SizeF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class UnZVfq extends QhsCdE {
    private static String DlIaRS = null;
    public static int ENU = 7072;
    private static final float fCHVMg = 43.27f;
    public static int hpp;
    private static String urrSK;
    private StringBuilder UauWer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.RQa = 9057;
        hpp = 9985;
        FQMcgE.usN = 6842;
        GCXiNH.OHr = 2270;
        urrSK = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        DlIaRS = FQMcgE.hfdhUn(UnZVfq.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnZVfq(long j) {
        super(j);
        this.UauWer = new StringBuilder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:33:0x008d) to fix multi-entry loop: BACK_EDGE: B:33:0x008d -> B:34:0x008f */
    private void DDNONI(CameraManager cameraManager, String str, CameraCharacteristics cameraCharacteristics) {
        int i;
        int i2;
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.dUYiGO) {
            for (String str2 : cameraCharacteristics.getPhysicalCameraIds()) {
                try {
                    CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str2);
                    if (this.UauWer.length() > 0) {
                        this.UauWer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                    }
                    UNDaji(str2, cameraCharacteristics2, str, this.UauWer);
                } catch (Throwable th) {
                    FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("ytHoYXc{\\@[PCJIKuTYV@PC\u0015\u001e") + th);
                }
                if ((hpp ^ 9985) != 0) {
                    do {
                        i = hpp;
                    } while (i + 52 != 81);
                    do {
                        hpp = ((hpp % 85) % 115) + i;
                    } while ((ENU ^ 7072) == 0);
                    while (true) {
                        i2 = ENU;
                        int i3 = i2 + 78;
                        if (i3 != 98) {
                            if (i3 == 201) {
                                ENU = (i2 >> 118) % 63;
                                break;
                            } else if (i3 == 307) {
                                break;
                            } else if (i3 == 406) {
                                ENU = ((i2 ^ 2288) + i2) ^ 3437;
                            }
                        }
                        ENU = (ENU >> 15) ^ 5569;
                    }
                    while (true) {
                        ENU = (ENU ^ 2007) + i2;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x005d) to fix multi-entry loop: BACK_EDGE: B:23:0x0056 -> B:24:0x005d */
    /* JADX DEBUG: Duplicate block (B:49:0x00b4) to fix multi-entry loop: BACK_EDGE: B:48:0x00aa -> B:49:0x00b4 */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        r0 = QfgSZK.UnZVfq.hpp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        if (QfgSZK.UnZVfq.ENU > 7071) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        r1 = QfgSZK.UnZVfq.ENU;
        r2 = r1 + 91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r2 == 28) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
    
        if (r2 == 143) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0094, code lost:
    
        if (r2 == 332) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r2 == 512) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009b, code lost:
    
        QfgSZK.UnZVfq.ENU = (r1 >> 34) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a1, code lost:
    
        QfgSZK.UnZVfq.ENU = (QfgSZK.UnZVfq.ENU % 90) ^ 2134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00aa, code lost:
    
        QfgSZK.UnZVfq.ENU = ((QfgSZK.UnZVfq.ENU ^ 2709) % 104) % com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b4, code lost:
    
        QfgSZK.UnZVfq.ENU >>= org.spongycastle.crypto.tls.CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        QfgSZK.UnZVfq.hpp = ((r0 >> 40) % 82) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        if (QfgSZK.UnZVfq.ENU > 7071) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b4, code lost:
    
        QfgSZK.UnZVfq.ENU >>= org.spongycastle.crypto.tls.CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long DkIxYv(CameraCharacteristics cameraCharacteristics) {
        float[] fArr;
        SizeF sizeF;
        int i;
        int i2;
        if (HJWChP.RGtXKC.DKRTZD.diCPdz < HJWChP.RGtXKC.C0004RGtXKC.gSmTbb || (fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS)) == null || (sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE)) == null) {
            return 0L;
        }
        float width = sizeF.getWidth();
        float height = sizeF.getHeight();
        if ((hpp ^ 9985) == 0) {
            return Math.round((fArr[0] * fCHVMg) / ((float) Math.sqrt((width * width) + (height * height))));
        }
        if ((ENU ^ 7072) != 0) {
            do {
                i = ENU;
                i2 = i + 39;
                if (i2 != 71) {
                    if (i2 != 101) {
                        if (i2 == 176) {
                            ENU = (i + i) >> 11;
                        }
                    }
                    ENU = (ENU ^ 2061) * 117;
                }
                while (true) {
                    ENU = ((ENU ^ 1189) + i) ^ 2358;
                }
            } while (i2 != 193);
            ENU = (i + i) % 102;
        }
        while (true) {
            int i3 = hpp;
            int i4 = i3 + 26;
            if (i4 == 93) {
                while (true) {
                    hpp = (hpp >> 64) * 101;
                }
            } else if (i4 != 256) {
                if (i4 == 281) {
                    hpp = ((i3 ^ 1561) >> 12) ^ 2664;
                    if (ENU > 7071) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        while (true) {
            int i5 = ENU;
            int i6 = i5 + 65;
            if (i6 != 30) {
                if (i6 != 140) {
                    if (i6 == 225) {
                        ENU = (i5 * 29) + i5;
                    }
                }
                ENU = (ENU + i5) >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            }
            ENU = (ENU + i5) * 70;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:109:0x01a1) to fix multi-entry loop: BACK_EDGE: B:109:0x01a1 -> B:110:0x01a3 */
    private boolean OYuSWK(CameraCharacteristics cameraCharacteristics) {
        int i;
        int i2;
        int i3;
        int i4;
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.gSmTbb) {
            CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
            if (ENU <= 7071) {
                do {
                    i3 = ENU;
                    i4 = i3 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                    if (i4 == 13) {
                        while (true) {
                            ENU ^= TypedValues.TransitionType.TYPE_FROM;
                        }
                    } else if (i4 == 75) {
                        ENU = (i3 + i3) >> 73;
                    }
                } while (i4 != 102);
                while (true) {
                    ENU = (ENU + i3) * 6969;
                }
            }
            Integer num = (Integer) cameraCharacteristics.get(key);
            if ((ENU ^ 7072) != 0) {
                while (true) {
                    int i5 = ENU;
                    int i6 = i5 + 26;
                    if (i6 == 43) {
                        ENU = (i5 + i5) ^ 5180;
                    } else if (i6 == 211) {
                        while (true) {
                            ENU = (ENU + i5) >> 92;
                        }
                    } else if (i6 == 364) {
                        while (true) {
                            ENU >>= CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384;
                        }
                    } else if (i6 == 515) {
                        while (true) {
                            ENU = (ENU >> 16) ^ 5498;
                        }
                    }
                }
            } else if (num != null && num.intValue() == 0) {
                if ((hpp ^ 9985) == 0) {
                    return true;
                }
                if (ENU <= 7071) {
                    while (true) {
                        int i7 = ENU;
                        int i8 = i7 + 39;
                        if (i8 == 2) {
                            ENU = ((i7 ^ 3354) % 94) + i7;
                        } else {
                            if (i8 == 80) {
                                break;
                            }
                            if (i8 != 211) {
                                if (i8 == 236) {
                                    ENU = (ENU % 52) ^ 3070;
                                }
                            }
                        }
                        ENU = (ENU + i7) % 55;
                        ENU = (ENU % 52) ^ 3070;
                    }
                    while (true) {
                        ENU = ((ENU >> 95) % 55) ^ 2398;
                    }
                } else {
                    while (true) {
                        i = hpp;
                        int i9 = i + 39;
                        if (i9 == 65) {
                            do {
                                hpp = (hpp >> 51) * 38;
                            } while ((ENU ^ 7072) == 0);
                            while (true) {
                                int i10 = ENU;
                                int i11 = i10 + 52;
                                if (i11 == 53) {
                                    ENU = ((i10 >> 6) ^ 2838) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                                    break;
                                }
                                if (i11 == 147) {
                                    break;
                                }
                            }
                            while (true) {
                                ENU = (ENU * 55) % 45;
                            }
                        } else if (i9 != 263) {
                            if (i9 != 353) {
                                if (i9 == 401) {
                                    hpp = ((i ^ 3052) >> WebSocketProtocol.PAYLOAD_SHORT) * 62;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    int i12 = hpp;
                    if (ENU <= 7071) {
                        while (true) {
                            int i13 = ENU;
                            int i14 = i13 + 117;
                            if (i14 == 10) {
                                ENU = (i13 + i13) * WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                            } else {
                                if (i14 == 44) {
                                    ENU = (i13 >> WalletImportError.ERROR_CODE_AA_EXIST) * 54;
                                    break;
                                }
                                if (i14 == 166) {
                                    break;
                                }
                            }
                        }
                        ENU = (ENU % 56) * 15;
                    }
                    hpp = ((i12 * 92) % 12) ^ 4016;
                    if ((ENU ^ 7072) == 0) {
                        do {
                            int i15 = hpp;
                            i2 = ENU;
                            if (i2 <= 7071) {
                                while (true) {
                                    int i16 = ENU;
                                    int i17 = i16 + 104;
                                    if (i17 == 94) {
                                        ENU = (i16 ^ 4321) * 4059;
                                    } else if (i17 == 148) {
                                        while (true) {
                                            ENU = (ENU ^ MTPushConstants.RemoteWhat.ON_PLATFORM_TOKEN) >> 108;
                                        }
                                    } else if (i17 == 266) {
                                        while (true) {
                                            ENU = (ENU ^ 4659) >> 56;
                                        }
                                    }
                                }
                            } else {
                                hpp = ((i15 * 98) + i) ^ 3859;
                            }
                        } while (i2 > 7071);
                    }
                    while (true) {
                        int i18 = ENU;
                        int i19 = i18 + 65;
                        if (i19 != 71) {
                            if (i19 != 213) {
                                if (i19 == 216) {
                                    while (true) {
                                        ENU = (ENU ^ 1198) >> 30;
                                    }
                                } else if (i19 == 347) {
                                    ENU = (i18 ^ 3952) + i18;
                                }
                            }
                            ENU = (ENU ^ 100) * 84;
                        } else {
                            while (true) {
                                ENU = (ENU >> 101) ^ 6765;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private long QqiRNA(String str) {
        return Long.parseLong(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x002b) to fix multi-entry loop: BACK_EDGE: B:16:0x002b -> B:17:0x002d */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[LOOP:6: B:61:0x00de->B:95:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void UNDaji(String str, CameraCharacteristics cameraCharacteristics, String str2, StringBuilder sb) {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        long jQqiRNA = QqiRNA(str);
        if (OYuSWK(cameraCharacteristics)) {
            if (ENU <= 7071) {
                while (true) {
                    i4 = ENU;
                    int i5 = i4 + 26;
                    if (i5 == 98) {
                        ENU = i4 >> 15;
                        break;
                    }
                    if (i5 == 241) {
                        ENU = i4 + i4 + i4;
                        break;
                    } else if (i5 == 417) {
                        ENU = ((i4 % 89) ^ 1550) % WalletImportError.ERROR_CODE_AA_EXIST;
                        break;
                    } else if (i5 == 518) {
                        break;
                    }
                }
                while (true) {
                    ENU = (ENU + i4) * 8;
                }
            }
            j = 1;
        } else {
            j = 0;
        }
        long jDkIxYv = DkIxYv(cameraCharacteristics);
        if (ENU <= 7071) {
            while (true) {
                int i6 = ENU;
                int i7 = i6 + 130;
                if (i7 == 51) {
                    ENU = (i6 + i6) ^ 4712;
                } else if (i7 == 70) {
                    i3 = ((i6 % 83) >> 71) * 92;
                    ENU = i3;
                } else if (i7 != 198) {
                    if (i7 == 320) {
                        i3 = (ENU * WalletImportError.ERROR_CODE_AA_EXIST) >> 56;
                        ENU = i3;
                    }
                }
                ENU = (ENU >> 106) ^ 2143;
                i3 = (ENU * WalletImportError.ERROR_CODE_AA_EXIST) >> 56;
                ENU = i3;
            }
        } else {
            sb.append(jQqiRNA);
            sb.append(",");
            sb.append(j);
            if (ENU > 7071) {
                sb.append(",");
                sb.append(jDkIxYv);
                sb.append(",");
                if (str2 == null) {
                    if ((hpp ^ 9985) != 0) {
                        do {
                            i = hpp;
                            i2 = i + 52;
                            if (i2 != 56) {
                                if (i2 == 97) {
                                    hpp = (i * 62) >> 40;
                                }
                            }
                            hpp ^= 8153;
                            if ((ENU ^ 7072) == 0) {
                                do {
                                    hpp = ((hpp + i) >> 75) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                                } while ((ENU ^ 7072) == 0);
                            }
                            while (ENU + 91 != 9) {
                            }
                            while (true) {
                                ENU = (ENU ^ MTCoreConstants.RemoteWhat.START_CONNECT) * 9;
                            }
                        } while (i2 != 286);
                        do {
                            hpp = ((hpp + i) >> 75) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                        } while ((ENU ^ 7072) == 0);
                        while (ENU + 91 != 9) {
                        }
                        while (true) {
                            ENU = (ENU ^ MTCoreConstants.RemoteWhat.START_CONNECT) * 9;
                        }
                    } else {
                        str2 = "-";
                    }
                }
                sb.append(str2);
                return;
            }
            while (true) {
                int i8 = ENU;
                if (i8 + 39 == 39) {
                    ENU = (i8 >> 41) % 90;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private void UkuJRw(QSusPL qSusPL) {
        this.UauWer = new StringBuilder();
        if (HJWChP.RGtXKC.DKRTZD.diCPdz >= HJWChP.RGtXKC.C0004RGtXKC.gSmTbb) {
            Object systemService = qSusPL.aPFruk().Umbazn.getSystemService(GCXiNH.fsw("~pViYP"));
            if (systemService instanceof CameraManager) {
                CameraManager cameraManager = (CameraManager) systemService;
                try {
                    for (String str : cameraManager.getCameraIdList()) {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        if (fOrBHg(cameraCharacteristics)) {
                            DDNONI(cameraManager, str, cameraCharacteristics);
                        } else {
                            if (this.UauWer.length() > 0) {
                                this.UauWer.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                            }
                            UNDaji(str, cameraCharacteristics, null, this.UauWer);
                        }
                    }
                } catch (Throwable th) {
                    FQMcgE.svhCHd(DlIaRS, GCXiNH.fsw("ytHoYXc{OIOFXH[\u001d\u0016") + th);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:46:0x008c) to fix multi-entry loop: BACK_EDGE: B:46:0x008c -> B:47:0x0093 */
    /* JADX DEBUG: Duplicate block (B:68:0x00e4) to fix multi-entry loop: BACK_EDGE: B:67:0x00de -> B:68:0x00e4 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean fOrBHg(android.hardware.camera2.CameraCharacteristics r6) {
        /*
            r5 = this;
            int r0 = QfgSZK.HJWChP.RGtXKC.DKRTZD.diCPdz
            int r1 = QfgSZK.HJWChP.RGtXKC.C0004RGtXKC.dUYiGO
            r2 = 0
            if (r0 < r1) goto Lf2
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r6 = r6.get(r0)
            int[] r6 = (int[]) r6
            if (r6 == 0) goto Lf2
            int r0 = r6.length
            r1 = r2
        L13:
            if (r1 >= r0) goto Lf2
            r3 = r6[r1]
            r4 = 11
            if (r3 != r4) goto L1d
            r6 = 1
            return r6
        L1d:
            int r1 = r1 + 1
            int r3 = QfgSZK.UnZVfq.hpp
            r3 = r3 ^ 9985(0x2701, float:1.3992E-41)
            if (r3 == 0) goto L13
        L25:
            int r6 = QfgSZK.UnZVfq.hpp
            int r0 = r6 + 39
            r1 = 37
            if (r0 == r1) goto Le7
            r1 = 126(0x7e, float:1.77E-43)
            r2 = 55
            if (r0 == r1) goto La5
            r6 = 224(0xe0, float:3.14E-43)
            if (r0 == r6) goto L38
            goto L25
        L38:
            int r6 = QfgSZK.UnZVfq.hpp
            int r0 = QfgSZK.UnZVfq.ENU
            r0 = r0 ^ 7072(0x1ba0, float:9.91E-42)
            if (r0 == 0) goto L63
        L40:
            int r0 = QfgSZK.UnZVfq.ENU
            int r1 = r0 + 130
            r3 = 23
            if (r1 == r3) goto L5d
            r3 = 124(0x7c, float:1.74E-43)
            if (r1 == r3) goto L56
            r3 = 136(0x88, float:1.9E-43)
            if (r1 == r3) goto L51
            goto L40
        L51:
            int r0 = r0 * 7
            int r0 = r0 % 36
            goto L61
        L56:
            r1 = r0 ^ 2051(0x803, float:2.874E-42)
            int r1 = r1 + r0
            int r1 = r1 + r0
            QfgSZK.UnZVfq.ENU = r1
            goto L40
        L5d:
            int r0 = r0 >> 27
            int r0 = r0 % 33
        L61:
            QfgSZK.UnZVfq.ENU = r0
        L63:
            int r6 = r6 % 64
            r6 = r6 ^ 4121(0x1019, float:5.775E-42)
            int r6 = r6 * 113
            QfgSZK.UnZVfq.hpp = r6
            int r6 = QfgSZK.UnZVfq.ENU
            r6 = r6 ^ 7072(0x1ba0, float:9.91E-42)
            if (r6 == 0) goto L38
        L71:
            int r6 = QfgSZK.UnZVfq.ENU
            int r0 = r6 + 91
            r1 = 67
            if (r0 == r1) goto L8c
            r3 = 87
            if (r0 == r3) goto L9b
            r3 = 175(0xaf, float:2.45E-43)
            if (r0 == r3) goto L95
            r3 = 183(0xb7, float:2.56E-43)
            if (r0 == r3) goto L86
            goto L71
        L86:
            int r0 = r6 % 105
            int r0 = r0 * 75
            int r0 = r0 + r6
            goto L93
        L8c:
            int r0 = QfgSZK.UnZVfq.ENU
            int r0 = r0 >> r1
            r0 = r0 ^ 5292(0x14ac, float:7.416E-42)
            int r0 = r0 >> 89
        L93:
            QfgSZK.UnZVfq.ENU = r0
        L95:
            int r0 = QfgSZK.UnZVfq.ENU
            int r0 = r0 >> r2
            int r0 = r0 + r6
            QfgSZK.UnZVfq.ENU = r0
        L9b:
            int r0 = QfgSZK.UnZVfq.ENU
            int r0 = r0 >> 65
            int r0 = r0 + r6
            int r0 = r0 % 15
            QfgSZK.UnZVfq.ENU = r0
            goto L8c
        La5:
            int r0 = QfgSZK.UnZVfq.ENU
            r1 = r0 ^ 7072(0x1ba0, float:9.91E-42)
            r3 = 48
            if (r1 == 0) goto Lc3
        Lad:
            int r6 = QfgSZK.UnZVfq.ENU
            int r0 = r6 + 104
            if (r0 == r3) goto Lbe
            r1 = 142(0x8e, float:1.99E-43)
            if (r0 == r1) goto Lb8
            goto Lad
        Lb8:
            r0 = r6 ^ 2597(0xa25, float:3.639E-42)
            int r0 = r0 + r6
            QfgSZK.UnZVfq.ENU = r0
            goto Lad
        Lbe:
            int r6 = r6 >> 92
            QfgSZK.UnZVfq.ENU = r6
            goto Lad
        Lc3:
            int r1 = r6 + r6
            int r1 = r1 >> 122
            int r1 = r1 + r6
            QfgSZK.UnZVfq.hpp = r1
            r1 = 7071(0x1b9f, float:9.909E-42)
            if (r0 > r1) goto Le7
        Lce:
            int r6 = QfgSZK.UnZVfq.ENU
            int r0 = r6 + 65
            if (r0 == r2) goto Lde
            r1 = 229(0xe5, float:3.21E-43)
            if (r0 == r1) goto Ld9
            goto Lce
        Ld9:
            int r6 = r6 % 21
            int r6 = r6 * 26
            goto Le4
        Lde:
            int r6 = QfgSZK.UnZVfq.ENU
            int r6 = r6 % r3
            int r6 = r6 % r3
            int r6 = r6 >> 51
        Le4:
            QfgSZK.UnZVfq.ENU = r6
            goto Lde
        Le7:
            int r0 = QfgSZK.UnZVfq.hpp
            int r0 = r0 + r6
            int r6 = r0 >> 88
            int r6 = r6 % 12
            QfgSZK.UnZVfq.hpp = r6
            goto L25
        Lf2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: QfgSZK.UnZVfq.fOrBHg(android.hardware.camera2.CameraCharacteristics):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        QfgSZK.UnZVfq.ENU = r1;
     */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gHZMYf(Map<String, String> map) {
        int i;
        int i2;
        if (map == null) {
            return;
        }
        String strDbNXlk = AhwBna.DEVICE_CAMERA_DESCRIPTION.DbNXlk();
        if ((ENU ^ 7072) != 0) {
            while (true) {
                i = ENU;
                int i3 = i + 26;
                if (i3 == 68) {
                    i2 = ((i + i) % 57) * 103;
                    break;
                }
                if (i3 == 136) {
                    i2 = ((i >> 102) + i) >> 51;
                    break;
                } else if (i3 == 247) {
                    ENU = (i % 28) ^ 4903;
                    break;
                } else if (i3 == 386) {
                    break;
                }
            }
            ENU = ((ENU % 35) % 61) + i;
        }
        map.put(strDbNXlk, this.UauWer.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_CAMERA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        UkuJRw(qSusPL);
    }
}
