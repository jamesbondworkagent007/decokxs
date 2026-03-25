package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16401ejI extends AbstractC16398ejF {
    public static final android.util.SparseIntArray EZpvd;
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public long AYXKKw;
    public final LinearLayoutCompat gEmmrt;

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
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getSubtitle, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getQueue, 3);
    }

    public C16401ejI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, KWHzl, EZpvd));
    }

    public C16401ejI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (OKAlertBanner) objArr[2], (RecyclerView) objArr[3]);
        this.AYXKKw = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.gEmmrt = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
