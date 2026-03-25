package com.okinc.business.defi.wallet.tx.send;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class CeDeFiAAAssetInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CeDeFiAAAssetInfo> CREATOR = new Creator();
    private final String accountId;
    private final String address;
    private final String balance;
    private final String chainIndex;
    private final long coinId;
    private final int decimalNum;
    private final int displayPrecision;
    private final boolean isMainCoin;
    private final String logo;
    private final String symbol;
    private final String tokenAddress;
    private final String usdValue;

    public static final class Creator implements Parcelable.Creator<CeDeFiAAAssetInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDeFiAAAssetInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CeDeFiAAAssetInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CeDeFiAAAssetInfo[] newArray(int i) {
            return new CeDeFiAAAssetInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.usdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.decimalNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.displayPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDeFiAAAssetInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, int i2, @NotNull String str7, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CeDeFiAAAssetInfo(str, str2, str3, j, str4, str5, str6, i, i2, str7, str8, z);
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
        if (!(obj instanceof CeDeFiAAAssetInfo)) {
            return false;
        }
        CeDeFiAAAssetInfo ceDeFiAAAssetInfo = (CeDeFiAAAssetInfo) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) ceDeFiAAAssetInfo.accountId) && Intrinsics.EZpvd((Object) this.address, (Object) ceDeFiAAAssetInfo.address) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) ceDeFiAAAssetInfo.chainIndex) && this.coinId == ceDeFiAAAssetInfo.coinId && Intrinsics.EZpvd((Object) this.symbol, (Object) ceDeFiAAAssetInfo.symbol) && Intrinsics.EZpvd((Object) this.balance, (Object) ceDeFiAAAssetInfo.balance) && Intrinsics.EZpvd((Object) this.usdValue, (Object) ceDeFiAAAssetInfo.usdValue) && this.decimalNum == ceDeFiAAAssetInfo.decimalNum && this.displayPrecision == ceDeFiAAAssetInfo.displayPrecision && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) ceDeFiAAAssetInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.logo, (Object) ceDeFiAAAssetInfo.logo) && this.isMainCoin == ceDeFiAAAssetInfo.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
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
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdValue() {
        return this.usdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.accountId.hashCode() * 31) + this.address.hashCode()) * 31) + this.chainIndex.hashCode()) * 31) + Long.hashCode(this.coinId)) * 31) + this.symbol.hashCode()) * 31) + this.balance.hashCode()) * 31) + this.usdValue.hashCode()) * 31) + Integer.hashCode(this.decimalNum)) * 31) + Integer.hashCode(this.displayPrecision)) * 31) + this.tokenAddress.hashCode()) * 31) + this.logo.hashCode()) * 31) + Boolean.hashCode(this.isMainCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMainCoin() {
        return this.isMainCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDeFiAAAssetInfo(accountId=" + this.accountId + ", address=" + this.address + ", chainIndex=" + this.chainIndex + ", coinId=" + this.coinId + ", symbol=" + this.symbol + ", balance=" + this.balance + ", usdValue=" + this.usdValue + ", decimalNum=" + this.decimalNum + ", displayPrecision=" + this.displayPrecision + ", tokenAddress=" + this.tokenAddress + ", logo=" + this.logo + ", isMainCoin=" + this.isMainCoin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.address);
        parcel.writeString(this.chainIndex);
        parcel.writeLong(this.coinId);
        parcel.writeString(this.symbol);
        parcel.writeString(this.balance);
        parcel.writeString(this.usdValue);
        parcel.writeInt(this.decimalNum);
        parcel.writeInt(this.displayPrecision);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.logo);
        parcel.writeInt(this.isMainCoin ? 1 : 0);
    }

    public CeDeFiAAAssetInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, int i2, @NotNull String str7, @NotNull String str8, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.accountId = str;
        this.address = str2;
        this.chainIndex = str3;
        this.coinId = j;
        this.symbol = str4;
        this.balance = str5;
        this.usdValue = str6;
        this.decimalNum = i;
        this.displayPrecision = i2;
        this.tokenAddress = str7;
        this.logo = str8;
        this.isMainCoin = z;
    }
}
