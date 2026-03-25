package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5657aAc extends AbstractC5660aAf {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout isConnected;
    public long values;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C8206ayP.StateListAnimator.AEQbTJ, 1);
        sparseIntArray.put(C8206ayP.StateListAnimator.isReflectionWorking, 2);
        sparseIntArray.put(C8206ayP.StateListAnimator.QfJbVf, 3);
        sparseIntArray.put(C8206ayP.StateListAnimator.zzQwtT, 4);
        sparseIntArray.put(C8206ayP.StateListAnimator.gwwfep, 5);
        sparseIntArray.put(C8206ayP.StateListAnimator.dzCpvv, 6);
        sparseIntArray.put(C8206ayP.StateListAnimator.hrjNmC, 7);
        sparseIntArray.put(C8206ayP.StateListAnimator.DLGVGj, 8);
        sparseIntArray.put(C8206ayP.StateListAnimator.cBPFI, 9);
        sparseIntArray.put(C8206ayP.StateListAnimator.gtdfxv, 10);
        sparseIntArray.put(C8206ayP.StateListAnimator.DarRvM, 11);
    }

    public C5657aAc(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, DbNXlk, fetchVPNInfo));
    }

    public C5657aAc(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleToolBar) objArr[1], (C52794wYp) objArr[11], (ConstraintLayout) objArr[3], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (ConstraintLayout) objArr[7], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[2]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
