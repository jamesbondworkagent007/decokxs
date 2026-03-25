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
public final class ColorDisplayed {
    public static final Companion Companion = new Companion(null);
    private final FreshnessColor currentColor;
    private final long currentColorStartTimestamp;
    private final FreshnessColor previousColor;
    private final int sequenceNumber;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ColorDisplayed copy$default(ColorDisplayed colorDisplayed, FreshnessColor freshnessColor, FreshnessColor freshnessColor2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            freshnessColor = colorDisplayed.currentColor;
        }
        if ((i2 & 2) != 0) {
            freshnessColor2 = colorDisplayed.previousColor;
        }
        FreshnessColor freshnessColor3 = freshnessColor2;
        if ((i2 & 4) != 0) {
            i = colorDisplayed.sequenceNumber;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = colorDisplayed.currentColorStartTimestamp;
        }
        return colorDisplayed.copy(freshnessColor, freshnessColor3, i3, j);
    }

    @SerialName("CurrentColor")
    public static /* synthetic */ void getCurrentColor$annotations() {
    }

    @SerialName("CurrentColorStartTimestamp")
    public static /* synthetic */ void getCurrentColorStartTimestamp$annotations() {
    }

    @SerialName("PreviousColor")
    public static /* synthetic */ void getPreviousColor$annotations() {
    }

    @SerialName("SequenceNumber")
    public static /* synthetic */ void getSequenceNumber$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColor component1() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColor component2() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.sequenceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.currentColorStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayed copy(@NotNull FreshnessColor freshnessColor, @NotNull FreshnessColor freshnessColor2, int i, long j) {
        Intrinsics.checkNotNullParameter(freshnessColor, "");
        Intrinsics.checkNotNullParameter(freshnessColor2, "");
        return new ColorDisplayed(freshnessColor, freshnessColor2, i, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorDisplayed)) {
            return false;
        }
        ColorDisplayed colorDisplayed = (ColorDisplayed) obj;
        return Intrinsics.EZpvd(this.currentColor, colorDisplayed.currentColor) && Intrinsics.EZpvd(this.previousColor, colorDisplayed.previousColor) && this.sequenceNumber == colorDisplayed.sequenceNumber && this.currentColorStartTimestamp == colorDisplayed.currentColorStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColor getCurrentColor() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCurrentColorStartTimestamp() {
        return this.currentColorStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColor getPreviousColor() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.currentColor.hashCode() * 31) + this.previousColor.hashCode()) * 31) + Integer.hashCode(this.sequenceNumber)) * 31) + Long.hashCode(this.currentColorStartTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorDisplayed(currentColor=" + this.currentColor + ", previousColor=" + this.previousColor + ", sequenceNumber=" + this.sequenceNumber + ", currentColorStartTimestamp=" + this.currentColorStartTimestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.ColorDisplayed.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ColorDisplayed> serializer() {
            return ColorDisplayed$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ColorDisplayed(int i, @SerialName("CurrentColor") FreshnessColor freshnessColor, @SerialName("PreviousColor") FreshnessColor freshnessColor2, @SerialName("SequenceNumber") int i2, @SerialName("CurrentColorStartTimestamp") long j, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ColorDisplayed$$serializer.INSTANCE.getDescriptor());
        }
        this.currentColor = freshnessColor;
        this.previousColor = freshnessColor2;
        this.sequenceNumber = i2;
        this.currentColorStartTimestamp = j;
    }

    public ColorDisplayed(@NotNull FreshnessColor freshnessColor, @NotNull FreshnessColor freshnessColor2, int i, long j) {
        Intrinsics.checkNotNullParameter(freshnessColor, "");
        Intrinsics.checkNotNullParameter(freshnessColor2, "");
        this.currentColor = freshnessColor;
        this.previousColor = freshnessColor2;
        this.sequenceNumber = i;
        this.currentColorStartTimestamp = j;
    }

    public static final /* synthetic */ void write$Self(ColorDisplayed colorDisplayed, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        FreshnessColor$$serializer freshnessColor$$serializer = FreshnessColor$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, freshnessColor$$serializer, colorDisplayed.currentColor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, freshnessColor$$serializer, colorDisplayed.previousColor);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, colorDisplayed.sequenceNumber);
        compositeEncoder.encodeLongElement(serialDescriptor, 3, colorDisplayed.currentColorStartTimestamp);
    }
}
