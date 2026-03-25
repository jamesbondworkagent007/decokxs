package com.okinc.uilab.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import com.google.android.material.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.okinc.uilab.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;
import java.util.List;
import o.C52761wXj;
import o.C55233xgA;
import o.InterfaceC55278xgt;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public List<ActionBar<B>> AYXKKw;
    public int AkhnZx;
    public int AuCTel;
    public final Context DbNXlk;
    public Activity OLrzqt;
    public final AccessibilityManager copydefault;
    public final InterfaceC55278xgt djBIcL;
    public boolean ejfBZ;
    public int fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public Behavior gEmmrt;
    public final StateListAnimator getFieldNames;
    public final ViewGroup getNewProxyInstance;
    public int isConnected;
    public boolean iwGUEr;
    public static final int[] AEQbTJ = {R.attr.snackbarStyle};
    public static final String KWHzl = BaseTransientBottomBar.class.getSimpleName();
    public static final Handler EZpvd = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).getNewProxyInstance();
                return true;
            }
            if (i != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).KWHzl(message.arg1);
            return true;
        }
    });
    public boolean AhwBna = false;
    public final Runnable valueOf = new Runnable() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.11
        @Override // java.lang.Runnable
        public void run() {
            int iAhwBna;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.getFieldNames == null || baseTransientBottomBar.DbNXlk == null || (iAhwBna = (BaseTransientBottomBar.this.AhwBna() - BaseTransientBottomBar.this.DbNXlk()) + ((int) BaseTransientBottomBar.this.getFieldNames.getTranslationY())) >= BaseTransientBottomBar.this.fetchVPNInfo) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.getFieldNames.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                String unused = BaseTransientBottomBar.KWHzl;
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.fetchVPNInfo - iAhwBna;
            BaseTransientBottomBar.this.getFieldNames.requestLayout();
        }
    };
    public int values = 0;
    public C55233xgA.Application fARcdN = new C55233xgA.Application() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.14
        @Override // o.C55233xgA.Application
        public void EZpvd() {
            Handler handler = BaseTransientBottomBar.EZpvd;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // o.C55233xgA.Application
        public void EZpvd(int i) {
            Handler handler = BaseTransientBottomBar.EZpvd;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }
    };

    /* JADX INFO: loaded from: classes17.dex */
    public static abstract class ActionBar<B> {
        public void AEQbTJ(B b) {
        }

        public void KWHzl(B b, int i) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B AEQbTJ(int i) {
        this.isConnected = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public View AkhnZx() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Context gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public B valueOf(int i) {
        this.values = i;
        return this;
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull InterfaceC55278xgt interfaceC55278xgt) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (interfaceC55278xgt == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.getNewProxyInstance = viewGroup;
        this.djBIcL = interfaceC55278xgt;
        this.DbNXlk = context;
        StateListAnimator stateListAnimator = (StateListAnimator) LayoutInflater.from(context).inflate(C52761wXj.Fragment.getPostValueLengthLimit, viewGroup, false);
        this.getFieldNames = stateListAnimator;
        stateListAnimator.copydefault((BaseTransientBottomBar<?>) this);
        stateListAnimator.addView(view);
        ViewCompat.setAccessibilityLiveRegion(stateListAnimator, 1);
        ViewCompat.setImportantForAccessibility(stateListAnimator, 1);
        ViewCompat.setFitsSystemWindows(stateListAnimator, true);
        ViewCompat.setOnApplyWindowInsetsListener(stateListAnimator, new OnApplyWindowInsetsListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.15
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view2, @NonNull WindowInsetsCompat windowInsetsCompat) {
                BaseTransientBottomBar.this.fIwbmz = windowInsetsCompat.getSystemWindowInsetBottom();
                BaseTransientBottomBar.this.AuCTel = windowInsetsCompat.getSystemWindowInsetLeft();
                BaseTransientBottomBar.this.fJNWhG = windowInsetsCompat.getSystemWindowInsetRight();
                BaseTransientBottomBar.this.AuCTelauCTel();
                return windowInsetsCompat;
            }
        });
        ViewCompat.setAccessibilityDelegate(stateListAnimator, new AccessibilityDelegateCompat() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.12
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.addAction(1048576);
                accessibilityNodeInfoCompat.setDismissable(true);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public boolean performAccessibilityAction(View view2, int i, Bundle bundle) {
                if (i == 1048576) {
                    BaseTransientBottomBar.this.copydefault();
                    return true;
                }
                return super.performAccessibilityAction(view2, i, bundle);
            }
        });
        this.copydefault = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public final void AuCTelauCTel() {
        ViewGroup.LayoutParams layoutParams = this.getFieldNames.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || this.getFieldNames.gEmmrt == null || this.getFieldNames.getParent() == null) {
            return;
        }
        int i = EZpvd() != null ? this.AkhnZx : this.fIwbmz;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = this.getFieldNames.gEmmrt.bottom + i + ((int) Application.OLrzqt(this.DbNXlk, 24)) + this.values;
        marginLayoutParams.leftMargin = this.getFieldNames.gEmmrt.left + this.AuCTel;
        marginLayoutParams.rightMargin = this.getFieldNames.gEmmrt.right + this.fJNWhG;
        marginLayoutParams.topMargin = this.getFieldNames.gEmmrt.top;
        this.getFieldNames.requestLayout();
        if (Build.VERSION.SDK_INT < 29 || !iwGUEr()) {
            return;
        }
        this.getFieldNames.removeCallbacks(this.valueOf);
        this.getFieldNames.post(this.valueOf);
    }

    public final boolean iwGUEr() {
        return this.fetchVPNInfo > 0 && !this.ejfBZ && fetchVPNInfo();
    }

    public final boolean fetchVPNInfo() {
        ViewGroup.LayoutParams layoutParams = this.getFieldNames.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof SwipeDismissBehavior);
    }

    public View EZpvd() {
        Activity activity = this.OLrzqt;
        if (activity == null) {
            return null;
        }
        return activity.AEQbTJ();
    }

    public B AEQbTJ(@Nullable View view) {
        Activity activity = this.OLrzqt;
        if (activity != null) {
            activity.OLrzqt();
        }
        this.OLrzqt = view == null ? null : Activity.EZpvd(this, view);
        return this;
    }

    public void hDKMBd() {
        C55233xgA.AEQbTJ().AEQbTJ(valueOf(), this.fARcdN);
    }

    public void copydefault() {
        OLrzqt(3);
    }

    public void OLrzqt(int i) {
        C55233xgA.AEQbTJ().AEQbTJ(this.fARcdN, i);
    }

    public boolean values() {
        return C55233xgA.AEQbTJ().KWHzl(this.fARcdN);
    }

    public boolean isConnected() {
        return C55233xgA.AEQbTJ().AEQbTJ(this.fARcdN);
    }

    public SwipeDismissBehavior<? extends View> AYXKKw() {
        return new Behavior();
    }

    public final void getNewProxyInstance() {
        if (this.getFieldNames.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.getFieldNames.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                EZpvd((CoordinatorLayout.LayoutParams) layoutParams);
            }
            this.getFieldNames.OLrzqt(this.getNewProxyInstance);
            ejfBZ();
            this.getFieldNames.setVisibility(4);
        }
        if (ViewCompat.isLaidOut(this.getFieldNames)) {
            getFieldNames();
        } else {
            this.iwGUEr = true;
        }
    }

    public void AuCTel() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.getFieldNames.getRootWindowInsets()) == null) {
            return;
        }
        this.fetchVPNInfo = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        AuCTelauCTel();
    }

    public void fJNWhG() {
        if (isConnected()) {
            EZpvd.post(new Runnable() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.13
                @Override // java.lang.Runnable
                public void run() {
                    BaseTransientBottomBar.this.EZpvd(3);
                }
            });
        }
    }

    public void fIwbmz() {
        if (this.iwGUEr) {
            getFieldNames();
            this.iwGUEr = false;
        }
    }

    public final void getFieldNames() {
        if (uzCIH()) {
            OLrzqt();
            return;
        }
        if (this.getFieldNames.getParent() != null) {
            this.getFieldNames.setVisibility(0);
        }
        fARcdN();
    }

    public final int DbNXlk() {
        int[] iArr = new int[2];
        this.getFieldNames.getLocationOnScreen(iArr);
        return iArr[1] + this.getFieldNames.getHeight();
    }

    public final int AhwBna() {
        WindowManager windowManager = (WindowManager) this.DbNXlk.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final void EZpvd(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorAYXKKw = this.gEmmrt;
        if (swipeDismissBehaviorAYXKKw == null) {
            swipeDismissBehaviorAYXKKw = AYXKKw();
        }
        if (swipeDismissBehaviorAYXKKw instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorAYXKKw).copydefault(this);
        }
        swipeDismissBehaviorAYXKKw.setListener(new SwipeDismissBehavior.OnDismissListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.20
            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
            public void onDismiss(@NonNull View view) {
                if (view.getParent() != null) {
                    view.setVisibility(8);
                }
                BaseTransientBottomBar.this.OLrzqt(0);
            }

            @Override // com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener
            public void onDragStateChanged(int i) {
                if (i == 0) {
                    C55233xgA.AEQbTJ().AhwBna(BaseTransientBottomBar.this.fARcdN);
                } else if (i == 1 || i == 2) {
                    C55233xgA.AEQbTJ().djBIcL(BaseTransientBottomBar.this.fARcdN);
                }
            }
        });
        layoutParams.setBehavior(swipeDismissBehaviorAYXKKw);
        if (EZpvd() == null) {
            layoutParams.insetEdge = 80;
        }
    }

    public final void ejfBZ() {
        this.AkhnZx = KWHzl();
        AuCTelauCTel();
    }

    public final int KWHzl() {
        if (EZpvd() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        EZpvd().getLocationOnScreen(iArr);
        int i = iArr[1];
        int[] iArr2 = new int[2];
        this.getNewProxyInstance.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.getNewProxyInstance.getHeight()) - i;
    }

    public void OLrzqt() {
        this.getFieldNames.post(new Runnable() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.17
            @Override // java.lang.Runnable
            public void run() {
                StateListAnimator stateListAnimator = BaseTransientBottomBar.this.getFieldNames;
                if (stateListAnimator == null) {
                    return;
                }
                if (stateListAnimator.getParent() != null) {
                    BaseTransientBottomBar.this.getFieldNames.setVisibility(0);
                }
                int iKWHzl = BaseTransientBottomBar.this.getFieldNames.KWHzl();
                if (iKWHzl == 1) {
                    BaseTransientBottomBar.this.zLjUOn();
                } else if (iKWHzl == 0) {
                    BaseTransientBottomBar.this.zsXlph();
                } else {
                    BaseTransientBottomBar.this.wlaJM();
                }
            }
        });
    }

    public final void copydefault(int i) {
        int iKWHzl = this.getFieldNames.KWHzl();
        if (iKWHzl == 1) {
            AhwBna(i);
        } else if (iKWHzl == 0) {
            gEmmrt(i);
        } else {
            gEmmrt(i);
        }
    }

    public final void zLjUOn() {
        ValueAnimator valueAnimatorOLrzqt = OLrzqt(0.0f, 1.0f);
        ValueAnimator valueAnimatorAEQbTJ = AEQbTJ(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOLrzqt, valueAnimatorAEQbTJ);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.16
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.fARcdN();
            }
        });
        animatorSet.start();
    }

    public final void AhwBna(final int i) {
        ValueAnimator valueAnimatorOLrzqt = OLrzqt(1.0f, 0.0f);
        valueAnimatorOLrzqt.setDuration(75L);
        valueAnimatorOLrzqt.addListener(new AnimatorListenerAdapter() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.EZpvd(i);
            }
        });
        valueAnimatorOLrzqt.start();
    }

    public final ValueAnimator OLrzqt(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(Application.EZpvd);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                BaseTransientBottomBar.this.getFieldNames.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator AEQbTJ(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(Application.OLrzqt);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                BaseTransientBottomBar.this.getFieldNames.setScaleX(fFloatValue);
                BaseTransientBottomBar.this.getFieldNames.setScaleY(fFloatValue);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void zsXlph() {
        int iDjBIcL = djBIcL();
        this.getFieldNames.setTranslationY(iDjBIcL);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iDjBIcL, 0);
        valueAnimator.setInterpolator(Application.KWHzl);
        valueAnimator.setDuration(300L);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.djBIcL.KWHzl(120, 180);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.fARcdN();
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(iDjBIcL) { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.7
            public int AEQbTJ;
            public final /* synthetic */ int copydefault;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            {
                this.copydefault = iDjBIcL;
                this.AEQbTJ = iDjBIcL;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                BaseTransientBottomBar.this.getFieldNames.setTranslationY(iIntValue);
                this.AEQbTJ = iIntValue;
            }
        });
        valueAnimator.start();
    }

    public final void gEmmrt(final int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, djBIcL());
        valueAnimator.setInterpolator(Application.KWHzl);
        valueAnimator.setDuration(300L);
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                BaseTransientBottomBar.this.djBIcL.OLrzqt(0, 180);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                BaseTransientBottomBar.this.EZpvd(i);
            }
        });
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.10
            public int KWHzl = 0;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                int iIntValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue();
                BaseTransientBottomBar.this.getFieldNames.setTranslationY(iIntValue);
                this.KWHzl = iIntValue;
            }
        });
        valueAnimator.start();
    }

    public final void wlaJM() {
        float fDjBIcL = djBIcL();
        this.getFieldNames.setTranslationY(fDjBIcL);
        SpringAnimation springAnimation = new SpringAnimation(this.getFieldNames, DynamicAnimation.TRANSLATION_Y);
        SpringForce springForce = new SpringForce(0.0f);
        springForce.setDampingRatio(0.75f);
        springForce.setStiffness(400.0f);
        springAnimation.setSpring(springForce);
        springAnimation.setStartValue(fDjBIcL);
        springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.6
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
            public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                BaseTransientBottomBar.this.getFieldNames.setTranslationY(f);
            }
        });
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.9
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                if (z) {
                    return;
                }
                BaseTransientBottomBar.this.fARcdN();
            }
        });
        springAnimation.start();
        this.djBIcL.KWHzl(120, 180);
    }

    public final int djBIcL() {
        int height = this.getFieldNames.getHeight();
        ViewGroup.LayoutParams layoutParams = this.getFieldNames.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final void KWHzl(int i) {
        if (uzCIH() && this.getFieldNames.getVisibility() == 0) {
            copydefault(i);
        } else {
            EZpvd(i);
        }
    }

    public void fARcdN() {
        C55233xgA.AEQbTJ().AYXKKw(this.fARcdN);
        List<ActionBar<B>> list = this.AYXKKw;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.AYXKKw.get(size).AEQbTJ(this);
            }
        }
    }

    public void EZpvd(int i) {
        C55233xgA.AEQbTJ().copydefault(this.fARcdN);
        List<ActionBar<B>> list = this.AYXKKw;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.AYXKKw.get(size).KWHzl(this, i);
            }
        }
        ViewParent parent = this.getFieldNames.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.getFieldNames);
        }
    }

    public boolean uzCIH() {
        AccessibilityManager accessibilityManager = this.copydefault;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public static class StateListAnimator extends FrameLayout {
        public static final View.OnTouchListener AEQbTJ = new View.OnTouchListener() { // from class: com.okinc.uilab.snackbar.BaseTransientBottomBar.StateListAnimator.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        };
        public BaseTransientBottomBar<?> AhwBna;
        public boolean EZpvd;
        public int KWHzl;
        public ColorStateList OLrzqt;
        public PorterDuff.Mode copydefault;
        public Rect gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: Access modifiers changed from: private */
        public void copydefault(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.AhwBna = baseTransientBottomBar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setAnimationMode(int i) {
            this.KWHzl = i;
        }

        public StateListAnimator(@NonNull Context context) {
            this(context, null);
        }

        public StateListAnimator(@NonNull Context context, AttributeSet attributeSet) {
            super(MaterialThemeOverlay.wrap(context, attributeSet, 0, 0), attributeSet);
            this.KWHzl = 2;
            setOnTouchListener(AEQbTJ);
            setFocusable(true);
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.OLrzqt != null) {
                drawable = DrawableCompat.wrap(drawable.mutate());
                DrawableCompat.setTintList(drawable, this.OLrzqt);
                DrawableCompat.setTintMode(drawable, this.copydefault);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.OLrzqt = colorStateList;
            if (getBackground() != null) {
                Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintList(drawableWrap, colorStateList);
                DrawableCompat.setTintMode(drawableWrap, this.copydefault);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.copydefault = mode;
            if (getBackground() != null) {
                Drawable drawableWrap = DrawableCompat.wrap(getBackground().mutate());
                DrawableCompat.setTintMode(drawableWrap, mode);
                if (drawableWrap != getBackground()) {
                    super.setBackgroundDrawable(drawableWrap);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : AEQbTJ);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AhwBna;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.fIwbmz();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AhwBna;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.AuCTel();
            }
            ViewCompat.requestApplyInsets(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AhwBna;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.fJNWhG();
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.EZpvd || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            copydefault((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.AhwBna;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.AuCTelauCTel();
            }
        }

        public void OLrzqt(ViewGroup viewGroup) {
            this.EZpvd = true;
            viewGroup.addView(this);
            this.EZpvd = false;
        }

        public final void copydefault(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.gEmmrt = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        public final TaskDescription copydefault = new TaskDescription(this);

        public final void copydefault(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.copydefault.KWHzl(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(View view) {
            return this.copydefault.KWHzl(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            this.copydefault.AEQbTJ(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class TaskDescription {
        public C55233xgA.Application AEQbTJ;

        public TaskDescription(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.setStartAlphaSwipeDistance(0.1f);
            swipeDismissBehavior.setEndAlphaSwipeDistance(0.6f);
            swipeDismissBehavior.setSwipeDirection(0);
        }

        public void KWHzl(@NonNull BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.AEQbTJ = baseTransientBottomBar.fARcdN;
        }

        public boolean KWHzl(View view) {
            return view instanceof StateListAnimator;
        }

        public void AEQbTJ(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    C55233xgA.AEQbTJ().djBIcL(this.AEQbTJ);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                C55233xgA.AEQbTJ().AhwBna(this.AEQbTJ);
            }
        }
    }

    public static class Activity implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
        public final WeakReference<BaseTransientBottomBar> KWHzl;
        public final WeakReference<View> copydefault;

        public static Activity EZpvd(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            Activity activity = new Activity(baseTransientBottomBar, view);
            if (ViewCompat.isAttachedToWindow(view)) {
                Application.AEQbTJ(view, activity);
            }
            view.addOnAttachStateChangeListener(activity);
            return activity;
        }

        public Activity(@NonNull BaseTransientBottomBar baseTransientBottomBar, @NonNull View view) {
            this.KWHzl = new WeakReference<>(baseTransientBottomBar);
            this.copydefault = new WeakReference<>(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (KWHzl()) {
                return;
            }
            Application.AEQbTJ(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (KWHzl()) {
                return;
            }
            Application.KWHzl(view, this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (KWHzl() || !this.KWHzl.get().AhwBna) {
                return;
            }
            this.KWHzl.get().ejfBZ();
        }

        public View AEQbTJ() {
            return this.copydefault.get();
        }

        public final boolean KWHzl() {
            if (this.KWHzl.get() != null) {
                return false;
            }
            OLrzqt();
            return true;
        }

        public void OLrzqt() {
            if (this.copydefault.get() != null) {
                this.copydefault.get().removeOnAttachStateChangeListener(this);
                Application.KWHzl(this.copydefault.get(), this);
            }
            this.copydefault.clear();
            this.KWHzl.clear();
        }
    }

    public static class Application {
        public static final TimeInterpolator EZpvd = new LinearInterpolator();
        public static final TimeInterpolator KWHzl = new FastOutSlowInInterpolator();
        public static final TimeInterpolator copydefault = new FastOutLinearInInterpolator();
        public static final TimeInterpolator OLrzqt = new LinearOutSlowInInterpolator();
        public static final TimeInterpolator AEQbTJ = new DecelerateInterpolator();

        private Application() {
        }

        public static float OLrzqt(@NonNull Context context, @Dimension(unit = 0) int i) {
            return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
        }

        public static void AEQbTJ(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            if (view != null) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }

        public static void KWHzl(@Nullable View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            if (view != null) {
                copydefault(view.getViewTreeObserver(), onGlobalLayoutListener);
            }
        }

        public static void copydefault(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}
