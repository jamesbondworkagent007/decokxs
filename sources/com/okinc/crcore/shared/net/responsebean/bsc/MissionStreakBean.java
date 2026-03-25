package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionStreakResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class MissionStreakBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final MissionCompletedLimitBean missionCompletedLimit;
    private final int resetStreakIfMissedStreak;
    private final int streakCount;
    private final boolean streakRequired;
    private final String timeZone;
    private final int timesCompletedToday;
    private final int total;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionStreakBean() {
        this(0, 0, (String) null, false, 0, 0, (MissionCompletedLimitBean) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MissionStreakBean copy$default(MissionStreakBean missionStreakBean, int i, int i2, String str, boolean z, int i3, int i4, MissionCompletedLimitBean missionCompletedLimitBean, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = missionStreakBean.total;
        }
        if ((i5 & 2) != 0) {
            i2 = missionStreakBean.resetStreakIfMissedStreak;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            str = missionStreakBean.timeZone;
        }
        String str2 = str;
        if ((i5 & 8) != 0) {
            z = missionStreakBean.streakRequired;
        }
        boolean z2 = z;
        if ((i5 & 16) != 0) {
            i3 = missionStreakBean.streakCount;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = missionStreakBean.timesCompletedToday;
        }
        int i8 = i4;
        if ((i5 & 64) != 0) {
            missionCompletedLimitBean = missionStreakBean.missionCompletedLimit;
        }
        return missionStreakBean.copy(i, i6, str2, z2, i7, i8, missionCompletedLimitBean);
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
    public final MissionCompletedLimitBean component7() {
        return this.missionCompletedLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionStreakBean copy(int i, int i2, @NotNull String str, boolean z, int i3, int i4, MissionCompletedLimitBean missionCompletedLimitBean) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MissionStreakBean(i, i2, str, z, i3, i4, missionCompletedLimitBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionStreakBean)) {
            return false;
        }
        MissionStreakBean missionStreakBean = (MissionStreakBean) obj;
        return this.total == missionStreakBean.total && this.resetStreakIfMissedStreak == missionStreakBean.resetStreakIfMissedStreak && Intrinsics.EZpvd((Object) this.timeZone, (Object) missionStreakBean.timeZone) && this.streakRequired == missionStreakBean.streakRequired && this.streakCount == missionStreakBean.streakCount && this.timesCompletedToday == missionStreakBean.timesCompletedToday && Intrinsics.EZpvd(this.missionCompletedLimit, missionStreakBean.missionCompletedLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionCompletedLimitBean getMissionCompletedLimit() {
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
        MissionCompletedLimitBean missionCompletedLimitBean = this.missionCompletedLimit;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (missionCompletedLimitBean == null ? 0 : missionCompletedLimitBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MissionStreakBean(total=" + this.total + ", resetStreakIfMissedStreak=" + this.resetStreakIfMissedStreak + ", timeZone=" + this.timeZone + ", streakRequired=" + this.streakRequired + ", streakCount=" + this.streakCount + ", timesCompletedToday=" + this.timesCompletedToday + ", missionCompletedLimit=" + this.missionCompletedLimit + ")";
    }

    public /* synthetic */ MissionStreakBean(int i, int i2, int i3, String str, boolean z, int i4, int i5, MissionCompletedLimitBean missionCompletedLimitBean, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.missionCompletedLimit = missionCompletedLimitBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionStreakBean missionStreakBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || missionStreakBean.total != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, missionStreakBean.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || missionStreakBean.resetStreakIfMissedStreak != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, missionStreakBean.resetStreakIfMissedStreak);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) missionStreakBean.timeZone, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, missionStreakBean.timeZone);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || missionStreakBean.streakRequired) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, missionStreakBean.streakRequired);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || missionStreakBean.streakCount != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, missionStreakBean.streakCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || missionStreakBean.timesCompletedToday != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, missionStreakBean.timesCompletedToday);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && missionStreakBean.missionCompletedLimit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, MissionCompletedLimitBean$$serializer.INSTANCE, missionStreakBean.missionCompletedLimit);
    }

    public MissionStreakBean(int i, int i2, @NotNull String str, boolean z, int i3, int i4, MissionCompletedLimitBean missionCompletedLimitBean) {
        Intrinsics.checkNotNullParameter(str, "");
        this.total = i;
        this.resetStreakIfMissedStreak = i2;
        this.timeZone = str;
        this.streakRequired = z;
        this.streakCount = i3;
        this.timesCompletedToday = i4;
        this.missionCompletedLimit = missionCompletedLimitBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 int) : (0 int))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.MissionCompletedLimitBean:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.MissionCompletedLimitBean) : (r12v0 com.okinc.crcore.shared.net.responsebean.bsc.MissionCompletedLimitBean))
 A[MD:(int, int, java.lang.String, boolean, int, int, com.okinc.crcore.shared.net.responsebean.bsc.MissionCompletedLimitBean):void (m)] (LINE:135) call: com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean.<init>(int, int, java.lang.String, boolean, int, int, com.okinc.crcore.shared.net.responsebean.bsc.MissionCompletedLimitBean):void type: THIS */
    public /* synthetic */ MissionStreakBean(int i, int i2, String str, boolean z, int i3, int i4, MissionCompletedLimitBean missionCompletedLimitBean, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? "" : str, (i5 & 8) != 0 ? false : z, (i5 & 16) != 0 ? 0 : i3, (i5 & 32) == 0 ? i4 : 0, (i5 & 64) != 0 ? null : missionCompletedLimitBean);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MissionStreakBean> serializer() {
            return MissionStreakBean$$serializer.INSTANCE;
        }

        public final MissionStreakBean OLrzqt(@NotNull MissionStreakResponseBean missionStreakResponseBean) {
            Intrinsics.checkNotNullParameter(missionStreakResponseBean, "");
            int total = missionStreakResponseBean.getTotal();
            int resetStreakIfMissedStreak = missionStreakResponseBean.getResetStreakIfMissedStreak();
            String timeZone = missionStreakResponseBean.getTimeZone();
            boolean streakRequired = missionStreakResponseBean.getStreakRequired();
            int streakCount = missionStreakResponseBean.getStreakCount();
            int timesCompletedToday = missionStreakResponseBean.getTimesCompletedToday();
            MissionCompletedLimitResponseBean missionCompletedLimit = missionStreakResponseBean.getMissionCompletedLimit();
            return new MissionStreakBean(total, resetStreakIfMissedStreak, timeZone, streakRequired, streakCount, timesCompletedToday, missionCompletedLimit != null ? MissionCompletedLimitBean.Companion.AEQbTJ(missionCompletedLimit) : null);
        }
    }
}
