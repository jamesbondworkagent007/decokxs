package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKBannerLayout;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uWC extends uWB {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public long gEmmrt;

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
        sparseIntArray.put(C48033uCm.Application.registerKey, 1);
        sparseIntArray.put(C48033uCm.Application.doDispatch, 2);
        sparseIntArray.put(C48033uCm.Application.fdt, 3);
        sparseIntArray.put(C48033uCm.Application.generateRandomNumber, 4);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsRequestMultiplePermissionsCompanion, 5);
        sparseIntArray.put(C48033uCm.Application.alsFma, 6);
    }

    public uWC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, djBIcL, valueOf));
    }

    public uWC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKBannerLayout) objArr[6], (C51648vqw) objArr[3], (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[4], (ConstraintLayout) objArr[2], (android.widget.TextView) objArr[1], (AppCompatTextView) objArr[5]);
        this.gEmmrt = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
