package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17080evz extends AbstractC17029evA {
    public static final ViewDataBinding.IncludedLayouts wlaJM = null;
    public static final android.util.SparseIntArray zLjUOn;
    public final ConstraintLayout AuCTelauCTel;
    public long zsXlph;

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
        zLjUOn = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.ensureClassLoader, 2);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 3);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsStartIntentSenderForResultCompanion, 4);
        sparseIntArray.put(C13754dXa.ActionBar.getPackageName, 5);
        sparseIntArray.put(C13754dXa.ActionBar.ViewTreeFullyDrawnReporterOwner, 6);
        sparseIntArray.put(C13754dXa.ActionBar.fXYAwm, 7);
        sparseIntArray.put(C13754dXa.ActionBar.Discouraged, 8);
        sparseIntArray.put(C13754dXa.ActionBar.unit, 9);
        sparseIntArray.put(C13754dXa.ActionBar.QgUVrU, 10);
        sparseIntArray.put(C13754dXa.ActionBar.getSerial, 11);
        sparseIntArray.put(C13754dXa.ActionBar.LocalActivityResultRegistryOwner, 12);
        sparseIntArray.put(C13754dXa.ActionBar.setOwners, 13);
        sparseIntArray.put(C13754dXa.ActionBar.LocalActivityResultRegistryOwnerLocalComposition1, 14);
        sparseIntArray.put(C13754dXa.ActionBar.ORmwhf, 15);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsRequestPermission, 16);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsRequestMultiplePermissions, 17);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsRequestMultiplePermissionsCompanion, 18);
        sparseIntArray.put(C13754dXa.ActionBar.QqiRNA, 19);
        sparseIntArray.put(C13754dXa.ActionBar.r8lambda7lLdjm1L5OSJIz1pWP4kzityPws, 20);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultCallerKt, 21);
        sparseIntArray.put(C13754dXa.ActionBar.r8lambdaSjF4PZlnE9fmKbolD64Sz5ghy6c, 22);
        sparseIntArray.put(C13754dXa.ActionBar.zDUObI, 23);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 24);
        sparseIntArray.put(C13754dXa.ActionBar.OStAOF, 25);
    }

    public C17080evz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, wlaJM, zLjUOn));
    }

    public C17080evz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[23], (MaterialCardView) objArr[7], (C55173xeu) objArr[25], (android.view.View) objArr[15], (ConstraintLayout) objArr[11], (AppCompatImageView) objArr[19], (AppCompatImageView) objArr[10], (C55113xdn) objArr[24], (RecyclerView) objArr[5], (NestedScrollView) objArr[2], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[14], (C17634fMp) objArr[12], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[22], (C17634fMp) objArr[20], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[18], (C17634fMp) objArr[16], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[9], (C17634fMp) objArr[8]);
        this.zsXlph = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTelauCTel = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zsXlph = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zsXlph != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.zsXlph = 0L;
        }
    }
}
