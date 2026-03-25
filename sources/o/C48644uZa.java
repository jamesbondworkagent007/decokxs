package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48644uZa extends uYV {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray getNewProxyInstance;
    public long hDKMBd;
    public final android.widget.LinearLayout iwGUEr;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.RXzakW, 1);
        sparseIntArray.put(C48033uCm.Application.zXhzOT, 2);
        sparseIntArray.put(C48033uCm.Application.hQufeQ, 3);
        sparseIntArray.put(C48033uCm.Application.addCancellable, 4);
        sparseIntArray.put(C48033uCm.Application.r8lambdamcLa5hzjxuexHpGdLt3kU1m1dA, 5);
        sparseIntArray.put(C48033uCm.Application.DvMhtu, 6);
        sparseIntArray.put(C48033uCm.Application.QfgJNx, 7);
        sparseIntArray.put(C48033uCm.Application.onRemoveQueueItemAt, 8);
        sparseIntArray.put(C48033uCm.Application.onDraw, 9);
        sparseIntArray.put(C48033uCm.Application.QhYuFg, 10);
        sparseIntArray.put(C48033uCm.Application.DXTac, 11);
        sparseIntArray.put(C48033uCm.Application.getActionBarThemedContext, 12);
        sparseIntArray.put(C48033uCm.Application.ExperimentalLevel, 13);
        sparseIntArray.put(C48033uCm.Application.MainThread, 14);
        sparseIntArray.put(C48033uCm.Application.setDrawerSlideAnimationEnabled, 15);
        sparseIntArray.put(C48033uCm.Application.areNotificationsEnabled, 16);
        sparseIntArray.put(C48033uCm.Application.setToolbarNavigationClickListener, 17);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24, 18);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 19);
    }

    public C48644uZa(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, fARcdN, getNewProxyInstance));
    }

    public C48644uZa(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (C52794wYp) objArr[19], (NestedScrollView) objArr[2], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[3], (android.view.View) objArr[7], (Guideline) objArr[6], (C47988uAv) objArr[11], (android.widget.ImageView) objArr[16], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[8], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[4], (C53530wnI) objArr[14], (C47988uAv) objArr[13], (C47988uAv) objArr[12], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[15]);
        this.hDKMBd = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.iwGUEr = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
