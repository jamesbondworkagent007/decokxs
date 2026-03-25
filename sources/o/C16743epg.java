package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16743epg extends AbstractC16745epi {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long DbNXlk;
    public final ConstraintLayout values;

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
        sparseIntArray.put(C13754dXa.ActionBar.OqIZjC, 1);
        sparseIntArray.put(C13754dXa.ActionBar.IdRes, 2);
        sparseIntArray.put(C13754dXa.ActionBar.unregisterCallbackListener, 3);
        sparseIntArray.put(C13754dXa.ActionBar.setRccState, 4);
        sparseIntArray.put(C13754dXa.ActionBar.izFvvl, 5);
        sparseIntArray.put(C13754dXa.ActionBar.reportRunnablelambda2, 6);
        sparseIntArray.put(C13754dXa.ActionBar.postWhenReportersAreDone, 7);
        sparseIntArray.put(C13754dXa.ActionBar.launchdefault, 8);
        sparseIntArray.put(C13754dXa.ActionBar.onStart, 9);
    }

    public C16743epg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, fetchVPNInfo));
    }

    public C16743epg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[5], (android.widget.ImageView) objArr[1], (AppCompatImageView) objArr[3], (C15509eKz) objArr[4], (android.widget.TextView) objArr[9], (C15503eKt) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[8], (C15506eKw) objArr[2]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
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
