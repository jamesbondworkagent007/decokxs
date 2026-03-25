package com.lexisnexisrisk.threatmetrix;

import QfgSZK.GCXiNH;
import com.engagelab.privates.push.constants.MTPushConstants;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface TMXProfilingConnectionsInterface {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class HttpMethod {
        public static final HttpMethod GET;
        public static final HttpMethod POST;
        public static int RgP;
        private static final /* synthetic */ HttpMethod[] gkhjaB;
        public static int uKu;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            GCXiNH.Cwg = MTPushConstants.RemoteWhat.TAG_UPDATE;
            RgP = 5343;
            GCXiNH.OHr = 2270;
            uKu = 6547;
            GET = new HttpMethod(GCXiNH.fsw("ZTo"), 0);
            POST = new HttpMethod(GCXiNH.fsw("M^hX"), 1);
            gkhjaB = gEmmrt();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private HttpMethod(String str, int i) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Duplicate block (B:11:0x0024) to fix multi-entry loop: BACK_EDGE: B:10:0x001c -> B:11:0x0024 */
        private static /* synthetic */ HttpMethod[] gEmmrt() {
            HttpMethod[] httpMethodArr = new HttpMethod[2];
            HttpMethod httpMethod = GET;
            if (RgP > 5342) {
                httpMethodArr[0] = httpMethod;
                httpMethodArr[1] = POST;
                return httpMethodArr;
            }
            while (true) {
                int i = RgP;
                int i2 = i + 13;
                if (i2 != 65) {
                    if (i2 == 231) {
                        RgP = (i + i) ^ 3322;
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                RgP = ((RgP * 96) % 38) % 100;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static HttpMethod valueOf(String str) {
            return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static HttpMethod[] values() {
            return (HttpMethod[]) gkhjaB.clone();
        }
    }

    public interface TMXCallback {
        boolean onComplete(TMXHttpResponseCode tMXHttpResponseCode, InputStream inputStream);
    }

    public static class TMXHttpResponseCode extends TMXSocketResponseCode {
        public static int EIr = 5218;
        public static final int HttpResponseCRLError = -15;
        public static final int HttpResponseCertPathBuilderError = -12;
        public static final int HttpResponseCertPathValidatorError = -13;
        public static final int HttpResponseCertStoreError = -14;
        public static final int HttpResponseCertificateEncodingError = -8;
        public static final int HttpResponseCertificateError = -7;
        public static final int HttpResponseCertificateExpired = -9;
        public static final int HttpResponseCertificateMismatch = -6;
        public static final int HttpResponseCertificateNotYetValid = -10;
        public static final int HttpResponseCertificateParsingError = -11;
        public static final int HttpResponseConnectionError = -1;
        public static final int HttpResponseHostNotFoundError = -3;
        public static final int HttpResponseHostVerificationError = -5;
        public static final int HttpResponseNetworkTimeoutError = -4;
        public static final int HttpResponseNotYet = -2;
        public static final int HttpResponseOK = 200;
        public static int uBZ = 7397;
        private int gVrqTV;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TMXHttpResponseCode(int i) {
            super();
            this.gVrqTV = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getHttpResponseCode() {
            return this.gVrqTV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setHttpResponseCode(int i) {
            this.gVrqTV = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00ef A[LOOP:15: B:67:0x00ef->B:137:?, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x010f A[LOOP:13: B:73:0x010f->B:132:0x010f, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0139 A[LOOP:17: B:82:0x0139->B:141:?, LOOP_START] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00ed -> B:71:0x0100). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean succeeded() {
            /*
                r5 = this;
                int r0 = r5.gVrqTV
                r1 = 200(0xc8, float:2.8E-43)
                r2 = 15
                r3 = 7396(0x1ce4, float:1.0364E-41)
                if (r0 == r1) goto La1
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                r1 = r1 ^ 5218(0x1462, float:7.312E-42)
                if (r1 == 0) goto L99
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r1 = 62
                if (r0 > r3) goto L3f
            L16:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r3 = r0 + 117
                r4 = 72
                if (r3 == r4) goto L38
                r4 = 138(0x8a, float:1.93E-43)
                if (r3 == r4) goto L30
                r4 = 144(0x90, float:2.02E-43)
                if (r3 == r4) goto L27
                goto L16
            L27:
                int r2 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r2 = r2 * r1
                int r2 = r2 >> 92
                int r2 = r2 + r0
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r2
                goto L27
            L30:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r1 = 129(0x81, float:1.81E-43)
                int r0 = r0 >> r1
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
                goto L30
            L38:
                int r3 = r0 % 77
                int r3 = r3 % r2
                int r3 = r3 + r0
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r3
                goto L16
            L3f:
                int r4 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                int r0 = r4 + 52
                r2 = 93
                if (r0 == r2) goto L74
                r2 = 287(0x11f, float:4.02E-43)
                if (r0 == r2) goto L4c
                goto L3f
            L4c:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                int r0 = r0 + r4
                int r0 = r0 * 66
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr = r0
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                if (r0 > r3) goto L4c
            L57:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r1 = r0 + 143
                r2 = 81
                if (r1 == r2) goto L6d
                r2 = 86
                if (r1 == r2) goto L64
                goto L57
            L64:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r1 = r1 + r0
                r1 = r1 ^ 4228(0x1084, float:5.925E-42)
                int r1 = r1 + r0
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r1
                goto L64
            L6d:
                r0 = r0 ^ 278(0x116, float:3.9E-43)
                int r0 = r0 % 103
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
                goto L4c
            L74:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                int r0 = r0 % 89
                int r0 = r0 + r4
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr = r0
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r0 = r0 ^ 7397(0x1ce5, float:1.0365E-41)
                if (r0 == 0) goto L74
            L81:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r2 = r0 + 130
                r3 = 33
                if (r2 == r3) goto L92
                if (r2 == r1) goto L8c
                goto L81
            L8c:
                int r0 = r0 >> 4
                int r0 = r0 % 101
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
            L92:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r0 = r0 ^ 5022(0x139e, float:7.037E-42)
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
                goto L74
            L99:
                r1 = 204(0xcc, float:2.86E-43)
                if (r0 != r1) goto L9e
                goto La1
            L9e:
                r0 = 0
                goto L153
            La1:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                r1 = 5217(0x1461, float:7.31E-42)
                if (r0 > r1) goto L152
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                if (r0 > r3) goto Ld3
            Lab:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r1 = r0 + 65
                r2 = 96
                if (r1 == r2) goto Lcc
                r2 = 218(0xda, float:3.05E-43)
                if (r1 == r2) goto Lbc
                r0 = 295(0x127, float:4.13E-43)
                if (r1 == r0) goto Lc2
                goto Lab
            Lbc:
                int r1 = r0 % 91
                int r1 = r1 + r0
                int r1 = r1 + r0
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r1
            Lc2:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r1 = 198(0xc6, float:2.77E-43)
                int r0 = r0 >> r1
                int r0 = r0 * 92
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
                goto Lc2
            Lcc:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r0 = r0 ^ 634(0x27a, float:8.88E-43)
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
                goto Lcc
            Ld3:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                int r1 = r0 + 39
                if (r1 == r2) goto Le2
                r4 = 59
                if (r1 == r4) goto L12b
                r4 = 188(0xbc, float:2.63E-43)
                if (r1 == r4) goto L100
                goto Ld3
            Le2:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                int r1 = r1 + r0
                int r1 = r1 % 5
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr = r1
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r1 = r1 ^ 7397(0x1ce5, float:1.0365E-41)
                if (r1 == 0) goto L100
            Lef:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r0 = r1 + 104
                r2 = 63
                if (r0 == r2) goto Lf8
                goto Lef
            Lf8:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r0 = r0 + r1
                int r0 = r0 * 56
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
                goto Lf8
            L100:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                int r1 = r1 * 50
                int r1 = r1 + r0
                int r1 = r1 >> 110
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr = r1
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                r1 = r1 ^ 7397(0x1ce5, float:1.0365E-41)
                if (r1 == 0) goto L12b
            L10f:
                int r0 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r1 = r0 + 91
                r2 = 8
                if (r1 == r2) goto L124
                r2 = 192(0xc0, float:2.69E-43)
                if (r1 == r2) goto L11c
                goto L10f
            L11c:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r1 = r1 + r0
                r1 = r1 ^ 1157(0x485, float:1.621E-42)
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r1
                goto L11c
            L124:
                int r0 = r0 >> 9
                int r0 = r0 * 94
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r0
                goto L10f
            L12b:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr
                int r1 = r1 % 126
                int r1 = r1 >> 90
                int r1 = r1 % 67
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.EIr = r1
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                if (r1 > r3) goto Le2
            L139:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r4 = r1 + 78
                if (r4 == r2) goto L144
                r1 = 120(0x78, float:1.68E-43)
                if (r4 == r1) goto L149
                goto L139
            L144:
                int r1 = r1 + r1
                int r1 = r1 * 103
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r1
            L149:
                int r1 = com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ
                int r1 = r1 >> 106
                r1 = r1 ^ 2361(0x939, float:3.308E-42)
                com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.uBZ = r1
                goto Le2
            L152:
                r0 = 1
            L153:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.TMXProfilingConnectionsInterface.TMXHttpResponseCode.succeeded():boolean");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return String.valueOf(this.gVrqTV);
        }
    }

    public static class TMXSocketResponseCode {
        public static final int ResponseIOException = -22;
        public static final int ResponseIllegalArgumentException = -23;
        public static final int ResponseOk = -20;
        public static final int ResponseUnknownHost = -21;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TMXSocketResponseCode() {
        }
    }

    void cancelProfiling();

    void closeSocket(String str, int i);

    void httpRequest(HttpMethod httpMethod, String str, Map<String, String> map, byte[] bArr, TMXCallback tMXCallback);

    void resolveHostByName(String str);

    void sendSocketRequest(String str, int i, byte[] bArr, boolean z, TMXCallback tMXCallback);
}
