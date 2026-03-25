package com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CosmosSignDocData {
    public static final int $stable = 8;
    private JsonObject signDoc;
    private CosmosSignature signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosSignDocData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosSignDocData copy$default(CosmosSignDocData cosmosSignDocData, JsonObject jsonObject, CosmosSignature cosmosSignature, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = cosmosSignDocData.signDoc;
        }
        if ((i & 2) != 0) {
            cosmosSignature = cosmosSignDocData.signature;
        }
        return cosmosSignDocData.copy(jsonObject, cosmosSignature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component1() {
        return this.signDoc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignature component2() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignDocData copy(JsonObject jsonObject, CosmosSignature cosmosSignature) {
        return new CosmosSignDocData(jsonObject, cosmosSignature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignDocData)) {
            return false;
        }
        CosmosSignDocData cosmosSignDocData = (CosmosSignDocData) obj;
        return Intrinsics.EZpvd(this.signDoc, cosmosSignDocData.signDoc) && Intrinsics.EZpvd(this.signature, cosmosSignDocData.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getSignDoc() {
        return this.signDoc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignature getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        JsonObject jsonObject = this.signDoc;
        int iHashCode = jsonObject == null ? 0 : jsonObject.hashCode();
        CosmosSignature cosmosSignature = this.signature;
        return (iHashCode * 31) + (cosmosSignature != null ? cosmosSignature.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignDoc(JsonObject jsonObject) {
        this.signDoc = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignature(CosmosSignature cosmosSignature) {
        this.signature = cosmosSignature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosSignDocData(signDoc=" + this.signDoc + ", signature=" + this.signature + ")";
    }

    public CosmosSignDocData(JsonObject jsonObject, CosmosSignature cosmosSignature) {
        this.signDoc = jsonObject;
        this.signature = cosmosSignature;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r2v0 com.google.gson.JsonObject))
  (wrap:com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignature:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignature) : (r3v0 com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignature))
 A[MD:(com.google.gson.JsonObject, com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignature):void (m)] (LINE:34) call: com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignDocData.<init>(com.google.gson.JsonObject, com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignature):void type: THIS */
    public /* synthetic */ CosmosSignDocData(JsonObject jsonObject, CosmosSignature cosmosSignature, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jsonObject, (i & 2) != 0 ? null : cosmosSignature);
    }
}
