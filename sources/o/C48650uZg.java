package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48650uZg extends AbstractC48654uZk {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public final android.widget.LinearLayout AkhnZx;
    public long DbNXlk;

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
        sparseIntArray.put(C48033uCm.Application.setMediaId, 1);
        sparseIntArray.put(C48033uCm.Application.hkDICb, 2);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImpl7, 3);
        sparseIntArray.put(C48033uCm.Application.IIEbr, 4);
        sparseIntArray.put(C48033uCm.Application.startAsSupportActionMode, 5);
        sparseIntArray.put(C48033uCm.Application.OqIZjC, 6);
        sparseIntArray.put(C48033uCm.Application.getApplyableNightMode, 7);
        sparseIntArray.put(C48033uCm.Application.hOMIpD, 8);
    }

    public C48650uZg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, gEmmrt));
    }

    public C48650uZg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYF) objArr[8], (C55258xgZ) objArr[6], (C47988uAv) objArr[4], (C47980uAn) objArr[2], (C55372xih) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
