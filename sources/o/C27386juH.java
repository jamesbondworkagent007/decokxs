package o;

import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C27386juH extends PieChart {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public Application AEQbTJ;
    public final java.util.List<C27390juL> EZpvd;
    public final java.util.List<java.lang.Integer> copydefault;

    /* JADX INFO: renamed from: o.juH$Application */
    public interface Application {
        void AEQbTJ(C27390juL c27390juL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectionCallback(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = application;
    }

    /* JADX INFO: renamed from: o.juH$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.juH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27386juH(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList();
        this.copydefault = new java.util.ArrayList();
        OLrzqt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27386juH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList();
        this.copydefault = new java.util.ArrayList();
        OLrzqt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27386juH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new java.util.ArrayList();
        this.copydefault = new java.util.ArrayList();
        OLrzqt();
    }

    private final void OLrzqt() {
        getDescription().setEnabled(false);
        setHoleRadius(76.0f);
        setTransparentCircleRadius(76.0f);
        setHoleColor(0);
        getLegend().setEnabled(false);
        getDescription().setEnabled(false);
        setOnChartValueSelectedListener(new ActionBar());
        invalidate();
    }

    /* JADX INFO: renamed from: o.juH$ActionBar */
    public static final class ActionBar implements OnChartValueSelectedListener {
        public ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v11, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v6, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r8v9, resolved type: java.util.List<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onValueSelected(Entry entry, Highlight highlight) {
            if (highlight == null) {
                return;
            }
            C27386juH.this.highlightValues(new Highlight[]{highlight});
            C27579jxp.copydefault.AEQbTJ();
            java.lang.Object data = entry != null ? entry.getData() : null;
            C27390juL c27390juL = data instanceof C27390juL ? (C27390juL) data : null;
            int iCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) C27386juH.this.EZpvd, entry != null ? entry.getData() : null);
            if (iCopydefault >= 0) {
                ((PieData) C27386juH.this.getData()).getDataSet().getColors().set(iCopydefault, C27386juH.this.copydefault.get(iCopydefault));
                int size = ((PieData) C27386juH.this.getData()).getDataSet().getColors().size();
                for (int i = 0; i < size; i++) {
                    if (i != iCopydefault) {
                        ((PieData) C27386juH.this.getData()).getDataSet().getColors().set(i, java.lang.Integer.valueOf(C27569jxf.OLrzqt.copydefault(((java.lang.Number) C27386juH.this.copydefault.get(i)).intValue(), 1)));
                    }
                }
                C27386juH.this.invalidate();
            }
            Application application = C27386juH.this.AEQbTJ;
            if (application != null) {
                application.AEQbTJ(c27390juL);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: java.util.List<java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
        public void onNothingSelected() {
            int size = ((PieData) C27386juH.this.getData()).getDataSet().getColors().size();
            for (int i = 0; i < size; i++) {
                ((PieData) C27386juH.this.getData()).getDataSet().getColors().set(i, C27386juH.this.copydefault.get(i));
            }
            C27386juH.this.invalidate();
            Application application = C27386juH.this.AEQbTJ;
            if (application != null) {
                application.AEQbTJ(null);
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.PieRadarChartBase, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float fMin = java.lang.Math.min(width, height);
            float x = motionEvent.getX() - width;
            float y = motionEvent.getY() - height;
            float fSqrt = (float) java.lang.Math.sqrt((x * x) + (y * y));
            if (fSqrt <= (getHoleRadius() / 100.0f) * fMin) {
                return false;
            }
            if (fSqrt <= fMin * 0.9f) {
                return super.onTouchEvent(motionEvent);
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public static /* synthetic */ void setChartData$default(C27386juH c27386juH, java.util.List list, float f, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 76.0f;
        }
        c27386juH.setChartData(list, f);
    }

    public final void setChartData(@NotNull java.util.List<C27390juL> list, float f) {
        Intrinsics.checkNotNullParameter(list, "");
        setHoleRadius(f);
        setTransparentCircleRadius(f);
        this.EZpvd.clear();
        this.EZpvd.addAll(list);
        java.util.Iterator<T> it = list.iterator();
        double dAEQbTJ = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dAEQbTJ += C33129mqd.AEQbTJ(java.lang.Float.valueOf(java.lang.Math.abs(((C27390juL) it.next()).AEQbTJ())));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C27390juL c27390juL : list) {
            arrayList.add(new PieEntry(C33129mqd.djBIcL(java.lang.Double.valueOf((((double) java.lang.Math.abs(c27390juL.AEQbTJ())) / dAEQbTJ) * ((double) 100.0f))), c27390juL));
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(ContextCompat.getColor(getContext(), ((C27390juL) it2.next()).KWHzl())));
        }
        this.copydefault.clear();
        this.copydefault.addAll(arrayList2);
        pieDataSet.setColors(arrayList2);
        pieDataSet.setSliceSpace(2.0f);
        pieDataSet.setDrawValues(false);
        pieDataSet.setSelectionShift(2.0f);
        setData(new PieData(pieDataSet));
        highlightValues(null);
        animateX(300, Easing.EaseInOutQuad);
        invalidate();
    }
}
