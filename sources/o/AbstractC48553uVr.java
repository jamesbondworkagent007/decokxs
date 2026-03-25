package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import com.robinhood.ticker.TickerView;

/* JADX INFO: renamed from: o.uVr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48553uVr extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;

    @Bindable
    public boolean AYXKKw;
    public final AppCompatTextView AhwBna;
    public final C55320xhi AkhnZx;
    public final AppCompatImageView DbNXlk;
    public final C52705wVh EZpvd;
    public final C49774uur KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final ViewStubProxy djBIcL;
    public final C8226ayj ejfBZ;
    public final ViewStubProxy fIwbmz;
    public final AppCompatTextView fJNWhG;
    public final ConstraintLayout fetchVPNInfo;

    @Bindable
    public boolean gEmmrt;
    public final TickerView isConnected;
    public final AppCompatTextView valueOf;
    public final AppCompatImageView values;

    public abstract void OLrzqt(boolean z);

    public abstract void copydefault(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.AYXKKw;
    }

    public AbstractC48553uVr(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, C49774uur c49774uur, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, C52705wVh c52705wVh, ViewStubProxy viewStubProxy, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, C55320xhi c55320xhi, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2, TickerView tickerView, AppCompatImageView appCompatImageView3, AppCompatTextView appCompatTextView5, C8226ayj c8226ayj, ViewStubProxy viewStubProxy2) {
        super(obj, view, i);
        this.OLrzqt = appCompatTextView;
        this.KWHzl = c49774uur;
        this.copydefault = appCompatTextView2;
        this.AEQbTJ = appCompatImageView;
        this.EZpvd = c52705wVh;
        this.djBIcL = viewStubProxy;
        this.valueOf = appCompatTextView3;
        this.AhwBna = appCompatTextView4;
        this.AkhnZx = c55320xhi;
        this.fetchVPNInfo = constraintLayout;
        this.DbNXlk = appCompatImageView2;
        this.isConnected = tickerView;
        this.values = appCompatImageView3;
        this.fJNWhG = appCompatTextView5;
        this.ejfBZ = c8226ayj;
        this.fIwbmz = viewStubProxy2;
    }
}
