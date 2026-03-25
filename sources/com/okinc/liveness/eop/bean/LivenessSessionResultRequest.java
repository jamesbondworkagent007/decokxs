package com.okinc.liveness.eop.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LivenessSessionResultRequest {
    public static final int $stable = 8;
    private String encryptionData;
    private String extData;
    private final String extMsg;
    private String faceSessionId;
    private String riskVendorToken;
    private String riskVendorTokenPuk;
    private String riskVendorTokenSignature;
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.extMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.encryptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.extData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.riskVendorToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.riskVendorTokenSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.riskVendorTokenPuk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessSessionResultRequest copy(String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new LivenessSessionResultRequest(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivenessSessionResultRequest)) {
            return false;
        }
        LivenessSessionResultRequest livenessSessionResultRequest = (LivenessSessionResultRequest) obj;
        return Intrinsics.EZpvd((Object) this.faceSessionId, (Object) livenessSessionResultRequest.faceSessionId) && Intrinsics.EZpvd((Object) this.sessionId, (Object) livenessSessionResultRequest.sessionId) && Intrinsics.EZpvd((Object) this.extMsg, (Object) livenessSessionResultRequest.extMsg) && Intrinsics.EZpvd((Object) this.encryptionData, (Object) livenessSessionResultRequest.encryptionData) && Intrinsics.EZpvd((Object) this.extData, (Object) livenessSessionResultRequest.extData) && Intrinsics.EZpvd((Object) this.riskVendorToken, (Object) livenessSessionResultRequest.riskVendorToken) && Intrinsics.EZpvd((Object) this.riskVendorTokenSignature, (Object) livenessSessionResultRequest.riskVendorTokenSignature) && Intrinsics.EZpvd((Object) this.riskVendorTokenPuk, (Object) livenessSessionResultRequest.riskVendorTokenPuk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptionData() {
        return this.encryptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtData() {
        return this.extData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtMsg() {
        return this.extMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFaceSessionId() {
        return this.faceSessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskVendorToken() {
        return this.riskVendorToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskVendorTokenPuk() {
        return this.riskVendorTokenPuk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskVendorTokenSignature() {
        return this.riskVendorTokenSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.faceSessionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.sessionId.hashCode();
        String str2 = this.extMsg;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.encryptionData;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.extData;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.riskVendorToken;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.riskVendorTokenSignature;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.riskVendorTokenPuk;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEncryptionData(String str) {
        this.encryptionData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtData(String str) {
        this.extData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFaceSessionId(String str) {
        this.faceSessionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskVendorToken(String str) {
        this.riskVendorToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskVendorTokenPuk(String str) {
        this.riskVendorTokenPuk = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskVendorTokenSignature(String str) {
        this.riskVendorTokenSignature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessSessionResultRequest(faceSessionId=" + this.faceSessionId + ", sessionId=" + this.sessionId + ", extMsg=" + this.extMsg + ", encryptionData=" + this.encryptionData + ", extData=" + this.extData + ", riskVendorToken=" + this.riskVendorToken + ", riskVendorTokenSignature=" + this.riskVendorTokenSignature + ", riskVendorTokenPuk=" + this.riskVendorTokenPuk + ")";
    }

    public LivenessSessionResultRequest(String str, @NotNull String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.faceSessionId = str;
        this.sessionId = str2;
        this.extMsg = str3;
        this.encryptionData = str4;
        this.extData = str5;
        this.riskVendorToken = str6;
        this.riskVendorTokenSignature = str7;
        this.riskVendorTokenPuk = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:41) call: com.okinc.liveness.eop.bean.LivenessSessionResultRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LivenessSessionResultRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8);
    }
}
