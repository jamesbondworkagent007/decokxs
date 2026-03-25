package QfgSZK;

import QfgSZK.QhsCdE;
import com.engagelab.privates.core.constants.MTCoreConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.gms.wallet.WalletConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class OHsvZP extends QhsCdE {
    public static int Ovj = 6646;
    public static int sBi = 5632;
    private String iitLhi;
    private String zTLmQw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OHsvZP(long j) {
        super(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:24:0x0056) to fix multi-entry loop: BACK_EDGE: B:23:0x004f -> B:24:0x0056 */
    /* JADX DEBUG: Duplicate block (B:90:0x014d) to fix multi-entry loop: BACK_EDGE: B:90:0x014d -> B:91:0x014f */
    @Override // QfgSZK.QhsCdE
    public void gHZMYf(Map<String, String> map) {
        String strRgaQzq;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (map == null) {
            return;
        }
        String strDbNXlk = AhwBna.SUBSCRIBER_CELL_INFO.DbNXlk();
        if ((Ovj ^ 6646) != 0) {
            while (true) {
                i6 = Ovj;
                int i8 = i6 + 78;
                if (i8 == 69) {
                    break;
                }
                if (i8 != 260) {
                    if (i8 == 372) {
                        Ovj = (i6 + i6) % WebSocketProtocol.PAYLOAD_SHORT;
                        break;
                    } else if (i8 != 560) {
                        continue;
                    } else {
                        Ovj = (i6 ^ 3039) * 121;
                    }
                }
                Ovj = (Ovj ^ 2831) % 25;
                if ((sBi ^ 5632) != 0) {
                    while (true) {
                        i7 = sBi;
                        int i9 = i7 + 39;
                        if (i9 != 70) {
                            if (i9 == 154) {
                                sBi = (sBi * 93) >> 84;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        sBi = (sBi * 8) + i7;
                        sBi = (sBi * 93) >> 84;
                    }
                }
            }
            Ovj = (Ovj ^ 5283) + i6;
            if (sBi <= 5631) {
                while (true) {
                    int i10 = sBi;
                    int i11 = i10 + 26;
                    if (i11 == 92) {
                        sBi = (i10 >> 3) * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                    } else if (i11 != 125) {
                    }
                    sBi = (sBi >> 90) + i10;
                }
            }
        }
        String str = this.iitLhi;
        String str2 = "";
        if (str == null) {
            int i12 = Ovj;
            if (sBi <= 5631) {
                while (true) {
                    int i13 = sBi;
                    int i14 = i13 + 299;
                    if (i14 == 56) {
                        sBi = ((i13 * 9) >> 122) % 99;
                    } else if (i14 == 180) {
                        sBi = (i13 ^ 4406) % 89;
                        break;
                    } else if (i14 == 245) {
                        break;
                    }
                }
                sBi ^= 4200;
            }
            if (i12 <= 6645) {
                do {
                    i = Ovj;
                    if ((sBi ^ 5632) != 0) {
                        while (true) {
                            int i15 = sBi;
                            int i16 = i15 + 312;
                            if (i16 == 85) {
                                sBi = (i15 * 276) + i15;
                            } else if (i16 != 210) {
                            }
                            sBi = ((sBi + i15) * 62) + i15;
                        }
                    } else {
                        i2 = i + 39;
                        if (i2 == 74) {
                            do {
                                int i17 = Ovj;
                                i3 = sBi;
                                if (i3 <= 5631) {
                                    while (true) {
                                        i4 = sBi;
                                        int i18 = i4 + 247;
                                        if (i18 == 71) {
                                            sBi = (i4 * 75) % 47;
                                            break;
                                        } else {
                                            if (i18 == 86) {
                                                break;
                                            }
                                            if (i18 == 108) {
                                                sBi = ((i4 ^ 2846) >> 8) + i4;
                                            } else if (i18 != 195) {
                                            }
                                            sBi = (sBi * 70) >> CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                        }
                                    }
                                    while (true) {
                                        sBi = ((sBi % 6) + i4) * WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                                    }
                                } else {
                                    Ovj = (i17 + i) * 6396;
                                }
                            } while (i3 > 5631);
                            while (true) {
                                int i19 = sBi;
                                int i20 = i19 + 221;
                                if (i20 == 99) {
                                    sBi = i19 >> 68;
                                } else if (i20 != 105) {
                                    if (i20 == 146) {
                                        sBi = ((sBi % 77) % 68) ^ 2112;
                                    }
                                }
                                sBi = (sBi % 54) + i19 + i19;
                                sBi = ((sBi % 77) % 68) ^ 2112;
                            }
                        }
                    }
                } while (i2 != 158);
                while (true) {
                    int i21 = Ovj;
                    if (sBi <= 5631) {
                        do {
                            int i22 = sBi;
                            i5 = i22 + 260;
                            if (i5 != 86) {
                                if (i5 == 222) {
                                    sBi = i22 ^ 1865;
                                }
                            }
                            sBi = ((sBi >> 87) + i22) ^ 3690;
                        } while (i5 != 261);
                    }
                    Ovj = ((i21 >> 16) ^ 4374) + i;
                }
                while (true) {
                    sBi = (sBi * 15) >> 56;
                }
            } else {
                strRgaQzq = "";
            }
        } else {
            strRgaQzq = UPbYzn.RgaQzq(str, 2048);
        }
        map.put(strDbNXlk, strRgaQzq);
        String strDbNXlk2 = AhwBna.SUBSCRIBER_CELL_ID.DbNXlk();
        if (sBi > 5631) {
            String str3 = this.zTLmQw;
            if (str3 != null) {
                str2 = str3;
            } else if ((Ovj ^ 6646) != 0) {
                while (true) {
                    int i23 = Ovj;
                    int i24 = i23 + 65;
                    if (i24 == 76) {
                        Ovj = (i23 * 44) % 42;
                        if (sBi <= 5631) {
                            while (true) {
                                int i25 = sBi;
                                int i26 = i25 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                                if (i26 != 26) {
                                    if (i26 == 156) {
                                        sBi = ((i25 >> 96) % 117) + i25;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            while (true) {
                                sBi = (sBi * 74) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                            }
                        }
                    } else if (i24 == 97) {
                        while (true) {
                            Ovj >>= 204;
                        }
                    } else if (i24 != 256) {
                        continue;
                    } else if ((sBi ^ 5632) != 0) {
                        while (sBi + 208 != 87) {
                        }
                        while (true) {
                            sBi = (sBi >> 97) ^ WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE;
                        }
                    } else {
                        Ovj = ((i23 ^ 1376) * 45) >> 37;
                    }
                }
            }
            map.put(strDbNXlk2, str2);
            return;
        }
        while (true) {
            int i27 = sBi;
            int i28 = i27 + 52;
            if (i28 == 75) {
                break;
            } else if (i28 == 154) {
                sBi = ((i27 % WalletImportError.ERROR_CODE_AA_EXIST) ^ MTCoreConstants.RemoteWhat.TURN_ON_CONNECT) + i27;
            }
        }
        while (true) {
            sBi = ((sBi * 67) ^ 5414) >> 5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public QhsCdE.EnumC0007QhsCdE sSMYrx() {
        return QhsCdE.EnumC0007QhsCdE.COLLECTOR_TYPE_SUBSCRIBER;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // QfgSZK.QhsCdE
    public void zuBGHE(QSusPL qSusPL, Map<String, String> map) throws InterruptedException {
        int i;
        if (qSusPL.aPFruk() == null) {
            return;
        }
        this.iitLhi = DGUQLI.dvImUD(qSusPL.aPFruk());
        if (sBi <= 5631) {
            do {
                i = sBi;
            } while (i + 26 != 26);
            sBi = (i + i + i) * 90;
        }
        this.zTLmQw = DGUQLI.hCLrkq(qSusPL.aPFruk());
    }
}
