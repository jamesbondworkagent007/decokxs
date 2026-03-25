package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uYO extends uYI {
    public static final android.util.SparseIntArray getFieldNames;
    public static final ViewDataBinding.IncludedLayouts hDKMBd = null;
    public final android.widget.LinearLayout getNewProxyInstance;
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
        getFieldNames = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.RXzakW, 1);
        sparseIntArray.put(C48033uCm.Application.zXhzOT, 2);
        sparseIntArray.put(C48033uCm.Application.hQufeQ, 3);
        sparseIntArray.put(C48033uCm.Application.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA, 4);
        sparseIntArray.put(C48033uCm.Application.DvMhtu, 5);
        sparseIntArray.put(C48033uCm.Application.dPaqAf, 6);
        sparseIntArray.put(C48033uCm.Application.QfgJNx, 7);
        sparseIntArray.put(C48033uCm.Application.QWSkGZ, 8);
        sparseIntArray.put(C48033uCm.Application.onSetCaptioningEnabled, 9);
        sparseIntArray.put(C48033uCm.Application.onSetRepeatMode, 10);
        sparseIntArray.put(C48033uCm.Application.onDraw, 11);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 12);
        sparseIntArray.put(C48033uCm.Application.DXTac, 13);
        sparseIntArray.put(C48033uCm.Application.getActionBarThemedContext, 14);
        sparseIntArray.put(C48033uCm.Application.onSkipToNext, 15);
        sparseIntArray.put(C48033uCm.Application.NonNull, 16);
        sparseIntArray.put(C48033uCm.Application.setDrawerSlideAnimationEnabled, 17);
        sparseIntArray.put(C48033uCm.Application.areNotificationsEnabled, 18);
        sparseIntArray.put(C48033uCm.Application.onClick, 19);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24, 20);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 21);
    }

    public uYO(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 22, hDKMBd, getFieldNames));
    }

    public uYO(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (C52794wYp) objArr[21], (NestedScrollView) objArr[2], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[3], (android.view.View) objArr[7], (android.view.View) objArr[8], (Guideline) objArr[5], (Guideline) objArr[6], (C47988uAv) objArr[13], (android.widget.ImageView) objArr[18], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (C47988uAv) objArr[15], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[11], (C53530wnI) objArr[16], (C53530wnI) objArr[14], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[17]);
        this.uzCIH = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.getNewProxyInstance = linearLayout;
        linearLayout.setTag(null);
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
