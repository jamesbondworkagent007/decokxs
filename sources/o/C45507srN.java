package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C45508srO;

/* JADX INFO: renamed from: o.srN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C45507srN extends AbstractC45509srP {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray djBIcL;
    public long AhwBna;
    public final android.widget.FrameLayout valueOf;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C45508srO.TaskDescription.DbNXlk, 2);
        sparseIntArray.put(C45508srO.TaskDescription.uzCIH, 3);
        sparseIntArray.put(C45508srO.TaskDescription.OLrzqt, 4);
        sparseIntArray.put(C45508srO.TaskDescription.fJNWhG, 5);
    }

    public C45507srN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AYXKKw, djBIcL));
    }

    public C45507srN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[4], (android.widget.FrameLayout) objArr[1], (android.widget.LinearLayout) objArr[2], (C55113xdn) objArr[5], (android.widget.TextView) objArr[3]);
        this.AhwBna = -1L;
        this.KWHzl.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.valueOf = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AhwBna;
            this.AhwBna = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.KWHzl, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
