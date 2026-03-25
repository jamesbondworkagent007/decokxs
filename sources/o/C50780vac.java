package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50780vac extends uZX {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final android.widget.LinearLayout djBIcL;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.setSubtitle, 1);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplAutoBatteryNightModeManager, 2);
        sparseIntArray.put(C48033uCm.Application.setExtras, 3);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi216, 4);
        sparseIntArray.put(C48033uCm.Application.startActivityForResult, 5);
    }

    public C50780vac(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, gEmmrt));
    }

    public C50780vac(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53959wvN) objArr[4], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[1], (C53959wvN) objArr[5], (android.widget.TextView) objArr[2]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.djBIcL = linearLayout;
        linearLayout.setTag(null);
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
