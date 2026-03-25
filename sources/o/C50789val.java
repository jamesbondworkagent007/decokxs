package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.val, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50789val extends AbstractC50784vag {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AhwBna;
    public final android.widget.LinearLayout valueOf;

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
        sparseIntArray.put(C48033uCm.Application.svY, 1);
        sparseIntArray.put(C48033uCm.Application.getErrorMessage, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMediaSingleMimeType, 3);
        sparseIntArray.put(C48033uCm.Application.HJWChPRGtXKC, 4);
        sparseIntArray.put(C48033uCm.Application.hasCallback, 5);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplPanelFeatureStateSavedState, 6);
    }

    public C50789val(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, AYXKKw));
    }

    public C50789val(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55052xcf) objArr[1], (vMD) objArr[4], (vMC) objArr[5], (C50387vMn) objArr[2], (C47988uAv) objArr[3], (android.widget.TextView) objArr[6]);
        this.AhwBna = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.valueOf = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
