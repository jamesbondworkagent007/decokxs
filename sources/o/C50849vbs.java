package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50849vbs extends AbstractC50845vbo {
    public static final android.util.SparseIntArray fetchVPNInfo;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final ConstraintLayout AkhnZx;
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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.receiveFile, 1);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsServiceStub, 2);
        sparseIntArray.put(C48033uCm.Application.GravityInt, 3);
        sparseIntArray.put(C48033uCm.Application.toInclusive, 4);
        sparseIntArray.put(C48033uCm.Application.newSession, 5);
        sparseIntArray.put(C48033uCm.Application.mayLaunchUrl, 6);
        sparseIntArray.put(C48033uCm.Application.hasLogo, 7);
        sparseIntArray.put(C48033uCm.Application.completeDeferredDestroyActionMode, 8);
        sparseIntArray.put(C48033uCm.Application.hasIcon, 9);
    }

    public C50849vbs(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, fetchVPNInfo));
    }

    public C50849vbs(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[5], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[2], (android.widget.LinearLayout) objArr[3], (Flow) objArr[4], (AppCompatTextView) objArr[8], (AppCompatImageView) objArr[7], (Group) objArr[9]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
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
