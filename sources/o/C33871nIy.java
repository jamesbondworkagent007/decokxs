package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33871nIy extends AbstractC33872nIz {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public long DbNXlk;
    public final android.widget.LinearLayout isConnected;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.zbGDDc, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.AxsJAY, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.QbewEr, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.DSiOMJ, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.QOjuYg, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.DrqXHJ, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.QfJbVf, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.awiJhF, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.hgxRZI, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.ddhgMB, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUriFromString, 11);
    }

    public C33871nIy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fetchVPNInfo, AkhnZx));
    }

    public C33871nIy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYC) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.FrameLayout) objArr[4], (FragmentContainerView) objArr[6], (FragmentContainerView) objArr[7], (FragmentContainerView) objArr[8], (RecyclerView) objArr[9], (NestedScrollView) objArr[5], (ConstraintLayout) objArr[1], (C55173xeu) objArr[10], (C55113xdn) objArr[11]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.isConnected, C33570myu.AEQbTJ(getRoot().getContext()));
        }
    }
}
