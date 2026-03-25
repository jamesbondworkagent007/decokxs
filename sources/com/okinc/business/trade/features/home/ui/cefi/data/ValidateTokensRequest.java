package com.okinc.business.trade.features.home.ui.cefi.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ValidateTokensRequest {
    public static final int $stable = 0;
    private final String accountId;
    private final String baseTokenAddress;
    private final String chainId;
    private final String quoteTokenAddress;
    private final String userUniqueId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ValidateTokensRequest copy$default(ValidateTokensRequest validateTokensRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = validateTokensRequest.chainId;
        }
        if ((i & 2) != 0) {
            str2 = validateTokensRequest.accountId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = validateTokensRequest.userUniqueId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = validateTokensRequest.quoteTokenAddress;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = validateTokensRequest.baseTokenAddress;
        }
        return validateTokensRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.baseTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidateTokensRequest copy(@NotNull String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ValidateTokensRequest(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidateTokensRequest)) {
            return false;
        }
        ValidateTokensRequest validateTokensRequest = (ValidateTokensRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) validateTokensRequest.chainId) && Intrinsics.EZpvd((Object) this.accountId, (Object) validateTokensRequest.accountId) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) validateTokensRequest.userUniqueId) && Intrinsics.EZpvd((Object) this.quoteTokenAddress, (Object) validateTokensRequest.quoteTokenAddress) && Intrinsics.EZpvd((Object) this.baseTokenAddress, (Object) validateTokensRequest.baseTokenAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseTokenAddress() {
        return this.baseTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteTokenAddress() {
        return this.quoteTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserUniqueId() {
        return this.userUniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        String str = this.accountId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.userUniqueId;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.quoteTokenAddress;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.baseTokenAddress;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ValidateTokensRequest(chainId=" + this.chainId + ", accountId=" + this.accountId + ", userUniqueId=" + this.userUniqueId + ", quoteTokenAddress=" + this.quoteTokenAddress + ", baseTokenAddress=" + this.baseTokenAddress + ")";
    }

    public ValidateTokensRequest(@NotNull String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
        this.accountId = str2;
        this.userUniqueId = str3;
        this.quoteTokenAddress = str4;
        this.baseTokenAddress = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ValidateTokensRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
