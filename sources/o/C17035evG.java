package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17035evG extends AbstractC17038evJ {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long AkhnZx;
    public final ConstraintLayout isConnected;

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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivity1, 1);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21, 2);
        sparseIntArray.put(C13754dXa.ActionBar.OYuSWK, 3);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivity, 4);
        sparseIntArray.put(C13754dXa.ActionBar.gwTjWJ, 5);
        sparseIntArray.put(C13754dXa.ActionBar.removeOnConfigurationChangedListener, 6);
        sparseIntArray.put(C13754dXa.ActionBar.removeOnContextAvailableListener, 7);
        sparseIntArray.put(C13754dXa.ActionBar.UhxbNG, 8);
    }

    public C17035evG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, gEmmrt));
    }

    public C17035evG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55239xgG) objArr[5], (C52794wYp) objArr[8], (ConstraintLayout) objArr[3], (RecyclerView) objArr[2], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[7], (AppCompatTextView) objArr[1]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
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
