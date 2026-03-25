package o;

import android.animation.Animator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import androidx.camera.video.AudioStats;
import androidx.cardview.widget.CardView;
import androidx.core.widget.PopupWindowCompat;
import com.onesignal.OSUtils;
import com.onesignal.OneSignal;
import com.onesignal.WebViewManager;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C57726ynp;

/* JADX INFO: renamed from: o.ynE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57689ynE {
    public WebViewManager.Position AYXKKw;
    public double AhwBna;
    public int AuCTel;
    public android.app.Activity EZpvd;
    public boolean OLrzqt;
    public boolean djBIcL;
    public android.widget.RelativeLayout ejfBZ;
    public StateListAnimator fARcdN;
    public C57770yog fIwbmz;
    public android.widget.PopupWindow getFieldNames;
    public java.lang.Runnable hDKMBd;
    public android.webkit.WebView iwGUEr;
    public C57726ynp valueOf;
    public static final int copydefault = Color.parseColor("#00000000");
    public static final int KWHzl = Color.parseColor("#BB000000");
    public static final int AEQbTJ = C57823ypg.copydefault(4);
    public final android.os.Handler gEmmrt = new android.os.Handler();
    public int values = C57823ypg.copydefault(24);
    public int DbNXlk = C57823ypg.copydefault(24);
    public int fetchVPNInfo = C57823ypg.copydefault(24);
    public int AkhnZx = C57823ypg.copydefault(24);
    public boolean getNewProxyInstance = false;
    public boolean isConnected = false;
    public int fJNWhG = -1;

    /* JADX INFO: renamed from: o.ynE$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd();

        void OLrzqt();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WebViewManager.Position KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(StateListAnimator stateListAnimator) {
        this.fARcdN = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.ejfBZ = null;
        this.valueOf = null;
        this.iwGUEr = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean gEmmrt() {
        return this.isConnected;
    }

    public C57689ynE(@androidx.annotation.NonNull android.webkit.WebView webView, @androidx.annotation.NonNull C57770yog c57770yog, boolean z) {
        this.OLrzqt = false;
        this.iwGUEr = webView;
        this.AYXKKw = c57770yog.EZpvd();
        this.AuCTel = c57770yog.AEQbTJ();
        this.AhwBna = c57770yog.copydefault() == null ? AudioStats.AUDIO_AMPLITUDE_NONE : c57770yog.copydefault().doubleValue();
        this.djBIcL = !this.AYXKKw.isBanner();
        this.OLrzqt = z;
        this.fIwbmz = c57770yog;
        copydefault(c57770yog);
    }

    public final void copydefault(C57770yog c57770yog) {
        this.fetchVPNInfo = c57770yog.KWHzl() ? C57823ypg.copydefault(24) : 0;
        this.AkhnZx = c57770yog.KWHzl() ? C57823ypg.copydefault(24) : 0;
        this.values = c57770yog.gEmmrt() ? C57823ypg.copydefault(24) : 0;
        this.DbNXlk = c57770yog.gEmmrt() ? C57823ypg.copydefault(24) : 0;
    }

    public void copydefault(android.webkit.WebView webView) {
        this.iwGUEr = webView;
        webView.setBackgroundColor(0);
    }

    public void copydefault(android.app.Activity activity) {
        KWHzl(activity);
    }

    public void EZpvd() {
        if (this.getNewProxyInstance) {
            this.getNewProxyInstance = false;
            OLrzqt((WebViewManager.ActionBar) null);
        }
    }

    public void AEQbTJ(final int i) {
        this.AuCTel = i;
        OSUtils.EZpvd(new java.lang.Runnable() { // from class: o.ynE.3
            @Override // java.lang.Runnable
            public void run() {
                if (C57689ynE.this.iwGUEr != null) {
                    ViewGroup.LayoutParams layoutParams = C57689ynE.this.iwGUEr.getLayoutParams();
                    if (layoutParams == null) {
                        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.");
                        return;
                    }
                    layoutParams.height = i;
                    C57689ynE.this.iwGUEr.setLayoutParams(layoutParams);
                    if (C57689ynE.this.valueOf != null) {
                        C57726ynp c57726ynp = C57689ynE.this.valueOf;
                        C57689ynE c57689ynE = C57689ynE.this;
                        c57726ynp.setParams(c57689ynE.EZpvd(i, c57689ynE.AYXKKw, C57689ynE.this.OLrzqt));
                        return;
                    }
                    return;
                }
                OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.WARN, "WebView height update skipped, new height will be used once it is displayed.");
            }
        });
    }

    public void EZpvd(android.app.Activity activity) {
        this.EZpvd = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.AuCTel);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParamsOLrzqt = this.djBIcL ? OLrzqt() : null;
        WebViewManager.Position position = this.AYXKKw;
        AEQbTJ(position, layoutParams, layoutParamsOLrzqt, EZpvd(this.AuCTel, position, this.OLrzqt));
    }

    public final int djBIcL() {
        return C57823ypg.EZpvd(this.EZpvd);
    }

    /* JADX INFO: renamed from: o.ynE$9, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass9 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[WebViewManager.Position.values().length];
            KWHzl = iArr;
            try {
                iArr[WebViewManager.Position.TOP_BANNER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                KWHzl[WebViewManager.Position.BOTTOM_BANNER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                KWHzl[WebViewManager.Position.CENTER_MODAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                KWHzl[WebViewManager.Position.FULL_SCREEN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public final RelativeLayout.LayoutParams OLrzqt() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.fJNWhG, -1);
        int i = AnonymousClass9.KWHzl[this.AYXKKw.ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (i == 3 || i == 4) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C57726ynp.Application EZpvd(int i, WebViewManager.Position position, boolean z) {
        int i2;
        C57726ynp.Application application = new C57726ynp.Application();
        application.AhwBna = this.DbNXlk;
        application.djBIcL = this.fetchVPNInfo;
        application.copydefault = z;
        application.gEmmrt = i;
        application.AYXKKw = djBIcL();
        int i3 = AnonymousClass9.KWHzl[position.ordinal()];
        if (i3 == 1) {
            i2 = this.fetchVPNInfo - AEQbTJ;
        } else if (i3 == 2) {
            application.values = djBIcL() - i;
            i2 = this.AkhnZx + AEQbTJ;
        } else {
            if (i3 == 3) {
                int iDjBIcL = (djBIcL() / 2) - (i / 2);
                application.OLrzqt = AEQbTJ + iDjBIcL;
                application.djBIcL = iDjBIcL;
                application.values = iDjBIcL;
            } else if (i3 == 4) {
                i = djBIcL() - (this.AkhnZx + this.fetchVPNInfo);
                application.gEmmrt = i;
                int iDjBIcL2 = (djBIcL() / 2) - (i / 2);
                application.OLrzqt = AEQbTJ + iDjBIcL2;
                application.djBIcL = iDjBIcL2;
                application.values = iDjBIcL2;
            }
            application.KWHzl = position == WebViewManager.Position.TOP_BANNER ? 0 : 1;
            return application;
        }
        application.OLrzqt = i2;
        application.KWHzl = position == WebViewManager.Position.TOP_BANNER ? 0 : 1;
        return application;
    }

    public final void AEQbTJ(final WebViewManager.Position position, final RelativeLayout.LayoutParams layoutParams, final RelativeLayout.LayoutParams layoutParams2, final C57726ynp.Application application) {
        OSUtils.EZpvd(new java.lang.Runnable() { // from class: o.ynE.5
            @Override // java.lang.Runnable
            public void run() {
                if (C57689ynE.this.iwGUEr == null) {
                    return;
                }
                C57689ynE.this.iwGUEr.setLayoutParams(layoutParams);
                android.content.Context applicationContext = C57689ynE.this.EZpvd.getApplicationContext();
                C57689ynE.this.copydefault(applicationContext, layoutParams2, application);
                C57689ynE.this.AEQbTJ(applicationContext);
                C57689ynE c57689ynE = C57689ynE.this;
                c57689ynE.EZpvd(c57689ynE.ejfBZ);
                if (C57689ynE.this.fARcdN != null) {
                    C57689ynE c57689ynE2 = C57689ynE.this;
                    c57689ynE2.KWHzl(position, c57689ynE2.valueOf, C57689ynE.this.ejfBZ);
                }
                C57689ynE.this.AhwBna();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout) {
        boolean z = this.djBIcL;
        int i = 1;
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) relativeLayout, z ? -1 : this.fJNWhG, z ? -1 : -2, true);
        this.getFieldNames = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.getFieldNames.setTouchable(true);
        this.getFieldNames.setClippingEnabled(false);
        if (this.djBIcL) {
            i = 0;
        } else {
            int i2 = AnonymousClass9.KWHzl[this.AYXKKw.ordinal()];
            if (i2 == 1) {
                i = 49;
            } else if (i2 == 2) {
                i = 81;
            } else if (i2 != 3 && i2 != 4) {
            }
        }
        PopupWindowCompat.setWindowLayoutType(this.getFieldNames, this.fIwbmz.djBIcL() ? 1000 : 1003);
        this.getFieldNames.showAtLocation(this.EZpvd.getWindow().getDecorView().getRootView(), i, 0, 0);
    }

    public final void AEQbTJ(android.content.Context context) {
        android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(context);
        this.ejfBZ = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.ejfBZ.setClipChildren(false);
        this.ejfBZ.setClipToPadding(false);
        this.ejfBZ.addView(this.valueOf);
    }

    public final void copydefault(android.content.Context context, RelativeLayout.LayoutParams layoutParams, C57726ynp.Application application) {
        C57726ynp c57726ynp = new C57726ynp(context);
        this.valueOf = c57726ynp;
        if (layoutParams != null) {
            c57726ynp.setLayoutParams(layoutParams);
        }
        this.valueOf.setParams(application);
        this.valueOf.setListener(new C57726ynp.StateListAnimator() { // from class: o.ynE.4
            @Override // o.C57726ynp.StateListAnimator
            public void OLrzqt() {
                if (C57689ynE.this.fARcdN != null) {
                    C57689ynE.this.fARcdN.EZpvd();
                }
                C57689ynE.this.OLrzqt((WebViewManager.ActionBar) null);
            }

            @Override // o.C57726ynp.StateListAnimator
            public void copydefault() {
                C57689ynE.this.isConnected = true;
            }

            @Override // o.C57726ynp.StateListAnimator
            public void AEQbTJ() {
                C57689ynE.this.isConnected = false;
            }
        });
        if (this.iwGUEr.getParent() != null) {
            ((android.view.ViewGroup) this.iwGUEr.getParent()).removeAllViews();
        }
        CardView cardViewKWHzl = KWHzl(context);
        cardViewKWHzl.setTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        cardViewKWHzl.addView(this.iwGUEr);
        this.valueOf.setPadding(this.values, this.fetchVPNInfo, this.DbNXlk, this.AkhnZx);
        this.valueOf.setClipChildren(false);
        this.valueOf.setClipToPadding(false);
        this.valueOf.addView(cardViewKWHzl);
    }

    public final CardView KWHzl(android.content.Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.AYXKKw == WebViewManager.Position.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        cardView.setCardElevation(C57823ypg.copydefault(5));
        cardView.setRadius(C57823ypg.copydefault(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    public final void AhwBna() {
        if (this.AhwBna > AudioStats.AUDIO_AMPLITUDE_NONE && this.hDKMBd == null) {
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: o.ynE.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C57689ynE.this.fARcdN != null) {
                        C57689ynE.this.fARcdN.EZpvd();
                    }
                    if (C57689ynE.this.EZpvd == null) {
                        C57689ynE.this.getNewProxyInstance = true;
                    } else {
                        C57689ynE.this.KWHzl((WebViewManager.ActionBar) null);
                        C57689ynE.this.hDKMBd = null;
                    }
                }
            };
            this.hDKMBd = runnable;
            this.gEmmrt.postDelayed(runnable, ((long) this.AhwBna) * 1000);
        }
    }

    public final void KWHzl(final android.app.Activity activity) {
        if (C57823ypg.valueOf(activity) && this.ejfBZ == null) {
            EZpvd(activity);
        } else {
            new android.os.Handler().postDelayed(new java.lang.Runnable() { // from class: o.ynE.1
                @Override // java.lang.Runnable
                public void run() {
                    C57689ynE.this.KWHzl(activity);
                }
            }, 200L);
        }
    }

    public void KWHzl(@androidx.annotation.Nullable WebViewManager.ActionBar actionBar) {
        C57726ynp c57726ynp = this.valueOf;
        if (c57726ynp == null) {
            OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new java.lang.Throwable());
            copydefault();
            if (actionBar != null) {
                actionBar.KWHzl();
                return;
            }
            return;
        }
        c57726ynp.OLrzqt();
        OLrzqt(actionBar);
    }

    public final void OLrzqt(final WebViewManager.ActionBar actionBar) {
        OSUtils.copydefault(new java.lang.Runnable() { // from class: o.ynE.8
            @Override // java.lang.Runnable
            public void run() {
                if (!C57689ynE.this.djBIcL || C57689ynE.this.ejfBZ == null) {
                    C57689ynE.this.AEQbTJ();
                    WebViewManager.ActionBar actionBar2 = actionBar;
                    if (actionBar2 != null) {
                        actionBar2.KWHzl();
                        return;
                    }
                    return;
                }
                C57689ynE c57689ynE = C57689ynE.this;
                c57689ynE.copydefault(c57689ynE.ejfBZ, actionBar);
            }
        }, 600);
    }

    public final void AEQbTJ() {
        AYXKKw();
        StateListAnimator stateListAnimator = this.fARcdN;
        if (stateListAnimator != null) {
            stateListAnimator.copydefault();
        }
    }

    public void AYXKKw() {
        OneSignal.AEQbTJ(OneSignal.LOG_LEVEL.DEBUG, "InAppMessageView removing views");
        java.lang.Runnable runnable = this.hDKMBd;
        if (runnable != null) {
            this.gEmmrt.removeCallbacks(runnable);
            this.hDKMBd = null;
        }
        C57726ynp c57726ynp = this.valueOf;
        if (c57726ynp != null) {
            c57726ynp.removeAllViews();
        }
        android.widget.PopupWindow popupWindow = this.getFieldNames;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        copydefault();
    }

    public final void KWHzl(WebViewManager.Position position, android.view.View view, android.view.View view2) {
        CardView cardView = (CardView) view.findViewWithTag("IN_APP_MESSAGE_CARD_VIEW_TAG");
        Animation.AnimationListener animationListenerKWHzl = KWHzl(cardView);
        int i = AnonymousClass9.KWHzl[position.ordinal()];
        if (i == 1) {
            OLrzqt(cardView, this.iwGUEr.getHeight(), animationListenerKWHzl);
            return;
        }
        if (i == 2) {
            KWHzl(cardView, this.iwGUEr.getHeight(), animationListenerKWHzl);
        } else if (i == 3 || i == 4) {
            KWHzl(view, view2, animationListenerKWHzl, null);
        }
    }

    public final Animation.AnimationListener KWHzl(final CardView cardView) {
        return new Animation.AnimationListener() { // from class: o.ynE.6
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(android.view.animation.Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(android.view.animation.Animation animation) {
                if (C57689ynE.this.fARcdN != null) {
                    C57689ynE.this.fARcdN.OLrzqt();
                }
            }
        };
    }

    public final void OLrzqt(android.view.View view, int i, Animation.AnimationListener animationListener) {
        C57824yph.EZpvd(view, (-i) - this.fetchVPNInfo, 0.0f, 1000, new InterpolatorC57832ypp(0.1d, 8.0d), animationListener).start();
    }

    public final void KWHzl(android.view.View view, int i, Animation.AnimationListener animationListener) {
        C57824yph.EZpvd(view, i + this.AkhnZx, 0.0f, 1000, new InterpolatorC57832ypp(0.1d, 8.0d), animationListener).start();
    }

    public final void KWHzl(android.view.View view, android.view.View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        android.view.animation.Animation animationOLrzqt = C57824yph.OLrzqt(view, 1000, new InterpolatorC57832ypp(0.1d, 8.0d), animationListener);
        android.animation.ValueAnimator valueAnimatorCopydefault = copydefault(view2, 400, copydefault, KWHzl, animatorListener);
        animationOLrzqt.start();
        valueAnimatorCopydefault.start();
    }

    public final void copydefault(android.view.View view, final WebViewManager.ActionBar actionBar) {
        copydefault(view, 400, KWHzl, copydefault, new android.animation.AnimatorListenerAdapter() { // from class: o.ynE.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                C57689ynE.this.AEQbTJ();
                WebViewManager.ActionBar actionBar2 = actionBar;
                if (actionBar2 != null) {
                    actionBar2.KWHzl();
                }
            }
        }).start();
    }

    public final android.animation.ValueAnimator copydefault(android.view.View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        return C57824yph.KWHzl(view, i, i2, i3, animatorListener);
    }

    public java.lang.String toString() {
        return "InAppMessageView{currentActivity=" + this.EZpvd + ", pageWidth=" + this.fJNWhG + ", pageHeight=" + this.AuCTel + ", displayDuration=" + this.AhwBna + ", hasBackground=" + this.djBIcL + ", shouldDismissWhenActive=" + this.getNewProxyInstance + ", isDragging=" + this.isConnected + ", disableDragDismiss=" + this.OLrzqt + ", displayLocation=" + this.AYXKKw + ", webView=" + this.iwGUEr + AbstractJsonLexerKt.END_OBJ;
    }
}
