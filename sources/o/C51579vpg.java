package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradingbot.impl.market_place.home.list.presenter.BotFeaturedPresenter;
import com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotFeaturedFragment$setListener$1$1;
import com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotFeaturedFragment$setListener$2$1;
import com.okinc.tradingbot.impl.market_place.home.presenter.MarketPlaceHomeHeaderPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotCreateCardItem;
import com.okinc.unify_trade.biz.BotCreateContentItem;
import com.okinc.unify_trade.biz.BotCreateTitleItem;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.ChatCommunityItem;
import com.okinc.unify_trade.biz.CustomerServiceAndChatItem;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.biz.NmpBotSquareGuideItem;
import com.okinc.unify_trade.biz.RecommendBulletMPData;
import com.okinc.unify_trade.biz.RecommendBulletMPDataB;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC52122vzt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC43294rma;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vpg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51579vpg extends AbstractC54505xKx<AbstractC50787vaj, BotFeaturedPresenter> {
    public final InterfaceC56387yDm AEQbTJ;
    public final C43316rmw KWHzl = new C43316rmw();
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final int copydefault = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
    public static final int EZpvd = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);

    /* JADX INFO: renamed from: o.vpg$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.HJWChPQPAeHI;
    }

    public C51579vpg() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketPlaceHomeHeaderPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotFeaturedFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotFeaturedFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotFeaturedFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final MarketPlaceHomeHeaderPresenter valueOf() {
        return (MarketPlaceHomeHeaderPresenter) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.vpg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vpg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C51579vpg OLrzqt() {
            return new C51579vpg();
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        RecyclerView recyclerView = gGvvIC().AEQbTJ;
        Intrinsics.copydefault(recyclerView);
        wPQ.OLrzqt(recyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(recyclerView.getContext(), 4);
        gridLayoutManager.setSpanSizeLookup(gEmmrt());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(copydefault(gridLayoutManager));
        C43316rmw c43316rmw = this.KWHzl;
        c43316rmw.register(BotCreateCardItem.class, new C51495voB(new Function1() { // from class: o.vpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        }));
        final Function0 function0 = new Function0() { // from class: o.vpm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51579vpg.valueOf(this.EZpvd);
            }
        };
        c43316rmw.register(ChatCommunityItem.class, new C51501voH(new Function0() { // from class: o.vpo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51579vpg.copydefault(function0);
            }
        }));
        c43316rmw.register(CustomerServiceAndChatItem.class, new C51503voJ(new Function0() { // from class: o.vps
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51579vpg.AYXKKw(this.KWHzl);
            }
        }, new Function0() { // from class: o.vpp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51579vpg.AEQbTJ(function0);
            }
        }));
        c43316rmw.register(NmpBotSquareGuideItem.class, new C51511voR(new Function0() { // from class: o.vpr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51579vpg.gEmmrt(this.KWHzl);
            }
        }));
        c43316rmw.register(RecommendBulletMPData.class, new C51509voP(new Function0() { // from class: o.vpt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51579vpg.EZpvd();
            }
        }));
        c43316rmw.register(RecommendBulletMPDataB.class, new C51513voT(null, 1, 0 == true ? 1 : 0));
        c43316rmw.register(BotCreateTitleItem.class, new C51500voG());
        c43316rmw.register(BotCreateContentItem.class, new C51497voD(new Function1() { // from class: o.vpv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        }));
        recyclerView.setAdapter(this.KWHzl);
        C56028xvA.registerBotFragmentTrack$default(this, "BotFeaturedFragment", new kotlin.Pair[0], null, 8, null);
    }

    public static final Unit OLrzqt(C51579vpg c51579vpg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "create")) {
            C51418vme c51418vme = new C51418vme();
            androidx.fragment.app.FragmentManager childFragmentManager = c51579vpg.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c51418vme.show(childFragmentManager);
        } else {
            c51579vpg.EZpvd(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C51579vpg c51579vpg) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c51579vpg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        java.lang.String strOLrzqt = C34703nhO.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        java.lang.String lowerCase = strOLrzqt.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, lowerCase + "://pro/miniapp?appid=okluatradingeco&pageurl=/community_middle_page&from_source=bot_page_entrance", null, new Function1() { // from class: o.vpw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C51579vpg c51579vpg) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c51579vpg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        java.lang.String strOLrzqt = C34703nhO.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
        java.lang.String lowerCase = strOLrzqt.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, lowerCase + "://app/supportcenter?entrance_id=tradingbot_homepage_bottom", null, new Function1() { // from class: o.vpx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.KWHzl((AbstractC43238rlX) obj);
            }
        }, 4, null);
        C32866mlf.onEvent$default("trading_bot_cs_home_page_bottom_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C51579vpg c51579vpg) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = c51579vpg.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, "social/trade/community?location=HOT&nmp_channel=bot_page_entrance", null, new Function1() { // from class: o.vpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.djBIcL((AbstractC43238rlX) obj);
            }
        }, 4, null);
        C55867xrz.KWHzl.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51579vpg c51579vpg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51579vpg.EZpvd(str);
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        BotTradeData botTradeData;
        BizInstrument suggestedInstrument$default;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "smart_arbitrage")) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C52841waI.Companion.EZpvd(activity);
                return;
            }
            return;
        }
        if (dxcTrN().OLrzqt(str)) {
            C55326xho.toast$default(C55688xof.Application.ActivityResultContractsPickVisualMediaImageAndVideo, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        xUV xuv = xUV.EZpvd;
        java.lang.String strEZpvd = xuv.EZpvd("current_instrument_id");
        java.lang.String str2 = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strEZpvd2 = xuv.EZpvd("current_instrument_type");
        java.lang.String str3 = strEZpvd2 == null ? "" : strEZpvd2;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BOT_TYPE_CONTRACT_GRID_COINM")) {
            InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
            BizInstrument suggestedInstrument$default2 = null;
            java.lang.String tradeSymbol = (interfaceC54581xNrCopydefault == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, str3, str2, null, null, 12, null)) == null) ? null : suggestedInstrument$default.getTradeSymbol();
            if (interfaceC54581xNrCopydefault != null) {
                suggestedInstrument$default2 = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, "SWAP", tradeSymbol + "-USD-SWAP", null, null, 12, null);
            }
            botTradeData = new BotTradeData("contract_grid", (suggestedInstrument$default2 == null || !Intrinsics.EZpvd(suggestedInstrument$default2.isNegativeContract(), java.lang.Boolean.TRUE)) ? "BTC-USD-SWAP" : suggestedInstrument$default2.getInstId(), "SWAP", (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null);
        } else {
            botTradeData = new BotTradeData(str, str2, str3, (android.os.Parcelable) null, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, (DefaultConstructorMarker) null);
        }
        ActivityC52122vzt.Application application = ActivityC52122vzt.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        application.OLrzqt(contextRequireContext, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "bot_home_recommend", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        C55867xrz.KWHzl.copydefault("more", str);
    }

    /* JADX INFO: renamed from: o.vpg$TaskDescription */
    public static final class TaskDescription extends GridLayoutManager.SpanSizeLookup {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            return C51579vpg.this.KWHzl.getItems().get(i) instanceof BotCreateCardItem ? 1 : 4;
        }
    }

    public final TaskDescription gEmmrt() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.vpg$ActionBar */
    public static final class ActionBar extends RecyclerView.ItemDecoration {
        public final /* synthetic */ C51579vpg KWHzl;
        public final /* synthetic */ GridLayoutManager OLrzqt;

        public ActionBar(GridLayoutManager gridLayoutManager, C51579vpg c51579vpg) {
            this.OLrzqt = gridLayoutManager;
            this.KWHzl = c51579vpg;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int spanCount = this.OLrzqt.getSpanCount();
            if (this.KWHzl.KWHzl.getItems().get(childAdapterPosition) instanceof BotCreateCardItem) {
                int spanCount2 = childAdapterPosition % this.OLrzqt.getSpanCount();
                rect.left = (C51579vpg.copydefault * spanCount2) / spanCount;
                rect.right = C51579vpg.copydefault - (((spanCount2 + 1) * C51579vpg.copydefault) / spanCount);
            }
            if (childAdapterPosition == this.KWHzl.KWHzl.getItemCount() - 1 && (this.KWHzl.KWHzl.getItems().get(childAdapterPosition) instanceof BotCreateContentItem)) {
                rect.bottom = C51579vpg.EZpvd;
            }
            C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
        }
    }

    public final ActionBar copydefault(GridLayoutManager gridLayoutManager) {
        return new ActionBar(gridLayoutManager, this);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        C56111xwe<java.util.List<MpCategory>> c56111xweOLrzqt = valueOf().OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        dxcTrN().KWHzl().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.vpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.OLrzqt(this.copydefault, (java.util.ArrayList) obj);
            }
        }));
        C56111xwe<java.lang.Boolean> c56111xweValueOf = valueOf().valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweValueOf.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.vpn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51579vpg.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        dxcTrN().copydefault();
    }

    public static final Unit copydefault(C51579vpg c51579vpg, java.util.List list) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c51579vpg), null, null, new BotFeaturedFragment$setListener$1$1(c51579vpg, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51579vpg c51579vpg, java.util.ArrayList arrayList) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c51579vpg), null, null, new BotFeaturedFragment$setListener$2$1(c51579vpg, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51579vpg c51579vpg, boolean z) {
        c51579vpg.dxcTrN().copydefault();
        return Unit.INSTANCE;
    }

    public final android.view.View djBIcL() {
        RecyclerView.LayoutManager layoutManager = gGvvIC().AEQbTJ.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.findViewByPosition(0);
        }
        return null;
    }
}
