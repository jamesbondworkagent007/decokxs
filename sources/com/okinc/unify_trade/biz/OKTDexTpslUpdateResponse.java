package com.okinc.unify_trade.biz;

import com.google.gson.JsonElement;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class OKTDexTpslUpdateResponse {
    public static final int $stable = 8;
    private final Boolean contractDeployed;
    private final String preTradeId;
    private final JsonElement serverOption;
    private final String uopHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OKTDexTpslUpdateResponse() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OKTDexTpslUpdateResponse copy$default(OKTDexTpslUpdateResponse oKTDexTpslUpdateResponse, Boolean bool, String str, JsonElement jsonElement, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = oKTDexTpslUpdateResponse.contractDeployed;
        }
        if ((i & 2) != 0) {
            str = oKTDexTpslUpdateResponse.uopHash;
        }
        if ((i & 4) != 0) {
            jsonElement = oKTDexTpslUpdateResponse.serverOption;
        }
        if ((i & 8) != 0) {
            str2 = oKTDexTpslUpdateResponse.preTradeId;
        }
        return oKTDexTpslUpdateResponse.copy(bool, str, jsonElement, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.contractDeployed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement component3() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.preTradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKTDexTpslUpdateResponse copy(Boolean bool, String str, JsonElement jsonElement, String str2) {
        return new OKTDexTpslUpdateResponse(bool, str, jsonElement, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKTDexTpslUpdateResponse)) {
            return false;
        }
        OKTDexTpslUpdateResponse oKTDexTpslUpdateResponse = (OKTDexTpslUpdateResponse) obj;
        return Intrinsics.EZpvd(this.contractDeployed, oKTDexTpslUpdateResponse.contractDeployed) && Intrinsics.EZpvd((Object) this.uopHash, (Object) oKTDexTpslUpdateResponse.uopHash) && Intrinsics.EZpvd(this.serverOption, oKTDexTpslUpdateResponse.serverOption) && Intrinsics.EZpvd((Object) this.preTradeId, (Object) oKTDexTpslUpdateResponse.preTradeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getContractDeployed() {
        return this.contractDeployed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreTradeId() {
        return this.preTradeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonElement getServerOption() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.contractDeployed;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.uopHash;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        JsonElement jsonElement = this.serverOption;
        int iHashCode3 = jsonElement == null ? 0 : jsonElement.hashCode();
        String str2 = this.preTradeId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKTDexTpslUpdateResponse(contractDeployed=" + this.contractDeployed + ", uopHash=" + this.uopHash + ", serverOption=" + this.serverOption + ", preTradeId=" + this.preTradeId + ")";
    }

    public OKTDexTpslUpdateResponse(Boolean bool, String str, JsonElement jsonElement, String str2) {
        this.contractDeployed = bool;
        this.uopHash = str;
        this.serverOption = jsonElement;
        this.preTradeId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:com.google.gson.JsonElement:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonElement) : (r4v0 com.google.gson.JsonElement))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.Boolean, java.lang.String, com.google.gson.JsonElement, java.lang.String):void (m)] (LINE:525) call: com.okinc.unify_trade.biz.OKTDexTpslUpdateResponse.<init>(java.lang.Boolean, java.lang.String, com.google.gson.JsonElement, java.lang.String):void type: THIS */
    public /* synthetic */ OKTDexTpslUpdateResponse(Boolean bool, String str, JsonElement jsonElement, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : jsonElement, (i & 8) != 0 ? null : str2);
    }
}
