package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public class tMH extends tMI {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray djBIcL;
    public long isConnected;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C47501trL.TaskDescription.invokespecialROgMPW, 1);
        sparseIntArray.put(C47501trL.TaskDescription.iqMDAV, 2);
        sparseIntArray.put(C47501trL.TaskDescription.dpErvT, 3);
        sparseIntArray.put(C47501trL.TaskDescription.inahnb, 4);
        sparseIntArray.put(C47501trL.TaskDescription.ONJgbh, 5);
        sparseIntArray.put(C47501trL.TaskDescription.QOjuYg, 6);
        sparseIntArray.put(C47501trL.TaskDescription.DVmcag, 7);
        sparseIntArray.put(C47501trL.TaskDescription.Qsauvs, 8);
    }

    public tMH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, djBIcL));
    }

    public tMH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (android.widget.FrameLayout) objArr[1], (android.widget.LinearLayout) objArr[4], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
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
