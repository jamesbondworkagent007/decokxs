package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.dLX;

/* JADX INFO: renamed from: o.dMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13477dMu extends AbstractC13478dMv {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
    public long djBIcL;
    public final ConstraintLayout isConnected;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(dLX.Application.isConnected, 1);
        sparseIntArray.put(dLX.Application.fFgQHt, 2);
        sparseIntArray.put(dLX.Application.fjfviF, 3);
        sparseIntArray.put(dLX.Application.dmfpNf, 4);
        sparseIntArray.put(dLX.Application.DLWbHP, 5);
        sparseIntArray.put(dLX.Application.OBJEWx, 6);
        sparseIntArray.put(dLX.Application.OHqIaq, 7);
    }

    public C13477dMu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, valueOf));
    }

    public C13477dMu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYC) objArr[1], (wYC) objArr[2], (wYC) objArr[6], (android.widget.TextView) objArr[4], (android.view.View) objArr[7], (wYC) objArr[5], (android.widget.FrameLayout) objArr[3]);
        this.djBIcL = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
