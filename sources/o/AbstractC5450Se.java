package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import o.C5332Nq;

/* JADX INFO: renamed from: o.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5450Se<T extends android.view.View, Z> implements InterfaceC5462Sq<Z> {
    public static final int KWHzl = C5332Nq.StateListAnimator.OLrzqt;
    public View.OnAttachStateChangeListener AEQbTJ;
    public final T AhwBna;
    public boolean EZpvd;
    public boolean OLrzqt;
    public final Application copydefault;

    @Override // o.InterfaceC5441Rv
    public void AYXKKw() {
    }

    @Override // o.InterfaceC5441Rv
    public void AhwBna() {
    }

    public void EZpvd(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
    }

    public abstract void OLrzqt(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable);

    @Override // o.InterfaceC5441Rv
    public void valueOf() {
    }

    public AbstractC5450Se(@androidx.annotation.NonNull T t) {
        this.AhwBna = (T) SE.OLrzqt(t);
        this.copydefault = new Application(t);
    }

    @Override // o.InterfaceC5462Sq
    public final void OLrzqt(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
        this.copydefault.EZpvd(interfaceC5457Sl);
    }

    @Override // o.InterfaceC5462Sq
    public final void EZpvd(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
        this.copydefault.copydefault(interfaceC5457Sl);
    }

    @Override // o.InterfaceC5462Sq
    public final void KWHzl(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        EZpvd();
        EZpvd(drawable);
    }

    @Override // o.InterfaceC5462Sq
    public final void a_(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        this.copydefault.OLrzqt();
        OLrzqt(drawable);
        if (this.EZpvd) {
            return;
        }
        AEQbTJ();
    }

    @Override // o.InterfaceC5462Sq
    public final void AEQbTJ(@androidx.annotation.Nullable RV rv) {
        KWHzl(rv);
    }

    @Override // o.InterfaceC5462Sq
    public final RV OLrzqt() {
        java.lang.Object objCopydefault = copydefault();
        if (objCopydefault == null) {
            return null;
        }
        if (objCopydefault instanceof RV) {
            return (RV) objCopydefault;
        }
        throw new java.lang.IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    public java.lang.String toString() {
        return "Target for: " + this.AhwBna;
    }

    private void KWHzl(@androidx.annotation.Nullable java.lang.Object obj) {
        this.AhwBna.setTag(KWHzl, obj);
    }

    private java.lang.Object copydefault() {
        return this.AhwBna.getTag(KWHzl);
    }

    private void EZpvd() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.AEQbTJ;
        if (onAttachStateChangeListener == null || this.OLrzqt) {
            return;
        }
        this.AhwBna.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.OLrzqt = true;
    }

    private void AEQbTJ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.AEQbTJ;
        if (onAttachStateChangeListener == null || !this.OLrzqt) {
            return;
        }
        this.AhwBna.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.OLrzqt = false;
    }

    /* JADX INFO: renamed from: o.Se$Application */
    public static final class Application {
        public static java.lang.Integer EZpvd;
        public final android.view.View AEQbTJ;
        public boolean KWHzl;
        public ViewTreeObserverOnPreDrawListenerC0805Application OLrzqt;
        public final java.util.List<InterfaceC5457Sl> copydefault = new java.util.ArrayList();

        public final boolean AEQbTJ(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public Application(@androidx.annotation.NonNull android.view.View view) {
            this.AEQbTJ = view;
        }

        public static int EZpvd(@androidx.annotation.NonNull android.content.Context context) {
            if (EZpvd == null) {
                android.view.Display defaultDisplay = ((android.view.WindowManager) SE.OLrzqt((android.view.WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                android.graphics.Point point = new android.graphics.Point();
                defaultDisplay.getSize(point);
                EZpvd = java.lang.Integer.valueOf(java.lang.Math.max(point.x, point.y));
            }
            return EZpvd.intValue();
        }

        public final void EZpvd(int i, int i2) {
            java.util.Iterator it = new java.util.ArrayList(this.copydefault).iterator();
            while (it.hasNext()) {
                ((InterfaceC5457Sl) it.next()).OLrzqt(i, i2);
            }
        }

        public void copydefault() {
            if (this.copydefault.isEmpty()) {
                return;
            }
            int iKWHzl = KWHzl();
            int iAEQbTJ = AEQbTJ();
            if (OLrzqt(iKWHzl, iAEQbTJ)) {
                EZpvd(iKWHzl, iAEQbTJ);
                OLrzqt();
            }
        }

        public void EZpvd(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
            int iKWHzl = KWHzl();
            int iAEQbTJ = AEQbTJ();
            if (OLrzqt(iKWHzl, iAEQbTJ)) {
                interfaceC5457Sl.OLrzqt(iKWHzl, iAEQbTJ);
                return;
            }
            if (!this.copydefault.contains(interfaceC5457Sl)) {
                this.copydefault.add(interfaceC5457Sl);
            }
            if (this.OLrzqt == null) {
                android.view.ViewTreeObserver viewTreeObserver = this.AEQbTJ.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0805Application viewTreeObserverOnPreDrawListenerC0805Application = new ViewTreeObserverOnPreDrawListenerC0805Application(this);
                this.OLrzqt = viewTreeObserverOnPreDrawListenerC0805Application;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0805Application);
            }
        }

        public void copydefault(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
            this.copydefault.remove(interfaceC5457Sl);
        }

        public void OLrzqt() {
            android.view.ViewTreeObserver viewTreeObserver = this.AEQbTJ.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.OLrzqt);
            }
            this.OLrzqt = null;
            this.copydefault.clear();
        }

        public final boolean OLrzqt(int i, int i2) {
            return AEQbTJ(i) && AEQbTJ(i2);
        }

        public final int AEQbTJ() {
            int paddingTop = this.AEQbTJ.getPaddingTop();
            int paddingBottom = this.AEQbTJ.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.getLayoutParams();
            return EZpvd(this.AEQbTJ.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        public final int KWHzl() {
            int paddingLeft = this.AEQbTJ.getPaddingLeft();
            int paddingRight = this.AEQbTJ.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.AEQbTJ.getLayoutParams();
            return EZpvd(this.AEQbTJ.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        public final int EZpvd(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.KWHzl && this.AEQbTJ.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.AEQbTJ.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return EZpvd(this.AEQbTJ.getContext());
        }

        /* JADX INFO: renamed from: o.Se$Application$Application, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0805Application implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<Application> EZpvd;

            public ViewTreeObserverOnPreDrawListenerC0805Application(@androidx.annotation.NonNull Application application) {
                this.EZpvd = new WeakReference<>(application);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (android.util.Log.isLoggable("CustomViewTarget", 2)) {
                    toString();
                }
                Application application = this.EZpvd.get();
                if (application == null) {
                    return true;
                }
                application.copydefault();
                return true;
            }
        }
    }
}
