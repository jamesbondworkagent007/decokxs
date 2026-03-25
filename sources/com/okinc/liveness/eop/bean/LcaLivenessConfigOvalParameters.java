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
public final class LcaLivenessConfigOvalParameters implements Parcelable {
    public static final int $stable = 0;
    private final Float faceOvalHeightRatio;
    private final Float faceOvalWidthScreenRatio;
    private final Float farOvalHeightRatio;
    private final Float farOvalWidthScreenRatio;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LcaLivenessConfigOvalParameters> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LcaLivenessConfigOvalParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigOvalParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LcaLivenessConfigOvalParameters(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigOvalParameters[] newArray(int i) {
            return new LcaLivenessConfigOvalParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessConfigOvalParameters copy$default(LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters, Float f, Float f2, Float f3, Float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = lcaLivenessConfigOvalParameters.farOvalWidthScreenRatio;
        }
        if ((i & 2) != 0) {
            f2 = lcaLivenessConfigOvalParameters.farOvalHeightRatio;
        }
        if ((i & 4) != 0) {
            f3 = lcaLivenessConfigOvalParameters.faceOvalWidthScreenRatio;
        }
        if ((i & 8) != 0) {
            f4 = lcaLivenessConfigOvalParameters.faceOvalHeightRatio;
        }
        return lcaLivenessConfigOvalParameters.copy(f, f2, f3, f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component1() {
        return this.farOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component2() {
        return this.farOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component3() {
        return this.faceOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float component4() {
        return this.faceOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigOvalParameters copy(Float f, Float f2, Float f3, Float f4) {
        return new LcaLivenessConfigOvalParameters(f, f2, f3, f4);
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
        if (!(obj instanceof LcaLivenessConfigOvalParameters)) {
            return false;
        }
        LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters = (LcaLivenessConfigOvalParameters) obj;
        return Intrinsics.EZpvd(this.farOvalWidthScreenRatio, lcaLivenessConfigOvalParameters.farOvalWidthScreenRatio) && Intrinsics.EZpvd(this.farOvalHeightRatio, lcaLivenessConfigOvalParameters.farOvalHeightRatio) && Intrinsics.EZpvd(this.faceOvalWidthScreenRatio, lcaLivenessConfigOvalParameters.faceOvalWidthScreenRatio) && Intrinsics.EZpvd(this.faceOvalHeightRatio, lcaLivenessConfigOvalParameters.faceOvalHeightRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceOvalHeightRatio() {
        return this.faceOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFaceOvalWidthScreenRatio() {
        return this.faceOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFarOvalHeightRatio() {
        return this.farOvalHeightRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Float getFarOvalWidthScreenRatio() {
        return this.farOvalWidthScreenRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Float f = this.farOvalWidthScreenRatio;
        int iHashCode = f == null ? 0 : f.hashCode();
        Float f2 = this.farOvalHeightRatio;
        int iHashCode2 = f2 == null ? 0 : f2.hashCode();
        Float f3 = this.faceOvalWidthScreenRatio;
        int iHashCode3 = f3 == null ? 0 : f3.hashCode();
        Float f4 = this.faceOvalHeightRatio;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f4 != null ? f4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessConfigOvalParameters(farOvalWidthScreenRatio=" + this.farOvalWidthScreenRatio + ", farOvalHeightRatio=" + this.farOvalHeightRatio + ", faceOvalWidthScreenRatio=" + this.faceOvalWidthScreenRatio + ", faceOvalHeightRatio=" + this.faceOvalHeightRatio + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Float f = this.farOvalWidthScreenRatio;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.farOvalHeightRatio;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.faceOvalWidthScreenRatio;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f3.floatValue());
        }
        Float f4 = this.faceOvalHeightRatio;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f4.floatValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LcaLivenessConfigOvalParameters.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LcaLivenessConfigOvalParameters> serializer() {
            return LcaLivenessConfigOvalParameters$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LcaLivenessConfigOvalParameters(int i, Float f, Float f2, Float f3, Float f4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LcaLivenessConfigOvalParameters$$serializer.INSTANCE.getDescriptor());
        }
        this.farOvalWidthScreenRatio = f;
        this.farOvalHeightRatio = f2;
        this.faceOvalWidthScreenRatio = f3;
        this.faceOvalHeightRatio = f4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LcaLivenessConfigOvalParameters lcaLivenessConfigOvalParameters, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, floatSerializer, lcaLivenessConfigOvalParameters.farOvalWidthScreenRatio);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, floatSerializer, lcaLivenessConfigOvalParameters.farOvalHeightRatio);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, floatSerializer, lcaLivenessConfigOvalParameters.faceOvalWidthScreenRatio);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, floatSerializer, lcaLivenessConfigOvalParameters.faceOvalHeightRatio);
    }

    public LcaLivenessConfigOvalParameters(Float f, Float f2, Float f3, Float f4) {
        this.farOvalWidthScreenRatio = f;
        this.farOvalHeightRatio = f2;
        this.faceOvalWidthScreenRatio = f3;
        this.faceOvalHeightRatio = f4;
    }
}
