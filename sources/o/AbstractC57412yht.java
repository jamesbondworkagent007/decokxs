package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57412yht extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final C52794wYp EZpvd;
    public final C52794wYp KWHzl;
    public final android.view.View OLrzqt;
    public final C57468yiw copydefault;
    public final android.widget.TextView djBIcL;
    public final AppCompatImageView gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC57412yht(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, C52794wYp c52794wYp2, android.view.View view2, C57468yiw c57468yiw, android.widget.LinearLayout linearLayout, AppCompatImageView appCompatImageView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.OLrzqt = view2;
        this.copydefault = c57468yiw;
        this.AEQbTJ = linearLayout;
        this.gEmmrt = appCompatImageView;
        this.AhwBna = textView;
        this.valueOf = textView2;
        this.AYXKKw = textView3;
        this.djBIcL = textView4;
    }

    public static AbstractC57412yht copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC57412yht KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC57412yht) ViewDataBinding.inflateInternal(layoutInflater, C57406yhn.TaskDescription.copydefault, viewGroup, z, obj);
    }
}
