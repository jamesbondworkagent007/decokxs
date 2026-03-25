package com.okinc.tradingbot.impl.order.strategy.smartarbitrage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.bot.data.SmartArbFundingFeePnl;
import java.util.ArrayList;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C33052mpF;
import o.C33129mqd;
import o.C33512mxp;
import o.C33566myq;
import o.C38307pTy;
import o.C48033uCm;
import o.C49962uyT;
import o.C52761wXj;
import o.C56030xvC;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.pTA;
import o.xMR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartArbPnlChartMarkerView extends MarkerView {
    public Integer AEQbTJ;
    public final float AYXKKw;
    public final TextView AhwBna;
    public final TextView AkhnZx;
    public final MPPointF EZpvd;
    public final Paint KWHzl;
    public Entry OLrzqt;
    public Highlight copydefault;
    public final Paint djBIcL;
    public final ImageView gEmmrt;
    public final float valueOf;
    public final ImageView values;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TriggerSide.values().length];
            try {
                iArr[TriggerSide.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerSide.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartArbPnlChartMarkerView(@NotNull Context context) {
        super(context, C48033uCm.Activity.GQzpsZsQwTVT);
        Intrinsics.checkNotNullParameter(context, "");
        View viewFindViewById = findViewById(C48033uCm.Application.setDrawerIndicatorEnabled);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.values = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(C48033uCm.Application.onDrawerSlide);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.gEmmrt = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C48033uCm.Application.setInverseBackgroundForced);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.AkhnZx = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C48033uCm.Application.MediaSessionCompatMediaSessionImplApi18);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.AhwBna = (TextView) viewFindViewById4;
        this.valueOf = C33052mpF.AEQbTJ(3.5f, context);
        this.AYXKKw = C33052mpF.AEQbTJ(1.75f, context);
        Paint paint = new Paint();
        this.KWHzl = paint;
        Paint paint2 = new Paint();
        this.djBIcL = paint2;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
        paint2.setStyle(style);
        this.EZpvd = new MPPointF();
    }

    private final ArrayList<Integer> EZpvd() {
        Entry entry = this.OLrzqt;
        Object data = entry != null ? entry.getData() : null;
        C56030xvC.Activity activity = data instanceof C56030xvC.Activity ? (C56030xvC.Activity) data : null;
        if (C33129mqd.copydefault(activity != null ? Float.valueOf(activity.getChartPnl()) : "0", (Object) 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return yDY.copydefault(Integer.valueOf(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null)));
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return yDY.copydefault(Integer.valueOf(C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null)));
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.OLrzqt = entry;
        this.copydefault = highlight;
        Object data = entry != null ? entry.getData() : null;
        SmartArbFundingFeePnl smartArbFundingFeePnl = data instanceof SmartArbFundingFeePnl ? (SmartArbFundingFeePnl) data : null;
        String strGEmmrt = C33129mqd.gEmmrt(smartArbFundingFeePnl != null ? smartArbFundingFeePnl.getPnl() : null);
        this.AhwBna.setText(xMR.formatICUCompact$default(xMR.copydefault, strGEmmrt, null, C38307pTy.Companion.EZpvd(1), null, null, 26, null));
        TextView textView = this.AhwBna;
        C49962uyT c49962uyT = C49962uyT.AEQbTJ;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(c49962uyT.copydefault(context, strGEmmrt));
        TextView textView2 = this.AkhnZx;
        Object data2 = entry != null ? entry.getData() : null;
        SmartArbFundingFeePnl smartArbFundingFeePnl2 = data2 instanceof SmartArbFundingFeePnl ? (SmartArbFundingFeePnl) data2 : null;
        textView2.setText(pTA.format$default(new Date(C33129mqd.valueOf(smartArbFundingFeePnl2 != null ? smartArbFundingFeePnl2.getData() : null)), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (highlight != null) {
            EZpvd(this.values, highlight.getDrawX());
            EZpvd(this.gEmmrt, highlight.getDrawX());
        }
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    private final void EZpvd(ImageView imageView, float f) {
        Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : getWidth();
        Chart chartView = getChartView();
        if (chartView instanceof PieChart) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = (int) ((iIntValue / 2.0f) - (r6.width / 2));
            return;
        }
        float f2 = iIntValue / 2.0f;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        Intrinsics.copydefault(layoutParams2, "");
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
        if (f < f2) {
            layoutParams3.leftMargin = -((int) (f2 - f));
        } else if (chartView != null && f + f2 > chartView.getWidth()) {
            layoutParams3.leftMargin = (int) (f2 - (chartView.getWidth() - f));
        } else {
            layoutParams3.leftMargin = 0;
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f, float f2) {
        Chart chartView = getChartView();
        Entry entry = this.OLrzqt;
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            int i = 0;
            for (Object obj : EZpvd()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue != 0) {
                    this.KWHzl.setColor(iIntValue);
                    OLrzqt(canvas, f, f2);
                }
                i++;
            }
        }
        super.draw(canvas, f, f2);
    }

    private final void OLrzqt(Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.valueOf, this.djBIcL);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AYXKKw, this.KWHzl);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffset() {
        MPPointF offset = super.getOffset();
        Intrinsics.checkNotNullExpressionValue(offset, "");
        return offset;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        Integer numValueOf;
        C33566myq c33566myq = C33566myq.EZpvd;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C33129mqd.OLrzqt(String.valueOf(f), Integer.valueOf(c33566myq.EZpvd(context)))) {
            numValueOf = this.AEQbTJ == null ? Integer.valueOf(getWidth()) : null;
            this.EZpvd.x = KWHzl(f, f2);
            this.EZpvd.y = AEQbTJ(f, f2);
            OLrzqt(f, f2);
            return this.EZpvd;
        }
        this.AEQbTJ = numValueOf;
        this.EZpvd.x = KWHzl(f, f2);
        this.EZpvd.y = AEQbTJ(f, f2);
        OLrzqt(f, f2);
        return this.EZpvd;
    }

    private final float KWHzl(float f, float f2) {
        Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : getWidth();
        Chart chartView = getChartView();
        float f3 = iIntValue / 2;
        return f < f3 ? -f : (chartView == null || f + f3 <= ((float) chartView.getWidth())) ? -f3 : -(iIntValue - (chartView.getWidth() - f));
    }

    private final float AEQbTJ(float f, float f2) {
        return TaskDescription.KWHzl[copydefault(f, f2).ordinal()] == 1 ? this.valueOf : -(getHeight() + this.valueOf);
    }

    private final void OLrzqt(float f, float f2) {
        this.values.setVisibility(4);
        this.gEmmrt.setVisibility(4);
        int i = TaskDescription.KWHzl[copydefault(f, f2).ordinal()];
        if (i == 1) {
            this.values.setVisibility(0);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.gEmmrt.setVisibility(0);
        }
    }

    public final TriggerSide copydefault(float f, float f2) {
        if (getChartView() != null && f2 < r2.getHeight() / 3.0f) {
            return TriggerSide.BOTTOM;
        }
        return TriggerSide.TOP;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TriggerSide {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TriggerSide[] $VALUES;
        public static final TriggerSide TOP = new TriggerSide("TOP", 0);
        public static final TriggerSide BOTTOM = new TriggerSide(InvestPopUpData.POSITION_BOTTOM, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TriggerSide[] $values() {
            return new TriggerSide[]{TOP, BOTTOM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TriggerSide> getEntries() {
            return $ENTRIES;
        }

        private TriggerSide(String str, int i) {
        }

        static {
            TriggerSide[] triggerSideArr$values = $values();
            $VALUES = triggerSideArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(triggerSideArr$values);
        }

        public static TriggerSide valueOf(String str) {
            return (TriggerSide) Enum.valueOf(TriggerSide.class, str);
        }

        public static TriggerSide[] values() {
            return (TriggerSide[]) $VALUES.clone();
        }
    }
}
