package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C50781vad extends AbstractC50779vab {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AYXKKw;
    public final NestedScrollView djBIcL;

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
        sparseIntArray.put(C48033uCm.Application.setCursor, 1);
        sparseIntArray.put(C48033uCm.Application.ITrustedWebActivityCallbackStubProxy, 2);
        sparseIntArray.put(C48033uCm.Application.fromRating, 3);
        sparseIntArray.put(C48033uCm.Application.FullyDrawnReporter, 4);
        sparseIntArray.put(C48033uCm.Application.WindowDecorActionBarTabImpl, 5);
        sparseIntArray.put(C48033uCm.Application.unregisterCallback, 6);
    }

    public C50781vad(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, AhwBna));
    }

    public C50781vad(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (C55353xiO) objArr[3], (wYE) objArr[6], (RecyclerView) objArr[4], (android.widget.TextView) objArr[1], (LinearLayoutCompat) objArr[5]);
        this.AYXKKw = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.djBIcL = nestedScrollView;
        nestedScrollView.setTag(null);
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
