package o;

import o.C59543ziy;

/* JADX INFO: renamed from: o.ziz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59544ziz extends android.widget.LinearLayout {
    public android.animation.Animator AEQbTJ;
    public StateListAnimator AYXKKw;
    public int AhwBna;
    public android.animation.Animator EZpvd;
    public android.animation.Animator KWHzl;
    public android.animation.Animator OLrzqt;
    public int copydefault;
    public int djBIcL;
    public int gEmmrt;
    public int isConnected;
    public int valueOf;

    /* JADX INFO: renamed from: o.ziz$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public interface StateListAnimator {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setIndicatorCreatedListener(@androidx.annotation.Nullable StateListAnimator stateListAnimator) {
        this.AYXKKw = stateListAnimator;
    }

    public C59544ziz(android.content.Context context) {
        super(context);
        this.valueOf = -1;
        this.djBIcL = -1;
        this.gEmmrt = -1;
        this.isConnected = -1;
        KWHzl(context, null);
    }

    public C59544ziz(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.valueOf = -1;
        this.djBIcL = -1;
        this.gEmmrt = -1;
        this.isConnected = -1;
        KWHzl(context, attributeSet);
    }

    public C59544ziz(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.valueOf = -1;
        this.djBIcL = -1;
        this.gEmmrt = -1;
        this.isConnected = -1;
        KWHzl(context, attributeSet);
    }

    public final void KWHzl(android.content.Context context, android.util.AttributeSet attributeSet) {
        OLrzqt(AEQbTJ(context, attributeSet));
    }

    public final C59493ziA AEQbTJ(android.content.Context context, android.util.AttributeSet attributeSet) {
        C59493ziA c59493ziA = new C59493ziA();
        if (attributeSet == null) {
            return c59493ziA;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C59543ziy.Activity.EZpvd);
        c59493ziA.djBIcL = typedArrayObtainStyledAttributes.getDimensionPixelSize(C59543ziy.Activity.AhwBna, -1);
        c59493ziA.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelSize(C59543ziy.Activity.valueOf, -1);
        c59493ziA.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(C59543ziy.Activity.AYXKKw, -1);
        c59493ziA.AEQbTJ = typedArrayObtainStyledAttributes.getResourceId(C59543ziy.Activity.OLrzqt, C59543ziy.ActionBar.copydefault);
        c59493ziA.OLrzqt = typedArrayObtainStyledAttributes.getResourceId(C59543ziy.Activity.AEQbTJ, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C59543ziy.Activity.KWHzl, C59543ziy.TaskDescription.copydefault);
        c59493ziA.KWHzl = resourceId;
        c59493ziA.valueOf = typedArrayObtainStyledAttributes.getResourceId(C59543ziy.Activity.copydefault, resourceId);
        c59493ziA.AYXKKw = typedArrayObtainStyledAttributes.getInt(C59543ziy.Activity.djBIcL, -1);
        c59493ziA.EZpvd = typedArrayObtainStyledAttributes.getInt(C59543ziy.Activity.gEmmrt, -1);
        typedArrayObtainStyledAttributes.recycle();
        return c59493ziA;
    }

    public void OLrzqt(C59493ziA c59493ziA) {
        int iApplyDimension = (int) (android.util.TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics()) + 0.5f);
        int i = c59493ziA.djBIcL;
        if (i < 0) {
            i = iApplyDimension;
        }
        this.djBIcL = i;
        int i2 = c59493ziA.copydefault;
        if (i2 < 0) {
            i2 = iApplyDimension;
        }
        this.gEmmrt = i2;
        int i3 = c59493ziA.gEmmrt;
        if (i3 >= 0) {
            iApplyDimension = i3;
        }
        this.valueOf = iApplyDimension;
        this.AEQbTJ = copydefault(c59493ziA);
        android.animation.Animator animatorCopydefault = copydefault(c59493ziA);
        this.KWHzl = animatorCopydefault;
        animatorCopydefault.setDuration(0L);
        this.EZpvd = KWHzl(c59493ziA);
        android.animation.Animator animatorKWHzl = KWHzl(c59493ziA);
        this.OLrzqt = animatorKWHzl;
        animatorKWHzl.setDuration(0L);
        int i4 = c59493ziA.KWHzl;
        this.copydefault = i4 == 0 ? C59543ziy.TaskDescription.copydefault : i4;
        int i5 = c59493ziA.valueOf;
        if (i5 != 0) {
            i4 = i5;
        }
        this.AhwBna = i4;
        setOrientation(c59493ziA.AYXKKw != 1 ? 0 : 1);
        int i6 = c59493ziA.EZpvd;
        if (i6 < 0) {
            i6 = 17;
        }
        setGravity(i6);
    }

    public android.animation.Animator copydefault(C59493ziA c59493ziA) {
        return android.animation.AnimatorInflater.loadAnimator(getContext(), c59493ziA.AEQbTJ);
    }

    public android.animation.Animator KWHzl(C59493ziA c59493ziA) {
        if (c59493ziA.OLrzqt == 0) {
            android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(getContext(), c59493ziA.AEQbTJ);
            animatorLoadAnimator.setInterpolator(new ActionBar());
            return animatorLoadAnimator;
        }
        return android.animation.AnimatorInflater.loadAnimator(getContext(), c59493ziA.OLrzqt);
    }

    /* JADX INFO: renamed from: o.ziz$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public class ActionBar implements android.view.animation.Interpolator {
        public ActionBar() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return java.lang.Math.abs(1.0f - f);
        }
    }
}
