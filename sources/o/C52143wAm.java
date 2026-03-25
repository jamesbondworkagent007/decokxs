package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.ContractGridRelatedPosPresenter;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wAm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52143wAm extends AbstractC54505xKx<AbstractC48658uZo, ContractGridRelatedPosPresenter> {
    public final InterfaceC56387yDm OLrzqt;
    public final int copydefault = C48033uCm.Activity.fZc;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wAp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52143wAm.AkhnZx();
        }
    });

    /* JADX INFO: renamed from: o.wAm$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
        return this.copydefault;
    }

    public static final /* synthetic */ AbstractC48658uZo AEQbTJ(C52143wAm c52143wAm) {
        return c52143wAm.gGvvIC();
    }

    public C52143wAm() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridRelatedPosFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridRelatedPosFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.ContractGridRelatedPosFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter djBIcL() {
        return (TacticsDetailPresenter) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AkhnZx() {
        return new C43316rmw();
    }

    private final C43316rmw valueOf() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw();
        fetchVPNInfo();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(djBIcL().AhwBna());
        if (dxcTrN().OLrzqt().isHistory()) {
            return;
        }
        KWHzl();
        values();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        gEmmrt();
    }

    private final void fetchVPNInfo() {
        OKReminder oKReminder = gGvvIC().copydefault;
        oKReminder.setStyle(2);
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.dHAKvv);
        if (!(strAYXKKw instanceof java.lang.CharSequence)) {
            strAYXKKw = null;
        }
        oKReminder.setTitle((java.lang.CharSequence) strAYXKKw);
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.OmJATG);
        oKReminder.setMessage((java.lang.CharSequence) (strAYXKKw2 instanceof java.lang.CharSequence ? strAYXKKw2 : null));
        oKReminder.setCloseIconVisibility(false);
    }

    public final void gEmmrt() {
        if (dxcTrN().OLrzqt().isHistory()) {
            KWHzl(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
            return;
        }
        if (isConnected()) {
            android.widget.LinearLayout linearLayout = gGvvIC().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(0);
            copydefault(true);
        } else {
            android.widget.LinearLayout linearLayout2 = gGvvIC().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            dxcTrN().isConnected();
        }
        AEQbTJ();
    }

    private final void KWHzl(java.lang.String str) {
        C49952uyJ.updateDataOrEmpty$default(valueOf(), yDY.AhwBna(), str, 0, null, null, false, 60, null);
    }

    private final boolean isConnected() {
        return Intrinsics.EZpvd((java.lang.Object) dxcTrN().OLrzqt().getState(), (java.lang.Object) "no_close_position");
    }

    public final void KWHzl() {
        C54984xbQ c54984xbQ = gGvvIC().AEQbTJ;
        c54984xbQ.setOnClickListener(new TaskDescription(c54984xbQ, 1000L, this));
        C54984xbQ c54984xbQ2 = gGvvIC().EZpvd;
        c54984xbQ2.setOnClickListener(new ActionBar(c54984xbQ2, 1000L, this));
    }

    public final void AEQbTJ() {
        gGvvIC().KWHzl.AEQbTJ(dxcTrN().OLrzqt().getInstId(), dxcTrN().OLrzqt().getInstType());
    }

    public static /* synthetic */ void setPosSelect$default(C52143wAm c52143wAm, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c52143wAm.copydefault(z);
    }

    public final void copydefault(boolean z) {
        C33064mpR.OLrzqt(valueOf(), (java.util.List<? extends java.lang.Object>) yDY.AhwBna());
        gGvvIC().AEQbTJ.setSelectedStyle(z, 4);
        gGvvIC().AEQbTJ.setSelected(z);
        boolean z2 = !z;
        gGvvIC().EZpvd.setSelectedStyle(z2, 4);
        gGvvIC().EZpvd.setSelected(z2);
        if (z) {
            gGvvIC().EZpvd.setText(C33070mpX.AYXKKw(C55688xof.Application.removeCancellable));
            dxcTrN().isConnected();
            dxcTrN().DbNXlk();
        } else {
            dxcTrN().AEQbTJ();
            dxcTrN().DbNXlk();
        }
    }

    private final void AYXKKw() {
        valueOf().register(DetailsData.class, new wNN(0, false, false, 0, new Function1() { // from class: o.wAt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.AEQbTJ(this.AEQbTJ, (DetailsData) obj);
            }
        }, new Function1() { // from class: o.wAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.KWHzl(this.OLrzqt, (DetailsData) obj);
            }
        }, new Function1() { // from class: o.wAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.KWHzl(this.OLrzqt, (Triple) obj);
            }
        }, 15, null));
        valueOf().register(TransDetailsData.class, new C52502wNu(new Function1() { // from class: o.wAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.KWHzl(this.copydefault, (TransDetailsData) obj);
            }
        }));
        valueOf().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.KWHzl(this.OLrzqt, (EmptyData) obj);
            }
        }));
        gGvvIC().OLrzqt.setAdapter(valueOf());
        gGvvIC().OLrzqt.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    public static final Unit AEQbTJ(C52143wAm c52143wAm, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        C54206wzw.Companion.copydefault(detailsData, c52143wAm.dxcTrN().OLrzqt()).show(c52143wAm.getChildFragmentManager(), "ContractGridClosePosFragment");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52143wAm c52143wAm, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        c52143wAm.copydefault(detailsData);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52143wAm c52143wAm, Triple triple) {
        Intrinsics.checkNotNullParameter(triple, "");
        c52143wAm.EZpvd((Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData>) triple);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wAm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C52143wAm KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52143wAm c52143wAm) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c52143wAm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (C52143wAm.AEQbTJ(this.KWHzl).EZpvd.isSelected()) {
                    return;
                }
                this.KWHzl.copydefault(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.wAm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C52143wAm AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52143wAm c52143wAm) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c52143wAm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (C52143wAm.AEQbTJ(this.AEQbTJ).AEQbTJ.isSelected()) {
                    return;
                }
                this.AEQbTJ.copydefault(true);
            }
        }
    }

    public static final Unit KWHzl(C52143wAm c52143wAm, TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        java.lang.String algoId = c52143wAm.dxcTrN().OLrzqt().getAlgoId();
        java.lang.String orderId = transDetailsData.getOrderId();
        c52143wAm.dxcTrN().KWHzl(new ContractGridClosePositionData(algoId, orderId == null ? "" : orderId, (java.lang.String) null, 4, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52143wAm c52143wAm, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c52143wAm.gEmmrt();
        return Unit.INSTANCE;
    }

    public final void EZpvd(Triple<? extends TacticsUiConst.BotListSubItemType, ? extends java.lang.Object, TacticsInsideItemData> triple) {
        FragmentActivity activity;
        TradePositionManager.PositionItem positionItem;
        java.lang.String doubtMsg;
        TacticsUiConst.BotListSubItemType first = triple.getFirst();
        java.lang.String str = "";
        if (first instanceof TacticsUiConst.BotListSubItemType.BotSubTip) {
            TacticsInsideItemData third = triple.getThird();
            if (third != null && (doubtMsg = third.getDoubtMsg()) != null) {
                str = doubtMsg;
            }
            OLrzqt(str);
            return;
        }
        if (!(first instanceof TacticsUiConst.BotListSubItemType.BotSubPosition) || triple.getSecond() == null || !(triple.getSecond() instanceof DetailsData) || (activity = getActivity()) == null) {
            return;
        }
        java.lang.Object second = triple.getSecond();
        Intrinsics.copydefault(second, "");
        StrategyPositionResponse originPosition = ((DetailsData) second).getOriginPosition();
        if (originPosition == null || (positionItem = originPosition.getPositionItem()) == null) {
            return;
        }
        C52696wUz.OLrzqt(positionItem, activity);
    }

    public final void copydefault(final DetailsData detailsData) {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && !newProxyInstance.uzCIH()) {
            java.lang.String algoId = detailsData.getAlgoId();
            dxcTrN().KWHzl(new ContractGridClosePositionReq(algoId == null ? "" : algoId, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null));
            return;
        }
        java.lang.String type = detailsData.getType();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsStartActivityForResult);
        java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsRequestPermission, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tradeTitle", C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, dxcTrN().OLrzqt().getInstId(), dxcTrN().OLrzqt().getInstType(), false, false, 8, null)), C56390yDp.OLrzqt("tradeType", type), C56390yDp.OLrzqt("tradeSymbol", C56033xvF.getBotLever$default(detailsData.getLevel(), false, 2, null))));
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C49511upt.StateListAnimator.AxsJAY, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC49607urj abstractC49607urj = (AbstractC49607urj) viewDataBindingInflate;
        android.widget.TextView textView = abstractC49607urj.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = abstractC49607urj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        abstractC49607urj.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wAq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C52143wAm.KWHzl(this.AEQbTJ, compoundButton, z);
            }
        });
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.updateBackInvokedCallbackStateactivity_release);
        final int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fbC);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(strCopydefault, new java.lang.String[]{type}, 0, null, false, new Function1() { // from class: o.wAn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.AEQbTJ(detailsData, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.wAr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.KWHzl(iCopydefault, (java.util.List) obj);
            }
        }, 14, null), strAYXKKw2);
        android.view.View root = abstractC49607urj.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.EZpvd(root);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.itxZVF);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52143wAm.AEQbTJ(detailsData, this, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = viewOnClickListenerC54939xaY.getContext().getString(C48033uCm.Fragment.DjWNei);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.wAs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52143wAm.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(C52143wAm c52143wAm, android.widget.CompoundButton compoundButton, boolean z) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C54630xPm c54630xPmAuCTelauCTel;
        if (!(c52143wAm.getContext() instanceof LifecycleOwner) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) == null) {
            return;
        }
        java.lang.Object context = c52143wAm.getContext();
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        c54630xPmAuCTelauCTel.KWHzl(!z, lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
    }

    public static final Unit AEQbTJ(DetailsData detailsData, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(detailsData.getSideColor()));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(DetailsData detailsData, C52143wAm c52143wAm, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        java.lang.String algoId = detailsData.getAlgoId();
        if (algoId == null) {
            algoId = "";
        }
        c52143wAm.dxcTrN().KWHzl(new ContractGridClosePositionReq(algoId, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null));
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void OLrzqt(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(str);
        java.lang.String string = getString(C48033uCm.Fragment.fraLem);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wAo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52143wAm.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void values() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = djBIcL().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.AEQbTJ(this.copydefault, (C55804xqp) obj);
            }
        }));
        dxcTrN().djBIcL().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.OLrzqt(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        TradeLiveData<C55804xqp<java.util.List<StrategyPositionResponse>>> tradeLiveDataAYXKKw = dxcTrN().AYXKKw();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wAx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.OLrzqt(this.EZpvd, (C55804xqp) obj);
            }
        }));
        TradeLiveData<java.util.ArrayList<TransDetailsData>> tradeLiveDataValueOf = dxcTrN().valueOf();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.wAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.copydefault(this.copydefault, (java.util.ArrayList) obj);
            }
        }));
        C56111xwe<java.util.List<ContractGridClosePositionData>> c56111xweEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweEZpvd.observe(viewLifecycleOwner4, new Observer() { // from class: o.wAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C52143wAm.KWHzl((java.util.List) obj);
            }
        });
        C56111xwe<java.util.List<ContractGridClosePositionData>> c56111xweKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweKWHzl.observe(viewLifecycleOwner5, new Observer() { // from class: o.wAF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C52143wAm.AEQbTJ((java.util.List) obj);
            }
        });
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wAE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.EZpvd(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wAD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52143wAm.copydefault(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C52143wAm c52143wAm, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        c52143wAm.dxcTrN().OLrzqt((StrategyDetailsResponse) c55804xqp.copydefault());
        java.lang.String state = ((StrategyDetailsResponse) c55804xqp.copydefault()).getState();
        int iHashCode = state.hashCode();
        if (iHashCode != -1884319283) {
            if (iHashCode != -1821824562) {
                if (iHashCode == 1715648628 && state.equals("stopping")) {
                    android.widget.LinearLayout linearLayout = c52143wAm.gGvvIC().AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    if (linearLayout.getVisibility() == 0) {
                        c52143wAm.copydefault(true);
                        android.widget.LinearLayout linearLayout2 = c52143wAm.gGvvIC().AYXKKw;
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                        linearLayout2.setVisibility(8);
                    }
                }
            } else if (state.equals("no_close_position")) {
                android.widget.LinearLayout linearLayout3 = c52143wAm.gGvvIC().AYXKKw;
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
                if (linearLayout3.getVisibility() != 0) {
                    android.widget.LinearLayout linearLayout4 = c52143wAm.gGvvIC().AYXKKw;
                    Intrinsics.checkNotNullExpressionValue(linearLayout4, "");
                    linearLayout4.setVisibility(0);
                    c52143wAm.copydefault(true);
                }
            }
        } else if (state.equals("stopped")) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52143wAm c52143wAm, java.util.ArrayList arrayList) {
        if (!c52143wAm.isConnected() || (c52143wAm.isConnected() && c52143wAm.gGvvIC().AEQbTJ.isSelected())) {
            C43316rmw c43316rmwValueOf = c52143wAm.valueOf();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                java.util.ArrayList arrayList2 = null;
                if (!it.hasNext()) {
                    break;
                }
                DetailsData detailsData = (DetailsData) it.next();
                java.util.ArrayList<TacticsInsideItemData> subData = detailsData.getSubData();
                if (subData != null) {
                    arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : subData) {
                        TacticsInsideItemData tacticsInsideItemData = (TacticsInsideItemData) obj;
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) tacticsInsideItemData.getTitle()) && C33129mqd.OLrzqt((java.lang.CharSequence) tacticsInsideItemData.getText())) {
                            arrayList2.add(obj);
                        }
                    }
                }
                if (arrayList2 != null) {
                    detailsData.setSubData(new java.util.ArrayList<>(arrayList2));
                }
            }
            Intrinsics.checkNotNullExpressionValue(arrayList, "");
            C49952uyJ.updateDataOrEmpty$default(c43316rmwValueOf, arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
            wPS wps = c52143wAm.gGvvIC().KWHzl;
            Intrinsics.checkNotNullExpressionValue(wps, "");
            wps.setVisibility(C33129mqd.KWHzl((java.util.Collection) arrayList) ? 0 : 8);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52143wAm, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52143wAm c52143wAm, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        c52143wAm.AEQbTJ((StrategyPositionResponse) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) c55804xqp.copydefault()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52143wAm c52143wAm, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c52143wAm.gGvvIC().EZpvd.setText(C33070mpX.AYXKKw(C55688xof.Application.removeCancellable) + "(" + xMR.copydefault.copydefault(C33129mqd.gEmmrt(java.lang.Integer.valueOf(arrayList.size()))) + ")");
        if (c52143wAm.gGvvIC().EZpvd.isSelected()) {
            C49952uyJ.updateDataOrEmpty$default(c52143wAm.valueOf(), arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.syncState), 500);
    }

    public static final void AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onRequestPermissionsResult, 0, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r15v4, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52143wAm c52143wAm, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().copydefault().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().fetchVPNInfo().bB_())) {
            if (c52143wAm.gGvvIC().EZpvd.isSelected() && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().AhwBna().bB_())) {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().gEmmrt().bB_())) {
            if (Intrinsics.EZpvd((java.lang.Object) c52143wAm.dxcTrN().OLrzqt().getState(), (java.lang.Object) "stopped") || Intrinsics.EZpvd((java.lang.Object) c52143wAm.dxcTrN().OLrzqt().getState(), (java.lang.Object) "no_close_position")) {
                c52143wAm.KWHzl(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawn));
            } else {
                java.lang.String message3 = ((java.lang.Exception) pair.second).getMessage();
                if (message3 == null) {
                    message3 = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
                }
                C33064mpR.OLrzqt(c52143wAm.valueOf(), (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, message3, 60, false, null, null, false, 60, null));
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52143wAm, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52143wAm c52143wAm, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().copydefault().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().fetchVPNInfo().bB_())) {
            if (c52143wAm.gGvvIC().EZpvd.isSelected()) {
                if (((java.lang.Boolean) pair.second).booleanValue()) {
                    c52143wAm.showLoading();
                } else {
                    c52143wAm.dismissLoading();
                }
            }
        } else if ((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().gEmmrt().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52143wAm.dxcTrN().AhwBna().bB_())) && c52143wAm.gGvvIC().AEQbTJ.isSelected()) {
            if (((java.lang.Boolean) pair.second).booleanValue()) {
                c52143wAm.showLoading();
            } else {
                c52143wAm.dismissLoading();
            }
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(StrategyPositionResponse strategyPositionResponse) {
        if (strategyPositionResponse == null) {
            return;
        }
        OKReminder oKReminder = gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        oKReminder.setVisibility(C33129mqd.gEmmrt(strategyPositionResponse.getMgnRatio(), "3") ? 0 : 8);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (valueOf().getItemCount() == 0) {
            super.showLoading();
        }
    }
}
