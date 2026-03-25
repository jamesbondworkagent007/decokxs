package o;

import androidx.core.content.IntentCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dex.trade.order.domain.model.OrderListPageType;
import com.okinc.business.dex.trade.order.domain.model.OrderStatus;
import com.okinc.business.dex.trade.order.ui.OrderListActivity$setListener$1;
import com.okinc.business.dex.trade.order.ui.OrdersPagerFragment;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderListViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.hTL;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.hab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC22185hab extends gZS {
    public final InterfaceC56387yDm AkhnZx;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static final java.util.List<java.lang.String> AhwBna = yDY.gEmmrt("web3_dex_transactions_tab_orders", "web3_dex_transactions_tab_trades", "web3_dex_transactions_tab_bridge");
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.gZX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22185hab.fetchVPNInfo(this.copydefault);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.haf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22185hab.isConnected(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.had
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22185hab.AkhnZx(this.KWHzl);
        }
    });
    public final java.util.List<kotlin.Pair<java.lang.Integer, Function0<AbstractC31214lpm>>> gEmmrt = yDY.gEmmrt(C56390yDp.OLrzqt(java.lang.Integer.valueOf(C23274hvD.Fragment.setErrorMessage), new Function0() { // from class: o.hac
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22185hab.DbNXlk(this.AEQbTJ);
        }
    }), C56390yDp.OLrzqt(java.lang.Integer.valueOf(C23274hvD.Fragment.setState), new Function0() { // from class: o.hag
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22185hab.AhwBna();
        }
    }), C56390yDp.OLrzqt(java.lang.Integer.valueOf(C23274hvD.Fragment.OAUGar), new Function0() { // from class: o.hae
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC22185hab.AYXKKw();
        }
    }));

    /* JADX INFO: renamed from: o.hab$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderListPageType.values().length];
            try {
                iArr[OrderListPageType.OpenOrder.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderListPageType.History.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderListPageType.Trades.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OrderListPageType.Bridge.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[OrderStatus.values().length];
            try {
                iArr2[OrderStatus.OpenOrders.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderStatus.History.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            copydefault = iArr2;
        }
    }

    public ActivityC22185hab() {
        final Function0 function0 = null;
        this.AkhnZx = new ViewModelLazy(C56524yIo.AEQbTJ(OrderListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.order.ui.OrderListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.order.ui.OrderListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.order.ui.OrderListActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.hab$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hab.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Possible override for method o.gZS.djBIcL()V */
    public final C23379hxC djBIcL() {
        return (C23379hxC) this.djBIcL.getValue();
    }

    public static final C23379hxC fetchVPNInfo(ActivityC22185hab activityC22185hab) {
        return C23379hxC.AEQbTJ(activityC22185hab.getLayoutInflater());
    }

    public final OrderListPageType gEmmrt() {
        return (OrderListPageType) this.AYXKKw.getValue();
    }

    public static final OrderListPageType isConnected(ActivityC22185hab activityC22185hab) {
        OrderListPageType orderListPageType;
        android.content.Intent intent = activityC22185hab.getIntent();
        return (intent == null || (orderListPageType = (OrderListPageType) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "type", OrderListPageType.class))) == null) ? OrderListPageType.History : orderListPageType;
    }

    public final java.lang.String AkhnZx() {
        return (java.lang.String) this.valueOf.getValue();
    }

    public static final java.lang.String AkhnZx(ActivityC22185hab activityC22185hab) {
        java.lang.String stringExtra;
        android.content.Intent intent = activityC22185hab.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("chain_id")) == null) ? "" : stringExtra;
    }

    public final OrderListViewModel values() {
        return (OrderListViewModel) this.AkhnZx.getValue();
    }

    public static final OrdersPagerFragment DbNXlk(ActivityC22185hab activityC22185hab) {
        return OrdersPagerFragment.ActionBar.newInstance$default(OrdersPagerFragment.Companion, activityC22185hab.gEmmrt() == OrderListPageType.History, null, false, 6, null);
    }

    public static final C22241hbe AhwBna() {
        return new C22241hbe();
    }

    public static final gZG AYXKKw() {
        return new gZG();
    }

    @Override // o.gZS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(djBIcL().getRoot());
        if (AkhnZx().length() > 0) {
            values().copydefault(AkhnZx());
        }
        fetchVPNInfo();
        isConnected();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.hah
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC22185hab.values(this.KWHzl);
            }
        });
    }

    public static final void values(ActivityC22185hab activityC22185hab) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC22185hab, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fetchVPNInfo() {
        int i;
        djBIcL().EZpvd.setAdapter(new StateListAnimator());
        new TabLayoutMediator(djBIcL().KWHzl.copydefault(), djBIcL().EZpvd, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.hal
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                ActivityC22185hab.copydefault(this.AEQbTJ, tab, i2);
            }
        }).attach();
        int i2 = Application.OLrzqt[gEmmrt().ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 == 2) {
                i = 0;
            } else if (i2 == 3) {
                i = 1;
            } else if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        djBIcL().EZpvd.setCurrentItem(i, true);
    }

    public static final void copydefault(ActivityC22185hab activityC22185hab, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(C33070mpX.AYXKKw(activityC22185hab.gEmmrt.get(i).getFirst().intValue()));
        tab.setContentDescription(AhwBna.get(i));
    }

    private final void isConnected() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OrderListActivity$setListener$1(this, null), 3, null);
        djBIcL().copydefault.setOnNetworkClickListener(new Function0() { // from class: o.gZZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC22185hab.AuCTel(this.AEQbTJ);
            }
        });
        djBIcL().EZpvd.registerOnPageChangeCallback(new TaskDescription());
    }

    public static final Unit AuCTel(final ActivityC22185hab activityC22185hab) {
        C32866mlf.onEvent$default("DEXTrade_Txhistory_Page_Click", (TrackChannel[]) null, new Function1() { // from class: o.haa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22185hab.KWHzl(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        activityC22185hab.EZpvd(new Function1() { // from class: o.gZY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC22185hab.copydefault(this.copydefault, (ChainInfoResult) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC22185hab activityC22185hab, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        int iAEQbTJ = activityC22185hab.djBIcL().KWHzl.AEQbTJ();
        if (iAEQbTJ != 0) {
            str = iAEQbTJ != 1 ? TabTitleInfo.KEY_BRIDGE : "trades";
        } else {
            int i = Application.copydefault[activityC22185hab.values().EZpvd().ordinal()];
            if (i == 1) {
                str = "orders_open";
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "orders_history";
            }
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "chain_select", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC22185hab activityC22185hab, ChainInfoResult chainInfoResult) {
        Intrinsics.checkNotNullParameter(chainInfoResult, "");
        activityC22185hab.values().copydefault(chainInfoResult.copydefault());
        activityC22185hab.djBIcL().copydefault.KWHzl(chainInfoResult.OLrzqt());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.hab$TaskDescription */
    public static final class TaskDescription extends ViewPager2.OnPageChangeCallback {
        public TaskDescription() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C24246iaH c24246iaH = ActivityC22185hab.this.djBIcL().copydefault;
            DefiChainInfo defiChainInfoCopydefault = ActivityC22185hab.this.values().copydefault(ActivityC22185hab.this.DbNXlk());
            java.lang.String logoUrl = defiChainInfoCopydefault != null ? defiChainInfoCopydefault.getLogoUrl() : null;
            if (logoUrl == null) {
                logoUrl = "";
            }
            c24246iaH.KWHzl(logoUrl);
        }
    }

    public final void EZpvd(Function1<? super ChainInfoResult, Unit> function1) {
        NetworkSource networkSource;
        java.lang.String chainId;
        if (DbNXlk()) {
            networkSource = NetworkSource.Bridge;
        } else {
            networkSource = NetworkSource.Single;
        }
        NetworkSource networkSource2 = networkSource;
        hTL.ActionBar actionBar = hTL.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        DefiChainInfo defiChainInfoCopydefault = values().copydefault(DbNXlk());
        if (defiChainInfoCopydefault == null || (chainId = defiChainInfoCopydefault.getChainId()) == null) {
            chainId = "chain_id_all_network";
        }
        actionBar.OLrzqt(supportFragmentManager, new C21997hUb(networkSource2, chainId, true, null, true, null, true, false, CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256, null), function1);
    }

    public final boolean DbNXlk() {
        return djBIcL().EZpvd.getCurrentItem() == 2;
    }

    /* JADX INFO: renamed from: o.hab$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public final class StateListAnimator extends FragmentStateAdapter {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super(ActivityC22185hab.this.getSupportFragmentManager(), ActivityC22185hab.this.getLifecycle());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ActivityC22185hab.this.gEmmrt.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return (androidx.fragment.app.Fragment) ((Function0) ((kotlin.Pair) ActivityC22185hab.this.gEmmrt.get(i)).getSecond()).invoke();
        }
    }

    @Override // o.gZS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.gZS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.gZS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.gZS, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
