package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23782iJc extends iIZ {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public final ConstraintLayout DbNXlk;
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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.UeEOUB, 1);
        sparseIntArray.put(C25493ixk.ActionBar.IPostMessageServiceDefault, 2);
        sparseIntArray.put(C25493ixk.ActionBar.zEHIKV, 3);
        sparseIntArray.put(C25493ixk.ActionBar.iOIMNp, 4);
        sparseIntArray.put(C25493ixk.ActionBar.sanrWj, 5);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatConnectionCallback, 6);
        sparseIntArray.put(C25493ixk.ActionBar.UUsvzU, 7);
        sparseIntArray.put(C25493ixk.ActionBar.HJWChPRAkuRW, 8);
        sparseIntArray.put(C25493ixk.ActionBar.ScLVFT, 9);
        sparseIntArray.put(C25493ixk.ActionBar.MediaBrowserCompatMediaBrowserImplApi215, 10);
        sparseIntArray.put(C25493ixk.ActionBar.validateAndPutInMap, 11);
    }

    public C23782iJc(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fetchVPNInfo, AkhnZx));
    }

    public C23782iJc(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[1], (ConstraintLayout) objArr[3], (C55113xdn) objArr[8], (android.widget.TextView) objArr[4], (C27212jqt) objArr[5], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[10]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
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
