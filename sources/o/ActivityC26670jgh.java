package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.contants.TransactionType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionFragment;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.transaction.view_model.TransactionUIConfigViewModel;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C25493ixk;
import o.C27446jvO;
import o.InterfaceC24182iXy;
import o.InterfaceC26764jiV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jgh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26670jgh extends AbstractActivityC26674jgl implements InterfaceC26761jiS, InterfaceC26666jgd, InterfaceC26681jgs, InterfaceC26678jgp {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public boolean AhwBna;
    public iGY djBIcL;
    public final InterfaceC56387yDm isConnected;
    public iKW valueOf;
    public TransactionStage AYXKKw = TransactionStage.INPUT;
    public final MutableSharedFlow<InterfaceC26764jiV> gEmmrt = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @Override // o.InterfaceC26761jiS
    public void OLrzqt(ValidatorSelectionParams validatorSelectionParams) {
    }

    public ActivityC26670jgh() {
        final Function0 function0 = null;
        this.isConnected = new ViewModelLazy(C56524yIo.AEQbTJ(TransactionUIConfigViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.transaction.InvestTransactionActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.transaction.InvestTransactionActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.transaction.InvestTransactionActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.jgh$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jgh.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ android.content.Intent intent$default(Activity activity, android.content.Context context, TransactionConfig transactionConfig, int i, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return activity.EZpvd(context, transactionConfig, i);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull TransactionConfig transactionConfig, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(transactionConfig, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC26670jgh.class);
            intent.putExtra("key.trx_config", transactionConfig);
            intent.putExtra("key.activeItem", i);
            return intent;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionConfig AYXKKw() {
        TransactionConfig transactionConfig = (TransactionConfig) getIntent().getParcelableExtra("key.trx_config");
        if (transactionConfig != null) {
            return transactionConfig;
        }
        throw new java.lang.IllegalArgumentException("TransactionConfig can't be null");
    }

    /* JADX DEBUG: Possible override for method o.jgl.OLrzqt()V */
    public final int OLrzqt() {
        return getIntent().getIntExtra("key.activeItem", 0);
    }

    public final TransactionUIConfigViewModel AhwBna() {
        return (TransactionUIConfigViewModel) this.isConnected.getValue();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.jxz.collectOnLifecycle$default(androidx.lifecycle.LifecycleOwner, kotlinx.coroutines.flow.Flow, androidx.lifecycle.Lifecycle$State, kotlinx.coroutines.flow.FlowCollector, int, java.lang.Object):kotlinx.coroutines.Job */
    @Override // o.AbstractActivityC26674jgl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        iGY igyKWHzl = iGY.KWHzl(getLayoutInflater());
        this.djBIcL = igyKWHzl;
        if (igyKWHzl == null) {
            Intrinsics.gEmmrt("");
            igyKWHzl = null;
        }
        setContentView(igyKWHzl.getRoot());
        gEmmrt();
        C27589jxz.AEQbTJ(this, AhwBna().EZpvd(), Lifecycle.State.CREATED, new TaskDescription());
        C27589jxz.collectOnLifecycle$default(this, FlowKt.debounce(this.gEmmrt, 500L), null, FragmentManager.copydefault, 2, null);
        AhwBna().OLrzqt();
    }

    /* JADX INFO: renamed from: o.jgh$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC24182iXy interfaceC24182iXy, Continuation<? super Unit> continuation) {
            if (interfaceC24182iXy instanceof InterfaceC24182iXy.Activity) {
                InterfaceC24182iXy.Activity activity = (InterfaceC24182iXy.Activity) interfaceC24182iXy;
                if (activity.EZpvd() instanceof C26762jiT) {
                    ActivityC26670jgh.this.copydefault((C26762jiT) activity.EZpvd());
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jgh$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        public static final FragmentManager<T> copydefault = new FragmentManager<>();

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC26764jiV interfaceC26764jiV, Continuation<? super Unit> continuation) {
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        final iGY igy = this.djBIcL;
        iGY igy2 = null;
        if (igy == null) {
            Intrinsics.gEmmrt("");
            igy = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(igy.getRoot(), new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.jgi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return ActivityC26670jgh.copydefault(igy, view, windowInsetsCompat);
            }
        });
        if (AYXKKw().QOLQEE()) {
            android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this);
            iGY igy3 = this.djBIcL;
            if (igy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                igy2 = igy3;
            }
            iKW ikwCopydefault = iKW.copydefault(layoutInflaterFrom, igy2.EZpvd);
            this.valueOf = ikwCopydefault;
            Intrinsics.copydefault(ikwCopydefault);
            ikwCopydefault.KWHzl.setSwitchCallback(new StateListAnimator(igy));
            iKW ikw = this.valueOf;
            Intrinsics.copydefault(ikw);
            ikw.AEQbTJ.setOnCountdownListener(new ActionBar(igy));
        }
    }

    public static final WindowInsetsCompat copydefault(iGY igy, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        LinearLayoutCompat linearLayoutCompat = igy.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setPaddingRelative(linearLayoutCompat.getPaddingStart(), insets.top, linearLayoutCompat.getPaddingEnd(), linearLayoutCompat.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* JADX INFO: renamed from: o.jgh$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC27531jwu {
        public final /* synthetic */ iGY OLrzqt;

        public StateListAnimator(iGY igy) {
            this.OLrzqt = igy;
        }

        @Override // o.InterfaceC27531jwu
        public void copydefault(boolean z) {
            ActivityResultCaller activityResultCallerFindFragmentByTag = ActivityC26670jgh.this.getSupportFragmentManager().findFragmentByTag("f" + this.OLrzqt.valueOf.getCurrentItem());
            InterfaceC27531jwu interfaceC27531jwu = activityResultCallerFindFragmentByTag instanceof InterfaceC27531jwu ? (InterfaceC27531jwu) activityResultCallerFindFragmentByTag : null;
            if (interfaceC27531jwu != null) {
                interfaceC27531jwu.copydefault(z);
            }
        }

        @Override // o.InterfaceC27531jwu
        public void AEQbTJ() {
            ActivityResultCaller activityResultCallerFindFragmentByTag = ActivityC26670jgh.this.getSupportFragmentManager().findFragmentByTag("f" + this.OLrzqt.valueOf.getCurrentItem());
            InterfaceC27531jwu interfaceC27531jwu = activityResultCallerFindFragmentByTag instanceof InterfaceC27531jwu ? (InterfaceC27531jwu) activityResultCallerFindFragmentByTag : null;
            if (interfaceC27531jwu != null) {
                interfaceC27531jwu.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.jgh$ActionBar */
    public static final class ActionBar implements C27446jvO.TaskDescription {
        public final /* synthetic */ iGY OLrzqt;

        @Override // o.C27446jvO.TaskDescription
        public void AEQbTJ(int i, int i2, float f) {
        }

        public ActionBar(iGY igy) {
            this.OLrzqt = igy;
        }

        @Override // o.C27446jvO.TaskDescription
        public void KWHzl() {
            iKW ikw = ActivityC26670jgh.this.valueOf;
            Intrinsics.copydefault(ikw);
            ikw.AEQbTJ.KWHzl();
            iKW ikw2 = ActivityC26670jgh.this.valueOf;
            Intrinsics.copydefault(ikw2);
            C27446jvO c27446jvO = ikw2.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c27446jvO, "");
            c27446jvO.setVisibility(8);
            ActivityResultCaller activityResultCallerFindFragmentByTag = ActivityC26670jgh.this.getSupportFragmentManager().findFragmentByTag("f" + this.OLrzqt.valueOf.getCurrentItem());
            C27446jvO.TaskDescription taskDescription = activityResultCallerFindFragmentByTag instanceof C27446jvO.TaskDescription ? (C27446jvO.TaskDescription) activityResultCallerFindFragmentByTag : null;
            if (taskDescription != null) {
                taskDescription.KWHzl();
            }
        }
    }

    public final void copydefault(final C26762jiT c26762jiT) {
        iGY igy = this.djBIcL;
        java.lang.String strAYXKKw = "";
        if (igy == null) {
            Intrinsics.gEmmrt("");
            igy = null;
        }
        Application application = new Application(this, c26762jiT.copydefault());
        igy.valueOf.setAdapter(application);
        igy.valueOf.setOffscreenPageLimit(application.getItemCount());
        igy.valueOf.setCurrentItem(OLrzqt());
        C27569jxf c27569jxf = C27569jxf.OLrzqt;
        ViewPager2 viewPager2 = igy.valueOf;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        c27569jxf.EZpvd(viewPager2);
        LinearLayoutCompat linearLayoutCompat = igy.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(c26762jiT.copydefault().size() > 1 ? 0 : 8);
        C33537myN c33537myN = igy.KWHzl;
        if (!AYXKKw().AxsJAY() && !AYXKKw().OcIXYQ() && !AYXKKw().QOLQEE()) {
            strAYXKKw = C33070mpX.AYXKKw(KWHzl(c26762jiT.copydefault().get(OLrzqt())));
        }
        c33537myN.setTitle(strAYXKKw);
        new TabLayoutMediator(igy.AEQbTJ, igy.valueOf, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.jgk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                ActivityC26670jgh.OLrzqt(this.EZpvd, c26762jiT, tab, i);
            }
        }).attach();
        igy.AEQbTJ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new LoaderManager());
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void OLrzqt(ActivityC26670jgh activityC26670jgh, C26762jiT c26762jiT, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(C33070mpX.AYXKKw(activityC26670jgh.KWHzl(c26762jiT.copydefault().get(i))));
    }

    /* JADX INFO: renamed from: o.jgh$LoaderManager */
    public static final class LoaderManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public LoaderManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String str = "f" + (tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null);
            if (!ActivityC26670jgh.this.AYXKKw().AubY()) {
                if (ActivityC26670jgh.this.AYXKKw().zsXlph()) {
                    androidx.fragment.app.Fragment fragmentFindFragmentByTag = ActivityC26670jgh.this.getSupportFragmentManager().findFragmentByTag(str);
                    C26707jhR c26707jhR = fragmentFindFragmentByTag instanceof C26707jhR ? (C26707jhR) fragmentFindFragmentByTag : null;
                    if (c26707jhR != null) {
                        c26707jhR.hDKMBd();
                        return;
                    }
                    return;
                }
                return;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentByTag2 = ActivityC26670jgh.this.getSupportFragmentManager().findFragmentByTag(str);
            C26640jgD c26640jgD = fragmentFindFragmentByTag2 instanceof C26640jgD ? (C26640jgD) fragmentFindFragmentByTag2 : null;
            if (c26640jgD != null) {
                c26640jgD.AuCTelauCTel();
            }
        }
    }

    /* JADX INFO: renamed from: o.jgh$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Application extends FragmentStateAdapter {
        public final java.util.List<TransactionConfig> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull FragmentActivity fragmentActivity, @NotNull java.util.List<TransactionConfig> list) {
            super(fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (this.copydefault.get(i).wlaJM()) {
                return EZpvd(this.copydefault.get(i));
            }
            return KWHzl(this.copydefault.get(i));
        }

        public final androidx.fragment.app.Fragment EZpvd(TransactionConfig transactionConfig) {
            return C26640jgD.Companion.OLrzqt(transactionConfig);
        }

        public final androidx.fragment.app.Fragment KWHzl(TransactionConfig transactionConfig) {
            if (transactionConfig.KWHzl() == DeFiTradeExecutorType.SINGLE_REDEEM_V2) {
                return C26773jie.Companion.OLrzqt(transactionConfig);
            }
            if (transactionConfig.fIwbmz() == TransactionType.Univ3Redeem.getValue()) {
                return C26782jin.Companion.OLrzqt(transactionConfig);
            }
            return C26707jhR.Companion.copydefault(transactionConfig);
        }
    }

    public final int KWHzl(TransactionConfig transactionConfig) {
        InvestOrder investOrderAhwBna;
        java.lang.Integer numFJNWhG;
        java.lang.Integer numFJNWhG2;
        return (transactionConfig.AubY() && transactionConfig.fJNWhG() == null) ? C25493ixk.FragmentManager.DUUtXg : (transactionConfig.AubY() && (numFJNWhG2 = transactionConfig.fJNWhG()) != null && numFJNWhG2.intValue() == 0) ? C25493ixk.FragmentManager.DGUQLIhJrIAr : (transactionConfig.zsXlph() && transactionConfig.fJNWhG() == null) ? C25493ixk.FragmentManager.FhERFw : (transactionConfig.zsXlph() && (numFJNWhG = transactionConfig.fJNWhG()) != null && numFJNWhG.intValue() == 1) ? C25493ixk.FragmentManager.DRGLNw : (transactionConfig.getNewProxyInstance() && (investOrderAhwBna = transactionConfig.AhwBna()) != null && Intrinsics.EZpvd(investOrderAhwBna.getRedeemNeedUnbond(), java.lang.Boolean.TRUE)) ? C25493ixk.FragmentManager.iUnTnt : transactionConfig.AxsJAY() ? C25493ixk.FragmentManager.FhERFw : C25493ixk.FragmentManager.DUUtXg;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig.copy$default(com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig, int, int, long, boolean, long, long, java.lang.String, java.lang.String, java.util.ArrayList, int, java.lang.Integer, long, int, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestOrder, com.okinc.business.invest_biz.data.bean.TransactionMethod, com.okinc.business.invest_biz.data.bean.InvestAssetPositionType, java.lang.Boolean, boolean, boolean, com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource, com.okinc.business.invest_biz.ui.screens.base_transaction.model.DeFiTradeExecutorType, boolean, boolean, java.lang.Long, int, java.lang.Object):com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig */
    @Override // o.InterfaceC26761jiS
    public void AEQbTJ(long j, boolean z) {
        if (this.djBIcL == null) {
            Intrinsics.gEmmrt("");
        }
        TransactionUIConfigViewModel transactionUIConfigViewModelAhwBna = AhwBna();
        TransactionConfig transactionConfigAYXKKw = AYXKKw();
        transactionUIConfigViewModelAhwBna.OLrzqt(transactionConfigAYXKKw.AEQbTJ((33554427 & 1) != 0 ? transactionConfigAYXKKw.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfigAYXKKw.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfigAYXKKw.values : j, (33554427 & 8) != 0 ? transactionConfigAYXKKw.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfigAYXKKw.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfigAYXKKw.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfigAYXKKw.AuCTel : null, (33554427 & 128) != 0 ? transactionConfigAYXKKw.fARcdN : null, (33554427 & 256) != 0 ? transactionConfigAYXKKw.valueOf : null, (33554427 & 512) != 0 ? transactionConfigAYXKKw.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfigAYXKKw.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfigAYXKKw.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfigAYXKKw.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfigAYXKKw.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfigAYXKKw.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfigAYXKKw.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfigAYXKKw.copydefault : null, (33554427 & 131072) != 0 ? transactionConfigAYXKKw.isConnected : null, (33554427 & 262144) != 0 ? transactionConfigAYXKKw.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfigAYXKKw.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfigAYXKKw.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfigAYXKKw.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfigAYXKKw.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfigAYXKKw.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfigAYXKKw.ejfBZ : null));
        AhwBna().OLrzqt();
    }

    @Override // o.InterfaceC26666jgd
    public void copydefault(@NotNull InterfaceC26764jiV interfaceC26764jiV) {
        Intrinsics.checkNotNullParameter(interfaceC26764jiV, "");
        boolean z = AYXKKw().QOLQEE() && this.valueOf != null && (interfaceC26764jiV instanceof InterfaceC26764jiV.TaskDescription);
        this.AhwBna = z;
        if (z && this.AYXKKw == TransactionStage.INPUT) {
            iKW ikw = this.valueOf;
            Intrinsics.copydefault(ikw);
            C27532jwv c27532jwv = ikw.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c27532jwv, "");
            c27532jwv.setVisibility(0);
            return;
        }
        iGY igy = this.djBIcL;
        if (igy == null) {
            Intrinsics.gEmmrt("");
            igy = null;
        }
        C27529jws c27529jws = igy.copydefault;
        Intrinsics.checkNotNullExpressionValue(c27529jws, "");
        c27529jws.setVisibility((interfaceC26764jiV instanceof InterfaceC26764jiV.Application) ^ true ? 0 : 8);
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("f" + igy.valueOf.getCurrentItem());
        BaseTransactionFragment baseTransactionFragment = fragmentFindFragmentByTag instanceof BaseTransactionFragment ? (BaseTransactionFragment) fragmentFindFragmentByTag : null;
        igy.copydefault.setMenu(interfaceC26764jiV, baseTransactionFragment instanceof InterfaceC26677jgo ? baseTransactionFragment : null);
    }

    @Override // o.InterfaceC26681jgs
    public void copydefault(@NotNull TransactionStage transactionStage) {
        C27532jwv c27532jwv;
        Intrinsics.checkNotNullParameter(transactionStage, "");
        if (this.AhwBna) {
            this.AYXKKw = transactionStage;
            iKW ikw = this.valueOf;
            if (ikw == null || (c27532jwv = ikw.KWHzl) == null) {
                return;
            }
            c27532jwv.setVisibility(transactionStage == TransactionStage.INPUT ? 0 : 8);
        }
    }

    @Override // o.InterfaceC26678jgp
    public void copydefault(int i) {
        iKW ikw;
        if (!AYXKKw().QOLQEE() || i <= 0 || (ikw = this.valueOf) == null || ikw.AEQbTJ.AEQbTJ()) {
            return;
        }
        C27446jvO c27446jvO = ikw.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27446jvO, "");
        c27446jvO.setVisibility(0);
        ikw.AEQbTJ.setMaxCountdownTime(i);
        ikw.AEQbTJ.OLrzqt();
    }

    @Override // o.InterfaceC26678jgp
    public void valueOf() {
        iKW ikw;
        if (AYXKKw().QOLQEE() && (ikw = this.valueOf) != null) {
            ikw.AEQbTJ.KWHzl();
            C27446jvO c27446jvO = ikw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c27446jvO, "");
            c27446jvO.setVisibility(8);
        }
    }

    @Override // o.AbstractActivityC26674jgl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        iKW ikw;
        super.onResume();
        if (!AYXKKw().QOLQEE() || (ikw = this.valueOf) == null || ikw.AEQbTJ.EZpvd() > 0) {
            return;
        }
        C27446jvO c27446jvO = ikw.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c27446jvO, "");
        if (c27446jvO.getVisibility() == 0) {
            ikw.AEQbTJ.KWHzl();
            C27446jvO c27446jvO2 = ikw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c27446jvO2, "");
            c27446jvO2.setVisibility(8);
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            iGY igy = this.djBIcL;
            if (igy == null) {
                Intrinsics.gEmmrt("");
                igy = null;
            }
            ActivityResultCaller activityResultCallerFindFragmentByTag = supportFragmentManager.findFragmentByTag("f" + igy.valueOf.getCurrentItem());
            C27446jvO.TaskDescription taskDescription = activityResultCallerFindFragmentByTag instanceof C27446jvO.TaskDescription ? (C27446jvO.TaskDescription) activityResultCallerFindFragmentByTag : null;
            if (taskDescription != null) {
                taskDescription.KWHzl();
            }
        }
    }

    @Override // o.AbstractActivityC26674jgl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26674jgl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC26674jgl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
