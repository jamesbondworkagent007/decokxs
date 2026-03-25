package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47398tpL extends AbstractC47402tpP {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AhwBna;
    public final ConstraintLayout gEmmrt;

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
        sparseIntArray.put(C47315tni.TaskDescription.dUDNAs, 1);
        sparseIntArray.put(C47315tni.TaskDescription.OFhtUX, 2);
        sparseIntArray.put(C47315tni.TaskDescription.ODCBUN, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKdMCrTj, 4);
        sparseIntArray.put(C47315tni.TaskDescription.QKDJJA, 5);
        sparseIntArray.put(C47315tni.TaskDescription.abAflu, 6);
    }

    public C47398tpL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, djBIcL));
    }

    public C47398tpL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55258xgZ) objArr[2], (android.widget.ImageView) objArr[1], (C55251xgS) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6], (android.view.View) objArr[5]);
        this.AhwBna = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
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
