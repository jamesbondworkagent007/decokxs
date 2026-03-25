package QfgSZK;

import QfgSZK.QhsCdE;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class ZNPcth extends QhsCdE {
    public static int cma = 1247;
    public static int dGr = 8065;
    private long QrtYXS;
    private String RqiSNV;
    private long gPdOYW;
    private long sbuptt;
    private String zvqbYA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ZNPcth(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:100:0x0177) to fix multi-entry loop: BACK_EDGE: B:99:0x0171 -> B:100:0x0177 */
    /* JADX DEBUG: Duplicate block (B:102:0x017f) to fix multi-entry loop: BACK_EDGE: B:101:0x017a -> B:102:0x017f */
    /* JADX DEBUG: Duplicate block (B:132:0x01f5) to fix multi-entry loop: BACK_EDGE: B:131:0x01ee -> B:132:0x01f5 */
    /* JADX DEBUG: Duplicate block (B:155:0x0237) to fix multi-entry loop: BACK_EDGE: B:155:0x0237 -> B:156:0x0239 */
    /* JADX DEBUG: Duplicate block (B:175:0x0284) to fix multi-entry loop: BACK_EDGE: B:175:0x0284 -> B:176:0x0286 */
    /* JADX DEBUG: Duplicate block (B:35:0x0085) to fix multi-entry loop: BACK_EDGE: B:35:0x0085 -> B:36:0x0087 */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0208, code lost:
    
        if ((r8 ^ 8065) != 0) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x020b, code lost:
    
        r1 = QfgSZK.ZNPcth.cma;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0211, code lost:
    
        if ((r1 + 65) == 92) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0214, code lost:
    
        QfgSZK.ZNPcth.cma = (r1 * 61) % 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x021c, code lost:
    
        if (QfgSZK.ZNPcth.dGr > 8064) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x021e, code lost:
    
        r1 = QfgSZK.ZNPcth.dGr;
        r2 = r1 + 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0224, code lost:
    
        if (r2 == 33) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0226, code lost:
    
        if (r2 == 53) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x022a, code lost:
    
        if (r2 == 110) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022e, code lost:
    
        if (r2 == 258) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0237, code lost:
    
        QfgSZK.ZNPcth.dGr = (QfgSZK.ZNPcth.dGr * 118) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023e, code lost:
    
        QfgSZK.ZNPcth.dGr = (r1 + r1) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0244, code lost:
    
        QfgSZK.ZNPcth.dGr = ((r1 * 32) >> 83) ^ 3212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x017f, code lost:
    
        QfgSZK.ZNPcth.dGr = ((QfgSZK.ZNPcth.dGr % 5) >> 15) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0239, code lost:
    
        QfgSZK.ZNPcth.dGr = ((r1 % 98) % 27) % 43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0286, code lost:
    
        QfgSZK.ZNPcth.dGr = ((QfgSZK.ZNPcth.dGr + r1) * 117) >> 2;
     */
    /* JADX WARN: Path cross not found for [B:310:?, B:301:?], limit reached: 332 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x023e -> B:141:0x020b). Please report as a decompilation issue!!! */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gHZMYf(Map<String, String> map) {
        String strValueOf;
        String strValueOf2;
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
        int i11;
        int i12;
        int i13;
        int i14;
        if (map == null) {
            return;
        }
        map.put(AhwBna.DEVICE_STATE.DbNXlk(), UPbYzn.iTrKTi(this.RqiSNV));
        String strDbNXlk = AhwBna.DEVICE_BOOT_TIME.DbNXlk();
        if (dGr <= 8064) {
            while (dGr + 26 != 13) {
            }
            while (true) {
                dGr = ((dGr % 55) ^ 4136) * 50;
            }
        } else {
            long j = this.QrtYXS;
            int i15 = 62;
            String strValueOf3 = "";
            if (j == 0) {
                if (cma <= 1246) {
                    do {
                        i11 = cma;
                        i12 = i11 + 39;
                        if (i12 != 85) {
                            if (i12 == 257) {
                                break;
                            }
                            if (i12 == 451) {
                                cma = (i11 ^ 2459) % 83;
                                if (dGr <= 8064) {
                                    while (true) {
                                        i14 = dGr;
                                        int i16 = i14 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                        if (i16 == 13) {
                                            dGr = (i14 >> 17) * 20;
                                            break;
                                        } else if (i16 == 112) {
                                            while (true) {
                                                dGr = (dGr % 23) % 62;
                                            }
                                        } else if (i16 == 196) {
                                            break;
                                        }
                                    }
                                    while (true) {
                                        dGr = (dGr + i14) ^ 35;
                                    }
                                }
                            }
                        }
                        cma = cma + i11 + i11;
                        break;
                    } while (i12 != 542);
                    int i17 = cma;
                    if ((dGr ^ 8065) != 0) {
                        do {
                            i13 = dGr;
                        } while (i13 + 234 != 5);
                        dGr = (i13 * 9) ^ 1893;
                    }
                    cma = ((i17 ^ 1522) >> 109) ^ 4293;
                    cma = (cma ^ 5206) + i11;
                }
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(j);
            }
            map.put(strDbNXlk, strValueOf);
            if ((dGr ^ 8065) != 0) {
                while (true) {
                    i9 = dGr;
                    int i18 = i9 + 39;
                    if (i18 != 44) {
                        if (i18 == 180) {
                            i10 = ((i9 * 50) % 1) + i9;
                            break;
                        } else if (i18 != 208) {
                            if (i18 == 219) {
                                dGr = (i9 >> CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384) * 32;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                dGr = ((dGr * 40) ^ 1980) % 96;
                i10 = ((dGr >> 77) + i9) * 8;
                dGr = i10;
            }
            AhwBna ahwBna = AhwBna.DEVICE_FREE_SPACE;
            if (cma <= 1246) {
                if ((dGr ^ 8065) != 0) {
                    while (true) {
                        int i19 = dGr;
                        int i20 = i19 + 247;
                        if (i20 == i15) {
                            while (true) {
                                dGr = (dGr * 83) ^ 5071;
                            }
                        } else if (i20 == 88) {
                            dGr = (i19 ^ 1469) + i19;
                            break;
                        } else if (i20 == 207) {
                            dGr = (i19 % 39) ^ 4180;
                            break;
                        } else {
                            if (i20 == 237) {
                                dGr = ((i19 * 19) + i19) >> 24;
                            }
                            i15 = 62;
                        }
                    }
                }
                do {
                    i6 = cma;
                    i7 = i6 + 104;
                    if (i7 == 30) {
                        if ((dGr ^ 8065) != 0) {
                            while (true) {
                                i8 = dGr;
                                int i21 = i8 + 494;
                                if (i21 == 21) {
                                    break;
                                }
                                if (i21 == 49) {
                                    dGr = (i8 * 714) % 54;
                                } else if (i21 != 93) {
                                }
                                dGr = (dGr % 80) + i8 + i8;
                            }
                            dGr = (i8 >> CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA) ^ 2893;
                        }
                        cma = ((i6 >> 5) * 125) % 81;
                    }
                } while (i7 != 214);
                while (true) {
                    int i22 = cma;
                    if (dGr <= 8064) {
                        break;
                    } else {
                        cma = ((i22 + i6) ^ 3752) >> 76;
                    }
                }
                while (true) {
                    int i23 = dGr;
                    int i24 = i23 + 468;
                    if (i24 != 31) {
                        if (i24 != 64) {
                            if (i24 == 118) {
                                dGr = ((i23 % 20) * 53) + i23;
                                break;
                            } else if (i24 == 277) {
                                dGr = (i23 >> 12) ^ 3954;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    dGr = (dGr ^ 1273) >> 105;
                }
            }
            String strDbNXlk2 = ahwBna.DbNXlk();
            long j2 = this.gPdOYW;
            int i25 = dGr;
            if (i25 <= 8064) {
                while (true) {
                    i5 = dGr;
                    int i26 = i5 + 455;
                    if (i26 == 60) {
                        dGr = (i5 % 106) >> 61;
                    } else {
                        if (i26 == 168) {
                            break;
                        }
                        if (i26 == 200) {
                            while (true) {
                                dGr = (dGr ^ 4870) % 12;
                            }
                        } else if (i26 == 222) {
                            dGr = i5 >> 36;
                            break;
                        }
                    }
                }
                while (true) {
                    dGr = ((dGr ^ 1715) + i5) >> 98;
                }
            } else {
                if (j2 != 0) {
                    strValueOf2 = String.valueOf(j2);
                } else if (cma > 1246) {
                    strValueOf2 = "";
                }
                map.put(strDbNXlk2, strValueOf2);
                if ((dGr ^ 8065) != 0) {
                    while (true) {
                        int i27 = dGr;
                        int i28 = i27 + 442;
                        if (i28 == 20) {
                            dGr = ((i27 * 70) ^ 1676) * 76;
                            break;
                        } else {
                            if (i28 == 68) {
                                break;
                            }
                            if (i28 == 167) {
                                break;
                            } else if (i28 == 350) {
                                dGr = i27 + i27 + i27;
                            }
                        }
                    }
                    while (true) {
                        dGr = (dGr ^ 5237) % 122;
                    }
                } else {
                    AhwBna ahwBna2 = AhwBna.DEVICE_TOTAL_SPACE;
                    if ((cma ^ 1247) == 0) {
                        String strDbNXlk3 = ahwBna2.DbNXlk();
                        long j3 = this.sbuptt;
                        if (j3 == 0) {
                            if (dGr <= 8064) {
                                do {
                                    i2 = dGr;
                                } while (i2 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA != 72);
                                dGr = ((i2 >> 64) ^ 1365) % 30;
                            }
                            if ((cma ^ 1247) != 0) {
                                do {
                                    int i29 = cma;
                                    i = i29 + 91;
                                    if (i == 78) {
                                        cma = (i29 >> 47) + i29;
                                    } else if (i != 218) {
                                    }
                                    cma = (cma + i29) % 28;
                                    break;
                                } while (i != 392);
                                while (true) {
                                    int i30 = cma;
                                    if ((dGr ^ 8065) != 0) {
                                        break;
                                    } else {
                                        cma = (i30 >> 188) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                                    }
                                }
                                while (true) {
                                    int i31 = dGr;
                                    int i32 = i31 + 351;
                                    if (i32 == 55) {
                                        while (true) {
                                            dGr = (dGr * 98) % 31;
                                        }
                                    } else if (i32 == 192) {
                                        while (true) {
                                            dGr = ((dGr ^ 4456) + i31) ^ 3560;
                                        }
                                    } else if (i32 == 304) {
                                        dGr = (i31 * 30) ^ 1130;
                                    }
                                }
                            }
                        } else {
                            strValueOf3 = String.valueOf(j3);
                        }
                        map.put(strDbNXlk3, strValueOf3);
                        map.put(AhwBna.DEVICE_BATTERY_STATUS.DbNXlk(), this.zvqbYA);
                        return;
                    }
                    if (dGr <= 8064) {
                        while (true) {
                            int i33 = dGr;
                            int i34 = i33 + 65;
                            if (i34 == 56) {
                                while (true) {
                                    dGr = ((dGr * 35) ^ 1606) % 73;
                                }
                            } else if (i34 == 175) {
                                dGr = ((i33 + i33) % 33) % 118;
                                break;
                            } else if (i34 == 215) {
                                break;
                            }
                        }
                        dGr = (dGr * 96) >> 4;
                    }
                    do {
                        i3 = cma + 117;
                        if (i3 == 61) {
                            while (true) {
                                cma = (cma >> 96) % 86;
                            }
                        }
                    } while (i3 != 191);
                    while (true) {
                        cma = (cma ^ 2656) >> 53;
                        if ((dGr ^ 8065) != 0) {
                            do {
                                i4 = dGr;
                            } while (i4 + 377 != 82);
                            dGr = ((i4 >> 105) * 104) % 120;
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_DEVICE_STATE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        int i2;
        if (qSusPL.aPFruk() == null) {
            return;
        }
        this.zvqbYA = UPbYzn.hErYDe(DGUQLI.zhUgOk(qSusPL.aPFruk()));
        if ((dGr ^ 8065) != 0) {
            do {
                int i3 = dGr;
                i2 = i3 + 26;
                if (i2 == 26) {
                    dGr = i3 + i3 + i3;
                } else if (i2 != 70) {
                    if (i2 == 147) {
                        dGr = (i3 ^ 4223) * 86;
                    }
                }
                while (true) {
                    dGr = (dGr * 50) >> 86;
                }
            } while (i2 != 220);
            while (true) {
                dGr = ((dGr % 56) * 3) % 77;
            }
        }
        this.QrtYXS = DGUQLI.zOIQXb();
        this.gPdOYW = DGUQLI.RXzakW();
        this.sbuptt = DGUQLI.akftKQ();
        if (dGr > 8064) {
            this.RqiSNV = DGUQLI.zqTOFw(this.gPdOYW, this.QrtYXS);
            return;
        }
        do {
            i = dGr + 52;
            if (i == 52) {
                while (true) {
                    dGr = ((dGr >> 15) * 102) >> 80;
                }
            }
        } while (i != 136);
        while (true) {
            dGr = (dGr * 54) >> 54;
        }
    }
}
