package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.bsc.cryptolist.BuySellCryptoListFragment;
import com.okinc.buysell.ui.bsc.fragment.master.BSCMasterFragmentV3;
import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okx.paymentapi.presentation.BSCLevel;
import com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.DexTokenParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lAG extends lAO {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public AbstractC31402ltO AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public BuySellCryptoListFragment KWHzl;
    public final android.util.SparseArray<C33510mxn> copydefault = Companion.OLrzqt();

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TargetTab.values().length];
            try {
                iArr[TargetTab.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TargetTab.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetTab.CONVERT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public android.util.SparseArray<C33510mxn> getSwitchThemePairs() {
        return this.copydefault;
    }

    public lAG() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(lAP.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.activity.BSCHostActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.activity.BSCHostActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.activity.BSCHostActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.lAO.AEQbTJ()V */
    public final lAP AEQbTJ() {
        return (lAP) this.EZpvd.getValue();
    }

    @Override // o.lAO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).KWHzl(this, UKBannerType.APPROVED_6OCT23);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        androidx.fragment.app.Fragment fragmentKWHzl;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        if (intent.getBooleanExtra("is_from_l2_result_page", false)) {
            BuySellConvertParameters buySellConvertParameters = (BuySellConvertParameters) intent.getParcelableExtra("buy_sell_convert_params");
            if (buySellConvertParameters == null) {
                buySellConvertParameters = new BuySellConvertParameters(OKPaymentSource.UNKNOWN_SOURCE, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
            }
            buySellConvertParameters.copydefault("");
            buySellConvertParameters.copydefault((DexTokenParameters) null);
            int i = Activity.OLrzqt[buySellConvertParameters.isConnected().ordinal()];
            if (i == 1) {
                fragmentKWHzl = KWHzl(buySellConvertParameters);
            } else if (i == 2) {
                fragmentKWHzl = EZpvd(buySellConvertParameters);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.KWHzl = null;
                fragmentKWHzl = BSCMasterFragmentV3.Companion.EZpvd(BSCLevel.LEVEL2, buySellConvertParameters);
            }
            getSupportFragmentManager().popBackStack((java.lang.String) null, 1);
            getSupportFragmentManager().beginTransaction().replace(C31351lsQ.Application.iUnTnt, fragmentKWHzl).commit();
        }
    }

    @Override // o.lAO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        final java.lang.String str;
        androidx.fragment.app.Fragment fragmentEZpvd;
        BuySellCryptoListFragment.Companion.ListType listType;
        java.lang.Integer numKWHzl = C33503mxg.KWHzl(this.copydefault);
        if (numKWHzl != null) {
            setTheme(numKWHzl.intValue());
        }
        super.onCreate(bundle);
        AbstractC31402ltO abstractC31402ltOAEQbTJ = AbstractC31402ltO.AEQbTJ(getLayoutInflater());
        this.AEQbTJ = abstractC31402ltOAEQbTJ;
        if (abstractC31402ltOAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            abstractC31402ltOAEQbTJ = null;
        }
        setContentView(abstractC31402ltOAEQbTJ.getRoot());
        final BuySellConvertParameters buySellConvertParameters = (BuySellConvertParameters) getIntent().getParcelableExtra("buy_sell_convert_params");
        if (buySellConvertParameters == null) {
            buySellConvertParameters = new BuySellConvertParameters(OKPaymentSource.UNKNOWN_SOURCE, null, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_POSITION_TYPE, null);
        }
        int i = Activity.OLrzqt[buySellConvertParameters.isConnected().ordinal()];
        if (i == 1) {
            str = "buy";
        } else if (i == 2) {
            str = "sell";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "convert";
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("OEXBSC_Entrance_FullPage_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lAK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lAG.OLrzqt(str, (EventParamsList) obj);
            }
        });
        TargetTab targetTabIsConnected = buySellConvertParameters.isConnected();
        TargetTab targetTab = TargetTab.BUY;
        boolean z = false;
        boolean z2 = targetTabIsConnected == targetTab || buySellConvertParameters.isConnected() == TargetTab.SELL;
        if (buySellConvertParameters.copydefault().length() == 0 && buySellConvertParameters.AhwBna().length() == 0 && buySellConvertParameters.AEQbTJ() == null) {
            z = true;
        }
        boolean zAEQbTJ = C30327lUg.AEQbTJ(ABTestFeatureFlag.BSC_CRYPTO_LIST_L2);
        if (z2 && zAEQbTJ && z) {
            if (buySellConvertParameters.isConnected() == targetTab) {
                listType = BuySellCryptoListFragment.Companion.ListType.BUY;
            } else {
                listType = BuySellCryptoListFragment.Companion.ListType.SELL;
            }
            if (listType == BuySellCryptoListFragment.Companion.ListType.BUY) {
                fragmentEZpvd = KWHzl(buySellConvertParameters);
            } else {
                fragmentEZpvd = EZpvd(buySellConvertParameters);
            }
        } else {
            this.KWHzl = null;
            fragmentEZpvd = BSCMasterFragmentV3.Companion.EZpvd(BSCLevel.LEVEL2, buySellConvertParameters);
        }
        getSupportFragmentManager().popBackStack((java.lang.String) null, 1);
        getSupportFragmentManager().beginTransaction().replace(C31351lsQ.Application.iUnTnt, fragmentEZpvd).commit();
        mHA.OLrzqt.copydefault(AEQbTJ().copydefault(), this, new Function1() { // from class: o.lAL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lAG.copydefault(this.EZpvd, buySellConvertParameters, (Unit) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bsc_entry", str, true);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(lAG lag, BuySellConvertParameters buySellConvertParameters, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        lag.getSupportFragmentManager().popBackStack((java.lang.String) null, 1);
        lag.getSupportFragmentManager().beginTransaction().replace(C31351lsQ.Application.iUnTnt, lag.KWHzl(buySellConvertParameters)).commit();
        return Unit.INSTANCE;
    }

    public final BuySellCryptoListFragment KWHzl(final BuySellConvertParameters buySellConvertParameters) {
        final BuySellCryptoListFragment buySellCryptoListFragmentAEQbTJ = BuySellCryptoListFragment.Companion.AEQbTJ("", "", false);
        buySellCryptoListFragmentAEQbTJ.EZpvd(new Function1() { // from class: o.lAJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lAG.copydefault(buySellConvertParameters, this, buySellCryptoListFragmentAEQbTJ, (CurrencyToken) obj);
            }
        });
        this.KWHzl = buySellCryptoListFragmentAEQbTJ;
        return buySellCryptoListFragmentAEQbTJ;
    }

    public static final Unit copydefault(BuySellConvertParameters buySellConvertParameters, lAG lag, BuySellCryptoListFragment buySellCryptoListFragment, CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        buySellConvertParameters.copydefault(currencyToken.getCurrency());
        buySellConvertParameters.copydefault(TargetTab.BUY);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
            buySellConvertParameters.copydefault(new DexTokenParameters(currencyToken.getDexInfo().getChainIndex(), currencyToken.getDexInfo().getTokenAddress()));
            buySellConvertParameters.AEQbTJ(new BuySellBaseCurrencyInfo(currencyToken.getCurrency(), currencyToken.getIcon(), currencyToken.getIcon(), currencyToken.getDexInfo().getChainLogo(), (java.lang.String) null, 16, (DefaultConstructorMarker) null));
        } else {
            buySellConvertParameters.copydefault((DexTokenParameters) null);
            buySellConvertParameters.AEQbTJ(new BuySellBaseCurrencyInfo(currencyToken.getCurrency(), currencyToken.getIcon(), currencyToken.getIcon(), (java.lang.String) null, (java.lang.String) null, 24, (DefaultConstructorMarker) null));
        }
        BuySellCryptoListFragment buySellCryptoListFragment2 = lag.KWHzl;
        if (buySellCryptoListFragment2 != null) {
            lag.getSupportFragmentManager().beginTransaction().hide(buySellCryptoListFragment2).setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).add(C31351lsQ.Application.iUnTnt, BSCMasterFragmentV3.Companion.EZpvd(BSCLevel.LEVEL2, buySellConvertParameters)).addToBackStack("BuyCryptoListFragment").commit();
        } else {
            lag.getSupportFragmentManager().beginTransaction().setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).add(C31351lsQ.Application.iUnTnt, BSCMasterFragmentV3.Companion.EZpvd(BSCLevel.LEVEL2, buySellConvertParameters)).addToBackStack("BuyCryptoListFragment").commit();
        }
        return Unit.INSTANCE;
    }

    public final BuySellCryptoListFragment EZpvd(final BuySellConvertParameters buySellConvertParameters) {
        final BuySellCryptoListFragment buySellCryptoListFragmentEZpvd = BuySellCryptoListFragment.Companion.EZpvd("", "", C33129mqd.KWHzl((java.util.Collection) buySellConvertParameters.fetchVPNInfo()), false);
        buySellCryptoListFragmentEZpvd.EZpvd(new Function1() { // from class: o.lAM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lAG.OLrzqt(buySellConvertParameters, this, buySellCryptoListFragmentEZpvd, (CurrencyToken) obj);
            }
        });
        this.KWHzl = buySellCryptoListFragmentEZpvd;
        return buySellCryptoListFragmentEZpvd;
    }

    public static final Unit OLrzqt(BuySellConvertParameters buySellConvertParameters, lAG lag, BuySellCryptoListFragment buySellCryptoListFragment, CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        buySellConvertParameters.copydefault(currencyToken.getCurrency());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) currencyToken.getDexInfo().getUniqueId())) {
            buySellConvertParameters.copydefault(new DexTokenParameters(currencyToken.getDexInfo().getChainIndex(), currencyToken.getDexInfo().getTokenAddress()));
            buySellConvertParameters.AEQbTJ(new BuySellBaseCurrencyInfo(currencyToken.getCurrency(), currencyToken.getIcon(), currencyToken.getIcon(), currencyToken.getDexInfo().getChainLogo(), currencyToken.getAvailableBalance()));
        } else {
            buySellConvertParameters.copydefault((DexTokenParameters) null);
            buySellConvertParameters.AEQbTJ(new BuySellBaseCurrencyInfo(currencyToken.getCurrency(), currencyToken.getIcon(), currencyToken.getIcon(), (java.lang.String) null, currencyToken.getAvailableBalance(), 8, (DefaultConstructorMarker) null));
        }
        BuySellCryptoListFragment buySellCryptoListFragment2 = lag.KWHzl;
        if (buySellCryptoListFragment2 != null) {
            lag.getSupportFragmentManager().beginTransaction().hide(buySellCryptoListFragment2).setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).add(C31351lsQ.Application.iUnTnt, BSCMasterFragmentV3.Companion.EZpvd(BSCLevel.LEVEL2, buySellConvertParameters)).addToBackStack("SellCryptoListFragment").commit();
        } else {
            lag.getSupportFragmentManager().beginTransaction().setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).add(C31351lsQ.Application.iUnTnt, BSCMasterFragmentV3.Companion.EZpvd(BSCLevel.LEVEL2, buySellConvertParameters)).addToBackStack("SellCryptoListFragment").commit();
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lAG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void goToBSCLevel2$default(TaskDescription taskDescription, android.content.Context context, BuySellConvertParameters buySellConvertParameters, boolean z, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            taskDescription.KWHzl(context, buySellConvertParameters, z);
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull BuySellConvertParameters buySellConvertParameters, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(buySellConvertParameters, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) lAG.class);
            intent.putExtra("buy_sell_convert_params", buySellConvertParameters);
            if (z) {
                intent.putExtra("is_from_l2_result_page", true);
                intent.addFlags(67108864);
            }
            context.startActivity(intent);
        }

        public final android.util.SparseArray<C33510mxn> OLrzqt() {
            return ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).AhwBna() ? C33503mxg.OLrzqt() : C33503mxg.AEQbTJ();
        }
    }

    @Override // o.lAO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lAO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lAO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
