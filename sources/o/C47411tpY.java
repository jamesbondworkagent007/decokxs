package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47411tpY extends AbstractC47409tpW {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray gEmmrt;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.alsFma, 1);
        sparseIntArray.put(C47315tni.TaskDescription.AwvSrB, 2);
        sparseIntArray.put(C47315tni.TaskDescription.DlmWDR, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DzkRMH, 4);
    }

    public C47411tpY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, KWHzl, gEmmrt));
    }

    public C47411tpY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[2], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[4]);
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
