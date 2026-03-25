package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FreshnessColorFrame {
    public static final int $stable = 0;
    private final ColorChallengeElement currentColor;
    private final int currentSequence;
    private final ColorChallengeElement previousColor;
    private final float sceneCompletionPercentage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FreshnessColorFrame copy$default(FreshnessColorFrame freshnessColorFrame, ColorChallengeElement colorChallengeElement, ColorChallengeElement colorChallengeElement2, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            colorChallengeElement = freshnessColorFrame.currentColor;
        }
        if ((i2 & 2) != 0) {
            colorChallengeElement2 = freshnessColorFrame.previousColor;
        }
        if ((i2 & 4) != 0) {
            i = freshnessColorFrame.currentSequence;
        }
        if ((i2 & 8) != 0) {
            f = freshnessColorFrame.sceneCompletionPercentage;
        }
        return freshnessColorFrame.copy(colorChallengeElement, colorChallengeElement2, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement component1() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement component2() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.currentSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component4() {
        return this.sceneCompletionPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColorFrame copy(@NotNull ColorChallengeElement colorChallengeElement, ColorChallengeElement colorChallengeElement2, int i, float f) {
        Intrinsics.checkNotNullParameter(colorChallengeElement, "");
        return new FreshnessColorFrame(colorChallengeElement, colorChallengeElement2, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreshnessColorFrame)) {
            return false;
        }
        FreshnessColorFrame freshnessColorFrame = (FreshnessColorFrame) obj;
        return Intrinsics.EZpvd(this.currentColor, freshnessColorFrame.currentColor) && Intrinsics.EZpvd(this.previousColor, freshnessColorFrame.previousColor) && this.currentSequence == freshnessColorFrame.currentSequence && Float.compare(this.sceneCompletionPercentage, freshnessColorFrame.sceneCompletionPercentage) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement getCurrentColor() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentSequence() {
        return this.currentSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement getPreviousColor() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getSceneCompletionPercentage() {
        return this.sceneCompletionPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.currentColor.hashCode();
        ColorChallengeElement colorChallengeElement = this.previousColor;
        return (((((iHashCode * 31) + (colorChallengeElement == null ? 0 : colorChallengeElement.hashCode())) * 31) + Integer.hashCode(this.currentSequence)) * 31) + Float.hashCode(this.sceneCompletionPercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreshnessColorFrame(currentColor=" + this.currentColor + ", previousColor=" + this.previousColor + ", currentSequence=" + this.currentSequence + ", sceneCompletionPercentage=" + this.sceneCompletionPercentage + ")";
    }

    public FreshnessColorFrame(@NotNull ColorChallengeElement colorChallengeElement, ColorChallengeElement colorChallengeElement2, int i, float f) {
        Intrinsics.checkNotNullParameter(colorChallengeElement, "");
        this.currentColor = colorChallengeElement;
        this.previousColor = colorChallengeElement2;
        this.currentSequence = i;
        this.sceneCompletionPercentage = f;
    }
}
