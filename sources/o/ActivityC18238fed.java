package o;

import android.os.Build;
import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.account.api.model.login.BindConst;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.activity.DefiUsdgResultActivity$observeRegisterState$1;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterAddressResultData;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.RegisterResultType;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel.WalletUsdgActivityViewModel;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC21325gxd;
import o.C13754dXa;
import o.pHH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fed, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC18238fed extends AbstractActivityC18256fev {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC16939etQ EZpvd;
    public RegisterAddressResultData KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.fed$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RegisterResultType.values().length];
            try {
                iArr[RegisterResultType.TYPE_REGISTERING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RegisterResultType.TYPE_REGISTER_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RegisterResultType.TYPE_REGISTER_FAIL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[RegisterResultType.TYPE_REGION_NOT_SUPPORTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    public ActivityC18238fed() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(WalletUsdgActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.activity.DefiUsdgResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.activity.DefiUsdgResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.usdgActivity.ui.activity.DefiUsdgResultActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletUsdgActivityViewModel AhwBna() {
        return (WalletUsdgActivityViewModel) this.copydefault.getValue();
    }

    /* JADX INFO: renamed from: o.fed$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fed.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.ArrayList<java.lang.Long> arrayList, @NotNull RegisterAddressResultData registerAddressResultData, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(registerAddressResultData, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18238fed.class);
            intent.putExtra(BindConst.TELEGRAM_RESULT_KEY, registerAddressResultData);
            intent.putExtra("coin_id_list", arrayList);
            intent.putExtra("banner_id", j);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC18256fev, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        RegisterAddressResultData registerAddressResultData;
        android.os.Parcelable parcelableExtra;
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16939etQ) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.ORmwhf);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra(BindConst.TELEGRAM_RESULT_KEY, RegisterAddressResultData.class);
            } else {
                parcelableExtra = intent.getParcelableExtra(BindConst.TELEGRAM_RESULT_KEY);
            }
            registerAddressResultData = (RegisterAddressResultData) parcelableExtra;
        } else {
            registerAddressResultData = null;
        }
        this.KWHzl = registerAddressResultData;
        djBIcL();
    }

    private final void djBIcL() {
        RegisterAddressResultData registerAddressResultData = this.KWHzl;
        if (registerAddressResultData == null) {
            return;
        }
        RegisterResultType.Application application = RegisterResultType.Companion;
        Intrinsics.copydefault(registerAddressResultData);
        RegisterResultType registerResultTypeKWHzl = application.KWHzl(registerAddressResultData.getResultType());
        WalletUsdgActivityViewModel walletUsdgActivityViewModelAhwBna = AhwBna();
        RegisterAddressResultData registerAddressResultData2 = this.KWHzl;
        Intrinsics.copydefault(registerAddressResultData2);
        walletUsdgActivityViewModelAhwBna.EZpvd(registerAddressResultData2.getUidByIndependentApp());
        AbstractC16939etQ abstractC16939etQ = this.EZpvd;
        if (abstractC16939etQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16939etQ = null;
        }
        abstractC16939etQ.EZpvd.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.fel
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18238fed.KWHzl(this.KWHzl, view);
            }
        });
        int i = registerResultTypeKWHzl == null ? -1 : Application.OLrzqt[registerResultTypeKWHzl.ordinal()];
        if (i == 1) {
            AEQbTJ();
            return;
        }
        if (i == 2) {
            KWHzl();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            EZpvd();
        } else {
            RegisterAddressResultData registerAddressResultData3 = this.KWHzl;
            Intrinsics.copydefault(registerAddressResultData3);
            KWHzl(registerAddressResultData3.getSupportRetryRegister());
        }
    }

    public static final void KWHzl(ActivityC18238fed activityC18238fed, android.view.View view) {
        activityC18238fed.finish();
    }

    public final void AEQbTJ() {
        gEmmrt();
        setResultPageUI$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.newSessionWithExtras), "", 6, null, null, null, null, 120, null);
        final OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
        pHH.StateListAnimator.fetchLatestFeatureRestrictionStatus$default(oKComplianceRestrictionService, LifecycleOwnerKt.getLifecycleScope(this), null, new Function1() { // from class: o.fej
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18238fed.AEQbTJ(oKComplianceRestrictionService, this, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 2, null);
    }

    public static final Unit AEQbTJ(OKComplianceRestrictionService oKComplianceRestrictionService, final ActivityC18238fed activityC18238fed, boolean z) {
        OKComplianceRestrictionService.Feature feature = OKComplianceRestrictionService.Feature.EASY_CONNECT;
        if (oKComplianceRestrictionService.OLrzqt(feature) || oKComplianceRestrictionService.AEQbTJ(feature)) {
            setResultPageUI$default(activityC18238fed, C33070mpX.AYXKKw(C13754dXa.FragmentManager.extraCommand), C33070mpX.AYXKKw(C13754dXa.FragmentManager.mayLaunchUrl), 3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), null, new Function0() { // from class: o.fek
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return ActivityC18238fed.gEmmrt(this.OLrzqt);
                }
            }, null, 80, null);
        } else {
            activityC18238fed.AhwBna().EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ActivityC18238fed activityC18238fed) {
        activityC18238fed.finish();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.fed */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setResultPageUI$default(ActivityC18238fed activityC18238fed, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, Function0 function0, Function0 function02, int i2, java.lang.Object obj) {
        activityC18238fed.copydefault(str, str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : function0, (i2 & 64) != 0 ? null : function02);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, Function0<Unit> function0, Function0<Unit> function02) {
        AbstractC16939etQ abstractC16939etQ = this.EZpvd;
        if (abstractC16939etQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16939etQ = null;
        }
        abstractC16939etQ.EZpvd.setTitleText(str);
        AbstractC16939etQ abstractC16939etQ2 = this.EZpvd;
        if (abstractC16939etQ2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16939etQ2 = null;
        }
        abstractC16939etQ2.EZpvd.setSubTitleText(str2);
        AbstractC16939etQ abstractC16939etQ3 = this.EZpvd;
        if (abstractC16939etQ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16939etQ3 = null;
        }
        abstractC16939etQ3.EZpvd.AEQbTJ().setOnClickListener(new View.OnClickListener() { // from class: o.fei
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC18238fed.AEQbTJ(this.EZpvd, view);
            }
        });
        AbstractC16939etQ abstractC16939etQ4 = this.EZpvd;
        if (abstractC16939etQ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16939etQ4 = null;
        }
        abstractC16939etQ4.EZpvd.setStatus(i);
        if (function0 == null) {
            AbstractC16939etQ abstractC16939etQ5 = this.EZpvd;
            if (abstractC16939etQ5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ5 = null;
            }
            C52794wYp c52794wYpCopydefault = abstractC16939etQ5.EZpvd.OLrzqt().copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setVisibility(8);
            }
        } else {
            AbstractC16939etQ abstractC16939etQ6 = this.EZpvd;
            if (abstractC16939etQ6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ6 = null;
            }
            C52794wYp c52794wYpCopydefault2 = abstractC16939etQ6.EZpvd.OLrzqt().copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setVisibility(0);
            }
            AbstractC16939etQ abstractC16939etQ7 = this.EZpvd;
            if (abstractC16939etQ7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ7 = null;
            }
            C52794wYp c52794wYpCopydefault3 = abstractC16939etQ7.EZpvd.OLrzqt().copydefault();
            if (c52794wYpCopydefault3 != null) {
                c52794wYpCopydefault3.setText(str3);
            }
            AbstractC16939etQ abstractC16939etQ8 = this.EZpvd;
            if (abstractC16939etQ8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ8 = null;
            }
            C52794wYp c52794wYpCopydefault4 = abstractC16939etQ8.EZpvd.OLrzqt().copydefault();
            if (c52794wYpCopydefault4 != null) {
                c52794wYpCopydefault4.setOnClickListener(new Activity(c52794wYpCopydefault4, 1000L, function0));
            }
        }
        if (function02 == null) {
            AbstractC16939etQ abstractC16939etQ9 = this.EZpvd;
            if (abstractC16939etQ9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ9 = null;
            }
            C52794wYp c52794wYpAEQbTJ = abstractC16939etQ9.EZpvd.OLrzqt().AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
        } else {
            AbstractC16939etQ abstractC16939etQ10 = this.EZpvd;
            if (abstractC16939etQ10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ10 = null;
            }
            C52794wYp c52794wYpAEQbTJ2 = abstractC16939etQ10.EZpvd.OLrzqt().AEQbTJ();
            if (c52794wYpAEQbTJ2 != null) {
                c52794wYpAEQbTJ2.setVisibility(0);
            }
            AbstractC16939etQ abstractC16939etQ11 = this.EZpvd;
            if (abstractC16939etQ11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ11 = null;
            }
            C52794wYp c52794wYpAEQbTJ3 = abstractC16939etQ11.EZpvd.OLrzqt().AEQbTJ();
            if (c52794wYpAEQbTJ3 != null) {
                c52794wYpAEQbTJ3.setText(str4);
            }
            AbstractC16939etQ abstractC16939etQ12 = this.EZpvd;
            if (abstractC16939etQ12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16939etQ12 = null;
            }
            C52794wYp c52794wYpAEQbTJ4 = abstractC16939etQ12.EZpvd.OLrzqt().AEQbTJ();
            if (c52794wYpAEQbTJ4 != null) {
                c52794wYpAEQbTJ4.setOnClickListener(new ActionBar(c52794wYpAEQbTJ4, 1000L, function02));
            }
        }
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(ActivityC18238fed activityC18238fed, android.view.View view) {
        activityC18238fed.finish();
    }

    /* JADX INFO: renamed from: o.fed$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ Function0 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.fed$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    private final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiUsdgResultActivity$observeRegisterState$1(this, null), 3, null);
    }

    public final void KWHzl() {
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        RegisterAddressResultData registerAddressResultData = this.KWHzl;
        Intrinsics.copydefault(registerAddressResultData);
        final C10854bwM c10854bwMKWHzl = c10948byAValueOf.KWHzl(registerAddressResultData.getCoinId());
        copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.validateRelationship), C33070mpX.AYXKKw(C13754dXa.FragmentManager.newSession), 4, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsCallback), C33070mpX.AYXKKw(C13754dXa.FragmentManager.hijVBL), new Function0() { // from class: o.fem
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18238fed.EZpvd(c10854bwMKWHzl, this);
            }
        }, new Function0() { // from class: o.feq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18238fed.EZpvd(this.AEQbTJ, c10854bwMKWHzl);
            }
        });
    }

    public static final Unit EZpvd(C10854bwM c10854bwM, ActivityC18238fed activityC18238fed) {
        java.lang.String strOcIXYQ;
        if (c10854bwM != null && (strOcIXYQ = c10854bwM.OcIXYQ()) != null) {
            ActivityC21325gxd.Application application = ActivityC21325gxd.Companion;
            RegisterAddressResultData registerAddressResultData = activityC18238fed.KWHzl;
            Intrinsics.copydefault(registerAddressResultData);
            java.lang.String walletId = registerAddressResultData.getWalletId();
            if (walletId == null) {
                walletId = "";
            }
            application.copydefault(activityC18238fed, strOcIXYQ, walletId, c10854bwM.AEQbTJ());
        }
        activityC18238fed.finish();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(ActivityC18238fed activityC18238fed, C10854bwM c10854bwM) {
        RegisterAddressResultData registerAddressResultData = activityC18238fed.KWHzl;
        Intrinsics.copydefault(registerAddressResultData);
        java.lang.String walletId = registerAddressResultData.getWalletId();
        long jFetchVPNInfo = c10854bwM != null ? c10854bwM.fetchVPNInfo() : -1L;
        java.lang.String strOLrzqt = c10854bwM != null ? c10854bwM.OLrzqt() : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        java.lang.String str = strOLrzqt;
        boolean zAuCTel = c10854bwM != null ? c10854bwM.AuCTel() : false;
        RegisterAddressResultData registerAddressResultData2 = activityC18238fed.KWHzl;
        activityC18238fed.copydefault(walletId, jFetchVPNInfo, str, zAuCTel, registerAddressResultData2 != null ? registerAddressResultData2.getAddressType() : null);
        activityC18238fed.finish();
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        setResultPageUI$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.extraCommand), C33070mpX.AYXKKw(C13754dXa.FragmentManager.mayLaunchUrl), 3, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DCJXGO), null, new Function0() { // from class: o.feh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18238fed.djBIcL(this.OLrzqt);
            }
        }, null, 80, null);
    }

    public static final Unit djBIcL(ActivityC18238fed activityC18238fed) {
        activityC18238fed.finish();
        return Unit.INSTANCE;
    }

    public final void KWHzl(final boolean z) {
        setResultPageUI$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.postMessage), C33070mpX.AYXKKw(C13754dXa.FragmentManager.ICustomTabsService), 3, C33070mpX.AYXKKw(z ? C13754dXa.FragmentManager.sendExtras : C13754dXa.FragmentManager.DCJXGO), null, new Function0() { // from class: o.fen
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18238fed.copydefault(z, this);
            }
        }, null, 80, null);
    }

    public static final Unit copydefault(boolean z, ActivityC18238fed activityC18238fed) {
        if (z) {
            activityC18238fed.AEQbTJ();
        } else {
            activityC18238fed.finish();
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str, long j, java.lang.String str2, boolean z, java.lang.Integer num) {
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        if (str == null) {
            return;
        }
        gko.EZpvd(this, this, new TradeParam(str, "wallet_trade", new CoinInfo((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 15, (DefaultConstructorMarker) null), new CoinInfo(C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), str2, z, (java.lang.String) null, 8, (DefaultConstructorMarker) null), "", num, "", true, (java.lang.String) null, (java.lang.Boolean) null, false, (java.lang.String) null, 0, (java.lang.String) null, 16128, (DefaultConstructorMarker) null), new Function1() { // from class: o.fep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18238fed.AEQbTJ(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(ActivityC18238fed activityC18238fed, boolean z) {
        if (z) {
            activityC18238fed.showLoading();
        } else {
            activityC18238fed.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC18256fev, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC18256fev, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC18256fev, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC18256fev, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
