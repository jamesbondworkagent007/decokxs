package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uZL extends uZO {
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public static final android.util.SparseIntArray iwGUEr;
    public long getNewProxyInstance;
    public final android.widget.LinearLayout hDKMBd;

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
        sparseIntArray.put(C48033uCm.Application.flVtFt, 1);
        sparseIntArray.put(C48033uCm.Application.hQufeQ, 2);
        sparseIntArray.put(C48033uCm.Application.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA, 3);
        sparseIntArray.put(C48033uCm.Application.DvMhtu, 4);
        sparseIntArray.put(C48033uCm.Application.dPaqAf, 5);
        sparseIntArray.put(C48033uCm.Application.QfgJNx, 6);
        sparseIntArray.put(C48033uCm.Application.QWSkGZ, 7);
        sparseIntArray.put(C48033uCm.Application.onSetCaptioningEnabled, 8);
        sparseIntArray.put(C48033uCm.Application.onSetRepeatMode, 9);
        sparseIntArray.put(C48033uCm.Application.onDraw, 10);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 11);
        sparseIntArray.put(C48033uCm.Application.DXTac, 12);
        sparseIntArray.put(C48033uCm.Application.getActionBarThemedContext, 13);
        sparseIntArray.put(C48033uCm.Application.onSkipToNext, 14);
        sparseIntArray.put(C48033uCm.Application.NonNull, 15);
        sparseIntArray.put(C48033uCm.Application.setDrawerSlideAnimationEnabled, 16);
        sparseIntArray.put(C48033uCm.Application.areNotificationsEnabled, 17);
        sparseIntArray.put(C48033uCm.Application.onClick, 18);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 19);
    }

    public uZL(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, fIwbmz, iwGUEr));
    }

    public uZL(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[19], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[2], (android.view.View) objArr[6], (android.view.View) objArr[7], (Guideline) objArr[4], (Guideline) objArr[5], (C47988uAv) objArr[12], (android.widget.ImageView) objArr[17], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[9], (C47988uAv) objArr[14], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[10], (C53530wnI) objArr[15], (C53530wnI) objArr[13], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[16]);
        this.getNewProxyInstance = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.hDKMBd = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getNewProxyInstance = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getNewProxyInstance != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getNewProxyInstance = 0L;
        }
    }
}
