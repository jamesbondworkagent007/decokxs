package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.okex.feedback.net.bean.FeedbackBountyNormalItem;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47433tpu extends AbstractC47430tpr {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.DGOPHZDGOPHZ, 3);
        sparseIntArray.put(C47315tni.TaskDescription.fupbxE, 4);
    }

    public C47433tpu(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, gEmmrt, AhwBna));
    }

    public C47433tpu(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2]);
        this.AYXKKw = -1L;
        this.copydefault.setTag(null);
        this.AEQbTJ.setTag(null);
        this.djBIcL.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47317tnk.fARcdN != i) {
            return false;
        }
        KWHzl((FeedbackBountyNormalItem) obj);
        return true;
    }

    public void KWHzl(@androidx.annotation.Nullable FeedbackBountyNormalItem feedbackBountyNormalItem) {
        this.OLrzqt = feedbackBountyNormalItem;
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        notifyPropertyChanged(C47317tnk.fARcdN);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String title;
        java.lang.String summary;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        FeedbackBountyNormalItem feedbackBountyNormalItem = this.OLrzqt;
        long j2 = j & 3;
        if (j2 == 0 || feedbackBountyNormalItem == null) {
            title = null;
            summary = null;
        } else {
            title = feedbackBountyNormalItem.getTitle();
            summary = feedbackBountyNormalItem.getSummary();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, title);
            TextViewBindingAdapter.setText(this.djBIcL, summary);
        }
    }
}
