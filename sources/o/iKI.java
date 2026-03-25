package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: loaded from: classes6.dex */
public class iKI extends iKJ {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final ConstraintLayout fetchVPNInfo;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.UkvvWh, 1);
        sparseIntArray.put(C25493ixk.ActionBar.UlpNxW, 2);
        sparseIntArray.put(C25493ixk.ActionBar.svUkWZ, 3);
        sparseIntArray.put(C25493ixk.ActionBar.iflRwn, 4);
        sparseIntArray.put(C25493ixk.ActionBar.getLaunchPendingIntent, 5);
        sparseIntArray.put(C25493ixk.ActionBar.IMediaSession, 6);
        sparseIntArray.put(C25493ixk.ActionBar.DCUTEIddSDPG, 7);
        sparseIntArray.put(C25493ixk.ActionBar.DGUQLIhJrIAr, 8);
        sparseIntArray.put(C25493ixk.ActionBar.values, 9);
        sparseIntArray.put(C25493ixk.ActionBar.fBE, 10);
    }

    public iKI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, DbNXlk));
    }

    public iKI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C27343jtR) objArr[9], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[10], (LinearLayoutCompat) objArr[8], (android.widget.ImageView) objArr[3], (Barrier) objArr[4], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[5]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
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
