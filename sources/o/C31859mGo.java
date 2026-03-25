package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.mDC;

/* JADX INFO: renamed from: o.mGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31859mGo extends AbstractC31862mGr {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.AhwBna, 1);
        sparseIntArray.put(mDC.ActionBar.DGOPHZ, 2);
        sparseIntArray.put(mDC.ActionBar.sTzBva, 3);
        sparseIntArray.put(mDC.ActionBar.accept, 4);
        sparseIntArray.put(mDC.ActionBar.DXXBbs, 5);
        sparseIntArray.put(mDC.ActionBar.QbewEr, 6);
        sparseIntArray.put(mDC.ActionBar.QKVWgx, 7);
    }

    public C31859mGo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, AhwBna));
    }

    public C31859mGo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (C52794wYp) objArr[7], (android.widget.TextView) objArr[6], (ConstraintLayout) objArr[0], (ConstraintLayout) objArr[4], (RecyclerView) objArr[5], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3]);
        this.isConnected = -1L;
        this.copydefault.setTag(null);
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
