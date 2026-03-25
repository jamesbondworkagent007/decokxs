package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class GooglePayProperties extends ChannelProperties {
    public static final Parcelable.Creator<GooglePayProperties> CREATOR = new Creator();
    public final Channel OLrzqt;

    public static final class Creator implements Parcelable.Creator<GooglePayProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GooglePayProperties(parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GooglePayProperties[] newArray(int i) {
            return new GooglePayProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GooglePayProperties() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GooglePayProperties copy$default(GooglePayProperties googlePayProperties, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            channel = googlePayProperties.OLrzqt;
        }
        return googlePayProperties.AEQbTJ(channel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GooglePayProperties AEQbTJ(Channel channel) {
        return new GooglePayProperties(channel);
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
        return (obj instanceof GooglePayProperties) && Intrinsics.EZpvd(this.OLrzqt, ((GooglePayProperties) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Channel channel = this.OLrzqt;
        if (channel == null) {
            return 0;
        }
        return channel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GooglePayProperties(channel=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okx.paymentapi.data.paas.ChannelProperties, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Channel channel = this.OLrzqt;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r1v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.Channel):void (m)] (LINE:110) call: com.okinc.okx.paymentapi.data.paas.GooglePayProperties.<init>(com.okinc.okpaymentapi.data.remote.model.management.Channel):void type: THIS */
    public /* synthetic */ GooglePayProperties(Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : channel);
    }

    public GooglePayProperties(Channel channel) {
        super(null, 1, null);
        this.OLrzqt = channel;
    }
}
