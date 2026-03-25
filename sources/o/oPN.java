package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public class oPN extends oPO {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fARcdN;
    public long AuCTel;
    public final android.widget.LinearLayout fIwbmz;

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
        sparseIntArray.put(C35964oKf.StateListAnimator.OAhWiU, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.iMXFZQ, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.onSkipToNext, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.onSetRepeatMode, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.DsfknC, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.onSeekTo, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.onPrepareFromUri, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.fastForward, 8);
        sparseIntArray.put(C35964oKf.StateListAnimator.OAjjVP, 9);
        sparseIntArray.put(C35964oKf.StateListAnimator.onSetShuffleMode, 10);
        sparseIntArray.put(C35964oKf.StateListAnimator.HJWChPUUMfbK, 11);
        sparseIntArray.put(C35964oKf.StateListAnimator.zlzhuY, 12);
        sparseIntArray.put(C35964oKf.StateListAnimator.GQzpsZ, 13);
        sparseIntArray.put(C35964oKf.StateListAnimator.hGuIrQ, 14);
        sparseIntArray.put(C35964oKf.StateListAnimator.GPCHlQ, 15);
    }

    public oPN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, ejfBZ, fARcdN));
    }

    public oPN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[15], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[13], (android.widget.ImageView) objArr[14], (android.view.View) objArr[11], (android.widget.LinearLayout) objArr[12], (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[9], (android.widget.TextView) objArr[8], (android.view.View) objArr[6], (android.view.View) objArr[7], (android.view.View) objArr[3], (android.view.View) objArr[4], (android.view.View) objArr[10]);
        this.AuCTel = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fIwbmz = linearLayout;
        linearLayout.setTag(null);
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
