package com.okinc.fiat.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ChannelAvailabilityParameters implements Parcelable {
    public static final Parcelable.Creator<ChannelAvailabilityParameters> CREATOR = new Creator();
    public final String AEQbTJ;
    public final TradeType EZpvd;
    public final ChannelAvailabilityCheckType KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<ChannelAvailabilityParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelAvailabilityParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChannelAvailabilityParameters(parcel.readString(), parcel.readString(), TradeType.CREATOR.createFromParcel(parcel), ChannelAvailabilityCheckType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelAvailabilityParameters[] newArray(int i) {
            return new ChannelAvailabilityParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChannelAvailabilityParameters copy$default(ChannelAvailabilityParameters channelAvailabilityParameters, String str, String str2, TradeType tradeType, ChannelAvailabilityCheckType channelAvailabilityCheckType, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = channelAvailabilityParameters.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = channelAvailabilityParameters.OLrzqt;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            tradeType = channelAvailabilityParameters.EZpvd;
        }
        TradeType tradeType2 = tradeType;
        if ((i & 8) != 0) {
            channelAvailabilityCheckType = channelAvailabilityParameters.KWHzl;
        }
        ChannelAvailabilityCheckType channelAvailabilityCheckType2 = channelAvailabilityCheckType;
        if ((i & 16) != 0) {
            str3 = channelAvailabilityParameters.AEQbTJ;
        }
        return channelAvailabilityParameters.KWHzl(str, str4, tradeType2, channelAvailabilityCheckType2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelAvailabilityParameters KWHzl(@NotNull String str, @NotNull String str2, @NotNull TradeType tradeType, @NotNull ChannelAvailabilityCheckType channelAvailabilityCheckType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(channelAvailabilityCheckType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ChannelAvailabilityParameters(str, str2, tradeType, channelAvailabilityCheckType, str3);
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
        if (!(obj instanceof ChannelAvailabilityParameters)) {
            return false;
        }
        ChannelAvailabilityParameters channelAvailabilityParameters = (ChannelAvailabilityParameters) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) channelAvailabilityParameters.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) channelAvailabilityParameters.OLrzqt) && this.EZpvd == channelAvailabilityParameters.EZpvd && this.KWHzl == channelAvailabilityParameters.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) channelAvailabilityParameters.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChannelAvailabilityParameters(baseCurrency=" + this.copydefault + ", quoteCurrency=" + this.OLrzqt + ", tradeType=" + this.EZpvd + ", checkType=" + this.KWHzl + ", clientId=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        this.EZpvd.writeToParcel(parcel, i);
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.AEQbTJ);
    }

    public ChannelAvailabilityParameters(@NotNull String str, @NotNull String str2, @NotNull TradeType tradeType, @NotNull ChannelAvailabilityCheckType channelAvailabilityCheckType, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(channelAvailabilityCheckType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.OLrzqt = str2;
        this.EZpvd = tradeType;
        this.KWHzl = channelAvailabilityCheckType;
        this.AEQbTJ = str3;
    }
}
