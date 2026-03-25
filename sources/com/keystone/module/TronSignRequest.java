package com.keystone.module;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TronSignRequest {
    private final String origin;
    private final String path;
    private final String requestId;
    private final String signData;
    private final TokenInfo tokenInfo;
    private final String xfp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TronSignRequest copy$default(TronSignRequest tronSignRequest, String str, String str2, String str3, String str4, TokenInfo tokenInfo, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tronSignRequest.requestId;
        }
        if ((i & 2) != 0) {
            str2 = tronSignRequest.signData;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = tronSignRequest.path;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = tronSignRequest.xfp;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            tokenInfo = tronSignRequest.tokenInfo;
        }
        TokenInfo tokenInfo2 = tokenInfo;
        if ((i & 32) != 0) {
            str5 = tronSignRequest.origin;
        }
        return tronSignRequest.copy(str, str6, str7, str8, tokenInfo2, str5);
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
    public final TokenInfo component5() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TronSignRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, TokenInfo tokenInfo, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TronSignRequest(str, str2, str3, str4, tokenInfo, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TronSignRequest)) {
            return false;
        }
        TronSignRequest tronSignRequest = (TronSignRequest) obj;
        return Intrinsics.EZpvd((Object) this.requestId, (Object) tronSignRequest.requestId) && Intrinsics.EZpvd((Object) this.signData, (Object) tronSignRequest.signData) && Intrinsics.EZpvd((Object) this.path, (Object) tronSignRequest.path) && Intrinsics.EZpvd((Object) this.xfp, (Object) tronSignRequest.xfp) && Intrinsics.EZpvd(this.tokenInfo, tronSignRequest.tokenInfo) && Intrinsics.EZpvd((Object) this.origin, (Object) tronSignRequest.origin);
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
    public final TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getXfp() {
        return this.xfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.requestId.hashCode();
        int iHashCode2 = this.signData.hashCode();
        int iHashCode3 = this.path.hashCode();
        int iHashCode4 = this.xfp.hashCode();
        TokenInfo tokenInfo = this.tokenInfo;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (tokenInfo == null ? 0 : tokenInfo.hashCode())) * 31) + this.origin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TronSignRequest(requestId=" + this.requestId + ", signData=" + this.signData + ", path=" + this.path + ", xfp=" + this.xfp + ", tokenInfo=" + this.tokenInfo + ", origin=" + this.origin + ')';
    }

    public TronSignRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, TokenInfo tokenInfo, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.requestId = str;
        this.signData = str2;
        this.path = str3;
        this.xfp = str4;
        this.tokenInfo = tokenInfo;
        this.origin = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:com.keystone.module.TokenInfo:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.keystone.module.TokenInfo) : (r12v0 com.keystone.module.TokenInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.keystone.module.TokenInfo, java.lang.String):void (m)] (LINE:3) call: com.keystone.module.TronSignRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.keystone.module.TokenInfo, java.lang.String):void type: THIS */
    public /* synthetic */ TronSignRequest(String str, String str2, String str3, String str4, TokenInfo tokenInfo, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : tokenInfo, (i & 32) != 0 ? "" : str5);
    }
}
