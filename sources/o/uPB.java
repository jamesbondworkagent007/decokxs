package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPB extends uPD {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.LinearLayout DbNXlk;
    public long gEmmrt;

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
        sparseIntArray.put(C48033uCm.Application.aVhqwO, 3);
        sparseIntArray.put(C48033uCm.Application.aKhcqp, 4);
        sparseIntArray.put(C48033uCm.Application.setupView, 5);
        sparseIntArray.put(C48033uCm.Application.AlertController, 6);
        sparseIntArray.put(C48033uCm.Application.setNeutralButtonIcon, 7);
    }

    public uPB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, djBIcL, valueOf));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uPB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[3];
        C50944vdh c50944vdhCopydefault = obj != null ? C50944vdh.copydefault((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[4];
        super(dataBindingComponent, view, 0, c50944vdhCopydefault, obj2 != null ? C50940vdd.KWHzl((android.view.View) obj2) : null, (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[7]);
        this.gEmmrt = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AhwBna = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) objArr[1];
        this.AYXKKw = linearLayout2;
        linearLayout2.setTag(null);
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) objArr[2];
        this.DbNXlk = linearLayout3;
        linearLayout3.setTag(null);
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
