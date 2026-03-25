package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50906vcw extends AbstractC50905vcv {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long DbNXlk;
    public final ConstraintLayout values;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatApi23, 1);
        sparseIntArray.put(C48033uCm.Application.getActions, 2);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatApi24CallbackProxy, 3);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatApi24, 4);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplPanelFeatureState, 5);
        sparseIntArray.put(C48033uCm.Application.ActivityViewModelLazyKtviewModels3, 6);
        sparseIntArray.put(C48033uCm.Application.NavItemSelectedListener, 7);
        sparseIntArray.put(C48033uCm.Application.hOMIpD, 8);
    }

    public C50906vcw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, gEmmrt));
    }

    public C50906vcw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYF) objArr[8], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (RecyclerView) objArr[6], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
