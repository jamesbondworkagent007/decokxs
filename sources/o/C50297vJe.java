package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractQuickOrderContainerDialog$initView$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.InterfaceC54581xNr;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vJe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50297vJe extends AbstractC32998moE implements InterfaceC49420uoH {
    public static Function1<? super java.lang.Boolean, Unit> KWHzl;
    public static Function1<? super java.lang.Boolean, Unit> copydefault;
    public static Function1<? super BotGridOrderDialogData, Unit> djBIcL;
    public static Function1<? super BotGridOrderDialogData, Unit> gEmmrt;
    public java.lang.String AYXKKw;
    public java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public java.lang.String valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final java.lang.String OLrzqt = "ContractQuickOrderContainerDialog";
    public static final java.lang.String AEQbTJ = "ContractGridQuickOrderDialog";

    /* JADX INFO: renamed from: o.vJe$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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
        this.AYXKKw = str;
        this.valueOf = str2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49420uoH
    public void KWHzl(@NotNull Function1<? super BotGridOrderDialogData, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        djBIcL = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AhwBna = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49420uoH
    public void OLrzqt(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC49420uoH
    public void copydefault(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.sSMYrx;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C50297vJe() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractQuickOrderContainerDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractQuickOrderContainerDialog$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vPY.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractQuickOrderContainerDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractQuickOrderContainerDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractQuickOrderContainerDialog$special$$inlined$viewModels$default$5
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
        this.AYXKKw = "";
        this.valueOf = "";
        this.AhwBna = OLrzqt;
    }

    public final vPY AhwBna() {
        return (vPY) this.AkhnZx.getValue();
    }

    /* JADX INFO: renamed from: o.vJe$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vJe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String OLrzqt() {
            return C50297vJe.OLrzqt;
        }

        public final java.lang.String AEQbTJ() {
            return C50297vJe.AEQbTJ;
        }

        public final Function1<java.lang.Boolean, Unit> EZpvd() {
            return C50297vJe.KWHzl;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        gEmmrt();
        C56058xve.Companion.copydefault().KWHzl("bot_kline_quick_order", (WebSocketProtocol.PAYLOAD_SHORT & 2) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 4) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 8) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 16) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 32) != 0 ? null : null, (WebSocketProtocol.PAYLOAD_SHORT & 64) == 0 ? null : null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ContractQuickOrderContainerDialog$initView$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, this.valueOf, this.AYXKKw, null, null, 12, null) : null;
        if ((suggestedInstrument$default == null || !suggestedInstrument$default.isUSDUMContract()) && !(suggestedInstrument$default != null && Intrinsics.EZpvd(suggestedInstrument$default.isNegativeContract(), java.lang.Boolean.TRUE) && Intrinsics.EZpvd((java.lang.Object) suggestedInstrument$default.getInstType(), (java.lang.Object) "FUTURES"))) {
            return;
        }
        C33134mqi.copydefault(C48033uCm.Fragment.QzqeNH);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf() {
        boolean z;
        xOW newProxyInstance;
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        java.lang.String strOLrzqt = AhwBna().OLrzqt();
        java.lang.String str = this.AYXKKw;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) {
            z = false;
        } else {
            z = true;
            if (!newProxyInstance.QbewEr()) {
            }
        }
        c55867xrz.copydefault("bot_kline_quick_order", strOLrzqt, "contract_grid", "", str, new BotGrafanaInfo(null, null, null, z, 7, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw() {
        C56111xwe<java.lang.String> c56111xweDjBIcL = AhwBna().djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweDjBIcL.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.vJg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50297vJe.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        AhwBna().gEmmrt().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.vJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50297vJe.AEQbTJ((BotGridOrderDialogData) obj);
            }
        }));
        AhwBna().AEQbTJ().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.vJh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50297vJe.copydefault((java.lang.Boolean) obj);
            }
        }));
        AhwBna().KWHzl().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.vJi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50297vJe.EZpvd((BotGridOrderDialogData) obj);
            }
        }));
    }

    public static final Unit copydefault(C50297vJe c50297vJe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = OLrzqt;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2)) {
            vIF vifOLrzqt = vIF.Companion.OLrzqt(c50297vJe.AYXKKw, c50297vJe.valueOf);
            c50297vJe.AhwBna = str2;
            c50297vJe.AEQbTJ(vifOLrzqt, str2);
            Function1<? super java.lang.Boolean, Unit> function1 = KWHzl;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.TRUE);
            }
        } else {
            SmartRecommendResp value = c50297vJe.AhwBna().copydefault().getValue();
            if (value != null) {
                vHQ vhqCopydefault = vHQ.Companion.copydefault(value);
                java.lang.String str3 = AEQbTJ;
                c50297vJe.AhwBna = str3;
                c50297vJe.AEQbTJ(vhqCopydefault, str3);
                Function1<? super java.lang.Boolean, Unit> function12 = KWHzl;
                if (function12 != null) {
                    function12.invoke(java.lang.Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(BotGridOrderDialogData botGridOrderDialogData) {
        pUU.copydefault("eddie", "shareRangeData observe " + botGridOrderDialogData);
        Function1<? super BotGridOrderDialogData, Unit> function1 = djBIcL;
        if (function1 != null) {
            Intrinsics.copydefault(botGridOrderDialogData);
            function1.invoke(botGridOrderDialogData);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            pUU.copydefault("eddie", "shareRangeData closeNotify " + bool);
            Function1<? super java.lang.Boolean, Unit> function1 = copydefault;
            if (function1 != null) {
                Intrinsics.copydefault(bool);
                function1.invoke(bool);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(BotGridOrderDialogData botGridOrderDialogData) {
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
        djBIcL = null;
        KWHzl = null;
        copydefault = null;
        gEmmrt = null;
        C56058xve.Companion.copydefault().AEQbTJ("bot_kline_quick_order");
    }

    public final void AEQbTJ(androidx.fragment.app.Fragment fragment, java.lang.String str) {
        if (!isAdded() || isDetached()) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.SFHvfS, fragment).commitAllowingStateLoss();
    }

    @Override // o.InterfaceC49420uoH
    public void KWHzl(@NotNull BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        if (!isAdded() || isDetached()) {
            return;
        }
        AhwBna().EZpvd().setValue(botGridOrderDialogData);
    }
}
