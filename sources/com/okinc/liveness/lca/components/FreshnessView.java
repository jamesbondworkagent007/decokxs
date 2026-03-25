package com.okinc.liveness.lca.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.okinc.liveness.lca.data.ColorChallengeElement;
import com.okinc.liveness.lca.data.FreshnessColorFrame;
import com.okinc.liveness.lca.data.FreshnessKt;
import com.okinc.liveness.lca.data.FreshnessState;
import com.okinc.liveness.lca.data.RgbColor;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class FreshnessView extends View {
    public static final int $stable = 8;
    public final Paint bottomPaint;
    public FreshnessColorFrame currentFrame;
    public final int defaultBackgroundColor;
    public Integer drawColorSequence;
    public boolean freshnessBefore;
    public FreshnessState freshnessState;
    public final Handler handler;
    public yHT<? super ColorChallengeElement, ? super ColorChallengeElement, ? super Integer, ? super Long, Unit> onColorDisplayed;
    public Function0<Unit> onFreshnessCompleted;
    public Function0<Unit> onFreshnessStarted;
    public final Paint topPaint;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FreshnessView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FreshnessView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:19) call: com.okinc.liveness.lca.components.FreshnessView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ FreshnessView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshnessView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.topPaint = new Paint(1);
        this.bottomPaint = new Paint(1);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public final void startColorChallenge(@NotNull List<ColorChallengeElement> list, @NotNull yHT<? super ColorChallengeElement, ? super ColorChallengeElement, ? super Integer, ? super Long, Unit> yht, @NotNull final Function0<Unit> function0, @NotNull Function0<Unit> function02, @NotNull Function0<Unit> function03) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yht, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        Intrinsics.checkNotNullParameter(function03, "");
        this.freshnessBefore = false;
        this.onColorDisplayed = yht;
        this.onFreshnessStarted = function02;
        this.onFreshnessCompleted = function03;
        this.freshnessState = new FreshnessState(list, new Function0() { // from class: com.okinc.liveness.lca.components.FreshnessView$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FreshnessView.startColorChallenge$lambda$0(this.f$0, function0);
            }
        });
        this.handler.post(new Runnable() { // from class: com.okinc.liveness.lca.components.FreshnessView.startColorChallenge.2
            @Override // java.lang.Runnable
            public void run() {
                FreshnessState freshnessState = FreshnessView.this.freshnessState;
                FreshnessState freshnessState2 = null;
                if (freshnessState == null) {
                    Intrinsics.gEmmrt("");
                    freshnessState = null;
                }
                if (freshnessState.getPlaybackEnded()) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                FreshnessView freshnessView = FreshnessView.this;
                FreshnessState freshnessState3 = freshnessView.freshnessState;
                if (freshnessState3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    freshnessState2 = freshnessState3;
                }
                freshnessView.currentFrame = freshnessState2.nextFrame(jCurrentTimeMillis);
                FreshnessView.this.invalidate();
                FreshnessView.this.handler.post(this);
            }
        });
    }

    public static final Unit startColorChallenge$lambda$0(FreshnessView freshnessView, Function0 function0) {
        freshnessView.handler.removeCallbacksAndMessages(null);
        freshnessView.freshnessBefore = false;
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        FreshnessColorFrame freshnessColorFrame;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.freshnessState == null || (freshnessColorFrame = this.currentFrame) == null) {
            return;
        }
        this.topPaint.setColor(FreshnessKt.toColor(freshnessColorFrame.getCurrentColor().getColor()));
        canvas.drawRect(new Rect(0, 0, getWidth(), getHeight()), this.topPaint);
        Integer num = this.drawColorSequence;
        int currentSequence = freshnessColorFrame.getCurrentSequence();
        if (num != null && num.intValue() == currentSequence) {
            return;
        }
        this.drawColorSequence = Integer.valueOf(freshnessColorFrame.getCurrentSequence());
        if (!this.freshnessBefore && isFreshnessColor(freshnessColorFrame.getCurrentColor().getColor())) {
            this.freshnessBefore = true;
            Function0<Unit> function0 = this.onFreshnessStarted;
            if (function0 != null) {
                function0.invoke();
            }
        }
        if (this.freshnessBefore && !isFreshnessColor(freshnessColorFrame.getCurrentColor().getColor())) {
            this.freshnessBefore = false;
            Function0<Unit> function02 = this.onFreshnessCompleted;
            if (function02 != null) {
                function02.invoke();
            }
        }
        yHT<? super ColorChallengeElement, ? super ColorChallengeElement, ? super Integer, ? super Long, Unit> yht = this.onColorDisplayed;
        if (yht != null) {
            yht.invoke(freshnessColorFrame.getCurrentColor(), freshnessColorFrame.getPreviousColor(), Integer.valueOf(freshnessColorFrame.getCurrentSequence()), Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final boolean isFreshnessColor(RgbColor rgbColor) {
        return rgbColor.getAlpha() != 0;
    }

    public final void stop() {
        cancel();
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void cancel() {
        FreshnessState freshnessState = this.freshnessState;
        if (freshnessState != null) {
            if (freshnessState == null) {
                Intrinsics.gEmmrt("");
                freshnessState = null;
            }
            freshnessState.setPlaybackEnded(true);
        }
        this.currentFrame = null;
        this.drawColorSequence = null;
        this.freshnessBefore = false;
        this.topPaint.setColor(this.defaultBackgroundColor);
        this.bottomPaint.setColor(this.defaultBackgroundColor);
        invalidate();
    }
}
