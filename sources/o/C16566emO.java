package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16566emO extends AbstractC16570emS {
    public static final android.util.SparseIntArray djBIcL;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final ConstraintLayout AhwBna;
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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.write, 1);
        sparseIntArray.put(C13754dXa.ActionBar.CheckResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DfrfUJ, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DIIpTV, 4);
        sparseIntArray.put(C13754dXa.ActionBar.DSiOMJ, 5);
    }

    public C16566emO(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, gEmmrt, djBIcL));
    }

    public C16566emO(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[5], (C52794wYp) objArr[4], (android.widget.TextView) objArr[3], (LottieAnimationView) objArr[1], (android.widget.TextView) objArr[2]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
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
