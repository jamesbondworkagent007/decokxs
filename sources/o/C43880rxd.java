package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43880rxd extends AbstractC43823rwZ {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.QkdxfA, 1);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJKDGTeJD, 2);
        sparseIntArray.put(C43662rtX.ActionBar.QSLkRj, 3);
        sparseIntArray.put(C43662rtX.ActionBar.OFhtUX, 4);
        sparseIntArray.put(C43662rtX.ActionBar.hrNTAI, 5);
        sparseIntArray.put(C43662rtX.ActionBar.DCUTEIdCUTEI, 6);
        sparseIntArray.put(C43662rtX.ActionBar.aJFbMH, 7);
    }

    public C43880rxd(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, AhwBna));
    }

    public C43880rxd(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[1], (android.widget.TextView) objArr[5], (C55251xgS) objArr[4], (android.widget.TextView) objArr[3], (LinearLayoutCompat) objArr[0], (LinearLayoutCompat) objArr[6], (android.widget.ImageView) objArr[7], (Flow) objArr[2]);
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
