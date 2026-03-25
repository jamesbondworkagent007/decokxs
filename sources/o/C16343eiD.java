package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16343eiD extends AbstractC16342eiC {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout fARcdN;
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
        sparseIntArray.put(C13754dXa.ActionBar.write, 1);
        sparseIntArray.put(C13754dXa.ActionBar.QKudOq, 2);
        sparseIntArray.put(C13754dXa.ActionBar.removeCancellable, 3);
        sparseIntArray.put(C13754dXa.ActionBar.RequiresPermissionRead, 4);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedCallback, 5);
        sparseIntArray.put(C13754dXa.ActionBar.RequiresPermissionWrite, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getEnabledChangedCallbackactivity_release, 7);
        sparseIntArray.put(C13754dXa.ActionBar.anyOf, 8);
        sparseIntArray.put(C13754dXa.ActionBar.addCancellable, 9);
        sparseIntArray.put(C13754dXa.ActionBar.initializeReflectiveFields, 10);
        sparseIntArray.put(C13754dXa.ActionBar.swzYdv, 11);
        sparseIntArray.put(C13754dXa.ActionBar.sVXHln, 12);
    }

    public C16343eiD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, DbNXlk));
    }

    public C16343eiD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[2], (C52794wYp) objArr[11], (C52794wYp) objArr[12], (LottieAnimationView) objArr[1], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[3], (android.view.View) objArr[4], (android.view.View) objArr[6], (android.view.View) objArr[8]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fARcdN = constraintLayout;
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
