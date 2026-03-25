package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50832vbb extends AbstractC50831vba {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long ejfBZ;

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
        AuCTel = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.RVsVBY, 1);
        sparseIntArray.put(C48033uCm.Application.OTwTPd, 2);
        sparseIntArray.put(C48033uCm.Application.BackHandler, 3);
        sparseIntArray.put(C48033uCm.Application.ActivityResultCallerLauncherresultContract21, 4);
        sparseIntArray.put(C48033uCm.Application.zLAIeZ, 5);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplApi18, 6);
        sparseIntArray.put(C48033uCm.Application.sendMetadata, 7);
        sparseIntArray.put(C48033uCm.Application.GiPPlL, 8);
        sparseIntArray.put(C48033uCm.Application.hgxRZI, 9);
        sparseIntArray.put(C48033uCm.Application.setDither, 10);
        sparseIntArray.put(C48033uCm.Application.setHotspot, 11);
        sparseIntArray.put(C48033uCm.Application.removeOnReportDrawnListener, 12);
        sparseIntArray.put(C48033uCm.Application.FullyDrawnReporterKt, 13);
        sparseIntArray.put(C48033uCm.Application.HJWChPiaHEvk, 14);
        sparseIntArray.put(C48033uCm.Application.BackHandlerKtBackHandler11, 15);
    }

    public C50832vbb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, AuCTel));
    }

    public C50832vbb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (android.widget.FrameLayout) objArr[1], (C52794wYp) objArr[5], (android.widget.TextView) objArr[8], (android.widget.ImageView) objArr[9], (android.view.View) objArr[14], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[12], (AppCompatTextView) objArr[3], (C51971vxA) objArr[15], (android.widget.TextView) objArr[4], (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[10]);
        this.ejfBZ = -1L;
        this.AkhnZx.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
