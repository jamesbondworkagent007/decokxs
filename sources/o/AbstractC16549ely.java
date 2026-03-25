package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ely, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16549ely extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.RelativeLayout AYXKKw;
    public final C52794wYp AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.TextView DbNXlk;
    public final AppCompatImageView EZpvd;
    public final AppCompatImageView KWHzl;
    public final AbstractC16843era OLrzqt;
    public final AppCompatImageView copydefault;
    public final AbstractC16843era djBIcL;
    public final android.widget.TextView ejfBZ;
    public final AbstractC16843era fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final NestedScrollView valueOf;
    public final android.widget.TextView values;

    public AbstractC16549ely(java.lang.Object obj, android.view.View view, int i, AbstractC16843era abstractC16843era, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, android.widget.LinearLayout linearLayout, android.widget.RelativeLayout relativeLayout, NestedScrollView nestedScrollView, C52794wYp c52794wYp, AbstractC16843era abstractC16843era2, AbstractC16843era abstractC16843era3, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6) {
        super(obj, view, i);
        this.OLrzqt = abstractC16843era;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = appCompatImageView2;
        this.EZpvd = appCompatImageView3;
        this.KWHzl = appCompatImageView4;
        this.gEmmrt = linearLayout;
        this.AYXKKw = relativeLayout;
        this.valueOf = nestedScrollView;
        this.AhwBna = c52794wYp;
        this.djBIcL = abstractC16843era2;
        this.fetchVPNInfo = abstractC16843era3;
        this.AkhnZx = textView;
        this.DbNXlk = textView2;
        this.values = textView3;
        this.isConnected = textView4;
        this.ejfBZ = textView5;
        this.AuCTel = textView6;
    }

    public static AbstractC16549ely KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16549ely AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16549ely) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.tIwhY, viewGroup, z, obj);
    }
}
