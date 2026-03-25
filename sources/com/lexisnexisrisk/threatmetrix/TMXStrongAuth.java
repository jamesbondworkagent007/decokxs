package com.lexisnexisrisk.threatmetrix;

import QfgSZK.GCXiNH;
import QfgSZK.ORrpqH;
import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes22.dex */
public class TMXStrongAuth {
    public static String AUTH_ACTION = null;
    public static String AUTH_CONTEXT = null;
    public static String AUTH_METHOD = null;
    public static String AUTH_PROMPT = null;
    public static String AUTH_REQUEST_ID = null;
    public static String AUTH_TITLE = null;
    static String albwKg = null;
    private static final int hLuHqv = 65534;
    private static final Map<Integer, AuthenticationCallback> irddlz;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class AuthMethod {
        public static int OGa;
        public static final AuthMethod TMX_DEVICE_PRESENCE;
        public static final AuthMethod TMX_UNKNOWN_METHOD;
        public static final AuthMethod TMX_USER_PRESENCE;
        private static final /* synthetic */ AuthMethod[] gkhjaB;
        public static int hfe;
        public final String methodName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            hfe = 2017;
            GCXiNH.OHr = 2270;
            OGa = 7428;
            TMX_UNKNOWN_METHOD = new AuthMethod(GCXiNH.fsw("I\\cS~\u007fJPC\u007fl|gl|oyq"), 0, GCXiNH.fsw("h\u007fPbDFosi\\JLN"));
            TMX_USER_PRESENCE = new AuthMethod(GCXiNH.fsw("I\\cS~bDLSxpfylfds"), 1, GCXiNH.fsw("i|CyXTsn~MQFDJM"));
            TMX_DEVICE_PRESENCE = new AuthMethod(GCXiNH.fsw("I\\cSotWWOm}sxl{bxvq"), 2, GCXiNH.fsw("i|ChNGh}iXPFYLFDS"));
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private AuthMethod(String str, int i, String str2) {
            if ((hfe ^ 2017) == 0) {
                this.methodName = str2;
            } else {
                while (hfe + 13 != 96) {
                }
                while (true) {
                    hfe = ((hfe % 51) ^ 1603) >> 39;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ AuthMethod[] gEmmrt() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            AuthMethod[] authMethodArr = new AuthMethod[3];
            authMethodArr[0] = TMX_UNKNOWN_METHOD;
            if (OGa <= 7427) {
                do {
                    i3 = OGa;
                } while (i3 + 13 != 44);
                if ((hfe ^ 2017) != 0) {
                    do {
                        i4 = hfe;
                        i5 = i4 + 65;
                        if (i5 == 65) {
                            hfe = ((i4 >> 44) + i4) >> 10;
                        } else if (i5 == 254) {
                            while (true) {
                                hfe = ((hfe % 4) % 108) ^ 2574;
                            }
                        }
                    } while (i5 != 280);
                    while (true) {
                        hfe = ((hfe + i4) % 16) * 29;
                    }
                }
                OGa = ((i3 >> 105) * 67) ^ 2225;
            }
            authMethodArr[1] = TMX_USER_PRESENCE;
            if (hfe > 2016) {
                authMethodArr[2] = TMX_DEVICE_PRESENCE;
                return authMethodArr;
            }
            do {
                i = hfe;
                i2 = i + 39;
                if (i2 == 73) {
                    while (true) {
                        hfe = (hfe * 104) + i;
                    }
                }
            } while (i2 != 175);
            while (true) {
                hfe = (hfe + i) % 8;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static AuthMethod valueOf(String str) {
            return (AuthMethod) Enum.valueOf(AuthMethod.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static AuthMethod[] values() {
            return (AuthMethod[]) gkhjaB.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:13:0x0028) to fix multi-entry loop: BACK_EDGE: B:12:0x0020 -> B:13:0x0028 */
        /* JADX DEBUG: Duplicate block (B:15:0x0033) to fix multi-entry loop: BACK_EDGE: B:15:0x0033 -> B:16:0x0036 */
        /* JADX DEBUG: Duplicate block (B:42:0x0090) to fix multi-entry loop: BACK_EDGE: B:42:0x0090 -> B:43:0x0092 */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        
            com.lexisnexisrisk.threatmetrix.TMXStrongAuth.AuthMethod.hfe = (com.lexisnexisrisk.threatmetrix.TMXStrongAuth.AuthMethod.hfe % 33) + r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static AuthMethod zsXlph(String str) {
            int i;
            AuthMethod[] authMethodArrValues = values();
            int length = authMethodArrValues.length;
            if ((hfe ^ 2017) == 0) {
                int i2 = 0;
                while (i2 < length) {
                    if ((hfe ^ 2017) != 0) {
                        while (true) {
                            int i3 = hfe;
                            int i4 = i3 + 91;
                            if (i4 == 91) {
                                break;
                            }
                            if (i4 == 96) {
                                hfe = ((i3 * 120) % 79) ^ 4676;
                            }
                        }
                        while (true) {
                            hfe = (hfe ^ 1607) % 92;
                        }
                    } else {
                        AuthMethod authMethod = authMethodArrValues[i2];
                        if (str.equals(authMethod.methodName)) {
                            return authMethod;
                        }
                        i2++;
                        if (OGa <= 7427) {
                            if ((hfe ^ 2017) != 0) {
                                while (true) {
                                    int i5 = hfe;
                                    int i6 = i5 + 39;
                                    if (i6 == 86) {
                                        hfe = (i5 % 12) >> 101;
                                    } else {
                                        if (i6 == 231) {
                                            hfe = (i5 ^ 1962) % 72;
                                            break;
                                        }
                                        if (i6 == 342) {
                                            break;
                                        }
                                    }
                                }
                                while (true) {
                                    hfe = (hfe >> CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA) * 96;
                                }
                            } else {
                                do {
                                    i = OGa;
                                } while (i + 39 != 86);
                                OGa = i + i + i;
                            }
                        }
                    }
                }
                return TMX_UNKNOWN_METHOD;
            }
            while (true) {
                int i7 = hfe;
                int i8 = i7 + 13;
                if (i8 == 53) {
                    hfe = ((i7 + i7) * 26) + i7;
                    break;
                }
                if (i8 != 79) {
                    if (i8 == 120) {
                        break;
                    }
                    if (i8 == 229) {
                        hfe ^= 2074;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                hfe = (hfe ^ 3589) >> 22;
                hfe ^= 2074;
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class AuthParamResult {
        public static int CLF = 3910;
        public static int _ML = 4129;
        public String QIfFad;
        public final AuthResult vklRO;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AuthParamResult(AuthResult authResult, String str) {
            int i;
            if (_ML > 4128) {
                this.vklRO = authResult;
                this.QIfFad = str;
                return;
            }
            while (true) {
                int i2 = _ML;
                int i3 = i2 + 13;
                if (i3 == 32) {
                    i = (i2 * 40) >> AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID;
                } else if (i3 == 173) {
                    i = ((i2 % 90) >> 76) % 107;
                }
                _ML = i;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class AuthResult {
        public static final AuthResult ALREADY_REGISTERED = new AuthResult("ALREADY_REGISTERED", 0, "ALREADY_REGISTERED", TMXStatusCode.TMX_StrongAuth_AlreadyRegistered);
        public static final AuthResult CONTEXT_NOT_FOUND = new AuthResult("CONTEXT_NOT_FOUND", 1, "CONTEXT_NOT_FOUND", TMXStatusCode.TMX_StrongAuth_UserNotFound);
        public static final AuthResult DEREGISTERED;
        public static final AuthResult DEREGISTRATION_FAILED;
        public static final AuthResult MISSING_FUNCTION;
        public static final AuthResult MISSING_PARAMETER;
        public static final AuthResult NOT_SUPPORTED;
        public static final AuthResult REGISTERED;
        public static final AuthResult REGISTRATION_CANCELLED;
        public static final AuthResult REGISTRATION_FAILED;
        public static final AuthResult STEPUP_CANCELLED;
        public static final AuthResult STEPUP_COMPLETE;
        public static final AuthResult STEPUP_FAILED;
        public static int cnI = 9560;
        public static int ftd = 9420;
        private static final /* synthetic */ AuthResult[] gkhjaB;
        public final TMXStatusCode UvUzrV;
        public final String hkMEAD;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            TMXStatusCode tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Failed;
            DEREGISTRATION_FAILED = new AuthResult("DEREGISTRATION_FAILED", 2, "DEREGISTRATION_FAILED", tMXStatusCode);
            TMXStatusCode tMXStatusCode2 = TMXStatusCode.TMX_OK;
            DEREGISTERED = new AuthResult("DEREGISTERED", 3, "DEREGISTERED", tMXStatusCode2);
            TMXStatusCode tMXStatusCode3 = TMXStatusCode.TMX_Internal_Error;
            MISSING_FUNCTION = new AuthResult("MISSING_FUNCTION", 4, "MISSING_FUNCTION", tMXStatusCode3);
            MISSING_PARAMETER = new AuthResult("MISSING_PARAMETER", 5, "MISSING_PARAMETER", tMXStatusCode3);
            NOT_SUPPORTED = new AuthResult("NOT_SUPPORTED", 6, "NOT_SUPPORTED", TMXStatusCode.TMX_StrongAuth_Unsupported);
            REGISTRATION_FAILED = new AuthResult("REGISTRATION_FAILED", 7, "REGISTRATION_FAILED", tMXStatusCode);
            TMXStatusCode tMXStatusCode4 = TMXStatusCode.TMX_StrongAuth_Cancelled;
            REGISTRATION_CANCELLED = new AuthResult("REGISTRATION_CANCELLED", 8, "REGISTRATION_CANCELLED", tMXStatusCode4);
            REGISTERED = new AuthResult("REGISTERED", 9, "REGISTERED", tMXStatusCode2);
            STEPUP_CANCELLED = new AuthResult("STEPUP_CANCELLED", 10, "STEPUP_CANCELLED", tMXStatusCode4);
            STEPUP_COMPLETE = new AuthResult("STEPUP_COMPLETE", 11, "STEPUP_COMPLETE", tMXStatusCode2);
            STEPUP_FAILED = new AuthResult("STEPUP_FAILED", 12, "STEPUP_FAILED", tMXStatusCode);
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private AuthResult(String str, int i, String str2, TMXStatusCode tMXStatusCode) {
            int i2;
            if (cnI <= 9559) {
                do {
                    i2 = cnI;
                } while (i2 + 13 != 86);
                cnI = ((i2 * 31) ^ 1867) % WalletImportError.ERROR_CODE_AA_CREATE_KEY;
            }
            this.hkMEAD = str2;
            this.UvUzrV = tMXStatusCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ AuthResult[] gEmmrt() {
            int i;
            AuthResult[] authResultArr = new AuthResult[13];
            authResultArr[0] = ALREADY_REGISTERED;
            authResultArr[1] = CONTEXT_NOT_FOUND;
            authResultArr[2] = DEREGISTRATION_FAILED;
            authResultArr[3] = DEREGISTERED;
            authResultArr[4] = MISSING_FUNCTION;
            authResultArr[5] = MISSING_PARAMETER;
            if ((cnI ^ 9560) == 0) {
                authResultArr[6] = NOT_SUPPORTED;
                authResultArr[7] = REGISTRATION_FAILED;
                authResultArr[8] = REGISTRATION_CANCELLED;
                authResultArr[9] = REGISTERED;
                authResultArr[10] = STEPUP_CANCELLED;
                authResultArr[11] = STEPUP_COMPLETE;
                authResultArr[12] = STEPUP_FAILED;
                return authResultArr;
            }
            do {
                i = cnI;
            } while (i + 13 != 38);
            while (true) {
                cnI = (cnI * 62) + i;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static AuthResult valueOf(String str) {
            return (AuthResult) Enum.valueOf(AuthResult.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static AuthResult[] values() {
            return (AuthResult[]) gkhjaB.clone();
        }
    }

    public static class AuthenticationCallback implements StrongAuthCallback {
        private final Activity hsEvYY;
        private int zZcESg = 0;
        private final CountDownLatch qQFIv = new CountDownLatch(1);
        private int fwjRl = (int) (Math.random() * 65534.0d);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AuthenticationCallback(Activity activity) {
            this.hsEvYY = activity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public void DVqlkc(int i) {
            this.zZcESg = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public CountDownLatch bdhNW() {
            return this.qQFIv;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public void ffwWJs(int i) {
            this.fwjRl = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.lexisnexisrisk.threatmetrix.TMXStrongAuth.StrongAuthCallback
        public int callIntent(@Nullable Intent intent) {
            try {
                this.hsEvYY.startActivityForResult(intent, this.fwjRl);
                this.qQFIv.await();
                return this.zZcESg;
            } catch (InterruptedException e) {
                ORrpqH.uzCIH().seuMaA(e);
                return 0;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getRequestCode() {
            return this.fwjRl;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AuthenticationStatus {
        public static int Khg = 7180;
        public static final AuthenticationStatus TMX_STRONG_AUTH_CANCELLED;
        public static final AuthenticationStatus TMX_STRONG_AUTH_FAILED;
        public static final AuthenticationStatus TMX_STRONG_AUTH_NOT_POSSIBLE;
        public static final AuthenticationStatus TMX_STRONG_AUTH_OK;
        public static int UDx;
        private static final /* synthetic */ AuthenticationStatus[] gkhjaB;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            UDx = 3109;
            GCXiNH.OHr = 2270;
            TMX_STRONG_AUTH_NOT_POSSIBLE = new AuthenticationStatus(GCXiNH.fsw("I\\cSxeSQBo}b\u007f}`xxz`lb~c|w\u007fp~"), 0);
            TMX_STRONG_AUTH_OK = new AuthenticationStatus(GCXiNH.fsw("I\\cSxeSQBo}b\u007f}`xy~"), 1);
            TMX_STRONG_AUTH_FAILED = new AuthenticationStatus(GCXiNH.fsw("I\\cSxeSQBo}b\u007f}`xpt}\u007fwu"), 2);
            TMX_STRONG_AUTH_CANCELLED = new AuthenticationStatus(GCXiNH.fsw("I\\cSxeSQBo}b\u007f}`xutzpw}|jz"), 3);
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private AuthenticationStatus(String str, int i) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static /* synthetic */ AuthenticationStatus[] gEmmrt() {
            int i;
            int i2;
            AuthenticationStatus[] authenticationStatusArr = new AuthenticationStatus[4];
            authenticationStatusArr[0] = TMX_STRONG_AUTH_NOT_POSSIBLE;
            AuthenticationStatus authenticationStatus = TMX_STRONG_AUTH_OK;
            if ((Khg ^ 7180) != 0) {
                while (true) {
                    i = Khg;
                    int i3 = i + 13;
                    if (i3 != 62) {
                        if (i3 == 250) {
                            break;
                        }
                        if (i3 == 348) {
                            Khg = i * 1264;
                        } else if (i3 == 459) {
                            i2 = (i * 2) % 102;
                            Khg = i2;
                        }
                    }
                    i2 = (Khg % 61) >> 125;
                    Khg = i2;
                }
                Khg = ((i ^ 3112) % 107) ^ 2090;
            }
            authenticationStatusArr[1] = authenticationStatus;
            authenticationStatusArr[2] = TMX_STRONG_AUTH_FAILED;
            authenticationStatusArr[3] = TMX_STRONG_AUTH_CANCELLED;
            return authenticationStatusArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static AuthenticationStatus valueOf(String str) {
            return (AuthenticationStatus) Enum.valueOf(AuthenticationStatus.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static AuthenticationStatus[] values() {
            return (AuthenticationStatus[]) gkhjaB.clone();
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface StrongAuthCallback {
        int callIntent(Intent intent);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StrongAuthConfiguration {
        public static int kFi = 8754;
        public static int uNv = 4928;
        public String OtYwTu;
        public String QPiTfK;
        public String iWqizr;
        public String sHUizq;
        public String sYnYSE;
        public String sdpCMu;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StrongAuthConfiguration() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:10:0x0021) to fix multi-entry loop: BACK_EDGE: B:9:0x001a -> B:10:0x0021 */
        public StrongAuthConfiguration(String str, String str2, String str3, String str4, String str5, String str6) {
            int i;
            this.QPiTfK = str2;
            this.OtYwTu = str6;
            if (uNv > 4927) {
                this.iWqizr = str4;
                this.sHUizq = str3;
                this.sYnYSE = str;
                this.sdpCMu = str5;
                return;
            }
            while (true) {
                i = uNv;
                int i2 = i + 13;
                if (i2 != 40) {
                    if (i2 == 137) {
                        uNv *= 8932;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                uNv = (uNv * WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST) + i;
                uNv *= 8932;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StrongAuthConfiguration setAuthAction(String str) {
            this.sYnYSE = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StrongAuthConfiguration setAuthContext(String str) {
            this.iWqizr = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StrongAuthConfiguration setAuthMethod(String str) {
            this.QPiTfK = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StrongAuthConfiguration setAuthPrompt(String str) {
            this.OtYwTu = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StrongAuthConfiguration setAuthRequestId(String str) {
            this.sHUizq = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StrongAuthConfiguration setAuthTitle(String str) {
            this.sdpCMu = str;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
        GCXiNH.OHr = 2270;
        AUTH_METHOD = GCXiNH.fsw("|dOdt\\djdGF");
        AUTH_ACTION = GCXiNH.fsw("|dOdtPbjeGL");
        AUTH_REQUEST_ID = GCXiNH.fsw("|dOdtCdoyMQWu@L");
        AUTH_CONTEXT = GCXiNH.fsw("|dOdtRnpxMZW");
        AUTH_PROMPT = GCXiNH.fsw("|dOdtAsqaXV");
        AUTH_TITLE = GCXiNH.fsw("ixO`N");
        albwKg = GCXiNH.fsw("ne^|^A");
        irddlz = new HashMap(2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TMXStrongAuth() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AuthParamResult generateAuthParamResult(AuthResult authResult, String str) {
        return new AuthParamResult(authResult, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static AuthenticationCallback newAuthenticationCallback(Activity activity) {
        AuthenticationCallback authenticationCallback = new AuthenticationCallback(activity);
        int requestCode = authenticationCallback.getRequestCode();
        Map<Integer, AuthenticationCallback> map = irddlz;
        synchronized (map) {
            if (map.get(Integer.valueOf(requestCode)) != null) {
                authenticationCallback.ffwWJs((int) (Math.random() * 65534.0d));
            }
            map.put(Integer.valueOf(authenticationCallback.getRequestCode()), authenticationCallback);
        }
        return authenticationCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void processAuthenticationResult(int i, int i2) {
        Map<Integer, AuthenticationCallback> map = irddlz;
        synchronized (map) {
            AuthenticationCallback authenticationCallback = map.get(Integer.valueOf(i));
            if (authenticationCallback != null) {
                authenticationCallback.DVqlkc(i2);
                authenticationCallback.bdhNW().countDown();
            }
            map.remove(Integer.valueOf(i));
        }
    }
}
