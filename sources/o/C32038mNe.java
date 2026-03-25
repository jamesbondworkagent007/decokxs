package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C32038mNe extends AbstractC32035mNb {
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public static final android.util.SparseIntArray getNewProxyInstance;
    public long getFieldNames;
    public final android.widget.LinearLayout iwGUEr;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C31976mKx.Activity.fjfviF, 1);
        sparseIntArray.put(C31976mKx.Activity.djBIcL, 2);
        sparseIntArray.put(C31976mKx.Activity.OqFWZa, 3);
        sparseIntArray.put(C31976mKx.Activity.USBtdM, 4);
        sparseIntArray.put(C31976mKx.Activity.DCJXGO, 5);
        sparseIntArray.put(C31976mKx.Activity.heceqZ, 6);
        sparseIntArray.put(C31976mKx.Activity.iRxXKY, 7);
        sparseIntArray.put(C31976mKx.Activity.ODWQjV, 8);
        sparseIntArray.put(C31976mKx.Activity.TarCU, 9);
        sparseIntArray.put(C31976mKx.Activity.DAIeex, 10);
        sparseIntArray.put(C31976mKx.Activity.getPostValueLengthLimit, 11);
        sparseIntArray.put(C31976mKx.Activity.UhxbNG, 12);
        sparseIntArray.put(C31976mKx.Activity.AxsJAYsNCnLh, 13);
        sparseIntArray.put(C31976mKx.Activity.uzCIH, 14);
        sparseIntArray.put(C31976mKx.Activity.hDKMBd, 15);
        sparseIntArray.put(C31976mKx.Activity.iwGUEr, 16);
        sparseIntArray.put(C31976mKx.Activity.getFieldNames, 17);
        sparseIntArray.put(C31976mKx.Activity.zLjUOn, 18);
        sparseIntArray.put(C31976mKx.Activity.getNewProxyInstance, 19);
    }

    public C32038mNe(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, ejfBZ, getNewProxyInstance));
    }

    public C32038mNe(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[2], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[19], (android.widget.LinearLayout) objArr[14], (android.widget.LinearLayout) objArr[17], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[13], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[8], (android.widget.LinearLayout) objArr[11], (C33609mzg) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[12]);
        this.getFieldNames = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.iwGUEr = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}
