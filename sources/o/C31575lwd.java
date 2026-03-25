package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31575lwd extends AbstractC31572lwa {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray fIwbmz;
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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.Dfv, 1);
        sparseIntArray.put(C31351lsQ.Application.DTeKQX, 2);
        sparseIntArray.put(C31351lsQ.Application.RSmiaq, 3);
        sparseIntArray.put(C31351lsQ.Application.getSerial, 4);
        sparseIntArray.put(C31351lsQ.Application.KWHzl, 5);
        sparseIntArray.put(C31351lsQ.Application.HJWChPURsaBn, 6);
        sparseIntArray.put(C31351lsQ.Application.EZpvd, 7);
        sparseIntArray.put(C31351lsQ.Application.aappFQ, 8);
        sparseIntArray.put(C31351lsQ.Application.HJWChPRGtXKC, 9);
        sparseIntArray.put(C31351lsQ.Application.setProfilesSinceInitCount, 10);
        sparseIntArray.put(C31351lsQ.Application.HJWChPRGtXKCDKRTZD, 11);
        sparseIntArray.put(C31351lsQ.Application.BVXAa, 12);
        sparseIntArray.put(C31351lsQ.Application.AEQbTJ, 13);
        sparseIntArray.put(C31351lsQ.Application.fZBcTu, 14);
        sparseIntArray.put(C31351lsQ.Application.ODCBUN, 15);
        sparseIntArray.put(C31351lsQ.Application.iqMDAV, 16);
    }

    public C31575lwd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, fARcdN, fIwbmz));
    }

    public C31575lwd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ComposeView) objArr[13], (android.widget.TextView) objArr[5], (C55251xgS) objArr[7], (Guideline) objArr[14], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[16], (android.widget.ImageView) objArr[15], (ConstraintLayout) objArr[0], (android.widget.RadioButton) objArr[1], (Guideline) objArr[8], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[10]);
        this.AuCTel = -1L;
        this.gEmmrt.setTag(null);
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
