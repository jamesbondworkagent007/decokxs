package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.market.discover.features.markets.DefaultMarketsTrack$trackMarketFullPageView$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendardetail.ui.model.TradingCalendarType;
import com.okinc.market.time.filter.PeriodEnum;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.DexInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40387qTz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38447pZc implements InterfaceC38466pZv {
    private static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public androidx.fragment.app.Fragment EZpvd;
    public C41343qoy OLrzqt;
    public android.content.Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.EZpvd = null;
        this.copydefault = null;
    }

    /* JADX INFO: renamed from: o.pZc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pZc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public void OLrzqt(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.EZpvd = fragment;
        this.copydefault = fragment.getContext();
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(C41343qoy.class);
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.DefaultMarketsTrack$attachNavContext$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = fragment.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        };
        final byte b = 0 == true ? 1 : 0;
        this.OLrzqt = (C41343qoy) FragmentViewModelLazyKt.createViewModelLazy(fragment, interfaceC56551yJoAEQbTJ, function0, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.DefaultMarketsTrack$attachNavContext$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = b;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = fragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.DefaultMarketsTrack$attachNavContext$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = fragment.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
        C41298qoF c41298qoF = C41298qoF.AEQbTJ;
        java.lang.String simpleName = fragment.getClass().getSimpleName();
        android.content.Context context = this.copydefault;
        c41298qoF.AEQbTJ("DefaultMarketsTrack", "attachNavContext: " + simpleName + " " + (context != null ? context.getClass().getSimpleName() : null));
    }

    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, int i, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("Markets_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.EZpvd(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        java.lang.String lowerCase;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deal_name", str, false);
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) {
            lowerCase = "expiry";
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) {
            lowerCase = "perpetual";
        } else {
            lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        eventParamsList.put("deal_type", lowerCase, false);
        eventParamsList.put(C27989kKu.Companion.AhwBna(), str3, false);
        EventParamsList.put$default(eventParamsList, "l3_tab", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull final TradeCoinInfo tradeCoinInfo, int i, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(tradeCoinInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Markets_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.AEQbTJ(tradeCoinInfo, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(TradeCoinInfo tradeCoinInfo, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deal_name", tradeCoinInfo.getSymbol(), false);
        eventParamsList.put("deal_type", OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, false);
        eventParamsList.put(C27989kKu.Companion.AhwBna(), "spot", false);
        EventParamsList.put$default(eventParamsList, "l3_tab", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull final DexInstrument dexInstrument, int i, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Markets_List_Token_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.copydefault(dexInstrument, str, str2, bool, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(DexInstrument dexInstrument, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("deal_name", dexInstrument.getTokenSymbol(), false);
        eventParamsList.put("deal_type", str, false);
        eventParamsList.put(C27989kKu.Companion.AhwBna(), str, false);
        EventParamsList.put$default(eventParamsList, "l3_tab", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_boost", C33129mqd.gEmmrt(bool), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC38466pZv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DefaultMarketsTrack$trackMarketFullPageView$1 defaultMarketsTrack$trackMarketFullPageView$1;
        C38447pZc c38447pZc;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof DefaultMarketsTrack$trackMarketFullPageView$1) {
            defaultMarketsTrack$trackMarketFullPageView$1 = (DefaultMarketsTrack$trackMarketFullPageView$1) continuation;
            int i = defaultMarketsTrack$trackMarketFullPageView$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultMarketsTrack$trackMarketFullPageView$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultMarketsTrack$trackMarketFullPageView$1 = new DefaultMarketsTrack$trackMarketFullPageView$1(this, continuation);
            }
        }
        DefaultMarketsTrack$trackMarketFullPageView$1 defaultMarketsTrack$trackMarketFullPageView$12 = defaultMarketsTrack$trackMarketFullPageView$1;
        java.lang.Object objQueryWatchList$default = defaultMarketsTrack$trackMarketFullPageView$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defaultMarketsTrack$trackMarketFullPageView$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objQueryWatchList$default);
            try {
                Result.Application application = Result.Companion;
                InterfaceC40387qTz interfaceC40387qTzCopydefault = ((qTB) C43251rlk.copydefault(qTB.class)).copydefault();
                defaultMarketsTrack$trackMarketFullPageView$12.L$0 = this;
                defaultMarketsTrack$trackMarketFullPageView$12.L$1 = str;
                defaultMarketsTrack$trackMarketFullPageView$12.L$2 = str2;
                defaultMarketsTrack$trackMarketFullPageView$12.L$3 = str3;
                defaultMarketsTrack$trackMarketFullPageView$12.label = 1;
                objQueryWatchList$default = InterfaceC40387qTz.Activity.queryWatchList$default(interfaceC40387qTzCopydefault, false, false, defaultMarketsTrack$trackMarketFullPageView$12, 3, null);
                if (objQueryWatchList$default == objCopydefault) {
                    return objCopydefault;
                }
                c38447pZc = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c38447pZc = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) defaultMarketsTrack$trackMarketFullPageView$12.L$3;
            str2 = (java.lang.String) defaultMarketsTrack$trackMarketFullPageView$12.L$2;
            str = (java.lang.String) defaultMarketsTrack$trackMarketFullPageView$12.L$1;
            c38447pZc = (C38447pZc) defaultMarketsTrack$trackMarketFullPageView$12.L$0;
            try {
                C56391yDq.AEQbTJ(objQueryWatchList$default);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.AEQbTJ(((java.util.List) objQueryWatchList$default).size()));
        final java.lang.String str4 = str;
        final java.lang.String str5 = str2;
        final java.lang.String str6 = str3;
        final C38447pZc c38447pZc2 = c38447pZc;
        java.lang.Integer numAEQbTJ = C56443yFo.AEQbTJ(0);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = numAEQbTJ;
        }
        final int iIntValue = ((java.lang.Number) objM7377constructorimpl).intValue();
        C32866mlf.onEvent$default("Markets_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.pZt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.OLrzqt(str4, str5, str6, iIntValue, c38447pZc2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, C38447pZc c38447pZc, EventParamsList eventParamsList) {
        MutableLiveData<java.lang.Boolean> mutableLiveDataAEQbTJ;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "l3_tab", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "watchlist_num", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i)), false, 4, null);
        C41343qoy c41343qoy = c38447pZc.OLrzqt;
        EventParamsList.put$default(eventParamsList, "mini_macro_module", (c41343qoy == null || (mutableLiveDataAEQbTJ = c41343qoy.AEQbTJ()) == null || !Intrinsics.EZpvd(mutableLiveDataAEQbTJ.getValue(), java.lang.Boolean.TRUE)) ? "hidden" : "shown", false, 4, null);
        for (Map.Entry<java.lang.String, java.lang.String> entry : C44600sZw.AEQbTJ.copydefault().entrySet()) {
            eventParamsList.put(entry.getKey(), entry.getValue(), false);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("Markets_Full_Tab_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.valueOf(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "l3_tab", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "click_tab", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("Markets_Category_TabSorting_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.copydefault(str, str2, str3, str4, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "tab", "markets", false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "l3_tab", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "sorting_criteria", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "sort_order", str4, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Markets_List_Filter_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.copydefault(str2, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "l3_tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), str2, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final PeriodEnum periodEnum) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        C32866mlf.onEvent$default("Markets_List_FilterList_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.AEQbTJ(str2, str, str3, str4, str5, str6, periodEnum, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, PeriodEnum periodEnum, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "l3_tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "filter_before", str3, false, 4, null);
        EventParamsList.put$default(eventParamsList, "filter_after", str4, false, 4, null);
        if (str5 != null) {
            EventParamsList.put$default(eventParamsList, "category_before", str5, false, 4, null);
        }
        if (str6 != null) {
            EventParamsList.put$default(eventParamsList, "category_after", str6, false, 4, null);
        }
        if (periodEnum != null) {
            EventParamsList.put$default(eventParamsList, "timeframe", periodEnum.getInputPara(), false, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Markets_Overview_Header_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.OLrzqt(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(@NotNull final java.lang.String str, @NotNull java.lang.String str2, final int i) {
        final java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) TradingCalendarType.ECONOMIC.getRequestValue())) {
            str3 = "economic";
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) TradingCalendarType.TOKEN_UNLOCK.getRequestValue())) {
            str3 = "token_unlock";
        }
        C32866mlf.onEvent$default("Markets_Overview_Item_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.AEQbTJ(str, str3, i, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "module", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "item_type", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "item_position", C33129mqd.gEmmrt(java.lang.Integer.valueOf(i + 1)), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void AEQbTJ(final boolean z) {
        C32866mlf.onEvent$default("Markets_Overview_MacroButtons_Swipe", (TrackChannel[]) null, new Function1() { // from class: o.pZe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.copydefault(z, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "mini_macro_module", z ? "shown" : "hidden", false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void AEQbTJ() {
        C32866mlf.onEvent$default("Markets_Favourites_FavouriteDropDown_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Markets_Favourites_GroupSelector_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.AEQbTJ(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "select_tab", qWI.EZpvd(str), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void OLrzqt() {
        C32866mlf.onEvent$default("Markets_FavouriteBottomSheet_Manage_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.InterfaceC38466pZv
    public void EZpvd() {
        C32866mlf.onEvent$default("Markets_FavouriteBottomSheet_Item_Drag", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.InterfaceC38466pZv
    public void EZpvd(@NotNull final DexInstrument dexInstrument, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("Cedefi_Tag_Icon_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.OLrzqt(dexInstrument, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(DexInstrument dexInstrument, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC38466pZv
    public void copydefault(@NotNull final DexInstrument dexInstrument, @NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(dexInstrument, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("Markets_List_BoostIcon_Click", (TrackChannel[]) null, new Function1() { // from class: o.pZk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38447pZc.OLrzqt(dexInstrument, str, str2, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(DexInstrument dexInstrument, java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token_contract_address", dexInstrument.getTokenContractAddress(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "deal_name", dexInstrument.getTokenSymbol(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_name", dexInstrument.getChainName(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, C27989kKu.Companion.AhwBna(), str2, false, 4, null);
        return Unit.INSTANCE;
    }
}
