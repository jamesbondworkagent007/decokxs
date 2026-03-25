package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50821vbQ extends AbstractC50824vbT {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
    public final android.widget.LinearLayout fetchVPNInfo;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.ITrustedWebActivityServiceStubProxy, 1);
        sparseIntArray.put(C48033uCm.Application.FhERFw, 2);
        sparseIntArray.put(C48033uCm.Application.DzCpqu, 3);
        sparseIntArray.put(C48033uCm.Application.setCurrentControllerInfo, 4);
        sparseIntArray.put(C48033uCm.Application.initWindowDecorActionBar, 5);
        sparseIntArray.put(C48033uCm.Application.INotificationSideChannelStubProxy, 6);
        sparseIntArray.put(C48033uCm.Application.IResultReceiverDefault, 7);
        sparseIntArray.put(C48033uCm.Application.finish, 8);
    }

    public C50821vbQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AYXKKw, valueOf));
    }

    public C50821vbQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[6], (android.widget.TextView) objArr[4], (RecyclerView) objArr[7], (android.widget.TextView) objArr[5], (android.view.View) objArr[8]);
        this.isConnected = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
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
