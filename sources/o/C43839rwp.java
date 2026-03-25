package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43839rwp extends AbstractC43838rwo {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final android.widget.LinearLayout AYXKKw;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.zzQwtT, 1);
        sparseIntArray.put(C43662rtX.ActionBar.QWpYiD, 2);
        sparseIntArray.put(C43662rtX.ActionBar.gsvlRV, 3);
        sparseIntArray.put(C43662rtX.ActionBar.fHqPtx, 4);
        sparseIntArray.put(C43662rtX.ActionBar.KDccX, 5);
    }

    public C43839rwp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, gEmmrt, AhwBna));
    }

    public C43839rwp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[4], (C52794wYp) objArr[5], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
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
