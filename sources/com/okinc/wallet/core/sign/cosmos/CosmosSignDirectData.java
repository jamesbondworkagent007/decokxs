package com.okinc.wallet.core.sign.cosmos;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class CosmosSignDirectData extends CosmosTransactionData {
    public static final int $stable = 8;
    private String chainId;
    private CosmosSignDocTransaction sign_doc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosSignDirectData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosSignDirectData copy$default(CosmosSignDirectData cosmosSignDirectData, String str, CosmosSignDocTransaction cosmosSignDocTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosSignDirectData.chainId;
        }
        if ((i & 2) != 0) {
            cosmosSignDocTransaction = cosmosSignDirectData.sign_doc;
        }
        return cosmosSignDirectData.copy(str, cosmosSignDocTransaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignDocTransaction component2() {
        return this.sign_doc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignDirectData copy(String str, CosmosSignDocTransaction cosmosSignDocTransaction) {
        return new CosmosSignDirectData(str, cosmosSignDocTransaction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignDirectData)) {
            return false;
        }
        CosmosSignDirectData cosmosSignDirectData = (CosmosSignDirectData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) cosmosSignDirectData.chainId) && Intrinsics.EZpvd(this.sign_doc, cosmosSignDirectData.sign_doc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignDocTransaction getSign_doc() {
        return this.sign_doc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        CosmosSignDocTransaction cosmosSignDocTransaction = this.sign_doc;
        return (iHashCode * 31) + (cosmosSignDocTransaction != null ? cosmosSignDocTransaction.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSign_doc(CosmosSignDocTransaction cosmosSignDocTransaction) {
        this.sign_doc = cosmosSignDocTransaction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosSignDirectData(chainId=" + this.chainId + ", sign_doc=" + this.sign_doc + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction) : (r3v0 com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction))
 A[MD:(java.lang.String, com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction):void (m)] (LINE:31) call: com.okinc.wallet.core.sign.cosmos.CosmosSignDirectData.<init>(java.lang.String, com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction):void type: THIS */
    public /* synthetic */ CosmosSignDirectData(String str, CosmosSignDocTransaction cosmosSignDocTransaction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cosmosSignDocTransaction);
    }

    public CosmosSignDirectData(String str, CosmosSignDocTransaction cosmosSignDocTransaction) {
        super(null);
        this.chainId = str;
        this.sign_doc = cosmosSignDocTransaction;
    }

    public final CosmosSignDocTransaction convertToSignDocTransaction() {
        String str = this.chainId;
        CosmosSignDocTransaction cosmosSignDocTransaction = this.sign_doc;
        String accountNumber = cosmosSignDocTransaction != null ? cosmosSignDocTransaction.getAccountNumber() : null;
        CosmosSignDocTransaction cosmosSignDocTransaction2 = this.sign_doc;
        String bodyBytes = cosmosSignDocTransaction2 != null ? cosmosSignDocTransaction2.getBodyBytes() : null;
        CosmosSignDocTransaction cosmosSignDocTransaction3 = this.sign_doc;
        return new CosmosSignDocTransaction(str, accountNumber, bodyBytes, cosmosSignDocTransaction3 != null ? cosmosSignDocTransaction3.getAuthInfoBytes() : null);
    }
}
