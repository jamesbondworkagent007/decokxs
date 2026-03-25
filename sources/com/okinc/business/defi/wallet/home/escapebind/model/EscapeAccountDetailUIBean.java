package com.okinc.business.defi.wallet.home.escapebind.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class EscapeAccountDetailUIBean implements Parcelable {
    private final String address;
    private final String chainIndex;
    private final String chainName;
    private String coinAmount;
    private final long coinId;
    private String currencyAmount;
    private final int decimalNum;
    private final int displayPrecision;
    private final boolean isMainCoin;
    private final String logo;
    private final String name;
    private String originalCoinAmount;
    private final long riskType;
    private final String symbol;
    private final String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeAccountDetailUIBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EscapeAccountDetailUIBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountDetailUIBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeAccountDetailUIBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeAccountDetailUIBean[] newArray(int i) {
            return new EscapeAccountDetailUIBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.originalCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component14() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeAccountDetailUIBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, int i2, @NotNull String str10, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new EscapeAccountDetailUIBean(str, str2, str3, str4, j, str5, str6, str7, str8, str9, i, i2, str10, j2, z);
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
        if (!(obj instanceof EscapeAccountDetailUIBean)) {
            return false;
        }
        EscapeAccountDetailUIBean escapeAccountDetailUIBean = (EscapeAccountDetailUIBean) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) escapeAccountDetailUIBean.address) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) escapeAccountDetailUIBean.tokenAddress) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) escapeAccountDetailUIBean.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) escapeAccountDetailUIBean.chainName) && this.coinId == escapeAccountDetailUIBean.coinId && Intrinsics.EZpvd((Object) this.symbol, (Object) escapeAccountDetailUIBean.symbol) && Intrinsics.EZpvd((Object) this.name, (Object) escapeAccountDetailUIBean.name) && Intrinsics.EZpvd((Object) this.logo, (Object) escapeAccountDetailUIBean.logo) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) escapeAccountDetailUIBean.coinAmount) && Intrinsics.EZpvd((Object) this.originalCoinAmount, (Object) escapeAccountDetailUIBean.originalCoinAmount) && this.decimalNum == escapeAccountDetailUIBean.decimalNum && this.displayPrecision == escapeAccountDetailUIBean.displayPrecision && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) escapeAccountDetailUIBean.currencyAmount) && this.riskType == escapeAccountDetailUIBean.riskType && this.isMainCoin == escapeAccountDetailUIBean.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimalNum() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDisplayPrecision() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginalCoinAmount() {
        return this.originalCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRiskType() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((this.address.hashCode() * 31) + this.tokenAddress.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + this.chainName.hashCode()) * 31) + Long.hashCode(this.coinId)) * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31) + this.logo.hashCode()) * 31) + this.coinAmount.hashCode()) * 31) + this.originalCoinAmount.hashCode()) * 31) + Integer.hashCode(this.decimalNum)) * 31) + Integer.hashCode(this.displayPrecision)) * 31) + this.currencyAmount.hashCode()) * 31) + Long.hashCode(this.riskType)) * 31) + Boolean.hashCode(this.isMainCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMainCoin() {
        return this.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginalCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originalCoinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeAccountDetailUIBean(address=" + this.address + ", tokenAddress=" + this.tokenAddress + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", coinId=" + this.coinId + ", symbol=" + this.symbol + ", name=" + this.name + ", logo=" + this.logo + ", coinAmount=" + this.coinAmount + ", originalCoinAmount=" + this.originalCoinAmount + ", decimalNum=" + this.decimalNum + ", displayPrecision=" + this.displayPrecision + ", currencyAmount=" + this.currencyAmount + ", riskType=" + this.riskType + ", isMainCoin=" + this.isMainCoin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeLong(this.coinId);
        parcel.writeString(this.symbol);
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.originalCoinAmount);
        parcel.writeInt(this.decimalNum);
        parcel.writeInt(this.displayPrecision);
        parcel.writeString(this.currencyAmount);
        parcel.writeLong(this.riskType);
        parcel.writeInt(this.isMainCoin ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetailUIBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeAccountDetailUIBean> serializer() {
            return EscapeAccountDetailUIBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeAccountDetailUIBean(int i, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, String str9, int i2, int i3, String str10, long j2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (32767 != (i & 32767)) {
            PluginExceptionsKt.throwMissingFieldException(i, 32767, EscapeAccountDetailUIBean$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.tokenAddress = str2;
        this.chainIndex = str3;
        this.chainName = str4;
        this.coinId = j;
        this.symbol = str5;
        this.name = str6;
        this.logo = str7;
        this.coinAmount = str8;
        this.originalCoinAmount = str9;
        this.decimalNum = i2;
        this.displayPrecision = i3;
        this.currencyAmount = str10;
        this.riskType = j2;
        this.isMainCoin = z;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeAccountDetailUIBean escapeAccountDetailUIBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, escapeAccountDetailUIBean.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, escapeAccountDetailUIBean.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, escapeAccountDetailUIBean.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, escapeAccountDetailUIBean.chainName);
        compositeEncoder.encodeLongElement(serialDescriptor, 4, escapeAccountDetailUIBean.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, escapeAccountDetailUIBean.symbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, escapeAccountDetailUIBean.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, escapeAccountDetailUIBean.logo);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, escapeAccountDetailUIBean.coinAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, escapeAccountDetailUIBean.originalCoinAmount);
        compositeEncoder.encodeIntElement(serialDescriptor, 10, escapeAccountDetailUIBean.decimalNum);
        compositeEncoder.encodeIntElement(serialDescriptor, 11, escapeAccountDetailUIBean.displayPrecision);
        compositeEncoder.encodeStringElement(serialDescriptor, 12, escapeAccountDetailUIBean.currencyAmount);
        compositeEncoder.encodeLongElement(serialDescriptor, 13, escapeAccountDetailUIBean.riskType);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 14, escapeAccountDetailUIBean.isMainCoin);
    }

    public EscapeAccountDetailUIBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, int i2, @NotNull String str10, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.address = str;
        this.tokenAddress = str2;
        this.chainIndex = str3;
        this.chainName = str4;
        this.coinId = j;
        this.symbol = str5;
        this.name = str6;
        this.logo = str7;
        this.coinAmount = str8;
        this.originalCoinAmount = str9;
        this.decimalNum = i;
        this.displayPrecision = i2;
        this.currencyAmount = str10;
        this.riskType = j2;
        this.isMainCoin = z;
    }
}
