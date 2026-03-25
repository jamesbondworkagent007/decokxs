package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC53802wsP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wPf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52541wPf extends RecyclerView.ItemDecoration {
    public final float AEQbTJ;
    public final android.graphics.Rect AYXKKw;
    public final Function0<C53803wsQ> AhwBna;
    public final float EZpvd;
    public final float KWHzl;
    public final float OLrzqt;
    public final android.graphics.Paint copydefault;
    public final Function0<java.lang.Integer> djBIcL;
    public final android.graphics.Path gEmmrt;
    public final android.graphics.Paint valueOf;

    public C52541wPf(@NotNull Function0<C53803wsQ> function0, @NotNull Function0<java.lang.Integer> function02) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        this.AhwBna = function0;
        this.djBIcL = function02;
        this.gEmmrt = new android.graphics.Path();
        this.AYXKKw = new android.graphics.Rect();
        this.OLrzqt = C55298xhM.dp$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        this.AEQbTJ = C55298xhM.dp$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.copydefault = paint;
        this.KWHzl = C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
        this.EZpvd = C55298xhM.dp$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(C55298xhM.dp$default(1, (android.content.Context) null, 1, (java.lang.Object) null));
        this.valueOf = paint2;
    }

    public final void KWHzl(android.graphics.Canvas canvas, float f, float f2, float f3, @androidx.annotation.ColorInt int i, boolean z) {
        this.valueOf.setColor(i);
        if (f3 > f2) {
            if (z) {
                this.gEmmrt.reset();
                this.gEmmrt.moveTo(f, f2);
                this.gEmmrt.lineTo(f, f3);
                this.valueOf.setPathEffect(new DashPathEffect(new float[]{this.KWHzl, this.EZpvd}, 0.0f));
                canvas.drawPath(this.gEmmrt, this.valueOf);
                return;
            }
            this.valueOf.setPathEffect(null);
            canvas.drawLine(f, f2, f, f3, this.valueOf);
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, float f, float f2, @androidx.annotation.ColorInt int i, android.graphics.drawable.Drawable drawable) {
        kotlin.Pair pairOLrzqt;
        this.copydefault.setColor(i);
        canvas.drawCircle(f, f2, this.OLrzqt, this.copydefault);
        if (drawable != null) {
            float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(drawable.getIntrinsicWidth()));
            float fDjBIcL2 = C33129mqd.djBIcL(java.lang.Integer.valueOf(drawable.getIntrinsicHeight()));
            if (fDjBIcL <= 0.0f || fDjBIcL2 <= 0.0f) {
                pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(this.AEQbTJ), java.lang.Float.valueOf(this.AEQbTJ));
            } else {
                float f3 = this.AEQbTJ;
                if (fDjBIcL <= f3 && fDjBIcL2 <= f3) {
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(fDjBIcL), java.lang.Float.valueOf(fDjBIcL2));
                } else {
                    float fMin = java.lang.Math.min(f3 / fDjBIcL, f3 / fDjBIcL2);
                    pairOLrzqt = C56390yDp.OLrzqt(java.lang.Float.valueOf(fDjBIcL * fMin), java.lang.Float.valueOf(fDjBIcL2 * fMin));
                }
            }
            float fFloatValue = ((java.lang.Number) pairOLrzqt.component1()).floatValue();
            float fFloatValue2 = ((java.lang.Number) pairOLrzqt.component2()).floatValue();
            float f4 = 2;
            float f5 = f - (fFloatValue / f4);
            float f6 = f2 - (fFloatValue2 / f4);
            this.AYXKKw.set(yII.EZpvd(f5), yII.EZpvd(f6), yII.EZpvd(f5 + fFloatValue), yII.EZpvd(f6 + fFloatValue2));
            drawable.setBounds(this.AYXKKw);
            drawable.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && childAdapterPosition == this.djBIcL.invoke().intValue()) {
            rect.top = (int) C55298xhM.dp$default(24, (android.content.Context) null, 1, (java.lang.Object) null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        int childAdapterPosition;
        android.view.View view;
        int i;
        int i2;
        java.lang.String str;
        C53803wsQ c53803wsQ;
        RecyclerView.LayoutParams layoutParams;
        AbstractC53802wsP abstractC53802wsP;
        int i3;
        int i4;
        RecyclerView recyclerView2 = recyclerView;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView2, "");
        Intrinsics.checkNotNullParameter(state, "");
        int iSave = canvas.save();
        try {
            C53803wsQ c53803wsQInvoke = this.AhwBna.invoke();
            int iIntValue = this.djBIcL.invoke().intValue();
            float paddingLeft = recyclerView.getPaddingLeft() + this.OLrzqt;
            int itemCount = c53803wsQInvoke.getItemCount();
            int childCount = recyclerView.getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                android.view.View childAt = recyclerView2.getChildAt(i5);
                if (childAt == null || (childAdapterPosition = recyclerView2.getChildAdapterPosition(childAt)) == -1 || childAdapterPosition < iIntValue) {
                    i = i5;
                    i4 = childCount;
                    str = str2;
                    c53803wsQ = c53803wsQInvoke;
                } else {
                    int i6 = childAdapterPosition - iIntValue;
                    java.util.List<AbstractC53802wsP> currentList = c53803wsQInvoke.getCurrentList();
                    Intrinsics.checkNotNullExpressionValue(currentList, str2);
                    AbstractC53802wsP abstractC53802wsP2 = (AbstractC53802wsP) CollectionsKt___CollectionsKt.AkhnZx(currentList, i6);
                    if (abstractC53802wsP2 == null) {
                        i = i5;
                        i4 = childCount;
                        str = str2;
                        c53803wsQ = c53803wsQInvoke;
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                        Intrinsics.copydefault(layoutParams2, str2);
                        RecyclerView.LayoutParams layoutParams3 = (RecyclerView.LayoutParams) layoutParams2;
                        float top = this.OLrzqt + childAt.getTop();
                        if (abstractC53802wsP2 instanceof AbstractC53802wsP.Application) {
                            i2 = childCount;
                            layoutParams = layoutParams3;
                            str = str2;
                            abstractC53802wsP = abstractC53802wsP2;
                            c53803wsQ = c53803wsQInvoke;
                            i3 = i6;
                            view = childAt;
                            i = i5;
                            AEQbTJ(canvas, paddingLeft, top, ((AbstractC53802wsP.Application) abstractC53802wsP2).KWHzl(), ((AbstractC53802wsP.Application) abstractC53802wsP2).AEQbTJ());
                        } else {
                            view = childAt;
                            i = i5;
                            i2 = childCount;
                            str = str2;
                            c53803wsQ = c53803wsQInvoke;
                            layoutParams = layoutParams3;
                            abstractC53802wsP = abstractC53802wsP2;
                            i3 = i6;
                        }
                        float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(view.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        boolean z = true;
                        if (i3 == itemCount - 1) {
                            z = false;
                        }
                        if ((abstractC53802wsP instanceof AbstractC53802wsP.Application) && z) {
                            float f = top + this.OLrzqt;
                            i4 = i2;
                            KWHzl(canvas, paddingLeft, f, fDjBIcL, ((AbstractC53802wsP.Application) abstractC53802wsP).djBIcL(), ((AbstractC53802wsP.Application) abstractC53802wsP).values());
                        } else {
                            i4 = i2;
                            if (abstractC53802wsP instanceof AbstractC53802wsP.Activity) {
                                float fDjBIcL2 = C33129mqd.djBIcL(java.lang.Integer.valueOf(view.getTop()));
                                if (!z) {
                                    fDjBIcL = view.getTop() + ((view.getBottom() - view.getTop()) / 2.0f);
                                }
                                KWHzl(canvas, paddingLeft, fDjBIcL2, fDjBIcL, ((AbstractC53802wsP.Activity) abstractC53802wsP).KWHzl(), ((AbstractC53802wsP.Activity) abstractC53802wsP).gEmmrt());
                            }
                        }
                    }
                }
                i5 = i + 1;
                childCount = i4;
                str2 = str;
                c53803wsQInvoke = c53803wsQ;
                recyclerView2 = recyclerView;
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
