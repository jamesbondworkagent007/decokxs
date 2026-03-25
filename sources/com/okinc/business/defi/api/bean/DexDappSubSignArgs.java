package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DexDappSubSignArgs implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DexDappSubSignArgs> CREATOR = new Creator();
    private final DexSignExchangeRate expectedRate;
    private final String expiration;
    private final DexSignSwapCoinInfo from;
    private final boolean isCancelSign;
    private final DexSignExchangeRate rate;
    private final DexSignSwapCoinInfo to;

    public static final class Creator implements Parcelable.Creator<DexDappSubSignArgs> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexDappSubSignArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            Parcelable.Creator<DexSignSwapCoinInfo> creator = DexSignSwapCoinInfo.CREATOR;
            DexSignSwapCoinInfo dexSignSwapCoinInfoCreateFromParcel = creator.createFromParcel(parcel);
            DexSignSwapCoinInfo dexSignSwapCoinInfoCreateFromParcel2 = creator.createFromParcel(parcel);
            Parcelable.Creator<DexSignExchangeRate> creator2 = DexSignExchangeRate.CREATOR;
            return new DexDappSubSignArgs(z, dexSignSwapCoinInfoCreateFromParcel, dexSignSwapCoinInfoCreateFromParcel2, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexDappSubSignArgs[] newArray(int i) {
            return new DexDappSubSignArgs[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexDappSubSignArgs copy$default(DexDappSubSignArgs dexDappSubSignArgs, boolean z, DexSignSwapCoinInfo dexSignSwapCoinInfo, DexSignSwapCoinInfo dexSignSwapCoinInfo2, DexSignExchangeRate dexSignExchangeRate, DexSignExchangeRate dexSignExchangeRate2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dexDappSubSignArgs.isCancelSign;
        }
        if ((i & 2) != 0) {
            dexSignSwapCoinInfo = dexDappSubSignArgs.from;
        }
        DexSignSwapCoinInfo dexSignSwapCoinInfo3 = dexSignSwapCoinInfo;
        if ((i & 4) != 0) {
            dexSignSwapCoinInfo2 = dexDappSubSignArgs.to;
        }
        DexSignSwapCoinInfo dexSignSwapCoinInfo4 = dexSignSwapCoinInfo2;
        if ((i & 8) != 0) {
            dexSignExchangeRate = dexDappSubSignArgs.rate;
        }
        DexSignExchangeRate dexSignExchangeRate3 = dexSignExchangeRate;
        if ((i & 16) != 0) {
            dexSignExchangeRate2 = dexDappSubSignArgs.expectedRate;
        }
        DexSignExchangeRate dexSignExchangeRate4 = dexSignExchangeRate2;
        if ((i & 32) != 0) {
            str = dexDappSubSignArgs.expiration;
        }
        return dexDappSubSignArgs.copy(z, dexSignSwapCoinInfo3, dexSignSwapCoinInfo4, dexSignExchangeRate3, dexSignExchangeRate4, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isCancelSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignSwapCoinInfo component2() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignSwapCoinInfo component3() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRate component4() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRate component5() {
        return this.expectedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexDappSubSignArgs copy(boolean z, @NotNull DexSignSwapCoinInfo dexSignSwapCoinInfo, @NotNull DexSignSwapCoinInfo dexSignSwapCoinInfo2, @NotNull DexSignExchangeRate dexSignExchangeRate, @NotNull DexSignExchangeRate dexSignExchangeRate2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dexSignSwapCoinInfo, "");
        Intrinsics.checkNotNullParameter(dexSignSwapCoinInfo2, "");
        Intrinsics.checkNotNullParameter(dexSignExchangeRate, "");
        Intrinsics.checkNotNullParameter(dexSignExchangeRate2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new DexDappSubSignArgs(z, dexSignSwapCoinInfo, dexSignSwapCoinInfo2, dexSignExchangeRate, dexSignExchangeRate2, str);
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
        if (!(obj instanceof DexDappSubSignArgs)) {
            return false;
        }
        DexDappSubSignArgs dexDappSubSignArgs = (DexDappSubSignArgs) obj;
        return this.isCancelSign == dexDappSubSignArgs.isCancelSign && Intrinsics.EZpvd(this.from, dexDappSubSignArgs.from) && Intrinsics.EZpvd(this.to, dexDappSubSignArgs.to) && Intrinsics.EZpvd(this.rate, dexDappSubSignArgs.rate) && Intrinsics.EZpvd(this.expectedRate, dexDappSubSignArgs.expectedRate) && Intrinsics.EZpvd((Object) this.expiration, (Object) dexDappSubSignArgs.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRate getExpectedRate() {
        return this.expectedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignSwapCoinInfo getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRate getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignSwapCoinInfo getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isCancelSign) * 31) + this.from.hashCode()) * 31) + this.to.hashCode()) * 31) + this.rate.hashCode()) * 31) + this.expectedRate.hashCode()) * 31) + this.expiration.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCancelSign() {
        return this.isCancelSign;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexDappSubSignArgs(isCancelSign=" + this.isCancelSign + ", from=" + this.from + ", to=" + this.to + ", rate=" + this.rate + ", expectedRate=" + this.expectedRate + ", expiration=" + this.expiration + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isCancelSign ? 1 : 0);
        this.from.writeToParcel(parcel, i);
        this.to.writeToParcel(parcel, i);
        this.rate.writeToParcel(parcel, i);
        this.expectedRate.writeToParcel(parcel, i);
        parcel.writeString(this.expiration);
    }

    public DexDappSubSignArgs(boolean z, @NotNull DexSignSwapCoinInfo dexSignSwapCoinInfo, @NotNull DexSignSwapCoinInfo dexSignSwapCoinInfo2, @NotNull DexSignExchangeRate dexSignExchangeRate, @NotNull DexSignExchangeRate dexSignExchangeRate2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(dexSignSwapCoinInfo, "");
        Intrinsics.checkNotNullParameter(dexSignSwapCoinInfo2, "");
        Intrinsics.checkNotNullParameter(dexSignExchangeRate, "");
        Intrinsics.checkNotNullParameter(dexSignExchangeRate2, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.isCancelSign = z;
        this.from = dexSignSwapCoinInfo;
        this.to = dexSignSwapCoinInfo2;
        this.rate = dexSignExchangeRate;
        this.expectedRate = dexSignExchangeRate2;
        this.expiration = str;
    }
}
