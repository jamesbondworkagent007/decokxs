package com.okinc.affiliate.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class ChannelCommissionInfo implements Parcelable {
    public static final int $stable = 0;
    private final ChannelCommissionInfoDetail cefiChannel;
    private final ChannelCommissionInfoDetail defiChannel;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChannelCommissionInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChannelCommissionInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelCommissionInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChannelCommissionInfo(parcel.readInt() == 0 ? null : ChannelCommissionInfoDetail.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ChannelCommissionInfoDetail.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelCommissionInfo[] newArray(int i) {
            return new ChannelCommissionInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelCommissionInfo() {
        this((ChannelCommissionInfoDetail) null, (ChannelCommissionInfoDetail) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChannelCommissionInfo copy$default(ChannelCommissionInfo channelCommissionInfo, ChannelCommissionInfoDetail channelCommissionInfoDetail, ChannelCommissionInfoDetail channelCommissionInfoDetail2, int i, Object obj) {
        if ((i & 1) != 0) {
            channelCommissionInfoDetail = channelCommissionInfo.defiChannel;
        }
        if ((i & 2) != 0) {
            channelCommissionInfoDetail2 = channelCommissionInfo.cefiChannel;
        }
        return channelCommissionInfo.copy(channelCommissionInfoDetail, channelCommissionInfoDetail2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCommissionInfoDetail component1() {
        return this.defiChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCommissionInfoDetail component2() {
        return this.cefiChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCommissionInfo copy(ChannelCommissionInfoDetail channelCommissionInfoDetail, ChannelCommissionInfoDetail channelCommissionInfoDetail2) {
        return new ChannelCommissionInfo(channelCommissionInfoDetail, channelCommissionInfoDetail2);
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
        if (!(obj instanceof ChannelCommissionInfo)) {
            return false;
        }
        ChannelCommissionInfo channelCommissionInfo = (ChannelCommissionInfo) obj;
        return Intrinsics.EZpvd(this.defiChannel, channelCommissionInfo.defiChannel) && Intrinsics.EZpvd(this.cefiChannel, channelCommissionInfo.cefiChannel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCommissionInfoDetail getCefiChannel() {
        return this.cefiChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCommissionInfoDetail getDefiChannel() {
        return this.defiChannel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ChannelCommissionInfoDetail channelCommissionInfoDetail = this.defiChannel;
        int iHashCode = channelCommissionInfoDetail == null ? 0 : channelCommissionInfoDetail.hashCode();
        ChannelCommissionInfoDetail channelCommissionInfoDetail2 = this.cefiChannel;
        return (iHashCode * 31) + (channelCommissionInfoDetail2 != null ? channelCommissionInfoDetail2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChannelCommissionInfo(defiChannel=" + this.defiChannel + ", cefiChannel=" + this.cefiChannel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ChannelCommissionInfoDetail channelCommissionInfoDetail = this.defiChannel;
        if (channelCommissionInfoDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelCommissionInfoDetail.writeToParcel(parcel, i);
        }
        ChannelCommissionInfoDetail channelCommissionInfoDetail2 = this.cefiChannel;
        if (channelCommissionInfoDetail2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelCommissionInfoDetail2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.affiliate.bean.ChannelCommissionInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelCommissionInfo> serializer() {
            return ChannelCommissionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChannelCommissionInfo(int i, ChannelCommissionInfoDetail channelCommissionInfoDetail, ChannelCommissionInfoDetail channelCommissionInfoDetail2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.defiChannel = null;
        } else {
            this.defiChannel = channelCommissionInfoDetail;
        }
        if ((i & 2) == 0) {
            this.cefiChannel = null;
        } else {
            this.cefiChannel = channelCommissionInfoDetail2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAffiliate_affiliate_api(ChannelCommissionInfo channelCommissionInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || channelCommissionInfo.defiChannel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ChannelCommissionInfoDetail$$serializer.INSTANCE, channelCommissionInfo.defiChannel);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && channelCommissionInfo.cefiChannel == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, ChannelCommissionInfoDetail$$serializer.INSTANCE, channelCommissionInfo.cefiChannel);
    }

    public ChannelCommissionInfo(ChannelCommissionInfoDetail channelCommissionInfoDetail, ChannelCommissionInfoDetail channelCommissionInfoDetail2) {
        this.defiChannel = channelCommissionInfoDetail;
        this.cefiChannel = channelCommissionInfoDetail2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.affiliate.bean.ChannelCommissionInfoDetail:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.affiliate.bean.ChannelCommissionInfoDetail) : (r2v0 com.okinc.affiliate.bean.ChannelCommissionInfoDetail))
  (wrap:com.okinc.affiliate.bean.ChannelCommissionInfoDetail:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.affiliate.bean.ChannelCommissionInfoDetail) : (r3v0 com.okinc.affiliate.bean.ChannelCommissionInfoDetail))
 A[MD:(com.okinc.affiliate.bean.ChannelCommissionInfoDetail, com.okinc.affiliate.bean.ChannelCommissionInfoDetail):void (m)] (LINE:56) call: com.okinc.affiliate.bean.ChannelCommissionInfo.<init>(com.okinc.affiliate.bean.ChannelCommissionInfoDetail, com.okinc.affiliate.bean.ChannelCommissionInfoDetail):void type: THIS */
    public /* synthetic */ ChannelCommissionInfo(ChannelCommissionInfoDetail channelCommissionInfoDetail, ChannelCommissionInfoDetail channelCommissionInfoDetail2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : channelCommissionInfoDetail, (i & 2) != 0 ? null : channelCommissionInfoDetail2);
    }
}
