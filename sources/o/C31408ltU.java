package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.fragment.app.FragmentContainerView;
import com.okinc.buysell.view.LegacyBuySellHeader;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31408ltU extends AbstractC31407ltT {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray EZpvd;
    public final ConstraintLayout AYXKKw;
    public long KWHzl;

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
        EZpvd = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.fJNWhG, 1);
        sparseIntArray.put(C31351lsQ.Application.zzQwtT, 2);
    }

    public C31408ltU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, AEQbTJ, EZpvd));
    }

    public C31408ltU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (LegacyBuySellHeader) objArr[1], (FragmentContainerView) objArr[2]);
        this.KWHzl = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.KWHzl = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.KWHzl != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.KWHzl;
            this.KWHzl = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.AYXKKw, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
