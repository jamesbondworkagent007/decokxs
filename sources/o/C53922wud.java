package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.contractgrid.presenter.ContractGridSyncParamsPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridSyncParamResp;
import com.okinc.unify_trade.biz.StgySourceInfo;
import com.okinc.unify_trade.biz.SyncParamsMinTopupInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.wUE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wud, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53922wud extends AbstractC49945uyC<uPC, ContractGridSyncParamsPresenter> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final int AEQbTJ = C48033uCm.Activity.heceqZ;
    public final InterfaceC56387yDm KWHzl;
    public Function2<? super java.lang.String, ? super java.lang.Integer, Unit> OLrzqt;
    public wYF gEmmrt;

    /* JADX INFO: renamed from: o.wud$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public static final void KWHzl(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C53922wud() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridSyncParamsDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridSyncParamsDialog$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridSyncParamsDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridSyncParamsDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.ContractGridSyncParamsDialog$special$$inlined$viewModels$default$5
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
    }

    private final C55915xsu isConnected() {
        return (C55915xsu) this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.wud$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wud.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wud$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void newInstance$default(Application application, androidx.fragment.app.FragmentManager fragmentManager, TacticsData tacticsData, StgySourceInfo stgySourceInfo, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                function2 = null;
            }
            application.OLrzqt(fragmentManager, tacticsData, stgySourceInfo, function2);
        }

        public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull TacticsData tacticsData, StgySourceInfo stgySourceInfo, Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("tacticsdata_param", tacticsData);
            bundle.putParcelable("tgysourceinfo_param", stgySourceInfo);
            C53922wud c53922wud = new C53922wud();
            c53922wud.OLrzqt = function2;
            c53922wud.setArguments(bundle);
            c53922wud.show(fragmentManager, C53223whT.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ContractGridSyncParamsPresenter contractGridSyncParamsPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        TacticsData tacticsData = arguments != null ? (TacticsData) arguments.getParcelable("tacticsdata_param") : null;
        android.os.Bundle arguments2 = getArguments();
        contractGridSyncParamsPresenterOLrzqt.OLrzqt(tacticsData, arguments2 != null ? (StgySourceInfo) arguments2.getParcelable("tgysourceinfo_param") : null);
        initReminder$default(this, null, null, 3, null);
        fIwbmz();
        ejfBZ();
        OLrzqt().valueOf();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        isConnected().AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().AEQbTJ(), (java.lang.Object) "grid")) {
            isConnected().EZpvd("grid", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : OLrzqt().KWHzl(), (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
        } else if (Intrinsics.EZpvd((java.lang.Object) OLrzqt().AEQbTJ(), (java.lang.Object) "contract_grid")) {
            isConnected().EZpvd("contract_grid", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : OLrzqt().KWHzl(), (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
        }
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatMediaBrowserImplBase2));
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    public final void OLrzqt(java.lang.String str) {
        wYF wyf = this.gEmmrt;
        if (wyf == null) {
            Intrinsics.gEmmrt("");
            wyf = null;
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(!OLrzqt().EZpvd(str, fJNWhG()));
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.gEmmrt = wyf;
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.OJuSTm));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new StateListAnimator(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new Activity(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        isConnected().AYXKKw();
    }

    public static /* synthetic */ void initReminder$default(C53922wud c53922wud, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        c53922wud.OLrzqt(str, str2);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        OKReminder oKReminder = values().AYXKKw;
        oKReminder.setStyle(2);
        oKReminder.setMessage(C33069mpW.copydefault(C48033uCm.Fragment.GiPPlLRPuVlr, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str), C56390yDp.OLrzqt("ccy", str2))));
        oKReminder.setCloseIconVisibility(false);
    }

    /* JADX INFO: renamed from: o.wud$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53922wud KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53922wud c53922wud) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = c53922wud;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wud$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C53922wud copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53922wud c53922wud) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c53922wud;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ContractGridSyncParamsPresenter contractGridSyncParamsPresenterOLrzqt = this.copydefault.OLrzqt();
                SyncParamsMinTopupInfo value = this.copydefault.OLrzqt().djBIcL().getValue();
                java.lang.String topupAmount = value != null ? value.getTopupAmount() : null;
                if (topupAmount == null) {
                    topupAmount = "";
                }
                SyncParamsMinTopupInfo value2 = this.copydefault.OLrzqt().djBIcL().getValue();
                java.lang.String leadAlgoId = value2 != null ? value2.getLeadAlgoId() : null;
                contractGridSyncParamsPresenterOLrzqt.AEQbTJ(topupAmount, leadAlgoId != null ? leadAlgoId : "");
            }
        }
    }

    /* JADX INFO: renamed from: o.wud$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C53922wud copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53922wud c53922wud) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c53922wud;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.copydefault();
            }
        }
    }

    private final void fIwbmz() {
        StgySourceInfo stgySourceInfoAYXKKw = OLrzqt().AYXKKw();
        if (stgySourceInfoAYXKKw != null) {
            wUE wue = wUE.OLrzqt;
            android.widget.ImageView imageView = values().KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            wue.KWHzl(imageView, wUE.Application.m8784constructorimpl$default(stgySourceInfoAYXKKw.getAvatar(), null, 2, null));
            values().djBIcL.setText(stgySourceInfoAYXKKw.getUsername());
        }
        vKO vko = values().OLrzqt;
        C55258xgZ c55258xgZOLrzqt = vko.OLrzqt();
        c55258xgZOLrzqt.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        c55258xgZOLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        android.widget.TextView textViewEZpvd = vko.EZpvd();
        textViewEZpvd.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        textViewEZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        vko.setTitle(C33070mpX.AYXKKw(C55688xof.Application.sElUiK));
        vko.EZpvd(false, new View.OnClickListener() { // from class: o.wug
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53922wud.KWHzl(view);
            }
        });
        vko.setValue("--");
        C53539wnR c53539wnR = values().AEQbTJ;
        C55258xgZ c55258xgZOLrzqt2 = c53539wnR.OLrzqt();
        c55258xgZOLrzqt2.setTextAppearance(C52761wXj.LoaderManager.zuBGHE);
        c55258xgZOLrzqt2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        android.widget.TextView textViewCopydefault = c53539wnR.copydefault();
        textViewCopydefault.setTextAppearance(C52761wXj.LoaderManager.gHZMYf);
        textViewCopydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        c53539wnR.setTransferCoin(OLrzqt().OLrzqt());
        c53539wnR.setFooterAvaValue("--");
    }

    private final void ejfBZ() {
        TradeLiveData<SyncParamsMinTopupInfo> tradeLiveDataDjBIcL = OLrzqt().djBIcL();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wuf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53922wud.copydefault(this.EZpvd, (SyncParamsMinTopupInfo) obj);
            }
        }));
        TradeLiveData<ContractGridSyncParamResp> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner2, new ActionBar(new Function1() { // from class: o.wuh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53922wud.AEQbTJ(this.copydefault, (ContractGridSyncParamResp) obj);
            }
        }));
        fARcdN().observe(this, new ActionBar(new Function1() { // from class: o.wuj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53922wud.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.wui
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53922wud.KWHzl(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(C53922wud c53922wud, SyncParamsMinTopupInfo syncParamsMinTopupInfo) {
        java.lang.String topupAmount;
        java.lang.String topupAmount2;
        if (syncParamsMinTopupInfo == null || (topupAmount = syncParamsMinTopupInfo.getTopupAmount()) == null) {
            topupAmount = "";
        }
        c53922wud.OLrzqt(topupAmount);
        if (syncParamsMinTopupInfo == null || (topupAmount2 = syncParamsMinTopupInfo.getTopupAmount()) == null) {
            topupAmount2 = "";
        }
        c53922wud.copydefault(getFormatedAmount$default(c53922wud, topupAmount2, null, 2, null) + " " + c53922wud.OLrzqt().OLrzqt());
        java.lang.String topupAmount3 = syncParamsMinTopupInfo != null ? syncParamsMinTopupInfo.getTopupAmount() : null;
        c53922wud.OLrzqt(getFormatedAmount$default(c53922wud, topupAmount3 != null ? topupAmount3 : "", null, 2, null), c53922wud.OLrzqt().OLrzqt());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C53922wud c53922wud, ContractGridSyncParamResp contractGridSyncParamResp) {
        Intrinsics.checkNotNullParameter(contractGridSyncParamResp, "");
        java.lang.String sCode = contractGridSyncParamResp.getSCode();
        int iHashCode = sCode.hashCode();
        if (iHashCode != 0) {
            if (iHashCode != 48) {
                switch (iHashCode) {
                    case 50574226:
                        if (sCode.equals("55123")) {
                            c53922wud.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.putLong), 1);
                            break;
                        }
                        break;
                    case 50574227:
                        if (sCode.equals("55124")) {
                            c53922wud.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.dzCpvv), 1);
                            break;
                        }
                        break;
                }
            } else if (sCode.equals("0")) {
                c53922wud.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.onCaptioningEnabledChanged), 3);
            }
            c53922wud.AEQbTJ(contractGridSyncParamResp.getSMsg(), 1);
        } else if (!sCode.equals("")) {
            c53922wud.AEQbTJ(contractGridSyncParamResp.getSMsg(), 1);
        }
        c53922wud.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C53922wud c53922wud, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53922wud.values().AEQbTJ.setFooterAvaValue(c53922wud.OLrzqt().EZpvd(str));
        SyncParamsMinTopupInfo value = c53922wud.OLrzqt().djBIcL().getValue();
        java.lang.String topupAmount = value != null ? value.getTopupAmount() : null;
        c53922wud.OLrzqt(topupAmount != null ? topupAmount : "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C53922wud c53922wud, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c53922wud.OLrzqt().AhwBna().bB_())) {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c53922wud.OLrzqt().EZpvd().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showSnackbar$default(C53922wud c53922wud, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        c53922wud.AEQbTJ(str, i);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Function2<? super java.lang.String, ? super java.lang.Integer, Unit> function2 = this.OLrzqt;
        if (function2 != null) {
            function2.invoke(str, java.lang.Integer.valueOf(i));
        }
    }

    public static /* synthetic */ java.lang.String getFormatedAmount$default(C53922wud c53922wud, java.lang.String str, DisplaySign displaySign, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            displaySign = DisplaySign.AUTO;
        }
        return c53922wud.copydefault(str, displaySign);
    }

    private final java.lang.String copydefault(java.lang.String str, DisplaySign displaySign) {
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "--" : xMR.formatUpToMax$default(xMR.copydefault, str, 0, 2, null);
    }

    public final void copydefault(java.lang.String str) {
        values().OLrzqt.setValue(str);
    }

    private final C56111xwe<java.lang.String> fARcdN() {
        BizInstrument bizInstrumentKWHzl = OLrzqt().KWHzl();
        return (bizInstrumentKWHzl == null || !Intrinsics.EZpvd(bizInstrumentKWHzl.isNegativeContract(), java.lang.Boolean.TRUE)) ? isConnected().AhwBna() : isConnected().EZpvd();
    }

    private final java.lang.String fJNWhG() {
        java.lang.String value = fARcdN().getValue();
        return value == null ? "" : value;
    }
}
