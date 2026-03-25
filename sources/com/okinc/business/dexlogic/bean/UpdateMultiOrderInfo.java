package com.okinc.business.dexlogic.bean;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class UpdateMultiOrderInfo {
    public static final int $stable = 8;
    private JsonArray extraParam;
    private final String orderId;
    private String sign;
    private final String transactionHash;
    private JsonObject walletTxData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateMultiOrderInfo copy$default(UpdateMultiOrderInfo updateMultiOrderInfo, String str, String str2, JsonObject jsonObject, JsonArray jsonArray, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateMultiOrderInfo.orderId;
        }
        if ((i & 2) != 0) {
            str2 = updateMultiOrderInfo.transactionHash;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            jsonObject = updateMultiOrderInfo.walletTxData;
        }
        JsonObject jsonObject2 = jsonObject;
        if ((i & 8) != 0) {
            jsonArray = updateMultiOrderInfo.extraParam;
        }
        JsonArray jsonArray2 = jsonArray;
        if ((i & 16) != 0) {
            str3 = updateMultiOrderInfo.sign;
        }
        return updateMultiOrderInfo.copy(str, str4, jsonObject2, jsonArray2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component3() {
        return this.walletTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray component4() {
        return this.extraParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateMultiOrderInfo copy(@NotNull String str, @NotNull String str2, JsonObject jsonObject, JsonArray jsonArray, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new UpdateMultiOrderInfo(str, str2, jsonObject, jsonArray, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateMultiOrderInfo)) {
            return false;
        }
        UpdateMultiOrderInfo updateMultiOrderInfo = (UpdateMultiOrderInfo) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) updateMultiOrderInfo.orderId) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) updateMultiOrderInfo.transactionHash) && Intrinsics.EZpvd(this.walletTxData, updateMultiOrderInfo.walletTxData) && Intrinsics.EZpvd(this.extraParam, updateMultiOrderInfo.extraParam) && Intrinsics.EZpvd((Object) this.sign, (Object) updateMultiOrderInfo.sign);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonArray getExtraParam() {
        return this.extraParam;
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
        JsonObject jsonObject = this.walletTxData;
        int iHashCode3 = jsonObject == null ? 0 : jsonObject.hashCode();
        JsonArray jsonArray = this.extraParam;
        int iHashCode4 = jsonArray == null ? 0 : jsonArray.hashCode();
        String str = this.sign;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraParam(JsonArray jsonArray) {
        this.extraParam = jsonArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSign(String str) {
        this.sign = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletTxData(JsonObject jsonObject) {
        this.walletTxData = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateMultiOrderInfo(orderId=" + this.orderId + ", transactionHash=" + this.transactionHash + ", walletTxData=" + this.walletTxData + ", extraParam=" + this.extraParam + ", sign=" + this.sign + ")";
    }

    public UpdateMultiOrderInfo(@NotNull String str, @NotNull String str2, JsonObject jsonObject, JsonArray jsonArray, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.orderId = str;
        this.transactionHash = str2;
        this.walletTxData = jsonObject;
        this.extraParam = jsonArray;
        this.sign = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r9v0 com.google.gson.JsonObject))
  (wrap:com.google.gson.JsonArray:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonArray) : (r10v0 com.google.gson.JsonArray))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, com.google.gson.JsonObject, com.google.gson.JsonArray, java.lang.String):void (m)] (LINE:2281) call: com.okinc.business.dexlogic.bean.UpdateMultiOrderInfo.<init>(java.lang.String, java.lang.String, com.google.gson.JsonObject, com.google.gson.JsonArray, java.lang.String):void type: THIS */
    public /* synthetic */ UpdateMultiOrderInfo(String str, String str2, JsonObject jsonObject, JsonArray jsonArray, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : jsonObject, (i & 8) != 0 ? null : jsonArray, (i & 16) != 0 ? null : str3);
    }
}
