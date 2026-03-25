package QfgSZK;

import QfgSZK.QhsCdE;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class DKtBnz extends QhsCdE {
    public static int _QU = 6638;
    public static int _lq = 4134;
    private GQzpsZ fgmUjC;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DKtBnz(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:218:0x036e) to fix multi-entry loop: BACK_EDGE: B:217:0x0369 -> B:218:0x036e */
    /* JADX DEBUG: Duplicate block (B:219:0x0371) to fix multi-entry loop: BACK_EDGE: B:219:0x0371 -> B:220:0x037b */
    /* JADX DEBUG: Duplicate block (B:307:0x04de) to fix multi-entry loop: BACK_EDGE: B:306:0x04d6 -> B:307:0x04de */
    /* JADX DEBUG: Duplicate block (B:337:0x053a) to fix multi-entry loop: BACK_EDGE: B:336:0x0536 -> B:337:0x053a */
    /* JADX DEBUG: Duplicate block (B:366:0x05b2) to fix multi-entry loop: BACK_EDGE: B:365:0x05aa -> B:366:0x05b2 */
    /* JADX DEBUG: Duplicate block (B:368:0x05bf) to fix multi-entry loop: BACK_EDGE: B:368:0x05bf -> B:369:0x05c1 */
    /* JADX DEBUG: Duplicate block (B:387:0x0607) to fix multi-entry loop: BACK_EDGE: B:387:0x0607 -> B:388:0x0609 */
    /* JADX DEBUG: Duplicate block (B:390:0x0613) to fix multi-entry loop: BACK_EDGE: B:390:0x0613 -> B:391:0x0615 */
    /* JADX DEBUG: Duplicate block (B:419:0x0680) to fix multi-entry loop: BACK_EDGE: B:418:0x067b -> B:419:0x0680 */
    /* JADX DEBUG: Duplicate block (B:444:0x06e7) to fix multi-entry loop: BACK_EDGE: B:444:0x06e7 -> B:445:0x06e9 */
    /* JADX DEBUG: Duplicate block (B:528:0x0825) to fix multi-entry loop: BACK_EDGE: B:527:0x081e -> B:528:0x0825 */
    /* JADX DEBUG: Duplicate block (B:554:0x087a) to fix multi-entry loop: BACK_EDGE: B:553:0x0872 -> B:554:0x087a */
    /* JADX DEBUG: Duplicate block (B:91:0x0161) to fix multi-entry loop: BACK_EDGE: B:91:0x0161 -> B:90:0x015f */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x037b, code lost:
    
        r1 = QfgSZK.DKtBnz._lq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0381, code lost:
    
        if ((QfgSZK.DKtBnz._QU ^ 6638) == 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0383, code lost:
    
        r2 = QfgSZK.DKtBnz._QU;
        r3 = r2 + 1001;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0387, code lost:
    
        if (r3 == 19) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x038b, code lost:
    
        if (r3 == 61) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x038f, code lost:
    
        if (r3 == 247) goto L704;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0393, code lost:
    
        if (r3 == 346) goto L705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0396, code lost:
    
        QfgSZK.DKtBnz._QU = (r2 * 86) >> 125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x039c, code lost:
    
        QfgSZK.DKtBnz._QU = (QfgSZK.DKtBnz._QU ^ 5130) + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03a4, code lost:
    
        QfgSZK.DKtBnz._QU = ((r2 + r2) ^ 4339) % 53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03aa, code lost:
    
        QfgSZK.DKtBnz._QU = ((QfgSZK.DKtBnz._QU >> 80) * 81) % 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03b4, code lost:
    
        QfgSZK.DKtBnz._lq = ((r1 * 22) ^ 1292) >> 77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03bd, code lost:
    
        if (QfgSZK.DKtBnz._QU > 6637) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03bf, code lost:
    
        r1 = QfgSZK.DKtBnz._QU;
        r2 = r1 + 936;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03c5, code lost:
    
        if (r2 == 69) goto L713;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03c9, code lost:
    
        if (r2 == 78) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03cd, code lost:
    
        if (r2 == 208) goto L712;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x03d0, code lost:
    
        QfgSZK.DKtBnz._QU = (QfgSZK.DKtBnz._QU >> 8) * 6633;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03d9, code lost:
    
        QfgSZK.DKtBnz._QU = (r1 * 5) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03de, code lost:
    
        QfgSZK.DKtBnz._QU = ((QfgSZK.DKtBnz._QU * 87) + r1) ^ 4505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x05bf, code lost:
    
        QfgSZK.DKtBnz._QU = (QfgSZK.DKtBnz._QU >> 64) * 2106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0613, code lost:
    
        QfgSZK.DKtBnz._QU = ((QfgSZK.DKtBnz._QU >> 44) + r2) * 72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x07ce, code lost:
    
        QfgSZK.DKtBnz._QU = (QfgSZK.DKtBnz._QU % com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_AA_CREATE_KEY) ^ 4802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0889, code lost:
    
        QfgSZK.DKtBnz._QU = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x015f, code lost:
    
        r2 = ((QfgSZK.DKtBnz._QU ^ 1950) + r1) ^ 4521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x037b, code lost:
    
        QfgSZK.DKtBnz._lq = ((QfgSZK.DKtBnz._lq ^ 2483) % 30) ^ 3691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x053a, code lost:
    
        QfgSZK.DKtBnz._QU ^= 774;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02cc A[LOOP:25: B:176:0x02cc->B:676:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:795:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0790 A[SYNTHETIC] */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void gHZMYf(Map<String, String> map) {
        String strFlVtFt;
        String strZXhzOT;
        String strQnnRaN;
        String strGAnGwV;
        String strZFtALg;
        String strInahnb;
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
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        if (map == null || this.fgmUjC == null) {
            return;
        }
        String strDbNXlk = AhwBna.NETWORK_INFO_BSSID.DbNXlk();
        if ((_lq ^ 4134) != 0) {
            do {
                int i35 = _lq;
                i32 = i35 + 325;
                if (i32 == 33) {
                    while (true) {
                        _lq = _lq + i35 + i35;
                        if ((_QU ^ 6638) != 0) {
                            do {
                                i33 = _QU;
                            } while (i33 + 663 != 84);
                            _QU = ((i33 ^ 4347) + i33) * 75;
                        }
                    }
                }
            } while (i32 != 224);
            while (true) {
                _lq = (_lq % 99) ^ 4512;
                if ((_QU ^ 6638) != 0) {
                    while (true) {
                        i34 = _QU;
                        int i36 = i34 + 676;
                        if (i36 == 95) {
                            _QU = (i34 ^ 2824) + i34 + i34;
                            break;
                        } else if (i36 != 254) {
                            if (i36 == 297) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    _QU = (_QU >> 95) + i34;
                    _QU = ((_QU % 19) % 107) >> 25;
                }
            }
        } else {
            String strHGuIrQ = "";
            map.put(strDbNXlk, this.fgmUjC.sRzUNh() == null ? "" : this.fgmUjC.sRzUNh());
            if ((_QU ^ 6638) != 0) {
                while (true) {
                    int i37 = _QU;
                    int i38 = i37 + 1222;
                    if (i38 == 38) {
                        break;
                    } else if (i38 == 177) {
                        _QU = (i37 % 55) * 5;
                    }
                }
                while (true) {
                    _QU = ((_QU % 102) ^ 5055) % 99;
                }
            } else {
                String strDbNXlk2 = AhwBna.NETWORK_INFO_SSID_HASH.DbNXlk();
                GQzpsZ gQzpsZ = this.fgmUjC;
                if (_QU <= 6637) {
                    while (true) {
                        int i39 = _QU;
                        int i40 = i39 + 52;
                        if (i40 == 70) {
                            break;
                        }
                        if (i40 != 82) {
                            if (i40 == 218) {
                                _QU = ((i39 ^ 1867) % 13) + i39;
                            }
                        }
                        _QU = ((_QU % 95) % 46) % 102;
                    }
                    while (true) {
                        _QU = (_QU % 107) % 40;
                    }
                } else {
                    if (gQzpsZ.zXhzOT() != null) {
                        strFlVtFt = UPbYzn.flVtFt(this.fgmUjC.zXhzOT().getBytes());
                    } else if (_lq > 4133) {
                        strFlVtFt = "";
                    } else if (_QU <= 6637) {
                        while (true) {
                            int i41 = _QU;
                            if (i41 + 806 == 88) {
                                _QU = ((i41 * 22) % 106) + i41;
                            }
                        }
                    } else {
                        while (true) {
                            i28 = _lq;
                            int i42 = i28 + 78;
                            if (i42 == 67) {
                                break;
                            }
                            if (i42 != 96) {
                                if (i42 != 187) {
                                    if (i42 == 301) {
                                        _lq = i28 ^ 3926;
                                    }
                                }
                                _lq = (_lq ^ 2170) + i28;
                            } else {
                                _lq = i28 >> CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;
                                if (_QU <= 6637) {
                                    while (true) {
                                        i30 = _QU;
                                        int i43 = i30 + 819;
                                        if (i43 != 28) {
                                            if (i43 == 186) {
                                                _QU = i30 * 8036;
                                                break;
                                            }
                                            if (i43 != 304) {
                                                if (i43 == 350) {
                                                    _QU = (i30 + i30) ^ 3793;
                                                    break;
                                                }
                                            }
                                            i31 = ((_QU ^ 1950) + i30) ^ 4521;
                                        } else {
                                            break;
                                        }
                                    }
                                    i31 = ((_QU + i30) % 32) + i30;
                                    while (true) {
                                        _QU = i31;
                                        i31 = ((_QU ^ 1950) + i30) ^ 4521;
                                    }
                                }
                            }
                        }
                        while (true) {
                            int i44 = _lq;
                            if ((_QU ^ 6638) != 0) {
                                break;
                            } else {
                                _lq = (i44 >> 128) + i28;
                            }
                        }
                        do {
                            i29 = _QU;
                        } while (i29 + 871 != 64);
                        while (true) {
                            _QU = (_QU % 46) + i29 + i29;
                        }
                    }
                    map.put(strDbNXlk2, strFlVtFt);
                    String strDbNXlk3 = AhwBna.NETWORK_INFO_SSID.DbNXlk();
                    if (this.fgmUjC.zXhzOT() == null) {
                        if (_lq <= 4133) {
                            if (_QU <= 6637) {
                                do {
                                    i26 = _QU;
                                    i27 = i26 + 91;
                                    if (i27 == 35) {
                                        while (true) {
                                            _QU = (_QU * 98) >> 87;
                                        }
                                    }
                                } while (i27 != 157);
                                _QU = (i26 + i26) % 52;
                            }
                            while (true) {
                                int i45 = _lq;
                                int i46 = i45 + 104;
                                if (i46 == 28) {
                                    if ((_QU ^ 6638) != 0) {
                                        do {
                                            int i47 = _QU;
                                            i25 = i47 + 559;
                                            if (i25 == 26) {
                                                _QU = (i47 % 122) * 5512;
                                            }
                                        } while (i25 != 194);
                                        while (true) {
                                            _QU = (_QU >> 108) ^ 5376;
                                        }
                                    }
                                    if (_QU <= 6637) {
                                        do {
                                            i24 = _QU;
                                        } while (i24 + 1378 != 22);
                                        _QU = (i24 % 87) % 109;
                                    }
                                    _lq = ((i45 >> 94) + i45) % 94;
                                } else if (i46 == 219) {
                                    _lq = (i45 % 123) * 54;
                                    if ((_QU ^ 6638) != 0) {
                                        do {
                                            i23 = _QU;
                                        } while (i23 + 78 != 15);
                                        _QU = (i23 % 28) + i23 + i23;
                                    }
                                } else if (i46 == 416) {
                                    while (true) {
                                        _lq = (_lq ^ 3973) % 55;
                                    }
                                }
                            }
                        }
                        strZXhzOT = "";
                    } else {
                        strZXhzOT = this.fgmUjC.zXhzOT();
                    }
                    map.put(strDbNXlk3, strZXhzOT);
                    AhwBna ahwBna = AhwBna.NETWORK_INFO_RSSI;
                    if ((_lq ^ 4134) != 0) {
                        while (true) {
                            int i48 = _lq;
                            int i49 = i48 + 338;
                            if (i49 != 5) {
                                if (i49 == 130) {
                                    _lq = (i48 ^ 3547) + i48;
                                    if (_QU <= 6637) {
                                        do {
                                            i20 = _QU;
                                        } while (i20 + 455 != 39);
                                        while (true) {
                                            _QU = ((_QU % 40) % 20) + i20;
                                        }
                                    }
                                } else if (i49 == 151) {
                                    while (true) {
                                        int i50 = _lq;
                                        if (_QU <= 6637) {
                                            do {
                                                i21 = _QU;
                                                i22 = i21 + 1274;
                                                if (i22 == 57) {
                                                    _QU = (i21 ^ 325) >> 51;
                                                }
                                            } while (i22 != 85);
                                        }
                                        _lq = ((i50 + i48) >> 118) + i48;
                                    }
                                    while (true) {
                                        _QU = ((_QU * 39) + i21) % 18;
                                    }
                                } else if (i49 != 154) {
                                    continue;
                                } else {
                                    int i51 = _lq;
                                    if (_QU <= 6637) {
                                        do {
                                            int i52 = _QU;
                                            i19 = i52 + TypedValues.PositionType.TYPE_PERCENT_Y;
                                            if (i19 == 77) {
                                                _QU = ((i52 * 45) % 97) * 4;
                                            }
                                        } while (i19 != 163);
                                        while (true) {
                                            _QU >>= 278;
                                        }
                                    }
                                    _lq = ((i51 + i48) * 64) % 125;
                                }
                            }
                            _lq = ((_lq ^ 2280) >> WalletImportError.ERROR_CODE_AA_EXIST) ^ 1852;
                            int i512 = _lq;
                            if (_QU <= 6637) {
                            }
                            _lq = ((i512 + i48) * 64) % 125;
                        }
                    } else {
                        String strDbNXlk4 = ahwBna.DbNXlk();
                        if (this.fgmUjC.QnnRaN() != null) {
                            strQnnRaN = this.fgmUjC.QnnRaN();
                        } else if (_QU <= 6637) {
                            while (true) {
                                int i53 = _QU;
                                if (i53 + 299 == 54) {
                                    _QU = (i53 * 372) + i53;
                                }
                            }
                        } else {
                            strQnnRaN = "";
                        }
                        map.put(strDbNXlk4, strQnnRaN);
                        String strDbNXlk5 = AhwBna.NETWORK_INFO_TYPE.DbNXlk();
                        if (this.fgmUjC.gAnGwV() != null) {
                            strGAnGwV = this.fgmUjC.gAnGwV();
                        } else if ((_lq ^ 4134) == 0) {
                            strGAnGwV = "";
                        } else if (_QU <= 6637) {
                            do {
                                i17 = _QU;
                                i18 = i17 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                                if (i18 == 99) {
                                    while (true) {
                                        _QU *= 98;
                                    }
                                }
                            } while (i18 != 153);
                            while (true) {
                                _QU = ((_QU >> 38) + i17) % 55;
                            }
                        } else {
                            while (true) {
                                int i54 = _lq;
                                int i55 = i54 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                if (i55 != 91) {
                                    if (i55 == 109) {
                                        break;
                                    }
                                    if (i55 != 198) {
                                        if (i55 == 339) {
                                            _lq = (i54 >> 60) * 119;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                _lq = ((_lq ^ 2483) % 30) ^ 3691;
                            }
                            while (true) {
                                _lq = (_lq * 92) >> 33;
                            }
                        }
                        map.put(strDbNXlk5, strGAnGwV);
                        map.put(AhwBna.NETWORK_INFO_IPV4.DbNXlk(), this.fgmUjC.RXdAnZ() == null ? "" : this.fgmUjC.RXdAnZ());
                        AhwBna ahwBna2 = AhwBna.NETWORK_INFO_IPV6;
                        if ((_lq ^ 4134) != 0) {
                            if (_QU <= 6637) {
                                while (true) {
                                    int i56 = _QU;
                                    int i57 = i56 + 689;
                                    if (i57 == 40) {
                                        while (true) {
                                            _QU = (_QU + i56) >> 45;
                                        }
                                    } else if (i57 == 83) {
                                        i16 = (i56 >> 72) * 45;
                                        break;
                                    } else if (i57 == 272) {
                                        i16 = (i56 % 93) % 3;
                                        break;
                                    } else if (i57 == 337) {
                                        i16 = (i56 + i56) ^ 1451;
                                        break;
                                    }
                                }
                                _QU = i16;
                            }
                            while (true) {
                                int i58 = _lq;
                                int i59 = i58 + 351;
                                if (i59 == 84) {
                                    _lq = (i58 * 43) + i58;
                                    break;
                                } else if (i59 == 198) {
                                    break;
                                }
                            }
                            do {
                                _lq = (_lq ^ 2950) >> 10;
                            } while (_QU > 6637);
                            while (true) {
                                int i60 = _QU;
                                int i61 = i60 + 715;
                                if (i61 == 73) {
                                    _QU = ((i60 + i60) + i60) >> 21;
                                } else if (i61 == 254) {
                                    break;
                                }
                            }
                            while (true) {
                                _QU = (_QU % 3) >> 33;
                            }
                        } else {
                            map.put(ahwBna2.DbNXlk(), this.fgmUjC.RFmUsE() == null ? "" : this.fgmUjC.RFmUsE());
                            if ((_QU ^ 6638) != 0) {
                                do {
                                    i14 = _QU;
                                    i15 = i14 + 1235;
                                    if (i15 == 59) {
                                        while (true) {
                                            _QU = (_QU + i14) ^ 4353;
                                        }
                                    }
                                } while (i15 != 163);
                                while (true) {
                                    _QU = ((_QU >> 7) % 27) + i14;
                                }
                            } else {
                                String strDbNXlk6 = AhwBna.NETWORK_INFO_MAC.DbNXlk();
                                GQzpsZ gQzpsZ2 = this.fgmUjC;
                                if ((_QU ^ 6638) != 0) {
                                    while (true) {
                                        int i62 = _QU + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                                        if (i62 != 6) {
                                            if (i62 == 150) {
                                                _QU = (_QU >> 42) ^ 1213;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                    while (true) {
                                        _QU = (_QU ^ 7440) * 20;
                                        _QU = (_QU >> 42) ^ 1213;
                                    }
                                } else {
                                    if (gQzpsZ2.zFtALg() != null) {
                                        strZFtALg = this.fgmUjC.zFtALg();
                                    } else if (_lq <= 4133) {
                                        if (_QU > 6637) {
                                            loop53: while (true) {
                                                int i63 = _lq;
                                                int i64 = i63 + 234;
                                                if (i64 != 55) {
                                                    if (i64 == 180) {
                                                        _lq = (i63 >> 73) + i63;
                                                    } else if (i64 == 225) {
                                                        if ((_QU ^ 6638) != 0) {
                                                            while (true) {
                                                                int i65 = _QU;
                                                                int i66 = i65 + 637;
                                                                if (i66 != 60) {
                                                                    if (i66 == 128) {
                                                                        _QU = ((i65 >> 41) ^ 2738) % 52;
                                                                        break;
                                                                    } else if (i66 == 172) {
                                                                        while (true) {
                                                                            _QU = (_QU * 114) + i65;
                                                                        }
                                                                    } else if (i66 == 177) {
                                                                        _QU = (i65 % 22) >> 19;
                                                                        break loop53;
                                                                    }
                                                                } else {
                                                                    break loop53;
                                                                }
                                                            }
                                                        }
                                                        _lq = ((i63 >> 14) ^ 3039) + i63;
                                                        if ((_QU ^ 6638) != 0) {
                                                            while (true) {
                                                                int i67 = _QU;
                                                                int i68 = i67 + 585;
                                                                if (i68 == 93) {
                                                                    while (true) {
                                                                        _QU = (_QU % 15) + i67;
                                                                    }
                                                                } else {
                                                                    if (i68 == 109) {
                                                                        break;
                                                                    }
                                                                    if (i68 == 125) {
                                                                        while (true) {
                                                                            _QU = (_QU % 108) % 63;
                                                                        }
                                                                    } else if (i68 == 290) {
                                                                        _QU = (i67 % 100) * 10374;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            while (true) {
                                                                _QU = ((_QU ^ 3708) * 31) % 9;
                                                            }
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                }
                                                _lq = (_lq >> 119) + i63 + i63;
                                                if ((_QU ^ 6638) != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        while (true) {
                                            i13 = _QU;
                                            int i69 = i13 + 572;
                                            if (i69 == 96) {
                                                _QU = i13 >> CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA;
                                                break;
                                            } else {
                                                if (i69 == 128) {
                                                    break;
                                                }
                                                if (i69 != 225) {
                                                    if (i69 == 311) {
                                                        _QU = ((_QU + i13) >> 11) ^ 3505;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        while (true) {
                                            _QU = (_QU * 8755) % 62;
                                            _QU = ((_QU + i13) >> 11) ^ 3505;
                                        }
                                    } else {
                                        strZFtALg = "";
                                    }
                                    map.put(strDbNXlk6, strZFtALg);
                                    map.put(AhwBna.NETWORK_INFO_WFS.DbNXlk(), this.fgmUjC.pXZxY() == null ? "" : this.fgmUjC.pXZxY());
                                    if (_QU <= 6637) {
                                        while (true) {
                                            i12 = _QU;
                                            int i70 = i12 + 221;
                                            if (i70 == 73) {
                                                _QU = (i12 * 52) ^ 4873;
                                                break;
                                            } else if (i70 == 118) {
                                                _QU = (i12 + i12) * 88;
                                                break;
                                            } else if (i70 == 296) {
                                                break;
                                            } else if (i70 == 388) {
                                                break;
                                            }
                                        }
                                        while (true) {
                                            _QU = (_QU + i12) * 114;
                                        }
                                    } else {
                                        AhwBna ahwBna3 = AhwBna.NETWORK_INFO_VPN;
                                        if ((_lq ^ 4134) != 0) {
                                            do {
                                                int i71 = _lq;
                                                i9 = i71 + 364;
                                                if (i9 == 60) {
                                                    _lq = (i71 * 100) >> 31;
                                                    if ((_QU ^ 6638) != 0) {
                                                        while (true) {
                                                            i10 = _QU;
                                                            int i72 = i10 + 1053;
                                                            if (i72 == 67) {
                                                                break;
                                                            }
                                                            if (i72 == 245) {
                                                                while (true) {
                                                                    _QU = ((_QU % 118) * 120) + i10;
                                                                }
                                                            } else if (i72 == 256) {
                                                                _QU = ((i10 + i10) >> 120) ^ 1687;
                                                                break;
                                                            }
                                                        }
                                                        while (true) {
                                                            _QU = (_QU * 476) + i10;
                                                        }
                                                    }
                                                } else if (i9 == 192) {
                                                    _lq = (i71 * 117) + i71;
                                                    if ((_QU ^ 6638) != 0) {
                                                        do {
                                                            int i73 = _QU;
                                                            i11 = i73 + 1079;
                                                            if (i11 == 90) {
                                                                while (true) {
                                                                    _QU = (_QU * 54) ^ 1876;
                                                                }
                                                            } else if (i11 == 97) {
                                                                _QU = ((i73 % 37) * 9) ^ 2264;
                                                            }
                                                        } while (i11 != 288);
                                                        while (true) {
                                                            _QU = ((_QU % 34) % 63) % WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                                                        }
                                                    }
                                                } else if (i9 != 248) {
                                                }
                                                _lq = (_lq + i71) * 58;
                                                if (_QU <= 6637) {
                                                }
                                            } while (i9 != 374);
                                            while (true) {
                                                _lq = (_lq % 9) >> 22;
                                            }
                                        }
                                        String strDbNXlk7 = ahwBna3.DbNXlk();
                                        if (this.fgmUjC.inahnb() == null) {
                                            int i74 = _QU;
                                            if (i74 <= 6637) {
                                                while (true) {
                                                    int i75 = _QU;
                                                    int i76 = i75 + 351;
                                                    if (i76 == 50) {
                                                        _QU = (i75 * 80) % 107;
                                                        break;
                                                    } else if (i76 == 60) {
                                                        while (true) {
                                                            _QU = (_QU % 10) >> 44;
                                                        }
                                                    } else if (i76 == 178) {
                                                        break;
                                                    }
                                                }
                                                while (true) {
                                                    _QU = ((_QU * 71) >> 41) ^ 2888;
                                                }
                                            } else if (_lq > 4133) {
                                                strInahnb = "";
                                            } else if ((i74 ^ 6638) != 0) {
                                                while (true) {
                                                    int i77 = _QU;
                                                    int i78 = i77 + 728;
                                                    if (i78 != 1) {
                                                        if (i78 == 82) {
                                                            _QU = i77 ^ 7737;
                                                        } else if (i78 != 89) {
                                                            if (i78 == 204) {
                                                                _QU = (_QU ^ 5256) * 46;
                                                            }
                                                        }
                                                        _QU = ((_QU >> 94) ^ 5035) % 66;
                                                        _QU = (_QU ^ 5256) * 46;
                                                    }
                                                    _QU = (_QU >> 103) + i77;
                                                }
                                            } else {
                                                do {
                                                    i6 = _lq;
                                                    i7 = i6 + 286;
                                                    if (i7 != 53) {
                                                        if (i7 == 65) {
                                                            _lq = ((i6 >> 104) * 99) ^ 2629;
                                                            if ((_QU ^ 6638) != 0) {
                                                                while (_QU + 767 != 16) {
                                                                }
                                                                while (true) {
                                                                    _QU = ((_QU * 63) >> 88) * WalletImportError.ERROR_CODE_AA_CREATE_KEY;
                                                                }
                                                            }
                                                        } else if (i7 != 207) {
                                                        }
                                                        _lq = (_lq % 34) * 120;
                                                        if (_QU > 6637) {
                                                            do {
                                                                _lq = (_lq % 8) + i6;
                                                            } while (_QU > 6637);
                                                        }
                                                        do {
                                                            i8 = _QU + 780;
                                                            if (i8 != 89) {
                                                                while (true) {
                                                                    _QU = (_QU * 119) ^ 5439;
                                                                }
                                                            }
                                                        } while (i8 != 225);
                                                        while (true) {
                                                            _QU = (_QU >> 4) * 34;
                                                        }
                                                    } else {
                                                        while (true) {
                                                            _lq = ((_lq + i6) % 53) % 55;
                                                        }
                                                    }
                                                } while (i7 != 363);
                                                do {
                                                    _lq = (_lq % 8) + i6;
                                                } while (_QU > 6637);
                                                do {
                                                    i8 = _QU + 780;
                                                    if (i8 != 89) {
                                                    }
                                                } while (i8 != 225);
                                                while (true) {
                                                    _QU = (_QU >> 4) * 34;
                                                }
                                            }
                                        } else {
                                            strInahnb = this.fgmUjC.inahnb();
                                        }
                                        map.put(strDbNXlk7, strInahnb);
                                        if (_QU <= 6637) {
                                            while (true) {
                                                int i79 = _QU;
                                                int i80 = i79 + 1248;
                                                if (i80 == 11) {
                                                    _QU = (i79 >> 15) * 74;
                                                } else if (i80 != 68) {
                                                    if (i80 == 177) {
                                                        _QU = i79 * CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;
                                                        break;
                                                    } else if (i80 == 224) {
                                                        _QU = i79 * 620;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        AhwBna ahwBna4 = AhwBna.NETWORK_INFO_SECURITY_TYPE;
                                        if (_lq > 4133) {
                                            String strDbNXlk8 = ahwBna4.DbNXlk();
                                            if (this.fgmUjC.hGuIrQ() != null) {
                                                strHGuIrQ = this.fgmUjC.hGuIrQ();
                                            } else if (_lq <= 4133) {
                                                do {
                                                    i = _lq + 312;
                                                    if (i == 18) {
                                                        while (true) {
                                                            _lq = ((_lq % 27) % 117) >> 48;
                                                        }
                                                    } else if (i == 32) {
                                                        do {
                                                            _lq = (_lq * 92) % 4;
                                                        } while ((_QU ^ 6638) == 0);
                                                        do {
                                                            i2 = _QU;
                                                        } while (i2 + 897 != 19);
                                                        while (true) {
                                                            _QU = (_QU ^ 5026) + i2;
                                                        }
                                                    }
                                                } while (i != 213);
                                                loop95: do {
                                                    int i81 = _lq;
                                                    if (_QU <= 6637) {
                                                        while (true) {
                                                            int i82 = _QU;
                                                            int i83 = i82 + 923;
                                                            if (i83 == 54) {
                                                                i3 = (i82 * 122) >> 108;
                                                                break;
                                                            }
                                                            if (i83 != 220) {
                                                                if (i83 == 224) {
                                                                    i3 = ((i82 * 97) >> 32) % 108;
                                                                    break;
                                                                } else if (i83 == 371) {
                                                                    _QU = (_QU ^ 3212) >> 14;
                                                                    break loop95;
                                                                }
                                                            } else {
                                                                break loop95;
                                                            }
                                                        }
                                                        while (true) {
                                                            _QU = (_QU >> 59) ^ 5182;
                                                            _QU = (_QU ^ 3212) >> 14;
                                                        }
                                                    }
                                                    _lq = ((i81 ^ 3457) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY) % 52;
                                                } while ((_QU ^ 6638) == 0);
                                                while (true) {
                                                    int i84 = _QU;
                                                    int i85 = i84 + 910;
                                                    if (i85 == 41) {
                                                        while (true) {
                                                            _QU = ((_QU * 7) ^ 1030) + i84;
                                                        }
                                                    } else if (i85 == 239) {
                                                        _QU = (i84 * 20) + i84;
                                                    } else if (i85 != 319) {
                                                        if (i85 == 449) {
                                                            _QU = ((i84 + i84) + i84) % 53;
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                while (true) {
                                                    _QU = ((_QU % 18) % 98) >> 39;
                                                }
                                            }
                                            map.put(strDbNXlk8, strHGuIrQ);
                                            return;
                                        }
                                        if ((_QU ^ 6638) != 0) {
                                            do {
                                                i4 = _QU;
                                                i5 = i4 + 247;
                                                if (i5 == 98) {
                                                    _QU = (i4 ^ 1882) % 106;
                                                }
                                            } while (i5 != 123);
                                            while (true) {
                                                _QU = ((_QU ^ 3783) + i4) % 1;
                                            }
                                        }
                                        while (true) {
                                            int i86 = _lq;
                                            int i87 = i86 + 377;
                                            if (i87 == 23) {
                                                while (true) {
                                                    _lq = (_lq + i86) * 60;
                                                }
                                            } else if (i87 != 136) {
                                                if (i87 == 167) {
                                                    _lq = (i86 * 118) ^ 2542;
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                        while (true) {
                                            _lq = (_lq % 18) * 86;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_NETWORK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        if (qSusPL.aPFruk() == null) {
            return;
        }
        this.fgmUjC = DGUQLI.OcIXYQ(qSusPL.aPFruk());
    }
}
