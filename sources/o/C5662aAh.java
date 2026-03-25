package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5662aAh extends AbstractC5666aAl {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final ConstraintLayout AYXKKw;
    public long djBIcL;

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
        sparseIntArray.put(C8206ayP.StateListAnimator.AEQbTJ, 1);
        sparseIntArray.put(C8206ayP.StateListAnimator.copydefault, 2);
        sparseIntArray.put(C8206ayP.StateListAnimator.isReflectionWorking, 3);
        sparseIntArray.put(C8206ayP.StateListAnimator.DKtBnz, 4);
        sparseIntArray.put(C8206ayP.StateListAnimator.DarRvM, 5);
        sparseIntArray.put(C8206ayP.StateListAnimator.fHqPtx, 6);
    }

    public C5662aAh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, AhwBna));
    }

    public C5662aAh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (LottieAnimationView) objArr[2], (SimpleToolBar) objArr[1], (C52794wYp) objArr[5], (C52794wYp) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.djBIcL = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
