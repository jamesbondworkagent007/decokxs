package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uYA extends AbstractC48641uYy {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray ejfBZ;
    public long fIwbmz;
    public final ConstraintLayout fJNWhG;

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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.addOnPictureInPictureModeChangedListener, 10);
        sparseIntArray.put(C48033uCm.Application.addOnContextAvailableListener, 11);
        sparseIntArray.put(C48033uCm.Application.DGOPHZ, 12);
        sparseIntArray.put(C48033uCm.Application.call, 13);
        sparseIntArray.put(C48033uCm.Application.DCUTEIddSDPG, 14);
        sparseIntArray.put(C48033uCm.Application.WS, 15);
    }

    public uYA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 16, AuCTel, ejfBZ));
    }

    public uYA(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C47988uAv) objArr[14], (C55239xgG) objArr[13], (C55258xgZ) objArr[12], (AppCompatTextView) objArr[15], (C53539wnR) objArr[2], (android.widget.TextView) objArr[3], (C47988uAv) objArr[1], (C50191vFg) objArr[0], (android.widget.TextView) objArr[6], (vKO) objArr[4], (ConstraintLayout) objArr[8], (C55239xgG) objArr[11], (C55258xgZ) objArr[10], (vKO) objArr[5], (C54154wyx) objArr[7]);
        this.fIwbmz = -1L;
        this.copydefault.setTag(null);
        this.gEmmrt.setTag(null);
        this.AhwBna.setTag(null);
        this.djBIcL.setTag(null);
        this.valueOf.setTag(null);
        this.AYXKKw.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[9];
        this.fJNWhG = constraintLayout;
        constraintLayout.setTag(null);
        this.fetchVPNInfo.setTag(null);
        this.AkhnZx.setTag(null);
        this.isConnected.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
