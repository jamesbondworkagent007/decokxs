package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48522uUn extends AbstractC48523uUo {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout AkhnZx;
    public long fetchVPNInfo;

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
        sparseIntArray.put(C48033uCm.Application.getViewModelStore, 1);
        sparseIntArray.put(C48033uCm.Application.setMediaId, 2);
        sparseIntArray.put(C48033uCm.Application.QAQCdZ, 3);
        sparseIntArray.put(C48033uCm.Application.apHBvG, 4);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatMediaBrowserImplBase2, 5);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatCustomActionResultReceiver, 6);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, 7);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatMediaSessionImplBaseMediaSessionStub, 8);
        sparseIntArray.put(C48033uCm.Application.djSkpj, 9);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 10);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatApi24, 11);
    }

    public C48522uUn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, DbNXlk));
    }

    public C48522uUn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[9], (C53539wnR) objArr[10], (C55251xgS) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[6], (C55251xgS) objArr[5], (C55372xih) objArr[2], (android.widget.TextView) objArr[11], (C47988uAv) objArr[8], (OKReminder) objArr[1]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
