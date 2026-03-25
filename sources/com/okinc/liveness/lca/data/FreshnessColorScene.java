package com.okinc.liveness.lca.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FreshnessColorScene {
    public static final int $stable = 0;
    private final ColorChallengeElement currentColor;
    private final long endTime;
    private final ColorChallengeElement previousColor;
    private final long startTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FreshnessColorScene copy$default(FreshnessColorScene freshnessColorScene, long j, long j2, ColorChallengeElement colorChallengeElement, ColorChallengeElement colorChallengeElement2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = freshnessColorScene.startTime;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = freshnessColorScene.endTime;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            colorChallengeElement = freshnessColorScene.currentColor;
        }
        ColorChallengeElement colorChallengeElement3 = colorChallengeElement;
        if ((i & 8) != 0) {
            colorChallengeElement2 = freshnessColorScene.previousColor;
        }
        return freshnessColorScene.copy(j3, j4, colorChallengeElement3, colorChallengeElement2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement component3() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement component4() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColorScene copy(long j, long j2, @NotNull ColorChallengeElement colorChallengeElement, ColorChallengeElement colorChallengeElement2) {
        Intrinsics.checkNotNullParameter(colorChallengeElement, "");
        return new FreshnessColorScene(j, j2, colorChallengeElement, colorChallengeElement2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreshnessColorScene)) {
            return false;
        }
        FreshnessColorScene freshnessColorScene = (FreshnessColorScene) obj;
        return this.startTime == freshnessColorScene.startTime && this.endTime == freshnessColorScene.endTime && Intrinsics.EZpvd(this.currentColor, freshnessColorScene.currentColor) && Intrinsics.EZpvd(this.previousColor, freshnessColorScene.previousColor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement getCurrentColor() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeElement getPreviousColor() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.startTime);
        int iHashCode2 = Long.hashCode(this.endTime);
        int iHashCode3 = this.currentColor.hashCode();
        ColorChallengeElement colorChallengeElement = this.previousColor;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (colorChallengeElement == null ? 0 : colorChallengeElement.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreshnessColorScene(startTime=" + this.startTime + ", endTime=" + this.endTime + ", currentColor=" + this.currentColor + ", previousColor=" + this.previousColor + ")";
    }

    public FreshnessColorScene(long j, long j2, @NotNull ColorChallengeElement colorChallengeElement, ColorChallengeElement colorChallengeElement2) {
        Intrinsics.checkNotNullParameter(colorChallengeElement, "");
        this.startTime = j;
        this.endTime = j2;
        this.currentColor = colorChallengeElement;
        this.previousColor = colorChallengeElement2;
    }
}
