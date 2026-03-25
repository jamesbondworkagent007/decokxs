package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class OtZEmZ extends QhsCdE {
    static final int BYTE_INDEX0 = 0;
    static final int BYTE_INDEX3 = 3;
    static final int JB_BIT_INDEX = 11;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String UYGpYn;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String afkjiG;
    public static int hGu;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String hRwBzU;
    public static int uhx;

    /* JADX INFO: Incorrect field signature: Lint; */
    static String zCvnsd;
    private final Map<String, String> UuCIib;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        uhx = 2690;
        GCXiNH.OHr = 2270;
        hGu = 8108;
        Hx(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OtZEmZ(long j, boolean z) {
        super(j, z);
        this.UuCIib = new HashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void Hx(boolean z) {
        if (z) {
            Hx(false);
        }
        hRwBzU = GCXiNH.fsw("P^\u007fYgt^JUxg|nl~nupk`wre}wie");
        UYGpYn = GCXiNH.fsw("P^\u007fYgt^JUxg|k||os{`zqpdfqs");
        zCvnsd = GCXiNH.fsw("P^\u007fYgt^JUxg|h`gjsafzqb");
        afkjiG = GCXiNH.fsw("P^\u007fYgt^JUxg|ylftygg");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:22:0x004c) to fix multi-entry loop: BACK_EDGE: B:22:0x004c -> B:23:0x004e */
    public int DjWNei(String str) {
        int i;
        int i2;
        int iIluEmO = UPbYzn.iluEmO(str);
        if (uhx <= 2689) {
            while (true) {
                i2 = uhx;
                int i3 = i2 + 13;
                if (i3 == 30) {
                    uhx = ((i2 * 18) ^ 5182) * 14;
                } else if (i3 == 62) {
                    break;
                }
            }
            uhx = (i2 % 76) ^ 1135;
        }
        if ((hGu ^ 8108) == 0) {
            return ((iIluEmO % 5) * 12) + (iIluEmO % 11);
        }
        do {
            int i4 = hGu;
            i = i4 + 13;
            if (i == 14) {
                hGu = ((i4 * 27) % 33) ^ 3812;
            } else if (i != 168) {
            }
            while (true) {
                hGu = ((hGu * 4) % 120) ^ 3160;
            }
        } while (i != 232);
        while (true) {
            hGu = (hGu % 124) ^ 4312;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:14:0x004a) to fix multi-entry loop: BACK_EDGE: B:14:0x004a -> B:15:0x004c */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        if (map == null) {
            return;
        }
        AhwBna ahwBna = AhwBna.TAMPER_CODE_BASE_MODULE;
        map.put(ahwBna.DbNXlk(), this.UuCIib.get(ahwBna.DbNXlk()));
        AhwBna ahwBna2 = AhwBna.TAMPER_CODE_AUTH_MODULE;
        map.put(ahwBna2.DbNXlk(), this.UuCIib.get(ahwBna2.DbNXlk()));
        AhwBna ahwBna3 = AhwBna.TAMPER_CODE_BB_MODULE;
        String strDbNXlk = ahwBna3.DbNXlk();
        Map<String, String> map2 = this.UuCIib;
        if ((uhx ^ 2690) == 0) {
            map.put(strDbNXlk, map2.get(ahwBna3.DbNXlk()));
            AhwBna ahwBna4 = AhwBna.TAMPER_CODE_DSH_MODULE;
            map.put(ahwBna4.DbNXlk(), this.UuCIib.get(ahwBna4.DbNXlk()));
            AhwBna ahwBna5 = AhwBna.TAMPER_CODE_SENSOR_MODULE;
            map.put(ahwBna5.DbNXlk(), this.UuCIib.get(ahwBna5.DbNXlk()));
            return;
        }
        while (true) {
            int i = uhx;
            int i2 = i + 26;
            if (i2 == 79) {
                while (true) {
                    uhx = (uhx + i) * 75;
                }
            } else if (i2 == 145) {
                uhx = i >> 39;
                break;
            } else if (i2 == 189) {
                break;
            }
        }
        while (true) {
            uhx = ((uhx ^ 3958) % 125) ^ 2264;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_TAMPER_CODE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:112:0x01ec) to fix multi-entry loop: BACK_EDGE: B:112:0x01ec -> B:113:0x01ee */
    /* JADX DEBUG: Duplicate block (B:18:0x0039) to fix multi-entry loop: BACK_EDGE: B:18:0x0039 -> B:19:0x003b */
    /* JADX DEBUG: Duplicate block (B:72:0x00f4) to fix multi-entry loop: BACK_EDGE: B:72:0x00f4 -> B:73:0x00f6 */
    /* JADX DEBUG: Duplicate block (B:81:0x0115) to fix multi-entry loop: BACK_EDGE: B:81:0x0115 -> B:82:0x0117 */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0117, code lost:
    
        QfgSZK.OtZEmZ.uhx = (r0 + r0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        QfgSZK.OtZEmZ.uhx >>= 73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d1, code lost:
    
        if (r1 <= 2689) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r1 <= 2689) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0107, code lost:
    
        r0 = QfgSZK.OtZEmZ.uhx;
        r9 = r0 + org.spongycastle.crypto.tls.CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010d, code lost:
    
        if (r9 == 83) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010f, code lost:
    
        if (r9 == 122) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0115, code lost:
    
        QfgSZK.OtZEmZ.uhx = (QfgSZK.OtZEmZ.uhx + r0) * 23;
     */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (qSusPL.aPFruk() == null) {
            return;
        }
        DCUTEI dcuteiRcLksq = qSusPL.RcLksq();
        int i9 = hGu;
        if (uhx <= 2689) {
            while (true) {
                i8 = uhx;
                int i10 = i8 + 26;
                if (i10 == 59) {
                    uhx = (i8 >> 47) + i8 + i8;
                    break;
                } else if (i10 == 202) {
                    uhx = (i8 * 34) >> 69;
                    break;
                } else if (i10 == 330) {
                    break;
                } else if (i10 == 482) {
                    break;
                }
            }
            uhx = (uhx ^ 1780) + i8;
        }
        if (i9 <= 8107) {
            do {
                int i11 = hGu;
                int i12 = uhx;
                if (i12 <= 2689) {
                    while (true) {
                        i4 = uhx;
                        int i13 = i4 + 208;
                        if (i13 == 67) {
                            uhx = ((i4 ^ 3685) * 6) + i4;
                        } else if (i13 == 227) {
                            break;
                        }
                    }
                    while (true) {
                        uhx = ((uhx * 74) >> 11) + i4;
                    }
                } else {
                    i5 = i11 + 52;
                    if (i5 != 71) {
                        if (i5 == 170) {
                            hGu = i11 >> 105;
                        } else if (i5 == 293) {
                            do {
                                hGu ^= 7377;
                            } while ((uhx ^ 2690) == 0);
                            while (uhx + 130 != 65) {
                            }
                            while (true) {
                                uhx *= 885;
                            }
                        }
                    } else if ((i12 ^ 2690) != 0) {
                        while (true) {
                            i6 = uhx;
                            int i14 = i6 + 234;
                            if (i14 == 89) {
                                uhx = (i6 % 6) >> 60;
                                break;
                            } else if (i14 == 284) {
                                uhx = (i6 % 48) >> 59;
                            } else if (i14 == 447) {
                                break;
                            }
                        }
                        while (true) {
                            uhx = ((uhx * 27) % 97) + i6;
                        }
                    } else {
                        hGu = ((i11 % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) * 27) + i11;
                    }
                }
            } while (i5 != 417);
            while (true) {
                int i15 = hGu;
                if (uhx <= 2689) {
                    while (true) {
                        i7 = uhx;
                        int i16 = i7 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                        if (i16 == 86) {
                            uhx = (i7 + i7) >> 105;
                            break;
                        } else if (i16 != 122) {
                            if (i16 == 152) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    uhx = ((uhx + i7) + i7) >> 79;
                    uhx = (uhx ^ 4390) % 9;
                }
                hGu = (i15 ^ 1171) * 2491;
            }
        }
        if (dcuteiRcLksq == null || qSusPL.gBtXYZ() == null) {
            return;
        }
        int iDjWNei = DjWNei(qSusPL.gBtXYZ().sfBaYs);
        int i17 = (iDjWNei < 0 || iDjWNei >= 11) ? 0 : 3;
        Map<String, String> map2 = this.UuCIib;
        String strDbNXlk = AhwBna.TAMPER_CODE_BASE_MODULE.DbNXlk();
        long jLongValue = Zpvmxu.OHqIaq(iDjWNei).longValue();
        if ((uhx ^ 2690) != 0) {
            while (true) {
                i3 = uhx;
                int i18 = i3 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                if (i18 != 92) {
                    if (i18 == 181) {
                        break;
                    } else if (i18 == 195) {
                        uhx = ((i3 ^ MfaResponse.SESSION_INVALID) % 95) + i3;
                    }
                }
                uhx = (uhx % 119) >> CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384;
            }
            uhx = i3 ^ 249;
        }
        map2.put(strDbNXlk, Long.toString(UPbYzn.fACtfg(jLongValue, i17)));
        this.UuCIib.put(AhwBna.TAMPER_CODE_AUTH_MODULE.DbNXlk(), Long.toString(UPbYzn.fACtfg(qSusPL.RcLksq().OHqIaq(UYGpYn, iDjWNei).longValue(), i17)));
        this.UuCIib.put(AhwBna.TAMPER_CODE_BB_MODULE.DbNXlk(), Long.toString(UPbYzn.fACtfg(qSusPL.RcLksq().OHqIaq(zCvnsd, iDjWNei).longValue(), i17)));
        Map<String, String> map3 = this.UuCIib;
        String strDbNXlk2 = AhwBna.TAMPER_CODE_DSH_MODULE.DbNXlk();
        Long lOHqIaq = qSusPL.RcLksq().OHqIaq(hRwBzU, iDjWNei);
        if ((uhx ^ 2690) == 0) {
            map3.put(strDbNXlk2, Long.toString(UPbYzn.fACtfg(lOHqIaq.longValue(), i17)));
            Map<String, String> map4 = this.UuCIib;
            String strDbNXlk3 = AhwBna.TAMPER_CODE_SENSOR_MODULE.DbNXlk();
            if ((uhx ^ 2690) != 0) {
                do {
                    int i19 = uhx;
                    i = i19 + 221;
                    if (i == 18) {
                        uhx = ((i19 % 19) >> 107) % 16;
                    } else if (i == 75) {
                        while (true) {
                            uhx = (uhx % 95) >> 103;
                        }
                    }
                } while (i != 149);
                while (true) {
                    uhx = (uhx * 39) >> 94;
                }
            }
            map4.put(strDbNXlk3, Long.toString(UPbYzn.fACtfg(qSusPL.RcLksq().OHqIaq(afkjiG, iDjWNei).longValue(), i17)));
            return;
        }
        while (true) {
            i2 = uhx;
            int i20 = i2 + 78;
            if (i20 == 58) {
                uhx = (i2 ^ 1837) >> 120;
                break;
            } else if (i20 == 176) {
                break;
            }
        }
        while (true) {
            uhx = (uhx >> 108) + i2;
        }
    }
}
