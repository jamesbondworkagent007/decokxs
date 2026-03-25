package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.ton, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47373ton extends AbstractC47369toj {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray values;
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
        values = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DQzvGNdrmXxu, 1);
        sparseIntArray.put(C47315tni.TaskDescription.call, 2);
        sparseIntArray.put(C47315tni.TaskDescription.ixgjPv, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DGOPHZ, 4);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKfNUfqk, 5);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKfbSiEC, 6);
        sparseIntArray.put(C47315tni.TaskDescription.dPnHjp, 7);
        sparseIntArray.put(C47315tni.TaskDescription.aVhqwO, 8);
        sparseIntArray.put(C47315tni.TaskDescription.dIjzlO, 9);
    }

    public C47373ton(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, DbNXlk, values));
    }

    public C47373ton(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (C55008xbo) objArr[3], (C55008xbo) objArr[4], (C55008xbo) objArr[2], (C55018xby) objArr[1], (C52794wYp) objArr[8], (C52794wYp) objArr[9], (C52794wYp) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5]);
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
