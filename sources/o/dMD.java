package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public class dMD extends dMB {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
    public final NestedScrollView AkhnZx;
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
        values = sparseIntArray;
        sparseIntArray.put(dLX.Application.DCUTEIddSDPG, 1);
        sparseIntArray.put(dLX.Application.hUfVAv, 2);
        sparseIntArray.put(dLX.Application.QIZEnU, 3);
        sparseIntArray.put(dLX.Application.dNCPSb, 4);
        sparseIntArray.put(dLX.Application.DGgnkA, 5);
        sparseIntArray.put(dLX.Application.aHXSQp, 6);
        sparseIntArray.put(dLX.Application.RXzakW, 7);
        sparseIntArray.put(dLX.Application.DGOPHZDGOPHZ, 8);
        sparseIntArray.put(dLX.Application.DGUQLI, 9);
        sparseIntArray.put(dLX.Application.DXXBbs, 10);
        sparseIntArray.put(dLX.Application.RdAHlO, 11);
    }

    public dMD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fetchVPNInfo, values));
    }

    public dMD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[4], (wYC) objArr[2], (android.view.View) objArr[10], (RecyclerView) objArr[11], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.ImageView) objArr[6]);
        this.DbNXlk = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.AkhnZx = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
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
