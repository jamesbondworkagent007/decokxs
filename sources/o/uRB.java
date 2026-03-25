package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.unify_trade.biz.subscribe.SpreadArbitrageData;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uRB extends ViewDataBinding {

    @Bindable
    public SpreadArbitrageData AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final android.widget.TextView gEmmrt;
    public final AppCompatTextView valueOf;

    public uRB(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView, AppCompatTextView appCompatTextView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.KWHzl = textView;
        this.copydefault = appCompatTextView;
        this.EZpvd = textView2;
        this.AYXKKw = textView3;
        this.gEmmrt = textView4;
        this.valueOf = appCompatTextView2;
    }
}
