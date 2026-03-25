package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16990euO extends AbstractC16987euL {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AkhnZx;
    public final ConstraintLayout DbNXlk;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.parseResult, 1);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaImageOnly, 3);
        sparseIntArray.put(C13754dXa.ActionBar.BackHandlerlambda0, 4);
        sparseIntArray.put(C13754dXa.ActionBar.BackHandler, 5);
        sparseIntArray.put(C13754dXa.ActionBar.BackHandlerKtBackHandler2, 6);
        sparseIntArray.put(C13754dXa.ActionBar.BackHandlerKtBackHandler2invokeinlinedonDispose1, 7);
        sparseIntArray.put(C13754dXa.ActionBar.hashCode, 8);
    }

    public C16990euO(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AYXKKw));
    }

    public C16990euO(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (C55251xgS) objArr[8], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[3]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
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
