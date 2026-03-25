package o;

import android.graphics.Paint;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.dataprovider.BarLineScatterCandleBubbleDataProvider;
import com.github.mikephil.charting.utils.MPPointF;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51346vlL extends MarkerView {
    public Entry AEQbTJ;
    public final MPPointF AYXKKw;
    public android.widget.TextView EZpvd;
    public android.widget.TextView KWHzl;
    public android.widget.LinearLayout OLrzqt;
    public final android.graphics.Paint copydefault;
    public final float djBIcL;
    public final android.graphics.Paint gEmmrt;
    public final float valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51346vlL(@NotNull android.content.Context context) {
        super(context, C48033uCm.Activity.gdmIOq);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewFindViewById = findViewById(C48033uCm.Application.MediaDescriptionCompatApi21);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.OLrzqt = (android.widget.LinearLayout) viewFindViewById;
        android.view.View viewFindViewById2 = findViewById(C48033uCm.Application.AppCompatDelegateImplPanelFeatureState);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        this.KWHzl = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = findViewById(C48033uCm.Application.detect);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.EZpvd = (android.widget.TextView) viewFindViewById3;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.gEmmrt = paint2;
        this.valueOf = C33052mpF.AEQbTJ(5.0f, context);
        this.djBIcL = C33052mpF.AEQbTJ(3.0f, context);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.DGgkXd));
        paint2.setStyle(style);
        this.AYXKKw = new MPPointF();
    }

    private final java.util.ArrayList<java.lang.Integer> copydefault() {
        java.lang.String pnlRatio;
        Entry entry = this.AEQbTJ;
        java.lang.Object data = entry != null ? entry.getData() : null;
        StrategyProfitResponse strategyProfitResponse = data instanceof StrategyProfitResponse ? (StrategyProfitResponse) data : null;
        if (strategyProfitResponse == null || (pnlRatio = strategyProfitResponse.getPnlRatio()) == null) {
            pnlRatio = "0";
        }
        if (C33129mqd.copydefault((java.lang.Object) pnlRatio, (java.lang.Object) 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return yDY.copydefault(java.lang.Integer.valueOf(C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null)));
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return yDY.copydefault(java.lang.Integer.valueOf(C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null)));
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        Chart chartView = getChartView();
        Entry entry = this.AEQbTJ;
        if (chartView != null && (chartView instanceof BarLineScatterCandleBubbleDataProvider) && entry != null) {
            int i = 0;
            for (java.lang.Object obj : copydefault()) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                if (iIntValue != 0) {
                    this.copydefault.setColor(iIntValue);
                    C43296rmc.AEQbTJ("posTest", "posX " + f + " posY " + f2);
                    KWHzl(canvas, f, f2);
                }
                i++;
            }
        }
        super.draw(canvas, f, f2);
    }

    private final void KWHzl(android.graphics.Canvas canvas, float f, float f2) {
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.valueOf, this.gEmmrt);
        }
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.djBIcL, this.copydefault);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void refreshContent(Entry entry, Highlight highlight) {
        java.lang.String pnlRatio;
        java.lang.String str;
        if (entry != null && entry.getData() != null) {
            this.AEQbTJ = entry;
            java.lang.Object data = entry.getData();
            StrategyProfitResponse strategyProfitResponse = data instanceof StrategyProfitResponse ? (StrategyProfitResponse) data : null;
            if (strategyProfitResponse == null || (pnlRatio = strategyProfitResponse.getPnlRatio()) == null) {
                pnlRatio = "0";
            }
            this.KWHzl.setText(C56033xvF.fmtBotPnlPercent$default(pnlRatio, true, 0, 4, null));
            this.KWHzl.setTextColor(KWHzl(pnlRatio));
            android.widget.TextView textView = this.EZpvd;
            java.lang.Object data2 = entry.getData();
            StrategyProfitResponse strategyProfitResponse2 = data2 instanceof StrategyProfitResponse ? (StrategyProfitResponse) data2 : null;
            java.lang.String cTime = strategyProfitResponse2 != null ? strategyProfitResponse2.getCTime() : null;
            if (cTime == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) cTime)) {
                str = "--";
            } else {
                java.lang.Object data3 = entry.getData();
                StrategyProfitResponse strategyProfitResponse3 = data3 instanceof StrategyProfitResponse ? (StrategyProfitResponse) data3 : null;
                str = pTA.format$default(new Date(C33129mqd.valueOf(strategyProfitResponse3 != null ? strategyProfitResponse3.getCTime() : null)), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
            }
            textView.setText(str);
        }
        super.refreshContent(entry, highlight);
    }

    private final int KWHzl(java.lang.String str) {
        BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) str);
        if (C33129mqd.OLrzqt(bigDecimalOLrzqt, "0")) {
            return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        if (C33129mqd.copydefault((java.lang.Object) bigDecimalOLrzqt, (java.lang.Object) 0)) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return C33512mxp.tradeRiseGraph$default(c33512mxp, context, 0.0f, 2, null);
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        return C33512mxp.tradeFallGraph$default(c33512mxp2, context2, 0.0f, 2, null);
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        this.AYXKKw.x = EZpvd(f);
        this.AYXKKw.y = copydefault(f2);
        return this.AYXKKw;
    }

    private final float EZpvd(float f) {
        if (getChartView() == null || f + getWidth() + 12.0f <= r0.getWidth()) {
            return 12.0f;
        }
        return -(getWidth() + 12.0f);
    }

    private final float copydefault(float f) {
        if (getChartView() == null || (f - getHeight()) - 24.0f >= 0.0f) {
            return -(getHeight() + 12.0f);
        }
        return 12.0f;
    }
}
