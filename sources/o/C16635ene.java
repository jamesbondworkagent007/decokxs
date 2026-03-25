package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ene, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16635ene extends AbstractC16636enf {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray gEmmrt;
    public long valueOf;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 1);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ComponentActivity1, 3);
        sparseIntArray.put(C13754dXa.ActionBar.addOnMultiWindowModeChangedListener, 4);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21, 5);
        sparseIntArray.put(C13754dXa.ActionBar.GQzpsZgQzpsZ, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DuXjdv, 7);
    }

    public C16635ene(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, gEmmrt));
    }

    public C16635ene(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (Group) objArr[7], (C55173xeu) objArr[6], (RecyclerView) objArr[5], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.values = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
