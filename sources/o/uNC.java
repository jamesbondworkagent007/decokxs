package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uNC extends uND {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fARcdN;
    public long ejfBZ;

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
        sparseIntArray.put(C48033uCm.Application.hQufeQ, 1);
        sparseIntArray.put(C48033uCm.Application.addCancellable, 2);
        sparseIntArray.put(C48033uCm.Application.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA, 3);
        sparseIntArray.put(C48033uCm.Application.DvMhtu, 4);
        sparseIntArray.put(C48033uCm.Application.QfgJNx, 5);
        sparseIntArray.put(C48033uCm.Application.onRemoveQueueItemAt, 6);
        sparseIntArray.put(C48033uCm.Application.onDraw, 7);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 8);
        sparseIntArray.put(C48033uCm.Application.DXTac, 9);
        sparseIntArray.put(C48033uCm.Application.getActionBarThemedContext, 10);
        sparseIntArray.put(C48033uCm.Application.ExperimentalLevel, 11);
        sparseIntArray.put(C48033uCm.Application.MainThread, 12);
        sparseIntArray.put(C48033uCm.Application.setDrawerSlideAnimationEnabled, 13);
        sparseIntArray.put(C48033uCm.Application.areNotificationsEnabled, 14);
        sparseIntArray.put(C48033uCm.Application.setToolbarNavigationClickListener, 15);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24, 16);
    }

    public uNC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, AuCTel, fARcdN));
    }

    public uNC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (NestedScrollView) objArr[0], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[1], (android.view.View) objArr[5], (Guideline) objArr[4], (C47988uAv) objArr[9], (android.widget.ImageView) objArr[14], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[2], (C53530wnI) objArr[12], (C47988uAv) objArr[11], (C47988uAv) objArr[10], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[13]);
        this.ejfBZ = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
