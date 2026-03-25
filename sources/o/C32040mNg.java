package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C32040mNg extends AbstractC32039mNf {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public final android.widget.LinearLayout DbNXlk;
    public long fetchVPNInfo;

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
        values = sparseIntArray;
        sparseIntArray.put(C31976mKx.Activity.OTwTPd, 1);
        sparseIntArray.put(C31976mKx.Activity.QDqgQU, 2);
        sparseIntArray.put(C31976mKx.Activity.QVsKAR, 3);
        sparseIntArray.put(C31976mKx.Activity.hBpjJd, 4);
        sparseIntArray.put(C31976mKx.Activity.hrNTAI, 5);
        sparseIntArray.put(C31976mKx.Activity.dHguZz, 6);
        sparseIntArray.put(C31976mKx.Activity.fERRXa, 7);
        sparseIntArray.put(C31976mKx.Activity.QIZEnU, 8);
        sparseIntArray.put(C31976mKx.Activity.DCJXGO, 9);
        sparseIntArray.put(C31976mKx.Activity.ODWQjV, 10);
        sparseIntArray.put(C31976mKx.Activity.DarRvM, 11);
    }

    public C32040mNg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, isConnected, values));
    }

    public C32040mNg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[11], (android.widget.LinearLayout) objArr[9], (android.widget.LinearLayout) objArr[10], (android.widget.RadioButton) objArr[6], (android.widget.RadioButton) objArr[4], (android.widget.RadioButton) objArr[5], (android.widget.RadioGroup) objArr[3], (C55239xgG) objArr[7], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[2]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.DbNXlk = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}
