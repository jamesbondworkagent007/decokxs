package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50799vav extends AbstractC50801vax {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long djBIcL;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner2, 1);
        sparseIntArray.put(C48033uCm.Application.OStAOF, 2);
        sparseIntArray.put(C48033uCm.Application.OLrzqt, 3);
        sparseIntArray.put(C48033uCm.Application.getOutline, 4);
        sparseIntArray.put(C48033uCm.Application.getCallerContract, 5);
    }

    public C50799vav(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, valueOf, AYXKKw));
    }

    public C50799vav(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55254xgV) objArr[3], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[1], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[5], (ViewPager2) objArr[4]);
        this.djBIcL = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
