package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class CurrencyInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CurrencyInfo> CREATOR = new Creator();
    private final String currency;
    private final int currencyId;

    public static final class Creator implements Parcelable.Creator<CurrencyInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CurrencyInfo(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CurrencyInfo[] newArray(int i) {
            return new CurrencyInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CurrencyInfo copy$default(CurrencyInfo currencyInfo, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = currencyInfo.currencyId;
        }
        if ((i2 & 2) != 0) {
            str = currencyInfo.currency;
        }
        return currencyInfo.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CurrencyInfo copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CurrencyInfo(i, str);
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
        if (!(obj instanceof CurrencyInfo)) {
            return false;
        }
        CurrencyInfo currencyInfo = (CurrencyInfo) obj;
        return this.currencyId == currencyInfo.currencyId && Intrinsics.EZpvd((Object) this.currency, (Object) currencyInfo.currency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.currencyId) * 31) + this.currency.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CurrencyInfo(currencyId=" + this.currencyId + ", currency=" + this.currency + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.currency);
    }

    public CurrencyInfo(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyId = i;
        this.currency = str;
    }
}
