package com.okinc.wallet.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletBtcAddressBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WalletBtcAddressBean> CREATOR = new Creator();
    private final String address;
    private final int addressType;
    private String balance;
    private final String coinSymbol;
    private final String displayBalance;

    public static final class Creator implements Parcelable.Creator<WalletBtcAddressBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletBtcAddressBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletBtcAddressBean(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletBtcAddressBean[] newArray(int i) {
            return new WalletBtcAddressBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletBtcAddressBean copy$default(WalletBtcAddressBean walletBtcAddressBean, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = walletBtcAddressBean.address;
        }
        if ((i2 & 2) != 0) {
            i = walletBtcAddressBean.addressType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = walletBtcAddressBean.balance;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = walletBtcAddressBean.displayBalance;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = walletBtcAddressBean.coinSymbol;
        }
        return walletBtcAddressBean.copy(str, i3, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletBtcAddressBean copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new WalletBtcAddressBean(str, i, str2, str3, str4);
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
        if (!(obj instanceof WalletBtcAddressBean)) {
            return false;
        }
        WalletBtcAddressBean walletBtcAddressBean = (WalletBtcAddressBean) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) walletBtcAddressBean.address) && this.addressType == walletBtcAddressBean.addressType && Intrinsics.EZpvd((Object) this.balance, (Object) walletBtcAddressBean.balance) && Intrinsics.EZpvd((Object) this.displayBalance, (Object) walletBtcAddressBean.displayBalance) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) walletBtcAddressBean.coinSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinSymbol() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayBalance() {
        return this.displayBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.address.hashCode() * 31) + Integer.hashCode(this.addressType)) * 31) + this.balance.hashCode()) * 31) + this.displayBalance.hashCode()) * 31) + this.coinSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletBtcAddressBean(address=" + this.address + ", addressType=" + this.addressType + ", balance=" + this.balance + ", displayBalance=" + this.displayBalance + ", coinSymbol=" + this.coinSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeInt(this.addressType);
        parcel.writeString(this.balance);
        parcel.writeString(this.displayBalance);
        parcel.writeString(this.coinSymbol);
    }

    public WalletBtcAddressBean(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.address = str;
        this.addressType = i;
        this.balance = str2;
        this.displayBalance = str3;
        this.coinSymbol = str4;
    }
}
