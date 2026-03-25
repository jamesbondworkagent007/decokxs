package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C32048mNo extends AbstractC32051mNr {
    public static final android.util.SparseIntArray isConnected;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public long AkhnZx;
    public final ConstraintLayout DbNXlk;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C31976mKx.Activity.fjfviF, 1);
        sparseIntArray.put(C31976mKx.Activity.gasjUx, 2);
        sparseIntArray.put(C31976mKx.Activity.DWgRXt, 3);
        sparseIntArray.put(C31976mKx.Activity.KDccX, 4);
        sparseIntArray.put(C31976mKx.Activity.DGOPHZ, 5);
        sparseIntArray.put(C31976mKx.Activity.igXuih, 6);
        sparseIntArray.put(C31976mKx.Activity.QVAiDq, 7);
        sparseIntArray.put(C31976mKx.Activity.QKudOq, 8);
        sparseIntArray.put(C31976mKx.Activity.iZzfmt, 9);
        sparseIntArray.put(C31976mKx.Activity.gkJEwt, 10);
    }

    public C32048mNo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, values, isConnected));
    }

    public C32048mNo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[7], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[8], (C55249xgQ) objArr[6], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.AkhnZx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DbNXlk = constraintLayout;
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
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}
