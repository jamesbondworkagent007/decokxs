package com.amplifyframework.ui.liveness.model;

import com.amplifyframework.predictions.aws.models.ColorDisplayInformation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FreshnessColorScene {
    public static final int $stable = 8;
    private final ColorDisplayInformation currentColor;
    private final long endTime;
    private final ColorDisplayInformation previousColor;
    private final SceneType sceneType;
    private final long startTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayInformation component3() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayInformation component4() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SceneType component5() {
        return this.sceneType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessColorScene copy(long j, long j2, @NotNull ColorDisplayInformation colorDisplayInformation, ColorDisplayInformation colorDisplayInformation2, @NotNull SceneType sceneType) {
        Intrinsics.checkNotNullParameter(colorDisplayInformation, "");
        Intrinsics.checkNotNullParameter(sceneType, "");
        return new FreshnessColorScene(j, j2, colorDisplayInformation, colorDisplayInformation2, sceneType);
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
        return this.startTime == freshnessColorScene.startTime && this.endTime == freshnessColorScene.endTime && Intrinsics.EZpvd(this.currentColor, freshnessColorScene.currentColor) && Intrinsics.EZpvd(this.previousColor, freshnessColorScene.previousColor) && Intrinsics.EZpvd(this.sceneType, freshnessColorScene.sceneType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayInformation getCurrentColor() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorDisplayInformation getPreviousColor() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SceneType getSceneType() {
        return this.sceneType;
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
        ColorDisplayInformation colorDisplayInformation = this.previousColor;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (colorDisplayInformation == null ? 0 : colorDisplayInformation.hashCode())) * 31) + this.sceneType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreshnessColorScene(startTime=" + this.startTime + ", endTime=" + this.endTime + ", currentColor=" + this.currentColor + ", previousColor=" + this.previousColor + ", sceneType=" + this.sceneType + ")";
    }

    public FreshnessColorScene(long j, long j2, @NotNull ColorDisplayInformation colorDisplayInformation, ColorDisplayInformation colorDisplayInformation2, @NotNull SceneType sceneType) {
        Intrinsics.checkNotNullParameter(colorDisplayInformation, "");
        Intrinsics.checkNotNullParameter(sceneType, "");
        this.startTime = j;
        this.endTime = j2;
        this.currentColor = colorDisplayInformation;
        this.previousColor = colorDisplayInformation2;
        this.sceneType = sceneType;
    }
}
