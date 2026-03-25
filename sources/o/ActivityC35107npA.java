package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$initRecyclerView$1;
import com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$initRecyclerView$adapter$1$1;
import com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$observeP2PState$1;
import com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$onCreate$2;
import com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$onCreate$3$1;
import com.okinc.find_ui.widgetprovider.p2p.data.P2PTradeSide;
import com.okinc.okmarket.ui.market.quote.WrapContentLinearLayoutManager;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC35121npO;
import o.C35119npM;
import o.C52761wXj;
import o.qZH;

/* JADX INFO: renamed from: o.npA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC35107npA extends AbstractActivityC33041mov {
    public RecyclerView AEQbTJ;
    public C52794wYp AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public android.widget.TextView EZpvd;
    public C55173xeu KWHzl;
    public android.widget.RelativeLayout OLrzqt;
    public C33537myN copydefault;
    public int djBIcL;
    public Job gEmmrt;
    public C55230xfy isConnected;
    public C55249xgQ valueOf;
    public java.lang.String fetchVPNInfo = "SINGLE_COIN_PREFS_KEY_STRING";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.npB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC35107npA.valueOf(this.OLrzqt));
        }
    });

    /* JADX INFO: renamed from: o.npA$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[P2PTradeSide.values().length];
            try {
                iArr[P2PTradeSide.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[P2PTradeSide.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public ActivityC35107npA() {
        final Function0 function0 = null;
        this.DbNXlk = new ViewModelLazy(C56524yIo.AEQbTJ(C35119npM.class), new Function0<ViewModelStore>() { // from class: com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.find_ui.widgetprovider.CryptoWidgetConfigureActivity$special$$inlined$viewModels$default$3
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

    public final C35119npM AEQbTJ() {
        return (C35119npM) this.DbNXlk.getValue();
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean valueOf(ActivityC35107npA activityC35107npA) {
        return C35192nqg.KWHzl(activityC35107npA.fetchVPNInfo);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.djBIcL = extras.getInt("appWidgetId", 0);
            java.lang.String string = extras.getString("WIDGET_TYPE_STRING");
            if (string == null) {
                string = "SINGLE_COIN_PREFS_KEY_STRING";
            }
            this.fetchVPNInfo = string;
        }
        if (this.djBIcL == 0) {
            finish();
            return;
        }
        setContentView(qZH.ActionBar.copydefault);
        this.AEQbTJ = (RecyclerView) findViewById(qZH.StateListAnimator.heceqZ);
        this.EZpvd = (android.widget.TextView) findViewById(qZH.StateListAnimator.DGUQLI);
        this.valueOf = (C55249xgQ) findViewById(qZH.StateListAnimator.HJWChPRGtXKCDKRTZD);
        this.KWHzl = (C55173xeu) findViewById(qZH.StateListAnimator.fGQ);
        this.OLrzqt = (android.widget.RelativeLayout) findViewById(qZH.StateListAnimator.DrNnAm);
        showLoading(0L);
        AEQbTJ().KWHzl(this.djBIcL, this.fetchVPNInfo);
        AYXKKw();
        EZpvd();
        this.copydefault = (C33537myN) findViewById(qZH.StateListAnimator.isConnected);
        java.lang.String str = this.fetchVPNInfo;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SINGLE_COIN_PREFS_KEY_STRING")) {
            C33537myN c33537myN = this.copydefault;
            if (c33537myN != null) {
                c33537myN.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.OHsvZP));
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "P2P_MARKET_PREFS_KEY_STRING")) {
            C33537myN c33537myN2 = this.copydefault;
            if (c33537myN2 != null) {
                c33537myN2.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.DCUTEI));
            }
            android.widget.TextView textView = this.EZpvd;
            if (textView != null) {
                textView.setText(qZH.PendingIntent.ffGIBT);
            }
        } else {
            C33537myN c33537myN3 = this.copydefault;
            if (c33537myN3 != null) {
                c33537myN3.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.OKvQBs));
            }
        }
        C55230xfy c55230xfy = (C55230xfy) findViewById(qZH.StateListAnimator.QzqeNH);
        if (c55230xfy != null) {
            c55230xfy.EZpvd().setInputType(1);
            c55230xfy.EZpvd().setImeOptions(3);
            c55230xfy.EZpvd().setImeActionLabel(C33070mpX.AYXKKw(qZH.PendingIntent.zuBGHE), 3);
            c55230xfy.EZpvd().setHint(C33070mpX.AYXKKw(qZH.PendingIntent.zuBGHE));
            C33606mzd.AEQbTJ(c55230xfy.EZpvd(), new Function1() { // from class: o.npz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC35107npA.EZpvd(this.copydefault, (java.lang.CharSequence) obj);
                }
            });
            c55230xfy.copydefault().setVisibility(8);
        } else {
            c55230xfy = null;
        }
        this.isConnected = c55230xfy;
        this.AhwBna = (C52794wYp) findViewById(qZH.StateListAnimator.IYdWPz);
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new CryptoWidgetConfigureActivity$onCreate$2(this, null));
        C52794wYp c52794wYp = this.AhwBna;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.npy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC35107npA.KWHzl(this.copydefault, view);
                }
            });
        }
        KWHzl();
    }

    public static final Unit EZpvd(ActivityC35107npA activityC35107npA, java.lang.CharSequence charSequence) {
        activityC35107npA.AEQbTJ(charSequence);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC35107npA activityC35107npA, android.view.View view) {
        C52794wYp c52794wYp;
        Job job = activityC35107npA.gEmmrt;
        if ((job == null || !job.isActive()) && (c52794wYp = activityC35107npA.AhwBna) != null && c52794wYp.isEnabled()) {
            activityC35107npA.gEmmrt = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC35107npA), null, null, new CryptoWidgetConfigureActivity$onCreate$3$1(activityC35107npA, null), 3, null);
        }
    }

    public final void djBIcL() {
        if (Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) "P2P_MARKET_PREFS_KEY_STRING")) {
            gEmmrt();
        } else {
            OLrzqt();
        }
    }

    public final void OLrzqt() {
        java.lang.String instId;
        java.util.List<C35119npM.Application> value = AEQbTJ().OLrzqt().getValue();
        java.util.ArrayList<C35119npM.Application> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            if (((C35119npM.Application) obj).OLrzqt() == 1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C35119npM.Application application : arrayList) {
            if (copydefault()) {
                instId = C35197nql.AEQbTJ(application.KWHzl());
            } else {
                instId = application.KWHzl().getInstId();
            }
            arrayList2.add(instId);
        }
        C35192nqg.EZpvd(this, this.djBIcL, arrayList2, this.fetchVPNInfo);
    }

    public final void gEmmrt() {
        java.util.List<C35119npM.Application> value = AEQbTJ().OLrzqt().getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : value) {
            if (((C35119npM.Application) obj).OLrzqt() == 1) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C35119npM.Application) it.next()).KWHzl().getInstId());
        }
        java.lang.String str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(arrayList2, 0);
        if (str == null) {
            return;
        }
        C35127npU.OLrzqt(this, this.djBIcL, str + "," + AEQbTJ().KWHzl().getValue().AEQbTJ().getValue());
    }

    public final void KWHzl() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new CryptoWidgetConfigureActivity$observeP2PState$1(this, null));
    }

    public final void EZpvd() {
        P2PTradeSide p2PTradeSideKWHzl;
        TabLayout.Tab tabAt;
        if (!Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) "P2P_MARKET_PREFS_KEY_STRING")) {
            C55249xgQ c55249xgQ = this.valueOf;
            if (c55249xgQ != null) {
                c55249xgQ.setVisibility(8);
                return;
            }
            return;
        }
        C55249xgQ c55249xgQ2 = this.valueOf;
        int i = 0;
        if (c55249xgQ2 != null) {
            c55249xgQ2.setVisibility(0);
        }
        for (P2PTradeSide p2PTradeSide : P2PTradeSide.values()) {
            C55249xgQ c55249xgQ3 = this.valueOf;
            if (c55249xgQ3 != null) {
                c55249xgQ3.addTab(c55249xgQ3.newTab().setText(p2PTradeSide.getTitle()).setContentDescription(p2PTradeSide.getAccessibilityId()));
            }
        }
        java.lang.String strCopydefault = C35127npU.copydefault(this, this.djBIcL);
        if (strCopydefault.length() > 0) {
            p2PTradeSideKWHzl = P2PTradeSide.Companion.KWHzl(strCopydefault);
        } else {
            p2PTradeSideKWHzl = P2PTradeSide.BUY;
        }
        int i2 = Activity.EZpvd[p2PTradeSideKWHzl.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        C55249xgQ c55249xgQ4 = this.valueOf;
        if (c55249xgQ4 != null && (tabAt = c55249xgQ4.getTabAt(i)) != null) {
            tabAt.select();
        }
        C55249xgQ c55249xgQ5 = this.valueOf;
        if (c55249xgQ5 != null) {
            c55249xgQ5.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar());
        }
    }

    /* JADX INFO: renamed from: o.npA$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (ActivityC35107npA.this.AEQbTJ().KWHzl().getValue().EZpvd()) {
                pUU.EZpvd(ActivityC35107npA.this.getTAG(), "P2P data is loading, ignoring tab selection");
                return;
            }
            java.lang.Integer numValueOf = tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                P2PTradeSide p2PTradeSide = P2PTradeSide.BUY;
                if (ActivityC35107npA.this.AEQbTJ().OLrzqt(p2PTradeSide)) {
                    pUU.EZpvd(ActivityC35107npA.this.getTAG(), "Using cached BUY data");
                } else {
                    pUU.EZpvd(ActivityC35107npA.this.getTAG(), "Loading BUY data from API");
                }
                ActivityC35107npA.this.AEQbTJ().KWHzl(new AbstractC35121npO.TaskDescription(p2PTradeSide));
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                P2PTradeSide p2PTradeSide2 = P2PTradeSide.SELL;
                if (ActivityC35107npA.this.AEQbTJ().OLrzqt(p2PTradeSide2)) {
                    pUU.EZpvd(ActivityC35107npA.this.getTAG(), "Using cached SELL data");
                } else {
                    pUU.EZpvd(ActivityC35107npA.this.getTAG(), "Loading SELL data from API");
                }
                ActivityC35107npA.this.AEQbTJ().KWHzl(new AbstractC35121npO.TaskDescription(p2PTradeSide2));
            }
        }
    }

    public final void AEQbTJ(java.lang.CharSequence charSequence) {
        java.lang.String string;
        C35119npM c35119npMAEQbTJ = AEQbTJ();
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        c35119npMAEQbTJ.copydefault(string);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C55249xgQ c55249xgQ = this.valueOf;
        if (c55249xgQ != null) {
            c55249xgQ.clearOnTabSelectedListeners();
        }
        AEQbTJ().copydefault();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        C55173xeu c55173xeu = this.KWHzl;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout = this.OLrzqt;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        C52794wYp c52794wYp = this.AhwBna;
        if (c52794wYp != null) {
            c52794wYp.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        C55173xeu c55173xeu = this.KWHzl;
        if (c55173xeu != null) {
            c55173xeu.setVisibility(8);
        }
        android.widget.RelativeLayout relativeLayout = this.OLrzqt;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        C52794wYp c52794wYp = this.AhwBna;
        if (c52794wYp != null) {
            c52794wYp.setVisibility(0);
        }
    }

    private final void AYXKKw() {
        C35118npL c35118npL = new C35118npL(new Function2() { // from class: o.npG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC35107npA.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), (C35119npM.Application) obj2);
            }
        });
        RecyclerView recyclerView = this.AEQbTJ;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this));
        }
        C31684mAb c31684mAb = new C31684mAb(C33070mpX.KWHzl(C52761wXj.TaskDescription.gwwfep), false, false);
        RecyclerView recyclerView2 = this.AEQbTJ;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(c31684mAb);
        }
        RecyclerView recyclerView3 = this.AEQbTJ;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(c35118npL);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CryptoWidgetConfigureActivity$initRecyclerView$1(this, c35118npL, null), 3, null);
    }

    public static final Unit AEQbTJ(ActivityC35107npA activityC35107npA, boolean z, C35119npM.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activityC35107npA), null, null, new CryptoWidgetConfigureActivity$initRecyclerView$adapter$1$1(activityC35107npA, application, z, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
