package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.presenter.GridTpSlPresenter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wum, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC53931wum extends AbstractActivityC48163uHh<uTF, GridTpSlPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm OLrzqt;
    public final boolean KWHzl = true;
    public final InterfaceC54581xNr AYXKKw = C54589xNz.EZpvd.OLrzqt();
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wux
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC53931wum.AYXKKw(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wuk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC53931wum.AEQbTJ(this.KWHzl);
        }
    });

    /* JADX INFO: renamed from: o.wum$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.siEkQe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ GridTpSlPresenter OLrzqt(ActivityC53931wum activityC53931wum) {
        return (GridTpSlPresenter) activityC53931wum.gHZMYf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uTF copydefault(ActivityC53931wum activityC53931wum) {
        return (uTF) activityC53931wum.sSMYrx();
    }

    public ActivityC53931wum() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.GridStartConditionModifyActivity$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.GridStartConditionModifyActivity$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.GridStartConditionModifyActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        });
    }

    /* JADX INFO: renamed from: o.wum$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wum.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull android.content.Context context, @NotNull TacticsData tacticsData) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC53931wum.class);
            intent.putExtra("bot_order_data", tacticsData);
            context.startActivity(intent);
        }
    }

    private final C55915xsu copydefault() {
        return (C55915xsu) this.OLrzqt.getValue();
    }

    private final TacticsData OLrzqt() {
        return (TacticsData) this.AhwBna.getValue();
    }

    public static final TacticsData AYXKKw(ActivityC53931wum activityC53931wum) {
        android.os.Bundle extras;
        android.content.Intent intent = activityC53931wum.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (TacticsData) extras.getParcelable("bot_order_data");
    }

    private final BizInstrument EZpvd() {
        return (BizInstrument) this.AEQbTJ.getValue();
    }

    public static final BizInstrument AEQbTJ(ActivityC53931wum activityC53931wum) {
        InterfaceC54581xNr interfaceC54581xNr = activityC53931wum.AYXKKw;
        if (interfaceC54581xNr == null) {
            return null;
        }
        TacticsData tacticsDataOLrzqt = activityC53931wum.OLrzqt();
        java.lang.String instType = tacticsDataOLrzqt != null ? tacticsDataOLrzqt.getInstType() : null;
        if (instType == null) {
            instType = "";
        }
        TacticsData tacticsDataOLrzqt2 = activityC53931wum.OLrzqt();
        return InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNr, instType, tacticsDataOLrzqt2 != null ? tacticsDataOLrzqt2.getInstId() : null, null, null, 12, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((GridTpSlPresenter) gHZMYf()).KWHzl(OLrzqt());
        djBIcL();
        KWHzl();
        AEQbTJ();
        gEmmrt();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        ((uTF) sSMYrx()).OLrzqt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton));
        C53420wlE c53420wlE = ((uTF) sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c53420wlE, "");
        c53420wlE.setVisibility(8);
        C53570wnw c53570wnw = ((uTF) sSMYrx()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c53570wnw, "");
        c53570wnw.setVisibility(8);
        C53420wlE c53420wlE2 = ((uTF) sSMYrx()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c53420wlE2, "");
        c53420wlE2.setVisibility(8);
        C53567wnt c53567wnt = ((uTF) sSMYrx()).AEQbTJ;
        final java.lang.String strFARcdN = ((GridTpSlPresenter) gHZMYf()).fARcdN();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActionBar);
        int iIsConnected = ((GridTpSlPresenter) gHZMYf()).isConnected();
        c53567wnt.copydefault(strAYXKKw, strFARcdN, "", java.lang.Integer.valueOf(iIsConnected), ((GridTpSlPresenter) gHZMYf()).iwGUEr());
        c53567wnt.AEQbTJ(new yHO() { // from class: o.wuy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC53931wum.OLrzqt(this.KWHzl, strFARcdN, (C47988uAv) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetContent);
        java.lang.String strDjBIcL = ((GridTpSlPresenter) gHZMYf()).djBIcL();
        java.lang.String strAYXKKw3 = ((GridTpSlPresenter) gHZMYf()).AYXKKw();
        int iAhwBna = ((GridTpSlPresenter) gHZMYf()).AhwBna();
        c53567wnt.KWHzl(strAYXKKw2, strDjBIcL, strAYXKKw3, java.lang.Integer.valueOf(iAhwBna), ((GridTpSlPresenter) gHZMYf()).ejfBZ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Object OLrzqt(ActivityC53931wum activityC53931wum, java.lang.String str, C47988uAv c47988uAv, java.lang.String str2, boolean z) {
        java.lang.String strKWHzl = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        pUU.EZpvd(activityC53931wum.getTAG(), "startTriggerPrice: " + str2 + " " + str);
        if (str2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            strKWHzl = C56033xvF.KWHzl(str2, activityC53931wum.EZpvd());
        }
        ((GridTpSlPresenter) activityC53931wum.gHZMYf()).copydefault(strKWHzl);
        return ((GridTpSlPresenter) activityC53931wum.gHZMYf()).AEQbTJ(strKWHzl, z).getSecond();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        ((GridTpSlPresenter) gHZMYf()).QKVWgx();
        AdvancedTriggerSign advancedTriggerSignDbNXlk = ((GridTpSlPresenter) gHZMYf()).DbNXlk();
        if (Intrinsics.EZpvd((java.lang.Object) (advancedTriggerSignDbNXlk != null ? advancedTriggerSignDbNXlk.getTriggerStrategy() : null), (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            ((uTF) sSMYrx()).AEQbTJ.setFirstContent(((GridTpSlPresenter) gHZMYf()).getFieldNames());
            ((uTF) sSMYrx()).AEQbTJ.setSecondContent(((GridTpSlPresenter) gHZMYf()).AuCTel());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        C52794wYp c52794wYp = ((uTF) sSMYrx()).EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        ((GridTpSlPresenter) gHZMYf()).AkhnZx().observe(this, new TaskDescription(new Function1() { // from class: o.wup
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53931wum.AEQbTJ(this.EZpvd, (ResponseData) obj);
            }
        }));
        ((GridTpSlPresenter) gHZMYf()).getAggregateLoadingLiveData().observe(this, new TaskDescription(new Function1() { // from class: o.wuq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53931wum.KWHzl(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        ((GridTpSlPresenter) gHZMYf()).getAggregateErrorLiveData().observe(this, new TaskDescription(new Function1() { // from class: o.wur
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53931wum.OLrzqt(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        ((GridTpSlPresenter) gHZMYf()).valueOf().observe(this, new TaskDescription(new Function1() { // from class: o.wuw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC53931wum.KWHzl(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(final ActivityC53931wum activityC53931wum, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List list = (java.util.List) responseData.getData();
        C56157xxX c56157xxX = list != null ? (C56157xxX) CollectionsKt___CollectionsKt.firstOrNull(list) : null;
        final java.lang.String strOLrzqt = c56157xxX != null ? c56157xxX.OLrzqt() : null;
        final java.lang.String strCopydefault = c56157xxX != null ? c56157xxX.copydefault() : null;
        if (responseData.getCode() == 55153 && strOLrzqt != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt) && strCopydefault != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault)) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(C35334ntP.KWHzl(activityC53931wum));
            viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.dHAKvv);
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C55688xof.Application.RatingCompat1, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strOLrzqt), C56390yDp.OLrzqt("ccy", strCopydefault))));
            viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.hrNTAI, new View.OnClickListener() { // from class: o.wus
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC53931wum.EZpvd(strOLrzqt, activityC53931wum, strCopydefault, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.DjWNei, new View.OnClickListener() { // from class: o.wut
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC53931wum.AEQbTJ(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        } else {
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onMultiWindowModeChanged, 0, 1, (java.lang.Object) null);
            activityC53931wum.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void EZpvd(java.lang.String str, ActivityC53931wum activityC53931wum, java.lang.String str2, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (C33129mqd.AEQbTJ(str, activityC53931wum.copydefault().AhwBna().getValue())) {
            activityC53931wum.OLrzqt(str2);
        } else {
            ((GridTpSlPresenter) activityC53931wum.gHZMYf()).EZpvd(str);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC53931wum activityC53931wum, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) ((GridTpSlPresenter) activityC53931wum.gHZMYf()).fetchVPNInfo().bB_())) {
            if (Intrinsics.EZpvd(pair.second, java.lang.Boolean.TRUE)) {
                activityC53931wum.showLoading();
            } else {
                activityC53931wum.dismissLoading();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wum$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC53931wum copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC53931wum activityC53931wum) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = activityC53931wum;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (ActivityC53931wum.copydefault(this.copydefault).AEQbTJ.OLrzqt()) {
                    ActivityC53931wum.OLrzqt(this.copydefault).EZpvd();
                    if (ActivityC53931wum.OLrzqt(this.copydefault).values()) {
                        GridTpSlPresenter.adjustCondition$default(ActivityC53931wum.OLrzqt(this.copydefault), null, 1, null);
                    } else {
                        this.copydefault.finish();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(ActivityC53931wum activityC53931wum, androidx.core.util.Pair pair) {
        java.lang.String message;
        Intrinsics.copydefault(pair);
        java.lang.String str = (java.lang.String) pair.first;
        java.lang.Exception exc = (java.lang.Exception) pair.second;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((GridTpSlPresenter) activityC53931wum.gHZMYf()).fetchVPNInfo().bB_())) {
            BizApiException bizApiException = exc instanceof BizApiException ? (BizApiException) exc : null;
            if (!Intrinsics.EZpvd((java.lang.Object) (bizApiException != null ? bizApiException.getCode() : null), (java.lang.Object) "55153") && (message = exc.getMessage()) != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC53931wum activityC53931wum, java.lang.Boolean bool) {
        ((uTF) activityC53931wum.sSMYrx()).EZpvd.setEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(C35334ntP.KWHzl(this));
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.dHAKvv);
        viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.setHandler);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.getDrawerArrowDrawable, new View.OnClickListener() { // from class: o.wuo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53931wum.EZpvd(this.AEQbTJ, str, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C48033uCm.Fragment.DjWNei, new View.OnClickListener() { // from class: o.wun
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC53931wum.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ActivityC53931wum activityC53931wum, java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
        InterfaceC54581xNr interfaceC54581xNr = activityC53931wum.AYXKKw;
        interfaceC49497upf.OLrzqt((FragmentActivity) activityC53931wum, new CurrencyModel(C33129mqd.AhwBna((interfaceC54581xNr == null || (tradeCoinInfoAhwBna = interfaceC54581xNr.AhwBna(str)) == null) ? null : tradeCoinInfoAhwBna.getId()), str), true);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        TacticsData tacticsDataOLrzqt = OLrzqt();
        if (tacticsDataOLrzqt != null) {
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) tacticsDataOLrzqt.getOrderType(), (java.lang.Object) "grid");
            copydefault().EZpvd(tacticsDataOLrzqt.getOrderType(), (64 & 2) != 0 ? "cash" : zEZpvd ? "cash" : "cross", (64 & 4) != 0 ? "" : zEZpvd ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : zEZpvd ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : EZpvd(), (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? tacticsDataOLrzqt.getTradeQuoteCcy() : null);
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        copydefault().AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((GridTpSlPresenter) gHZMYf()).RJOkX();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
