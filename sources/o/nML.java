package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.OKPayMessage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nML extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.LinearLayout KWHzl;

    @Bindable
    public OKPayMessage OLrzqt;
    public final android.widget.ImageView copydefault;

    public nML(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.TextView textView2, android.widget.LinearLayout linearLayout, android.widget.TextView textView3) {
        super(obj, view, i);
        this.EZpvd = textView;
        this.copydefault = imageView;
        this.AEQbTJ = textView2;
        this.KWHzl = linearLayout;
        this.AYXKKw = textView3;
    }
}
