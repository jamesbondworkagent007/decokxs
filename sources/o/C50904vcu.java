package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vcu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50904vcu extends AbstractC50908vcy {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fJNWhG;
    public final android.widget.LinearLayout ejfBZ;
    public long fARcdN;

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
        sparseIntArray.put(C48033uCm.Application.IIEbr, 1);
        sparseIntArray.put(C48033uCm.Application.fullyDrawnReported, 2);
        sparseIntArray.put(C48033uCm.Application.AppCompatDialogFragment, 3);
        sparseIntArray.put(C48033uCm.Application.RbMRq, 4);
        sparseIntArray.put(C48033uCm.Application.addReporter, 5);
        sparseIntArray.put(C48033uCm.Application.AppCompatDialogExternalSyntheticLambda0, 6);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26, 7);
        sparseIntArray.put(C48033uCm.Application.setHandleNativeActionModesEnabled, 8);
        sparseIntArray.put(C48033uCm.Application.getSessionToken, 9);
        sparseIntArray.put(C48033uCm.Application.requestWindowFeature, 10);
        sparseIntArray.put(C48033uCm.Application.createView, 11);
        sparseIntArray.put(C48033uCm.Application.installViewFactory, 12);
        sparseIntArray.put(C48033uCm.Application.onReceiveResult, 13);
        sparseIntArray.put(C48033uCm.Application.ActivityViewModelLazyKtviewModelsfactoryPromise2, 14);
        sparseIntArray.put(C48033uCm.Application.clearMenuPresenters, 15);
    }

    public C50904vcu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, AuCTel, fJNWhG));
    }

    public C50904vcu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C47988uAv) objArr[1], (C47988uAv) objArr[4], (android.widget.ImageView) objArr[9], (android.widget.LinearLayout) objArr[13], (android.widget.LinearLayout) objArr[7], (wYK) objArr[14], (android.widget.FrameLayout) objArr[2], (android.widget.FrameLayout) objArr[5], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (C55258xgZ) objArr[8], (android.widget.TextView) objArr[10], (C55258xgZ) objArr[15], (wYK) objArr[3], (wYK) objArr[6]);
        this.fARcdN = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.ejfBZ = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}
