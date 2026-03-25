package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uTG extends uTF {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long DbNXlk;
    public final android.widget.LinearLayout fetchVPNInfo;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.fvQaOB, 1);
        sparseIntArray.put(C48033uCm.Application.OnBackPressedDispatcherKt, 2);
        sparseIntArray.put(C48033uCm.Application.iFnJKK, 3);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub, 4);
        sparseIntArray.put(C48033uCm.Application.getLifecycleRegistry, 5);
        sparseIntArray.put(C48033uCm.Application.onMenuVisibilityChanged, 6);
        sparseIntArray.put(C48033uCm.Application.DzCpqu, 7);
        sparseIntArray.put(C48033uCm.Application.OnBackPressedDispatcherOnBackPressedCancellable, 8);
        sparseIntArray.put(C48033uCm.Application.sILrnl, 9);
    }

    public uTG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, AkhnZx));
    }

    public uTG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57597ylS) objArr[1], (C52794wYp) objArr[9], (android.view.View) objArr[7], (C53420wlE) objArr[3], (C53567wnt) objArr[4], (C53570wnw) objArr[5], (C53425wlJ) objArr[8], (android.widget.LinearLayout) objArr[2], (C53420wlE) objArr[6]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
