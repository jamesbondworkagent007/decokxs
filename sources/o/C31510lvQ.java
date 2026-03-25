package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31510lvQ extends AbstractC31508lvO {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.fXYAwm, 1);
        sparseIntArray.put(C31351lsQ.Application.fhUrPt, 2);
        sparseIntArray.put(C31351lsQ.Application.pause, 3);
        sparseIntArray.put(C31351lsQ.Application.dtVxwd, 4);
        sparseIntArray.put(C31351lsQ.Application.OmJATG, 5);
        sparseIntArray.put(C31351lsQ.Application.zqTOFw, 6);
        sparseIntArray.put(C31351lsQ.Application.zhUgOk, 7);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKDDUqPf, 8);
    }

    public C31510lvQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AhwBna));
    }

    public C31510lvQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[8], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[4]);
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
