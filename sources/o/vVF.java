package o;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradingbot.impl.order.strategy.recurring.presenter.RecurringBuyModifyInvestmentViewModel;
import com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentBottomSheet$observeConfirmEnabled$1;
import com.okinc.tradingbot.impl.strategy.view.AllocationItem;
import com.okinc.tradingbot.impl.strategy.view.CoinsPriceBottomSheet;
import com.okinc.unify_trade.biz.RecurringListItem;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import o.vVF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vVF extends vUR {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public final boolean AYXKKw;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public wYF djBIcL;
    public final InterfaceC56387yDm valueOf;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecurringBuyModifyInvestmentViewModel.Mode.values().length];
            try {
                iArr[RecurringBuyModifyInvestmentViewModel.Mode.MODIFY_AMOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringBuyModifyInvestmentViewModel.Mode.INVEST_MORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AYXKKw;
    }

    public vVF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentBottomSheet$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RecurringBuyModifyInvestmentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentBottomSheet$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vVF.AhwBna();
            }
        });
        this.AYXKKw = true;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vVF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vVF$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ vVF newInstance$default(Activity activity, TacticsData tacticsData, RecurringBuyModifyInvestmentViewModel.Mode mode, Function2 function2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                mode = RecurringBuyModifyInvestmentViewModel.Mode.MODIFY_AMOUNT;
            }
            if ((i & 4) != 0) {
                function2 = null;
            }
            return activity.OLrzqt(tacticsData, mode, function2);
        }

        public final vVF OLrzqt(@NotNull TacticsData tacticsData, @NotNull RecurringBuyModifyInvestmentViewModel.Mode mode, Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(mode, "");
            vVF vvf = new vVF();
            vvf.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_tactics_data", tacticsData), C56390yDp.OLrzqt("arg_mode", mode)));
            vvf.AhwBna = function2;
            return vvf;
        }
    }

    public final RecurringBuyModifyInvestmentViewModel AYXKKw() {
        return (RecurringBuyModifyInvestmentViewModel) this.AkhnZx.getValue();
    }

    public final MutableFloatState valueOf() {
        return (MutableFloatState) this.valueOf.getValue();
    }

    public static final MutableFloatState AhwBna() {
        return PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        int i = ActionBar.KWHzl[AYXKKw().fIwbmz().ordinal()];
        if (i == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.DKr);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatSubscriptionCallback);
        }
        textViewAYXKKw.setText(strAYXKKw);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        this.djBIcL = wyf;
    }

    public static final class Dialog implements Function0<Unit> {
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(java.lang.String str, java.lang.String str2) {
            this.copydefault = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            Function2 function2 = vVF.this.AhwBna;
            if (function2 != null) {
                function2.invoke(this.copydefault, this.KWHzl);
            }
            vVF.this.dismissAllowingStateLoss();
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vVF EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vVF vvf) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = vvf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                java.lang.String strDjBIcL = this.EZpvd.AYXKKw().djBIcL();
                if (strDjBIcL.length() == 0) {
                    return;
                }
                java.lang.String strFetchVPNInfo = this.EZpvd.AYXKKw().fetchVPNInfo();
                if (this.EZpvd.AYXKKw().fIwbmz() != RecurringBuyModifyInvestmentViewModel.Mode.INVEST_MORE || !this.EZpvd.AYXKKw().getNewProxyInstance()) {
                    Function2 function2 = this.EZpvd.AhwBna;
                    if (function2 != null) {
                        function2.invoke(strDjBIcL, strFetchVPNInfo);
                    }
                    this.EZpvd.dismissAllowingStateLoss();
                    return;
                }
                vVF vvf = this.EZpvd;
                vvf.KWHzl(vvf.new Dialog(strDjBIcL, strFetchVPNInfo));
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vVF OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vVF vvf) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = vvf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    public final void KWHzl(final Function0<Unit> function0) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.registerUser));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.siEkQe));
        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.OnBackPressedDispatcherKt, new View.OnClickListener() { // from class: o.vVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vVF.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt), new View.OnClickListener() { // from class: o.vVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vVF.AEQbTJ(viewOnClickListenerC54939xaY, function0, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, Function0 function0, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        function0.invoke();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-524437459, true, new TaskDescription()));
        constraintLayout.addView(composeView);
    }

    public static final class TaskDescription implements Function2<Composer, java.lang.Integer, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Composer composer, java.lang.Integer num) {
            EZpvd(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-524437459, i, -1, "com.okinc.tradingbot.impl.order.strategy.recurring.view.RecurringBuyModifyInvestmentBottomSheet.onCreateContent.<anonymous>.<anonymous> (RecurringBuyModifyInvestmentBottomSheet.kt:199)");
                }
                androidx.compose.runtime.State stateCollectAsState = SnapshotStateKt.collectAsState(vVF.this.AYXKKw().AkhnZx(), null, composer, 0, 1);
                RecurringBuyModifyInvestmentViewModel recurringBuyModifyInvestmentViewModelAYXKKw = vVF.this.AYXKKw();
                RecurringBuyModifyInvestmentViewModel.Mode modeFIwbmz = vVF.this.AYXKKw().fIwbmz();
                java.lang.String strCopydefault = copydefault((androidx.compose.runtime.State<java.lang.String>) stateCollectAsState);
                composer.startReplaceableGroup(2104236284);
                boolean zChangedInstance = composer.changedInstance(vVF.this);
                final vVF vvf = vVF.this;
                java.lang.Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: o.vVN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return vVF.TaskDescription.OLrzqt(vvf, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(2104246505);
                boolean zChangedInstance2 = composer.changedInstance(vVF.this);
                final vVF vvf2 = vVF.this;
                java.lang.Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: o.vVK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return vVF.TaskDescription.EZpvd(vvf2, ((java.lang.Float) obj).floatValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(2104256963);
                boolean zChangedInstance3 = composer.changedInstance(vVF.this);
                final vVF vvf3 = vVF.this;
                java.lang.Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: o.vVQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return vVF.TaskDescription.gEmmrt(vvf3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(2104261151);
                boolean zChangedInstance4 = composer.changedInstance(vVF.this);
                final vVF vvf4 = vVF.this;
                java.lang.Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: o.vVS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return vVF.TaskDescription.valueOf(vvf4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                Function0 function02 = (Function0) objRememberedValue4;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(2104265116);
                boolean zChangedInstance5 = composer.changedInstance(vVF.this);
                final vVF vvf5 = vVF.this;
                java.lang.Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: o.vVR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return vVF.TaskDescription.copydefault(vvf5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function03 = (Function0) objRememberedValue5;
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(2104268987);
                boolean zChangedInstance6 = composer.changedInstance(vVF.this);
                final vVF vvf6 = vVF.this;
                java.lang.Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: o.vVP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return vVF.TaskDescription.djBIcL(vvf6);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceableGroup();
                vVO.EZpvd(recurringBuyModifyInvestmentViewModelAYXKKw, modeFIwbmz, strCopydefault, function1, function12, function0, function02, function03, (Function0) objRememberedValue6, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        public static final Unit OLrzqt(vVF vvf, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            vvf.AYXKKw().OLrzqt(str);
            if (vvf.AYXKKw().fIwbmz() == RecurringBuyModifyInvestmentViewModel.Mode.INVEST_MORE) {
                vvf.valueOf().setFloatValue(0.0f);
            }
            return Unit.INSTANCE;
        }

        public static final Unit EZpvd(vVF vvf, float f) {
            vvf.valueOf().setFloatValue(f);
            java.lang.String strOLrzqt = vvf.AYXKKw().OLrzqt(f);
            if (strOLrzqt != null) {
                vvf.AYXKKw().OLrzqt(strOLrzqt);
            }
            return Unit.INSTANCE;
        }

        public static final Unit gEmmrt(vVF vvf) {
            vvf.fetchVPNInfo();
            return Unit.INSTANCE;
        }

        public static final Unit valueOf(vVF vvf) {
            vvf.AkhnZx();
            return Unit.INSTANCE;
        }

        public static final Unit copydefault(vVF vvf) {
            vvf.DbNXlk();
            return Unit.INSTANCE;
        }

        public static final Unit djBIcL(vVF vvf) {
            vvf.djBIcL();
            return Unit.INSTANCE;
        }

        public static final java.lang.String copydefault(androidx.compose.runtime.State<java.lang.String> state) {
            return state.getValue();
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw().AubY();
        gEmmrt();
    }

    public final void gEmmrt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new RecurringBuyModifyInvestmentBottomSheet$observeConfirmEnabled$1(this, null), 3, null);
    }

    public final void fetchVPNInfo() {
        java.util.List<RecurringListItem> listFJNWhG = AYXKKw().fJNWhG();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listFJNWhG, 10));
        for (RecurringListItem recurringListItem : listFJNWhG) {
            arrayList.add(new AllocationItem(recurringListItem.getCcy(), recurringListItem.getRatio()));
        }
        C52566wQd.Companion.KWHzl(arrayList).show(getChildFragmentManager(), "CoinTargetAllocationRingChartBottomSheet");
    }

    public final void AkhnZx() {
        CoinsPriceBottomSheet.Companion.copydefault(AYXKKw().AhwBna(), CoinsPriceBottomSheet.Mode.AVERAGE_PRICE).show(getChildFragmentManager(), "CoinsPriceBottomSheet");
    }

    public final void DbNXlk() {
        CoinsPriceBottomSheet.Companion.copydefault(AYXKKw().values(), CoinsPriceBottomSheet.Mode.LAST_PRICE).show(getChildFragmentManager(), "CoinsPriceBottomSheet");
    }

    public final void djBIcL() {
        TradeCoinInfo tradeCoinInfoAhwBna;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        java.lang.String strIsConnected = AYXKKw().isConnected();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(activity, new CurrencyModel(C33129mqd.AhwBna((interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(strIsConnected)) == null) ? null : tradeCoinInfoAhwBna.getId()), strIsConnected), false);
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AhwBna = null;
        this.djBIcL = null;
        super.onDestroyView();
    }
}
