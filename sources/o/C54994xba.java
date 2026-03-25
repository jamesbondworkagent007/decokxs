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

/* JADX INFO: renamed from: o.xba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C54994xba extends AbstractC54995xbb {
    public android.view.View AEQbTJ;
    public float AYXKKw;
    public android.content.Context AhwBna;
    public android.graphics.drawable.Drawable AkhnZx;
    public boolean DbNXlk;
    public View.OnClickListener OLrzqt;
    public android.widget.FrameLayout copydefault;
    public java.util.List<Animator.AnimatorListener> djBIcL;
    public android.view.View fetchVPNInfo;
    public java.util.List<Animator.AnimatorListener> gEmmrt;
    public android.view.ViewGroup isConnected;
    public boolean valueOf;
    public android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(float f) {
        this.AYXKKw = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.graphics.drawable.Drawable copydefault() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        return this.AEQbTJ;
    }

    public C54994xba(android.content.Context context, android.view.View view, boolean z, boolean z2) {
        super(context);
        this.DbNXlk = true;
        this.valueOf = false;
        this.djBIcL = null;
        this.gEmmrt = null;
        this.AkhnZx = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.OLrzqt = new View.OnClickListener() { // from class: o.xba.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                C54994xba.this.dismiss();
            }
        };
        copydefault(context);
        this.valueOf = z2;
        setContentView(view);
        OLrzqt(z);
    }

    public C54994xba(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.DbNXlk = true;
        this.valueOf = false;
        this.djBIcL = null;
        this.gEmmrt = null;
        this.AkhnZx = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.OLrzqt = new View.OnClickListener() { // from class: o.xba.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                C54994xba.this.dismiss();
            }
        };
        copydefault(context);
    }

    public C54994xba(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.DbNXlk = true;
        this.valueOf = false;
        this.djBIcL = null;
        this.gEmmrt = null;
        this.AkhnZx = new ColorDrawable(Color.argb(128, 0, 0, 0));
        this.OLrzqt = new View.OnClickListener() { // from class: o.xba.1
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view2) {
                C54994xba.this.dismiss();
            }
        };
        copydefault(context);
    }

    public final void copydefault(android.content.Context context) {
        this.AhwBna = context;
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(-1);
        setOutsideTouchable(true);
        setElevation(0.0f);
        KWHzl(EZpvd(context, 4));
        setSoftInputMode(32);
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        super.setContentView(this.valueOf ? OLrzqt(view) : copydefault(view));
    }

    public void AEQbTJ(boolean z) {
        this.valueOf = z;
        this.copydefault.setPaddingRelative(0, 0, 0, z ? 0 : ((int) this.AYXKKw) * 3);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.copydefault.getLayoutParams();
        layoutParams.matchConstraintPercentHeight = z ? 1.0f : 0.8f;
        this.copydefault.setLayoutParams(layoutParams);
    }

    public final android.view.ViewGroup copydefault(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this.AhwBna).inflate(C52761wXj.Fragment.EZpvd, (android.view.ViewGroup) null, false);
        this.isConnected = viewGroup;
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.isConnected.setOnClickListener(this.OLrzqt);
        android.view.View viewFindViewById = this.isConnected.findViewById(C52761wXj.FragmentManager.hCLrkq);
        this.fetchVPNInfo = viewFindViewById;
        viewFindViewById.setBackground(copydefault());
        this.fetchVPNInfo.setOnClickListener(this.OLrzqt);
        this.values = this.isConnected.findViewById(C52761wXj.FragmentManager.fkESqH);
        OLrzqt(this.DbNXlk);
        EZpvd(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2, 55);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.isConnected.findViewById(C52761wXj.FragmentManager.ORxRYg);
        this.copydefault = frameLayout;
        frameLayout.setPaddingRelative(0, 0, 0, ((int) this.AYXKKw) * 3);
        this.copydefault.addView(view, layoutParams);
        this.AEQbTJ = view;
        return this.isConnected;
    }

    public final android.view.ViewGroup OLrzqt(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.LayoutInflater.from(this.AhwBna).inflate(C52761wXj.Fragment.EZpvd, (android.view.ViewGroup) null, false);
        this.isConnected = viewGroup;
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.isConnected.setOnClickListener(this.OLrzqt);
        android.view.View viewFindViewById = this.isConnected.findViewById(C52761wXj.FragmentManager.hCLrkq);
        this.fetchVPNInfo = viewFindViewById;
        viewFindViewById.setBackground(copydefault());
        this.fetchVPNInfo.setOnClickListener(this.OLrzqt);
        this.values = this.isConnected.findViewById(C52761wXj.FragmentManager.fkESqH);
        OLrzqt(this.DbNXlk);
        EZpvd(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 55);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.isConnected.findViewById(C52761wXj.FragmentManager.ORxRYg);
        this.copydefault = frameLayout;
        frameLayout.setPaddingRelative(0, 0, 0, ((int) this.AYXKKw) * 3);
        this.copydefault.addView(view, layoutParams);
        this.AEQbTJ = view;
        return this.isConnected;
    }

    public final void EZpvd(android.view.View view) {
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setClickable(true);
    }

    public void OLrzqt(boolean z) {
        this.DbNXlk = z;
        android.view.View view = this.values;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public static int EZpvd(android.content.Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // o.AbstractC54995xbb
    public android.animation.Animator KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View view2 = this.fetchVPNInfo;
        android.util.Property property = android.view.View.ALPHA;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) property, 0.0f, 1.0f).setDuration(300L);
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(this.values, (android.util.Property<android.view.View, java.lang.Float>) property, 0.0f, 1.0f).setDuration(300L);
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(this.AEQbTJ, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, -this.AEQbTJ.getHeight(), 0.0f).setDuration(300L);
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(this.AEQbTJ, "elevation", 0.0f, AEQbTJ()).setDuration(300L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(duration, duration3, duration4, duration2);
        animatorSet.setInterpolator(new FastOutSlowInInterpolator());
        java.util.List<Animator.AnimatorListener> list = this.djBIcL;
        if (list != null && list.size() > 0) {
            java.util.Iterator<Animator.AnimatorListener> it = this.djBIcL.iterator();
            while (it.hasNext()) {
                animatorSet.addListener(it.next());
            }
        }
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.xba.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                C54994xba.this.AEQbTJ.setLayerType(2, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                animator.removeListener(this);
                C54994xba.this.AEQbTJ.setLayerType(0, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                animator.removeListener(this);
                C54994xba.this.AEQbTJ.setLayerType(0, null);
            }
        });
        return animatorSet;
    }

    @Override // o.AbstractC54995xbb
    public android.animation.Animator AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View view2 = this.fetchVPNInfo;
        android.util.Property property = android.view.View.ALPHA;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(view2, (android.util.Property<android.view.View, java.lang.Float>) property, view2.getAlpha(), 0.0f).setDuration(250L);
        android.view.View view3 = this.values;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(view3, (android.util.Property<android.view.View, java.lang.Float>) property, view3.getAlpha(), 0.0f).setDuration(300L);
        int i = -this.AEQbTJ.getHeight();
        android.view.View view4 = this.AEQbTJ;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(view4, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, view4.getTranslationY(), i).setDuration(250L);
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(this.AEQbTJ, "elevation", AEQbTJ(), 0.0f).setDuration(250L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(duration, duration3, duration4, duration2);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        java.util.List<Animator.AnimatorListener> list = this.gEmmrt;
        if (list != null && list.size() > 0) {
            java.util.Iterator<Animator.AnimatorListener> it = this.gEmmrt.iterator();
            while (it.hasNext()) {
                animatorSet.addListener(it.next());
            }
        }
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: o.xba.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                C54994xba.this.AEQbTJ.setLayerType(2, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(android.animation.Animator animator) {
                animator.removeListener(this);
                C54994xba.this.AEQbTJ.setLayerType(0, null);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                animator.removeListener(this);
                C54994xba.this.AEQbTJ.setLayerType(0, null);
            }
        });
        return animatorSet;
    }
}
