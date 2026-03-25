package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class MissionMetadataResponseBean implements Parcelable {
    private final MissionConstraintsResponseBean constraints;
    private final MissionStreakResponseBean streak;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MissionMetadataResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MissionMetadataResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionMetadataResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MissionMetadataResponseBean(parcel.readInt() == 0 ? null : MissionConstraintsResponseBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MissionStreakResponseBean.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionMetadataResponseBean[] newArray(int i) {
            return new MissionMetadataResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionMetadataResponseBean() {
        this((MissionConstraintsResponseBean) null, (MissionStreakResponseBean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MissionMetadataResponseBean copy$default(MissionMetadataResponseBean missionMetadataResponseBean, MissionConstraintsResponseBean missionConstraintsResponseBean, MissionStreakResponseBean missionStreakResponseBean, int i, Object obj) {
        if ((i & 1) != 0) {
            missionConstraintsResponseBean = missionMetadataResponseBean.constraints;
        }
        if ((i & 2) != 0) {
            missionStreakResponseBean = missionMetadataResponseBean.streak;
        }
        return missionMetadataResponseBean.copy(missionConstraintsResponseBean, missionStreakResponseBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionConstraintsResponseBean component1() {
        return this.constraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionStreakResponseBean component2() {
        return this.streak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionMetadataResponseBean copy(MissionConstraintsResponseBean missionConstraintsResponseBean, MissionStreakResponseBean missionStreakResponseBean) {
        return new MissionMetadataResponseBean(missionConstraintsResponseBean, missionStreakResponseBean);
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
        if (!(obj instanceof MissionMetadataResponseBean)) {
            return false;
        }
        MissionMetadataResponseBean missionMetadataResponseBean = (MissionMetadataResponseBean) obj;
        return Intrinsics.EZpvd(this.constraints, missionMetadataResponseBean.constraints) && Intrinsics.EZpvd(this.streak, missionMetadataResponseBean.streak);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionConstraintsResponseBean getConstraints() {
        return this.constraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionStreakResponseBean getStreak() {
        return this.streak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MissionConstraintsResponseBean missionConstraintsResponseBean = this.constraints;
        int iHashCode = missionConstraintsResponseBean == null ? 0 : missionConstraintsResponseBean.hashCode();
        MissionStreakResponseBean missionStreakResponseBean = this.streak;
        return (iHashCode * 31) + (missionStreakResponseBean != null ? missionStreakResponseBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MissionMetadataResponseBean(constraints=" + this.constraints + ", streak=" + this.streak + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        MissionConstraintsResponseBean missionConstraintsResponseBean = this.constraints;
        if (missionConstraintsResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            missionConstraintsResponseBean.writeToParcel(parcel, i);
        }
        MissionStreakResponseBean missionStreakResponseBean = this.streak;
        if (missionStreakResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            missionStreakResponseBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionMetadataResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MissionMetadataResponseBean> serializer() {
            return MissionMetadataResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MissionMetadataResponseBean(int i, MissionConstraintsResponseBean missionConstraintsResponseBean, MissionStreakResponseBean missionStreakResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.constraints = null;
        } else {
            this.constraints = missionConstraintsResponseBean;
        }
        if ((i & 2) == 0) {
            this.streak = null;
        } else {
            this.streak = missionStreakResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionMetadataResponseBean missionMetadataResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || missionMetadataResponseBean.constraints != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MissionConstraintsResponseBean$$serializer.INSTANCE, missionMetadataResponseBean.constraints);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && missionMetadataResponseBean.streak == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, MissionStreakResponseBean$$serializer.INSTANCE, missionMetadataResponseBean.streak);
    }

    public MissionMetadataResponseBean(MissionConstraintsResponseBean missionConstraintsResponseBean, MissionStreakResponseBean missionStreakResponseBean) {
        this.constraints = missionConstraintsResponseBean;
        this.streak = missionStreakResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean) : (r2v0 com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean) : (r3v0 com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean))
 A[MD:(com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean):void (m)] (LINE:47) call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionMetadataResponseBean.<init>(com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean, com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean):void type: THIS */
    public /* synthetic */ MissionMetadataResponseBean(MissionConstraintsResponseBean missionConstraintsResponseBean, MissionStreakResponseBean missionStreakResponseBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : missionConstraintsResponseBean, (i & 2) != 0 ? null : missionStreakResponseBean);
    }
}
