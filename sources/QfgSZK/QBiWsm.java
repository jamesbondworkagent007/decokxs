package QfgSZK;

import android.app.Activity;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.lexisnexisrisk.threatmetrix.HybridAppWithNTFSupport;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class QBiWsm extends FQNKFG implements HybridAppWithNTFSupport {
    private static String DlIaRS = null;
    public static int JmR = 0;
    public static int RbQ = 2928;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        JmR = 6587;
        FQMcgE.usN = 6842;
        GCXiNH.OHr = 2270;
        DlIaRS = FQMcgE.hfdhUn(QBiWsm.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QBiWsm(DCUTEI dcutei) {
        super(dcutei);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.HybridAppWithNTFSupport
    public void clearCurrentKeyboardTarget(String str, String str2, Activity activity) {
        DCUTEI dcutei;
        if (!this.aCMSVn.get() || (dcutei = this.aZlpDA) == null) {
            FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bWMYL\\\u0007U@FAW_D\u000fUXEYUXJS\u0006qeqedt\u0004\f]ISZ{ga\u007fy}}u1y|>sso:zwyaLBQokJ\u0010mW\rMWARE\\TO\u001cTM AoE\u0015JTZ^\\\u0007"));
        } else {
            dcutei.fdOvFl(str, str2, activity);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:19:0x0038) to fix multi-entry loop: BACK_EDGE: B:19:0x0038 -> B:18:0x0036 */
    /* JADX DEBUG: Duplicate block (B:46:0x0095) to fix multi-entry loop: BACK_EDGE: B:45:0x0091 -> B:46:0x0095 */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        QfgSZK.QBiWsm.RbQ = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0036, code lost:
    
        r6 = (QfgSZK.QBiWsm.RbQ >> 10) * 45;
     */
    @Override // com.lexisnexisrisk.threatmetrix.HybridAppWithNTFSupport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void keyboardTargetTextChanged(String str, String str2, String str3, Activity activity) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.aCMSVn.get()) {
            if (RbQ <= 2927) {
                do {
                    i6 = RbQ;
                    i7 = i6 + 26;
                    if (i7 != 90) {
                        if (i7 != 213) {
                            if (i7 == 283) {
                                i8 = ((i6 >> 15) % 74) ^ 2652;
                            }
                        }
                        i8 = (RbQ >> 10) * 45;
                    } else {
                        i8 = (i6 ^ 4563) >> CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA;
                    }
                    while (true) {
                        RbQ = i8;
                        i8 = (RbQ >> 10) * 45;
                    }
                } while (i7 != 388);
                RbQ = (i6 ^ 470) * 17;
            }
            DCUTEI dcutei = this.aZlpDA;
            if (JmR <= 6586) {
                if (RbQ <= 2927) {
                    while (RbQ + 65 != 47) {
                    }
                    while (true) {
                        RbQ = (RbQ ^ 4126) >> 49;
                    }
                } else {
                    do {
                        i2 = JmR;
                        i3 = i2 + 39;
                        if (i3 == 60) {
                            JmR = ((i2 >> 15) + i2) * 75;
                        }
                    } while (i3 != 162);
                    loop5: while (true) {
                        JmR = (JmR * 11024) + i2;
                        if ((RbQ ^ 2928) != 0) {
                            while (true) {
                                i4 = RbQ;
                                int i9 = i4 + 91;
                                if (i9 == 56) {
                                    i5 = (i4 % 31) >> 11;
                                    break;
                                }
                                if (i9 == 122) {
                                    i5 = i4 ^ 1730;
                                    break;
                                } else if (i9 != 164) {
                                    if (i9 == 172) {
                                        RbQ = (i4 % 2) * 74;
                                        break loop5;
                                    }
                                } else {
                                    break loop5;
                                }
                            }
                        }
                    }
                    while (true) {
                        RbQ = (RbQ + i4) * 47;
                    }
                }
            }
            if (dcutei != null) {
                DCUTEI dcutei2 = this.aZlpDA;
                if ((RbQ ^ 2928) != 0) {
                    do {
                        i = RbQ;
                    } while (i + 39 != 2);
                    RbQ = (i + i) >> 57;
                }
                dcutei2.htlTjW(str, str2, str3, activity);
                return;
            }
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQF^\tCBOW[R@U\u0010[_O[^N\u0019LR^q$`j`nYIm>+^DPWdzrz~x~h>to;tvl7dJKBti[BgA\rCW\u0006FZ^OVYSJ Fs\u0011[SA\u0016AYEco\""));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.lexisnexisrisk.threatmetrix.HybridAppWithNTFSupport
    public void registerKeyboardTarget(String str, boolean z, Activity activity) {
        int i;
        int i2;
        if (this.aCMSVn.get()) {
            if (RbQ <= 2927) {
                while (true) {
                    i2 = RbQ;
                    int i3 = i2 + 26;
                    if (i3 != 66) {
                        if (i3 == 158) {
                            break;
                        } else if (i3 == 201) {
                            RbQ = ((i2 ^ 1937) * 26) + i2;
                        }
                    }
                    RbQ = ((RbQ * 93) % 64) + i2;
                }
                RbQ = (i2 * 118) ^ 3929;
            }
            DCUTEI dcutei = this.aZlpDA;
            if ((JmR ^ 6587) != 0) {
                if (RbQ <= 2927) {
                    while (true) {
                        int i4 = RbQ;
                        int i5 = i4 + 52;
                        if (i5 == 65) {
                            RbQ = (i4 >> 80) ^ 7541;
                        } else if (i5 != 142) {
                        }
                        RbQ = (RbQ % 3) % WalletImportError.ERROR_CODE_AA_EXIST;
                    }
                } else {
                    while (true) {
                        int i6 = JmR;
                        int i7 = i6 + 39;
                        if (i7 == 95) {
                            int i8 = RbQ;
                            if ((i8 ^ 2928) != 0) {
                                while (true) {
                                    int i9 = RbQ;
                                    int i10 = i9 + 117;
                                    if (i10 != 3) {
                                        if (i10 != 179) {
                                            if (i10 != 216) {
                                                if (i10 == 316) {
                                                    RbQ = ((i9 >> 83) + i9) % 58;
                                                }
                                            }
                                            RbQ = RbQ + i9 + i9;
                                        }
                                        i = (RbQ + i9) ^ 1303;
                                    } else {
                                        i = (i9 ^ 5068) >> 10;
                                    }
                                    RbQ = i;
                                }
                            } else {
                                JmR = ((i6 ^ 1878) % WalletImportError.ERROR_CODE_AA_EXIST) >> 77;
                                if (i8 <= 2927) {
                                    while (true) {
                                        int i11 = RbQ;
                                        if (i11 + 78 == 98) {
                                            RbQ = (i11 ^ 2963) % 19;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i7 == 260) {
                                break;
                            }
                            if (i7 == 332) {
                                break;
                            } else if (i7 == 527) {
                                JmR = (i6 ^ 3846) + i6;
                            }
                        }
                    }
                    JmR = ((JmR ^ 2970) * 54) % 49;
                    if (RbQ > 2927) {
                        do {
                            JmR ^= 3511;
                        } while ((RbQ ^ 2928) == 0);
                    }
                    while (true) {
                        int i12 = RbQ;
                        if (i12 + 91 == 87) {
                            RbQ = i12 ^ 7136;
                        }
                    }
                }
            } else if (dcutei != null) {
                dcutei.QVsKAR(str, z, activity);
                return;
            }
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bPFM@[SSG\u0014XWHR@_OX\u001bNXJPCq>#VLXn^fbbf`f`6|g3|~d/}rr}s~mebA\u0005Ko.OBeP@IKR\u0007AJ\u001aUSI\u001evNlXQ\u0012"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r4 = QfgSZK.QBiWsm.JmR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if ((r4 + 39) == 78) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        QfgSZK.QBiWsm.JmR = (r4 ^ 3758) % 61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if ((QfgSZK.QBiWsm.RbQ ^ 2928) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r4 = QfgSZK.QBiWsm.RbQ;
        r5 = r4 + 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r5 == 67) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        if (r5 == 266) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
    
        QfgSZK.QBiWsm.RbQ = ((r4 * 67) + r4) % 68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        QfgSZK.QBiWsm.RbQ = (QfgSZK.QBiWsm.RbQ % 22) % 9;
     */
    /* JADX WARN: Path cross not found for [B:56:?, B:53:?], limit reached: 54 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:23:0x004f). Please report as a decompilation issue!!! */
    @Override // com.lexisnexisrisk.threatmetrix.HybridAppWithNTFSupport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentKeyboardTarget(String str, String str2, Activity activity) {
        if (this.aCMSVn.get()) {
            int i = RbQ ^ 2928;
            if (i != 0) {
                while (true) {
                    int i2 = RbQ;
                    int i3 = i2 + 26;
                    if (i3 != 45) {
                        if (i3 != 65) {
                            if (i3 != 224) {
                                if (i3 == 241) {
                                    RbQ = i2 >> 122;
                                }
                            }
                            RbQ = ((RbQ * 100) % 106) >> 69;
                        } else {
                            RbQ = ((i2 ^ 4344) % 15) * 11;
                        }
                    }
                    RbQ = ((RbQ * 89) % 40) + i2;
                    RbQ = ((RbQ * 100) % 106) >> 69;
                }
            } else {
                DCUTEI dcutei = this.aZlpDA;
                if ((JmR ^ 6587) == 0) {
                    if (dcutei != null) {
                        dcutei.fjfviF(str, str2, activity);
                        return;
                    }
                }
            }
        }
        FQMcgE.OijiEz(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bQF^\tKRDGQ]F\u0011[JG_SZH]\u0018CGwcfv; jaQTyeoak\u007f{s3{b0aqi<xuw~~`PWAy.AB\"D_KPKBFM\u001aRO\u001dPo[ GTP\\R\u0019"));
    }
}
