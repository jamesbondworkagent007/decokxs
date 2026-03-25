package o;

import android.graphics.Paint;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class mYL extends MarkerView {
    public Function2<? super java.lang.Float, ? super java.lang.Float, Unit> AEQbTJ;
    public final android.graphics.Paint KWHzl;

    public static final boolean EZpvd() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnDrawMarker(@NotNull Function2<? super java.lang.Float, ? super java.lang.Float, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AEQbTJ = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mYL(@NotNull android.content.Context context) {
        super(context, C52761wXj.Fragment.OcIXYQ);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new Function2() { // from class: o.mYO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return mYL.AEQbTJ(((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        };
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(mUM.copydefault(C52761wXj.Activity.zuBGHE));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        this.KWHzl = paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(float f, float f2) {
        return Unit.INSTANCE;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(@NotNull android.graphics.Canvas canvas, float f, float f2) {
        Intrinsics.checkNotNullParameter(canvas, "");
        this.AEQbTJ.invoke(java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2));
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        super.refreshContent(entry, highlight);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mYL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void attachInfoLayout$default(mYL myl, LineChart lineChart, android.view.View view, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.mYN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Boolean.valueOf(mYL.EZpvd());
                }
            };
        }
        myl.EZpvd(lineChart, view, function0);
    }

    public final void EZpvd(@NotNull final LineChart lineChart, @NotNull final android.view.View view, @NotNull final Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(function0, "");
        setOnDrawMarker(new Function2() { // from class: o.mYR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return mYL.OLrzqt(view, lineChart, function0, ((java.lang.Float) obj).floatValue(), ((java.lang.Float) obj2).floatValue());
            }
        });
    }

    public static final Unit OLrzqt(final android.view.View view, final LineChart lineChart, final Function0 function0, final float f, float f2) {
        final int iDp2px$default = C55298xhM.dp2px$default(5.0f, null, 1, null);
        float fContentLeft = lineChart.getViewPortHandler().contentLeft();
        final float fContentRight = fContentLeft + ((lineChart.getViewPortHandler().contentRight() - fContentLeft) / 2);
        final Function0 function02 = new Function0() { // from class: o.mYT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mYL.EZpvd(view, f, fContentRight, iDp2px$default, lineChart, function0);
            }
        };
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            function02.invoke();
        } else {
            view.post(new java.lang.Runnable() { // from class: o.mYS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    mYL.copydefault(function02);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(android.view.View view, float f, float f2, int i, LineChart lineChart, Function0 function0) {
        float width = view.getWidth();
        float height = view.getHeight();
        float f3 = f < f2 ? f + i : (f - width) - i;
        float fContentTop = lineChart.getViewPortHandler().contentTop();
        float fContentBottom = lineChart.getViewPortHandler().contentBottom();
        float f4 = 2;
        float f5 = (fContentBottom - fContentTop) / f4;
        float f6 = height / f4;
        float fDp2px$default = C55298xhM.dp2px$default(32.0f, null, 1, null);
        view.setX(f3);
        view.setY(((fContentTop + f5) - f6) + fDp2px$default);
        view.setVisibility(((java.lang.Boolean) function0.invoke()).booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function0 function0) {
        function0.invoke();
    }
}
