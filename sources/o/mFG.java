package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFG extends mFI {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long djBIcL;
    public final android.widget.LinearLayout valueOf;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.gasjUx, 1);
        sparseIntArray.put(mDC.ActionBar.DaRZkR, 2);
        sparseIntArray.put(mDC.ActionBar.dvImUD, 3);
        sparseIntArray.put(mDC.ActionBar.fLIjIY, 4);
        sparseIntArray.put(mDC.ActionBar.fXHmeK, 5);
    }

    public mFG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, gEmmrt));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mFG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[1];
        mFL mflEZpvd = obj != null ? mFL.EZpvd((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[2];
        mFL mflEZpvd2 = obj2 != null ? mFL.EZpvd((android.view.View) obj2) : null;
        java.lang.Object obj3 = objArr[3];
        super(dataBindingComponent, view, 0, mflEZpvd, mflEZpvd2, obj3 != null ? mFL.EZpvd((android.view.View) obj3) : null, (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5]);
        this.djBIcL = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.valueOf = linearLayout;
        linearLayout.setTag(null);
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
