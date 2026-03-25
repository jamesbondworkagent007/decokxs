package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.mDC;

/* JADX INFO: renamed from: o.mHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31887mHp extends AbstractC31885mHn {
    public static final android.util.SparseIntArray AuCTel;
    public static final ViewDataBinding.IncludedLayouts ejfBZ = null;
    public long hDKMBd;

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
        AuCTel = sparseIntArray;
        sparseIntArray.put(mDC.ActionBar.AxsJAYsNCnLh, 1);
        sparseIntArray.put(mDC.ActionBar.KWHzl, 2);
        sparseIntArray.put(mDC.ActionBar.copydefault, 3);
        sparseIntArray.put(mDC.ActionBar.fHqPtx, 4);
        sparseIntArray.put(mDC.ActionBar.heceqZ, 5);
        sparseIntArray.put(mDC.ActionBar.djSkpj, 6);
        sparseIntArray.put(mDC.ActionBar.RJOkX, 7);
        sparseIntArray.put(mDC.ActionBar.gUEfcq, 8);
        sparseIntArray.put(mDC.ActionBar.sTzBva, 9);
        sparseIntArray.put(mDC.ActionBar.DcqEDu, 10);
        sparseIntArray.put(mDC.ActionBar.aJFbMH, 11);
        sparseIntArray.put(mDC.ActionBar.DTwDnp, 12);
        sparseIntArray.put(mDC.ActionBar.alsFma, 13);
        sparseIntArray.put(mDC.ActionBar.DrqXHJ, 14);
        sparseIntArray.put(mDC.ActionBar.akftKQ, 15);
        sparseIntArray.put(mDC.ActionBar.gGvvIC, 16);
        sparseIntArray.put(mDC.ActionBar.giSNqX, 17);
    }

    public C31887mHp(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, ejfBZ, AuCTel));
    }

    public C31887mHp(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[2], (android.widget.ImageView) objArr[3], (ConstraintLayout) objArr[0], (android.widget.FrameLayout) objArr[12], (CardView) objArr[7], (CardView) objArr[6], (ConstraintLayout) objArr[16], (android.widget.ImageView) objArr[17], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[10], (CardView) objArr[4], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[15], (android.widget.LinearLayout) objArr[11], (ConstraintLayout) objArr[8], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[14]);
        this.hDKMBd = -1L;
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}
