package com.okinc.tradingbot.impl.market_place.bot_copy.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SignalSortProfitData implements Parcelable {
    public static final Parcelable.Creator<SignalSortProfitData> CREATOR = new Creator();
    public final int AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SignalSortProfitData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSortProfitData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignalSortProfitData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalSortProfitData[] newArray(int i) {
            return new SignalSortProfitData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignalSortProfitData copy$default(SignalSortProfitData signalSortProfitData, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = signalSortProfitData.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            str2 = signalSortProfitData.KWHzl;
        }
        if ((i2 & 4) != 0) {
            str3 = signalSortProfitData.EZpvd;
        }
        if ((i2 & 8) != 0) {
            i = signalSortProfitData.AEQbTJ;
        }
        return signalSortProfitData.AEQbTJ(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalSortProfitData AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SignalSortProfitData(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof SignalSortProfitData)) {
            return false;
        }
        SignalSortProfitData signalSortProfitData = (SignalSortProfitData) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signalSortProfitData.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) signalSortProfitData.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) signalSortProfitData.EZpvd) && this.AEQbTJ == signalSortProfitData.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + Integer.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalSortProfitData(coinPair=" + this.OLrzqt + ", maxDrawDown=" + this.KWHzl + ", rate=" + this.EZpvd + ", rateColor=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.AEQbTJ);
    }

    public SignalSortProfitData(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.AEQbTJ = i;
    }
}
