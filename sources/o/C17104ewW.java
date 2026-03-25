package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17104ewW extends AbstractC17103ewV {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray djBIcL;
    public final ConstraintLayout AhwBna;
    public long gEmmrt;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.Th, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaSession, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getCurrentControllerInfo, 3);
        sparseIntArray.put(C13754dXa.ActionBar.FhERFw, 4);
        sparseIntArray.put(C13754dXa.ActionBar.addOnActiveChangeListener, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getController, 6);
    }

    public C17104ewW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AYXKKw, djBIcL));
    }

    public C17104ewW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[1], (android.widget.ImageView) objArr[4], (OKEditText) objArr[5], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[3], (ConstraintLayout) objArr[2]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AhwBna = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
