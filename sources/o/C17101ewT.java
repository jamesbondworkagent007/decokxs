package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17101ewT extends AbstractC17102ewU {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long gEmmrt;
    public final android.widget.FrameLayout values;

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
        sparseIntArray.put(C13754dXa.ActionBar.sYOsaF, 2);
        sparseIntArray.put(C13754dXa.ActionBar.DaTmkG, 3);
        sparseIntArray.put(C13754dXa.ActionBar.dmfpNf, 4);
        sparseIntArray.put(C13754dXa.ActionBar.OFhtUX, 5);
        sparseIntArray.put(C13754dXa.ActionBar.OHqIaq, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DLWbHP, 7);
    }

    public C17101ewT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 8, valueOf, AhwBna));
    }

    public C17101ewT(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (C54989xbV) objArr[4], (C54989xbV) objArr[5], (C54989xbV) objArr[6], (C54989xbV) objArr[7], (C18055fbF) objArr[3], (oXR) objArr[2], (ConstraintLayout) objArr[1]);
        this.gEmmrt = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.values = frameLayout;
        frameLayout.setTag(null);
        this.djBIcL.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}
