package o;

import androidx.activity.ComponentActivity;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.InterfaceC43033rhe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43033rhe extends InterfaceC43217rlC {
    InterfaceC43036rhh AEQbTJ();

    void AEQbTJ(@NotNull android.content.Context context, UnifiedPriceRemind unifiedPriceRemind, TokenInfoForAlert tokenInfoForAlert);

    void AEQbTJ(@NotNull android.content.Context context, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str);

    void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3);

    void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Function1<? super MarketCoinInfo, Unit> function1);

    boolean AhwBna();

    androidx.fragment.app.Fragment EZpvd();

    androidx.fragment.app.Fragment EZpvd(@NotNull android.content.Context context, java.lang.Integer num, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2);

    boolean EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho);

    androidx.fragment.app.Fragment KWHzl(@NotNull java.lang.String str, Function0<Unit> function0);

    InterfaceC43032rhd KWHzl();

    void KWHzl(@NotNull android.content.Context context);

    void KWHzl(@NotNull android.content.Context context, java.lang.String str);

    void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0);

    void KWHzl(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, DexInstrument dexInstrument, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function2<? super DexInstrument, ? super java.lang.String, Unit> function2, Function1<? super java.lang.Boolean, Unit> function1);

    boolean KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<java.lang.String> list, kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull Function1<? super java.util.List<? extends BizInstrument>, Unit> function1);

    androidx.fragment.app.Fragment OLrzqt();

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3);

    void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2);

    androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    InterfaceC43030rhb copydefault();

    InterfaceC43034rhf copydefault(@NotNull android.content.Context context);

    void copydefault(@NotNull android.content.Context context, java.lang.String str);

    void copydefault(@NotNull ComponentActivity componentActivity, java.util.Map<java.lang.String, ? extends java.lang.Object> map);

    void copydefault(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, BizInstrument bizInstrument, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function2<? super DexInstrument, ? super java.lang.String, Unit> function2, Function1<? super java.lang.Boolean, Unit> function1);

    void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Function1<? super java.util.List<java.lang.String>, Unit> function1);

    boolean copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<? extends BizInstrument> list, @NotNull Function1<? super java.util.List<? extends BizInstrument>, Unit> function1);

    boolean copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super BizInstrument, Unit> function1);

    java.lang.String djBIcL();

    boolean valueOf();

    /* JADX INFO: renamed from: o.rhe$StateListAnimator */
    public static final class StateListAnimator {
        public static Unit KWHzl() {
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rhe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showStockTradeGuidePopup$default(InterfaceC43033rhe interfaceC43033rhe, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showStockTradeGuidePopup");
            }
            if ((i & 2) != 0) {
                function0 = new Function0() { // from class: o.rhi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return InterfaceC43033rhe.StateListAnimator.KWHzl();
                    }
                };
            }
            interfaceC43033rhe.KWHzl(fragmentManager, (Function0<Unit>) function0);
        }

        public static /* synthetic */ void gotoMainSearchPage$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoMainSearchPage");
            }
            if ((i & 2) != 0) {
                str = "find_page";
            }
            interfaceC43033rhe.AEQbTJ(context, str);
        }

        public static /* synthetic */ void gotoMainSearchPage$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoMainSearchPage");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            interfaceC43033rhe.EZpvd(context, str, str2);
        }

        public static /* synthetic */ void gotoMainSearchPageFromPlanetFeed$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoMainSearchPageFromPlanetFeed");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC43033rhe.copydefault(context, str);
        }

        public static /* synthetic */ void gotoMainSearchPageFromPlanetChat$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoMainSearchPageFromPlanetChat");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            interfaceC43033rhe.KWHzl(context, str);
        }

        public static /* synthetic */ void gotoRankingActivity$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoRankingActivity");
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            interfaceC43033rhe.AEQbTJ(context, num, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
        }

        public static /* synthetic */ void gotoAllPriceRemindActivity$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, UnifiedPriceRemind unifiedPriceRemind, TokenInfoForAlert tokenInfoForAlert, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoAllPriceRemindActivity");
            }
            if ((i & 2) != 0) {
                unifiedPriceRemind = null;
            }
            if ((i & 4) != 0) {
                tokenInfoForAlert = null;
            }
            interfaceC43033rhe.AEQbTJ(context, unifiedPriceRemind, tokenInfoForAlert);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rhe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment getMarketFuturesAnalysisFragment$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.Integer num, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketFuturesAnalysisFragment");
            }
            if ((i & 2) != 0) {
                num = 0;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return interfaceC43033rhe.EZpvd(context, num, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rhe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment getMarketSpotAnalysisFragment$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketSpotAnalysisFragment");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return interfaceC43033rhe.copydefault(context, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rhe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showMarketFuturesAnalysisSharingDialog$default(InterfaceC43033rhe interfaceC43033rhe, ComponentActivity componentActivity, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMarketFuturesAnalysisSharingDialog");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            interfaceC43033rhe.copydefault(componentActivity, (java.util.Map<java.lang.String, ? extends java.lang.Object>) map);
        }

        public static /* synthetic */ void gotoCommunityFeedDetailPage$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoCommunityFeedDetailPage");
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            interfaceC43033rhe.OLrzqt(context, str, str2, str3);
        }

        public static /* synthetic */ void gotoCommunityKolProfilePage$default(InterfaceC43033rhe interfaceC43033rhe, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoCommunityKolProfilePage");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            interfaceC43033rhe.AEQbTJ(context, str, str2, str3);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rhe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.fragment.app.Fragment getMarketDiscover20SearchFragment$default(InterfaceC43033rhe interfaceC43033rhe, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketDiscover20SearchFragment");
            }
            if ((i & 2) != 0) {
                function0 = null;
            }
            return interfaceC43033rhe.KWHzl(str, (Function0<Unit>) function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: o.rhe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showNavSearchDialogByBizInstrument$default(InterfaceC43033rhe interfaceC43033rhe, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, BizInstrument bizInstrument, java.lang.String str2, java.lang.String str3, java.util.Map map, yHO yho, Function2 function2, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNavSearchDialogByBizInstrument");
            }
            interfaceC43033rhe.copydefault(str, fragmentManager, bizInstrument, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : map, yho, function2, (i & 256) != 0 ? null : function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: o.rhe */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showNavSearchDialogByDexInstrument$default(InterfaceC43033rhe interfaceC43033rhe, java.lang.String str, androidx.fragment.app.FragmentManager fragmentManager, DexInstrument dexInstrument, java.lang.String str2, java.util.Map map, yHO yho, Function2 function2, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNavSearchDialogByDexInstrument");
            }
            interfaceC43033rhe.KWHzl(str, fragmentManager, dexInstrument, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : map, yho, function2, (i & 128) != 0 ? null : function1);
        }
    }
}
