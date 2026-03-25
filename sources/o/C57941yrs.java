package o;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.viewpager.widget.ViewPager;
import java.util.LinkedList;

/* JADX INFO: renamed from: o.yrs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57941yrs implements InterfaceC57928yrf, InterfaceC57899yrC, ValueAnimator.AnimatorUpdateListener {
    public android.view.View AhwBna;
    public android.view.View EZpvd;
    public android.view.View OLrzqt;
    public android.view.View gEmmrt;
    public android.view.View valueOf;
    public int AYXKKw = 0;
    public boolean copydefault = true;
    public boolean AEQbTJ = true;
    public C57945yrw KWHzl = new C57945yrw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57899yrC
    public void AEQbTJ(boolean z, boolean z2) {
        this.copydefault = z;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57928yrf
    public android.view.View EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57928yrf
    public android.view.View KWHzl() {
        return this.valueOf;
    }

    public C57941yrs(@androidx.annotation.NonNull android.view.View view) {
        this.valueOf = view;
        this.gEmmrt = view;
        this.EZpvd = view;
    }

    public void KWHzl(android.view.View view, InterfaceC57931yri interfaceC57931yri) {
        boolean zIsInEditMode = this.EZpvd.isInEditMode();
        android.view.View view2 = null;
        while (true) {
            if (view2 != null && (!(view2 instanceof NestedScrollingParent) || (view2 instanceof NestedScrollingChild))) {
                break;
            }
            view = copydefault(view, view2 == null);
            if (view == view2) {
                break;
            }
            if (!zIsInEditMode) {
                C57907yrK.OLrzqt(view, interfaceC57931yri, this);
            }
            view2 = view;
        }
        if (view2 != null) {
            this.valueOf = view2;
        }
    }

    public android.view.View copydefault(android.view.View view, boolean z) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        android.view.View view2 = null;
        while (linkedList.size() > 0 && view2 == null) {
            android.view.View view3 = (android.view.View) linkedList.poll();
            if (view3 != null) {
                if ((z || view3 != view) && InterpolatorC57905yrI.OLrzqt(view3)) {
                    view2 = view3;
                } else if (view3 instanceof android.view.ViewGroup) {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) view3;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        linkedList.add(viewGroup.getChildAt(i));
                    }
                }
            }
        }
        return view2 == null ? view : view2;
    }

    public android.view.View EZpvd(android.view.View view, PointF pointF, android.view.View view2) {
        if ((view instanceof android.view.ViewGroup) && pointF != null) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                android.view.View childAt = viewGroup.getChildAt(childCount - 1);
                if (InterpolatorC57905yrI.KWHzl(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && InterpolatorC57905yrI.OLrzqt(childAt)) {
                        return childAt;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    android.view.View viewEZpvd = EZpvd(childAt, pointF, view2);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return viewEZpvd;
                }
            }
        }
        return view2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    @Override // o.InterfaceC57928yrf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(int i, int i2, int i3) {
        boolean z;
        android.view.View viewFindViewById;
        android.view.View viewFindViewById2;
        if (i2 == -1 || (viewFindViewById2 = this.gEmmrt.findViewById(i2)) == null) {
            z = false;
        } else if (i > 0) {
            viewFindViewById2.setTranslationY(i);
            z = true;
        } else {
            if (viewFindViewById2.getTranslationY() > 0.0f) {
                viewFindViewById2.setTranslationY(0.0f);
            }
            z = false;
        }
        if (i3 == -1 || (viewFindViewById = this.gEmmrt.findViewById(i3)) == null) {
            if (z) {
                this.gEmmrt.setTranslationY(i);
            } else {
                this.gEmmrt.setTranslationY(0.0f);
            }
        } else if (i < 0) {
            viewFindViewById.setTranslationY(i);
            this.gEmmrt.setTranslationY(0.0f);
        } else {
            if (viewFindViewById.getTranslationY() < 0.0f) {
                viewFindViewById.setTranslationY(0.0f);
            }
            if (z) {
            }
        }
        android.view.View view = this.AhwBna;
        if (view != null) {
            view.setTranslationY(java.lang.Math.max(0, i));
        }
        android.view.View view2 = this.OLrzqt;
        if (view2 != null) {
            view2.setTranslationY(java.lang.Math.min(0, i));
        }
    }

    @Override // o.InterfaceC57928yrf
    public boolean AEQbTJ() {
        return this.copydefault && this.KWHzl.EZpvd(this.EZpvd);
    }

    @Override // o.InterfaceC57928yrf
    public boolean copydefault() {
        return this.AEQbTJ && this.KWHzl.copydefault(this.EZpvd);
    }

    @Override // o.InterfaceC57928yrf
    public void EZpvd(android.view.MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        pointF.offset(-this.EZpvd.getLeft(), -this.EZpvd.getTop());
        android.view.View view = this.valueOf;
        android.view.View view2 = this.EZpvd;
        if (view != view2) {
            this.valueOf = EZpvd(view2, pointF, view);
        }
        if (this.valueOf == this.EZpvd) {
            this.KWHzl.KWHzl = null;
        } else {
            this.KWHzl.KWHzl = pointF;
        }
    }

    @Override // o.InterfaceC57928yrf
    public void KWHzl(InterfaceC57931yri interfaceC57931yri, android.view.View view, android.view.View view2) {
        KWHzl(this.EZpvd, interfaceC57931yri);
        if (view == null && view2 == null) {
            return;
        }
        this.AhwBna = view;
        this.OLrzqt = view2;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.EZpvd.getContext());
        int iIndexOfChild = interfaceC57931yri.copydefault().AkhnZx().indexOfChild(this.EZpvd);
        interfaceC57931yri.copydefault().AkhnZx().removeView(this.EZpvd);
        frameLayout.addView(this.EZpvd, 0, new ViewGroup.LayoutParams(-1, -1));
        interfaceC57931yri.copydefault().AkhnZx().addView(frameLayout, iIndexOfChild, this.EZpvd.getLayoutParams());
        this.EZpvd = frameLayout;
        if (view != null) {
            view.setTag("fixed-top");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            int iIndexOfChild2 = viewGroup.indexOfChild(view);
            viewGroup.removeView(view);
            layoutParams.height = InterpolatorC57905yrI.EZpvd(view);
            viewGroup.addView(new androidx.legacy.widget.Space(this.EZpvd.getContext()), iIndexOfChild2, layoutParams);
            frameLayout.addView(view, 1, layoutParams);
        }
        if (view2 != null) {
            view2.setTag("fixed-bottom");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view2.getParent();
            int iIndexOfChild3 = viewGroup2.indexOfChild(view2);
            viewGroup2.removeView(view2);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
            layoutParams2.height = InterpolatorC57905yrI.EZpvd(view2);
            viewGroup2.addView(new androidx.legacy.widget.Space(this.EZpvd.getContext()), iIndexOfChild3, layoutParams2);
            layoutParams3.gravity = 80;
            frameLayout.addView(view2, 1, layoutParams3);
        }
    }

    @Override // o.InterfaceC57928yrf
    public void AEQbTJ(InterfaceC57932yrj interfaceC57932yrj) {
        if (interfaceC57932yrj instanceof C57945yrw) {
            this.KWHzl = (C57945yrw) interfaceC57932yrj;
        } else {
            this.KWHzl.copydefault = interfaceC57932yrj;
        }
    }

    @Override // o.InterfaceC57928yrf
    public void EZpvd(boolean z) {
        this.KWHzl.EZpvd = z;
    }

    @Override // o.InterfaceC57928yrf
    public ValueAnimator.AnimatorUpdateListener KWHzl(int i) {
        android.view.View view = this.valueOf;
        if (view == null || i == 0) {
            return null;
        }
        if ((i >= 0 || !InterpolatorC57905yrI.EZpvd(view, 1)) && (i <= 0 || !InterpolatorC57905yrI.EZpvd(this.valueOf, -1))) {
            return null;
        }
        this.AYXKKw = i;
        return this;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int iIntValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = (iIntValue - this.AYXKKw) * this.valueOf.getScaleY();
            android.view.View view = this.valueOf;
            if (view instanceof android.widget.AbsListView) {
                InterpolatorC57905yrI.AEQbTJ((android.widget.AbsListView) view, (int) scaleY);
            } else {
                view.scrollBy(0, (int) scaleY);
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
        this.AYXKKw = iIntValue;
    }
}
