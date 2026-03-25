package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47353toT extends AbstractC47355toV {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DTeKQX, 1);
        sparseIntArray.put(C47315tni.TaskDescription.invokespecialatDTRm, 2);
        sparseIntArray.put(C47315tni.TaskDescription.XW, 3);
        sparseIntArray.put(C47315tni.TaskDescription.dbwnZN, 4);
        sparseIntArray.put(C47315tni.TaskDescription.gHZMYf, 5);
        sparseIntArray.put(C47315tni.TaskDescription.dLBcXg, 6);
        sparseIntArray.put(C47315tni.TaskDescription.AxsJAYsNCnLh, 7);
        sparseIntArray.put(C47315tni.TaskDescription.gtdfxv, 8);
        sparseIntArray.put(C47315tni.TaskDescription.awiJhF, 9);
    }

    public C47353toT(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, DbNXlk, AkhnZx));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C47353toT(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[5];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        C54979xbL c54979xbL = (C54979xbL) objArr[7];
        android.widget.TextView textView = (android.widget.TextView) objArr[6];
        RecyclerView recyclerView = (RecyclerView) objArr[9];
        RecyclerView recyclerView2 = (RecyclerView) objArr[8];
        java.lang.Object obj = objArr[1];
        super(dataBindingComponent, view, 0, frameLayout, constraintLayout, c54979xbL, textView, recyclerView, recyclerView2, obj != null ? C47445tqF.KWHzl((android.view.View) obj) : null, (C55251xgS) objArr[2], (android.widget.TextView) objArr[3], (android.view.View) objArr[4]);
        this.isConnected = -1L;
        this.copydefault.setTag(null);
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
