package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.OKMessageContent;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nLW extends ViewDataBinding {
    public final android.widget.TextView KWHzl;

    @Bindable
    public OKMessageContent OLrzqt;

    public nLW(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = textView;
    }
}
