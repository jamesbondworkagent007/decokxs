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
public final class MissionStreakResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final MissionCompletedLimitResponseBean missionCompletedLimit;
    private final int resetStreakIfMissedStreak;
    private final int streakCount;
    private final boolean streakRequired;
    private final String timeZone;
    private final int timesCompletedToday;
    private final int total;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MissionStreakResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MissionStreakResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionStreakResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MissionStreakResponseBean(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : MissionCompletedLimitResponseBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MissionStreakResponseBean[] newArray(int i) {
            return new MissionStreakResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionStreakResponseBean() {
        this(0, 0, (String) null, false, 0, 0, (MissionCompletedLimitResponseBean) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MissionStreakResponseBean copy$default(MissionStreakResponseBean missionStreakResponseBean, int i, int i2, String str, boolean z, int i3, int i4, MissionCompletedLimitResponseBean missionCompletedLimitResponseBean, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = missionStreakResponseBean.total;
        }
        if ((i5 & 2) != 0) {
            i2 = missionStreakResponseBean.resetStreakIfMissedStreak;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            str = missionStreakResponseBean.timeZone;
        }
        String str2 = str;
        if ((i5 & 8) != 0) {
            z = missionStreakResponseBean.streakRequired;
        }
        boolean z2 = z;
        if ((i5 & 16) != 0) {
            i3 = missionStreakResponseBean.streakCount;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = missionStreakResponseBean.timesCompletedToday;
        }
        int i8 = i4;
        if ((i5 & 64) != 0) {
            missionCompletedLimitResponseBean = missionStreakResponseBean.missionCompletedLimit;
        }
        return missionStreakResponseBean.copy(i, i6, str2, z2, i7, i8, missionCompletedLimitResponseBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.resetStreakIfMissedStreak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.streakRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.streakCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.timesCompletedToday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionCompletedLimitResponseBean component7() {
        return this.missionCompletedLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionStreakResponseBean copy(int i, int i2, @NotNull String str, boolean z, int i3, int i4, MissionCompletedLimitResponseBean missionCompletedLimitResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MissionStreakResponseBean(i, i2, str, z, i3, i4, missionCompletedLimitResponseBean);
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
        if (!(obj instanceof MissionStreakResponseBean)) {
            return false;
        }
        MissionStreakResponseBean missionStreakResponseBean = (MissionStreakResponseBean) obj;
        return this.total == missionStreakResponseBean.total && this.resetStreakIfMissedStreak == missionStreakResponseBean.resetStreakIfMissedStreak && Intrinsics.EZpvd((Object) this.timeZone, (Object) missionStreakResponseBean.timeZone) && this.streakRequired == missionStreakResponseBean.streakRequired && this.streakCount == missionStreakResponseBean.streakCount && this.timesCompletedToday == missionStreakResponseBean.timesCompletedToday && Intrinsics.EZpvd(this.missionCompletedLimit, missionStreakResponseBean.missionCompletedLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionCompletedLimitResponseBean getMissionCompletedLimit() {
        return this.missionCompletedLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getResetStreakIfMissedStreak() {
        return this.resetStreakIfMissedStreak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStreakCount() {
        return this.streakCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getStreakRequired() {
        return this.streakRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTimeZone() {
        return this.timeZone;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimesCompletedToday() {
        return this.timesCompletedToday;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.total);
        int iHashCode2 = Integer.hashCode(this.resetStreakIfMissedStreak);
        int iHashCode3 = this.timeZone.hashCode();
        int iHashCode4 = Boolean.hashCode(this.streakRequired);
        int iHashCode5 = Integer.hashCode(this.streakCount);
        int iHashCode6 = Integer.hashCode(this.timesCompletedToday);
        MissionCompletedLimitResponseBean missionCompletedLimitResponseBean = this.missionCompletedLimit;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (missionCompletedLimitResponseBean == null ? 0 : missionCompletedLimitResponseBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MissionStreakResponseBean(total=" + this.total + ", resetStreakIfMissedStreak=" + this.resetStreakIfMissedStreak + ", timeZone=" + this.timeZone + ", streakRequired=" + this.streakRequired + ", streakCount=" + this.streakCount + ", timesCompletedToday=" + this.timesCompletedToday + ", missionCompletedLimit=" + this.missionCompletedLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.total);
        parcel.writeInt(this.resetStreakIfMissedStreak);
        parcel.writeString(this.timeZone);
        parcel.writeInt(this.streakRequired ? 1 : 0);
        parcel.writeInt(this.streakCount);
        parcel.writeInt(this.timesCompletedToday);
        MissionCompletedLimitResponseBean missionCompletedLimitResponseBean = this.missionCompletedLimit;
        if (missionCompletedLimitResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            missionCompletedLimitResponseBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MissionStreakResponseBean> serializer() {
            return MissionStreakResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MissionStreakResponseBean(int i, int i2, int i3, String str, boolean z, int i4, int i5, MissionCompletedLimitResponseBean missionCompletedLimitResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.total = 0;
        } else {
            this.total = i2;
        }
        if ((i & 2) == 0) {
            this.resetStreakIfMissedStreak = 0;
        } else {
            this.resetStreakIfMissedStreak = i3;
        }
        if ((i & 4) == 0) {
            this.timeZone = "";
        } else {
            this.timeZone = str;
        }
        if ((i & 8) == 0) {
            this.streakRequired = false;
        } else {
            this.streakRequired = z;
        }
        if ((i & 16) == 0) {
            this.streakCount = 0;
        } else {
            this.streakCount = i4;
        }
        if ((i & 32) == 0) {
            this.timesCompletedToday = 0;
        } else {
            this.timesCompletedToday = i5;
        }
        if ((i & 64) == 0) {
            this.missionCompletedLimit = null;
        } else {
            this.missionCompletedLimit = missionCompletedLimitResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionStreakResponseBean missionStreakResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || missionStreakResponseBean.total != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, missionStreakResponseBean.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || missionStreakResponseBean.resetStreakIfMissedStreak != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, missionStreakResponseBean.resetStreakIfMissedStreak);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) missionStreakResponseBean.timeZone, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, missionStreakResponseBean.timeZone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || missionStreakResponseBean.streakRequired) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, missionStreakResponseBean.streakRequired);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || missionStreakResponseBean.streakCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, missionStreakResponseBean.streakCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || missionStreakResponseBean.timesCompletedToday != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, missionStreakResponseBean.timesCompletedToday);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && missionStreakResponseBean.missionCompletedLimit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, MissionCompletedLimitResponseBean$$serializer.INSTANCE, missionStreakResponseBean.missionCompletedLimit);
    }

    public MissionStreakResponseBean(int i, int i2, @NotNull String str, boolean z, int i3, int i4, MissionCompletedLimitResponseBean missionCompletedLimitResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        this.total = i;
        this.resetStreakIfMissedStreak = i2;
        this.timeZone = str;
        this.streakRequired = z;
        this.streakCount = i3;
        this.timesCompletedToday = i4;
        this.missionCompletedLimit = missionCompletedLimitResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 int) : (0 int))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean) : (r12v0 com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean))
 A[MD:(int, int, java.lang.String, boolean, int, int, com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean):void (m)] (LINE:67) call: com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean.<init>(int, int, java.lang.String, boolean, int, int, com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean):void type: THIS */
    public /* synthetic */ MissionStreakResponseBean(int i, int i2, String str, boolean z, int i3, int i4, MissionCompletedLimitResponseBean missionCompletedLimitResponseBean, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? false : z, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) == 0 ? i4 : 0, (i5 & 64) != 0 ? null : missionCompletedLimitResponseBean);
    }
}
