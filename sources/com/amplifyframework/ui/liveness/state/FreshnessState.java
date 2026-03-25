package com.amplifyframework.ui.liveness.state;

import androidx.compose.ui.graphics.Color;
import com.amplifyframework.predictions.aws.models.ColorDisplayInformation;
import com.amplifyframework.predictions.aws.models.RgbColor;
import com.amplifyframework.ui.liveness.model.FreshnessColorFrame;
import com.amplifyframework.ui.liveness.model.FreshnessColorScene;
import com.amplifyframework.ui.liveness.model.FreshnessKt;
import com.amplifyframework.ui.liveness.model.SceneType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FreshnessState {
    public static final int FIRST_SCENE_ALPHA = 229;
    public static final int REMAINING_SCENE_ALPHA = 191;
    private int currentSceneIndex;
    private final List<FreshnessColorScene> freshnessColorScript;
    private final List<ColorDisplayInformation> freshnessColors;
    private int lastDisplayedSceneIndex;
    private final yHT<RgbColor, RgbColor, Integer, Long, Unit> onColorDisplayed;
    private final Function0<Unit> onComplete;
    private boolean playbackEnded;
    private long playbackStarted;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.ui.liveness.state.FreshnessState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreshnessState copy$default(FreshnessState freshnessState, List list, yHT yht, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            list = freshnessState.freshnessColors;
        }
        if ((i & 2) != 0) {
            yht = freshnessState.onColorDisplayed;
        }
        if ((i & 4) != 0) {
            function0 = freshnessState.onComplete;
        }
        return freshnessState.copy(list, yht, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorDisplayInformation> component1() {
        return this.freshnessColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<RgbColor, RgbColor, Integer, Long, Unit> component2() {
        return this.onColorDisplayed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> component3() {
        return this.onComplete;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreshnessState copy(@NotNull List<ColorDisplayInformation> list, @NotNull yHT<? super RgbColor, ? super RgbColor, ? super Integer, ? super Long, Unit> yht, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new FreshnessState(list, yht, function0);
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
        return Intrinsics.EZpvd(this.freshnessColors, freshnessState.freshnessColors) && Intrinsics.EZpvd(this.onColorDisplayed, freshnessState.onColorDisplayed) && Intrinsics.EZpvd(this.onComplete, freshnessState.onComplete);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorDisplayInformation> getFreshnessColors() {
        return this.freshnessColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yHT<RgbColor, RgbColor, Integer, Long, Unit> getOnColorDisplayed() {
        return this.onColorDisplayed;
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
        return (((this.freshnessColors.hashCode() * 31) + this.onColorDisplayed.hashCode()) * 31) + this.onComplete.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPlaybackEnded(boolean z) {
        this.playbackEnded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreshnessState(freshnessColors=" + this.freshnessColors + ", onColorDisplayed=" + this.onColorDisplayed + ", onComplete=" + this.onComplete + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.yHT<? super com.amplifyframework.predictions.aws.models.RgbColor, ? super com.amplifyframework.predictions.aws.models.RgbColor, ? super java.lang.Integer, ? super java.lang.Long, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FreshnessState(@NotNull List<ColorDisplayInformation> list, @NotNull yHT<? super RgbColor, ? super RgbColor, ? super Integer, ? super Long, Unit> yht, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.freshnessColors = list;
        this.onColorDisplayed = yht;
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
            ColorDisplayInformation colorDisplayInformation = (ColorDisplayInformation) obj;
            SceneType sceneType = colorDisplayInformation.getShouldScroll() ? SceneType.DownScroll.INSTANCE : SceneType.Flat.INSTANCE;
            long duration = j + ((long) colorDisplayInformation.getDuration());
            arrayList.add(new FreshnessColorScene(j, duration, colorDisplayInformation, (ColorDisplayInformation) CollectionsKt___CollectionsKt.AkhnZx(this.freshnessColors, i - 1), sceneType));
            i++;
            j = duration;
        }
        this.freshnessColorScript = arrayList;
    }

    public final FreshnessColorFrame nextFrame(long j) {
        Color colorM3139boximpl = null;
        if (this.playbackEnded) {
            return null;
        }
        if (this.playbackStarted == -1) {
            this.playbackStarted = j;
        }
        long j2 = j - this.playbackStarted;
        while (j2 > this.freshnessColorScript.get(this.currentSceneIndex).getEndTime()) {
            int i = this.currentSceneIndex + 1;
            this.currentSceneIndex = i;
            if (i >= this.freshnessColors.size()) {
                this.playbackEnded = true;
                this.onComplete.invoke();
                return null;
            }
        }
        FreshnessColorScene freshnessColorScene = this.freshnessColorScript.get(this.currentSceneIndex);
        float startTime = (j2 - freshnessColorScene.getStartTime()) / (freshnessColorScene.getEndTime() - freshnessColorScene.getStartTime());
        RgbColor color = freshnessColorScene.getCurrentColor().getColor();
        ColorDisplayInformation previousColor = freshnessColorScene.getPreviousColor();
        RgbColor color2 = previousColor != null ? previousColor.getColor() : null;
        int i2 = this.lastDisplayedSceneIndex;
        int i3 = this.currentSceneIndex;
        if (i2 != i3) {
            this.onColorDisplayed.invoke(color, color2 == null ? color : color2, Integer.valueOf(i3), Long.valueOf(j));
            this.lastDisplayedSceneIndex = this.currentSceneIndex;
        }
        SceneType sceneType = freshnessColorScene.getSceneType();
        int i4 = this.currentSceneIndex;
        int i5 = FIRST_SCENE_ALPHA;
        long composeColor = FreshnessKt.toComposeColor(color, i4 == 0 ? 229 : 191);
        if (color2 != null) {
            if (this.currentSceneIndex != 1) {
                i5 = 191;
            }
            colorM3139boximpl = Color.m3139boximpl(FreshnessKt.toComposeColor(color2, i5));
        }
        Color color3 = colorM3139boximpl;
        if (!(freshnessColorScene.getSceneType() instanceof SceneType.DownScroll)) {
            startTime = 100.0f;
        }
        return new FreshnessColorFrame(sceneType, composeColor, color3, startTime, null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.ui.liveness.state.FreshnessState.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
