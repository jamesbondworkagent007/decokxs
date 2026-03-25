package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48474uSt extends AbstractC48473uSs {
    public static final android.util.SparseIntArray fJNWhG;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long ejfBZ;
    public final LinearLayoutCompat fIwbmz;

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
        sparseIntArray.put(C48033uCm.Application.AuCTelauCTel, 1);
        sparseIntArray.put(C48033uCm.Application.zuBGHE, 2);
        sparseIntArray.put(C48033uCm.Application.sSMYrx, 3);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatMediaControllerImplApi21ExtraCallback, 4);
        sparseIntArray.put(C48033uCm.Application.OFnBcz, 5);
        sparseIntArray.put(C48033uCm.Application.component1, 6);
        sparseIntArray.put(C48033uCm.Application.BinderThread, 7);
        sparseIntArray.put(C48033uCm.Application.RhjxDW, 8);
        sparseIntArray.put(C48033uCm.Application.HrMTQN, 9);
        sparseIntArray.put(C48033uCm.Application.OBzZra, 10);
        sparseIntArray.put(C48033uCm.Application.markerClass, 11);
        sparseIntArray.put(C48033uCm.Application.gRtANS, 12);
        sparseIntArray.put(C48033uCm.Application.gHZMYf, 13);
        sparseIntArray.put(C48033uCm.Application.QKVWgx, 14);
    }

    public C48474uSt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, isConnected, fJNWhG));
    }

    public C48474uSt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (LinearLayoutCompat) objArr[1], (ShapeableImageView) objArr[2], (android.widget.TextView) objArr[3], (LinearLayoutCompat) objArr[13], (android.widget.TextView) objArr[14], (RecyclerView) objArr[8], (LinearLayoutCompat) objArr[9], (android.widget.TextView) objArr[12], (LinearLayoutCompat) objArr[5], (android.widget.TextView) objArr[10], (LinearLayoutCompat) objArr[4], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[11]);
        this.ejfBZ = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.fIwbmz = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
