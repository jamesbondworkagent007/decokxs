package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16574emW extends AbstractC16572emU {
    public static final android.util.SparseIntArray AubY;
    public static final ViewDataBinding.IncludedLayouts zsXlph = null;
    public final ConstraintLayout wlaJM;
    public long zLjUOn;

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
        AubY = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.fvQaOB, 1);
        sparseIntArray.put(C13754dXa.ActionBar.ZxnNGp, 2);
        sparseIntArray.put(C13754dXa.ActionBar.Ohcwxs, 3);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaCompanionExternalSyntheticApiModelOutline0, 4);
        sparseIntArray.put(C13754dXa.ActionBar.dHAKvv, 5);
        sparseIntArray.put(C13754dXa.ActionBar.openFileOutput, 6);
        sparseIntArray.put(C13754dXa.ActionBar.isTimeProfileEmpty, 7);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultCallerLauncherresultContract21, 8);
        sparseIntArray.put(C13754dXa.ActionBar.GVpNrsfQMcgE, 9);
        sparseIntArray.put(C13754dXa.ActionBar.ZqidTP, 10);
        sparseIntArray.put(C13754dXa.ActionBar.OeawrHOeawrH, 11);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultCallback, 12);
        sparseIntArray.put(C13754dXa.ActionBar.setLauncher, 13);
        sparseIntArray.put(C13754dXa.ActionBar.DjzMc, 14);
        sparseIntArray.put(C13754dXa.ActionBar.ReturnThis, 15);
        sparseIntArray.put(C13754dXa.ActionBar.dxTXDv, 16);
        sparseIntArray.put(C13754dXa.ActionBar.shErWi, 17);
        sparseIntArray.put(C13754dXa.ActionBar.invokeSuspend, 18);
        sparseIntArray.put(C13754dXa.ActionBar.FullyDrawnReporterOwner, 19);
        sparseIntArray.put(C13754dXa.ActionBar.putLong, 20);
        sparseIntArray.put(C13754dXa.ActionBar.getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAXannotations, 21);
        sparseIntArray.put(C13754dXa.ActionBar.fhwtiV, 22);
        sparseIntArray.put(C13754dXa.ActionBar.gRtANS, 23);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi23, 24);
        sparseIntArray.put(C13754dXa.ActionBar.DUUtXg, 25);
    }

    public C16574emW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 26, zsXlph, AubY));
    }

    public C16574emW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55249xgQ) objArr[1], (C52794wYp) objArr[25], (C57461yip) objArr[11], (C57461yip) objArr[7], (C57461yip) objArr[3], (C55030xcJ) objArr[22], (Group) objArr[23], (ConstraintLayout) objArr[17], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[6], (ConstraintLayout) objArr[5], (LinearLayoutCompat) objArr[2], (C57458yim) objArr[16], (C57458yim) objArr[14], (android.widget.ImageView) objArr[9], (android.view.View) objArr[20], (android.view.View) objArr[24], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[18], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[12], (AppCompatTextView) objArr[8], (android.widget.TextView) objArr[21], (AppCompatTextView) objArr[4], (C57460yio) objArr[15]);
        this.zLjUOn = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.wlaJM = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zLjUOn = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zLjUOn != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.zLjUOn = 0L;
        }
    }
}
