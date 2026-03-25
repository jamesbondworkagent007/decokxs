package com.okinc.crcore.shared.net.responsebean.bsc;

import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionConstraintsResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.MissionMetadataResponseBean;
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
public final class MissionMetadataBean {
    private final MissionConstrainsBean constraints;
    private final MissionStreakBean streak;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MissionMetadataBean() {
        this((MissionConstrainsBean) null, (MissionStreakBean) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MissionMetadataBean copy$default(MissionMetadataBean missionMetadataBean, MissionConstrainsBean missionConstrainsBean, MissionStreakBean missionStreakBean, int i, Object obj) {
        if ((i & 1) != 0) {
            missionConstrainsBean = missionMetadataBean.constraints;
        }
        if ((i & 2) != 0) {
            missionStreakBean = missionMetadataBean.streak;
        }
        return missionMetadataBean.copy(missionConstrainsBean, missionStreakBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionConstrainsBean component1() {
        return this.constraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionStreakBean component2() {
        return this.streak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionMetadataBean copy(MissionConstrainsBean missionConstrainsBean, MissionStreakBean missionStreakBean) {
        return new MissionMetadataBean(missionConstrainsBean, missionStreakBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionMetadataBean)) {
            return false;
        }
        MissionMetadataBean missionMetadataBean = (MissionMetadataBean) obj;
        return Intrinsics.EZpvd(this.constraints, missionMetadataBean.constraints) && Intrinsics.EZpvd(this.streak, missionMetadataBean.streak);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionConstrainsBean getConstraints() {
        return this.constraints;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MissionStreakBean getStreak() {
        return this.streak;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MissionConstrainsBean missionConstrainsBean = this.constraints;
        int iHashCode = missionConstrainsBean == null ? 0 : missionConstrainsBean.hashCode();
        MissionStreakBean missionStreakBean = this.streak;
        return (iHashCode * 31) + (missionStreakBean != null ? missionStreakBean.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MissionMetadataBean(constraints=" + this.constraints + ", streak=" + this.streak + ")";
    }

    public /* synthetic */ MissionMetadataBean(int i, MissionConstrainsBean missionConstrainsBean, MissionStreakBean missionStreakBean, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.constraints = null;
        } else {
            this.constraints = missionConstrainsBean;
        }
        if ((i & 2) == 0) {
            this.streak = null;
        } else {
            this.streak = missionStreakBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(MissionMetadataBean missionMetadataBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || missionMetadataBean.constraints != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MissionConstrainsBean$$serializer.INSTANCE, missionMetadataBean.constraints);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && missionMetadataBean.streak == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, MissionStreakBean$$serializer.INSTANCE, missionMetadataBean.streak);
    }

    public MissionMetadataBean(MissionConstrainsBean missionConstrainsBean, MissionStreakBean missionStreakBean) {
        this.constraints = missionConstrainsBean;
        this.streak = missionStreakBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.MissionConstrainsBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.MissionConstrainsBean) : (r2v0 com.okinc.crcore.shared.net.responsebean.bsc.MissionConstrainsBean))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean) : (r3v0 com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean))
 A[MD:(com.okinc.crcore.shared.net.responsebean.bsc.MissionConstrainsBean, com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean):void (m)] (LINE:87) call: com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean.<init>(com.okinc.crcore.shared.net.responsebean.bsc.MissionConstrainsBean, com.okinc.crcore.shared.net.responsebean.bsc.MissionStreakBean):void type: THIS */
    public /* synthetic */ MissionMetadataBean(MissionConstrainsBean missionConstrainsBean, MissionStreakBean missionStreakBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : missionConstrainsBean, (i & 2) != 0 ? null : missionStreakBean);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.MissionMetadataBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MissionMetadataBean> serializer() {
            return MissionMetadataBean$$serializer.INSTANCE;
        }

        public final MissionMetadataBean copydefault(@NotNull MissionMetadataResponseBean missionMetadataResponseBean) {
            Intrinsics.checkNotNullParameter(missionMetadataResponseBean, "");
            MissionConstraintsResponseBean constraints = missionMetadataResponseBean.getConstraints();
            MissionConstrainsBean missionConstrainsBeanEZpvd = constraints != null ? MissionConstrainsBean.Companion.EZpvd(constraints) : null;
            MissionStreakResponseBean streak = missionMetadataResponseBean.getStreak();
            return new MissionMetadataBean(missionConstrainsBeanEZpvd, streak != null ? MissionStreakBean.Companion.OLrzqt(streak) : null);
        }
    }
}
