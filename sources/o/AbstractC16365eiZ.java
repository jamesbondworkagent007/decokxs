package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.robinhood.ticker.TickerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16365eiZ extends ViewDataBinding {
    public final C33537myN AEQbTJ;
    public final ViewPager2 AYXKKw;
    public final ConstraintLayout AhwBna;
    public final C33546myW AkhnZx;
    public final TickerView DbNXlk;
    public final AppBarLayout EZpvd;
    public final NestedScrollView KWHzl;
    public final C14697dqO OLrzqt;
    public final C55244xgL copydefault;
    public final C55173xeu djBIcL;
    public final ConstraintLayout gEmmrt;
    public final C15764eUk isConnected;
    public final C15828eWu valueOf;
    public final C33603mza values;

    public AbstractC16365eiZ(java.lang.Object obj, android.view.View view, int i, C14697dqO c14697dqO, AppBarLayout appBarLayout, C33537myN c33537myN, C55244xgL c55244xgL, NestedScrollView nestedScrollView, ViewPager2 viewPager2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, C55173xeu c55173xeu, C15828eWu c15828eWu, C15764eUk c15764eUk, C33546myW c33546myW, C33603mza c33603mza, TickerView tickerView) {
        super(obj, view, i);
        this.OLrzqt = c14697dqO;
        this.EZpvd = appBarLayout;
        this.AEQbTJ = c33537myN;
        this.copydefault = c55244xgL;
        this.KWHzl = nestedScrollView;
        this.AYXKKw = viewPager2;
        this.gEmmrt = constraintLayout;
        this.AhwBna = constraintLayout2;
        this.djBIcL = c55173xeu;
        this.valueOf = c15828eWu;
        this.isConnected = c15764eUk;
        this.AkhnZx = c33546myW;
        this.values = c33603mza;
        this.DbNXlk = tickerView;
    }

    public static AbstractC16365eiZ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16365eiZ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16365eiZ) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.OuxcSI, null, false, obj);
    }
}
