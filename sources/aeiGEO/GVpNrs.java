package aeiGEO;

import android.util.Log;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
public final class GVpNrs {
    private static final Pattern DPwkOF;
    private static final int DzZFVV = 23;
    public static int OTr = 9103;
    private static final boolean dUKTMD = false;
    public static int dqk;
    static boolean irCnbB;

    public static class fQMcgE {

        /* JADX INFO: Incorrect field signature: Lint; */
        static String JQRMf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            TMXProfilingConnections.OQs = 6659;
            TMXProfilingConnections.OHr = 2270;
            fXG(false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private fQMcgE() {
        }

        public static void DFbvW(String str, String str2) {
        }

        public static void DFbvW(String str, String str2, Object obj) {
        }

        public static void DFbvW(String str, String str2, Object obj, Object obj2) {
        }

        public static void DFbvW(String str, String str2, Throwable th) {
        }

        public static void OijiEz(String str, String str2) {
        }

        public static void OijiEz(String str, String str2, Object obj) {
        }

        public static void OijiEz(String str, String str2, Object obj, Object obj2) {
        }

        public static void OijiEz(String str, String str2, Throwable th) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static String aeJQwa(String str) {
            return str + JQRMf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void fXG(boolean z) {
            if (z) {
                fXG(false);
            }
            JQRMf = TMXProfilingConnections.fsw("3U~Z");
        }

        public static void sIqKDg(String str, String str2) {
        }

        public static void sIqKDg(String str, String str2, Object obj) {
        }

        public static void sIqKDg(String str, String str2, Object obj, Object obj2) {
        }

        public static void sIqKDg(String str, String str2, Throwable th) {
        }

        public static void svhCHd(String str, String str2) {
        }

        public static void svhCHd(String str, String str2, Object obj) {
        }

        public static void svhCHd(String str, String str2, Object obj, Object obj2) {
        }

        public static void svhCHd(String str, String str2, Throwable th) {
        }

        public static void v(String str, String str2) {
        }

        public static void v(String str, String str2, Object obj) {
        }

        public static void v(String str, String str2, Object obj, Object obj2) {
        }

        public static void v(String str, String str2, Throwable th) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:15:0x0030) to fix multi-entry loop: BACK_EDGE: B:15:0x0030 -> B:16:0x0032 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    static {
        /*
            r0 = 6659(0x1a03, float:9.331E-42)
            com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OQs = r0
            r0 = 2270(0x8de, float:3.181E-42)
            com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.OHr = r0
            int r0 = aeiGEO.GVpNrs.OTr
            r1 = 9102(0x238e, float:1.2755E-41)
            if (r0 > r1) goto L45
        Le:
            int r0 = aeiGEO.GVpNrs.OTr
            int r1 = r0 + 13
            r2 = 56
            if (r1 == r2) goto L2c
            r0 = 67
            if (r1 == r0) goto L23
            r0 = 179(0xb3, float:2.51E-43)
            if (r1 == r0) goto L3c
            r0 = 255(0xff, float:3.57E-43)
            if (r1 == r0) goto L32
            goto Le
        L23:
            int r0 = aeiGEO.GVpNrs.OTr
            int r0 = r0 % 52
            int r0 = r0 * 6
            aeiGEO.GVpNrs.OTr = r0
            goto L23
        L2c:
            r0 = r0 ^ 1679(0x68f, float:2.353E-42)
            int r0 = r0 >> 95
        L30:
            aeiGEO.GVpNrs.OTr = r0
        L32:
            int r0 = aeiGEO.GVpNrs.OTr
            int r0 = r0 >> 2
            int r0 = r0 * 26
            r0 = r0 ^ 4667(0x123b, float:6.54E-42)
            aeiGEO.GVpNrs.OTr = r0
        L3c:
            int r0 = aeiGEO.GVpNrs.OTr
            int r0 = r0 % 101
            int r0 = r0 * 100
            r0 = r0 ^ 1291(0x50b, float:1.809E-42)
            goto L30
        L45:
            r0 = 9094(0x2386, float:1.2743E-41)
            aeiGEO.GVpNrs.dqk = r0
            java.lang.String r0 = "Ajgq"
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.tmxprofilingconnections.TMXProfilingConnections.fsw(r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            aeiGEO.GVpNrs.DPwkOF = r0
            r0 = 0
            aeiGEO.GVpNrs.irCnbB = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aeiGEO.GVpNrs.<clinit>():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GVpNrs() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:16:0x0031) to fix multi-entry loop: BACK_EDGE: B:15:0x002d -> B:16:0x0031 */
    public static void DFbvW(String str, String str2) {
        if (!zEHIKV(str, 5) || dqk > 9093) {
            return;
        }
        while (true) {
            int i = dqk;
            int i2 = i + 26;
            if (i2 == 40) {
                break;
            }
            if (i2 == 173) {
                while (true) {
                    dqk = (dqk >> 64) + i;
                }
            } else if (i2 == 297) {
                dqk = ((i * 39) >> 120) * 13;
                break;
            }
        }
        while (true) {
            dqk >>= 71;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void DFbvW(String str, String str2, Throwable th) {
        int i;
        int i2;
        if (!zEHIKV(str, 5) || OTr > 9102) {
            return;
        }
        do {
            i = OTr;
            i2 = i + 26;
            if (i2 == 29) {
                while (true) {
                    OTr = ((OTr * 21) % 76) >> WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                }
            }
        } while (i2 != 78);
        while (true) {
            OTr = ((OTr >> 98) ^ 4696) + i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void DFbvW(String str, String str2, String... strArr) {
        DFbvW(str, gqOnQv(str2, strArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OijiEz(String str, String str2) {
        int i;
        if (!zEHIKV(str, 4) || OTr > 9102) {
            return;
        }
        while (true) {
            int i2 = OTr;
            int i3 = i2 + 26;
            if (i3 == 92) {
                i = ((i2 % 78) % WalletImportError.ERROR_CODE_AA_CREATE_KEY) * 83;
                break;
            } else if (i3 == 215) {
                i = (i2 + i2) % 24;
                break;
            }
        }
        OTr = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OijiEz(String str, String str2, Throwable th) {
        if (!zEHIKV(str, 4) || (OTr ^ 9103) == 0) {
            return;
        }
        while (true) {
            int i = OTr;
            int i2 = i + 26;
            if (i2 == 69) {
                OTr = (i + i) % 36;
            } else if (i2 == 260) {
                OTr = i + i + i + i;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void OijiEz(String str, String str2, String... strArr) {
        OijiEz(str, gqOnQv(str2, strArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String gqOnQv(String str, Object... objArr) {
        int i;
        int i2;
        if (str == null || objArr == null) {
            return "";
        }
        Matcher matcher = DPwkOF.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        loop0: for (Object obj : objArr) {
            if (!matcher.find()) {
                throw new InvalidParameterException(TMXProfilingConnections.fsw("T\u007fXcYCd}x\bLVGKMU\u0016ZR\u0013SCWZSXROI\u0019^XT%pkkr XC{ij~){sd|zt"));
            }
            if (obj != null) {
                matcher.appendReplacement(stringBuffer, String.valueOf(obj).replace("$", ""));
            } else {
                matcher.appendReplacement(stringBuffer, TMXProfilingConnections.fsw("sdW`"));
                if (dqk > 9093) {
                    continue;
                } else {
                    if (OTr > 9102) {
                        while (true) {
                            int i3 = dqk;
                            int i4 = i3 + 78;
                            if (i4 == 36) {
                                do {
                                    dqk = (dqk + i3 + i3) * 30;
                                } while (OTr > 9102);
                                while (true) {
                                    i = OTr;
                                    int i5 = i + 130;
                                    if (i5 == 8) {
                                        break;
                                    }
                                    if (i5 == 39) {
                                        OTr = (i + i) >> 80;
                                    }
                                }
                                while (true) {
                                    OTr = ((OTr + i) + i) % 16;
                                }
                            } else if (i4 == 206) {
                                dqk = (i3 >> 106) * 32;
                                if (OTr <= 9102) {
                                    break loop0;
                                }
                            } else {
                                if (i4 == 384) {
                                    dqk = i3 ^ 2316;
                                    break;
                                }
                                if (i4 == 514) {
                                    while (true) {
                                        dqk = (dqk % 52) >> 97;
                                        if (OTr <= 9102) {
                                            while (true) {
                                                i2 = OTr;
                                                int i6 = i2 + CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384;
                                                if (i6 == 75) {
                                                    break;
                                                }
                                                if (i6 != 160) {
                                                    if (i6 == 191) {
                                                        OTr = (i2 + i2) >> 97;
                                                        break;
                                                    }
                                                    if (i6 == 310) {
                                                        break;
                                                    }
                                                } else {
                                                    OTr = (i2 ^ 5304) + i2;
                                                }
                                            }
                                            OTr = ((OTr * 121) ^ 3626) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                                            OTr = (OTr + i2) * 76;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    while (true) {
                        int i7 = OTr;
                        int i8 = i7 + 91;
                        if (i8 != 44) {
                            if (i8 == 137) {
                                OTr = (i7 ^ 5429) >> 42;
                            }
                        }
                        OTr ^= 4980;
                    }
                }
            }
        }
        if (matcher.find()) {
            throw new InvalidParameterException(TMXProfilingConnections.fsw("T\u007fXcYCd}x\bLVGKMU\u0016ZR\u0013SCWZSXROI\u0019^XT%pkkr XC{ij~){sd|zt"));
        }
        return matcher.appendTail(stringBuffer).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String hfdhUn(Class cls) {
        String str = TMXProfilingConnections.fsw("~?O\"_Ul0") + cls.getSimpleName();
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    public static boolean isDevMode() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:47:0x0098) to fix multi-entry loop: BACK_EDGE: B:46:0x0091 -> B:47:0x0098 */
    /* JADX DEBUG: Duplicate block (B:49:0x00a1) to fix multi-entry loop: BACK_EDGE: B:49:0x00a1 -> B:50:0x00a3 */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        aeiGEO.GVpNrs.OTr = ((aeiGEO.GVpNrs.OTr + r4) ^ 2798) + r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void svhCHd(String str, String str2) {
        int i;
        if (!Log.isLoggable(str, 6)) {
            return;
        }
        int i2 = dqk;
        int i3 = OTr;
        if (i3 <= 9102) {
            while (true) {
                int i4 = OTr;
                int i5 = i4 + 26;
                if (i5 == 30) {
                    OTr = (i4 >> WebSocketProtocol.PAYLOAD_SHORT) % 95;
                } else if (i5 == 38) {
                    while (true) {
                        OTr = (OTr ^ 5347) >> 99;
                    }
                } else if (i5 == 201) {
                    while (true) {
                        OTr = (OTr + i4) >> 43;
                    }
                }
            }
        } else {
            if (i2 > 9093) {
                return;
            }
            if ((i3 ^ 9103) == 0) {
                while (true) {
                    int i6 = dqk;
                    int i7 = OTr;
                    if ((i7 ^ 9103) != 0) {
                        while (true) {
                            int i8 = OTr;
                            if (i8 + 117 == 42) {
                                OTr = ((i8 % 10) % 38) + i8;
                            }
                        }
                    } else {
                        int i9 = i6 + 26;
                        if (i9 != 82) {
                            if (i9 == 214) {
                                dqk = (i6 ^ 4170) + i6;
                            } else if (i9 != 335) {
                                continue;
                            }
                            dqk = (dqk + i6) >> 56;
                            if (i7 <= 9102) {
                                break;
                            }
                        } else {
                            dqk = (i6 * 24) + i6 + i6;
                        }
                    }
                }
            }
            while (true) {
                i = OTr;
                int i10 = i + 39;
                if (i10 == 5) {
                    OTr = ((i * 38) % 123) ^ 1705;
                    break;
                } else if (i10 != 200) {
                    if (i10 == 218) {
                        break;
                    } else if (i10 == 396) {
                        OTr = ((i % 125) ^ 5215) * 54;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                OTr = ((OTr ^ 2542) + i) % 121;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:18:0x0037) to fix multi-entry loop: BACK_EDGE: B:17:0x0032 -> B:18:0x0037 */
    public static void svhCHd(String str, String str2, Throwable th) {
        int i;
        if (!Log.isLoggable(str, 6) || (OTr ^ 9103) == 0) {
            return;
        }
        while (true) {
            i = OTr;
            int i2 = i + 26;
            if (i2 == 86) {
                while (true) {
                    OTr = ((OTr ^ MTPushConstants.RemoteWhat.ON_CUSTOM_MESSAGE) * 41) ^ 3636;
                }
            } else {
                if (i2 == 267) {
                    break;
                }
                if (i2 == 289) {
                    OTr = ((i % 47) * 79) % 33;
                    return;
                } else if (i2 == 413) {
                    OTr = ((i >> 50) * 124) >> 41;
                    break;
                }
            }
        }
        while (true) {
            OTr = OTr + i + i + i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void svhCHd(String str, String str2, String... strArr) {
        svhCHd(str, gqOnQv(str2, strArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void wtf(String str, String str2) {
        TMXProfilingConnections.fsw("H\u007f^t[TbjiL\u0002fx{gu\f\u0015");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void wtf(String str, String str2, String... strArr) {
        gqOnQv(TMXProfilingConnections.fsw("H\u007f^t[TbjiL\u0002fx{gu\f\u0015") + str2, strArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void zDGrpR(boolean z) {
        irCnbB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Duplicate block (B:77:0x010e) to fix multi-entry loop: BACK_EDGE: B:76:0x0106 -> B:77:0x010e */
    /* JADX WARN: Path cross not found for [B:157:?, B:151:?], limit reached: 153 */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0158 A[EDGE_INSN: B:152:0x0158->B:97:0x0158 BREAK  A[LOOP:14: B:91:0x0142->B:154:0x0142], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0158 -> B:89:0x0135). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zEHIKV(java.lang.String r7, int r8) {
        /*
            boolean r0 = aeiGEO.GVpNrs.irCnbB
            if (r0 != 0) goto L17f
            int r0 = aeiGEO.GVpNrs.dqk
            r1 = 55
            r2 = 9093(0x2385, float:1.2742E-41)
            r3 = 67
            r4 = 9102(0x238e, float:1.2755E-41)
            if (r0 > r2) goto Lc3
            int r0 = aeiGEO.GVpNrs.OTr
            if (r0 > r4) goto L46
        L14:
            int r0 = aeiGEO.GVpNrs.OTr
            int r5 = r0 + 39
            r6 = 45
            if (r5 == r6) goto L3c
            r6 = 201(0xc9, float:2.82E-43)
            if (r5 == r6) goto L33
            r6 = 274(0x112, float:3.84E-43)
            if (r5 == r6) goto L2c
            r6 = 396(0x18c, float:5.55E-43)
            if (r5 == r6) goto L29
            goto L14
        L29:
            r0 = r0 ^ 2246(0x8c6, float:3.147E-42)
            goto L30
        L2c:
            r0 = r0 ^ 3566(0xdee, float:4.997E-42)
            int r0 = r0 >> 63
        L30:
            aeiGEO.GVpNrs.OTr = r0
            goto L14
        L33:
            int r0 = r0 * 20
            r0 = r0 ^ 1023(0x3ff, float:1.434E-42)
            int r0 = r0 >> 104
            aeiGEO.GVpNrs.OTr = r0
            goto L46
        L3c:
            int r7 = aeiGEO.GVpNrs.OTr
            r7 = r7 ^ 5298(0x14b2, float:7.424E-42)
            int r7 = r7 % r3
            int r7 = r7 >> 16
            aeiGEO.GVpNrs.OTr = r7
            goto L3c
        L46:
            int r0 = aeiGEO.GVpNrs.dqk
            int r5 = r0 + 39
            r6 = 73
            if (r5 == r6) goto L8e
            r0 = 260(0x104, float:3.64E-43)
            if (r5 == r0) goto L53
            goto L46
        L53:
            int r7 = aeiGEO.GVpNrs.dqk
            int r8 = aeiGEO.GVpNrs.OTr
            r8 = r8 ^ 9103(0x238f, float:1.2756E-41)
            if (r8 == 0) goto L6b
        L5b:
            int r7 = aeiGEO.GVpNrs.OTr
            int r7 = r7 + 195
            if (r7 == r1) goto L62
            goto L5b
        L62:
            int r7 = aeiGEO.GVpNrs.OTr
            int r7 = r7 * 58
            int r7 = r7 >> 20
            aeiGEO.GVpNrs.OTr = r7
            goto L62
        L6b:
            int r7 = r7 % 78
            int r7 = r7 % 25
            int r7 = r7 * 110
            aeiGEO.GVpNrs.dqk = r7
            if (r8 == 0) goto L53
        L75:
            int r7 = aeiGEO.GVpNrs.OTr
            int r8 = r7 + 156
            if (r8 == r3) goto L80
            r0 = 227(0xe3, float:3.18E-43)
            if (r8 == r0) goto L86
            goto L75
        L80:
            int r8 = r7 * 23
            int r8 = r8 % 103
            aeiGEO.GVpNrs.OTr = r8
        L86:
            int r8 = aeiGEO.GVpNrs.OTr
            int r8 = r8 + r7
            int r8 = r8 * 2848
            aeiGEO.GVpNrs.OTr = r8
            goto L75
        L8e:
            r5 = r0 ^ 3842(0xf02, float:5.384E-42)
            int r5 = r5 + r0
            aeiGEO.GVpNrs.dqk = r5
            int r0 = aeiGEO.GVpNrs.OTr
            r0 = r0 ^ 9103(0x238f, float:1.2756E-41)
            if (r0 == 0) goto Lc3
        L99:
            int r7 = aeiGEO.GVpNrs.OTr
            int r8 = r7 + 26
            r0 = 40
            if (r8 == r0) goto Lb9
            r1 = 188(0xbc, float:2.63E-43)
            if (r8 == r1) goto Lb0
            r1 = 383(0x17f, float:5.37E-43)
            if (r8 == r1) goto Laa
            goto L99
        Laa:
            int r8 = r7 % 58
            int r8 = r8 * 114
            aeiGEO.GVpNrs.OTr = r8
        Lb0:
            int r8 = aeiGEO.GVpNrs.OTr
            int r8 = r8 % 15
            r8 = r8 ^ 2916(0xb64, float:4.086E-42)
            int r8 = r8 + r7
            aeiGEO.GVpNrs.OTr = r8
        Lb9:
            int r7 = aeiGEO.GVpNrs.OTr
            r7 = r7 ^ 1902(0x76e, float:2.665E-42)
            int r7 = r7 % r0
            int r7 = r7 * 112
            aeiGEO.GVpNrs.OTr = r7
            goto Lb9
        Lc3:
            boolean r7 = android.util.Log.isLoggable(r7, r8)
            if (r7 == 0) goto L17f
            int r7 = aeiGEO.GVpNrs.dqk
            if (r7 > r2) goto L17d
            int r7 = aeiGEO.GVpNrs.OTr
            if (r7 > r4) goto Ldf
        Ld1:
            int r7 = aeiGEO.GVpNrs.OTr
            int r8 = r7 + 65
            r0 = 42
            if (r8 == r0) goto Lda
            goto Ld1
        Lda:
            r7 = r7 ^ 2235(0x8bb, float:3.132E-42)
            int r7 = r7 * r3
            aeiGEO.GVpNrs.OTr = r7
        Ldf:
            int r7 = aeiGEO.GVpNrs.dqk
            int r8 = aeiGEO.GVpNrs.OTr
            r0 = 121(0x79, float:1.7E-43)
            if (r8 > r4) goto L118
        Le7:
            int r8 = aeiGEO.GVpNrs.OTr
            int r2 = r8 + 182
            r3 = 37
            if (r2 == r3) goto L111
            if (r2 == r0) goto L106
            r3 = 151(0x97, float:2.12E-43)
            if (r2 == r3) goto L101
            r3 = 276(0x114, float:3.87E-43)
            if (r2 == r3) goto Lfa
            goto Le7
        Lfa:
            int r8 = r8 * 18
            int r7 = r8 >> 66
            r7 = r7 ^ 1652(0x674, float:2.315E-42)
            goto L10e
        L101:
            int r2 = r8 * 374
            aeiGEO.GVpNrs.OTr = r2
            goto L111
        L106:
            int r7 = aeiGEO.GVpNrs.OTr
            int r7 = r7 % 103
            r7 = r7 ^ 2198(0x896, float:3.08E-42)
            int r7 = r7 % 63
        L10e:
            aeiGEO.GVpNrs.OTr = r7
            goto L106
        L111:
            int r2 = aeiGEO.GVpNrs.OTr
            int r2 = r2 + r8
            int r2 = r2 * 23
            aeiGEO.GVpNrs.OTr = r2
        L118:
            int r8 = r7 + 26
            r2 = 99
            if (r8 == r2) goto L160
            r2 = 287(0x11f, float:4.02E-43)
            if (r8 == r2) goto L135
            r2 = 374(0x176, float:5.24E-43)
            if (r8 == r2) goto L127
            goto Ldf
        L127:
            int r8 = aeiGEO.GVpNrs.dqk
            int r8 = r8 * 39
            int r8 = r8 % r0
            aeiGEO.GVpNrs.dqk = r8
            int r8 = aeiGEO.GVpNrs.OTr
            r8 = r8 ^ 9103(0x238f, float:1.2756E-41)
            if (r8 == 0) goto L135
            goto L142
        L135:
            int r8 = aeiGEO.GVpNrs.dqk
            int r8 = r8 >> 115
            int r8 = r8 + r7
            int r8 = r8 >> 69
            aeiGEO.GVpNrs.dqk = r8
            int r8 = aeiGEO.GVpNrs.OTr
            if (r8 > r4) goto L135
        L142:
            int r8 = aeiGEO.GVpNrs.OTr
            int r0 = r8 + 91
            r1 = 38
            if (r0 == r1) goto L158
            r1 = 128(0x80, float:1.794E-43)
            if (r0 == r1) goto L14f
            goto L142
        L14f:
            int r8 = r8 % 31
            int r8 = r8 % 27
            int r8 = r8 >> 39
            aeiGEO.GVpNrs.OTr = r8
            goto L142
        L158:
            r0 = r8 ^ 3112(0xc28, float:4.361E-42)
            int r0 = r0 + r8
            r8 = r0 ^ 4208(0x1070, float:5.897E-42)
            aeiGEO.GVpNrs.OTr = r8
            goto L135
        L160:
            int r8 = aeiGEO.GVpNrs.dqk
            int r8 = r8 + r7
            int r8 = r8 % r1
            int r8 = r8 + r7
            aeiGEO.GVpNrs.dqk = r8
            int r8 = aeiGEO.GVpNrs.OTr
            r8 = r8 ^ 9103(0x238f, float:1.2756E-41)
            if (r8 == 0) goto L160
        L16d:
            int r8 = aeiGEO.GVpNrs.OTr
            int r0 = r8 + 78
            r2 = 81
            if (r0 == r2) goto L176
            goto L16d
        L176:
            int r8 = r8 * 20
            r8 = r8 ^ 3680(0xe60, float:5.157E-42)
            aeiGEO.GVpNrs.OTr = r8
            goto L160
        L17d:
            r7 = 1
            goto L180
        L17f:
            r7 = 0
        L180:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aeiGEO.GVpNrs.zEHIKV(java.lang.String, int):boolean");
    }
}
