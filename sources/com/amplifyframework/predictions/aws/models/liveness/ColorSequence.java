package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class ColorSequence {
    public static final Companion Companion = new Companion(null);
    private final float downscrollDuration;
    private final float flatDisplayDuration;
    private final FreshnessColor freshnessColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ColorSequence copy$default(ColorSequence colorSequence, FreshnessColor freshnessColor, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            freshnessColor = colorSequence.freshnessColor;
        }
        if ((i & 2) != 0) {
            f = colorSequence.downscrollDuration;
        }
        if ((i & 4) != 0) {
            f2 = colorSequence.flatDisplayDuration;
        }
        return colorSequence.copy(freshnessColor, f, f2);
    }

    @SerialName("DownscrollDuration")
    public static /* synthetic */ void getDownscrollDuration$annotations() {
    }

    @SerialName("FlatDisplayDuration")
    public static /* synthetic */ void getFlatDisplayDuration$annotations() {
    }

    @SerialName("FreshnessColor")
    public static /* synthetic */ void getFreshnessColor$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColor component1() {
        return this.freshnessColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.downscrollDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.flatDisplayDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorSequence copy(@NotNull FreshnessColor freshnessColor, float f, float f2) {
        Intrinsics.checkNotNullParameter(freshnessColor, "");
        return new ColorSequence(freshnessColor, f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorSequence)) {
            return false;
        }
        ColorSequence colorSequence = (ColorSequence) obj;
        return Intrinsics.EZpvd(this.freshnessColor, colorSequence.freshnessColor) && Float.compare(this.downscrollDuration, colorSequence.downscrollDuration) == 0 && Float.compare(this.flatDisplayDuration, colorSequence.flatDisplayDuration) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getDownscrollDuration() {
        return this.downscrollDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getFlatDisplayDuration() {
        return this.flatDisplayDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColor getFreshnessColor() {
        return this.freshnessColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.freshnessColor.hashCode() * 31) + Float.hashCode(this.downscrollDuration)) * 31) + Float.hashCode(this.flatDisplayDuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorSequence(freshnessColor=" + this.freshnessColor + ", downscrollDuration=" + this.downscrollDuration + ", flatDisplayDuration=" + this.flatDisplayDuration + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.ColorSequence.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ColorSequence> serializer() {
            return ColorSequence$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ColorSequence(int i, @SerialName("FreshnessColor") FreshnessColor freshnessColor, @SerialName("DownscrollDuration") float f, @SerialName("FlatDisplayDuration") float f2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, ColorSequence$$serializer.INSTANCE.getDescriptor());
        }
        this.freshnessColor = freshnessColor;
        this.downscrollDuration = f;
        this.flatDisplayDuration = f2;
    }

    public ColorSequence(@NotNull FreshnessColor freshnessColor, float f, float f2) {
        Intrinsics.checkNotNullParameter(freshnessColor, "");
        this.freshnessColor = freshnessColor;
        this.downscrollDuration = f;
        this.flatDisplayDuration = f2;
    }

    public static final /* synthetic */ void write$Self(ColorSequence colorSequence, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, FreshnessColor$$serializer.INSTANCE, colorSequence.freshnessColor);
        compositeEncoder.encodeFloatElement(serialDescriptor, 1, colorSequence.downscrollDuration);
        compositeEncoder.encodeFloatElement(serialDescriptor, 2, colorSequence.flatDisplayDuration);
    }
}
