package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class ColorDisplayInformation {
    private final RgbColor color;
    private final float duration;
    private final boolean shouldScroll;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ColorDisplayInformation copy$default(ColorDisplayInformation colorDisplayInformation, RgbColor rgbColor, float f, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            rgbColor = colorDisplayInformation.color;
        }
        if ((i & 2) != 0) {
            f = colorDisplayInformation.duration;
        }
        if ((i & 4) != 0) {
            z = colorDisplayInformation.shouldScroll;
        }
        return colorDisplayInformation.copy(rgbColor, f, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor component1() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.shouldScroll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayInformation copy(@NotNull RgbColor rgbColor, float f, boolean z) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        return new ColorDisplayInformation(rgbColor, f, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorDisplayInformation)) {
            return false;
        }
        ColorDisplayInformation colorDisplayInformation = (ColorDisplayInformation) obj;
        return Intrinsics.EZpvd(this.color, colorDisplayInformation.color) && Float.compare(this.duration, colorDisplayInformation.duration) == 0 && this.shouldScroll == colorDisplayInformation.shouldScroll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShouldScroll() {
        return this.shouldScroll;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public int hashCode() {
        int iHashCode = this.color.hashCode();
        int iHashCode2 = Float.hashCode(this.duration);
        boolean z = this.shouldScroll;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorDisplayInformation(color=" + this.color + ", duration=" + this.duration + ", shouldScroll=" + this.shouldScroll + ")";
    }

    public ColorDisplayInformation(@NotNull RgbColor rgbColor, float f, boolean z) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        this.color = rgbColor;
        this.duration = f;
        this.shouldScroll = z;
    }
}
