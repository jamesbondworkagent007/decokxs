package o;

import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27465jvh extends RadarChart {
    public int AEQbTJ;
    public int KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setupColors(int i, int i2, int i3) {
        this.KWHzl = i;
        this.AEQbTJ = i2;
        this.copydefault = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27465jvh(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27465jvh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27465jvh(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        KWHzl();
    }

    public final void KWHzl() {
        ChartAnimator chartAnimator = this.mAnimator;
        Intrinsics.checkNotNullExpressionValue(chartAnimator, "");
        ViewPortHandler viewPortHandler = this.mViewPortHandler;
        Intrinsics.checkNotNullExpressionValue(viewPortHandler, "");
        setRenderer(new C27471jvn(this, chartAnimator, viewPortHandler));
    }

    @Override // com.github.mikephil.charting.charts.RadarChart, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.mData == 0) {
            return;
        }
        DataRenderer renderer = getRenderer();
        Intrinsics.copydefault(renderer, "");
        ((C27471jvn) renderer).OLrzqt(canvas);
        if (C33492mxV.OLrzqt()) {
            DataRenderer renderer2 = getRenderer();
            Intrinsics.copydefault(renderer2, "");
            ((C27471jvn) renderer2).KWHzl(canvas, this.AEQbTJ);
        }
        DataRenderer renderer3 = getRenderer();
        Intrinsics.copydefault(renderer3, "");
        ((C27471jvn) renderer3).EZpvd(canvas, this.copydefault);
        this.mRenderer.drawExtras(canvas);
        this.mRenderer.drawData(canvas);
    }
}
