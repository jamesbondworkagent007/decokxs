package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rxu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43897rxu extends AbstractC43892rxp {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray values;
    public long AkhnZx;

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
        values = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.UscePu, 1);
        sparseIntArray.put(C43662rtX.ActionBar.igXuih, 2);
        sparseIntArray.put(C43662rtX.ActionBar.zblBkD, 3);
        sparseIntArray.put(C43662rtX.ActionBar.dUDNAs, 4);
        sparseIntArray.put(C43662rtX.ActionBar.sSMYrx, 5);
        sparseIntArray.put(C43662rtX.ActionBar.DPHOMC, 6);
        sparseIntArray.put(C43662rtX.ActionBar.QOLQEE, 7);
        sparseIntArray.put(C43662rtX.ActionBar.DGgnkA, 8);
    }

    public C43897rxu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, values));
    }

    public C43897rxu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[5], (android.widget.LinearLayout) objArr[7], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[0], (android.widget.ImageView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[8], (android.widget.FrameLayout) objArr[1], (android.widget.LinearLayout) objArr[6]);
        this.AkhnZx = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
