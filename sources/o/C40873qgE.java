package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40873qgE extends AbstractC40510qYn<MarketDiscoverOverviewTradeCalendarVo, C42728rbr> {
    public final Function1<MarketDiscoverOverviewTradeCalendarVo, Unit> EZpvd;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C40873qgE(@NotNull Function1<? super MarketDiscoverOverviewTradeCalendarVo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42728rbr AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42728rbr c42728rbrEZpvd = C42728rbr.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42728rbrEZpvd, "");
        return c42728rbrEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull C42728rbr c42728rbr, int i, @NotNull MarketDiscoverOverviewTradeCalendarVo marketDiscoverOverviewTradeCalendarVo) {
        Intrinsics.checkNotNullParameter(c42728rbr, "");
        Intrinsics.checkNotNullParameter(marketDiscoverOverviewTradeCalendarVo, "");
        ConstraintLayout root = c42728rbr.getRoot();
        root.setOnClickListener(new StateListAnimator(root, 1000L, this, marketDiscoverOverviewTradeCalendarVo));
        java.lang.String strOLrzqt = marketDiscoverOverviewTradeCalendarVo.OLrzqt();
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) TradingCalendarType.ECONOMIC.getRequestValue())) {
            c42728rbr.EZpvd.setImageResource(C52761wXj.TaskDescription.ihnvzI);
            android.widget.TextView textView = c42728rbr.AYXKKw;
            MarketDiscoverOverviewTradeCalendarVo.EconomicVo economicVoAEQbTJ = marketDiscoverOverviewTradeCalendarVo.AEQbTJ();
            textView.setText(economicVoAEQbTJ != null ? economicVoAEQbTJ.djBIcL() : null);
            android.widget.TextView textView2 = c42728rbr.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            android.widget.TextView textView3 = c42728rbr.gEmmrt;
            MarketDiscoverOverviewTradeCalendarVo.EconomicVo economicVoAEQbTJ2 = marketDiscoverOverviewTradeCalendarVo.AEQbTJ();
            textView3.setText(OLrzqt(economicVoAEQbTJ2 != null ? economicVoAEQbTJ2.AhwBna() : null));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) TradingCalendarType.TOKEN_UNLOCK.getRequestValue())) {
            AppCompatImageView appCompatImageView = c42728rbr.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo unlockTokenVoCopydefault = marketDiscoverOverviewTradeCalendarVo.copydefault();
            C33054mpH.AEQbTJ(appCompatImageView, unlockTokenVoCopydefault != null ? unlockTokenVoCopydefault.KWHzl() : null, qZH.Activity.AhwBna);
            android.widget.TextView textView4 = c42728rbr.AYXKKw;
            MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo unlockTokenVoCopydefault2 = marketDiscoverOverviewTradeCalendarVo.copydefault();
            textView4.setText(unlockTokenVoCopydefault2 != null ? unlockTokenVoCopydefault2.gEmmrt() : null);
            android.widget.TextView textView5 = c42728rbr.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(textView5, "");
            textView5.setVisibility(0);
            android.widget.TextView textView6 = c42728rbr.AEQbTJ;
            MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo unlockTokenVoCopydefault3 = marketDiscoverOverviewTradeCalendarVo.copydefault();
            textView6.setText(unlockTokenVoCopydefault3 != null ? unlockTokenVoCopydefault3.copydefault() : null);
            android.widget.TextView textView7 = c42728rbr.gEmmrt;
            MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo unlockTokenVoCopydefault4 = marketDiscoverOverviewTradeCalendarVo.copydefault();
            textView7.setText(OLrzqt(unlockTokenVoCopydefault4 != null ? unlockTokenVoCopydefault4.djBIcL() : null));
        }
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd, HH:mm", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }

    /* JADX INFO: renamed from: o.qgE$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C40873qgE EZpvd;
        public final /* synthetic */ MarketDiscoverOverviewTradeCalendarVo OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C40873qgE c40873qgE, MarketDiscoverOverviewTradeCalendarVo marketDiscoverOverviewTradeCalendarVo) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c40873qgE;
            this.OLrzqt = marketDiscoverOverviewTradeCalendarVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.EZpvd.invoke(this.OLrzqt);
            }
        }
    }
}
