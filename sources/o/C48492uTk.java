package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48492uTk extends AbstractC48493uTl {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final android.widget.LinearLayout DbNXlk;
    public long isConnected;

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
        sparseIntArray.put(C48033uCm.Application.multiple, 1);
        sparseIntArray.put(C48033uCm.Application.ITrustedWebActivityServiceStubProxy, 2);
        sparseIntArray.put(C48033uCm.Application.FhERFw, 3);
        sparseIntArray.put(C48033uCm.Application.StringRes, 4);
        sparseIntArray.put(C48033uCm.Application.initWindowDecorActionBar, 5);
        sparseIntArray.put(C48033uCm.Application.unregisterCallbackListener, 6);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatToken, 7);
        sparseIntArray.put(C48033uCm.Application.rewind, 8);
        sparseIntArray.put(C48033uCm.Application.setProfilesSinceInitCount, 9);
    }

    public C48492uTk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, fetchVPNInfo));
    }

    public C48492uTk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[9], (android.widget.ImageView) objArr[2], (C47988uAv) objArr[8], (C47988uAv) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[4], (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[5]);
        this.isConnected = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.DbNXlk = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
