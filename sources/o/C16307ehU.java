package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16307ehU extends AbstractC16301ehO {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray AhwBna;
    public final ConstraintLayout AkhnZx;
    public final LinearLayoutCompat fetchVPNInfo;
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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.fERRXa, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ixgjPv, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DCUTEIdCUTEI, 4);
        sparseIntArray.put(C13754dXa.ActionBar.accept, 5);
        sparseIntArray.put(C13754dXa.ActionBar.onLoadChildren, 6);
        sparseIntArray.put(C13754dXa.ActionBar.getSelectedNavigationIndex, 7);
        sparseIntArray.put(C13754dXa.ActionBar.Dff, 8);
        sparseIntArray.put(C13754dXa.ActionBar.getTag, 9);
    }

    public C16307ehU(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AYXKKw, AhwBna));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16307ehU(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[5];
        java.lang.Object obj = objArr[2];
        C16797eqh c16797eqhAEQbTJ = obj != null ? C16797eqh.AEQbTJ((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[3];
        C16797eqh c16797eqhAEQbTJ2 = obj2 != null ? C16797eqh.AEQbTJ((android.view.View) obj2) : null;
        java.lang.Object obj3 = objArr[4];
        super(dataBindingComponent, view, 0, linearLayoutCompat, c16797eqhAEQbTJ, c16797eqhAEQbTJ2, obj3 != null ? C16797eqh.AEQbTJ((android.view.View) obj3) : null, (android.widget.ImageView) objArr[8], (android.widget.ImageView) objArr[6], (RecyclerView) objArr[9], (AppCompatTextView) objArr[7]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[1];
        this.fetchVPNInfo = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
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
            ViewBindingAdapter.setPaddingTop(this.AkhnZx, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}
