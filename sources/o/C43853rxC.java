package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.ok_kyc_widget.UploadNew;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rxC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43853rxC extends AbstractC43851rxA {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts copydefault = null;
    public final ConstraintLayout AhwBna;
    public long KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable rIB rib) {
        this.EZpvd = rib;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.RKcVTr, 1);
    }

    public C43853rxC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, copydefault, AEQbTJ));
    }

    public C43853rxC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (UploadNew) objArr[1]);
        this.KWHzl = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.KWHzl = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.KWHzl != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C43664rtZ.AEQbTJ != i) {
            return false;
        }
        KWHzl((rIB) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.KWHzl = 0L;
        }
    }
}
