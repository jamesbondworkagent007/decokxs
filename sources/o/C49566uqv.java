package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49566uqv extends AbstractC49570uqz {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
    public long AkhnZx;
    public final ConstraintLayout isConnected;

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
        sparseIntArray.put(C49511upt.Application.QKVWgx, 2);
        sparseIntArray.put(C49511upt.Application.DTwDnp, 3);
        sparseIntArray.put(C49511upt.Application.giSNqX, 4);
        sparseIntArray.put(C49511upt.Application.RJOkX, 5);
        sparseIntArray.put(C49511upt.Application.fvQaOB, 6);
        sparseIntArray.put(C49511upt.Application.hrNTAI, 7);
        sparseIntArray.put(C49511upt.Application.DGOPHZ, 8);
        sparseIntArray.put(C49511upt.Application.hrjNmC, 9);
        sparseIntArray.put(C49511upt.Application.hDKMBd, 10);
        sparseIntArray.put(C49511upt.Application.wlaJM, 11);
    }

    public C49566uqv(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, fetchVPNInfo, values));
    }

    public C49566uqv(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[10], (C52794wYp) objArr[11], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (C55001xbh) objArr[5], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[6], (android.widget.TextView) objArr[1], (CardView) objArr[7], (RecyclerView) objArr[8], (android.widget.LinearLayout) objArr[9]);
        this.AkhnZx = -1L;
        this.djBIcL.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AkhnZx;
            this.AkhnZx = 0L;
        }
        if ((j & 1) != 0) {
            TextViewBindingAdapter.setText(this.djBIcL, "x");
        }
    }
}
