package o;

import com.github.mikephil.charting.charts.PieChart;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pyg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C39774pyg extends PieChart {
    public C39774pyg(android.content.Context context) {
        super(context);
    }

    public C39774pyg(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C39774pyg(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.github.mikephil.charting.charts.PieChart, com.github.mikephil.charting.charts.PieRadarChartBase, com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mRenderer = new C39776pyi(this, this.mAnimator, this.mViewPortHandler);
    }

    @Override // android.view.View
    public boolean performClick() {
        C32866mlf.onEvent$default("Chart_Overview_TokenUnlock_Click", (TrackChannel[]) null, new Function1() { // from class: o.pyl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39774pyg.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return super.performClick();
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "button_click", "allocation_chart_clicks", false, 4, null);
        return Unit.INSTANCE;
    }
}
