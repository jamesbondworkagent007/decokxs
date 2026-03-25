package o;

import android.graphics.Paint;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.son, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45386son extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final int AYXKKw;
    public final android.graphics.Paint AhwBna;
    public final android.graphics.Paint AkhnZx;
    public final android.content.Context EZpvd;
    public final int KWHzl;
    public final float OLrzqt;
    public final android.graphics.Paint copydefault;
    public final int djBIcL;
    public final float gEmmrt;
    public final float valueOf;
    public final int values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (r10v0 android.content.Context)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] o.wXj.LoaderManager.sSMYrx int) : (r11v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] o.wXj.Activity.htlTjW int) : (r12v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: INVOKE (12.0f float), (null android.content.Context), (1 int), (null java.lang.Object) STATIC call: o.xhM.dp2pxFloat$default(float, android.content.Context, int, java.lang.Object):float A[MD:(float, android.content.Context, int, java.lang.Object):float (m), WRAPPED] (LINE:32)) : (r13v0 float))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0020: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: SGET  A[WRAPPED] o.wXj.Activity.QHmsKR int) : (r14v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0028: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: SGET  A[WRAPPED] o.wXj.Activity.zuBGHE int) : (r15v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0030: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0038: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r17v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0041: ARITH (r19v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r18v0 float) : (0.0f float))
 A[MD:(android.content.Context, int, int, float, int, int, int, float, float):void (m)] (LINE:25) call: o.son.<init>(android.content.Context, int, int, float, int, int, int, float, float):void type: THIS */
    public /* synthetic */ C45386son(android.content.Context context, int i, int i2, float f, int i3, int i4, int i5, float f2, float f3, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i6 & 2) != 0 ? C52761wXj.LoaderManager.sSMYrx : i, (i6 & 4) != 0 ? C52761wXj.Activity.htlTjW : i2, (i6 & 8) != 0 ? C55298xhM.dp2pxFloat$default(12.0f, null, 1, null) : f, (i6 & 16) != 0 ? C52761wXj.Activity.QHmsKR : i3, (i6 & 32) != 0 ? C52761wXj.Activity.zuBGHE : i4, (i6 & 64) != 0 ? 0 : i5, (i6 & 128) != 0 ? 0.0f : f2, (i6 & 256) == 0 ? f3 : 0.0f);
    }

    public C45386son(@NotNull android.content.Context context, @androidx.annotation.StyleRes int i, @androidx.annotation.ColorRes int i2, @androidx.annotation.Dimension float f, @androidx.annotation.ColorRes int i3, @androidx.annotation.ColorRes int i4, int i5, float f2, float f3) {
        android.graphics.Typeface font;
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = context;
        this.values = i;
        this.AYXKKw = i2;
        this.OLrzqt = f;
        this.KWHzl = i3;
        this.AEQbTJ = i4;
        this.djBIcL = i5;
        this.valueOf = f2;
        this.gEmmrt = f3;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(C33070mpX.copydefault(i3));
        this.copydefault = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setColor(C33070mpX.copydefault(i4));
        paint2.setStrokeWidth(C55298xhM.dp2pxFloat$default(1.0f, null, 1, null));
        this.AhwBna = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint(1);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{android.R.attr.fontFamily, android.R.attr.textSize, C32113mPz.Application.copydefault});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            Result.Application application = Result.Companion;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(0, 0));
            java.lang.Integer num = java.lang.Boolean.valueOf(numValueOf.intValue() != 0).booleanValue() ? numValueOf : null;
            paint3.setTypeface((num == null || (font = ResourcesCompat.getFont(context, num.intValue())) == null) ? ResourcesCompat.getFont(context, C52761wXj.Dialog.EZpvd) : font);
            int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.iZzfmt);
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                iOLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iOLrzqt);
            } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
                iOLrzqt = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, iOLrzqt);
            }
            paint3.setTextSize(iOLrzqt);
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setColor(C33070mpX.copydefault(this.AYXKKw));
        typedArrayObtainStyledAttributes.recycle();
        this.AkhnZx = paint3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(recyclerView).iterator();
        while (it.hasNext()) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(it.next());
            float f = this.valueOf + this.OLrzqt;
            float top = r0.getTop() + this.gEmmrt + this.OLrzqt;
            float fDescent = (this.AkhnZx.descent() + this.AkhnZx.ascent()) / 2;
            if (childAdapterPosition > 0) {
                canvas.drawLine(f, r0.getTop(), f, top, this.AhwBna);
            }
            if (childAdapterPosition < (recyclerView.getAdapter() != null ? r4.getItemCount() - 1 : 0)) {
                canvas.drawLine(f, top, f, r0.getBottom(), this.AhwBna);
            }
            canvas.drawCircle(f, top, this.OLrzqt, this.copydefault);
            canvas.drawText(java.lang.String.valueOf(childAdapterPosition + 1), f, top - fDescent, this.AkhnZx);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        rect.set(this.djBIcL, 0, 0, 0);
    }
}
