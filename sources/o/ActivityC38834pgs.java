package o;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.IntentCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.dexkline.dex.api.bean.CoinDetailRedirection;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.notification.KLineNotificationManager;
import com.okinc.kline.ui.MarketDetailActivity$subscribeOnUiChange$1;
import com.okinc.rxutils.RxBus;
import com.okinc.unified.BusinessType;
import com.okinc.unified.fragment.DeFiKlineFragment;
import com.okinc.unified.shared.CeDeFiSharedViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C38685peB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pgs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC38834pgs extends AbstractActivityC38563pbm {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public int AhwBna;
    public android.view.OrientationEventListener DbNXlk;
    public InterfaceC58217yxC fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public int fJNWhG;
    public boolean isConnected;
    public C36015oMc valueOf;
    public InterfaceC58217yxC values;
    public final KLineNotificationManager fetchVPNInfo = new KLineNotificationManager();
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.pgy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC38834pgs.KWHzl(this.copydefault);
        }
    });
    public java.lang.String AYXKKw = "";

    /* JADX INFO: renamed from: o.pgs$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BusinessType.values().length];
            try {
                iArr[BusinessType.CeDeFi.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BusinessType.CeFi.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public void setRequestedOrientation(@NotNull android.app.Activity activity, @NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(configuration, "");
    }

    public ActivityC38834pgs() {
        final Function0 function0 = null;
        this.fIwbmz = new ViewModelLazy(C56524yIo.AEQbTJ(CeDeFiSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketDetailActivity$special$$inlined$viewModels$default$3
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
        C33512mxp c33512mxp = C33512mxp.AEQbTJ;
        this.fJNWhG = c33512mxp.isConnected();
        this.AhwBna = c33512mxp.AYXKKw();
    }

    /* JADX INFO: renamed from: o.pgs$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pgs.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CeDeFiSharedViewModel isConnected() {
        return (CeDeFiSharedViewModel) this.fIwbmz.getValue();
    }

    public static final C37875pDy KWHzl(ActivityC38834pgs activityC38834pgs) {
        return new C37875pDy(activityC38834pgs);
    }

    public final C37875pDy AhwBna() {
        return (C37875pDy) this.AkhnZx.getValue();
    }

    @Override // o.AbstractActivityC38563pbm, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        values();
        C36015oMc c36015oMcCopydefault = C36015oMc.copydefault(android.view.LayoutInflater.from(this));
        setContentView(c36015oMcCopydefault.getRoot());
        this.valueOf = c36015oMcCopydefault;
        FragmentContainerView fragmentContainerView = c36015oMcCopydefault.copydefault;
        if (fragmentContainerView != null) {
            ViewGroup.LayoutParams layoutParams = fragmentContainerView.getLayoutParams();
            if (layoutParams != null) {
                LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) layoutParams;
                ((LinearLayout.LayoutParams) layoutParams2).topMargin = C33570myu.OLrzqt();
                fragmentContainerView.setLayoutParams(layoutParams2);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.LinearLayoutCompat.LayoutParams");
            }
        }
        AkhnZx();
        copydefault(true);
        DbNXlk();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        OLrzqt(supportFragmentManager);
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33504mxh.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.pgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38834pgs.copydefault(this.copydefault, (C33504mxh) obj);
            }
        };
        this.values = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC38834pgs.EZpvd(function1, obj);
            }
        });
        getLifecycle().addObserver(this.fetchVPNInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC38834pgs activityC38834pgs, C33504mxh c33504mxh) {
        if (c33504mxh.copydefault() != activityC38834pgs.AhwBna || c33504mxh.AEQbTJ() != activityC38834pgs.fJNWhG) {
            activityC38834pgs.recreate();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC38563pbm, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        values();
    }

    public final void values() {
        AhwBna().copydefault(new Function1() { // from class: o.pgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38834pgs.AEQbTJ(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC38834pgs activityC38834pgs, boolean z) {
        activityC38834pgs.isConnected = z;
        activityC38834pgs.isConnected().copydefault(z);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC38563pbm, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        AhwBna().KWHzl();
    }

    public final void OLrzqt(androidx.fragment.app.FragmentManager fragmentManager) {
        fragmentManager.setFragmentResultListener("switch_header", this, new FragmentResultListener() { // from class: o.pgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC38834pgs.copydefault(this.KWHzl, str, bundle);
            }
        });
        fragmentManager.setFragmentResultListener("switch_orientation_manually", this, new FragmentResultListener() { // from class: o.pgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC38834pgs.EZpvd(this.copydefault, str, bundle);
            }
        });
    }

    public static final void copydefault(ActivityC38834pgs activityC38834pgs, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        activityC38834pgs.copydefault(bundle.getBoolean("kline_show_header", true));
    }

    public static final void EZpvd(ActivityC38834pgs activityC38834pgs, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.lang.String string = bundle.getString("manually_orientation");
        activityC38834pgs.AYXKKw = string != null ? string : "";
        activityC38834pgs.djBIcL();
    }

    private final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketDetailActivity$subscribeOnUiChange$1(this, null), 3, null);
    }

    public final void EZpvd(BusinessType businessType) {
        androidx.fragment.app.Fragment fragmentCopydefault;
        if (Activity.EZpvd[businessType.ordinal()] == 1) {
            fragmentCopydefault = DeFiKlineFragment.Companion.AEQbTJ();
        } else {
            fragmentCopydefault = C55427xjj.Companion.copydefault();
        }
        getSupportFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.DeEinT, fragmentCopydefault, fragmentCopydefault.getClass().getSimpleName()).commitAllowingStateLoss();
    }

    public final void AkhnZx() {
        java.lang.String str;
        BusinessType second = isConnected().AEQbTJ().getValue().getSecond();
        if (second != null) {
            EZpvd(second);
            return;
        }
        BusinessType businessType = getIntent().hasExtra("token_base") ? BusinessType.CeDeFi : BusinessType.CeFi;
        java.lang.String stringExtra = getIntent().getStringExtra("from");
        java.lang.String stringExtra2 = getIntent().getStringExtra("from_scene");
        int i = Activity.EZpvd[businessType.ordinal()];
        if (i == 1) {
            java.lang.String str2 = (java.lang.String) C34656ngH.getSourceType$default((android.app.Activity) this, false, 1, (java.lang.Object) null).getValue();
            android.content.Intent intent = getIntent();
            TokenBase tokenBase = intent != null ? (TokenBase) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "token_base", TokenBase.class)) : null;
            android.content.Intent intent2 = getIntent();
            CoinDetailRedirection coinDetailRedirection = intent2 != null ? (CoinDetailRedirection) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent2, "coin_detail_redirection", CoinDetailRedirection.class)) : null;
            boolean booleanExtra = getIntent().getBooleanExtra("is_show_price_alert", false);
            java.lang.String stringExtra3 = getIntent().getStringExtra("firstTab");
            str = (tokenBase != null ? tokenBase.getChainId() : null) + (tokenBase != null ? tokenBase.getTokenContractAddress() : null);
            isConnected().KWHzl(tokenBase, str2, coinDetailRedirection, str2, booleanExtra, stringExtra3, stringExtra, stringExtra2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            android.content.Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "");
            MarketCoinInfo marketCoinInfo = (MarketCoinInfo) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent3, "market_detail_info", MarketCoinInfo.class));
            java.lang.String stringExtra4 = getIntent().getStringExtra("id");
            java.lang.String stringExtra5 = getIntent().getStringExtra("type");
            java.lang.String stringExtra6 = getIntent().getStringExtra("firstTab");
            boolean booleanExtra2 = getIntent().getBooleanExtra("is_all", true);
            boolean booleanExtra3 = getIntent().getBooleanExtra("is_show_price_alert", false);
            java.lang.String stringExtra7 = getIntent().getStringExtra("refreshWidget");
            java.lang.String stringExtra8 = getIntent().getStringExtra("isCedefiOnline");
            java.lang.String stringExtra9 = getIntent().getStringExtra("tag");
            str = stringExtra4 != null ? stringExtra4 : "";
            isConnected().AEQbTJ(marketCoinInfo, stringExtra4, stringExtra5, stringExtra, stringExtra2, stringExtra6, booleanExtra2, booleanExtra3, stringExtra7, stringExtra8, stringExtra9);
        }
        isConnected().EZpvd(str, businessType);
    }

    public final void copydefault(boolean z) {
        FragmentContainerView fragmentContainerView;
        C36015oMc c36015oMc = this.valueOf;
        if (c36015oMc != null && (fragmentContainerView = c36015oMc.copydefault) != null) {
            fragmentContainerView.setVisibility(z ? 0 : 8);
        }
        java.lang.String strValueOf = C56524yIo.AEQbTJ(C38685peB.class).valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        if (z) {
            if (getSupportFragmentManager().findFragmentByTag(strValueOf) != null) {
                return;
            }
            getSupportFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.Qsauvs, C38685peB.StateListAnimator.newInstance$default(C38685peB.Companion, false, 1, null), strValueOf).commitAllowingStateLoss();
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C34584neo.OLrzqt(supportFragmentManager, strValueOf);
        }
    }

    /* JADX INFO: renamed from: o.pgs$TaskDescription */
    public static final class TaskDescription extends android.view.OrientationEventListener {
        public TaskDescription() {
            super(ActivityC38834pgs.this, 3);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            if (i == -1 || !ActivityC38834pgs.this.isConnected) {
                return;
            }
            if (i > 350 || i < 0) {
                if (Intrinsics.EZpvd((java.lang.Object) ActivityC38834pgs.this.AYXKKw, (java.lang.Object) "vertical")) {
                    ActivityC38834pgs.this.AYXKKw = "";
                }
                if (ActivityC38834pgs.this.AYXKKw.length() == 0) {
                    ActivityC38834pgs.this.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            if (81 <= i && i < 100) {
                if (Intrinsics.EZpvd((java.lang.Object) ActivityC38834pgs.this.AYXKKw, (java.lang.Object) "horizontal")) {
                    ActivityC38834pgs.this.AYXKKw = "";
                }
                if (ActivityC38834pgs.this.AYXKKw.length() == 0) {
                    ActivityC38834pgs.this.setRequestedOrientation(8);
                    return;
                }
                return;
            }
            if (171 <= i && i < 190) {
                if (Intrinsics.EZpvd((java.lang.Object) ActivityC38834pgs.this.AYXKKw, (java.lang.Object) "vertical")) {
                    ActivityC38834pgs.this.AYXKKw = "";
                }
                if (ActivityC38834pgs.this.AYXKKw.length() == 0) {
                    ActivityC38834pgs.this.setRequestedOrientation(1);
                    return;
                }
                return;
            }
            if (261 > i || i >= 280) {
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) ActivityC38834pgs.this.AYXKKw, (java.lang.Object) "horizontal")) {
                ActivityC38834pgs.this.AYXKKw = "";
            }
            if (ActivityC38834pgs.this.AYXKKw.length() == 0) {
                ActivityC38834pgs.this.setRequestedOrientation(0);
            }
        }
    }

    public final void djBIcL() {
        if (this.DbNXlk == null) {
            TaskDescription taskDescription = new TaskDescription();
            this.DbNXlk = taskDescription;
            if (taskDescription.canDetectOrientation()) {
                android.view.OrientationEventListener orientationEventListener = this.DbNXlk;
                if (orientationEventListener != null) {
                    orientationEventListener.enable();
                    return;
                }
                return;
            }
            android.view.OrientationEventListener orientationEventListener2 = this.DbNXlk;
            if (orientationEventListener2 != null) {
                orientationEventListener2.disable();
            }
        }
    }

    @Override // o.AbstractActivityC38563pbm, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC58217yxC interfaceC58217yxC = this.values;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fARcdN;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        android.view.OrientationEventListener orientationEventListener = this.DbNXlk;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.DbNXlk = null;
        pFN.OLrzqt.OLrzqt();
    }

    public final void fetchVPNInfo() {
        isConnected().AhwBna().setValue(java.lang.Boolean.TRUE);
    }

    public final void OLrzqt() {
        isConnected().AhwBna().setValue(java.lang.Boolean.FALSE);
    }

    /* JADX DEBUG: Possible override for method o.pbm.valueOf()V */
    public final C38685peB valueOf() {
        FragmentContainerView fragmentContainerView;
        C36015oMc c36015oMc = this.valueOf;
        if (c36015oMc == null || (fragmentContainerView = c36015oMc.copydefault) == null) {
            return null;
        }
        return (C38685peB) fragmentContainerView.getFragment();
    }

    public final androidx.fragment.app.Fragment AYXKKw() {
        FragmentContainerView fragmentContainerView;
        C36015oMc c36015oMc = this.valueOf;
        if (c36015oMc == null || (fragmentContainerView = c36015oMc.OLrzqt) == null) {
            return null;
        }
        return fragmentContainerView.getFragment();
    }

    @Override // o.AbstractActivityC38563pbm, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC38563pbm, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
