package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.Channel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class ChannelProperties implements Parcelable {
    public static final Parcelable.Creator<ChannelProperties> CREATOR = new Creator();
    public final Channel djBIcL;

    public static final class Creator implements Parcelable.Creator<ChannelProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChannelProperties(parcel.readInt() == 0 ? null : Channel.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelProperties[] newArray(int i) {
            return new ChannelProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelProperties() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Channel channel = this.djBIcL;
        if (channel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channel.writeToParcel(parcel, i);
        }
    }

    public ChannelProperties(Channel channel) {
        this.djBIcL = channel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.Channel:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okpaymentapi.data.remote.model.management.Channel) : (r1v0 com.okinc.okpaymentapi.data.remote.model.management.Channel))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.Channel):void (m)] (LINE:80) call: com.okinc.okx.paymentapi.data.paas.ChannelProperties.<init>(com.okinc.okpaymentapi.data.remote.model.management.Channel):void type: THIS */
    public /* synthetic */ ChannelProperties(Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : channel);
    }
}
