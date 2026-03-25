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
import com.okinc.kline.ui.formula.data.KlineFormulaData;
import com.okinc.kline.ui.formula.ui.KLineFormulaFragment;
import com.okinc.rxutils.RxBus;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.uilab.stateful.StatefulView;
import com.okinc.unify_trade.message.TradeMessagePresenter;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC48895ueM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.psS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC39442psS extends AbstractActivityC39386prO implements InterfaceC39499ptW, InterfaceC39508ptf {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public int AYXKKw;
    public java.lang.String AhwBna;
    public java.lang.String AkhnZx;
    public KLineFormulaFragment AuCTel;
    public int AuCTelauCTel;
    public C49352umt DbNXlk;
    public xHY ejfBZ;
    public boolean fARcdN;
    public InterfaceC58217yxC fIwbmz;
    public InterfaceC37933pGb fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public android.widget.RelativeLayout hDKMBd;
    public java.lang.String isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public InterfaceC39560pue uzCIH;
    public KlineFormulaData valueOf;
    public FragmentOnAttachListener values;
    public C55237xgE wlaJM;
    public android.os.Handler zLjUOn;
    public java.lang.String getFieldNames = "";
    public java.lang.String getNewProxyInstance = "0";
    public java.lang.String zsXlph = "";

    /* JADX INFO: renamed from: o.psS$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    @Override // o.InterfaceC39499ptW
    public boolean AhwBna() {
        return false;
    }

    @Override // o.InterfaceC39556pua
    public void EZpvd(MarketCoinInfo marketCoinInfo) {
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
        this.fJNWhG = interfaceC37933pGb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public java.lang.String djBIcL() {
        return "";
    }

    @Override // o.InterfaceC39499ptW
    public void fARcdN() {
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
        this.uzCIH = interfaceC39560pue;
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitFullScreen(android.view.View view) {
    }

    @Override // o.InterfaceC39499ptW
    public void setPortraitNormal(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC39499ptW
    public java.lang.Boolean values() {
        return java.lang.Boolean.FALSE;
    }

    public ActivityC39442psS() {
        final Function0 function0 = null;
        this.fetchVPNInfo = new ViewModelLazy(C56524yIo.AEQbTJ(pCW.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.formula.ui.KlineFormulaActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.formula.ui.KlineFormulaActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.formula.ui.KlineFormulaActivity$special$$inlined$viewModels$default$3
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
        this.AuCTelauCTel = c33512mxp.isConnected();
        this.AYXKKw = c33512mxp.AYXKKw();
        this.iwGUEr = new ViewModelLazy(C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.formula.ui.KlineFormulaActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.formula.ui.KlineFormulaActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.formula.ui.KlineFormulaActivity$special$$inlined$viewModels$default$6
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
        this.zLjUOn = new Activity(this);
    }

    private final pCW fIwbmz() {
        return (pCW) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C54822xWp getNewProxyInstance() {
        return (C54822xWp) this.iwGUEr.getValue();
    }

    /* JADX INFO: renamed from: o.psS$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.psS.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC39442psS.class);
            intent.putExtra("klineFormulaName", str);
            intent.putExtra("formulaInfo", new KlineFormulaData(str2, str3));
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC39386prO, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        InterfaceC54577xNn interfaceC54577xNn;
        getTAG();
        this.getFieldNames = C33129mqd.divS$default(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 1000, null, null, null, 14, null);
        fIwbmz().AEQbTJ(this.getFieldNames);
        super.onCreate(bundle);
        this.getNewProxyInstance = getIntent().getStringExtra("refreshWidget");
        this.AkhnZx = getIntent().getStringExtra("from");
        this.isConnected = getIntent().getStringExtra("from_scene");
        this.AhwBna = getIntent().getStringExtra("klineFormulaName");
        this.valueOf = (KlineFormulaData) getIntent().getParcelableExtra("formulaInfo");
        this.zsXlph = C33129mqd.gEmmrt(UUID.randomUUID());
        fIwbmz().AhwBna(this.zsXlph);
        if (getRequestedOrientation() == 0) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 1024;
            getWindow().setAttributes(attributes);
        }
        setContentView(C35964oKf.Application.OLrzqt);
        this.wlaJM = (C55237xgE) findViewById(C35964oKf.StateListAnimator.search);
        this.hDKMBd = (android.widget.RelativeLayout) findViewById(C35964oKf.StateListAnimator.asBinder);
        hDKMBd();
        AuCTel();
        pFN.OLrzqt.EZpvd(new WeakReference<>(this));
        java.lang.String str = this.AhwBna;
        if (str != null && str.length() != 0) {
            KlineFormulaData klineFormulaData = this.valueOf;
            java.lang.String calcExpression = klineFormulaData != null ? klineFormulaData.getCalcExpression() : null;
            if (calcExpression != null && calcExpression.length() != 0) {
                AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C33504mxh.class, new java.lang.String[0]);
                final Function1 function1 = new Function1() { // from class: o.psV
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC39442psS.OLrzqt(this.OLrzqt, (C33504mxh) obj);
                    }
                };
                this.fIwbmz = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.psW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        ActivityC39442psS.copydefault(function1, obj);
                    }
                });
                C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
                iwGUEr();
                getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.psX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC39442psS.valueOf(this.EZpvd);
                    }
                });
                InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && interfaceC54577xNn.EZpvd()) {
                    C32866mlf.onEvent$default("app_demo_trading_chart_view", (TrackChannel[]) null, new Function1() { // from class: o.ptc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ActivityC39442psS.EZpvd(this.copydefault, (EventParamsList) obj);
                        }
                    }, 1, (java.lang.Object) null);
                }
                getNewProxyInstance().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.psY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return ActivityC39442psS.EZpvd(this.OLrzqt, (MarketCoinInfo) obj);
                    }
                }));
                this.ejfBZ = new TradeMessagePresenter();
                this.values = new FragmentOnAttachListener() { // from class: o.ptb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // androidx.fragment.app.FragmentOnAttachListener
                    public final void onAttachFragment(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
                        ActivityC39442psS.EZpvd(this.KWHzl, fragmentManager, fragment);
                    }
                };
                return;
            }
        }
        KWHzl();
        android.widget.RelativeLayout relativeLayout = this.hDKMBd;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC39442psS activityC39442psS, C33504mxh c33504mxh) {
        if (c33504mxh.copydefault() != activityC39442psS.AYXKKw || c33504mxh.AEQbTJ() != activityC39442psS.AuCTelauCTel) {
            activityC39442psS.recreate();
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(ActivityC39442psS activityC39442psS) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC39442psS, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(ActivityC39442psS activityC39442psS, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", activityC39442psS.djBIcL(), false);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC39442psS activityC39442psS, MarketCoinInfo marketCoinInfo) {
        activityC39442psS.EZpvd(marketCoinInfo);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final ActivityC39442psS activityC39442psS, androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragment, "");
        if ((fragment instanceof C32995moB ? fragment : null) != null) {
            fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.kline.ui.formula.ui.KlineFormulaActivity$onCreate$5$2$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    Intrinsics.checkNotNullParameter(lifecycleOwner, "");
                    super.onDestroy(lifecycleOwner);
                    this.OLrzqt.getNewProxyInstance().gEmmrt().setValue(Boolean.FALSE);
                    FragmentOnAttachListener fragmentOnAttachListener = this.OLrzqt.values;
                    if (fragmentOnAttachListener != null) {
                        this.OLrzqt.getSupportFragmentManager().removeFragmentOnAttachListener(fragmentOnAttachListener);
                    }
                }
            });
        }
    }

    private final void EZpvd(androidx.fragment.app.Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(C35964oKf.StateListAnimator.AEQbTJ, fragment, fragment.getClass().getName()).commitAllowingStateLoss();
    }

    @Override // o.InterfaceC39508ptf
    public void setImageResource(int i) {
        KLineFormulaFragment kLineFormulaFragment = this.AuCTel;
        if (kLineFormulaFragment != null) {
            kLineFormulaFragment.gEmmrt(i);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void ejfBZ() {
        KLineFormulaFragment kLineFormulaFragment = this.AuCTel;
        if (kLineFormulaFragment != null) {
            kLineFormulaFragment.igXuih();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void valueOf() {
        KLineFormulaFragment kLineFormulaFragment = this.AuCTel;
        if (kLineFormulaFragment != null) {
            kLineFormulaFragment.QVsKAR();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void AkhnZx() {
        KLineFormulaFragment kLineFormulaFragment = this.AuCTel;
        if (kLineFormulaFragment != null) {
            kLineFormulaFragment.fdOvFl();
        }
    }

    @Override // o.InterfaceC39508ptf
    public void KWHzl(double d, double d2) {
        KLineFormulaFragment kLineFormulaFragment = this.AuCTel;
        if (kLineFormulaFragment != null) {
            kLineFormulaFragment.OLrzqt(d, d2);
        }
    }

    @Override // o.InterfaceC39508ptf
    public void fetchVPNInfo() {
        KLineFormulaFragment kLineFormulaFragment = this.AuCTel;
        if (kLineFormulaFragment != null) {
            kLineFormulaFragment.QCjLjM();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void OLrzqt(int i) {
        getFieldNames();
    }

    private final void iwGUEr() {
        KlineFormulaData klineFormulaData;
        java.lang.String str = this.AhwBna;
        KLineFormulaFragment kLineFormulaFragmentCopydefault = (str == null || (klineFormulaData = this.valueOf) == null) ? null : KLineFormulaFragment.Companion.copydefault(str, klineFormulaData);
        this.AuCTel = kLineFormulaFragmentCopydefault;
        if (kLineFormulaFragmentCopydefault != null) {
            EZpvd(kLineFormulaFragmentCopydefault);
        }
    }

    @Override // o.InterfaceC39499ptW
    public void EZpvd(int i) {
        getDelegate().setLocalNightMode(i);
    }

    @Override // o.InterfaceC39499ptW
    public void AEQbTJ(boolean z) {
        InterfaceC37933pGb interfaceC37933pGb;
        this.fARcdN = z;
        if (z || (interfaceC37933pGb = this.fJNWhG) == null) {
            return;
        }
        interfaceC37933pGb.AhwBna();
    }

    @Override // o.InterfaceC39499ptW
    public void AYXKKw() {
        finish();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        KLineFormulaFragment kLineFormulaFragment = this.AuCTel;
        if (kLineFormulaFragment != null) {
            kLineFormulaFragment.aUsmxb();
        }
        super.onBackPressed();
    }

    private final void getFieldNames() {
        FragmentOnAttachListener fragmentOnAttachListener = this.values;
        if (fragmentOnAttachListener != null) {
            getSupportFragmentManager().addFragmentOnAttachListener(fragmentOnAttachListener);
        }
        getNewProxyInstance().gEmmrt().setValue(java.lang.Boolean.TRUE);
        zLjUOn();
    }

    private final void zLjUOn() {
        uzCIH();
        C49352umt c49352umt = this.DbNXlk;
        if (c49352umt != null) {
            InterfaceC48895ueM.Application.setSrcFrom$default(c49352umt, null, new Function0() { // from class: o.psU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC39442psS.AhwBna(this.OLrzqt);
                }
            }, 1, null);
        }
    }

    public static final Unit AhwBna(final ActivityC39442psS activityC39442psS) {
        android.graphics.Bitmap bitmapAEQbTJ = C33487mxQ.AEQbTJ(activityC39442psS.getWindow().getDecorView(), activityC39442psS.DbNXlk);
        Intrinsics.checkNotNullExpressionValue(bitmapAEQbTJ, "");
        ShareFileProvider.Companion.copydefault(bitmapAEQbTJ, activityC39442psS, new Function1() { // from class: o.psP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39442psS.OLrzqt((java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.psQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39442psS.KWHzl(this.KWHzl, (java.io.File) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC39442psS activityC39442psS, java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ((InterfaceC48893ueK) C43248rlh.KWHzl.AEQbTJ(InterfaceC48893ueK.class)).copydefault(activityC39442psS, ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.psT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC39442psS.KWHzl((ImageShareParams) obj);
            }
        }), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("market_kline");
        return Unit.INSTANCE;
    }

    private final void uzCIH() {
        android.view.View viewInflate = android.view.View.inflate(this, C35964oKf.Application.RgLUBD, null);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        C33487mxQ.EZpvd(viewInflate, displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.DbNXlk = (C49352umt) viewInflate.findViewById(C35964oKf.StateListAnimator.sbu);
    }

    /* JADX INFO: renamed from: o.psS$Activity */
    public static final class Activity extends android.os.Handler {
        public static final C0919Activity Companion = new C0919Activity(null);
        public static final int EZpvd = 8;
        public WeakReference<android.app.Activity> KWHzl;

        public Activity(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            this.KWHzl = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull android.os.Message message) {
            InterfaceC37933pGb interfaceC37933pGbOLrzqt;
            InterfaceC37933pGb interfaceC37933pGb;
            Intrinsics.checkNotNullParameter(message, "");
            android.app.Activity activity = this.KWHzl.get();
            if (activity != null) {
                if (activity instanceof ActivityC39442psS) {
                    ActivityC39442psS activityC39442psS = (ActivityC39442psS) activity;
                    if (message.what == 4) {
                        activityC39442psS.fARcdN = false;
                        if (activityC39442psS.fJNWhG == null || (interfaceC37933pGb = activityC39442psS.fJNWhG) == null) {
                            return;
                        }
                        interfaceC37933pGb.AhwBna();
                        return;
                    }
                    return;
                }
                if (activity instanceof ActivityC38952pjD) {
                    ActivityC38952pjD activityC38952pjD = (ActivityC38952pjD) activity;
                    if (message.what == 4) {
                        activityC38952pjD.KWHzl(false);
                        if (activityC38952pjD.OLrzqt() == null || (interfaceC37933pGbOLrzqt = activityC38952pjD.OLrzqt()) == null) {
                            return;
                        }
                        interfaceC37933pGbOLrzqt.AhwBna();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.psS$Activity$Activity, reason: collision with other inner class name */
        public static final class C0919Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.psS.Activity.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ C0919Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0919Activity() {
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        getTAG();
    }

    @Override // o.AbstractActivityC33041mov, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        InterfaceC43033rhe interfaceC43033rhe;
        super.onStop();
        if (!Intrinsics.EZpvd((java.lang.Object) this.getNewProxyInstance, (java.lang.Object) "1") || (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) == null) {
            return;
        }
        android.content.Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        interfaceC43033rhe.KWHzl(applicationContext);
    }

    @Override // o.AbstractActivityC39386prO, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        pEI.EZpvd.EZpvd();
        C36312oXc.AEQbTJ((C36250oUv) null).getFieldNames();
        InterfaceC58217yxC interfaceC58217yxC = this.fIwbmz;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        android.os.Handler handler = this.zLjUOn;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.AuCTel = null;
        pFN.OLrzqt.OLrzqt();
        getTAG();
    }

    @Override // o.InterfaceC39499ptW
    public void DbNXlk() {
        InterfaceC39560pue interfaceC39560pue = this.uzCIH;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.OLrzqt();
        }
    }

    @Override // o.InterfaceC39499ptW
    public void fJNWhG() {
        InterfaceC39560pue interfaceC39560pue = this.uzCIH;
        if (interfaceC39560pue != null) {
            interfaceC39560pue.KWHzl();
        }
    }

    @Override // o.AbstractActivityC39386prO, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        pEI pei = pEI.EZpvd;
        pei.KWHzl();
        pei.AYXKKw();
        pFU.AEQbTJ.KWHzl(true);
        xHY xhy = this.ejfBZ;
        if (xhy != null) {
            xhy.KWHzl();
        }
    }

    @Override // o.AbstractActivityC39386prO, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        pFU.AEQbTJ.KWHzl(false);
        C36246oUr.copydefault().gEmmrt();
        xHY xhy = this.ejfBZ;
        if (xhy != null) {
            xhy.EZpvd();
        }
    }

    private final void hDKMBd() {
        C55237xgE c55237xgE = this.wlaJM;
        if (c55237xgE != null) {
            ViewGroup.LayoutParams layoutParams = c55237xgE.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C33570myu.gEmmrt(this) + gEmmrt();
            c55237xgE.setLayoutParams(layoutParams2);
        }
    }

    public final void AuCTel() {
        C55113xdn c55113xdn;
        C55237xgE c55237xgE = this.wlaJM;
        android.view.View viewAEQbTJ = c55237xgE != null ? c55237xgE.AEQbTJ(StatefulView.Status.Loading) : null;
        if (viewAEQbTJ != null && (c55113xdn = (C55113xdn) viewAEQbTJ.findViewById(C52761wXj.FragmentManager.zblBkD)) != null) {
            C55113xdn.showLoading$default(c55113xdn, 0L, 1, null);
        }
        C55237xgE c55237xgE2 = this.wlaJM;
        if (c55237xgE2 != null) {
            c55237xgE2.setVisibility(0);
        }
        C55237xgE c55237xgE3 = this.wlaJM;
        if (c55237xgE3 != null) {
            c55237xgE3.setLoadingDelayedTime(0L);
        }
        C55237xgE c55237xgE4 = this.wlaJM;
        if (c55237xgE4 != null) {
            c55237xgE4.setStatus(StatefulView.Status.Loading);
        }
    }

    public final void KWHzl() {
        C55237xgE c55237xgE = this.wlaJM;
        if (c55237xgE == null || c55237xgE.getVisibility() != 0) {
            return;
        }
        c55237xgE.setStatus(StatefulView.Status.None);
        c55237xgE.setVisibility(8);
        getTAG();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        super.onSaveInstanceState(bundle);
        try {
            java.lang.String str = this.AhwBna;
            if (str == null || this.valueOf == null) {
                return;
            }
            bundle.putString("formulaName", str);
            bundle.putParcelable("formulaData", this.valueOf);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    @Override // o.AbstractActivityC39386prO, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC39386prO, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
