package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rxl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43888rxl extends AbstractC43887rxk {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AYXKKw;

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
        sparseIntArray.put(C43662rtX.ActionBar.DKtBnz, 1);
        sparseIntArray.put(C43662rtX.ActionBar.dUDNAs, 2);
        sparseIntArray.put(C43662rtX.ActionBar.UrRBLY, 3);
        sparseIntArray.put(C43662rtX.ActionBar.aVhqwO, 4);
        sparseIntArray.put(C43662rtX.ActionBar.RgLUBD, 5);
    }

    public C43888rxl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, AhwBna));
    }

    public C43888rxl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[0], (android.widget.LinearLayout) objArr[3], (C55258xgZ) objArr[1], (C52794wYp) objArr[5], (C52794wYp) objArr[4]);
        this.AYXKKw = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
