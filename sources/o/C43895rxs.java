package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rxs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43895rxs extends AbstractC43891rxo {
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public static final android.util.SparseIntArray copydefault;
    public long AEQbTJ;

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
        copydefault = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.aGOrKO, 1);
    }

    public C43895rxs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, OLrzqt, copydefault));
    }

    public C43895rxs(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[0], (C31695mAm) objArr[1]);
        this.AEQbTJ = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AEQbTJ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AEQbTJ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AEQbTJ = 0L;
        }
    }
}
