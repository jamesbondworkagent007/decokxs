package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48436uRi extends AbstractC48438uRk {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray AYXKKw;
    public long AhwBna;
    public final ConstraintLayout gEmmrt;

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
        sparseIntArray.put(C48033uCm.Application.updateForNightMode, 1);
        sparseIntArray.put(C48033uCm.Application.iflRwn, 2);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplApi24Impl, 3);
        sparseIntArray.put(C48033uCm.Application.setSingleChoiceItems, 4);
    }

    public C48436uRi(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AEQbTJ, AYXKKw));
    }

    public C48436uRi(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[3]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
