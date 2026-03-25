package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tPf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46300tPf extends AbstractC46302tPh {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
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
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPQPAeHI, 1);
        sparseIntArray.put(C47501trL.TaskDescription.sendBehavioSecData, 2);
        sparseIntArray.put(C47501trL.TaskDescription.XW, 3);
        sparseIntArray.put(C47501trL.TaskDescription.getSerial, 4);
        sparseIntArray.put(C47501trL.TaskDescription.ikIEnW, 5);
    }

    public C46300tPf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, djBIcL));
    }

    public C46300tPf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[2], (C55251xgS) objArr[3], (C55251xgS) objArr[1], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5]);
        this.valueOf = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
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
