package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.buysell.ui.quickconvert.QuickConvertViewModel;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31542lvw extends AbstractC31540lvu {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable QuickConvertViewModel quickConvertViewModel) {
        this.KWHzl = quickConvertViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.USBtdM, 1);
        sparseIntArray.put(C31351lsQ.Application.DwQSDd, 2);
        sparseIntArray.put(C31351lsQ.Application.OAUGar, 3);
        sparseIntArray.put(C31351lsQ.Application.UCQKYV, 4);
        sparseIntArray.put(C31351lsQ.Application.QWpYiD, 5);
    }

    public C31542lvw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AYXKKw, gEmmrt));
    }

    public C31542lvw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[0], (ConstraintLayout) objArr[1], (LottieAnimationView) objArr[2], (C52794wYp) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.AhwBna = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C31350lsP.OLrzqt != i) {
            return false;
        }
        copydefault((QuickConvertViewModel) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
