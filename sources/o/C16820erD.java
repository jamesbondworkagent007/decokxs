package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16820erD extends AbstractC16868erz {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final ConstraintLayout fetchVPNInfo;
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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.OqIZjC, 1);
        sparseIntArray.put(C13754dXa.ActionBar.IdRes, 2);
        sparseIntArray.put(C13754dXa.ActionBar.setRccState, 3);
        sparseIntArray.put(C13754dXa.ActionBar.izFvvl, 4);
        sparseIntArray.put(C13754dXa.ActionBar.postWhenReportersAreDone, 5);
        sparseIntArray.put(C13754dXa.ActionBar.onStart, 6);
        sparseIntArray.put(C13754dXa.ActionBar.BinderThread, 7);
        sparseIntArray.put(C13754dXa.ActionBar.USBtdM, 8);
    }

    public C16820erD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AYXKKw));
    }

    public C16820erD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[8], (Guideline) objArr[4], (android.widget.ImageView) objArr[1], (C15509eKz) objArr[3], (android.widget.TextView) objArr[6], (C15503eKt) objArr[5], (android.widget.TextView) objArr[7], (C15506eKw) objArr[2]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
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
