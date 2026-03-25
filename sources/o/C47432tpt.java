package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.okex.feedback.net.bean.FeedbackBountyBoldTitleItem;

/* JADX INFO: renamed from: o.tpt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47432tpt extends AbstractC47429tpq {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray djBIcL = null;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C47432tpt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, djBIcL));
    }

    public C47432tpt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2]);
        this.valueOf = -1L;
        this.AEQbTJ.setTag(null);
        this.KWHzl.setTag(null);
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47317tnk.fARcdN != i) {
            return false;
        }
        EZpvd((FeedbackBountyBoldTitleItem) obj);
        return true;
    }

    public void EZpvd(@androidx.annotation.Nullable FeedbackBountyBoldTitleItem feedbackBountyBoldTitleItem) {
        this.copydefault = feedbackBountyBoldTitleItem;
        synchronized (this) {
            this.valueOf |= 1;
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
            j = this.valueOf;
            this.valueOf = 0L;
        }
        FeedbackBountyBoldTitleItem feedbackBountyBoldTitleItem = this.copydefault;
        long j2 = j & 3;
        if (j2 == 0 || feedbackBountyBoldTitleItem == null) {
            title = null;
            summary = null;
        } else {
            title = feedbackBountyBoldTitleItem.getTitle();
            summary = feedbackBountyBoldTitleItem.getSummary();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, title);
            TextViewBindingAdapter.setText(this.OLrzqt, summary);
        }
    }
}
