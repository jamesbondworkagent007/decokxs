package com.okinc.business.dexlogic.bean;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class BridgeRedeemBroadcastReq {
    public static final int $stable = 8;
    private final String bizType;
    private final JsonObject extraParam;
    private final String nonce;
    private final String orderId;
    private final String sign;
    private final String status;
    private final String transactionHash;
    private final JsonObject walletTxData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component4() {
        return this.walletTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component8() {
        return this.extraParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BridgeRedeemBroadcastReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, JsonObject jsonObject, @NotNull String str4, @NotNull String str5, @NotNull String str6, JsonObject jsonObject2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new BridgeRedeemBroadcastReq(str, str2, str3, jsonObject, str4, str5, str6, jsonObject2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BridgeRedeemBroadcastReq)) {
            return false;
        }
        BridgeRedeemBroadcastReq bridgeRedeemBroadcastReq = (BridgeRedeemBroadcastReq) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) bridgeRedeemBroadcastReq.orderId) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) bridgeRedeemBroadcastReq.transactionHash) && Intrinsics.EZpvd((Object) this.nonce, (Object) bridgeRedeemBroadcastReq.nonce) && Intrinsics.EZpvd(this.walletTxData, bridgeRedeemBroadcastReq.walletTxData) && Intrinsics.EZpvd((Object) this.sign, (Object) bridgeRedeemBroadcastReq.sign) && Intrinsics.EZpvd((Object) this.bizType, (Object) bridgeRedeemBroadcastReq.bizType) && Intrinsics.EZpvd((Object) this.status, (Object) bridgeRedeemBroadcastReq.status) && Intrinsics.EZpvd(this.extraParam, bridgeRedeemBroadcastReq.extraParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizType() {
        return this.bizType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getExtraParam() {
        return this.extraParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSign() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransactionHash() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getWalletTxData() {
        return this.walletTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.transactionHash.hashCode();
        int iHashCode3 = this.nonce.hashCode();
        JsonObject jsonObject = this.walletTxData;
        int iHashCode4 = jsonObject == null ? 0 : jsonObject.hashCode();
        int iHashCode5 = this.sign.hashCode();
        int iHashCode6 = this.bizType.hashCode();
        int iHashCode7 = this.status.hashCode();
        JsonObject jsonObject2 = this.extraParam;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (jsonObject2 != null ? jsonObject2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BridgeRedeemBroadcastReq(orderId=" + this.orderId + ", transactionHash=" + this.transactionHash + ", nonce=" + this.nonce + ", walletTxData=" + this.walletTxData + ", sign=" + this.sign + ", bizType=" + this.bizType + ", status=" + this.status + ", extraParam=" + this.extraParam + ")";
    }

    public BridgeRedeemBroadcastReq(@NotNull String str, @NotNull String str2, @NotNull String str3, JsonObject jsonObject, @NotNull String str4, @NotNull String str5, @NotNull String str6, JsonObject jsonObject2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.orderId = str;
        this.transactionHash = str2;
        this.nonce = str3;
        this.walletTxData = jsonObject;
        this.sign = str4;
        this.bizType = str5;
        this.status = str6;
        this.extraParam = jsonObject2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 com.google.gson.JsonObject)
  (r16v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("0") : (r18v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0016: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r19v0 com.google.gson.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void (m)] (LINE:7) call: com.okinc.business.dexlogic.bean.BridgeRedeemBroadcastReq.<init>(java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject, java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void type: THIS */
    public /* synthetic */ BridgeRedeemBroadcastReq(String str, String str2, String str3, JsonObject jsonObject, String str4, String str5, String str6, JsonObject jsonObject2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, jsonObject, str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "0" : str6, (i & 128) != 0 ? null : jsonObject2);
    }
}
