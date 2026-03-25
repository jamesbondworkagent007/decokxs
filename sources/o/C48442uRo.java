package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uRo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48442uRo extends AbstractC48443uRp {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final LinearLayoutCompat AhwBna;
    public final uNT AkhnZx;
    public final uNT DbNXlk;
    public final uNT fARcdN;
    public final uNT fetchVPNInfo;
    public long gEmmrt;
    public final uNT isConnected;
    public final uNT values;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.invokespecialROgMPW, 9);
        sparseIntArray.put(C48033uCm.Application.GuardedBy, 10);
        sparseIntArray.put(C48033uCm.Application.sendSessionEvent, 11);
        sparseIntArray.put(C48033uCm.Application.svhCHd, 12);
    }

    public C48442uRo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, valueOf, djBIcL));
    }

    public C48442uRo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[9], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[11], (LinearLayoutCompat) objArr[1], (LinearLayoutCompat) objArr[2], (C55372xih) objArr[10]);
        this.gEmmrt = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.AhwBna = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        java.lang.Object obj = objArr[3];
        this.values = obj != null ? uNT.copydefault((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[4];
        this.isConnected = obj2 != null ? uNT.copydefault((android.view.View) obj2) : null;
        java.lang.Object obj3 = objArr[5];
        this.DbNXlk = obj3 != null ? uNT.copydefault((android.view.View) obj3) : null;
        java.lang.Object obj4 = objArr[6];
        this.AkhnZx = obj4 != null ? uNT.copydefault((android.view.View) obj4) : null;
        java.lang.Object obj5 = objArr[7];
        this.fetchVPNInfo = obj5 != null ? uNT.copydefault((android.view.View) obj5) : null;
        java.lang.Object obj6 = objArr[8];
        this.fARcdN = obj6 != null ? uNT.copydefault((android.view.View) obj6) : null;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
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
