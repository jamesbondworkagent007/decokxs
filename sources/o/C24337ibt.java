package o;

import android.graphics.PointF;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Transformer;
import com.okinc.business.dexlogic.bean.CandleResultInfo;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C22368hdz;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24337ibt extends LineChart {
    public int AEQbTJ;
    public Function2<? super java.lang.Float, ? super PointF, Unit> AYXKKw;
    public int AhwBna;
    public int AkhnZx;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> EZpvd;
    public LineDataSet KWHzl;
    public C24343ibz OLrzqt;
    public boolean copydefault;
    public final PointF djBIcL;
    public final PointF gEmmrt;
    public int isConnected;
    public Function2<? super java.lang.Float, ? super PointF, Unit> valueOf;
    public final android.graphics.Paint values;

    /* JADX INFO: renamed from: o.ibt$ActionBar */
    /* JADX INFO: loaded from: classes15.dex */
    public static class ActionBar implements OnChartGestureListener {
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
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
        }

        @Override // com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartLongPressed(android.view.MotionEvent motionEvent) {
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
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMaxPointDrawListener(@NotNull Function2<? super java.lang.Float, ? super PointF, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.valueOf = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMinPointDrawListener(@NotNull Function2<? super java.lang.Float, ? super PointF, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.AYXKKw = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectCallback(@NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.EZpvd = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24337ibt(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OLrzqt = new C24343ibz(context2, C23274hvD.ActionBar.AubY, C23274hvD.ActionBar.zsXlph);
        this.gEmmrt = new PointF();
        this.djBIcL = new PointF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.values = paint;
        this.copydefault = true;
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24337ibt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OLrzqt = new C24343ibz(context2, C23274hvD.ActionBar.AubY, C23274hvD.ActionBar.zsXlph);
        this.gEmmrt = new PointF();
        this.djBIcL = new PointF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.values = paint;
        this.copydefault = true;
        copydefault(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24337ibt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.OLrzqt = new C24343ibz(context2, C23274hvD.ActionBar.AubY, C23274hvD.ActionBar.zsXlph);
        this.gEmmrt = new PointF();
        this.djBIcL = new PointF();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        this.values = paint;
        this.copydefault = true;
        copydefault(context);
    }

    private final void copydefault(android.content.Context context) {
        C25352ivB.EZpvd(context, this);
        setMarker(this.OLrzqt);
        this.OLrzqt.EZpvd(this);
        setOnChartGestureListener(new StateListAnimator());
        setOnChartValueSelectedListener(new TaskDescription());
    }

    /* JADX INFO: renamed from: o.ibt$StateListAnimator */
    public static final class StateListAnimator extends ActionBar {
        public StateListAnimator() {
        }

        @Override // o.C24337ibt.ActionBar, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureEnd(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            C24337ibt.this.copydefault(true, null);
            C24337ibt.this.performHapticFeedback(0, 3);
            Function2 function2 = C24337ibt.this.EZpvd;
            if (function2 != null) {
                function2.invoke("", "");
            }
        }

        @Override // o.C24337ibt.ActionBar, com.github.mikephil.charting.listener.OnChartGestureListener
        public void onChartGestureStart(android.view.MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
            if (motionEvent != null) {
                C24337ibt c24337ibt = C24337ibt.this;
                c24337ibt.copydefault(false, c24337ibt.getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()));
            }
            C24337ibt.this.performHapticFeedback(0, 3);
        }
    }

    /* JADX INFO: renamed from: o.ibt$TaskDescription */
    public static final class TaskDescription implements OnChartValueSelectedListener {
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
        }

        public TaskDescription() {
        }

        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            Function2 function2;
            java.lang.Object data = entry != null ? entry.getData() : null;
            CandleResultInfo candleResultInfo = data instanceof CandleResultInfo ? (CandleResultInfo) data : null;
            if (candleResultInfo == null || (function2 = C24337ibt.this.EZpvd) == null) {
                return;
            }
            function2.invoke(candleResultInfo.getPrice(), pTA.format$default(new Date(C33129mqd.valueOf(candleResultInfo.getTimestamp())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
        }
    }

    public final void setChartData(@NotNull java.util.ArrayList<Entry> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(OLrzqt(arrayList));
        setData(new LineData(arrayList2));
        animateX(300);
        int i = 0;
        this.AhwBna = 0;
        this.AEQbTJ = 0;
        this.gEmmrt.set(0.0f, 0.0f);
        this.djBIcL.set(0.0f, 0.0f);
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            Entry entry = (Entry) obj;
            if (arrayList.get(this.AhwBna).getY() > entry.getY()) {
                this.AhwBna = i;
            }
            if (arrayList.get(this.AEQbTJ).getY() < entry.getY()) {
                this.AEQbTJ = i;
            }
            i++;
        }
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        java.util.List<T> values;
        Entry entry;
        java.util.List<T> values2;
        Entry entry2;
        java.lang.String strSubCheckS$default;
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        Transformer transformer = getTransformer(YAxis.AxisDependency.LEFT);
        LineDataSet lineDataSet = this.KWHzl;
        float[] fArrGenerateTransformedValuesLine = transformer.generateTransformedValuesLine(lineDataSet, 1.0f, 1.0f, 0, (lineDataSet == null || (strSubCheckS$default = C23313hvq.subCheckS$default(java.lang.Integer.valueOf(lineDataSet.getEntryCount()), 1, null, null, null, 14, null)) == null) ? 0 : java.lang.Integer.parseInt(strSubCheckS$default));
        int i = this.AhwBna * 2;
        float f = fArrGenerateTransformedValuesLine[i];
        float f2 = fArrGenerateTransformedValuesLine[i + 1];
        int i2 = this.AEQbTJ * 2;
        float f3 = fArrGenerateTransformedValuesLine[i2];
        float f4 = fArrGenerateTransformedValuesLine[i2 + 1];
        if (this.copydefault) {
            AEQbTJ(canvas, f, f2);
            AEQbTJ(canvas, f3, f4);
            float y = 0.0f;
            if (java.lang.Float.compare(this.gEmmrt.x, f) != 0 || java.lang.Float.compare(this.gEmmrt.y, f2) != 0) {
                this.gEmmrt.set(f, f2);
                Function2<? super java.lang.Float, ? super PointF, Unit> function2 = this.AYXKKw;
                if (function2 != null) {
                    LineDataSet lineDataSet2 = this.KWHzl;
                    function2.invoke(java.lang.Float.valueOf((lineDataSet2 == null || (values = lineDataSet2.getValues()) == 0 || (entry = (Entry) values.get(this.AhwBna)) == null) ? 0.0f : entry.getY()), this.gEmmrt);
                }
            }
            if (java.lang.Float.compare(this.djBIcL.x, f3) == 0 && java.lang.Float.compare(this.djBIcL.y, f4) == 0) {
                return;
            }
            this.djBIcL.set(f3, f4);
            Function2<? super java.lang.Float, ? super PointF, Unit> function22 = this.valueOf;
            if (function22 != null) {
                LineDataSet lineDataSet3 = this.KWHzl;
                if (lineDataSet3 != null && (values2 = lineDataSet3.getValues()) != 0 && (entry2 = (Entry) values2.get(this.AEQbTJ)) != null) {
                    y = entry2.getY();
                }
                function22.invoke(java.lang.Float.valueOf(y), this.djBIcL);
            }
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2) {
        android.graphics.Paint paint = this.values;
        int i = C52761wXj.Activity.fbC;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        paint.setColor(C25382ivf.copydefault(i, context));
        canvas.drawCircle(f, f2, C55298xhM.dp2pxFloat$default(4.0f, null, 1, null), this.values);
        android.graphics.Paint paint2 = this.values;
        int i2 = C52761wXj.Activity.registerUser;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        paint2.setColor(C25382ivf.copydefault(i2, context2));
        canvas.drawCircle(f, f2, C55298xhM.dp2pxFloat$default(2.0f, null, 1, null), this.values);
    }

    private final LineDataSet OLrzqt(java.util.ArrayList<Entry> arrayList) {
        LineDataSet lineDataSet = new LineDataSet(arrayList, "");
        lineDataSet.setFormSize(1.0f);
        lineDataSet.setDrawIcons(false);
        android.content.Context context = getContext();
        if (context != null) {
            lineDataSet.setColor(C25382ivf.copydefault(C52761wXj.Activity.fbC, context));
        }
        lineDataSet.setLineWidth(2.0f);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setFormLineWidth(1.0f);
        lineDataSet.setDrawValues(false);
        android.content.Context context2 = getContext();
        if (context2 != null) {
            lineDataSet.setDrawFilled(true);
            lineDataSet.setFillDrawable(C33070mpX.EZpvd(C22368hdz.StateListAnimator.KWHzl, context2));
        }
        lineDataSet.setDrawVerticalHighlightIndicator(false);
        lineDataSet.setDrawHorizontalHighlightIndicator(false);
        lineDataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
        this.KWHzl = lineDataSet;
        return lineDataSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(boolean z, Highlight highlight) {
        int iCopydefault;
        this.copydefault = z;
        LineDataSet lineDataSet = this.KWHzl;
        if (lineDataSet != null) {
            android.content.Context context = getContext();
            if (context != null) {
                if (z) {
                    iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.fbC, context);
                } else {
                    iCopydefault = C25382ivf.copydefault(C52761wXj.Activity.DcMfJKDcMfJK, context);
                }
                lineDataSet.setColor(iCopydefault);
            }
            lineDataSet.setLineWidth(2.0f);
        }
        highlightValue(highlight, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.isConnected = (int) motionEvent.getRawX();
            this.AkhnZx = (int) motionEvent.getRawY();
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            if (java.lang.Math.abs(motionEvent.getRawX() - this.isConnected) > java.lang.Math.abs(motionEvent.getRawY() - this.AkhnZx)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 3) {
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
