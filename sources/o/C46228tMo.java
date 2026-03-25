package o;

import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.github.mikephil.charting.charts.LineChart;
import com.okinc.uilab.reminder.OKReminder;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C46228tMo extends AbstractC46225tMl {
    public static final android.util.SparseIntArray fJNWhG;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public final ConstraintLayout AuCTel;
    public long ejfBZ;

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
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C47501trL.TaskDescription.valueOf, 1);
        sparseIntArray.put(C47501trL.TaskDescription.DcMfJKDcMfJK, 2);
        sparseIntArray.put(C47501trL.TaskDescription.fiXcQa, 3);
        sparseIntArray.put(C47501trL.TaskDescription.DcMfJK, 4);
        sparseIntArray.put(C47501trL.TaskDescription.fTEjYi, 5);
        sparseIntArray.put(C47501trL.TaskDescription.DzkRMH, 6);
        sparseIntArray.put(C47501trL.TaskDescription.RLmrWm, 7);
        sparseIntArray.put(C47501trL.TaskDescription.tIwhY, 8);
        sparseIntArray.put(C47501trL.TaskDescription.OTwTPd, 9);
        sparseIntArray.put(C47501trL.TaskDescription.dbwnZN, 10);
        sparseIntArray.put(C47501trL.TaskDescription.QfsBiF, 11);
        sparseIntArray.put(C47501trL.TaskDescription.svhCHd, 12);
        sparseIntArray.put(C47501trL.TaskDescription.gqOnQv, 13);
        sparseIntArray.put(C47501trL.TaskDescription.igXuih, 14);
    }

    public C46228tMo(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 15, isConnected, fJNWhG));
    }

    public C46228tMo(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (LinearLayoutCompat) objArr[11], (wYF) objArr[14], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[8], (android.view.View) objArr[4], (NestedScrollView) objArr[2], (AppCompatSeekBar) objArr[6], (LineChart) objArr[3], (FragmentContainerView) objArr[10], (android.widget.TextView) objArr[13], (OKReminder) objArr[12], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[7]);
        this.ejfBZ = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AuCTel = constraintLayout;
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
