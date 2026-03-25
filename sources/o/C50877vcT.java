package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50877vcT extends AbstractC50879vcV {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public final ConstraintLayout isConnected;
    public long valueOf;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.hbZCHz, 1);
        sparseIntArray.put(C48033uCm.Application.onMetadataChanged, 2);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseMessageHandler, 3);
        sparseIntArray.put(C48033uCm.Application.OFhtUX, 4);
        sparseIntArray.put(C48033uCm.Application.Rdrawable, 5);
        sparseIntArray.put(C48033uCm.Application.aCSzUz, 6);
        sparseIntArray.put(C48033uCm.Application.QSLkRj, 7);
    }

    public C50877vcT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, AhwBna));
    }

    public C50877vcT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[4], (AppCompatImageView) objArr[7], (C52710wVm) objArr[6], (AppCompatTextView) objArr[1], (C55251xgS) objArr[2], (C55251xgS) objArr[3], (C52710wVm) objArr[5]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
