package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uVy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48560uVy extends uVA {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final android.widget.LinearLayout ejfBZ;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.isFullyDrawnReported, 1);
        sparseIntArray.put(C48033uCm.Application.ComponentDialogExternalSyntheticLambda1, 2);
        sparseIntArray.put(C48033uCm.Application.onAnimationEnd, 3);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection2, 4);
        sparseIntArray.put(C48033uCm.Application.getQueueTitle, 5);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 6);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 7);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 8);
        sparseIntArray.put(C48033uCm.Application.sanitizeWindowFeatureId, 9);
        sparseIntArray.put(C48033uCm.Application.getFlags, 10);
        sparseIntArray.put(C48033uCm.Application.getActiveQueueItemId, 11);
        sparseIntArray.put(C48033uCm.Application.flagMapping, 12);
        sparseIntArray.put(C48033uCm.Application.siEkQe, 13);
    }

    public C48560uVy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, DbNXlk, fetchVPNInfo));
    }

    public C48560uVy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53539wnR) objArr[6], (C52794wYp) objArr[13], (android.widget.TextView) objArr[8], (C50189vFe) objArr[4], (android.view.View) objArr[10], (C47988uAv) objArr[5], (AppCompatTextView) objArr[11], (RecyclerView) objArr[2], (NestedScrollView) objArr[1], (C51969vwz) objArr[12], (AppCompatTextView) objArr[9], (AppCompatTextView) objArr[3], (C54154wyx) objArr[7]);
        this.fJNWhG = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.ejfBZ = linearLayout;
        linearLayout.setTag(null);
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
