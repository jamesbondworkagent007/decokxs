package o;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55418xja {
    public static final boolean AEQbTJ(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    public static final void KWHzl(@NotNull android.view.View view, @NotNull C55363xiY c55363xiY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c55363xiY, "");
        view.setTag(C52761wXj.FragmentManager.DrqXHJ, c55363xiY);
    }

    public static final void AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl(view, true);
    }

    public static final void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl(view, false);
    }

    public static final int OLrzqt(int i) {
        return yII.EZpvd(i * android.content.res.Resources.getSystem().getDisplayMetrics().density);
    }

    public static final void copydefault(android.view.View view, boolean z) {
        if (!z) {
            copydefault(view);
            return;
        }
        java.lang.Object tag = view.getTag(C52761wXj.FragmentManager.DrqXHJ);
        C55363xiY c55363xiY = tag instanceof C55363xiY ? (C55363xiY) tag : null;
        if (c55363xiY == null) {
            throw new java.lang.IllegalArgumentException("RecyclerView attributes must be provided.");
        }
        if (c55363xiY.OLrzqt() == null) {
            throw new java.lang.IllegalArgumentException("RecyclerView layout orientation must be provided.".toString());
        }
        java.lang.Integer numAEQbTJ = c55363xiY.AEQbTJ();
        int iIntValue = numAEQbTJ != null ? numAEQbTJ.intValue() : C52761wXj.Fragment.fIwbmz;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(c55363xiY.EZpvd());
        java.lang.Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
        int iIntValue2 = num != null ? num.intValue() : 4;
        Intrinsics.copydefault(view, "");
        RecyclerView recyclerView = (RecyclerView) view;
        view.setTag(C52761wXj.FragmentManager.QfJbVf, recyclerView.getAdapter());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new java.lang.IllegalArgumentException("Only LinearLayoutManager is supported.");
        }
        view.setTag(C52761wXj.FragmentManager.YqksP, layoutManager);
        recyclerView.setAdapter(new C55364xiZ(iIntValue2, z, iIntValue));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(c55363xiY.OLrzqt().booleanValue() ? 1 : 0);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb A[LOOP:1: B:95:0x01b9->B:96:0x01bb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(final android.view.View view) {
        float fOLrzqt;
        java.lang.Integer intOrNull;
        int iOLrzqt;
        boolean z = (view.getResources().getConfiguration().uiMode & 48) == 32;
        java.lang.Object tag = view.getTag(C52761wXj.FragmentManager.DrqXHJ);
        C55363xiY c55363xiY = tag instanceof C55363xiY ? (C55363xiY) tag : null;
        boolean zKWHzl = c55363xiY != null ? c55363xiY.KWHzl() : false;
        int i = (z || zKWHzl) ? -13092808 : -789517;
        int i2 = (z || zKWHzl) ? -14013910 : -592138;
        int i3 = (z || zKWHzl) ? -14935012 : -394759;
        int i4 = (z || zKWHzl) ? -14013910 : -592138;
        view.setTag(C52761wXj.FragmentManager.DUUtXg, view.getBackground());
        view.setBackground(new ColorDrawable(0));
        java.lang.Object tag2 = view.getTag(C52761wXj.FragmentManager.DrqXHJ);
        C55363xiY c55363xiY2 = tag2 instanceof C55363xiY ? (C55363xiY) tag2 : null;
        if (c55363xiY2 != null && c55363xiY2.djBIcL()) {
            view.setTag(C52761wXj.FragmentManager.DGUQLIhJrIAr, java.lang.Integer.valueOf(view.getVisibility()));
            view.setVisibility(8);
            return;
        }
        if (c55363xiY2 != null && c55363xiY2.AYXKKw()) {
            view.setTag(C52761wXj.FragmentManager.DGUQLIhJrIAr, java.lang.Integer.valueOf(view.getVisibility()));
            view.setVisibility(4);
            return;
        }
        if (c55363xiY2 != null && c55363xiY2.isConnected()) {
            if (c55363xiY2.AhwBna() == null || c55363xiY2.valueOf() == null) {
                throw new java.lang.IllegalArgumentException("Shimmer height and width must be provided if isShimmeredImmediately is on.");
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    android.view.View childAt = viewGroup.getChildAt(i5);
                    childAt.setTag(C52761wXj.FragmentManager.DIIpTV, java.lang.Integer.valueOf(childAt.getVisibility()));
                    childAt.setVisibility(4);
                }
            }
            view.setTag(C52761wXj.FragmentManager.frkDMe, java.lang.Integer.valueOf(view.getLayoutParams().width));
            view.setTag(C52761wXj.FragmentManager.dzCpvv, java.lang.Integer.valueOf(view.getLayoutParams().height));
            view.getLayoutParams().width = OLrzqt(c55363xiY2.valueOf().intValue());
            view.getLayoutParams().height = OLrzqt(c55363xiY2.AhwBna().intValue());
        }
        if (c55363xiY2 == null || !c55363xiY2.gEmmrt()) {
            if ((c55363xiY2 != null ? c55363xiY2.copydefault() : null) == null) {
                java.lang.Object tag3 = view.getTag();
                if ((tag3 instanceof java.lang.String ? (java.lang.String) tag3 : null) != null) {
                    java.lang.Object tag4 = view.getTag();
                    Intrinsics.copydefault(tag4, "");
                    java.lang.String str = (java.lang.String) tag4;
                    if ((true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) && C59449zhJ.startsWith$default(str, "radius_", false, 2, null) && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(StringsKt__StringsKt.substringAfter$default(str, "radius_", (java.lang.String) null, 2, (java.lang.Object) null))) != null) {
                        iOLrzqt = OLrzqt(intOrNull.intValue());
                    } else {
                        fOLrzqt = OLrzqt(view);
                    }
                } else {
                    fOLrzqt = OLrzqt(view);
                }
                float[] fArr = new float[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    fArr[i6] = fOLrzqt;
                }
                final ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.getPaint().setColor(i);
                shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
                shapeDrawable.getPaint().setAlpha(255);
                view.setForeground(new InsetDrawable((android.graphics.drawable.Drawable) shapeDrawable, 0, 0, 0, 0));
                android.animation.ValueAnimator valueAnimatorOfObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
                valueAnimatorOfObject.setDuration(500L);
                valueAnimatorOfObject.setRepeatCount(-1);
                valueAnimatorOfObject.setRepeatMode(2);
                valueAnimatorOfObject.setInterpolator(new android.view.animation.PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
                valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xjb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        C55418xja.OLrzqt(shapeDrawable, view, valueAnimator);
                    }
                });
                valueAnimatorOfObject.start();
                view.setOnTouchListener(new View.OnTouchListener() { // from class: o.xje
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                        return C55418xja.AEQbTJ(view2, motionEvent);
                    }
                });
                view.setTag(C52761wXj.FragmentManager.DGUQLIdZmdUa, valueAnimatorOfObject);
                View.OnAttachStateChangeListener application = new Application();
                view.addOnAttachStateChangeListener(application);
                view.setTag(C52761wXj.FragmentManager.fBE, application);
            }
            iOLrzqt = OLrzqt(c55363xiY2.copydefault().intValue());
        } else {
            java.lang.Integer numCopydefault = c55363xiY2.copydefault();
            if (numCopydefault != null) {
                iOLrzqt = OLrzqt(numCopydefault.intValue());
            } else {
                throw new java.lang.IllegalArgumentException("Shimmer corner radius must be provided if isCircleImage is on.");
            }
        }
        fOLrzqt = iOLrzqt;
        float[] fArr2 = new float[8];
        while (i6 < 8) {
        }
        final ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr2, null, null));
        shapeDrawable2.getPaint().setColor(i);
        shapeDrawable2.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable2.getPaint().setAlpha(255);
        view.setForeground(new InsetDrawable((android.graphics.drawable.Drawable) shapeDrawable2, 0, 0, 0, 0));
        android.animation.ValueAnimator valueAnimatorOfObject2 = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4));
        valueAnimatorOfObject2.setDuration(500L);
        valueAnimatorOfObject2.setRepeatCount(-1);
        valueAnimatorOfObject2.setRepeatMode(2);
        valueAnimatorOfObject2.setInterpolator(new android.view.animation.PathInterpolator(0.25f, 0.1f, 0.25f, 1.0f));
        valueAnimatorOfObject2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xjb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C55418xja.OLrzqt(shapeDrawable2, view, valueAnimator);
            }
        });
        valueAnimatorOfObject2.start();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: o.xje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return C55418xja.AEQbTJ(view2, motionEvent);
            }
        });
        view.setTag(C52761wXj.FragmentManager.DGUQLIdZmdUa, valueAnimatorOfObject2);
        View.OnAttachStateChangeListener application2 = new Application();
        view.addOnAttachStateChangeListener(application2);
        view.setTag(C52761wXj.FragmentManager.fBE, application2);
    }

    public static final void OLrzqt(ShapeDrawable shapeDrawable, android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        shapeDrawable.getPaint().setColor(((java.lang.Integer) animatedValue).intValue());
        view.invalidate();
    }

    /* JADX INFO: renamed from: o.xja$Application */
    public static final class Application implements View.OnAttachStateChangeListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C55418xja.EZpvd(view);
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public static final void copydefault(android.view.View view) {
        java.lang.Object tag = view.getTag(C52761wXj.FragmentManager.DGUQLIdZmdUa);
        if (tag != null) {
            ((android.animation.ValueAnimator) tag).cancel();
        }
        java.lang.Object tag2 = view.getTag(C52761wXj.FragmentManager.DGUQLIhJrIAr);
        if (tag2 != null) {
            view.setVisibility(((java.lang.Integer) tag2).intValue());
        }
        java.lang.Object tag3 = view.getTag(C52761wXj.FragmentManager.DUUtXg);
        if (tag3 != null) {
            view.setBackground((android.graphics.drawable.Drawable) tag3);
        }
        java.lang.Object tag4 = view.getTag(C52761wXj.FragmentManager.frkDMe);
        if (tag4 != null) {
            view.getLayoutParams().width = ((java.lang.Integer) tag4).intValue();
        }
        java.lang.Object tag5 = view.getTag(C52761wXj.FragmentManager.dzCpvv);
        if (tag5 != null) {
            view.getLayoutParams().height = ((java.lang.Integer) tag5).intValue();
        }
        java.lang.Object tag6 = view.getTag(C52761wXj.FragmentManager.QfJbVf);
        if (tag6 != null && (tag6 instanceof RecyclerView.Adapter)) {
            RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
            if (recyclerView != null) {
                recyclerView.setAdapter((RecyclerView.Adapter) tag6);
            }
        }
        java.lang.Object tag7 = view.getTag(C52761wXj.FragmentManager.YqksP);
        if (tag7 != null && (tag7 instanceof RecyclerView.LayoutManager)) {
            RecyclerView recyclerView2 = view instanceof RecyclerView ? (RecyclerView) view : null;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager((RecyclerView.LayoutManager) tag7);
            }
        }
        java.lang.Object tag8 = view.getTag(C52761wXj.FragmentManager.DrqXHJ);
        C55363xiY c55363xiY = tag8 instanceof C55363xiY ? (C55363xiY) tag8 : null;
        if (c55363xiY != null) {
            if (!c55363xiY.isConnected()) {
                c55363xiY = null;
            }
            if (c55363xiY != null && (view instanceof android.view.ViewGroup)) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = viewGroup.getChildAt(i);
                    java.lang.Object tag9 = childAt.getTag(C52761wXj.FragmentManager.DIIpTV);
                    Intrinsics.copydefault(tag9, "");
                    childAt.setVisibility(((java.lang.Integer) tag9).intValue());
                }
            }
        }
        view.setForeground(null);
        view.setOnTouchListener(null);
        java.lang.Object tag10 = view.getTag(C52761wXj.FragmentManager.fBE);
        if (tag10 != null) {
            view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) tag10);
        }
        java.util.Iterator it = yDY.gEmmrt(java.lang.Integer.valueOf(C52761wXj.FragmentManager.DrqXHJ), java.lang.Integer.valueOf(C52761wXj.FragmentManager.DGUQLIdZmdUa), java.lang.Integer.valueOf(C52761wXj.FragmentManager.DUUtXg), java.lang.Integer.valueOf(C52761wXj.FragmentManager.DIIpTV), java.lang.Integer.valueOf(C52761wXj.FragmentManager.frkDMe), java.lang.Integer.valueOf(C52761wXj.FragmentManager.dzCpvv), java.lang.Integer.valueOf(C52761wXj.FragmentManager.DGUQLIhJrIAr), java.lang.Integer.valueOf(C52761wXj.FragmentManager.QfJbVf), java.lang.Integer.valueOf(C52761wXj.FragmentManager.YqksP), java.lang.Integer.valueOf(C52761wXj.FragmentManager.fBE)).iterator();
        while (it.hasNext()) {
            view.setTag(((java.lang.Number) it.next()).intValue(), null);
        }
    }

    public static final float OLrzqt(android.view.View view) {
        java.lang.Float fGEmmrt;
        java.lang.Object tag = view.getTag();
        float[] fArr = null;
        java.lang.String str = tag instanceof java.lang.String ? (java.lang.String) tag : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str) && str != null && C59449zhJ.startsWith$default(str, "radius", false, 2, null)) {
            return java.lang.Float.parseFloat(StringsKt__StringsKt.substringAfter$default(str, "radius_", (java.lang.String) null, 2, (java.lang.Object) null));
        }
        MaterialCardView materialCardView = view instanceof MaterialCardView ? (MaterialCardView) view : null;
        if (materialCardView != null) {
            return materialCardView.getRadius();
        }
        android.graphics.drawable.Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return 18.0f;
        }
        try {
            java.lang.reflect.Field declaredField = GradientDrawable.class.getDeclaredField("mRadiusArray");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(gradientDrawable);
            if (obj instanceof float[]) {
                fArr = (float[]) obj;
            }
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException unused) {
        }
        if (fArr == null || (fGEmmrt = yDV.gEmmrt(fArr)) == null) {
            return 18.0f;
        }
        return fGEmmrt.floatValue();
    }

    public static final void KWHzl(android.view.View view, boolean z) {
        yDQ ydq = new yDQ();
        ydq.add(view);
        while (!ydq.isEmpty()) {
            android.view.View view2 = (android.view.View) ydq.removeFirst();
            if (!(view2 instanceof androidx.appcompat.widget.Toolbar)) {
                java.lang.Object tag = view2.getTag(C52761wXj.FragmentManager.DrqXHJ);
                C55363xiY c55363xiY = tag instanceof C55363xiY ? (C55363xiY) tag : null;
                if (c55363xiY == null || !c55363xiY.DbNXlk()) {
                    if (view2 instanceof android.view.ViewGroup) {
                        if ((c55363xiY == null || !c55363xiY.isConnected()) && ((c55363xiY == null || !c55363xiY.AYXKKw()) && (c55363xiY == null || !c55363xiY.djBIcL()))) {
                            if (view2 instanceof RecyclerView) {
                                copydefault(view2, z);
                            } else {
                                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2;
                                int childCount = viewGroup.getChildCount();
                                for (int i = 0; i < childCount; i++) {
                                    android.view.View childAt = viewGroup.getChildAt(i);
                                    Intrinsics.copydefault(childAt);
                                    ydq.add(childAt);
                                }
                            }
                        } else if (z) {
                            KWHzl(view2);
                        } else {
                            copydefault(view2);
                        }
                    } else if (z) {
                        KWHzl(view2);
                    } else {
                        copydefault(view2);
                    }
                }
            }
        }
    }
}
