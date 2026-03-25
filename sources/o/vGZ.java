package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.bot.config.TpSlTypeConfigData;
import com.okinc.unify_trade.bot.contract_grid.viewModel.tpsl.BotGridTpSlPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52755wXd;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vGZ extends AbstractC49945uyC<uVV, BotGridTpSlPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm KWHzl;

    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
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
        return C48033uCm.Activity.hdpuIA;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ uVV KWHzl(vGZ vgz) {
        return vgz.values();
    }

    public vGZ() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridTpSlDialog$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridTpSlDialog$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridTpSlDialog$special$$inlined$activityViewModels$default$3
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vGZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ vGZ newInstance$default(StateListAnimator stateListAnimator, android.os.Parcelable parcelable, boolean z, java.lang.String str, java.lang.String str2, android.os.Parcelable parcelable2, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                parcelable2 = null;
            }
            return stateListAnimator.AEQbTJ(parcelable, z, str, str2, parcelable2);
        }

        public final vGZ AEQbTJ(@NotNull android.os.Parcelable parcelable, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, android.os.Parcelable parcelable2) {
            Intrinsics.checkNotNullParameter(parcelable, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", parcelable);
            bundle.putBoolean("edit_detail", z);
            bundle.putString("from", str);
            bundle.putString("bot_type", str2);
            bundle.putParcelable("bot_config", parcelable2);
            vGZ vgz = new vGZ();
            vgz.setArguments(bundle);
            return vgz;
        }
    }

    private final TacticsDetailPresenter zsXlph() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
    }

    @Override // o.AbstractC49945uyC, o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt().copydefault(getArguments());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        zLjUOn();
        AuCTelauCTel();
        AubY();
        sSMYrx();
    }

    private final void sSMYrx() {
        TradeLiveData<xMJ.Application> tradeLiveDataIwGUEr = OLrzqt().iwGUEr();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataIwGUEr.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.vHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGZ.AEQbTJ(this.copydefault, (xMJ.Application) obj);
            }
        }));
        if (OLrzqt().AEQbTJ(getArguments())) {
            TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = zsXlph().getNewProxyInstance();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            newProxyInstance.observe(viewLifecycleOwner2, new Fragment(new Function1() { // from class: o.vHr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vGZ.KWHzl(this.AEQbTJ, (C55804xqp) obj);
                }
            }));
        } else {
            TradeLiveData<kotlin.Pair<java.lang.String, java.lang.Integer>> tradeLiveDataDbNXlk = OLrzqt().DbNXlk();
            if (tradeLiveDataDbNXlk != null) {
                LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
                tradeLiveDataDbNXlk.observe(viewLifecycleOwner3, new Fragment(new Function1() { // from class: o.vHp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return vGZ.copydefault(this.AEQbTJ, (kotlin.Pair) obj);
                    }
                }));
            }
        }
        TradeLiveData<C55853xrl> tradeLiveDataValueOf = OLrzqt().valueOf();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner4, new Fragment(new Function1() { // from class: o.vHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGZ.AEQbTJ(this.OLrzqt, (C55853xrl) obj);
            }
        }));
        TradeLiveData<java.util.List<C56157xxX>> tradeLiveDataAYXKKw = OLrzqt().AYXKKw();
        if (tradeLiveDataAYXKKw != null) {
            LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
            tradeLiveDataAYXKKw.observe(viewLifecycleOwner5, new Fragment(new Function1() { // from class: o.vHh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vGZ.KWHzl(this.copydefault, (java.util.List) obj);
                }
            }));
        }
        OLrzqt().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.vHe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGZ.AEQbTJ(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Fragment(new Function1() { // from class: o.vHg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGZ.EZpvd(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(vGZ vgz, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        vgz.values().AEQbTJ.setContent(vgz.OLrzqt().AkhnZx());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vGZ vgz, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairEZpvd = vgz.OLrzqt().EZpvd((StrategyDetailsResponse) c55804xqp.copydefault());
        vgz.values().gEmmrt.setContent(pairEZpvd.getFirst());
        vgz.values().gEmmrt.setContentColor(pairEZpvd.getSecond().intValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vGZ vgz, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        vgz.values().gEmmrt.setContent((java.lang.String) pair.getFirst());
        vgz.values().gEmmrt.setContentColor(((java.lang.Number) pair.getSecond()).intValue());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vGZ vgz, C55853xrl c55853xrl) {
        Intrinsics.checkNotNullParameter(c55853xrl, "");
        vgz.values().djBIcL.KWHzl().setInputHint(vgz.OLrzqt().wlaJM().KWHzl());
        vgz.values().valueOf.KWHzl().setInputHint(vgz.OLrzqt().fIwbmz().KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vGZ vgz, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onMultiWindowModeChanged, 0, 1, (java.lang.Object) null);
        vgz.wlaJM();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(vGZ vgz, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        C56156xxW c56156xxWGEmmrt = vgz.OLrzqt().gEmmrt();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c56156xxWGEmmrt != null ? c56156xxWGEmmrt.bB_() : null))) {
            if (Intrinsics.EZpvd(pair.second, java.lang.Boolean.TRUE)) {
                AbstractC49945uyC.showLoading$default(vgz, 0L, 1, null);
            } else {
                vgz.EZpvd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vGZ vgz, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        C54301xDi c54301xDiAuCTel = vgz.OLrzqt().AuCTel();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c54301xDiAuCTel != null ? c54301xDiAuCTel.bB_() : null))) {
            vgz.values().gEmmrt.setContent("--");
        } else {
            C54308xDp c54308xDpHDKMBd = vgz.OLrzqt().hDKMBd();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c54308xDpHDKMBd != null ? c54308xDpHDKMBd.bB_() : null))) {
                vgz.values().AEQbTJ.setContent("--");
            } else {
                C56156xxW c56156xxWGEmmrt = vgz.OLrzqt().gEmmrt();
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c56156xxWGEmmrt != null ? c56156xxWGEmmrt.bB_() : null)) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
                    C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void zLjUOn() {
        OLrzqt().KWHzl(getArguments());
    }

    private final void AuCTelauCTel() {
        fIwbmz();
        uzCIH();
        AuCTel();
    }

    public final void fIwbmz() {
        java.util.HashMap<java.lang.String, java.lang.Boolean> mapIsConnected = OLrzqt().isConnected();
        C53560wnm c53560wnm = values().AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c53560wnm, "");
        java.lang.Boolean bool = mapIsConnected.get("up_price_info");
        int i = 8;
        c53560wnm.setVisibility((bool == null || !bool.booleanValue()) ? 8 : 0);
        C53560wnm c53560wnm2 = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(c53560wnm2, "");
        java.lang.Boolean bool2 = mapIsConnected.get("down_price_info");
        c53560wnm2.setVisibility((bool2 == null || !bool2.booleanValue()) ? 8 : 0);
        C53560wnm c53560wnm3 = values().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c53560wnm3, "");
        java.lang.Boolean bool3 = mapIsConnected.get("price_range");
        c53560wnm3.setVisibility((bool3 == null || !bool3.booleanValue()) ? 8 : 0);
        C53560wnm c53560wnm4 = values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c53560wnm4, "");
        java.lang.Boolean bool4 = mapIsConnected.get("lowest_price");
        c53560wnm4.setVisibility((bool4 == null || !bool4.booleanValue()) ? 8 : 0);
        C53560wnm c53560wnm5 = values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c53560wnm5, "");
        java.lang.Boolean bool5 = mapIsConnected.get("bot_pnl_ratio");
        if (bool5 != null && bool5.booleanValue()) {
            i = 0;
        }
        c53560wnm5.setVisibility(i);
        iwGUEr();
    }

    public final void iwGUEr() {
        java.util.HashMap<java.lang.String, java.lang.String> mapValues = OLrzqt().values();
        C53560wnm c53560wnm = values().AkhnZx;
        java.lang.String str = mapValues.get("up_price_info");
        if (str == null) {
            str = "--";
        }
        c53560wnm.setContent(str);
        C53560wnm c53560wnm2 = values().copydefault;
        java.lang.String str2 = mapValues.get("down_price_info");
        if (str2 == null) {
            str2 = "--";
        }
        c53560wnm2.setContent(str2);
        C53560wnm c53560wnm3 = values().AYXKKw;
        java.lang.String str3 = mapValues.get("price_range");
        if (str3 == null) {
            str3 = "--";
        }
        c53560wnm3.setContent(str3);
        C53560wnm c53560wnm4 = values().EZpvd;
        java.lang.String str4 = mapValues.get("lowest_price");
        c53560wnm4.setContent(str4 != null ? str4 : "--");
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ vGZ AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, vGZ vgz) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = vgz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.wlaJM();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C55052xcf AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vGZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C55052xcf c55052xcf, vGZ vgz) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c55052xcf;
            this.copydefault = vgz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                java.util.List<C55276xgr> listCopydefault = this.copydefault.OLrzqt().copydefault(this.copydefault.OLrzqt().zsXlph());
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listCopydefault, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : new ActionBar(this.AEQbTJ), this.copydefault.new LoaderManager(this.AEQbTJ), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : this.copydefault.ejfBZ(), (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vGZ KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, vGZ vgz) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = vgz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl.OLrzqt().AubY(), (java.lang.Object) "from_create")) {
                    this.KWHzl.fJNWhG();
                } else {
                    this.KWHzl.fARcdN();
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C55052xcf AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vGZ OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C55052xcf c55052xcf, vGZ vgz) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c55052xcf;
            this.OLrzqt = vgz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                java.util.List<C55276xgr> listCopydefault = this.OLrzqt.OLrzqt().copydefault(this.OLrzqt.OLrzqt().fJNWhG());
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listCopydefault, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : new Activity(this.AEQbTJ), this.OLrzqt.new Application(this.AEQbTJ), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : this.OLrzqt.ejfBZ(), (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
            }
        }
    }

    public final android.view.View ejfBZ() {
        android.content.Context context = getContext();
        if (context == null) {
            return null;
        }
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(0, C55298xhM.dp2px$default(24.0f, null, 1, null)));
        return textView;
    }

    public final void uzCIH() {
        TpSlTypeConfigData tpSlTypeConfigData;
        java.lang.String strAYXKKw;
        C50347vLa c50347vLa = values().djBIcL;
        c50347vLa.EZpvd().setText(C33070mpX.AYXKKw(C55688xof.Application.onBackPressed));
        c50347vLa.setShowMenu(OLrzqt().zuBGHE());
        c50347vLa.EZpvd().setChecked(OLrzqt().AxsJAY());
        C55052xcf c55052xcfOLrzqt = values().djBIcL.OLrzqt();
        c55052xcfOLrzqt.setVisibility((OLrzqt().zuBGHE() && OLrzqt().AxsJAY()) ? 0 : 8);
        TpSlTypeConfigData[] tpSlTypeConfigDataArrValues = TpSlTypeConfigData.values();
        int length = tpSlTypeConfigDataArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                tpSlTypeConfigData = null;
                break;
            }
            tpSlTypeConfigData = tpSlTypeConfigDataArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) tpSlTypeConfigData.getType(), (java.lang.Object) OLrzqt().zsXlph())) {
                break;
            } else {
                i++;
            }
        }
        if (tpSlTypeConfigData == null || (strAYXKKw = C33070mpX.AYXKKw(tpSlTypeConfigData.getTitle())) == null) {
            strAYXKKw = "";
        }
        c55052xcfOLrzqt.setTitle(strAYXKKw);
        c55052xcfOLrzqt.setOnClickListener(new FragmentManager(c55052xcfOLrzqt, 1000L, c55052xcfOLrzqt, this));
        final C47988uAv c47988uAvKWHzl = values().djBIcL.KWHzl();
        c47988uAvKWHzl.setVisibility(OLrzqt().AxsJAY() ? 0 : 8);
        hDKMBd();
        c47988uAvKWHzl.KWHzl(new uBH(new Function0() { // from class: o.vHk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vGZ.EZpvd(this.KWHzl, c47988uAvKWHzl);
            }
        }));
        C47988uAv.setInputContent$default(c47988uAvKWHzl, OLrzqt().AuCTelauCTel(), false, false, 6, null);
        isConnected();
        c47988uAvKWHzl.setOnFocusChangeCallback(new Function2() { // from class: o.vHm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vGZ.EZpvd(this.EZpvd, c47988uAvKWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ C55052xcf EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C55052xcf c55052xcf) {
            this.EZpvd = c55052xcf;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            this.EZpvd.setSelected(false);
        }
    }

    public static final class LoaderManager implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ C55052xcf OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(C55052xcf c55052xcf) {
            this.OLrzqt = c55052xcf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            copydefault(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void copydefault(C55276xgr c55276xgr) {
            TpSlTypeConfigData tpSlTypeConfigData;
            java.lang.String strAYXKKw;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            BotGridTpSlPresenter botGridTpSlPresenterOLrzqt = vGZ.this.OLrzqt();
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            botGridTpSlPresenterOLrzqt.AYXKKw((java.lang.String) objOLrzqt);
            C55052xcf c55052xcf = this.OLrzqt;
            TpSlTypeConfigData[] tpSlTypeConfigDataArrValues = TpSlTypeConfigData.values();
            vGZ vgz = vGZ.this;
            int length = tpSlTypeConfigDataArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tpSlTypeConfigData = null;
                    break;
                }
                tpSlTypeConfigData = tpSlTypeConfigDataArrValues[i];
                if (Intrinsics.EZpvd((java.lang.Object) tpSlTypeConfigData.getType(), (java.lang.Object) vgz.OLrzqt().zsXlph())) {
                    break;
                } else {
                    i++;
                }
            }
            if (tpSlTypeConfigData != null && (strAYXKKw = C33070mpX.AYXKKw(tpSlTypeConfigData.getTitle())) != null) {
                str = strAYXKKw;
            }
            c55052xcf.setTitle(str);
            C47988uAv.setInputContent$default(vGZ.KWHzl(vGZ.this).djBIcL.KWHzl(), "", false, false, 6, null);
            vGZ.this.OLrzqt().AEQbTJ();
            vGZ.this.hDKMBd();
            vGZ.this.getNewProxyInstance();
        }
    }

    public static final Unit EZpvd(vGZ vgz, C47988uAv c47988uAv) {
        vgz.OLrzqt().gEmmrt(c47988uAv.AkhnZx());
        vgz.isConnected();
        vgz.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vGZ vgz, C47988uAv c47988uAv, C47988uAv c47988uAv2, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        vgz.OLrzqt().AEQbTJ(z, c47988uAv.AkhnZx());
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        TpSlTypeConfigData tpSlTypeConfigData;
        java.lang.String strAYXKKw;
        C50347vLa c50347vLa = values().valueOf;
        c50347vLa.EZpvd().setText(C33070mpX.AYXKKw(C55688xof.Application.getLifecycle));
        c50347vLa.setShowMenu(OLrzqt().zuBGHE());
        c50347vLa.EZpvd().setChecked(OLrzqt().sSMYrx());
        int i = 0;
        c50347vLa.OLrzqt().setVisibility(OLrzqt().zuBGHE() && OLrzqt().sSMYrx() ? 0 : 8);
        final C47988uAv c47988uAvKWHzl = values().valueOf.KWHzl();
        c47988uAvKWHzl.setVisibility(OLrzqt().sSMYrx() ? 0 : 8);
        getFieldNames();
        c47988uAvKWHzl.KWHzl(new uBH(new Function0() { // from class: o.vHf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vGZ.copydefault(this.EZpvd, c47988uAvKWHzl);
            }
        }));
        C47988uAv.setInputContent$default(c47988uAvKWHzl, OLrzqt().ejfBZ(), false, false, 6, null);
        copydefault();
        c47988uAvKWHzl.setOnFocusChangeCallback(new Function2() { // from class: o.vHd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vGZ.KWHzl(this.KWHzl, c47988uAvKWHzl, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C55052xcf c55052xcfOLrzqt = values().valueOf.OLrzqt();
        TpSlTypeConfigData[] tpSlTypeConfigDataArrValues = TpSlTypeConfigData.values();
        int length = tpSlTypeConfigDataArrValues.length;
        while (true) {
            if (i >= length) {
                tpSlTypeConfigData = null;
                break;
            }
            tpSlTypeConfigData = tpSlTypeConfigDataArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) tpSlTypeConfigData.getType(), (java.lang.Object) OLrzqt().fJNWhG())) {
                break;
            } else {
                i++;
            }
        }
        if (tpSlTypeConfigData == null || (strAYXKKw = C33070mpX.AYXKKw(tpSlTypeConfigData.getTitle())) == null) {
            strAYXKKw = "";
        }
        c55052xcfOLrzqt.setTitle(strAYXKKw);
        c55052xcfOLrzqt.setOnClickListener(new TaskDescription(c55052xcfOLrzqt, 1000L, c55052xcfOLrzqt, this));
    }

    public static final Unit copydefault(vGZ vgz, C47988uAv c47988uAv) {
        vgz.OLrzqt().AEQbTJ(c47988uAv.AkhnZx());
        vgz.isConnected();
        vgz.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vGZ vgz, C47988uAv c47988uAv, C47988uAv c47988uAv2, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        vgz.OLrzqt().EZpvd(z, c47988uAv.AkhnZx());
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ C55052xcf AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C55052xcf c55052xcf) {
            this.AEQbTJ = c55052xcf;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            this.AEQbTJ.setSelected(false);
        }
    }

    public static final class Application implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ C55052xcf OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C55052xcf c55052xcf) {
            this.OLrzqt = c55052xcf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            KWHzl(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void KWHzl(C55276xgr c55276xgr) {
            TpSlTypeConfigData tpSlTypeConfigData;
            java.lang.String strAYXKKw;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            BotGridTpSlPresenter botGridTpSlPresenterOLrzqt = vGZ.this.OLrzqt();
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            botGridTpSlPresenterOLrzqt.EZpvd((java.lang.String) objOLrzqt);
            C55052xcf c55052xcf = this.OLrzqt;
            TpSlTypeConfigData[] tpSlTypeConfigDataArrValues = TpSlTypeConfigData.values();
            vGZ vgz = vGZ.this;
            int length = tpSlTypeConfigDataArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tpSlTypeConfigData = null;
                    break;
                }
                tpSlTypeConfigData = tpSlTypeConfigDataArrValues[i];
                if (Intrinsics.EZpvd((java.lang.Object) tpSlTypeConfigData.getType(), (java.lang.Object) vgz.OLrzqt().fJNWhG())) {
                    break;
                } else {
                    i++;
                }
            }
            if (tpSlTypeConfigData != null && (strAYXKKw = C33070mpX.AYXKKw(tpSlTypeConfigData.getTitle())) != null) {
                str = strAYXKKw;
            }
            c55052xcf.setTitle(str);
            C47988uAv.setInputContent$default(vGZ.KWHzl(vGZ.this).valueOf.KWHzl(), "", false, false, 6, null);
            vGZ.this.OLrzqt().EZpvd();
            vGZ.this.getFieldNames();
            vGZ.this.getNewProxyInstance();
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final boolean isConnected() {
        if (OLrzqt().copydefault().getFirst().booleanValue()) {
            values().djBIcL.KWHzl().copydefault();
            getNewProxyInstance();
        } else {
            java.lang.Object second = OLrzqt().copydefault().getSecond();
            if (second instanceof java.lang.String) {
                C47988uAv c47988uAvKWHzl = values().djBIcL.KWHzl();
                java.lang.Object second2 = OLrzqt().copydefault().getSecond();
                Intrinsics.copydefault(second2, "");
                c47988uAvKWHzl.setInputErrorMsg((java.lang.String) second2);
            } else if (second instanceof java.lang.Object[]) {
                C47988uAv c47988uAvKWHzl2 = values().djBIcL.KWHzl();
                java.lang.Object second3 = OLrzqt().copydefault().getSecond();
                Intrinsics.copydefault(second3, "");
                c47988uAvKWHzl2.setInputErrorMsg((java.lang.String[]) second3);
            } else {
                values().djBIcL.KWHzl().copydefault();
            }
        }
        return OLrzqt().copydefault().getFirst().booleanValue();
    }

    public final boolean copydefault() {
        if (OLrzqt().OLrzqt().getFirst().booleanValue()) {
            values().valueOf.KWHzl().copydefault();
            getNewProxyInstance();
        } else {
            java.lang.Object second = OLrzqt().OLrzqt().getSecond();
            if (second instanceof java.lang.String) {
                C47988uAv c47988uAvKWHzl = values().valueOf.KWHzl();
                java.lang.Object second2 = OLrzqt().OLrzqt().getSecond();
                Intrinsics.copydefault(second2, "");
                c47988uAvKWHzl.setInputErrorMsg((java.lang.String) second2);
            } else if (second instanceof java.lang.Object[]) {
                C47988uAv c47988uAvKWHzl2 = values().valueOf.KWHzl();
                java.lang.Object second3 = OLrzqt().OLrzqt().getSecond();
                Intrinsics.copydefault(second3, "");
                c47988uAvKWHzl2.setInputErrorMsg((java.lang.String[]) second3);
            } else {
                values().valueOf.KWHzl().copydefault();
            }
        }
        return OLrzqt().OLrzqt().getFirst().booleanValue();
    }

    public final void hDKMBd() {
        C47988uAv c47988uAvKWHzl = values().djBIcL.KWHzl();
        C47988uAv.setInputLabel$default(c47988uAvKWHzl, OLrzqt().wlaJM().EZpvd(), null, 2, null);
        c47988uAvKWHzl.setMaxDecimal(OLrzqt().wlaJM().OLrzqt());
        c47988uAvKWHzl.setInputUnit(OLrzqt().wlaJM().AEQbTJ());
        c47988uAvKWHzl.setInputHint(OLrzqt().wlaJM().KWHzl());
    }

    public final void getFieldNames() {
        C47988uAv c47988uAvKWHzl = values().valueOf.KWHzl();
        C47988uAv.setInputLabel$default(c47988uAvKWHzl, OLrzqt().fIwbmz().EZpvd(), null, 2, null);
        c47988uAvKWHzl.setMaxDecimal(OLrzqt().fIwbmz().OLrzqt());
        c47988uAvKWHzl.setInputUnit(OLrzqt().fIwbmz().AEQbTJ());
        c47988uAvKWHzl.setInputHint(OLrzqt().fIwbmz().KWHzl());
    }

    private final void AubY() {
        values().djBIcL.OLrzqt(new Function1() { // from class: o.vHi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGZ.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        values().valueOf.OLrzqt(new Function1() { // from class: o.vHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGZ.AEQbTJ(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit OLrzqt(vGZ vgz, boolean z) {
        vgz.OLrzqt().OLrzqt(z);
        vgz.getNewProxyInstance();
        if (!z) {
            C47988uAv.setInputContent$default(vgz.values().djBIcL.KWHzl(), "", false, false, 6, null);
            vgz.OLrzqt().AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vGZ vgz, boolean z) {
        vgz.OLrzqt().AEQbTJ(z);
        vgz.getNewProxyInstance();
        if (!z) {
            C47988uAv.setInputContent$default(vgz.values().valueOf.KWHzl(), "", false, false, 6, null);
            vgz.OLrzqt().EZpvd();
        }
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        AppCompatTextView appCompatTextView = values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().getFieldNames().getFirst()) ? 0 : 8);
        values().AhwBna.setText(OLrzqt().getFieldNames().getFirst());
        values().AhwBna.setTextColor(OLrzqt().getFieldNames().getSecond().intValue());
    }

    public final void fARcdN() {
        OLrzqt().AhwBna();
    }

    public final void fJNWhG() {
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().zsXlph(), (java.lang.Object) "tp_sl_price")) {
            values().djBIcL.KWHzl().AuCTelauCTel();
        }
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().fJNWhG(), (java.lang.Object) "tp_sl_price")) {
            values().valueOf.KWHzl().AuCTelauCTel();
        }
        if (isConnected() && copydefault()) {
            if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().AubY(), (java.lang.Object) "from_edit")) {
                OLrzqt().AhwBna();
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", OLrzqt().fARcdN());
            getParentFragmentManager().setFragmentResult("tp_sl_settings", bundle);
            wlaJM();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wlaJM() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDCKfqPDCfLja));
        wxq.setDividerVisibility(true);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Dialog(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOnClickListener(new PendingIntent(wyf, 1000L, this));
    }
}
