package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33961nMg extends AbstractC33963nMi {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.hTAtCx, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.getSessionID, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.hOMIpD, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialdPnHjp, 4);
    }

    public C33961nMg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, gEmmrt, AhwBna));
    }

    public C33961nMg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.valueOf = -1L;
        this.EZpvd.setTag(null);
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
