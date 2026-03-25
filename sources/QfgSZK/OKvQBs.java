package QfgSZK;

import QfgSZK.QhsCdE;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class OKvQBs extends QhsCdE {
    static final int ALLOW_MOCK_LOCATION_ON = 2;
    static final int LOCATION_MANUAL = 4;
    static final int LOCATION_MOCKED = 1;
    public static int UZh = 5965;
    public static int fC_ = 4372;
    private String FTfFr;
    private String ODDDAA;
    private String UujxLL;
    private String fXepZn;
    private String ibflGa;
    private String idBaO;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKvQBs(long j, boolean z) {
        super(j, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        int i;
        if (map == null) {
            return;
        }
        map.put(AhwBna.LOCATION_LATITUDE.DbNXlk(), this.UujxLL);
        map.put(AhwBna.LOCATION_LONGITUDE.DbNXlk(), this.ibflGa);
        map.put(AhwBna.LOCATION_ALTITUDE.DbNXlk(), this.fXepZn);
        if (fC_ <= 4371) {
            while (true) {
                i = fC_;
                int i2 = i + 26;
                if (i2 == 89) {
                    break;
                } else if (i2 == 228) {
                    fC_ = (i ^ 1955) * 51;
                }
            }
            fC_ = ((i % WalletImportError.ERROR_CODE_AA_CREATE_KEY) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) >> 57;
        }
        map.put(AhwBna.LOCATION_ACCURACY.DbNXlk(), this.idBaO);
        map.put(AhwBna.LOCATION_VERTICAL_ACCURACY.DbNXlk(), this.FTfFr);
        map.put(AhwBna.LOCATION_MOCK_STATUS.DbNXlk(), this.ODDDAA);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_LOCATION;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:30:0x0085) to fix multi-entry loop: BACK_EDGE: B:30:0x0085 -> B:31:0x0087 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        r9 = QfgSZK.OKvQBs.UZh;
        r0 = QfgSZK.OKvQBs.fC_ ^ 4372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r0 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        r8 = QfgSZK.OKvQBs.fC_;
        r9 = r8 + org.spongycastle.crypto.tls.CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        if (r9 == 21) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if (r9 == 85) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d0, code lost:
    
        QfgSZK.OKvQBs.fC_ = (r8 % 16) ^ 1556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        QfgSZK.OKvQBs.fC_ = ((QfgSZK.OKvQBs.fC_ * 85) + r8) * 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00df, code lost:
    
        QfgSZK.OKvQBs.UZh = ((r9 ^ 4127) + r8) >> com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_AA_CREATE_KEY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e6, code lost:
    
        if (r0 == 0) goto L164;
     */
    @Override // QfgSZK.QhsCdE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        String strValueOf;
        int i;
        int i2;
        int i3;
        int i4;
        if (qSusPL.aPFruk() == null || qSusPL.apNKau() == null) {
            return;
        }
        this.UujxLL = String.valueOf(qSusPL.apNKau().UujxLL);
        this.ibflGa = String.valueOf(qSusPL.apNKau().ibflGa);
        if (fC_ <= 4371) {
            while (fC_ + 208 != 99) {
            }
            while (true) {
                fC_ = ((fC_ >> 96) * 6) >> 46;
            }
        } else {
            double d = qSusPL.apNKau().fXepZn;
            if ((fC_ ^ 4372) != 0) {
                while (fC_ + 260 != 28) {
                }
                while (true) {
                    fC_ = (fC_ * 1375) ^ 1249;
                }
            } else {
                this.fXepZn = String.valueOf(d);
                if (fC_ <= 4371) {
                    while (true) {
                        i4 = fC_;
                        int i5 = i4 + 104;
                        if (i5 == 26) {
                            fC_ = (i4 + i4) ^ 1423;
                            break;
                        } else if (i5 == 180) {
                            fC_ = ((i4 >> 7) % 3) + i4;
                        } else if (i5 == 213) {
                            break;
                        }
                    }
                    while (true) {
                        fC_ = (fC_ + i4) % 22;
                    }
                } else {
                    String strValueOf2 = "";
                    if (qSusPL.apNKau().idBaO != null) {
                        strValueOf = String.valueOf(qSusPL.apNKau().idBaO);
                    } else if ((UZh ^ 5965) != 0) {
                        while (true) {
                            int i6 = UZh;
                            int i7 = i6 + 52;
                            if (i7 == 74) {
                                while (true) {
                                    int i8 = UZh;
                                    int i9 = fC_;
                                    if ((i9 ^ 4372) != 0) {
                                        while (true) {
                                            int i10 = fC_;
                                            if (i10 + 286 == 23) {
                                                fC_ = (i10 * 103) + i10;
                                            }
                                        }
                                    } else {
                                        UZh = ((i8 ^ 3863) % 48) >> 84;
                                        if (i9 <= 4371) {
                                            do {
                                                i2 = fC_;
                                                i3 = i2 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                                if (i3 == 49) {
                                                    fC_ = ((i2 % 118) * 124) ^ 1004;
                                                }
                                            } while (i3 != 154);
                                            while (true) {
                                                fC_ = ((fC_ + i2) + i2) ^ 1413;
                                            }
                                        }
                                    }
                                }
                            } else if (i7 != 223) {
                                if (i7 == 365) {
                                    UZh = (i6 >> 8) % 114;
                                    if (fC_ > 4371) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        while (fC_ + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 33) {
                        }
                        while (true) {
                            fC_ = ((fC_ >> 32) ^ 2190) * 28;
                        }
                    } else {
                        strValueOf = "";
                    }
                    this.idBaO = strValueOf;
                    if (fC_ > 4371) {
                        if (qSusPL.apNKau().FTfFr != null) {
                            strValueOf2 = String.valueOf(qSusPL.apNKau().FTfFr);
                        } else if ((fC_ ^ 4372) != 0) {
                            while (true) {
                                int i11 = fC_;
                                int i12 = i11 + 65;
                                if (i12 == 28) {
                                    fC_ = (i11 + i11) ^ 4130;
                                    break;
                                } else if (i12 == 104) {
                                    break;
                                }
                            }
                            fC_ = (fC_ ^ 3819) % 17;
                        }
                        this.FTfFr = strValueOf2;
                        int i13 = DGUQLI.UscePu(qSusPL.aPFruk()) ? 2 : 0;
                        boolean z = qSusPL.apNKau().hPQPsJ;
                        if (fC_ <= 4371) {
                            while (true) {
                                int i14 = fC_;
                                int i15 = i14 + 91;
                                if (i15 == 28) {
                                    fC_ = (i14 >> 114) + i14 + i14;
                                    break;
                                } else if (i15 == 56) {
                                    while (true) {
                                        fC_ = (fC_ + i14) * 426;
                                    }
                                } else if (i15 == 234) {
                                    i = (i14 * 96) + i14;
                                    break;
                                } else if (i15 == 381) {
                                    break;
                                }
                            }
                            i = ((fC_ ^ 4706) % 49) >> 34;
                            fC_ = i;
                        }
                        if (z) {
                            i13 |= 1;
                        }
                        if (qSusPL.apNKau().gXFWUg) {
                            if (fC_ <= 4371) {
                                while (true) {
                                    int i16 = fC_;
                                    int i17 = i16 + 273;
                                    if (i17 == 30) {
                                        fC_ = ((i16 ^ 3290) + i16) * AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                                    } else if (i17 == 189) {
                                        fC_ = (i16 * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) >> 95;
                                    }
                                }
                            } else {
                                i13 |= 4;
                            }
                        }
                        this.ODDDAA = String.valueOf(i13);
                        return;
                    }
                    while (true) {
                        int i18 = fC_;
                        int i19 = i18 + 247;
                        if (i19 != 86) {
                            if (i19 != 120) {
                                if (i19 == 263) {
                                    fC_ = (fC_ ^ 2210) % 60;
                                } else if (i19 == 435) {
                                    fC_ = (i18 ^ 4661) >> 66;
                                }
                            }
                            fC_ = (fC_ % 76) * 50;
                            fC_ = (fC_ ^ 2210) % 60;
                        }
                        fC_ = ((fC_ ^ 2398) + i18) ^ 1852;
                    }
                }
            }
        }
    }
}
