package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iMg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23867iMg extends AbstractC23863iMc {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long valueOf;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C25493ixk.ActionBar.sWlOSi, 1);
        sparseIntArray.put(C25493ixk.ActionBar.itxZVF, 2);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannel_Parcel, 3);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannelDefault, 4);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannelStubProxy, 5);
        sparseIntArray.put(C25493ixk.ActionBar.INotificationSideChannel, 6);
    }

    public C23867iMg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, djBIcL));
    }

    public C23867iMg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55113xdn) objArr[2], (android.widget.ImageView) objArr[1], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[6], (C55258xgZ) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
