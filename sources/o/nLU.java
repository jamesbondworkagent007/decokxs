package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.remote.RelationInfo;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nLU extends nLX {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public long AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@androidx.annotation.Nullable RelationInfo relationInfo) {
        this.copydefault = relationInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.invokespecialsiEkQe, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.Hx, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.hTAtCx, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.onLost, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.iZzfmt, 5);
    }

    public nLU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, valueOf));
    }

    public nLU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (C52794wYp) objArr[5], (C35893oHp) objArr[1], (android.widget.LinearLayout) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.AhwBna = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        AEQbTJ((RelationInfo) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
