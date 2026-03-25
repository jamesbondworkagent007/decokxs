package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16656enz extends AbstractC16654enx {
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public static final android.util.SparseIntArray fJNWhG;
    public final ConstraintLayout AuCTel;
    public long ejfBZ;

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
        sparseIntArray.put(C13754dXa.ActionBar.FdcJU, 1);
        sparseIntArray.put(C13754dXa.ActionBar.handleOnBackPressed, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DGUQLIekVPG, 3);
        sparseIntArray.put(C13754dXa.ActionBar.dbAction, 4);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnAfter, 5);
        sparseIntArray.put(C13754dXa.ActionBar.DDxOgT, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getMimeType, 7);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaSingleMimeType, 8);
        sparseIntArray.put(C13754dXa.ActionBar.RxVVQC, 9);
        sparseIntArray.put(C13754dXa.ActionBar.suggest, 10);
        sparseIntArray.put(C13754dXa.ActionBar.identifier, 11);
        sparseIntArray.put(C13754dXa.ActionBar.ReportDrawnWhen, 12);
        sparseIntArray.put(C13754dXa.ActionBar.value, 13);
        sparseIntArray.put(C13754dXa.ActionBar.ContextAware, 14);
        sparseIntArray.put(C13754dXa.ActionBar.fhwtiV, 15);
        sparseIntArray.put(C13754dXa.ActionBar.DUUtXg, 16);
    }

    public C16656enz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, fIwbmz, fJNWhG));
    }

    public C16656enz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (C52794wYp) objArr[16], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[9], (C55030xcJ) objArr[15], (Group) objArr[1], (LinearLayoutCompat) objArr[4], (ConstraintLayout) objArr[11], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[12], (C57461yip) objArr[5], (android.widget.TextView) objArr[14], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[10], (android.widget.TextView) objArr[13]);
        this.ejfBZ = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
