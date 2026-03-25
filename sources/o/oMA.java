package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public class oMA extends AbstractC36036oMx {
    public static final android.util.SparseIntArray iwGUEr;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public long getFieldNames;
    public final CoordinatorLayout hDKMBd;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.UUsvzU, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.onLost, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.connect, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.keyboardTargetTextChanged, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.OVMstZ, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.RsCxkX, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.SFHvfSaKzXkR, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.zFZsbn, 8);
        sparseIntArray.put(C35964oKf.StateListAnimator.QUSxYX, 9);
        sparseIntArray.put(C35964oKf.StateListAnimator.isBrowsable, 10);
        sparseIntArray.put(C35964oKf.StateListAnimator.newArray, 11);
        sparseIntArray.put(C35964oKf.StateListAnimator.glXhWM, 12);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatServiceBinderWrapper, 13);
        sparseIntArray.put(C35964oKf.StateListAnimator.getDescription, 14);
        sparseIntArray.put(C35964oKf.StateListAnimator.aKErDB, 15);
        sparseIntArray.put(C35964oKf.StateListAnimator.dpErvT, 16);
        sparseIntArray.put(C35964oKf.StateListAnimator.UlpNxW, 17);
        sparseIntArray.put(C35964oKf.StateListAnimator.DcMfJKDSqxTE, 18);
        sparseIntArray.put(C35964oKf.StateListAnimator.search, 19);
        sparseIntArray.put(C35964oKf.StateListAnimator.zhUgOk, 20);
    }

    public oMA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 21, uzCIH, iwGUEr));
    }

    public oMA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[9], (C52794wYp) objArr[15], (android.widget.TextView) objArr[20], (C55113xdn) objArr[18], (android.widget.LinearLayout) objArr[16], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[5], (android.widget.LinearLayout) objArr[8], (android.widget.LinearLayout) objArr[12], (C36250oUv) objArr[6], (C57591ylM) objArr[2], (C39828pzh) objArr[7], (android.widget.FrameLayout) objArr[1], (C55173xeu) objArr[17], (C57585ylG) objArr[3], (C55237xgE) objArr[19], (C33624mzv) objArr[10], (C33624mzv) objArr[14], (C33624mzv) objArr[11], (C33624mzv) objArr[13]);
        this.getFieldNames = -1L;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.hDKMBd = coordinatorLayout;
        coordinatorLayout.setTag(null);
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
