package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48434uRg extends AbstractC48432uRe {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final android.widget.LinearLayout djBIcL;

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
        sparseIntArray.put(C48033uCm.Application.get, 1);
        sparseIntArray.put(C48033uCm.Application.ColorLong, 2);
        sparseIntArray.put(C48033uCm.Application.getMetadata, 3);
        sparseIntArray.put(C48033uCm.Application.fastForward, 4);
        sparseIntArray.put(C48033uCm.Application.GVpNrsfQMcgE, 5);
    }

    public C48434uRg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, gEmmrt, valueOf));
    }

    public C48434uRg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53448wlg) objArr[5], (C49924uxi) objArr[4], (wUP) objArr[3], (C49861uwY) objArr[1], (ConstraintLayout) objArr[2]);
        this.AYXKKw = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.djBIcL = linearLayout;
        linearLayout.setTag(null);
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
