package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import o.C5332Nq;

/* JADX INFO: renamed from: o.Sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public abstract class AbstractC5461Sp<T extends android.view.View, Z> extends AbstractC5453Sh<Z> {
    public static boolean EZpvd;
    public static int OLrzqt = C5332Nq.StateListAnimator.OLrzqt;
    public View.OnAttachStateChangeListener AEQbTJ;
    public boolean AhwBna;
    public boolean djBIcL;
    public final T gEmmrt;
    public final StateListAnimator valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T KWHzl() {
        return this.gEmmrt;
    }

    public AbstractC5461Sp(@androidx.annotation.NonNull T t) {
        this.gEmmrt = (T) SE.OLrzqt(t);
        this.valueOf = new StateListAnimator(t);
    }

    @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void KWHzl(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        super.KWHzl(drawable);
        EZpvd();
    }

    public final void EZpvd() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.AEQbTJ;
        if (onAttachStateChangeListener == null || this.AhwBna) {
            return;
        }
        this.gEmmrt.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.AhwBna = true;
    }

    public final void AEQbTJ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.AEQbTJ;
        if (onAttachStateChangeListener == null || !this.AhwBna) {
            return;
        }
        this.gEmmrt.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.AhwBna = false;
    }

    @Override // o.InterfaceC5462Sq
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
        this.valueOf.copydefault(interfaceC5457Sl);
    }

    @Override // o.InterfaceC5462Sq
    public void EZpvd(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
        this.valueOf.EZpvd(interfaceC5457Sl);
    }

    @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void a_(@androidx.annotation.Nullable android.graphics.drawable.Drawable drawable) {
        super.a_(drawable);
        this.valueOf.AEQbTJ();
        if (this.djBIcL) {
            return;
        }
        AEQbTJ();
    }

    @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
    public void AEQbTJ(@androidx.annotation.Nullable RV rv) {
        EZpvd(rv);
    }

    @Override // o.AbstractC5453Sh, o.InterfaceC5462Sq
    public RV OLrzqt() {
        java.lang.Object objCopydefault = copydefault();
        if (objCopydefault == null) {
            return null;
        }
        if (objCopydefault instanceof RV) {
            return (RV) objCopydefault;
        }
        throw new java.lang.IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public java.lang.String toString() {
        return "Target for: " + this.gEmmrt;
    }

    public final void EZpvd(@androidx.annotation.Nullable java.lang.Object obj) {
        EZpvd = true;
        this.gEmmrt.setTag(OLrzqt, obj);
    }

    public final java.lang.Object copydefault() {
        return this.gEmmrt.getTag(OLrzqt);
    }

    /* JADX INFO: renamed from: o.Sp$StateListAnimator */
    public static final class StateListAnimator {
        public static java.lang.Integer EZpvd;
        public final java.util.List<InterfaceC5457Sl> AEQbTJ = new java.util.ArrayList();
        public final android.view.View KWHzl;
        public TaskDescription OLrzqt;
        public boolean copydefault;

        public final boolean AEQbTJ(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        public StateListAnimator(@androidx.annotation.NonNull android.view.View view) {
            this.KWHzl = view;
        }

        public static int OLrzqt(@androidx.annotation.NonNull android.content.Context context) {
            if (EZpvd == null) {
                android.view.Display defaultDisplay = ((android.view.WindowManager) SE.OLrzqt((android.view.WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                android.graphics.Point point = new android.graphics.Point();
                defaultDisplay.getSize(point);
                EZpvd = java.lang.Integer.valueOf(java.lang.Math.max(point.x, point.y));
            }
            return EZpvd.intValue();
        }

        public final void KWHzl(int i, int i2) {
            java.util.Iterator it = new java.util.ArrayList(this.AEQbTJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC5457Sl) it.next()).OLrzqt(i, i2);
            }
        }

        public void KWHzl() {
            if (this.AEQbTJ.isEmpty()) {
                return;
            }
            int iEZpvd = EZpvd();
            int iOLrzqt = OLrzqt();
            if (copydefault(iEZpvd, iOLrzqt)) {
                KWHzl(iEZpvd, iOLrzqt);
                AEQbTJ();
            }
        }

        public void copydefault(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
            int iEZpvd = EZpvd();
            int iOLrzqt = OLrzqt();
            if (copydefault(iEZpvd, iOLrzqt)) {
                interfaceC5457Sl.OLrzqt(iEZpvd, iOLrzqt);
                return;
            }
            if (!this.AEQbTJ.contains(interfaceC5457Sl)) {
                this.AEQbTJ.add(interfaceC5457Sl);
            }
            if (this.OLrzqt == null) {
                android.view.ViewTreeObserver viewTreeObserver = this.KWHzl.getViewTreeObserver();
                TaskDescription taskDescription = new TaskDescription(this);
                this.OLrzqt = taskDescription;
                viewTreeObserver.addOnPreDrawListener(taskDescription);
            }
        }

        public void EZpvd(@androidx.annotation.NonNull InterfaceC5457Sl interfaceC5457Sl) {
            this.AEQbTJ.remove(interfaceC5457Sl);
        }

        public void AEQbTJ() {
            android.view.ViewTreeObserver viewTreeObserver = this.KWHzl.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.OLrzqt);
            }
            this.OLrzqt = null;
            this.AEQbTJ.clear();
        }

        public final boolean copydefault(int i, int i2) {
            return AEQbTJ(i) && AEQbTJ(i2);
        }

        public final int OLrzqt() {
            int paddingTop = this.KWHzl.getPaddingTop();
            int paddingBottom = this.KWHzl.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.KWHzl.getLayoutParams();
            return AEQbTJ(this.KWHzl.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop + paddingBottom);
        }

        public final int EZpvd() {
            int paddingLeft = this.KWHzl.getPaddingLeft();
            int paddingRight = this.KWHzl.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.KWHzl.getLayoutParams();
            return AEQbTJ(this.KWHzl.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft + paddingRight);
        }

        public final int AEQbTJ(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.copydefault && this.KWHzl.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.KWHzl.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return OLrzqt(this.KWHzl.getContext());
        }

        /* JADX INFO: renamed from: o.Sp$StateListAnimator$TaskDescription */
        public static final class TaskDescription implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<StateListAnimator> AEQbTJ;

            public TaskDescription(@androidx.annotation.NonNull StateListAnimator stateListAnimator) {
                this.AEQbTJ = new WeakReference<>(stateListAnimator);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (android.util.Log.isLoggable("ViewTarget", 2)) {
                    toString();
                }
                StateListAnimator stateListAnimator = this.AEQbTJ.get();
                if (stateListAnimator == null) {
                    return true;
                }
                stateListAnimator.KWHzl();
                return true;
            }
        }
    }
}
