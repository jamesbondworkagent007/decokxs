package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DepositProperties extends ChannelProperties {
    public static final Parcelable.Creator<DepositProperties> CREATOR = new Creator();
    public final Channel EZpvd;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<DepositProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DepositProperties(parcel.readString(), parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositProperties[] newArray(int i) {
            return new DepositProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositProperties copy$default(DepositProperties depositProperties, String str, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = depositProperties.KWHzl;
        }
        if ((i & 2) != 0) {
            channel = depositProperties.EZpvd;
        }
        return depositProperties.OLrzqt(str, channel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositProperties OLrzqt(@NotNull String str, Channel channel) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DepositProperties(str, channel);
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
        if (!(obj instanceof DepositProperties)) {
            return false;
        }
        DepositProperties depositProperties = (DepositProperties) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) depositProperties.KWHzl) && Intrinsics.EZpvd(this.EZpvd, depositProperties.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        Channel channel = this.EZpvd;
        return (iHashCode * 31) + (channel == null ? 0 : channel.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositProperties(currency=" + this.KWHzl + ", channel=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okx.paymentapi.data.paas.ChannelProperties, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        Channel channel = this.EZpvd;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DepositProperties(@NotNull String str, Channel channel) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.EZpvd = channel;
    }
}
