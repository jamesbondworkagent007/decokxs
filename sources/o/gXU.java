package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.ManagerStrategyBottomSheet;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyBasicInfoFragment;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$initListener$3;
import com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyOpenOrderFragment;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyBasicInfoViewModel;
import com.okinc.business.dex.trade.copytrading.strategyinfo.viewmodel.StrategyInfoViewModel;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gXU extends AbstractActivityC20021gXz {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.gYb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gXU.gEmmrt(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.gYe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gXU.DbNXlk();
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.gYd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return gXU.valueOf(this.KWHzl);
        }
    });

    public gXU() {
        final Function0 function0 = null;
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(StrategyInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$special$$inlined$viewModels$default$3
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
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(StrategyBasicInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.strategyinfo.ui.StrategyInfoActivity$special$$inlined$viewModels$default$6
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

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gXU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) gXU.class);
            intent.putExtra(OtcExtraKeys.ORDER_ID, str);
            context.startActivity(intent);
        }
    }

    public final StrategyInfoViewModel AuCTel() {
        return (StrategyInfoViewModel) this.AYXKKw.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StrategyBasicInfoViewModel iwGUEr() {
        return (StrategyBasicInfoViewModel) this.AhwBna.getValue();
    }

    public final C23378hxB fIwbmz() {
        return (C23378hxB) this.valueOf.getValue();
    }

    public static final C23378hxB gEmmrt(gXU gxu) {
        return C23378hxB.KWHzl(gxu.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<kotlin.Pair<java.lang.String, Function0<AbstractC20011gXp>>> hDKMBd() {
        return (java.util.List) this.gEmmrt.getValue();
    }

    public static final java.util.List DbNXlk() {
        return yDY.gEmmrt(C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.hNurIN), new Function0() { // from class: o.gXR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gXU.values();
            }
        }), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.getValue), new Function0() { // from class: o.gXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gXU.isConnected();
            }
        }), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.GQzpsZsQwTVT), new Function0() { // from class: o.gYa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gXU.fetchVPNInfo();
            }
        }), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.inahnb), new Function0() { // from class: o.gXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gXU.AkhnZx();
            }
        }), C56390yDp.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.GQzpsZgQzpsZ), new Function0() { // from class: o.gXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gXU.fJNWhG();
            }
        }));
    }

    public static final C20037gYo values() {
        return C20037gYo.Companion.OLrzqt();
    }

    public static final StrategyOpenOrderFragment isConnected() {
        return StrategyOpenOrderFragment.Companion.copydefault(false);
    }

    public static final StrategyOpenOrderFragment fetchVPNInfo() {
        return StrategyOpenOrderFragment.Companion.copydefault(true);
    }

    public static final gXT AkhnZx() {
        return gXT.Companion.EZpvd();
    }

    public static final C20043gYu fJNWhG() {
        return C20043gYu.Companion.EZpvd();
    }

    private final java.lang.String uzCIH() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String valueOf(gXU gxu) {
        java.lang.String stringExtra = gxu.getIntent().getStringExtra(OtcExtraKeys.ORDER_ID);
        return stringExtra == null ? (java.lang.String) C31200lpY.copydefault("", "invalid strategyOrderId") : stringExtra;
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra(OtcExtraKeys.ORDER_ID);
        if (stringExtra == null) {
            stringExtra = (java.lang.String) C31200lpY.copydefault("", "invalid strategyOrderId");
        }
        AuCTel().KWHzl(stringExtra);
    }

    @Override // o.AbstractActivityC20021gXz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(fIwbmz().getRoot());
        AuCTel().OLrzqt(uzCIH());
        fARcdN();
        ejfBZ();
        wlaJM();
        getFieldNames();
        fIwbmz().AhwBna.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
        fIwbmz().OLrzqt.setEnableRefresh(false);
        C55173xeu c55173xeu = fIwbmz().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        fIwbmz().EZpvd.OLrzqt();
        AuCTel().AhwBna();
    }

    private final void getFieldNames() {
        fIwbmz().OLrzqt.setOnRefreshListener(new Function0() { // from class: o.gXZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gXU.AYXKKw(this.OLrzqt);
            }
        });
        C25352ivB.setOnDoubleCheckClickListener$default(fIwbmz().AhwBna.AEQbTJ(), 0L, new Function1() { // from class: o.gXY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gXU.EZpvd(this.OLrzqt, (android.view.View) obj);
            }
        }, 1, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new StrategyInfoActivity$initListener$3(this, null), 3, null);
    }

    public static final Unit AYXKKw(gXU gxu) {
        gxu.AuCTel().gEmmrt();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(gXU gxu, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C55173xeu c55173xeu = gxu.fIwbmz().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        gxu.fIwbmz().EZpvd.OLrzqt();
        gxu.AuCTel().gEmmrt();
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        getSupportFragmentManager().beginTransaction().replace(fIwbmz().KWHzl.getId(), new StrategyBasicInfoFragment(), "StrategyBasicInfoFragment").commitAllowingStateLoss();
    }

    public final void ejfBZ() {
        fIwbmz().copydefault.setDoClickable(true);
        fIwbmz().copydefault.setSubDoVisible(8);
        fIwbmz().copydefault.setSubDoImageVisible(8);
        fIwbmz().copydefault.setSubDoImageResource(C52761wXj.TaskDescription.fdOvFl);
        android.widget.ImageView doImage = fIwbmz().copydefault.getDoImage();
        if (doImage != null) {
            doImage.setImageTintList(C25382ivf.copydefault(C52761wXj.Activity.fdOvFl));
        }
        fIwbmz().copydefault.setSubDoListener(new View.OnClickListener() { // from class: o.gYc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                gXU.OLrzqt(this.AEQbTJ, view);
            }
        });
        android.widget.ImageView doImage2 = fIwbmz().copydefault.getDoImage();
        if (doImage2 != null) {
            doImage2.setContentDescription("web3_dex_copytrading_strategy_info_settings_btn");
        }
    }

    public static final void OLrzqt(gXU gxu, android.view.View view) {
        gxu.AuCTel().copydefault(TrackButtonName.MANAGE_STRATEGY.getButtonName(), gxu.iwGUEr().AhwBna());
        ManagerStrategyBottomSheet.ActionBar actionBar = ManagerStrategyBottomSheet.Companion;
        androidx.fragment.app.FragmentManager supportFragmentManager = gxu.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        actionBar.KWHzl(supportFragmentManager);
    }

    private final void wlaJM() {
        fIwbmz().djBIcL.setAdapter(new ActionBar());
        new TabLayoutMediator(fIwbmz().gEmmrt.AYXKKw(), fIwbmz().djBIcL, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.gYf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                gXU.EZpvd(this.copydefault, tab, i);
            }
        }).attach();
        fIwbmz().gEmmrt.copydefault(new TaskDescription());
        getNewProxyInstance();
    }

    public static final void EZpvd(gXU gxu, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(gxu.hDKMBd().get(i).getFirst());
    }

    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String buttonName;
            if (tab == null) {
                return;
            }
            int position = tab.getPosition();
            if (position == 0) {
                buttonName = TrackButtonName.POSITIONS_TAB.getButtonName();
            } else if (position == 1) {
                buttonName = TrackButtonName.OPEN_ORDERS_TAB.getButtonName();
            } else if (position == 2) {
                buttonName = TrackButtonName.ORDER_HISTORY_TAB.getButtonName();
            } else if (position == 3) {
                buttonName = TrackButtonName.FILTERED_TAB.getButtonName();
            } else {
                buttonName = position != 4 ? "" : TrackButtonName.TRADES_TAB.getButtonName();
            }
            gXU.this.AuCTel().copydefault(buttonName, gXU.this.iwGUEr().AhwBna());
        }
    }

    public final void getNewProxyInstance() {
        TabLayout.TabView tabView;
        TabLayout tabLayoutAYXKKw = fIwbmz().gEmmrt.AYXKKw();
        int i = 0;
        for (java.lang.Object obj : yDY.gEmmrt("web3_dex_copytrading_strategy_info_positions_tab", "web3_dex_copytrading_strategy_info_open_orders_tab", "web3_dex_copytrading_strategy_info_past_orders_tab", "web3_dex_copytrading_strategy_info_filtered_tab", "web3_dex_copytrading_strategy_info_trades_tab")) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            TabLayout.Tab tabAt = tabLayoutAYXKKw.getTabAt(i);
            if (tabAt != null && (tabView = tabAt.view) != null) {
                tabView.setContentDescription(str);
            }
            i++;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public final class ActionBar extends FragmentStateAdapter {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
            super(gXU.this.getSupportFragmentManager(), gXU.this.getLifecycle());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return gXU.this.hDKMBd().size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return (androidx.fragment.app.Fragment) ((Function0) ((kotlin.Pair) gXU.this.hDKMBd().get(i)).getSecond()).invoke();
        }
    }

    @Override // o.AbstractActivityC20021gXz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC20021gXz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC20021gXz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC20021gXz, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
