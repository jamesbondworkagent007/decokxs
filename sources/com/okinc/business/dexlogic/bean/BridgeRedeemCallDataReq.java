package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class BridgeRedeemCallDataReq {
    public static final int $stable = 0;
    private final String gasPrice;
    private final String mainOrderId;
    private final String payerWalletAddress;
    private final String priorityFee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BridgeRedeemCallDataReq copy$default(BridgeRedeemCallDataReq bridgeRedeemCallDataReq, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bridgeRedeemCallDataReq.mainOrderId;
        }
        if ((i & 2) != 0) {
            str2 = bridgeRedeemCallDataReq.payerWalletAddress;
        }
        if ((i & 4) != 0) {
            str3 = bridgeRedeemCallDataReq.gasPrice;
        }
        if ((i & 8) != 0) {
            str4 = bridgeRedeemCallDataReq.priorityFee;
        }
        return bridgeRedeemCallDataReq.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mainOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.payerWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeRedeemCallDataReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new BridgeRedeemCallDataReq(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeRedeemCallDataReq)) {
            return false;
        }
        BridgeRedeemCallDataReq bridgeRedeemCallDataReq = (BridgeRedeemCallDataReq) obj;
        return Intrinsics.EZpvd((Object) this.mainOrderId, (Object) bridgeRedeemCallDataReq.mainOrderId) && Intrinsics.EZpvd((Object) this.payerWalletAddress, (Object) bridgeRedeemCallDataReq.payerWalletAddress) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) bridgeRedeemCallDataReq.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) bridgeRedeemCallDataReq.priorityFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainOrderId() {
        return this.mainOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayerWalletAddress() {
        return this.payerWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.mainOrderId.hashCode() * 31) + this.payerWalletAddress.hashCode()) * 31) + this.gasPrice.hashCode()) * 31) + this.priorityFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BridgeRedeemCallDataReq(mainOrderId=" + this.mainOrderId + ", payerWalletAddress=" + this.payerWalletAddress + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ")";
    }

    public BridgeRedeemCallDataReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.mainOrderId = str;
        this.payerWalletAddress = str2;
        this.gasPrice = str3;
        this.priorityFee = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.business.dexlogic.bean.BridgeRedeemCallDataReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BridgeRedeemCallDataReq(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
