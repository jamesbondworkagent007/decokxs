package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.veh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50997veh extends AbstractC50999vej {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public long AkhnZx;
    public final ConstraintLayout AuCTel;

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
        sparseIntArray.put(C48033uCm.Application.QBiWsm, 1);
        sparseIntArray.put(C48033uCm.Application.equals, 2);
        sparseIntArray.put(C48033uCm.Application.getToken, 3);
        sparseIntArray.put(C48033uCm.Application.fromMediaItem, 4);
        sparseIntArray.put(C48033uCm.Application.removeCancellable, 5);
        sparseIntArray.put(C48033uCm.Application.LongDef, 6);
        sparseIntArray.put(C48033uCm.Application.target, 7);
        sparseIntArray.put(C48033uCm.Application.accessobserveReporter, 8);
        sparseIntArray.put(C48033uCm.Application.ActionBar, 9);
        sparseIntArray.put(C48033uCm.Application.OxVOHk, 10);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 11);
        sparseIntArray.put(C48033uCm.Application.ActivityResultLauncher, 12);
    }

    public C50997veh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, values));
    }

    public C50997veh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (uBL) objArr[10], (C53539wnR) objArr[11], (android.widget.TextView) objArr[1], (C47988uAv) objArr[4], (C47988uAv) objArr[3], (C49917uxb) objArr[2], (android.widget.TextView) objArr[5], (C47988uAv) objArr[8], (C53539wnR) objArr[12], (android.widget.TextView) objArr[7], (C47988uAv) objArr[6], (C47988uAv) objArr[9]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
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
