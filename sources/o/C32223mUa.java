package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32223mUa implements OnChartValueSelectedListener {
    public final java.util.Map<java.lang.Float, C32233mUk> AEQbTJ;
    public final android.view.ViewGroup OLrzqt;
    public final BarChart copydefault;

    public C32223mUa(@NotNull BarChart barChart, @NotNull java.util.Map<java.lang.Float, C32233mUk> map, android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(barChart, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.copydefault = barChart;
        this.AEQbTJ = map;
        this.OLrzqt = viewGroup;
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onValueSelected(Entry entry, Highlight highlight) {
        if (entry instanceof BarEntry) {
            BarEntry barEntry = (BarEntry) entry;
            copydefault(barEntry.getX(), this.AEQbTJ.get(java.lang.Float.valueOf(barEntry.getX())));
            KWHzl(barEntry, highlight);
        }
    }

    @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
    public void onNothingSelected() {
        EZpvd();
    }

    public final void copydefault(float f, C32233mUk c32233mUk) {
        XAxis xAxis = this.copydefault.getXAxis();
        xAxis.removeAllLimitLines();
        LimitLine limitLine = new LimitLine(f);
        limitLine.setLineColor(mUM.copydefault(C52761wXj.Activity.HJWChPDXdlte));
        limitLine.setLineWidth(0.5f);
        limitLine.enableDashedLine(10.0f, 10.0f, 0.0f);
        xAxis.addLimitLine(limitLine);
        android.view.ViewGroup viewGroup = this.OLrzqt;
        AppCompatTextView appCompatTextView = viewGroup != null ? (AppCompatTextView) viewGroup.findViewById(C35964oKf.StateListAnimator.getQueueTitle) : null;
        android.view.ViewGroup viewGroup2 = this.OLrzqt;
        AppCompatTextView appCompatTextView2 = viewGroup2 != null ? (AppCompatTextView) viewGroup2.findViewById(C35964oKf.StateListAnimator.getRatingType) : null;
        if (appCompatTextView != null) {
            appCompatTextView.setText(c32233mUk != null ? c32233mUk.copydefault() : null);
        }
        if (appCompatTextView2 != null) {
            mRJ mrj = mRJ.AEQbTJ;
            java.lang.String strOLrzqt = c32233mUk != null ? c32233mUk.OLrzqt() : null;
            appCompatTextView2.setText(mrj.OLrzqt(strOLrzqt == null ? "" : strOLrzqt, (252 & 1) != 0 ? false : true, (252 & 2) != 0 ? RoundingMode.HALF_UP : RoundingMode.DOWN, (252 & 4) != 0 ? true : true, (252 & 8) == 0 ? false : true, (252 & 16) != 0 ? false : false, (252 & 32) != 0 ? false : false, (252 & 64) != 0 ? DisplaySign.AUTO : null, (252 & 128) == 0 ? false : false));
        }
        android.view.ViewGroup viewGroup3 = this.OLrzqt;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        this.copydefault.invalidate();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(BarEntry barEntry, Highlight highlight) {
        android.view.ViewGroup viewGroup;
        if (highlight == null || (viewGroup = this.OLrzqt) == null) {
            return;
        }
        if (viewGroup.getWidth() == 0) {
            this.OLrzqt.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        int measuredWidth = this.OLrzqt.getMeasuredWidth();
        int measuredHeight = this.OLrzqt.getMeasuredHeight();
        double dAEQbTJ = this.copydefault.getTransformer(((IBarDataSet) ((BarData) this.copydefault.getData()).getDataSets().get(highlight.getDataSetIndex())).getAxisDependency()).getPixelForValues(highlight.getX(), 0.0f).x - ((double) (measuredWidth / 2));
        if (dAEQbTJ < this.copydefault.getViewPortHandler().offsetLeft()) {
            dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Float.valueOf(this.copydefault.getViewPortHandler().offsetLeft()));
        }
        float width = (this.copydefault.getWidth() - this.copydefault.getViewPortHandler().offsetRight()) - measuredWidth;
        if (dAEQbTJ > width) {
            dAEQbTJ = C33129mqd.AEQbTJ(java.lang.Float.valueOf(width));
        }
        ViewGroup.LayoutParams layoutParams = this.OLrzqt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) dAEQbTJ;
            int iContentTop = (((int) this.copydefault.getViewPortHandler().contentTop()) - measuredHeight) - 4;
            marginLayoutParams.topMargin = iContentTop >= 0 ? iContentTop : 4;
            this.OLrzqt.setLayoutParams(marginLayoutParams);
        }
    }

    private final void EZpvd() {
        this.copydefault.getXAxis().removeAllLimitLines();
        android.view.ViewGroup viewGroup = this.OLrzqt;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.copydefault.invalidate();
    }
}
