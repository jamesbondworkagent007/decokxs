package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C44105sDn;

/* JADX INFO: loaded from: classes10.dex */
public class sDL extends sDI {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long DbNXlk;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C44105sDn.ActionBar.sSMYrx, 2);
        sparseIntArray.put(C44105sDn.ActionBar.gHZMYf, 3);
        sparseIntArray.put(C44105sDn.ActionBar.OcIXYQ, 4);
        sparseIntArray.put(C44105sDn.ActionBar.ORxRYg, 5);
        sparseIntArray.put(C44105sDn.ActionBar.KWHzl, 6);
        sparseIntArray.put(C44105sDn.ActionBar.QUSxYX, 7);
        sparseIntArray.put(C44105sDn.ActionBar.getFieldNames, 8);
    }

    public sDL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 9, valueOf, fetchVPNInfo));
    }

    public sDL(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (android.widget.FrameLayout) objArr[6], (android.widget.ImageView) objArr[8], (android.widget.LinearLayout) objArr[0], (android.widget.FrameLayout) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.ImageView) objArr[5], (CardView) objArr[4], (android.widget.ImageView) objArr[7]);
        this.DbNXlk = -1L;
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
