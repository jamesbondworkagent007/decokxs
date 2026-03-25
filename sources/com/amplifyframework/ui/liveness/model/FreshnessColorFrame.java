package com.amplifyframework.ui.liveness.model;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FreshnessColorFrame {
    public static final int $stable = 0;
    private final long currentColor;
    private final Color previousColor;
    private final float sceneCompletionPercentage;
    private final SceneType sceneType;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.amplifyframework.ui.liveness.model.SceneType)
  (r2v0 long)
  (r4v0 androidx.compose.ui.graphics.Color)
  (r5v0 float)
 A[MD:(com.amplifyframework.ui.liveness.model.SceneType, long, androidx.compose.ui.graphics.Color, float):void (m)] call: com.amplifyframework.ui.liveness.model.FreshnessColorFrame.<init>(com.amplifyframework.ui.liveness.model.SceneType, long, androidx.compose.ui.graphics.Color, float):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FreshnessColorFrame(SceneType sceneType, long j, Color color, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(sceneType, j, color, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-Dg6MJ9Y$default, reason: not valid java name */
    public static /* synthetic */ FreshnessColorFrame m6049copyDg6MJ9Y$default(FreshnessColorFrame freshnessColorFrame, SceneType sceneType, long j, Color color, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            sceneType = freshnessColorFrame.sceneType;
        }
        if ((i & 2) != 0) {
            j = freshnessColorFrame.currentColor;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            color = freshnessColorFrame.previousColor;
        }
        Color color2 = color;
        if ((i & 8) != 0) {
            f = freshnessColorFrame.sceneCompletionPercentage;
        }
        return freshnessColorFrame.m6052copyDg6MJ9Y(sceneType, j2, color2, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SceneType component1() {
        return this.sceneType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m6050component20d7_KjU() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component3-QN2ZGVo, reason: not valid java name */
    public final Color m6051component3QN2ZGVo() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component4() {
        return this.sceneCompletionPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-Dg6MJ9Y, reason: not valid java name */
    public final FreshnessColorFrame m6052copyDg6MJ9Y(@NotNull SceneType sceneType, long j, Color color, float f) {
        Intrinsics.checkNotNullParameter(sceneType, "");
        return new FreshnessColorFrame(sceneType, j, color, f, null);
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
        return Intrinsics.EZpvd(this.sceneType, freshnessColorFrame.sceneType) && Color.m3150equalsimpl0(this.currentColor, freshnessColorFrame.currentColor) && Intrinsics.EZpvd(this.previousColor, freshnessColorFrame.previousColor) && Float.compare(this.sceneCompletionPercentage, freshnessColorFrame.sceneCompletionPercentage) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getCurrentColor-0d7_KjU, reason: not valid java name */
    public final long m6053getCurrentColor0d7_KjU() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getPreviousColor-QN2ZGVo, reason: not valid java name */
    public final Color m6054getPreviousColorQN2ZGVo() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getSceneCompletionPercentage() {
        return this.sceneCompletionPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SceneType getSceneType() {
        return this.sceneType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sceneType.hashCode();
        int iM3156hashCodeimpl = Color.m3156hashCodeimpl(this.currentColor);
        Color color = this.previousColor;
        return (((((iHashCode * 31) + iM3156hashCodeimpl) * 31) + (color == null ? 0 : Color.m3156hashCodeimpl(color.m3159unboximpl()))) * 31) + Float.hashCode(this.sceneCompletionPercentage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreshnessColorFrame(sceneType=" + this.sceneType + ", currentColor=" + Color.m3157toStringimpl(this.currentColor) + ", previousColor=" + this.previousColor + ", sceneCompletionPercentage=" + this.sceneCompletionPercentage + ")";
    }

    private FreshnessColorFrame(SceneType sceneType, long j, Color color, float f) {
        Intrinsics.checkNotNullParameter(sceneType, "");
        this.sceneType = sceneType;
        this.currentColor = j;
        this.previousColor = color;
        this.sceneCompletionPercentage = f;
    }
}
