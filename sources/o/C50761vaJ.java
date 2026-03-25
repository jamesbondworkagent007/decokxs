package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vaJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50761vaJ extends AbstractC50764vaM {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long DbNXlk;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.Rdimen, 1);
        sparseIntArray.put(C48033uCm.Application.MediaBrowserCompatSearchCallback, 2);
        sparseIntArray.put(C48033uCm.Application.preparePanel, 3);
        sparseIntArray.put(C48033uCm.Application.HJWChPhFGucI, 4);
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompat, 5);
        sparseIntArray.put(C48033uCm.Application.iqMDAV, 6);
        sparseIntArray.put(C48033uCm.Application.adwzgZ, 7);
        sparseIntArray.put(C48033uCm.Application.GQzpsZsQwTVT, 8);
    }

    public C50761vaJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, gEmmrt, AhwBna));
    }

    public C50761vaJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (FragmentContainerView) objArr[6], (Group) objArr[8], (wYK) objArr[4], (C55173xeu) objArr[7], (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[2], (android.view.View) objArr[1], (wYK) objArr[3]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
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
