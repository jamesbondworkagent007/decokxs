package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BuySellOrderHistoryDetailParameters implements Parcelable {
    public static final Parcelable.Creator<BuySellOrderHistoryDetailParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean EZpvd;
    public final String KWHzl;
    public final BuySellTradeType copydefault;

    public static final class Creator implements Parcelable.Creator<BuySellOrderHistoryDetailParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellOrderHistoryDetailParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellOrderHistoryDetailParameters(BuySellTradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellOrderHistoryDetailParameters[] newArray(int i) {
            return new BuySellOrderHistoryDetailParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellOrderHistoryDetailParameters copy$default(BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters, BuySellTradeType buySellTradeType, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            buySellTradeType = buySellOrderHistoryDetailParameters.copydefault;
        }
        if ((i & 2) != 0) {
            str = buySellOrderHistoryDetailParameters.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = buySellOrderHistoryDetailParameters.EZpvd;
        }
        if ((i & 8) != 0) {
            str2 = buySellOrderHistoryDetailParameters.KWHzl;
        }
        return buySellOrderHistoryDetailParameters.KWHzl(buySellTradeType, str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellOrderHistoryDetailParameters KWHzl(@NotNull BuySellTradeType buySellTradeType, @NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BuySellOrderHistoryDetailParameters(buySellTradeType, str, z, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellTradeType copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof BuySellOrderHistoryDetailParameters)) {
            return false;
        }
        BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters = (BuySellOrderHistoryDetailParameters) obj;
        return this.copydefault == buySellOrderHistoryDetailParameters.copydefault && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) buySellOrderHistoryDetailParameters.AEQbTJ) && this.EZpvd == buySellOrderHistoryDetailParameters.EZpvd && Intrinsics.EZpvd((Object) this.KWHzl, (Object) buySellOrderHistoryDetailParameters.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellOrderHistoryDetailParameters(tradeType=" + this.copydefault + ", orderId=" + this.AEQbTJ + ", isFromResultPage=" + this.EZpvd + ", source=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.copydefault.writeToParcel(parcel, i);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.KWHzl);
    }

    public BuySellOrderHistoryDetailParameters(@NotNull BuySellTradeType buySellTradeType, @NotNull String str, boolean z, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = buySellTradeType;
        this.AEQbTJ = str;
        this.EZpvd = z;
        this.KWHzl = str2;
    }
}
