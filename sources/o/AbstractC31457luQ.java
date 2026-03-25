package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31457luQ extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final lxD AYXKKw;
    public final android.widget.RelativeLayout AhwBna;
    public final Barrier DbNXlk;
    public final C52794wYp EZpvd;
    public final AbstractC31617lxs KWHzl;
    public final AbstractC31619lxu OLrzqt;
    public final C52794wYp copydefault;
    public final android.view.View djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final android.view.View isConnected;
    public final AbstractC31623lxy valueOf;

    public AbstractC31457luQ(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, C52794wYp c52794wYp, C52794wYp c52794wYp2, AbstractC31617lxs abstractC31617lxs, AbstractC31619lxu abstractC31619lxu, AbstractC31623lxy abstractC31623lxy, lxD lxd, android.widget.RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, android.view.View view2, android.view.View view3, Barrier barrier, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = linearLayout;
        this.copydefault = c52794wYp;
        this.EZpvd = c52794wYp2;
        this.KWHzl = abstractC31617lxs;
        this.OLrzqt = abstractC31619lxu;
        this.valueOf = abstractC31623lxy;
        this.AYXKKw = lxd;
        this.AhwBna = relativeLayout;
        this.gEmmrt = appCompatImageView;
        this.djBIcL = view2;
        this.isConnected = view3;
        this.DbNXlk = barrier;
        this.fetchVPNInfo = textView;
    }

    public static AbstractC31457luQ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31457luQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31457luQ) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.sSMYrx, viewGroup, z, obj);
    }
}
