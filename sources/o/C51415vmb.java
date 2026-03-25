package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.market_place.common.BotSelectedItemBinder;
import com.okinc.tradingbot.impl.market_place.presenter.MpBotCategoryPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.MpCategory;
import com.okinc.unify_trade.biz.UserTradeConfigInfo;
import com.okinc.unify_trade.bot.data.BotSelectedData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51415vmb extends AbstractC54505xKx<AbstractC48547uVl, MpBotCategoryPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final int EZpvd = C48033uCm.Activity.abAflu;
    public final C43316rmw OLrzqt = new C43316rmw();
    public final C43316rmw KWHzl = new C43316rmw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.vmb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vmb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C51415vmb KWHzl(@NotNull MpCategory mpCategory) {
            Intrinsics.checkNotNullParameter(mpCategory, "");
            C51415vmb c51415vmb = new C51415vmb();
            c51415vmb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_category_type", mpCategory)));
            return c51415vmb;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        MpCategory mpCategory;
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        MpBotCategoryPresenter mpBotCategoryPresenterDxcTrN = dxcTrN();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (mpCategory = (MpCategory) arguments.getParcelable("bot_category_type")) == null) {
            mpCategory = new MpCategory(null, null, null, 7, null);
        }
        mpBotCategoryPresenterDxcTrN.OLrzqt(mpCategory);
        KWHzl();
        OLrzqt();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl() {
        this.OLrzqt.register(BotSelectedData.class, new BotSelectedItemBinder(new Function1() { // from class: o.vmc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51415vmb.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        }));
        RecyclerView recyclerView = gGvvIC().AEQbTJ;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null), 0));
        recyclerView.setAdapter(this.OLrzqt);
        java.util.List<BotSelectedData> listEZpvd = dxcTrN().EZpvd();
        if (!listEZpvd.isEmpty()) {
            C33064mpR.OLrzqt(this.OLrzqt, (java.util.List<? extends java.lang.Object>) listEZpvd);
            return;
        }
        RecyclerView recyclerView2 = gGvvIC().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setVisibility(8);
    }

    public static final Unit copydefault(C51415vmb c51415vmb, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51415vmb.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        this.KWHzl.register(C51938vwU.class, new C51422vmi(new Function1() { // from class: o.vma
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51415vmb.OLrzqt(this.EZpvd, (C51484vnr) obj);
            }
        }));
        RecyclerView recyclerView = gGvvIC().OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), 0));
        recyclerView.setAdapter(this.KWHzl);
        java.util.List<C51938vwU> listCopydefault = dxcTrN().copydefault();
        if (!listCopydefault.isEmpty()) {
            C33064mpR.OLrzqt(this.KWHzl, (java.util.List<? extends java.lang.Object>) listCopydefault);
            return;
        }
        RecyclerView recyclerView2 = gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
        recyclerView2.setVisibility(8);
    }

    public static final Unit OLrzqt(C51415vmb c51415vmb, C51484vnr c51484vnr) {
        Intrinsics.checkNotNullParameter(c51484vnr, "");
        c51415vmb.OLrzqt(c51484vnr.AEQbTJ());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
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
        if (EZpvd(str)) {
            C55326xho.toast$default(C55688xof.Application.ActivityResultContractsPickVisualMediaImageAndVideo, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        C55867xrz.KWHzl.AEQbTJ(dxcTrN().OLrzqt().getName(), str);
        getParentFragmentManager().setFragmentResult("bot_dialog_dismiss", BundleKt.bundleOf());
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
        android.content.Context context = getContext();
        if (context != null) {
            ActivityC52122vzt.Companion.OLrzqt(context, botTradeData, (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "mp_bot_category", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        }
    }

    private final boolean EZpvd(java.lang.String str) {
        UserTradeConfigInfo userTradeConfigInfoGHZMYf;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        return interfaceC54581xNrCopydefault != null && (userTradeConfigInfoGHZMYf = interfaceC54581xNrCopydefault.gHZMYf()) != null && userTradeConfigInfoGHZMYf.getRoleType() == 1 && C51468vnb.DbNXlk().contains(str);
    }
}
