package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C45508srO;

/* JADX INFO: renamed from: o.srT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C45513srT extends AbstractC45514srU {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final android.widget.FrameLayout AhwBna;
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
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C45508srO.TaskDescription.DbNXlk, 2);
        sparseIntArray.put(C45508srO.TaskDescription.AhwBna, 3);
        sparseIntArray.put(C45508srO.TaskDescription.uzCIH, 4);
        sparseIntArray.put(C45508srO.TaskDescription.OLrzqt, 5);
        sparseIntArray.put(C45508srO.TaskDescription.fJNWhG, 6);
    }

    public C45513srT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, gEmmrt));
    }

    public C45513srT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[5], (android.widget.FrameLayout) objArr[1], (android.widget.ImageView) objArr[3], (android.widget.LinearLayout) objArr[2], (C55113xdn) objArr[6], (android.widget.TextView) objArr[4]);
        this.djBIcL = -1L;
        this.copydefault.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.AhwBna = frameLayout;
        frameLayout.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.copydefault, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
