package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AddressCoinHistoryDetail implements Parcelable {
    private String address;
    private Long chainId;
    private String chainSymbol;
    private String coinAmount;
    private String coinSymbol;
    private String direction;
    private String from;
    private boolean isShowPending;
    private String network;
    private int orderType;
    private String rowId;
    private String serviceCharge;
    private String to;
    private int txStatus;
    private Long txTime;
    private int txType;
    private String txhash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressCoinHistoryDetail> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressCoinHistoryDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinHistoryDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressCoinHistoryDetail(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressCoinHistoryDetail[] newArray(int i) {
            return new AddressCoinHistoryDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressCoinHistoryDetail() {
        this((String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (Long) null, 0, (String) null, (String) null, (String) null, (Long) null, (String) null, false, (String) null, 0, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component13() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.isShowPending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressCoinHistoryDetail copy(String str, String str2, String str3, String str4, int i, String str5, String str6, Long l, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, Long l2, @NotNull String str10, boolean z, @NotNull String str11, int i3) {
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new AddressCoinHistoryDetail(str, str2, str3, str4, i, str5, str6, l, i2, str7, str8, str9, l2, str10, z, str11, i3);
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
        if (!(obj instanceof AddressCoinHistoryDetail)) {
            return false;
        }
        AddressCoinHistoryDetail addressCoinHistoryDetail = (AddressCoinHistoryDetail) obj;
        return Intrinsics.EZpvd((Object) this.txhash, (Object) addressCoinHistoryDetail.txhash) && Intrinsics.EZpvd((Object) this.address, (Object) addressCoinHistoryDetail.address) && Intrinsics.EZpvd((Object) this.from, (Object) addressCoinHistoryDetail.from) && Intrinsics.EZpvd((Object) this.to, (Object) addressCoinHistoryDetail.to) && this.txType == addressCoinHistoryDetail.txType && Intrinsics.EZpvd((Object) this.coinAmount, (Object) addressCoinHistoryDetail.coinAmount) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) addressCoinHistoryDetail.coinSymbol) && Intrinsics.EZpvd(this.txTime, addressCoinHistoryDetail.txTime) && this.txStatus == addressCoinHistoryDetail.txStatus && Intrinsics.EZpvd((Object) this.rowId, (Object) addressCoinHistoryDetail.rowId) && Intrinsics.EZpvd((Object) this.direction, (Object) addressCoinHistoryDetail.direction) && Intrinsics.EZpvd((Object) this.network, (Object) addressCoinHistoryDetail.network) && Intrinsics.EZpvd(this.chainId, addressCoinHistoryDetail.chainId) && Intrinsics.EZpvd((Object) this.chainSymbol, (Object) addressCoinHistoryDetail.chainSymbol) && this.isShowPending == addressCoinHistoryDetail.isShowPending && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) addressCoinHistoryDetail.serviceCharge) && this.orderType == addressCoinHistoryDetail.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainSymbol() {
        return this.chainSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinSymbol() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRowId() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxStatus() {
        return this.txStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTxTime() {
        return this.txTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxhash() {
        return this.txhash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.txhash;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.address;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.from;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.to;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        int iHashCode5 = Integer.hashCode(this.txType);
        String str5 = this.coinAmount;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.coinSymbol;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        Long l = this.txTime;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        int iHashCode9 = Integer.hashCode(this.txStatus);
        int iHashCode10 = this.rowId.hashCode();
        int iHashCode11 = this.direction.hashCode();
        int iHashCode12 = this.network.hashCode();
        Long l2 = this.chainId;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (l2 != null ? l2.hashCode() : 0)) * 31) + this.chainSymbol.hashCode()) * 31) + Boolean.hashCode(this.isShowPending)) * 31) + this.serviceCharge.hashCode()) * 31) + Integer.hashCode(this.orderType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowPending() {
        return this.isShowPending;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(String str) {
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSymbol(String str) {
        this.coinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(String str) {
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.network = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrderType(int i) {
        this.orderType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRowId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rowId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceCharge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowPending(boolean z) {
        this.isShowPending = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(String str) {
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxStatus(int i) {
        this.txStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxTime(Long l) {
        this.txTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(int i) {
        this.txType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxhash(String str) {
        this.txhash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressCoinHistoryDetail(txhash=" + this.txhash + ", address=" + this.address + ", from=" + this.from + ", to=" + this.to + ", txType=" + this.txType + ", coinAmount=" + this.coinAmount + ", coinSymbol=" + this.coinSymbol + ", txTime=" + this.txTime + ", txStatus=" + this.txStatus + ", rowId=" + this.rowId + ", direction=" + this.direction + ", network=" + this.network + ", chainId=" + this.chainId + ", chainSymbol=" + this.chainSymbol + ", isShowPending=" + this.isShowPending + ", serviceCharge=" + this.serviceCharge + ", orderType=" + this.orderType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txhash);
        parcel.writeString(this.address);
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeInt(this.txType);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinSymbol);
        Long l = this.txTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.txStatus);
        parcel.writeString(this.rowId);
        parcel.writeString(this.direction);
        parcel.writeString(this.network);
        Long l2 = this.chainId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.chainSymbol);
        parcel.writeInt(this.isShowPending ? 1 : 0);
        parcel.writeString(this.serviceCharge);
        parcel.writeInt(this.orderType);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressCoinHistoryDetail> serializer() {
            return AddressCoinHistoryDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressCoinHistoryDetail(int i, String str, String str2, String str3, String str4, int i2, String str5, String str6, Long l, int i3, String str7, String str8, String str9, Long l2, String str10, boolean z, String str11, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.txhash = "";
        } else {
            this.txhash = str;
        }
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str2;
        }
        if ((i & 4) == 0) {
            this.from = "";
        } else {
            this.from = str3;
        }
        if ((i & 8) == 0) {
            this.to = "";
        } else {
            this.to = str4;
        }
        if ((i & 16) == 0) {
            this.txType = 0;
        } else {
            this.txType = i2;
        }
        if ((i & 32) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str5;
        }
        if ((i & 64) == 0) {
            this.coinSymbol = "";
        } else {
            this.coinSymbol = str6;
        }
        this.txTime = (i & 128) == 0 ? 0L : l;
        if ((i & 256) == 0) {
            this.txStatus = 0;
        } else {
            this.txStatus = i3;
        }
        if ((i & 512) == 0) {
            this.rowId = "";
        } else {
            this.rowId = str7;
        }
        if ((i & 1024) == 0) {
            this.direction = "";
        } else {
            this.direction = str8;
        }
        if ((i & 2048) == 0) {
            this.network = "";
        } else {
            this.network = str9;
        }
        this.chainId = (i & 4096) == 0 ? -1L : l2;
        if ((i & 8192) == 0) {
            this.chainSymbol = "";
        } else {
            this.chainSymbol = str10;
        }
        if ((i & 16384) == 0) {
            this.isShowPending = false;
        } else {
            this.isShowPending = z;
        }
        if ((32768 & i) == 0) {
            this.serviceCharge = "";
        } else {
            this.serviceCharge = str11;
        }
        if ((i & 65536) == 0) {
            this.orderType = 0;
        } else {
            this.orderType = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressCoinHistoryDetail addressCoinHistoryDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Long l2;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.txhash, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, addressCoinHistoryDetail.txhash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.address, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, addressCoinHistoryDetail.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.from, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, addressCoinHistoryDetail.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.to, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, addressCoinHistoryDetail.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || addressCoinHistoryDetail.txType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, addressCoinHistoryDetail.txType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.coinAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, addressCoinHistoryDetail.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.coinSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, addressCoinHistoryDetail.coinSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (l2 = addressCoinHistoryDetail.txTime) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, addressCoinHistoryDetail.txTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || addressCoinHistoryDetail.txStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, addressCoinHistoryDetail.txStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.rowId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, addressCoinHistoryDetail.rowId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.direction, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, addressCoinHistoryDetail.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, addressCoinHistoryDetail.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || (l = addressCoinHistoryDetail.chainId) == null || l.longValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, addressCoinHistoryDetail.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.chainSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, addressCoinHistoryDetail.chainSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || addressCoinHistoryDetail.isShowPending) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, addressCoinHistoryDetail.isShowPending);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) addressCoinHistoryDetail.serviceCharge, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, addressCoinHistoryDetail.serviceCharge);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && addressCoinHistoryDetail.orderType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 16, addressCoinHistoryDetail.orderType);
    }

    public AddressCoinHistoryDetail(String str, String str2, String str3, String str4, int i, String str5, String str6, Long l, int i2, @NotNull String str7, @NotNull String str8, @NotNull String str9, Long l2, @NotNull String str10, boolean z, @NotNull String str11, int i3) {
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.txhash = str;
        this.address = str2;
        this.from = str3;
        this.to = str4;
        this.txType = i;
        this.coinAmount = str5;
        this.coinSymbol = str6;
        this.txTime = l;
        this.txStatus = i2;
        this.rowId = str7;
        this.direction = str8;
        this.network = str9;
        this.chainId = l2;
        this.chainSymbol = str10;
        this.isShowPending = z;
        this.serviceCharge = str11;
        this.orderType = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c2: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r26v0 java.lang.Long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0049: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0061: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0069: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r31v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0080: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0096: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, boolean, java.lang.String, int):void (m)] (LINE:1816) call: com.okinc.business.defi.biz.net.bean.AddressCoinHistoryDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, boolean, java.lang.String, int):void type: THIS */
    public /* synthetic */ AddressCoinHistoryDetail(String str, String str2, String str3, String str4, int i, String str5, String str6, Long l, int i2, String str7, String str8, String str9, Long l2, String str10, boolean z, String str11, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? "" : str4, (i4 & 16) != 0 ? 0 : i, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? 0L : l, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? "" : str7, (i4 & 1024) != 0 ? "" : str8, (i4 & 2048) != 0 ? "" : str9, (i4 & 4096) != 0 ? -1L : l2, (i4 & 8192) != 0 ? "" : str10, (i4 & 16384) != 0 ? false : z, (i4 & 32768) != 0 ? "" : str11, (i4 & 65536) != 0 ? 0 : i3);
    }
}
