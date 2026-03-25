package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQY extends AbstractC48428uRa {
    public static final android.util.SparseIntArray fIwbmz;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long AuCTel;
    public final ConstraintLayout ejfBZ;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.QBiWsm, 1);
        sparseIntArray.put(C48033uCm.Application.dispose, 2);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBar2, 3);
        sparseIntArray.put(C48033uCm.Application.removeCancellable, 4);
        sparseIntArray.put(C48033uCm.Application.canTextInput, 5);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleHoneycombSetIndicatorInfo, 6);
        sparseIntArray.put(C48033uCm.Application.ReportDrawnCompositioncheckReporter1, 7);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatMediaKeyAction, 8);
        sparseIntArray.put(C48033uCm.Application.target, 9);
        sparseIntArray.put(C48033uCm.Application.postOrRun, 10);
        sparseIntArray.put(C48033uCm.Application.onRepeatModeChanged, 11);
        sparseIntArray.put(C48033uCm.Application.DtA, 12);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 13);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 14);
        sparseIntArray.put(C48033uCm.Application.iwGUEr, 15);
    }

    public uQY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, fIwbmz));
    }

    public uQY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52877was) objArr[15], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[1], (C53539wnR) objArr[12], (C50189vFe) objArr[10], (C47988uAv) objArr[11], (RecyclerView) objArr[8], (C55258xgZ) objArr[4], (C53526wnE) objArr[2], (C52883way) objArr[7], (C55258xgZ) objArr[9], (android.widget.TextView) objArr[6], (android.widget.FrameLayout) objArr[5], (android.view.View) objArr[3], (C54154wyx) objArr[13]);
        this.AuCTel = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
