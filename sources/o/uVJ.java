package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uVJ extends uVI {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray values;
    public final NestedScrollView DbNXlk;
    public long isConnected;

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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.hvKCwS, 1);
        sparseIntArray.put(C48033uCm.Application.updateStateFromTypedArray, 2);
        sparseIntArray.put(C48033uCm.Application.zLjUOn, 3);
        sparseIntArray.put(C48033uCm.Application.canApplyTheme, 4);
        sparseIntArray.put(C48033uCm.Application.QbewEr, 5);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleHoneycomb, 6);
        sparseIntArray.put(C48033uCm.Application.hwXsuq, 7);
        sparseIntArray.put(C48033uCm.Application.FYtjSf, 8);
        sparseIntArray.put(C48033uCm.Application.applyTheme, 9);
        sparseIntArray.put(C48033uCm.Application.onMenuItemClick, 10);
    }

    public uVJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, AkhnZx, values));
    }

    public uVJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[3], (ConstraintLayout) objArr[5], (RecyclerView) objArr[1], (android.widget.LinearLayout) objArr[8], (wUX) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[10], (android.view.View) objArr[2], (android.view.View) objArr[4], (android.view.View) objArr[9]);
        this.isConnected = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.DbNXlk = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
