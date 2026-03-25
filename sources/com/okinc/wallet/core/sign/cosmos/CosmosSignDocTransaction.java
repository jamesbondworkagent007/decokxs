package com.okinc.wallet.core.sign.cosmos;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CosmosSignDocTransaction extends CosmosTransactionData {
    public static final int $stable = 8;
    private String accountNumber;
    private String authInfoBytes;
    private String bodyBytes;
    private String chainId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosSignDocTransaction() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CosmosSignDocTransaction copy$default(CosmosSignDocTransaction cosmosSignDocTransaction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cosmosSignDocTransaction.chainId;
        }
        if ((i & 2) != 0) {
            str2 = cosmosSignDocTransaction.accountNumber;
        }
        if ((i & 4) != 0) {
            str3 = cosmosSignDocTransaction.bodyBytes;
        }
        if ((i & 8) != 0) {
            str4 = cosmosSignDocTransaction.authInfoBytes;
        }
        return cosmosSignDocTransaction.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bodyBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.authInfoBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignDocTransaction copy(String str, String str2, String str3, String str4) {
        return new CosmosSignDocTransaction(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignDocTransaction)) {
            return false;
        }
        CosmosSignDocTransaction cosmosSignDocTransaction = (CosmosSignDocTransaction) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) cosmosSignDocTransaction.chainId) && Intrinsics.EZpvd((Object) this.accountNumber, (Object) cosmosSignDocTransaction.accountNumber) && Intrinsics.EZpvd((Object) this.bodyBytes, (Object) cosmosSignDocTransaction.bodyBytes) && Intrinsics.EZpvd((Object) this.authInfoBytes, (Object) cosmosSignDocTransaction.authInfoBytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAuthInfoBytes() {
        return this.authInfoBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBodyBytes() {
        return this.bodyBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.accountNumber;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bodyBytes;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.authInfoBytes;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthInfoBytes(String str) {
        this.authInfoBytes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBodyBytes(String str) {
        this.bodyBytes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosSignDocTransaction(chainId=" + this.chainId + ", accountNumber=" + this.accountNumber + ", bodyBytes=" + this.bodyBytes + ", authInfoBytes=" + this.authInfoBytes + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosSignDocTransaction(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public CosmosSignDocTransaction(String str, String str2, String str3, String str4) {
        super(null);
        this.chainId = str;
        this.accountNumber = str2;
        this.bodyBytes = str3;
        this.authInfoBytes = str4;
    }
}
