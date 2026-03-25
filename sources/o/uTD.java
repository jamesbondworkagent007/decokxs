package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uTD extends uTE {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fJNWhG;
    public long fARcdN;
    public final ConstraintLayout fIwbmz;

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
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.flVtFt, 1);
        sparseIntArray.put(C48033uCm.Application.DGUQLI, 2);
        sparseIntArray.put(C48033uCm.Application.KDccX, 3);
        sparseIntArray.put(C48033uCm.Application.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner1, 4);
        sparseIntArray.put(C48033uCm.Application.DWgRXt, 5);
        sparseIntArray.put(C48033uCm.Application.WS, 6);
        sparseIntArray.put(C48033uCm.Application.DcqEDu, 7);
        sparseIntArray.put(C48033uCm.Application.closeSocket, 8);
        sparseIntArray.put(C48033uCm.Application.getUriFromString, 9);
        sparseIntArray.put(C48033uCm.Application.DzCpqu, 10);
        sparseIntArray.put(C48033uCm.Application.showForActionMode, 11);
        sparseIntArray.put(C48033uCm.Application.getDecorToolbar, 12);
        sparseIntArray.put(C48033uCm.Application.getDefaultViewModelCreationExtras, 13);
        sparseIntArray.put(C48033uCm.Application.getDefaultViewModelProviderFactory, 14);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 15);
    }

    public uTD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, AuCTel, fJNWhG));
    }

    public uTD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (AppCompatTextView) objArr[6], (C53539wnR) objArr[7], (C47988uAv) objArr[5], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[2], (C52794wYp) objArr[15], (android.view.View) objArr[10], (Barrier) objArr[9], (Group) objArr[8], (AppCompatTextView) objArr[13], (AppCompatTextView) objArr[14], (Group) objArr[4], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[12]);
        this.fARcdN = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
