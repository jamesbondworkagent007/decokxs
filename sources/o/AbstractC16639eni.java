package o;

import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16639eni extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final C57524yjz AYXKKw;
    public final NestedScrollView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.view.View DbNXlk;
    public final C55030xcJ EZpvd;
    public final C52794wYp KWHzl;
    public final Group OLrzqt;
    public final android.widget.ImageView copydefault;
    public final C57431yiL djBIcL;
    public final android.view.View ejfBZ;
    public final android.widget.TextView fetchVPNInfo;
    public final C57461yip gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    public AbstractC16639eni(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, Group group, android.widget.ImageView imageView, C55030xcJ c55030xcJ, android.view.View view2, NestedScrollView nestedScrollView, C57431yiL c57431yiL, C57524yjz c57524yjz, android.widget.TextView textView, C57461yip c57461yip, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.view.View view3, android.view.View view4) {
        super(obj, view, i);
        this.KWHzl = c52794wYp;
        this.OLrzqt = group;
        this.copydefault = imageView;
        this.EZpvd = c55030xcJ;
        this.AEQbTJ = view2;
        this.AhwBna = nestedScrollView;
        this.djBIcL = c57431yiL;
        this.AYXKKw = c57524yjz;
        this.valueOf = textView;
        this.gEmmrt = c57461yip;
        this.values = textView2;
        this.AkhnZx = textView3;
        this.fetchVPNInfo = textView4;
        this.isConnected = textView5;
        this.DbNXlk = view3;
        this.ejfBZ = view4;
    }

    public static AbstractC16639eni AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        return EZpvd(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16639eni EZpvd(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16639eni) ViewDataBinding.bind(obj, view, C13754dXa.TaskDescription.DTeKQX);
    }
}
