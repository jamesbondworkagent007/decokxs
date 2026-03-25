package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48487uTf extends AbstractC48486uTe {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
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
        sparseIntArray.put(C48033uCm.Application.updateVisibility, 1);
        sparseIntArray.put(C48033uCm.Application.ikEgkI, 2);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi217, 3);
        sparseIntArray.put(C48033uCm.Application.ActivityResultCallerLauncherresultContract2, 4);
        sparseIntArray.put(C48033uCm.Application.removeOnNewIntentListener, 5);
        sparseIntArray.put(C48033uCm.Application.QIZEnU, 6);
        sparseIntArray.put(C48033uCm.Application.QDqgQU, 7);
        sparseIntArray.put(C48033uCm.Application.saveState, 8);
        sparseIntArray.put(C48033uCm.Application.ComponentActivityExternalSyntheticLambda2, 9);
        sparseIntArray.put(C48033uCm.Application.reportFullyDrawn, 10);
        sparseIntArray.put(C48033uCm.Application.updateStateFromTypedArray, 11);
    }

    public C48487uTf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, fetchVPNInfo));
    }

    public C48487uTf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[7], (android.widget.FrameLayout) objArr[6], (Flow) objArr[2], (android.widget.LinearLayout) objArr[0], (C55258xgZ) objArr[3], (AppCompatTextView) objArr[10], (C55239xgG) objArr[9], (C55258xgZ) objArr[8], (ConstraintLayout) objArr[5], (android.widget.Space) objArr[4], (ConstraintLayout) objArr[1], (android.view.View) objArr[11]);
        this.values = -1L;
        this.AEQbTJ.setTag(null);
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
