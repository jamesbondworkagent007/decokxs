package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16346eiG extends AbstractC16345eiF {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long djBIcL;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 1);
        sparseIntArray.put(C13754dXa.ActionBar.QYvkLl, 2);
        sparseIntArray.put(C13754dXa.ActionBar.AnimRes, 3);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsTakeVideo, 4);
        sparseIntArray.put(C13754dXa.ActionBar.sTzBva, 5);
        sparseIntArray.put(C13754dXa.ActionBar.tIwhY, 6);
        sparseIntArray.put(C13754dXa.ActionBar.aVhqwO, 7);
    }

    public C16346eiG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, valueOf));
    }

    public C16346eiG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[5], (C52794wYp) objArr[6], (wYK) objArr[7], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.djBIcL = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
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
