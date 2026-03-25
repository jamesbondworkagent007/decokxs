package o;

import android.graphics.Paint;
import android.graphics.RectF;
import com.okinc.unify_trade.bot.data.DistributeItem;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53195wgs extends android.view.View {
    public int AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> OLrzqt;
    public float copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53195wgs(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53195wgs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxShow(int i) {
        this.AEQbTJ = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.wgs.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53195wgs(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53195wgs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53195wgs.OLrzqt();
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53195wgs.copydefault();
            }
        });
        this.OLrzqt = new java.util.ArrayList();
        this.copydefault = C55298xhM.dp2pxFloat$default(4.375f, null, 1, null);
        this.AEQbTJ = 3;
    }

    private final android.graphics.Paint valueOf() {
        return (android.graphics.Paint) this.EZpvd.getValue();
    }

    public static final android.graphics.Paint OLrzqt() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        return paint;
    }

    private final RectF AhwBna() {
        return (RectF) this.KWHzl.getValue();
    }

    public static final RectF copydefault() {
        return new RectF();
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        canvas.rotate(-90.0f, measuredWidth, measuredHeight);
        valueOf().setStyle(Paint.Style.STROKE);
        android.graphics.Paint paintValueOf = valueOf();
        float measuredWidth2 = this.copydefault;
        if (measuredWidth2 <= 0.0f) {
            measuredWidth2 = getMeasuredWidth() / 4.0f;
            this.copydefault = measuredWidth2;
        }
        paintValueOf.setStrokeWidth(measuredWidth2);
        RectF rectFAhwBna = AhwBna();
        float f = 2;
        float f2 = this.copydefault / f;
        rectFAhwBna.set(f2, f2, getMeasuredWidth() - (this.copydefault / f), getMeasuredHeight() - (this.copydefault / f));
        java.util.Iterator<T> it = this.OLrzqt.iterator();
        float f3 = 1.0f;
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            RectF rectFAhwBna2 = AhwBna();
            float f4 = this.copydefault / f;
            rectFAhwBna2.set(f4, f4, getMeasuredWidth() - (this.copydefault / f), getMeasuredHeight() - (this.copydefault / f));
            valueOf().setColor(((java.lang.Number) pair.getFirst()).intValue());
            float fFloatValue = 360 * (((java.lang.Number) pair.getSecond()).floatValue() / KWHzl());
            canvas.drawArc(AhwBna(), f3, fFloatValue, false, valueOf());
            f3 += fFloatValue;
        }
        canvas.rotate(90.0f, measuredWidth, measuredHeight);
    }

    public final C53195wgs OLrzqt(@NotNull java.util.List<DistributeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        for (DistributeItem distributeItem : list) {
            this.OLrzqt.add(C56390yDp.OLrzqt(java.lang.Integer.valueOf(distributeItem.getColor()), java.lang.Integer.valueOf(distributeItem.getCoinNum())));
        }
        invalidate();
        return this;
    }

    public final float KWHzl() {
        java.util.List<kotlin.Pair<java.lang.Integer, java.lang.Integer>> list = this.OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, C56402yEa.EZpvd(((kotlin.Pair) it.next()).getSecond()));
        }
        return CollectionsKt___CollectionsKt.RlQdEF(arrayList);
    }
}
