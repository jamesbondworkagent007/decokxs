package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C23446hyQ extends AbstractC23439hyJ {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray copydefault;
    public final android.widget.RelativeLayout AhwBna;
    public long KWHzl;

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
        sparseIntArray.put(C23274hvD.Application.onApplyWindowInsets, 1);
        sparseIntArray.put(C23274hvD.Application.shouldWrapException, 2);
    }

    public C23446hyQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, copydefault));
    }

    public C23446hyQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[1], (C55320xhi) objArr[2]);
        this.KWHzl = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[0];
        this.AhwBna = relativeLayout;
        relativeLayout.setTag(null);
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
