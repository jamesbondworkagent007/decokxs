package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.google.android.material.tabs.TabLayout;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31459luS extends AbstractC31451luK {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AYXKKw;
    public final ConstraintLayout DbNXlk;

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
        sparseIntArray.put(C31351lsQ.Application.RvdRAu, 1);
        sparseIntArray.put(C31351lsQ.Application.gqOnQv, 2);
        sparseIntArray.put(C31351lsQ.Application.OLrzqt, 3);
        sparseIntArray.put(C31351lsQ.Application.ROgMPW, 4);
        sparseIntArray.put(C31351lsQ.Application.OAUGar, 5);
        sparseIntArray.put(C31351lsQ.Application.invokespecialRtjmuc, 6);
        sparseIntArray.put(C31351lsQ.Application.zDGrpR, 7);
    }

    public C31459luS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AhwBna));
    }

    public C31459luS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[3], (android.widget.LinearLayout) objArr[1], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[4], (TabLayout) objArr[2], (C33544myU) objArr[7], (android.widget.TextView) objArr[5]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.DbNXlk, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
