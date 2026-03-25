package QfgSZK;

import QfgSZK.FQMcgE;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.mlkit.common.MlKitException;
import com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
class UimiPO {
    static final short ATTRIBUTE_HEADER_SIZE_BYTES = 4;
    static final int BUFFER_LENGTH = 1024;
    static final int CC_SHA1_DIGEST_LENGTH = 20;
    static final int COOKIE = 554869826;
    private static String DlIaRS = null;
    static final int HEADER_BYTES_SIZE = 20;
    static final int HEADER_TXN_SIZE = 12;
    public static int ONe = 8721;
    static final short STUN_ALLOCATE_MSG = 3;
    static final short STUN_ATTRIBUTE_ERROR_CODE = 9;
    static final short STUN_ATTRIBUTE_MESSAGE_INTEGRITY = 8;
    static final short STUN_ATTRIBUTE_NONCE = 21;
    static final short STUN_ATTRIBUTE_REALM = 20;
    static final short STUN_ATTRIBUTE_REQUESTED_TRANSPORT = 25;
    static final short STUN_ATTRIBUTE_USERNAME = 6;
    static final short STUN_ERROR_CLASS = 272;
    public static int usF;
    private int OHCVpW;
    private String RTLRPp;
    private String aAerqa;
    private String aSpLZf;
    private String acaLLI;
    private String giQJEK;
    private String zsrYBU;
    TMXProfilingConnectionsInterface iGYzRr = null;
    private SecureRandom DznJZr = new SecureRandom();

    public class hkCVbT implements TMXProfilingConnectionsInterface.TMXCallback {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String DOFiFE = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String RMdlje = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String aICvGG = null;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String atjXXm = null;
        public static int cQU = 7077;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String dIYkrO;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String djqpmk;
        public static int hRB;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String sOXXid;

        /* JADX INFO: Incorrect field signature: Lint; */
        static String zertBV;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int i;
            int i2;
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            hRB = 2866;
            if (cQU > 7076) {
                GCXiNH.OHr = 2270;
                DKr(false);
                return;
            }
            do {
                i = cQU;
                i2 = i + 13;
                if (i2 == 98) {
                    while (true) {
                        cQU = ((cQU >> 70) + i) * 69;
                    }
                }
            } while (i2 != 177);
            while (true) {
                cQU = (cQU * 52) + i;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public hkCVbT() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:111:0x01b4) to fix multi-entry loop: BACK_EDGE: B:110:0x01ab -> B:111:0x01b4 */
        /* JADX DEBUG: Duplicate block (B:71:0x0106) to fix multi-entry loop: BACK_EDGE: B:71:0x0106 -> B:70:0x0104 */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x0104, code lost:
        
            r5 = QfgSZK.UimiPO.hkCVbT.cQU % 97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00f4, code lost:
        
            QfgSZK.UimiPO.hkCVbT.cQU = ((QfgSZK.UimiPO.hkCVbT.cQU % 63) % 11) % 87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00fe, code lost:
        
