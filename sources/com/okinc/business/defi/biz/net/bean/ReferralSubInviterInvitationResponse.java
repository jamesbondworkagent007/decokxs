package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ReferralSubInviterInvitationResponse implements Parcelable {
    public static final int $stable = 0;
    private final String commissionRate;
    private final String parentEvmAddr;
    private final int status;
    private final String subEvmAddr;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ReferralSubInviterInvitationResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ReferralSubInviterInvitationResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralSubInviterInvitationResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReferralSubInviterInvitationResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralSubInviterInvitationResponse[] newArray(int i) {
            return new ReferralSubInviterInvitationResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReferralSubInviterInvitationResponse copy$default(ReferralSubInviterInvitationResponse referralSubInviterInvitationResponse, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = referralSubInviterInvitationResponse.parentEvmAddr;
        }
        if ((i2 & 2) != 0) {
            str2 = referralSubInviterInvitationResponse.subEvmAddr;
        }
        if ((i2 & 4) != 0) {
            str3 = referralSubInviterInvitationResponse.commissionRate;
        }
        if ((i2 & 8) != 0) {
            i = referralSubInviterInvitationResponse.status;
        }
        return referralSubInviterInvitationResponse.copy(str, str2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.parentEvmAddr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subEvmAddr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.commissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralSubInviterInvitationResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ReferralSubInviterInvitationResponse(str, str2, str3, i);
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
        if (!(obj instanceof ReferralSubInviterInvitationResponse)) {
            return false;
        }
        ReferralSubInviterInvitationResponse referralSubInviterInvitationResponse = (ReferralSubInviterInvitationResponse) obj;
        return Intrinsics.EZpvd((Object) this.parentEvmAddr, (Object) referralSubInviterInvitationResponse.parentEvmAddr) && Intrinsics.EZpvd((Object) this.subEvmAddr, (Object) referralSubInviterInvitationResponse.subEvmAddr) && Intrinsics.EZpvd((Object) this.commissionRate, (Object) referralSubInviterInvitationResponse.commissionRate) && this.status == referralSubInviterInvitationResponse.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCommissionRate() {
        return this.commissionRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParentEvmAddr() {
        return this.parentEvmAddr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubEvmAddr() {
        return this.subEvmAddr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.parentEvmAddr.hashCode() * 31) + this.subEvmAddr.hashCode()) * 31) + this.commissionRate.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralSubInviterInvitationResponse(parentEvmAddr=" + this.parentEvmAddr + ", subEvmAddr=" + this.subEvmAddr + ", commissionRate=" + this.commissionRate + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.parentEvmAddr);
        parcel.writeString(this.subEvmAddr);
        parcel.writeString(this.commissionRate);
        parcel.writeInt(this.status);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ReferralSubInviterInvitationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReferralSubInviterInvitationResponse> serializer() {
            return ReferralSubInviterInvitationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReferralSubInviterInvitationResponse(int i, String str, String str2, String str3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ReferralSubInviterInvitationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.parentEvmAddr = str;
        this.subEvmAddr = str2;
        this.commissionRate = str3;
        this.status = i2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ReferralSubInviterInvitationResponse referralSubInviterInvitationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, referralSubInviterInvitationResponse.parentEvmAddr);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, referralSubInviterInvitationResponse.subEvmAddr);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, referralSubInviterInvitationResponse.commissionRate);
        compositeEncoder.encodeIntElement(serialDescriptor, 3, referralSubInviterInvitationResponse.status);
    }

    public ReferralSubInviterInvitationResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.parentEvmAddr = str;
        this.subEvmAddr = str2;
        this.commissionRate = str3;
        this.status = i;
    }
}
