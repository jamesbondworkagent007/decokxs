package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40973qhz extends wXX {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qhC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40973qhz.EZpvd(this.OLrzqt);
        }
    });
    public C42694rbJ copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.qhz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qhz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C40973qhz OLrzqt(@NotNull MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo unlockTokenVo) {
            Intrinsics.checkNotNullParameter(unlockTokenVo, "");
            C40973qhz c40973qhz = new C40973qhz();
            C6779aVn.copydefault(c40973qhz).putParcelable(MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo.class.getName(), unlockTokenVo);
            return c40973qhz;
        }
    }

    public final MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo OLrzqt() {
        return (MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo) this.OLrzqt.getValue();
    }

    public static final MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo EZpvd(C40973qhz c40973qhz) {
        MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo unlockTokenVo = (MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo) c40973qhz.requireArguments().getParcelable(MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo.class.getName());
        return unlockTokenVo == null ? new MarketDiscoverOverviewTradeCalendarVo.UnlockTokenVo(null, null, null, null, null, null, 0.0f, null, null, 0.0f, null, null, 4095, null) : unlockTokenVo;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(qZH.PendingIntent.dPnHjp));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C42694rbJ.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        copydefault();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        C42694rbJ c42694rbJ = this.copydefault;
        if (c42694rbJ != null) {
            android.widget.ImageView imageView = c42694rbJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C33054mpH.AEQbTJ(imageView, OLrzqt().KWHzl(), C55298xhM.dp2px$default(16.0f, null, 1, null), C55298xhM.dp2px$default(16.0f, null, 1, null));
            c42694rbJ.isConnected.setText(OLrzqt().gEmmrt());
            c42694rbJ.fJNWhG.setText(OLrzqt().fetchVPNInfo());
            c42694rbJ.ejfBZ.setText(OLrzqt().AkhnZx());
            c42694rbJ.gEmmrt.setText(OLrzqt().valueOf());
            c42694rbJ.AYXKKw.setText(OLrzqt().AYXKKw());
            c42694rbJ.AEQbTJ.setText(OLrzqt().OLrzqt());
            c42694rbJ.OLrzqt.setText(OLrzqt().AEQbTJ());
            android.view.View view = c42694rbJ.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(view, "");
            copydefault(view, OLrzqt().AhwBna());
            android.view.View view2 = c42694rbJ.valueOf;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            copydefault(view2, OLrzqt().EZpvd());
            c42694rbJ.AkhnZx.setText(KWHzl(OLrzqt().djBIcL()));
        }
    }

    public final void copydefault(android.view.View view, float f) {
        if (f <= 0.0f) {
            view.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.matchConstraintPercentWidth = f;
        layoutParams2.horizontalBias = 0.0f;
        view.setLayoutParams(layoutParams2);
    }

    private final java.lang.String KWHzl(java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd, HH:mm", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }
}
