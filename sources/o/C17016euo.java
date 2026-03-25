package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C17016euo extends AbstractC17017eup {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final android.widget.LinearLayout AYXKKw;
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
        sparseIntArray.put(C13754dXa.ActionBar.postMessage, 1);
        sparseIntArray.put(C13754dXa.ActionBar.onRewind, 2);
        sparseIntArray.put(C13754dXa.ActionBar.otherwise, 3);
        sparseIntArray.put(C13754dXa.ActionBar.writeToParcel, 4);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 5);
    }

    public C17016euo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, gEmmrt, djBIcL));
    }

    public C17016euo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[5], (android.widget.LinearLayout) objArr[1], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[2], (ViewPager2) objArr[3]);
        this.AhwBna = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
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
