package com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityPoolListingUIItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LiquidityPoolListingUIItem> CREATOR = new Creator();
    private final String chainId;
    private final List<ChangedTokenInfoUIItem> changedTokenInfo;
    private final String displayType;
    private final String poolLogoUrl;
    private final String poolName;
    private final String timestamp;
    private final String tokenContractAddress;
    private final String txHashUrl;
    private final String type;
    private final String userWalletAddress;
    private final String value;

    public static final class Creator implements Parcelable.Creator<LiquidityPoolListingUIItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPoolListingUIItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChangedTokenInfoUIItem.CREATOR.createFromParcel(parcel));
            }
            return new LiquidityPoolListingUIItem(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPoolListingUIItem[] newArray(int i) {
            return new LiquidityPoolListingUIItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChangedTokenInfoUIItem> component2() {
        return this.changedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.poolLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.poolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.txHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityPoolListingUIItem copy(@NotNull String str, @NotNull List<ChangedTokenInfoUIItem> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new LiquidityPoolListingUIItem(str, list, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof LiquidityPoolListingUIItem)) {
            return false;
        }
        LiquidityPoolListingUIItem liquidityPoolListingUIItem = (LiquidityPoolListingUIItem) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) liquidityPoolListingUIItem.chainId) && Intrinsics.EZpvd(this.changedTokenInfo, liquidityPoolListingUIItem.changedTokenInfo) && Intrinsics.EZpvd((Object) this.poolLogoUrl, (Object) liquidityPoolListingUIItem.poolLogoUrl) && Intrinsics.EZpvd((Object) this.poolName, (Object) liquidityPoolListingUIItem.poolName) && Intrinsics.EZpvd((Object) this.timestamp, (Object) liquidityPoolListingUIItem.timestamp) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) liquidityPoolListingUIItem.tokenContractAddress) && Intrinsics.EZpvd((Object) this.txHashUrl, (Object) liquidityPoolListingUIItem.txHashUrl) && Intrinsics.EZpvd((Object) this.type, (Object) liquidityPoolListingUIItem.type) && Intrinsics.EZpvd((Object) this.displayType, (Object) liquidityPoolListingUIItem.displayType) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) liquidityPoolListingUIItem.userWalletAddress) && Intrinsics.EZpvd((Object) this.value, (Object) liquidityPoolListingUIItem.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChangedTokenInfoUIItem> getChangedTokenInfo() {
        return this.changedTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayType() {
        return this.displayType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolLogoUrl() {
        return this.poolLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolName() {
        return this.poolName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHashUrl() {
        return this.txHashUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.chainId.hashCode() * 31) + this.changedTokenInfo.hashCode()) * 31) + this.poolLogoUrl.hashCode()) * 31) + this.poolName.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.txHashUrl.hashCode()) * 31) + this.type.hashCode()) * 31) + this.displayType.hashCode()) * 31) + this.userWalletAddress.hashCode()) * 31) + this.value.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityPoolListingUIItem(chainId=" + this.chainId + ", changedTokenInfo=" + this.changedTokenInfo + ", poolLogoUrl=" + this.poolLogoUrl + ", poolName=" + this.poolName + ", timestamp=" + this.timestamp + ", tokenContractAddress=" + this.tokenContractAddress + ", txHashUrl=" + this.txHashUrl + ", type=" + this.type + ", displayType=" + this.displayType + ", userWalletAddress=" + this.userWalletAddress + ", value=" + this.value + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        List<ChangedTokenInfoUIItem> list = this.changedTokenInfo;
        parcel.writeInt(list.size());
        Iterator<ChangedTokenInfoUIItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.poolLogoUrl);
        parcel.writeString(this.poolName);
        parcel.writeString(this.timestamp);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.txHashUrl);
        parcel.writeString(this.type);
        parcel.writeString(this.displayType);
        parcel.writeString(this.userWalletAddress);
        parcel.writeString(this.value);
    }

    public LiquidityPoolListingUIItem(@NotNull String str, @NotNull List<ChangedTokenInfoUIItem> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
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
        this.changedTokenInfo = list;
        this.poolLogoUrl = str2;
        this.poolName = str3;
        this.timestamp = str4;
        this.tokenContractAddress = str5;
        this.txHashUrl = str6;
        this.type = str7;
        this.displayType = str8;
        this.userWalletAddress = str9;
        this.value = str10;
    }
}
