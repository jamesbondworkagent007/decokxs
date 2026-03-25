package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.MaterialToolbar;
import o.C31976mKx;

/* JADX INFO: loaded from: classes8.dex */
public class mMU extends mMV {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public long gEmmrt;
    public final android.widget.LinearLayout valueOf;

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
        sparseIntArray.put(C31976mKx.Activity.DCUTEIdCUTEI, 1);
        sparseIntArray.put(C31976mKx.Activity.QfsBiF, 2);
        sparseIntArray.put(C31976mKx.Activity.RJOkX, 3);
        sparseIntArray.put(C31976mKx.Activity.QbewEr, 4);
        sparseIntArray.put(C31976mKx.Activity.QUSxYX, 5);
        sparseIntArray.put(C31976mKx.Activity.dmfpNf, 6);
    }

    public mMU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AhwBna, AYXKKw));
    }

    public mMU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (C5474Td) objArr[6], (MaterialToolbar) objArr[1]);
        this.gEmmrt = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.valueOf = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
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