            r5 = (QfgSZK.UimiPO.hkCVbT.cQU % 44) >> 108;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void DKr(boolean z) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            if (z) {
                DKr(false);
            }
            String strFsw = GCXiNH.fsw("OtZh\u000b]dpk\\J\u0003FL[T\u0016A\\V\\\u0011c[KSt^[]]E\u001c%");
            if (cQU <= 7076) {
                while (true) {
                    int i10 = cQU;
                    int i11 = i10 + CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256;
                    if (i11 == 65) {
                        cQU = (i10 * 104) + i10;
                    } else if (i11 != 227) {
                        if (i11 == 336) {
                            cQU = ((i10 + i10) + i10) % 2;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                cQU = (cQU % 69) * 2640;
            }
            dIYkrO = strFsw;
            DOFiFE = GCXiNH.fsw("=~I,N\\qju\bQLIBMS\u0016\\ZCGE\u0010\\JOYZW\u0017\u0018rHa$WWSN\u001e~lu~oz|");
            RMdlje = GCXiNH.fsw("=~I,[Psmi}Lb_]@uSFD\\\\BU\u000fX\\UW_]\u0016\u0017ck`#VTRp\f[az\u007fl{s");
            if (hRB <= 2865) {
                if ((cQU ^ 7077) != 0) {
                    while (cQU + 52 != 75) {
                    }
                    while (true) {
                        cQU = (cQU ^ 1445) % 49;
                    }
                } else {
                    do {
                        i2 = hRB;
                        i3 = i2 + 26;
                        if (i3 != 46) {
                            if (i3 == 196) {
                                int i12 = cQU ^ 7077;
                                if (i12 != 0) {
                                    do {
                                        i6 = cQU;
                                    } while (i6 + 117 != 70);
                                    while (true) {
                                        cQU = ((cQU + i6) >> WalletImportError.ERROR_CODE_AA_EXIST) ^ 4583;
                                    }
                                } else {
                                    hRB = (i2 ^ 5305) * 3536;
                                    if (i12 != 0) {
                                        while (true) {
                                            int i13 = cQU;
                                            int i14 = i13 + 91;
                                            if (i14 == 75) {
                                                break;
                                            }
                                            if (i14 == 123) {
                                                break;
                                            }
                                            if (i14 != 190) {
                                                if (i14 == 387) {
                                                    cQU = (i13 ^ 3431) + i13;
                                                    break;
                                                }
                                            }
                                            i5 = cQU % 97;
                                        }
                                        while (true) {
                                            cQU = i5;
                                            i5 = cQU % 97;
                                        }
                                    }
                                }
                            } else if (i3 != 369) {
                            }
                            int i15 = hRB;
                            if ((cQU ^ 7077) != 0) {
                                do {
                                    int i16 = cQU;
                                    i7 = i16 + 130;
                                    if (i7 == 23) {
                                        while (true) {
                                            cQU = (cQU + i16) % 19;
                                        }
                                    }
                                } while (i7 != 186);
                                while (true) {
                                    cQU = (cQU * 34) >> 88;
                                }
                            } else {
                                hRB = ((i15 + i2) ^ 3938) + i2;
                            }
                        } else {
                            do {
                                hRB = (hRB * 56) % 106;
                            } while (cQU > 7076);
                            while (true) {
                                i4 = cQU;
                                int i17 = i4 + 65;
                                if (i17 != 1) {
                                    if (i17 == 86) {
                                        cQU = i4 ^ 6086;
                                        break;
                                    } else if (i17 == 142) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            cQU = (cQU ^ 295) + i4;
                            while (true) {
                                cQU *= 408;
                            }
                        }
                    } while (i3 != 507);
                    if (cQU <= 7076) {
                        while (true) {
                            i8 = cQU;
                            int i18 = i8 + CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256;
                            if (i18 == 51) {
                                break;
                            }
                            if (i18 == 141) {
                                cQU = i8 * 1107;
                            } else if (i18 == 181) {
                                i9 = (i8 + i8) * 97;
                                cQU = i9;
                            } else if (i18 != 209) {
                            }
                            i9 = ((cQU ^ 3591) % 61) ^ 1783;
                            cQU = i9;
                        }
                        cQU = (i8 >> 13) % 16;
                    }
                    hRB = ((i2 * 15) % 68) * 50;
                }
            }
            djqpmk = GCXiNH.fsw("GtIc\u000b]dpk\\J\u0003k\\\\O\u0016EUPYTD\u0001\u001exR_\u001ammeh%VfsteMX");
            String strFsw2 = GCXiNH.fsw("OtH|D_r{,mPQE[\b");
            if (cQU > 7076) {
                aICvGG = strFsw2;
                String strFsw3 = GCXiNH.fsw("[pR`NU!JApaBFEJFU^`F@_eA\u007fHHS\u001aNQCN%a{adpJEfj");
                if (cQU <= 7076) {
                    while (true) {
                        i = cQU;
                        int i19 = i + 39;
                        if (i19 != 57) {
                            if (i19 == 232) {
                                cQU = (i >> MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR) ^ 3043;
                                break;
                            } else if (i19 == 373) {
                                cQU = ((cQU ^ 5244) >> 6) ^ 4886;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    while (true) {
                        cQU = ((cQU + i) % 2) ^ 4015;
                        cQU = ((cQU ^ 5244) >> 6) ^ 4886;
                    }
                }
                sOXXid = strFsw3;
                zertBV = GCXiNH.fsw("H\u007fZy_YnleRGG");
                atjXXm = GCXiNH.fsw("NdXoNBr0,mLG\n}}ux\u0015fVCDU\\J");
                return;
            }
            while (cQU + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 != 49) {
            }
            while (true) {
                cQU *= 1455;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(@NonNull TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream) {
            try {
                if (tMXHttpResponseCode.getHttpResponseCode() == -20 && inputStream != null) {
                    byte[] bArr = new byte[1024];
                    int iRXxsjQ = UimiPO.this.RXxsjQ(inputStream, bArr, 1024);
                    if (iRXxsjQ >= 20 && sJqpAA(bArr)) {
                        UimiPO uimiPO = UimiPO.this;
                        byte[] bArrZCTncp = uimiPO.zCTncp(uimiPO.giQJEK, UimiPO.this.aSpLZf, UimiPO.this.acaLLI, UimiPO.this.zsrYBU, UimiPO.this.RTLRPp);
                        if (bArrZCTncp != null && bArrZCTncp.length != 0) {
                            UimiPO uimiPO2 = UimiPO.this;
                            uimiPO2.iGYzRr.sendSocketRequest(uimiPO2.aAerqa, UimiPO.this.OHCVpW, bArrZCTncp, true, null);
                            FQMcgE.fQMcgE.sIqKDg(UimiPO.DlIaRS, atjXXm);
                            return true;
                        }
                        FQMcgE.fQMcgE.sIqKDg(UimiPO.DlIaRS, djqpmk);
                        UimiPO uimiPO3 = UimiPO.this;
                        uimiPO3.iGYzRr.closeSocket(uimiPO3.aAerqa, UimiPO.this.OHCVpW);
                        return false;
                    }
                    FQMcgE.fQMcgE.sIqKDg(UimiPO.DlIaRS, dIYkrO + iRXxsjQ + RMdlje);
                    UimiPO uimiPO4 = UimiPO.this;
                    uimiPO4.iGYzRr.closeSocket(uimiPO4.aAerqa, UimiPO.this.OHCVpW);
                    return false;
                }
                FQMcgE.fQMcgE.sIqKDg(UimiPO.DlIaRS, aICvGG + tMXHttpResponseCode + DOFiFE);
                UimiPO uimiPO5 = UimiPO.this;
                uimiPO5.iGYzRr.closeSocket(uimiPO5.aAerqa, UimiPO.this.OHCVpW);
                return false;
            } catch (IOException e) {
                FQMcgE.fQMcgE.sIqKDg(UimiPO.DlIaRS, sOXXid + e);
                return true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
        
            if ((QfgSZK.UimiPO.hkCVbT.cQU ^ 7077) != 0) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
        
            r12 = QfgSZK.UimiPO.hkCVbT.hRB;
            r0 = r12 + 104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
        
            if (r0 == 13) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
        
            if (r0 == 33) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ca, code lost:
        
            if (r0 == 161) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00cd, code lost:
        
            QfgSZK.UimiPO.hkCVbT.hRB = ((r12 % 16) * 93) ^ 3785;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d9, code lost:
        
            if ((QfgSZK.UimiPO.hkCVbT.cQU ^ 7077) == 0) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00db, code lost:
        
            r12 = QfgSZK.UimiPO.hkCVbT.cQU;
            r0 = r12 + 104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
        
            if (r0 == 55) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e5, code lost:
        
            if (r0 == 197) goto L100;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00e8, code lost:
        
            QfgSZK.UimiPO.hkCVbT.cQU = r12 >> 189;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00ee, code lost:
        
            QfgSZK.UimiPO.hkCVbT.cQU = ((QfgSZK.UimiPO.hkCVbT.cQU % 53) + r12) * 7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
        
            QfgSZK.UimiPO.hkCVbT.hRB = (QfgSZK.UimiPO.hkCVbT.hRB * 103) >> 93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
        
            if ((QfgSZK.UimiPO.hkCVbT.cQU ^ 7077) == 0) goto L103;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
        
            r12 = QfgSZK.UimiPO.hkCVbT.cQU;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
        
            if ((r12 + org.spongycastle.crypto.tls.CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256) == 30) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
        
            QfgSZK.UimiPO.hkCVbT.cQU = ((QfgSZK.UimiPO.hkCVbT.cQU ^ 5301) >> com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_AA_EXIST) + r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0117, code lost:
        
            QfgSZK.UimiPO.hkCVbT.hRB = ((r12 * 98) >> 39) * 100;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
        
            if ((QfgSZK.UimiPO.hkCVbT.cQU ^ 7077) == 0) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
        
            r12 = QfgSZK.UimiPO.hkCVbT.cQU;
            r0 = r12 + 91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x012b, code lost:
        
            if (r0 == 91) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
        
            if (r0 == 260) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
        
            if (r0 == 430) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0136, code lost:
        
            QfgSZK.UimiPO.hkCVbT.cQU = (QfgSZK.UimiPO.hkCVbT.cQU * 54) + r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x013e, code lost:
        
            QfgSZK.UimiPO.hkCVbT.cQU = ((r12 * 66) % 85) % 16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0146, code lost:
        
            QfgSZK.UimiPO.hkCVbT.cQU = ((QfgSZK.UimiPO.hkCVbT.cQU * 106) ^ 3858) >> 48;
         */
        /* JADX WARN: Path cross not found for [B:101:?, B:98:?], limit reached: 107 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00e8 -> B:47:0x00bc). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean sJqpAA(byte[] bArr) {
            int i;
            boolean z = false;
            if (UimiPO.this.svUkWZ(bArr) != 275) {
                return false;
            }
            byte[] bArrAVPvww = UimiPO.this.aVPvww(bArr, (short) 9);
            if (cQU <= 7076) {
                while (true) {
                    int i2 = cQU;
                    int i3 = i2 + 26;
                    if (i3 == 95) {
                        while (true) {
                            cQU = (cQU ^ 2656) + i2;
                        }
                    } else {
                        if (i3 == 227) {
                            i = (i2 % 119) >> WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                            break;
                        }
                        if (i3 == 298) {
                            cQU = (i2 % 20) >> 30;
                        } else if (i3 == 388) {
                            i = ((i2 % 96) + i2) >> 18;
                            break;
                        }
                    }
                }
                cQU = i;
            }
            if (bArrAVPvww != null && bArrAVPvww.length != 0) {
                String str = new String(bArrAVPvww);
                String str2 = zertBV;
                if (!str.regionMatches(true, 4, str2, 0, str2.length())) {
                    return false;
                }
                byte[] bArrAVPvww2 = UimiPO.this.aVPvww(bArr, (short) 20);
                if (bArrAVPvww2 != null && bArrAVPvww2.length != 0) {
                    UimiPO.this.zsrYBU = new String(bArrAVPvww2);
                }
                byte[] bArrAVPvww3 = UimiPO.this.aVPvww(bArr, (short) 21);
                if (bArrAVPvww3 != null && bArrAVPvww3.length != 0) {
                    UimiPO.this.RTLRPp = new String(bArrAVPvww3);
                }
                if (UPbYzn.dTTfOR(UimiPO.this.zsrYBU) && UPbYzn.dTTfOR(UimiPO.this.RTLRPp)) {
                    z = true;
                    if (hRB <= 2865) {
                    }
                }
            }
            return z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        FQMcgE.RQa = 9057;
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        FQMcgE.usN = 6842;
        usF = 5262;
        if (ONe > 8720) {
            GCXiNH.OHr = 2270;
            DlIaRS = FQMcgE.hfdhUn(UimiPO.class);
        } else {
            while (ONe + 13 != 84) {
            }
            while (true) {
                ONe >>= 124;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean DYICSh(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        short sIflRwn = iflRwn(bArr);
        if (!QUeTTI(bArr, (short) 8, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})) {
            return false;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, GCXiNH.fsw("U|Zoxy@/"));
        Mac mac = Mac.getInstance(GCXiNH.fsw("U|Zoxy@/"));
        mac.init(secretKeySpec);
        mac.update(bArr, 0, sIflRwn + 20);
        System.arraycopy(mac.doFinal(), 0, bArr, sIflRwn + 24, 20);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OqIZjC(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr2 = new byte[4];
        bArr2[0] = 17;
        if (ONe <= 8720) {
            do {
                int i5 = ONe;
                i4 = i5 + 13;
                if (i4 == 45) {
                    ONe = (i5 + i5) % 64;
                } else if (i4 == 102) {
                    ONe = (i5 >> 74) + i5;
                } else if (i4 == 231) {
                    while (true) {
                        ONe = ((ONe + i5) % 95) + i5;
                    }
                }
            } while (i4 != 277);
            while (true) {
                ONe = ((ONe >> 91) % 42) >> 36;
            }
        }
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i6 = ONe;
        if (i6 <= 8720) {
            while (true) {
                int i7 = ONe;
                int i8 = i7 + 52;
                if (i8 == 60) {
                    ONe = i7 * 7616;
                } else if (i8 == 223) {
                    ONe = (ONe ^ 6588) * 55;
                } else if (i8 == 235) {
                    i3 = (i7 ^ 2958) % 121;
                    ONe = i3;
                    ONe = (ONe ^ 6588) * 55;
                } else if (i8 != 333) {
                }
                i3 = ((ONe + i7) ^ 4312) % WalletImportError.ERROR_CODE_AA_EXIST;
                ONe = i3;
                ONe = (ONe ^ 6588) * 55;
            }
        } else {
            bArr2[3] = 0;
            if ((i6 ^ 8721) == 0) {
                if (bArr.length < 20) {
                    return false;
                }
                if (i6 <= 8720) {
                    do {
                        int i9 = ONe;
                        i = i9 + 117;
                        if (i == 44) {
                            ONe = (i9 % 68) % 51;
                        }
                    } while (i != 76);
                    while (true) {
                        ONe = (ONe >> 44) ^ 2925;
                    }
                }
                return QUeTTI(bArr, STUN_ATTRIBUTE_REQUESTED_TRANSPORT, bArr2);
            }
            do {
                i2 = ONe;
            } while (i2 + 91 != 57);
            while (true) {
                ONe = ((ONe * 106) + i2) >> WalletImportError.ERROR_CODE_AA_CREATE_KEY;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:29:0x0067) to fix multi-entry loop: BACK_EDGE: B:28:0x005f -> B:29:0x0067 */
    public boolean QUeTTI(byte[] bArr, short s, byte[] bArr2) {
        if (bArr.length < 20) {
            return false;
        }
        short sIflRwn = iflRwn(bArr);
        if (ONe <= 8720) {
            while (ONe + 104 != 34) {
            }
            while (true) {
                ONe ^= MTAnalysisConstants.MainWhat.ON_ACCOUNT;
            }
        } else {
            if (-1 == sIflRwn) {
                return false;
            }
            short sQgUVrU = (short) (sIflRwn + 4 + QgUVrU((short) bArr2.length));
            if ((ONe ^ 8721) != 0) {
                while (true) {
                    int i = ONe;
                    int i2 = i + 39;
                    if (i2 != 25) {
                        if (i2 == 189) {
                            ONe = i * 10300;
                            break;
                        }
                        if (i2 == 388) {
                            ONe = (i + i + i) * 81;
                        } else if (i2 == 502) {
                            while (true) {
                                ONe = ((ONe % 109) + i) % 89;
                            }
                        }
                    } else {
                        break;
                    }
                }
                while (true) {
                    ONe = ((ONe >> 58) % 28) % 9;
                }
            } else {
                if (sQgUVrU < sIflRwn || bArr.length - 20 < sQgUVrU) {
                    return false;
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
                byte[] bArrArray = byteBufferAllocate.putShort(s).array();
                bArr[sIflRwn + 20] = bArrArray[0];
                bArr[sIflRwn + 21] = bArrArray[1];
                byteBufferAllocate.rewind();
                byte[] bArrArray2 = byteBufferAllocate.putShort((short) bArr2.length).array();
                if ((ONe ^ 8721) == 0) {
                    bArr[sIflRwn + 22] = bArrArray2[0];
                    bArr[sIflRwn + 23] = bArrArray2[1];
                    System.arraycopy(bArr2, 0, bArr, sIflRwn + 24, bArr2.length);
                    return dGgpab(bArr, sQgUVrU);
                }
                while (true) {
                    int i3 = ONe;
                    if (i3 + 52 == 75) {
                        ONe = ((i3 >> 115) % 82) >> 6;
                    }
                }
            }
        }
    }

    public short QgUVrU(short s) {
        return (short) ((s + 3) & (-4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:33:0x0076) to fix multi-entry loop: BACK_EDGE: B:33:0x0076 -> B:34:0x0078 */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        QfgSZK.UimiPO.usF = (QfgSZK.UimiPO.usF >> com.okinc.business.defi.biz.core.error.WalletImportError.ERROR_CODE_AA_CREATE_KEY) ^ 5132;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int RXxsjQ(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int i2;
        int i3 = inputStream.read(bArr, 0, i);
        if ((usF ^ 5262) == 0) {
            if (i3 != 0) {
                return i3;
            }
            FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("[pR`NU!jc\bPFKM\bEOAQ@"));
            return 0;
        }
        if (ONe > 8720) {
            while (true) {
                int i4 = usF;
                int i5 = i4 + 26;
                if (i5 == 35) {
                    usF = (i4 * 48) >> 125;
                    break;
                }
                if (i5 == 169) {
                    usF = ((i4 ^ 5033) + i4) % 57;
                    if ((ONe ^ 8721) != 0) {
                        break;
                    }
                } else {
                    if (i5 == 298) {
                        break;
                    }
                    if (i5 == 452) {
                        while (true) {
                            int i6 = usF;
                            if (ONe <= 8720) {
                                break;
                            }
                            usF = ((i6 >> 100) ^ 3708) % 92;
                        }
                        while (true) {
                            int i7 = ONe;
                            if (i7 + 104 == 14) {
                                ONe = (i7 >> 78) * 22;
                            }
                        }
                    }
                }
            }
        }
        do {
            i2 = ONe + 39;
            if (i2 == 23) {
                while (true) {
                    ONe = (ONe ^ MTPushConstants.MainWhat.ALIAS_GET) * 5355;
                }
            }
        } while (i2 != 217);
        while (true) {
            ONe = (ONe * 91) >> 80;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] aRClCA() {
        byte[] bArr = new byte[1024];
        if (!gISBfG(bArr, (short) 3)) {
            return null;
        }
        OqIZjC(bArr);
        short sIflRwn = iflRwn(bArr);
        if (-1 == sIflRwn) {
            return null;
        }
        return Arrays.copyOfRange(bArr, 0, sIflRwn + 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:68:0x012d) to fix multi-entry loop: BACK_EDGE: B:68:0x012d -> B:67:0x012b */
    /* JADX DEBUG: Duplicate block (B:93:0x0180) to fix multi-entry loop: BACK_EDGE: B:93:0x0180 -> B:94:0x0183 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: int */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x012b, code lost:
    
        r0 = (QfgSZK.UimiPO.ONe >> 58) * 95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] aVPvww(byte[] bArr, short s) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        short sIflRwn = iflRwn(bArr);
        if ((ONe ^ 8721) != 0) {
            while (true) {
                int i9 = ONe;
                int i10 = i9 + 208;
                if (i10 != 3) {
                    if (i10 == 119) {
                        ONe = i9 * TypedValues.PositionType.TYPE_PERCENT_HEIGHT;
                        break;
                    }
                } else {
                    break;
                }
            }
            ONe = ((ONe >> 35) * 125) % 79;
        }
        if (sIflRwn == -1) {
            return null;
        }
        short s2 = 0;
        while (s2 < sIflRwn) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
            byte[] bArr2 = new byte[2];
            short s3 = (short) (s2 + 1);
            bArr2[0] = bArr[s2 + 20];
            if (ONe <= 8720) {
                do {
                    i = ONe;
                } while (i + 39 != 39);
                while (true) {
                    ONe = (ONe + i) ^ 3681;
                }
            } else {
                short s4 = (short) (s3 + 1);
                bArr2[1] = bArr[s3 + 20];
                byteBufferAllocate.put(bArr2);
                byteBufferAllocate.rewind();
                short s5 = byteBufferAllocate.getShort();
                byteBufferAllocate.rewind();
                byte[] bArr3 = new byte[2];
                if (usF <= 5261) {
                    while (true) {
                        int i11 = usF;
                        int i12 = i11 + 78;
                        if (i12 != 95) {
                            if (i12 == 238) {
                                usF = (i11 * 65) >> 7;
                            }
                        }
                        usF = (usF + i11) * 122;
                    }
                } else {
                    short s6 = (short) (s4 + 1);
                    bArr3[0] = bArr[s4 + 20];
                    short s7 = (short) (s6 + 1);
                    bArr3[1] = bArr[s6 + 20];
                    byteBufferAllocate.put(bArr3);
                    byteBufferAllocate.rewind();
                    int i13 = byteBufferAllocate.getShort();
                    short sQgUVrU = QgUVrU(i13);
                    if ((ONe ^ 8721) != 0) {
                        while (true) {
                            int i14 = ONe;
                            int i15 = i14 + 260;
                            if (i15 != 26) {
                                if (i15 == 114) {
                                    i8 = (i14 ^ 2855) + i14;
                                } else if (i15 == 297) {
                                    i8 = (i14 + i14) >> 38;
                                } else if (i15 == 357) {
                                    ONe = (i14 * 109) % 22;
                                    break;
                                }
                                ONe = i8;
                            } else {
                                while (true) {
                                    ONe = ((ONe >> 22) * 15) % 30;
                                }
                            }
                        }
                    }
                    if (s5 == s) {
                        byte[] bArr4 = new byte[i13];
                        System.arraycopy(bArr, s7 + 20, bArr4, 0, i13);
                        return bArr4;
                    }
                    if (8 == s) {
                        return null;
                    }
                    s2 = (short) (s7 + sQgUVrU);
                    int i16 = ONe;
                    if ((i16 ^ 8721) != 0) {
                        while (true) {
                            i2 = ONe;
                            int i17 = i2 + 234;
                            if (i17 == 27) {
                                break;
                            }
                            if (i17 != 125) {
                                if (i17 != 284) {
                                    if (i17 == 288) {
                                        ONe = i2 >> CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA;
                                        break;
                                    }
                                }
                                i3 = (ONe >> 58) * 95;
                            } else {
                                ONe = (i2 * 87) % 70;
                            }
                        }
                        i3 = (ONe + i2) ^ 4612;
                        while (true) {
                            ONe = i3;
                            i3 = (ONe >> 58) * 95;
                        }
                    } else if ((usF ^ 5262) != 0) {
                        if (i16 <= 8720) {
                            while (true) {
                                int i18 = ONe;
                                int i19 = i18 + 78;
                                if (i19 == 83) {
                                    ONe = (i18 % 88) >> 7;
                                } else if (i19 != 217) {
                                    if (i19 == 348) {
                                        ONe = (i18 % 91) + i18;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            ONe = (ONe % 33) >> 91;
                        }
                        while (true) {
                            int i20 = usF;
                            int i21 = ONe;
                            int i22 = i21 ^ 8721;
                            if (i22 != 0) {
                                while (true) {
                                    i4 = ONe;
                                    int i23 = i4 + 247;
                                    if (i23 == 39) {
                                        ONe = (i4 * 7) >> 44;
                                    } else if (i23 != 144) {
                                        if (i23 == 173) {
                                            ONe = ((i4 % 15) * 61) + i4;
                                            break;
                                        }
                                        if (i23 == 190) {
                                            break;
                                        }
                                    }
                                    ONe = (ONe % 34) + i4;
                                }
                                while (true) {
                                    ONe = ((ONe ^ 2918) % 23) + i4;
                                }
                            } else {
                                int i24 = i20 + 65;
                                if (i24 != 27) {
                                    if (i24 != 36) {
                                        continue;
                                    } else {
                                        usF = (i20 % AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) ^ 2177;
                                        if (i21 <= 8720) {
                                            do {
                                                i6 = ONe;
                                                i7 = i6 + 104;
                                                if (i7 == 25) {
                                                    ONe = (i6 >> 48) + i6;
                                                } else if (i7 != 80) {
                                                }
                                                while (true) {
                                                    ONe = ((ONe ^ 2266) >> 69) ^ 4075;
                                                }
                                            } while (i7 != 177);
                                            while (true) {
                                                ONe = (ONe * 104) + i6;
                                            }
                                        }
                                    }
                                }
                                int i25 = usF;
                                if (i22 != 0) {
                                    while (true) {
                                        int i26 = ONe;
                                        int i27 = i26 + 273;
                                        if (i27 == 96) {
                                            i5 = (i26 * 59) % 63;
                                            break;
                                        }
                                        if (i27 == 169) {
                                            i5 = (i26 % 38) * 15;
                                            break;
                                        }
                                    }
                                    ONe = i5;
                                }
                                usF = (i25 * MTAnalysisConstants.MainWhat.ON_REPORT) >> 48;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean dGgpab(byte[] bArr, short s) {
        if (bArr.length < 20) {
            return false;
        }
        byte[] bArrArray = ByteBuffer.allocate(2).putShort(s).array();
        bArr[2] = bArrArray[0];
        if ((ONe ^ 8721) == 0) {
            bArr[3] = bArrArray[1];
            return true;
        }
        while (true) {
            int i = ONe;
            int i2 = i + 52;
            if (i2 == 61) {
                ONe = i * 2052;
            } else if (i2 == 129) {
                break;
            }
        }
        while (true) {
            ONe = ((ONe ^ 2563) % 34) * 70;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:28:0x0049) to fix multi-entry loop: BACK_EDGE: B:28:0x0049 -> B:29:0x004b */
    /* JADX DEBUG: Duplicate block (B:31:0x0058) to fix multi-entry loop: BACK_EDGE: B:31:0x0058 -> B:32:0x005a */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        QfgSZK.UimiPO.ONe = (QfgSZK.UimiPO.ONe * 94) % 96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00cb, code lost:
    
        QfgSZK.UimiPO.usF *= 420420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (QfgSZK.UimiPO.ONe > 8720) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void doTurnConnection(TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface, String str, int i, String str2, String str3, String str4) {
        int i2;
        int i3;
        if (!UPbYzn.iSpHlg(str) && !UPbYzn.iSpHlg(str2)) {
            if (ONe <= 8720) {
                do {
                    i3 = ONe;
                } while (i3 + 26 != 7);
                ONe = (i3 % 124) >> 46;
            }
            if (!UPbYzn.iSpHlg(str3)) {
                if (usF <= 5261) {
                    if (ONe <= 8720) {
                        while (true) {
                            i2 = ONe;
                            int i4 = i2 + 91;
                            if (i4 == 76) {
                                ONe = ((i2 + i2) + i2) >> 75;
                                break;
                            } else {
                                if (i4 == 271) {
                                    break;
                                }
                                if (i4 == 320) {
                                    ONe = (i2 ^ 3643) * 83;
                                    break;
                                } else if (i4 == 464) {
                                    break;
                                }
                            }
                        }
                        while (true) {
                            ONe = ((ONe ^ 2058) % 63) + i2;
                        }
                    } else {
                        while (true) {
                            int i5 = usF;
                            int i6 = i5 + 65;
                            if (i6 == 21) {
                                break;
                            }
                            if (i6 == 161) {
                                while (true) {
                                    usF = ((usF + i5) + i5) ^ 2114;
                                    if (ONe <= 8720) {
                                        while (true) {
                                            int i7 = ONe;
                                            int i8 = i7 + 117;
                                            if (i8 == 10) {
                                                ONe = i7 * 7504;
                                            } else if (i8 == 113) {
                                                ONe = ((i7 % 47) ^ 4321) * 11;
                                                break;
                                            } else if (i8 == 210) {
                                                while (true) {
                                                    ONe = ((ONe ^ 2238) + i7) * 70;
                                                }
                                            } else if (i8 == 264) {
                                                while (true) {
                                                    ONe = ((ONe * 43) ^ 4888) + i7;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (i6 == 250) {
                                usF = (i5 % 79) + i5;
                                break;
                            } else if (i6 == 408) {
                                usF = i5 >> CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256;
                                if ((ONe ^ 8721) == 0) {
                                    break;
                                }
                            }
                        }
                        while (ONe + 104 != 2) {
                        }
                        while (true) {
                            ONe = (ONe ^ 1278) >> 56;
                        }
                    }
                } else if (!UPbYzn.iSpHlg(str4) && tMXProfilingConnectionsInterface != null) {
                    FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("NeZ~_Xoy,|wqd\tzBG@Q@F"));
                    this.iGYzRr = tMXProfilingConnectionsInterface;
                    this.aAerqa = str;
                    this.OHCVpW = i;
                    this.giQJEK = str2;
                    this.aSpLZf = str3;
                    this.acaLLI = str4;
                    byte[] bArrARClCA = aRClCA();
                    if (bArrARClCA == null || bArrARClCA.length == 0) {
                        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("ztOYEPtjdGPJPLLwWV_VFx^mK[Z^H\u0019JRRpvmge [Aypr*k}appf=2T~k>Iiit9JrvP@Wi"));
                        return;
                    } else {
                        this.iGYzRr.sendSocketRequest(this.aAerqa, this.OHCVpW, bArrARClCA, false, new hkCVbT());
                        return;
                    }
                }
            }
        }
        FQMcgE.fQMcgE.sIqKDg(DlIaRS, GCXiNH.fsw("T\u007fMmGXe>\\IPBGL\\BDF\u0014U]C\u0010{kor\u001bh\\IBCvp"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gISBfG(byte[] bArr, short s) {
        int i;
        if (bArr.length < 20) {
            return false;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byte[] bArrArray = byteBufferAllocate.putShort(s).array();
        bArr[0] = bArrArray[0];
        bArr[1] = bArrArray[1];
        byteBufferAllocate.rewind();
        if (ONe <= 8720) {
            while (true) {
                i = ONe;
                int i2 = i + 39;
                if (i2 == 25) {
                    ONe = (i % 64) >> 76;
                } else if (i2 == 102) {
                    break;
                }
            }
            ONe = ((i + i) * 49) % 88;
        }
        byte[] bArrArray2 = byteBufferAllocate.putShort((short) 0).array();
        bArr[2] = bArrArray2[0];
        bArr[3] = bArrArray2[1];
        byte[] bArrArray3 = ByteBuffer.allocate(4).putInt(COOKIE).array();
        byte b = bArrArray3[0];
        bArr[4] = b;
        byte b2 = bArrArray3[1];
        bArr[5] = b2;
        if ((ONe ^ 8721) == 0) {
            bArr[6] = b;
            bArr[7] = b2;
            byte[] bArr2 = new byte[12];
            this.DznJZr.nextBytes(bArr2);
            System.arraycopy(bArr2, 0, bArr, 8, 12);
            return true;
        }
        while (true) {
            int i3 = ONe;
            int i4 = i3 + 52;
            if (i4 == 69) {
                break;
            }
            if (i4 == 251) {
                ONe = (i3 ^ 5167) * 51;
            }
        }
        while (true) {
            ONe = (ONe >> 52) % 41;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public short iflRwn(byte[] bArr) {
        if (bArr.length < 20) {
            return (short) -1;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.put(bArr, 2, 2);
        byteBufferAllocate.rewind();
        return byteBufferAllocate.getShort();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        r5 = QfgSZK.UimiPO.usF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if ((r5 + 26) == 32) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        QfgSZK.UimiPO.usF = (r5 + r5) ^ 2167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        if ((QfgSZK.UimiPO.ONe ^ 8721) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        r5 = QfgSZK.UimiPO.ONe;
        r0 = r5 + 39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 == 54) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (r0 == 60) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        QfgSZK.UimiPO.ONe = (QfgSZK.UimiPO.ONe + r5) % 83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        QfgSZK.UimiPO.ONe = r5 >> me.relex.circleindicator.BuildConfig.VERSION_CODE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (QfgSZK.UimiPO.ONe <= 8720) goto L39;
     */
    /* JADX WARN: Path cross not found for [B:39:?, B:36:?], limit reached: 40 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0042 -> B:11:0x0019). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public short svUkWZ(byte[] bArr) {
        int i;
        if (bArr.length < 20) {
            return (short) -1;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        if ((usF ^ 5262) == 0) {
            byteBufferAllocate.put(bArr, 0, 2);
            byteBufferAllocate.rewind();
            if (ONe > 8720) {
                return byteBufferAllocate.getShort();
            }
            do {
                i = ONe;
            } while (i + 65 != 78);
            while (true) {
                ONe = ((ONe * 10) + i) >> 59;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] zCTncp(String str, String str2, String str3, String str4, String str5) {
        try {
            byte[] bArr = new byte[1024];
            if (gISBfG(bArr, (short) 3)) {
                OqIZjC(bArr);
                String str6 = GCXiNH.fsw(",+") + str + ":" + str2;
                if (str3.length() > 0) {
                    str6 = str6 + ";" + str3;
                }
                Charset charset = StandardCharsets.UTF_8;
                QUeTTI(bArr, (short) 6, str6.getBytes(charset));
                QUeTTI(bArr, (short) 20, str4.getBytes(charset));
                QUeTTI(bArr, (short) 21, str5.getBytes(charset));
                byte[] bArrQfsBiF = UPbYzn.QfsBiF(str6 + ":" + str4 + ":" + str2);
                if (bArrQfsBiF != null && bArrQfsBiF.length != 0) {
                    DYICSh(bArr, bArrQfsBiF);
                    short sIflRwn = iflRwn(bArr);
                    if (-1 == sIflRwn) {
                        return null;
                    }
                    return Arrays.copyOfRange(bArr, 0, sIflRwn + 20);
                }
                return null;
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            ORrpqH.uzCIH().seuMaA(e);
        }
        return null;
    }
}
