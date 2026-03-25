package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.trx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47539trx extends AbstractC47494trB {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long DbNXlk;
    public final android.widget.FrameLayout values;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DGGHxk, 1);
        sparseIntArray.put(C47315tni.TaskDescription.giSNqX, 2);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialROgMPW, 3);
        sparseIntArray.put(C47315tni.TaskDescription.QCjLjM, 4);
        sparseIntArray.put(C47315tni.TaskDescription.QwvEab, 5);
        sparseIntArray.put(C47315tni.TaskDescription.UlJrfe, 6);
        sparseIntArray.put(C47315tni.TaskDescription.QSLkRj, 7);
        sparseIntArray.put(C47315tni.TaskDescription.DPHOMC, 8);
        sparseIntArray.put(C47315tni.TaskDescription.USBtdM, 9);
    }

    public C47539trx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, valueOf, isConnected));
    }

    public C47539trx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[2], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[6], (wYB) objArr[3], (android.widget.LinearLayout) objArr[8], (android.widget.FrameLayout) objArr[1]);
        this.DbNXlk = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.values = frameLayout;
        frameLayout.setTag(null);
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
