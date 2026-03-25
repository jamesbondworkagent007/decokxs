package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eum, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C17014eum extends AbstractC17013eul {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long DbNXlk;
    public final ConstraintLayout values;

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
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsStartIntentSenderForResultCompanion, 3);
        sparseIntArray.put(C13754dXa.ActionBar.hrjNmC, 4);
        sparseIntArray.put(C13754dXa.ActionBar.dGrqPl, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getSelectedNavigationIndex, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DUUtXg, 7);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 8);
        sparseIntArray.put(C13754dXa.ActionBar.OStAOF, 9);
    }

    public C17014eum(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AhwBna, fetchVPNInfo));
    }

    public C17014eum(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[7], (ConstraintLayout) objArr[4], (C55173xeu) objArr[9], (android.widget.ImageView) objArr[5], (C55113xdn) objArr[8], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
