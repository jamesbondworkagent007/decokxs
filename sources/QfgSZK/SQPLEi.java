package QfgSZK;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.lexisnexisrisk.threatmetrix.TMXProfiling;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public class SQPLEi extends BroadcastReceiver {
    private static String DlIaRS;
    public static int deM;
    public static int fPz;
    TMXProfiling OezBCG;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        int i;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        deM = 1011;
        FQMcgE.RQa = 9057;
        GCXiNH.OHr = 2270;
        FQMcgE.usN = 6842;
        if ((1011 ^ deM) == 0) {
            fPz = 6713;
            DlIaRS = FQMcgE.hfdhUn(SQPLEi.class);
            return;
        }
        while (true) {
            int i2 = deM;
            int i3 = i2 + 13;
            if (i3 != 8) {
                if (i3 == 124) {
                    i = ((i2 + i2) * 95) % 122;
                    deM = i;
                } else if (i3 == 225) {
                    break;
                } else if (i3 == 270) {
                    deM = (i2 ^ 2174) + i2;
                }
            }
            i = ((deM + i2) >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY) ^ 2094;
            deM = i;
        }
        while (true) {
            deM = (deM % 46) ^ 2586;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SQPLEi(TMXProfiling tMXProfiling) {
        this.OezBCG = tMXProfiling;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void hTAtCx(TMXProfiling tMXProfiling, ZqidTP zqidTP) {
        if (zqidTP == null || zqidTP.Umbazn == null) {
            FQMcgE.DztXDE(DlIaRS, GCXiNH.fsw("SdW`\u000bRnpxMZW"));
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001fcllxyuevv"));
        intentFilter.addAction(GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001fcllxyuev~q"));
        zqidTP.Umbazn.registerReceiver(new SQPLEi(tMXProfiling), intentFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:14:0x003b) to fix multi-entry loop: BACK_EDGE: B:13:0x0036 -> B:14:0x003b */
    /* JADX DEBUG: Duplicate block (B:90:0x016c) to fix multi-entry loop: BACK_EDGE: B:90:0x016c -> B:89:0x016a */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x016a, code lost:
    
        r8 = ((QfgSZK.SQPLEi.deM + r5) + r5) + r5;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
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
        if (!GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001fcllxyuev~q").equals(intent.getAction())) {
            boolean zEquals = GCXiNH.fsw("|\u007f_~DXe0eFVFD]\u0006FUA]\\\\\u001fcllxyuevv").equals(intent.getAction());
            int i11 = fPz;
            int i12 = deM ^ 1011;
            if (i12 == 0) {
                if (i11 <= 6712) {
                    if (i12 == 0) {
                        while (true) {
                            int i13 = fPz;
                            int i14 = deM;
                            if (i14 <= 1010) {
                                do {
                                    int i15 = deM;
                                    i = i15 + 208;
                                    if (i != 62) {
                                        if (i != 235) {
                                            if (i == 347) {
                                                deM = (i15 % 12) >> 88;
                                            }
                                        }
                                        i2 = deM + i15 + i15 + i15;
                                    }
                                    i2 = (deM % 19) >> CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256;
                                    while (true) {
                                        deM = i2;
                                        i2 = deM + i15 + i15 + i15;
                                    }
                                } while (i != 404);
                                while (true) {
                                    deM = ((deM % 20) >> 30) ^ 4400;
                                }
                            } else {
                                int i16 = i13 + 39;
                                if (i16 != 95) {
                                    if (i16 == 126) {
                                        fPz = (i13 % 44) * 77;
                                        break;
                                    }
                                } else if (i14 <= 1010) {
                                    while (true) {
                                        int i17 = deM;
                                        int i18 = i17 + CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA;
                                        if (i18 == 65) {
                                            while (true) {
                                                deM = (deM * 89) ^ 5279;
                                            }
                                        } else if (i18 == 154) {
                                            while (true) {
                                                deM = (deM ^ 1662) + i17;
                                            }
                                        } else if (i18 == 282) {
                                            deM = (i17 % 3) * 58;
                                        }
                                    }
                                } else {
                                    if ((i14 ^ 1011) != 0) {
                                        while (true) {
                                            int i19 = deM;
                                            int i20 = i19 + 234;
                                            if (i20 == 8) {
                                                i3 = (i19 >> 82) ^ 3696;
                                                break;
                                            } else if (i20 == 177) {
                                                while (true) {
                                                    deM = (deM % 42) + i19;
                                                }
                                            } else if (i20 == 201) {
                                                i3 = ((i19 >> 66) ^ 4275) % 67;
                                                break;
                                            }
                                        }
                                        deM = i3;
                                    }
                                    fPz = ((i13 + i13) ^ 3134) >> 19;
                                    if ((deM ^ 1011) != 0) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    while (deM + 104 != 70) {
                    }
                    while (true) {
                        deM = ((deM >> 9) * 91) % 125;
                    }
                }
                if (zEquals) {
                    this.OezBCG.DWlxKC();
                    return;
                }
                return;
            }
            do {
                i4 = deM;
                i5 = i4 + 52;
                if (i5 == 32) {
                    while (true) {
                        deM = (deM * 91) + i4;
                    }
                }
            } while (i5 != 135);
            while (true) {
                deM = (deM + i4) >> 120;
            }
        } else if ((deM ^ 1011) != 0) {
            while (true) {
                i10 = deM;
                int i21 = i10 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                if (i21 == 5) {
                    deM = (i10 ^ 4105) + i10 + i10;
                } else if (i21 != 123) {
                    if (i21 == 278) {
                        deM = ((i10 % 52) + i10) ^ 4092;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                deM = (deM >> 90) + i10;
            }
        } else {
            this.OezBCG.QJCXpF();
            if (fPz > 6712) {
                return;
            }
            do {
                int i22 = fPz;
                i6 = i22 + 26;
                if (i6 == 45) {
                    int i23 = deM ^ 1011;
                    if (i23 != 0) {
                        while (deM + 91 != 27) {
                        }
                        while (true) {
                            deM = (deM % 105) ^ 2668;
                        }
                    } else {
                        if (i23 != 0) {
                            while (true) {
                                i7 = deM;
                                int i24 = i7 + 221;
                                if (i24 == 27) {
                                    break;
                                }
                                if (i24 == 91) {
                                    while (true) {
                                        deM = (deM ^ 1065) >> 11;
                                    }
                                } else if (i24 == 288) {
                                    deM = (i7 % 28) >> 18;
                                    break;
                                }
                            }
                            deM = (deM % 87) + i7;
                        }
                        fPz = ((i22 >> 100) * 54) % 94;
                        if ((deM ^ 1011) == 0) {
                            return;
                        }
                        while (true) {
                            int i25 = deM;
                            int i26 = i25 + 26;
                            if (i26 == 76) {
                                while (true) {
                                    deM = ((deM % 67) >> 7) + i25;
                                }
                            } else if (i26 == 122) {
                                while (true) {
                                    deM = (deM + i25) * 95;
                                }
                            } else if (i26 == 214) {
                                deM = (i25 + i25) * 90;
                                return;
                            } else if (i26 == 390) {
                                deM = (i25 % 38) ^ 4911;
                            }
                        }
                    }
                }
            } while (i6 != 89);
            while (true) {
                int i27 = fPz;
                if (deM <= 1010) {
                    do {
                        i8 = deM;
                        i9 = i8 + CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256;
                        if (i9 == 38) {
                            break;
                        }
                    } while (i9 != 155);
                    deM = i8 >> 278;
                }
                fPz = ((i27 ^ 3553) % 38) >> 34;
            }
            while (true) {
                deM = (deM % 30) + i8;
            }
        }
    }
}
