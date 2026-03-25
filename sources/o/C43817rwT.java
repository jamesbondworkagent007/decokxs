package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43817rwT extends AbstractC43814rwQ {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray KWHzl;
    public long AEQbTJ;
    public final android.widget.LinearLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable rIB rib) {
        this.copydefault = rib;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        KWHzl = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.AuCTelauCTel, 1);
    }

    public C43817rwT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, EZpvd, KWHzl));
    }

    public C43817rwT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55097xdX) objArr[1]);
        this.AEQbTJ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.gEmmrt = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AEQbTJ = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AEQbTJ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C43664rtZ.AEQbTJ != i) {
            return false;
        }
        EZpvd((rIB) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AEQbTJ = 0L;
        }
    }
}
