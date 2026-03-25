package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C35964oKf;

/* JADX INFO: loaded from: classes8.dex */
public class oOE extends oOF {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public long DbNXlk;
    public final android.widget.LinearLayout values;

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
        sparseIntArray.put(C35964oKf.StateListAnimator.seuMaA, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.asInterface, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.RckOJh, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.GhqvEQ, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.DtnWsU, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.getDefaultImpl, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.OrsvgJ, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.QiTXOm, 8);
    }

    public oOE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AYXKKw, AhwBna));
    }

    public oOE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[7], (android.widget.TextView) objArr[8], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[1], (android.widget.LinearLayout) objArr[6], (android.widget.RelativeLayout) objArr[2]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
