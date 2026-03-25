package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uVt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48555uVt extends AbstractC48557uVv {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray OLrzqt;
    public final NestedScrollView AYXKKw;
    public long djBIcL;

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
        OLrzqt = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.onPlayFromUri, 1);
        sparseIntArray.put(C48033uCm.Application.describeContents, 2);
        sparseIntArray.put(C48033uCm.Application.draw, 3);
    }

    public C48555uVt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, AEQbTJ, OLrzqt));
    }

    public C48555uVt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[2], (RecyclerView) objArr[1], (AppCompatTextView) objArr[3]);
        this.djBIcL = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.AYXKKw = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}
