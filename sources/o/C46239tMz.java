package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46239tMz extends AbstractC46235tMv {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray valueOf;
    public final ConstraintLayout fetchVPNInfo;
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
        valueOf = sparseIntArray;
        sparseIntArray.put(C47501trL.TaskDescription.valueOf, 1);
        sparseIntArray.put(C47501trL.TaskDescription.fHqPtx, 2);
        sparseIntArray.put(C47501trL.TaskDescription.zdxASf, 3);
        sparseIntArray.put(C47501trL.TaskDescription.getNewProxyInstance, 4);
        sparseIntArray.put(C47501trL.TaskDescription.RkASWs, 5);
        sparseIntArray.put(C47501trL.TaskDescription.fARcdN, 6);
        sparseIntArray.put(C47501trL.TaskDescription.OGitdB, 7);
        sparseIntArray.put(C47501trL.TaskDescription.zDUObI, 8);
    }

    public C46239tMz(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, valueOf));
    }

    public C46239tMz(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C55239xgG) objArr[6], (android.widget.TextView) objArr[4], (android.widget.ScrollView) objArr[2], (C55173xeu) objArr[8], (wYC) objArr[5], (android.widget.TextView) objArr[3], (android.widget.LinearLayout) objArr[7]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
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
        synchronized (this) {
            this.values = 0L;
        }
    }
}
