package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48319uNb extends AbstractC48321uNd {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long uzCIH;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DdI, 1);
        sparseIntArray.put(C48033uCm.Application.fraLem, 2);
        sparseIntArray.put(C48033uCm.Application.QBiWsm, 3);
        sparseIntArray.put(C48033uCm.Application.ActionBarTabListener, 4);
        sparseIntArray.put(C48033uCm.Application.RAaltf, 5);
        sparseIntArray.put(C48033uCm.Application.UrRBLY, 6);
        sparseIntArray.put(C48033uCm.Application.fHqPtx, 7);
        sparseIntArray.put(C48033uCm.Application.RuDPQV, 8);
        sparseIntArray.put(C48033uCm.Application.IMediaSessionStub, 9);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseCommand, 10);
        sparseIntArray.put(C48033uCm.Application.playFromSearch, 11);
        sparseIntArray.put(C48033uCm.Application.DtnWsU, 12);
        sparseIntArray.put(C48033uCm.Application.removeCancellable, 13);
        sparseIntArray.put(C48033uCm.Application.ScLVFT, 14);
        sparseIntArray.put(C48033uCm.Application.getConnectivityMgr, 15);
        sparseIntArray.put(C48033uCm.Application.FF, 16);
        sparseIntArray.put(C48033uCm.Application.OHsvZP, 17);
    }

    public C48319uNb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fJNWhG, fARcdN));
    }

    public C48319uNb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53513wms) objArr[7], (android.widget.FrameLayout) objArr[6], (Barrier) objArr[8], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[17], (C55258xgZ) objArr[15], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[2], (C47988uAv) objArr[14], (ConstraintLayout) objArr[1], (Guideline) objArr[5], (C47988uAv) objArr[11], (C47988uAv) objArr[9], (NestedScrollView) objArr[0], (android.widget.TextView) objArr[10], (C55258xgZ) objArr[13], (C55251xgS) objArr[4]);
        this.uzCIH = -1L;
        this.values.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.uzCIH = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.uzCIH != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.uzCIH = 0L;
        }
    }
}
