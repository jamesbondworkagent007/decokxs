package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47285tnE extends AbstractC47281tnA {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray OLrzqt;
    public long djBIcL;
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
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.djSkpj, 1);
        sparseIntArray.put(C47315tni.TaskDescription.fFgQHt, 2);
        sparseIntArray.put(C47315tni.TaskDescription.QkdxfA, 3);
    }

    public C47285tnE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, EZpvd, OLrzqt));
    }

    public C47285tnE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYC) objArr[1], (android.widget.FrameLayout) objArr[2], (android.widget.FrameLayout) objArr[3]);
        this.djBIcL = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.gEmmrt = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
