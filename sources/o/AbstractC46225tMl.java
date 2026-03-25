package o;

import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import com.github.mikephil.charting.charts.LineChart;
import com.okinc.uilab.reminder.OKReminder;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46225tMl extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final AppCompatSeekBar AYXKKw;
    public final android.view.View AhwBna;
    public final android.widget.TextView AkhnZx;
    public final OKReminder DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final C33537myN KWHzl;
    public final android.widget.TextView OLrzqt;
    public final wYF copydefault;
    public final LineChart djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final FragmentContainerView gEmmrt;
    public final NestedScrollView valueOf;
    public final android.widget.ImageView values;

    public AbstractC46225tMl(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, LinearLayoutCompat linearLayoutCompat, wYF wyf, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view2, NestedScrollView nestedScrollView, AppCompatSeekBar appCompatSeekBar, LineChart lineChart, FragmentContainerView fragmentContainerView, android.widget.TextView textView3, OKReminder oKReminder, android.widget.ImageView imageView, android.widget.TextView textView4) {
        super(obj, view, i);
        this.KWHzl = c33537myN;
        this.EZpvd = linearLayoutCompat;
        this.copydefault = wyf;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.AhwBna = view2;
        this.valueOf = nestedScrollView;
        this.AYXKKw = appCompatSeekBar;
        this.djBIcL = lineChart;
        this.gEmmrt = fragmentContainerView;
        this.fetchVPNInfo = textView3;
        this.DbNXlk = oKReminder;
        this.values = imageView;
        this.AkhnZx = textView4;
    }

    public static AbstractC46225tMl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC46225tMl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC46225tMl) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.copydefault, null, false, obj);
    }
}
