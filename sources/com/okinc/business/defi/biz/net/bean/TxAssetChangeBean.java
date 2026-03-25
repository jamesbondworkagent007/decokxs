package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TxAssetChangeBean implements Parcelable {
    private String address;
    private String amount;
    private boolean brc20Coin;
    private Long coinId;
    private Integer decimalNum;
    private String direction;
    private String icon;
    private String name;
    private String nftCollectionIcon;
    private String nftCollectionName;
    private String nftId;
    private String nftImageUrl;
    private Integer protocolId;
    private String protocolName;
    private Integer vdecimalNum;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TxAssetChangeBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TxAssetChangeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxAssetChangeBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TxAssetChangeBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxAssetChangeBean[] newArray(int i) {
            return new TxAssetChangeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxAssetChangeBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, false, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, 32767, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nftCollectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.nftCollectionIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.nftImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component14() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.brc20Coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxAssetChangeBean copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, boolean z, String str7, String str8, String str9, String str10, Integer num3, Long l) {
        return new TxAssetChangeBean(str, str2, str3, str4, str5, str6, num, num2, z, str7, str8, str9, str10, num3, l);
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
        if (!(obj instanceof TxAssetChangeBean)) {
            return false;
        }
        TxAssetChangeBean txAssetChangeBean = (TxAssetChangeBean) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) txAssetChangeBean.amount) && Intrinsics.EZpvd((Object) this.direction, (Object) txAssetChangeBean.direction) && Intrinsics.EZpvd((Object) this.name, (Object) txAssetChangeBean.name) && Intrinsics.EZpvd((Object) this.icon, (Object) txAssetChangeBean.icon) && Intrinsics.EZpvd((Object) this.address, (Object) txAssetChangeBean.address) && Intrinsics.EZpvd((Object) this.nftId, (Object) txAssetChangeBean.nftId) && Intrinsics.EZpvd(this.vdecimalNum, txAssetChangeBean.vdecimalNum) && Intrinsics.EZpvd(this.decimalNum, txAssetChangeBean.decimalNum) && this.brc20Coin == txAssetChangeBean.brc20Coin && Intrinsics.EZpvd((Object) this.nftCollectionName, (Object) txAssetChangeBean.nftCollectionName) && Intrinsics.EZpvd((Object) this.nftCollectionIcon, (Object) txAssetChangeBean.nftCollectionIcon) && Intrinsics.EZpvd((Object) this.nftImageUrl, (Object) txAssetChangeBean.nftImageUrl) && Intrinsics.EZpvd((Object) this.protocolName, (Object) txAssetChangeBean.protocolName) && Intrinsics.EZpvd(this.protocolId, txAssetChangeBean.protocolId) && Intrinsics.EZpvd(this.coinId, txAssetChangeBean.coinId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBrc20Coin() {
        return this.brc20Coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftCollectionIcon() {
        return this.nftCollectionIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftCollectionName() {
        return this.nftCollectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftId() {
        return this.nftId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNftImageUrl() {
        return this.nftImageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProtocolId() {
        return this.protocolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProtocolName() {
        return this.protocolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVdecimalNum() {
        return this.vdecimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.direction;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.icon;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.address;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.nftId;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        Integer num = this.vdecimalNum;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.decimalNum;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        int iHashCode9 = Boolean.hashCode(this.brc20Coin);
        String str7 = this.nftCollectionName;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.nftCollectionIcon;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.nftImageUrl;
        int iHashCode12 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.protocolName;
        int iHashCode13 = str10 == null ? 0 : str10.hashCode();
        Integer num3 = this.protocolId;
        int iHashCode14 = num3 == null ? 0 : num3.hashCode();
        Long l = this.coinId;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(String str) {
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrc20Coin(boolean z) {
        this.brc20Coin = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDecimalNum(Integer num) {
        this.decimalNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(String str) {
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(String str) {
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftCollectionIcon(String str) {
        this.nftCollectionIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftCollectionName(String str) {
        this.nftCollectionName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftId(String str) {
        this.nftId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNftImageUrl(String str) {
        this.nftImageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolId(Integer num) {
        this.protocolId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProtocolName(String str) {
        this.protocolName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVdecimalNum(Integer num) {
        this.vdecimalNum = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxAssetChangeBean(amount=" + this.amount + ", direction=" + this.direction + ", name=" + this.name + ", icon=" + this.icon + ", address=" + this.address + ", nftId=" + this.nftId + ", vdecimalNum=" + this.vdecimalNum + ", decimalNum=" + this.decimalNum + ", brc20Coin=" + this.brc20Coin + ", nftCollectionName=" + this.nftCollectionName + ", nftCollectionIcon=" + this.nftCollectionIcon + ", nftImageUrl=" + this.nftImageUrl + ", protocolName=" + this.protocolName + ", protocolId=" + this.protocolId + ", coinId=" + this.coinId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.direction);
        parcel.writeString(this.name);
        parcel.writeString(this.icon);
        parcel.writeString(this.address);
        parcel.writeString(this.nftId);
        Integer num = this.vdecimalNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.decimalNum;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeInt(this.brc20Coin ? 1 : 0);
        parcel.writeString(this.nftCollectionName);
        parcel.writeString(this.nftCollectionIcon);
        parcel.writeString(this.nftImageUrl);
        parcel.writeString(this.protocolName);
        Integer num3 = this.protocolId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TxAssetChangeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxAssetChangeBean> serializer() {
            return TxAssetChangeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxAssetChangeBean(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, boolean z, String str7, String str8, String str9, String str10, Integer num3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = null;
        } else {
            this.amount = str;
        }
        this.direction = (i & 2) == 0 ? "" : str2;
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str4;
        }
        if ((i & 16) == 0) {
            this.address = null;
        } else {
            this.address = str5;
        }
        if ((i & 32) == 0) {
            this.nftId = null;
        } else {
            this.nftId = str6;
        }
        this.vdecimalNum = (i & 64) == 0 ? 0 : num;
        this.decimalNum = (i & 128) == 0 ? 0 : num2;
        if ((i & 256) == 0) {
            this.brc20Coin = false;
        } else {
            this.brc20Coin = z;
        }
        if ((i & 512) == 0) {
            this.nftCollectionName = null;
        } else {
            this.nftCollectionName = str7;
        }
        if ((i & 1024) == 0) {
            this.nftCollectionIcon = null;
        } else {
            this.nftCollectionIcon = str8;
        }
        if ((i & 2048) == 0) {
            this.nftImageUrl = null;
        } else {
            this.nftImageUrl = str9;
        }
        if ((i & 4096) == 0) {
            this.protocolName = null;
        } else {
            this.protocolName = str10;
        }
        this.protocolId = (i & 8192) == 0 ? 0 : num3;
        this.coinId = (i & 16384) == 0 ? -1L : l;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxAssetChangeBean txAssetChangeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        Integer num;
        Integer num2;
        Integer num3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || txAssetChangeBean.amount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, txAssetChangeBean.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) txAssetChangeBean.direction, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, txAssetChangeBean.direction);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || txAssetChangeBean.name != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, txAssetChangeBean.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || txAssetChangeBean.icon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, txAssetChangeBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || txAssetChangeBean.address != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, txAssetChangeBean.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || txAssetChangeBean.nftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, txAssetChangeBean.nftId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num3 = txAssetChangeBean.vdecimalNum) == null || num3.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, txAssetChangeBean.vdecimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || (num2 = txAssetChangeBean.decimalNum) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, txAssetChangeBean.decimalNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || txAssetChangeBean.brc20Coin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 8, txAssetChangeBean.brc20Coin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || txAssetChangeBean.nftCollectionName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, txAssetChangeBean.nftCollectionName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || txAssetChangeBean.nftCollectionIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, txAssetChangeBean.nftCollectionIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || txAssetChangeBean.nftImageUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, txAssetChangeBean.nftImageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || txAssetChangeBean.protocolName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, txAssetChangeBean.protocolName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || (num = txAssetChangeBean.protocolId) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, txAssetChangeBean.protocolId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || (l = txAssetChangeBean.coinId) == null || l.longValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, txAssetChangeBean.coinId);
        }
    }

    public TxAssetChangeBean(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, boolean z, String str7, String str8, String str9, String str10, Integer num3, Long l) {
        this.amount = str;
        this.direction = str2;
        this.name = str3;
        this.icon = str4;
        this.address = str5;
        this.nftId = str6;
        this.vdecimalNum = num;
        this.decimalNum = num2;
        this.brc20Coin = z;
        this.nftCollectionName = str7;
        this.nftCollectionIcon = str8;
        this.nftImageUrl = str9;
        this.protocolName = str10;
        this.protocolId = num3;
        this.coinId = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00aa: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r33v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r33v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r33v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0034: ARITH (r33v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0040: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004b: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0072: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x007d: ARITH (r33v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r32v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long):void (m)] (LINE:201) call: com.okinc.business.defi.biz.net.bean.TxAssetChangeBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ TxAssetChangeBean(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, boolean z, String str7, String str8, String str9, String str10, Integer num3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? 0 : num, (i & 128) != 0 ? 0 : num2, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & 4096) == 0 ? str10 : null, (i & 8192) != 0 ? 0 : num3, (i & 16384) != 0 ? -1L : l);
    }
}
