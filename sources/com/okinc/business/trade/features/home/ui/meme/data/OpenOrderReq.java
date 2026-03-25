package com.okinc.business.trade.features.home.ui.meme.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class OpenOrderReq {
    public static final int $stable = 8;
    private final String accountId;
    private final String chainId;
    private final List<String> exchangeDirection;
    private final List<String> strategyType;
    private final String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.trade.features.home.ui.meme.data.OpenOrderReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenOrderReq copy$default(OpenOrderReq openOrderReq, String str, String str2, List list, List list2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openOrderReq.chainId;
        }
        if ((i & 2) != 0) {
            str2 = openOrderReq.accountId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            list = openOrderReq.exchangeDirection;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = openOrderReq.strategyType;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str3 = openOrderReq.tokenContractAddress;
        }
        return openOrderReq.copy(str, str4, list3, list4, str3);
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
    public final List<String> component3() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OpenOrderReq copy(String str, @NotNull String str2, List<String> list, List<String> list2, String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new OpenOrderReq(str, str2, list, list2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenOrderReq)) {
            return false;
        }
        OpenOrderReq openOrderReq = (OpenOrderReq) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) openOrderReq.chainId) && Intrinsics.EZpvd((Object) this.accountId, (Object) openOrderReq.accountId) && Intrinsics.EZpvd(this.exchangeDirection, openOrderReq.exchangeDirection) && Intrinsics.EZpvd(this.strategyType, openOrderReq.strategyType) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) openOrderReq.tokenContractAddress);
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
    public final List<String> getExchangeDirection() {
        return this.exchangeDirection;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        int iHashCode2 = this.accountId.hashCode();
        List<String> list = this.exchangeDirection;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.strategyType;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.tokenContractAddress;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OpenOrderReq(chainId=" + this.chainId + ", accountId=" + this.accountId + ", exchangeDirection=" + this.exchangeDirection + ", strategyType=" + this.strategyType + ", tokenContractAddress=" + this.tokenContractAddress + ")";
    }

    public OpenOrderReq(String str, @NotNull String str2, List<String> list, List<String> list2, String str3) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = str;
        this.accountId = str2;
        this.exchangeDirection = list;
        this.strategyType = list2;
        this.tokenContractAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (r9v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.trade.features.home.ui.meme.data.OpenOrderReq.<init>(java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ OpenOrderReq(String str, String str2, List list, List list2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : str3);
    }
}
