package com.okinc.business.defi.wallet.transfer.receive.exchange.bean;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ExchangeSelectNetworkBean implements Parcelable {
    public static final int $stable = 0;
    private final String assetAccountWalletCurrencies;
    private final Long coinId;
    private final String coinMetaAddress;
    private final String coinMetaSymbol;
    private final Integer estimatedArrivalTime;
    private final String gasFee;
    private final String gasFeeSymbol;
    private final String icon;
    private final String name;
    private final String networkName;
    private final Long realChainId;
    private final Integer subCurrencyId;
    private final String usdGasFee;
    private final String usdGasFeeSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ExchangeSelectNetworkBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ExchangeSelectNetworkBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeSelectNetworkBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeSelectNetworkBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeSelectNetworkBean[] newArray(int i) {
            return new ExchangeSelectNetworkBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.assetAccountWalletCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.coinMetaSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.coinMetaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.estimatedArrivalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.usdGasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeSelectNetworkBean copy(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Long l, Long l2, String str7, String str8, String str9, String str10) {
        return new ExchangeSelectNetworkBean(str, str2, str3, str4, str5, num, num2, str6, l, l2, str7, str8, str9, str10);
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
        if (!(obj instanceof ExchangeSelectNetworkBean)) {
            return false;
        }
        ExchangeSelectNetworkBean exchangeSelectNetworkBean = (ExchangeSelectNetworkBean) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) exchangeSelectNetworkBean.icon) && Intrinsics.EZpvd((Object) this.name, (Object) exchangeSelectNetworkBean.name) && Intrinsics.EZpvd((Object) this.gasFee, (Object) exchangeSelectNetworkBean.gasFee) && Intrinsics.EZpvd((Object) this.gasFeeSymbol, (Object) exchangeSelectNetworkBean.gasFeeSymbol) && Intrinsics.EZpvd((Object) this.usdGasFee, (Object) exchangeSelectNetworkBean.usdGasFee) && Intrinsics.EZpvd(this.estimatedArrivalTime, exchangeSelectNetworkBean.estimatedArrivalTime) && Intrinsics.EZpvd(this.subCurrencyId, exchangeSelectNetworkBean.subCurrencyId) && Intrinsics.EZpvd((Object) this.usdGasFeeSymbol, (Object) exchangeSelectNetworkBean.usdGasFeeSymbol) && Intrinsics.EZpvd(this.coinId, exchangeSelectNetworkBean.coinId) && Intrinsics.EZpvd(this.realChainId, exchangeSelectNetworkBean.realChainId) && Intrinsics.EZpvd((Object) this.networkName, (Object) exchangeSelectNetworkBean.networkName) && Intrinsics.EZpvd((Object) this.assetAccountWalletCurrencies, (Object) exchangeSelectNetworkBean.assetAccountWalletCurrencies) && Intrinsics.EZpvd((Object) this.coinMetaSymbol, (Object) exchangeSelectNetworkBean.coinMetaSymbol) && Intrinsics.EZpvd((Object) this.coinMetaAddress, (Object) exchangeSelectNetworkBean.coinMetaAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAssetAccountWalletCurrencies() {
        return this.assetAccountWalletCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinMetaAddress() {
        return this.coinMetaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinMetaSymbol() {
        return this.coinMetaSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEstimatedArrivalTime() {
        return this.estimatedArrivalTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFee() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFeeSymbol() {
        return this.gasFeeSymbol;
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
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getRealChainId() {
        return this.realChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdGasFee() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdGasFeeSymbol() {
        return this.usdGasFeeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.gasFee;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.gasFeeSymbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.usdGasFee;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.estimatedArrivalTime;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.subCurrencyId;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        String str6 = this.usdGasFeeSymbol;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Long l = this.coinId;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Long l2 = this.realChainId;
        int iHashCode10 = l2 == null ? 0 : l2.hashCode();
        String str7 = this.networkName;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.assetAccountWalletCurrencies;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.coinMetaSymbol;
        int iHashCode13 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.coinMetaAddress;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeSelectNetworkBean(icon=" + this.icon + ", name=" + this.name + ", gasFee=" + this.gasFee + ", gasFeeSymbol=" + this.gasFeeSymbol + ", usdGasFee=" + this.usdGasFee + ", estimatedArrivalTime=" + this.estimatedArrivalTime + ", subCurrencyId=" + this.subCurrencyId + ", usdGasFeeSymbol=" + this.usdGasFeeSymbol + ", coinId=" + this.coinId + ", realChainId=" + this.realChainId + ", networkName=" + this.networkName + ", assetAccountWalletCurrencies=" + this.assetAccountWalletCurrencies + ", coinMetaSymbol=" + this.coinMetaSymbol + ", coinMetaAddress=" + this.coinMetaAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.icon);
        parcel.writeString(this.name);
        parcel.writeString(this.gasFee);
        parcel.writeString(this.gasFeeSymbol);
        parcel.writeString(this.usdGasFee);
        Integer num = this.estimatedArrivalTime;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.subCurrencyId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.usdGasFeeSymbol);
        Long l = this.coinId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.realChainId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.networkName);
        parcel.writeString(this.assetAccountWalletCurrencies);
        parcel.writeString(this.coinMetaSymbol);
        parcel.writeString(this.coinMetaAddress);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectNetworkBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeSelectNetworkBean> serializer() {
            return ExchangeSelectNetworkBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeSelectNetworkBean(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Long l, Long l2, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1023, ExchangeSelectNetworkBean$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.name = str2;
        this.gasFee = str3;
        this.gasFeeSymbol = str4;
        this.usdGasFee = str5;
        this.estimatedArrivalTime = num;
        this.subCurrencyId = num2;
        this.usdGasFeeSymbol = str6;
        this.coinId = l;
        this.realChainId = l2;
        if ((i & 1024) == 0) {
            this.networkName = "";
        } else {
            this.networkName = str7;
        }
        if ((i & 2048) == 0) {
            this.assetAccountWalletCurrencies = "";
        } else {
            this.assetAccountWalletCurrencies = str8;
        }
        if ((i & 4096) == 0) {
            this.coinMetaSymbol = "";
        } else {
            this.coinMetaSymbol = str9;
        }
        if ((i & 8192) == 0) {
            this.coinMetaAddress = "";
        } else {
            this.coinMetaAddress = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ExchangeSelectNetworkBean exchangeSelectNetworkBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, exchangeSelectNetworkBean.icon);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, exchangeSelectNetworkBean.name);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, exchangeSelectNetworkBean.gasFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, exchangeSelectNetworkBean.gasFeeSymbol);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, exchangeSelectNetworkBean.usdGasFee);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, intSerializer, exchangeSelectNetworkBean.estimatedArrivalTime);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, intSerializer, exchangeSelectNetworkBean.subCurrencyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, exchangeSelectNetworkBean.usdGasFeeSymbol);
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, longSerializer, exchangeSelectNetworkBean.coinId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, longSerializer, exchangeSelectNetworkBean.realChainId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) exchangeSelectNetworkBean.networkName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, exchangeSelectNetworkBean.networkName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) exchangeSelectNetworkBean.assetAccountWalletCurrencies, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, exchangeSelectNetworkBean.assetAccountWalletCurrencies);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) exchangeSelectNetworkBean.coinMetaSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, exchangeSelectNetworkBean.coinMetaSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) && Intrinsics.EZpvd((Object) exchangeSelectNetworkBean.coinMetaAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, exchangeSelectNetworkBean.coinMetaAddress);
    }

    public ExchangeSelectNetworkBean(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Long l, Long l2, String str7, String str8, String str9, String str10) {
        this.icon = str;
        this.name = str2;
        this.gasFee = str3;
        this.gasFeeSymbol = str4;
        this.usdGasFee = str5;
        this.estimatedArrivalTime = num;
        this.subCurrencyId = num2;
        this.usdGasFeeSymbol = str6;
        this.coinId = l;
        this.realChainId = l2;
        this.networkName = str7;
        this.assetAccountWalletCurrencies = str8;
        this.coinMetaSymbol = str9;
        this.coinMetaAddress = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.Integer)
  (r25v0 java.lang.Integer)
  (r26v0 java.lang.String)
  (r27v0 java.lang.Long)
  (r28v0 java.lang.Long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r33v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r33v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:28) call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectNetworkBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ExchangeSelectNetworkBean(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Long l, Long l2, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, num, num2, str6, l, l2, (i & 1024) != 0 ? "" : str7, (i & 2048) != 0 ? "" : str8, (i & 4096) != 0 ? "" : str9, (i & 8192) != 0 ? "" : str10);
    }
}
