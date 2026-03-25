package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeuilib.utils.E2EUtils;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.unify_trade.biz.ArbitrageInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DeriConfigData;
import com.okinc.unify_trade.biz.SpotInstrument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C54085wxh;
import o.C55688xof;
import o.InterfaceC43294rma;
import o.InterfaceC49436uoX;
import o.InterfaceC49508upq;
import o.oKA;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vwF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51923vwF extends android.widget.LinearLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public InterfaceC58217yxC AEQbTJ;
    public InterfaceC58217yxC AYXKKw;
    public Function0<Unit> EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC50868vcK copydefault;
    public C51787vtc djBIcL;

    /* JADX INFO: renamed from: o.vwF$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51923vwF(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51923vwF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setKlineControl(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:86) call: o.vwF.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51923vwF(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51923vwF(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vwL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51923vwF.KWHzl(context);
            }
        });
        AEQbTJ();
        OLrzqt();
        KWHzl();
        DbNXlk();
    }

    public static final InterfaceC56387yDm KWHzl(android.content.Context context) {
        final AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
        final Function0 function0 = null;
        if (appCompatActivityCopydefault == null) {
            return null;
        }
        return new ViewModelLazy(C56524yIo.AEQbTJ(BotTradePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.view.BotTradeHeader$botP_delegate$lambda$0$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = appCompatActivityCopydefault.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.view.BotTradeHeader$botP_delegate$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = appCompatActivityCopydefault.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.view.BotTradeHeader$botP_delegate$lambda$0$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = appCompatActivityCopydefault.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    private final InterfaceC56387yDm<BotTradePresenter> fetchVPNInfo() {
        return (InterfaceC56387yDm) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BizInstrument values() {
        BotTradePresenter value;
        xLY xlyFetchVPNInfo;
        InterfaceC56387yDm<BotTradePresenter> interfaceC56387yDmFetchVPNInfo = fetchVPNInfo();
        if (interfaceC56387yDmFetchVPNInfo == null || (value = interfaceC56387yDmFetchVPNInfo.getValue()) == null || (xlyFetchVPNInfo = value.fetchVPNInfo()) == null) {
            return null;
        }
        return xlyFetchVPNInfo.EZpvd();
    }

    public final void AEQbTJ() {
        setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.EZpvd));
        wPQ.OLrzqt(this);
        setGravity(16);
        this.copydefault = (AbstractC50868vcK) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.uLLnq, this, true);
        isConnected();
    }

    public final void OLrzqt() {
        this.djBIcL = new C51787vtc();
        AYXKKw();
    }

    public final void AYXKKw() {
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String strOLrzqt = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
        if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "arbitrage")) {
            valueOf();
        } else if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "smart_arbitrage")) {
            AhwBna();
        }
        AkhnZx();
    }

    public final void isConnected() {
        AbstractC50868vcK abstractC50868vcK = this.copydefault;
        if (abstractC50868vcK == null) {
            Intrinsics.gEmmrt("");
            abstractC50868vcK = null;
        }
        AppCompatImageView appCompatImageView = abstractC50868vcK.AEQbTJ;
        InterfaceC49504upm interfaceC49504upm = (InterfaceC49504upm) C43251rlk.OLrzqt(InterfaceC49504upm.class);
        appCompatImageView.setSelected((interfaceC49504upm == null || interfaceC49504upm.KWHzl()) ? false : true);
    }

    public final void valueOf() {
        java.lang.Boolean boolValueOf;
        java.lang.String str;
        java.lang.Boolean boolValueOf2;
        C51923vwF c51923vwF;
        java.lang.String str2;
        xOU xouWlaJM;
        java.lang.String instId;
        java.lang.String instType;
        java.lang.String strOLrzqt;
        xOU xouWlaJM2;
        java.lang.String instId2;
        java.lang.String instType2;
        java.lang.String strOLrzqt2;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        ArbitrageInfo arbitrageInfoCopydefault = c56036xvI.copydefault();
        java.lang.String side = arbitrageInfoCopydefault.getSide();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        AbstractC50868vcK abstractC50868vcK = null;
        BizInstrument bizInstrumentCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(arbitrageInfoCopydefault.getInstType(), arbitrageInfoCopydefault.getInstId(), arbitrageInfoCopydefault.getUly(), arbitrageInfoCopydefault.getAlias()) : null;
        java.lang.String titleByIdAndType$default = (bizInstrumentCopydefault == null || (strOLrzqt2 = C54799xVt.AEQbTJ.OLrzqt(bizInstrumentCopydefault)) == null) ? C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, arbitrageInfoCopydefault.getInstId(), arbitrageInfoCopydefault.getInstType(), false, false, 12, null) : strOLrzqt2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xouWlaJM2 = interfaceC54581xNrOLrzqt.wlaJM()) == null) {
            boolValueOf = null;
        } else {
            if (bizInstrumentCopydefault == null || (instId2 = bizInstrumentCopydefault.getInstId()) == null) {
                instId2 = "";
            }
            if (bizInstrumentCopydefault == null || (instType2 = bizInstrumentCopydefault.getInstType()) == null) {
                instType2 = "";
            }
            boolValueOf = java.lang.Boolean.valueOf(xouWlaJM2.AhwBna(instId2, instType2));
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (Intrinsics.EZpvd(boolValueOf, bool)) {
            Intrinsics.copydefault(bizInstrumentCopydefault, "");
            str = ((SpotInstrument) bizInstrumentCopydefault).getLevel() + "x";
        } else {
            str = "";
        }
        ArbitrageInfo arbitrageInfoAEQbTJ = c56036xvI.AEQbTJ();
        java.lang.String side2 = arbitrageInfoAEQbTJ.getSide();
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault2 = interfaceC54581xNrCopydefault2 != null ? interfaceC54581xNrCopydefault2.copydefault(arbitrageInfoAEQbTJ.getInstType(), arbitrageInfoAEQbTJ.getInstId(), arbitrageInfoAEQbTJ.getUly(), arbitrageInfoAEQbTJ.getAlias()) : null;
        java.lang.String titleByIdAndType$default2 = (bizInstrumentCopydefault2 == null || (strOLrzqt = C54799xVt.AEQbTJ.OLrzqt(bizInstrumentCopydefault2)) == null) ? C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, arbitrageInfoAEQbTJ.getInstId(), arbitrageInfoAEQbTJ.getInstType(), false, false, 12, null) : strOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (xouWlaJM = interfaceC54581xNrOLrzqt2.wlaJM()) == null) {
            boolValueOf2 = null;
        } else {
            if (bizInstrumentCopydefault2 == null || (instId = bizInstrumentCopydefault2.getInstId()) == null) {
                instId = "";
            }
            if (bizInstrumentCopydefault2 == null || (instType = bizInstrumentCopydefault2.getInstType()) == null) {
                instType = "";
            }
            boolValueOf2 = java.lang.Boolean.valueOf(xouWlaJM.AhwBna(instId, instType));
        }
        if (Intrinsics.EZpvd(boolValueOf2, bool)) {
            Intrinsics.copydefault(bizInstrumentCopydefault2, "");
            c51923vwF = this;
            str2 = ((SpotInstrument) bizInstrumentCopydefault2).getLevel() + "x";
        } else {
            c51923vwF = this;
            str2 = "";
        }
        AbstractC50868vcK abstractC50868vcK2 = c51923vwF.copydefault;
        if (abstractC50868vcK2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50868vcK = abstractC50868vcK2;
        }
        abstractC50868vcK.OLrzqt.setTextForArbitrage(side, titleByIdAndType$default, str, side2, titleByIdAndType$default2, str2);
    }

    /* JADX INFO: renamed from: o.vwF$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51923vwF EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51923vwF c51923vwF) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c51923vwF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            xOU xouWlaJM;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                java.lang.String strOLrzqt = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
                if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "arbitrage")) {
                    this.EZpvd.copydefault();
                } else if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "dcd_bot")) {
                    this.EZpvd.djBIcL();
                } else {
                    C32866mlf.onEvent$default("DCDBot_PlaceOrder_Fullbutton_Click", (TrackChannel[]) null, Dialog.copydefault, 1, (java.lang.Object) null);
                    this.EZpvd.djBIcL();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vwF$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51923vwF EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51923vwF c51923vwF) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = c51923vwF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ((AppCompatImageView) this.AEQbTJ).setSelected(!r7.isSelected());
                Function0 function0 = this.EZpvd.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vwF$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C51923vwF AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51923vwF c51923vwF) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c51923vwF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            xOU xouWlaJM;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C51939vwV c51939vwV = (C51939vwV) this.copydefault;
                if (c51939vwV.isEnabled()) {
                    c51939vwV.setSelected(true);
                    TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.AEQbTJ("PlaceOrder_TradingPairs_Change_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), this.AEQbTJ.new Activity());
                    InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                    java.lang.String strOLrzqt = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
                    if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "arbitrage")) {
                        this.AEQbTJ.EZpvd();
                    } else if (!Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "dcd_bot")) {
                        this.AEQbTJ.gEmmrt();
                    } else {
                        C32866mlf.onEvent$default("DCDBot_PlaceOrder_Fullbutton_Click", (TrackChannel[]) null, FragmentManager.OLrzqt, 1, (java.lang.Object) null);
                        this.AEQbTJ.gEmmrt();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        java.lang.String str;
        xOU xouWlaJM;
        BizInstrument bizInstrumentValues = values();
        if (bizInstrumentValues != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            AbstractC50868vcK abstractC50868vcK = null;
            java.lang.String strOLrzqt = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
            if ((Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "smart_iceberg") || Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "twap")) && (bizInstrumentValues instanceof SpotInstrument)) {
                SpotInstrument spotInstrument = (SpotInstrument) bizInstrumentValues;
                if (C33129mqd.OLrzqt((java.lang.CharSequence) spotInstrument.getLevel())) {
                    str = spotInstrument.getLevel() + "x";
                } else {
                    str = "";
                }
            }
            AbstractC50868vcK abstractC50868vcK2 = this.copydefault;
            if (abstractC50868vcK2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50868vcK = abstractC50868vcK2;
            }
            C51939vwV c51939vwV = abstractC50868vcK.OLrzqt;
            C54799xVt c54799xVt = C54799xVt.AEQbTJ;
            c51939vwV.setText(c54799xVt.OLrzqt(bizInstrumentValues), str, bizInstrumentValues.isPreMarketPair(), Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "contract_grid") && c54799xVt.OLrzqt(bizInstrumentValues).length() < 20);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0.equals("recurring") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        if (r0.equals("smart_arbitrage") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r0.equals("signal_bot") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r0.equals("smart_portfolio") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r0.equals("ai_bot") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        setVisibility(8);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AkhnZx() {
        xOU xouWlaJM;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        AbstractC50868vcK abstractC50868vcK = null;
        java.lang.String strOLrzqt = (interfaceC54581xNrCopydefault == null || (xouWlaJM = interfaceC54581xNrCopydefault.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
        if (strOLrzqt != null) {
            switch (strOLrzqt.hashCode()) {
                case -1418042064:
                    break;
                case -1216369070:
                    break;
                case -1086683216:
                    break;
                case -557961837:
                    break;
                case 1165749981:
                    break;
                case 1780188297:
                    if (strOLrzqt.equals("arbitrage")) {
                        setVisibility(0);
                        AbstractC50868vcK abstractC50868vcK2 = this.copydefault;
                        if (abstractC50868vcK2 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC50868vcK2 = null;
                        }
                        C53536wnO c53536wnO = abstractC50868vcK2.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(c53536wnO, "");
                        c53536wnO.setVisibility(8);
                        AbstractC50868vcK abstractC50868vcK3 = this.copydefault;
                        if (abstractC50868vcK3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC50868vcK = abstractC50868vcK3;
                        }
                        AppCompatImageView appCompatImageView = abstractC50868vcK.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                        appCompatImageView.setVisibility(8);
                    }
                    break;
            }
        }
        setVisibility(0);
        AbstractC50868vcK abstractC50868vcK4 = this.copydefault;
        if (abstractC50868vcK4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50868vcK4 = null;
        }
        C53536wnO c53536wnO2 = abstractC50868vcK4.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c53536wnO2, "");
        c53536wnO2.setVisibility(0);
        AbstractC50868vcK abstractC50868vcK5 = this.copydefault;
        if (abstractC50868vcK5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50868vcK = abstractC50868vcK5;
        }
        AppCompatImageView appCompatImageView2 = abstractC50868vcK.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setVisibility(0);
    }

    public final void KWHzl() {
        AbstractC50868vcK abstractC50868vcK = this.copydefault;
        AbstractC50868vcK abstractC50868vcK2 = null;
        if (abstractC50868vcK == null) {
            Intrinsics.gEmmrt("");
            abstractC50868vcK = null;
        }
        C51939vwV c51939vwV = abstractC50868vcK.OLrzqt;
        c51939vwV.setOnClickListener(new TaskDescription(c51939vwV, 1000L, this));
        AbstractC50868vcK abstractC50868vcK3 = this.copydefault;
        if (abstractC50868vcK3 == null) {
            Intrinsics.gEmmrt("");
            abstractC50868vcK3 = null;
        }
        AppCompatImageView appCompatImageView = abstractC50868vcK3.KWHzl;
        appCompatImageView.setOnClickListener(new ActionBar(appCompatImageView, 1000L, this));
        AbstractC50868vcK abstractC50868vcK4 = this.copydefault;
        if (abstractC50868vcK4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50868vcK2 = abstractC50868vcK4;
        }
        AppCompatImageView appCompatImageView2 = abstractC50868vcK2.AEQbTJ;
        appCompatImageView2.setOnClickListener(new Application(appCompatImageView2, 500L, this));
        AbstractC58185ywX abstractC58185ywXAEQbTJ = RxBus.AEQbTJ(C48028uCh.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.vwH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51923vwF.OLrzqt(this.AEQbTJ, (C48028uCh) obj);
            }
        };
        this.AEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.vwG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C51923vwF.AEQbTJ(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: o.vwF$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            java.lang.String instType;
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("frompage", ExtJson.BRC20TYPE_TRADE, true);
            BizInstrument bizInstrumentValues = C51923vwF.this.values();
            if (bizInstrumentValues == null || (instType = bizInstrumentValues.getInstType()) == null) {
                instType = "-";
            }
            eventParamsList.put("biztype", instType, true);
        }
    }

    /* JADX INFO: renamed from: o.vwF$FragmentManager */
    public static final class FragmentManager implements Function1<EventParamsList, Unit> {
        public static final FragmentManager OLrzqt = new FragmentManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            KWHzl(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void KWHzl(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("button_type", "coin_pair", true);
        }
    }

    /* JADX INFO: renamed from: o.vwF$Dialog */
    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog copydefault = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("button_type", "k_line", true);
        }
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void DbNXlk() {
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        java.lang.Object context = getContext();
        Intrinsics.copydefault(context, "");
        tradeLiveDataAhwBna.observe((LifecycleOwner) context, new PendingIntent(new Function1() { // from class: o.vwN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51923vwF.OLrzqt(this.KWHzl, (xMJ.Application) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51923vwF c51923vwF, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strAYXKKw = application.AYXKKw();
        if (strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            return Unit.INSTANCE;
        }
        AbstractC50868vcK abstractC50868vcK = c51923vwF.copydefault;
        if (abstractC50868vcK == null) {
            Intrinsics.gEmmrt("");
            abstractC50868vcK = null;
        }
        abstractC50868vcK.EZpvd.setPrice(application.AYXKKw());
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        final BizInstrument bizInstrumentValues = values();
        if (bizInstrumentValues != null) {
            C32866mlf.KWHzl("trade_chart_click", (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.vwO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51923vwF.AEQbTJ(bizInstrumentValues, (EventParamsList) obj);
                }
            });
            MarketCoinInfo marketCoinInfo = new MarketCoinInfo(bizInstrumentValues.getInstId(), bizInstrumentValues.getInstType(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
            if (C56071xvr.gEmmrt.ejfBZ()) {
                InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), C35334ntP.KWHzl(this), DeeplinkMode.LITE.getMode() + "/trade_kline?type=" + bizInstrumentValues.getInstType() + "&id=" + bizInstrumentValues.getInstId(), null, new Function1() { // from class: o.vwS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C51923vwF.KWHzl((AbstractC43238rlX) obj);
                    }
                }, 4, null);
                return;
            }
            oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
            if (oka != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, "bot_page_trade", null, null, null, null, null, null, 2028, null);
            }
        }
    }

    public static final Unit AEQbTJ(BizInstrument bizInstrument, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("transaction", bizInstrument.getInstType(), true);
        eventParamsList.put("deal_name", bizInstrument.getInstId(), false);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String instType2;
        java.lang.String instId2;
        C56036xvI c56036xvI = C56036xvI.KWHzl;
        ArbitrageInfo arbitrageInfoCopydefault = c56036xvI.copydefault();
        ArbitrageInfo arbitrageInfoAEQbTJ = c56036xvI.AEQbTJ();
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault = interfaceC54581xNrCopydefault != null ? interfaceC54581xNrCopydefault.copydefault(arbitrageInfoCopydefault.getInstType(), arbitrageInfoCopydefault.getInstId(), arbitrageInfoCopydefault.getUly(), arbitrageInfoCopydefault.getAlias()) : null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
        BizInstrument bizInstrumentCopydefault2 = interfaceC54581xNrCopydefault2 != null ? interfaceC54581xNrCopydefault2.copydefault(arbitrageInfoAEQbTJ.getInstType(), arbitrageInfoAEQbTJ.getInstId(), arbitrageInfoAEQbTJ.getUly(), arbitrageInfoAEQbTJ.getAlias()) : null;
        MarketArbCoinInfo marketArbCoinInfo = new MarketArbCoinInfo((bizInstrumentCopydefault == null || (instId2 = bizInstrumentCopydefault.getInstId()) == null) ? "" : instId2, (bizInstrumentCopydefault == null || (instType2 = bizInstrumentCopydefault.getInstType()) == null) ? "" : instType2, arbitrageInfoCopydefault.getSide(), (bizInstrumentCopydefault2 == null || (instId = bizInstrumentCopydefault2.getInstId()) == null) ? "" : instId, (bizInstrumentCopydefault2 == null || (instType = bizInstrumentCopydefault2.getInstType()) == null) ? "" : instType, arbitrageInfoAEQbTJ.getSide(), false, false, 192, (DefaultConstructorMarker) null);
        oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
        if (oka != null) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            oKA.TaskDescription.gotoArbitrageKline$default(oka, context, marketArbCoinInfo, "bot_page_trade", null, 8, null);
        }
    }

    public final void EZpvd() {
        C54085wxh c54085wxhNewInstance$default = C54085wxh.Activity.newInstance$default(C54085wxh.Companion, null, true, 1, null);
        c54085wxhNewInstance$default.EZpvd(new Function1() { // from class: o.vwJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51923vwF.KWHzl(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        android.content.Context context = getContext();
        Intrinsics.copydefault(context, "");
        c54085wxhNewInstance$default.show(((FragmentActivity) context).getSupportFragmentManager(), C54085wxh.class.getSimpleName());
    }

    public static final Unit KWHzl(C51923vwF c51923vwF, boolean z) {
        if (!z) {
            AbstractC50868vcK abstractC50868vcK = c51923vwF.copydefault;
            if (abstractC50868vcK == null) {
                Intrinsics.gEmmrt("");
                abstractC50868vcK = null;
            }
            abstractC50868vcK.OLrzqt.setSelected(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.vwF */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.String] */
    public final void gEmmrt() {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && interfaceC54581xNrOLrzqt.sSMYrx()) {
            InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            InterfaceC49508upq interfaceC49508upq = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
            this.AYXKKw = interfaceC49508upq != null ? interfaceC49508upq.OLrzqt(new LoaderManager(objectRef, this)) : null;
            return;
        }
        ?? string = SPUtils.getString("search_navigate_type", "bizNav", "file_search_nav_type");
        objectRef.element = string;
        KWHzl((java.lang.String) string);
    }

    /* JADX INFO: renamed from: o.vwF$LoaderManager */
    public static final class LoaderManager implements InterfaceC49503upl {
        public final /* synthetic */ Ref.ObjectRef<java.lang.String> EZpvd;
        public final /* synthetic */ C51923vwF OLrzqt;

        public LoaderManager(Ref.ObjectRef<java.lang.String> objectRef, C51923vwF c51923vwF) {
            this.EZpvd = objectRef;
            this.OLrzqt = c51923vwF;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v2, types: [T, java.lang.String] */
        @Override // o.InterfaceC49503upl
        public void EZpvd(boolean z, java.util.List<? extends java.lang.Object> list, java.lang.Exception exc) {
            InterfaceC49508upq interfaceC49508upq;
            Intrinsics.checkNotNullParameter(list, "");
            if (z && (!list.isEmpty())) {
                if (Intrinsics.EZpvd((java.lang.Object) ((DeriConfigData) list.get(0)).isSetNavConfig(), (java.lang.Object) "1")) {
                    Ref.ObjectRef<java.lang.String> objectRef = this.EZpvd;
                    java.lang.String derivativesNavConfig = ((DeriConfigData) list.get(0)).getDerivativesNavConfig();
                    objectRef.element = derivativesNavConfig != null ? derivativesNavConfig : "bizNav";
                    this.OLrzqt.KWHzl(this.EZpvd.element);
                    return;
                }
                if (C33129mqd.gEmmrt(((DeriConfigData) list.get(0)).getShowConfigTimes(), 3)) {
                    InterfaceC49508upq interfaceC49508upq2 = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
                    androidx.fragment.app.Fragment navigationSelectFragment$default = interfaceC49508upq2 != null ? InterfaceC49508upq.StateListAnimator.getNavigationSelectFragment$default(interfaceC49508upq2, ((DeriConfigData) list.get(0)).getShowConfigTimes(), null, 2, null) : null;
                    if (navigationSelectFragment$default == null || (interfaceC49508upq = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class)) == null) {
                        return;
                    }
                    android.content.Context context = this.OLrzqt.getContext();
                    Intrinsics.copydefault(context, "");
                    androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    interfaceC49508upq.copydefault(navigationSelectFragment$default, supportFragmentManager);
                    return;
                }
                if (C33129mqd.copydefault((java.lang.Object) ((DeriConfigData) list.get(0)).getShowConfigTimes(), (java.lang.Object) 3)) {
                    Ref.ObjectRef<java.lang.String> objectRef2 = this.EZpvd;
                    java.lang.String derivativesNavConfig2 = ((DeriConfigData) list.get(0)).getDerivativesNavConfig();
                    objectRef2.element = derivativesNavConfig2 != null ? derivativesNavConfig2 : "bizNav";
                    this.OLrzqt.KWHzl(this.EZpvd.element);
                    return;
                }
                return;
            }
            this.EZpvd.element = SPUtils.getString("search_navigate_type", "bizNav", "file_search_nav_type");
            this.OLrzqt.KWHzl(this.EZpvd.element);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        InterfaceC49508upq interfaceC49508upq;
        androidx.fragment.app.Fragment fragmentAEQbTJ = AEQbTJ(str);
        if (fragmentAEQbTJ != null && (interfaceC49508upq = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class)) != null) {
            android.content.Context context = getContext();
            Intrinsics.copydefault(context, "");
            androidx.fragment.app.FragmentManager supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC49508upq.EZpvd(fragmentAEQbTJ, supportFragmentManager, new Function1() { // from class: o.vwK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51923vwF.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
    }

    public static final Unit OLrzqt(C51923vwF c51923vwF, boolean z) {
        if (!z) {
            AbstractC50868vcK abstractC50868vcK = c51923vwF.copydefault;
            if (abstractC50868vcK == null) {
                Intrinsics.gEmmrt("");
                abstractC50868vcK = null;
            }
            abstractC50868vcK.OLrzqt.setSelected(false);
        }
        return Unit.INSTANCE;
    }

    public final androidx.fragment.app.Fragment AEQbTJ(java.lang.String str) {
        java.lang.String strGEmmrt;
        InterfaceC49508upq interfaceC49508upq;
        java.lang.String instId;
        xOU xouWlaJM;
        java.lang.String instId2;
        java.lang.String instType;
        final java.lang.String str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "coinNav") ? "coin" : "biz";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_navigate_page_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.vwE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51923vwF.OLrzqt(str2, (EventParamsList) obj);
            }
        });
        androidx.fragment.app.Fragment searchFragment$default = null;
        C51787vtc c51787vtc = null;
        searchFragment$default = null;
        C51787vtc c51787vtc2 = null;
        searchFragment$default = null;
        if (values() == null) {
            InterfaceC49508upq interfaceC49508upq2 = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
            if (interfaceC49508upq2 != null) {
                C51787vtc c51787vtc3 = this.djBIcL;
                if (c51787vtc3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c51787vtc = c51787vtc3;
                }
                searchFragment$default = InterfaceC49508upq.StateListAnimator.getSearchFragment$default(interfaceC49508upq2, "", "", str, "trade_page", c51787vtc.AEQbTJ(), null, null, 96, null);
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) {
                strGEmmrt = null;
            } else {
                BizInstrument bizInstrumentValues = values();
                if (bizInstrumentValues == null || (instId2 = bizInstrumentValues.getInstId()) == null) {
                    instId2 = "";
                }
                BizInstrument bizInstrumentValues2 = values();
                if (bizInstrumentValues2 == null || (instType = bizInstrumentValues2.getInstType()) == null) {
                    instType = "";
                }
                strGEmmrt = xouWlaJM.gEmmrt(instId2, instType);
            }
            if (strGEmmrt != null && (interfaceC49508upq = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class)) != null) {
                BizInstrument bizInstrumentValues3 = values();
                java.lang.String str3 = (bizInstrumentValues3 == null || (instId = bizInstrumentValues3.getInstId()) == null) ? "" : instId;
                C51787vtc c51787vtc4 = this.djBIcL;
                if (c51787vtc4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c51787vtc2 = c51787vtc4;
                }
                java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> mapAEQbTJ = c51787vtc2.AEQbTJ();
                BizInstrument bizInstrumentValues4 = values();
                searchFragment$default = InterfaceC49508upq.StateListAnimator.getSearchFragment$default(interfaceC49508upq, str3, strGEmmrt, str, "trade_page", mapAEQbTJ, null, (bizInstrumentValues4 == null || !bizInstrumentValues4.isPreMarketPair()) ? strGEmmrt : "pre_market", 32, null);
            }
        }
        InterfaceC49508upq interfaceC49508upq3 = (InterfaceC49508upq) C43251rlk.OLrzqt(InterfaceC49508upq.class);
        if (interfaceC49508upq3 != null) {
            interfaceC49508upq3.KWHzl(new Function2() { // from class: o.vwM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C51923vwF.copydefault(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2);
                }
            });
        }
        return searchFragment$default;
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", str, true);
        eventParamsList.put("from", "page_trade", false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51923vwF c51923vwF, java.lang.String str, java.lang.String str2) {
        xOU xouWlaJM;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object context = c51923vwF.getContext();
        java.lang.String strOLrzqt = null;
        InterfaceC49436uoX interfaceC49436uoX = context instanceof InterfaceC49436uoX ? (InterfaceC49436uoX) context : null;
        if (interfaceC49436uoX != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) != null) {
                strOLrzqt = xouWlaJM.OLrzqt();
            }
            InterfaceC49436uoX.TaskDescription.switchCoinCall$default(interfaceC49436uoX, "", strOLrzqt, str, str2, false, false, 48, null);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC58217yxC interfaceC58217yxC = this.AYXKKw;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AEQbTJ;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    /* JADX INFO: renamed from: o.vwF$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vwF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public static final Unit OLrzqt(C51923vwF c51923vwF, C48028uCh c48028uCh) {
        if (c51923vwF.getVisibility() == 0) {
            AbstractC50868vcK abstractC50868vcK = c51923vwF.copydefault;
            AbstractC50868vcK abstractC50868vcK2 = null;
            if (abstractC50868vcK == null) {
                Intrinsics.gEmmrt("");
                abstractC50868vcK = null;
            }
            AppCompatImageView appCompatImageView = abstractC50868vcK.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            if (appCompatImageView.getVisibility() == 0) {
                E2EUtils e2EUtils = E2EUtils.OLrzqt;
                mAE mae = new mAE(c51923vwF.getContext(), C33070mpX.AYXKKw(C55688xof.Application.onPlaybackStateChanged));
                E2EUtils.FeatureFlag featureFlag = E2EUtils.FeatureFlag.BotCommon;
                AbstractC50868vcK abstractC50868vcK3 = c51923vwF.copydefault;
                if (abstractC50868vcK3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC50868vcK2 = abstractC50868vcK3;
                }
                AppCompatImageView appCompatImageView2 = abstractC50868vcK2.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                e2EUtils.EZpvd(mae, featureFlag, appCompatImageView2, AnchorPopupWindow.Style.Gray, AnchorPopupWindow.HorizontalPosition.RIGHT, false);
            }
        }
        c51923vwF.isConnected();
        return Unit.INSTANCE;
    }
}
