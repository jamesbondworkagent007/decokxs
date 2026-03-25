package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public class tMT extends tMS {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long djBIcL;

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
        sparseIntArray.put(C47501trL.TaskDescription.ggKfIT, 1);
        sparseIntArray.put(C47501trL.TaskDescription.dpErvT, 2);
        sparseIntArray.put(C47501trL.TaskDescription.QsIRgs, 3);
        sparseIntArray.put(C47501trL.TaskDescription.dSJNDS, 4);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPfvRMlC, 5);
        sparseIntArray.put(C47501trL.TaskDescription.QUSxYX, 6);
    }

    public tMT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, AYXKKw));
    }

    public tMT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[6], (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[1], (Barrier) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[2]);
        this.djBIcL = -1L;
        this.copydefault.setTag(null);
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
