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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LcaLivenessConfigFaceQcConfig implements Parcelable {
    public static final int $stable = 0;
    private final Float faceQcBlockThreshold;
    private final Float faceQcBlurThreshold;
    private final Float faceQcBrightThreshold;
    private final Float faceQcDarkThreshold;
    private final Float faceQcOkThreshold;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LcaLivenessConfigFaceQcConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LcaLivenessConfigFaceQcConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigFaceQcConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LcaLivenessConfigFaceQcConfig(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigFaceQcConfig[] newArray(int i) {
            return new LcaLivenessConfigFaceQcConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessConfigFaceQcConfig copy$default(LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig, Float f, Float f2, Float f3, Float f4, Float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lcaLivenessConfigFaceQcConfig.faceQcOkThreshold;
        }
        if ((i & 2) != 0) {
            f2 = lcaLivenessConfigFaceQcConfig.faceQcBlurThreshold;
        }
        Float f6 = f2;
        if ((i & 4) != 0) {
            f3 = lcaLivenessConfigFaceQcConfig.faceQcBlockThreshold;
        }
        Float f7 = f3;
        if ((i & 8) != 0) {
            f4 = lcaLivenessConfigFaceQcConfig.faceQcBrightThreshold;
        }
        Float f8 = f4;
        if ((i & 16) != 0) {
            f5 = lcaLivenessConfigFaceQcConfig.faceQcDarkThreshold;
        }
        return lcaLivenessConfigFaceQcConfig.copy(f, f6, f7, f8, f5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.faceQcOkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component2() {
        return this.faceQcBlurThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.faceQcBlockThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.faceQcBrightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component5() {
        return this.faceQcDarkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigFaceQcConfig copy(Float f, Float f2, Float f3, Float f4, Float f5) {
        return new LcaLivenessConfigFaceQcConfig(f, f2, f3, f4, f5);
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
        if (!(obj instanceof LcaLivenessConfigFaceQcConfig)) {
            return false;
        }
        LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig = (LcaLivenessConfigFaceQcConfig) obj;
        return Intrinsics.EZpvd(this.faceQcOkThreshold, lcaLivenessConfigFaceQcConfig.faceQcOkThreshold) && Intrinsics.EZpvd(this.faceQcBlurThreshold, lcaLivenessConfigFaceQcConfig.faceQcBlurThreshold) && Intrinsics.EZpvd(this.faceQcBlockThreshold, lcaLivenessConfigFaceQcConfig.faceQcBlockThreshold) && Intrinsics.EZpvd(this.faceQcBrightThreshold, lcaLivenessConfigFaceQcConfig.faceQcBrightThreshold) && Intrinsics.EZpvd(this.faceQcDarkThreshold, lcaLivenessConfigFaceQcConfig.faceQcDarkThreshold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcBlockThreshold() {
        return this.faceQcBlockThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcBlurThreshold() {
        return this.faceQcBlurThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcBrightThreshold() {
        return this.faceQcBrightThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcDarkThreshold() {
        return this.faceQcDarkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceQcOkThreshold() {
        return this.faceQcOkThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.faceQcOkThreshold;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.faceQcBlurThreshold;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.faceQcBlockThreshold;
        int iHashCode3 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.faceQcBrightThreshold;
        int iHashCode4 = f4 == null ? 0 : f4.hashCode();
        Float f5 = this.faceQcDarkThreshold;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (f5 != null ? f5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessConfigFaceQcConfig(faceQcOkThreshold=" + this.faceQcOkThreshold + ", faceQcBlurThreshold=" + this.faceQcBlurThreshold + ", faceQcBlockThreshold=" + this.faceQcBlockThreshold + ", faceQcBrightThreshold=" + this.faceQcBrightThreshold + ", faceQcDarkThreshold=" + this.faceQcDarkThreshold + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Float f = this.faceQcOkThreshold;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.faceQcBlurThreshold;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.faceQcBlockThreshold;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.faceQcBrightThreshold;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
        Float f5 = this.faceQcDarkThreshold;
        if (f5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f5.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LcaLivenessConfigFaceQcConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LcaLivenessConfigFaceQcConfig> serializer() {
            return LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LcaLivenessConfigFaceQcConfig(int i, Float f, Float f2, Float f3, Float f4, Float f5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, LcaLivenessConfigFaceQcConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.faceQcOkThreshold = f;
        this.faceQcBlurThreshold = f2;
        this.faceQcBlockThreshold = f3;
        this.faceQcBrightThreshold = f4;
        this.faceQcDarkThreshold = f5;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LcaLivenessConfigFaceQcConfig lcaLivenessConfigFaceQcConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, floatSerializer, lcaLivenessConfigFaceQcConfig.faceQcOkThreshold);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, floatSerializer, lcaLivenessConfigFaceQcConfig.faceQcBlurThreshold);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, lcaLivenessConfigFaceQcConfig.faceQcBlockThreshold);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, floatSerializer, lcaLivenessConfigFaceQcConfig.faceQcBrightThreshold);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, floatSerializer, lcaLivenessConfigFaceQcConfig.faceQcDarkThreshold);
    }

    public LcaLivenessConfigFaceQcConfig(Float f, Float f2, Float f3, Float f4, Float f5) {
        this.faceQcOkThreshold = f;
        this.faceQcBlurThreshold = f2;
        this.faceQcBlockThreshold = f3;
        this.faceQcBrightThreshold = f4;
        this.faceQcDarkThreshold = f5;
    }
}
