package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46255tNo extends AbstractC46258tNr {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final android.widget.LinearLayout fARcdN;

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
        sparseIntArray.put(C47501trL.TaskDescription.AkhnZx, 1);
        sparseIntArray.put(C47501trL.TaskDescription.DPHsZd, 2);
        sparseIntArray.put(C47501trL.TaskDescription.QOLQEE, 3);
        sparseIntArray.put(C47501trL.TaskDescription.glVQsU, 4);
        sparseIntArray.put(C47501trL.TaskDescription.QbewEr, 5);
        sparseIntArray.put(C47501trL.TaskDescription.dvKsVJ, 6);
        sparseIntArray.put(C47501trL.TaskDescription.gasjUx, 7);
        sparseIntArray.put(C47501trL.TaskDescription.fvQaOB, 8);
        sparseIntArray.put(C47501trL.TaskDescription.dxcTrN, 9);
        sparseIntArray.put(C47501trL.TaskDescription.giSNqX, 10);
        sparseIntArray.put(C47501trL.TaskDescription.onStatusChanged, 11);
        sparseIntArray.put(C47501trL.TaskDescription.ORxRYg, 12);
    }

    public C46255tNo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, isConnected, values));
    }

    public C46255tNo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (android.widget.LinearLayout) objArr[3], (android.widget.FrameLayout) objArr[12], (android.widget.LinearLayout) objArr[5], (android.widget.ImageButton) objArr[6], (android.widget.ImageButton) objArr[9], (android.widget.ImageButton) objArr[10], (android.widget.ImageButton) objArr[8], (android.widget.ImageButton) objArr[7], (FragmentContainerView) objArr[2], (FragmentContainerView) objArr[4], (android.widget.TextView) objArr[11]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fARcdN = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}
