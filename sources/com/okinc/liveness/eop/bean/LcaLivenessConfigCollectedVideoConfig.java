package com.okinc.liveness.eop.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LcaLivenessConfigCollectedVideoConfig implements Parcelable {
    public static final int $stable = 0;
    private final Integer bitrate;
    private final Integer fps;
    private final Integer resolutionHeight;
    private final Integer resolutionWidth;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LcaLivenessConfigCollectedVideoConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LcaLivenessConfigCollectedVideoConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigCollectedVideoConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LcaLivenessConfigCollectedVideoConfig(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LcaLivenessConfigCollectedVideoConfig[] newArray(int i) {
            return new LcaLivenessConfigCollectedVideoConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessConfigCollectedVideoConfig copy$default(LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = lcaLivenessConfigCollectedVideoConfig.bitrate;
        }
        if ((i & 2) != 0) {
            num2 = lcaLivenessConfigCollectedVideoConfig.resolutionHeight;
        }
        if ((i & 4) != 0) {
            num3 = lcaLivenessConfigCollectedVideoConfig.resolutionWidth;
        }
        if ((i & 8) != 0) {
            num4 = lcaLivenessConfigCollectedVideoConfig.fps;
        }
        return lcaLivenessConfigCollectedVideoConfig.copy(num, num2, num3, num4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.bitrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.resolutionHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.resolutionWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.fps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessConfigCollectedVideoConfig copy(Integer num, Integer num2, Integer num3, Integer num4) {
        return new LcaLivenessConfigCollectedVideoConfig(num, num2, num3, num4);
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
        if (!(obj instanceof LcaLivenessConfigCollectedVideoConfig)) {
            return false;
        }
        LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig = (LcaLivenessConfigCollectedVideoConfig) obj;
        return Intrinsics.EZpvd(this.bitrate, lcaLivenessConfigCollectedVideoConfig.bitrate) && Intrinsics.EZpvd(this.resolutionHeight, lcaLivenessConfigCollectedVideoConfig.resolutionHeight) && Intrinsics.EZpvd(this.resolutionWidth, lcaLivenessConfigCollectedVideoConfig.resolutionWidth) && Intrinsics.EZpvd(this.fps, lcaLivenessConfigCollectedVideoConfig.fps);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBitrate() {
        return this.bitrate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFps() {
        return this.fps;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResolutionHeight() {
        return this.resolutionHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getResolutionWidth() {
        return this.resolutionWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.bitrate;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.resolutionHeight;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.resolutionWidth;
        int iHashCode3 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.fps;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num4 != null ? num4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessConfigCollectedVideoConfig(bitrate=" + this.bitrate + ", resolutionHeight=" + this.resolutionHeight + ", resolutionWidth=" + this.resolutionWidth + ", fps=" + this.fps + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.bitrate;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.resolutionHeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.resolutionWidth;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.fps;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.bean.LcaLivenessConfigCollectedVideoConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LcaLivenessConfigCollectedVideoConfig> serializer() {
            return LcaLivenessConfigCollectedVideoConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LcaLivenessConfigCollectedVideoConfig(int i, Integer num, Integer num2, Integer num3, Integer num4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LcaLivenessConfigCollectedVideoConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.bitrate = num;
        this.resolutionHeight = num2;
        this.resolutionWidth = num3;
        this.fps = num4;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_dynamic_eop_liveness_impl(LcaLivenessConfigCollectedVideoConfig lcaLivenessConfigCollectedVideoConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, lcaLivenessConfigCollectedVideoConfig.bitrate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, intSerializer, lcaLivenessConfigCollectedVideoConfig.resolutionHeight);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, intSerializer, lcaLivenessConfigCollectedVideoConfig.resolutionWidth);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, intSerializer, lcaLivenessConfigCollectedVideoConfig.fps);
    }

    public LcaLivenessConfigCollectedVideoConfig(Integer num, Integer num2, Integer num3, Integer num4) {
        this.bitrate = num;
        this.resolutionHeight = num2;
        this.resolutionWidth = num3;
        this.fps = num4;
    }
}
