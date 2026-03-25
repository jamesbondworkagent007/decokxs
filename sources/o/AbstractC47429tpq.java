package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okex.feedback.net.bean.FeedbackBountyBoldTitleItem;

/* JADX INFO: renamed from: o.tpq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47429tpq extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    @Bindable
    public FeedbackBountyBoldTitleItem copydefault;

    public AbstractC47429tpq(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = constraintLayout;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
    }
}
