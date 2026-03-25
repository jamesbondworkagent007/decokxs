package o;

import android.view.ViewGroup;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.find_ui.data.KlineCapitalFlowData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nkI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34850nkI extends MarkerView {
    public Date AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public int EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public Highlight copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34850nkI(@NotNull android.content.Context context) {
        super(context, qZH.ActionBar.QHmsKR);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = (android.widget.LinearLayout) findViewById(qZH.StateListAnimator.RFmUsE);
        this.AYXKKw = (android.widget.TextView) findViewById(qZH.StateListAnimator.MediaBrowserCompat);
        this.valueOf = (android.widget.TextView) findViewById(qZH.StateListAnimator.dGgpab);
        this.gEmmrt = (android.widget.TextView) findViewById(qZH.StateListAnimator.aVPvww);
        this.OLrzqt = (android.widget.TextView) findViewById(qZH.StateListAnimator.aSdHwS);
        this.djBIcL = (android.widget.TextView) findViewById(qZH.StateListAnimator.ahrCSq);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        android.content.Context context;
        int i;
        this.copydefault = highlight;
        if (entry != null) {
            java.lang.Object data = entry.getData();
            Intrinsics.copydefault(data, "");
            Date date = new Date(C33129mqd.valueOf(((KlineCapitalFlowData) data).getTs()));
            this.AEQbTJ = date;
            android.widget.TextView textView = this.AYXKKw;
            java.lang.String str = pTA.format$default(date, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            if (str == null) {
                str = "--";
            }
            textView.setText(str);
            android.widget.TextView textView2 = this.valueOf;
            java.lang.Object data2 = entry.getData();
            Intrinsics.copydefault(data2, "");
            if (C33129mqd.djBIcL(((KlineCapitalFlowData) data2).getNetVol()) < 0.0f) {
                context = getContext();
                i = qZH.PendingIntent.IKQXqd;
            } else {
                context = getContext();
                i = qZH.PendingIntent.hPlhRW;
            }
            textView2.setText(context.getString(i));
            android.widget.TextView textView3 = this.gEmmrt;
            java.lang.Object data3 = entry.getData();
            Intrinsics.copydefault(data3, "");
            textView3.setText(((KlineCapitalFlowData) data3).getNetVolTitle());
            android.widget.TextView textView4 = this.djBIcL;
            java.lang.Object data4 = entry.getData();
            Intrinsics.copydefault(data4, "");
            textView4.setText(((KlineCapitalFlowData) data4).getClosePrice());
            this.EZpvd = EZpvd();
            ViewGroup.LayoutParams layoutParams = this.KWHzl.getLayoutParams();
            layoutParams.width = this.EZpvd;
            this.KWHzl.setLayoutParams(layoutParams);
        }
        super.refreshContent(entry, highlight);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        MPPointF mPPointF = new MPPointF();
        Chart chartView = getChartView();
        Intrinsics.copydefault(chartView, "");
        C34887nkt c34887nkt = (C34887nkt) chartView;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(8.0f, context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iCopydefault2 = C55298xhM.copydefault(8.0f, context2);
        float f3 = iCopydefault;
        if (f - f3 < getWidth()) {
            float width = c34887nkt.getWidth() - getWidth();
            Intrinsics.checkNotNullExpressionValue(getContext(), "");
            mPPointF.x = (width - f) - C55298xhM.copydefault(12.0f, r3);
        } else {
            mPPointF.x = (-f) + f3;
        }
        mPPointF.y = (-f2) + iCopydefault2;
        return mPPointF;
    }

    private final int EZpvd() {
        int measuredWidth = this.AYXKKw.getMeasuredWidth();
        android.widget.TextView textView = this.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        float textSize$default = C35140nph.getTextSize$default(textView, 0.0f, 2, null);
        android.widget.TextView textView2 = this.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        float textSize$default2 = textSize$default + C35140nph.getTextSize$default(textView2, 0.0f, 2, null);
        android.widget.TextView textView3 = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        float textSize$default3 = C35140nph.getTextSize$default(textView3, 0.0f, 2, null);
        android.widget.TextView textView4 = this.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        float textSize$default4 = textSize$default3 + C35140nph.getTextSize$default(textView4, 0.0f, 2, null);
        if (measuredWidth < textSize$default2) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default2));
        }
        if (measuredWidth < textSize$default4) {
            measuredWidth = C33129mqd.AhwBna(java.lang.Float.valueOf(textSize$default4));
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return measuredWidth + C55298xhM.copydefault(22.0f, context);
    }
}
