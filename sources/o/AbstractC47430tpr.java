package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okex.feedback.net.bean.FeedbackBountyNormalItem;

/* JADX INFO: renamed from: o.tpr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47430tpr extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;

    @Bindable
    public FeedbackBountyNormalItem OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC47430tpr(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.copydefault = constraintLayout;
        this.KWHzl = imageView;
        this.EZpvd = textView;
        this.AEQbTJ = textView2;
        this.djBIcL = textView3;
    }
}
