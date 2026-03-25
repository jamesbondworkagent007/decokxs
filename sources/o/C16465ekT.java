package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16465ekT extends AbstractC16466ekU {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public final ConstraintLayout ejfBZ;
    public long fetchVPNInfo;

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
        sparseIntArray.put(C13754dXa.ActionBar.fjfviF, 1);
        sparseIntArray.put(C13754dXa.ActionBar.igXuih, 2);
        sparseIntArray.put(C13754dXa.ActionBar.fdOvFl, 3);
        sparseIntArray.put(C13754dXa.ActionBar.htlTjW, 4);
        sparseIntArray.put(C13754dXa.ActionBar.fFgQHt, 5);
        sparseIntArray.put(C13754dXa.ActionBar.dxcTrN, 6);
        sparseIntArray.put(C13754dXa.ActionBar.finit, 7);
        sparseIntArray.put(C13754dXa.ActionBar.dvKsVJ, 8);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 9);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKffREWX, 10);
        sparseIntArray.put(C13754dXa.ActionBar.RZMhtF, 11);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 12);
    }

    public C16465ekT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, AkhnZx, DbNXlk));
    }

    public C16465ekT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[8], (LinearLayoutCompat) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (LinearLayoutCompat) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[1], (C55173xeu) objArr[10], (C52794wYp) objArr[9], (Group) objArr[11], (C55113xdn) objArr[12]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
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
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
