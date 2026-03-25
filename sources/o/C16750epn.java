package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16750epn extends AbstractC16742epf {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long AuCTel;
    public final ConstraintLayout fARcdN;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.OqIZjC, 1);
        sparseIntArray.put(C13754dXa.ActionBar.IdRes, 2);
        sparseIntArray.put(C13754dXa.ActionBar.unregisterCallbackListener, 3);
        sparseIntArray.put(C13754dXa.ActionBar.setRccState, 4);
        sparseIntArray.put(C13754dXa.ActionBar.izFvvl, 5);
        sparseIntArray.put(C13754dXa.ActionBar.reportRunnablelambda2, 6);
        sparseIntArray.put(C13754dXa.ActionBar.postWhenReportersAreDone, 7);
        sparseIntArray.put(C13754dXa.ActionBar.launchdefault, 8);
        sparseIntArray.put(C13754dXa.ActionBar.onStart, 9);
        sparseIntArray.put(C13754dXa.ActionBar.BinderThread, 10);
        sparseIntArray.put(C13754dXa.ActionBar.ArrayRes, 11);
        sparseIntArray.put(C13754dXa.ActionBar.zKcAg, 12);
        sparseIntArray.put(C13754dXa.ActionBar.iKEqwx, 13);
        sparseIntArray.put(C13754dXa.ActionBar.fGQ, 14);
        sparseIntArray.put(C13754dXa.ActionBar.zAEkPU, 15);
    }

    public C16750epn(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, ejfBZ, fIwbmz));
    }

    public C16750epn(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[12], (C52794wYp) objArr[15], (C52794wYp) objArr[13], (C52794wYp) objArr[14], (Guideline) objArr[5], (android.widget.ImageView) objArr[1], (AppCompatImageView) objArr[3], (C15509eKz) objArr[4], (android.widget.TextView) objArr[9], (C15503eKt) objArr[7], (android.widget.TextView) objArr[6], (C15503eKt) objArr[8], (android.widget.TextView) objArr[10], (OKReminder) objArr[11], (C15506eKw) objArr[2]);
        this.AuCTel = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fARcdN = constraintLayout;
        constraintLayout.setTag(null);
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
