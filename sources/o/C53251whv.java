package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaStartConditionPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaTriggerRsiPresenter;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C53212whI;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.whv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53251whv extends AbstractC49945uyC<uNG, SpotDcaStartConditionPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final ActivityResultLauncher<android.content.Intent> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;

    /* JADX INFO: renamed from: o.whv$ActionBar */
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
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.hUfVAv;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C53251whv() {
        final Function0 function0 = new Function0() { // from class: o.whD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53251whv.AhwBna(this.OLrzqt);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaStartConditionDialog$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SpotDcaManualPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaStartConditionDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaStartConditionDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaStartConditionDialog$special$$inlined$viewModels$default$4
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SpotDcaTriggerRsiPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaStartConditionDialog$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaStartConditionDialog$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.BotSpotDcaStartConditionDialog$special$$inlined$activityViewModels$default$3
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
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.whC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53251whv.gEmmrt(this.EZpvd);
            }
        });
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.whB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C53251whv.OLrzqt(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }

    public final SpotDcaManualPresenter copydefault() {
        return (SpotDcaManualPresenter) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(C53251whv c53251whv) {
        androidx.fragment.app.Fragment parentFragment = c53251whv.getParentFragment();
        return parentFragment != null ? parentFragment : c53251whv;
    }

    public final SpotDcaTriggerRsiPresenter isConnected() {
        return (SpotDcaTriggerRsiPresenter) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AuCTel() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String gEmmrt(C53251whv c53251whv) {
        android.os.Bundle arguments = c53251whv.getArguments();
        if (arguments != null) {
            return arguments.getString("bot_inst_id");
        }
        return null;
    }

    /* JADX INFO: renamed from: o.whv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.whv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53251whv AEQbTJ(SpotDcaAdvancedParams spotDcaAdvancedParams, java.lang.String str) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", spotDcaAdvancedParams);
            bundle.putString("bot_inst_id", str);
            C53251whv c53251whv = new C53251whv();
            c53251whv.setArguments(bundle);
            return c53251whv;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk));
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(true);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new StateListAnimator(c52794wYpCopydefault2, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fJNWhG();
        fARcdN();
        fIwbmz();
        getFieldNames();
    }

    private final void fJNWhG() {
        SpotDcaStartConditionPresenter spotDcaStartConditionPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        spotDcaStartConditionPresenterOLrzqt.KWHzl(arguments != null ? (SpotDcaAdvancedParams) BundleCompat.getParcelable(arguments, "data", SpotDcaAdvancedParams.class) : null);
    }

    private final void fARcdN() {
        values().EZpvd.setOnSelectedChanged(new yHO() { // from class: o.whE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C53251whv.copydefault(this.OLrzqt, ((java.lang.Integer) obj).intValue(), ((java.lang.Boolean) obj2).booleanValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        });
        C52701wVd c52701wVd = values().EZpvd;
        SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = OLrzqt().KWHzl();
        C52701wVd.setSelectedId$default(c52701wVd, (spotDcaAdvancedParamsKWHzl != null ? spotDcaAdvancedParamsKWHzl.AEQbTJ() : null) == GridStartTriggerType.INSTANT ? C48033uCm.Application.zNQIcI : C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl, false, 2, null);
    }

    public static final Unit copydefault(C53251whv c53251whv, int i, boolean z, boolean z2) {
        if (i == C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl) {
            android.view.View root = c53251whv.values().AEQbTJ.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(z ? 0 : 8);
        }
        SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = c53251whv.OLrzqt().KWHzl();
        if (spotDcaAdvancedParamsKWHzl != null) {
            spotDcaAdvancedParamsKWHzl.EZpvd(i == C48033uCm.Application.ComponentActivityReportFullyDrawnExecutorApi16Impl ? GridStartTriggerType.RSI_14 : GridStartTriggerType.INSTANT);
        }
        return Unit.INSTANCE;
    }

    private final void getFieldNames() {
        C56111xwe<DcaTriggerParam> c56111xweCopydefault = isConnected().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweCopydefault.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.whA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53251whv.copydefault(this.OLrzqt, (DcaTriggerParam) obj);
            }
        }));
    }

    public static final Unit copydefault(C53251whv c53251whv, DcaTriggerParam dcaTriggerParam) {
        Intrinsics.checkNotNullParameter(dcaTriggerParam, "");
        SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = c53251whv.OLrzqt().KWHzl();
        if (spotDcaAdvancedParamsKWHzl != null) {
            spotDcaAdvancedParamsKWHzl.EZpvd(yDY.copydefault(dcaTriggerParam));
        }
        c53251whv.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    private final void fIwbmz() {
        uWI uwi = values().AEQbTJ;
        uwi.getRoot().setOnClickListener(null);
        AppCompatTextView appCompatTextView = uwi.OLrzqt;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, this));
        getNewProxyInstance();
    }

    private final void getNewProxyInstance() {
        java.lang.String thold;
        java.lang.String timeframe;
        java.util.List<DcaTriggerParam> listAYXKKw;
        SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = OLrzqt().KWHzl();
        DcaTriggerParam dcaTriggerParam = (spotDcaAdvancedParamsKWHzl == null || (listAYXKKw = spotDcaAdvancedParamsKWHzl.AYXKKw()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw);
        uWI uwi = values().AEQbTJ;
        uwi.AYXKKw.setText(TriggerCond.Companion.KWHzl(dcaTriggerParam != null ? dcaTriggerParam.getTriggerCond() : null));
        uwi.EZpvd.setText(dcaTriggerParam != null ? dcaTriggerParam.getTimePeriod() : null);
        AppCompatTextView appCompatTextView = uwi.valueOf;
        xMR xmr = xMR.copydefault;
        java.lang.String str = "";
        if (dcaTriggerParam == null || (thold = dcaTriggerParam.getThold()) == null) {
            thold = "";
        }
        appCompatTextView.setText(xmr.copydefault(thold));
        AppCompatTextView appCompatTextView2 = uwi.AEQbTJ;
        TimeFrame.Application application = TimeFrame.Companion;
        if (dcaTriggerParam != null && (timeframe = dcaTriggerParam.getTimeframe()) != null) {
            str = timeframe;
        }
        appCompatTextView2.setText(application.copydefault(str));
    }

    public static final void OLrzqt(C53251whv c53251whv, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = c53251whv.OLrzqt().KWHzl();
            if (spotDcaAdvancedParamsKWHzl != null) {
                android.content.Intent data = activityResult.getData();
                spotDcaAdvancedParamsKWHzl.EZpvd(data != null ? data.getParcelableArrayListExtra("data") : null);
            }
            c53251whv.getNewProxyInstance();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.whv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C53251whv KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53251whv c53251whv) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c53251whv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.ejfBZ();
            }
        }
    }

    /* JADX INFO: renamed from: o.whv$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C53251whv OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53251whv c53251whv) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c53251whv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C53212whI.TaskDescription taskDescription = C53212whI.Companion;
                SpotDcaAdvancedParams spotDcaAdvancedParamsKWHzl = this.OLrzqt.OLrzqt().KWHzl();
                C53212whI c53212whIEZpvd = taskDescription.EZpvd(spotDcaAdvancedParamsKWHzl != null ? spotDcaAdvancedParamsKWHzl.AYXKKw() : null, this.OLrzqt.AuCTel());
                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c53212whIEZpvd.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.whv$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53251whv KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53251whv c53251whv) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c53251whv;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.copydefault().valueOf().setValue(this.KWHzl.OLrzqt().KWHzl());
                this.KWHzl.ejfBZ();
            }
        }
    }
}
