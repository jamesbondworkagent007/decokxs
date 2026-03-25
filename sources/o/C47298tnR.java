package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47298tnR extends AbstractC47295tnO {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public long KWHzl;
    public final android.widget.FrameLayout copydefault;

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
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialaGOrKO, 1);
    }

    public C47298tnR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, EZpvd, AEQbTJ));
    }

    public C47298tnR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[1]);
        this.KWHzl = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.copydefault = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.KWHzl = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.KWHzl != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.KWHzl = 0L;
        }
    }
}
