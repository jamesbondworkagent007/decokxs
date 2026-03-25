package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47487tqv extends AbstractC47490tqy {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long values;

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
        sparseIntArray.put(C47315tni.TaskDescription.fZBcTu, 1);
        sparseIntArray.put(C47315tni.TaskDescription.getPriority, 2);
        sparseIntArray.put(C47315tni.TaskDescription.getLabel, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DsL, 4);
        sparseIntArray.put(C47315tni.TaskDescription.DTwDnp, 5);
        sparseIntArray.put(C47315tni.TaskDescription.ORxRYg, 6);
        sparseIntArray.put(C47315tni.TaskDescription.Dmq, 7);
    }

    public C47487tqv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, AYXKKw));
    }

    public C47487tqv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[1], (android.widget.LinearLayout) objArr[7], (ConstraintLayout) objArr[0], (android.widget.LinearLayout) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4]);
        this.values = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
