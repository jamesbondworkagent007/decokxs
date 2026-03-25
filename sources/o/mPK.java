package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C32113mPz;

/* JADX INFO: loaded from: classes8.dex */
public class mPK extends mPH {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C32113mPz.FragmentManager.gHZMYf, 1);
        sparseIntArray.put(C32113mPz.FragmentManager.gwTjWJ, 2);
        sparseIntArray.put(C32113mPz.FragmentManager.zuWLRA, 3);
        sparseIntArray.put(C32113mPz.FragmentManager.EZpvd, 4);
        sparseIntArray.put(C32113mPz.FragmentManager.ffGIBT, 5);
        sparseIntArray.put(C32113mPz.FragmentManager.OuxcSI, 6);
        sparseIntArray.put(C32113mPz.FragmentManager.zsXlph, 7);
    }

    public mPK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, AYXKKw));
    }

    public mPK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[4], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[1], (android.widget.FrameLayout) objArr[0], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.isConnected = -1L;
        this.KWHzl.setTag(null);
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
