package com.keystone.module;

import com.keystone.sdk.KeystoneArweaveSDK;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ArweaveSignRequest {
    private final String account;
    private final String masterFingerprint;
    private final String origin;
    private final String requestId;
    private final KeystoneArweaveSDK.SaltLen saltLen;
    private final String signData;
    private final KeystoneArweaveSDK.SignType signType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ArweaveSignRequest copy$default(ArweaveSignRequest arweaveSignRequest, String str, String str2, KeystoneArweaveSDK.SignType signType, KeystoneArweaveSDK.SaltLen saltLen, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = arweaveSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = arweaveSignRequest.signData;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            signType = arweaveSignRequest.signType;
        }
        KeystoneArweaveSDK.SignType signType2 = signType;
        if ((i & 8) != 0) {
            saltLen = arweaveSignRequest.saltLen;
        }
        KeystoneArweaveSDK.SaltLen saltLen2 = saltLen;
        if ((i & 16) != 0) {
            str3 = arweaveSignRequest.masterFingerprint;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = arweaveSignRequest.account;
        }
        String str8 = str4;
        if ((i & 64) != 0) {
            str5 = arweaveSignRequest.origin;
        }
        return arweaveSignRequest.copy(str, str6, signType2, saltLen2, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneArweaveSDK.SignType component3() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneArweaveSDK.SaltLen component4() {
        return this.saltLen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArweaveSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull KeystoneArweaveSDK.SignType signType, @NotNull KeystoneArweaveSDK.SaltLen saltLen, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signType, "");
        Intrinsics.checkNotNullParameter(saltLen, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ArweaveSignRequest(str, str2, signType, saltLen, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArweaveSignRequest)) {
            return false;
        }
        ArweaveSignRequest arweaveSignRequest = (ArweaveSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) arweaveSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) arweaveSignRequest.signData) && this.signType == arweaveSignRequest.signType && this.saltLen == arweaveSignRequest.saltLen && Intrinsics.EZpvd((Object) this.masterFingerprint, (Object) arweaveSignRequest.masterFingerprint) && Intrinsics.EZpvd((Object) this.account, (Object) arweaveSignRequest.account) && Intrinsics.EZpvd((Object) this.origin, (Object) arweaveSignRequest.origin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterFingerprint() {
        return this.masterFingerprint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneArweaveSDK.SaltLen getSaltLen() {
        return this.saltLen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneArweaveSDK.SignType getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.signType.hashCode()) * 31) + this.saltLen.hashCode()) * 31) + this.masterFingerprint.hashCode()) * 31) + this.account.hashCode()) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ArweaveSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", signType=" + this.signType + ", saltLen=" + this.saltLen + ", masterFingerprint=" + this.masterFingerprint + ", account=" + this.account + ", origin=" + this.origin + ')';
    }

    public ArweaveSignRequest(@NotNull String str, @NotNull String str2, @NotNull KeystoneArweaveSDK.SignType signType, @NotNull KeystoneArweaveSDK.SaltLen saltLen, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(signType, "");
        Intrinsics.checkNotNullParameter(saltLen, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.requestId = str;
        this.signData = str2;
        this.signType = signType;
        this.saltLen = saltLen;
        this.masterFingerprint = str3;
        this.account = str4;
        this.origin = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 com.keystone.sdk.KeystoneArweaveSDK$SignType)
  (r14v0 com.keystone.sdk.KeystoneArweaveSDK$SaltLen)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneArweaveSDK$SignType, com.keystone.sdk.KeystoneArweaveSDK$SaltLen, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:5) call: com.keystone.module.ArweaveSignRequest.<init>(java.lang.String, java.lang.String, com.keystone.sdk.KeystoneArweaveSDK$SignType, com.keystone.sdk.KeystoneArweaveSDK$SaltLen, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ArweaveSignRequest(String str, String str2, KeystoneArweaveSDK.SignType signType, KeystoneArweaveSDK.SaltLen saltLen, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, signType, saltLen, str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5);
    }
}
