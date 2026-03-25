package com.okinc.tradingbot.impl.market_place.home.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.MPPointD;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.tradingbot.impl.market_place.home.view.MarketPlaceHomeLineChartMarkerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C33052mpF;
import o.C33129mqd;
import o.C33566myq;
import o.C48033uCm;
import o.C52761wXj;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class MarketPlaceHomeLineChartMarkerView extends MarkerView {
    public final Paint AEQbTJ;
    public final float AYXKKw;
    public final float AhwBna;
    public final ImageView DbNXlk;
    public final MPPointF EZpvd;
    public Highlight KWHzl;
    public Integer OLrzqt;
    public Entry copydefault;
    public final ImageView djBIcL;
    public final float fetchVPNInfo;
    public final Paint gEmmrt;
    public final ImageView isConnected;
    public final InterfaceC56387yDm valueOf;
    public final ImageView values;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TriggerSide.values().length];
            try {
                iArr[TriggerSide.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriggerSide.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriggerSide.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TriggerSide.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketPlaceHomeLineChartMarkerView(@NotNull Context context) {
        super(context, C48033uCm.Activity.HJWChPhFGucI);
        Intrinsics.checkNotNullParameter(context, "");
        View viewFindViewById = findViewById(C48033uCm.Application.setDrawerIndicatorEnabled);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.values = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(C48033uCm.Application.onDrawerSlide);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.djBIcL = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C48033uCm.Application.setActionBarDescription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.isConnected = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C48033uCm.Application.setDrawerArrowDrawable);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.DbNXlk = (ImageView) viewFindViewById4;
        this.fetchVPNInfo = C33052mpF.AEQbTJ(20.0f, context);
        this.AhwBna = C33052mpF.AEQbTJ(3.5f, context);
        this.AYXKKw = C33052mpF.AEQbTJ(1.75f, context);
        Paint paint = new Paint();
        this.AEQbTJ = paint;
        Paint paint2 = new Paint();
        this.gEmmrt = paint2;
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MarketPlaceHomeLineChartMarkerView.EZpvd(this.KWHzl);
            }
        });
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
        paint2.setStyle(style);
        this.EZpvd = new MPPointF();
    }

    private final TextView EZpvd() {
        return (TextView) this.valueOf.getValue();
    }

    public static final TextView EZpvd(MarketPlaceHomeLineChartMarkerView marketPlaceHomeLineChartMarkerView) {
        return (TextView) marketPlaceHomeLineChartMarkerView.findViewById(C48033uCm.Application.valueType);
    }

    public final ArrayList<Integer> AEQbTJ() {
        return yDY.copydefault(Integer.valueOf(ContextCompat.getColor(getContext(), C32113mPz.ActionBar.fIwbmz)));
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        this.copydefault = entry;
        this.KWHzl = highlight;
        TextView textViewEZpvd = EZpvd();
        Object data = entry != null ? entry.getData() : null;
        String str = data instanceof String ? (String) data : null;
        if (str == null) {
            str = "";
        }
        textViewEZpvd.setText(str);
        measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (highlight != null) {
            setTriangleMargin(this.values, highlight.getDrawX());
            setTriangleMargin(this.djBIcL, highlight.getDrawX());
            setHorizontalTriangleMargin(this.DbNXlk, highlight.getDrawX(), highlight.getDrawY());
            setHorizontalTriangleMargin(this.isConnected, highlight.getDrawX(), highlight.getDrawY());
        }
        layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setTriangleMargin(ImageView imageView, float f) {
        Integer num = this.OLrzqt;
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

    public final void setHorizontalTriangleMargin(ImageView imageView, float f, float f2) {
        TriggerSide triggerSideKWHzl = KWHzl(f, f2);
        if (triggerSideKWHzl == TriggerSide.LEFT || triggerSideKWHzl == TriggerSide.RIGHT) {
            Chart chartView = getChartView();
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (f2 - (getHeight() / 2.0f) < 0.0f) {
                layoutParams2.bottomMargin = (int) (((getHeight() / 2.0f) - f2) - 16);
                layoutParams2.topMargin = 0;
            } else if (chartView != null && chartView.getHeight() - f2 < getHeight() / 2.0f) {
                layoutParams2.topMargin = (int) ((getHeight() / 2.0f) - (chartView.getHeight() - f2));
                layoutParams2.bottomMargin = 0;
            } else {
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [com.github.mikephil.charting.data.BaseEntry, com.github.mikephil.charting.data.Entry] */
    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(Canvas canvas, float f, float f2) {
        Object next;
        ViewParent chartView = getChartView();
        Entry entry = this.copydefault;
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            int i = 0;
            for (Object obj : AEQbTJ()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue != 0) {
                    this.AEQbTJ.setColor(iIntValue);
                    BarLineScatterCandleBubbleDataProvider barLineScatterCandleBubbleDataProvider = (BarLineScatterCandleBubbleDataProvider) chartView;
                    Collection dataSets = barLineScatterCandleBubbleDataProvider.getData().getDataSets();
                    Intrinsics.checkNotNullExpressionValue(dataSets, "");
                    Iterator it = dataSets.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        Intrinsics.checkNotNullExpressionValue(((IBarLineScatterCandleBubbleDataSet) next).getEntriesForXValue(entry.getX()), "");
                        if (!r8.isEmpty()) {
                            break;
                        }
                    }
                    IBarLineScatterCandleBubbleDataSet iBarLineScatterCandleBubbleDataSet = (IBarLineScatterCandleBubbleDataSet) next;
                    if (iBarLineScatterCandleBubbleDataSet != null && iBarLineScatterCandleBubbleDataSet.getEntryCount() > ((int) entry.getX())) {
                        ?? entryForIndex = iBarLineScatterCandleBubbleDataSet.getEntryForIndex((int) entry.getX());
                        MPPointD pixelForValues = barLineScatterCandleBubbleDataProvider.getTransformer(iBarLineScatterCandleBubbleDataSet.getAxisDependency()).getPixelForValues(entryForIndex.getX(), entryForIndex.getY());
                        copydefault(canvas, (float) pixelForValues.x, (float) pixelForValues.y);
                    }
                }
                i++;
            }
        }
        super.draw(canvas, f, f2);
    }

    private final void copydefault(Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AhwBna, this.gEmmrt);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.AYXKKw, this.AEQbTJ);
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
            numValueOf = this.OLrzqt == null ? Integer.valueOf(getWidth()) : null;
            this.EZpvd.x = copydefault(f, f2);
            this.EZpvd.y = OLrzqt(f, f2);
            AEQbTJ(f, f2);
            return this.EZpvd;
        }
        this.OLrzqt = numValueOf;
        this.EZpvd.x = copydefault(f, f2);
        this.EZpvd.y = OLrzqt(f, f2);
        AEQbTJ(f, f2);
        return this.EZpvd;
    }

    public final float copydefault(float f, float f2) {
        Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : getWidth();
        int i = iIntValue / 2;
        Chart chartView = getChartView();
        int i2 = Activity.AEQbTJ[KWHzl(f, f2).ordinal()];
        if (i2 == 1) {
            return this.AhwBna;
        }
        if (i2 != 2) {
            float width = i;
            if (f >= width) {
                if (chartView != null && f + width > chartView.getWidth()) {
                    width = iIntValue - (chartView.getWidth() - f);
                }
                return -width;
            }
        } else {
            f = iIntValue + this.AhwBna + 6;
        }
        return -f;
    }

    public final float OLrzqt(float f, float f2) {
        float height;
        Chart chartView = getChartView();
        int i = Activity.AEQbTJ[KWHzl(f, f2).ordinal()];
        if (i == 1 || i == 2) {
            if (f2 - (getHeight() / 2.0f) < 0.0f) {
                return 5 + (f2 - (getHeight() / 2.0f));
            }
            if (chartView != null && chartView.getHeight() - f2 < getHeight() / 2.0f) {
                height = getHeight() - (chartView.getHeight() - f2);
            } else {
                return (-getHeight()) / 2.0f;
            }
        } else {
            if (i == 3) {
                return this.AhwBna;
            }
            height = getHeight() + this.AhwBna;
        }
        return -height;
    }

    public final void AEQbTJ(float f, float f2) {
        this.isConnected.setVisibility(4);
        this.DbNXlk.setVisibility(4);
        this.values.setVisibility(4);
        this.djBIcL.setVisibility(4);
        int i = Activity.AEQbTJ[KWHzl(f, f2).ordinal()];
        if (i == 1) {
            this.isConnected.setVisibility(0);
            return;
        }
        if (i == 2) {
            this.DbNXlk.setVisibility(0);
        } else if (i == 3) {
            this.values.setVisibility(0);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.djBIcL.setVisibility(0);
        }
    }

    public final TriggerSide KWHzl(float f, float f2) {
        Chart chartView = getChartView();
        if (chartView != null && f > getChartView().getWidth() - this.fetchVPNInfo) {
            return TriggerSide.RIGHT;
        }
        if (f < this.fetchVPNInfo) {
            return TriggerSide.LEFT;
        }
        if (chartView != null && f2 < chartView.getHeight() / 3.0f) {
            return TriggerSide.BOTTOM;
        }
        return TriggerSide.TOP;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TriggerSide {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TriggerSide[] $VALUES;
        public static final TriggerSide LEFT = new TriggerSide("LEFT", 0);
        public static final TriggerSide RIGHT = new TriggerSide("RIGHT", 1);
        public static final TriggerSide TOP = new TriggerSide("TOP", 2);
        public static final TriggerSide BOTTOM = new TriggerSide(InvestPopUpData.POSITION_BOTTOM, 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TriggerSide[] $values() {
            return new TriggerSide[]{LEFT, RIGHT, TOP, BOTTOM};
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
