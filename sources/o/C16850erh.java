package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16850erh extends AbstractC16848erf {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final ConstraintLayout DbNXlk;
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
        sparseIntArray.put(C13754dXa.ActionBar.ibrGus, 1);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsStartActivityForResultCompanion, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getSessionToken2Bundle, 3);
        sparseIntArray.put(C13754dXa.ActionBar.remove, 4);
        sparseIntArray.put(C13754dXa.ActionBar.copydefault, 5);
        sparseIntArray.put(C13754dXa.ActionBar.mayLaunchUrl, 6);
        sparseIntArray.put(C13754dXa.ActionBar.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DYICSh, 8);
        sparseIntArray.put(C13754dXa.ActionBar.unsubscribe, 9);
        sparseIntArray.put(C13754dXa.ActionBar.DTg, 10);
    }

    public C16850erh(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, fetchVPNInfo));
    }

    public C16850erh(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[5], (C52794wYp) objArr[10], (AppCompatImageView) objArr[1], (AppCompatImageView) objArr[8], (android.widget.LinearLayout) objArr[6], (android.view.View) objArr[9], (android.widget.RelativeLayout) objArr[3], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[2]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
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
