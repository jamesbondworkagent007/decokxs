package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class ReferralTasks {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final TotalReward totalReward;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReferralTasks() {
        this((TotalReward) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReferralTasks copy$default(ReferralTasks referralTasks, TotalReward totalReward, int i, Object obj) {
        if ((i & 1) != 0) {
            totalReward = referralTasks.totalReward;
        }
        return referralTasks.copy(totalReward);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TotalReward component1() {
        return this.totalReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReferralTasks copy(TotalReward totalReward) {
        return new ReferralTasks(totalReward);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReferralTasks) && Intrinsics.EZpvd(this.totalReward, ((ReferralTasks) obj).totalReward);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TotalReward getTotalReward() {
        return this.totalReward;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        TotalReward totalReward = this.totalReward;
        if (totalReward == null) {
            return 0;
        }
        return totalReward.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReferralTasks(totalReward=" + this.totalReward + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.ReferralTasks.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ReferralTasks> serializer() {
            return ReferralTasks$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReferralTasks(int i, TotalReward totalReward, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.totalReward = null;
        } else {
            this.totalReward = totalReward;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(ReferralTasks referralTasks, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && referralTasks.totalReward == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, TotalReward$$serializer.INSTANCE, referralTasks.totalReward);
    }

    public ReferralTasks(TotalReward totalReward) {
        this.totalReward = totalReward;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.remote.TotalReward:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.remote.TotalReward) : (r1v0 com.okinc.okimcore.model.remote.TotalReward))
 A[MD:(com.okinc.okimcore.model.remote.TotalReward):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.ReferralTasks.<init>(com.okinc.okimcore.model.remote.TotalReward):void type: THIS */
    public /* synthetic */ ReferralTasks(TotalReward totalReward, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : totalReward);
    }
}
