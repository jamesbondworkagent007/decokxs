package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.auth.impl.widget.SimpleToolBar;
import o.C8206ayP;

/* JADX INFO: renamed from: o.ayZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8216ayZ extends AbstractC8271azb {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout djBIcL;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C8206ayP.StateListAnimator.AEQbTJ, 1);
        sparseIntArray.put(C8206ayP.StateListAnimator.aUsmxb, 2);
        sparseIntArray.put(C8206ayP.StateListAnimator.isReflectionWorking, 3);
        sparseIntArray.put(C8206ayP.StateListAnimator.DKtBnz, 4);
        sparseIntArray.put(C8206ayP.StateListAnimator.Swccd, 5);
        sparseIntArray.put(C8206ayP.StateListAnimator.DBxZfM, 6);
    }

    public C8216ayZ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AhwBna, valueOf));
    }

    public C8216ayZ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleToolBar) objArr[1], (android.widget.ImageView) objArr[2], (C52794wYp) objArr[6], (android.widget.TextView) objArr[4], (C52794wYp) objArr[5], (android.widget.TextView) objArr[3]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
