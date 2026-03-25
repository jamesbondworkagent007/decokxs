package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36025oMm extends AbstractC36029oMq {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.RsCxkX, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.setCaptioningEnabled, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.SFHvfSaKzXkR, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.dpErvT, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.UlpNxW, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.DcMfJKDSqxTE, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.search, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.zhUgOk, 8);
    }

    public C36025oMm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, DbNXlk));
    }

    public C36025oMm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[8], (C55113xdn) objArr[6], (android.widget.LinearLayout) objArr[4], (C36250oUv) objArr[1], (C39828pzh) objArr[3], (android.widget.FrameLayout) objArr[0], (C55173xeu) objArr[5], (C55237xgE) objArr[7], (android.widget.TextView) objArr[2]);
        this.values = -1L;
        this.AhwBna.setTag(null);
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
