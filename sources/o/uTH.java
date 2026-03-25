package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uTH extends uTJ {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long ejfBZ;
    public final android.widget.LinearLayout fJNWhG;

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
        sparseIntArray.put(C48033uCm.Application.fvQaOB, 1);
        sparseIntArray.put(C48033uCm.Application.hQufeQ, 2);
        sparseIntArray.put(C48033uCm.Application.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA, 3);
        sparseIntArray.put(C48033uCm.Application.DvMhtu, 4);
        sparseIntArray.put(C48033uCm.Application.onRemoveQueueItemAt, 5);
        sparseIntArray.put(C48033uCm.Application.onDraw, 6);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 7);
        sparseIntArray.put(C48033uCm.Application.DXTac, 8);
        sparseIntArray.put(C48033uCm.Application.getActionBarThemedContext, 9);
        sparseIntArray.put(C48033uCm.Application.onSkipToNext, 10);
        sparseIntArray.put(C48033uCm.Application.NonNull, 11);
        sparseIntArray.put(C48033uCm.Application.setDrawerSlideAnimationEnabled, 12);
        sparseIntArray.put(C48033uCm.Application.onClick, 13);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24, 14);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 15);
    }

    public uTH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fARcdN, fIwbmz));
    }

    public uTH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57597ylS) objArr[1], (C52794wYp) objArr[15], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[2], (Guideline) objArr[4], (C47988uAv) objArr[8], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[5], (C47988uAv) objArr[10], (AppCompatImageView) objArr[3], (AppCompatTextView) objArr[6], (C53530wnI) objArr[11], (C53530wnI) objArr[9], (AppCompatTextView) objArr[13], (C55258xgZ) objArr[12]);
        this.ejfBZ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fJNWhG = linearLayout;
        linearLayout.setTag(null);
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
