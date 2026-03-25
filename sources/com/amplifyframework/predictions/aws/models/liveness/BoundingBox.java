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
public final class BoundingBox {
    public static final Companion Companion = new Companion(null);
    private final float height;
    private final float left;
    private final float top;
    private final float width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BoundingBox copy$default(BoundingBox boundingBox, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = boundingBox.width;
        }
        if ((i & 2) != 0) {
            f2 = boundingBox.height;
        }
        if ((i & 4) != 0) {
            f3 = boundingBox.left;
        }
        if ((i & 8) != 0) {
            f4 = boundingBox.top;
        }
        return boundingBox.copy(f, f2, f3, f4);
    }

    @SerialName("Height")
    public static /* synthetic */ void getHeight$annotations() {
    }

    @SerialName("Left")
    public static /* synthetic */ void getLeft$annotations() {
    }

    @SerialName("Top")
    public static /* synthetic */ void getTop$annotations() {
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
        return this.left;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component4() {
        return this.top;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundingBox copy(float f, float f2, float f3, float f4) {
        return new BoundingBox(f, f2, f3, f4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        return Float.compare(this.width, boundingBox.width) == 0 && Float.compare(this.height, boundingBox.height) == 0 && Float.compare(this.left, boundingBox.left) == 0 && Float.compare(this.top, boundingBox.top) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getLeft() {
        return this.left;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getTop() {
        return this.top;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Float.hashCode(this.width) * 31) + Float.hashCode(this.height)) * 31) + Float.hashCode(this.left)) * 31) + Float.hashCode(this.top);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BoundingBox(width=" + this.width + ", height=" + this.height + ", left=" + this.left + ", top=" + this.top + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.BoundingBox.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BoundingBox> serializer() {
            return BoundingBox$$serializer.INSTANCE;
        }
    }

    public BoundingBox(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.left = f3;
        this.top = f4;
    }

    public /* synthetic */ BoundingBox(int i, @SerialName(HttpHeaders.WIDTH) float f, @SerialName("Height") float f2, @SerialName("Left") float f3, @SerialName("Top") float f4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, BoundingBox$$serializer.INSTANCE.getDescriptor());
        }
        this.width = f;
        this.height = f2;
        this.left = f3;
        this.top = f4;
    }

    public static final /* synthetic */ void write$Self(BoundingBox boundingBox, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeFloatElement(serialDescriptor, 0, boundingBox.width);
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, boundingBox.height);
        compositeEncoder.encodeFloatElement(serialDescriptor, 2, boundingBox.left);
        compositeEncoder.encodeFloatElement(serialDescriptor, 3, boundingBox.top);
    }
}
