package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaTriggerRsiPresenter;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.RsiTrigger;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.whI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53212whI extends AbstractC49945uyC<uND, SpotDcaTriggerRsiPresenter> {
    public boolean copydefault;
    public final InterfaceC56387yDm valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.whM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53212whI.djBIcL(this.KWHzl);
        }
    });
    public final Function2<C47988uAv, java.lang.String, Unit> KWHzl = new Function2() { // from class: o.whK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C53212whI.copydefault(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    /* JADX INFO: renamed from: o.whI$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.flVtFt;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ uND EZpvd(C53212whI c53212whI) {
        return c53212whI.values();
    }

    public C53212whI() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SpotDcaTriggerRsiPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaTriggerRsiDialog$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaTriggerRsiDialog$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaTriggerRsiDialog$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final SpotDcaTriggerRsiPresenter fIwbmz() {
        return (SpotDcaTriggerRsiPresenter) this.valueOf.getValue();
    }

    private final java.lang.String fJNWhG() {
        return (java.lang.String) this.OLrzqt.getValue();
    }

    public static final java.lang.String djBIcL(C53212whI c53212whI) {
        android.os.Bundle arguments = c53212whI.getArguments();
        if (arguments != null) {
            return arguments.getString("bot_inst_id");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.whI$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.whI.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53212whI EZpvd(java.util.List<DcaTriggerParam> list, java.lang.String str) {
            android.os.Bundle bundle = new android.os.Bundle();
            DcaTriggerParam[] dcaTriggerParamArr = new DcaTriggerParam[1];
            dcaTriggerParamArr[0] = list != null ? (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
            bundle.putParcelableArrayList("data", yDY.copydefault(dcaTriggerParamArr));
            bundle.putString("bot_inst_id", str);
            C53212whI c53212whI = new C53212whI();
            c53212whI.setArguments(bundle);
            return c53212whI;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fARcdN();
        AuCTel();
        ejfBZ();
    }

    private final void fARcdN() {
        java.util.ArrayList parcelableArrayList;
        SpotDcaTriggerRsiPresenter spotDcaTriggerRsiPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        spotDcaTriggerRsiPresenterOLrzqt.AEQbTJ((arguments == null || (parcelableArrayList = BundleCompat.getParcelableArrayList(arguments, "data", DcaTriggerParam.class)) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(parcelableArrayList));
    }

    private final void AuCTel() {
        java.lang.String timePeriod;
        java.lang.String tholdWarning;
        android.widget.ImageView imageView = values().valueOf;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        android.content.Context context = getContext();
        C33054mpH.EZpvd(imageView, context != null ? C43454rpb.copydefault("images/trading_bot/android/trade_rsi_kline_spot_dca.png", context, true) : null, (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? 0 : C52761wXj.TaskDescription.DuR, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? -1 : 0, (WebSocketProtocol.PAYLOAD_SHORT & 16) == 0 ? 0 : -1, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : new Function0() { // from class: o.whG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53212whI.gEmmrt(this.AEQbTJ);
            }
        }, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        C49960uyR.OLrzqt(this, values().fetchVPNInfo, java.lang.Integer.valueOf(C48033uCm.Application.zXhzOT), values().fetchVPNInfo, C55298xhM.dpInt$default(83.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        C47988uAv c47988uAv = values().AYXKKw;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.fromMediaItem), null, 2, null);
        InputLayoutState inputLayoutState = InputLayoutState.GREY_UN_CLICKABLE;
        C47988uAv.setInputLayoutState$default(c47988uAv, inputLayoutState, false, 2, null);
        DcaTriggerParam dcaTriggerParamEZpvd = OLrzqt().EZpvd();
        if (dcaTriggerParamEZpvd == null || (timePeriod = dcaTriggerParamEZpvd.getTimePeriod()) == null) {
            timePeriod = "";
        }
        C47988uAv.setInputContent$default(c47988uAv, timePeriod, false, false, 6, null);
        C47988uAv c47988uAv2 = values().DbNXlk;
        C47988uAv.setInputLayoutState$default(c47988uAv2, inputLayoutState, false, 2, null);
        c47988uAv2.setInputUnit(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatSearchResultReceiver));
        c47988uAv2.setInputUnitBolded(true);
        values().isConnected.setTitleText(C33070mpX.AYXKKw(C55688xof.Application.heceqZ));
        C53530wnI c53530wnI = values().isConnected;
        java.util.List<TradeMenuItemBean> listKWHzl = OLrzqt().KWHzl();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c53530wnI.setTypeMenu(listKWHzl, childFragmentManager, new Function1() { // from class: o.whH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53212whI.AEQbTJ(this.OLrzqt, (TradeMenuItemBean) obj);
            }
        });
        values().values.setText(C33574myy.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.DGUQLI, C56423yEv.EZpvd(C56390yDp.OLrzqt("termRsi", C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)))), new java.lang.String[]{C33070mpX.AYXKKw(C55688xof.Application.OTwTPd)}, 0, null, false, new Function1() { // from class: o.whJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53212whI.KWHzl(this.copydefault, (java.util.List) obj);
            }
        }, 14, null));
        C47988uAv c47988uAv3 = values().fetchVPNInfo;
        DcaTriggerParam dcaTriggerParamEZpvd2 = OLrzqt().EZpvd();
        C47988uAv.setInputContent$default(c47988uAv3, dcaTriggerParamEZpvd2 != null ? dcaTriggerParamEZpvd2.getThold() : null, false, false, 6, null);
        values().fetchVPNInfo.setMaxDecimal(0);
        android.widget.TextView textView = values().gEmmrt;
        int i = C55688xof.Application.DGOPHZDGOPHZ;
        DcaTriggerParam dcaTriggerParamEZpvd3 = OLrzqt().EZpvd();
        if (dcaTriggerParamEZpvd3 == null || (tholdWarning = dcaTriggerParamEZpvd3.getTholdWarning()) == null) {
            tholdWarning = "";
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("tholdNum", tholdWarning))));
        android.widget.TextView textView2 = values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        DcaTriggerParam dcaTriggerParamEZpvd4 = OLrzqt().EZpvd();
        java.lang.String thold = dcaTriggerParamEZpvd4 != null ? dcaTriggerParamEZpvd4.getThold() : null;
        DcaTriggerParam dcaTriggerParamEZpvd5 = OLrzqt().EZpvd();
        textView2.setVisibility(C33129mqd.copydefault(thold, dcaTriggerParamEZpvd5 != null ? dcaTriggerParamEZpvd5.getTholdWarning() : null) ? 0 : 8);
        values().EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.whF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53212whI.AEQbTJ(this.AEQbTJ, view);
            }
        });
        values().AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.whL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53212whI.EZpvd(this.EZpvd, view);
            }
        });
        values().fetchVPNInfo.setOnTextChangeCallback(this.KWHzl);
        OLrzqt().AEQbTJ(values().fetchVPNInfo.AkhnZx(), fJNWhG());
    }

    public static final Unit gEmmrt(C53212whI c53212whI) {
        android.widget.TextView textView = c53212whI.values().djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53212whI c53212whI, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        DcaTriggerParam dcaTriggerParamEZpvd = c53212whI.OLrzqt().EZpvd();
        if (dcaTriggerParamEZpvd != null) {
            java.lang.Object data = tradeMenuItemBean.getData();
            Intrinsics.copydefault(data, "");
            dcaTriggerParamEZpvd.setTimeframe((java.lang.String) data);
        }
        c53212whI.OLrzqt().AEQbTJ(c53212whI.values().fetchVPNInfo.AkhnZx(), c53212whI.fJNWhG());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53212whI c53212whI, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(c53212whI.getContext(), C52761wXj.LoaderManager.ODXsMY));
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C53212whI c53212whI, android.view.View view) {
        c53212whI.copydefault = !c53212whI.copydefault;
        c53212whI.values().values.setMaxLines(c53212whI.copydefault ? Integer.MAX_VALUE : 2);
        c53212whI.values().EZpvd.setText(C33070mpX.AYXKKw(c53212whI.copydefault ? C55688xof.Application.getNavigationItemCount : C55688xof.Application.getDisplayOptions));
    }

    public static final void EZpvd(C53212whI c53212whI, android.view.View view) {
        android.content.Context context = c53212whI.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(c53212whI.getString(C55688xof.Application.DNMMPQ));
            java.lang.String string = c53212whI.getString(C55688xof.Application.QWSkGZ);
            Intrinsics.checkNotNullExpressionValue(string, "");
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.whN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C53212whI.copydefault(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void ejfBZ() {
        C56111xwe<RsiTrigger> c56111xweAEQbTJ = OLrzqt().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweAEQbTJ.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.whO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53212whI.KWHzl(this.copydefault, (RsiTrigger) obj);
            }
        }));
    }

    public static final Unit KWHzl(C53212whI c53212whI, RsiTrigger rsiTrigger) {
        Intrinsics.checkNotNullParameter(rsiTrigger, "");
        c53212whI.values().fIwbmz.setText(rsiTrigger.getTriggerNum());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53212whI c53212whI, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        android.widget.TextView textView = c53212whI.values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        java.lang.String strAkhnZx = c47988uAv.AkhnZx();
        DcaTriggerParam dcaTriggerParamEZpvd = c53212whI.OLrzqt().EZpvd();
        textView.setVisibility(C33129mqd.copydefault(strAkhnZx, dcaTriggerParamEZpvd != null ? dcaTriggerParamEZpvd.getTholdWarning() : null) ? 0 : 8);
        c53212whI.OLrzqt().AEQbTJ(c47988uAv.AkhnZx(), c53212whI.fJNWhG());
        c53212whI.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.whI$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53212whI KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53212whI c53212whI) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c53212whI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.isConnected();
            }
        }
    }

    /* JADX INFO: renamed from: o.whI$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C53212whI KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53212whI c53212whI) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = c53212whI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (C53212whI.EZpvd(this.KWHzl).fetchVPNInfo.hDKMBd() && C53212whI.EZpvd(this.KWHzl).fetchVPNInfo.KWHzl()) {
                    DcaTriggerParam dcaTriggerParamEZpvd = this.KWHzl.OLrzqt().EZpvd();
                    if (dcaTriggerParamEZpvd != null) {
                        dcaTriggerParamEZpvd.setThold(C53212whI.EZpvd(this.KWHzl).fetchVPNInfo.AkhnZx());
                    }
                    this.KWHzl.fIwbmz().copydefault().setValue(this.KWHzl.OLrzqt().EZpvd());
                    this.KWHzl.isConnected();
                }
            }
        }
    }

    private final void copydefault() {
        java.lang.String strAkhnZx = values().fetchVPNInfo.AkhnZx();
        if (C33129mqd.AEQbTJ(strAkhnZx, 100)) {
            values().fetchVPNInfo.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.QSLkRj, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", "100"))));
        } else if (C33129mqd.gEmmrt(strAkhnZx, 1)) {
            values().fetchVPNInfo.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.QwvEab, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.hCLrkq)), C56390yDp.OLrzqt("minValue", "1"))));
        } else {
            values().fetchVPNInfo.copydefault();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.OTwTPd));
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(true);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new StateListAnimator(c52794wYpCopydefault2, 1000L, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        values().fetchVPNInfo.setOnTextChangeCallback(null);
        super.onDestroyView();
    }
}
