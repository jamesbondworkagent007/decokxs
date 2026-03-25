package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CardProperties extends ChannelProperties {
    public static final Parcelable.Creator<CardProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final ChannelCategoryCode EZpvd;
    public final Channel KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<CardProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CardProperties(ChannelCategoryCode.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardProperties[] newArray(int i) {
            return new CardProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CardProperties copy$default(CardProperties cardProperties, ChannelCategoryCode channelCategoryCode, String str, String str2, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            channelCategoryCode = cardProperties.EZpvd;
        }
        if ((i & 2) != 0) {
            str = cardProperties.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str2 = cardProperties.copydefault;
        }
        if ((i & 8) != 0) {
            channel = cardProperties.KWHzl;
        }
        return cardProperties.OLrzqt(channelCategoryCode, str, str2, channel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardProperties OLrzqt(@NotNull ChannelCategoryCode channelCategoryCode, @NotNull String str, @NotNull String str2, Channel channel) {
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CardProperties(channelCategoryCode, str, str2, channel);
    }

    @Override // com.okinc.okx.paymentapi.data.paas.ChannelProperties, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardProperties)) {
            return false;
        }
        CardProperties cardProperties = (CardProperties) obj;
        return this.EZpvd == cardProperties.EZpvd && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) cardProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) cardProperties.copydefault) && Intrinsics.EZpvd(this.KWHzl, cardProperties.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        Channel channel = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (channel == null ? 0 : channel.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardProperties(categoryCode=" + this.EZpvd + ", currency=" + this.AEQbTJ + ", platformCode=" + this.copydefault + ", channel=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okx.paymentapi.data.paas.ChannelProperties, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.EZpvd.writeToParcel(parcel, i);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        Channel channel = this.KWHzl;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardProperties(@NotNull ChannelCategoryCode channelCategoryCode, @NotNull String str, @NotNull String str2, Channel channel) {
        super(null, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(channelCategoryCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = channelCategoryCode;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.KWHzl = channel;
    }
}
