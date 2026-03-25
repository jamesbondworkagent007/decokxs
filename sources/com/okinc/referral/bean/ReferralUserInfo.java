package com.okinc.referral.bean;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ReferralUserInfo implements Parcelable {
    private boolean isInFixedRewardEvent;
    private int kycLevel;
    private int onboardingStatus;
    private long remainingTimeInSeconds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReferralUserInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<ReferralUserInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralUserInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReferralUserInfo(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReferralUserInfo[] newArray(int i) {
            return new ReferralUserInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReferralUserInfo() {
        this(0, 0, false, 0L, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReferralUserInfo copy$default(ReferralUserInfo referralUserInfo, int i, int i2, boolean z, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = referralUserInfo.onboardingStatus;
        }
        if ((i3 & 2) != 0) {
            i2 = referralUserInfo.kycLevel;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            z = referralUserInfo.isInFixedRewardEvent;
        }
        boolean z2 = z;
        if ((i3 & 8) != 0) {
            j = referralUserInfo.remainingTimeInSeconds;
        }
        return referralUserInfo.copy(i, i4, z2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.onboardingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isInFixedRewardEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.remainingTimeInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralUserInfo copy(int i, int i2, boolean z, long j) {
        return new ReferralUserInfo(i, i2, z, j);
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
        if (!(obj instanceof ReferralUserInfo)) {
            return false;
        }
        ReferralUserInfo referralUserInfo = (ReferralUserInfo) obj;
        return this.onboardingStatus == referralUserInfo.onboardingStatus && this.kycLevel == referralUserInfo.kycLevel && this.isInFixedRewardEvent == referralUserInfo.isInFixedRewardEvent && this.remainingTimeInSeconds == referralUserInfo.remainingTimeInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getKycLevel() {
        return this.kycLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOnboardingStatus() {
        return this.onboardingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRemainingTimeInSeconds() {
        return this.remainingTimeInSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.onboardingStatus) * 31) + Integer.hashCode(this.kycLevel)) * 31) + Boolean.hashCode(this.isInFixedRewardEvent)) * 31) + Long.hashCode(this.remainingTimeInSeconds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isInFixedRewardEvent() {
        return this.isInFixedRewardEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInFixedRewardEvent(boolean z) {
        this.isInFixedRewardEvent = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKycLevel(int i) {
        this.kycLevel = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnboardingStatus(int i) {
        this.onboardingStatus = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemainingTimeInSeconds(long j) {
        this.remainingTimeInSeconds = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralUserInfo(onboardingStatus=" + this.onboardingStatus + ", kycLevel=" + this.kycLevel + ", isInFixedRewardEvent=" + this.isInFixedRewardEvent + ", remainingTimeInSeconds=" + this.remainingTimeInSeconds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.onboardingStatus);
        parcel.writeInt(this.kycLevel);
        parcel.writeInt(this.isInFixedRewardEvent ? 1 : 0);
        parcel.writeLong(this.remainingTimeInSeconds);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.referral.bean.ReferralUserInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReferralUserInfo> serializer() {
            return ReferralUserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReferralUserInfo(int i, int i2, int i3, boolean z, long j, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.onboardingStatus = 0;
        } else {
            this.onboardingStatus = i2;
        }
        if ((i & 2) == 0) {
            this.kycLevel = 0;
        } else {
            this.kycLevel = i3;
        }
        if ((i & 4) == 0) {
            this.isInFixedRewardEvent = false;
        } else {
            this.isInFixedRewardEvent = z;
        }
        if ((i & 8) == 0) {
            this.remainingTimeInSeconds = 0L;
        } else {
            this.remainingTimeInSeconds = j;
        }
    }

    public static final /* synthetic */ void write$Self$OKReferral_referral_api(ReferralUserInfo referralUserInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || referralUserInfo.onboardingStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, referralUserInfo.onboardingStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || referralUserInfo.kycLevel != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, referralUserInfo.kycLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || referralUserInfo.isInFixedRewardEvent) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, referralUserInfo.isInFixedRewardEvent);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && referralUserInfo.remainingTimeInSeconds == 0) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 3, referralUserInfo.remainingTimeInSeconds);
    }

    public ReferralUserInfo(int i, int i2, boolean z, long j) {
        this.onboardingStatus = i;
        this.kycLevel = i2;
        this.isInFixedRewardEvent = z;
        this.remainingTimeInSeconds = j;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r8v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r5v0 boolean) : false)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0015: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r6v0 long))
 A[MD:(int, int, boolean, long):void (m)] (LINE:11) call: com.okinc.referral.bean.ReferralUserInfo.<init>(int, int, boolean, long):void type: THIS */
    public /* synthetic */ ReferralUserInfo(int i, int i2, boolean z, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) == 0 ? z : false, (i3 & 8) != 0 ? 0L : j);
    }
}
