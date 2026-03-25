package o;

import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.api.bean.MarketArbCoinInfo;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.message.TradeMessagePresenter;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC48895ueM;
import o.ViewOnClickListenerC38532pbH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pfu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC38783pfu extends AbstractActivityC38561pbk implements InterfaceC39499ptW, InterfaceC39508ptf {
    public java.util.ArrayList<MarketCoinInfo> AYXKKw;
    public java.lang.String AhwBna;
    public C49352umt AkhnZx;
    public InterfaceC37933pGb AuCTel;
    public java.lang.String DbNXlk;
    public ViewOnClickListenerC38532pbH ejfBZ;
    public java.lang.String fARcdN;
    public boolean fIwbmz;
    public InterfaceC58217yxC fJNWhG;
    public FragmentOnAttachListener fetchVPNInfo;
    public final InterfaceC56387yDm getFieldNames;
    public InterfaceC39560pue getNewProxyInstance;
    public android.widget.RelativeLayout hDKMBd;
    public java.lang.String isConnected;
    public xHY uzCIH;
    public int valueOf;
    public final InterfaceC56387yDm values;
    public C55237xgE zLjUOn;
    public int zsXlph;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public java.lang.String AuCTelauCTel = "";
    public java.lang.String iwGUEr = "0";
    public java.lang.String AubY = "";

    /* JADX INFO: renamed from: o.pfu$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public void AEQbTJ(boolean z) {
        this.fIwbmz = z;
    }

    @Override // o.InterfaceC39499ptW
    public boolean AhwBna() {
        return false;
    }

    @Override // o.InterfaceC39508ptf
    public void AkhnZx() {
    }

    @Override // o.InterfaceC39556pua
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
    }

    @Override // o.InterfaceC39508ptf
    public void KWHzl(double d, double d2) {
    }

    @Override // o.InterfaceC39556pua
    public void KWHzl(MarketArbCoinInfo marketArbCoinInfo) {
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(java.lang.Boolean bool) {
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public void copydefault(InterfaceC37933pGb interfaceC37933pGb) {
        this.AuCTel = interfaceC37933pGb;
    }

    @Override // o.InterfaceC39508ptf
    public void ejfBZ() {
    }

    @Override // o.InterfaceC39499ptW
    public void fARcdN() {
    }

    @Override // o.InterfaceC39508ptf
    public void fetchVPNInfo() {
    }

    @Override // o.InterfaceC39499ptW
    public void isConnected() {
    }

    @Override // o.AbstractActivityC33041mov, o.InterfaceC33507mxk
    public boolean needChangeUpDownColor() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39508ptf
    public void setClickLockListener(InterfaceC39560pue interfaceC39560pue) {
        this.getNewProxyInstance = interfaceC39560pue;
    }

    @Override // o.InterfaceC39508ptf
    public void setImageResource(int i) {
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitFullScreen(android.view.View view) {
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitNormal(android.view.View view) {
    }

    @Override // o.InterfaceC39508ptf
    public void valueOf() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public java.lang.Boolean values() {
        return java.lang.Boolean.FALSE;
    }

    public ActivityC38783pfu() {
        final Function0 function0 = null;
        this.values = new ViewModelLazy(C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketCompareActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketCompareActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketCompareActivity$special$$inlined$viewModels$default$3
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
        this.zsXlph = c33512mxp.isConnected();
        this.valueOf = c33512mxp.AYXKKw();
        this.getFieldNames = new ViewModelLazy(C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.MarketCompareActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.MarketCompareActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.MarketCompareActivity$special$$inlined$viewModels$default$6
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

    private final pCW getFieldNames() {
        return (pCW) this.values.getValue();
    }

    private final C54822xWp iwGUEr() {
        return (C54822xWp) this.getFieldNames.getValue();
    }

    /* JADX INFO: renamed from: o.pfu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pfu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractActivityC38561pbk, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        InterfaceC54577xNn interfaceC54577xNn;
        MarketCoinInfo marketCoinInfo;
        this.AuCTelauCTel = C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null);
        getFieldNames().AEQbTJ(this.AuCTelauCTel);
        super.onCreate(bundle);
        this.AYXKKw = getIntent().getParcelableArrayListExtra("data");
        this.iwGUEr = getIntent().getStringExtra("refreshWidget");
        this.AhwBna = getIntent().getStringExtra("from");
        this.DbNXlk = getIntent().getStringExtra("from_scene");
        this.AubY = C33129mqd.gEmmrt(UUID.randomUUID());
        getFieldNames().AhwBna(this.AubY);
        if (getRequestedOrientation() == 0) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 1024;
            getWindow().setAttributes(attributes);
        }
        setContentView(C35964oKf.Application.OLrzqt);
        this.zLjUOn = (C55237xgE) findViewById(C35964oKf.StateListAnimator.search);
        this.hDKMBd = (android.widget.RelativeLayout) findViewById(C35964oKf.StateListAnimator.asBinder);
        fIwbmz();
        hDKMBd();
        pFN.OLrzqt.EZpvd(new WeakReference<>(this));
        if (bundle != null) {
            this.AYXKKw = bundle.getParcelableArrayList("save_tag");
        }
        java.util.ArrayList<MarketCoinInfo> arrayList = this.AYXKKw;
        if (arrayList != null && (marketCoinInfo = (MarketCoinInfo) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0)) != null) {
            this.isConnected = marketCoinInfo.getInstrumentId();
            this.fARcdN = marketCoinInfo.getInstrumentType();
        }
        java.lang.String str2 = this.isConnected;
        if (str2 == null || str2.length() == 0 || (str = this.fARcdN) == null || str.length() == 0) {
            EZpvd();
            android.widget.RelativeLayout relativeLayout = this.hDKMBd;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
                return;
            }
            return;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33504mxh.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.pfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38783pfu.EZpvd(this.AEQbTJ, (C33504mxh) obj);
            }
        };
        this.fJNWhG = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pft
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC38783pfu.OLrzqt(function1, obj);
            }
        });
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        AuCTel();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.pfz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC38783pfu.OLrzqt(this.OLrzqt);
            }
        });
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
            C32866mlf.onEvent$default("app_demo_trading_chart_view", (TrackChannel[]) null, new Function1() { // from class: o.pfy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC38783pfu.OLrzqt(this.KWHzl, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        C32869mli.onNewOKexEventWithParams$default("app_page_enter", null, new Function1() { // from class: o.pfA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38783pfu.copydefault(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, null);
        iwGUEr().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.pfB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38783pfu.copydefault(this.OLrzqt, (MarketCoinInfo) obj);
            }
        }));
        this.uzCIH = new TradeMessagePresenter();
        this.fetchVPNInfo = new FragmentOnAttachListener() { // from class: o.pfC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
                ActivityC38783pfu.OLrzqt(this.copydefault, fragmentManager, fragment);
            }
        };
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC38783pfu activityC38783pfu, C33504mxh c33504mxh) {
        if (c33504mxh.copydefault() != activityC38783pfu.valueOf || c33504mxh.AEQbTJ() != activityC38783pfu.zsXlph) {
            activityC38783pfu.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ActivityC38783pfu activityC38783pfu) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC38783pfu, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(ActivityC38783pfu activityC38783pfu, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", activityC38783pfu.djBIcL(), false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC38783pfu activityC38783pfu, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String str = activityC38783pfu.fARcdN;
        if (str != null) {
            eventParamsList.put("deal_type", str, false);
        }
        java.lang.String str2 = activityC38783pfu.isConnected;
        if (str2 != null) {
            eventParamsList.put("deal_name", str2, false);
        }
        eventParamsList.put("page_id", "page_k", false);
        java.lang.String str3 = activityC38783pfu.AhwBna;
        if (str3 != null) {
            eventParamsList.put("pre_page_id", str3, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC38783pfu activityC38783pfu, MarketCoinInfo marketCoinInfo) {
        activityC38783pfu.EZpvd(marketCoinInfo);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(final ActivityC38783pfu activityC38783pfu, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        if ((fragment instanceof C32995moB ? fragment : null) != null) {
            fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.kline.ui.MarketCompareActivity$onCreate$7$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    super.onDestroy(lifecycleOwner);
                    FragmentOnAttachListener fragmentOnAttachListener = this.OLrzqt.fetchVPNInfo;
                    if (fragmentOnAttachListener != null) {
                        this.OLrzqt.getSupportFragmentManager().removeFragmentOnAttachListener(fragmentOnAttachListener);
                    }
                }
            });
        }
    }

    private final void OLrzqt(androidx.fragment.app.Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.AEQbTJ, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        try {
            java.util.ArrayList<MarketCoinInfo> arrayList = this.AYXKKw;
            if (arrayList != null) {
                bundle.putParcelableArrayList("save_tag", arrayList);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(int i) {
        getNewProxyInstance();
    }

    public final void AuCTel() {
        java.lang.String str;
        java.util.ArrayList<MarketCoinInfo> arrayList;
        ViewOnClickListenerC38532pbH.Activity activity = ViewOnClickListenerC38532pbH.Companion;
        java.lang.String str2 = this.isConnected;
        if (str2 == null || (str = this.fARcdN) == null || (arrayList = this.AYXKKw) == null) {
            return;
        }
        ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbHEZpvd = activity.EZpvd(str2, str, arrayList, (32 & 8) != 0 ? null : this.AhwBna, (32 & 16) != 0 ? true : true, (32 & 32) != 0 ? false : false, (32 & 64) != 0 ? null : this.DbNXlk);
        this.ejfBZ = viewOnClickListenerC38532pbHEZpvd;
        if (viewOnClickListenerC38532pbHEZpvd != null) {
            OLrzqt(viewOnClickListenerC38532pbHEZpvd);
        }
    }

    @Override // o.InterfaceC39499ptW
    public void EZpvd(int i) {
        getDelegate().setLocalNightMode(i);
    }

    @Override // o.InterfaceC39499ptW
    public void AYXKKw() {
        ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH = this.ejfBZ;
        if (viewOnClickListenerC38532pbH != null) {
            viewOnClickListenerC38532pbH.OxVOHk();
        }
        finish();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ViewOnClickListenerC38532pbH viewOnClickListenerC38532pbH = this.ejfBZ;
        if (viewOnClickListenerC38532pbH != null) {
            viewOnClickListenerC38532pbH.OxVOHk();
        }
        super.onBackPressed();
    }

    private final void getNewProxyInstance() {
        uzCIH();
        C49352umt c49352umt = this.AkhnZx;
        if (c49352umt != null) {
            InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt, null, new Function0() { // from class: o.pfF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC38783pfu.KWHzl(this.OLrzqt);
                }
            }, 1, null);
        }
    }

    public static final Unit KWHzl(final ActivityC38783pfu activityC38783pfu) {
        android.graphics.Bitmap bitmapAEQbTJ = C33487mxQ.AEQbTJ(activityC38783pfu.getWindow().getDecorView(), activityC38783pfu.AkhnZx);
        Intrinsics.checkNotNullExpressionValue(bitmapAEQbTJ, "");
        ShareFileProvider.Companion.copydefault(bitmapAEQbTJ, activityC38783pfu, new Function1() { // from class: o.pfD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38783pfu.KWHzl((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.pfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38783pfu.OLrzqt(this.copydefault, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC38783pfu activityC38783pfu, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(activityC38783pfu, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.pfw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC38783pfu.OLrzqt((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("market_kline");
        return Unit.INSTANCE;
    }

    private final void uzCIH() {
        android.view.View viewInflate = android.view.View.inflate(this, C35964oKf.Application.RgLUBD, null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.AkhnZx = (C49352umt) viewInflate.findViewById(C35964oKf.StateListAnimator.sbu);
    }

    /* JADX DEBUG: Possible override for method o.pbk.djBIcL()V */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042 A[RETURN, SYNTHETIC] */
    @Override // o.InterfaceC39499ptW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String djBIcL() {
        java.lang.String str = this.fARcdN;
        if (str != null) {
            switch (str.hashCode()) {
                case -2027980370:
                    if (str.equals("MARGIN")) {
                        return "bb";
                    }
                    break;
                case -1956807563:
                    if (str.equals("OPTION")) {
                        return "options";
                    }
                    break;
                case 2552066:
                    if (!str.equals("SPOT")) {
                    }
                    break;
                case 2558355:
                    if (str.equals("SWAP")) {
                        return "swap";
                    }
                    break;
                case 214415088:
                    if (str.equals("FUTURES")) {
                        return "futures";
                    }
                    break;
            }
        }
        return "";
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        InterfaceC43033rhe interfaceC43033rhe;
        super.onStop();
        if (!Intrinsics.EZpvd((java.lang.Object) this.iwGUEr, (java.lang.Object) "1") || (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) == null) {
            return;
        }
        android.content.Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        interfaceC43033rhe.KWHzl(applicationContext);
    }

    @Override // o.AbstractActivityC38561pbk, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pEI.EZpvd.EZpvd();
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        InterfaceC58217yxC interfaceC58217yxC = this.fJNWhG;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        pFN.OLrzqt.OLrzqt();
    }

    @Override // o.InterfaceC39499ptW
    public void DbNXlk() {
        InterfaceC39560pue interfaceC39560pue = this.getNewProxyInstance;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.OLrzqt();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void fJNWhG() {
        InterfaceC39560pue interfaceC39560pue = this.getNewProxyInstance;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
    }

    @Override // o.AbstractActivityC38561pbk, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pEI pei = pEI.EZpvd;
        pei.KWHzl();
        pei.AYXKKw();
        pFU.AEQbTJ.KWHzl(true);
        xHY xhy = this.uzCIH;
        if (xhy != null) {
            xhy.KWHzl();
        }
    }

    @Override // o.AbstractActivityC38561pbk, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        pFU.AEQbTJ.KWHzl(false);
        C36246oUr.copydefault().gEmmrt();
        xHY xhy = this.uzCIH;
        if (xhy != null) {
            xhy.EZpvd();
        }
    }

    public final void fIwbmz() {
        C55237xgE c55237xgE = this.zLjUOn;
        if (c55237xgE != null) {
            ViewGroup.LayoutParams layoutParams = c55237xgE.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C33570myu.gEmmrt(this) + gEmmrt();
            c55237xgE.setLayoutParams(layoutParams2);
        }
    }

    public final void hDKMBd() {
        C55113xdn c55113xdn;
        C55237xgE c55237xgE = this.zLjUOn;
        android.view.View viewAEQbTJ = c55237xgE != null ? c55237xgE.AEQbTJ(StatefulView.Status.Loading) : null;
        if (viewAEQbTJ != null && (c55113xdn = (C55113xdn) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.zblBkD)) != null) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
        }
        C55237xgE c55237xgE2 = this.zLjUOn;
        if (c55237xgE2 != null) {
            c55237xgE2.setVisibility(0);
        }
        C55237xgE c55237xgE3 = this.zLjUOn;
        if (c55237xgE3 != null) {
            c55237xgE3.setLoadingDelayedTime(0L);
        }
        C55237xgE c55237xgE4 = this.zLjUOn;
        if (c55237xgE4 != null) {
            c55237xgE4.setStatus(StatefulView.Status.Loading);
        }
    }

    public final void EZpvd() {
        C55237xgE c55237xgE = this.zLjUOn;
        if (c55237xgE == null || c55237xgE.getVisibility() != 0) {
            return;
        }
        c55237xgE.setStatus(StatefulView.Status.None);
        c55237xgE.setVisibility(8);
    }

    @Override // o.AbstractActivityC38561pbk, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC38561pbk, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
