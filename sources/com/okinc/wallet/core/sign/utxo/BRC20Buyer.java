package com.okinc.wallet.core.sign.utxo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class BRC20Buyer implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Integer batchSize;
    private String changeAddress;
    private String dummyOutAddress;
    private String dummyOutAmount;
    private List<UTXOTxIn> dummyTxIn;
    private String dustLimit;
    private String fee;
    private String feeRate;
    private String minOutput;
    private String nftReceiverAddress;
    private List<UTXOTxIn> nftTxIn;
    private List<UTXOTxIn> paymentTxIn;
    private String psbtTx;
    private List<BRC20SellerData> sellerData;
    private List<String> signatureList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BRC20Buyer> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BRC20Buyer> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BRC20Buyer createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(BRC20SellerData.CREATOR.createFromParcel(parcel));
                }
            }
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList5.add(UTXOTxIn.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList6.add(UTXOTxIn.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i7 = parcel.readInt();
                arrayList4 = new ArrayList(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    arrayList4.add(UTXOTxIn.CREATOR.createFromParcel(parcel));
                }
            }
            return new BRC20Buyer(string, string2, string3, string4, string5, arrayList, string6, string7, string8, arrayList2, arrayList3, arrayList4, parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BRC20Buyer[] newArray(int i) {
            return new BRC20Buyer[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BRC20Buyer() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (Integer) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> component10() {
        return this.dummyTxIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> component11() {
        return this.paymentTxIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> component12() {
        return this.nftTxIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component13() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.psbtTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.batchSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dummyOutAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.dustLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BRC20SellerData> component6() {
        return this.sellerData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.dummyOutAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.nftReceiverAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BRC20Buyer copy(String str, String str2, String str3, String str4, String str5, List<BRC20SellerData> list, String str6, String str7, String str8, List<UTXOTxIn> list2, List<UTXOTxIn> list3, List<UTXOTxIn> list4, List<String> list5, String str9, Integer num) {
        return new BRC20Buyer(str, str2, str3, str4, str5, list, str6, str7, str8, list2, list3, list4, list5, str9, num);
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
        if (!(obj instanceof BRC20Buyer)) {
            return false;
        }
        BRC20Buyer bRC20Buyer = (BRC20Buyer) obj;
        return Intrinsics.EZpvd((Object) this.fee, (Object) bRC20Buyer.fee) && Intrinsics.EZpvd((Object) this.feeRate, (Object) bRC20Buyer.feeRate) && Intrinsics.EZpvd((Object) this.dummyOutAmount, (Object) bRC20Buyer.dummyOutAmount) && Intrinsics.EZpvd((Object) this.minOutput, (Object) bRC20Buyer.minOutput) && Intrinsics.EZpvd((Object) this.dustLimit, (Object) bRC20Buyer.dustLimit) && Intrinsics.EZpvd(this.sellerData, bRC20Buyer.sellerData) && Intrinsics.EZpvd((Object) this.changeAddress, (Object) bRC20Buyer.changeAddress) && Intrinsics.EZpvd((Object) this.dummyOutAddress, (Object) bRC20Buyer.dummyOutAddress) && Intrinsics.EZpvd((Object) this.nftReceiverAddress, (Object) bRC20Buyer.nftReceiverAddress) && Intrinsics.EZpvd(this.dummyTxIn, bRC20Buyer.dummyTxIn) && Intrinsics.EZpvd(this.paymentTxIn, bRC20Buyer.paymentTxIn) && Intrinsics.EZpvd(this.nftTxIn, bRC20Buyer.nftTxIn) && Intrinsics.EZpvd(this.signatureList, bRC20Buyer.signatureList) && Intrinsics.EZpvd((Object) this.psbtTx, (Object) bRC20Buyer.psbtTx) && Intrinsics.EZpvd(this.batchSize, bRC20Buyer.batchSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBatchSize() {
        return this.batchSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeAddress() {
        return this.changeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDummyOutAddress() {
        return this.dummyOutAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDummyOutAmount() {
        return this.dummyOutAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> getDummyTxIn() {
        return this.dummyTxIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDustLimit() {
        return this.dustLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinOutput() {
        return this.minOutput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftReceiverAddress() {
        return this.nftReceiverAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> getNftTxIn() {
        return this.nftTxIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<UTXOTxIn> getPaymentTxIn() {
        return this.paymentTxIn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPsbtTx() {
        return this.psbtTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BRC20SellerData> getSellerData() {
        return this.sellerData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSignatureList() {
        return this.signatureList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.feeRate;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dummyOutAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.minOutput;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.dustLimit;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        List<BRC20SellerData> list = this.sellerData;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str6 = this.changeAddress;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.dummyOutAddress;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.nftReceiverAddress;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        List<UTXOTxIn> list2 = this.dummyTxIn;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        List<UTXOTxIn> list3 = this.paymentTxIn;
        int iHashCode11 = list3 == null ? 0 : list3.hashCode();
        List<UTXOTxIn> list4 = this.nftTxIn;
        int iHashCode12 = list4 == null ? 0 : list4.hashCode();
        List<String> list5 = this.signatureList;
        int iHashCode13 = list5 == null ? 0 : list5.hashCode();
        String str9 = this.psbtTx;
        int iHashCode14 = str9 == null ? 0 : str9.hashCode();
        Integer num = this.batchSize;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchSize(Integer num) {
        this.batchSize = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeAddress(String str) {
        this.changeAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummyOutAddress(String str) {
        this.dummyOutAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummyOutAmount(String str) {
        this.dummyOutAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDummyTxIn(List<UTXOTxIn> list) {
        this.dummyTxIn = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDustLimit(String str) {
        this.dustLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(String str) {
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinOutput(String str) {
        this.minOutput = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftReceiverAddress(String str) {
        this.nftReceiverAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftTxIn(List<UTXOTxIn> list) {
        this.nftTxIn = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentTxIn(List<UTXOTxIn> list) {
        this.paymentTxIn = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPsbtTx(String str) {
        this.psbtTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellerData(List<BRC20SellerData> list) {
        this.sellerData = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignatureList(List<String> list) {
        this.signatureList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BRC20Buyer(fee=" + this.fee + ", feeRate=" + this.feeRate + ", dummyOutAmount=" + this.dummyOutAmount + ", minOutput=" + this.minOutput + ", dustLimit=" + this.dustLimit + ", sellerData=" + this.sellerData + ", changeAddress=" + this.changeAddress + ", dummyOutAddress=" + this.dummyOutAddress + ", nftReceiverAddress=" + this.nftReceiverAddress + ", dummyTxIn=" + this.dummyTxIn + ", paymentTxIn=" + this.paymentTxIn + ", nftTxIn=" + this.nftTxIn + ", signatureList=" + this.signatureList + ", psbtTx=" + this.psbtTx + ", batchSize=" + this.batchSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fee);
        parcel.writeString(this.feeRate);
        parcel.writeString(this.dummyOutAmount);
        parcel.writeString(this.minOutput);
        parcel.writeString(this.dustLimit);
        List<BRC20SellerData> list = this.sellerData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<BRC20SellerData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.changeAddress);
        parcel.writeString(this.dummyOutAddress);
        parcel.writeString(this.nftReceiverAddress);
        List<UTXOTxIn> list2 = this.dummyTxIn;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<UTXOTxIn> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<UTXOTxIn> list3 = this.paymentTxIn;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<UTXOTxIn> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        List<UTXOTxIn> list4 = this.nftTxIn;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            Iterator<UTXOTxIn> it4 = list4.iterator();
            while (it4.hasNext()) {
                it4.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.signatureList);
        parcel.writeString(this.psbtTx);
        Integer num = this.batchSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.utxo.BRC20Buyer.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BRC20Buyer> serializer() {
            return BRC20Buyer$$serializer.INSTANCE;
        }
    }

    static {
        UTXOTxIn$$serializer uTXOTxIn$$serializer = UTXOTxIn$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(BRC20SellerData$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(uTXOTxIn$$serializer), new ArrayListSerializer(uTXOTxIn$$serializer), new ArrayListSerializer(uTXOTxIn$$serializer), new ArrayListSerializer(StringSerializer.INSTANCE), null, null};
    }

    public /* synthetic */ BRC20Buyer(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, List list2, List list3, List list4, List list5, String str9, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.fee = "";
        } else {
            this.fee = str;
        }
        if ((i & 2) == 0) {
            this.feeRate = "";
        } else {
            this.feeRate = str2;
        }
        if ((i & 4) == 0) {
            this.dummyOutAmount = "";
        } else {
            this.dummyOutAmount = str3;
        }
        if ((i & 8) == 0) {
            this.minOutput = "";
        } else {
            this.minOutput = str4;
        }
        if ((i & 16) == 0) {
            this.dustLimit = "";
        } else {
            this.dustLimit = str5;
        }
        this.sellerData = (i & 32) == 0 ? yDY.AhwBna() : list;
        if ((i & 64) == 0) {
            this.changeAddress = "";
        } else {
            this.changeAddress = str6;
        }
        if ((i & 128) == 0) {
            this.dummyOutAddress = "";
        } else {
            this.dummyOutAddress = str7;
        }
        if ((i & 256) == 0) {
            this.nftReceiverAddress = "";
        } else {
            this.nftReceiverAddress = str8;
        }
        this.dummyTxIn = (i & 512) == 0 ? yDY.AhwBna() : list2;
        this.paymentTxIn = (i & 1024) == 0 ? yDY.AhwBna() : list3;
        this.nftTxIn = (i & 2048) == 0 ? yDY.AhwBna() : list4;
        if ((i & 4096) == 0) {
            this.signatureList = null;
        } else {
            this.signatureList = list5;
        }
        if ((i & 8192) == 0) {
            this.psbtTx = null;
        } else {
            this.psbtTx = str9;
        }
        if ((i & 16384) == 0) {
            this.batchSize = null;
        } else {
            this.batchSize = num;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [74=5] */
    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(BRC20Buyer bRC20Buyer, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bRC20Buyer.fee, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, bRC20Buyer.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bRC20Buyer.feeRate, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bRC20Buyer.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bRC20Buyer.dummyOutAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, bRC20Buyer.dummyOutAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bRC20Buyer.minOutput, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, bRC20Buyer.minOutput);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bRC20Buyer.dustLimit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, bRC20Buyer.dustLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(bRC20Buyer.sellerData, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], bRC20Buyer.sellerData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) bRC20Buyer.changeAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, bRC20Buyer.changeAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) bRC20Buyer.dummyOutAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bRC20Buyer.dummyOutAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) bRC20Buyer.nftReceiverAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, bRC20Buyer.nftReceiverAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(bRC20Buyer.dummyTxIn, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], bRC20Buyer.dummyTxIn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(bRC20Buyer.paymentTxIn, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], bRC20Buyer.paymentTxIn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(bRC20Buyer.nftTxIn, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], bRC20Buyer.nftTxIn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || bRC20Buyer.signatureList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], bRC20Buyer.signatureList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || bRC20Buyer.psbtTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, bRC20Buyer.psbtTx);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && bRC20Buyer.batchSize == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, bRC20Buyer.batchSize);
    }

    public BRC20Buyer(String str, String str2, String str3, String str4, String str5, List<BRC20SellerData> list, String str6, String str7, String str8, List<UTXOTxIn> list2, List<UTXOTxIn> list3, List<UTXOTxIn> list4, List<String> list5, String str9, Integer num) {
        this.fee = str;
        this.feeRate = str2;
        this.dummyOutAmount = str3;
        this.minOutput = str4;
        this.dustLimit = str5;
        this.sellerData = list;
        this.changeAddress = str6;
        this.dummyOutAddress = str7;
        this.nftReceiverAddress = str8;
        this.dummyTxIn = list2;
        this.paymentTxIn = list3;
        this.nftTxIn = list4;
        this.signatureList = list5;
        this.psbtTx = str9;
        this.batchSize = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:83)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0047: ARITH (r32v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004e: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0052: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:87)) : (r26v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0059: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:88)) : (r27v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0064: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:89)) : (r28v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006f: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r29v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0080: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.sign.utxo.BRC20SellerData>, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.wallet.core.sign.utxo.UTXOTxIn>, java.util.List<com.okinc.wallet.core.sign.utxo.UTXOTxIn>, java.util.List<com.okinc.wallet.core.sign.utxo.UTXOTxIn>, java.util.List<java.lang.String>, java.lang.String, java.lang.Integer):void (m)] (LINE:77) call: com.okinc.wallet.core.sign.utxo.BRC20Buyer.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ BRC20Buyer(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, List list2, List list3, List list4, List list5, String str9, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "", (i & 512) != 0 ? yDY.AhwBna() : list2, (i & 1024) != 0 ? yDY.AhwBna() : list3, (i & 2048) != 0 ? yDY.AhwBna() : list4, (i & 4096) != 0 ? null : list5, (i & 8192) != 0 ? null : str9, (i & 16384) == 0 ? num : null);
    }
}
