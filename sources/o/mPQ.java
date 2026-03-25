package o;

import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C32113mPz;

/* JADX INFO: loaded from: classes8.dex */
public class mPQ extends mPR {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final android.widget.RelativeLayout djBIcL;

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
        sparseIntArray.put(C32113mPz.FragmentManager.dvKsVJ, 1);
        sparseIntArray.put(C32113mPz.FragmentManager.dxcTrN, 2);
        sparseIntArray.put(C32113mPz.FragmentManager.djSkpj, 3);
        sparseIntArray.put(C32113mPz.FragmentManager.AuCTel, 4);
        sparseIntArray.put(C32113mPz.FragmentManager.fZBcTu, 5);
    }

    public mPQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, valueOf));
    }

    public mPQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[4], (android.widget.ImageView) objArr[3], (android.widget.EditText) objArr[2], (CardView) objArr[1], (RecyclerView) objArr[5]);
        this.AYXKKw = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[0];
        this.djBIcL = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}
