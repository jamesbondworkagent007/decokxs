package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewGroupKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oHk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35888oHk extends LinearLayoutCompat {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public float EZpvd;
    public double KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35888oHk(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35888oHk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:24) call: o.oHk.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C35888oHk(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35888oHk(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 0.65d;
        this.EZpvd = 280.0f;
    }

    /* JADX INFO: renamed from: o.oHk$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oHk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void setMaxWidthPercent(double d) {
        this.KWHzl = d;
        requestLayout();
    }

    public final void setMaxWidthDp(float f) {
        this.EZpvd = f;
        requestLayout();
    }

    private final int copydefault() {
        android.content.res.Resources resources = getContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return yII.EZpvd(((double) C55302xhQ.EZpvd(resources)) * this.KWHzl);
    }

    private final int EZpvd() {
        float f = this.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return C55298xhM.copydefault(f, context);
    }

    public final int OLrzqt(android.view.View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public final int copydefault(android.view.View view) {
        return view.getMeasuredWidth() + OLrzqt(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
    }

    public final int KWHzl(int i) {
        int iMin = java.lang.Math.min(copydefault(), EZpvd());
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        pUU.EZpvd("MatchWidestWidthLinearLayout", "originalSize=" + size + ", originalMode:" + mode + ", maxWidth:" + iMin);
        if (size > iMin) {
            return View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(size, iMin), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        java.lang.Integer num;
        int iKWHzl = KWHzl(i);
        pUU.EZpvd("MatchWidestWidthLinearLayout", "=== onMeasure called ===");
        pUU.EZpvd("MatchWidestWidthLinearLayout", "isMeasuring: " + this.AEQbTJ + ", orientation: " + getOrientation());
        if (this.AEQbTJ || getOrientation() != 1 || Intrinsics.EZpvd(getTag(), (java.lang.Object) "transitioning")) {
            super.onMeasure(iKWHzl, i2);
            return;
        }
        this.AEQbTJ = true;
        try {
            Sequence<android.view.View> sequenceDbNXlk = C59467zhb.DbNXlk(ViewGroupKt.getChildren(this), new Function1() { // from class: o.oHl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(C35888oHk.EZpvd((android.view.View) obj));
                }
            });
            int iUzCIH = C59467zhb.uzCIH(sequenceDbNXlk);
            pUU.EZpvd("MatchWidestWidthLinearLayout", "Total children: " + getChildCount() + ", Visible: " + iUzCIH);
            java.util.Iterator it = sequenceDbNXlk.iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setMinimumWidth(0);
            }
            super.onMeasure(iKWHzl, i2);
            if (C34703nhO.AhwBna(getContext())) {
                int i3 = 0;
                for (java.lang.Object obj : sequenceDbNXlk) {
                    if (i3 < 0) {
                        yDY.AYXKKw();
                    }
                    android.view.View view = (android.view.View) obj;
                    pUU.EZpvd("MatchWidestWidthLinearLayout", "Child " + i3 + ": measuredWidth=" + view.getMeasuredWidth() + ", totalWidth=" + copydefault(view));
                    i3++;
                }
            }
            java.util.Iterator it2 = sequenceDbNXlk.iterator();
            if (it2.hasNext()) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(copydefault((android.view.View) it2.next()));
                while (it2.hasNext()) {
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(copydefault((android.view.View) it2.next()));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                pUU.EZpvd("MatchWidestWidthLinearLayout", "Max total width: " + iIntValue);
                boolean z = false;
                for (android.view.View view2 : sequenceDbNXlk) {
                    int iOLrzqt = iIntValue - OLrzqt(view2);
                    pUU.EZpvd("MatchWidestWidthLinearLayout", "Child " + view2.getClass().getSimpleName() + ": targetMinWidth=" + iOLrzqt + ", currentMeasured=" + view2.getMeasuredWidth());
                    if (iOLrzqt > view2.getMeasuredWidth()) {
                        view2.setMinimumWidth(iOLrzqt);
                        pUU.EZpvd("MatchWidestWidthLinearLayout", "Set minimumWidth to " + iOLrzqt + " for " + view2.getClass().getSimpleName());
                        z = true;
                    }
                }
                pUU.EZpvd("MatchWidestWidthLinearLayout", "Needs remeasure: " + z);
                if (z) {
                    super.onMeasure(iKWHzl, i2);
                }
            }
        } finally {
            this.AEQbTJ = false;
            pUU.EZpvd("MatchWidestWidthLinearLayout", "=== onMeasure finished ===");
        }
    }

    public static final boolean EZpvd(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return view.getVisibility() == 0;
    }
}
