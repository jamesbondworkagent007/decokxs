package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uTN extends uTQ {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public long fetchVPNInfo;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatApi23CallbackProxy, 1);
        sparseIntArray.put(C48033uCm.Application.getActions, 2);
        sparseIntArray.put(C48033uCm.Application.RestrictToScope, 3);
        sparseIntArray.put(C48033uCm.Application.fMBJsc, 4);
        sparseIntArray.put(C48033uCm.Application.sendCommand, 5);
        sparseIntArray.put(C48033uCm.Application.getName, 6);
        sparseIntArray.put(C48033uCm.Application.ActivityViewModelLazyKtviewModels2, 7);
        sparseIntArray.put(C48033uCm.Application.ActivityResult, 8);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompat, 9);
        sparseIntArray.put(C48033uCm.Application.GcnicV, 10);
        sparseIntArray.put(C48033uCm.Application.OCdtug, 11);
    }

    public uTN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, DbNXlk));
    }

    public uTN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[4], (Group) objArr[10], (android.widget.FrameLayout) objArr[11], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[1], (RecyclerView) objArr[9], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[6], (Barrier) objArr[7], (C33546myW) objArr[8], (ConstraintLayout) objArr[3]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.fetchVPNInfo;
            this.fetchVPNInfo = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.values, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
