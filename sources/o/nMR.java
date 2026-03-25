package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.OKRedPacketMessage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nMR extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;

    @Bindable
    public OKRedPacketMessage OLrzqt;
    public final android.widget.TextView copydefault;

    public nMR(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = linearLayout;
        this.EZpvd = imageView;
        this.KWHzl = textView;
        this.copydefault = textView2;
    }
}
