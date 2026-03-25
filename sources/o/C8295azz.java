package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.okinc.auth.impl.widget.SimpleToolBar;
import com.okinc.uilab.edit.OKEditText;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8295azz extends AbstractC8294azy {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public final ConstraintLayout AkhnZx;
    public long values;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C8206ayP.StateListAnimator.AEQbTJ, 1);
        sparseIntArray.put(C8206ayP.StateListAnimator.isReflectionWorking, 2);
        sparseIntArray.put(C8206ayP.StateListAnimator.ggKfIT, 3);
        sparseIntArray.put(C8206ayP.StateListAnimator.DcqEDu, 4);
        sparseIntArray.put(C8206ayP.StateListAnimator.aJZHYI, 5);
        sparseIntArray.put(C8206ayP.StateListAnimator.OuxcSI, 6);
        sparseIntArray.put(C8206ayP.StateListAnimator.Dmq, 7);
        sparseIntArray.put(C8206ayP.StateListAnimator.OqFWZa, 8);
        sparseIntArray.put(C8206ayP.StateListAnimator.RKcVTr, 9);
        sparseIntArray.put(C8206ayP.StateListAnimator.QVAiDq, 10);
    }

    public C8295azz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, DbNXlk, isConnected));
    }

    public C8295azz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (SimpleToolBar) objArr[1], (C52794wYp) objArr[10], (C55008xbo) objArr[8], (OKEditText) objArr[6], (android.widget.ImageView) objArr[7], (android.widget.LinearLayout) objArr[4], (FragmentContainerView) objArr[9], (C6695aUG) objArr[5], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
