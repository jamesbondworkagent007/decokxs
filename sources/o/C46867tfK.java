package o;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.market.common.constants.ExperienceRouteConst;
import com.okinc.market.common.service.BizMarketService;
import com.okinc.market.search.features.kline.landscape.LandscapeNavSearchFragment;
import com.okinc.market.search.features.main.root.ui.SearchActivity;
import com.okinc.market.search.features.navigation.root.ui.NavSearchRootFragment;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.serviceui.MarketUiServiceImpl$hasPriceRemind$1;
import com.okinc.okmarket.ui.serviceui.MarketUiServiceImpl$isPreMarketShow$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DexInstrument;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.reactive.AwaitKt;
import o.pYF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46867tfK extends AbstractC43215rlA implements InterfaceC43033rhe, InterfaceC43036rhh {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public boolean AEQbTJ;
    public java.lang.Boolean copydefault;

    @Override // o.InterfaceC43033rhe
    public InterfaceC43036rhh AEQbTJ() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43033rhe
    public boolean valueOf() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.tfK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tfK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.InterfaceC43033rhe
    public androidx.fragment.app.Fragment OLrzqt() {
        return new C27904kHq();
    }

    @Override // o.InterfaceC43033rhe
    public androidx.fragment.app.Fragment EZpvd() {
        if (C41307qoO.EZpvd.OLrzqt()) {
            return gEmmrt();
        }
        return new C46699tcB();
    }

    @Override // o.InterfaceC43033rhe
    public InterfaceC43030rhb copydefault() {
        return C46687tbq.KWHzl;
    }

    @Override // o.InterfaceC43033rhe
    public InterfaceC43034rhf copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return new C35153npu(context);
    }

    @Override // o.InterfaceC43033rhe
    public void KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (fragmentManager.isStateSaved()) {
            pUU.valueOf("MarketUiServiceImpl", "Cannot show StockTradeGuidePopup after onSaveInstanceState, skipping");
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        try {
            C35057noD.Companion.KWHzl(fragmentManager, function0);
        } catch (java.lang.IllegalStateException e) {
            pUU.AEQbTJ("MarketUiServiceImpl", "Failed to show StockTradeGuidePopup", e);
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Override // o.InterfaceC43033rhe
    public boolean AhwBna() {
        return ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).ejfBZ();
    }

    @Override // o.InterfaceC43033rhe
    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        if (interfaceC46557tYt != null) {
            return interfaceC46557tYt.OLrzqt(str, str2, str3);
        }
        return null;
    }

    @Override // o.InterfaceC43033rhe
    public java.lang.String djBIcL() {
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        if (interfaceC46557tYt != null) {
            return interfaceC46557tYt.AEQbTJ();
        }
        return null;
    }

    @Override // o.InterfaceC43033rhe
    public void KWHzl(@NotNull android.content.Context context) throws java.lang.Throwable {
        Intrinsics.checkNotNullParameter(context, "");
        C35197nql.EZpvd(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MarketUiServiceImpl$hasPriceRemind$1 marketUiServiceImpl$hasPriceRemind$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof MarketUiServiceImpl$hasPriceRemind$1) {
            marketUiServiceImpl$hasPriceRemind$1 = (MarketUiServiceImpl$hasPriceRemind$1) continuation;
            int i = marketUiServiceImpl$hasPriceRemind$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUiServiceImpl$hasPriceRemind$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUiServiceImpl$hasPriceRemind$1 = new MarketUiServiceImpl$hasPriceRemind$1(this, continuation);
            }
        }
        java.lang.Object objAwaitFirst = marketUiServiceImpl$hasPriceRemind$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUiServiceImpl$hasPriceRemind$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwaitFirst);
                Result.Application application = Result.Companion;
                AbstractC58185ywX<ResponseData<java.util.ArrayList<AlertRemindPo>>> listByInstrument = ((BizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(BizMarketService.class))).getListByInstrument();
                marketUiServiceImpl$hasPriceRemind$1.label = 1;
                objAwaitFirst = AwaitKt.awaitFirst(listByInstrument, marketUiServiceImpl$hasPriceRemind$1);
                if (objAwaitFirst == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwaitFirst);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(C33129mqd.KWHzl((java.util.Collection) ((ResponseData) objAwaitFirst).getData())));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7383isFailureimpl(objM7377constructorimpl) ? C56443yFo.KWHzl(false) : objM7377constructorimpl;
    }

    @Override // o.InterfaceC43036rhh
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, TokenInfoForAlert tokenInfoForAlert, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return C46818teO.Companion.OLrzqt(str, str2, null, (56 & 8) != 0 ? "" : "page_k", (56 & 16) != 0 ? "" : null, (56 & 32) != 0 ? "" : null, i, tokenInfoForAlert).OLrzqt(fragmentManager, continuation);
    }

    @Override // o.InterfaceC43033rhe
    public InterfaceC43032rhd KWHzl() {
        return ((qTB) C43251rlk.copydefault(qTB.class)).OLrzqt();
    }

    @Override // o.InterfaceC43033rhe
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd(context, str, (java.lang.String) null);
    }

    @Override // o.InterfaceC43033rhe
    public void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) SearchActivity.class);
        intent.putExtra("from", str);
        intent.putExtra(JwtUtilsKt.DID_METHOD_KEY, str2);
        context.startActivity(intent);
    }

    @Override // o.InterfaceC43033rhe
    public void KWHzl(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context, "planet_chat", str);
    }

    @Override // o.InterfaceC43033rhe
    public void copydefault(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        EZpvd(context, "planet_feed", str);
    }

    @Override // o.InterfaceC43033rhe
    public void AEQbTJ(@NotNull android.content.Context context, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC34993nmt.class);
        if (num != null) {
            num.intValue();
            intent.putExtra("ranking_id", num.intValue());
        }
        if (str != null) {
            intent.putExtra("type_key", str);
        }
        if (str2 != null) {
            intent.putExtra("ranking_tab_key", str2);
        }
        intent.putExtra("ranking_biz_type", str3);
        context.startActivity(intent);
    }

    @Override // o.InterfaceC43033rhe
    public void AEQbTJ(@NotNull android.content.Context context, UnifiedPriceRemind unifiedPriceRemind, TokenInfoForAlert tokenInfoForAlert) {
        Intrinsics.checkNotNullParameter(context, "");
        ActivityC46751tdA.Companion.EZpvd(context, unifiedPriceRemind, tokenInfoForAlert);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:12:0x002a, B:23:0x004d, B:25:0x005b, B:27:0x005f, B:29:0x0065, B:17:0x0039, B:19:0x003f), top: B:37:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MarketUiServiceImpl$isPreMarketShow$1 marketUiServiceImpl$isPreMarketShow$1;
        java.lang.Object objM7377constructorimpl;
        C46867tfK c46867tfK;
        if (continuation instanceof MarketUiServiceImpl$isPreMarketShow$1) {
            marketUiServiceImpl$isPreMarketShow$1 = (MarketUiServiceImpl$isPreMarketShow$1) continuation;
            int i = marketUiServiceImpl$isPreMarketShow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketUiServiceImpl$isPreMarketShow$1.label = i - Integer.MIN_VALUE;
            } else {
                marketUiServiceImpl$isPreMarketShow$1 = new MarketUiServiceImpl$isPreMarketShow$1(this, continuation);
            }
        }
        java.lang.Object obj = marketUiServiceImpl$isPreMarketShow$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketUiServiceImpl$isPreMarketShow$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            if (this.copydefault == null) {
                C44586sZi c44586sZi = C44586sZi.EZpvd;
                marketUiServiceImpl$isPreMarketShow$1.L$0 = this;
                marketUiServiceImpl$isPreMarketShow$1.label = 1;
                if (c44586sZi.OLrzqt(marketUiServiceImpl$isPreMarketShow$1) == objCopydefault) {
                    return objCopydefault;
                }
                c46867tfK = this;
            } else {
                c46867tfK = this;
                java.lang.Boolean bool = c46867tfK.copydefault;
                objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(bool == null ? bool.booleanValue() : false));
                return !Result.m7383isFailureimpl(objM7377constructorimpl) ? C56443yFo.KWHzl(false) : objM7377constructorimpl;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c46867tfK = (C46867tfK) marketUiServiceImpl$isPreMarketShow$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c46867tfK.copydefault = C56443yFo.KWHzl(kFE.Companion.AEQbTJ());
        java.lang.Boolean bool2 = c46867tfK.copydefault;
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(bool2 == null ? bool2.booleanValue() : false));
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
    }

    @Override // o.InterfaceC43033rhe
    public androidx.fragment.app.Fragment EZpvd(@NotNull android.content.Context context, java.lang.Integer num, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        return C25852jIt.Companion.copydefault(context, map, num);
    }

    @Override // o.InterfaceC43033rhe
    public androidx.fragment.app.Fragment copydefault(@NotNull android.content.Context context, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        return C25939jLz.Companion.copydefault();
    }

    @Override // o.InterfaceC43033rhe
    public void copydefault(@NotNull ComponentActivity componentActivity, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(componentActivity, "");
        C25852jIt.Companion.EZpvd(componentActivity);
    }

    @Override // o.InterfaceC43033rhe
    public void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C43056riA c43056riA = C43056riA.AEQbTJ;
        ExperienceRouteConst.MiniAppRoute miniAppRoute = ExperienceRouteConst.MiniAppRoute.COMMUNITY_DETAIL;
        c43056riA.copydefault(context, "market", miniAppRoute.getUrl(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("contentId", str), C56390yDp.OLrzqt("fromPage", str2), C56390yDp.OLrzqt("feedType", java.lang.String.valueOf(str3)), C56390yDp.OLrzqt("minversion", miniAppRoute.getMinAppVersion())));
    }

    @Override // o.InterfaceC43033rhe
    public void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        C43056riA.AEQbTJ.copydefault(context, "market", ExperienceRouteConst.MiniAppRoute.COMMUNITY_PROFILE.getUrl(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("authorId", str), C56390yDp.OLrzqt("nickName", java.lang.String.valueOf(str2)), C56390yDp.OLrzqt("portrait", java.lang.String.valueOf(str3)), C56390yDp.OLrzqt("minversion", ExperienceRouteConst.MiniAppRoute.COMMUNITY_DETAIL.getMinAppVersion())));
    }

    public androidx.fragment.app.Fragment gEmmrt() {
        return new C41341qow();
    }

    @Override // o.InterfaceC43033rhe
    public androidx.fragment.app.Fragment KWHzl(@NotNull java.lang.String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        return qBX.Companion.OLrzqt(str, function0);
    }

    @Override // o.InterfaceC43033rhe
    public void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull Function1<? super MarketCoinInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LandscapeNavSearchFragment.Companion.copydefault(fragment, function1);
    }

    @Override // o.InterfaceC43033rhe
    public void copydefault(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, BizInstrument bizInstrument, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function2<? super DexInstrument, ? super java.lang.String, Unit> function2, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        NavSearchRootFragment.Companion.EZpvd(str, fragmentManager, bizInstrument, str2, str3, map, yho, function2, function1);
    }

    @Override // o.InterfaceC43033rhe
    public void KWHzl(@NotNull java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager, DexInstrument dexInstrument, java.lang.String str2, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho, @NotNull Function2<? super DexInstrument, ? super java.lang.String, Unit> function2, Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(yho, "");
        Intrinsics.checkNotNullParameter(function2, "");
        NavSearchRootFragment.Companion.OLrzqt(str, fragmentManager, dexInstrument, str2, map, yho, function2, function1);
    }

    @Override // o.InterfaceC43033rhe
    public boolean KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<java.lang.String> list, kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull Function1<? super java.util.List<? extends BizInstrument>, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!C40379qTr.copydefault.KWHzl()) {
            return false;
        }
        qBJ.Companion.KWHzl(fragmentManager, list, pair, function1);
        return true;
    }

    @Override // o.InterfaceC43033rhe
    public boolean copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.List<? extends BizInstrument> list, @NotNull Function1<? super java.util.List<? extends BizInstrument>, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!C40379qTr.copydefault.KWHzl()) {
            return false;
        }
        C41886qzK.Companion.copydefault(fragmentManager, list, function1);
        return true;
    }

    @Override // o.InterfaceC43033rhe
    public boolean EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(yho, "");
        if (!C40379qTr.copydefault.KWHzl()) {
            return false;
        }
        C41896qzU.Companion.OLrzqt(fragmentManager, yho);
        return true;
    }

    @Override // o.InterfaceC43033rhe
    public boolean copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super BizInstrument, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (!C40379qTr.copydefault.KWHzl()) {
            return false;
        }
        qMP.Companion.copydefault(fragmentManager, function1);
        return true;
    }

    @Override // o.InterfaceC43033rhe
    public void copydefault(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Function1<? super java.util.List<java.lang.String>, Unit> function1) {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        pYF.Activity activity = pYF.Companion;
        if (!(abstractActivityC33041mov instanceof AppCompatActivity)) {
            abstractActivityC33041mov = null;
        }
        if (abstractActivityC33041mov == null || (supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager()) == null) {
            return;
        }
        activity.AEQbTJ(str, list, supportFragmentManager, function1);
    }

    @Override // o.InterfaceC43033rhe
    public void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<java.lang.String> arrayList, @NotNull Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C40340qSf c40340qSfCopydefault = C40340qSf.Companion.copydefault(arrayList);
        c40340qSfCopydefault.EZpvd(function2);
        c40340qSfCopydefault.show(fragmentManager, C40340qSf.class.getName());
    }
}
