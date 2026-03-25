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
public final class MissionCompletedLimitResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final int timesPerDay;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MissionCompletedLimitResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MissionCompletedLimitResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionCompletedLimitResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MissionCompletedLimitResponseBean(parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionCompletedLimitResponseBean[] newArray(int i) {
            return new MissionCompletedLimitResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionCompletedLimitResponseBean() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MissionCompletedLimitResponseBean copy$default(MissionCompletedLimitResponseBean missionCompletedLimitResponseBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = missionCompletedLimitResponseBean.timesPerDay;
        }
        return missionCompletedLimitResponseBean.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.timesPerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionCompletedLimitResponseBean copy(int i) {
        return new MissionCompletedLimitResponseBean(i);
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
        return (obj instanceof MissionCompletedLimitResponseBean) && this.timesPerDay == ((MissionCompletedLimitResponseBean) obj).timesPerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimesPerDay() {
        return this.timesPerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return Integer.hashCode(this.timesPerDay);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MissionCompletedLimitResponseBean(timesPerDay=" + this.timesPerDay + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.timesPerDay);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MissionCompletedLimitResponseBean> serializer() {
            return MissionCompletedLimitResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MissionCompletedLimitResponseBean(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.timesPerDay = 0;
        } else {
            this.timesPerDay = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionCompletedLimitResponseBean missionCompletedLimitResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && missionCompletedLimitResponseBean.timesPerDay == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 0, missionCompletedLimitResponseBean.timesPerDay);
    }

    public MissionCompletedLimitResponseBean(int i) {
        this.timesPerDay = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:80) call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean.<init>(int):void type: THIS */
    public /* synthetic */ MissionCompletedLimitResponseBean(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
