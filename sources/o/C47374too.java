package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.too, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47374too extends AbstractC47377tor {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final ConstraintLayout AYXKKw;
    public long djBIcL;

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
        sparseIntArray.put(C47315tni.TaskDescription.OxVOHk, 1);
        sparseIntArray.put(C47315tni.TaskDescription.DPHOMC, 2);
        sparseIntArray.put(C47315tni.TaskDescription.iHkeWl, 3);
        sparseIntArray.put(C47315tni.TaskDescription.fZBcTu, 4);
        sparseIntArray.put(C47315tni.TaskDescription.UeEOUB, 5);
        sparseIntArray.put(C47315tni.TaskDescription.OcIXYQ, 6);
    }

    public C47374too(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, AhwBna));
    }

    public C47374too(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[6], (C52794wYp) objArr[5], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2]);
        this.djBIcL = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
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
