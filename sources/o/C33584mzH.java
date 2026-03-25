package o;

import android.animation.Animator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import o.C52761wXj;

/* JADX INFO: renamed from: o.mzH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@java.lang.Deprecated
public class C33584mzH extends AbstractC33578mzB {
    public android.widget.FrameLayout AYXKKw;
    public android.content.Context AkhnZx;
    public boolean DbNXlk;
    public android.view.View djBIcL;
    public android.view.View ejfBZ;
    public boolean fARcdN;
    public android.view.ViewGroup fIwbmz;
    public android.view.View fJNWhG;
    public java.util.List<Animator.AnimatorListener> fetchVPNInfo;
    public float gEmmrt;
    public java.util.List<Animator.AnimatorListener> isConnected;
    public View.OnClickListener valueOf;
    public android.graphics.drawable.Drawable values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(float f) {
        this.gEmmrt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.graphics.drawable.Drawable gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.djBIcL;
    }

    public C33584mzH(android.content.Context context) {
        super(context);
        this.fARcdN = true;
        this.DbNXlk = false;
        this.isConnected = null;
        this.fetchVPNInfo = null;
        this.values = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.valueOf = new View.OnClickListener() { // from class: o.mzH.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                C33584mzH.this.dismiss();
            }
        };
        EZpvd(context);
    }

    public C33584mzH(android.content.Context context, android.view.View view, boolean z) {
        super(context);
        this.fARcdN = true;
        this.DbNXlk = false;
        this.isConnected = null;
        this.fetchVPNInfo = null;
        this.values = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.valueOf = new View.OnClickListener() { // from class: o.mzH.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                C33584mzH.this.dismiss();
            }
        };
        EZpvd(context);
        setContentView(view);
        AEQbTJ(z);
    }

    public C33584mzH(android.content.Context context, android.view.View view, boolean z, boolean z2) {
        super(context);
        this.fARcdN = true;
        this.DbNXlk = false;
        this.isConnected = null;
        this.fetchVPNInfo = null;
        this.values = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.valueOf = new View.OnClickListener() { // from class: o.mzH.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                C33584mzH.this.dismiss();
            }
        };
        EZpvd(context);
        this.DbNXlk = z2;
        setContentView(view);
        AEQbTJ(z);
    }

    public C33584mzH(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.fARcdN = true;
        this.DbNXlk = false;
        this.isConnected = null;
        this.fetchVPNInfo = null;
        this.values = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.valueOf = new View.OnClickListener() { // from class: o.mzH.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                C33584mzH.this.dismiss();
            }
        };
        EZpvd(context);
    }

    public C33584mzH(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fARcdN = true;
        this.DbNXlk = false;
        this.isConnected = null;
        this.fetchVPNInfo = null;
        this.values = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.valueOf = new View.OnClickListener() { // from class: o.mzH.2
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                C33584mzH.this.dismiss();
            }
        };
        EZpvd(context);
    }

    public final void EZpvd(android.content.Context context) {
        this.AkhnZx = context;
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(-1);
        setOutsideTouchable(true);
        setElevation(0.0f);
        KWHzl(OLrzqt(context, 4));
        setSoftInputMode(32);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        super.setContentView(this.DbNXlk ? EZpvd(view) : KWHzl(view));
    }

    public void copydefault(boolean z) {
        this.DbNXlk = z;
        this.AYXKKw.setPaddingRelative(0, 0, 0, z ? 0 : ((int) this.gEmmrt) * 3);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.AYXKKw.getLayoutParams();
        layoutParams.matchConstraintPercentHeight = z ? 1.0f : 0.8f;
        this.AYXKKw.setLayoutParams(layoutParams);
    }

    public final android.view.ViewGroup KWHzl(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this.AkhnZx).inflate(C52761wXj.Fragment.EZpvd, (android.view.ViewGroup) null, false);
        this.fIwbmz = viewGroup;
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fIwbmz.setOnClickListener(this.valueOf);
        android.view.View viewFindViewById = this.fIwbmz.findViewById(C52761wXj.FragmentManager.hCLrkq);
        this.fJNWhG = viewFindViewById;
        viewFindViewById.setBackground(gEmmrt());
        this.fJNWhG.setOnClickListener(this.valueOf);
        this.ejfBZ = this.fIwbmz.findViewById(C52761wXj.FragmentManager.fkESqH);
        AEQbTJ(this.fARcdN);
        AEQbTJ(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 55);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.fIwbmz.findViewById(C52761wXj.FragmentManager.ORxRYg);
        this.AYXKKw = frameLayout;
        frameLayout.setPaddingRelative(0, 0, 0, ((int) this.gEmmrt) * 3);
        this.AYXKKw.addView(view, layoutParams);
        this.djBIcL = view;
        return this.fIwbmz;
    }

    public final android.view.ViewGroup EZpvd(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this.AkhnZx).inflate(C52761wXj.Fragment.EZpvd, (android.view.ViewGroup) null, false);
        this.fIwbmz = viewGroup;
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.fIwbmz.setOnClickListener(this.valueOf);
        android.view.View viewFindViewById = this.fIwbmz.findViewById(C52761wXj.FragmentManager.hCLrkq);
        this.fJNWhG = viewFindViewById;
        viewFindViewById.setBackground(gEmmrt());
        this.fJNWhG.setOnClickListener(this.valueOf);
        this.ejfBZ = this.fIwbmz.findViewById(C52761wXj.FragmentManager.fkESqH);
        AEQbTJ(this.fARcdN);
        AEQbTJ(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 55);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.fIwbmz.findViewById(C52761wXj.FragmentManager.ORxRYg);
        this.AYXKKw = frameLayout;
        frameLayout.setPaddingRelative(0, 0, 0, ((int) this.gEmmrt) * 3);
        this.AYXKKw.addView(view, layoutParams);
        this.djBIcL = view;
        return this.fIwbmz;
    }

    public final void AEQbTJ(android.view.View view) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setClickable(true);
    }

    public void EZpvd(android.graphics.drawable.Drawable drawable) {
        this.values = drawable;
        android.view.View view = this.fJNWhG;
        if (view != null) {
            view.setBackground(drawable);
        }
    }

    public void AEQbTJ(boolean z) {
        this.fARcdN = z;
        android.view.View view = this.ejfBZ;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public static int OLrzqt(android.content.Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // o.AbstractC33578mzB
    public android.animation.Animator copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View view2 = this.fJNWhG;
        android.util.Property property = android.view.View.ALPHA;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) property, 0.0f, 1.0f).setDuration(300L);
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(this.ejfBZ, (android.util.Property<android.view.View, java.lang.Float>) property, 0.0f, 1.0f).setDuration(300L);
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(this.djBIcL, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.djBIcL.getHeight(), 0.0f).setDuration(300L);
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(this.djBIcL, "elevation", 0.0f, OLrzqt()).setDuration(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(duration, duration3, duration4, duration2);
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        java.util.List<Animator.AnimatorListener> list = this.isConnected;
        if (list != null && list.size() > 0) {
            java.util.Iterator<Animator.AnimatorListener> it = this.isConnected.iterator();
            while (it.hasNext()) {
                animatorSet.addListener(it.next());
            }
        }
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.mzH.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                C33584mzH.this.djBIcL.setLayerType(2, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                animator.removeListener(this);
                C33584mzH.this.djBIcL.setLayerType(0, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                animator.removeListener(this);
                C33584mzH.this.djBIcL.setLayerType(0, null);
            }
        });
        return animatorSet;
    }

    @Override // o.AbstractC33578mzB
    public android.animation.Animator OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View view2 = this.fJNWhG;
        android.util.Property property = android.view.View.ALPHA;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) property, view2.getAlpha(), 0.0f).setDuration(250L);
        android.view.View view3 = this.ejfBZ;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(view3, (android.util.Property<android.view.View, java.lang.Float>) property, view3.getAlpha(), 0.0f).setDuration(300L);
        int i = -this.djBIcL.getHeight();
        android.view.View view4 = this.djBIcL;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(view4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, view4.getTranslationY(), i).setDuration(250L);
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(this.djBIcL, "elevation", OLrzqt(), 0.0f).setDuration(250L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(duration, duration3, duration4, duration2);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        java.util.List<Animator.AnimatorListener> list = this.fetchVPNInfo;
        if (list != null && list.size() > 0) {
            java.util.Iterator<Animator.AnimatorListener> it = this.fetchVPNInfo.iterator();
            while (it.hasNext()) {
                animatorSet.addListener(it.next());
            }
        }
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.mzH.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                C33584mzH.this.djBIcL.setLayerType(2, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                animator.removeListener(this);
                C33584mzH.this.djBIcL.setLayerType(0, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                animator.removeListener(this);
                C33584mzH.this.djBIcL.setLayerType(0, null);
            }
        });
        return animatorSet;
    }
}
