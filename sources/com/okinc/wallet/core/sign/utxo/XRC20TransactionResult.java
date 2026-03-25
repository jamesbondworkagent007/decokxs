package com.okinc.wallet.core.sign.utxo;

import android.os.Parcel;
import android.os.Parcelable;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class XRC20TransactionResult implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private String commitTx;
    private String commitTxFee;
    private XRC20TransactionResultErrData data;
    private String dummyTx;
    private String dummyTxFee;
    private String errCode;
    private String feeRate;
    private String mergeTx;
    private String mergeTxFee;
    private final String publicKey;
    private List<String> revealTxFees;
    private List<String> revealTxs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<XRC20TransactionResult> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<XRC20TransactionResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20TransactionResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new XRC20TransactionResult(parcel.readString(), parcel.readInt() == 0 ? null : XRC20TransactionResultErrData.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final XRC20TransactionResult[] newArray(int i) {
            return new XRC20TransactionResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XRC20TransactionResult() {
        this((String) null, (XRC20TransactionResultErrData) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.revealTxFees;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XRC20TransactionResultErrData component2() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.mergeTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.commitTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dummyTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.revealTxs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.mergeTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.commitTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.dummyTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final XRC20TransactionResult copy(String str, XRC20TransactionResultErrData xRC20TransactionResultErrData, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, List<String> list2, String str8, String str9) {
        return new XRC20TransactionResult(str, xRC20TransactionResultErrData, str2, str3, str4, list, str5, str6, str7, list2, str8, str9);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XRC20TransactionResult)) {
            return false;
        }
        XRC20TransactionResult xRC20TransactionResult = (XRC20TransactionResult) obj;
        return Intrinsics.EZpvd((Object) this.errCode, (Object) xRC20TransactionResult.errCode) && Intrinsics.EZpvd(this.data, xRC20TransactionResult.data) && Intrinsics.EZpvd((Object) this.mergeTx, (Object) xRC20TransactionResult.mergeTx) && Intrinsics.EZpvd((Object) this.commitTx, (Object) xRC20TransactionResult.commitTx) && Intrinsics.EZpvd((Object) this.dummyTx, (Object) xRC20TransactionResult.dummyTx) && Intrinsics.EZpvd(this.revealTxs, xRC20TransactionResult.revealTxs) && Intrinsics.EZpvd((Object) this.mergeTxFee, (Object) xRC20TransactionResult.mergeTxFee) && Intrinsics.EZpvd((Object) this.commitTxFee, (Object) xRC20TransactionResult.commitTxFee) && Intrinsics.EZpvd((Object) this.dummyTxFee, (Object) xRC20TransactionResult.dummyTxFee) && Intrinsics.EZpvd(this.revealTxFees, xRC20TransactionResult.revealTxFees) && Intrinsics.EZpvd((Object) this.feeRate, (Object) xRC20TransactionResult.feeRate) && Intrinsics.EZpvd((Object) this.publicKey, (Object) xRC20TransactionResult.publicKey);
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
    public final XRC20TransactionResultErrData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDummyTx() {
        return this.dummyTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDummyTxFee() {
        return this.dummyTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrCode() {
        return this.errCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMergeTx() {
        return this.mergeTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMergeTxFee() {
        return this.mergeTxFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
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
    public int hashCode() {
        String str = this.errCode;
        int iHashCode = str == null ? 0 : str.hashCode();
        XRC20TransactionResultErrData xRC20TransactionResultErrData = this.data;
        int iHashCode2 = xRC20TransactionResultErrData == null ? 0 : xRC20TransactionResultErrData.hashCode();
        String str2 = this.mergeTx;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.commitTx;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.dummyTx;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.revealTxs;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str5 = this.mergeTxFee;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.commitTxFee;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.dummyTxFee;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        List<String> list2 = this.revealTxFees;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        String str8 = this.feeRate;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.publicKey;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str9 != null ? str9.hashCode() : 0);
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
    public final void setData(XRC20TransactionResultErrData xRC20TransactionResultErrData) {
        this.data = xRC20TransactionResultErrData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummyTx(String str) {
        this.dummyTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummyTxFee(String str) {
        this.dummyTxFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrCode(String str) {
        this.errCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMergeTx(String str) {
        this.mergeTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMergeTxFee(String str) {
        this.mergeTxFee = str;
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
    public String toString() {
        return "XRC20TransactionResult(errCode=" + this.errCode + ", data=" + this.data + ", mergeTx=" + this.mergeTx + ", commitTx=" + this.commitTx + ", dummyTx=" + this.dummyTx + ", revealTxs=" + this.revealTxs + ", mergeTxFee=" + this.mergeTxFee + ", commitTxFee=" + this.commitTxFee + ", dummyTxFee=" + this.dummyTxFee + ", revealTxFees=" + this.revealTxFees + ", feeRate=" + this.feeRate + ", publicKey=" + this.publicKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.errCode);
        XRC20TransactionResultErrData xRC20TransactionResultErrData = this.data;
        if (xRC20TransactionResultErrData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            xRC20TransactionResultErrData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.mergeTx);
        parcel.writeString(this.commitTx);
        parcel.writeString(this.dummyTx);
        parcel.writeStringList(this.revealTxs);
        parcel.writeString(this.mergeTxFee);
        parcel.writeString(this.commitTxFee);
        parcel.writeString(this.dummyTxFee);
        parcel.writeStringList(this.revealTxFees);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.publicKey);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.XRC20TransactionResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<XRC20TransactionResult> serializer() {
            return XRC20TransactionResult$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, new ArrayListSerializer(stringSerializer), null, null};
    }

    public /* synthetic */ XRC20TransactionResult(int i, String str, XRC20TransactionResultErrData xRC20TransactionResultErrData, String str2, String str3, String str4, List list, String str5, String str6, String str7, List list2, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.errCode = null;
        } else {
            this.errCode = str;
        }
        if ((i & 2) == 0) {
            this.data = null;
        } else {
            this.data = xRC20TransactionResultErrData;
        }
        if ((i & 4) == 0) {
            this.mergeTx = null;
        } else {
            this.mergeTx = str2;
        }
        if ((i & 8) == 0) {
            this.commitTx = null;
        } else {
            this.commitTx = str3;
        }
        if ((i & 16) == 0) {
            this.dummyTx = null;
        } else {
            this.dummyTx = str4;
        }
        if ((i & 32) == 0) {
            this.revealTxs = null;
        } else {
            this.revealTxs = list;
        }
        if ((i & 64) == 0) {
            this.mergeTxFee = null;
        } else {
            this.mergeTxFee = str5;
        }
        if ((i & 128) == 0) {
            this.commitTxFee = null;
        } else {
            this.commitTxFee = str6;
        }
        if ((i & 256) == 0) {
            this.dummyTxFee = null;
        } else {
            this.dummyTxFee = str7;
        }
        if ((i & 512) == 0) {
            this.revealTxFees = null;
        } else {
            this.revealTxFees = list2;
        }
        if ((i & 1024) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str8;
        }
        if ((i & 2048) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(XRC20TransactionResult xRC20TransactionResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || xRC20TransactionResult.errCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, xRC20TransactionResult.errCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || xRC20TransactionResult.data != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, XRC20TransactionResultErrData$$serializer.INSTANCE, xRC20TransactionResult.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || xRC20TransactionResult.mergeTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, xRC20TransactionResult.mergeTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || xRC20TransactionResult.commitTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, xRC20TransactionResult.commitTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || xRC20TransactionResult.dummyTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, xRC20TransactionResult.dummyTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || xRC20TransactionResult.revealTxs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], xRC20TransactionResult.revealTxs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || xRC20TransactionResult.mergeTxFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, xRC20TransactionResult.mergeTxFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || xRC20TransactionResult.commitTxFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, xRC20TransactionResult.commitTxFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || xRC20TransactionResult.dummyTxFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, xRC20TransactionResult.dummyTxFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || xRC20TransactionResult.revealTxFees != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], xRC20TransactionResult.revealTxFees);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || xRC20TransactionResult.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, xRC20TransactionResult.feeRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && xRC20TransactionResult.publicKey == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, xRC20TransactionResult.publicKey);
    }

    public XRC20TransactionResult(String str, XRC20TransactionResultErrData xRC20TransactionResultErrData, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, List<String> list2, String str8, String str9) {
        this.errCode = str;
        this.data = xRC20TransactionResultErrData;
        this.mergeTx = str2;
        this.commitTx = str3;
        this.dummyTx = str4;
        this.revealTxs = list;
        this.mergeTxFee = str5;
        this.commitTxFee = str6;
        this.dummyTxFee = str7;
        this.revealTxFees = list2;
        this.feeRate = str8;
        this.publicKey = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData) : (r15v0 com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:97) call: com.okinc.wallet.core.sign.utxo.XRC20TransactionResult.<init>(java.lang.String, com.okinc.wallet.core.sign.utxo.XRC20TransactionResultErrData, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ XRC20TransactionResult(String str, XRC20TransactionResultErrData xRC20TransactionResultErrData, String str2, String str3, String str4, List list, String str5, String str6, String str7, List list2, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : xRC20TransactionResultErrData, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : list2, (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? str9 : null);
    }
}
