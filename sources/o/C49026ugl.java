package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48931uew;

/* JADX INFO: renamed from: o.ugl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49026ugl extends AbstractC49029ugo {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray AhwBna;
    public long AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable C48937ufB c48937ufB) {
        this.copydefault = c48937ufB;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48931uew.StateListAnimator.aKErDB, 1);
        sparseIntArray.put(C48931uew.StateListAnimator.DarRvM, 2);
    }

    public C49026ugl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, AEQbTJ, AhwBna));
    }

    public C49026ugl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2]);
        this.AYXKKw = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C48927ues.AEQbTJ != i) {
            return false;
        }
        EZpvd((C48937ufB) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
