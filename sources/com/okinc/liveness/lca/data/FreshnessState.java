package com.okinc.liveness.lca.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FreshnessState {
    public static final int $stable = 8;
    private int currentSceneIndex;
    private final List<FreshnessColorScene> freshnessColorScript;
    private final List<ColorChallengeElement> freshnessColors;
    private int lastDisplayedSceneIndex;
    private final Function0<Unit> onComplete;
    private boolean playbackEnded;
    private long playbackStarted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.data.FreshnessState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreshnessState copy$default(FreshnessState freshnessState, List list, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            list = freshnessState.freshnessColors;
        }
        if ((i & 2) != 0) {
            function0 = freshnessState.onComplete;
        }
        return freshnessState.copy(list, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorChallengeElement> component1() {
        return this.freshnessColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component2() {
        return this.onComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessState copy(@NotNull List<ColorChallengeElement> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new FreshnessState(list, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreshnessState)) {
            return false;
        }
        FreshnessState freshnessState = (FreshnessState) obj;
        return Intrinsics.EZpvd(this.freshnessColors, freshnessState.freshnessColors) && Intrinsics.EZpvd(this.onComplete, freshnessState.onComplete);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorChallengeElement> getFreshnessColors() {
        return this.freshnessColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> getOnComplete() {
        return this.onComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPlaybackEnded() {
        return this.playbackEnded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.freshnessColors.hashCode() * 31) + this.onComplete.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybackEnded(boolean z) {
        this.playbackEnded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreshnessState(freshnessColors=" + this.freshnessColors + ", onComplete=" + this.onComplete + ")";
    }

    public FreshnessState(@NotNull List<ColorChallengeElement> list, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.freshnessColors = list;
        this.onComplete = function0;
        this.playbackStarted = -1L;
        this.lastDisplayedSceneIndex = -1;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        long j = 0;
        for (Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ColorChallengeElement colorChallengeElement = (ColorChallengeElement) obj;
            long duration = j + ((long) colorChallengeElement.getDuration());
            arrayList.add(new FreshnessColorScene(j, duration, colorChallengeElement, (ColorChallengeElement) CollectionsKt___CollectionsKt.AkhnZx(this.freshnessColors, i - 1)));
            i++;
            j = duration;
        }
        this.freshnessColorScript = arrayList;
    }

    public final FreshnessColorFrame nextFrame(long j) {
        if (this.playbackEnded) {
            return null;
        }
        if (this.playbackStarted == -1) {
            this.playbackStarted = j;
        }
        if (j - this.playbackStarted > this.freshnessColorScript.get(this.currentSceneIndex).getEndTime()) {
            int i = this.currentSceneIndex + 1;
            this.currentSceneIndex = i;
            if (i >= this.freshnessColors.size()) {
                this.playbackEnded = true;
                this.onComplete.invoke();
                return null;
            }
        }
        FreshnessColorScene freshnessColorScene = this.freshnessColorScript.get(this.currentSceneIndex);
        float startTime = (r8 - freshnessColorScene.getStartTime()) / (freshnessColorScene.getEndTime() - freshnessColorScene.getStartTime());
        ColorChallengeElement currentColor = freshnessColorScene.getCurrentColor();
        ColorChallengeElement previousColor = freshnessColorScene.getPreviousColor();
        int i2 = this.lastDisplayedSceneIndex;
        int i3 = this.currentSceneIndex;
        if (i2 != i3) {
            this.lastDisplayedSceneIndex = i3;
        }
        return new FreshnessColorFrame(currentColor, previousColor, this.currentSceneIndex, startTime);
    }
}
