package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.mDC;

/* JADX INFO: renamed from: o.mHh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31879mHh extends AbstractC31880mHi {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final android.widget.LinearLayout gEmmrt;

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
        sparseIntArray.put(mDC.ActionBar.QIZEnU, 1);
        sparseIntArray.put(mDC.ActionBar.QVsKAR, 2);
        sparseIntArray.put(mDC.ActionBar.aUsmxb, 3);
        sparseIntArray.put(mDC.ActionBar.DNMMPQ, 4);
        sparseIntArray.put(mDC.ActionBar.OxVOHk, 5);
        sparseIntArray.put(mDC.ActionBar.OBJEWx, 6);
    }

    public C31879mHh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AhwBna, valueOf));
    }

    public C31879mHh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[6], (android.widget.LinearLayout) objArr[5], (android.widget.FrameLayout) objArr[2], (C55113xdn) objArr[3], (RecyclerView) objArr[4], (android.view.View) objArr[1]);
        this.AYXKKw = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.gEmmrt = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
