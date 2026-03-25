package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.bot.TpSLTriggerItem;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.bot.config.SpotTpSlTypeConfigData;
import com.okinc.unify_trade.bot.contract_grid.viewModel.tpsl.BotGridTpSlPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52755wXd;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vPC extends AbstractC49945uyC<uVW, BotGridTpSlPresenter> {
    public final InterfaceC56387yDm copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class AssistContent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(Function1 function1) {
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
        return C48033uCm.Activity.FHvxmb;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ uVW AhwBna(vPC vpc) {
        return vpc.values();
    }

    public vPC() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.BotGridTpSlDialog2$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.BotGridTpSlDialog2$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.BotGridTpSlDialog2$special$$inlined$activityViewModels$default$3
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vPC.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ vPC newInstance$default(StateListAnimator stateListAnimator, android.os.Parcelable parcelable, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, android.os.Parcelable parcelable2, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                str3 = "0";
            }
            java.lang.String str4 = str3;
            if ((i & 32) != 0) {
                parcelable2 = null;
            }
            return stateListAnimator.copydefault(parcelable, z, str, str2, str4, parcelable2);
        }

        public final vPC copydefault(@NotNull android.os.Parcelable parcelable, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, android.os.Parcelable parcelable2) {
            Intrinsics.checkNotNullParameter(parcelable, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", parcelable);
            bundle.putBoolean("edit_detail", z);
            bundle.putString("from", str);
            bundle.putString("bot_type", str2);
            bundle.putParcelable("bot_config", parcelable2);
            bundle.putString("bot_order_amount", str3);
            vPC vpc = new vPC();
            vpc.setArguments(bundle);
            return vpc;
        }
    }

    private final TacticsDetailPresenter getNewProxyInstance() {
        return (TacticsDetailPresenter) this.copydefault.getValue();
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
        iwGUEr();
        AuCTelauCTel();
        hDKMBd();
        gHZMYf();
    }

    private final void gHZMYf() {
        TradeLiveData<xMJ.Application> tradeLiveDataIwGUEr = OLrzqt().iwGUEr();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataIwGUEr.observe(viewLifecycleOwner, new AssistContent(new Function1() { // from class: o.vPU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vPC.copydefault(this.copydefault, (xMJ.Application) obj);
            }
        }));
        if (OLrzqt().AEQbTJ(getArguments())) {
            TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = getNewProxyInstance().getNewProxyInstance();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            newProxyInstance.observe(viewLifecycleOwner2, new AssistContent(new Function1() { // from class: o.vPQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vPC.AEQbTJ(this.EZpvd, (C55804xqp) obj);
                }
            }));
        } else {
            TradeLiveData<C55804xqp<StrategyDetailsResponse>> tradeLiveDataFetchVPNInfo = OLrzqt().fetchVPNInfo();
            if (tradeLiveDataFetchVPNInfo != null) {
                LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
                tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner3, new AssistContent(new Function1() { // from class: o.vPR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return vPC.OLrzqt(this.KWHzl, (C55804xqp) obj);
                    }
                }));
            }
        }
        TradeLiveData<C55853xrl> tradeLiveDataValueOf = OLrzqt().valueOf();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner4, new AssistContent(new Function1() { // from class: o.vPX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vPC.copydefault(this.KWHzl, (C55853xrl) obj);
            }
        }));
        TradeLiveData<java.util.List<C56157xxX>> tradeLiveDataAYXKKw = OLrzqt().AYXKKw();
        if (tradeLiveDataAYXKKw != null) {
            LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
            tradeLiveDataAYXKKw.observe(viewLifecycleOwner5, new AssistContent(new Function1() { // from class: o.vPH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vPC.copydefault(this.copydefault, (java.util.List) obj);
                }
            }));
        }
        OLrzqt().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.vPG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vPC.EZpvd(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.vPJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vPC.AEQbTJ(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(vPC vpc, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        vpc.values().AYXKKw.setContent(vpc.OLrzqt().AkhnZx());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vPC vpc, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairCopydefault = vpc.OLrzqt().copydefault((StrategyDetailsResponse) c55804xqp.copydefault());
        if (pairCopydefault != null) {
            vpc.values().gEmmrt.setContent(pairCopydefault.getFirst());
            vpc.values().gEmmrt.setContentColor(pairCopydefault.getSecond().intValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vPC vpc, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        kotlin.Pair<java.lang.String, java.lang.Integer> pairCopydefault = vpc.OLrzqt().copydefault((StrategyDetailsResponse) c55804xqp.copydefault());
        if (pairCopydefault != null) {
            vpc.values().gEmmrt.setContent(pairCopydefault.getFirst());
            vpc.values().gEmmrt.setContentColor(pairCopydefault.getSecond().intValue());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vPC vpc, C55853xrl c55853xrl) {
        Intrinsics.checkNotNullParameter(c55853xrl, "");
        vpc.values().DbNXlk.AEQbTJ().setInputHint(vpc.OLrzqt().wlaJM().KWHzl());
        vpc.values().fetchVPNInfo.AEQbTJ().setInputHint(vpc.OLrzqt().fIwbmz().KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vPC vpc, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        vpc.getParentFragmentManager().setFragmentResult("tp_sl_settings", new android.os.Bundle());
        vpc.ejfBZ();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vPC vpc, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        C56156xxW c56156xxWGEmmrt = vpc.OLrzqt().gEmmrt();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c56156xxWGEmmrt != null ? c56156xxWGEmmrt.bB_() : null))) {
            if (Intrinsics.EZpvd(pair.second, java.lang.Boolean.TRUE)) {
                AbstractC49945uyC.showLoading$default(vpc, 0L, 1, null);
            } else {
                vpc.EZpvd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(vPC vpc, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        C54301xDi c54301xDiAuCTel = vpc.OLrzqt().AuCTel();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c54301xDiAuCTel != null ? c54301xDiAuCTel.bB_() : null))) {
            vpc.values().gEmmrt.setContent("--");
        } else {
            C54308xDp c54308xDpHDKMBd = vpc.OLrzqt().hDKMBd();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c54308xDpHDKMBd != null ? c54308xDpHDKMBd.bB_() : null))) {
                vpc.values().AYXKKw.setContent("--");
            } else {
                C56156xxW c56156xxWGEmmrt = vpc.OLrzqt().gEmmrt();
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (c56156xxWGEmmrt != null ? c56156xxWGEmmrt.bB_() : null)) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
                    C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void iwGUEr() {
        OLrzqt().KWHzl(getArguments());
    }

    private final void AuCTelauCTel() {
        AubY();
        wlaJM();
        zsXlph();
        isConnected();
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ AppCompatTextView AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vPC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, AppCompatTextView appCompatTextView, vPC vpc) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = appCompatTextView;
            this.copydefault = vpc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.setSelected(!r7.isSelected());
                ConstraintLayout constraintLayout = vPC.AhwBna(this.copydefault).OLrzqt;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setVisibility(this.AEQbTJ.isSelected() ? 0 : 8);
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ vPC AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C55052xcf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C55052xcf c55052xcf, vPC vpc) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = c55052xcf;
            this.AEQbTJ = vpc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List<C55276xgr> listAhwBna;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                C55850xri c55850xriUzCIH = this.AEQbTJ.OLrzqt().uzCIH();
                if (c55850xriUzCIH == null || (listAhwBna = c55850xriUzCIH.OLrzqt(this.AEQbTJ.OLrzqt().zLjUOn())) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listAhwBna, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : new PendingIntent(this.copydefault), this.AEQbTJ.new FragmentManager(this.copydefault), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : this.AEQbTJ.uzCIH(), (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vPC KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, vPC vpc) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = vpc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.ejfBZ();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ vPC KWHzl;
        public final /* synthetic */ java.util.List copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, java.util.List list, vPC vpc) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = list;
            this.KWHzl = vpc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.copydefault.contains(this.KWHzl.OLrzqt().zsXlph())) {
                    vPC.AhwBna(this.KWHzl).DbNXlk.AEQbTJ().AuCTelauCTel();
                }
                if (this.copydefault.contains(this.KWHzl.OLrzqt().fJNWhG())) {
                    vPC.AhwBna(this.KWHzl).fetchVPNInfo.AEQbTJ().AuCTelauCTel();
                }
                if (this.KWHzl.AuCTel() && this.KWHzl.fIwbmz() && this.KWHzl.copydefault()) {
                    if (Intrinsics.EZpvd((java.lang.Object) this.KWHzl.OLrzqt().AubY(), (java.lang.Object) "from_create")) {
                        this.KWHzl.fJNWhG();
                    } else {
                        this.KWHzl.getFieldNames();
                    }
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C55052xcf KWHzl;
        public final /* synthetic */ vPC OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C55052xcf c55052xcf, vPC vpc) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c55052xcf;
            this.OLrzqt = vpc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.util.List<C55276xgr> listAhwBna;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.setSelected(true);
                C52755wXd.Application application = C52755wXd.Companion;
                C55850xri c55850xriUzCIH = this.OLrzqt.OLrzqt().uzCIH();
                if (c55850xriUzCIH == null || (listAhwBna = c55850xriUzCIH.AEQbTJ(this.OLrzqt.OLrzqt().zLjUOn())) == null) {
                    listAhwBna = yDY.AhwBna();
                }
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                application.AEQbTJ(listAhwBna, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : new Activity(this.KWHzl), this.OLrzqt.new Application(this.KWHzl), (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : this.OLrzqt.uzCIH(), (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        AppCompatTextView appCompatTextView = values().values;
        appCompatTextView.setSelected(false);
        appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, appCompatTextView, this));
        fARcdN();
        final C47988uAv c47988uAv = values().copydefault;
        C47988uAv.setInputLabel$default(c47988uAv, C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsGetContent), null, 2, null);
        TpSlTriggerParam tpSlTriggerParamZLjUOn = OLrzqt().zLjUOn();
        C47988uAv.setInputContent$default(c47988uAv, tpSlTriggerParamZLjUOn != null ? tpSlTriggerParamZLjUOn.getDelaySeconds() : null, false, false, 6, null);
        TradeLiveData<SpotGridTpSlConfig> newProxyInstance = OLrzqt().getNewProxyInstance();
        if (newProxyInstance != null) {
            SpotGridTpSlConfig value = newProxyInstance.getValue();
            java.lang.String minDelaySeconds = value != null ? value.getMinDelaySeconds() : null;
            SpotGridTpSlConfig value2 = newProxyInstance.getValue();
            c47988uAv.setInputUnit(minDelaySeconds + " - " + (value2 != null ? value2.getMaxDelaySeconds() : null) + " s");
        }
        c47988uAv.KWHzl(new uBH(new Function0() { // from class: o.vPP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vPC.AEQbTJ(this.KWHzl, c47988uAv);
            }
        }));
        copydefault();
        final C47988uAv c47988uAv2 = values().KWHzl;
        C47988uAv.setInputLabel$default(c47988uAv2, C33070mpX.AYXKKw(C48033uCm.Fragment.izFvvl), null, 2, null);
        c47988uAv2.djBIcL().setEnabled(false);
        C55850xri c55850xriUzCIH = OLrzqt().uzCIH();
        final java.util.List<C55276xgr> listKWHzl = c55850xriUzCIH != null ? c55850xriUzCIH.KWHzl(OLrzqt().zLjUOn()) : null;
        c47988uAv2.setUnitClickable(C33129mqd.KWHzl((java.util.Collection) listKWHzl), new Function0() { // from class: o.vPM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vPC.AEQbTJ(c47988uAv2, listKWHzl, this);
            }
        });
        C55850xri c55850xriUzCIH2 = OLrzqt().uzCIH();
        c47988uAv2.setInputUnit(c55850xriUzCIH2 != null ? c55850xriUzCIH2.DbNXlk(OLrzqt().zLjUOn()) : null);
    }

    public static final Unit AEQbTJ(vPC vpc, C47988uAv c47988uAv) {
        vpc.OLrzqt().OLrzqt(c47988uAv.AkhnZx());
        vpc.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final C47988uAv c47988uAv, java.util.List list, final vPC vpc) {
        c47988uAv.setSelected(true);
        C52755wXd.Application application = C52755wXd.Companion;
        if (list == null) {
            list = yDY.AhwBna();
        }
        androidx.fragment.app.FragmentManager childFragmentManager = vpc.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.AEQbTJ(list, childFragmentManager, (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : new Function0() { // from class: o.vPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vPC.KWHzl(c47988uAv);
            }
        }, new Function1() { // from class: o.vPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vPC.AEQbTJ(c47988uAv, vpc, (C55276xgr) obj);
            }
        }, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) != 0 ? null : null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C47988uAv c47988uAv, vPC vpc, C55276xgr c55276xgr) {
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        c47988uAv.setInputUnit(C33129mqd.gEmmrt(c55276xgr.AhwBna()));
        vpc.OLrzqt().KWHzl(C33129mqd.gEmmrt(c55276xgr.OLrzqt()));
        vpc.zLjUOn();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C47988uAv c47988uAv) {
        c47988uAv.setSelected(false);
        return Unit.INSTANCE;
    }

    private final void AubY() {
        C53560wnm c53560wnm = values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c53560wnm, "");
        java.lang.Boolean bool = OLrzqt().isConnected().get("bot_pnl_ratio");
        c53560wnm.setVisibility((bool == null || !bool.booleanValue()) ? 8 : 0);
        AxsJAY();
    }

    private final void AxsJAY() {
        java.util.HashMap<java.lang.String, java.lang.String> mapValues = OLrzqt().values();
        C53560wnm c53560wnm = values().AuCTel;
        java.lang.String str = mapValues.get("up_price_info");
        if (str == null) {
            str = "--";
        }
        c53560wnm.setContent(str);
        C53560wnm c53560wnm2 = values().AEQbTJ;
        java.lang.String str2 = mapValues.get("down_price_info");
        if (str2 == null) {
            str2 = "--";
        }
        c53560wnm2.setContent(str2);
        C53560wnm c53560wnm3 = values().valueOf;
        java.lang.String str3 = mapValues.get("price_range");
        if (str3 == null) {
            str3 = "--";
        }
        c53560wnm3.setContent(str3);
        C53560wnm c53560wnm4 = values().AhwBna;
        java.lang.String str4 = mapValues.get("lowest_price");
        c53560wnm4.setContent(str4 != null ? str4 : "--");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.view.View uzCIH() {
        android.content.Context context = getContext();
        if (context == null) {
            return null;
        }
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(0, C55298xhM.dp2px$default(24.0f, null, 1, null)));
        return textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void wlaJM() {
        java.lang.String strEZpvd;
        TpSLTriggerItem tp;
        values().DbNXlk.KWHzl().setText(C33070mpX.AYXKKw(C55688xof.Application.onBackPressed));
        C55052xcf c55052xcfCopydefault = values().DbNXlk.copydefault();
        C55850xri c55850xriUzCIH = OLrzqt().uzCIH();
        if (c55850xriUzCIH == null) {
            strEZpvd = "";
        } else {
            TpSlTriggerParam tpSlTriggerParamZLjUOn = OLrzqt().zLjUOn();
            strEZpvd = c55850xriUzCIH.EZpvd((tpSlTriggerParamZLjUOn == null || (tp = tpSlTriggerParamZLjUOn.getTp()) == null) ? null : tp.getIndicator());
            if (strEZpvd == null) {
            }
        }
        c55052xcfCopydefault.setTitle(strEZpvd);
        c55052xcfCopydefault.setOnClickListener(new Dialog(c55052xcfCopydefault, 1000L, c55052xcfCopydefault, this));
        final C47988uAv c47988uAvAEQbTJ = values().DbNXlk.AEQbTJ();
        zuBGHE();
        c47988uAvAEQbTJ.KWHzl(new uBH(new Function0() { // from class: o.vPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vPC.valueOf(this.KWHzl, c47988uAvAEQbTJ);
            }
        }));
        C47988uAv.setInputContent$default(c47988uAvAEQbTJ, OLrzqt().AuCTelauCTel(), false, false, 6, null);
        AuCTel();
        c47988uAvAEQbTJ.setOnFocusChangeCallback(new Function2() { // from class: o.vPO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vPC.OLrzqt(this.EZpvd, c47988uAvAEQbTJ, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final class FragmentManager implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ C55052xcf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(C55052xcf c55052xcf) {
            this.copydefault = c55052xcf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            EZpvd(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C55276xgr c55276xgr) {
            TpSLTriggerItem tp;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            vPC.this.OLrzqt().AYXKKw(C33129mqd.gEmmrt(c55276xgr.OLrzqt()));
            C55052xcf c55052xcf = this.copydefault;
            C55850xri c55850xriUzCIH = vPC.this.OLrzqt().uzCIH();
            if (c55850xriUzCIH != null) {
                TpSlTriggerParam tpSlTriggerParamZLjUOn = vPC.this.OLrzqt().zLjUOn();
                java.lang.String strEZpvd = c55850xriUzCIH.EZpvd((tpSlTriggerParamZLjUOn == null || (tp = tpSlTriggerParamZLjUOn.getTp()) == null) ? null : tp.getIndicator());
                if (strEZpvd != null) {
                    str = strEZpvd;
                }
            }
            c55052xcf.setTitle(str);
            C47988uAv.setInputContent$default(vPC.AhwBna(vPC.this).DbNXlk.AEQbTJ(), "", false, false, 6, null);
            vPC.this.OLrzqt().AEQbTJ();
            vPC.this.zuBGHE();
            vPC.this.zLjUOn();
        }
    }

    public static final class PendingIntent implements Function0<Unit> {
        public final /* synthetic */ C55052xcf KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(C55052xcf c55052xcf) {
            this.KWHzl = c55052xcf;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            this.KWHzl.setSelected(false);
        }
    }

    public static final Unit valueOf(vPC vpc, C47988uAv c47988uAv) {
        vpc.OLrzqt().gEmmrt(c47988uAv.AkhnZx());
        vpc.AuCTel();
        vpc.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vPC vpc, C47988uAv c47988uAv, C47988uAv c47988uAv2, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        vpc.OLrzqt().AEQbTJ(z, c47988uAv.AkhnZx());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zsXlph() {
        java.lang.String strEZpvd;
        TpSLTriggerItem sl;
        values().fetchVPNInfo.KWHzl().setText(C33070mpX.AYXKKw(C55688xof.Application.getLifecycle));
        final C47988uAv c47988uAvAEQbTJ = values().fetchVPNInfo.AEQbTJ();
        AwvSrB();
        c47988uAvAEQbTJ.KWHzl(new uBH(new Function0() { // from class: o.vPS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vPC.EZpvd(this.EZpvd, c47988uAvAEQbTJ);
            }
        }));
        C47988uAv.setInputContent$default(c47988uAvAEQbTJ, OLrzqt().ejfBZ(), false, false, 6, null);
        fIwbmz();
        c47988uAvAEQbTJ.setOnFocusChangeCallback(new Function2() { // from class: o.vPT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vPC.EZpvd(this.copydefault, c47988uAvAEQbTJ, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
        C55052xcf c55052xcfCopydefault = values().fetchVPNInfo.copydefault();
        C55850xri c55850xriUzCIH = OLrzqt().uzCIH();
        if (c55850xriUzCIH == null) {
            strEZpvd = "";
        } else {
            TpSlTriggerParam tpSlTriggerParamZLjUOn = OLrzqt().zLjUOn();
            strEZpvd = c55850xriUzCIH.EZpvd((tpSlTriggerParamZLjUOn == null || (sl = tpSlTriggerParamZLjUOn.getSl()) == null) ? null : sl.getIndicator());
            if (strEZpvd == null) {
            }
        }
        c55052xcfCopydefault.setTitle(strEZpvd);
        c55052xcfCopydefault.setOnClickListener(new TaskDescription(c55052xcfCopydefault, 1000L, c55052xcfCopydefault, this));
    }

    public static final Unit EZpvd(vPC vpc, C47988uAv c47988uAv) {
        android.text.Editable text;
        android.text.Editable text2;
        android.text.Editable text3;
        vpc.OLrzqt().AEQbTJ(StringsKt__StringsKt.KWHzl(c47988uAv.AkhnZx(), (java.lang.CharSequence) "-"));
        vpc.fIwbmz();
        pUU.EZpvd("GRID_TPSL", "getSlType: " + vpc.OLrzqt().fJNWhG() + ", edittext: " + ((java.lang.Object) c47988uAv.djBIcL().getText()));
        if (c47988uAv.djBIcL().getText() != null) {
            if (Intrinsics.EZpvd((java.lang.Object) vpc.OLrzqt().fJNWhG(), (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
                android.text.Editable text4 = c47988uAv.djBIcL().getText();
                if (text4 != null && StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) text4, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) && (text3 = c47988uAv.djBIcL().getText()) != null) {
                    text3.delete(0, 1);
                }
            } else {
                android.text.Editable text5 = c47988uAv.djBIcL().getText();
                if (text5 != null && !StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) text5, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) && (text = c47988uAv.djBIcL().getText()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) text) && (text2 = c47988uAv.djBIcL().getText()) != null) {
                    text2.insert(0, "-");
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vPC vpc, C47988uAv c47988uAv, C47988uAv c47988uAv2, boolean z) {
        android.text.Editable text;
        android.text.Editable text2;
        android.text.Editable text3;
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        if ((Intrinsics.EZpvd((java.lang.Object) vpc.OLrzqt().fJNWhG(), (java.lang.Object) SpotTpSlTypeConfigData.PNL.getType()) || Intrinsics.EZpvd((java.lang.Object) vpc.OLrzqt().fJNWhG(), (java.lang.Object) SpotTpSlTypeConfigData.RATIO.getType())) && (text = c47988uAv2.djBIcL().getText()) != null && !StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) text, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) && (text2 = c47988uAv2.djBIcL().getText()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) text2) && (text3 = c47988uAv2.djBIcL().getText()) != null) {
            text3.insert(0, "-");
        }
        vpc.OLrzqt().EZpvd(z, c47988uAv.AkhnZx());
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function0<Unit> {
        public final /* synthetic */ C55052xcf KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(C55052xcf c55052xcf) {
            this.KWHzl = c55052xcf;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            this.KWHzl.setSelected(false);
        }
    }

    public static final class Application implements Function1<C55276xgr, Unit> {
        public final /* synthetic */ C55052xcf EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(C55052xcf c55052xcf) {
            this.EZpvd = c55052xcf;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C55276xgr c55276xgr) {
            EZpvd(c55276xgr);
            return Unit.INSTANCE;
        }

        public final void EZpvd(C55276xgr c55276xgr) {
            TpSLTriggerItem sl;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(c55276xgr, "");
            BotGridTpSlPresenter botGridTpSlPresenterOLrzqt = vPC.this.OLrzqt();
            java.lang.Object objOLrzqt = c55276xgr.OLrzqt();
            Intrinsics.copydefault(objOLrzqt, "");
            botGridTpSlPresenterOLrzqt.EZpvd((java.lang.String) objOLrzqt);
            C55052xcf c55052xcf = this.EZpvd;
            C55850xri c55850xriUzCIH = vPC.this.OLrzqt().uzCIH();
            if (c55850xriUzCIH != null) {
                TpSlTriggerParam tpSlTriggerParamZLjUOn = vPC.this.OLrzqt().zLjUOn();
                java.lang.String strEZpvd = c55850xriUzCIH.EZpvd((tpSlTriggerParamZLjUOn == null || (sl = tpSlTriggerParamZLjUOn.getSl()) == null) ? null : sl.getIndicator());
                if (strEZpvd != null) {
                    str = strEZpvd;
                }
            }
            c55052xcf.setTitle(str);
            vPC.this.OLrzqt().EZpvd();
            vPC.this.AwvSrB();
            vPC.this.zLjUOn();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AuCTel() {
        if (OLrzqt().copydefault().getFirst().booleanValue()) {
            values().DbNXlk.AEQbTJ().copydefault();
            zLjUOn();
        } else {
            java.lang.Object second = OLrzqt().copydefault().getSecond();
            if (second instanceof java.lang.String) {
                C47988uAv c47988uAvAEQbTJ = values().DbNXlk.AEQbTJ();
                java.lang.Object second2 = OLrzqt().copydefault().getSecond();
                Intrinsics.copydefault(second2, "");
                c47988uAvAEQbTJ.setInputErrorMsg((java.lang.String) second2);
            } else if (second instanceof java.lang.Object[]) {
                C47988uAv c47988uAvAEQbTJ2 = values().DbNXlk.AEQbTJ();
                java.lang.Object second3 = OLrzqt().copydefault().getSecond();
                Intrinsics.copydefault(second3, "");
                c47988uAvAEQbTJ2.setInputErrorMsg((java.lang.String[]) second3);
            } else {
                values().DbNXlk.AEQbTJ().copydefault();
            }
        }
        return OLrzqt().copydefault().getFirst().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean fIwbmz() {
        if (OLrzqt().OLrzqt().getFirst().booleanValue()) {
            values().fetchVPNInfo.AEQbTJ().copydefault();
            zLjUOn();
        } else {
            java.lang.Object second = OLrzqt().OLrzqt().getSecond();
            if (second instanceof java.lang.String) {
                C47988uAv c47988uAvAEQbTJ = values().fetchVPNInfo.AEQbTJ();
                java.lang.Object second2 = OLrzqt().OLrzqt().getSecond();
                Intrinsics.copydefault(second2, "");
                c47988uAvAEQbTJ.setInputErrorMsg((java.lang.String) second2);
            } else if (second instanceof java.lang.Object[]) {
                C47988uAv c47988uAvAEQbTJ2 = values().fetchVPNInfo.AEQbTJ();
                java.lang.Object second3 = OLrzqt().OLrzqt().getSecond();
                Intrinsics.copydefault(second3, "");
                c47988uAvAEQbTJ2.setInputErrorMsg((java.lang.String[]) second3);
            } else {
                values().fetchVPNInfo.AEQbTJ().copydefault();
            }
        }
        return OLrzqt().OLrzqt().getFirst().booleanValue();
    }

    public final boolean copydefault() {
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairKWHzl = OLrzqt().KWHzl();
        if (pairKWHzl.getFirst().booleanValue()) {
            values().copydefault.copydefault();
            zLjUOn();
        } else {
            values().copydefault.setInputErrorMsg(pairKWHzl.getSecond());
        }
        return pairKWHzl.getFirst().booleanValue();
    }

    public final void KWHzl(C47988uAv c47988uAv, C55851xrj c55851xrj) {
        C47988uAv.setInputLabel$default(c47988uAv, c55851xrj.EZpvd(), null, 2, null);
        c47988uAv.setMaxDecimal(c55851xrj.OLrzqt());
        c47988uAv.setInputUnit(c55851xrj.AEQbTJ());
        c47988uAv.setInputHint(c55851xrj.KWHzl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zuBGHE() {
        KWHzl(values().DbNXlk.AEQbTJ(), OLrzqt().wlaJM());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AwvSrB() {
        KWHzl(values().fetchVPNInfo.AEQbTJ(), OLrzqt().fIwbmz());
        C47988uAv c47988uAvAEQbTJ = values().fetchVPNInfo.AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().fJNWhG(), (java.lang.Object) SpotTpSlTypeConfigData.PRICE.getType())) {
            c47988uAvAEQbTJ.setPositiveMode();
        } else {
            c47988uAvAEQbTJ.setNegativeMode();
        }
        C47988uAv.setInputContent$default(c47988uAvAEQbTJ, null, false, false, 6, null);
    }

    private final void hDKMBd() {
        values().DbNXlk.copydefault(new Function1() { // from class: o.vPB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vPC.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        values().fetchVPNInfo.copydefault(new Function1() { // from class: o.vPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vPC.EZpvd(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(vPC vpc, boolean z) {
        vpc.OLrzqt().OLrzqt(z);
        vpc.zLjUOn();
        if (!z) {
            C47988uAv.setInputContent$default(vpc.values().DbNXlk.AEQbTJ(), "", false, false, 6, null);
            vpc.OLrzqt().AEQbTJ();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vPC vpc, boolean z) {
        vpc.OLrzqt().AEQbTJ(z);
        vpc.zLjUOn();
        if (!z) {
            C47988uAv.setInputContent$default(vpc.values().fetchVPNInfo.AEQbTJ(), "", false, false, 6, null);
            vpc.OLrzqt().EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        AppCompatTextView appCompatTextView = values().AkhnZx;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().getFieldNames().getFirst()) ? 0 : 8);
        values().AkhnZx.setText(OLrzqt().getFieldNames().getFirst());
        values().AkhnZx.setTextColor(OLrzqt().getFieldNames().getSecond().intValue());
        fARcdN();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fARcdN() {
        android.text.SpannableStringBuilder spannableStringBuilder;
        android.text.SpannableStringBuilder spannableStringBuilder2;
        android.text.SpannableStringBuilder spannableStringBuilderCopydefault;
        TpSLTriggerItem sl;
        TpSLTriggerItem tp;
        java.lang.String strFetchVPNInfo;
        java.lang.String strIsConnected;
        java.lang.String delaySeconds;
        java.lang.String strDbNXlk;
        java.lang.String strValueOf;
        java.lang.String strValues;
        C55850xri c55850xriUzCIH = OLrzqt().uzCIH();
        int i = 0;
        java.lang.String str = "--";
        if (c55850xriUzCIH != null && (strValues = c55850xriUzCIH.values(OLrzqt().zLjUOn())) != null) {
            if (!(!Intrinsics.EZpvd((java.lang.Object) strValues, (java.lang.Object) "--"))) {
                strValues = null;
            }
            if (strValues != null) {
                spannableStringBuilder = new android.text.SpannableStringBuilder(strValues);
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = getContext();
                if (context == null) {
                    context = C43246rlf.OLrzqt.valueOf();
                }
                spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null)), 0, strValues.length(), 17);
            }
        } else {
            spannableStringBuilder = new android.text.SpannableStringBuilder("--");
        }
        C55850xri c55850xriUzCIH2 = OLrzqt().uzCIH();
        if (c55850xriUzCIH2 != null && (strValueOf = c55850xriUzCIH2.valueOf(OLrzqt().zLjUOn())) != null) {
            if (!(!Intrinsics.EZpvd((java.lang.Object) strValueOf, (java.lang.Object) "--"))) {
                strValueOf = null;
            }
            if (strValueOf != null) {
                spannableStringBuilder2 = new android.text.SpannableStringBuilder(strValueOf);
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = getContext();
                if (context2 == null) {
                    context2 = C43246rlf.OLrzqt.valueOf();
                }
                spannableStringBuilder2.setSpan(new android.text.style.ForegroundColorSpan(C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null)), 0, strValueOf.length(), 17);
            }
        } else {
            spannableStringBuilder2 = new android.text.SpannableStringBuilder("--");
        }
        AppCompatTextView appCompatTextView = values().isConnected;
        android.content.Context context3 = getContext();
        if (context3 != null) {
            int i2 = C48033uCm.Fragment.gdwsGQ;
            kotlin.Pair[] pairArr = new kotlin.Pair[6];
            C55850xri c55850xriUzCIH3 = OLrzqt().uzCIH();
            if (c55850xriUzCIH3 == null || (strFetchVPNInfo = c55850xriUzCIH3.fetchVPNInfo(OLrzqt().zLjUOn())) == null) {
                strFetchVPNInfo = "--";
            }
            pairArr[0] = C56390yDp.OLrzqt("tpMode", new android.text.SpannableStringBuilder(strFetchVPNInfo));
            pairArr[1] = C56390yDp.OLrzqt("tpTrigger", spannableStringBuilder);
            C55850xri c55850xriUzCIH4 = OLrzqt().uzCIH();
            if (c55850xriUzCIH4 == null || (strIsConnected = c55850xriUzCIH4.isConnected(OLrzqt().zLjUOn())) == null) {
                strIsConnected = "--";
            }
            pairArr[2] = C56390yDp.OLrzqt("slMode", new android.text.SpannableStringBuilder(strIsConnected));
            pairArr[3] = C56390yDp.OLrzqt("slTrigger", spannableStringBuilder2);
            TpSlTriggerParam tpSlTriggerParamZLjUOn = OLrzqt().zLjUOn();
            if (tpSlTriggerParamZLjUOn == null || (delaySeconds = tpSlTriggerParamZLjUOn.getDelaySeconds()) == null) {
                delaySeconds = "--";
            }
            pairArr[4] = C56390yDp.OLrzqt("delayTime", new android.text.SpannableStringBuilder(delaySeconds));
            C55850xri c55850xriUzCIH5 = OLrzqt().uzCIH();
            if (c55850xriUzCIH5 != null && (strDbNXlk = c55850xriUzCIH5.DbNXlk(OLrzqt().zLjUOn())) != null) {
                str = strDbNXlk;
            }
            pairArr[5] = C56390yDp.OLrzqt("ccy", new android.text.SpannableStringBuilder(str));
            spannableStringBuilderCopydefault = C33069mpW.copydefault(context3, i2, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(pairArr));
        } else {
            spannableStringBuilderCopydefault = null;
        }
        appCompatTextView.setText(spannableStringBuilderCopydefault);
        AppCompatTextView appCompatTextView2 = values().isConnected;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        TpSlTriggerParam tpSlTriggerParamZLjUOn2 = OLrzqt().zLjUOn();
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((tpSlTriggerParamZLjUOn2 == null || (tp = tpSlTriggerParamZLjUOn2.getTp()) == null) ? null : tp.getValue()))) {
            TpSlTriggerParam tpSlTriggerParamZLjUOn3 = OLrzqt().zLjUOn();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((tpSlTriggerParamZLjUOn3 == null || (sl = tpSlTriggerParamZLjUOn3.getSl()) == null) ? null : sl.getValue()))) {
                TpSlTriggerParam tpSlTriggerParamZLjUOn4 = OLrzqt().zLjUOn();
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) (tpSlTriggerParamZLjUOn4 != null ? tpSlTriggerParamZLjUOn4.getDelaySeconds() : null))) {
                    i = 8;
                }
            }
        }
        appCompatTextView2.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFieldNames() {
        if (OLrzqt().AhwBna()) {
            return;
        }
        ejfBZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("bot_grid_req", OLrzqt().fARcdN());
        getParentFragmentManager().setFragmentResult("tp_sl_settings", bundle);
        ejfBZ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
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
        imageViewKWHzl.setOnClickListener(new Fragment(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOnClickListener(new LoaderManager(wyf, 1000L, yDY.gEmmrt(SpotTpSlTypeConfigData.PRICE.getType(), SpotTpSlTypeConfigData.RATIO.getType(), SpotTpSlTypeConfigData.PNL.getType()), this));
    }
}
