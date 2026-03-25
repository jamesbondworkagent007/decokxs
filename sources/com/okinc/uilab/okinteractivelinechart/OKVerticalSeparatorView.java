package com.okinc.uilab.okinteractivelinechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.internal.view.SupportMenu;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.C55298xhM;
import o.C55386xiv;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OKVerticalSeparatorView extends View {
    public Insets AEQbTJ;
    public final Paint AYXKKw;
    public final Paint AhwBna;
    public StateListAnimator EZpvd;
    public final Paint KWHzl;
    public LineStyle OLrzqt;
    public final StateListAnimator copydefault;
    public PointF djBIcL;
    public final Paint gEmmrt;
    public final Paint valueOf;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LineStyle.values().length];
            try {
                iArr[LineStyle.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LineStyle.Solid.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LineStyle.Dashed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKVerticalSeparatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OKVerticalSeparatorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setColorScheme(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.EZpvd = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFocusLineInsets(@NotNull Insets insets) {
        Intrinsics.checkNotNullParameter(insets, "");
        this.AEQbTJ = insets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLineStyle(@NotNull LineStyle lineStyle) {
        Intrinsics.checkNotNullParameter(lineStyle, "");
        this.OLrzqt = lineStyle;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ OKVerticalSeparatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKVerticalSeparatorView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        StateListAnimator stateListAnimator = new StateListAnimator(ContextCompat.getColor(context, C55386xiv.ActionBar.KWHzl), ContextCompat.getColor(context, C52761wXj.Activity.ORxRYg), ContextCompat.getColor(context, C52761wXj.Activity.htlTjW), -16711936, SupportMenu.CATEGORY_MASK);
        this.copydefault = stateListAnimator;
        this.EZpvd = stateListAnimator;
        this.OLrzqt = LineStyle.Dashed;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.AYXKKw = paint;
        Paint paint2 = new Paint();
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(C55298xhM.EZpvd(1.0f, context));
        paint2.setPathEffect(new DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
        this.KWHzl = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style2);
        paint3.setStrokeWidth(C55298xhM.EZpvd(1.0f, context));
        this.valueOf = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style);
        this.AhwBna = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(style);
        this.gEmmrt = paint5;
        Insets insetsOf = Insets.of(0, 0, 0, 0);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "");
        this.AEQbTJ = insetsOf;
        setColorScheme(stateListAnimator);
        if (isInEditMode()) {
            KWHzl();
        }
    }

    public final void setMarker(@NotNull PointF pointF, boolean z) {
        Intrinsics.checkNotNullParameter(pointF, "");
        this.djBIcL = pointF;
        AEQbTJ(z);
        invalidate();
    }

    public final void KWHzl() {
        this.djBIcL = null;
        invalidate();
    }

    public final void AEQbTJ(boolean z) {
        int iCopydefault;
        this.AYXKKw.setColor(this.EZpvd.AEQbTJ());
        this.KWHzl.setColor(this.EZpvd.EZpvd());
        this.valueOf.setColor(this.EZpvd.EZpvd());
        this.gEmmrt.setColor(this.EZpvd.OLrzqt());
        Paint paint = this.AhwBna;
        if (z) {
            iCopydefault = this.EZpvd.KWHzl();
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            iCopydefault = this.EZpvd.copydefault();
        }
        paint.setColor(iCopydefault);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        PointF pointF = this.djBIcL;
        if (pointF != null) {
            canvas.drawRect(pointF.x, 0.0f, getWidth(), getHeight(), this.AYXKKw);
            Paint paintEZpvd = EZpvd();
            if (paintEZpvd != null) {
                canvas.drawLine(pointF.x, getPaddingTop() + this.AEQbTJ.top, pointF.x, (getHeight() - getPaddingBottom()) - this.AEQbTJ.bottom, paintEZpvd);
            }
            float f = pointF.x;
            float paddingTop = getPaddingTop();
            float f2 = pointF.y;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            canvas.drawCircle(f, paddingTop + f2, C55298xhM.EZpvd(3.0f, context), this.gEmmrt);
            float f3 = pointF.x;
            float paddingTop2 = getPaddingTop();
            float f4 = pointF.y;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            canvas.drawCircle(f3, paddingTop2 + f4, C55298xhM.EZpvd(2.0f, context2), this.AhwBna);
        }
    }

    private final Paint EZpvd() {
        int i = ActionBar.EZpvd[this.OLrzqt.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return this.valueOf;
        }
        if (i == 3) {
            return this.KWHzl;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final class StateListAnimator {
        public final int AEQbTJ;
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                i = stateListAnimator.KWHzl;
            }
            if ((i6 & 2) != 0) {
                i2 = stateListAnimator.OLrzqt;
            }
            int i7 = i2;
            if ((i6 & 4) != 0) {
                i3 = stateListAnimator.copydefault;
            }
            int i8 = i3;
            if ((i6 & 8) != 0) {
                i4 = stateListAnimator.EZpvd;
            }
            int i9 = i4;
            if ((i6 & 16) != 0) {
                i5 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(i, i7, i8, i9, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(int i, int i2, int i3, int i4, int i5) {
            return new StateListAnimator(i, i2, i3, i4, i5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.KWHzl == stateListAnimator.KWHzl && this.OLrzqt == stateListAnimator.OLrzqt && this.copydefault == stateListAnimator.copydefault && this.EZpvd == stateListAnimator.EZpvd && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((Integer.hashCode(this.KWHzl) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + Integer.hashCode(this.copydefault)) * 31) + Integer.hashCode(this.EZpvd)) * 31) + Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ColorScheme(touchMaskColor=" + this.KWHzl + ", touchSeparatorColor=" + this.OLrzqt + ", touchFocusDotBorderColor=" + this.copydefault + ", touchFocusDotRiseColor=" + this.EZpvd + ", touchFocusDotFallColor=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(int i, int i2, int i3, int i4, int i5) {
            this.KWHzl = i;
            this.OLrzqt = i2;
            this.copydefault = i3;
            this.EZpvd = i4;
            this.AEQbTJ = i5;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineStyle {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LineStyle[] $VALUES;
        public static final LineStyle Solid = new LineStyle("Solid", 0);
        public static final LineStyle Dashed = new LineStyle("Dashed", 1);
        public static final LineStyle None = new LineStyle("None", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LineStyle[] $values() {
            return new LineStyle[]{Solid, Dashed, None};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LineStyle> getEntries() {
            return $ENTRIES;
        }

        private LineStyle(String str, int i) {
        }

        static {
            LineStyle[] lineStyleArr$values = $values();
            $VALUES = lineStyleArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(lineStyleArr$values);
        }

        public static LineStyle valueOf(String str) {
            return (LineStyle) Enum.valueOf(LineStyle.class, str);
        }

        public static LineStyle[] values() {
            return (LineStyle[]) $VALUES.clone();
        }
    }
}
