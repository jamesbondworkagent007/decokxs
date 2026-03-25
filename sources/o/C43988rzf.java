package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43988rzf extends AbstractC43992rzj {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final android.widget.FrameLayout AYXKKw;
    public long AhwBna;

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
        sparseIntArray.put(C43662rtX.ActionBar.OHqIaq, 1);
        sparseIntArray.put(C43662rtX.ActionBar.gSBher, 2);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJKDDUqPf, 3);
        sparseIntArray.put(C43662rtX.ActionBar.hlXVux, 4);
        sparseIntArray.put(C43662rtX.ActionBar.sSMYrx, 5);
        sparseIntArray.put(C43662rtX.ActionBar.OFhtUX, 6);
    }

    public C43988rzf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, djBIcL));
    }

    public C43988rzf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[5], (LinearLayoutCompat) objArr[1], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.AhwBna = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.AYXKKw = frameLayout;
        frameLayout.setTag(null);
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
