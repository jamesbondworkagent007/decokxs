package com.okinc.business.trade.features.home.ui.cefi.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PricingTokensRequest {
    public static final int $stable = 0;
    private final String accountId;
    private final String chainId;
    private final String inputTokenAddress;
    private final String userUniqueId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PricingTokensRequest copy$default(PricingTokensRequest pricingTokensRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pricingTokensRequest.chainId;
        }
        if ((i & 2) != 0) {
            str2 = pricingTokensRequest.inputTokenAddress;
        }
        if ((i & 4) != 0) {
            str3 = pricingTokensRequest.accountId;
        }
        if ((i & 8) != 0) {
            str4 = pricingTokensRequest.userUniqueId;
        }
        return pricingTokensRequest.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PricingTokensRequest copy(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PricingTokensRequest(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingTokensRequest)) {
            return false;
        }
        PricingTokensRequest pricingTokensRequest = (PricingTokensRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) pricingTokensRequest.chainId) && Intrinsics.EZpvd((Object) this.inputTokenAddress, (Object) pricingTokensRequest.inputTokenAddress) && Intrinsics.EZpvd((Object) this.accountId, (Object) pricingTokensRequest.accountId) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) pricingTokensRequest.userUniqueId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputTokenAddress() {
        return this.inputTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.inputTokenAddress.hashCode();
        String str = this.accountId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.userUniqueId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PricingTokensRequest(chainId=" + this.chainId + ", inputTokenAddress=" + this.inputTokenAddress + ", accountId=" + this.accountId + ", userUniqueId=" + this.userUniqueId + ")";
    }

    public PricingTokensRequest(@NotNull String str, @NotNull String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = str;
        this.inputTokenAddress = str2;
        this.accountId = str3;
        this.userUniqueId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.trade.features.home.ui.cefi.data.PricingTokensRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PricingTokensRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
