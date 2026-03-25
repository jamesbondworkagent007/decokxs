package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public class oPQ extends oPP {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.setPageName, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.GFUIi, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.DuXjdv, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.dlRikr, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.ICustomTabsCallbackStub, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.playFromUri, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.Dfm, 7);
    }

    public oPQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, valueOf));
    }

    public oPQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[7], (android.widget.LinearLayout) objArr[0], (android.widget.RelativeLayout) objArr[5], (android.widget.TextView) objArr[6]);
        this.fetchVPNInfo = -1L;
        this.djBIcL.setTag(null);
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
