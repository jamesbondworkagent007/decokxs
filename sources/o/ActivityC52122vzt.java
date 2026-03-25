package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$initListener$1$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$subscribeOnUIChange$12$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$subscribeOnUIChange$3$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$subscribeOnUIChange$4$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$subscribeOnUIChange$6$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$subscribeOnUIChange$7$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$subscribeOnUIChange$8$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$subscribeOnUIChange$9$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$switchCoinCall$1;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import o.InterfaceC47981uAo;
import o.vBQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vzt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC52122vzt extends AbstractActivityC52100vzX<AbstractC48301uMk, BotTradePresenter> implements InterfaceC49436uoX, InterfaceC55882xsN, InterfaceC49514upw, InterfaceC48164uHi {
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("twap", "smart_iceberg");
    public final java.util.List<java.lang.String> djBIcL = yDY.gEmmrt("MARGIN", "SPOT");

    /* JADX INFO: renamed from: o.vzt$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: RETURN  */
    public static final void showErrorLayout$lambda$29(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.copydefault;
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotTradePresenter AEQbTJ(ActivityC52122vzt activityC52122vzt) {
        return (BotTradePresenter) activityC52122vzt.gHZMYf();
    }

    public ActivityC52122vzt() {
        final Function0 function0 = null;
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(C56132xwz.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$special$$inlined$viewModels$default$3
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
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(vBJ.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.BotTradeActivity$special$$inlined$viewModels$default$6
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

    /* JADX INFO: renamed from: o.vzt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vzt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull BotTradeData botTradeData, java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Integer num, java.lang.String str2, android.os.Parcelable parcelable, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(botTradeData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC52122vzt.class);
            intent.putExtra("bot_trade_data", botTradeData);
            if (map != null) {
                intent.putExtra("bot_track_param", map);
            }
            if (str != null) {
                intent.putExtra("bot_trade_source", str);
            }
            if (str2 != null) {
                intent.putExtra(AppsFlyerProperties.CHANNEL, str2);
            }
            if (num != null) {
                intent.addFlags(num.intValue());
            }
            if (str3 != null) {
                intent.putExtra(OtcExtraKeys.ORDER, str3);
            }
            if (parcelable != null) {
                intent.putExtra("bot_copy_req", parcelable);
                intent.putExtra("bot_one_click_copy", true);
            }
            context.startActivity(intent);
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull BotTradeData botTradeData, java.util.HashMap<java.lang.String, java.lang.String> map, java.lang.String str, java.lang.Integer num, java.lang.String str2, android.os.Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(botTradeData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC52122vzt.class);
            intent.putExtra("bot_trade_data", botTradeData);
            if (map != null) {
                intent.putExtra("bot_track_param", map);
            }
            if (str != null) {
                intent.putExtra("bot_trade_source", str);
            }
            if (str2 != null) {
                intent.putExtra(AppsFlyerProperties.CHANNEL, str2);
            }
            if (num != null) {
                intent.addFlags(num.intValue());
            }
            if (parcelable != null) {
                intent.putExtra("bot_copy_req", parcelable);
                intent.putExtra("bot_one_click_copy", true);
            }
            return intent;
        }
    }

    private final C56132xwz fARcdN() {
        return (C56132xwz) this.AhwBna.getValue();
    }

    public final vBJ AkhnZx() {
        return (vBJ) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xvA.registerBotActivityTrack$default(androidx.activity.ComponentActivity, java.lang.String, kotlin.Pair[], kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC52100vzX, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((BotTradePresenter) gHZMYf()).EZpvd(this);
        ((BotTradePresenter) gHZMYf()).EZpvd(getOkQPL());
        AuCTel();
        ejfBZ();
        OLrzqt(getIntent().getExtras(), true);
        fJNWhG();
        hDKMBd();
        C56028xvA.registerBotActivityTrack$default(this, "BotTradeActivity", new kotlin.Pair[0], null, 8, null);
        ((AbstractC48301uMk) sSMYrx()).AEQbTJ.setCallbacks(new Function0() { // from class: o.vzD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(ActivityC52122vzt.valueOf());
            }
        }, new Function0() { // from class: o.vzG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC52122vzt.gEmmrt();
            }
        }, new Function0() { // from class: o.vzI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC52122vzt.djBIcL();
            }
        });
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final boolean valueOf() {
        InterfaceC49504upm interfaceC49504upm = (InterfaceC49504upm) C43251rlk.OLrzqt(InterfaceC49504upm.class);
        return interfaceC49504upm != null && interfaceC49504upm.KWHzl();
    }

    public static final Unit gEmmrt() {
        C53685wqE.copydefault.copydefault().KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        C53685wqE.copydefault.copydefault().OLrzqt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC52100vzX, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((BotTradePresenter) gHZMYf()).KWHzl();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        ((BotTradePresenter) gHZMYf()).OLrzqt(this);
        BotTradePresenter botTradePresenter = (BotTradePresenter) gHZMYf();
        android.view.View root = ((AbstractC48301uMk) sSMYrx()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        botTradePresenter.OLrzqt(root);
        AbstractC48301uMk abstractC48301uMk = (AbstractC48301uMk) sSMYrx();
        abstractC48301uMk.AEQbTJ.EZpvd(false);
        abstractC48301uMk.djBIcL.setTag("header_tag");
        abstractC48301uMk.copydefault.setTag("container_tag");
        abstractC48301uMk.KWHzl.setSwitchBot(C56071xvr.gEmmrt.copydefault(((BotTradePresenter) gHZMYf()).ejfBZ()));
        android.widget.FrameLayout frameLayout = abstractC48301uMk.fIwbmz;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        wPQ.OLrzqt(frameLayout);
        android.widget.TextView textView = abstractC48301uMk.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        wPQ.OLrzqt(textView);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        ((BotTradePresenter) gHZMYf()).KWHzl(getIntent().getExtras());
        this.EZpvd = getIntent().getStringExtra(AppsFlyerProperties.CHANNEL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        ((AbstractC48301uMk) sSMYrx()).fetchVPNInfo.OLrzqt(new InterfaceC57903yrG() { // from class: o.vzz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC52122vzt.copydefault(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        ((AbstractC48301uMk) sSMYrx()).isConnected.setKlineControl(new Function0() { // from class: o.vzA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC52122vzt.EZpvd(this.KWHzl);
            }
        });
        C59541ziw.EZpvd(this, this, new InterfaceC59496ziD() { // from class: o.vzF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                ActivityC52122vzt.copydefault(this.OLrzqt, z);
            }
        });
        getOnBackPressedDispatcher().addCallback(this, new ActionBar());
    }

    public static final void copydefault(ActivityC52122vzt activityC52122vzt, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$initListener$1$1(activityC52122vzt, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC52122vzt activityC52122vzt) {
        InterfaceC49504upm interfaceC49504upm = (InterfaceC49504upm) C43251rlk.OLrzqt(InterfaceC49504upm.class);
        if (interfaceC49504upm != null && interfaceC49504upm.KWHzl()) {
            RxBus.AEQbTJ(new C49418uoF(""));
        } else {
            InterfaceC47981uAo.Application.openKline$default(((AbstractC48301uMk) activityC52122vzt.sSMYrx()).AEQbTJ, null, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(ActivityC52122vzt activityC52122vzt, boolean z) {
        final android.widget.FrameLayout frameLayout = ((AbstractC48301uMk) activityC52122vzt.sSMYrx()).AkhnZx;
        if (z) {
            Intrinsics.copydefault(frameLayout);
            frameLayout.setVisibility(8);
        } else {
            activityC52122vzt.postDelay(new java.lang.Runnable() { // from class: o.vzu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC52122vzt.EZpvd(frameLayout);
                }
            }, 100L);
        }
    }

    public static final void EZpvd(android.widget.FrameLayout frameLayout) {
        Intrinsics.copydefault(frameLayout);
        frameLayout.setVisibility(0);
    }

    /* JADX INFO: renamed from: o.vzt$ActionBar */
    public static final class ActionBar extends OnBackPressedCallback {
        public ActionBar() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            ActivityC52122vzt.AEQbTJ(ActivityC52122vzt.this).valueOf();
            ActivityC52122vzt.this.finish();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        ((BotTradePresenter) gHZMYf()).AkhnZx().fetchVPNInfo().AEQbTJ(this, new Function1() { // from class: o.vzw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.valueOf(this.OLrzqt, (kotlin.Pair) obj);
            }
        });
        ((BotTradePresenter) gHZMYf()).AkhnZx().AkhnZx().observe(this, new StateListAnimator(new Function1() { // from class: o.vzL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.AEQbTJ(this.KWHzl, (java.lang.String) obj);
            }
        }));
        ((BotTradePresenter) gHZMYf()).fIwbmz().observe(this, new StateListAnimator(new Function1() { // from class: o.vzM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.AEQbTJ(this.copydefault, (ParamBuilder) obj);
            }
        }));
        ((BotTradePresenter) gHZMYf()).values().observe(this, new StateListAnimator(new Function1() { // from class: o.vzQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.EZpvd(this.OLrzqt, (BotTradeData) obj);
            }
        }));
        fARcdN().values().observe(this, new StateListAnimator(new Function1() { // from class: o.vzP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.EZpvd(this.copydefault, (ParamBuilder) obj);
            }
        }));
        fARcdN().djBIcL().AEQbTJ(this, new Function1() { // from class: o.vzR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.KWHzl(this.EZpvd, (BizInstrument) obj);
            }
        });
        fARcdN().fIwbmz().AEQbTJ(this, new Function1() { // from class: o.vzO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.EZpvd(this.OLrzqt, (Unit) obj);
            }
        });
        fARcdN().fJNWhG().AEQbTJ(this, new Function1() { // from class: o.vzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.AEQbTJ(this.EZpvd, (Unit) obj);
            }
        });
        fARcdN().AkhnZx().AEQbTJ(this, new Function1() { // from class: o.vzC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.djBIcL(this.EZpvd, (ParamBuilder) obj);
            }
        });
        fARcdN().AuCTel().AEQbTJ(this, new Function1() { // from class: o.vzy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.copydefault(this.AEQbTJ, (kotlin.Pair) obj);
            }
        });
        AkhnZx().AhwBna().observe(this, new StateListAnimator(new Function1() { // from class: o.vzK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.AYXKKw(this.AEQbTJ, (Unit) obj);
            }
        }));
        ((AbstractC48301uMk) sSMYrx()).KWHzl.EZpvd().observe(this, new StateListAnimator(new Function1() { // from class: o.vzJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC52122vzt.KWHzl(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit valueOf(ActivityC52122vzt activityC52122vzt, kotlin.Pair pair) {
        java.lang.String strAYXKKw;
        android.os.Bundle bundle;
        Intrinsics.checkNotNullParameter(pair, "");
        if (!((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            BotTradePresenter botTradePresenter = (BotTradePresenter) activityC52122vzt.gHZMYf();
            ParamBuilder paramBuilder = (ParamBuilder) pair.getSecond();
            if (paramBuilder == null || (bundle = paramBuilder.getBundle()) == null || (strAYXKKw = bundle.getString("errorMgs")) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            botTradePresenter.KWHzl(strAYXKKw);
        } else {
            activityC52122vzt.OLrzqt((ParamBuilder) pair.getSecond());
            BotTradePresenter botTradePresenter2 = (BotTradePresenter) activityC52122vzt.gHZMYf();
            ParamBuilder paramBuilder2 = (ParamBuilder) pair.getSecond();
            botTradePresenter2.AEQbTJ(paramBuilder2 != null ? paramBuilder2.isCountDown() : null);
            activityC52122vzt.fARcdN().values().postValue(pair.getSecond());
            ((AbstractC48301uMk) activityC52122vzt.sSMYrx()).OLrzqt.copydefault();
        }
        ((BotTradePresenter) activityC52122vzt.gHZMYf()).valueOf();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [271=5] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Binding */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(ActivityC52122vzt activityC52122vzt, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd(activityC52122vzt.getTAG(), "initLoadingType change to " + str);
        switch (str.hashCode()) {
            case -1931790399:
                if (!str.equals("PULL_END")) {
                    ((BotTradePresenter) activityC52122vzt.gHZMYf()).gEmmrt();
                } else {
                    ((AbstractC48301uMk) activityC52122vzt.sSMYrx()).fetchVPNInfo.AEQbTJ();
                    InterfaceC47981uAo.Application.finishRefresh$default(((AbstractC48301uMk) activityC52122vzt.sSMYrx()).AEQbTJ, false, 1, null);
                }
                break;
            case -1515828795:
                if (str.equals("DISMISS_INIT")) {
                    ((BotTradePresenter) activityC52122vzt.gHZMYf()).gEmmrt();
                    break;
                }
                break;
            case 555374431:
                if (str.equals("LOADING_START")) {
                    ((BotTradePresenter) activityC52122vzt.gHZMYf()).getNewProxyInstance();
                    break;
                }
                break;
            case 912496914:
                if (str.equals("SHOW_INIT")) {
                    ((BotTradePresenter) activityC52122vzt.gHZMYf()).hDKMBd();
                    break;
                }
                break;
            case 1922349848:
                if (str.equals("LOADING_END")) {
                    ((BotTradePresenter) activityC52122vzt.gHZMYf()).AYXKKw();
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC52122vzt activityC52122vzt, ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        if (Intrinsics.EZpvd((java.lang.Object) paramBuilder.getStrategyType(), (java.lang.Object) "all_bot")) {
            activityC52122vzt.finish();
        } else {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$subscribeOnUIChange$3$1(activityC52122vzt, paramBuilder, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC52122vzt activityC52122vzt, BotTradeData botTradeData) {
        Intrinsics.checkNotNullParameter(botTradeData, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$subscribeOnUIChange$4$1(activityC52122vzt, ((BotTradePresenter) activityC52122vzt.gHZMYf()).EZpvd(botTradeData), null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(ActivityC52122vzt activityC52122vzt, ParamBuilder paramBuilder) {
        pUU.KWHzl(activityC52122vzt.getTAG(), "receiver refreshLv ");
        ((BotTradePresenter) activityC52122vzt.gHZMYf()).AEQbTJ();
        activityC52122vzt.getFieldNames();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC52122vzt activityC52122vzt, BizInstrument bizInstrument) {
        pUU.KWHzl(activityC52122vzt.getTAG(), "receiver marginModelSwitchLv ");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$subscribeOnUIChange$6$1(activityC52122vzt, bizInstrument, null), 3, null);
        ((BotTradePresenter) activityC52122vzt.gHZMYf()).iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC52122vzt activityC52122vzt, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl(activityC52122vzt.getTAG(), "receiver switchUnitInArbDepthLv ");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$subscribeOnUIChange$7$1(activityC52122vzt, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(ActivityC52122vzt activityC52122vzt, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        pUU.KWHzl(activityC52122vzt.getTAG(), "receiver switchUnitInDepthLv ");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$subscribeOnUIChange$8$1(activityC52122vzt, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ActivityC52122vzt activityC52122vzt, ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$subscribeOnUIChange$9$1(activityC52122vzt, paramBuilder, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vhb.Application.startActivity$default(o.vhb$Application, android.content.Context, java.lang.String, java.lang.String, java.util.HashMap, boolean, java.lang.String, java.lang.Integer, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(ActivityC52122vzt activityC52122vzt, kotlin.Pair pair) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(pair, "");
        InterfaceC55881xsM interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault();
        if (interfaceC55881xsMCopydefault != null) {
            xLY xlyFetchVPNInfo = ((BotTradePresenter) activityC52122vzt.gHZMYf()).fetchVPNInfo();
            if (!interfaceC55881xsMCopydefault.OLrzqt(new C55887xsS(xlyFetchVPNInfo.copydefault(), xlyFetchVPNInfo.KWHzl()).ejfBZ(), (java.lang.String) pair.getFirst())) {
                ActivityC51150vhb.Companion.AEQbTJ(activityC52122vzt, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : (java.lang.String) pair.getFirst(), (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : (java.lang.String) pair.getSecond(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : ((BotTradePresenter) activityC52122vzt.gHZMYf()).fARcdN(), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
            } else {
                ActivityC51125vhC.Companion.EZpvd(activityC52122vzt, (java.lang.String) pair.getFirst(), (java.lang.String) pair.getSecond());
            }
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = (java.lang.String) pair.getFirst();
        java.lang.String strKWHzl = ((BotTradePresenter) activityC52122vzt.gHZMYf()).fetchVPNInfo().KWHzl();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), str, strKWHzl, "success", new BotGrafanaInfo(null, null, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 7, null));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ActivityC52122vzt activityC52122vzt, Unit unit) {
        activityC52122vzt.getFieldNames();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(ActivityC52122vzt activityC52122vzt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            if (((BotTradePresenter) activityC52122vzt.gHZMYf()).fetchVPNInfo().EZpvd() == null) {
                return Unit.INSTANCE;
            }
            ((BotTradePresenter) activityC52122vzt.gHZMYf()).getFieldNames();
            ParamBuilder paramBuilderEZpvd = new ParamBuilder.ActionBar().copydefault(true).KWHzl(false).OLrzqt((java.lang.String) pair.getSecond()).KWHzl(((BotTradePresenter) activityC52122vzt.gHZMYf()).fetchVPNInfo().copydefault()).copydefault(((BotTradePresenter) activityC52122vzt.gHZMYf()).fetchVPNInfo().KWHzl()).EZpvd();
            pUU.KWHzl(activityC52122vzt.getTAG(), C59442zhC.fJNWhG("\n                        Clicked on botTradeToolbar switchBot to " + pair.getSecond() + ", params: " + paramBuilderEZpvd + "\n                    "));
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC52122vzt), null, null, new BotTradeActivity$subscribeOnUIChange$12$1(activityC52122vzt, paramBuilderEZpvd, null), 3, null);
            ((AbstractC48301uMk) activityC52122vzt.sSMYrx()).isConnected.isConnected();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vwR.refreshBotName$default(o.vwR, java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void getFieldNames() {
        C51935vwR.refreshBotName$default(((AbstractC48301uMk) sSMYrx()).KWHzl, null, 1, null);
        ((AbstractC48301uMk) sSMYrx()).isConnected.AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC52100vzX, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        dismissLoading();
        ((BotTradePresenter) gHZMYf()).copydefault();
    }

    @Override // o.AbstractActivityC52100vzX, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        java.lang.String str = this.EZpvd;
        if (str != null) {
            C56058xve.Companion.copydefault().AEQbTJ(str);
        }
        super.onDestroy();
        DbNXlk();
    }

    @Override // o.InterfaceC49436uoX
    public androidx.fragment.app.FragmentManager copydefault() {
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        return supportFragmentManager;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC49436uoX
    public android.view.View AEQbTJ() {
        android.view.View root = ((AbstractC48301uMk) sSMYrx()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public void DbNXlk() {
        ((BotTradePresenter) gHZMYf()).OLrzqt();
    }

    @Override // o.InterfaceC49436uoX
    public void EZpvd(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ParamBuilder.ActionBar actionBarKWHzl = new ParamBuilder.ActionBar().KWHzl(false);
        if (str2 == null) {
            str2 = "";
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotTradeActivity$switchCoinCall$1(this, actionBarKWHzl.OLrzqt(str2).KWHzl(str4).copydefault(str3).EZpvd(), null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(ParamBuilder paramBuilder) {
        java.lang.String strOLrzqt;
        xOU xouWlaJM;
        if (paramBuilder == null || (strOLrzqt = paramBuilder.getStrategyType()) == null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            strOLrzqt = (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null) ? null : xouWlaJM.OLrzqt();
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
        }
        java.lang.String strCopydefault = ((BotTradePresenter) gHZMYf()).fetchVPNInfo().copydefault();
        if (this.KWHzl.contains(strOLrzqt) && this.djBIcL.contains(strCopydefault)) {
            return C56390yDp.OLrzqt(strOLrzqt, strOLrzqt + "SPOTMARGIN");
        }
        return C56390yDp.OLrzqt(strOLrzqt, strOLrzqt + strCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v12, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(ParamBuilder paramBuilder) {
        android.os.Bundle bundle;
        androidx.fragment.app.Fragment fragmentAEQbTJ;
        java.lang.Object obj;
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = copydefault(paramBuilder);
        java.lang.String strComponent1 = pairCopydefault.component1();
        java.lang.String strComponent2 = pairCopydefault.component2();
        boolean zIsScrollTop = paramBuilder != null ? paramBuilder.isScrollTop() : false;
        ParamBuilder paramBuilderIsConnected = ((BotTradePresenter) gHZMYf()).isConnected();
        if (paramBuilderIsConnected == null || (bundle = paramBuilderIsConnected.getBundle()) == null) {
            bundle = new android.os.Bundle();
        }
        java.lang.String instId = paramBuilder != null ? paramBuilder.getInstId() : null;
        java.lang.String instType = paramBuilder != null ? paramBuilder.getInstType() : null;
        if (!bundle.containsKey("bot_inst_id") && instId != null && instId.length() != 0) {
            bundle.putString("bot_inst_id", instId);
        }
        if (!bundle.containsKey("bot_inst_type") && instType != null && instType.length() != 0) {
            bundle.putString("bot_inst_type", instType);
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(strComponent2);
        if (fragmentFindFragmentByTag != null && fragmentFindFragmentByTag.isAdded()) {
            AEQbTJ(zIsScrollTop);
            OLrzqt(bundle, true);
            return;
        }
        if (C55946xtY.OLrzqt.AYXKKw(strComponent1) && C56071xvr.gEmmrt.AEQbTJ(((BotTradePresenter) gHZMYf()).ejfBZ())) {
            vBQ.ActionBar actionBar = vBQ.Companion;
            android.os.Bundle extras = getIntent().getExtras();
            fragmentAEQbTJ = actionBar.KWHzl(strComponent1, (extras == null || (obj = extras.get(OtcExtraKeys.ORDER)) == null) ? null : C33129mqd.gEmmrt(obj));
        } else {
            fragmentAEQbTJ = AEQbTJ(strComponent1);
        }
        if (fragmentAEQbTJ != null) {
            android.os.Bundle arguments = fragmentAEQbTJ.getArguments();
            if (arguments != null) {
                arguments.putAll(bundle);
            } else {
                arguments = bundle;
            }
            fragmentAEQbTJ.setArguments(arguments);
            try {
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
                }
                fragmentTransactionBeginTransaction.replace(C48033uCm.Application.invokespecialhOMIpD, fragmentAEQbTJ, strComponent2);
                fragmentTransactionBeginTransaction.commitNow();
            } catch (java.lang.Exception e) {
                pUU.KWHzl(getTAG(), "commitNow failed, trying commitAllowingStateLoss: " + e.getMessage());
                androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = supportFragmentManager2.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction2.remove(fragmentFindFragmentByTag);
                }
                fragmentTransactionBeginTransaction2.replace(C48033uCm.Application.invokespecialhOMIpD, fragmentAEQbTJ, strComponent2);
                fragmentTransactionBeginTransaction2.commitNowAllowingStateLoss();
            }
            AEQbTJ(zIsScrollTop);
            performOneClickCopyIfNeed$default(this, bundle, false, 2, null);
            OLrzqt(strComponent1, paramBuilder);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [527=13] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Binding */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.fragment.app.Fragment AEQbTJ(java.lang.String str) {
        switch (str.hashCode()) {
            case -1831183611:
                if (str.equals("spot_dca")) {
                    return new C53273wiQ();
                }
                return null;
            case -1418042064:
                if (str.equals("ai_bot")) {
                    AbstractC48301uMk abstractC48301uMk = (AbstractC48301uMk) sSMYrx();
                    android.widget.FrameLayout frameLayout = abstractC48301uMk.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                    frameLayout.setVisibility(8);
                    C51923vwF c51923vwF = abstractC48301uMk.isConnected;
                    Intrinsics.checkNotNullExpressionValue(c51923vwF, "");
                    c51923vwF.setVisibility(8);
                    return new C48112uFk();
                }
                return null;
            case -1402017003:
                if (str.equals("contract_dca")) {
                    return new C50170vEm();
                }
                return null;
            case -1216369070:
                if (str.equals("smart_portfolio")) {
                    return new C53125wfb();
                }
                return null;
            case -1148661171:
                if (str.equals("smart_iceberg")) {
                    return C53036wds.Companion.copydefault();
                }
                return null;
            case -1086683216:
                if (str.equals("signal_bot")) {
                    return new C50674vXd();
                }
                return null;
            case -557961837:
                if (str.equals("smart_arbitrage")) {
                    return new C52903wbR();
                }
                return null;
            case -512749997:
                if (str.equals("contract_grid")) {
                    return new C50312vJt();
                }
                return null;
            case 3181382:
                if (str.equals("grid")) {
                    return new vNN();
                }
                return null;
            case 3573234:
                if (str.equals("twap")) {
                    return AbstractC53400wkl.Companion.copydefault(((BotTradePresenter) gHZMYf()).fetchVPNInfo().copydefault());
                }
                return null;
            case 1165749981:
                if (str.equals("recurring")) {
                    return new C50590vUa();
                }
                return null;
            case 1485620813:
                if (str.equals("dcd_bot")) {
                    return new vLF();
                }
                return null;
            case 1780188297:
                if (str.equals("arbitrage")) {
                    return new C50062vAm();
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(boolean z) {
        if (z) {
            AbstractC48301uMk abstractC48301uMk = (AbstractC48301uMk) sSMYrx();
            fARcdN().fARcdN().KWHzl(Unit.INSTANCE);
            abstractC48301uMk.AEQbTJ.smoothScrollTo(0, abstractC48301uMk.djBIcL.getTop(), 800);
        }
    }

    public static /* synthetic */ void performOneClickCopyIfNeed$default(ActivityC52122vzt activityC52122vzt, android.os.Bundle bundle, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        activityC52122vzt.OLrzqt(bundle, z);
    }

    public final void OLrzqt(android.os.Bundle bundle, boolean z) {
        if (bundle == null || !bundle.getBoolean("bot_one_click_copy")) {
            return;
        }
        if (z) {
            getSupportFragmentManager().setFragmentResult("bot_one_click_copy", bundle);
        }
        C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C55688xof.Application.getRccTransportControlFlagsFromActions), 0, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(java.lang.String str, ParamBuilder paramBuilder) {
        java.lang.String instId;
        boolean z;
        xOW newProxyInstance;
        if (Intrinsics.EZpvd((java.lang.Object) ((BotTradePresenter) gHZMYf()).ejfBZ(), (java.lang.Object) "nmp")) {
            C55867xrz.KWHzl.EZpvd(((BotTradePresenter) gHZMYf()).fARcdN());
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String strEjfBZ = ((BotTradePresenter) gHZMYf()).ejfBZ();
        if (strEjfBZ == null) {
            strEjfBZ = "bot_un_know_source";
        }
        java.lang.String str2 = strEjfBZ;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (paramBuilder == null || (instId = paramBuilder.getInstId()) == null) {
            instId = "";
        }
        java.lang.String str3 = instId;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            z = false;
        } else {
            z = true;
            if (!newProxyInstance.QbewEr()) {
            }
        }
        c55867xrz.copydefault(str2, java.lang.String.valueOf(jCurrentTimeMillis), str, "", str3, new BotGrafanaInfo(null, null, null, z, 7, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC55882xsN
    public android.view.ViewGroup values() {
        android.widget.FrameLayout frameLayout = ((AbstractC48301uMk) sSMYrx()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        return frameLayout;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC48164uHi
    public void EZpvd(java.lang.String str, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        android.widget.LinearLayout linearLayout = ((AbstractC48301uMk) sSMYrx()).values;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        ((AbstractC48301uMk) sSMYrx()).values.setClickable(true);
        ((AbstractC48301uMk) sSMYrx()).values.setOnClickListener(new View.OnClickListener() { // from class: o.vzH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC52122vzt.showErrorLayout$lambda$29(view);
            }
        });
        final C55173xeu c55173xeu = ((AbstractC48301uMk) sSMYrx()).EZpvd;
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ComponentActivityApi33Impl));
        if (str == null) {
            str = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) str);
        c55173xeu.setRetry(C33070mpX.AYXKKw(C55688xof.Application.AuCTel));
        c55173xeu.AEQbTJ().fIwbmz();
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.vzE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC52122vzt.EZpvd(c55173xeu, function0, view);
            }
        });
    }

    public static final void EZpvd(C55173xeu c55173xeu, Function0 function0, android.view.View view) {
        c55173xeu.AEQbTJ().OLrzqt(0L);
        function0.invoke();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC48164uHi
    public void KWHzl() {
        android.widget.LinearLayout linearLayout = ((AbstractC48301uMk) sSMYrx()).values;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        ((AbstractC48301uMk) sSMYrx()).EZpvd.AEQbTJ().fIwbmz();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        InterfaceC49504upm interfaceC49504upm = (InterfaceC49504upm) C43251rlk.OLrzqt(InterfaceC49504upm.class);
        if (interfaceC49504upm != null && interfaceC49504upm.KWHzl()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("bot_kline", true);
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // o.AbstractActivityC52100vzX, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC52100vzX, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
