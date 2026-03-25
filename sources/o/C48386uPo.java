package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uPo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48386uPo extends AbstractC48381uPj {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long AuCTel;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.toLegacyStreamType, 1);
        sparseIntArray.put(C48033uCm.Application.registerCallbackMessenger, 2);
        sparseIntArray.put(C48033uCm.Application.getView, 3);
        sparseIntArray.put(C48033uCm.Application.ITrustedWebActivityCallback, 4);
        sparseIntArray.put(C48033uCm.Application.AlertControllerAlertParams1, 5);
        sparseIntArray.put(C48033uCm.Application.QbewEr, 6);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleHoneycomb, 7);
        sparseIntArray.put(C48033uCm.Application.hwXsuq, 8);
        sparseIntArray.put(C48033uCm.Application.FYtjSf, 9);
        sparseIntArray.put(C48033uCm.Application.update, 10);
        sparseIntArray.put(C48033uCm.Application.sendState, 11);
        sparseIntArray.put(C48033uCm.Application.sendVolumeInfoChanged, 12);
        sparseIntArray.put(C48033uCm.Application.ActivityViewModelLazyKtviewModels1, 13);
    }

    public C48386uPo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, isConnected, fARcdN));
    }

    public C48386uPo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[6], (android.widget.LinearLayout) objArr[9], (wUX) objArr[8], (android.widget.ImageView) objArr[4], (android.widget.LinearLayout) objArr[2], (NestedScrollView) objArr[1], (android.widget.LinearLayout) objArr[0], (LinearLayoutCompat) objArr[10], (C55258xgZ) objArr[11], (android.widget.TextView) objArr[12], (RecyclerView) objArr[13], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3]);
        this.AuCTel = -1L;
        this.gEmmrt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}
