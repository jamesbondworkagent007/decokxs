package com.okinc.business.dexlogic.bean;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MultiApproveInfoParam {
    public static final int $stable = 8;
    private String cancelApproveTag;
    private String chainId;
    private String id;
    private final String transactionHash;
    private JsonObject walletTxData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MultiApproveInfoParam copy$default(MultiApproveInfoParam multiApproveInfoParam, String str, String str2, String str3, JsonObject jsonObject, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiApproveInfoParam.id;
        }
        if ((i & 2) != 0) {
            str2 = multiApproveInfoParam.chainId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = multiApproveInfoParam.transactionHash;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            jsonObject = multiApproveInfoParam.walletTxData;
        }
        JsonObject jsonObject2 = jsonObject;
        if ((i & 16) != 0) {
            str4 = multiApproveInfoParam.cancelApproveTag;
        }
        return multiApproveInfoParam.copy(str, str5, str6, jsonObject2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.transactionHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component4() {
        return this.walletTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cancelApproveTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiApproveInfoParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, JsonObject jsonObject, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new MultiApproveInfoParam(str, str2, str3, jsonObject, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiApproveInfoParam)) {
            return false;
        }
        MultiApproveInfoParam multiApproveInfoParam = (MultiApproveInfoParam) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) multiApproveInfoParam.id) && Intrinsics.EZpvd((Object) this.chainId, (Object) multiApproveInfoParam.chainId) && Intrinsics.EZpvd((Object) this.transactionHash, (Object) multiApproveInfoParam.transactionHash) && Intrinsics.EZpvd(this.walletTxData, multiApproveInfoParam.walletTxData) && Intrinsics.EZpvd((Object) this.cancelApproveTag, (Object) multiApproveInfoParam.cancelApproveTag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCancelApproveTag() {
        return this.cancelApproveTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
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
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        int iHashCode3 = this.transactionHash.hashCode();
        JsonObject jsonObject = this.walletTxData;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31) + this.cancelApproveTag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCancelApproveTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cancelApproveTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletTxData(JsonObject jsonObject) {
        this.walletTxData = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiApproveInfoParam(id=" + this.id + ", chainId=" + this.chainId + ", transactionHash=" + this.transactionHash + ", walletTxData=" + this.walletTxData + ", cancelApproveTag=" + this.cancelApproveTag + ")";
    }

    public MultiApproveInfoParam(@NotNull String str, @NotNull String str2, @NotNull String str3, JsonObject jsonObject, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.chainId = str2;
        this.transactionHash = str3;
        this.walletTxData = jsonObject;
        this.cancelApproveTag = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r11v0 com.google.gson.JsonObject))
  (r12v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject, java.lang.String):void (m)] (LINE:2272) call: com.okinc.business.dexlogic.bean.MultiApproveInfoParam.<init>(java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject, java.lang.String):void type: THIS */
    public /* synthetic */ MultiApproveInfoParam(String str, String str2, String str3, JsonObject jsonObject, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : jsonObject, str4);
    }
}
