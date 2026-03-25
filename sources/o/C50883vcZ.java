package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50883vcZ extends AbstractC50880vcW {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long AuCTel;

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
        sparseIntArray.put(C48033uCm.Application.getMinimumHeight, 2);
        sparseIntArray.put(C48033uCm.Application.ikEgkI, 3);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplApi217, 4);
        sparseIntArray.put(C48033uCm.Application.ActivityResultCallerLauncherresultContract2, 5);
        sparseIntArray.put(C48033uCm.Application.removeOnNewIntentListener, 6);
        sparseIntArray.put(C48033uCm.Application.QIZEnU, 7);
        sparseIntArray.put(C48033uCm.Application.QDqgQU, 8);
        sparseIntArray.put(C48033uCm.Application.saveState, 9);
        sparseIntArray.put(C48033uCm.Application.ComponentActivityExternalSyntheticLambda2, 10);
        sparseIntArray.put(C48033uCm.Application.reportFullyDrawn, 11);
        sparseIntArray.put(C48033uCm.Application.updateStateFromTypedArray, 12);
    }

    public C50883vcZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, fetchVPNInfo));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C50883vcZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.ImageView imageView = (android.widget.ImageView) objArr[8];
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[7];
        Flow flow = (Flow) objArr[3];
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        C55258xgZ c55258xgZ = (C55258xgZ) objArr[4];
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[11];
        C55239xgG c55239xgG = (C55239xgG) objArr[10];
        C55258xgZ c55258xgZ2 = (C55258xgZ) objArr[9];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[6];
        android.widget.Space space = (android.widget.Space) objArr[5];
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        android.view.View view2 = (android.view.View) objArr[12];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, imageView, frameLayout, flow, linearLayout, c55258xgZ, appCompatTextView, c55239xgG, c55258xgZ2, constraintLayout, space, constraintLayout2, view2, obj != null ? C48441uRn.copydefault((android.view.View) obj) : null);
        this.AuCTel = -1L;
        this.AEQbTJ.setTag(null);
        this.values.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
