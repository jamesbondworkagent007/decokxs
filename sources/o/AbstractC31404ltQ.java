package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.okinc.uilab.reminder.OKReminder;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31404ltQ extends ViewDataBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final android.widget.TextView AhwBna;
    public final OKReminder DbNXlk;
    public final LinearLayoutCompat EZpvd;
    public final Guideline KWHzl;
    public final C57597ylS OLrzqt;
    public final C52794wYp copydefault;
    public final LottieAnimationView djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final RecyclerView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    public AbstractC31404ltQ(java.lang.Object obj, android.view.View view, int i, Guideline guideline, C57597ylS c57597ylS, C52794wYp c52794wYp, android.widget.LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat, LottieAnimationView lottieAnimationView, android.widget.TextView textView, android.widget.ImageView imageView, LinearLayoutCompat linearLayoutCompat2, android.widget.TextView textView2, RecyclerView recyclerView, android.widget.TextView textView3, OKReminder oKReminder) {
        super(obj, view, i);
        this.KWHzl = guideline;
        this.OLrzqt = c57597ylS;
        this.copydefault = c52794wYp;
        this.AEQbTJ = linearLayout;
        this.EZpvd = linearLayoutCompat;
        this.djBIcL = lottieAnimationView;
        this.AhwBna = textView;
        this.gEmmrt = imageView;
        this.AYXKKw = linearLayoutCompat2;
        this.valueOf = textView2;
        this.isConnected = recyclerView;
        this.values = textView3;
        this.DbNXlk = oKReminder;
    }

    public static AbstractC31404ltQ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31404ltQ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31404ltQ) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.EZpvd, null, false, obj);
    }
}
