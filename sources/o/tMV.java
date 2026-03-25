package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public class tMV extends tMW {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long gEmmrt;

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
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPfvRMlC, 3);
        sparseIntArray.put(C47501trL.TaskDescription.aJFbMH, 4);
        sparseIntArray.put(C47501trL.TaskDescription.dNxZaP, 5);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPdNQGVJ, 6);
    }

    public tMV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, AYXKKw));
    }

    public tMV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[4], (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.gEmmrt = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
