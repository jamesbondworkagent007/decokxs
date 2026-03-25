package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48300uMj extends AbstractC48301uMk {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray uzCIH;
    public final C49617urt AubY;
    public long getFieldNames;
    public final C50015uzT getNewProxyInstance;
    public final android.widget.FrameLayout hDKMBd;
    public final C49524uqF iwGUEr;

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
        uzCIH = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DPHOMC, 4);
        sparseIntArray.put(C48033uCm.Application.onLayoutDirectionChanged, 5);
        sparseIntArray.put(C48033uCm.Application.updateStatusGuard, 6);
        sparseIntArray.put(C48033uCm.Application.onMenuModeChange, 7);
        sparseIntArray.put(C48033uCm.Application.getSmallIconId, 8);
        sparseIntArray.put(C48033uCm.Application.DTwDnp, 9);
        sparseIntArray.put(C48033uCm.Application.requestExtraBinder, 10);
        sparseIntArray.put(C48033uCm.Application.ActivityResult, 11);
        sparseIntArray.put(C48033uCm.Application.fvQaOB, 12);
        sparseIntArray.put(C48033uCm.Application.fACtfg, 13);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImpl6, 14);
        sparseIntArray.put(C48033uCm.Application.invokespecialhOMIpD, 15);
        sparseIntArray.put(C48033uCm.Application.setLogo, 16);
        sparseIntArray.put(C48033uCm.Application.RhlVAI, 17);
        sparseIntArray.put(C48033uCm.Application.RsCxkX, 18);
        sparseIntArray.put(C48033uCm.Application.RjCdvp, 19);
        sparseIntArray.put(C48033uCm.Application.onAvailable, 20);
        sparseIntArray.put(C48033uCm.Application.addSubscription, 21);
        sparseIntArray.put(C48033uCm.Application.OCdtug, 22);
    }

    public C48300uMj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, ejfBZ, uzCIH));
    }

    public C48300uMj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (vBL) objArr[9], (C50016uzU) objArr[12], (FragmentContainerView) objArr[15], (C51935vwR) objArr[4], (C55173xeu) objArr[22], (ConstraintLayout) objArr[19], (android.widget.LinearLayout) objArr[17], (android.widget.FrameLayout) objArr[18], (C55113xdn) objArr[20], (android.widget.FrameLayout) objArr[13], (AppCompatImageView) objArr[8], (android.widget.LinearLayout) objArr[21], (C51923vwF) objArr[10], (C33546myW) objArr[11], (android.widget.FrameLayout) objArr[16], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[14], (android.widget.FrameLayout) objArr[5]);
        this.getFieldNames = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.hDKMBd = frameLayout;
        frameLayout.setTag(null);
        C50015uzT c50015uzT = (C50015uzT) objArr[1];
        this.getNewProxyInstance = c50015uzT;
        c50015uzT.setTag(null);
        java.lang.Object obj = objArr[2];
        this.iwGUEr = obj != null ? C49524uqF.copydefault((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[3];
        this.AubY = obj2 != null ? C49617urt.KWHzl((android.view.View) obj2) : null;
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
