package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.ryj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43939ryj extends AbstractC43935ryf {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public long AhwBna;
    public final LinearLayoutCompat fetchVPNInfo;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.iKEqwx, 1);
        sparseIntArray.put(C43662rtX.ActionBar.OHqIaq, 2);
        sparseIntArray.put(C43662rtX.ActionBar.dmfpNf, 3);
        sparseIntArray.put(C43662rtX.ActionBar.ODXsMY, 4);
        sparseIntArray.put(C43662rtX.ActionBar.QkdxfA, 5);
        sparseIntArray.put(C43662rtX.ActionBar.RKDWNf, 6);
        sparseIntArray.put(C43662rtX.ActionBar.OFhtUX, 7);
    }

    public C43939ryj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, valueOf));
    }

    public C43939ryj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[4], (LinearLayoutCompat) objArr[2], (android.widget.TextView) objArr[7], (android.view.View) objArr[1]);
        this.AhwBna = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.fetchVPNInfo = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}
