package com.okinc.liveness.eop.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LcaLivenessConfigFaceDetectionConfig implements Parcelable {
    public static final int $stable = 0;
    private final Long colorFlashingTimeout;
    private final Float faceDetectionScoreThreshold;
    private final Integer farHoldDuration;
    private final Float freshFaceDistanceThresholdMax;
    private final Float freshFaceDistanceThresholdMin;
    private final Integer freshnessQcDelayDuration;
    private final Float initialFaceDistanceThresholdMax;
    private final Float initialFaceDistanceThresholdMin;
    private final Float notFrontalFaceEyeDistanceRatioThreshold;
    private final Float notFrontalFaceHeadPitchAngelThreshold;
    private final Float notFrontalFaceHeadTiltAngelThreshold;
    private final Float onHoldThresholdMaxRatio;
    private final Float onHoldThresholdMinRatio;
    private final Integer ovalFitTimeout;
    private final Float positionBottomThreshold;
    private final Float positionTopThreshold;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LcaLivenessConfigFaceDetectionConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LcaLivenessConfigFaceDetectionConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigFaceDetectionConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LcaLivenessConfigFaceDetectionConfig(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigFaceDetectionConfig[] newArray(int i) {
            return new LcaLivenessConfigFaceDetectionConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.faceDetectionScoreThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component10() {
        return this.positionTopThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component11() {
        return this.positionBottomThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component12() {
        return this.notFrontalFaceHeadTiltAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component13() {
        return this.notFrontalFaceHeadPitchAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component14() {
        return this.notFrontalFaceEyeDistanceRatioThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.freshnessQcDelayDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component16() {
        return this.colorFlashingTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component2() {
        return this.initialFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.initialFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.freshFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.freshFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.farHoldDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component8() {
        return this.onHoldThresholdMaxRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component9() {
        return this.onHoldThresholdMinRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceDetectionConfig copy(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Integer num3, Long l) {
        return new LcaLivenessConfigFaceDetectionConfig(f, f2, f3, f4, f5, num, num2, f6, f7, f8, f9, f10, f11, f12, num3, l);
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
        if (!(obj instanceof LcaLivenessConfigFaceDetectionConfig)) {
            return false;
        }
        LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig = (LcaLivenessConfigFaceDetectionConfig) obj;
        return Intrinsics.EZpvd(this.faceDetectionScoreThreshold, lcaLivenessConfigFaceDetectionConfig.faceDetectionScoreThreshold) && Intrinsics.EZpvd(this.initialFaceDistanceThresholdMax, lcaLivenessConfigFaceDetectionConfig.initialFaceDistanceThresholdMax) && Intrinsics.EZpvd(this.initialFaceDistanceThresholdMin, lcaLivenessConfigFaceDetectionConfig.initialFaceDistanceThresholdMin) && Intrinsics.EZpvd(this.freshFaceDistanceThresholdMax, lcaLivenessConfigFaceDetectionConfig.freshFaceDistanceThresholdMax) && Intrinsics.EZpvd(this.freshFaceDistanceThresholdMin, lcaLivenessConfigFaceDetectionConfig.freshFaceDistanceThresholdMin) && Intrinsics.EZpvd(this.ovalFitTimeout, lcaLivenessConfigFaceDetectionConfig.ovalFitTimeout) && Intrinsics.EZpvd(this.farHoldDuration, lcaLivenessConfigFaceDetectionConfig.farHoldDuration) && Intrinsics.EZpvd(this.onHoldThresholdMaxRatio, lcaLivenessConfigFaceDetectionConfig.onHoldThresholdMaxRatio) && Intrinsics.EZpvd(this.onHoldThresholdMinRatio, lcaLivenessConfigFaceDetectionConfig.onHoldThresholdMinRatio) && Intrinsics.EZpvd(this.positionTopThreshold, lcaLivenessConfigFaceDetectionConfig.positionTopThreshold) && Intrinsics.EZpvd(this.positionBottomThreshold, lcaLivenessConfigFaceDetectionConfig.positionBottomThreshold) && Intrinsics.EZpvd(this.notFrontalFaceHeadTiltAngelThreshold, lcaLivenessConfigFaceDetectionConfig.notFrontalFaceHeadTiltAngelThreshold) && Intrinsics.EZpvd(this.notFrontalFaceHeadPitchAngelThreshold, lcaLivenessConfigFaceDetectionConfig.notFrontalFaceHeadPitchAngelThreshold) && Intrinsics.EZpvd(this.notFrontalFaceEyeDistanceRatioThreshold, lcaLivenessConfigFaceDetectionConfig.notFrontalFaceEyeDistanceRatioThreshold) && Intrinsics.EZpvd(this.freshnessQcDelayDuration, lcaLivenessConfigFaceDetectionConfig.freshnessQcDelayDuration) && Intrinsics.EZpvd(this.colorFlashingTimeout, lcaLivenessConfigFaceDetectionConfig.colorFlashingTimeout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getColorFlashingTimeout() {
        return this.colorFlashingTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceDetectionScoreThreshold() {
        return this.faceDetectionScoreThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFarHoldDuration() {
        return this.farHoldDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFreshFaceDistanceThresholdMax() {
        return this.freshFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFreshFaceDistanceThresholdMin() {
        return this.freshFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFreshnessQcDelayDuration() {
        return this.freshnessQcDelayDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getInitialFaceDistanceThresholdMax() {
        return this.initialFaceDistanceThresholdMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getInitialFaceDistanceThresholdMin() {
        return this.initialFaceDistanceThresholdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getNotFrontalFaceEyeDistanceRatioThreshold() {
        return this.notFrontalFaceEyeDistanceRatioThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getNotFrontalFaceHeadPitchAngelThreshold() {
        return this.notFrontalFaceHeadPitchAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getNotFrontalFaceHeadTiltAngelThreshold() {
        return this.notFrontalFaceHeadTiltAngelThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getOnHoldThresholdMaxRatio() {
        return this.onHoldThresholdMaxRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getOnHoldThresholdMinRatio() {
        return this.onHoldThresholdMinRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOvalFitTimeout() {
        return this.ovalFitTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPositionBottomThreshold() {
        return this.positionBottomThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getPositionTopThreshold() {
        return this.positionTopThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.faceDetectionScoreThreshold;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.initialFaceDistanceThresholdMax;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.initialFaceDistanceThresholdMin;
        int iHashCode3 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.freshFaceDistanceThresholdMax;
        int iHashCode4 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.freshFaceDistanceThresholdMin;
        int iHashCode5 = f5 == null ? 0 : f5.hashCode();
        Integer num = this.ovalFitTimeout;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.farHoldDuration;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        Float f6 = this.onHoldThresholdMaxRatio;
        int iHashCode8 = f6 == null ? 0 : f6.hashCode();
        Float f7 = this.onHoldThresholdMinRatio;
        int iHashCode9 = f7 == null ? 0 : f7.hashCode();
        Float f8 = this.positionTopThreshold;
        int iHashCode10 = f8 == null ? 0 : f8.hashCode();
        Float f9 = this.positionBottomThreshold;
        int iHashCode11 = f9 == null ? 0 : f9.hashCode();
        Float f10 = this.notFrontalFaceHeadTiltAngelThreshold;
        int iHashCode12 = f10 == null ? 0 : f10.hashCode();
        Float f11 = this.notFrontalFaceHeadPitchAngelThreshold;
        int iHashCode13 = f11 == null ? 0 : f11.hashCode();
        Float f12 = this.notFrontalFaceEyeDistanceRatioThreshold;
        int iHashCode14 = f12 == null ? 0 : f12.hashCode();
        Integer num3 = this.freshnessQcDelayDuration;
        int iHashCode15 = num3 == null ? 0 : num3.hashCode();
        Long l = this.colorFlashingTimeout;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessConfigFaceDetectionConfig(faceDetectionScoreThreshold=" + this.faceDetectionScoreThreshold + ", initialFaceDistanceThresholdMax=" + this.initialFaceDistanceThresholdMax + ", initialFaceDistanceThresholdMin=" + this.initialFaceDistanceThresholdMin + ", freshFaceDistanceThresholdMax=" + this.freshFaceDistanceThresholdMax + ", freshFaceDistanceThresholdMin=" + this.freshFaceDistanceThresholdMin + ", ovalFitTimeout=" + this.ovalFitTimeout + ", farHoldDuration=" + this.farHoldDuration + ", onHoldThresholdMaxRatio=" + this.onHoldThresholdMaxRatio + ", onHoldThresholdMinRatio=" + this.onHoldThresholdMinRatio + ", positionTopThreshold=" + this.positionTopThreshold + ", positionBottomThreshold=" + this.positionBottomThreshold + ", notFrontalFaceHeadTiltAngelThreshold=" + this.notFrontalFaceHeadTiltAngelThreshold + ", notFrontalFaceHeadPitchAngelThreshold=" + this.notFrontalFaceHeadPitchAngelThreshold + ", notFrontalFaceEyeDistanceRatioThreshold=" + this.notFrontalFaceEyeDistanceRatioThreshold + ", freshnessQcDelayDuration=" + this.freshnessQcDelayDuration + ", colorFlashingTimeout=" + this.colorFlashingTimeout + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Float f = this.faceDetectionScoreThreshold;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.initialFaceDistanceThresholdMax;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.initialFaceDistanceThresholdMin;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.freshFaceDistanceThresholdMax;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
        Float f5 = this.freshFaceDistanceThresholdMin;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f5.floatValue());
        }
        Integer num = this.ovalFitTimeout;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.farHoldDuration;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Float f6 = this.onHoldThresholdMaxRatio;
        if (f6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f6.floatValue());
        }
        Float f7 = this.onHoldThresholdMinRatio;
        if (f7 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f7.floatValue());
        }
        Float f8 = this.positionTopThreshold;
        if (f8 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f8.floatValue());
        }
        Float f9 = this.positionBottomThreshold;
        if (f9 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f9.floatValue());
        }
        Float f10 = this.notFrontalFaceHeadTiltAngelThreshold;
        if (f10 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f10.floatValue());
        }
        Float f11 = this.notFrontalFaceHeadPitchAngelThreshold;
        if (f11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f11.floatValue());
        }
        Float f12 = this.notFrontalFaceEyeDistanceRatioThreshold;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f12.floatValue());
        }
        Integer num3 = this.freshnessQcDelayDuration;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Long l = this.colorFlashingTimeout;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LcaLivenessConfigFaceDetectionConfig> serializer() {
            return LcaLivenessConfigFaceDetectionConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LcaLivenessConfigFaceDetectionConfig(int i, Float f, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Integer num3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, LcaLivenessConfigFaceDetectionConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.faceDetectionScoreThreshold = f;
        this.initialFaceDistanceThresholdMax = f2;
        this.initialFaceDistanceThresholdMin = f3;
        this.freshFaceDistanceThresholdMax = f4;
        this.freshFaceDistanceThresholdMin = f5;
        this.ovalFitTimeout = num;
        this.farHoldDuration = num2;
        if ((i & 128) == 0) {
            this.onHoldThresholdMaxRatio = null;
        } else {
            this.onHoldThresholdMaxRatio = f6;
        }
        if ((i & 256) == 0) {
            this.onHoldThresholdMinRatio = null;
        } else {
            this.onHoldThresholdMinRatio = f7;
        }
        if ((i & 512) == 0) {
            this.positionTopThreshold = null;
        } else {
            this.positionTopThreshold = f8;
        }
        if ((i & 1024) == 0) {
            this.positionBottomThreshold = null;
        } else {
            this.positionBottomThreshold = f9;
        }
        if ((i & 2048) == 0) {
            this.notFrontalFaceHeadTiltAngelThreshold = null;
        } else {
            this.notFrontalFaceHeadTiltAngelThreshold = f10;
        }
        if ((i & 4096) == 0) {
            this.notFrontalFaceHeadPitchAngelThreshold = null;
        } else {
            this.notFrontalFaceHeadPitchAngelThreshold = f11;
        }
        if ((i & 8192) == 0) {
            this.notFrontalFaceEyeDistanceRatioThreshold = null;
        } else {
            this.notFrontalFaceEyeDistanceRatioThreshold = f12;
        }
        if ((i & 16384) == 0) {
            this.freshnessQcDelayDuration = null;
        } else {
            this.freshnessQcDelayDuration = num3;
        }
        if ((i & 32768) == 0) {
            this.colorFlashingTimeout = null;
        } else {
            this.colorFlashingTimeout = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LcaLivenessConfigFaceDetectionConfig lcaLivenessConfigFaceDetectionConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, floatSerializer, lcaLivenessConfigFaceDetectionConfig.faceDetectionScoreThreshold);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, floatSerializer, lcaLivenessConfigFaceDetectionConfig.initialFaceDistanceThresholdMax);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, lcaLivenessConfigFaceDetectionConfig.initialFaceDistanceThresholdMin);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, floatSerializer, lcaLivenessConfigFaceDetectionConfig.freshFaceDistanceThresholdMax);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, floatSerializer, lcaLivenessConfigFaceDetectionConfig.freshFaceDistanceThresholdMin);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, intSerializer, lcaLivenessConfigFaceDetectionConfig.ovalFitTimeout);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, intSerializer, lcaLivenessConfigFaceDetectionConfig.farHoldDuration);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || lcaLivenessConfigFaceDetectionConfig.onHoldThresholdMaxRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, lcaLivenessConfigFaceDetectionConfig.onHoldThresholdMaxRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || lcaLivenessConfigFaceDetectionConfig.onHoldThresholdMinRatio != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, lcaLivenessConfigFaceDetectionConfig.onHoldThresholdMinRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || lcaLivenessConfigFaceDetectionConfig.positionTopThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, lcaLivenessConfigFaceDetectionConfig.positionTopThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || lcaLivenessConfigFaceDetectionConfig.positionBottomThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, floatSerializer, lcaLivenessConfigFaceDetectionConfig.positionBottomThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || lcaLivenessConfigFaceDetectionConfig.notFrontalFaceHeadTiltAngelThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, floatSerializer, lcaLivenessConfigFaceDetectionConfig.notFrontalFaceHeadTiltAngelThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || lcaLivenessConfigFaceDetectionConfig.notFrontalFaceHeadPitchAngelThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, lcaLivenessConfigFaceDetectionConfig.notFrontalFaceHeadPitchAngelThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || lcaLivenessConfigFaceDetectionConfig.notFrontalFaceEyeDistanceRatioThreshold != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, lcaLivenessConfigFaceDetectionConfig.notFrontalFaceEyeDistanceRatioThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || lcaLivenessConfigFaceDetectionConfig.freshnessQcDelayDuration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, intSerializer, lcaLivenessConfigFaceDetectionConfig.freshnessQcDelayDuration);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && lcaLivenessConfigFaceDetectionConfig.colorFlashingTimeout == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, LongSerializer.INSTANCE, lcaLivenessConfigFaceDetectionConfig.colorFlashingTimeout);
    }

    public LcaLivenessConfigFaceDetectionConfig(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Integer num3, Long l) {
        this.faceDetectionScoreThreshold = f;
        this.initialFaceDistanceThresholdMax = f2;
        this.initialFaceDistanceThresholdMin = f3;
        this.freshFaceDistanceThresholdMax = f4;
        this.freshFaceDistanceThresholdMin = f5;
        this.ovalFitTimeout = num;
        this.farHoldDuration = num2;
        this.onHoldThresholdMaxRatio = f6;
        this.onHoldThresholdMinRatio = f7;
        this.positionTopThreshold = f8;
        this.positionBottomThreshold = f9;
        this.notFrontalFaceHeadTiltAngelThreshold = f10;
        this.notFrontalFaceHeadPitchAngelThreshold = f11;
        this.notFrontalFaceEyeDistanceRatioThreshold = f12;
        this.freshnessQcDelayDuration = num3;
        this.colorFlashingTimeout = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (r21v0 java.lang.Float)
  (r22v0 java.lang.Float)
  (r23v0 java.lang.Float)
  (r24v0 java.lang.Float)
  (r25v0 java.lang.Float)
  (r26v0 java.lang.Integer)
  (r27v0 java.lang.Integer)
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r28v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x000b: ARITH (r37v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r29v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0013: ARITH (r37v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r30v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x001b: ARITH (r37v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r31v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0023: ARITH (r37v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r32v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x002b: ARITH (r37v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r33v0 java.lang.Float))
  (wrap:java.lang.Float:?: TERNARY null = ((wrap:int:0x0034: ARITH (r37v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Float) : (r34v0 java.lang.Float))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003d: ARITH (r37v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r35v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0049: ARITH (r37v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r36v0 java.lang.Long))
 A[MD:(java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Long):void (m)] (LINE:76) call: com.okinc.liveness.eop.bean.LcaLivenessConfigFaceDetectionConfig.<init>(java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Integer, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ LcaLivenessConfigFaceDetectionConfig(Float f, Float f2, Float f3, Float f4, Float f5, Integer num, Integer num2, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Integer num3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, num, num2, (i & 128) != 0 ? null : f6, (i & 256) != 0 ? null : f7, (i & 512) != 0 ? null : f8, (i & 1024) != 0 ? null : f9, (i & 2048) != 0 ? null : f10, (i & 4096) != 0 ? null : f11, (i & 8192) != 0 ? null : f12, (i & 16384) != 0 ? null : num3, (i & 32768) != 0 ? null : l);
    }
}
