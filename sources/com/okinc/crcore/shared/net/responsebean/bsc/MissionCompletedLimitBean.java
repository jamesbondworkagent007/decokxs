package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionCompletedLimitResponseBean;
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
public final class MissionCompletedLimitBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int timesPerDay;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionCompletedLimitBean() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MissionCompletedLimitBean copy$default(MissionCompletedLimitBean missionCompletedLimitBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = missionCompletedLimitBean.timesPerDay;
        }
        return missionCompletedLimitBean.copy(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.timesPerDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionCompletedLimitBean copy(int i) {
        return new MissionCompletedLimitBean(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MissionCompletedLimitBean) && this.timesPerDay == ((MissionCompletedLimitBean) obj).timesPerDay;
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
        return "MissionCompletedLimitBean(timesPerDay=" + this.timesPerDay + ")";
    }

    public /* synthetic */ MissionCompletedLimitBean(int i, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.timesPerDay = 0;
        } else {
            this.timesPerDay = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionCompletedLimitBean missionCompletedLimitBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && missionCompletedLimitBean.timesPerDay == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 0, missionCompletedLimitBean.timesPerDay);
    }

    public MissionCompletedLimitBean(int i) {
        this.timesPerDay = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
 A[MD:(int):void (m)] (LINE:165) call: com.okinc.crcore.shared.net.responsebean.bsc.MissionCompletedLimitBean.<init>(int):void type: THIS */
    public /* synthetic */ MissionCompletedLimitBean(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.MissionCompletedLimitBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MissionCompletedLimitBean> serializer() {
            return MissionCompletedLimitBean$$serializer.INSTANCE;
        }

        public final MissionCompletedLimitBean AEQbTJ(@NotNull MissionCompletedLimitResponseBean missionCompletedLimitResponseBean) {
            Intrinsics.checkNotNullParameter(missionCompletedLimitResponseBean, "");
            return new MissionCompletedLimitBean(missionCompletedLimitResponseBean.getTimesPerDay());
        }
    }
}
