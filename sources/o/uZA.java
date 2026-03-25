package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uZA extends uZD {
    public static final android.util.SparseIntArray ejfBZ;
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public final ConstraintLayout fARcdN;
    public long fJNWhG;

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
        ejfBZ = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getActions, 1);
        sparseIntArray.put(C48033uCm.Application.getCurrentPosition, 2);
        sparseIntArray.put(C48033uCm.Application.onStateChange, 3);
        sparseIntArray.put(C48033uCm.Application.getBufferedPosition, 4);
        sparseIntArray.put(C48033uCm.Application.getFlags, 5);
        sparseIntArray.put(C48033uCm.Application.registerCallback, 6);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatCallback, 7);
        sparseIntArray.put(C48033uCm.Application.scheduleDrawable, 8);
        sparseIntArray.put(C48033uCm.Application.binderDied, 9);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompat, 10);
        sparseIntArray.put(C48033uCm.Application.hTAtCx, 11);
        sparseIntArray.put(C48033uCm.Application.onLost, 12);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatApi24Callback, 13);
        sparseIntArray.put(C48033uCm.Application.getSessionActivity, 14);
        sparseIntArray.put(C48033uCm.Application.SFHvfSaKzXkR, 15);
    }

    public uZA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fIwbmz, ejfBZ));
    }

    public uZA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Group) objArr[15], (C51959vwp) objArr[12], (android.widget.TextView) objArr[11], (android.view.View) objArr[5], (android.view.View) objArr[10], (Group) objArr[14], (C51959vwp) objArr[9], (android.widget.TextView) objArr[6], (C51959vwp) objArr[7], (Group) objArr[13], (C51959vwp) objArr[4], (android.widget.TextView) objArr[1], (C51959vwp) objArr[2], (C51959vwp) objArr[8], (C51959vwp) objArr[3]);
        this.fJNWhG = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fARcdN = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}
