package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uQP extends uQR {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long AkhnZx;
    public final NestedScrollView fetchVPNInfo;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.cancel, 1);
        sparseIntArray.put(C48033uCm.Application.RZMhtF, 2);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatTransportControlsApi21, 3);
        sparseIntArray.put(C48033uCm.Application.validateCustomAction, 4);
        sparseIntArray.put(C48033uCm.Application.DsL, 5);
        sparseIntArray.put(C48033uCm.Application.iLWfRf, 6);
        sparseIntArray.put(C48033uCm.Application.aappFQ, 7);
        sparseIntArray.put(C48033uCm.Application.dXcUrg, 8);
        sparseIntArray.put(C48033uCm.Application.HJWChPzRXNTw, 9);
        sparseIntArray.put(C48033uCm.Application.DaTmkG, 10);
    }

    public uQP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, DbNXlk));
    }

    public uQP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[10], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[5], (AppCompatImageView) objArr[7], (RecyclerView) objArr[8], (android.widget.LinearLayout) objArr[6], (android.widget.ImageView) objArr[2], (android.view.View) objArr[9], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[3]);
        this.AkhnZx = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.fetchVPNInfo = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
