package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47408tpV extends AbstractC47410tpX {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray values;
    public final ConstraintLayout AkhnZx;
    public long isConnected;

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
        sparseIntArray.put(C47315tni.TaskDescription.OBJEWx, 1);
        sparseIntArray.put(C47315tni.TaskDescription.fjfviF, 2);
        sparseIntArray.put(C47315tni.TaskDescription.igXuih, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DCUTEIdCUTEI, 4);
        sparseIntArray.put(C47315tni.TaskDescription.DbNXlk, 5);
        sparseIntArray.put(C47315tni.TaskDescription.sCB, 6);
        sparseIntArray.put(C47315tni.TaskDescription.jh, 7);
        sparseIntArray.put(C47315tni.TaskDescription.AubY, 8);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKOmnske, 9);
    }

    public C47408tpV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, AhwBna, values));
    }

    public C47408tpV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[5], (android.widget.ImageView) objArr[8], (android.widget.FrameLayout) objArr[1], (android.widget.ProgressBar) objArr[2], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[9]);
        this.isConnected = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}
