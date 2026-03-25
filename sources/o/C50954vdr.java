package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50954vdr extends AbstractC50950vdn {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final android.widget.LinearLayout AkhnZx;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getListMenuView, 4);
        sparseIntArray.put(C48033uCm.Application.setRecycleOnMeasureEnabled, 5);
        sparseIntArray.put(C48033uCm.Application.getResultCode, 6);
        sparseIntArray.put(C48033uCm.Application.Ufzxmz, 7);
    }

    public C50954vdr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 8, valueOf, AhwBna));
    }

    public C50954vdr(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C54984xbQ) objArr[7], (android.widget.LinearLayout) objArr[2], (C54984xbQ) objArr[6], (LinearLayoutCompat) objArr[1], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4]);
        this.gEmmrt = -1L;
        this.copydefault.setTag(null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
        linearLayout.setTag(null);
        this.OLrzqt.setTag(null);
        this.AYXKKw.setTag(null);
        setRootTag(viewArr);
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
