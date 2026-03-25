package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class UTXOAddressInfoReq implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    public static final int NOT_ENOUGH_FUND_ERROR_CODE = 10004;
    public static final int NOT_ENOUGH_NFT_FUND_ERROR_CODE = 100042;
    public static final int NOT_ENOUGH_TRANSFER_FUND_ERROR_CODE = 100041;
    public static final int SPEED_UP_NOT_SUPPORTED_ERROR_CODE = 400002;
    public static final int UTXO_RISK_ERROR_CODE = 1100004;
    public static final int UTXO_TYPE_BATCH_DUMMY = 13;
    public static final int UTXO_TYPE_BRC20 = 4;
    public static final int UTXO_TYPE_BRC20S = 10;
    public static final int UTXO_TYPE_CPFP_SPEED_UP = 15;
    public static final int UTXO_TYPE_DUMMY = 6;
    public static final int UTXO_TYPE_HAS_NFT = 2;
    public static final int UTXO_TYPE_LOCKED_NFT = 8;
    public static final int UTXO_TYPE_NOT_HAS_NFT_UTXO = 11;
    public static final int UTXO_TYPE_NO_NFT = 1;
    public static final int UTXO_TYPE_UNLOCKED_NFT = 7;
    public static final int WRONG_PARAMETER_ERROR_CODE = 10001;
    private String address;
    private Integer batchDummyNum;
    private String coinAmount;
    private Integer from;
    private List<String> needFilteredUtxo;
    private String nftId;
    private Integer protocolId;
    private String serviceCharge;
    private Integer size;
    private List<String> speedUpNeedUtxo;
    private Integer tempFeeRate;
    private String tick;
    private String tid;
    private String txHash;
    private Integer utxoType;
    private Integer vout;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UTXOAddressInfoReq> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UTXOAddressInfoReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOAddressInfoReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UTXOAddressInfoReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UTXOAddressInfoReq[] newArray(int i) {
            return new UTXOAddressInfoReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UTXOAddressInfoReq() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (List) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (List) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.needFilteredUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.batchDummyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.tempFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component13() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component16() {
        return this.speedUpNeedUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UTXOAddressInfoReq copy(String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5, String str6, List<String> list, Integer num4, Integer num5, Integer num6, String str7, Integer num7, List<String> list2) {
        return new UTXOAddressInfoReq(str, str2, str3, num, str4, num2, num3, str5, str6, list, num4, num5, num6, str7, num7, list2);
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
        if (!(obj instanceof UTXOAddressInfoReq)) {
            return false;
        }
        UTXOAddressInfoReq uTXOAddressInfoReq = (UTXOAddressInfoReq) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) uTXOAddressInfoReq.address) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) uTXOAddressInfoReq.coinAmount) && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) uTXOAddressInfoReq.serviceCharge) && Intrinsics.EZpvd(this.utxoType, uTXOAddressInfoReq.utxoType) && Intrinsics.EZpvd((Object) this.nftId, (Object) uTXOAddressInfoReq.nftId) && Intrinsics.EZpvd(this.from, uTXOAddressInfoReq.from) && Intrinsics.EZpvd(this.size, uTXOAddressInfoReq.size) && Intrinsics.EZpvd((Object) this.tick, (Object) uTXOAddressInfoReq.tick) && Intrinsics.EZpvd((Object) this.tid, (Object) uTXOAddressInfoReq.tid) && Intrinsics.EZpvd(this.needFilteredUtxo, uTXOAddressInfoReq.needFilteredUtxo) && Intrinsics.EZpvd(this.batchDummyNum, uTXOAddressInfoReq.batchDummyNum) && Intrinsics.EZpvd(this.tempFeeRate, uTXOAddressInfoReq.tempFeeRate) && Intrinsics.EZpvd(this.protocolId, uTXOAddressInfoReq.protocolId) && Intrinsics.EZpvd((Object) this.txHash, (Object) uTXOAddressInfoReq.txHash) && Intrinsics.EZpvd(this.vout, uTXOAddressInfoReq.vout) && Intrinsics.EZpvd(this.speedUpNeedUtxo, uTXOAddressInfoReq.speedUpNeedUtxo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBatchDummyNum() {
        return this.batchDummyNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getNeedFilteredUtxo() {
        return this.needFilteredUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSize() {
        return this.size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSpeedUpNeedUtxo() {
        return this.speedUpNeedUtxo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTempFeeRate() {
        return this.tempFeeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTick() {
        return this.tick;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTid() {
        return this.tid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUtxoType() {
        return this.utxoType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVout() {
        return this.vout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.address;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coinAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.serviceCharge;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.utxoType;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str4 = this.nftId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Integer num2 = this.from;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.size;
        int iHashCode7 = num3 == null ? 0 : num3.hashCode();
        String str5 = this.tick;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tid;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        List<String> list = this.needFilteredUtxo;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        Integer num4 = this.batchDummyNum;
        int iHashCode11 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.tempFeeRate;
        int iHashCode12 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.protocolId;
        int iHashCode13 = num6 == null ? 0 : num6.hashCode();
        String str7 = this.txHash;
        int iHashCode14 = str7 == null ? 0 : str7.hashCode();
        Integer num7 = this.vout;
        int iHashCode15 = num7 == null ? 0 : num7.hashCode();
        List<String> list2 = this.speedUpNeedUtxo;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (list2 == null ? 0 : list2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchDummyNum(Integer num) {
        this.batchDummyNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(String str) {
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(Integer num) {
        this.from = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedFilteredUtxo(List<String> list) {
        this.needFilteredUtxo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(String str) {
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceCharge(String str) {
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSize(Integer num) {
        this.size = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSpeedUpNeedUtxo(List<String> list) {
        this.speedUpNeedUtxo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTempFeeRate(Integer num) {
        this.tempFeeRate = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTick(String str) {
        this.tick = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTid(String str) {
        this.tid = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUtxoType(Integer num) {
        this.utxoType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVout(Integer num) {
        this.vout = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UTXOAddressInfoReq(address=" + this.address + ", coinAmount=" + this.coinAmount + ", serviceCharge=" + this.serviceCharge + ", utxoType=" + this.utxoType + ", nftId=" + this.nftId + ", from=" + this.from + ", size=" + this.size + ", tick=" + this.tick + ", tid=" + this.tid + ", needFilteredUtxo=" + this.needFilteredUtxo + ", batchDummyNum=" + this.batchDummyNum + ", tempFeeRate=" + this.tempFeeRate + ", protocolId=" + this.protocolId + ", txHash=" + this.txHash + ", vout=" + this.vout + ", speedUpNeedUtxo=" + this.speedUpNeedUtxo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.serviceCharge);
        Integer num = this.utxoType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.nftId);
        Integer num2 = this.from;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.size;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeString(this.tick);
        parcel.writeString(this.tid);
        parcel.writeStringList(this.needFilteredUtxo);
        Integer num4 = this.batchDummyNum;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.tempFeeRate;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.protocolId;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.txHash);
        Integer num7 = this.vout;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num7.intValue());
        }
        parcel.writeStringList(this.speedUpNeedUtxo);
    }

    public /* synthetic */ UTXOAddressInfoReq(int i, String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5, String str6, List list, Integer num4, Integer num5, Integer num6, String str7, Integer num7, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.address = null;
        } else {
            this.address = str;
        }
        if ((i & 2) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str2;
        }
        if ((i & 4) == 0) {
            this.serviceCharge = null;
        } else {
            this.serviceCharge = str3;
        }
        if ((i & 8) == 0) {
            this.utxoType = null;
        } else {
            this.utxoType = num;
        }
        if ((i & 16) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str4;
        }
        if ((i & 32) == 0) {
            this.from = null;
        } else {
            this.from = num2;
        }
        if ((i & 64) == 0) {
            this.size = null;
        } else {
            this.size = num3;
        }
        if ((i & 128) == 0) {
            this.tick = null;
        } else {
            this.tick = str5;
        }
        if ((i & 256) == 0) {
            this.tid = null;
        } else {
            this.tid = str6;
        }
        if ((i & 512) == 0) {
            this.needFilteredUtxo = null;
        } else {
            this.needFilteredUtxo = list;
        }
        if ((i & 1024) == 0) {
            this.batchDummyNum = null;
        } else {
            this.batchDummyNum = num4;
        }
        if ((i & 2048) == 0) {
            this.tempFeeRate = null;
        } else {
            this.tempFeeRate = num5;
        }
        if ((i & 4096) == 0) {
            this.protocolId = null;
        } else {
            this.protocolId = num6;
        }
        if ((i & 8192) == 0) {
            this.txHash = null;
        } else {
            this.txHash = str7;
        }
        if ((i & 16384) == 0) {
            this.vout = null;
        } else {
            this.vout = num7;
        }
        if ((i & 32768) == 0) {
            this.speedUpNeedUtxo = null;
        } else {
            this.speedUpNeedUtxo = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(UTXOAddressInfoReq uTXOAddressInfoReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || uTXOAddressInfoReq.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, uTXOAddressInfoReq.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uTXOAddressInfoReq.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uTXOAddressInfoReq.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uTXOAddressInfoReq.serviceCharge != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, uTXOAddressInfoReq.serviceCharge);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || uTXOAddressInfoReq.utxoType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, uTXOAddressInfoReq.utxoType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uTXOAddressInfoReq.nftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, uTXOAddressInfoReq.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || uTXOAddressInfoReq.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, uTXOAddressInfoReq.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || uTXOAddressInfoReq.size != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, uTXOAddressInfoReq.size);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || uTXOAddressInfoReq.tick != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, uTXOAddressInfoReq.tick);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || uTXOAddressInfoReq.tid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, uTXOAddressInfoReq.tid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || uTXOAddressInfoReq.needFilteredUtxo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], uTXOAddressInfoReq.needFilteredUtxo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || uTXOAddressInfoReq.batchDummyNum != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, uTXOAddressInfoReq.batchDummyNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || uTXOAddressInfoReq.tempFeeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, uTXOAddressInfoReq.tempFeeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || uTXOAddressInfoReq.protocolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, uTXOAddressInfoReq.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || uTXOAddressInfoReq.txHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, uTXOAddressInfoReq.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || uTXOAddressInfoReq.vout != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, uTXOAddressInfoReq.vout);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && uTXOAddressInfoReq.speedUpNeedUtxo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, kSerializerArr[15], uTXOAddressInfoReq.speedUpNeedUtxo);
    }

    public UTXOAddressInfoReq(String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5, String str6, List<String> list, Integer num4, Integer num5, Integer num6, String str7, Integer num7, List<String> list2) {
        this.address = str;
        this.coinAmount = str2;
        this.serviceCharge = str3;
        this.utxoType = num;
        this.nftId = str4;
        this.from = num2;
        this.size = num3;
        this.tick = str5;
        this.tid = str6;
        this.needFilteredUtxo = list;
        this.batchDummyNum = num4;
        this.tempFeeRate = num5;
        this.protocolId = num6;
        this.txHash = str7;
        this.vout = num7;
        this.speedUpNeedUtxo = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a7: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001a: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002a: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r23v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0032: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r24v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r27v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r28v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005a: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0062: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0072: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x007d: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r33v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.util.List<java.lang.String>):void (m)] (LINE:30) call: com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer, java.util.List):void type: THIS */
    public /* synthetic */ UTXOAddressInfoReq(String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5, String str6, List list, Integer num4, Integer num5, Integer num6, String str7, Integer num7, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : num4, (i & 2048) != 0 ? null : num5, (i & 4096) != 0 ? null : num6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : num7, (i & 32768) != 0 ? null : list2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.UTXOAddressInfoReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<UTXOAddressInfoReq> serializer() {
            return UTXOAddressInfoReq$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, null, null, null, new ArrayListSerializer(stringSerializer)};
    }
}
