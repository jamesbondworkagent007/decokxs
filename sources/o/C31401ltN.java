package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.uilab.reminder.OKReminder;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31401ltN extends AbstractC31404ltQ {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray fetchVPNInfo;
    public long ejfBZ;
    public final ConstraintLayout fJNWhG;

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
        fetchVPNInfo = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.fsSxsn, 1);
        sparseIntArray.put(C31351lsQ.Application.dUDNAs, 2);
        sparseIntArray.put(C31351lsQ.Application.swzYdv, 3);
        sparseIntArray.put(C31351lsQ.Application.iPSTqm, 4);
        sparseIntArray.put(C31351lsQ.Application.zKcAg, 5);
        sparseIntArray.put(C31351lsQ.Application.vLaW, 6);
        sparseIntArray.put(C31351lsQ.Application.tIwhY, 7);
        sparseIntArray.put(C31351lsQ.Application.sVXHln, 8);
        sparseIntArray.put(C31351lsQ.Application.zAEkPU, 9);
        sparseIntArray.put(C31351lsQ.Application.sTzBva, 10);
        sparseIntArray.put(C31351lsQ.Application.zOIQXb, 11);
        sparseIntArray.put(C31351lsQ.Application.gSBher, 12);
        sparseIntArray.put(C31351lsQ.Application.gmHjFq, 13);
    }

    public C31401ltN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, AkhnZx, fetchVPNInfo));
    }

    public C31401ltN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Guideline) objArr[2], (C57597ylS) objArr[1], (C52794wYp) objArr[13], (android.widget.LinearLayout) objArr[12], (LinearLayoutCompat) objArr[3], (LottieAnimationView) objArr[4], (android.widget.TextView) objArr[10], (android.widget.ImageView) objArr[8], (LinearLayoutCompat) objArr[7], (android.widget.TextView) objArr[9], (RecyclerView) objArr[6], (android.widget.TextView) objArr[5], (OKReminder) objArr[11]);
        this.ejfBZ = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fJNWhG = constraintLayout;
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
