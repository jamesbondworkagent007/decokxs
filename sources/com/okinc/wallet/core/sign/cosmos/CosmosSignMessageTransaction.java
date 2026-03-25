package com.okinc.wallet.core.sign.cosmos;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class CosmosSignMessageTransaction extends CosmosTransactionData {
    public static final int $stable = 8;
    private String account_number;
    private String chain_id;
    private CosmosFee fee;
    private String from;
    private String gas;
    private String memo;
    private List<CosmosMessage> msgs;
    private String sequence;
    private String timeout_height;
    private String to;
    private String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CosmosSignMessageTransaction() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chain_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.timeout_height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.account_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosFee component4() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CosmosMessage> component5() {
        return this.msgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosSignMessageTransaction copy(String str, String str2, String str3, CosmosFee cosmosFee, List<CosmosMessage> list, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new CosmosSignMessageTransaction(str, str2, str3, cosmosFee, list, str4, str5, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CosmosSignMessageTransaction)) {
            return false;
        }
        CosmosSignMessageTransaction cosmosSignMessageTransaction = (CosmosSignMessageTransaction) obj;
        return Intrinsics.EZpvd((Object) this.chain_id, (Object) cosmosSignMessageTransaction.chain_id) && Intrinsics.EZpvd((Object) this.account_number, (Object) cosmosSignMessageTransaction.account_number) && Intrinsics.EZpvd((Object) this.sequence, (Object) cosmosSignMessageTransaction.sequence) && Intrinsics.EZpvd(this.fee, cosmosSignMessageTransaction.fee) && Intrinsics.EZpvd(this.msgs, cosmosSignMessageTransaction.msgs) && Intrinsics.EZpvd((Object) this.memo, (Object) cosmosSignMessageTransaction.memo) && Intrinsics.EZpvd((Object) this.gas, (Object) cosmosSignMessageTransaction.gas) && Intrinsics.EZpvd((Object) this.from, (Object) cosmosSignMessageTransaction.from) && Intrinsics.EZpvd((Object) this.to, (Object) cosmosSignMessageTransaction.to) && Intrinsics.EZpvd((Object) this.value, (Object) cosmosSignMessageTransaction.value) && Intrinsics.EZpvd((Object) this.timeout_height, (Object) cosmosSignMessageTransaction.timeout_height);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccount_number() {
        return this.account_number;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain_id() {
        return this.chain_id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CosmosFee getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CosmosMessage> getMsgs() {
        return this.msgs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSequence() {
        return this.sequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeout_height() {
        return this.timeout_height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chain_id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.account_number;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sequence;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        CosmosFee cosmosFee = this.fee;
        int iHashCode4 = cosmosFee == null ? 0 : cosmosFee.hashCode();
        List<CosmosMessage> list = this.msgs;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str4 = this.memo;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.gas;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.from;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.to;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.value;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.timeout_height;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount_number(String str) {
        this.account_number = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChain_id(String str) {
        this.chain_id = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(CosmosFee cosmosFee) {
        this.fee = cosmosFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(String str) {
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGas(String str) {
        this.gas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgs(List<CosmosMessage> list) {
        this.msgs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSequence(String str) {
        this.sequence = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTimeout_height(String str) {
        this.timeout_height = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(String str) {
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(String str) {
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CosmosSignMessageTransaction(chain_id=" + this.chain_id + ", account_number=" + this.account_number + ", sequence=" + this.sequence + ", fee=" + this.fee + ", msgs=" + this.msgs + ", memo=" + this.memo + ", gas=" + this.gas + ", from=" + this.from + ", to=" + this.to + ", value=" + this.value + ", timeout_height=" + this.timeout_height + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:com.okinc.wallet.core.sign.cosmos.CosmosFee:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.cosmos.CosmosFee) : (r16v0 com.okinc.wallet.core.sign.cosmos.CosmosFee))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.cosmos.CosmosFee, java.util.List<com.okinc.wallet.core.sign.cosmos.CosmosMessage>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.wallet.core.sign.cosmos.CosmosSignMessageTransaction.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.cosmos.CosmosFee, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CosmosSignMessageTransaction(String str, String str2, String str3, CosmosFee cosmosFee, List list, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : cosmosFee, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }

    public CosmosSignMessageTransaction(String str, String str2, String str3, CosmosFee cosmosFee, List<CosmosMessage> list, String str4, String str5, String str6, String str7, String str8, String str9) {
        super(null);
        this.chain_id = str;
        this.account_number = str2;
        this.sequence = str3;
        this.fee = cosmosFee;
        this.msgs = list;
        this.memo = str4;
        this.gas = str5;
        this.from = str6;
        this.to = str7;
        this.value = str8;
        this.timeout_height = str9;
    }
}
