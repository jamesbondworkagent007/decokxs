package com.okinc.business.defi.wallet.mine.search.ui.uimodel;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class WalletSearchTrackEventModel {
    public static final int $stable = 0;
    private final String chainIndex;
    private final String contractAddress;
    private final Integer quickTrade;
    private final String tokenName;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletSearchTrackEventModel copy$default(WalletSearchTrackEventModel walletSearchTrackEventModel, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = walletSearchTrackEventModel.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = walletSearchTrackEventModel.contractAddress;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = walletSearchTrackEventModel.tokenSymbol;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = walletSearchTrackEventModel.tokenName;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            num = walletSearchTrackEventModel.quickTrade;
        }
        return walletSearchTrackEventModel.copy(str, str5, str6, str7, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.quickTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchTrackEventModel copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new WalletSearchTrackEventModel(str, str2, str3, str4, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSearchTrackEventModel)) {
            return false;
        }
        WalletSearchTrackEventModel walletSearchTrackEventModel = (WalletSearchTrackEventModel) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) walletSearchTrackEventModel.chainIndex) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) walletSearchTrackEventModel.contractAddress) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) walletSearchTrackEventModel.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) walletSearchTrackEventModel.tokenName) && Intrinsics.EZpvd(this.quickTrade, walletSearchTrackEventModel.quickTrade);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getQuickTrade() {
        return this.quickTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.contractAddress.hashCode();
        int iHashCode3 = this.tokenSymbol.hashCode();
        int iHashCode4 = this.tokenName.hashCode();
        Integer num = this.quickTrade;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchTrackEventModel(chainIndex=" + this.chainIndex + ", contractAddress=" + this.contractAddress + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", quickTrade=" + this.quickTrade + ")";
    }

    public WalletSearchTrackEventModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainIndex = str;
        this.contractAddress = str2;
        this.tokenSymbol = str3;
        this.tokenName = str4;
        this.quickTrade = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r12v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:6) call: com.okinc.business.defi.wallet.mine.search.ui.uimodel.WalletSearchTrackEventModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ WalletSearchTrackEventModel(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : num);
    }
}
