package o;

import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.alI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7512alI implements OnChartGestureListener {
    public boolean AEQbTJ;
    public boolean KWHzl;
    public Function0<Unit> OLrzqt;
    public final C7555alz copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartScale(android.view.MotionEvent motionEvent, float f, float f2) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
    }

    public C7512alI(@NotNull C7555alz c7555alz) {
        Intrinsics.checkNotNullParameter(c7555alz, "");
        this.copydefault = c7555alz;
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        pUU.EZpvd("py", "onChartGestureStart===============" + (chartGesture != null ? chartGesture.name() : null));
        this.KWHzl = false;
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        Function0<Unit> function0;
        pUU.EZpvd("py", "onChartGestureEnd==============" + (chartGesture != null ? chartGesture.name() : null));
        if ((this.copydefault.isHighlightPerTapEnabled() || chartGesture != ChartTouchListener.ChartGesture.SINGLE_TAP) && (function0 = this.OLrzqt) != null) {
            function0.invoke();
        }
    }

    @Override // com.github.mikephil.charting.listener.OnChartGestureListener
    public void onChartLongPressed(android.view.MotionEvent motionEvent) {
        pUU.EZpvd("py", "onChartLongPressed===============" + this.copydefault.KWHzl());
        this.KWHzl = true;
        if (!this.AEQbTJ || this.copydefault.KWHzl() || motionEvent == null) {
            return;
        }
        Highlight highlightByTouchPoint = this.copydefault.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY());
        Intrinsics.checkNotNullExpressionValue(highlightByTouchPoint, "");
        this.copydefault.highlightValue(highlightByTouchPoint, true);
    }
}
