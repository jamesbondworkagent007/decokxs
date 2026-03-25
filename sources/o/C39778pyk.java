package o;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.highlight.Highlight;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pyk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39778pyk extends LineChart {
    public C39778pyk(android.content.Context context) {
        super(context);
    }

    public C39778pyk(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C39778pyk(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent != null && motionEvent.getAction() == 1) || ((motionEvent != null && motionEvent.getAction() == 2) || (motionEvent != null && motionEvent.getAction() == 0))) {
            super.onTouchEvent(motionEvent);
        }
        if ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3)) {
            post(new java.lang.Runnable() { // from class: o.pyj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C39778pyk.copydefault(this.KWHzl);
                }
            });
        }
        if (motionEvent != null && motionEvent.getAction() == 1) {
            C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, new Function1() { // from class: o.pym
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39778pyk.OLrzqt((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public static final void copydefault(C39778pyk c39778pyk) {
        c39778pyk.highlightValue((Highlight) null, true);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_click", "unlock_schedule_chart_clicks", false, 4, null);
        return Unit.INSTANCE;
    }
}
