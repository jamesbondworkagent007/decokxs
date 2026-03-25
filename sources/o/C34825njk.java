package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.immomo.mls.InitData;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.njk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34825njk extends AbstractC34824njj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public C54822xWp djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43061riF
    public java.lang.String copydefault() {
        return "KlineFeedNestHome.lua";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.ixgjPv;
    }

    /* JADX INFO: renamed from: o.njk$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.njk.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.lang.String djBIcL() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("data")) == null) ? "BTC" : string;
    }

    /* JADX DEBUG: Possible override for method o.njj.AYXKKw()V */
    public final java.lang.String AYXKKw() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("instId")) == null) ? "" : string;
    }

    @Override // o.AbstractC43061riF
    public android.view.ViewGroup EZpvd() {
        android.view.View view = getView();
        if (view != null) {
            return (android.view.ViewGroup) view.findViewById(qZH.StateListAnimator.GiPPlLRPuVlr);
        }
        return null;
    }

    @Override // o.AbstractC43061riF
    public InitData OLrzqt() {
        C54822xWp c54822xWp;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ViewModelProvider.Factory defaultViewModelProviderFactory = activity.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
            c54822xWp = (C54822xWp) new ViewModelProvider(activity, defaultViewModelProviderFactory).get(C54822xWp.class);
        } else {
            c54822xWp = null;
        }
        this.djBIcL = c54822xWp;
        if (c54822xWp == null) {
            return C43056riA.AEQbTJ.EZpvd("market", "/feed/klineCombine", C56424yEw.gEmmrt(C56390yDp.OLrzqt("CoinName", djBIcL()), C56390yDp.OLrzqt("entryIdentifier", java.lang.String.valueOf(hashCode()))));
        }
        java.util.Map<java.lang.String, ? extends java.lang.Object> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("CoinName", djBIcL()), C56390yDp.OLrzqt("entryIdentifier", java.lang.String.valueOf(hashCode())), C56390yDp.OLrzqt("selectTabName", c54822xWp.copydefault()), C56390yDp.OLrzqt("instId", AYXKKw()));
        C54822xWp c54822xWp2 = this.djBIcL;
        if (Intrinsics.EZpvd((java.lang.Object) (c54822xWp2 != null ? c54822xWp2.copydefault() : null), (java.lang.Object) "news")) {
            mapDjBIcL.put("important", "selected");
        }
        return C43056riA.AEQbTJ.EZpvd("market", "/feed/klineCombine", mapDjBIcL);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC43061riF, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        SPUtils.put("KLINE_USER_VISITED_FEED", java.lang.Boolean.TRUE);
        C54822xWp c54822xWp = this.djBIcL;
        if (Intrinsics.EZpvd((java.lang.Object) (c54822xWp != null ? c54822xWp.copydefault() : null), (java.lang.Object) "news")) {
            C7323ahf.KWHzl().AEQbTJ("kline_feed_set_select_tab_notification_key", null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("selectTabName", "news"), C56390yDp.OLrzqt("entryIdentifier", java.lang.String.valueOf(hashCode())), C56390yDp.OLrzqt("important", "selected"), C56390yDp.OLrzqt("instId", AYXKKw())));
            C54822xWp c54822xWp2 = this.djBIcL;
            if (c54822xWp2 != null) {
                c54822xWp2.copydefault("insights");
            }
        }
    }
}
