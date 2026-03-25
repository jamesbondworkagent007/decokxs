package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.dLX;

/* JADX INFO: renamed from: o.dMe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C13461dMe extends AbstractC13460dMd {
    public static final android.util.SparseIntArray DbNXlk;
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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(dLX.Application.zuWLRA, 1);
        sparseIntArray.put(dLX.Application.RcXXUw, 2);
        sparseIntArray.put(dLX.Application.AuCTel, 3);
        sparseIntArray.put(dLX.Application.DXXBbs, 4);
        sparseIntArray.put(dLX.Application.dxcTrN, 5);
        sparseIntArray.put(dLX.Application.fvQaOB, 6);
        sparseIntArray.put(dLX.Application.ffGIBT, 7);
        sparseIntArray.put(dLX.Application.djSkpj, 8);
    }

    public C13461dMe(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, DbNXlk));
    }

    public C13461dMe(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[0], (C55173xeu) objArr[8], (C55230xfy) objArr[2], (android.widget.TextView) objArr[5], (wYC) objArr[6], (android.view.View) objArr[4], (RecyclerView) objArr[7], (android.widget.LinearLayout) objArr[1]);
        this.values = -1L;
        this.OLrzqt.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.OLrzqt, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
