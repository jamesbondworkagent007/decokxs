package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17074evt extends AbstractC17075evu {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public final ConstraintLayout AYXKKw;
    public final ConstraintLayout AkhnZx;
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
        sparseIntArray.put(C13754dXa.ActionBar.ManagedActivityResultLauncher, 4);
        sparseIntArray.put(C13754dXa.ActionBar.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1, 5);
        sparseIntArray.put(C13754dXa.ActionBar.fromInclusive, 6);
        sparseIntArray.put(C13754dXa.ActionBar.from, 7);
    }

    public C17074evt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 8, AhwBna, djBIcL));
    }

    public C17074evt(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[6]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.AkhnZx = constraintLayout2;
        constraintLayout2.setTag(null);
        this.KWHzl.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(viewArr);
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
