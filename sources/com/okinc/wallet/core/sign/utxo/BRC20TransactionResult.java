package com.okinc.wallet.core.sign.utxo;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BRC20TransactionResult {
    private static final KSerializer<Object>[] $childSerializers;
    private String commitTx;
    private String commitTxFee;
    private String feeRate;
    private List<String> revealTxFees;
    private List<String> revealTxs;
    private List<String> sigHashList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BRC20TransactionResult() {
        this((List) null, (String) null, (List) null, (String) null, (List) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.wallet.core.sign.utxo.BRC20TransactionResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BRC20TransactionResult copy$default(BRC20TransactionResult bRC20TransactionResult, List list, String str, List list2, String str2, List list3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bRC20TransactionResult.sigHashList;
        }
        if ((i & 2) != 0) {
            str = bRC20TransactionResult.commitTx;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            list2 = bRC20TransactionResult.revealTxs;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            str2 = bRC20TransactionResult.commitTxFee;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            list3 = bRC20TransactionResult.revealTxFees;
        }
        List list5 = list3;
        if ((i & 32) != 0) {
            str3 = bRC20TransactionResult.feeRate;
        }
        return bRC20TransactionResult.copy(list, str4, list4, str5, list5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.sigHashList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.commitTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.revealTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.commitTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.revealTxFees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BRC20TransactionResult copy(List<String> list, String str, List<String> list2, String str2, List<String> list3, String str3) {
        return new BRC20TransactionResult(list, str, list2, str2, list3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BRC20TransactionResult)) {
            return false;
        }
        BRC20TransactionResult bRC20TransactionResult = (BRC20TransactionResult) obj;
        return Intrinsics.EZpvd(this.sigHashList, bRC20TransactionResult.sigHashList) && Intrinsics.EZpvd((Object) this.commitTx, (Object) bRC20TransactionResult.commitTx) && Intrinsics.EZpvd(this.revealTxs, bRC20TransactionResult.revealTxs) && Intrinsics.EZpvd((Object) this.commitTxFee, (Object) bRC20TransactionResult.commitTxFee) && Intrinsics.EZpvd(this.revealTxFees, bRC20TransactionResult.revealTxFees) && Intrinsics.EZpvd((Object) this.feeRate, (Object) bRC20TransactionResult.feeRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommitTx() {
        return this.commitTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommitTxFee() {
        return this.commitTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRevealTxFees() {
        return this.revealTxFees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRevealTxs() {
        return this.revealTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSigHashList() {
        return this.sigHashList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.sigHashList;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.commitTx;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<String> list2 = this.revealTxs;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.commitTxFee;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        List<String> list3 = this.revealTxFees;
        int iHashCode5 = list3 == null ? 0 : list3.hashCode();
        String str3 = this.feeRate;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommitTx(String str) {
        this.commitTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommitTxFee(String str) {
        this.commitTxFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevealTxFees(List<String> list) {
        this.revealTxFees = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevealTxs(List<String> list) {
        this.revealTxs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSigHashList(List<String> list) {
        this.sigHashList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BRC20TransactionResult(sigHashList=" + this.sigHashList + ", commitTx=" + this.commitTx + ", revealTxs=" + this.revealTxs + ", commitTxFee=" + this.commitTxFee + ", revealTxFees=" + this.revealTxFees + ", feeRate=" + this.feeRate + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.BRC20TransactionResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BRC20TransactionResult> serializer() {
            return BRC20TransactionResult$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(stringSerializer), null};
    }

    public /* synthetic */ BRC20TransactionResult(int i, List list, String str, List list2, String str2, List list3, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.sigHashList = null;
        } else {
            this.sigHashList = list;
        }
        if ((i & 2) == 0) {
            this.commitTx = null;
        } else {
            this.commitTx = str;
        }
        if ((i & 4) == 0) {
            this.revealTxs = null;
        } else {
            this.revealTxs = list2;
        }
        if ((i & 8) == 0) {
            this.commitTxFee = null;
        } else {
            this.commitTxFee = str2;
        }
        if ((i & 16) == 0) {
            this.revealTxFees = null;
        } else {
            this.revealTxFees = list3;
        }
        if ((i & 32) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(BRC20TransactionResult bRC20TransactionResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || bRC20TransactionResult.sigHashList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], bRC20TransactionResult.sigHashList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || bRC20TransactionResult.commitTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bRC20TransactionResult.commitTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || bRC20TransactionResult.revealTxs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], bRC20TransactionResult.revealTxs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bRC20TransactionResult.commitTxFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bRC20TransactionResult.commitTxFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || bRC20TransactionResult.revealTxFees != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], bRC20TransactionResult.revealTxFees);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && bRC20TransactionResult.feeRate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, bRC20TransactionResult.feeRate);
    }

    public BRC20TransactionResult(List<String> list, String str, List<String> list2, String str2, List<String> list3, String str3) {
        this.sigHashList = list;
        this.commitTx = str;
        this.revealTxs = list2;
        this.commitTxFee = str2;
        this.revealTxFees = list3;
        this.feeRate = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r8v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:40) call: com.okinc.wallet.core.sign.utxo.BRC20TransactionResult.<init>(java.util.List, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ BRC20TransactionResult(List list, String str, List list2, String str2, List list3, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : str3);
    }
}
