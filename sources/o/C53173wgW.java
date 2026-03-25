package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.order.strategy.BotTradePresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaEditParam;
import com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$onResume$1;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamRep;
import com.okinc.unify_trade.biz.SpotDcaAdditionalFundParamResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.subscribe.EditParams;
import com.okinc.unify_trade.biz.subscribe.StrategyDcaEditResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wgW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53173wgW extends AbstractC49945uyC<uNF, SpotDcaManualPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public java.lang.String AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public Function0<Unit> AkhnZx;
    public final InterfaceC56387yDm KWHzl;
    public java.lang.String OLrzqt;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> djBIcL;
    public wYF fetchVPNInfo;
    public final Function2<C47988uAv, java.lang.String, Unit> gEmmrt;
    public boolean isConnected;
    public SpotDcaAdvancedParams valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.wgW$PendingIntent */
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
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.iRxXKY;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C53173wgW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C53390wkb.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$10
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotTradePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$13
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$14
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaEditParamDialog$special$$inlined$viewModels$default$15
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AEQbTJ = "";
        this.OLrzqt = "";
        this.isConnected = true;
        this.AhwBna = true;
        this.gEmmrt = new Function2() { // from class: o.wgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53173wgW.OLrzqt(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.djBIcL = new Function2() { // from class: o.whh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53173wgW.EZpvd(this.EZpvd, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
    }

    private final C55915xsu wlaJM() {
        return (C55915xsu) this.KWHzl.getValue();
    }

    private final C53390wkb AuCTelauCTel() {
        return (C53390wkb) this.values.getValue();
    }

    public final BotTradePresenter AuCTel() {
        return (BotTradePresenter) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.wgW$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wgW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C53173wgW OLrzqt(@NotNull TacticsData tacticsData, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(function0, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_spot_dca_data", tacticsData);
            C53173wgW c53173wgW = new C53173wgW();
            c53173wgW.setArguments(bundle);
            c53173wgW.AkhnZx = function0;
            return c53173wgW;
        }
    }

    public static final Unit OLrzqt(C53173wgW c53173wgW, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c47988uAv.copydefault();
        if (Intrinsics.EZpvd(c47988uAv, c53173wgW.values().fARcdN) || Intrinsics.EZpvd(c47988uAv, c53173wgW.values().AuCTel) || Intrinsics.EZpvd(c47988uAv, c53173wgW.values().fJNWhG)) {
            if (Intrinsics.EZpvd(c47988uAv, c53173wgW.values().fJNWhG)) {
                c53173wgW.QKVWgx();
            }
            c53173wgW.OcIXYQ();
            c53173wgW.AxsJAY();
        }
        return Unit.INSTANCE;
    }

    private final void AxsJAY() {
        C55320xhi c55320xhiKWHzl;
        boolean z;
        java.lang.String strAkhnZx = values().fJNWhG.AkhnZx();
        java.util.Iterator it = C56424yEw.gEmmrt(C56390yDp.OLrzqt(values().fARcdN, C56402yEa.EZpvd("0")), C56390yDp.OLrzqt(values().ejfBZ, C56402yEa.EZpvd("0"))).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            if ((iterable instanceof java.util.Collection) && ((java.util.Collection) iterable).isEmpty()) {
                z = false;
            } else {
                java.util.Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.EZpvd(it2.next(), (java.lang.Object) strAkhnZx)) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            boolean z2 = true ^ z;
            C47988uAv.setInputLayoutState$default((C47988uAv) entry.getKey(), z2 ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
            if (!z2) {
                ((C47988uAv) entry.getKey()).copydefault();
            }
        }
        boolean z3 = (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) "0") || Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) "1")) ? false : true;
        values().gEmmrt.setEnabled(z3);
        C55312xha c55312xhaValueOf = values().hDKMBd.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setTextColor(C33070mpX.copydefault(z3 ? C32113mPz.ActionBar.zLjUOn : C32113mPz.ActionBar.getFieldNames));
        }
        if (!values().gEmmrt.isChecked()) {
            android.widget.TextView textView = values().isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(z3 ? 0 : 8);
            ConstraintLayout constraintLayout = values().fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(z3 ? 0 : 8);
        }
        values().copydefault.setAppendEnable(z3);
    }

    public static final Unit EZpvd(C53173wgW c53173wgW, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (!z && c47988uAv.AkhnZx().length() > 0) {
            C52658wTo.AEQbTJ.OLrzqt(c47988uAv, c53173wgW.EZpvd(c47988uAv));
            if (Intrinsics.EZpvd(c47988uAv, c53173wgW.values().fIwbmz) || Intrinsics.EZpvd(c47988uAv, c53173wgW.values().ejfBZ) || Intrinsics.EZpvd(c47988uAv, c53173wgW.values().fJNWhG)) {
                c53173wgW.fJNWhG();
                c53173wgW.QKVWgx();
            }
            c53173wgW.getNewProxyInstance();
            c53173wgW.copydefault(c47988uAv);
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "BotSpotDcaEditParamDialog", new kotlin.Pair[0], null, 8, null);
        SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        TacticsData tacticsData = arguments != null ? (TacticsData) arguments.getParcelable("bot_spot_dca_data") : null;
        if (!(tacticsData instanceof TacticsData)) {
            tacticsData = null;
        }
        spotDcaManualPresenterOLrzqt.OLrzqt(tacticsData);
        android.os.Bundle bundle2 = new android.os.Bundle();
        TacticsData tacticsDataAuCTel = OLrzqt().AuCTel();
        bundle2.putString("bot_inst_id", tacticsDataAuCTel != null ? tacticsDataAuCTel.getInstId() : null);
        TacticsData tacticsDataAuCTel2 = OLrzqt().AuCTel();
        bundle2.putString("bot_inst_type", tacticsDataAuCTel2 != null ? tacticsDataAuCTel2.getInstType() : null);
        this.valueOf = uzCIH();
        OLrzqt().EZpvd(bundle2);
        C55887xsS c55887xsSFvQaOB = OLrzqt().fvQaOB();
        TacticsData tacticsDataAuCTel3 = OLrzqt().AuCTel();
        c55887xsSFvQaOB.gEmmrt(tacticsDataAuCTel3 != null ? tacticsDataAuCTel3.getTradeQuoteCcy() : null);
        C54782xVc.AEQbTJ.AhwBna(OLrzqt().fvQaOB().AhwBna());
        AwvSrB();
        zuBGHE();
        gHZMYf();
        QOLQEE();
        iwGUEr();
        OLrzqt().copydefault();
        fillWithConfigInfo$default(this, null, 1, null);
    }

    /* JADX INFO: renamed from: o.wgW$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53173wgW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53173wgW c53173wgW) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c53173wgW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(this.copydefault.getString(C55688xof.Application.hrNTAI));
                java.lang.String string = this.copydefault.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.wgW$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53173wgW OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C53173wgW c53173wgW) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c53173wgW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.hDKMBd();
            }
        }
    }

    /* JADX INFO: renamed from: o.wgW$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53173wgW copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C53173wgW c53173wgW) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c53173wgW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.zsXlph();
            }
        }
    }

    /* JADX INFO: renamed from: o.wgW$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53173wgW EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53173wgW c53173wgW) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c53173wgW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.OLrzqt((java.util.ArrayList<java.lang.Integer>) yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.zblBkD), java.lang.Integer.valueOf(C55688xof.Application.DGOPHZ)), (java.util.ArrayList<java.lang.Integer>) yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.DcqEDu), java.lang.Integer.valueOf(C55688xof.Application.aHXSQp)));
            }
        }
    }

    /* JADX INFO: renamed from: o.wgW$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53173wgW OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53173wgW c53173wgW) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c53173wgW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt((java.util.ArrayList<java.lang.Integer>) yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.Dmq), java.lang.Integer.valueOf(C55688xof.Application.DCUTEIddSDPG), java.lang.Integer.valueOf(C55688xof.Application.spnCvw)), (java.util.ArrayList<java.lang.Integer>) yDY.copydefault(java.lang.Integer.valueOf(C55688xof.Application.KDccX), java.lang.Integer.valueOf(C55688xof.Application.DBxZfM), java.lang.Integer.valueOf(C55688xof.Application.DWgRXt)));
            }
        }
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.AhwBna = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new BotSpotDcaEditParamDialog$onResume$1(this, null), 3, null);
        wlaJM().AYXKKw();
        wlaJM().EZpvd("spot_dca", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : OLrzqt().fvQaOB(), (64 & 128) == 0 ? null : null);
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        wlaJM().AYXKKw();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AkhnZx = null;
        this.fetchVPNInfo = null;
        for (C47988uAv c47988uAv : AubY()) {
            c47988uAv.setOnTextChangeCallback(null);
            c47988uAv.setOnFocusChangeCallback(null);
        }
        super.onDestroyView();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpotDcaAdvancedParams uzCIH() {
        java.util.List<DcaTriggerParam> triggerParams;
        DcaTriggerParam dcaTriggerParam;
        java.lang.String triggerStrategy;
        GridStartTriggerType gridStartTriggerType;
        java.lang.String slPct;
        java.lang.String str;
        java.lang.String volMult;
        java.lang.String str2;
        java.lang.String pxStepsMult;
        java.lang.String str3;
        java.util.List<DcaTriggerParam> triggerParams2;
        DcaTriggerParam dcaTriggerParamCopy;
        StrategyDcaEditResp effectiveEditParametersDetails;
        EditParams parameters;
        java.util.List<DcaTriggerParam> triggerParams3;
        DcaTriggerParam dcaTriggerParamCopy2;
        StrategyDcaEditResp effectiveEditParametersDetails2;
        EditParams parameters2;
        StrategyDcaEditResp effectiveEditParametersDetails3;
        EditParams parameters3;
        StrategyDcaEditResp effectiveEditParametersDetails4;
        EditParams parameters4;
        StrategyDcaEditResp effectiveEditParametersDetails5;
        EditParams parameters5;
        StrategyDcaEditResp effectiveEditParametersDetails6;
        EditParams parameters6;
        StrategyDcaEditResp effectiveEditParametersDetails7;
        EditParams parameters7;
        StrategyDcaEditResp effectiveEditParametersDetails8;
        EditParams parameters8;
        StrategyDcaEditResp effectiveEditParametersDetails9;
        EditParams parameters9;
        java.util.List<DcaTriggerParam> triggerParams4;
        DcaTriggerParam dcaTriggerParam2;
        StrategyDcaEditResp effectiveEditParametersDetails10;
        EditParams parameters10;
        java.util.List<DcaTriggerParam> triggerParams5;
        android.os.Bundle arguments = getArguments();
        java.util.List listFJNWhG = null;
        TacticsData tacticsData = arguments != null ? (TacticsData) arguments.getParcelable("bot_spot_dca_data") : null;
        if (!(tacticsData instanceof TacticsData)) {
            tacticsData = null;
        }
        if (((tacticsData == null || (effectiveEditParametersDetails10 = tacticsData.getEffectiveEditParametersDetails()) == null || (parameters10 = effectiveEditParametersDetails10.getParameters()) == null || (triggerParams5 = parameters10.getTriggerParams()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams5)) != null) {
            triggerStrategy = (tacticsData == null || (effectiveEditParametersDetails9 = tacticsData.getEffectiveEditParametersDetails()) == null || (parameters9 = effectiveEditParametersDetails9.getParameters()) == null || (triggerParams4 = parameters9.getTriggerParams()) == null || (dcaTriggerParam2 = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams4)) == null) ? null : dcaTriggerParam2.getTriggerStrategy();
        } else if (tacticsData != null && (triggerParams = tacticsData.getTriggerParams()) != null && (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams)) != null) {
            triggerStrategy = dcaTriggerParam.getTriggerStrategy();
        }
        if (triggerStrategy == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) triggerStrategy)) {
            gridStartTriggerType = GridStartTriggerType.INSTANT;
        } else {
            GridStartTriggerType[] gridStartTriggerTypeArrValues = GridStartTriggerType.values();
            int length = gridStartTriggerTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gridStartTriggerType = null;
                    break;
                }
                gridStartTriggerType = gridStartTriggerTypeArrValues[i];
                if (Intrinsics.EZpvd((java.lang.Object) gridStartTriggerType.getMode(), (java.lang.Object) triggerStrategy)) {
                    break;
                }
                i++;
            }
        }
        if (gridStartTriggerType == null) {
            gridStartTriggerType = GridStartTriggerType.INSTANT;
        }
        GridStartTriggerType gridStartTriggerType2 = gridStartTriggerType;
        if (((tacticsData == null || (effectiveEditParametersDetails8 = tacticsData.getEffectiveEditParametersDetails()) == null || (parameters8 = effectiveEditParametersDetails8.getParameters()) == null) ? null : parameters8.getSlPct()) != null) {
            if (tacticsData != null && (effectiveEditParametersDetails7 = tacticsData.getEffectiveEditParametersDetails()) != null && (parameters7 = effectiveEditParametersDetails7.getParameters()) != null) {
                slPct = parameters7.getSlPct();
                str = slPct;
            }
            str = null;
        } else {
            if (tacticsData != null) {
                slPct = tacticsData.getSlPct();
                str = slPct;
            }
            str = null;
        }
        if (((tacticsData == null || (effectiveEditParametersDetails6 = tacticsData.getEffectiveEditParametersDetails()) == null || (parameters6 = effectiveEditParametersDetails6.getParameters()) == null) ? null : parameters6.getVolMult()) != null) {
            if (tacticsData != null && (effectiveEditParametersDetails5 = tacticsData.getEffectiveEditParametersDetails()) != null && (parameters5 = effectiveEditParametersDetails5.getParameters()) != null) {
                volMult = parameters5.getVolMult();
                str2 = volMult;
            }
            str2 = null;
        } else {
            if (tacticsData != null) {
                volMult = tacticsData.getVolMult();
                str2 = volMult;
            }
            str2 = null;
        }
        if (((tacticsData == null || (effectiveEditParametersDetails4 = tacticsData.getEffectiveEditParametersDetails()) == null || (parameters4 = effectiveEditParametersDetails4.getParameters()) == null) ? null : parameters4.getPxStepsMult()) != null) {
            if (tacticsData != null && (effectiveEditParametersDetails3 = tacticsData.getEffectiveEditParametersDetails()) != null && (parameters3 = effectiveEditParametersDetails3.getParameters()) != null) {
                pxStepsMult = parameters3.getPxStepsMult();
                str3 = pxStepsMult;
            }
            str3 = null;
        } else {
            if (tacticsData != null) {
                pxStepsMult = tacticsData.getPxStepsMult();
                str3 = pxStepsMult;
            }
            str3 = null;
        }
        if (((tacticsData == null || (effectiveEditParametersDetails2 = tacticsData.getEffectiveEditParametersDetails()) == null || (parameters2 = effectiveEditParametersDetails2.getParameters()) == null) ? null : parameters2.getTriggerParams()) != null) {
            if (tacticsData != null && (effectiveEditParametersDetails = tacticsData.getEffectiveEditParametersDetails()) != null && (parameters = effectiveEditParametersDetails.getParameters()) != null && (triggerParams3 = parameters.getTriggerParams()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(triggerParams3, 10));
                for (DcaTriggerParam dcaTriggerParam3 : triggerParams3) {
                    if (dcaTriggerParam3 != null) {
                        dcaTriggerParamCopy2 = dcaTriggerParam3.copy((1023 & 1) != 0 ? dcaTriggerParam3.triggerAction : null, (1023 & 2) != 0 ? dcaTriggerParam3.triggerStrategy : null, (1023 & 4) != 0 ? dcaTriggerParam3.triggerCond : null, (1023 & 8) != 0 ? dcaTriggerParam3.triggerPx : null, (1023 & 16) != 0 ? dcaTriggerParam3.thold : null, (1023 & 32) != 0 ? dcaTriggerParam3.tholdWarning : null, (1023 & 64) != 0 ? dcaTriggerParam3.timePeriod : null, (1023 & 128) != 0 ? dcaTriggerParam3.timeframe : null, (1023 & 256) != 0 ? dcaTriggerParam3.cycleId : null, (1023 & 512) != 0 ? dcaTriggerParam3.klinePeriod : null);
                    } else {
                        dcaTriggerParamCopy2 = null;
                    }
                    arrayList.add(dcaTriggerParamCopy2);
                }
                listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
            }
        } else if (tacticsData != null && (triggerParams2 = tacticsData.getTriggerParams()) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(triggerParams2, 10));
            for (DcaTriggerParam dcaTriggerParam4 : triggerParams2) {
                if (dcaTriggerParam4 != null) {
                    dcaTriggerParamCopy = dcaTriggerParam4.copy((1023 & 1) != 0 ? dcaTriggerParam4.triggerAction : null, (1023 & 2) != 0 ? dcaTriggerParam4.triggerStrategy : null, (1023 & 4) != 0 ? dcaTriggerParam4.triggerCond : null, (1023 & 8) != 0 ? dcaTriggerParam4.triggerPx : null, (1023 & 16) != 0 ? dcaTriggerParam4.thold : null, (1023 & 32) != 0 ? dcaTriggerParam4.tholdWarning : null, (1023 & 64) != 0 ? dcaTriggerParam4.timePeriod : null, (1023 & 128) != 0 ? dcaTriggerParam4.timeframe : null, (1023 & 256) != 0 ? dcaTriggerParam4.cycleId : null, (1023 & 512) != 0 ? dcaTriggerParam4.klinePeriod : null);
                } else {
                    dcaTriggerParamCopy = null;
                }
                arrayList2.add(dcaTriggerParamCopy);
            }
            listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList2);
        }
        return new SpotDcaAdvancedParams(gridStartTriggerType2, str, str2, str3, listFJNWhG, java.lang.Boolean.TRUE, null, 64, null);
    }

    private final void AwvSrB() {
        values().fARcdN.setMaxDecimal(2);
        values().AuCTel.setMaxDecimal(2);
        values().fJNWhG.setMaxDecimal(0);
        values().copydefault.OLrzqt(this);
        values().OLrzqt.setFooterAvaValue("--");
    }

    private final void zuBGHE() {
        values().gEmmrt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C53173wgW.AEQbTJ(this.EZpvd, compoundButton, z);
            }
        });
        C55258xgZ c55258xgZ = values().hDKMBd;
        c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = values().getNewProxyInstance;
        c55258xgZ2.setOnClickListener(new StateListAnimator(c55258xgZ2, 1000L, this));
        C55258xgZ c55258xgZ3 = values().djBIcL;
        c55258xgZ3.setOnClickListener(new TaskDescription(c55258xgZ3, 1000L, this));
    }

    public static final void AEQbTJ(C53173wgW c53173wgW, android.widget.CompoundButton compoundButton, boolean z) {
        c53173wgW.OLrzqt().copydefault(z);
    }

    /* JADX INFO: renamed from: o.wgW$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    private final void gHZMYf() {
        AuCTelauCTel().OLrzqt().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.wgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.copydefault(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataKWHzl = OLrzqt().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.whg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.OLrzqt(this.copydefault, (StrategyConfigInfo) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().AEQbTJ().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.whk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.KWHzl((java.lang.Exception) obj);
            }
        }));
        OLrzqt().fIwbmz().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.whi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.AhwBna(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataFARcdN = OLrzqt().fARcdN();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataFARcdN.observe(viewLifecycleOwner3, new PendingIntent(new Function1() { // from class: o.whl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.AYXKKw(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataEjfBZ = OLrzqt().ejfBZ();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataEjfBZ.observe(viewLifecycleOwner4, new PendingIntent(new Function1() { // from class: o.whn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.gEmmrt(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataDbNXlk = OLrzqt().DbNXlk();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataDbNXlk.observe(viewLifecycleOwner5, new PendingIntent(new Function1() { // from class: o.whm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.EZpvd(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataAkhnZx = OLrzqt().AkhnZx();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataAkhnZx.observe(viewLifecycleOwner6, new PendingIntent(new Function1() { // from class: o.who
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.djBIcL(this.copydefault, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.String> tradeLiveDataValues = OLrzqt().values();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataValues.observe(viewLifecycleOwner7, new PendingIntent(new Function1() { // from class: o.whp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.values(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataFetchVPNInfo = OLrzqt().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner8, new PendingIntent(new Function1() { // from class: o.whr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56111xwe<java.lang.Boolean> c56111xweDjBIcL = OLrzqt().djBIcL();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56111xweDjBIcL.observe(viewLifecycleOwner9, new PendingIntent(new Function1() { // from class: o.whb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.gEmmrt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = wlaJM().AhwBna();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        c56111xweAhwBna.observe(viewLifecycleOwner10, new PendingIntent(new Function1() { // from class: o.whd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.AkhnZx(this.EZpvd, (java.lang.String) obj);
            }
        }));
        TradeLiveData<SpotDcaAdvancedParams> tradeLiveDataValueOf = OLrzqt().valueOf();
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner11, new PendingIntent(new Function1() { // from class: o.whe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.KWHzl(this.KWHzl, (SpotDcaAdvancedParams) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = OLrzqt().AhwBna().AhwBna();
        LifecycleOwner viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner12, new PendingIntent(new Function1() { // from class: o.whf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.OLrzqt(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
        TradeLiveData<SpotDcaAdditionalFundParamResp> tradeLiveDataAYXKKw = OLrzqt().AYXKKw();
        LifecycleOwner viewLifecycleOwner13 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner13, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner13, new PendingIntent(new Function1() { // from class: o.whc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.KWHzl(this.AEQbTJ, (SpotDcaAdditionalFundParamResp) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna3 = OLrzqt().AhwBna().AhwBna();
        LifecycleOwner viewLifecycleOwner14 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner14, "");
        c56109xwcAhwBna3.observe(viewLifecycleOwner14, new PendingIntent(new Function1() { // from class: o.whj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.copydefault((java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(C53173wgW c53173wgW, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            Function0<Unit> function0 = c53173wgW.AkhnZx;
            if (function0 != null) {
                function0.invoke();
            }
            c53173wgW.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53173wgW c53173wgW, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c53173wgW.OLrzqt(strategyConfigInfo);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(C53173wgW c53173wgW, java.lang.String str) {
        BotRangeConfig initOrdAmt;
        java.lang.String str2;
        BotRangeConfig initOrdAmt2;
        StrategyConfigInfo value = c53173wgW.OLrzqt().KWHzl().getValue();
        java.lang.String strAEQbTJ = null;
        java.lang.String max = (value == null || (initOrdAmt2 = value.getInitOrdAmt()) == null) ? null : initOrdAmt2.getMax();
        if (max == null || max.length() == 0) {
            max = "10000";
        }
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        C47988uAv c47988uAv = c53173wgW.values().fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = c53173wgW.OLrzqt();
        RoundingMode roundingMode = RoundingMode.UP;
        java.lang.String strAEQbTJ2 = spotDcaManualPresenterOLrzqt.AEQbTJ(str, roundingMode);
        java.lang.String strAEQbTJ3 = c53173wgW.OLrzqt().AEQbTJ(max, roundingMode);
        StrategyConfigInfo value2 = c53173wgW.OLrzqt().KWHzl().getValue();
        if (value2 != null && (initOrdAmt = value2.getInitOrdAmt()) != null && (str2 = initOrdAmt.getDefault()) != null) {
            strAEQbTJ = c53173wgW.OLrzqt().AEQbTJ(str2, roundingMode);
        }
        c52658wTo.copydefault(c47988uAv, new BotRangeConfig(strAEQbTJ2, strAEQbTJ3, strAEQbTJ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : c53173wgW.OLrzqt().AEQbTJ(str, roundingMode), (8 & 8) != 0 ? null : null, new Function1() { // from class: o.why
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.gEmmrt((java.lang.String) obj);
            }
        });
        c53173wgW.OcIXYQ();
        c53173wgW.QKVWgx();
        return Unit.INSTANCE;
    }

    public static final java.lang.String gEmmrt(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr.copydefault(str);
    }

    public static final Unit AYXKKw(C53173wgW c53173wgW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53173wgW.fetchVPNInfo(str);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C53173wgW c53173wgW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53173wgW.fetchVPNInfo(str);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C53173wgW c53173wgW, boolean z) {
        android.widget.TextView textView = c53173wgW.values().isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean z2 = !z;
        textView.setVisibility(z2 ? 0 : 8);
        ConstraintLayout constraintLayout = c53173wgW.values().fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z2 ? 0 : 8);
        c53173wgW.QKVWgx();
        if (!c53173wgW.isConnected) {
            c53173wgW.fJNWhG();
            c53173wgW.getNewProxyInstance();
        } else {
            c53173wgW.isConnected = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C53173wgW c53173wgW, java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strSSMYrx = c53173wgW.sSMYrx();
        android.widget.TextView textView = c53173wgW.values().AkhnZx;
        if (C33129mqd.AEQbTJ(str, 0)) {
            str2 = xMR.copydefault.copydefault(str) + " " + strSSMYrx;
        } else {
            str2 = "--";
        }
        textView.setText(str2);
        return Unit.INSTANCE;
    }

    public static final Unit values(C53173wgW c53173wgW, java.lang.String str) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strSSMYrx = c53173wgW.sSMYrx();
        android.widget.TextView textView = c53173wgW.values().KWHzl;
        if (C33129mqd.AEQbTJ(str, 0)) {
            str2 = xMR.copydefault.copydefault(str) + " " + strSSMYrx;
        } else {
            str2 = "--";
        }
        textView.setText(str2);
        c53173wgW.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53173wgW c53173wgW, boolean z) {
        android.widget.TextView textView = c53173wgW.values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(C53173wgW c53173wgW, boolean z) {
        if (!z) {
            return Unit.INSTANCE;
        }
        java.util.Iterator<T> it = c53173wgW.AubY().iterator();
        while (it.hasNext()) {
            ((C47988uAv) it.next()).copydefault();
        }
        android.widget.TextView textView = c53173wgW.values().uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(C53173wgW c53173wgW, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53173wgW.values().OLrzqt.setFooterAvaValue(str);
        c53173wgW.QKVWgx();
        if (!c53173wgW.AhwBna) {
            c53173wgW.fJNWhG();
        } else {
            c53173wgW.AhwBna = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53173wgW c53173wgW, SpotDcaAdvancedParams spotDcaAdvancedParams) {
        StrategyDcaEditResp effectiveEditParametersDetails;
        EditParams parameters;
        Intrinsics.checkNotNullParameter(spotDcaAdvancedParams, "");
        java.lang.String strAhwBna = spotDcaAdvancedParams.AhwBna();
        TacticsData tacticsDataAuCTel = c53173wgW.OLrzqt().AuCTel();
        if (!Intrinsics.EZpvd((java.lang.Object) strAhwBna, (java.lang.Object) ((tacticsDataAuCTel == null || (effectiveEditParametersDetails = tacticsDataAuCTel.getEffectiveEditParametersDetails()) == null || (parameters = effectiveEditParametersDetails.getParameters()) == null) ? null : parameters.getVolMult()))) {
            c53173wgW.fJNWhG();
            c53173wgW.QKVWgx();
            c53173wgW.OcIXYQ();
        }
        c53173wgW.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C53173wgW c53173wgW, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String strAkhnZx = c53173wgW.values().fIwbmz.AkhnZx();
        java.lang.String strAkhnZx2 = c53173wgW.values().ejfBZ.AkhnZx();
        java.lang.String strAkhnZx3 = c53173wgW.values().fJNWhG.AkhnZx();
        SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = c53173wgW.OLrzqt();
        MaxAvailableResp maxAvailableResp = c53173wgW.wlaJM().AEQbTJ().get();
        spotDcaManualPresenterOLrzqt.copydefault(strAkhnZx, strAkhnZx3, strAkhnZx2, maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null);
        c53173wgW.values().iwGUEr.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C53173wgW c53173wgW, SpotDcaAdditionalFundParamResp spotDcaAdditionalFundParamResp) {
        Intrinsics.checkNotNullParameter(spotDcaAdditionalFundParamResp, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) spotDcaAdditionalFundParamResp.getAdditionalFundInTradingAccountForNextCycle()) && !C33129mqd.OLrzqt(spotDcaAdditionalFundParamResp.getAdditionalFundInTradingAccountForNextCycle(), "0")) {
            TacticsData tacticsDataAuCTel = c53173wgW.OLrzqt().AuCTel();
            if (tacticsDataAuCTel != null) {
                wSY wsy = wSY.OLrzqt;
                java.lang.String additionalFundInTradingAccountForNextCycle = spotDcaAdditionalFundParamResp.getAdditionalFundInTradingAccountForNextCycle();
                java.lang.String additionalFundInVirtualAccountForNextCycle = spotDcaAdditionalFundParamResp.getAdditionalFundInVirtualAccountForNextCycle();
                OKReminder oKReminder = c53173wgW.values().iwGUEr;
                Intrinsics.checkNotNullExpressionValue(oKReminder, "");
                wsy.AEQbTJ(tacticsDataAuCTel, additionalFundInTradingAccountForNextCycle, additionalFundInVirtualAccountForNextCycle, oKReminder);
            }
            c53173wgW.OLrzqt().KWHzl(spotDcaAdditionalFundParamResp.getAdditionalFundInTradingAccountForNextCycle());
            c53173wgW.getNewProxyInstance();
        } else {
            c53173wgW.values().iwGUEr.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        pUU.copydefault("additionalFundForEditUseCase error " + exc.getMessage());
        return Unit.INSTANCE;
    }

    public static final C43316rmw OLrzqt(InterfaceC56387yDm<? extends C43316rmw> interfaceC56387yDm) {
        return interfaceC56387yDm.getValue();
    }

    public static final C43316rmw isConnected() {
        return new C43316rmw();
    }

    public final void OLrzqt(java.util.ArrayList<java.lang.Integer> arrayList, java.util.ArrayList<java.lang.Integer> arrayList2) {
        InterfaceC56387yDm interfaceC56387yDmCopydefault = C56392yDr.copydefault(new Function0() { // from class: o.whw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53173wgW.isConnected();
            }
        });
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.YFmri, (android.view.ViewGroup) null, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(C48033uCm.Application.dtVxwd);
        C43316rmw c43316rmwOLrzqt = OLrzqt((InterfaceC56387yDm<? extends C43316rmw>) interfaceC56387yDmCopydefault);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c43316rmwOLrzqt.register(ExplainItemModel.class, new C53151wgA(fragmentActivityRequireActivity));
        SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = OLrzqt();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        OLrzqt((InterfaceC56387yDm<? extends C43316rmw>) interfaceC56387yDmCopydefault).setItems(spotDcaManualPresenterOLrzqt.AEQbTJ(fragmentActivityRequireActivity2, arrayList, arrayList2));
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        recyclerView.setAdapter(OLrzqt((InterfaceC56387yDm<? extends C43316rmw>) interfaceC56387yDmCopydefault));
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        java.lang.String string = getString(C55688xof.Application.ActionBarDrawerToggle1);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wgX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53173wgW.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void QOLQEE() {
        int iValues = OLrzqt().fvQaOB().values();
        values().OLrzqt.setTransferCoin(OLrzqt().fvQaOB().copydefault("spot_dca"));
        values().fIwbmz.setInputUnit(sSMYrx());
        values().fIwbmz.setMaxDecimal(iValues);
        values().ejfBZ.setInputUnit(sSMYrx());
        values().ejfBZ.setMaxDecimal(iValues);
    }

    private final java.lang.String EZpvd(C47988uAv c47988uAv) {
        return (Intrinsics.EZpvd(c47988uAv, values().fARcdN) || Intrinsics.EZpvd(c47988uAv, values().AuCTel)) ? "%" : c47988uAv.fARcdN();
    }

    private final void iwGUEr() {
        for (C47988uAv c47988uAv : AubY()) {
            c47988uAv.setOnTextChangeCallback(this.gEmmrt);
            c47988uAv.setOnFocusChangeCallback(this.djBIcL);
        }
    }

    public final uNF fARcdN() {
        uNF unfValues = values();
        unfValues.fIwbmz.setOnFocusChangeCallback(this.djBIcL);
        unfValues.ejfBZ.setOnFocusChangeCallback(this.djBIcL);
        unfValues.fJNWhG.setOnFocusChangeCallback(this.djBIcL);
        return unfValues;
    }

    public final uNF fIwbmz() {
        uNF unfValues = values();
        unfValues.fIwbmz.setOnFocusChangeListener(null);
        unfValues.ejfBZ.setOnFocusChangeListener(null);
        unfValues.fJNWhG.setOnFocusChangeListener(null);
        return unfValues;
    }

    public static /* synthetic */ void fillWithConfigInfo$default(C53173wgW c53173wgW, StrategyConfigInfo strategyConfigInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyConfigInfo = null;
        }
        c53173wgW.OLrzqt(strategyConfigInfo);
    }

    private final void OLrzqt(StrategyConfigInfo strategyConfigInfo) {
        AEQbTJ(strategyConfigInfo);
    }

    public static /* synthetic */ void buildInputParams$default(C53173wgW c53173wgW, StrategyConfigInfo strategyConfigInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strategyConfigInfo = null;
        }
        c53173wgW.AEQbTJ(strategyConfigInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(StrategyConfigInfo strategyConfigInfo) {
        java.lang.String min;
        java.lang.String max;
        java.lang.String min2;
        java.lang.String str;
        BotRangeConfig botRangeConfig;
        java.lang.Boolean bool;
        java.lang.String initOrdAmt;
        java.lang.String maxSafetyOrds;
        java.lang.String safetyOrdAmt;
        BotRangeConfig tpPct;
        java.lang.String max2;
        BotRangeConfig tpPct2;
        BotRangeConfig pxSteps;
        BotRangeConfig pxSteps2;
        TacticsData tacticsDataAuCTel = OLrzqt().AuCTel();
        if (tacticsDataAuCTel != null) {
            DcaOrderReq dcaOrderReqEZpvd = C55998xuX.copydefault.EZpvd(tacticsDataAuCTel);
            java.lang.String pxSteps3 = dcaOrderReqEZpvd.getPxSteps();
            java.lang.String tpPct3 = dcaOrderReqEZpvd.getTpPct();
            java.lang.String maxSafetyOrds2 = dcaOrderReqEZpvd.getMaxSafetyOrds();
            if (maxSafetyOrds2 == null || maxSafetyOrds2.length() == 0) {
                maxSafetyOrds2 = "0";
            }
            fIwbmz();
            C52658wTo c52658wTo = C52658wTo.AEQbTJ;
            C47988uAv c47988uAv = values().fARcdN;
            Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
            xMR xmr = xMR.copydefault;
            if (strategyConfigInfo == null || (pxSteps2 = strategyConfigInfo.getPxSteps()) == null || (min = pxSteps2.getMin()) == null) {
                min = "0.002";
            }
            java.lang.String hundredfold$default = xMR.formatHundredfold$default(xmr, min, 0, false, null, 14, null);
            if (strategyConfigInfo == null || (pxSteps = strategyConfigInfo.getPxSteps()) == null || (max = pxSteps.getMax()) == null) {
                max = "0.1";
            }
            c52658wTo.copydefault(c47988uAv, new BotRangeConfig(hundredfold$default, xMR.formatHundredfold$default(xmr, max, 0, false, null, 14, null), xMR.formatHundredfold$default(xmr, pxSteps3 == null ? "" : pxSteps3, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.whs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53173wgW.djBIcL((java.lang.String) obj);
                }
            });
            C47988uAv c47988uAv2 = values().AuCTel;
            Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
            if (strategyConfigInfo == null || (tpPct2 = strategyConfigInfo.getTpPct()) == null || (min2 = tpPct2.getMin()) == null) {
                min2 = "0.005";
            }
            c52658wTo.copydefault(c47988uAv2, new BotRangeConfig(xMR.formatHundredfold$default(xmr, min2, 0, false, null, 14, null), xMR.formatHundredfold$default(xmr, (strategyConfigInfo == null || (tpPct = strategyConfigInfo.getTpPct()) == null || (max2 = tpPct.getMax()) == null) ? "" : max2, 0, false, null, 14, null), xMR.formatHundredfold$default(xmr, tpPct3 == null ? "" : tpPct3, 0, false, null, 14, null), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.whu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53173wgW.valueOf((java.lang.String) obj);
                }
            });
            BotRangeConfig botRangeConfig2 = null;
            if ((strategyConfigInfo != null ? strategyConfigInfo.getMaxSafetyOrds() : null) == null) {
                str = "";
                botRangeConfig2 = new BotRangeConfig("1", "20", maxSafetyOrds2, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 56, (DefaultConstructorMarker) null);
            } else {
                str = "";
                BotRangeConfig maxSafetyOrds3 = strategyConfigInfo.getMaxSafetyOrds();
                if (maxSafetyOrds3 != null) {
                    maxSafetyOrds3.setDefault(maxSafetyOrds2);
                    botRangeConfig = maxSafetyOrds3;
                }
                C47988uAv c47988uAv3 = values().fJNWhG;
                Intrinsics.checkNotNullExpressionValue(c47988uAv3, str);
                java.lang.String str2 = str;
                c52658wTo.copydefault(c47988uAv3, botRangeConfig, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.whx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C53173wgW.AhwBna((java.lang.String) obj);
                    }
                });
                wYK wyk = values().gEmmrt;
                java.lang.Boolean reserveFunds = dcaOrderReqEZpvd.getReserveFunds();
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                wyk.setChecked(Intrinsics.EZpvd(reserveFunds, bool2));
                SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = OLrzqt();
                SpotDcaAdvancedParams spotDcaAdvancedParamsCopydefault = OLrzqt().copydefault(dcaOrderReqEZpvd);
                bool = java.lang.Boolean.FALSE;
                spotDcaAdvancedParamsCopydefault.OLrzqt(bool);
                spotDcaAdvancedParamsCopydefault.KWHzl(bool2);
                spotDcaManualPresenterOLrzqt.AEQbTJ(spotDcaAdvancedParamsCopydefault);
                C47988uAv.setInputContent$default(values().fIwbmz, dcaOrderReqEZpvd.getInitOrdAmt(), false, false, 6, null);
                C47988uAv.setInputContent$default(values().ejfBZ, dcaOrderReqEZpvd.getSafetyOrdAmt(), false, false, 6, null);
                if (C33129mqd.OLrzqt(maxSafetyOrds2, "0")) {
                    C47988uAv.setInputContent$default(values().fJNWhG, maxSafetyOrds2, false, false, 6, null);
                }
                SpotDcaManualPresenter spotDcaManualPresenterOLrzqt2 = OLrzqt();
                initOrdAmt = dcaOrderReqEZpvd.getInitOrdAmt();
                if (initOrdAmt == null) {
                    initOrdAmt = str2;
                }
                maxSafetyOrds = dcaOrderReqEZpvd.getMaxSafetyOrds();
                if (maxSafetyOrds == null) {
                    maxSafetyOrds = str2;
                }
                safetyOrdAmt = dcaOrderReqEZpvd.getSafetyOrdAmt();
                if (safetyOrdAmt == null) {
                    safetyOrdAmt = str2;
                }
                this.AEQbTJ = spotDcaManualPresenterOLrzqt2.AEQbTJ(initOrdAmt, maxSafetyOrds, safetyOrdAmt, Intrinsics.EZpvd(dcaOrderReqEZpvd.getReserveFunds(), bool2));
                if (Intrinsics.EZpvd(dcaOrderReqEZpvd.getReserveFunds(), bool)) {
                    SpotDcaManualPresenter spotDcaManualPresenterOLrzqt3 = OLrzqt();
                    java.lang.String initOrdAmt2 = dcaOrderReqEZpvd.getInitOrdAmt();
                    if (initOrdAmt2 == null) {
                        initOrdAmt2 = str2;
                    }
                    java.lang.String maxSafetyOrds4 = dcaOrderReqEZpvd.getMaxSafetyOrds();
                    if (maxSafetyOrds4 == null) {
                        maxSafetyOrds4 = str2;
                    }
                    java.lang.String safetyOrdAmt2 = dcaOrderReqEZpvd.getSafetyOrdAmt();
                    if (safetyOrdAmt2 != null) {
                        str2 = safetyOrdAmt2;
                    }
                    this.OLrzqt = spotDcaManualPresenterOLrzqt3.AEQbTJ(initOrdAmt2, maxSafetyOrds4, str2);
                }
                OLrzqt().AEQbTJ(dcaOrderReqEZpvd.getSystemSource());
                OLrzqt().EZpvd(dcaOrderReqEZpvd.getNmpUnderlyingId());
                values().getRoot().post(new java.lang.Runnable() { // from class: o.whz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C53173wgW.OLrzqt(this.OLrzqt);
                    }
                });
            }
            botRangeConfig = botRangeConfig2;
            C47988uAv c47988uAv32 = values().fJNWhG;
            Intrinsics.checkNotNullExpressionValue(c47988uAv32, str);
            java.lang.String str22 = str;
            c52658wTo.copydefault(c47988uAv32, botRangeConfig, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.whx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C53173wgW.AhwBna((java.lang.String) obj);
                }
            });
            wYK wyk2 = values().gEmmrt;
            java.lang.Boolean reserveFunds2 = dcaOrderReqEZpvd.getReserveFunds();
            java.lang.Boolean bool22 = java.lang.Boolean.TRUE;
            wyk2.setChecked(Intrinsics.EZpvd(reserveFunds2, bool22));
            SpotDcaManualPresenter spotDcaManualPresenterOLrzqt4 = OLrzqt();
            SpotDcaAdvancedParams spotDcaAdvancedParamsCopydefault2 = OLrzqt().copydefault(dcaOrderReqEZpvd);
            bool = java.lang.Boolean.FALSE;
            spotDcaAdvancedParamsCopydefault2.OLrzqt(bool);
            spotDcaAdvancedParamsCopydefault2.KWHzl(bool22);
            spotDcaManualPresenterOLrzqt4.AEQbTJ(spotDcaAdvancedParamsCopydefault2);
            C47988uAv.setInputContent$default(values().fIwbmz, dcaOrderReqEZpvd.getInitOrdAmt(), false, false, 6, null);
            C47988uAv.setInputContent$default(values().ejfBZ, dcaOrderReqEZpvd.getSafetyOrdAmt(), false, false, 6, null);
            if (C33129mqd.OLrzqt(maxSafetyOrds2, "0")) {
            }
            SpotDcaManualPresenter spotDcaManualPresenterOLrzqt22 = OLrzqt();
            initOrdAmt = dcaOrderReqEZpvd.getInitOrdAmt();
            if (initOrdAmt == null) {
            }
            maxSafetyOrds = dcaOrderReqEZpvd.getMaxSafetyOrds();
            if (maxSafetyOrds == null) {
            }
            safetyOrdAmt = dcaOrderReqEZpvd.getSafetyOrdAmt();
            if (safetyOrdAmt == null) {
            }
            this.AEQbTJ = spotDcaManualPresenterOLrzqt22.AEQbTJ(initOrdAmt, maxSafetyOrds, safetyOrdAmt, Intrinsics.EZpvd(dcaOrderReqEZpvd.getReserveFunds(), bool22));
            if (Intrinsics.EZpvd(dcaOrderReqEZpvd.getReserveFunds(), bool)) {
            }
            OLrzqt().AEQbTJ(dcaOrderReqEZpvd.getSystemSource());
            OLrzqt().EZpvd(dcaOrderReqEZpvd.getNmpUnderlyingId());
            values().getRoot().post(new java.lang.Runnable() { // from class: o.whz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C53173wgW.OLrzqt(this.OLrzqt);
                }
            });
        }
    }

    public static final java.lang.String djBIcL(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 56, null);
    }

    public static final java.lang.String valueOf(java.lang.String str) {
        if (str == null) {
            return null;
        }
        xMR xmr = xMR.copydefault;
        return xMR.formatICUPercent$default(xmr, xmr.OLrzqt((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.AEQbTJ(2), null, null, null, 56, null);
    }

    public static final java.lang.String AhwBna(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.copydefault(str);
        }
        return null;
    }

    public static final void OLrzqt(C53173wgW c53173wgW) {
        c53173wgW.fARcdN();
    }

    private final java.util.List<C47988uAv> AubY() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(zLjUOn().keySet());
    }

    private final java.util.Map<C47988uAv, java.lang.String> zLjUOn() {
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(values().fARcdN, "price_step"), C56390yDp.OLrzqt(values().AuCTel, "tp_target"), C56390yDp.OLrzqt(values().fIwbmz, "initial_margin"), C56390yDp.OLrzqt(values().ejfBZ, "safety_margin"), C56390yDp.OLrzqt(values().fJNWhG, "safety_orders"));
    }

    private final void OcIXYQ() {
        java.lang.String strCalculateMinSafetyOrder$default = SpotDcaManualPresenter.calculateMinSafetyOrder$default(OLrzqt(), values().fJNWhG.AkhnZx(), null, 2, null);
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        C47988uAv c47988uAv = values().ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c52658wTo.copydefault(c47988uAv, null, (8 & 4) != 0 ? null : OLrzqt().AEQbTJ(strCalculateMinSafetyOrder$default, RoundingMode.UP), (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wht
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.AkhnZx((java.lang.String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String AkhnZx(java.lang.String str) {
        xMR xmr = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr.copydefault(str);
    }

    private final void QKVWgx() {
        java.lang.String strAkhnZx = values().fIwbmz.AkhnZx();
        java.lang.String strAkhnZx2 = values().ejfBZ.AkhnZx();
        OLrzqt().KWHzl(strAkhnZx, values().fJNWhG.AkhnZx(), strAkhnZx2);
    }

    public final void fJNWhG() {
        java.lang.String strAhwBna;
        java.lang.String strAkhnZx = values().fIwbmz.AkhnZx();
        java.lang.String strAkhnZx2 = values().ejfBZ.AkhnZx();
        java.lang.String strAkhnZx3 = values().fJNWhG.AkhnZx();
        SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = OLrzqt();
        TacticsData tacticsDataAuCTel = OLrzqt().AuCTel();
        java.lang.String algoId = tacticsDataAuCTel != null ? tacticsDataAuCTel.getAlgoId() : null;
        boolean zEZpvd = Intrinsics.EZpvd(OLrzqt().DbNXlk().getValue(), java.lang.Boolean.TRUE);
        SpotDcaAdvancedParams value = OLrzqt().valueOf().getValue();
        if (value == null || (strAhwBna = value.AhwBna()) == null) {
            strAhwBna = "";
        }
        spotDcaManualPresenterOLrzqt.KWHzl(new SpotDcaAdditionalFundParamRep(algoId, strAkhnZx, strAkhnZx2, strAkhnZx3, zEZpvd, strAhwBna));
    }

    private final void fetchVPNInfo(java.lang.String str) {
        android.widget.TextView textView = values().uzCIH;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        values().uzCIH.setText(str);
        C47988uAv.setInputErrorMsg$default(values().fARcdN, null, 1, null);
        C47988uAv.setInputErrorMsg$default(values().fJNWhG, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        wlaJM().AYXKKw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hDKMBd() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.fhwtiV));
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Dialog(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.fetchVPNInfo = wyf;
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new Fragment(c52794wYpCopydefault2, 1000L, this));
        }
    }

    private final void getNewProxyInstance() {
        C52794wYp c52794wYpCopydefault;
        wYF wyf = this.fetchVPNInfo;
        if (wyf == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setEnabled(ORxRYg());
    }

    private final boolean getFieldNames() {
        java.util.List<C47988uAv> listAubY = AubY();
        java.util.ArrayList<C47988uAv> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAubY) {
            if (((C47988uAv) obj).isConnected() == InputLayoutState.NORMAL) {
                arrayList.add(obj);
            }
        }
        boolean z = true;
        for (C47988uAv c47988uAv : arrayList) {
            if (c47988uAv.AkhnZx().length() != 0) {
                C52658wTo.AEQbTJ.OLrzqt(c47988uAv, EZpvd(c47988uAv));
                if (z && !c47988uAv.hDKMBd()) {
                    z = false;
                }
            } else if (z) {
                z = false;
            }
        }
        return z;
    }

    public final boolean ejfBZ() {
        java.util.List<C47988uAv> listAubY = AubY();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listAubY) {
            if (((C47988uAv) obj).getNewProxyInstance()) {
                arrayList.add(obj);
            }
        }
        return C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList.size()), "0");
    }

    private final boolean ORxRYg() {
        if (!ejfBZ() && getFieldNames()) {
            OLrzqt().djBIcL().postValue(java.lang.Boolean.TRUE);
            if (!OLrzqt().EZpvd(C33129mqd.AEQbTJ(values().fARcdN.AkhnZx(), 0) ? xMR.formatHundredQuot$default(xMR.copydefault, values().fARcdN.AkhnZx(), 0, false, null, 14, null) : "", values().fJNWhG.AkhnZx())) {
                return false;
            }
            android.widget.TextView textView = values().AhwBna;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            if (textView.getVisibility() == 0) {
                return false;
            }
            SpotDcaAdditionalFundParamResp value = OLrzqt().AYXKKw().getValue();
            if (C33129mqd.AEQbTJ(value != null ? value.getAdditionalFundInTradingAccountForNextCycle() : null, "0")) {
                return false;
            }
            TacticsData tacticsDataAuCTel = OLrzqt().AuCTel();
            SpotDcaEditParam spotDcaEditParam = new SpotDcaEditParam(tacticsDataAuCTel != null ? tacticsDataAuCTel.getAlgoId() : null, values().fARcdN.AkhnZx(), values().AuCTel.AkhnZx(), values().fIwbmz.AkhnZx(), values().ejfBZ.AkhnZx(), values().fJNWhG.AkhnZx(), OLrzqt().values().getValue(), OLrzqt().AkhnZx().getValue(), values().gEmmrt.isChecked(), OLrzqt().valueOf().getValue(), this.valueOf, this.AEQbTJ, null, null, 12288, null);
            TacticsData tacticsDataAuCTel2 = OLrzqt().AuCTel();
            if (tacticsDataAuCTel2 != null && new C53392wkd(spotDcaEditParam, OLrzqt().KWHzl().getValue()).EZpvd(tacticsDataAuCTel2)) {
                return true;
            }
        }
        return false;
    }

    private final void copydefault(C47988uAv c47988uAv) {
        final java.lang.String orDefault = zLjUOn().getOrDefault(c47988uAv, "");
        C32866mlf.onEvent$default("DCABotPlaceOrder_Full_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.whq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53173wgW.OLrzqt(orDefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "spot_dca", true);
        eventParamsList.put("input_type", str, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zsXlph() {
        if (ORxRYg()) {
            DTwDnp();
        }
    }

    private final void DTwDnp() {
        TacticsData tacticsDataAuCTel = OLrzqt().AuCTel();
        if (tacticsDataAuCTel != null) {
            TacticsData tacticsDataAuCTel2 = OLrzqt().AuCTel();
            java.lang.String algoId = tacticsDataAuCTel2 != null ? tacticsDataAuCTel2.getAlgoId() : null;
            java.lang.String strAkhnZx = values().fARcdN.AkhnZx();
            java.lang.String strAkhnZx2 = values().AuCTel.AkhnZx();
            java.lang.String strAkhnZx3 = values().fIwbmz.AkhnZx();
            java.lang.String strAkhnZx4 = values().ejfBZ.AkhnZx();
            java.lang.String strAkhnZx5 = values().fJNWhG.AkhnZx();
            java.lang.String value = OLrzqt().values().getValue();
            java.lang.String value2 = OLrzqt().AkhnZx().getValue();
            boolean zIsChecked = values().gEmmrt.isChecked();
            SpotDcaAdvancedParams value3 = OLrzqt().valueOf().getValue();
            SpotDcaAdvancedParams spotDcaAdvancedParams = this.valueOf;
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = this.OLrzqt;
            SpotDcaAdditionalFundParamResp value4 = OLrzqt().AYXKKw().getValue();
            SpotDcaEditParam spotDcaEditParam = new SpotDcaEditParam(algoId, strAkhnZx, strAkhnZx2, strAkhnZx3, strAkhnZx4, strAkhnZx5, value, value2, zIsChecked, value3, spotDcaAdvancedParams, str, str2, value4 != null ? value4.getAdditionalFundInVirtualAccountForNextCycle() : null);
            if (new C53392wkd(spotDcaEditParam, OLrzqt().KWHzl().getValue()).EZpvd(tacticsDataAuCTel)) {
                C53165wgO.Companion.OLrzqt(OLrzqt().AuCTel(), spotDcaEditParam, OLrzqt().KWHzl().getValue()).show(getChildFragmentManager(), C53165wgO.class.getSimpleName());
            } else {
                dismissAllowingStateLoss();
            }
        }
    }

    private final java.lang.String sSMYrx() {
        java.lang.String strAkhnZx = OLrzqt().fvQaOB().AkhnZx();
        return strAkhnZx == null ? OLrzqt().fvQaOB().DbNXlk() : strAkhnZx;
    }
}
