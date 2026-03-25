package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C43662rtX;

/* JADX INFO: renamed from: o.ryG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43910ryG extends AbstractC43914ryK {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable rIB rib) {
        this.OLrzqt = rib;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.vLaW, 1);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJKfbSiEC, 2);
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialaVhqwO, 3);
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialsiEkQe, 4);
        sparseIntArray.put(C43662rtX.ActionBar.XW, 5);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJKgMxgjU, 6);
    }

    public C43910ryG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, gEmmrt));
    }

    public C43910ryG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55008xbo) objArr[1], (android.widget.LinearLayout) objArr[0], (RecyclerView) objArr[3], (android.widget.RelativeLayout) objArr[4], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5]);
        this.isConnected = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C43664rtZ.AEQbTJ != i) {
            return false;
        }
        copydefault((rIB) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
