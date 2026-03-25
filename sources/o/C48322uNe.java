package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48322uNe extends uMV {
    public static final ViewDataBinding.IncludedLayouts hDKMBd = null;
    public static final android.util.SparseIntArray iwGUEr;
    public long AubY;
    public final android.widget.LinearLayout zsXlph;

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
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi21TransportControls, 1);
        sparseIntArray.put(C48033uCm.Application.target, 2);
        sparseIntArray.put(C48033uCm.Application.setBufferedPosition, 3);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBarActionModeImpl, 4);
        sparseIntArray.put(C48033uCm.Application.setErrorMessage, 5);
        sparseIntArray.put(C48033uCm.Application.fXHmeK, 6);
        sparseIntArray.put(C48033uCm.Application.dvImUD, 7);
        sparseIntArray.put(C48033uCm.Application.UJpkuA, 8);
        sparseIntArray.put(C48033uCm.Application.QsIRgs, 9);
        sparseIntArray.put(C48033uCm.Application.ToolbarActionBar2, 10);
        sparseIntArray.put(C48033uCm.Application.HJWChPQPAeHI, 11);
        sparseIntArray.put(C48033uCm.Application.setShuffleModeEnabledRemoved, 12);
        sparseIntArray.put(C48033uCm.Application.AppCompatDelegateImplActionModeCallbackWrapperV91, 13);
        sparseIntArray.put(C48033uCm.Application.removeQueueItemAt, 14);
        sparseIntArray.put(C48033uCm.Application.ComponentActivity, 15);
        sparseIntArray.put(C48033uCm.Application.Api19Impl, 16);
        sparseIntArray.put(C48033uCm.Application.r8lambdah2i_RK2mddCIbAsGubaI4eL8_cU, 17);
        sparseIntArray.put(C48033uCm.Application.createCallback, 18);
        sparseIntArray.put(C48033uCm.Application.getMinimumWidth, 19);
        sparseIntArray.put(C48033uCm.Application.RIsQag, 20);
        sparseIntArray.put(C48033uCm.Application.send, 21);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatApi21Builder, 22);
        sparseIntArray.put(C48033uCm.Application.onShuffleModeChanged, 23);
    }

    public C48322uNe(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, hDKMBd, iwGUEr));
    }

    public C48322uNe(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[6], (C53605woe) objArr[7], (android.widget.TextView) objArr[11], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[8], (C55258xgZ) objArr[20], (wPX) objArr[22], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[14], (ConstraintLayout) objArr[12], (android.widget.TextView) objArr[18], (NestedScrollView) objArr[1], (C47988uAv) objArr[3], (C53605woe) objArr[5], (RecyclerView) objArr[21], (wYK) objArr[16], (LinearLayoutCompat) objArr[15], (C55258xgZ) objArr[17], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[13], (C55258xgZ) objArr[10], (uBL) objArr[4], (C54154wyx) objArr[19]);
        this.AubY = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.zsXlph = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AubY = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AubY != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AubY = 0L;
        }
    }
}
