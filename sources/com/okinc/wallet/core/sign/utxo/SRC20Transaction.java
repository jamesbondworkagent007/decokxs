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
public final class SRC20Transaction {
    private String address;
    private String commitFeeRate;
    private String dustSize;
    private List<ARC20TxIn> inputs;
    private BRC20InscriptionData inscriptionData;
    private String revealOutValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(ARC20TxIn$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SRC20Transaction() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, (BRC20InscriptionData) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.wallet.core.sign.utxo.SRC20Transaction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SRC20Transaction copy$default(SRC20Transaction sRC20Transaction, List list, String str, String str2, String str3, String str4, BRC20InscriptionData bRC20InscriptionData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sRC20Transaction.inputs;
        }
        if ((i & 2) != 0) {
            str = sRC20Transaction.commitFeeRate;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = sRC20Transaction.revealOutValue;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = sRC20Transaction.dustSize;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = sRC20Transaction.address;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            bRC20InscriptionData = sRC20Transaction.inscriptionData;
        }
        return sRC20Transaction.copy(list, str5, str6, str7, str8, bRC20InscriptionData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> component1() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.commitFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.revealOutValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dustSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BRC20InscriptionData component6() {
        return this.inscriptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SRC20Transaction copy(List<ARC20TxIn> list, String str, String str2, String str3, String str4, BRC20InscriptionData bRC20InscriptionData) {
        return new SRC20Transaction(list, str, str2, str3, str4, bRC20InscriptionData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SRC20Transaction)) {
            return false;
        }
        SRC20Transaction sRC20Transaction = (SRC20Transaction) obj;
        return Intrinsics.EZpvd(this.inputs, sRC20Transaction.inputs) && Intrinsics.EZpvd((Object) this.commitFeeRate, (Object) sRC20Transaction.commitFeeRate) && Intrinsics.EZpvd((Object) this.revealOutValue, (Object) sRC20Transaction.revealOutValue) && Intrinsics.EZpvd((Object) this.dustSize, (Object) sRC20Transaction.dustSize) && Intrinsics.EZpvd((Object) this.address, (Object) sRC20Transaction.address) && Intrinsics.EZpvd(this.inscriptionData, sRC20Transaction.inscriptionData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommitFeeRate() {
        return this.commitFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDustSize() {
        return this.dustSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ARC20TxIn> getInputs() {
        return this.inputs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BRC20InscriptionData getInscriptionData() {
        return this.inscriptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRevealOutValue() {
        return this.revealOutValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ARC20TxIn> list = this.inputs;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.commitFeeRate;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.revealOutValue;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dustSize;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.address;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        BRC20InscriptionData bRC20InscriptionData = this.inscriptionData;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bRC20InscriptionData != null ? bRC20InscriptionData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommitFeeRate(String str) {
        this.commitFeeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDustSize(String str) {
        this.dustSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputs(List<ARC20TxIn> list) {
        this.inputs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionData(BRC20InscriptionData bRC20InscriptionData) {
        this.inscriptionData = bRC20InscriptionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRevealOutValue(String str) {
        this.revealOutValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SRC20Transaction(inputs=" + this.inputs + ", commitFeeRate=" + this.commitFeeRate + ", revealOutValue=" + this.revealOutValue + ", dustSize=" + this.dustSize + ", address=" + this.address + ", inscriptionData=" + this.inscriptionData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.SRC20Transaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SRC20Transaction> serializer() {
            return SRC20Transaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SRC20Transaction(int i, List list, String str, String str2, String str3, String str4, BRC20InscriptionData bRC20InscriptionData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.inputs = null;
        } else {
            this.inputs = list;
        }
        if ((i & 2) == 0) {
            this.commitFeeRate = null;
        } else {
            this.commitFeeRate = str;
        }
        if ((i & 4) == 0) {
            this.revealOutValue = null;
        } else {
            this.revealOutValue = str2;
        }
        if ((i & 8) == 0) {
            this.dustSize = null;
        } else {
            this.dustSize = str3;
        }
        if ((i & 16) == 0) {
            this.address = null;
        } else {
            this.address = str4;
        }
        if ((i & 32) == 0) {
            this.inscriptionData = null;
        } else {
            this.inscriptionData = bRC20InscriptionData;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(SRC20Transaction sRC20Transaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || sRC20Transaction.inputs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], sRC20Transaction.inputs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sRC20Transaction.commitFeeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, sRC20Transaction.commitFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sRC20Transaction.revealOutValue != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, sRC20Transaction.revealOutValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || sRC20Transaction.dustSize != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, sRC20Transaction.dustSize);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || sRC20Transaction.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, sRC20Transaction.address);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && sRC20Transaction.inscriptionData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BRC20InscriptionData$$serializer.INSTANCE, sRC20Transaction.inscriptionData);
    }

    public SRC20Transaction(List<ARC20TxIn> list, String str, String str2, String str3, String str4, BRC20InscriptionData bRC20InscriptionData) {
        this.inputs = list;
        this.commitFeeRate = str;
        this.revealOutValue = str2;
        this.dustSize = str3;
        this.address = str4;
        this.inscriptionData = bRC20InscriptionData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.wallet.core.sign.utxo.BRC20InscriptionData:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.utxo.BRC20InscriptionData) : (r11v0 com.okinc.wallet.core.sign.utxo.BRC20InscriptionData))
 A[MD:(java.util.List<com.okinc.wallet.core.sign.utxo.ARC20TxIn>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.utxo.BRC20InscriptionData):void (m)] (LINE:13) call: com.okinc.wallet.core.sign.utxo.SRC20Transaction.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.utxo.BRC20InscriptionData):void type: THIS */
    public /* synthetic */ SRC20Transaction(List list, String str, String str2, String str3, String str4, BRC20InscriptionData bRC20InscriptionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bRC20InscriptionData);
    }
}
