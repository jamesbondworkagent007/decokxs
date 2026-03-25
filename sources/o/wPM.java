package o;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.IMarker;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPM {
    public static final wPM AEQbTJ = new wPM();

    private wPM() {
    }

    public static final class Application implements OnChartGestureListener {
        public final /* synthetic */ LineChart copydefault;

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartDoubleTapped(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartScale(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartTranslate(android.view.MotionEvent motionEvent, float f, float f2) {
        }

        public Application(LineChart lineChart) {
            this.copydefault = lineChart;
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            this.copydefault.setHighlightPerTapEnabled(true);
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartSingleTapped(android.view.MotionEvent motionEvent) {
            IMarker marker = this.copydefault.getMarker();
            C52580wQr c52580wQr = marker instanceof C52580wQr ? (C52580wQr) marker : null;
            if (c52580wQr == null || motionEvent == null || !c52580wQr.AEQbTJ(motionEvent.getX(), motionEvent.getY())) {
                return;
            }
            this.copydefault.highlightValue(null);
            c52580wQr.copydefault();
            this.copydefault.setHighlightPerTapEnabled(false);
        }
    }

    public final void OLrzqt(@NotNull LineChart lineChart) {
        Intrinsics.checkNotNullParameter(lineChart, "");
        lineChart.setOnChartGestureListener(new Application(lineChart));
    }
}
