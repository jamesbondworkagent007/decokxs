package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48294uMd extends AbstractC48293uMc {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final ConstraintLayout AkhnZx;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.gasjUx, 1);
        sparseIntArray.put(C48033uCm.Application.DzCpqu, 2);
        sparseIntArray.put(C48033uCm.Application.createRadioButton, 3);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImpl1, 4);
        sparseIntArray.put(C48033uCm.Application.geAOna, 5);
        sparseIntArray.put(C48033uCm.Application.ActivityResult, 6);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatCustomActionBuilder, 7);
        sparseIntArray.put(C48033uCm.Application.ihnvzI, 8);
    }

    public C48294uMd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, gEmmrt));
    }

    public C48294uMd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C51968vwy) objArr[8], (android.view.View) objArr[2], (android.widget.TextView) objArr[5], (RecyclerView) objArr[7], (C33546myW) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
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
