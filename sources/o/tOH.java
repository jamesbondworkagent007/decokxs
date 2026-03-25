package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public class tOH extends tOG {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long DbNXlk;
    public final ConstraintLayout values;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C47501trL.TaskDescription.DQzvGN, 1);
        sparseIntArray.put(C47501trL.TaskDescription.unregister, 2);
        sparseIntArray.put(C47501trL.TaskDescription.DWgRXt, 3);
        sparseIntArray.put(C47501trL.TaskDescription.zLAIeZ, 4);
        sparseIntArray.put(C47501trL.TaskDescription.wlaJM, 5);
        sparseIntArray.put(C47501trL.TaskDescription.hDKMBd, 6);
        sparseIntArray.put(C47501trL.TaskDescription.uzCIH, 7);
        sparseIntArray.put(C47501trL.TaskDescription.iwGUEr, 8);
    }

    public tOH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, valueOf));
    }

    public tOH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[8], (android.widget.FrameLayout) objArr[5], (android.widget.LinearLayout) objArr[3], (android.widget.TextView) objArr[4], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[2]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
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
