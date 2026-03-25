package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48534uUz extends AbstractC48533uUy {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.onResult, 1);
        sparseIntArray.put(C48033uCm.Application.setExtraBinder, 2);
        sparseIntArray.put(C48033uCm.Application.RcXXUw, 3);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatCallback, 4);
        sparseIntArray.put(C48033uCm.Application.setPlaybackToRemote, 5);
        sparseIntArray.put(C48033uCm.Application.onMediaButtonEvent, 6);
        sparseIntArray.put(C48033uCm.Application.onPlayFromMediaId, 7);
        sparseIntArray.put(C48033uCm.Application.setSessionActivity, 8);
        sparseIntArray.put(C48033uCm.Application.onFastForward, 9);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompat1, 10);
        sparseIntArray.put(C48033uCm.Application.removeOnActiveChangeListener, 11);
        sparseIntArray.put(C48033uCm.Application.setMetadata, 12);
        sparseIntArray.put(C48033uCm.Application.setFlags, 13);
    }

    public C48534uUz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, AkhnZx, fetchVPNInfo));
    }

    public C48534uUz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (android.view.View) objArr[1], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[2]);
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
