package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36040oNa extends AbstractC36043oNd {
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public static final android.util.SparseIntArray djBIcL;
    public final ConstraintLayout AYXKKw;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.GGlJim, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.getVolumeControl, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.getMediaMetadata, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.idLUrz, 4);
    }

    public C36040oNa(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, copydefault, djBIcL));
    }

    public C36040oNa(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (android.view.View) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
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
