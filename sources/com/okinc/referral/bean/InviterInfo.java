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
public final class InviterInfo implements Parcelable {
    private boolean isAffiliate;
    private int unclaimedMysteryBoxCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InviterInfo> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<InviterInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InviterInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InviterInfo(parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InviterInfo[] newArray(int i) {
            return new InviterInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InviterInfo() {
        this(0, (boolean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InviterInfo copy$default(InviterInfo inviterInfo, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = inviterInfo.unclaimedMysteryBoxCount;
        }
        if ((i2 & 2) != 0) {
            z = inviterInfo.isAffiliate;
        }
        return inviterInfo.copy(i, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.unclaimedMysteryBoxCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isAffiliate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InviterInfo copy(int i, boolean z) {
        return new InviterInfo(i, z);
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
        if (!(obj instanceof InviterInfo)) {
            return false;
        }
        InviterInfo inviterInfo = (InviterInfo) obj;
        return this.unclaimedMysteryBoxCount == inviterInfo.unclaimedMysteryBoxCount && this.isAffiliate == inviterInfo.isAffiliate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUnclaimedMysteryBoxCount() {
        return this.unclaimedMysteryBoxCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.unclaimedMysteryBoxCount) * 31) + Boolean.hashCode(this.isAffiliate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAffiliate() {
        return this.isAffiliate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAffiliate(boolean z) {
        this.isAffiliate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnclaimedMysteryBoxCount(int i) {
        this.unclaimedMysteryBoxCount = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InviterInfo(unclaimedMysteryBoxCount=" + this.unclaimedMysteryBoxCount + ", isAffiliate=" + this.isAffiliate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.unclaimedMysteryBoxCount);
        parcel.writeInt(this.isAffiliate ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.referral.bean.InviterInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InviterInfo> serializer() {
            return InviterInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InviterInfo(int i, int i2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.unclaimedMysteryBoxCount = 0;
        } else {
            this.unclaimedMysteryBoxCount = i2;
        }
        if ((i & 2) == 0) {
            this.isAffiliate = false;
        } else {
            this.isAffiliate = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKReferral_referral_api(InviterInfo inviterInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inviterInfo.unclaimedMysteryBoxCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, inviterInfo.unclaimedMysteryBoxCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inviterInfo.isAffiliate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, inviterInfo.isAffiliate);
        }
    }

    public InviterInfo(int i, boolean z) {
        this.unclaimedMysteryBoxCount = i;
        this.isAffiliate = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(int, boolean):void (m)] (LINE:21) call: com.okinc.referral.bean.InviterInfo.<init>(int, boolean):void type: THIS */
    public /* synthetic */ InviterInfo(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }
}
