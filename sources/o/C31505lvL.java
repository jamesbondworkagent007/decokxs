package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31505lvL extends AbstractC31503lvJ {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final ConstraintLayout DbNXlk;
    public long valueOf;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.fXYAwm, 1);
        sparseIntArray.put(C31351lsQ.Application.fhUrPt, 2);
        sparseIntArray.put(C31351lsQ.Application.pause, 3);
        sparseIntArray.put(C31351lsQ.Application.RSDDiY, 4);
        sparseIntArray.put(C31351lsQ.Application.OmYuqg, 5);
        sparseIntArray.put(C31351lsQ.Application.compare, 6);
        sparseIntArray.put(C31351lsQ.Application.ffGIBT, 7);
    }

    public C31505lvL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AYXKKw));
    }

    public C31505lvL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
