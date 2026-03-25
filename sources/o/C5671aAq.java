package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aAq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5671aAq extends AbstractC5669aAo {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long ejfBZ;
    public final ConstraintLayout fIwbmz;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C8206ayP.StateListAnimator.iqMDAV, 1);
        sparseIntArray.put(C8206ayP.StateListAnimator.ODWQjV, 2);
        sparseIntArray.put(C8206ayP.StateListAnimator.call, 3);
        sparseIntArray.put(C8206ayP.StateListAnimator.ixgjPv, 4);
        sparseIntArray.put(C8206ayP.StateListAnimator.DCUTEIddSDPG, 5);
        sparseIntArray.put(C8206ayP.StateListAnimator.spnCvw, 6);
        sparseIntArray.put(C8206ayP.StateListAnimator.run, 7);
        sparseIntArray.put(C8206ayP.StateListAnimator.zblBkD, 8);
        sparseIntArray.put(C8206ayP.StateListAnimator.zDUObI, 9);
        sparseIntArray.put(C8206ayP.StateListAnimator.ULRxlR, 10);
        sparseIntArray.put(C8206ayP.StateListAnimator.OxVOHk, 11);
        sparseIntArray.put(C8206ayP.StateListAnimator.RvdRAu, 12);
        sparseIntArray.put(C8206ayP.StateListAnimator.fetchVPNInfo, 13);
        sparseIntArray.put(C8206ayP.StateListAnimator.values, 14);
        sparseIntArray.put(C8206ayP.StateListAnimator.gmHjFq, 15);
    }

    public C5671aAq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, fARcdN));
    }

    public C5671aAq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (RecyclerView) objArr[13], (C52794wYp) objArr[14], (C55173xeu) objArr[2], (OKReminder) objArr[11], (android.widget.Space) objArr[8], (android.widget.Space) objArr[4], (android.widget.TextView) objArr[6], (C55239xgG) objArr[7], (android.widget.LinearLayout) objArr[3], (android.widget.LinearLayout) objArr[5], (OKReminder) objArr[10], (C52794wYp) objArr[15], (android.widget.FrameLayout) objArr[9], (OKReminder) objArr[12], (android.widget.Space) objArr[1]);
        this.ejfBZ = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}
