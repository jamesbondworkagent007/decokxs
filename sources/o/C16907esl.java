package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16907esl extends AbstractC16908esm {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public final ConstraintLayout AkhnZx;
    public long DbNXlk;

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
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 1);
        sparseIntArray.put(C13754dXa.ActionBar.onMenuItemSelected, 2);
        sparseIntArray.put(C13754dXa.ActionBar.sendState, 3);
        sparseIntArray.put(C13754dXa.ActionBar.hasCallback, 4);
        sparseIntArray.put(C13754dXa.ActionBar.addMenuProvider, 5);
        sparseIntArray.put(C13754dXa.ActionBar.DfrfUJ, 6);
        sparseIntArray.put(C13754dXa.ActionBar.sendQueue, 7);
        sparseIntArray.put(C13754dXa.ActionBar.setMediaUri, 8);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPhFGucI, 9);
    }

    public C16907esl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AhwBna, fetchVPNInfo));
    }

    public C16907esl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[6], (Guideline) objArr[9], (android.widget.ImageView) objArr[1], (C52794wYp) objArr[8], (android.widget.TextView) objArr[7], (C55251xgS) objArr[3], (C55251xgS) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[2]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
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
