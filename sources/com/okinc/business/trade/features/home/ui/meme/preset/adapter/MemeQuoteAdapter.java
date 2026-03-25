package com.okinc.business.trade.features.home.ui.meme.preset.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC30985llV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeQuoteAdapter implements InterfaceC30985llV, Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MemeQuoteAdapter> CREATOR = new Creator();
    private final String chainId;
    private final String chainLogoUrl;
    private final boolean enableJito;
    private final String fromTokenAddress;
    private final String fromTokenAmount;
    private final String fromTokenPrice;
    private final String isEnableMev;
    private final String memeChainType;
    private final String receiveAmount;
    private final boolean supportEip1559;
    private final String toTokenAddress;
    private final String toTokenPrice;

    public static final class Creator implements Parcelable.Creator<MemeQuoteAdapter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeQuoteAdapter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeQuoteAdapter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeQuoteAdapter[] newArray(int i) {
            return new MemeQuoteAdapter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.memeChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeQuoteAdapter copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new MemeQuoteAdapter(str, str2, str3, z, str4, str5, str6, z2, str7, str8, str9, str10);
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
        if (!(obj instanceof MemeQuoteAdapter)) {
            return false;
        }
        MemeQuoteAdapter memeQuoteAdapter = (MemeQuoteAdapter) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) memeQuoteAdapter.chainId) && Intrinsics.EZpvd((Object) this.fromTokenPrice, (Object) memeQuoteAdapter.fromTokenPrice) && Intrinsics.EZpvd((Object) this.fromTokenAmount, (Object) memeQuoteAdapter.fromTokenAmount) && this.enableJito == memeQuoteAdapter.enableJito && Intrinsics.EZpvd((Object) this.receiveAmount, (Object) memeQuoteAdapter.receiveAmount) && Intrinsics.EZpvd((Object) this.toTokenPrice, (Object) memeQuoteAdapter.toTokenPrice) && Intrinsics.EZpvd((Object) this.isEnableMev, (Object) memeQuoteAdapter.isEnableMev) && this.supportEip1559 == memeQuoteAdapter.supportEip1559 && Intrinsics.EZpvd((Object) this.memeChainType, (Object) memeQuoteAdapter.memeChainType) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) memeQuoteAdapter.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) memeQuoteAdapter.toTokenAddress) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) memeQuoteAdapter.chainLogoUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30985llV
    public boolean getEnableJito() {
        return this.enableJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFromTokenAmount() {
        return this.fromTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFromTokenPrice() {
        return this.fromTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30985llV
    public String getMemeChainType() {
        return this.memeChainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getReceiveAmount() {
        return this.receiveAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30985llV
    public boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getToTokenPrice() {
        return this.toTokenPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.chainId.hashCode() * 31) + this.fromTokenPrice.hashCode()) * 31) + this.fromTokenAmount.hashCode()) * 31) + Boolean.hashCode(this.enableJito)) * 31) + this.receiveAmount.hashCode()) * 31) + this.toTokenPrice.hashCode()) * 31) + this.isEnableMev.hashCode()) * 31) + Boolean.hashCode(this.supportEip1559)) * 31) + this.memeChainType.hashCode()) * 31) + this.fromTokenAddress.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.chainLogoUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30985llV
    public String isEnableMev() {
        return this.isEnableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeQuoteAdapter(chainId=" + this.chainId + ", fromTokenPrice=" + this.fromTokenPrice + ", fromTokenAmount=" + this.fromTokenAmount + ", enableJito=" + this.enableJito + ", receiveAmount=" + this.receiveAmount + ", toTokenPrice=" + this.toTokenPrice + ", isEnableMev=" + this.isEnableMev + ", supportEip1559=" + this.supportEip1559 + ", memeChainType=" + this.memeChainType + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", chainLogoUrl=" + this.chainLogoUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.fromTokenPrice);
        parcel.writeString(this.fromTokenAmount);
        parcel.writeInt(this.enableJito ? 1 : 0);
        parcel.writeString(this.receiveAmount);
        parcel.writeString(this.toTokenPrice);
        parcel.writeString(this.isEnableMev);
        parcel.writeInt(this.supportEip1559 ? 1 : 0);
        parcel.writeString(this.memeChainType);
        parcel.writeString(this.fromTokenAddress);
        parcel.writeString(this.toTokenAddress);
        parcel.writeString(this.chainLogoUrl);
    }

    public MemeQuoteAdapter(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.chainId = str;
        this.fromTokenPrice = str2;
        this.fromTokenAmount = str3;
        this.enableJito = z;
        this.receiveAmount = str4;
        this.toTokenPrice = str5;
        this.isEnableMev = str6;
        this.supportEip1559 = z2;
        this.memeChainType = str7;
        this.fromTokenAddress = str8;
        this.toTokenAddress = str9;
        this.chainLogoUrl = str10;
    }

    public final String getFromTokenAmount(boolean z) {
        if (z) {
            return getReceiveAmount();
        }
        return getFromTokenAmount();
    }

    public final String getFromTokenAddress(boolean z) {
        if (z) {
            return getToTokenAddress();
        }
        return getFromTokenAddress();
    }

    public final String getToTokenAddress(boolean z) {
        if (z) {
            return getFromTokenAddress();
        }
        return getToTokenAddress();
    }
}
