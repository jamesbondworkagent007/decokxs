package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public class oPB extends oPA {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final ConstraintLayout AhwBna;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.gGNlxh, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.isAvailable, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatItemReceiver, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatCustomActionResultReceiver, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.UvfnWv, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.UkuJRw, 6);
    }

    public oPB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, djBIcL, AYXKKw));
    }

    public oPB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[5], (pAP) objArr[4], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
