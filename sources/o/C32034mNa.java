package o;

import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C32034mNa extends AbstractC32037mNd {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray valueOf;
    public long djBIcL;
    public final android.widget.LinearLayout fetchVPNInfo;

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
        sparseIntArray.put(C31976mKx.Activity.DGUQLI, 1);
        sparseIntArray.put(C31976mKx.Activity.ORxRYg, 2);
        sparseIntArray.put(C31976mKx.Activity.AkhnZx, 3);
        sparseIntArray.put(C31976mKx.Activity.DNMMPQ, 4);
        sparseIntArray.put(C31976mKx.Activity.DCUTEI, 5);
        sparseIntArray.put(C31976mKx.Activity.AuCTel, 6);
        sparseIntArray.put(C31976mKx.Activity.accept, 7);
    }

    public C32034mNa(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, valueOf));
    }

    public C32034mNa(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.Button) objArr[3], (android.widget.LinearLayout) objArr[6], (android.widget.EditText) objArr[2], (android.widget.TextView) objArr[7], (SwitchCompat) objArr[5], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[4]);
        this.djBIcL = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fetchVPNInfo = linearLayout;
        linearLayout.setTag(null);
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
