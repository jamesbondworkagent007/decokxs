package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23864iMd extends AbstractC23865iMe {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannelStub, 1);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannel_Parcel, 2);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannelDefault, 3);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannelStubProxy, 4);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannel, 5);
    }

    public C23864iMd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, valueOf));
    }

    public C23864iMd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[5], (C55113xdn) objArr[1], (C55258xgZ) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.AYXKKw = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
