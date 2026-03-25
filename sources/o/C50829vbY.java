package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50829vbY extends AbstractC50828vbX {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public final ConstraintLayout ejfBZ;
    public long fIwbmz;

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
        values = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.sElUiK, 1);
        sparseIntArray.put(C48033uCm.Application.resume, 2);
        sparseIntArray.put(C48033uCm.Application.invokeSuspendlambda0, 3);
        sparseIntArray.put(C48033uCm.Application.r8lambdatX1ZAZ_6mxGyPSL59qbNSbD0n4g, 4);
        sparseIntArray.put(C48033uCm.Application.PipHintTrackerKttrackPipAnimationHintViewflow1, 5);
        sparseIntArray.put(C48033uCm.Application.name, 6);
        sparseIntArray.put(C48033uCm.Application.getInstance, 7);
        sparseIntArray.put(C48033uCm.Application.PipHintTrackerKttrackPipAnimationHintViewflow1ExternalSyntheticLambda1, 8);
        sparseIntArray.put(C48033uCm.Application.getSessionToken2Bundle, 9);
        sparseIntArray.put(C48033uCm.Application.dispatchMediaButtonEvent, 10);
        sparseIntArray.put(C48033uCm.Application.getPlaybackInfo, 11);
        sparseIntArray.put(C48033uCm.Application.getTransportControls, 12);
        sparseIntArray.put(C48033uCm.Application.OqhRBM, 13);
    }

    public C50829vbY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, isConnected, values));
    }

    public C50829vbY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C54984xbQ) objArr[1], (C54984xbQ) objArr[2], (Group) objArr[13], (wYK) objArr[9], (android.widget.TextView) objArr[10], (C47988uAv) objArr[11], (Group) objArr[12], (wYK) objArr[3], (android.widget.TextView) objArr[4], (C47988uAv) objArr[5], (Group) objArr[8], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7]);
        this.fIwbmz = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ejfBZ = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
