package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ColorChallengeElement {
    public static final int $stable = 0;
    private final RgbColor color;
    private final float duration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ColorChallengeElement copy$default(ColorChallengeElement colorChallengeElement, RgbColor rgbColor, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            rgbColor = colorChallengeElement.color;
        }
        if ((i & 2) != 0) {
            f = colorChallengeElement.duration;
        }
        return colorChallengeElement.copy(rgbColor, f);
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
    public final ColorChallengeElement copy(@NotNull RgbColor rgbColor, float f) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        return new ColorChallengeElement(rgbColor, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorChallengeElement)) {
            return false;
        }
        ColorChallengeElement colorChallengeElement = (ColorChallengeElement) obj;
        return Intrinsics.EZpvd(this.color, colorChallengeElement.color) && Float.compare(this.duration, colorChallengeElement.duration) == 0;
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
    public int hashCode() {
        return (this.color.hashCode() * 31) + Float.hashCode(this.duration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorChallengeElement(color=" + this.color + ", duration=" + this.duration + ")";
    }

    public ColorChallengeElement(@NotNull RgbColor rgbColor, float f) {
        Intrinsics.checkNotNullParameter(rgbColor, "");
        this.color = rgbColor;
        this.duration = f;
    }
}
