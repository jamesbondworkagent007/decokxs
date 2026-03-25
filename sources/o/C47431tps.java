package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.okex.feedback.net.bean.FeedbackBountyChapterItem;

/* JADX INFO: renamed from: o.tps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47431tps extends AbstractC47434tpv {
    public static final android.util.SparseIntArray AEQbTJ = null;
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public long AhwBna;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public C47431tps(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, KWHzl, AEQbTJ));
    }

    public C47431tps(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[0], (android.widget.TextView) objArr[1]);
        this.AhwBna = -1L;
        this.EZpvd.setTag(null);
        this.copydefault.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C47317tnk.fARcdN != i) {
            return false;
        }
        copydefault((FeedbackBountyChapterItem) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable FeedbackBountyChapterItem feedbackBountyChapterItem) {
        this.OLrzqt = feedbackBountyChapterItem;
        synchronized (this) {
            this.AhwBna |= 1;
        }
        notifyPropertyChanged(C47317tnk.fARcdN);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.AhwBna;
            this.AhwBna = 0L;
        }
        FeedbackBountyChapterItem feedbackBountyChapterItem = this.OLrzqt;
        long j2 = j & 3;
        java.lang.String title = (j2 == 0 || feedbackBountyChapterItem == null) ? null : feedbackBountyChapterItem.getTitle();
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.copydefault, title);
        }
    }
}
