package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C47315tni;

/* JADX INFO: renamed from: o.tow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47382tow extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView EZpvd;
    public final OKEditText KWHzl;
    public final android.view.View OLrzqt;
    public final C52794wYp copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    public AbstractC47382tow(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C52794wYp c52794wYp, android.widget.TextView textView, android.view.View view2, OKEditText oKEditText, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.copydefault = c52794wYp;
        this.EZpvd = textView;
        this.OLrzqt = view2;
        this.KWHzl = oKEditText;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = textView4;
    }

    public static AbstractC47382tow copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47382tow EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47382tow) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.AwvSrB, viewGroup, z, obj);
    }
}
