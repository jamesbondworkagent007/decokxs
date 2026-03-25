package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vRY extends AbstractC32998moE implements InterfaceC49420uoH {
    public static Function1<? super java.lang.Boolean, Unit> EZpvd;
    public static Function1<? super java.lang.Boolean, Unit> OLrzqt;
    public static Function1<? super BotGridOrderDialogData, Unit> gEmmrt;
    public static Function1<? super BotGridOrderDialogData, Unit> valueOf;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public java.lang.String djBIcL;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final java.lang.String AEQbTJ = "SpotGridRangeQuickOrderDialog";
    public static final java.lang.String copydefault = "SpotGridQuickOrderDialog";

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
    @Override // o.InterfaceC49420uoH
    public void EZpvd(@NotNull Function1<? super BotGridOrderDialogData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49420uoH
    public androidx.fragment.app.Fragment KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = str;
        this.AYXKKw = str2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49420uoH
    public void KWHzl(@NotNull Function1<? super BotGridOrderDialogData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49420uoH
    public void OLrzqt(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49420uoH
    public void copydefault(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        OLrzqt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.ORxRYg;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public vRY() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotQuickOrderContainerDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotQuickOrderContainerDialog$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vPY.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotQuickOrderContainerDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotQuickOrderContainerDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotQuickOrderContainerDialog$special$$inlined$viewModels$default$5
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
        this.djBIcL = "";
        this.AYXKKw = "";
        this.AhwBna = AEQbTJ;
    }

    private final vPY OLrzqt() {
        return (vPY) this.DbNXlk.getValue();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vRY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final java.lang.String KWHzl() {
            return vRY.AEQbTJ;
        }

        public final java.lang.String copydefault() {
            return vRY.copydefault;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C56058xve.Companion.copydefault().KWHzl("bot_kline_quick_order", (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 16) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        vRF vrfAEQbTJ = vRF.Companion.AEQbTJ(this.djBIcL, this.AYXKKw);
        java.lang.String str = AEQbTJ;
        this.AhwBna = str;
        EZpvd(vrfAEQbTJ, str);
        Function1<? super java.lang.Boolean, Unit> function1 = EZpvd;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        EZpvd();
        copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault() {
        boolean z;
        xOW newProxyInstance;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String strOLrzqt = OLrzqt().OLrzqt();
        java.lang.String str = this.djBIcL;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            z = false;
        } else {
            z = true;
            if (!newProxyInstance.QbewEr()) {
            }
        }
        c55867xrz.copydefault("bot_kline_quick_order", strOLrzqt, "grid", "", str2, new BotGrafanaInfo(null, null, null, z, 7, null));
    }

    private final void EZpvd() {
        C56111xwe<java.lang.String> c56111xweDjBIcL = OLrzqt().djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweDjBIcL.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vSb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRY.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        OLrzqt().gEmmrt().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vSf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRY.OLrzqt((BotGridOrderDialogData) obj);
            }
        }));
        OLrzqt().AEQbTJ().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vSe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRY.AEQbTJ((java.lang.Boolean) obj);
            }
        }));
        OLrzqt().KWHzl().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vSc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vRY.copydefault((BotGridOrderDialogData) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(vRY vry, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = AEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            vRF vrfAEQbTJ = vRF.Companion.AEQbTJ(vry.djBIcL, vry.AYXKKw);
            vry.AhwBna = str2;
            vry.EZpvd(vrfAEQbTJ, str2);
            Function1<? super java.lang.Boolean, Unit> function1 = EZpvd;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            SmartRecommendResp value = vry.OLrzqt().copydefault().getValue();
            if (value != null) {
                C50510vRb c50510vRbKWHzl = C50510vRb.Companion.KWHzl(value);
                java.lang.String str3 = copydefault;
                vry.AhwBna = str3;
                vry.EZpvd(c50510vRbKWHzl, str3);
                Function1<? super java.lang.Boolean, Unit> function12 = EZpvd;
                if (function12 != null) {
                    function12.invoke(java.lang.Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(BotGridOrderDialogData botGridOrderDialogData) {
        pUU.copydefault("eddie", "shareRangeData observe " + botGridOrderDialogData);
        Function1<? super BotGridOrderDialogData, Unit> function1 = valueOf;
        if (function1 != null) {
            Intrinsics.copydefault(botGridOrderDialogData);
            function1.invoke(botGridOrderDialogData);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AEQbTJ(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            pUU.copydefault("eddie", "shareRangeData closeNotify " + bool);
            Function1<? super java.lang.Boolean, Unit> function1 = OLrzqt;
            if (function1 != null) {
                Intrinsics.copydefault(bool);
                function1.invoke(bool);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(BotGridOrderDialogData botGridOrderDialogData) {
        pUU.copydefault("eddie", "shareRangeData restoreRangeData " + botGridOrderDialogData);
        Function1<? super BotGridOrderDialogData, Unit> function1 = gEmmrt;
        if (function1 != null) {
            Intrinsics.copydefault(botGridOrderDialogData);
            function1.invoke(botGridOrderDialogData);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        valueOf = null;
        EZpvd = null;
        OLrzqt = null;
        gEmmrt = null;
        C56058xve.Companion.copydefault().AEQbTJ("bot_kline_quick_order");
    }

    private final void EZpvd(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.SFHvfS, fragment).commitAllowingStateLoss();
    }

    @Override // o.InterfaceC49420uoH
    public void KWHzl(@NotNull BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        pUU.copydefault("eddie", "refreshData " + botGridOrderDialogData);
        if (isAdded()) {
            OLrzqt().EZpvd().setValue(botGridOrderDialogData);
        }
    }
}
