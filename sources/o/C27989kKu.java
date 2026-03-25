package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.kKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27989kKu {
    public static final Activity Companion = new Activity(null);
    public static final java.util.Map<java.lang.String, java.lang.String> AkhnZx = C56424yEw.gEmmrt(C56390yDp.OLrzqt("Watchlist", "watchlist"), C56390yDp.OLrzqt("COIN", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK), C56390yDp.OLrzqt("SPOT", "spot"), C56390yDp.OLrzqt("FUTURES", "future"), C56390yDp.OLrzqt("SWAP", "perpetual"), C56390yDp.OLrzqt("OPTION", "option"), C56390yDp.OLrzqt("INDEX", "index"), C56390yDp.OLrzqt("market_tab_data", "data"));
    public static final java.util.Map<java.lang.String, java.lang.String> ejfBZ = C56424yEw.gEmmrt(C56390yDp.OLrzqt("ANY", "all"), C56390yDp.OLrzqt("COIN", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK), C56390yDp.OLrzqt("SPOT", "spot"), C56390yDp.OLrzqt("FUTURES", "futures"), C56390yDp.OLrzqt("SWAP", "futures"), C56390yDp.OLrzqt("OPTION", "option"), C56390yDp.OLrzqt("pre_market", "premarket"), C56390yDp.OLrzqt("CEDEFI", "cedefi"));
    public static final java.util.Map<java.lang.String, java.lang.String> isConnected = C56424yEw.gEmmrt(C56390yDp.OLrzqt("ANY", "all"), C56390yDp.OLrzqt("COIN", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK), C56390yDp.OLrzqt("SPOT", "spot"), C56390yDp.OLrzqt("FUTURES", "perpetual"), C56390yDp.OLrzqt("SWAP", "perpetual"), C56390yDp.OLrzqt("OPTION", "option"), C56390yDp.OLrzqt("pre_market", "premarket"));
    public static final java.util.Map<java.lang.String, java.lang.String> DbNXlk = C56424yEw.gEmmrt(C56390yDp.OLrzqt("ANY", "all"), C56390yDp.OLrzqt("COIN", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK), C56390yDp.OLrzqt("SPOT", "spot"), C56390yDp.OLrzqt("FUTURES", "futures"), C56390yDp.OLrzqt("SWAP", "futures"), C56390yDp.OLrzqt("OPTION", "options"), C56390yDp.OLrzqt("pre_market", "premarket"), C56390yDp.OLrzqt("all", "all"), C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK), C56390yDp.OLrzqt("spot", "spot"), C56390yDp.OLrzqt("futures", "futures"), C56390yDp.OLrzqt("options", "options"), C56390yDp.OLrzqt("premarket", "premarket"));
    public static final java.lang.String values = OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK;
    public static final java.lang.String valueOf = "sub_tab";
    public static final java.lang.String AYXKKw = "sort";
    public static final java.lang.String KWHzl = "favourite";
    public static final java.lang.String fetchVPNInfo = "unfavourite";
    public static final java.lang.String gEmmrt = "usd_options_chain";
    public static final java.lang.String djBIcL = "options_chain";
    public static final java.lang.String AhwBna = "Nav_Search";
    public static final java.lang.String EZpvd = "Nav_Rank";
    public static final java.lang.String OLrzqt = "Nav_Fav";
    public static final java.lang.String AEQbTJ = "Nav_Pre_Search_Popular";
    public static final java.lang.String copydefault = "Nav_Pre_Search_History";

    /* JADX INFO: renamed from: o.kKu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kKu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final java.util.Map<java.lang.String, java.lang.String> fetchVPNInfo() {
            return C27989kKu.ejfBZ;
        }

        public final java.util.Map<java.lang.String, java.lang.String> AkhnZx() {
            return C27989kKu.isConnected;
        }

        public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
            return C27989kKu.DbNXlk;
        }

        public final java.lang.String AEQbTJ() {
            return C27989kKu.values;
        }

        public final java.lang.String AhwBna() {
            return C27989kKu.valueOf;
        }

        public final java.lang.String copydefault() {
            return C27989kKu.KWHzl;
        }

        public final java.lang.String isConnected() {
            return C27989kKu.fetchVPNInfo;
        }

        public final java.lang.String valueOf() {
            return C27989kKu.gEmmrt;
        }

        public final java.lang.String gEmmrt() {
            return C27989kKu.djBIcL;
        }

        public final java.lang.String AYXKKw() {
            return C27989kKu.AhwBna;
        }

        public final java.lang.String djBIcL() {
            return C27989kKu.EZpvd;
        }

        public final java.lang.String KWHzl() {
            return C27989kKu.AEQbTJ;
        }

        public final java.lang.String EZpvd() {
            return C27989kKu.copydefault;
        }
    }

    public static /* synthetic */ void trackEventByInstType$default(C27989kKu c27989kKu, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        c27989kKu.OLrzqt(str, str2);
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2) {
        C32866mlf.KWHzl("market_tab_view", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.kKv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27989kKu.KWHzl(str, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str3 = AkhnZx.get(str);
        eventParamsList.put("type", str3 != null ? str3 : "", true);
        if (str2 != null) {
            eventParamsList.put(valueOf, str2, true);
        }
        return Unit.INSTANCE;
    }
}
