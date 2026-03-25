package o;

import android.graphics.Paint;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wUX extends android.view.View {
    public final android.graphics.Paint KWHzl;
    public final java.util.List<kotlin.Pair<java.lang.Float, java.lang.Integer>> OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wUX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.wUX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wUX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wUX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.KWHzl = paint;
        this.copydefault = C55298xhM.dp$default(1.0f, (android.content.Context) null, 1, (java.lang.Object) null);
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        java.util.List<kotlin.Pair<java.lang.Float, java.lang.Integer>> list = this.OLrzqt;
        if (list.isEmpty()) {
            return;
        }
        float width = getWidth();
        float height = getHeight();
        float f = height / 2;
        this.KWHzl.setColor(((java.lang.Number) ((kotlin.Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getSecond()).intValue());
        canvas.drawArc(0.0f, 0.0f, height, height, 90.0f, 180.0f, false, this.KWHzl);
        float f2 = f;
        for (kotlin.Pair<java.lang.Float, java.lang.Integer> pair : list) {
            float fFloatValue = (width - f) * pair.getFirst().floatValue();
            this.KWHzl.setColor(pair.getSecond().intValue());
            canvas.drawRect(f2, 0.0f, fFloatValue, height, this.KWHzl);
            f2 = fFloatValue + this.copydefault;
        }
        canvas.drawArc(width - height, 0.0f, width, height, 270.0f, 180.0f, false, this.KWHzl);
    }

    public final void OLrzqt(@NotNull java.util.List<ActionBar> list) {
        int i;
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        java.util.List arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (C33129mqd.AEQbTJ(((ActionBar) next).KWHzl(), 0)) {
                arrayList.add(next);
            }
        }
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            arrayList = CollectionsKt___CollectionsKt.gkJEwt(arrayList);
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((ActionBar) it2.next()).KWHzl());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        float fFloatValue = 0.0f;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ActionBar actionBar = (ActionBar) obj;
            fFloatValue = i == yDY.AuCTel(arrayList) ? 1.0f : fFloatValue + actionBar.KWHzl().divide(bigDecimalValueOf, MathContext.DECIMAL64).floatValue();
            this.OLrzqt.add(C56390yDp.OLrzqt(java.lang.Float.valueOf(fFloatValue), java.lang.Integer.valueOf(actionBar.copydefault())));
            i++;
        }
        if (this.OLrzqt.isEmpty()) {
            this.OLrzqt.add(C56390yDp.OLrzqt(java.lang.Float.valueOf(1.0f), java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.UlJrfe))));
        }
        invalidate();
    }

    public static final class ActionBar {
        public final BigDecimal AEQbTJ;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, BigDecimal bigDecimal, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                bigDecimal = actionBar.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(bigDecimal, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BigDecimal KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull BigDecimal bigDecimal, @androidx.annotation.ColorInt int i) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            return new ActionBar(bigDecimal, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ) && this.OLrzqt == actionBar.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DataModel(value=" + this.AEQbTJ + ", color=" + this.OLrzqt + ")";
        }

        public ActionBar(@NotNull BigDecimal bigDecimal, @androidx.annotation.ColorInt int i) {
            Intrinsics.checkNotNullParameter(bigDecimal, "");
            this.AEQbTJ = bigDecimal;
            this.OLrzqt = i;
        }
    }
}
