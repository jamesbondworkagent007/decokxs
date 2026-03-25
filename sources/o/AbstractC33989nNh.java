package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.OKMessageContent;

/* JADX INFO: renamed from: o.nNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33989nNh extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.FrameLayout OLrzqt;

    @Bindable
    public OKMessageContent copydefault;

    public AbstractC33989nNh(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = frameLayout;
        this.AEQbTJ = textView;
    }
}
