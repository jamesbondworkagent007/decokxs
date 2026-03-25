package com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ChangedTokenInfoUIItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ChangedTokenInfoUIItem> CREATOR = new Creator();
    private final String amount;
    private final String tokenSymbol;

    public static final class Creator implements Parcelable.Creator<ChangedTokenInfoUIItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangedTokenInfoUIItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChangedTokenInfoUIItem(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangedTokenInfoUIItem[] newArray(int i) {
            return new ChangedTokenInfoUIItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChangedTokenInfoUIItem copy$default(ChangedTokenInfoUIItem changedTokenInfoUIItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changedTokenInfoUIItem.amount;
        }
        if ((i & 2) != 0) {
            str2 = changedTokenInfoUIItem.tokenSymbol;
        }
        return changedTokenInfoUIItem.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChangedTokenInfoUIItem copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ChangedTokenInfoUIItem(str, str2);
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
        if (!(obj instanceof ChangedTokenInfoUIItem)) {
            return false;
        }
        ChangedTokenInfoUIItem changedTokenInfoUIItem = (ChangedTokenInfoUIItem) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) changedTokenInfoUIItem.amount) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) changedTokenInfoUIItem.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.amount.hashCode() * 31) + this.tokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChangedTokenInfoUIItem(amount=" + this.amount + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.tokenSymbol);
    }

    public ChangedTokenInfoUIItem(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.amount = str;
        this.tokenSymbol = str2;
    }
}
