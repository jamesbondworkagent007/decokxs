package o;

import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uOY extends AbstractC48372uPa {
    public static final android.util.SparseIntArray AuCTelauCTel;
    public static final ViewDataBinding.IncludedLayouts zLjUOn = null;
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
        AuCTelauCTel = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.SqfPTR, 1);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplListMenuDecorView, 2);
        sparseIntArray.put(C48033uCm.Application.sendCaptioningEnabled, 3);
        sparseIntArray.put(C48033uCm.Application.getTabCount, 4);
        sparseIntArray.put(C48033uCm.Application.DcMfJKfbSiEC, 5);
        sparseIntArray.put(C48033uCm.Application.ParcelableVolumeInfo, 6);
        sparseIntArray.put(C48033uCm.Application.DzCpqu, 7);
        sparseIntArray.put(C48033uCm.Application.onNothingSelected, 8);
        sparseIntArray.put(C48033uCm.Application.ComponentActivity21, 9);
        sparseIntArray.put(C48033uCm.Application.aJFbMH, 10);
        sparseIntArray.put(C48033uCm.Application.fiXcQa, 11);
        sparseIntArray.put(C48033uCm.Application.RAaltf, 12);
        sparseIntArray.put(C48033uCm.Application.setBackgroundResource, 13);
        sparseIntArray.put(C48033uCm.Application.OnBackPressedDispatcherApi33Impl, 14);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplAutoNightModeManager1, 15);
        sparseIntArray.put(C48033uCm.Application.isListening, 16);
        sparseIntArray.put(C48033uCm.Application.applyFrozenState, 17);
        sparseIntArray.put(C48033uCm.Application.createOnBackInvokedCallbacklambda0, 18);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplActionModeCallbackWrapperV9, 19);
        sparseIntArray.put(C48033uCm.Application.onOpenSubMenu, 20);
        sparseIntArray.put(C48033uCm.Application.setIconBitmap, 21);
        sparseIntArray.put(C48033uCm.Application.setEnterFadeDuration, 22);
        sparseIntArray.put(C48033uCm.Application.ParcelableVolumeInfo1, 23);
        sparseIntArray.put(C48033uCm.Application.fWSAZA, 24);
        sparseIntArray.put(C48033uCm.Application.QhsCdE, 25);
        sparseIntArray.put(C48033uCm.Application.fdOvFl, 26);
    }

    public uOY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 27, zLjUOn, AuCTelauCTel));
    }

    public uOY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52003vxg) objArr[26], (C51999vxc) objArr[10], (C48031uCk) objArr[5], (ConstraintLayout) objArr[11], (android.view.View) objArr[7], (C52003vxg) objArr[24], (C52003vxg) objArr[25], (Guideline) objArr[1], (Guideline) objArr[12], (android.widget.LinearLayout) objArr[21], (C55249xgQ) objArr[3], (C52003vxg) objArr[23], (C51968vwy) objArr[6], (android.widget.RelativeLayout) objArr[9], (Flow) objArr[14], (Flow) objArr[18], (NestedScrollView) objArr[0], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[15], (C55258xgZ) objArr[2], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[17], (C55258xgZ) objArr[8], (C52003vxg) objArr[22]);
        this.zsXlph = -1L;
        this.AuCTel.setTag(null);
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
