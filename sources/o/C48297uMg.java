package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48297uMg extends uLX {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray values;
    public long AkhnZx;
    public final android.widget.LinearLayout isConnected;

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
        sparseIntArray.put(C48033uCm.Application.fvQaOB, 1);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBar1, 2);
        sparseIntArray.put(C48033uCm.Application.invokespecialDPHOMC, 3);
        sparseIntArray.put(C48033uCm.Application.RvdRAu, 4);
        sparseIntArray.put(C48033uCm.Application.Cancellable, 5);
        sparseIntArray.put(C48033uCm.Application.getMediaUri, 6);
        sparseIntArray.put(C48033uCm.Application.GhqvEQ, 7);
        sparseIntArray.put(C48033uCm.Application.RgLUBD, 8);
        sparseIntArray.put(C48033uCm.Application.addSubscription, 9);
        sparseIntArray.put(C48033uCm.Application.ihnvzI, 10);
    }

    public C48297uMg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, values));
    }

    public C48297uMg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57597ylS) objArr[1], (C33546myW) objArr[3], (RecyclerView) objArr[4], (C55173xeu) objArr[10], (C55113xdn) objArr[8], (C52794wYp) objArr[7], (android.widget.LinearLayout) objArr[6], (android.widget.LinearLayout) objArr[9], (C33604mzb) objArr[5], (android.view.View) objArr[2]);
        this.AkhnZx = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
