package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16448ekC extends AbstractC16496eky {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final ConstraintLayout djBIcL;
    public long valueOf;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.scanPackages, 1);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 2);
        sparseIntArray.put(C13754dXa.ActionBar.sbu, 3);
        sparseIntArray.put(C13754dXa.ActionBar.sendVolumeInfoChanged, 4);
        sparseIntArray.put(C13754dXa.ActionBar.QUSxYX, 5);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 6);
    }

    public C16448ekC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, gEmmrt, AhwBna));
    }

    public C16448ekC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C21229gvn) objArr[5], (ConstraintLayout) objArr[1], (AppCompatImageView) objArr[3], (C55113xdn) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[2]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
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
