package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43967rzK extends AbstractC43964rzH {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long values;

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
        sparseIntArray.put(C43662rtX.ActionBar.QXDzTk, 1);
        sparseIntArray.put(C43662rtX.ActionBar.UlJrfe, 2);
        sparseIntArray.put(C43662rtX.ActionBar.USBtdM, 3);
        sparseIntArray.put(C43662rtX.ActionBar.OxVOHk, 4);
        sparseIntArray.put(C43662rtX.ActionBar.ixgjPv, 5);
        sparseIntArray.put(C43662rtX.ActionBar.DcqEDu, 6);
        sparseIntArray.put(C43662rtX.ActionBar.hCLrkq, 7);
    }

    public C43967rzK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, valueOf, AYXKKw));
    }

    public C43967rzK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[4], (LinearLayoutCompat) objArr[2], (android.widget.TextView) objArr[3], (android.widget.LinearLayout) objArr[0], (C31695mAm) objArr[5], (C52794wYp) objArr[6], (C52794wYp) objArr[7], (C55055xci) objArr[1]);
        this.values = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}
