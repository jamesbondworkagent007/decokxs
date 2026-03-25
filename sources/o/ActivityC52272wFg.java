package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.biz.TacticsType;
import com.okinc.components.track.TrackChannel;
import com.okinc.tradingbot.api.constants.TacticsDetailsActionEnum;
import com.okinc.tradingbot.impl.share.BotPreShareBottomSheet;
import com.okinc.tradingbot.impl.strategy.bean.BotDetailsType;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailsActivity$initListener$4;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailsActivity$subscribeOnUIChange$2$1;
import com.okinc.tradingbot.impl.strategy.view.helper.BotOperatorButtonDisposer;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotLeadProfitProfitOrderDetails;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import com.okinc.unify_trade.bot.data.TacticsListLabelLeverPrincipalData;
import com.okinc.unify_trade.bot.data.TacticsListLabelUiData;
import com.okinc.unify_trade.bot.data.TacticsListLabelVoucherData;
import com.okinc.unify_trade.bot.market_place.userpage.BotLeadStrateShowData;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import com.okinc.unify_trade.trade.biz.BizInfoConfig;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C53660wpg;
import o.C53698wqR;
import o.C55284xgz;
import o.C55688xof;
import o.InterfaceC52662wTs;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wFg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC52272wFg extends AbstractActivityC52226wDo<AbstractC48313uMw, TacticsDetailPresenter> implements InterfaceC52662wTs, uHJ {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public static final android.os.Bundle valueOf = new android.os.Bundle();
    public final InterfaceC56387yDm AYXKKw;
    public boolean AkhnZx;
    public boolean AuCTel;
    public boolean DbNXlk;
    public java.lang.Boolean fIwbmz;
    public java.lang.String fetchVPNInfo;
    public C47976uAj<BotDetailsType> hDKMBd;
    public Function0<Unit> isConnected;
    public TabLayoutMediator iwGUEr;
    public java.lang.String values;
    public boolean ejfBZ = true;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wFk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC52272wFg.AhwBna(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.wFl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC52272wFg.isConnected();
        }
    });
    public final java.util.ArrayList<BotDetailsType> AhwBna = new java.util.ArrayList<>();
    public java.lang.String fJNWhG = "";

    /* JADX INFO: renamed from: o.wFg$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public static final boolean AEQbTJ(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.fetchVPNInfo;
    }

    @Override // o.InterfaceC52662wTs
    public void DbNXlk() {
    }

    @Override // o.InterfaceC52662wTs
    public void fARcdN() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48313uMw KWHzl(ActivityC52272wFg activityC52272wFg) {
        return (AbstractC48313uMw) activityC52272wFg.sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ TacticsDetailPresenter OLrzqt(ActivityC52272wFg activityC52272wFg) {
        return (TacticsDetailPresenter) activityC52272wFg.gHZMYf();
    }

    @Override // o.InterfaceC52662wTs
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        InterfaceC52662wTs.TaskDescription.EZpvd(this, str, str2);
    }

    @Override // o.InterfaceC52662wTs
    public void bz_() {
        InterfaceC52662wTs.TaskDescription.KWHzl(this);
    }

    @Override // o.InterfaceC52662wTs
    public void gEmmrt() {
        InterfaceC52662wTs.TaskDescription.copydefault(this);
    }

    public ActivityC52272wFg() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailsActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailsActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailsActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.wFg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wFg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.os.Bundle OLrzqt() {
            return ActivityC52272wFg.valueOf;
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.Integer num, java.lang.String str5, TacticsData tacticsData, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC52272wFg.class);
            intent.putExtra("id", str);
            intent.putExtra("bot_ord_type", str2);
            intent.putExtra("backtest", z);
            intent.putExtra("delay", z2);
            intent.putExtra("tabIndex", str3);
            intent.putExtra("detailAction", str4);
            intent.putExtra(AppsFlyerProperties.CHANNEL, str5);
            OLrzqt().putParcelable("data", tacticsData);
            if (num == null) {
                intent.addFlags(603979776);
            } else {
                intent.addFlags(num.intValue());
            }
            C49950uyH.startTradeActivity$default(context, intent, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: o.wFg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC52272wFg EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC52272wFg activityC52272wFg, java.lang.String str) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = activityC52272wFg;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActivityC52272wFg.OLrzqt(this.EZpvd).gHZMYf();
                java.lang.String str = this.KWHzl;
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "grid") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_grid")) {
                    C55867xrz.KWHzl.KWHzl(this.KWHzl, "share");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wFg$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ BotLeadProfitProfitOrderDetails OLrzqt;
        public final /* synthetic */ ActivityC52272wFg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC52272wFg activityC52272wFg, BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = activityC52272wFg;
            this.OLrzqt = botLeadProfitProfitOrderDetails;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.KWHzl(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.wFg$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ActivityC52272wFg AEQbTJ;
        public final /* synthetic */ BotLeadProfitProfitOrderDetails EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC52272wFg activityC52272wFg, BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC52272wFg;
            this.EZpvd = botLeadProfitProfitOrderDetails;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.wFg$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ TacticsListLabelVoucherData AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C55251xgS KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC52272wFg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC52272wFg activityC52272wFg, C55251xgS c55251xgS, TacticsListLabelVoucherData tacticsListLabelVoucherData) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = activityC52272wFg;
            this.KWHzl = c55251xgS;
            this.AEQbTJ = tacticsListLabelVoucherData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AbstractC54531xLw abstractC54531xLwOLrzqt;
            BizInstrument bizInstrumentValueOf;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                StrategyDetailsResponse strategyDetailsResponseAhwBna = ActivityC52272wFg.OLrzqt(this.copydefault).AhwBna();
                C52659wTp c52659wTp = C52659wTp.copydefault;
                android.app.Activity activityKWHzl = C35334ntP.KWHzl(this.KWHzl);
                TacticsVoucherInfo tacticsVoucherInfoEZpvd = this.AEQbTJ.EZpvd();
                TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ(strategyDetailsResponseAhwBna.getAlgoOrdType());
                InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
                c52659wTp.AEQbTJ(activityKWHzl, tacticsVoucherInfoEZpvd, false, tacticsTypeAEQbTJ, (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(strategyDetailsResponseAhwBna.getInstType())) == null || (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(strategyDetailsResponseAhwBna.getInstId())) == null) ? false : Intrinsics.EZpvd(bizInstrumentValueOf.isNegativeContract(), java.lang.Boolean.TRUE));
            }
        }
    }

    /* JADX INFO: renamed from: o.wFg$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ TacticsListLabelUiData EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC52272wFg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, TacticsListLabelUiData tacticsListLabelUiData, ActivityC52272wFg activityC52272wFg) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = tacticsListLabelUiData;
            this.copydefault = activityC52272wFg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C51972vxB c51972vxB = new C51972vxB(((TacticsListLabelLeverPrincipalData) this.EZpvd).djBIcL(), ((TacticsListLabelLeverPrincipalData) this.EZpvd).gEmmrt(), ((TacticsListLabelLeverPrincipalData) this.EZpvd).EZpvd());
                androidx.fragment.app.FragmentManager supportFragmentManager = this.copydefault.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c51972vxB.show(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.wFg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC52272wFg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC52272wFg activityC52272wFg) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = activityC52272wFg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strAYXKKw;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (ActivityC52272wFg.OLrzqt(this.copydefault).sSMYrx()) {
                    java.lang.String strGEmmrt = C33129mqd.gEmmrt(ActivityC52272wFg.KWHzl(this.copydefault).fARcdN.getText());
                    if (Intrinsics.EZpvd((java.lang.Object) ActivityC52272wFg.OLrzqt(this.copydefault).AhwBna().getOrderType(), (java.lang.Object) "smart_portfolio")) {
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.value);
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.PlaybackStateCompatCustomActionBuilder);
                    }
                    C50404vNd.Companion.AEQbTJ(strAYXKKw, strGEmmrt, (52 & 4) != 0 ? 40 : 0, true, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null, this.copydefault.new Activity()).show(this.copydefault.getSupportFragmentManager(), "TacticsDetailsActivity");
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wFg$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ ActivityC52272wFg AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, ActivityC52272wFg activityC52272wFg) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = activityC52272wFg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.finish();
            }
        }
    }

    private final BotOperatorButtonDisposer QOLQEE() {
        return (BotOperatorButtonDisposer) this.gEmmrt.getValue();
    }

    public static final BotOperatorButtonDisposer AhwBna(ActivityC52272wFg activityC52272wFg) {
        return new BotOperatorButtonDisposer(activityC52272wFg, false, 2, null);
    }

    public static final xLY isConnected() {
        return new xLY(BizInfoConfig.DefaultBizConfig.copydefault);
    }

    private final C55915xsu AxsJAY() {
        return (C55915xsu) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC52226wDo, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        DTwDnp();
        ORxRYg();
        QKVWgx();
        QUSxYX();
        ((TacticsDetailPresenter) gHZMYf()).OLrzqt();
        C32866mlf.onEvent$default("trading_bot_cs_ongoing_detail_page_view", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        if (getIntent().getBooleanExtra("backtest", false)) {
            ((AbstractC48313uMw) sSMYrx()).EZpvd.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.QUSxYX));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC52226wDo, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.AuCTel = true;
        boolean z = getIntent().getBooleanExtra("backtest", false) && getIntent().getBooleanExtra("delay", false) && this.ejfBZ;
        if (this.ejfBZ) {
            showLoading(0L);
            this.ejfBZ = false;
        }
        ((TacticsDetailPresenter) gHZMYf()).copydefault(z);
        AuCTelauCTel();
    }

    @Override // o.AbstractActivityC52226wDo, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AxsJAY().AYXKKw();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xsu.subAvaBalance$default(o.xsu, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, boolean, com.okinc.unify_trade.biz.BizInstrument, o.xsS, java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTelauCTel() {
        TacticsData tacticsDataZLjUOn = ((TacticsDetailPresenter) gHZMYf()).zLjUOn();
        if (yDY.gEmmrt("grid", "contract_grid").contains(tacticsDataZLjUOn.getOrderType())) {
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) tacticsDataZLjUOn.getOrderType(), (java.lang.Object) "grid");
            C55915xsu c55915xsuAxsJAY = AxsJAY();
            java.lang.String orderType = tacticsDataZLjUOn.getOrderType();
            java.lang.String str = zEZpvd ? "cash" : "cross";
            java.lang.String str2 = zEZpvd ? "" : "net_mode";
            java.lang.Boolean bool = zEZpvd ? java.lang.Boolean.TRUE : null;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55915xsuAxsJAY.EZpvd(orderType, (64 & 2) != 0 ? "cash" : str, (64 & 4) != 0 ? "" : str2, (64 & 8) != 0 ? java.lang.Boolean.TRUE : bool, (64 & 16) != 0, (64 & 32) != 0 ? null : interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsDataZLjUOn.getInstType(), tacticsDataZLjUOn.getInstId(), null, null, 12, null) : null, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? tacticsDataZLjUOn.getTradeQuoteCcy() : null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DTwDnp() {
        TacticsDetailPresenter tacticsDetailPresenter = (TacticsDetailPresenter) gHZMYf();
        java.lang.String stringExtra = getIntent().getStringExtra("id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        tacticsDetailPresenter.copydefault(stringExtra);
        this.fetchVPNInfo = getIntent().getStringExtra(AppsFlyerProperties.CHANNEL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ORxRYg() {
        ((AbstractC48313uMw) sSMYrx()).getFieldNames.setExpand(true);
        ((AbstractC48313uMw) sSMYrx()).EZpvd.setTitleTypeface("harmony_sans_bold.ttf");
        C33516mxt.EZpvd(this);
        getNewProxyInstance();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        ViewGroup.LayoutParams layoutParams = ((AbstractC48313uMw) sSMYrx()).AYXKKw.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.height = ((AbstractC48313uMw) sSMYrx()).copydefault.getHeight();
        }
        if (layoutParams2 != null) {
            ((AbstractC48313uMw) sSMYrx()).AYXKKw.setLayoutParams(layoutParams2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getNewProxyInstance() {
        android.graphics.drawable.Drawable drawableKWHzl;
        android.view.View view = ((AbstractC48313uMw) sSMYrx()).valueOf;
        if (C55296xhK.OLrzqt(this)) {
            drawableKWHzl = C33070mpX.KWHzl(C48033uCm.ActionBar.gHZMYf);
        } else {
            drawableKWHzl = C33070mpX.KWHzl(C48033uCm.ActionBar.AwvSrB);
        }
        view.setBackground(drawableKWHzl);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QKVWgx() {
        ConstraintLayout constraintLayout = ((AbstractC48313uMw) sSMYrx()).fIwbmz;
        constraintLayout.setOnClickListener(new StateListAnimator(constraintLayout, 1000L, this));
        ((AbstractC48313uMw) sSMYrx()).copydefault.AEQbTJ(new TaskDescription());
        ((AbstractC48313uMw) sSMYrx()).copydefault.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: o.wFp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(android.view.View view, int i, int i2, int i3, int i4) {
                ActivityC52272wFg.AEQbTJ(this.KWHzl, view, i, i2, i3, i4);
            }
        });
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new TacticsDetailsActivity$initListener$4(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.wFg$Activity */
    public static final class Activity implements Function2<java.lang.String, java.lang.Boolean, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.String str, java.lang.Boolean bool) {
            copydefault(str, bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            if (z) {
                ActivityC52272wFg.OLrzqt(ActivityC52272wFg.this).AYXKKw(str);
                ActivityC52272wFg.OLrzqt(ActivityC52272wFg.this).AEQbTJ(str);
            }
        }
    }

    /* JADX INFO: renamed from: o.wFg$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                int position = tab.getPosition();
                ActivityC52272wFg activityC52272wFg = ActivityC52272wFg.this;
                ActivityC52272wFg.OLrzqt(activityC52272wFg).KWHzl(position);
                activityC52272wFg.zLjUOn();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(ActivityC52272wFg activityC52272wFg, android.view.View view, int i, int i2, int i3, int i4) {
        android.view.View view2 = ((AbstractC48313uMw) activityC52272wFg.sSMYrx()).valueOf;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        view2.setVisibility(activityC52272wFg.zsXlph() ^ true ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QUSxYX() {
        AxsJAY().AhwBna().observe(this, new PendingIntent(new Function1() { // from class: o.wFu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }));
        ((TacticsDetailPresenter) gHZMYf()).getNewProxyInstance().observe(this, new PendingIntent(new Function1() { // from class: o.wFs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.KWHzl(this.AEQbTJ, (C55804xqp) obj);
            }
        }));
        ((TacticsDetailPresenter) gHZMYf()).fIwbmz().observe(this, new PendingIntent(new Function1() { // from class: o.wFv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        ((TacticsDetailPresenter) gHZMYf()).getFieldNames().observe(this, new PendingIntent(new Function1() { // from class: o.wFB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.EZpvd(this.KWHzl, (BotLeadProfitProfitOrderDetails) obj);
            }
        }));
        ((TacticsDetailPresenter) gHZMYf()).gEmmrt().observe(this, new PendingIntent(new Function1() { // from class: o.wFA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.copydefault(this.OLrzqt, (java.util.List) obj);
            }
        }));
        ((TacticsDetailPresenter) gHZMYf()).hDKMBd().observe(this, new PendingIntent(new Function1() { // from class: o.wFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.AEQbTJ(this.OLrzqt, (TacticsData) obj);
            }
        }));
        ((TacticsDetailPresenter) gHZMYf()).getAggregateErrorLiveData().observe(this, new PendingIntent(new Function1() { // from class: o.wFd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.AEQbTJ(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        ((TacticsDetailPresenter) gHZMYf()).uzCIH().AkhnZx().observe(this, new PendingIntent(new Function1() { // from class: o.wFf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.KWHzl(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC52272wFg activityC52272wFg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("TacticsListFragment balanceViewModel.mQuoteMax " + str);
        if (activityC52272wFg.isConnected != null) {
            activityC52272wFg.dismissLoading();
            activityC52272wFg.QOLQEE().AEQbTJ(activityC52272wFg.values, ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).zLjUOn(), activityC52272wFg.isConnected, (Function0<Unit>) null, activityC52272wFg.AxsJAY().AhwBna(), activityC52272wFg.AxsJAY().EZpvd());
            activityC52272wFg.isConnected = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC52272wFg activityC52272wFg, C55804xqp c55804xqp) {
        java.util.ArrayList arrayList;
        AbstractC54531xLw abstractC54531xLw;
        java.lang.Object next;
        java.util.ArrayList<AbstractC54531xLw> arrayListAuCTel;
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponseAhwBna = ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).AhwBna();
        activityC52272wFg.EZpvd((StrategyDetailsResponse) c55804xqp.copydefault());
        StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) c55804xqp.copydefault();
        ((StrategyDetailsResponse) c55804xqp.copydefault()).isHistory();
        if (Intrinsics.EZpvd((java.lang.Object) c55804xqp.OLrzqt(), (java.lang.Object) "WebSocket")) {
            ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).copydefault(strategyDetailsResponse.copy(((-1) & 1) != 0 ? strategyDetailsResponse.instType : strategyDetailsResponseAhwBna.getInstType(), ((-1) & 2) != 0 ? strategyDetailsResponse.instId : strategyDetailsResponseAhwBna.getInstId(), ((-1) & 4) != 0 ? strategyDetailsResponse.uly : null, ((-1) & 8) != 0 ? strategyDetailsResponse.ccy : null, ((-1) & 16) != 0 ? strategyDetailsResponse.ctVal : null, ((-1) & 32) != 0 ? strategyDetailsResponse.ordId : null, ((-1) & 64) != 0 ? strategyDetailsResponse.algoId : null, ((-1) & 128) != 0 ? strategyDetailsResponse.cTime : null, ((-1) & 256) != 0 ? strategyDetailsResponse.ordType : null, ((-1) & 512) != 0 ? strategyDetailsResponse.tdMode : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.triggerTime : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.state : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.pxVar : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.pxSpread : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.szLimit : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.pxLimit : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.actualSz : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.sz : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.side : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.posSide : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.timeInterval : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.maxPx : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.minPx : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.gridNum : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.runType : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.quoteSz : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.baseSz : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.tpslTriggerParamResp : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.tpTriggerPx : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.slTriggerPx : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.tpRatio : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.slRatio : null, ((-1) & 1) != 0 ? strategyDetailsResponse.tradeNum : null, ((-1) & 2) != 0 ? strategyDetailsResponse.totalPnl : null, ((-1) & 4) != 0 ? strategyDetailsResponse.pnlRatio : null, ((-1) & 8) != 0 ? strategyDetailsResponse.arbApy : null, ((-1) & 16) != 0 ? strategyDetailsResponse.profitNum : null, ((-1) & 32) != 0 ? strategyDetailsResponse.runTime : null, ((-1) & 64) != 0 ? strategyDetailsResponse.perMinProfitRate : null, ((-1) & 128) != 0 ? strategyDetailsResponse.perMaxProfitRate : null, ((-1) & 256) != 0 ? strategyDetailsResponse.gridProfit : null, ((-1) & 512) != 0 ? strategyDetailsResponse.gridProfitRate : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.totalCycleProfitRate : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.arbitrageProfitRate : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.floatProfit : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.totalAnnualizedRate : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.annualizedRate : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.curQuoteSz : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.curBaseSz : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.cancelType : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.investment : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.lever : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.pTime : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.arbitrageNum : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.avgDailyArbitrageNum : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.singleAmt : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.stopResult : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.runPx : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.stgyName : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.mktCap : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.investAmt : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.uTime : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.cycles : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.amt : null, ((-1) & 1) != 0 ? strategyDetailsResponse.recurringList : null, ((-1) & 2) != 0 ? strategyDetailsResponse.period : null, ((-1) & 4) != 0 ? strategyDetailsResponse.recurringDay : null, ((-1) & 8) != 0 ? strategyDetailsResponse.recurringHour : null, ((-1) & 16) != 0 ? strategyDetailsResponse.nextInvestTime : null, ((-1) & 32) != 0 ? strategyDetailsResponse.investCcy : null, ((-1) & 64) != 0 ? strategyDetailsResponse.recurringTime : null, ((-1) & 128) != 0 ? strategyDetailsResponse.direction : null, ((-1) & 256) != 0 ? strategyDetailsResponse.actualLever : null, ((-1) & 512) != 0 ? strategyDetailsResponse.eq : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.algoOrdType : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.duration : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.investType : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.basePos : false, ((-1) & 16384) != 0 ? strategyDetailsResponse.balType : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.interval : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.deltaRatio : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.balNum : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.portfolioList : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.apy : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.maturedApy : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.avgPx : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.investmentAmt : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.investmentCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.maxSafetyOrds : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.fillSafetyOrds : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.fillManualAddOrds : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.tpPx : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.slPx : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.tpPriceRange : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.completedCycles : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.initOrdAmt : null, ((-1) & 1) != 0 ? strategyDetailsResponse.safetyOrdAmt : null, ((-1) & 2) != 0 ? strategyDetailsResponse.pxSteps : null, ((-1) & 4) != 0 ? strategyDetailsResponse.tpPct : null, ((-1) & 8) != 0 ? strategyDetailsResponse.slPct : null, ((-1) & 16) != 0 ? strategyDetailsResponse.slMode : null, ((-1) & 32) != 0 ? strategyDetailsResponse.pxStepsMult : null, ((-1) & 64) != 0 ? strategyDetailsResponse.volMult : null, ((-1) & 128) != 0 ? strategyDetailsResponse.sourceAlgoId : null, ((-1) & 256) != 0 ? strategyDetailsResponse.stopType : null, ((-1) & 512) != 0 ? strategyDetailsResponse.profit : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.signParams : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.rebateTrans : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.reserveFunds : false, ((-1) & 8192) != 0 ? strategyDetailsResponse.totalCycleProfit : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.arbitragePnl : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.additionalFundNeeded : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.maxBotUsage : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.cycleBaseAmt : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.triggerParams : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.reserveFundingFee : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.transferInMargin : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.ordFrozen : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.availEq : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.initPx : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.perGridProfitRatio : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.activeOrderCount : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.trailingUpConfig : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.trailingDownConfig : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.trailingDownFund : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.gridStatus : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.lmtOrderNumber : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.aggressiveness : null, ((-1) & 1) != 0 ? strategyDetailsResponse.profitSharingRatio : null, ((-1) & 2) != 0 ? strategyDetailsResponse.copyType : null, ((-1) & 4) != 0 ? strategyDetailsResponse.instIds : null, ((-1) & 8) != 0 ? strategyDetailsResponse.totalEquity : null, ((-1) & 16) != 0 ? strategyDetailsResponse.floatingPnl : null, ((-1) & 32) != 0 ? strategyDetailsResponse.actualMarginSz : null, ((-1) & 64) != 0 ? strategyDetailsResponse.extraMarginSz : null, ((-1) & 128) != 0 ? strategyDetailsResponse.usedMargin : null, ((-1) & 256) != 0 ? strategyDetailsResponse.availableMargin : null, ((-1) & 512) != 0 ? strategyDetailsResponse.totalAmt : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.totalPnlRatio : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.realizedPnl : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.signalChanName : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.signalChanId : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.signalCount : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.allowMultipleEntry : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.subOrdType : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.ratio : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.signalOrderAmtParam : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.signalBotOrderStopParam : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.signalSourceType : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.symbolsNumber : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.isHistory : false, ((-1) & 8388608) != 0 ? strategyDetailsResponse.sourceCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.sourceCcySz : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.trackingMode : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.netMarginTransfer : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.feeCcy : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.fundingFee : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.reduce_only : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.outOfRange : false, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.autoMarginReloadSwitch : false, ((-1) & 1) != 0 ? strategyDetailsResponse.autoMarginReloadMaxAmount : null, ((-1) & 2) != 0 ? strategyDetailsResponse.extendedBusinessInfo : null, ((-1) & 4) != 0 ? strategyDetailsResponse.arbPnl : null, ((-1) & 8) != 0 ? strategyDetailsResponse.spreadPnl : null, ((-1) & 16) != 0 ? strategyDetailsResponse.arbList : null, ((-1) & 32) != 0 ? strategyDetailsResponse.preFundingFee : null, ((-1) & 64) != 0 ? strategyDetailsResponse.preAnnualized : null, ((-1) & 128) != 0 ? strategyDetailsResponse.instFamily : null, ((-1) & 256) != 0 ? strategyDetailsResponse.fundingFeeTime : null, ((-1) & 512) != 0 ? strategyDetailsResponse.fundingFeeRatio : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.pnlRatioInSourceCcy : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.totalPnlInSourceCcy : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.floatProfitInSourceCcy : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.gridProfitInSourceCcy : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.arbitrageApy : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.floatProfitRate : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.profitInSourceCcy : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.ruleType : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.isTradeBorrowMode : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.strategyTags : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.voucherInfo : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.stakingPnl : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.stakingPnlUSDT : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.stakingPosCcy : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.stakingPnlApy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.subArbTypes : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.totalInterestAmt : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.debtCcy : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.accountId : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.forbidden : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.hiddenFeatures : null, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.dcdState : null, ((-1) & 1) != 0 ? strategyDetailsResponse.coinPnl : null, ((-1) & 2) != 0 ? strategyDetailsResponse.notional : null, ((-1) & 4) != 0 ? strategyDetailsResponse.notionalCcy : null, ((-1) & 8) != 0 ? strategyDetailsResponse.settlementAmount : null, ((-1) & 16) != 0 ? strategyDetailsResponse.settlementCcy : null, ((-1) & 32) != 0 ? strategyDetailsResponse.currencyBal : null, ((-1) & 64) != 0 ? strategyDetailsResponse.currency : null, ((-1) & 128) != 0 ? strategyDetailsResponse.avgCost : null, ((-1) & 256) != 0 ? strategyDetailsResponse.cycle : null, ((-1) & 512) != 0 ? strategyDetailsResponse.term : null, ((-1) & 1024) != 0 ? strategyDetailsResponse.alternateCurrency : null, ((-1) & 2048) != 0 ? strategyDetailsResponse.strike : null, ((-1) & 4096) != 0 ? strategyDetailsResponse.strikePercentage : null, ((-1) & 8192) != 0 ? strategyDetailsResponse.stopPrice : null, ((-1) & 16384) != 0 ? strategyDetailsResponse.stopPercentage : null, ((-1) & 32768) != 0 ? strategyDetailsResponse.curStrike : null, ((-1) & 65536) != 0 ? strategyDetailsResponse.dcdOptionType : null, ((-1) & 131072) != 0 ? strategyDetailsResponse.curSettlementTime : null, ((-1) & 262144) != 0 ? strategyDetailsResponse.minAnnualYieldPercentage : null, ((-1) & 524288) != 0 ? strategyDetailsResponse.maxSettlementDay : null, ((-1) & 1048576) != 0 ? strategyDetailsResponse.reinvestment : null, ((-1) & 2097152) != 0 ? strategyDetailsResponse.lastPrice : null, ((-1) & 4194304) != 0 ? strategyDetailsResponse.lastTradeExpireTime : null, ((-1) & 8388608) != 0 ? strategyDetailsResponse.lastSettlementSettledTime : null, ((-1) & 16777216) != 0 ? strategyDetailsResponse.absYieldPercentage : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? strategyDetailsResponse.estimatedSettleTime : null, ((-1) & 67108864) != 0 ? strategyDetailsResponse.simpleEarn : null, ((-1) & 134217728) != 0 ? strategyDetailsResponse.arbitrageTotalPnlInfo : null, ((-1) & 268435456) != 0 ? strategyDetailsResponse.leveragePrincipal : null, ((-1) & 536870912) != 0 ? strategyDetailsResponse.highestApyPeriod : null, ((-1) & 1073741824) != 0 ? strategyDetailsResponse.displayMinPaybackDays : false, ((-1) & Integer.MIN_VALUE) != 0 ? strategyDetailsResponse.fundingFeeApyList : null, (131067 & 1) != 0 ? strategyDetailsResponse.displayId : null, (131067 & 2) != 0 ? strategyDetailsResponse.tradeQuoteCcy : null, (131067 & 4) != 0 ? strategyDetailsResponse.profitAutoReinvest : null, (131067 & 8) != 0 ? strategyDetailsResponse.profitSnapshots : null, (131067 & 16) != 0 ? strategyDetailsResponse.latestProfit : null, (131067 & 32) != 0 ? strategyDetailsResponse.totalSpreadProfit : null, (131067 & 64) != 0 ? strategyDetailsResponse.totalApy : null, (131067 & 128) != 0 ? strategyDetailsResponse.fee : null, (131067 & 256) != 0 ? strategyDetailsResponse.arbitrageProfit : null, (131067 & 512) != 0 ? strategyDetailsResponse.stakingProfit : null, (131067 & 1024) != 0 ? strategyDetailsResponse.balanceDetails : null, (131067 & 2048) != 0 ? strategyDetailsResponse.liqPx : null, (131067 & 4096) != 0 ? strategyDetailsResponse.bot : null, (131067 & 8192) != 0 ? strategyDetailsResponse.effectiveEditParametersDetails : null, (131067 & 16384) != 0 ? strategyDetailsResponse.safetyOrdRatio : null, (131067 & 32768) != 0 ? strategyDetailsResponse.cycleStartTime : null, (131067 & 65536) != 0 ? strategyDetailsResponse.noClosePositionId : null));
        } else {
            ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).copydefault(strategyDetailsResponse);
        }
        if (activityC52272wFg.DbNXlk) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) c55804xqp.OLrzqt(), (java.lang.Object) "http")) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (arrayListAuCTel = interfaceC54581xNrOLrzqt.AuCTel()) == null) {
                arrayList = null;
            } else {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : arrayListAuCTel) {
                    if (AbstractC54531xLw.isInitFun$default((AbstractC54531xLw) obj, false, 1, null)) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getInstType(), (java.lang.Object) ((AbstractC54531xLw) next).AYXKKw())) {
                        break;
                    }
                }
                abstractC54531xLw = (AbstractC54531xLw) next;
            } else {
                abstractC54531xLw = null;
            }
            if (abstractC54531xLw == null) {
                activityC52272wFg.DbNXlk = true;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52272wFg), null, null, new TacticsDetailsActivity$subscribeOnUIChange$2$1(strategyDetailsResponse, activityC52272wFg, null), 3, null);
            } else {
                activityC52272wFg.QfsBiF();
            }
        } else {
            activityC52272wFg.QfsBiF();
        }
        rVN.reportFullyDrawn$default((android.app.Activity) activityC52272wFg, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC52272wFg activityC52272wFg, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC52272wFg.copydefault(str, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC52272wFg activityC52272wFg, BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
        Intrinsics.checkNotNullParameter(botLeadProfitProfitOrderDetails, "");
        activityC52272wFg.EZpvd(botLeadProfitProfitOrderDetails);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(ActivityC52272wFg activityC52272wFg, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        activityC52272wFg.KWHzl(((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).AYXKKw());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wqR.TaskDescription.share$default(o.wqR$TaskDescription, com.okinc.unify_trade.bot.data.TacticsData, androidx.activity.ComponentActivity, boolean, java.util.List, boolean, o.wru, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC52272wFg activityC52272wFg, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        boolean z = !((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).AhwBna().isHistory() && C53660wpg.Companion.EZpvd().AEQbTJ(new C53660wpg.Activity(((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).AhwBna().getOrderType())).booleanValue();
        if (Intrinsics.EZpvd((java.lang.Object) tacticsData.getOrderType(), (java.lang.Object) "ai_bot")) {
            C53772wrm.shareAiBot$default(tacticsData.copy(((-262145) & 1) != 0 ? tacticsData.orderType : null, ((-262145) & 2) != 0 ? tacticsData.algoId : null, ((-262145) & 4) != 0 ? tacticsData.instType : null, ((-262145) & 8) != 0 ? tacticsData.instId : null, ((-262145) & 16) != 0 ? tacticsData.state : null, ((-262145) & 32) != 0 ? tacticsData.filledPercentage : null, ((-262145) & 64) != 0 ? tacticsData.history : false, ((-262145) & 128) != 0 ? tacticsData.tvTitle : null, ((-262145) & 256) != 0 ? tacticsData.tacticsType : null, ((-262145) & 512) != 0 ? tacticsData.ivShareRes : 0, ((-262145) & 1024) != 0 ? tacticsData.level : null, ((-262145) & 2048) != 0 ? tacticsData.cTime : null, ((-262145) & 4096) != 0 ? tacticsData.cTimeStamp : 0L, ((-262145) & 8192) != 0 ? tacticsData.pnlRatio : null, ((-262145) & 16384) != 0 ? tacticsData.subData : null, ((-262145) & 32768) != 0 ? tacticsData.tradeSymbol : null, ((-262145) & 65536) != 0 ? tacticsData.stopStateText : null, ((-262145) & 131072) != 0 ? tacticsData.stopOrangeHint : null, ((-262145) & 262144) != 0 ? tacticsData.shareData : null, ((-262145) & 524288) != 0 ? tacticsData.instList : null, ((-262145) & 1048576) != 0 ? tacticsData.associate : null, ((-262145) & 2097152) != 0 ? tacticsData.stgyName : null, ((-262145) & 4194304) != 0 ? tacticsData.direction : null, ((-262145) & 8388608) != 0 ? tacticsData.tpTriggerPx : null, ((-262145) & 16777216) != 0 ? tacticsData.slTriggerPx : null, ((-262145) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.tpRatio : null, ((-262145) & 67108864) != 0 ? tacticsData.slRatio : null, ((-262145) & 134217728) != 0 ? tacticsData.priceLocker : null, ((-262145) & 268435456) != 0 ? tacticsData.recItemList : null, ((-262145) & 536870912) != 0 ? tacticsData.hoardItemList : null, ((-262145) & 1073741824) != 0 ? tacticsData.investCcy : null, ((-262145) & Integer.MIN_VALUE) != 0 ? tacticsData.lastPrice : null, ((-1) & 1) != 0 ? tacticsData.operateList : null, ((-1) & 2) != 0 ? tacticsData.extraOperatorList : null, ((-1) & 4) != 0 ? tacticsData.labelList : null, ((-1) & 8) != 0 ? tacticsData.signParams : null, ((-1) & 16) != 0 ? tacticsData.uTime : null, ((-1) & 32) != 0 ? tacticsData.triggerParams : null, ((-1) & 64) != 0 ? tacticsData.cycleId : null, ((-1) & 128) != 0 ? tacticsData.stopType : null, ((-1) & 256) != 0 ? tacticsData.tpPx : null, ((-1) & 512) != 0 ? tacticsData.slPx : null, ((-1) & 1024) != 0 ? tacticsData.tpslTriggerParam : null, ((-1) & 2048) != 0 ? tacticsData.tpPriceRange : null, ((-1) & 4096) != 0 ? tacticsData.gridState : null, ((-1) & 8192) != 0 ? tacticsData.originalLevel : null, ((-1) & 16384) != 0 ? tacticsData.actualMarginSz : null, ((-1) & 32768) != 0 ? tacticsData.extraMarginSz : null, ((-1) & 65536) != 0 ? tacticsData.liqPx : null, ((-1) & 131072) != 0 ? tacticsData.longLiqPx : null, ((-1) & 262144) != 0 ? tacticsData.shortLiqPx : null, ((-1) & 524288) != 0 ? tacticsData.tradeNum : null, ((-1) & 1048576) != 0 ? tacticsData.pxSpread : null, ((-1) & 2097152) != 0 ? tacticsData.pxVar : null, ((-1) & 4194304) != 0 ? tacticsData.pxLimit : null, ((-1) & 8388608) != 0 ? tacticsData.timeInterval : null, ((-1) & 16777216) != 0 ? tacticsData.szLimit : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.sz : null, ((-1) & 67108864) != 0 ? tacticsData.side : null, ((-1) & 134217728) != 0 ? tacticsData.posSide : null, ((-1) & 268435456) != 0 ? tacticsData.tdMode : null, ((-1) & 536870912) != 0 ? tacticsData.reduce_only : null, ((-1) & 1073741824) != 0 ? tacticsData.ccy : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.copyType : null, ((-1) & 1) != 0 ? tacticsData.profitSharingRatio : null, ((-1) & 2) != 0 ? tacticsData.sourceAlgoId : null, ((-1) & 4) != 0 ? tacticsData.mktCap : null, ((-1) & 8) != 0 ? tacticsData.instIds : null, ((-1) & 16) != 0 ? tacticsData.totalAmt : null, ((-1) & 32) != 0 ? tacticsData.signalChanId : null, ((-1) & 64) != 0 ? tacticsData.signalChanName : null, ((-1) & 128) != 0 ? tacticsData.floatingPnl : null, ((-1) & 256) != 0 ? tacticsData.availableMargin : null, ((-1) & 512) != 0 ? tacticsData.totalPnlRatio : null, ((-1) & 1024) != 0 ? tacticsData.signalCount : null, ((-1) & 2048) != 0 ? tacticsData.supportEarlyFill : false, ((-1) & 4096) != 0 ? tacticsData.signalSubsSizeDesc : null, ((-1) & 8192) != 0 ? tacticsData.signalSubsSize : null, ((-1) & 16384) != 0 ? tacticsData.signalSource : null, ((-1) & 32768) != 0 ? tacticsData.profitRateDesc : null, ((-1) & 65536) != 0 ? tacticsData.profit : null, ((-1) & 131072) != 0 ? tacticsData.symbolsNumber : null, ((-1) & 262144) != 0 ? tacticsData.locatePage : 0, ((-1) & 524288) != 0 ? tacticsData.maxPx : null, ((-1) & 1048576) != 0 ? tacticsData.minPx : null, ((-1) & 2097152) != 0 ? tacticsData.runType : null, ((-1) & 4194304) != 0 ? tacticsData.gridNum : null, ((-1) & 8388608) != 0 ? tacticsData.trailingUpConfig : null, ((-1) & 16777216) != 0 ? tacticsData.trailingDownConfig : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.trailingDownFund : null, ((-1) & 67108864) != 0 ? tacticsData.reserveFunds : null, ((-1) & 134217728) != 0 ? tacticsData.basePos : false, ((-1) & 268435456) != 0 ? tacticsData.perGridProfitRatio : null, ((-1) & 536870912) != 0 ? tacticsData.perMinProfitRate : null, ((-1) & 1073741824) != 0 ? tacticsData.perMaxProfitRate : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.balType : null, ((-1) & 1) != 0 ? tacticsData.interval : null, ((-1) & 2) != 0 ? tacticsData.deltaRatio : null, ((-1) & 4) != 0 ? tacticsData.maxSafetyOrds : null, ((-1) & 8) != 0 ? tacticsData.pxSteps : null, ((-1) & 16) != 0 ? tacticsData.pxStepsMult : null, ((-1) & 32) != 0 ? tacticsData.volMult : null, ((-1) & 64) != 0 ? tacticsData.tpPct : null, ((-1) & 128) != 0 ? tacticsData.slPct : null, ((-1) & 256) != 0 ? tacticsData.slMode : null, ((-1) & 512) != 0 ? tacticsData.triggerType : null, ((-1) & 1024) != 0 ? tacticsData.trackingMode : null, ((-1) & 2048) != 0 ? tacticsData.autoMarginReloadSwitch : false, ((-1) & 4096) != 0 ? tacticsData.autoMarginReloadMaxAmount : null, ((-1) & 8192) != 0 ? tacticsData.extendedBusinessInfo : null, ((-1) & 16384) != 0 ? tacticsData.instFamily : null, ((-1) & 32768) != 0 ? tacticsData.arbList : null, ((-1) & 65536) != 0 ? tacticsData.outOfRange : false, ((-1) & 131072) != 0 ? tacticsData.sourceCcy : null, ((-1) & 262144) != 0 ? tacticsData.sourceCcySz : null, ((-1) & 524288) != 0 ? tacticsData.curQuoteSz : null, ((-1) & 1048576) != 0 ? tacticsData.curBaseSz : null, ((-1) & 2097152) != 0 ? tacticsData.isPostWarning : null, ((-1) & 4194304) != 0 ? tacticsData.ruleType : null, ((-1) & 8388608) != 0 ? tacticsData.isTradeBorrowMode : null, ((-1) & 16777216) != 0 ? tacticsData.totalPnl : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.isShowTWapTips : false, ((-1) & 67108864) != 0 ? tacticsData.strategyTags : null, ((-1) & 134217728) != 0 ? tacticsData.signalOrderAmtParam : null, ((-1) & 268435456) != 0 ? tacticsData.signalBotOrderStopParam : null, ((-1) & 536870912) != 0 ? tacticsData.voucherInfo : null, ((-1) & 1073741824) != 0 ? tacticsData.forbidden : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.hiddenFeatures : null, ((-1) & 1) != 0 ? tacticsData.dcdState : null, ((-1) & 2) != 0 ? tacticsData.reinvestment : false, ((-1) & 4) != 0 ? tacticsData.lastTradeExpireTime : null, ((-1) & 8) != 0 ? tacticsData.lastSettlementSettledTime : null, ((-1) & 16) != 0 ? tacticsData.profitData : null, ((-1) & 32) != 0 ? tacticsData.runningDuration : null, ((-1) & 64) != 0 ? tacticsData.arbitrageStakingError : null, ((-1) & 128) != 0 ? tacticsData.isSmartArbitrageWithStaking : false, ((-1) & 256) != 0 ? tacticsData.deeplink : null, ((-1) & 512) != 0 ? tacticsData.source : null, ((-1) & 1024) != 0 ? tacticsData.topupActualMarginSz : null, ((-1) & 2048) != 0 ? tacticsData.simpleEarn : null, ((-1) & 4096) != 0 ? tacticsData.baseSz : null, ((-1) & 8192) != 0 ? tacticsData.investmentType : null, ((-1) & 16384) != 0 ? tacticsData.investment : null, ((-1) & 32768) != 0 ? tacticsData.cbAutoReserve : null, ((-1) & 65536) != 0 ? tacticsData.arbitrageTotalPnlInfo : null, ((-1) & 131072) != 0 ? tacticsData.leverPrincipal : null, ((-1) & 262144) != 0 ? tacticsData.contractDcaSpecialData : null, ((-1) & 524288) != 0 ? tacticsData.highestApyPeriod : null, ((-1) & 1048576) != 0 ? tacticsData.displayMinPaybackDays : false, ((-1) & 2097152) != 0 ? tacticsData.fundingFeeApyList : null, ((-1) & 4194304) != 0 ? tacticsData.profitSnapshots : CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).AuCTel()), ((-1) & 8388608) != 0 ? tacticsData.latestProfitData : null, ((-1) & 16777216) != 0 ? tacticsData.tradeQuoteCcy : null, ((-1) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tacticsData.smartArbProfitsInfo : null, ((-1) & 67108864) != 0 ? tacticsData.balanceDetails : null, ((-1) & 134217728) != 0 ? tacticsData.bot : null, ((-1) & 268435456) != 0 ? tacticsData.autoVipProfitInfo : null, ((-1) & 536870912) != 0 ? tacticsData.initOrdAmt : null, ((-1) & 1073741824) != 0 ? tacticsData.safetyOrdAmt : null, ((-1) & Integer.MIN_VALUE) != 0 ? tacticsData.effectiveEditParametersDetails : null, (3 & 1) != 0 ? tacticsData.swapCoinMProfitSwitchUiModel : null, (3 & 2) != 0 ? tacticsData.recurringBuyDetails : null), activityC52272wFg, false, false, 6, null);
            return Unit.INSTANCE;
        }
        C53698wqR.TaskDescription.share$default(C53698wqR.Companion, tacticsData, activityC52272wFg, true, ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).AuCTel(), z, null, 32, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ActivityC52272wFg activityC52272wFg, androidx.core.util.Pair pair) {
        activityC52272wFg.releaseLoading();
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).djBIcL().bB_())) {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).uzCIH().bB_())) {
            pUU.copydefault(activityC52272wFg.getTAG(), pair.first + " request failed cause by " + ((java.lang.Exception) pair.second).getMessage());
            activityC52272wFg.copydefault(((java.lang.Exception) pair.second).getMessage());
            rVN.reportFullyDrawn$default((android.app.Activity) activityC52272wFg, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(ActivityC52272wFg activityC52272wFg, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            C55804xqp<StrategyDetailsResponse> value = ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).getNewProxyInstance().getValue();
            if ((value != null ? value.copydefault() : null) == null) {
                activityC52272wFg.showLoading(0L);
            }
        } else {
            activityC52272wFg.releaseLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.tradingbot.impl.share.BotPreShareBottomSheet.ActionBar.newInstance$default(com.okinc.tradingbot.impl.share.BotPreShareBottomSheet$ActionBar, com.okinc.tradingbot.impl.share.BotPreShareBottomSheet$UiParam, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, java.lang.Object):com.okinc.tradingbot.impl.share.BotPreShareBottomSheet */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v35, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v37, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QfsBiF() {
        AbstractC48313uMw abstractC48313uMw = (AbstractC48313uMw) sSMYrx();
        C52564wQb c52564wQb = abstractC48313uMw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52564wQb, "");
        c52564wQb.setVisibility(8);
        android.widget.ImageView imageView = abstractC48313uMw.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(((TacticsDetailPresenter) gHZMYf()).sSMYrx() ? 0 : 8);
        StrategyDetailsResponse strategyDetailsResponseAhwBna = ((TacticsDetailPresenter) gHZMYf()).AhwBna();
        java.lang.Boolean bool = this.fIwbmz;
        if (bool == null) {
            this.fIwbmz = java.lang.Boolean.valueOf(strategyDetailsResponseAhwBna.isHistory());
        } else if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE) && strategyDetailsResponseAhwBna.isHistory()) {
            TacticsData tacticsDataZLjUOn = ((TacticsDetailPresenter) gHZMYf()).zLjUOn();
            if (yDY.gEmmrt("smart_arbitrage", "ai_bot").contains(tacticsDataZLjUOn.getOrderType())) {
                finish();
                return;
            } else if (yDY.gEmmrt("smart_arbitrage", "dcd_bot").contains(tacticsDataZLjUOn.getOrderType()) && C33129mqd.AEQbTJ(tacticsDataZLjUOn.getTotalPnlRatio(), 0)) {
                BotPreShareBottomSheet botPreShareBottomSheetNewInstance$default = BotPreShareBottomSheet.ActionBar.newInstance$default(BotPreShareBottomSheet.Companion, new BotPreShareBottomSheet.UiParam(C33070mpX.AYXKKw(C48033uCm.Fragment.hpmliR), C33070mpX.AYXKKw(C48033uCm.Fragment.DcMfJKfbSiEC), C56068xvo.copydefault.copydefault(tacticsDataZLjUOn.getShareData().getMainDataValue(), true), tacticsDataZLjUOn, java.lang.Integer.valueOf(C52761wXj.PendingIntent.uzCIH), null, 32, null), new Function1() { // from class: o.wFo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC52272wFg.EZpvd(this.EZpvd, (TacticsData) obj);
                    }
                }, null, 4, null);
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                botPreShareBottomSheetNewInstance$default.show(supportFragmentManager);
            }
        }
        if (this.AuCTel) {
            this.AuCTel = false;
            AEQbTJ((AbstractC48313uMw) sSMYrx());
            OcIXYQ();
            ((TacticsDetailPresenter) gHZMYf()).EZpvd();
        }
        hDKMBd();
        AubY();
        uzCIH();
        ((AbstractC48313uMw) sSMYrx()).djBIcL.setText(((TacticsDetailPresenter) gHZMYf()).AEQbTJ(C33129mqd.subS$default(strategyDetailsResponseAhwBna.getPTime(), strategyDetailsResponseAhwBna.getCTime(), null, null, null, 14, null), strategyDetailsResponseAhwBna.getCTime()));
        if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponseAhwBna.getState(), (java.lang.Object) "stopped") || Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponseAhwBna.getState(), (java.lang.Object) "no_close_position") || Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponseAhwBna.getState(), (java.lang.Object) "canceled")) {
            copydefault("0", strategyDetailsResponseAhwBna.getTradeNum());
        } else {
            copydefault(strategyDetailsResponseAhwBna.getActiveOrderCount(), strategyDetailsResponseAhwBna.getTradeNum());
        }
        iwGUEr();
        AuCTel();
        ((TacticsDetailPresenter) gHZMYf()).AEQbTJ(strategyDetailsResponseAhwBna);
        QbewEr();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC52272wFg activityC52272wFg, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).gHZMYf();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QbewEr() {
        if (this.AkhnZx || !Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), (java.lang.Object) "dcd_bot")) {
            return;
        }
        this.AkhnZx = true;
        C32866mlf.onEvent$default("BotDetails_Full_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.lang.String str) {
        C52564wQb c52564wQb = ((AbstractC48313uMw) sSMYrx()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(c52564wQb, "");
        c52564wQb.setVisibility(0);
        android.widget.ImageView imageViewCopydefault = ((AbstractC48313uMw) sSMYrx()).KWHzl.copydefault();
        if (imageViewCopydefault != null) {
            imageViewCopydefault.setOnClickListener(new VoiceInteractor(imageViewCopydefault, 1000L, this));
        }
        C55173xeu c55173xeuEZpvd = ((AbstractC48313uMw) sSMYrx()).KWHzl.EZpvd();
        if (c55173xeuEZpvd != null) {
            if (str == null) {
                str = "";
            }
            c55173xeuEZpvd.setSubTitle((java.lang.CharSequence) str);
            c55173xeuEZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.wFn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC52272wFg.OLrzqt(this.KWHzl, view);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC52272wFg activityC52272wFg, android.view.View view) {
        activityC52272wFg.DbNXlk = false;
        activityC52272wFg.AuCTel = true;
        TacticsDetailPresenter.queryBotDetails$default((TacticsDetailPresenter) activityC52272wFg.gHZMYf(), false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r10v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(java.lang.String str, java.lang.String str2) {
        java.lang.String orderType = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType();
        if (!Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "grid")) {
            if (Intrinsics.EZpvd((java.lang.Object) orderType, (java.lang.Object) "smart_iceberg")) {
                AEQbTJ(str);
                return;
            }
            return;
        }
        int i = 0;
        int i2 = -1;
        if (str != null) {
            java.util.Iterator<BotDetailsType> it = ejfBZ().iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (it.next() == BotDetailsType.GRID_PENDING_ORDER) {
                    break;
                } else {
                    i3++;
                }
            }
            TabLayout.Tab tabCopydefault = ((AbstractC48313uMw) sSMYrx()).copydefault.copydefault(i3);
            if (tabCopydefault != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(C33070mpX.AYXKKw(BotDetailsType.GRID_PENDING_ORDER.getTitle()));
                if (C33129mqd.EZpvd(str).compareTo(C33129mqd.EZpvd("0")) > 0) {
                    sb.append("(" + xMR.copydefault.copydefault(str) + ")");
                }
                tabCopydefault.setText(sb.toString());
            }
        }
        java.util.Iterator<BotDetailsType> it2 = ejfBZ().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (it2.next() == BotDetailsType.HISTORY) {
                i2 = i;
                break;
            }
            i++;
        }
        TabLayout.Tab tabCopydefault2 = ((AbstractC48313uMw) sSMYrx()).copydefault.copydefault(i2);
        if (tabCopydefault2 != null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(C33070mpX.AYXKKw(BotDetailsType.HISTORY.getTitle()));
            if (C33129mqd.EZpvd(str2).compareTo(C33129mqd.EZpvd("0")) > 0) {
                sb2.append("(" + xMR.copydefault.copydefault(str2) + ")");
            }
            tabCopydefault2.setText(sb2.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.String str) {
        if (!Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), (java.lang.Object) "smart_iceberg") || str == null) {
            return;
        }
        java.util.Iterator<BotDetailsType> it = ejfBZ().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() == BotDetailsType.SMART_SLICED_ORDER) {
                break;
            } else {
                i++;
            }
        }
        TabLayout.Tab tabCopydefault = ((AbstractC48313uMw) sSMYrx()).copydefault.copydefault(i);
        if (tabCopydefault != null) {
            tabCopydefault.setText(C33070mpX.AYXKKw(BotDetailsType.SMART_SLICED_ORDER.getTitle()) + "(" + xMR.copydefault.copydefault(str) + ")");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        C55372xih c55372xih = ((AbstractC48313uMw) sSMYrx()).getFieldNames;
        c55372xih.removeAllViews();
        java.util.ArrayList tagList$default = TacticsDetailPresenter.getTagList$default((TacticsDetailPresenter) gHZMYf(), false, 1, null);
        java.util.ArrayList<TacticsListLabelUiData> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : tagList$default) {
            TacticsListLabelUiData tacticsListLabelUiData = (TacticsListLabelUiData) obj;
            if ((tacticsListLabelUiData instanceof TacticsListLabelData) || (tacticsListLabelUiData instanceof TacticsListLabelLeverPrincipalData)) {
                arrayList.add(obj);
            }
        }
        for (TacticsListLabelUiData tacticsListLabelUiData2 : arrayList) {
            C55251xgS c55251xgSCopydefault = C52534wOz.KWHzl.copydefault(this, tacticsListLabelUiData2);
            if (tacticsListLabelUiData2 instanceof TacticsListLabelLeverPrincipalData) {
                c55251xgSCopydefault.setOnClickListener(new LoaderManager(c55251xgSCopydefault, 1000L, tacticsListLabelUiData2, this));
            }
            c55372xih.addView(c55251xgSCopydefault);
        }
        Intrinsics.copydefault(c55372xih);
        c55372xih.setVisibility(0);
        java.util.ArrayList tagList$default2 = TacticsDetailPresenter.getTagList$default((TacticsDetailPresenter) gHZMYf(), false, 1, null);
        java.util.ArrayList<TacticsListLabelVoucherData> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : tagList$default2) {
            if (obj2 instanceof TacticsListLabelVoucherData) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            C55372xih c55372xih2 = ((AbstractC48313uMw) sSMYrx()).getNewProxyInstance;
            Intrinsics.copydefault(c55372xih2);
            c55372xih2.setVisibility(0);
            c55372xih2.removeAllViews();
            for (TacticsListLabelVoucherData tacticsListLabelVoucherData : arrayList2) {
                C55251xgS c55251xgSCopydefault2 = C52534wOz.KWHzl.copydefault(this, new TacticsListLabelVoucherData(tacticsListLabelVoucherData.AEQbTJ(), false, 0, -3, 0, tacticsListLabelVoucherData.EZpvd(), 22, null));
                c55251xgSCopydefault2.setOnClickListener(new FragmentManager(c55251xgSCopydefault2, 1000L, this, c55251xgSCopydefault2, tacticsListLabelVoucherData));
                c55372xih2.addView(c55251xgSCopydefault2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(AbstractC48313uMw abstractC48313uMw) {
        abstractC48313uMw.fARcdN.setText(((TacticsDetailPresenter) gHZMYf()).fetchVPNInfo());
        java.lang.String orderType = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType();
        boolean zIsHistory = ((TacticsDetailPresenter) gHZMYf()).AhwBna().isHistory();
        if (yDY.gEmmrt("smart_arbitrage", "contract_grid", "grid", "contract_dca", "spot_dca", "recurring", "ai_bot").contains(orderType)) {
            android.view.View view = abstractC48313uMw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            ConstraintLayout constraintLayout = abstractC48313uMw.AuCTel;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            android.view.View view2 = abstractC48313uMw.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(8);
            return;
        }
        if (!zIsHistory && yDY.gEmmrt("recurring", "smart_portfolio").contains(orderType)) {
            KWHzl(C33129mqd.gEmmrt(abstractC48313uMw.fARcdN.getText()));
            return;
        }
        android.widget.ImageView imageView = abstractC48313uMw.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OcIXYQ() {
        java.lang.Object objM7377constructorimpl;
        if (this.hDKMBd != null) {
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        java.util.List<BotDetailsType> listEjfBZ = ejfBZ();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        this.hDKMBd = new C47976uAj<>(supportFragmentManager, listEjfBZ, lifecycle, C56390yDp.OLrzqt(((TacticsDetailPresenter) gHZMYf()).AhwBna(), valueOf));
        ((AbstractC48313uMw) sSMYrx()).hDKMBd.setAdapter(this.hDKMBd);
        if (ejfBZ().size() >= 5) {
            ((AbstractC48313uMw) sSMYrx()).hDKMBd.setOffscreenPageLimit(3);
        }
        android.view.View childAt = ((AbstractC48313uMw) sSMYrx()).hDKMBd.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("tabIndex");
        if (stringExtra != null) {
            final int iAhwBna = C33129mqd.AhwBna(stringExtra);
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(((AbstractC48313uMw) sSMYrx()).hDKMBd.postDelayed(new java.lang.Runnable() { // from class: o.wFi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC52272wFg.OLrzqt(this.EZpvd, iAhwBna);
                    }
                }, 200L)));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(((AbstractC48313uMw) sSMYrx()).copydefault.copydefault(), ((AbstractC48313uMw) sSMYrx()).hDKMBd, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wFm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                ActivityC52272wFg.OLrzqt(this.copydefault, tab, i);
            }
        });
        tabLayoutMediator.attach();
        this.iwGUEr = tabLayoutMediator;
        fJNWhG();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC52272wFg activityC52272wFg, int i) {
        ((AbstractC48313uMw) activityC52272wFg.sSMYrx()).hDKMBd.setCurrentItem(i, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(ActivityC52272wFg activityC52272wFg, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.wFw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return ActivityC52272wFg.AEQbTJ(view);
            }
        });
        BotDetailsType botDetailsType = activityC52272wFg.ejfBZ().get(i);
        tab.setText(activityC52272wFg.OLrzqt(botDetailsType, ((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).AhwBna()));
        tab.setContentDescription(botDetailsType.name() + "Tab");
    }

    public final java.lang.String OLrzqt(BotDetailsType botDetailsType, StrategyDetailsResponse strategyDetailsResponse) {
        if (botDetailsType == BotDetailsType.CONTRACT_GRID_PENDING_ORDER) {
            if (Intrinsics.EZpvd((java.lang.Object) (strategyDetailsResponse != null ? strategyDetailsResponse.getOrderType() : null), (java.lang.Object) "contract_grid")) {
                if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getActiveOrderCount(), (java.lang.Object) "0")) {
                    return C33070mpX.AYXKKw(botDetailsType.getTitle());
                }
                return C33070mpX.AYXKKw(botDetailsType.getTitle()) + " (" + strategyDetailsResponse.getActiveOrderCount() + ")";
            }
        }
        if (botDetailsType == BotDetailsType.HISTORY) {
            if (Intrinsics.EZpvd((java.lang.Object) (strategyDetailsResponse != null ? strategyDetailsResponse.getOrderType() : null), (java.lang.Object) "contract_grid")) {
                if (Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getTradeNum(), (java.lang.Object) "0")) {
                    return C33070mpX.AYXKKw(botDetailsType.getTitle());
                }
                return C33070mpX.AYXKKw(botDetailsType.getTitle()) + " (" + strategyDetailsResponse.getTradeNum() + ")";
            }
        }
        return C33070mpX.AYXKKw(botDetailsType.getTitle());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(StrategyDetailsResponse strategyDetailsResponse) {
        try {
            Result.Application application = Result.Companion;
            int tabCount = ((AbstractC48313uMw) sSMYrx()).copydefault.copydefault().getTabCount();
            for (int i = 0; i < tabCount; i++) {
                BotDetailsType botDetailsType = ejfBZ().get(i);
                TabLayout.Tab tabAt = ((AbstractC48313uMw) sSMYrx()).copydefault.copydefault().getTabAt(i);
                if (tabAt != null) {
                    tabAt.setText(OLrzqt(botDetailsType, strategyDetailsResponse));
                }
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void RcXXUw() {
        dNCPSb();
        C47976uAj<BotDetailsType> c47976uAj = this.hDKMBd;
        if (c47976uAj != null) {
            c47976uAj.OLrzqt();
        }
        C47976uAj<BotDetailsType> c47976uAj2 = this.hDKMBd;
        if (c47976uAj2 != null) {
            c47976uAj2.notifyDataSetChanged();
        }
        ((AbstractC48313uMw) sSMYrx()).hDKMBd.setCurrentItem(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v43, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v46, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v58, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v61, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: Presenter */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        if (((TacticsDetailPresenter) gHZMYf()).AhwBna().isHistory() && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getCancelType()))) {
            ((AbstractC48313uMw) sSMYrx()).DbNXlk.setText(new C55930xtI(true).AEQbTJ(((TacticsDetailPresenter) gHZMYf()).AhwBna().getCancelType(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState()).getFirst());
            ((AbstractC48313uMw) sSMYrx()).DbNXlk.setTextColor(new C55930xtI(true).AEQbTJ(((TacticsDetailPresenter) gHZMYf()).AhwBna().getCancelType(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState()).getSecond().intValue());
        } else {
            android.widget.TextView textView = ((AbstractC48313uMw) sSMYrx()).DbNXlk;
            C55930xtI c55930xtI = new C55930xtI(true);
            java.lang.String state = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState();
            java.lang.String orderType = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType();
            java.lang.String dcdState = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getDcdState();
            if (dcdState == null) {
                dcdState = "";
            }
            textView.setText(c55930xtI.KWHzl(state, orderType, dcdState).getFirst());
            android.widget.TextView textView2 = ((AbstractC48313uMw) sSMYrx()).DbNXlk;
            C55930xtI c55930xtI2 = new C55930xtI(true);
            java.lang.String state2 = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState();
            java.lang.String orderType2 = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType();
            java.lang.String dcdState2 = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getDcdState();
            if (dcdState2 == null) {
                dcdState2 = "";
            }
            textView2.setTextColor(c55930xtI2.KWHzl(state2, orderType2, dcdState2).getSecond().intValue());
        }
        ((AbstractC48313uMw) sSMYrx()).DbNXlk.setVisibility(0);
        java.lang.String orderType3 = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType();
        switch (orderType3.hashCode()) {
            case -1831183611:
                if (!orderType3.equals("spot_dca")) {
                    return;
                }
                break;
            case -1418042064:
                if (!orderType3.equals("ai_bot")) {
                    return;
                }
                break;
            case -1402017003:
                if (!orderType3.equals("contract_dca")) {
                    return;
                }
                break;
            case -1216369070:
                if (!orderType3.equals("smart_portfolio")) {
                    return;
                }
                break;
            case -1086683216:
                if (!orderType3.equals("signal_bot")) {
                    return;
                }
                break;
            case -591806012:
                if (!orderType3.equals("moon_grid")) {
                    return;
                }
                break;
            case -557961837:
                if (!orderType3.equals("smart_arbitrage")) {
                    return;
                }
                break;
            case -512749997:
                if (!orderType3.equals("contract_grid")) {
                    return;
                }
                break;
            case 3181382:
                if (!orderType3.equals("grid")) {
                    return;
                }
                break;
            case 1165749981:
                if (!orderType3.equals("recurring")) {
                    return;
                }
                break;
            case 1485620813:
                if (!orderType3.equals("dcd_bot")) {
                    return;
                }
                break;
            default:
                return;
        }
        ViewGroup.LayoutParams layoutParams = ((AbstractC48313uMw) sSMYrx()).isConnected.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C33570myu.gEmmrt(this);
        }
        android.widget.ImageView imageView = ((AbstractC48313uMw) sSMYrx()).isConnected;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = ((AbstractC48313uMw) sSMYrx()).isConnected;
        imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, this, orderType3));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void iwGUEr() {
        OKReminder oKReminder = ((AbstractC48313uMw) sSMYrx()).AhwBna;
        Intrinsics.checkNotNullExpressionValue(oKReminder, "");
        final TacticsData tacticsDataZLjUOn = ((TacticsDetailPresenter) gHZMYf()).zLjUOn();
        wSY wsy = wSY.OLrzqt;
        java.lang.String state = tacticsDataZLjUOn.getState();
        BotVo bot = tacticsDataZLjUOn.getBot();
        if (wsy.copydefault(state, bot != null ? bot.getCompliancePauseDisplayType() : null, oKReminder, new Function1() { // from class: o.wFh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52272wFg.KWHzl(tacticsDataZLjUOn, this, ((java.lang.Boolean) obj).booleanValue());
            }
        })) {
            return;
        }
        StrategyDetailsResponse strategyDetailsResponseAhwBna = ((TacticsDetailPresenter) gHZMYf()).AhwBna();
        wsy.OLrzqt(strategyDetailsResponseAhwBna.getOrderType(), strategyDetailsResponseAhwBna.getOutOfRange(), strategyDetailsResponseAhwBna.getSourceCcy(), strategyDetailsResponseAhwBna.getState(), oKReminder, new Function0() { // from class: o.wFe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC52272wFg.djBIcL(this.copydefault);
            }
        });
    }

    public static final Unit KWHzl(TacticsData tacticsData, ActivityC52272wFg activityC52272wFg, boolean z) {
        BotVo bot = tacticsData.getBot();
        if (Intrinsics.EZpvd((java.lang.Object) (bot != null ? bot.getCompliancePauseDisplayType() : null), (java.lang.Object) "complianceResumeFail")) {
            BotOperatorButtonDisposer.dispose$default(activityC52272wFg.QOLQEE(), "complianceResumeFail", tacticsData, null, null, null, null, 56, null);
        } else {
            BotVo bot2 = tacticsData.getBot();
            if (Intrinsics.EZpvd((java.lang.Object) (bot2 != null ? bot2.getCompliancePauseDisplayType() : null), (java.lang.Object) "compliancePause")) {
                ((InterfaceC8109awY) C43251rlk.copydefault(InterfaceC8109awY.class)).OLrzqt(activityC52272wFg, activityC52272wFg, "130", new Function0() { // from class: o.wFr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC52272wFg.values();
                    }
                }, new Function0() { // from class: o.wFt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC52272wFg.AkhnZx();
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit values() {
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(ActivityC52272wFg activityC52272wFg) {
        C50303vJk c50303vJkAEQbTJ = C50303vJk.Companion.AEQbTJ(((TacticsDetailPresenter) activityC52272wFg.gHZMYf()).zLjUOn());
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC52272wFg.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c50303vJkAEQbTJ.show(supportFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.lang.String str) {
        android.widget.TextView textView = ((AbstractC48313uMw) sSMYrx()).fARcdN;
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            str = ((TacticsDetailPresenter) gHZMYf()).fetchVPNInfo();
        }
        textView.setText(str);
        ((AbstractC48313uMw) sSMYrx()).fJNWhG.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean zsXlph() {
        C55254xgV c55254xgV = ((AbstractC48313uMw) sSMYrx()).copydefault;
        Intrinsics.checkNotNullExpressionValue(c55254xgV, "");
        android.view.View childAt = c55254xgV.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        int width = childAt.getWidth();
        if (C55296xhK.OLrzqt(this)) {
            if (c55254xgV.getWidth() + c55254xgV.getScrollX() >= width + c55254xgV.getPaddingLeft() + c55254xgV.getPaddingRight()) {
                return false;
            }
        } else if (c55254xgV.getWidth() + c55254xgV.getScrollX() < width + c55254xgV.getPaddingLeft() + c55254xgV.getPaddingRight()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
        android.widget.LinearLayout linearLayout = ((AbstractC48313uMw) sSMYrx()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        ((AbstractC48313uMw) sSMYrx()).fetchVPNInfo.setText(C33070mpX.AYXKKw(Intrinsics.EZpvd((java.lang.Object) botLeadProfitProfitOrderDetails.getStatus(), (java.lang.Object) "stopped") ? C55688xof.Application.onPrepareFromSearch : C55688xof.Application.setMediaButtonReceiver));
        java.lang.String accumulatedProfitSharing = Intrinsics.EZpvd((java.lang.Object) botLeadProfitProfitOrderDetails.getStatus(), (java.lang.Object) "stopped") ? botLeadProfitProfitOrderDetails.getAccumulatedProfitSharing() : botLeadProfitProfitOrderDetails.getEstimatedProfitSharing();
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.heceqZ);
        if (drawableKWHzl != null) {
            drawableKWHzl.setAutoMirrored(true);
        }
        ((AbstractC48313uMw) sSMYrx()).values.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawableKWHzl, (android.graphics.drawable.Drawable) null);
        android.widget.TextView textView = ((AbstractC48313uMw) sSMYrx()).values;
        java.lang.String profitSharingCcy = botLeadProfitProfitOrderDetails.getProfitSharingCcy();
        textView.setText(C56033xvF.fmtBotValueBySymbol$default(profitSharingCcy == null ? "" : profitSharingCcy, accumulatedProfitSharing == null ? "" : accumulatedProfitSharing, RoundingMode.DOWN, true, null, false, ((TacticsDetailPresenter) gHZMYf()).AhwBna().getInstType(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getInstId(), null, null, null, 1840, null));
        android.widget.TextView textView2 = ((AbstractC48313uMw) sSMYrx()).fetchVPNInfo;
        textView2.setOnClickListener(new Dialog(textView2, 1000L, this, botLeadProfitProfitOrderDetails));
        android.widget.TextView textView3 = ((AbstractC48313uMw) sSMYrx()).values;
        textView3.setOnClickListener(new Fragment(textView3, 1000L, this, botLeadProfitProfitOrderDetails));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(BotLeadProfitProfitOrderDetails botLeadProfitProfitOrderDetails) {
        ActivityC51164vhp.Companion.EZpvd(this, new BotLeadStrateShowData(((TacticsDetailPresenter) gHZMYf()).AhwBna().getInstId(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getInstType(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getAlgoOrdType(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getDirection(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getLever(), botLeadProfitProfitOrderDetails.getFollowerCount(), botLeadProfitProfitOrderDetails.getTotalPnl(), botLeadProfitProfitOrderDetails.getProfitSharingCcy(), ((TacticsDetailPresenter) gHZMYf()).AhwBna().getAlgoId()));
        RJOkX();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean wlaJM() {
        if (!Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) "no_close_position") && Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState(), (java.lang.Object) "no_close_position")) {
            this.fJNWhG = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState();
            return true;
        }
        this.fJNWhG = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState();
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AubY() {
        if (Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState(), (java.lang.Object) "no_close_position")) {
            if (((AbstractC48313uMw) sSMYrx()).OLrzqt.copydefault() || ((Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), (java.lang.Object) "contract_grid") || Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), (java.lang.Object) "contract_dca")) && wlaJM())) {
                RcXXUw();
            }
        } else if (((TacticsDetailPresenter) gHZMYf()).AuCTelauCTel()) {
            RcXXUw();
        }
        getTAG();
        zLjUOn();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zLjUOn() {
        java.util.List<TacticsListButtonItem> listAhwBna;
        if (fIwbmz().contains(ejfBZ().get(((TacticsDetailPresenter) gHZMYf()).DbNXlk()))) {
            C55998xuX c55998xuX = C55998xuX.copydefault;
            listAhwBna = c55998xuX.AkhnZx(c55998xuX.KWHzl(((TacticsDetailPresenter) gHZMYf()).AhwBna(), getFieldNames())).getFirst();
        } else {
            listAhwBna = yDY.AhwBna();
        }
        ((AbstractC48313uMw) sSMYrx()).OLrzqt.setData(listAhwBna, ((TacticsDetailPresenter) gHZMYf()).zLjUOn(), new yHO() { // from class: o.wFj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC52272wFg.copydefault(this.OLrzqt, (java.lang.String) obj, (TacticsData) obj2, (Function0) obj3);
            }
        }, new yHO() { // from class: o.wFq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC52272wFg.AEQbTJ(this.OLrzqt, (java.lang.String) obj, (TacticsData) obj2, (java.lang.String) obj3);
            }
        });
    }

    public static final Unit copydefault(ActivityC52272wFg activityC52272wFg, java.lang.String str, TacticsData tacticsData, Function0 function0) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        if (yDY.gEmmrt("grid", "contract_grid").contains(tacticsData.getOrderType())) {
            activityC52272wFg.values = str;
            activityC52272wFg.isConnected = function0;
            activityC52272wFg.showLoading();
            activityC52272wFg.AuCTelauCTel();
        } else {
            BotOperatorButtonDisposer.dispose$default(activityC52272wFg.QOLQEE(), str, tacticsData, function0, null, activityC52272wFg.AxsJAY().AhwBna(), null, 32, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC52272wFg activityC52272wFg, java.lang.String str, TacticsData tacticsData, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        activityC52272wFg.QOLQEE().copydefault(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTel() {
        if (((TacticsDetailPresenter) gHZMYf()).AubY()) {
            return;
        }
        int iAhwBna = C33129mqd.AhwBna(getIntent().getStringExtra("detailAction"));
        if (iAhwBna == TacticsDetailsActionEnum.ACTION_ADD_MARGIN.getCode()) {
            BotOperatorButtonDisposer botOperatorButtonDisposerQOLQEE = QOLQEE();
            TacticsData tacticsDataZLjUOn = ((TacticsDetailPresenter) gHZMYf()).zLjUOn();
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            botOperatorButtonDisposerQOLQEE.AEQbTJ(tacticsDataZLjUOn, supportFragmentManager);
        } else if (iAhwBna == TacticsDetailsActionEnum.ACTION_ADD_POSITION.getCode()) {
            BotOperatorButtonDisposer botOperatorButtonDisposerQOLQEE2 = QOLQEE();
            TacticsData tacticsDataZLjUOn2 = ((TacticsDetailPresenter) gHZMYf()).zLjUOn();
            androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            botOperatorButtonDisposerQOLQEE2.KWHzl(tacticsDataZLjUOn2, supportFragmentManager2);
        } else if (iAhwBna == TacticsDetailsActionEnum.ACTION_ADJUST_TP_PRICE.getCode()) {
            BotOperatorButtonDisposer botOperatorButtonDisposerQOLQEE3 = QOLQEE();
            TacticsData tacticsDataZLjUOn3 = ((TacticsDetailPresenter) gHZMYf()).zLjUOn();
            androidx.fragment.app.FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
            botOperatorButtonDisposerQOLQEE3.OLrzqt(tacticsDataZLjUOn3, supportFragmentManager3);
        } else if (iAhwBna == TacticsDetailsActionEnum.ACTION_EDIT_PARAM.getCode()) {
            BotOperatorButtonDisposer botOperatorButtonDisposerQOLQEE4 = QOLQEE();
            TacticsData tacticsDataZLjUOn4 = ((TacticsDetailPresenter) gHZMYf()).zLjUOn();
            androidx.fragment.app.FragmentManager supportFragmentManager4 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
            botOperatorButtonDisposerQOLQEE4.copydefault(tacticsDataZLjUOn4, supportFragmentManager4);
        } else if (iAhwBna == TacticsDetailsActionEnum.NAVIGATE_EVENT_HISTORY.getCode()) {
            QVAiDq();
        }
        getIntent().removeExtra("detailAction");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.wDo.OLrzqt()V */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC52662wTs
    public TradeLiveData<java.util.ArrayList<java.lang.Object>> OLrzqt() {
        return ((TacticsDetailPresenter) gHZMYf()).fJNWhG();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC52662wTs
    public void copydefault(@NotNull java.lang.String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        C55284xgz.Activity activity = C55284xgz.Companion;
        C52567wQe c52567wQe = ((AbstractC48313uMw) sSMYrx()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c52567wQe, "");
        C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(this, c52567wQe, str);
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.isConnected(i);
            c55284xgzAEQbTJ.hDKMBd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC52662wTs
    public void EZpvd(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        ((TacticsDetailPresenter) gHZMYf()).gHZMYf();
    }

    private final void RJOkX() {
        C32866mlf.onEvent$default("LeadBotDetails_ProfitSharing_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    private final void dNCPSb() {
        this.AhwBna.clear();
        ejfBZ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1086=13] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v32, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v35, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v60, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v69, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v74, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v82, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v87, resolved type: Presenter */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<BotDetailsType> ejfBZ() {
        if (!this.AhwBna.isEmpty()) {
            return this.AhwBna;
        }
        java.util.ArrayList<BotDetailsType> arrayList = this.AhwBna;
        java.lang.String orderType = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                if (orderType.equals("spot_dca")) {
                    arrayList.add(BotDetailsType.OVERVIEW);
                    if (!((TacticsDetailPresenter) gHZMYf()).AubY() && !Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState(), (java.lang.Object) "no_close_position")) {
                        arrayList.add(BotDetailsType.ONGOING);
                    }
                    if (Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), (java.lang.Object) "contract_dca") && ((((TacticsDetailPresenter) gHZMYf()).AubY() && Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState(), (java.lang.Object) "stopped")) || Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState(), (java.lang.Object) "no_close_position"))) {
                        arrayList.add(BotDetailsType.NO_CLOSE_POSITION);
                    }
                    arrayList.add(BotDetailsType.HISTORY);
                    arrayList.add(BotDetailsType.PARAMETER);
                }
                break;
            case -1418042064:
                if (orderType.equals("ai_bot")) {
                    this.AhwBna.add(BotDetailsType.OVERVIEW);
                    if (!((TacticsDetailPresenter) gHZMYf()).AubY()) {
                        this.AhwBna.add(BotDetailsType.AI_CURRENT_POSITIONS);
                    }
                    this.AhwBna.addAll(yDY.gEmmrt(BotDetailsType.AI_ORDER_HISTORY, BotDetailsType.AI_THINKING_LIST, BotDetailsType.LLM_SIGNAL_DETAILS));
                }
                break;
            case -1402017003:
                if (orderType.equals("contract_dca")) {
                }
                break;
            case -1216369070:
                if (orderType.equals("smart_portfolio")) {
                    arrayList.add(BotDetailsType.PNL);
                    arrayList.add(BotDetailsType.BOT_INFO);
                    arrayList.add(BotDetailsType.HISTORY);
                }
                break;
            case -1148661171:
                if (orderType.equals("smart_iceberg")) {
                    this.AhwBna.add(BotDetailsType.BOT_INFO);
                    if (!Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getInstType(), (java.lang.Object) "SPOT")) {
                        this.AhwBna.add(BotDetailsType.POSITION);
                    }
                    this.AhwBna.add(BotDetailsType.SMART_SLICED_ORDER);
                    this.AhwBna.add(BotDetailsType.HISTORY);
                }
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    this.AhwBna.add(BotDetailsType.PNL);
                    this.AhwBna.add(BotDetailsType.BOT_INFO);
                    if (!((TacticsDetailPresenter) gHZMYf()).AhwBna().isHistory()) {
                        this.AhwBna.add(BotDetailsType.SIGNAL_POSITION);
                    }
                    if (!((TacticsDetailPresenter) gHZMYf()).AhwBna().isHistory()) {
                        this.AhwBna.add(BotDetailsType.SMART_SLICED_ORDER);
                    }
                    this.AhwBna.add(BotDetailsType.HISTORY_EVENT);
                    this.AhwBna.add(BotDetailsType.HISTORY_POSITION);
                }
                break;
            case -591806012:
                if (orderType.equals("moon_grid")) {
                    arrayList.add(BotDetailsType.PNL);
                    arrayList.add(BotDetailsType.BOT_INFO);
                    if (!((TacticsDetailPresenter) gHZMYf()).AubY()) {
                        arrayList.add(BotDetailsType.GRID_PENDING_ORDER);
                    }
                    arrayList.add(BotDetailsType.HISTORY);
                }
                break;
            case -557961837:
                if (orderType.equals("smart_arbitrage")) {
                    this.AhwBna.addAll(yDY.gEmmrt(BotDetailsType.OVERVIEW, BotDetailsType.PROFITS, BotDetailsType.ARBITRAGE_POSITIONING));
                }
                break;
            case -512749997:
                if (orderType.equals("contract_grid")) {
                    java.util.ArrayList<BotDetailsType> arrayList2 = this.AhwBna;
                    arrayList2.add(BotDetailsType.OVERVIEW);
                    if (!((TacticsDetailPresenter) gHZMYf()).AubY() && !Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getState(), (java.lang.Object) "stopped")) {
                        arrayList2.add(BotDetailsType.CONTRACT_GRID_PENDING_ORDER);
                    }
                    arrayList2.add(BotDetailsType.HISTORY);
                    arrayList2.add(BotDetailsType.PARAMETER);
                }
                break;
            case 3181382:
                if (orderType.equals("grid")) {
                    arrayList.add(BotDetailsType.OVERVIEW);
                    if (!((TacticsDetailPresenter) gHZMYf()).AubY() && !Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getCopyType(), (java.lang.Object) "2")) {
                        arrayList.add(BotDetailsType.GRID_PENDING_ORDER);
                    }
                    arrayList.add(BotDetailsType.HISTORY);
                    arrayList.add(BotDetailsType.PARAMETER);
                }
                break;
            case 3573234:
                if (orderType.equals("twap")) {
                    this.AhwBna.addAll(yDY.gEmmrt(BotDetailsType.BOT_INFO, BotDetailsType.POSITION, BotDetailsType.HISTORY));
                }
                break;
            case 1165749981:
                if (orderType.equals("recurring")) {
                    arrayList.add(BotDetailsType.OVERVIEW);
                    arrayList.add(BotDetailsType.HISTORY);
                    arrayList.add(BotDetailsType.PARAMETER);
                }
                break;
            case 1485620813:
                if (orderType.equals("dcd_bot")) {
                    this.AhwBna.add(BotDetailsType.PNL);
                    this.AhwBna.add(BotDetailsType.BOT_INFO);
                    this.AhwBna.add(BotDetailsType.DCD_ARB_RECORD);
                }
                break;
            case 1629187779:
                if (orderType.equals("iceberg")) {
                    this.AhwBna.addAll(yDY.gEmmrt(BotDetailsType.BOT_INFO, BotDetailsType.POSITION, BotDetailsType.SLICED_ORDER, BotDetailsType.HISTORY));
                }
                break;
        }
        return this.AhwBna;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getFieldNames() {
        if (Intrinsics.EZpvd((java.lang.Object) ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType(), (java.lang.Object) "contract_grid")) {
            if (CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Object>) C56402yEa.EZpvd(BotDetailsType.CONTRACT_GRID_PENDING_ORDER), CollectionsKt___CollectionsKt.AkhnZx(ejfBZ(), ((TacticsDetailPresenter) gHZMYf()).DbNXlk()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r0.equals("contract_grid") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (r0.equals("smart_arbitrage") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r0.equals("contract_dca") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r0.equals("ai_bot") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r0.equals("spot_dca") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r0.equals("recurring") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r0.equals("grid") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<BotDetailsType> fIwbmz() {
        java.lang.String orderType = ((TacticsDetailPresenter) gHZMYf()).AhwBna().getOrderType();
        switch (orderType.hashCode()) {
            case -1831183611:
                break;
            case -1418042064:
                break;
            case -1402017003:
                break;
            case -1086683216:
                if (orderType.equals("signal_bot")) {
                    return yDY.gEmmrt(BotDetailsType.PNL, BotDetailsType.BOT_INFO);
                }
                return ejfBZ();
            case -557961837:
                break;
            case -512749997:
                break;
            case 3181382:
                break;
            case 1165749981:
                break;
            default:
                return ejfBZ();
        }
        return yDY.AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QVAiDq() {
        java.util.Iterator<BotDetailsType> it = ejfBZ().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() == BotDetailsType.OVERVIEW) {
                break;
            } else {
                i++;
            }
        }
        ((AbstractC48313uMw) sSMYrx()).hDKMBd.setCurrentItem(i, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC52226wDo, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            CoroutineScopeKt.cancel$default(LifecycleOwnerKt.getLifecycleScope(this), null, 1, null);
        } catch (java.lang.Exception e) {
            pUU.KWHzl(getTAG(), "Failed to cancel lifecycleScope: " + e.getMessage());
        }
        TabLayoutMediator tabLayoutMediator = this.iwGUEr;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.iwGUEr = null;
        ((AbstractC48313uMw) sSMYrx()).hDKMBd.setAdapter(null);
        java.lang.String str = this.fetchVPNInfo;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
        super.onDestroy();
    }

    @Override // o.AbstractActivityC52226wDo, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC52226wDo, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
