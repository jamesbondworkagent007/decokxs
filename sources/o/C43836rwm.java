package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43836rwm extends AbstractC43837rwn {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public final android.widget.FrameLayout djBIcL;
    public final LinearLayoutCompat gEmmrt;
    public long valueOf;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.DCUTEI, 2);
        sparseIntArray.put(C43662rtX.ActionBar.processStrongAuthMessage, 3);
        sparseIntArray.put(C43662rtX.ActionBar.gasjUx, 4);
        sparseIntArray.put(C43662rtX.ActionBar.ORxRYg, 5);
        sparseIntArray.put(C43662rtX.ActionBar.RgLUBD, 6);
    }

    public C43836rwm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AhwBna, AYXKKw));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C43836rwm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        C55113xdn c55113xdn = (C55113xdn) objArr[5];
        RecyclerView recyclerView = (RecyclerView) objArr[4];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, c55113xdn, recyclerView, obj != null ? C43961rzE.OLrzqt((android.view.View) obj) : null, (C52794wYp) objArr[6], (C55254xgV) objArr[3]);
        this.valueOf = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.gEmmrt = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[1];
        this.djBIcL = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}
