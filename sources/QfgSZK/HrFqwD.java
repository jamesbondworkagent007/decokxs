package QfgSZK;

import QfgSZK.FQMcgE;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class HrFqwD implements LocationListener {
    private static String DlIaRS = null;
    private static final int QZCcVL = 120000;
    public static int cBL;
    public static int zLP;
    private Location gRnOxq = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        zLP = 6140;
        FQMcgE.RQa = 9057;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        cBL = 5228;
        DlIaRS = FQMcgE.hfdhUn(HrFqwD.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private boolean fzHEvu(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x004e) to fix multi-entry loop: BACK_EDGE: B:24:0x004e -> B:25:0x0050 */
    /* JADX DEBUG: Duplicate block (B:66:0x00e5) to fix multi-entry loop: BACK_EDGE: B:65:0x00e1 -> B:66:0x00e5 */
    /* JADX DEBUG: Duplicate block (B:89:0x012d) to fix multi-entry loop: BACK_EDGE: B:88:0x0127 -> B:89:0x012d */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x015b, code lost:
    
        if ((QfgSZK.HrFqwD.zLP + 377) == 56) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015e, code lost:
    
        QfgSZK.HrFqwD.zLP = (QfgSZK.HrFqwD.zLP * 2964) ^ 2696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0167, code lost:
    
        QfgSZK.HrFqwD.cBL = ((r0 % 18) % 99) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x012d, code lost:
    
        QfgSZK.HrFqwD.zLP = (QfgSZK.HrFqwD.zLP % 124) ^ 4336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0151, code lost:
    
        r0 = QfgSZK.HrFqwD.cBL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0155, code lost:
    
        if (QfgSZK.HrFqwD.zLP > 6139) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean nriSR(Location location, Location location2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        if ((zLP ^ 6140) != 0) {
            do {
                i9 = zLP;
                i10 = i9 + 26;
                if (i10 == 33) {
                    while (true) {
                        zLP = (zLP >> 56) + i9;
                    }
                }
            } while (i10 != 169);
            zLP = (i9 % WalletImportError.ERROR_CODE_AA_CREATE_KEY) ^ 5229;
        }
        int i11 = cBL ^ 5228;
        if (i11 == 0) {
            if (time <= 120000) {
                z = false;
            } else if (i11 != 0) {
                loop7: while (true) {
                    int i12 = cBL;
                    if (zLP <= 6139) {
                        while (true) {
                            i5 = zLP;
                            int i13 = i5 + 598;
                            if (i13 != 57) {
                                if (i13 == 140) {
                                    zLP = (i5 ^ 2189) >> 80;
                                    break;
                                }
                                if (i13 == 147) {
                                    zLP = (i5 ^ 3482) + i5;
                                } else if (i13 == 196) {
                                    zLP = ((i5 % 22) >> 16) % 22;
                                    break loop7;
                                }
                            } else {
                                break loop7;
                            }
                        }
                    }
                    int i14 = i12 + 39;
                    if (i14 == 66) {
                        int i15 = cBL;
                        if (zLP <= 6139) {
                            while (true) {
                                int i16 = zLP;
                                int i17 = i16 + 650;
                                if (i17 == 90) {
                                    zLP = ((i16 + i16) ^ 2560) + i16;
                                    break;
                                }
                                if (i17 == 161) {
                                    break;
                                }
                                if (i17 == 280) {
                                    while (true) {
                                        zLP = (zLP + i16) >> 120;
                                    }
                                } else if (i17 == 345) {
                                    zLP = ((i16 * 38) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) + i16;
                                    break;
                                }
                            }
                        }
                        cBL = ((i15 + i12) >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) * 93;
                        if (zLP <= 6139) {
                            while (true) {
                                int i18 = zLP;
                                if (i18 + 338 == 17) {
                                    zLP = ((i18 + i18) ^ 5231) >> 96;
                                }
                            }
                        }
                    } else if (i14 == 116) {
                        while (true) {
                            cBL = ((cBL + i12) + i12) ^ 5498;
                        }
                    } else if (i14 == 201) {
                        break;
                    }
                }
                while (true) {
                    zLP = (zLP + i5) * 17;
                }
            } else {
                z = true;
            }
            int i19 = zLP;
            int i20 = i19 ^ 6140;
            if (i20 != 0) {
                while (true) {
                    int i21 = zLP;
                    int i22 = i21 + 39;
                    if (i22 == 13) {
                        zLP = ((i21 >> 94) + i21) % 93;
                    } else if (i22 != 185) {
                    }
                    zLP = ((zLP * 85) % WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) >> 117;
                }
            } else {
                boolean z5 = time < -120000;
                if (i19 <= 6139) {
                    while (zLP + 52 != 87) {
                    }
                    while (true) {
                        zLP = (zLP % 38) >> 16;
                    }
                } else {
                    if (time > 0) {
                        if (i20 != 0) {
                            while (true) {
                                int i23 = zLP;
                                int i24 = i23 + 286;
                                if (i24 == 41) {
                                    zLP = ((i23 % 44) % 47) % 105;
                                    break;
                                }
                                if (i24 == 178) {
                                    break;
                                }
                            }
                            zLP = (zLP % 18) ^ 4596;
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        return true;
                    }
                    if (z5) {
                        return false;
                    }
                    int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
                    boolean z6 = accuracy > 0;
                    if (accuracy >= 0) {
                        z3 = false;
                    } else if (cBL <= 5227) {
                        loop22: while (true) {
                            int i25 = cBL;
                            int i26 = i25 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                            if (i26 != 36) {
                                if (i26 != 125) {
                                    continue;
                                } else {
                                    cBL = (i25 ^ 4585) % 30;
                                    if ((zLP ^ 6140) != 0) {
                                        while (zLP + 481 != 95) {
                                        }
                                        while (true) {
                                            zLP = ((zLP ^ 3133) % 114) % 75;
                                        }
                                    }
                                }
                            }
                            int i27 = cBL;
                            if ((zLP ^ 6140) != 0) {
                                while (true) {
                                    int i28 = zLP;
                                    int i29 = i28 + TypedValues.PositionType.TYPE_PERCENT_Y;
                                    if (i29 == 18) {
                                        zLP = ((i28 * 48) >> WalletImportError.ERROR_CODE_AA_EXIST) % 108;
                                        break;
                                    }
                                    if (i29 == 60) {
                                        zLP = (i28 + i28 + i28) * 9;
                                        break;
                                    }
                                    if (i29 != 218) {
                                        if (i29 == 340) {
                                            zLP = (i28 % 26) * 106;
                                            break loop22;
                                        }
                                    } else {
                                        break loop22;
                                    }
                                }
                            }
                            cBL = ((i27 ^ 3332) + i25) * 78;
                            if (zLP <= 6139) {
                                do {
                                    i4 = zLP + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                                    if (i4 == 34) {
                                        while (true) {
                                            zLP = ((zLP >> 62) ^ 2361) * 121;
                                        }
                                    }
                                } while (i4 != 129);
                                while (true) {
                                    zLP = (zLP % 65) * 300;
                                }
                            }
                        }
                        while (true) {
                            zLP = (zLP >> 53) * 94;
                        }
                    } else {
                        z3 = true;
                    }
                    if (accuracy <= 200) {
                        z4 = false;
                    } else if ((zLP ^ 6140) != 0) {
                        while (true) {
                            int i30 = zLP;
                            int i31 = i30 + 585;
                            if (i31 == 99) {
                                zLP = (i30 % 51) * 87;
                            } else if (i31 == 173) {
                                break;
                            }
                        }
                        while (true) {
                            zLP = (zLP * 53) ^ 3874;
                        }
                    } else {
                        if (cBL <= 5227) {
                            while (true) {
                                int i32 = cBL;
                                int i33 = i32 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                                if (i33 == 92) {
                                    cBL = i32 * 7521;
                                    if ((zLP ^ 6140) != 0) {
                                        while (true) {
                                            int i34 = zLP;
                                            int i35 = i34 + 455;
                                            if (i35 == 27) {
                                                zLP = (i34 ^ MTCommonConstants.RemoteWhat.ON_SERVICE_DISCONNECTED) + i34;
                                                break;
                                            }
                                            if (i35 == 183) {
                                                zLP = ((i34 ^ 3929) + i34) >> 100;
                                                break;
                                            }
                                        }
                                    }
                                } else if (i33 != 133) {
                                    if (i33 == 322) {
                                        cBL = (i32 * 125) % 121;
                                        if (zLP <= 6139) {
                                            do {
                                                i2 = zLP;
                                                i3 = i2 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                                if (i3 == 82) {
                                                    while (true) {
                                                        zLP ^= 3502;
                                                    }
                                                } else if (i3 == 195) {
                                                    while (true) {
                                                        zLP = (zLP + i2) ^ MfaResponse.MAXIMUM_RETRY;
                                                    }
                                                } else if (i3 == 271) {
                                                    while (true) {
                                                        zLP = (zLP ^ 2909) % 38;
                                                    }
                                                }
                                            } while (i3 != 331);
                                            while (true) {
                                                zLP = (zLP ^ 3330) + i2;
                                            }
                                        }
                                    }
                                }
                                cBL = (cBL ^ 3060) % 78;
                                if ((zLP ^ 6140) != 0) {
                                    while (true) {
                                        int i36 = zLP;
                                        int i37 = i36 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                                        if (i37 == 2) {
                                            zLP = ((i36 % 69) * 86) + i36;
                                        } else if (i37 == 185) {
                                            zLP = (zLP + i36) ^ 3368;
                                            zLP = (zLP + i36) >> PsExtractor.VIDEO_STREAM_MASK;
                                        } else if (i37 != 307) {
                                            if (i37 == 463) {
                                                zLP = (zLP + i36) >> PsExtractor.VIDEO_STREAM_MASK;
                                            }
                                        }
                                        zLP = (zLP % 80) * 64;
                                        zLP = (zLP + i36) ^ 3368;
                                        zLP = (zLP + i36) >> PsExtractor.VIDEO_STREAM_MASK;
                                    }
                                }
                            }
                        }
                        z4 = true;
                    }
                    boolean zFzHEvu = fzHEvu(location.getProvider(), location2.getProvider());
                    if (z3) {
                        return true;
                    }
                    int i38 = zLP;
                    if (i38 > 6139) {
                        if (z2 && !z6) {
                            return true;
                        }
                        if (z2) {
                            if ((i38 ^ 6140) != 0) {
                                while (true) {
                                    int i39 = zLP;
                                    if (i39 + 637 == 5) {
                                        zLP = ((i39 % 42) >> 114) * 27;
                                    }
                                }
                            } else if (!z4 && zFzHEvu) {
                                return true;
                            }
                        }
                        return false;
                    }
                    while (true) {
                        i = zLP;
                        int i40 = i + 208;
                        if (i40 == 68) {
                            break;
                        }
                        if (i40 == 122) {
                            zLP = (i % 81) >> 66;
                        }
                    }
                    while (true) {
                        zLP = ((zLP * 93) >> 81) + i;
                    }
                }
            }
        } else if (zLP <= 6139) {
            while (true) {
                i8 = zLP;
                int i41 = i8 + 390;
                if (i41 == 39) {
                    zLP = i8 * 9844;
                    break;
                }
                if (i41 == 235) {
                    break;
                }
            }
            while (true) {
                zLP = (zLP + i8) * 27;
            }
        } else {
            while (true) {
                int i42 = cBL;
                int i43 = i42 + 260;
                if (i43 == 39) {
                    cBL = ((i42 >> 39) + i42) % 109;
                    if ((zLP ^ 6140) != 0) {
                        while (true) {
                            i6 = zLP;
                            int i44 = i6 + 416;
                            if (i44 == 70) {
                                i7 = i6 * 3472;
                            } else {
                                if (i44 == 223) {
                                    break;
                                }
                                if (i44 == 230) {
                                    i7 = 367010 * i6;
                                } else if (i44 == 417) {
                                    zLP = (zLP + i6) >> 82;
                                }
                            }
                            zLP = i7;
                            zLP = (zLP + i6) >> 82;
                        }
                        zLP = (i6 * 30) >> 78;
                    }
                } else if (i43 == 84) {
                    break;
                }
            }
            while (true) {
                cBL = (cBL ^ 1152) * 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Location hgxRZI() {
        if (this.gRnOxq != null) {
            return new Location(this.gRnOxq);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location == null) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("q~Xm_Xnp,AQ\u0003D\\DK\u001a\u0015D\\ABYMRD\u001cKHVN^B``#`x _\fdkha)dhut`z}\u007f0\u007flrjr~|j"));
            return;
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("r}X"));
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("r\u007fwcHPuwcFaKKGOBR\u001d\u001d\u0013\b\u0011") + location.getProvider() + ":" + location.getLatitude() + ":" + location.getLongitude() + ":" + location.getAccuracy());
        if (nriSR(location, this.gRnOxq)) {
            this.gRnOxq = location;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("r\u007fk~DGhziZfJYHJKSQ\u000e\u0013") + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("r\u007fk~DGhziZgMKKDBR\u000f\u0014") + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:27:0x0069) to fix multi-entry loop: BACK_EDGE: B:26:0x0064 -> B:27:0x0069 */
    /* JADX DEBUG: Duplicate block (B:29:0x0071) to fix multi-entry loop: BACK_EDGE: B:28:0x006c -> B:29:0x0071 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (QfgSZK.HrFqwD.zLP <= 6139) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r3 = QfgSZK.HrFqwD.zLP;
        r4 = r3 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r4 == 77) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r4 == 121) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r4 == 183) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r4 == 292) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        QfgSZK.HrFqwD.zLP = (r3 * 99) % 96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        QfgSZK.HrFqwD.zLP = r3 >> 71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r3 = QfgSZK.HrFqwD.cBL;
        r4 = r3 + 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r4 == 80) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        if (r4 == 245) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r4 == 265) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        QfgSZK.HrFqwD.cBL = ((QfgSZK.HrFqwD.cBL * 92) >> 24) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        QfgSZK.HrFqwD.cBL = ((QfgSZK.HrFqwD.cBL >> 10) + r3) ^ 4120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
    
        QfgSZK.HrFqwD.cBL >>= 138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if ((QfgSZK.HrFqwD.zLP ^ 6140) == 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        r3 = QfgSZK.HrFqwD.zLP;
        r4 = r3 + 78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r4 == 41) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r4 == 122) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        if (r4 == 218) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        if (r4 == 274) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bb, code lost:
    
        QfgSZK.HrFqwD.zLP = (QfgSZK.HrFqwD.zLP >> 8) % 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c4, code lost:
    
        r3 = (r3 * 62) ^ 4388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
    
        QfgSZK.HrFqwD.zLP = (r3 ^ 1130) * 107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cf, code lost:
    
        r3 = ((QfgSZK.HrFqwD.zLP % 73) % 117) * 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        QfgSZK.HrFqwD.zLP = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0069, code lost:
    
        QfgSZK.HrFqwD.zLP = (QfgSZK.HrFqwD.zLP + r3) % 73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0071, code lost:
    
        QfgSZK.HrFqwD.zLP = (QfgSZK.HrFqwD.zLP ^ 5883) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if ((QfgSZK.HrFqwD.zLP ^ 6140) != 0) goto L71;
     */
    @Override // android.location.LocationListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStatusChanged(String str, int i, Bundle bundle) {
        String strFsw;
        String str2 = DlIaRS;
        StringBuilder sb = new StringBuilder();
        sb.append(GCXiNH.fsw("r\u007fhxJEtmO@CMMLL\u001d\u0016"));
        sb.append(str);
        sb.append(GCXiNH.fsw("=bOm_Dr$,"));
        if (i == 2) {
            strFsw = GCXiNH.fsw("|gZeGPcri\b");
            if ((cBL ^ 5228) != 0) {
            }
            sb.append(strFsw);
            FQMcgE.fQMcgE.sIqKDg(str2, sb.toString());
        }
        if (i == 1) {
            strFsw = GCXiNH.fsw("itV|DC`leD[\u0003_GIQW\\XRP]U");
            if (cBL <= 5227) {
            }
        } else {
            strFsw = GCXiNH.fsw(i == 0 ? "RdO,DW!MiZTJIL" : "h\u007fPbDFo");
        }
        sb.append(strFsw);
        FQMcgE.fQMcgE.sIqKDg(str2, sb.toString());
    }
}
