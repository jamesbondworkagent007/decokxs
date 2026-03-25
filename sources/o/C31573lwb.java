package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31573lwb extends AbstractC31517lvX {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.QsIRgs, 1);
        sparseIntArray.put(C31351lsQ.Application.ORxRYg, 2);
        sparseIntArray.put(C31351lsQ.Application.zzJhsT, 3);
        sparseIntArray.put(C31351lsQ.Application.DQnQnb, 4);
        sparseIntArray.put(C31351lsQ.Application.OrsvgJ, 5);
    }

    public C31573lwb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, gEmmrt));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31573lwb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        C31513lvT c31513lvTOLrzqt = obj != null ? C31513lvT.OLrzqt((android.view.View) obj) : null;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[4];
        android.widget.ImageView imageView = (android.widget.ImageView) objArr[5];
        android.view.View view2 = (android.view.View) objArr[3];
        java.lang.Object obj2 = objArr[1];
        super(dataBindingComponent, view, 0, c31513lvTOLrzqt, constraintLayout, frameLayout, imageView, view2, obj2 != null ? C31513lvT.OLrzqt((android.view.View) obj2) : null);
        this.valueOf = -1L;
        this.copydefault.setTag(null);
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
