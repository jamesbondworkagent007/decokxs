package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.planet.biz_content.draft.DraftDataInfo;

/* JADX INFO: renamed from: o.tPr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46312tPr extends ViewDataBinding {
    public final android.widget.TextView EZpvd;

    @Bindable
    public DraftDataInfo KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC46312tPr(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.copydefault = textView;
        this.EZpvd = textView2;
    }
}
