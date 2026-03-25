package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nLH extends nLI {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray KWHzl;
    public long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.Nullable GroupMemberInfo groupMemberInfo) {
        this.EZpvd = groupMemberInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        KWHzl = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialsiEkQe, 1);
    }

    public nLH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, AEQbTJ, KWHzl));
    }

    public nLH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[0], (C35893oHp) objArr[1]);
        this.gEmmrt = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        OLrzqt((GroupMemberInfo) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
