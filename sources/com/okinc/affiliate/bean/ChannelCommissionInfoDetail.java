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
public final class ChannelCommissionInfoDetail implements Parcelable {
    public static final int $stable = 0;
    private final int actualSelfCommissionRate;
    private final String affiliateNickname;
    private final String channelCode;
    private final int estimatedSelfCommissionRate;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChannelCommissionInfoDetail> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ChannelCommissionInfoDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelCommissionInfoDetail createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ChannelCommissionInfoDetail(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelCommissionInfoDetail[] newArray(int i) {
            return new ChannelCommissionInfoDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ChannelCommissionInfoDetail() {
        this((String) null, 0, 0, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChannelCommissionInfoDetail copy$default(ChannelCommissionInfoDetail channelCommissionInfoDetail, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = channelCommissionInfoDetail.channelCode;
        }
        if ((i3 & 2) != 0) {
            i = channelCommissionInfoDetail.estimatedSelfCommissionRate;
        }
        if ((i3 & 4) != 0) {
            i2 = channelCommissionInfoDetail.actualSelfCommissionRate;
        }
        if ((i3 & 8) != 0) {
            str2 = channelCommissionInfoDetail.affiliateNickname;
        }
        return channelCommissionInfoDetail.copy(str, i, i2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.channelCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.estimatedSelfCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.actualSelfCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.affiliateNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCommissionInfoDetail copy(@NotNull String str, int i, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ChannelCommissionInfoDetail(str, i, i2, str2);
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
        if (!(obj instanceof ChannelCommissionInfoDetail)) {
            return false;
        }
        ChannelCommissionInfoDetail channelCommissionInfoDetail = (ChannelCommissionInfoDetail) obj;
        return Intrinsics.EZpvd((Object) this.channelCode, (Object) channelCommissionInfoDetail.channelCode) && this.estimatedSelfCommissionRate == channelCommissionInfoDetail.estimatedSelfCommissionRate && this.actualSelfCommissionRate == channelCommissionInfoDetail.actualSelfCommissionRate && Intrinsics.EZpvd((Object) this.affiliateNickname, (Object) channelCommissionInfoDetail.affiliateNickname);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getActualSelfCommissionRate() {
        return this.actualSelfCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAffiliateNickname() {
        return this.affiliateNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelCode() {
        return this.channelCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEstimatedSelfCommissionRate() {
        return this.estimatedSelfCommissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.channelCode.hashCode() * 31) + Integer.hashCode(this.estimatedSelfCommissionRate)) * 31) + Integer.hashCode(this.actualSelfCommissionRate)) * 31) + this.affiliateNickname.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChannelCommissionInfoDetail(channelCode=" + this.channelCode + ", estimatedSelfCommissionRate=" + this.estimatedSelfCommissionRate + ", actualSelfCommissionRate=" + this.actualSelfCommissionRate + ", affiliateNickname=" + this.affiliateNickname + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.channelCode);
        parcel.writeInt(this.estimatedSelfCommissionRate);
        parcel.writeInt(this.actualSelfCommissionRate);
        parcel.writeString(this.affiliateNickname);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.affiliate.bean.ChannelCommissionInfoDetail.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ChannelCommissionInfoDetail> serializer() {
            return ChannelCommissionInfoDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChannelCommissionInfoDetail(int i, String str, int i2, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.channelCode = "";
        } else {
            this.channelCode = str;
        }
        if ((i & 2) == 0) {
            this.estimatedSelfCommissionRate = 0;
        } else {
            this.estimatedSelfCommissionRate = i2;
        }
        if ((i & 4) == 0) {
            this.actualSelfCommissionRate = 0;
        } else {
            this.actualSelfCommissionRate = i3;
        }
        if ((i & 8) == 0) {
            this.affiliateNickname = "";
        } else {
            this.affiliateNickname = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAffiliate_affiliate_api(ChannelCommissionInfoDetail channelCommissionInfoDetail, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) channelCommissionInfoDetail.channelCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, channelCommissionInfoDetail.channelCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || channelCommissionInfoDetail.estimatedSelfCommissionRate != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, channelCommissionInfoDetail.estimatedSelfCommissionRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || channelCommissionInfoDetail.actualSelfCommissionRate != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, channelCommissionInfoDetail.actualSelfCommissionRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) channelCommissionInfoDetail.affiliateNickname, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, channelCommissionInfoDetail.affiliateNickname);
    }

    public ChannelCommissionInfoDetail(@NotNull String str, int i, int i2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.channelCode = str;
        this.estimatedSelfCommissionRate = i;
        this.actualSelfCommissionRate = i2;
        this.affiliateNickname = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r7v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r7v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000d: ARITH (r7v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r7v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
 A[MD:(java.lang.String, int, int, java.lang.String):void (m)] (LINE:46) call: com.okinc.affiliate.bean.ChannelCommissionInfoDetail.<init>(java.lang.String, int, int, java.lang.String):void type: THIS */
    public /* synthetic */ ChannelCommissionInfoDetail(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? "" : str2);
    }
}
