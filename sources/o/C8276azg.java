package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8276azg extends AbstractC8275azf {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C8206ayP.StateListAnimator.fdOvFl, 1);
        sparseIntArray.put(C8206ayP.StateListAnimator.fkESqH, 2);
        sparseIntArray.put(C8206ayP.StateListAnimator.DPhTBN, 3);
    }

    public C8276azg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, valueOf, AhwBna));
    }

    public C8276azg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55008xbo) objArr[1], (android.widget.TextView) objArr[3], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[0]);
        this.djBIcL = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C8209ayS.EZpvd != i) {
            return false;
        }
        AEQbTJ((java.lang.Boolean) obj);
        return true;
    }

    @Override // o.AbstractC8275azf
    public void AEQbTJ(@androidx.annotation.Nullable java.lang.Boolean bool) {
        this.OLrzqt = bool;
        synchronized (this) {
            this.djBIcL |= 1;
        }
        notifyPropertyChanged(C8209ayS.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        long j2 = j & 3;
        boolean zSafeUnbox = j2 != 0 ? ViewDataBinding.safeUnbox(this.OLrzqt) : false;
        if (j2 != 0) {
            this.KWHzl.setVisibility(C57632ymA.AEQbTJ(zSafeUnbox));
        }
    }
}
