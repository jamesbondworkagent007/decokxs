package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.api.bean.CurvePrice;
import com.okinc.business.defi.api.bean.NewCurvePrice;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail;
import com.okinc.business.defi.biz.net.bean.AddressCoinPriceInfo;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$initFlowListener$1;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetOverviewViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.ActivityC15870eYi;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.C55284xgz;
import o.eSZ;
import o.gIB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15870eYi extends eXN {
    public AbstractC16250egQ AYXKKw;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public AddressTokenAsset valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public java.lang.String AhwBna = "";
    public java.lang.String fetchVPNInfo = "";
    public java.lang.String values = "";
    public java.lang.String AkhnZx = "";

    /* JADX INFO: renamed from: o.eYi$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
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

    public ActivityC15870eYi() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(AddressProfileAssetOverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$special$$inlined$viewModels$default$3
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
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(C19503gEu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetCoinDetailActivity$special$$inlined$viewModels$default$6
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

    /* JADX INFO: renamed from: o.eYi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eYi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull AddressTokenAsset addressTokenAsset) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(addressTokenAsset, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC15870eYi.class);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            intent.putExtra("addressTokenAsset", addressTokenAsset);
            activity.startActivity(intent);
        }
    }

    /* JADX DEBUG: Possible override for method o.eXN.AEQbTJ()V */
    public final AddressProfileAssetOverviewViewModel AEQbTJ() {
        return (AddressProfileAssetOverviewViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C19503gEu AhwBna() {
        return (C19503gEu) this.gEmmrt.getValue();
    }

    @Override // o.eXN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        AddressTokenAsset addressTokenAsset;
        super.onCreate(bundle);
        this.AYXKKw = (AbstractC16250egQ) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.values);
        java.lang.String stringExtra = getIntent().getStringExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AhwBna = stringExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            addressTokenAsset = (AddressTokenAsset) getIntent().getParcelableExtra("addressTokenAsset", AddressTokenAsset.class);
        } else {
            addressTokenAsset = (AddressTokenAsset) getIntent().getParcelableExtra("addressTokenAsset");
        }
        this.valueOf = addressTokenAsset;
        AbstractC16250egQ abstractC16250egQ = null;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        this.AkhnZx = strDbNXlk;
        if (this.valueOf == null || strDbNXlk.length() == 0) {
            finish();
            return;
        }
        final AddressTokenAsset addressTokenAsset2 = this.valueOf;
        if (addressTokenAsset2 != null) {
            C32866mlf.onEvent$default("Web3profile_Tokeninfo_FullPage_View", (TrackChannel[]) null, new Function1() { // from class: o.eYl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC15870eYi.OLrzqt(addressTokenAsset2, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        AbstractC16250egQ abstractC16250egQ2 = this.AYXKKw;
        if (abstractC16250egQ2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ2;
        }
        abstractC16250egQ.AEQbTJ.getRoot().setVisibility(8);
        values();
        isConnected();
        AYXKKw();
        valueOf();
        djBIcL();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC15870eYi.valueOf(this.copydefault);
            }
        });
    }

    public static final Unit OLrzqt(AddressTokenAsset addressTokenAsset, EventParamsList eventParamsList) {
        AddressCoinBalanceDetail addressCoinBalanceDetail;
        java.lang.String chainName;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String symbol = addressTokenAsset.getSymbol();
        EventParamsList.put$default(eventParamsList, "token_symbol", symbol == null ? "" : symbol, false, 4, null);
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails();
        EventParamsList.put$default(eventParamsList, "chain", (coinBalanceDetails == null || (addressCoinBalanceDetail = (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails)) == null || (chainName = addressCoinBalanceDetail.getChainName()) == null) ? "" : chainName, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void valueOf(ActivityC15870eYi activityC15870eYi) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15870eYi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void isConnected() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new ProfileAssetCoinDetailActivity$initFlowListener$1(this, null));
        AhwBna().AhwBna().observe(this, new PendingIntent(new Function1() { // from class: o.eYf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15870eYi.AEQbTJ(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        AhwBna().OLrzqt().observe(this, new PendingIntent(new Function1() { // from class: o.eYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15870eYi.copydefault(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(ActivityC15870eYi activityC15870eYi, java.lang.Boolean bool) {
        AbstractC16250egQ abstractC16250egQ = null;
        if (Intrinsics.EZpvd(activityC15870eYi.AhwBna().EZpvd(), java.lang.Boolean.TRUE)) {
            AbstractC16250egQ abstractC16250egQ2 = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ2;
            }
            abstractC16250egQ.AEQbTJ.OLrzqt.setImageResource(C52761wXj.TaskDescription.DGUQLI);
        } else {
            AbstractC16250egQ abstractC16250egQ3 = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ3;
            }
            abstractC16250egQ.AEQbTJ.OLrzqt.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC15870eYi activityC15870eYi, java.lang.Boolean bool) {
        NewCurvePrice newCurvePriceAYXKKw = activityC15870eYi.AhwBna().AYXKKw();
        C10854bwM c10854bwMCopydefault = activityC15870eYi.AhwBna().copydefault();
        AbstractC16250egQ abstractC16250egQ = null;
        if (c10854bwMCopydefault != null && c10854bwMCopydefault.getNewProxyInstance() && c10854bwMCopydefault.giSNqX()) {
            AbstractC16250egQ abstractC16250egQ2 = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ2;
            }
            abstractC16250egQ.AEQbTJ.getRoot().setVisibility(8);
            return Unit.INSTANCE;
        }
        if (newCurvePriceAYXKKw != null) {
            AbstractC16250egQ abstractC16250egQ3 = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ3;
            }
            AbstractC17124ewq abstractC17124ewq = abstractC16250egQ.AEQbTJ;
            C14786dry c14786dry = abstractC17124ewq.KWHzl;
            java.lang.String price = newCurvePriceAYXKKw.getPrice();
            java.lang.String priceChangePercent = newCurvePriceAYXKKw.getPriceChangePercent();
            boolean hasPercent = newCurvePriceAYXKKw.getHasPercent();
            C10854bwM c10854bwMCopydefault2 = activityC15870eYi.AhwBna().copydefault();
            C14786dry.setCurrentPrice$default(c14786dry, price, priceChangePercent, hasPercent, c10854bwMCopydefault2 != null ? c10854bwMCopydefault2.getNewProxyInstance() : false, 0, 16, null);
            java.util.List<CurvePrice> chartPoints = newCurvePriceAYXKKw.getChartPoints();
            if (C33129mqd.KWHzl((java.util.Collection) chartPoints)) {
                abstractC17124ewq.copydefault.setVisibility(0);
                abstractC17124ewq.copydefault.setChartData(chartPoints, newCurvePriceAYXKKw.getPriceChangePercent());
            } else {
                abstractC17124ewq.copydefault.setVisibility(8);
            }
        } else {
            AbstractC16250egQ abstractC16250egQ4 = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ4;
            }
            AbstractC17124ewq abstractC17124ewq2 = abstractC16250egQ.AEQbTJ;
            C14786dry.setCurrentPrice$default(abstractC17124ewq2.KWHzl, "", "", false, false, 0, 16, null);
            abstractC17124ewq2.copydefault.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eYi$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC15870eYi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC15870eYi activityC15870eYi) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = activityC15870eYi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strDbNXlk;
            java.lang.String strFJNWhG;
            java.lang.String priceChangePercent24h;
            java.lang.String price;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (this.copydefault.AhwBna().AYXKKw() != null) {
                    if (Intrinsics.EZpvd(this.copydefault.AhwBna().EZpvd(), java.lang.Boolean.TRUE)) {
                        C10854bwM c10854bwMCopydefault = this.copydefault.AhwBna().copydefault();
                        if (c10854bwMCopydefault != null) {
                            ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(this.copydefault, new OKDCoinDetailConfig(OKDSourceType.WALLET_SOURCE, java.lang.String.valueOf(c10854bwMCopydefault.fetchVPNInfo()), c10854bwMCopydefault.OLrzqt(), c10854bwMCopydefault.fJNWhG(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
                            return;
                        }
                        return;
                    }
                    gIB.Application application = gIB.Companion;
                    C10854bwM c10854bwMCopydefault2 = this.copydefault.AhwBna().copydefault();
                    long jAhwBna = c10854bwMCopydefault2 != null ? c10854bwMCopydefault2.AhwBna() : 0L;
                    WalletTickerManager.CoinPrice coinPriceAEQbTJ = this.copydefault.AhwBna().AEQbTJ();
                    java.lang.String str = (coinPriceAEQbTJ == null || (price = coinPriceAEQbTJ.getPrice()) == null) ? "" : price;
                    WalletTickerManager.CoinPrice coinPriceAEQbTJ2 = this.copydefault.AhwBna().AEQbTJ();
                    java.lang.String str2 = (coinPriceAEQbTJ2 == null || (priceChangePercent24h = coinPriceAEQbTJ2.getPriceChangePercent24h()) == null) ? "" : priceChangePercent24h;
                    C10854bwM c10854bwMCopydefault3 = this.copydefault.AhwBna().copydefault();
                    java.lang.String str3 = (c10854bwMCopydefault3 == null || (strFJNWhG = c10854bwMCopydefault3.fJNWhG()) == null) ? "" : strFJNWhG;
                    C10854bwM c10854bwMCopydefault4 = this.copydefault.AhwBna().copydefault();
                    application.copydefault(jAhwBna, str, str2, str3, (c10854bwMCopydefault4 == null || (strDbNXlk = c10854bwMCopydefault4.DbNXlk()) == null) ? "" : strDbNXlk, this.copydefault.AhwBna().AYXKKw()).show(this.copydefault.getSupportFragmentManager(), ActivityC21325gxd.class.getSimpleName());
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eYi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ActivityC15870eYi AEQbTJ;
        public final /* synthetic */ C10854bwM EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC15870eYi activityC15870eYi, C10854bwM c10854bwM) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = activityC15870eYi;
            this.EZpvd = c10854bwM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.EZpvd(this.EZpvd);
            }
        }
    }

    /* JADX INFO: renamed from: o.eYi$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ ActivityC15870eYi copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, ActivityC15870eYi activityC15870eYi, java.lang.String str) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = activityC15870eYi;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.eYi$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC15870eYi KWHzl;
        public final /* synthetic */ java.util.List OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC15870eYi activityC15870eYi, java.util.List list) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC15870eYi;
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.gwN.showNetWorkPopView$default(o.gwN, android.view.View, int, java.util.List, int, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C21261gwS c21261gwSOLrzqt = C21256gwN.Companion.OLrzqt(this.KWHzl.AhwBna, this.KWHzl.fetchVPNInfo);
                AbstractC16250egQ abstractC16250egQ = this.KWHzl.AYXKKw;
                AbstractC16250egQ abstractC16250egQ2 = null;
                if (abstractC16250egQ == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ = null;
                }
                int height = abstractC16250egQ.ejfBZ.getHeight();
                int iKWHzl = this.KWHzl.KWHzl(c21261gwSOLrzqt, (java.util.List<C21261gwS>) this.OLrzqt);
                C21256gwN c21256gwN = new C21256gwN(this.KWHzl);
                AbstractC16250egQ abstractC16250egQ3 = this.KWHzl.AYXKKw;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ2 = abstractC16250egQ3;
                }
                c21256gwN.AEQbTJ((64 & 1) != 0 ? null : abstractC16250egQ2.ejfBZ, (64 & 2) != 0 ? 2 : iKWHzl, this.OLrzqt, height, this.KWHzl.new Dialog(), (64 & 32) != 0 ? null : this.KWHzl.new LoaderManager(), (64 & 64) != 0 ? null : null, (64 & 128) != 0 ? false : true, this.KWHzl.new TaskStackBuilder(this.OLrzqt));
            }
        }
    }

    /* JADX INFO: renamed from: o.eYi$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC15870eYi OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC15870eYi activityC15870eYi) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = activityC15870eYi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                AddressTokenAsset addressTokenAsset = this.OLrzqt.valueOf;
                if (addressTokenAsset != null) {
                    ActivityC15886eYy.Companion.KWHzl(this.OLrzqt, addressTokenAsset);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.eYi$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC15870eYi EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC15870eYi activityC15870eYi) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = activityC15870eYi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.eYi$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ ActivityC15870eYi EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, ActivityC15870eYi activityC15870eYi, java.lang.String str) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = activityC15870eYi;
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.copydefault(this.AEQbTJ);
            }
        }
    }

    private final void AYXKKw() {
        AbstractC16250egQ abstractC16250egQ = this.AYXKKw;
        AbstractC16250egQ abstractC16250egQ2 = null;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        android.widget.ImageView imageView = abstractC16250egQ.values;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
        AbstractC16250egQ abstractC16250egQ3 = this.AYXKKw;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ2 = abstractC16250egQ3;
        }
        android.view.View root = abstractC16250egQ2.AEQbTJ.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, this));
    }

    private final void values() {
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails;
        C10854bwM c10854bwMCopydefault;
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails2;
        AddressTokenAsset addressTokenAsset = this.valueOf;
        AbstractC16250egQ abstractC16250egQ = null;
        AddressCoinBalanceDetail addressCoinBalanceDetail = (addressTokenAsset == null || (coinBalanceDetails2 = addressTokenAsset.getCoinBalanceDetails()) == null) ? null : (AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails2);
        if (addressCoinBalanceDetail == null) {
            AbstractC16250egQ abstractC16250egQ2 = this.AYXKKw;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ2;
            }
            abstractC16250egQ.AEQbTJ.getRoot().setVisibility(8);
            return;
        }
        AhwBna().KWHzl(addressCoinBalanceDetail.generateCoinMeta());
        C10854bwM c10854bwMCopydefault2 = AhwBna().copydefault();
        if (c10854bwMCopydefault2 == null || !c10854bwMCopydefault2.getNewProxyInstance() || (c10854bwMCopydefault = AhwBna().copydefault()) == null || !c10854bwMCopydefault.giSNqX()) {
            final AddressCoinPriceInfo coinPriceVo = addressCoinBalanceDetail.getCoinPriceVo();
            if (coinPriceVo != null) {
                AbstractC16250egQ abstractC16250egQ3 = this.AYXKKw;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ3 = null;
                }
                abstractC16250egQ3.AEQbTJ.getRoot().setVisibility(0);
                AbstractC16250egQ abstractC16250egQ4 = this.AYXKKw;
                if (abstractC16250egQ4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ = abstractC16250egQ4;
                }
                abstractC16250egQ.AEQbTJ.getRoot().post(new java.lang.Runnable() { // from class: o.eYs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ActivityC15870eYi.AEQbTJ(this.AEQbTJ, coinPriceVo);
                    }
                });
            }
        } else {
            AbstractC16250egQ abstractC16250egQ5 = this.AYXKKw;
            if (abstractC16250egQ5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ5;
            }
            abstractC16250egQ.AEQbTJ.getRoot().setVisibility(8);
        }
        AddressTokenAsset addressTokenAsset2 = this.valueOf;
        if (addressTokenAsset2 == null || (coinBalanceDetails = addressTokenAsset2.getCoinBalanceDetails()) == null || coinBalanceDetails.size() != 1) {
            return;
        }
        AhwBna().copydefault(AhwBna().copydefault());
        C19503gEu c19503gEuAhwBna = AhwBna();
        long chainIndex = addressCoinBalanceDetail.getChainIndex();
        java.lang.String address = addressCoinBalanceDetail.getAddress();
        c19503gEuAhwBna.EZpvd(chainIndex, address != null ? address : "");
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.dry.setCurrentPrice$default(o.dry, java.lang.String, java.lang.String, boolean, boolean, int, int, java.lang.Object):void */
    public static final void AEQbTJ(ActivityC15870eYi activityC15870eYi, AddressCoinPriceInfo addressCoinPriceInfo) {
        java.lang.String price;
        AbstractC16250egQ abstractC16250egQ = activityC15870eYi.AYXKKw;
        AbstractC16250egQ abstractC16250egQ2 = null;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        android.widget.TextView textView = abstractC16250egQ.AEQbTJ.EZpvd;
        int i = C13754dXa.FragmentManager.AudioAttributesCompatParcelizer;
        AddressTokenAsset addressTokenAsset = activityC15870eYi.valueOf;
        java.lang.String symbol = addressTokenAsset != null ? addressTokenAsset.getSymbol() : null;
        if (symbol == null) {
            symbol = "";
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", symbol))));
        AbstractC16250egQ abstractC16250egQ3 = activityC15870eYi.AYXKKw;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ2 = abstractC16250egQ3;
        }
        C14786dry c14786dry = abstractC16250egQ2.AEQbTJ.KWHzl;
        java.lang.Boolean hasPrice = addressCoinPriceInfo.getHasPrice();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (!Intrinsics.EZpvd(hasPrice, bool) || (price = addressCoinPriceInfo.getPrice()) == null) {
            price = "0";
        }
        java.lang.String priceChangePercent24h = addressCoinPriceInfo.getPriceChangePercent24h();
        boolean zEZpvd = Intrinsics.EZpvd(addressCoinPriceInfo.getHasPercent(), bool);
        C10854bwM c10854bwMCopydefault = activityC15870eYi.AhwBna().copydefault();
        C14786dry.setCurrentPrice$default(c14786dry, price, priceChangePercent24h, zEZpvd, c10854bwMCopydefault != null ? c10854bwMCopydefault.getNewProxyInstance() : false, 0, 16, null);
    }

    public final void djBIcL() {
        java.util.List<AddressCoinBalanceDetail> coinBalanceDetails;
        AbstractC16250egQ abstractC16250egQ;
        AbstractC16250egQ abstractC16250egQ2;
        C21261gwS c21261gwS;
        try {
            AddressTokenAsset addressTokenAsset = this.valueOf;
            if (addressTokenAsset == null || (coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails()) == null) {
                return;
            }
            int i = 0;
            boolean z = coinBalanceDetails.size() > 1;
            AbstractC16250egQ abstractC16250egQ3 = this.AYXKKw;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ3 = null;
            }
            C55244xgL c55244xgL = abstractC16250egQ3.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
            c55244xgL.setVisibility(z ? 0 : 8);
            AbstractC16250egQ abstractC16250egQ4 = this.AYXKKw;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ4 = null;
            }
            abstractC16250egQ4.getFieldNames.setOffscreenPageLimit(1);
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            if (z) {
                arrayList.add(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RatingCompatStyle));
            }
            java.util.Iterator<T> it = coinBalanceDetails.iterator();
            while (it.hasNext()) {
                arrayList.add(((AddressCoinBalanceDetail) it.next()).getTokenType());
            }
            AbstractC16250egQ abstractC16250egQ5 = this.AYXKKw;
            if (abstractC16250egQ5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ5 = null;
            }
            abstractC16250egQ5.getFieldNames.setAdapter(new SharedElementCallback(z, coinBalanceDetails, this, coinBalanceDetails, getSupportFragmentManager(), getLifecycle()));
            if (!z) {
                AbstractC16250egQ abstractC16250egQ6 = this.AYXKKw;
                if (abstractC16250egQ6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ = null;
                } else {
                    abstractC16250egQ = abstractC16250egQ6;
                }
                abstractC16250egQ.ejfBZ.setVisibility(8);
                return;
            }
            AbstractC16250egQ abstractC16250egQ7 = this.AYXKKw;
            if (abstractC16250egQ7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ7 = null;
            }
            abstractC16250egQ7.ejfBZ.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (java.lang.Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                java.lang.String str = (java.lang.String) obj;
                if (i == 0) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
                    java.util.Iterator<T> it2 = coinBalanceDetails.iterator();
                    while (it2.hasNext()) {
                        BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(((AddressCoinBalanceDetail) it2.next()).getCurrencyAmount());
                        if (bigDecimalFARcdN == null) {
                            bigDecimalFARcdN = BigDecimal.ZERO;
                        }
                        Intrinsics.copydefault(bigDecimalFARcdN);
                        bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalFARcdN);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
                    }
                    java.lang.String string = bigDecimalValueOf.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    c21261gwS = new C21261gwS(str, Long.MIN_VALUE, "", "", C54880xYt.formatValuationFromAsset$default(string, null, false, 0, false, 15, null));
                } else {
                    AddressCoinBalanceDetail addressCoinBalanceDetail = coinBalanceDetails.get(i - 1);
                    java.lang.Long coinId = addressCoinBalanceDetail.getCoinId();
                    long jLongValue = coinId != null ? coinId.longValue() : 0L;
                    java.lang.String address = addressCoinBalanceDetail.getAddress();
                    c21261gwS = new C21261gwS(str, jLongValue, address == null ? "" : address, addressCoinBalanceDetail.getChainImageUrl(), C54880xYt.formatValuationFromAsset$default(addressCoinBalanceDetail.getCurrencyAmount(), null, false, 0, false, 15, null));
                }
                arrayList2.add(c21261gwS);
                i++;
            }
            AbstractC16250egQ abstractC16250egQ8 = this.AYXKKw;
            if (abstractC16250egQ8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ8 = null;
            }
            abstractC16250egQ8.getFieldNames.registerOnPageChangeCallback(new PictureInPictureParams(arrayList2, this));
            AbstractC16250egQ abstractC16250egQ9 = this.AYXKKw;
            if (abstractC16250egQ9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ9 = null;
            }
            TabLayout tabLayoutAYXKKw = abstractC16250egQ9.ejfBZ.AYXKKw();
            AbstractC16250egQ abstractC16250egQ10 = this.AYXKKw;
            if (abstractC16250egQ10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            } else {
                abstractC16250egQ2 = abstractC16250egQ10;
            }
            new TabLayoutMediator(tabLayoutAYXKKw, abstractC16250egQ2.getFieldNames, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.eYn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                    ActivityC15870eYi.AEQbTJ(arrayList, this, tab, i2);
                }
            }).attach();
            AEQbTJ(arrayList2);
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "error message :" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o.eYi$SharedElementCallback */
    public static final class SharedElementCallback extends FragmentStateAdapter {
        public final /* synthetic */ java.util.List<AddressCoinBalanceDetail> EZpvd;
        public final /* synthetic */ ActivityC15870eYi KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ java.util.List<AddressCoinBalanceDetail> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedElementCallback(boolean z, java.util.List<AddressCoinBalanceDetail> list, ActivityC15870eYi activityC15870eYi, java.util.List<AddressCoinBalanceDetail> list2, androidx.fragment.app.FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
            this.OLrzqt = z;
            this.copydefault = list;
            this.KWHzl = activityC15870eYi;
            this.EZpvd = list2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.OLrzqt) {
                return this.copydefault.size() + 1;
            }
            return this.copydefault.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (!this.OLrzqt) {
                return this.KWHzl.EZpvd(this.EZpvd.get(i));
            }
            if (i == 0) {
                ActivityC15870eYi activityC15870eYi = this.KWHzl;
                return activityC15870eYi.AEQbTJ(activityC15870eYi.valueOf);
            }
            return this.KWHzl.EZpvd(this.EZpvd.get(i - 1));
        }
    }

    /* JADX INFO: renamed from: o.eYi$PictureInPictureParams */
    public static final class PictureInPictureParams extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ java.util.List<C21261gwS> AEQbTJ;
        public final /* synthetic */ ActivityC15870eYi OLrzqt;

        public PictureInPictureParams(java.util.List<C21261gwS> list, ActivityC15870eYi activityC15870eYi) {
            this.AEQbTJ = list;
            this.OLrzqt = activityC15870eYi;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            java.util.List<AddressCoinBalanceDetail> coinBalanceDetails;
            AddressCoinBalanceDetail addressCoinBalanceDetail;
            super.onPageSelected(i);
            if (i < 0 || i >= this.AEQbTJ.size()) {
                return;
            }
            C21261gwS c21261gwS = this.AEQbTJ.get(i);
            this.OLrzqt.fetchVPNInfo = c21261gwS.AEQbTJ();
            C21256gwN.Companion.AEQbTJ(c21261gwS.EZpvd(), c21261gwS.AEQbTJ(), c21261gwS);
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = 0;
            }
            try {
                AddressTokenAsset addressTokenAsset = this.OLrzqt.valueOf;
                if (addressTokenAsset == null || (coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails()) == null || (addressCoinBalanceDetail = coinBalanceDetails.get(i2)) == null) {
                    return;
                }
                ActivityC15870eYi activityC15870eYi = this.OLrzqt;
                C10854bwM c10854bwMGenerateCoinMeta = addressCoinBalanceDetail.generateCoinMeta();
                activityC15870eYi.AhwBna().KWHzl(c10854bwMGenerateCoinMeta);
                activityC15870eYi.AhwBna().copydefault(c10854bwMGenerateCoinMeta);
                C19503gEu c19503gEuAhwBna = activityC15870eYi.AhwBna();
                long chainIndex = addressCoinBalanceDetail.getChainIndex();
                java.lang.String address = addressCoinBalanceDetail.getAddress();
                if (address == null) {
                    address = "";
                }
                c19503gEuAhwBna.EZpvd(chainIndex, address);
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final void AEQbTJ(java.util.ArrayList arrayList, ActivityC15870eYi activityC15870eYi, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (arrayList.size() == 0 || i >= arrayList.size()) {
            return;
        }
        activityC15870eYi.OLrzqt(tab);
        java.lang.Object obj = arrayList.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        tab.setText((java.lang.String) obj);
    }

    public final androidx.fragment.app.Fragment AEQbTJ(AddressTokenAsset addressTokenAsset) {
        if (addressTokenAsset == null) {
            pUU.copydefault(getTAG(), "creteOverviewFragment addressTokenAsset is null ");
            return new C15619ePa();
        }
        eYA eyaEZpvd = eYA.Companion.EZpvd(addressTokenAsset, this.AhwBna);
        eyaEZpvd.KWHzl(new Function2() { // from class: o.eYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC15870eYi.KWHzl(this.AEQbTJ, (C19419gBr) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        return eyaEZpvd;
    }

    public static final Unit KWHzl(ActivityC15870eYi activityC15870eYi, C19419gBr c19419gBr, int i) {
        Intrinsics.checkNotNullParameter(c19419gBr, "");
        try {
            AbstractC16250egQ abstractC16250egQ = activityC15870eYi.AYXKKw;
            AbstractC16250egQ abstractC16250egQ2 = null;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            if (!abstractC16250egQ.getFieldNames.isFakeDragging()) {
                AbstractC16250egQ abstractC16250egQ3 = activityC15870eYi.AYXKKw;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ2 = abstractC16250egQ3;
                }
                abstractC16250egQ2.getFieldNames.setCurrentItem(i + 1, true);
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    public final androidx.fragment.app.Fragment EZpvd(AddressCoinBalanceDetail addressCoinBalanceDetail) {
        return C15878eYq.Companion.OLrzqt(addressCoinBalanceDetail, this.AhwBna, this.values);
    }

    public final void valueOf() {
        java.lang.String strOLrzqt;
        C10854bwM c10854bwMKWHzl;
        AddressTokenAsset addressTokenAsset = this.valueOf;
        if (addressTokenAsset != null) {
            java.lang.String imageUrl = addressTokenAsset.getImageUrl();
            java.lang.String name = addressTokenAsset.getName();
            if (name == null || (strOLrzqt = C9700baY.OLrzqt(name)) == null) {
                strOLrzqt = "";
            }
            if (imageUrl == null || imageUrl.length() == 0) {
                imageUrl = strOLrzqt;
            }
            this.values = imageUrl;
            AbstractC16250egQ abstractC16250egQ = this.AYXKKw;
            AbstractC16250egQ abstractC16250egQ2 = null;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            abstractC16250egQ.AhwBna.setText(addressTokenAsset.getSymbol());
            C10854bwM c10854bwMCopydefault = AhwBna().copydefault();
            java.util.List<AddressCoinBalanceDetail> coinBalanceDetails = addressTokenAsset.getCoinBalanceDetails();
            if (coinBalanceDetails != null && ((AddressCoinBalanceDetail) CollectionsKt___CollectionsKt.firstOrNull(coinBalanceDetails)) != null) {
                if (!(c10854bwMCopydefault != null && c10854bwMCopydefault.giSNqX() && addressTokenAsset.getCoinBalanceDetails().size() == 1) && (c10854bwMCopydefault == null || !C10854bwM.isXRCToken$default(c10854bwMCopydefault, null, 1, null))) {
                    AbstractC16250egQ abstractC16250egQ3 = this.AYXKKw;
                    if (abstractC16250egQ3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16250egQ3 = null;
                    }
                    if (abstractC16250egQ3.valueOf.getVisibility() != 8) {
                        AbstractC16250egQ abstractC16250egQ4 = this.AYXKKw;
                        if (abstractC16250egQ4 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16250egQ4 = null;
                        }
                        abstractC16250egQ4.valueOf.setVisibility(8);
                    }
                } else {
                    AbstractC16250egQ abstractC16250egQ5 = this.AYXKKw;
                    if (abstractC16250egQ5 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16250egQ5 = null;
                    }
                    abstractC16250egQ5.valueOf.setText(c10854bwMCopydefault != null ? c10854bwMCopydefault.dNCPSb() : null);
                    AbstractC16250egQ abstractC16250egQ6 = this.AYXKKw;
                    if (abstractC16250egQ6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16250egQ6 = null;
                    }
                    if (abstractC16250egQ6.valueOf.getVisibility() != 0) {
                        AbstractC16250egQ abstractC16250egQ7 = this.AYXKKw;
                        if (abstractC16250egQ7 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16250egQ7 = null;
                        }
                        abstractC16250egQ7.valueOf.setVisibility(0);
                    }
                }
            }
            if ((c10854bwMCopydefault != null && c10854bwMCopydefault.call()) || ((c10854bwMCopydefault != null && c10854bwMCopydefault.giSNqX()) || ((c10854bwMCopydefault != null && C10854bwM.isXRCToken$default(c10854bwMCopydefault, null, 1, null)) || (c10854bwMCopydefault != null && c10854bwMCopydefault.AuCTel())))) {
                AbstractC16250egQ abstractC16250egQ8 = this.AYXKKw;
                if (abstractC16250egQ8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ8 = null;
                }
                abstractC16250egQ8.AYXKKw.setVisibility(8);
                AbstractC16250egQ abstractC16250egQ9 = this.AYXKKw;
                if (abstractC16250egQ9 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ9 = null;
                }
                abstractC16250egQ9.gEmmrt.setVisibility(8);
                AEQbTJ((java.lang.String) null, this.values);
            } else {
                java.lang.String strCopydefault = (c10854bwMCopydefault == null || (c10854bwMKWHzl = c10854bwMCopydefault.KWHzl()) == null) ? null : c10854bwMKWHzl.copydefault();
                java.lang.String strCopydefault2 = c10854bwMCopydefault != null ? c10854bwMCopydefault.copydefault() : null;
                if (strCopydefault2 == null) {
                    strCopydefault2 = "";
                }
                if (strCopydefault == null || strCopydefault.length() == 0) {
                    strCopydefault = strCopydefault2;
                }
                AEQbTJ(strCopydefault, this.values);
                java.lang.String strOLrzqt2 = c10854bwMCopydefault != null ? c10854bwMCopydefault.OLrzqt() : null;
                if (strOLrzqt2 == null) {
                    strOLrzqt2 = "";
                }
                AbstractC16250egQ abstractC16250egQ10 = this.AYXKKw;
                if (abstractC16250egQ10 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ10 = null;
                }
                android.widget.TextView textView = abstractC16250egQ10.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(strOLrzqt2.length() > 0 ? 0 : 8);
                AbstractC16250egQ abstractC16250egQ11 = this.AYXKKw;
                if (abstractC16250egQ11 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ11 = null;
                }
                abstractC16250egQ11.AYXKKw.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, strOLrzqt2, false, 2, null));
                AbstractC16250egQ abstractC16250egQ12 = this.AYXKKw;
                if (abstractC16250egQ12 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ12 = null;
                }
                android.widget.TextView textView2 = abstractC16250egQ12.AYXKKw;
                textView2.setOnClickListener(new AssistContent(textView2, 1000L, this, strOLrzqt2));
                AbstractC16250egQ abstractC16250egQ13 = this.AYXKKw;
                if (abstractC16250egQ13 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ13 = null;
                }
                android.widget.ImageView imageView = abstractC16250egQ13.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(strOLrzqt2.length() <= 0 ? 8 : 0);
                AbstractC16250egQ abstractC16250egQ14 = this.AYXKKw;
                if (abstractC16250egQ14 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ2 = abstractC16250egQ14;
                }
                android.widget.ImageView imageView2 = abstractC16250egQ2.gEmmrt;
                imageView2.setOnClickListener(new VoiceInteractor(imageView2, 1000L, this, strOLrzqt2));
            }
            gEmmrt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.lang.String str) {
        AbstractActivityC33041mov mActivity = getMActivity();
        if (!(!mActivity.isFinishing())) {
            mActivity = null;
        }
        if (mActivity != null) {
            java.lang.Object systemService = mActivity.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, str));
            C19595gIe.Companion.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.GQzpsZ), str).KWHzl(mActivity);
        }
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        AbstractC16250egQ abstractC16250egQ = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            C5335Nt c5335NtEZpvd = Glide.copydefault((FragmentActivity) this).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(getApplicationContext(), 1.0f, C33070mpX.copydefault(C52761wXj.Activity.copydefault), false, 8, null));
            AbstractC16250egQ abstractC16250egQ2 = this.AYXKKw;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            }
            c5335NtEZpvd.EZpvd(abstractC16250egQ2.OLrzqt);
        }
        C5335Nt c5335NtEZpvd2 = Glide.copydefault((FragmentActivity) this).EZpvd(str2).KWHzl(C52761wXj.TaskDescription.aHXSQp).copydefault(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext()));
        AbstractC16250egQ abstractC16250egQ3 = this.AYXKKw;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ3;
        }
        c5335NtEZpvd2.EZpvd(abstractC16250egQ.KWHzl);
    }

    public final void gEmmrt() {
        C10854bwM c10854bwMCopydefault = AhwBna().copydefault();
        AbstractC16250egQ abstractC16250egQ = null;
        java.lang.Integer numDHguZz = c10854bwMCopydefault != null ? c10854bwMCopydefault.dHguZz() : null;
        if (numDHguZz != null && numDHguZz.intValue() == 0) {
            AbstractC16250egQ abstractC16250egQ2 = this.AYXKKw;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            }
            abstractC16250egQ2.djBIcL.setVisibility(0);
            AbstractC16250egQ abstractC16250egQ3 = this.AYXKKw;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ3 = null;
            }
            abstractC16250egQ3.EZpvd.setVisibility(8);
            AbstractC16250egQ abstractC16250egQ4 = this.AYXKKw;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ4 = null;
            }
            abstractC16250egQ4.AuCTel.setVisibility(8);
            AbstractC16250egQ abstractC16250egQ5 = this.AYXKKw;
            if (abstractC16250egQ5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ5;
            }
            android.widget.ImageView imageView = abstractC16250egQ.djBIcL;
            imageView.setOnClickListener(new Application(imageView, 1000L, this, c10854bwMCopydefault));
            return;
        }
        AbstractC16250egQ abstractC16250egQ6 = this.AYXKKw;
        if (abstractC16250egQ6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ6 = null;
        }
        abstractC16250egQ6.EZpvd.setVisibility(0);
        AbstractC16250egQ abstractC16250egQ7 = this.AYXKKw;
        if (abstractC16250egQ7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ7 = null;
        }
        abstractC16250egQ7.djBIcL.setVisibility(8);
        AbstractC16250egQ abstractC16250egQ8 = this.AYXKKw;
        if (abstractC16250egQ8 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ8 = null;
        }
        abstractC16250egQ8.AuCTel.setVisibility(8);
        AbstractC16250egQ abstractC16250egQ9 = this.AYXKKw;
        if (abstractC16250egQ9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ9;
        }
        android.widget.ImageView imageView2 = abstractC16250egQ.EZpvd;
        imageView2.setOnClickListener(new StateListAnimator(imageView2, 1000L, this));
    }

    public final void EZpvd(final C10854bwM c10854bwM) {
        final C54997xbd c54997xbd = new C54997xbd(getMActivity(), null, 0, 0, 14, null);
        RecyclerView recyclerView = new RecyclerView(getMActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setBackgroundResource(C13754dXa.Activity.AEQbTJ);
        AbstractC16250egQ abstractC16250egQ = null;
        recyclerView.setPadding(0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C19414gBm.class, new C19417gBp(new Function1() { // from class: o.eYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15870eYi.EZpvd(this.AEQbTJ, c54997xbd, c10854bwM, (C19414gBm) obj);
            }
        }));
        C33064mpR.OLrzqt(c59534zip, (java.util.List<? extends java.lang.Object>) yDY.gEmmrt(new C19414gBm(C52761wXj.TaskDescription.GGlJim, C13754dXa.FragmentManager.receiveFile, 0, true), new C19414gBm(C52761wXj.TaskDescription.UPzgla, C13754dXa.FragmentManager.requestPostMessageChannelWithExtras, 1, !SPUtils.getBoolean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.AhwBna())), false, "coin_report"))));
        recyclerView.setAdapter(c59534zip);
        c54997xbd.EZpvd(recyclerView);
        AbstractC16250egQ abstractC16250egQ2 = this.AYXKKw;
        if (abstractC16250egQ2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ2;
        }
        c54997xbd.showAsDropDown(abstractC16250egQ.djBIcL);
    }

    public static final Unit EZpvd(ActivityC15870eYi activityC15870eYi, C54997xbd c54997xbd, C10854bwM c10854bwM, C19414gBm c19414gBm) {
        Intrinsics.checkNotNullParameter(c19414gBm, "");
        int iAEQbTJ = c19414gBm.AEQbTJ();
        if (iAEQbTJ == 0) {
            AddressTokenAsset addressTokenAsset = activityC15870eYi.valueOf;
            if (addressTokenAsset != null) {
                ActivityC15886eYy.Companion.KWHzl(activityC15870eYi, addressTokenAsset);
            }
            c54997xbd.dismiss();
        } else if (iAEQbTJ == 1) {
            if (c19414gBm.KWHzl()) {
                activityC15870eYi.AEQbTJ(c10854bwM, true);
            }
            c54997xbd.dismiss();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final C10854bwM c10854bwM, final boolean z) {
        eSZ.ActionBar actionBar = eSZ.Companion;
        java.lang.String str = this.AkhnZx;
        eSZ eszEZpvd = actionBar.EZpvd(1, c10854bwM.DbNXlk(), c10854bwM.fJNWhG(), c10854bwM, str, null, new Function0() { // from class: o.eYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15870eYi.AEQbTJ(z, this, c10854bwM);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        eszEZpvd.show(supportFragmentManager);
    }

    public static final Unit AEQbTJ(boolean z, ActivityC15870eYi activityC15870eYi, C10854bwM c10854bwM) {
        if (!z) {
            AbstractC16250egQ abstractC16250egQ = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            abstractC16250egQ.AuCTel.setEnabled(false);
            AbstractC16250egQ abstractC16250egQ2 = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            }
            abstractC16250egQ2.AuCTel.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
        }
        SPUtils.put(java.lang.String.valueOf(c10854bwM.AhwBna()), java.lang.Boolean.TRUE, "coin_report");
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.view.View decorView = activityC15870eYi.getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(activityC15870eYi, (android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyDayNight));
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.isConnected(3);
            c55284xgzAEQbTJ.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyDayNight));
            c55284xgzAEQbTJ.EZpvd(new View.OnClickListener() { // from class: o.eYe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC15870eYi.OLrzqt(c55284xgzAEQbTJ, view);
                }
            });
        }
        android.view.View viewAkhnZx = c55284xgzAEQbTJ != null ? c55284xgzAEQbTJ.AkhnZx() : null;
        if (viewAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams = viewAkhnZx.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, C55298xhM.OLrzqt(58, (android.content.Context) activityC15870eYi));
            viewAkhnZx.setLayoutParams(marginLayoutParams);
        }
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public final void OLrzqt(TabLayout.Tab tab) {
        try {
            TabLayout.TabView tabView = tab.view;
            Intrinsics.checkNotNullExpressionValue(tabView, "");
            java.lang.reflect.Field declaredField = tabView.getClass().getDeclaredField("defaultMaxLines");
            declaredField.setAccessible(true);
            declaredField.setInt(tabView, 1);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: o.eYi$FragmentManager */
    public static final class FragmentManager implements ViewTreeObserver.OnPreDrawListener {
        public FragmentManager() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            android.view.View childAt;
            try {
                AbstractC16250egQ abstractC16250egQ = ActivityC15870eYi.this.AYXKKw;
                AbstractC16250egQ abstractC16250egQ2 = null;
                if (abstractC16250egQ == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ = null;
                }
                int i = 0;
                android.view.View childAt2 = abstractC16250egQ.ejfBZ.AYXKKw().getChildAt(0);
                android.view.ViewGroup viewGroup = childAt2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt2 : null;
                final Ref.IntRef intRef = new Ref.IntRef();
                int childCount = viewGroup != null ? viewGroup.getChildCount() : 0;
                for (int i2 = 0; i2 < childCount; i2++) {
                    intRef.element += (viewGroup == null || (childAt = viewGroup.getChildAt(i2)) == null) ? 0 : childAt.getWidth();
                }
                AbstractC16250egQ abstractC16250egQ3 = ActivityC15870eYi.this.AYXKKw;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ3 = null;
                }
                Group group = abstractC16250egQ3.isConnected;
                if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(intRef.element + C55298xhM.dp2px$default(48.0f, null, 1, null)), java.lang.Integer.valueOf(C33570myu.AEQbTJ()))) {
                    i = 8;
                }
                group.setVisibility(i);
                AbstractC16250egQ abstractC16250egQ4 = ActivityC15870eYi.this.AYXKKw;
                if (abstractC16250egQ4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ4 = null;
                }
                android.widget.ImageView imageViewOLrzqt = abstractC16250egQ4.AkhnZx.OLrzqt();
                imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.UrRBLY);
                imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                AbstractC16250egQ abstractC16250egQ5 = ActivityC15870eYi.this.AYXKKw;
                if (abstractC16250egQ5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ5 = null;
                }
                abstractC16250egQ5.ejfBZ.getViewTreeObserver().removeOnPreDrawListener(this);
                if (C55296xhK.OLrzqt(ActivityC15870eYi.this)) {
                    AbstractC16250egQ abstractC16250egQ6 = ActivityC15870eYi.this.AYXKKw;
                    if (abstractC16250egQ6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16250egQ6 = null;
                    }
                    if (abstractC16250egQ6.ejfBZ.gEmmrt() == 0) {
                        AbstractC16250egQ abstractC16250egQ7 = ActivityC15870eYi.this.AYXKKw;
                        if (abstractC16250egQ7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16250egQ2 = abstractC16250egQ7;
                        }
                        ViewPager2 viewPager2 = abstractC16250egQ2.getFieldNames;
                        final ActivityC15870eYi activityC15870eYi = ActivityC15870eYi.this;
                        viewPager2.postDelayed(new java.lang.Runnable() { // from class: o.eYr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC15870eYi.FragmentManager.copydefault(activityC15870eYi, intRef);
                            }
                        }, 50L);
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(ActivityC15870eYi.this.getTAG(), "Error in onPreDraw: " + e.getMessage(), e);
            }
            return true;
        }

        public static final void copydefault(ActivityC15870eYi activityC15870eYi, Ref.IntRef intRef) {
            AbstractC16250egQ abstractC16250egQ = activityC15870eYi.AYXKKw;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            C55244xgL c55244xgL = abstractC16250egQ.ejfBZ;
            int i = intRef.element;
            c55244xgL.scrollTo(i + i, 0);
        }
    }

    private final void AEQbTJ(java.util.List<C21261gwS> list) {
        AbstractC16250egQ abstractC16250egQ = null;
        try {
            AbstractC16250egQ abstractC16250egQ2 = this.AYXKKw;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            }
            abstractC16250egQ2.ejfBZ.getViewTreeObserver().addOnPreDrawListener(new FragmentManager());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error setting icon more show: " + e.getMessage(), e);
        }
        AbstractC16250egQ abstractC16250egQ3 = this.AYXKKw;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ3;
        }
        C54989xbV c54989xbV = abstractC16250egQ.AkhnZx;
        c54989xbV.setOnClickListener(new Fragment(c54989xbV, 1000L, this, list));
    }

    /* JADX INFO: renamed from: o.eYi$Dialog */
    public static final class Dialog implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            AbstractC16250egQ abstractC16250egQ = ActivityC15870eYi.this.AYXKKw;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            android.widget.ImageView imageViewOLrzqt = abstractC16250egQ.AkhnZx.OLrzqt();
            imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.UrRBLY);
            imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        }
    }

    /* JADX INFO: renamed from: o.eYi$LoaderManager */
    public static final class LoaderManager implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            AbstractC16250egQ abstractC16250egQ = ActivityC15870eYi.this.AYXKKw;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            android.widget.ImageView imageViewOLrzqt = abstractC16250egQ.AkhnZx.OLrzqt();
            imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.QIZEnU);
            imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        }
    }

    /* JADX INFO: renamed from: o.eYi$TaskStackBuilder */
    public static final class TaskStackBuilder implements Function1<C21261gwS, Unit> {
        public final /* synthetic */ java.util.List<C21261gwS> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(java.util.List<C21261gwS> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(C21261gwS c21261gwS) {
            KWHzl(c21261gwS);
            return Unit.INSTANCE;
        }

        public final void KWHzl(C21261gwS c21261gwS) {
            Intrinsics.checkNotNullParameter(c21261gwS, "");
            try {
                if (!ActivityC15870eYi.this.isFinishing() && !ActivityC15870eYi.this.isDestroyed()) {
                    int iKWHzl = ActivityC15870eYi.this.KWHzl(c21261gwS, this.KWHzl);
                    if (iKWHzl >= 0) {
                        AbstractC16250egQ abstractC16250egQ = ActivityC15870eYi.this.AYXKKw;
                        AbstractC16250egQ abstractC16250egQ2 = null;
                        if (abstractC16250egQ == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16250egQ = null;
                        }
                        if (abstractC16250egQ.getFieldNames.isFakeDragging()) {
                            return;
                        }
                        AbstractC16250egQ abstractC16250egQ3 = ActivityC15870eYi.this.AYXKKw;
                        if (abstractC16250egQ3 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16250egQ2 = abstractC16250egQ3;
                        }
                        abstractC16250egQ2.getFieldNames.setCurrentItem(iKWHzl, true);
                        return;
                    }
                    return;
                }
                pUU.valueOf(ActivityC15870eYi.this.getTAG(), "Activity is finishing or destroyed, not setting view pager item");
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(ActivityC15870eYi.this.getTAG(), "Error setting view pager item from popup: " + e.getMessage(), e);
            }
        }
    }

    public final int KWHzl(C21261gwS c21261gwS, java.util.List<C21261gwS> list) {
        try {
            int i = 0;
            for (java.lang.Object obj : list) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C21261gwS c21261gwS2 = (C21261gwS) obj;
                if (i != 0 && Intrinsics.EZpvd((java.lang.Object) c21261gwS.AEQbTJ(), (java.lang.Object) c21261gwS2.AEQbTJ())) {
                    return i;
                }
                i++;
            }
            return 0;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error getting cache item position: " + e.getMessage(), e);
            return 0;
        }
    }

    @Override // o.eXN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.eXN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.eXN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.eXN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
