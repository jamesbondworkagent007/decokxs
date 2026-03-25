package com.okinc.liveness.eop.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LcaLivenessConfigSensorConfig implements Parcelable {
    public static final int $stable = 0;
    private final Long motionSamplingIntervalFarToCloseMs;
    private final Long motionSamplingIntervalMs;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LcaLivenessConfigSensorConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LcaLivenessConfigSensorConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigSensorConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LcaLivenessConfigSensorConfig(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigSensorConfig[] newArray(int i) {
            return new LcaLivenessConfigSensorConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LcaLivenessConfigSensorConfig() {
        this((Long) null, (Long) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessConfigSensorConfig copy$default(LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = lcaLivenessConfigSensorConfig.motionSamplingIntervalMs;
        }
        if ((i & 2) != 0) {
            l2 = lcaLivenessConfigSensorConfig.motionSamplingIntervalFarToCloseMs;
        }
        return lcaLivenessConfigSensorConfig.copy(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.motionSamplingIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.motionSamplingIntervalFarToCloseMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigSensorConfig copy(Long l, Long l2) {
        return new LcaLivenessConfigSensorConfig(l, l2);
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
        if (!(obj instanceof LcaLivenessConfigSensorConfig)) {
            return false;
        }
        LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig = (LcaLivenessConfigSensorConfig) obj;
        return Intrinsics.EZpvd(this.motionSamplingIntervalMs, lcaLivenessConfigSensorConfig.motionSamplingIntervalMs) && Intrinsics.EZpvd(this.motionSamplingIntervalFarToCloseMs, lcaLivenessConfigSensorConfig.motionSamplingIntervalFarToCloseMs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMotionSamplingIntervalFarToCloseMs() {
        return this.motionSamplingIntervalFarToCloseMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMotionSamplingIntervalMs() {
        return this.motionSamplingIntervalMs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.motionSamplingIntervalMs;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.motionSamplingIntervalFarToCloseMs;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessConfigSensorConfig(motionSamplingIntervalMs=" + this.motionSamplingIntervalMs + ", motionSamplingIntervalFarToCloseMs=" + this.motionSamplingIntervalFarToCloseMs + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.motionSamplingIntervalMs;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.motionSamplingIntervalFarToCloseMs;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LcaLivenessConfigSensorConfig> serializer() {
            return LcaLivenessConfigSensorConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LcaLivenessConfigSensorConfig(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.motionSamplingIntervalMs = null;
        } else {
            this.motionSamplingIntervalMs = l;
        }
        if ((i & 2) == 0) {
            this.motionSamplingIntervalFarToCloseMs = null;
        } else {
            this.motionSamplingIntervalFarToCloseMs = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LcaLivenessConfigSensorConfig lcaLivenessConfigSensorConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || lcaLivenessConfigSensorConfig.motionSamplingIntervalMs != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, lcaLivenessConfigSensorConfig.motionSamplingIntervalMs);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && lcaLivenessConfigSensorConfig.motionSamplingIntervalFarToCloseMs == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, lcaLivenessConfigSensorConfig.motionSamplingIntervalFarToCloseMs);
    }

    public LcaLivenessConfigSensorConfig(Long l, Long l2) {
        this.motionSamplingIntervalMs = l;
        this.motionSamplingIntervalFarToCloseMs = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
 A[MD:(java.lang.Long, java.lang.Long):void (m)] (LINE:119) call: com.okinc.liveness.eop.bean.LcaLivenessConfigSensorConfig.<init>(java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ LcaLivenessConfigSensorConfig(Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2);
    }
}
