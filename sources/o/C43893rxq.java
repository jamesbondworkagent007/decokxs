package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rxq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43893rxq extends AbstractC43894rxr {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray djBIcL;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.Swccd, 1);
        sparseIntArray.put(C43662rtX.ActionBar.getStatusCode, 2);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJKRKUgwx, 3);
        sparseIntArray.put(C43662rtX.ActionBar.DSiOMJ, 4);
        sparseIntArray.put(C43662rtX.ActionBar.DGUQLIekVPG, 5);
    }

    public C43893rxq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AYXKKw, djBIcL));
    }

    public C43893rxq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayoutCompat) objArr[0], (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[4], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.gEmmrt = -1L;
        this.OLrzqt.setTag(null);
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
