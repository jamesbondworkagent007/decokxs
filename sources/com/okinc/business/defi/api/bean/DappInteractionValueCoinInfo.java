package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DappInteractionValueCoinInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DappInteractionValueCoinInfo> CREATOR = new Creator();
    private final String amount;
    private final String coinLogo;
    private final String coinName;
    private final String direction;

    public static final class Creator implements Parcelable.Creator<DappInteractionValueCoinInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappInteractionValueCoinInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DappInteractionValueCoinInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappInteractionValueCoinInfo[] newArray(int i) {
            return new DappInteractionValueCoinInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DappInteractionValueCoinInfo copy$default(DappInteractionValueCoinInfo dappInteractionValueCoinInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dappInteractionValueCoinInfo.coinLogo;
        }
        if ((i & 2) != 0) {
            str2 = dappInteractionValueCoinInfo.coinName;
        }
        if ((i & 4) != 0) {
            str3 = dappInteractionValueCoinInfo.amount;
        }
        if ((i & 8) != 0) {
            str4 = dappInteractionValueCoinInfo.direction;
        }
        return dappInteractionValueCoinInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappInteractionValueCoinInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DappInteractionValueCoinInfo(str, str2, str3, str4);
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
        if (!(obj instanceof DappInteractionValueCoinInfo)) {
            return false;
        }
        DappInteractionValueCoinInfo dappInteractionValueCoinInfo = (DappInteractionValueCoinInfo) obj;
        return Intrinsics.EZpvd((Object) this.coinLogo, (Object) dappInteractionValueCoinInfo.coinLogo) && Intrinsics.EZpvd((Object) this.coinName, (Object) dappInteractionValueCoinInfo.coinName) && Intrinsics.EZpvd((Object) this.amount, (Object) dappInteractionValueCoinInfo.amount) && Intrinsics.EZpvd((Object) this.direction, (Object) dappInteractionValueCoinInfo.direction);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinLogo() {
        return this.coinLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.coinLogo.hashCode() * 31) + this.coinName.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.direction.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappInteractionValueCoinInfo(coinLogo=" + this.coinLogo + ", coinName=" + this.coinName + ", amount=" + this.amount + ", direction=" + this.direction + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinLogo);
        parcel.writeString(this.coinName);
        parcel.writeString(this.amount);
        parcel.writeString(this.direction);
    }

    public DappInteractionValueCoinInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.coinLogo = str;
        this.coinName = str2;
        this.amount = str3;
        this.direction = str4;
    }
}
