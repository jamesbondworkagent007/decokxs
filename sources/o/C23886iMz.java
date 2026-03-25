package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23886iMz extends AbstractC23883iMw {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray KWHzl;
    public long copydefault;
    public final android.widget.HorizontalScrollView valueOf;

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
        KWHzl = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.cancelAll, 2);
    }

    public C23886iMz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 3, AEQbTJ, KWHzl));
    }

    public C23886iMz(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.LinearLayout) objArr[2], (C55258xgZ) objArr[0]);
        this.copydefault = -1L;
        android.widget.HorizontalScrollView horizontalScrollView = (android.widget.HorizontalScrollView) objArr[1];
        this.valueOf = horizontalScrollView;
        horizontalScrollView.setTag(null);
        this.OLrzqt.setTag(null);
        setRootTag(viewArr);
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
