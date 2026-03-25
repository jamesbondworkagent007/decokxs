package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C32045mNl extends AbstractC32044mNk {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public final android.widget.LinearLayout gEmmrt;
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
        sparseIntArray.put(C31976mKx.Activity.DTwDnp, 1);
        sparseIntArray.put(C31976mKx.Activity.QOLQEE, 2);
        sparseIntArray.put(C31976mKx.Activity.valueOf, 3);
        sparseIntArray.put(C31976mKx.Activity.AYXKKw, 4);
    }

    public C32045mNl(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, KWHzl, AYXKKw));
    }

    public C32045mNl(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.Button) objArr[3], (android.widget.Button) objArr[4], (android.widget.EditText) objArr[1], (android.widget.EditText) objArr[2]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.gEmmrt = linearLayout;
        linearLayout.setTag(null);
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
