package com.amplifyframework.predictions.aws.models.liveness;

import com.google.common.net.HttpHeaders;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class OvalParameters {
    public static final Companion Companion = new Companion(null);
    private final float centerX;
    private final float centerY;
    private final float height;
    private final float width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OvalParameters copy$default(OvalParameters ovalParameters, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ovalParameters.width;
        }
        if ((i & 2) != 0) {
            f2 = ovalParameters.height;
        }
        if ((i & 4) != 0) {
            f3 = ovalParameters.centerX;
        }
        if ((i & 8) != 0) {
            f4 = ovalParameters.centerY;
        }
        return ovalParameters.copy(f, f2, f3, f4);
    }

    @SerialName("CenterX")
    public static /* synthetic */ void getCenterX$annotations() {
    }

    @SerialName("CenterY")
    public static /* synthetic */ void getCenterY$annotations() {
    }

    @SerialName("Height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName(HttpHeaders.WIDTH)
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component1() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.centerX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component4() {
        return this.centerY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OvalParameters copy(float f, float f2, float f3, float f4) {
        return new OvalParameters(f, f2, f3, f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OvalParameters)) {
            return false;
        }
        OvalParameters ovalParameters = (OvalParameters) obj;
        return Float.compare(this.width, ovalParameters.width) == 0 && Float.compare(this.height, ovalParameters.height) == 0 && Float.compare(this.centerX, ovalParameters.centerX) == 0 && Float.compare(this.centerY, ovalParameters.centerY) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getCenterX() {
        return this.centerX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getCenterY() {
        return this.centerY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Float.hashCode(this.width) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.centerX)) * 31) + Float.hashCode(this.centerY);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OvalParameters(width=" + this.width + ", height=" + this.height + ", centerX=" + this.centerX + ", centerY=" + this.centerY + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.OvalParameters.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<OvalParameters> serializer() {
            return OvalParameters$$serializer.INSTANCE;
        }
    }

    public OvalParameters(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.centerX = f3;
        this.centerY = f4;
    }

    public /* synthetic */ OvalParameters(int i, @SerialName(HttpHeaders.WIDTH) float f, @SerialName("Height") float f2, @SerialName("CenterX") float f3, @SerialName("CenterY") float f4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OvalParameters$$serializer.INSTANCE.getDescriptor());
        }
        this.width = f;
        this.height = f2;
        this.centerX = f3;
        this.centerY = f4;
    }

    public static final /* synthetic */ void write$Self(OvalParameters ovalParameters, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeFloatElement(serialDescriptor, 0, ovalParameters.width);
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, ovalParameters.height);
        compositeEncoder.encodeFloatElement(serialDescriptor, 2, ovalParameters.centerX);
        compositeEncoder.encodeFloatElement(serialDescriptor, 3, ovalParameters.centerY);
    }
}
