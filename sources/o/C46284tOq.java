package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46284tOq extends AbstractC46282tOo {
    public static final ViewDataBinding.IncludedLayouts fetchVPNInfo = null;
    public static final android.util.SparseIntArray values;
    public final CardView fARcdN;
    public long fIwbmz;

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
        sparseIntArray.put(C47501trL.TaskDescription.aappFQ, 1);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPURsaBn, 2);
        sparseIntArray.put(C47501trL.TaskDescription.dNCPSb, 3);
        sparseIntArray.put(C47501trL.TaskDescription.getSerial, 4);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPRGtXKCRGtXKC, 5);
        sparseIntArray.put(C47501trL.TaskDescription.HJWChPRGtXKC, 6);
        sparseIntArray.put(C47501trL.TaskDescription.iHkeWl, 7);
        sparseIntArray.put(C47501trL.TaskDescription.heceqZ, 8);
        sparseIntArray.put(C47501trL.TaskDescription.fIwbmz, 9);
        sparseIntArray.put(C47501trL.TaskDescription.fJNWhG, 10);
        sparseIntArray.put(C47501trL.TaskDescription.AuCTel, 11);
        sparseIntArray.put(C47501trL.TaskDescription.RVsVBY, 12);
        sparseIntArray.put(C47501trL.TaskDescription.QIZEnU, 13);
    }

    public C46284tOq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, fetchVPNInfo, values));
    }

    public C46284tOq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatTextView) objArr[11], (android.widget.LinearLayout) objArr[9], (AppCompatTextView) objArr[10], (android.widget.ImageView) objArr[3], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[13], (android.widget.LinearLayout) objArr[12], (C46496tWm) objArr[7], (ConstraintLayout) objArr[1], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[4]);
        this.fIwbmz = -1L;
        CardView cardView = (CardView) objArr[0];
        this.fARcdN = cardView;
        cardView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fIwbmz = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fIwbmz != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fIwbmz = 0L;
        }
    }
}
