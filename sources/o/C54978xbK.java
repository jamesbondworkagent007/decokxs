package o;

import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xbK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54978xbK {
    public boolean AEQbTJ;
    public LifecycleOwner AYXKKw;
    public StateListAnimator AhwBna;
    public android.view.View EZpvd;
    public java.util.Set<android.view.View> KWHzl;
    public android.app.Activity OLrzqt;
    public int copydefault;
    public boolean djBIcL;
    public WindowManager.LayoutParams gEmmrt;
    public android.view.WindowManager valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<android.view.View> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View OLrzqt() {
        return this.EZpvd;
    }

    public C54978xbK(@NotNull android.app.Activity activity, android.view.View view, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.OLrzqt = activity;
        this.EZpvd = view;
        this.AYXKKw = lifecycleOwner;
        this.KWHzl = new LinkedHashSet();
        this.djBIcL = true;
        this.AhwBna = new StateListAnimator();
        copydefault();
        EZpvd();
        AEQbTJ();
    }

    public final void copydefault(java.util.Set<android.view.View> set) {
        this.KWHzl = set;
        AEQbTJ();
    }

    /* JADX INFO: renamed from: o.xbK$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC59496ziD {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC59496ziD
        public void OLrzqt(boolean z) {
            android.view.Window window;
            android.view.View decorView;
            android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            if (activityAEQbTJ == null || (window = activityAEQbTJ.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            int height = decorView.getHeight();
            android.graphics.Rect rect = new android.graphics.Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int i = height - rect.bottom;
            C54978xbK.this.AEQbTJ = z;
            C54978xbK.this.copydefault = i;
            if (C54978xbK.this.djBIcL) {
                C54978xbK.this.copydefault(i, z);
            } else if (C54978xbK.this.KWHzl() != null) {
                java.util.Set<android.view.View> setKWHzl = C54978xbK.this.KWHzl();
                Intrinsics.copydefault(setKWHzl);
                java.util.Iterator<android.view.View> it = setKWHzl.iterator();
                while (it.hasNext()) {
                    if (it.next().hasFocus()) {
                        C54978xbK.this.copydefault(i, z);
                    }
                }
            }
            if (z) {
                return;
            }
            android.view.View viewOLrzqt = C54978xbK.this.OLrzqt();
            if (viewOLrzqt != null) {
                viewOLrzqt.setVisibility(8);
            }
            WindowManager.LayoutParams layoutParams = C54978xbK.this.gEmmrt;
            if (layoutParams != null) {
                layoutParams.alpha = 0.0f;
            }
        }
    }

    public final void gEmmrt() {
        java.util.Set<android.view.View> set = this.KWHzl;
        if (set != null) {
            set.clear();
        }
        OLrzqt(true);
        this.EZpvd = null;
        copydefault((java.util.Set<android.view.View>) null);
    }

    public final void copydefault() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.token = this.OLrzqt.getWindow().getDecorView().getWindowToken();
        layoutParams.type = 1000;
        layoutParams.format = 1;
        layoutParams.flags = 8;
        layoutParams.gravity = 80;
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.alpha = 0.0f;
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.gEmmrt = layoutParams;
        java.lang.Object systemService = this.OLrzqt.getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        this.valueOf = (android.view.WindowManager) systemService;
    }

    public final void EZpvd() {
        Lifecycle lifecycle;
        if (this.AYXKKw != null) {
            final InterfaceC59495ziC interfaceC59495ziCCopydefault = C59541ziw.AEQbTJ.copydefault(this.OLrzqt, this.AhwBna);
            LifecycleOwner lifecycleOwner = this.AYXKKw;
            if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
                return;
            }
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.okinc.uilab.edit.SoftKeyboardFloatWindowHelper$initListener$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                    Intrinsics.checkNotNullParameter(event, "");
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycleOwner2.getLifecycle().removeObserver(this);
                        interfaceC59495ziCCopydefault.copydefault();
                        this.gEmmrt();
                    }
                }
            });
            return;
        }
        C59541ziw.KWHzl(this.OLrzqt, this.AhwBna);
    }

    public final void AEQbTJ() {
        java.util.Set<android.view.View> set = this.KWHzl;
        this.djBIcL = set == null || (set != null && set.size() == 0);
        java.util.Set<android.view.View> set2 = this.KWHzl;
        if (set2 != null) {
            for (android.view.View view : set2) {
                view.setOnFocusChangeListener(new ViewOnFocusChangeListenerC54998xbe(view.getOnFocusChangeListener(), new Activity()));
            }
        }
    }

    /* JADX INFO: renamed from: o.xbK$Activity */
    public static final class Activity implements View.OnFocusChangeListener {
        public Activity() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View view, boolean z) {
            if (C54978xbK.this.KWHzl() != null) {
                java.util.Set<android.view.View> setKWHzl = C54978xbK.this.KWHzl();
                if (setKWHzl == null || setKWHzl.size() != 0) {
                    if (z && C54978xbK.this.AEQbTJ) {
                        C54978xbK c54978xbK = C54978xbK.this;
                        c54978xbK.copydefault(c54978xbK.copydefault, true);
                        return;
                    }
                    if (C54978xbK.this.KWHzl() != null) {
                        java.util.Set<android.view.View> setKWHzl2 = C54978xbK.this.KWHzl();
                        Intrinsics.copydefault(setKWHzl2);
                        java.util.Iterator<android.view.View> it = setKWHzl2.iterator();
                        while (it.hasNext()) {
                            if (it.next().isFocused()) {
                                return;
                            }
                        }
                    }
                    C54978xbK.this.OLrzqt(true);
                }
            }
        }
    }

    public final void copydefault(int i) {
        android.view.View view = this.EZpvd;
        if (view != null) {
            if ((view != null ? view.getParent() : null) == null) {
                WindowManager.LayoutParams layoutParams = this.gEmmrt;
                if (layoutParams != null) {
                    layoutParams.y = i;
                }
                android.view.WindowManager windowManager = this.valueOf;
                if (windowManager != null) {
                    windowManager.addView(this.EZpvd, layoutParams);
                }
            }
        }
    }

    public final void EZpvd(int i) {
        android.view.View view = this.EZpvd;
        if (view != null) {
            if ((view != null ? view.getParent() : null) != null) {
                WindowManager.LayoutParams layoutParams = this.gEmmrt;
                if (layoutParams != null) {
                    layoutParams.alpha = 1.0f;
                    layoutParams.y = i;
                }
                android.view.WindowManager windowManager = this.valueOf;
                if (windowManager != null) {
                    windowManager.updateViewLayout(this.EZpvd, layoutParams);
                }
            }
        }
    }

    public final void OLrzqt(boolean z) {
        android.view.View view = this.EZpvd;
        if (view != null) {
            if ((view != null ? view.getParent() : null) != null) {
                WindowManager.LayoutParams layoutParams = this.gEmmrt;
                if (layoutParams != null) {
                    layoutParams.alpha = 0.0f;
                }
                if (z) {
                    android.view.WindowManager windowManager = this.valueOf;
                    if (windowManager != null) {
                        windowManager.removeView(this.EZpvd);
                        return;
                    }
                    return;
                }
                android.view.View view2 = this.EZpvd;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
    }

    public final void copydefault(int i, boolean z) {
        android.view.View view = this.EZpvd;
        if (view != null) {
            view.setVisibility(0);
        }
        copydefault(i);
        if (z) {
            EZpvd(i);
        } else {
            OLrzqt(true);
        }
    }
}
