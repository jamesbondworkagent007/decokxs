package com.keystone.module;

import com.keystone.sdk.KeystoneSolanaSDK;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SolSignRequest {
    private final String address;
    private final String origin;
    private final String path;
    private final String requestId;
    private final String signData;
    private final KeystoneSolanaSDK.SignType signType;
    private final String xfp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SolSignRequest copy$default(SolSignRequest solSignRequest, String str, String str2, String str3, String str4, String str5, String str6, KeystoneSolanaSDK.SignType signType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = solSignRequest.signData;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = solSignRequest.path;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = solSignRequest.xfp;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = solSignRequest.address;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = solSignRequest.origin;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            signType = solSignRequest.signType;
        }
        return solSignRequest.copy(str, str7, str8, str9, str10, str11, signType);
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
    public final String component3() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSolanaSDK.SignType component7() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull KeystoneSolanaSDK.SignType signType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(signType, "");
        return new SolSignRequest(str, str2, str3, str4, str5, str6, signType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SolSignRequest)) {
            return false;
        }
        SolSignRequest solSignRequest = (SolSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) solSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) solSignRequest.signData) && Intrinsics.EZpvd((Object) this.path, (Object) solSignRequest.path) && Intrinsics.EZpvd((Object) this.xfp, (Object) solSignRequest.xfp) && Intrinsics.EZpvd((Object) this.address, (Object) solSignRequest.address) && Intrinsics.EZpvd((Object) this.origin, (Object) solSignRequest.origin) && this.signType == solSignRequest.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPath() {
        return this.path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignData() {
        return this.signData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeystoneSolanaSDK.SignType getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXfp() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.requestId.hashCode() * 31) + this.signData.hashCode()) * 31) + this.path.hashCode()) * 31) + this.xfp.hashCode()) * 31) + this.address.hashCode()) * 31) + this.origin.hashCode()) * 31) + this.signType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", path=" + this.path + ", xfp=" + this.xfp + ", address=" + this.address + ", origin=" + this.origin + ", signType=" + this.signType + ')';
    }

    public SolSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull KeystoneSolanaSDK.SignType signType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(signType, "");
        this.requestId = str;
        this.signData = str2;
        this.path = str3;
        this.xfp = str4;
        this.address = str5;
        this.origin = str6;
        this.signType = signType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (r17v0 com.keystone.sdk.KeystoneSolanaSDK$SignType)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.keystone.sdk.KeystoneSolanaSDK$SignType):void (m)] (LINE:5) call: com.keystone.module.SolSignRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.keystone.sdk.KeystoneSolanaSDK$SignType):void type: THIS */
    public /* synthetic */ SolSignRequest(String str, String str2, String str3, String str4, String str5, String str6, KeystoneSolanaSDK.SignType signType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, signType);
    }
}
