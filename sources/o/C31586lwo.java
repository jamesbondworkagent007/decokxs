package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31586lwo extends AbstractC31582lwk {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fIwbmz;
    public final ConstraintLayout getNewProxyInstance;
    public long hDKMBd;

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
        sparseIntArray.put(C31351lsQ.Application.fkESqH, 1);
        sparseIntArray.put(C31351lsQ.Application.RAQtXZ, 2);
        sparseIntArray.put(C31351lsQ.Application.Swccd, 3);
        sparseIntArray.put(C31351lsQ.Application.DzCpqu, 4);
        sparseIntArray.put(C31351lsQ.Application.sElUiK, 5);
        sparseIntArray.put(C31351lsQ.Application.dGrqPl, 6);
        sparseIntArray.put(C31351lsQ.Application.invokespecialdPnHjp, 7);
        sparseIntArray.put(C31351lsQ.Application.OFhtUX, 8);
        sparseIntArray.put(C31351lsQ.Application.zbGDDc, 9);
        sparseIntArray.put(C31351lsQ.Application.ODXsMY, 10);
        sparseIntArray.put(C31351lsQ.Application.OqHLSf, 11);
        sparseIntArray.put(C31351lsQ.Application.isTimeProfileEmpty, 12);
        sparseIntArray.put(C31351lsQ.Application.hrNTAI, 13);
        sparseIntArray.put(C31351lsQ.Application.DVmcag, 14);
        sparseIntArray.put(C31351lsQ.Application.hPlhRW, 15);
        sparseIntArray.put(C31351lsQ.Application.call, 16);
        sparseIntArray.put(C31351lsQ.Application.DzOuPm, 17);
        sparseIntArray.put(C31351lsQ.Application.akftKQ, 18);
    }

    public C31586lwo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, ejfBZ, fIwbmz));
    }

    public C31586lwo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[16], (android.view.View) objArr[18], (Guideline) objArr[1], (Guideline) objArr[3], (Guideline) objArr[2], (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[14], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12]);
        this.hDKMBd = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.getNewProxyInstance = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
