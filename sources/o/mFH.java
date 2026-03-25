package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFH extends mFF {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public long copydefault;
    public final NestedScrollView djBIcL;

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
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.DIIpTV, 1);
        sparseIntArray.put(mDC.ActionBar.zlvcHA, 2);
    }

    public mFH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, AEQbTJ));
    }

    public mFH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1]);
        this.copydefault = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.djBIcL = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.copydefault = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.copydefault != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.copydefault = 0L;
        }
    }
}
