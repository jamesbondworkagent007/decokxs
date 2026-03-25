package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
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
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.core.segwit.bean.AddressData;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$handleTonTips$1;
import com.okinc.business.defi.wallet.tx.history.CoinDetailFragmentNew;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.invest_api.bean.DeFiApyDataInfoData;
import com.okinc.components.track.TrackChannel;
import com.okinc.core.util.SPUtils;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC21325gxd;
import o.ActivityC9901beN;
import o.C10407bnq;
import o.C10525bqB;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.C52812wZg;
import o.C55284xgz;
import o.eSZ;
import o.gAM;
import o.gIB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gxd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC21325gxd extends AbstractActivityC33013moT implements WalletUpdateWorker.TaskDescription, gBT {
    public static boolean EZpvd;
    public static boolean OLrzqt;
    public boolean AuCTel;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fJNWhG;
    public AbstractC16250egQ fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public boolean isConnected;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final android.os.Handler AkhnZx = new android.os.Handler(android.os.Looper.getMainLooper());
    public final C8301bAD copydefault = new C8301bAD();
    public java.lang.String getFieldNames = "";
    public java.lang.String fIwbmz = "";
    public long AEQbTJ = Long.MIN_VALUE;
    public java.lang.String AhwBna = "";
    public java.lang.String valueOf = "";
    public final boolean values = C14687dqE.OLrzqt.isConnected();
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.gxX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC21325gxd.isConnected();
        }
    });
    public java.util.ArrayList<C10525bqB> AYXKKw = new java.util.ArrayList<>();
    public java.util.List<C21261gwS> djBIcL = yDY.AhwBna();

    /* JADX INFO: renamed from: o.gxd$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
    public void EZpvd(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
    }

    public ActivityC21325gxd() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(C19503gEu.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$3
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
        this.ejfBZ = new ViewModelLazy(C56524yIo.AEQbTJ(gEV.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$6
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
        this.fJNWhG = new ViewModelLazy(C56524yIo.AEQbTJ(C19443gCo.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$9
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
        this.fARcdN = new ViewModelLazy(C56524yIo.AEQbTJ(gFG.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tx.history.CoinDetailActivity$special$$inlined$viewModels$default$12
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
    public final C19503gEu values() {
        return (C19503gEu) this.gEmmrt.getValue();
    }

    public final gEV AEQbTJ() {
        return (gEV) this.ejfBZ.getValue();
    }

    public final C19443gCo AYXKKw() {
        return (C19443gCo) this.fJNWhG.getValue();
    }

    private final InterfaceC25424iwU DbNXlk() {
        return (InterfaceC25424iwU) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC25424iwU isConnected() {
        return (InterfaceC25424iwU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25424iwU.class));
    }

    public final gFG EZpvd() {
        return (gFG) this.fARcdN.getValue();
    }

    /* JADX INFO: renamed from: o.gxd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gxd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void OLrzqt(boolean z) {
            ActivityC21325gxd.OLrzqt = z;
        }

        public final boolean AEQbTJ() {
            return ActivityC21325gxd.EZpvd;
        }

        public final void KWHzl(boolean z) {
            ActivityC21325gxd.EZpvd = z;
        }

        public static /* synthetic */ void start$default(Application application, android.app.Activity activity, java.lang.String str, java.lang.String str2, long j, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                j = Long.MIN_VALUE;
            }
            application.copydefault(activity, str, str2, j);
        }

        public final void copydefault(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, long j) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC21325gxd.class);
            intent.putExtra("metaId", str);
            intent.putExtra("walletId", str2);
            intent.putExtra("chain_id", j);
            activity.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.fetchVPNInfo = (AbstractC16250egQ) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.values);
        } catch (java.lang.Exception e) {
            C10856bwO.copydefault(getTAG(), 0, "setContentView error", e);
            finish();
        }
        this.AEQbTJ = getIntent().getLongExtra("chain_id", Long.MIN_VALUE);
        java.lang.String stringExtra = getIntent().getStringExtra("metaId");
        if (stringExtra == null) {
            return;
        }
        this.fIwbmz = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("walletId");
        if (stringExtra2 == null) {
            return;
        }
        this.getFieldNames = stringExtra2;
        this.isConnected = C10953byF.KWHzl.EZpvd(this.fIwbmz) < 0;
        AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        abstractC16250egQ.values.setOnClickListener(new View.OnClickListener() { // from class: o.gxk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC21325gxd.OLrzqt(this.copydefault, view);
            }
        });
        if (this.isConnected) {
            djBIcL();
        } else {
            valueOf();
            fetchVPNInfo();
            gEmmrt();
            WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).KWHzl(this);
        }
        AhwBna();
        C32866mlf.onEvent$default("CurrencyDetailsPage_Btm_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.gxd$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ ActivityC21325gxd OLrzqt;
        public final /* synthetic */ C10854bwM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC21325gxd activityC21325gxd, C10854bwM c10854bwM, int i) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = activityC21325gxd;
            this.copydefault = c10854bwM;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(this.copydefault, this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.gxd$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC21325gxd OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j, ActivityC21325gxd activityC21325gxd, java.lang.String str) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = activityC21325gxd;
            this.AEQbTJ = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(this.AEQbTJ);
            }
        }
    }

    /* JADX INFO: renamed from: o.gxd$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC21325gxd EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C10854bwM copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ActivityC21325gxd activityC21325gxd, C10854bwM c10854bwM, int i) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC21325gxd;
            this.copydefault = c10854bwM;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.AEQbTJ(this.copydefault, this.KWHzl, false);
            }
        }
    }

    /* JADX INFO: renamed from: o.gxd$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC21325gxd OLrzqt;
        public final /* synthetic */ java.util.List copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC21325gxd activityC21325gxd, java.util.List list) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = activityC21325gxd;
            this.copydefault = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.OLrzqt.AuCTel) {
                    return;
                }
                AbstractC16250egQ abstractC16250egQ = this.OLrzqt.fetchVPNInfo;
                if (abstractC16250egQ == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ = null;
                }
                abstractC16250egQ.AkhnZx.post(this.OLrzqt.new TaskStackBuilder(this.copydefault));
            }
        }
    }

    /* JADX INFO: renamed from: o.gxd$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ActivityC21325gxd AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC21325gxd activityC21325gxd) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = activityC21325gxd;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ActivityC9901beN.StateListAnimator stateListAnimator = ActivityC9901beN.Companion;
                ActivityC21325gxd activityC21325gxd = this.AEQbTJ;
                stateListAnimator.OLrzqt(activityC21325gxd, activityC21325gxd.fIwbmz, this.AEQbTJ.getFieldNames, false, this.AEQbTJ.AEQbTJ);
                C14494dmX.KWHzl.OLrzqt("tips");
            }
        }
    }

    /* JADX INFO: renamed from: o.gxd$PictureInPictureParams */
    public static final class PictureInPictureParams implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ ActivityC21325gxd copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(android.view.View view, long j, ActivityC21325gxd activityC21325gxd, java.lang.String str) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = activityC21325gxd;
            this.OLrzqt = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.OLrzqt(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.gxd$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC21325gxd AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC21325gxd activityC21325gxd) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = activityC21325gxd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            C10854bwM c10854bwMCopydefault;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (!Intrinsics.EZpvd(this.AEQbTJ.values().EZpvd(), java.lang.Boolean.TRUE) || (c10854bwMCopydefault = this.AEQbTJ.values().copydefault()) == null) {
                    return;
                }
                ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(this.AEQbTJ, new OKDCoinDetailConfig(OKDSourceType.WALLET_SOURCE, java.lang.String.valueOf(c10854bwMCopydefault.fetchVPNInfo()), c10854bwMCopydefault.OLrzqt(), c10854bwMCopydefault.fJNWhG(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
            }
        }
    }

    /* JADX INFO: renamed from: o.gxd$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ OKAlertBanner EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, OKAlertBanner oKAlertBanner) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = oKAlertBanner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.setVisibility(8);
                SPUtils.put("close_ton_assets_tips", java.lang.Boolean.TRUE);
            }
        }
    }

    public static final void OLrzqt(ActivityC21325gxd activityC21325gxd, android.view.View view) {
        C14494dmX.KWHzl.OLrzqt("return");
        activityC21325gxd.finish();
    }

    public final void djBIcL() {
        AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        abstractC16250egQ.AEQbTJ.getRoot().setVisibility(8);
        AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
        if (abstractC16250egQ2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ2 = null;
        }
        ConstraintLayout constraintLayout = abstractC16250egQ2.fARcdN;
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), 0);
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.getFieldNames, false);
        final Function1 function1 = new Function1() { // from class: o.gxL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.OLrzqt(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gxK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.getFieldNames(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gxM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gxN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.getNewProxyInstance(function12, obj);
            }
        }));
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC21325gxd activityC21325gxd, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.copydefault(abstractC12782ctV);
        activityC21325gxd.EZpvd(abstractC12782ctV);
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void EZpvd(AbstractC12782ctV abstractC12782ctV) {
        java.lang.Object next;
        java.util.Iterator<T> it = abstractC12782ctV.OxVOHk().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((C10594brR) next).fetchVPNInfo().AkhnZx(), (java.lang.Object) this.fIwbmz)) {
                    break;
                }
            }
        }
        EZpvd((C10594brR) next);
        AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        abstractC16250egQ.getFieldNames.setOffscreenPageLimit(1);
        AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
        if (abstractC16250egQ2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ2 = null;
        }
        abstractC16250egQ2.getFieldNames.setAdapter(new Activity(abstractC12782ctV, getSupportFragmentManager(), getLifecycle()));
        AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ3 = null;
        }
        int i = 8;
        abstractC16250egQ3.ejfBZ.setVisibility(8);
        AbstractC16250egQ abstractC16250egQ4 = this.fetchVPNInfo;
        if (abstractC16250egQ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ4 = null;
        }
        android.widget.ImageView imageView = abstractC16250egQ4.EZpvd;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        CustomChainCoinMeta customChainCoinMetaOLrzqt = C10598brV.AEQbTJ.OLrzqt(C10953byF.KWHzl.EZpvd(this.fIwbmz));
        if (customChainCoinMetaOLrzqt != null && customChainCoinMetaOLrzqt.AYXKKw() == 0) {
            i = 0;
        }
        imageView.setVisibility(i);
        AbstractC16250egQ abstractC16250egQ5 = this.fetchVPNInfo;
        if (abstractC16250egQ5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ5 = null;
        }
        abstractC16250egQ5.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.gxc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC21325gxd.AEQbTJ(this.KWHzl, view);
            }
        });
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.gxd$Activity */
    public static final class Activity extends FragmentStateAdapter {
        public final /* synthetic */ AbstractC12782ctV EZpvd;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(AbstractC12782ctV abstractC12782ctV, androidx.fragment.app.FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
            this.EZpvd = abstractC12782ctV;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            java.lang.Object next;
            gAM.Application application = gAM.Companion;
            java.lang.String str = ActivityC21325gxd.this.getFieldNames;
            long jEZpvd = C10953byF.KWHzl.EZpvd(ActivityC21325gxd.this.fIwbmz);
            AbstractC12782ctV abstractC12782ctV = this.EZpvd;
            java.util.ArrayList<CustomChainCoinMeta> arrayListAhwBna = C10598brV.AEQbTJ.AhwBna();
            ActivityC21325gxd activityC21325gxd = ActivityC21325gxd.this;
            java.util.Iterator<T> it = arrayListAhwBna.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CustomChainCoinMeta) next).valueOf() == C10953byF.KWHzl.EZpvd(activityC21325gxd.fIwbmz)) {
                    break;
                }
            }
            CustomChainCoinMeta customChainCoinMeta = (CustomChainCoinMeta) next;
            ChainAddress chainAddressCopydefault = abstractC12782ctV.copydefault(java.lang.Long.valueOf(customChainCoinMeta != null ? customChainCoinMeta.copydefault() : -1L));
            java.lang.String address = chainAddressCopydefault != null ? chainAddressCopydefault.getAddress() : null;
            return application.OLrzqt(str, jEZpvd, address == null ? "" : address, true);
        }
    }

    public static final void AEQbTJ(ActivityC21325gxd activityC21325gxd, android.view.View view) {
        ActivityC9901beN.Companion.OLrzqt(activityC21325gxd, activityC21325gxd.fIwbmz, activityC21325gxd.getFieldNames, true, activityC21325gxd.AEQbTJ);
        C14494dmX.KWHzl.OLrzqt("tips");
    }

    private final void fetchVPNInfo() {
        AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgThrottleFirst = C8003auW.copydefault(abstractC16250egQ.AEQbTJ.getRoot()).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgThrottleFirst, "");
        C33527myD.subscribeByUI$default(abstractC58247yxgThrottleFirst, (Function1) null, (Function0) null, new Function1() { // from class: o.gxn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.AEQbTJ(this.AEQbTJ, obj);
            }
        }, 3, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(ActivityC21325gxd activityC21325gxd, java.lang.Object obj) {
        java.lang.String price;
        java.lang.String priceChangePercent24h;
        java.lang.String strFJNWhG;
        java.lang.String strDbNXlk;
        if (activityC21325gxd.values().AYXKKw() == null) {
            return Unit.INSTANCE;
        }
        if (Intrinsics.EZpvd(activityC21325gxd.values().EZpvd(), java.lang.Boolean.TRUE)) {
            C10854bwM c10854bwMCopydefault = activityC21325gxd.values().copydefault();
            if (c10854bwMCopydefault != null) {
                ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(activityC21325gxd, new OKDCoinDetailConfig(OKDSourceType.WALLET_SOURCE, java.lang.String.valueOf(c10854bwMCopydefault.fetchVPNInfo()), c10854bwMCopydefault.OLrzqt(), c10854bwMCopydefault.fJNWhG(), null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null));
            }
        } else {
            gIB.Application application = gIB.Companion;
            C10854bwM c10854bwMCopydefault2 = activityC21325gxd.values().copydefault();
            long jAhwBna = c10854bwMCopydefault2 != null ? c10854bwMCopydefault2.AhwBna() : 0L;
            WalletTickerManager.CoinPrice coinPriceAEQbTJ = activityC21325gxd.values().AEQbTJ();
            if (coinPriceAEQbTJ == null || (price = coinPriceAEQbTJ.getPrice()) == null) {
                price = "";
            }
            WalletTickerManager.CoinPrice coinPriceAEQbTJ2 = activityC21325gxd.values().AEQbTJ();
            if (coinPriceAEQbTJ2 == null || (priceChangePercent24h = coinPriceAEQbTJ2.getPriceChangePercent24h()) == null) {
                priceChangePercent24h = "";
            }
            C10854bwM c10854bwMCopydefault3 = activityC21325gxd.values().copydefault();
            if (c10854bwMCopydefault3 == null || (strFJNWhG = c10854bwMCopydefault3.fJNWhG()) == null) {
                strFJNWhG = "";
            }
            C10854bwM c10854bwMCopydefault4 = activityC21325gxd.values().copydefault();
            if (c10854bwMCopydefault4 == null || (strDbNXlk = c10854bwMCopydefault4.DbNXlk()) == null) {
                strDbNXlk = "";
            }
            application.copydefault(jAhwBna, price, priceChangePercent24h, strFJNWhG, strDbNXlk, activityC21325gxd.values().AYXKKw()).show(activityC21325gxd.getSupportFragmentManager(), ActivityC21325gxd.class.getSimpleName());
        }
        C32866mlf.onEvent$default("Web3WalletHomepage_TokenDetails_MarketPrice_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        values().AhwBna().observe(this, new Dialog(new Function1() { // from class: o.gxJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.OLrzqt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        values().OLrzqt().observe(this, new Dialog(new Function1() { // from class: o.gxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.KWHzl(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC21325gxd activityC21325gxd, java.lang.Boolean bool) {
        activityC21325gxd.values().copydefault();
        AbstractC16250egQ abstractC16250egQ = null;
        if (Intrinsics.EZpvd(activityC21325gxd.values().EZpvd(), java.lang.Boolean.TRUE)) {
            AbstractC16250egQ abstractC16250egQ2 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ2;
            }
            abstractC16250egQ.AEQbTJ.OLrzqt.setImageResource(C52761wXj.TaskDescription.DGUQLI);
        } else {
            AbstractC16250egQ abstractC16250egQ3 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ3;
            }
            abstractC16250egQ.AEQbTJ.OLrzqt.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC21325gxd activityC21325gxd, java.lang.Boolean bool) {
        java.lang.String priceChangePercent;
        WalletTickerManager.CoinPrice coinPriceAEQbTJ = activityC21325gxd.values().AEQbTJ();
        C10854bwM c10854bwMCopydefault = activityC21325gxd.values().copydefault();
        AbstractC16250egQ abstractC16250egQ = null;
        if (c10854bwMCopydefault != null && c10854bwMCopydefault.getNewProxyInstance() && c10854bwMCopydefault.giSNqX()) {
            AbstractC16250egQ abstractC16250egQ2 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ2;
            }
            abstractC16250egQ.AEQbTJ.getRoot().setVisibility(8);
            return Unit.INSTANCE;
        }
        if (coinPriceAEQbTJ != null) {
            AbstractC16250egQ abstractC16250egQ3 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ3 = null;
            }
            C14786dry c14786dry = abstractC16250egQ3.AEQbTJ.KWHzl;
            java.lang.String price = coinPriceAEQbTJ.getHasPrice() ? coinPriceAEQbTJ.getPrice() : "";
            java.lang.String priceChangePercent24h = coinPriceAEQbTJ.getPriceChangePercent24h();
            boolean hasPercent = coinPriceAEQbTJ.getHasPercent();
            C10854bwM c10854bwMCopydefault2 = activityC21325gxd.values().copydefault();
            C14786dry.setCurrentPrice$default(c14786dry, price, priceChangePercent24h, hasPercent, c10854bwMCopydefault2 != null ? c10854bwMCopydefault2.getNewProxyInstance() : false, 0, 16, null);
        } else {
            AbstractC16250egQ abstractC16250egQ4 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ4 = null;
            }
            C14786dry.setCurrentPrice$default(abstractC16250egQ4.AEQbTJ.KWHzl, "", "", false, false, 0, 16, null);
        }
        NewCurvePrice newCurvePriceAYXKKw = activityC21325gxd.values().AYXKKw();
        java.util.List<CurvePrice> chartPoints = newCurvePriceAYXKKw != null ? newCurvePriceAYXKKw.getChartPoints() : null;
        if (C33129mqd.KWHzl((java.util.Collection) chartPoints)) {
            if (coinPriceAEQbTJ == null || (priceChangePercent = coinPriceAEQbTJ.getPriceChangePercent24h()) == null) {
                NewCurvePrice newCurvePriceAYXKKw2 = activityC21325gxd.values().AYXKKw();
                priceChangePercent = newCurvePriceAYXKKw2 != null ? newCurvePriceAYXKKw2.getPriceChangePercent() : null;
            }
            AbstractC16250egQ abstractC16250egQ5 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ5 = null;
            }
            abstractC16250egQ5.AEQbTJ.copydefault.setVisibility(0);
            AbstractC16250egQ abstractC16250egQ6 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ6 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ6;
            }
            C19625gJh c19625gJh = abstractC16250egQ.AEQbTJ.copydefault;
            Intrinsics.copydefault(chartPoints);
            c19625gJh.setChartData(chartPoints, priceChangePercent);
        } else {
            AbstractC16250egQ abstractC16250egQ7 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ7;
            }
            abstractC16250egQ.AEQbTJ.copydefault.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        java.lang.Integer numQUSxYX;
        final C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(this.fIwbmz)));
        android.graphics.drawable.Drawable drawable = null;
        if ((c10854bwMKWHzl != null ? c10854bwMKWHzl.QUSxYX() : null) != null && (c10854bwMKWHzl == null || (numQUSxYX = c10854bwMKWHzl.QUSxYX()) == null || numQUSxYX.intValue() != 0)) {
            AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            OKAlertBanner oKAlertBanner = abstractC16250egQ.copydefault;
            oKAlertBanner.setVisibility(0);
            oKAlertBanner.setType(3);
            oKAlertBanner.setMessage(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RestrictTo));
            oKAlertBanner.setStyle(1);
            android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.FdcJU);
            if (drawable2 != null) {
                DrawableCompat.setTint(drawable2, ContextCompat.getColor(this, C52761wXj.Activity.zblBkD));
                drawable = drawable2;
            }
            oKAlertBanner.setLeadingIcon(drawable);
            oKAlertBanner.OLrzqt().setVisibility(Intrinsics.EZpvd(values().EZpvd(), java.lang.Boolean.TRUE) ? 0 : 8);
            oKAlertBanner.setOnClickListener(new StateListAnimator(oKAlertBanner, 1000L, this));
            return;
        }
        AbstractC58185ywX<C10405bno> abstractC58185ywXEZpvd = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(true, (java.lang.Integer) 0);
        final Function1 function1 = new Function1() { // from class: o.gxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.OLrzqt(this.copydefault, c10854bwMKWHzl, (C10405bno) obj);
            }
        };
        InterfaceC58227yxM<? super C10405bno> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gxV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.AuCTel(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.valueOf(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gxe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.uzCIH(function12, obj);
            }
        }));
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(ActivityC21325gxd activityC21325gxd, C10854bwM c10854bwM, C10405bno c10405bno) {
        AbstractC16250egQ abstractC16250egQ;
        java.lang.Object next;
        java.lang.Integer numDHguZz;
        java.lang.String lowerCase;
        java.lang.String strFJNWhG;
        java.lang.String strKWHzl;
        java.lang.Object next2;
        java.util.Iterator<T> it = c10405bno.OLrzqt().iterator();
        while (true) {
            abstractC16250egQ = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C10525bqB c10525bqB = (C10525bqB) next;
            if (c10854bwM != null && c10525bqB.OLrzqt() == c10854bwM.AhwBna()) {
                break;
            }
        }
        C10525bqB c10525bqB2 = (C10525bqB) next;
        if (c10525bqB2 == null) {
            java.util.Iterator<T> it2 = c10405bno.AEQbTJ().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                C10525bqB c10525bqB3 = (C10525bqB) next2;
                if (c10854bwM != null && c10525bqB3.OLrzqt() == c10854bwM.AhwBna()) {
                    break;
                }
            }
            c10525bqB2 = (C10525bqB) next2;
        }
        java.lang.String strAubY = c10525bqB2 != null ? c10525bqB2.AubY() : null;
        if (strAubY != null && strAubY.length() != 0) {
            java.lang.String strOcIXYQ = c10525bqB2 != null ? c10525bqB2.OcIXYQ() : null;
            if (strOcIXYQ != null && strOcIXYQ.length() != 0 && !activityC21325gxd.values) {
                AbstractC16250egQ abstractC16250egQ2 = activityC21325gxd.fetchVPNInfo;
                if (abstractC16250egQ2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ = abstractC16250egQ2;
                }
                abstractC16250egQ.copydefault.setVisibility(8);
                return Unit.INSTANCE;
            }
        }
        java.util.List<C10525bqB> listOLrzqt = c10405bno.OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOLrzqt) {
            C10525bqB c10525bqB4 = (C10525bqB) obj;
            java.lang.String strKWHzl2 = StringsKt__StringsKt.KWHzl(c10525bqB4.valueOf(), (java.lang.CharSequence) "$");
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase2 = strKWHzl2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (c10854bwM == null || (strFJNWhG = c10854bwM.fJNWhG()) == null || (strKWHzl = StringsKt__StringsKt.KWHzl(strFJNWhG, (java.lang.CharSequence) "$")) == null) {
                lowerCase = null;
            } else {
                lowerCase = strKWHzl.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            }
            if (Intrinsics.EZpvd((java.lang.Object) lowerCase2, (java.lang.Object) lowerCase) && c10525bqB4.AEQbTJ() == c10854bwM.AEQbTJ()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1 && c10854bwM != null && (numDHguZz = c10854bwM.dHguZz()) != null && numDHguZz.intValue() == 0) {
            AbstractC16250egQ abstractC16250egQ3 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ3;
            }
            OKAlertBanner oKAlertBanner = abstractC16250egQ.copydefault;
            oKAlertBanner.setVisibility(0);
            oKAlertBanner.setType(3);
            oKAlertBanner.setMessage(C33070mpX.AYXKKw(C13754dXa.FragmentManager.VisibleForTesting));
            oKAlertBanner.OLrzqt().setVisibility(8);
        } else {
            AbstractC16250egQ abstractC16250egQ4 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ4;
            }
            abstractC16250egQ.copydefault.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(ActivityC21325gxd activityC21325gxd, java.lang.Throwable th) {
        AbstractC16250egQ abstractC16250egQ = activityC21325gxd.fetchVPNInfo;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        abstractC16250egQ.copydefault.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void valueOf() {
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.getFieldNames, false);
        final Function1 function1 = new Function1() { // from class: o.gxG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.EZpvd(this.EZpvd, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gxH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.hDKMBd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.gxI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.copydefault((java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gxE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.iwGUEr(function12, obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(ActivityC21325gxd activityC21325gxd, AbstractC12782ctV abstractC12782ctV) {
        java.lang.Object next;
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(activityC21325gxd.fIwbmz)));
        java.lang.String strKWHzl = null;
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.getNewProxyInstance() && c10854bwMKWHzl.giSNqX()) {
            AbstractC16250egQ abstractC16250egQ = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            abstractC16250egQ.AEQbTJ.getRoot().setVisibility(8);
        } else {
            AbstractC16250egQ abstractC16250egQ2 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            }
            abstractC16250egQ2.AEQbTJ.getRoot().setVisibility(0);
        }
        Intrinsics.copydefault(abstractC12782ctV);
        activityC21325gxd.EZpvd(abstractC12782ctV, c10854bwMKWHzl);
        if (c10854bwMKWHzl != null && c10854bwMKWHzl.dxcTrN() && abstractC12782ctV.DGOPHZ()) {
            activityC21325gxd.AEQbTJ(abstractC12782ctV, c10854bwMKWHzl);
            return Unit.INSTANCE;
        }
        java.util.List<C10525bqB> listEZpvd = abstractC12782ctV.hrNTAI().get(c10854bwMKWHzl != null ? c10854bwMKWHzl.fJNWhG() : null);
        if (listEZpvd == null) {
            listEZpvd = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((C10525bqB) it.next()).OLrzqt()));
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        if (!listEZpvd.isEmpty()) {
            if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Long>) ((java.lang.Iterable<? extends java.lang.Object>) setOqFWZa), c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna()) : null)) {
                C10525bqB c10525bqBKWHzl = abstractC12782ctV.KWHzl(C10953byF.KWHzl.EZpvd(activityC21325gxd.fIwbmz), (java.lang.Integer) null);
                if (c10525bqBKWHzl != null) {
                    listEZpvd = C56402yEa.EZpvd(c10525bqBKWHzl);
                    activityC21325gxd.EZpvd(c10525bqBKWHzl, false);
                    strKWHzl = activityC21325gxd.KWHzl(c10525bqBKWHzl, false);
                }
            } else {
                java.util.List<C10525bqB> listKWHzl = activityC21325gxd.KWHzl(listEZpvd, activityC21325gxd.getIntent().getLongExtra("chain_id", Long.MIN_VALUE));
                java.util.Iterator<T> it2 = listKWHzl.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((C10525bqB) next).gEmmrt() == 196) {
                        break;
                    }
                }
                C10525bqB c10525bqB = (C10525bqB) next;
                if (Intrinsics.EZpvd(c10525bqB != null ? java.lang.Boolean.valueOf(c10525bqB.QVAiDq()) : null, java.lang.Boolean.TRUE)) {
                    listKWHzl = activityC21325gxd.OLrzqt(listKWHzl);
                }
                listEZpvd = listKWHzl;
                C10525bqB c10525bqB2 = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(listEZpvd);
                if (c10525bqB2 != null) {
                    activityC21325gxd.EZpvd(c10525bqB2, listEZpvd.size() != 1);
                    strKWHzl = activityC21325gxd.KWHzl(c10525bqB2, listEZpvd.size() != 1);
                }
            }
        }
        activityC21325gxd.KWHzl(abstractC12782ctV, new java.util.ArrayList<>(listEZpvd), strKWHzl);
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) {
        AbstractC16250egQ abstractC16250egQ = null;
        if (!abstractC12782ctV.AubY() || c10854bwM == null || c10854bwM.fetchVPNInfo() != 607 || SPUtils.getBoolean("close_ton_assets_tips", false)) {
            AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ2;
            }
            abstractC16250egQ.fIwbmz.setVisibility(8);
            return;
        }
        AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ3;
        }
        OKAlertBanner oKAlertBanner = abstractC16250egQ.fIwbmz;
        oKAlertBanner.setVisibility(0);
        oKAlertBanner.setMessage(getString(C13754dXa.FragmentManager.getLifecycleRegistry));
        android.widget.ImageView imageViewOLrzqt = oKAlertBanner.OLrzqt();
        imageViewOLrzqt.setOnClickListener(new TaskDescription(imageViewOLrzqt, 1000L, oKAlertBanner));
        Intrinsics.copydefault(oKAlertBanner);
    }

    public final void EZpvd(AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM) {
        C10854bwM c10854bwMKWHzl;
        if (c10854bwM != null && (c10854bwMKWHzl = c10854bwM.KWHzl()) != null && c10854bwMKWHzl.DGOPHZ() && !c10854bwM.AuCTel()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CoinDetailActivity$handleTonTips$1(c10854bwM, abstractC12782ctV, this, null), 3, null);
        } else {
            KWHzl(abstractC12782ctV, c10854bwM);
        }
    }

    public final void AEQbTJ(final AbstractC12782ctV abstractC12782ctV, final C10854bwM c10854bwM) {
        java.lang.String address;
        final C8301bAD c8301bAD = new C8301bAD();
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
        if (chainAddressAddressFromChainId$default == null || (address = chainAddressAddressFromChainId$default.getAddress()) == null) {
            address = "";
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = c8301bAD.KWHzl(this.getFieldNames, c10854bwM.AEQbTJ(), address);
        final Function1 function1 = new Function1() { // from class: o.gxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.OLrzqt(c8301bAD, c10854bwM, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.gxi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return ActivityC21325gxd.ejfBZ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtOLrzqt);
        final Function1 function12 = new Function1() { // from class: o.gxf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.AEQbTJ(this.AEQbTJ, abstractC12782ctV, c10854bwM, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gxh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.fIwbmz(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.gxj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        addDisposable(abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gxg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC21325gxd.fARcdN(function13, obj);
            }
        }));
    }

    public static final InterfaceC58261yxu ejfBZ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(C8301bAD c8301bAD, C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return c8301bAD.AEQbTJ(c10854bwM.AhwBna());
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC21325gxd activityC21325gxd, AbstractC12782ctV abstractC12782ctV, C10854bwM c10854bwM, java.util.ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        java.util.Iterator it = arrayList.iterator();
        C10525bqB c10525bqB = null;
        while (it.hasNext()) {
            C10525bqB c10525bqB2 = (C10525bqB) it.next();
            java.lang.String strZuBGHE = c10525bqB2.zuBGHE();
            ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10854bwM.AEQbTJ(), null, 2, null);
            if (Intrinsics.EZpvd((java.lang.Object) strZuBGHE, (java.lang.Object) (chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null))) {
                c10525bqB = c10525bqB2;
            }
        }
        activityC21325gxd.EZpvd(c10525bqB == null ? (C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList) : c10525bqB, true);
        if (c10525bqB == null) {
            c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        }
        activityC21325gxd.KWHzl(abstractC12782ctV, (java.util.ArrayList<C10525bqB>) arrayList, activityC21325gxd.KWHzl(c10525bqB, true));
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(ActivityC21325gxd activityC21325gxd, java.lang.Throwable th) {
        pUU.copydefault(activityC21325gxd.getTAG(), "handleBtcAddressExpandData error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    public final java.util.List<C10525bqB> OLrzqt(java.util.List<C10525bqB> list) {
        return CollectionsKt___CollectionsKt.EZpvd(list, gBR.copydefault.EZpvd());
    }

    public final void EZpvd(C10594brR c10594brR) {
        java.lang.String string;
        java.lang.String strOLrzqt;
        if (c10594brR == null) {
            return;
        }
        AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
        AbstractC16250egQ abstractC16250egQ2 = null;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        abstractC16250egQ.AhwBna.setText(c10594brR.KWHzl().fJNWhG());
        AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ3 = null;
        }
        abstractC16250egQ3.valueOf.setVisibility(8);
        java.lang.String strFetchVPNInfo = c10594brR.fetchVPNInfo().fetchVPNInfo();
        if (strFetchVPNInfo.length() == 0) {
            java.lang.Character chWlaJM = C59454zhO.wlaJM(c10594brR.KWHzl().fJNWhG());
            strFetchVPNInfo = (chWlaJM == null || (string = chWlaJM.toString()) == null || (strOLrzqt = C9700baY.OLrzqt(string)) == null) ? "" : strOLrzqt;
        }
        KWHzl((java.lang.String) null, strFetchVPNInfo);
        AbstractC16250egQ abstractC16250egQ4 = this.fetchVPNInfo;
        if (abstractC16250egQ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ4 = null;
        }
        android.widget.TextView textView = abstractC16250egQ4.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        AbstractC16250egQ abstractC16250egQ5 = this.fetchVPNInfo;
        if (abstractC16250egQ5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ2 = abstractC16250egQ5;
        }
        android.widget.ImageView imageView = abstractC16250egQ2.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
    }

    public final void OLrzqt(java.lang.String str) {
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

    public final void KWHzl(java.lang.String str, java.lang.String str2) {
        try {
            AbstractC16250egQ abstractC16250egQ = null;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                C5335Nt c5335NtEZpvd = Glide.copydefault((FragmentActivity) this).EZpvd(str).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(getApplicationContext(), 1.0f, C33070mpX.copydefault(C52761wXj.Activity.copydefault), false, 8, null));
                AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
                if (abstractC16250egQ2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ2 = null;
                }
                c5335NtEZpvd.EZpvd(abstractC16250egQ2.OLrzqt);
            } else {
                AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ3 = null;
                }
                ViewGroup.LayoutParams layoutParams = abstractC16250egQ3.KWHzl.getLayoutParams();
                layoutParams.width = C55298xhM.dp2px$default(32.0f, null, 1, null);
                layoutParams.height = C55298xhM.dp2px$default(32.0f, null, 1, null);
            }
            C5335Nt c5335NtEZpvd2 = Glide.copydefault((FragmentActivity) this).EZpvd(str2).KWHzl(C52761wXj.TaskDescription.aHXSQp).copydefault(C52761wXj.TaskDescription.aHXSQp).EZpvd((NN<android.graphics.Bitmap>) new C33484mxN(getApplicationContext()));
            AbstractC16250egQ abstractC16250egQ4 = this.fetchVPNInfo;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ4;
            }
            Intrinsics.copydefault(c5335NtEZpvd2.EZpvd(abstractC16250egQ.KWHzl));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error loading chain and coin icons: " + e.getMessage(), e);
        }
    }

    public final java.lang.String KWHzl(C10525bqB c10525bqB, boolean z) {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(c10525bqB != null ? java.lang.Long.valueOf(c10525bqB.OLrzqt()) : null);
        if (c10854bwMKWHzl != null && C10854bwM.isXRCToken$default(c10854bwMKWHzl, null, 1, null)) {
            return c10854bwMKWHzl.dNCPSb();
        }
        if (z || c10525bqB.AwvSrB().length() <= 0) {
            return null;
        }
        return c10525bqB.AwvSrB();
    }

    public final void EZpvd(C10525bqB c10525bqB, boolean z) {
        OLrzqt(c10525bqB);
        EZpvd(c10525bqB);
        AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
        AbstractC16250egQ abstractC16250egQ2 = null;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        abstractC16250egQ.AhwBna.setText(c10525bqB.KWHzl().fJNWhG());
        this.AhwBna = c10525bqB.KWHzl().fJNWhG();
        this.valueOf = c10525bqB.KWHzl().DbNXlk();
        AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ3 = null;
        }
        abstractC16250egQ3.AEQbTJ.EZpvd.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.AudioAttributesCompatParcelizer, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", this.AhwBna))));
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c10525bqB.OLrzqt()));
        if ((c10854bwMKWHzl == null || !c10854bwMKWHzl.giSNqX() || this.AEQbTJ == Long.MIN_VALUE) && (c10854bwMKWHzl == null || !C10854bwM.isXRCToken$default(c10854bwMKWHzl, null, 1, null))) {
            AbstractC16250egQ abstractC16250egQ4 = this.fetchVPNInfo;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ4 = null;
            }
            if (abstractC16250egQ4.valueOf.getVisibility() != 8) {
                AbstractC16250egQ abstractC16250egQ5 = this.fetchVPNInfo;
                if (abstractC16250egQ5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ5 = null;
                }
                abstractC16250egQ5.valueOf.setVisibility(8);
            }
        } else {
            AbstractC16250egQ abstractC16250egQ6 = this.fetchVPNInfo;
            if (abstractC16250egQ6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ6 = null;
            }
            abstractC16250egQ6.valueOf.setText(c10854bwMKWHzl != null ? c10854bwMKWHzl.dNCPSb() : null);
            AbstractC16250egQ abstractC16250egQ7 = this.fetchVPNInfo;
            if (abstractC16250egQ7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ7 = null;
            }
            if (abstractC16250egQ7.valueOf.getVisibility() != 0) {
                AbstractC16250egQ abstractC16250egQ8 = this.fetchVPNInfo;
                if (abstractC16250egQ8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ8 = null;
                }
                abstractC16250egQ8.valueOf.setVisibility(0);
            }
        }
        if ((c10854bwMKWHzl != null && c10854bwMKWHzl.call()) || ((c10854bwMKWHzl != null && c10854bwMKWHzl.giSNqX()) || ((c10854bwMKWHzl != null && C10854bwM.isXRCToken$default(c10854bwMKWHzl, null, 1, null)) || (c10854bwMKWHzl != null && c10854bwMKWHzl.AuCTel())))) {
            AbstractC16250egQ abstractC16250egQ9 = this.fetchVPNInfo;
            if (abstractC16250egQ9 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ9 = null;
            }
            abstractC16250egQ9.AYXKKw.setVisibility(8);
            AbstractC16250egQ abstractC16250egQ10 = this.fetchVPNInfo;
            if (abstractC16250egQ10 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ10 = null;
            }
            abstractC16250egQ10.gEmmrt.setVisibility(8);
            KWHzl((java.lang.String) null, c10525bqB.KWHzl().DbNXlk());
            return;
        }
        C10854bwM c10854bwMKWHzl2 = c10525bqB.KWHzl().KWHzl();
        KWHzl(c10854bwMKWHzl2 != null ? c10854bwMKWHzl2.copydefault() : null, c10525bqB.KWHzl().DbNXlk());
        java.lang.String strOLrzqt = c10525bqB.KWHzl().OLrzqt();
        AbstractC16250egQ abstractC16250egQ11 = this.fetchVPNInfo;
        if (abstractC16250egQ11 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ11 = null;
        }
        android.widget.TextView textView = abstractC16250egQ11.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(strOLrzqt.length() > 0 ? 0 : 8);
        AbstractC16250egQ abstractC16250egQ12 = this.fetchVPNInfo;
        if (abstractC16250egQ12 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ12 = null;
        }
        abstractC16250egQ12.AYXKKw.setText(C14079deg.getAddressStr$default(C14079deg.EZpvd, strOLrzqt, false, 2, null));
        AbstractC16250egQ abstractC16250egQ13 = this.fetchVPNInfo;
        if (abstractC16250egQ13 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ13 = null;
        }
        android.widget.TextView textView2 = abstractC16250egQ13.AYXKKw;
        textView2.setOnClickListener(new AssistContent(textView2, 1000L, this, strOLrzqt));
        AbstractC16250egQ abstractC16250egQ14 = this.fetchVPNInfo;
        if (abstractC16250egQ14 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ14 = null;
        }
        android.widget.ImageView imageView = abstractC16250egQ14.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(strOLrzqt.length() <= 0 ? 8 : 0);
        AbstractC16250egQ abstractC16250egQ15 = this.fetchVPNInfo;
        if (abstractC16250egQ15 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ2 = abstractC16250egQ15;
        }
        android.widget.ImageView imageView2 = abstractC16250egQ2.gEmmrt;
        imageView2.setOnClickListener(new PictureInPictureParams(imageView2, 1000L, this, strOLrzqt));
    }

    public final void OLrzqt(C10525bqB c10525bqB) {
        if ((c10525bqB.values().AubY() || c10525bqB.values().AwvSrB() || c10525bqB.values().ORxRYg() || c10525bqB.values().sSMYrx() || c10525bqB.values().AxsJAY() || c10525bqB.values().zuBGHE()) && !c10525bqB.values().getFieldNames()) {
            C10854bwM c10854bwMKWHzl = c10525bqB.KWHzl();
            if (c10854bwMKWHzl.iRxXKY() || c10854bwMKWHzl.dxcTrN() || C10854bwM.isXRCToken$default(c10854bwMKWHzl, null, 1, null)) {
                EZpvd().AEQbTJ(true);
                if (gFE.OLrzqt.copydefault()) {
                    EZpvd().AhwBna();
                }
            } else if (!c10854bwMKWHzl.DsrFlB() || c10525bqB.values().AxsJAY()) {
                EZpvd().AEQbTJ(false);
            } else {
                EZpvd().AEQbTJ(true);
            }
            EZpvd().KWHzl(c10525bqB);
        }
    }

    public final void AEQbTJ(C10525bqB c10525bqB, final android.view.View view) {
        C10854bwM c10854bwMKWHzl = c10525bqB.KWHzl().KWHzl();
        java.lang.Long lValueOf = c10854bwMKWHzl != null ? java.lang.Long.valueOf(c10854bwMKWHzl.AEQbTJ()) : null;
        java.lang.String strDbNXlk = c10525bqB.values().DbNXlk();
        java.lang.String strZuBGHE = c10525bqB.zuBGHE();
        if (lValueOf != null) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = this.copydefault.KWHzl(strDbNXlk, lValueOf.longValue(), strZuBGHE);
            final Function1 function1 = new Function1() { // from class: o.gxQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC21325gxd.gEmmrt(this.OLrzqt, (AbstractC12782ctV) obj);
                }
            };
            AbstractC58260yxt<R> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.gxR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return ActivityC21325gxd.sSMYrx(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.gxO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC21325gxd.AEQbTJ(view, (java.util.List) obj);
                }
            };
            abstractC58260yxtOLrzqt.copydefault((InterfaceC58227yxM<? super R>) new InterfaceC58227yxM() { // from class: o.gxP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC21325gxd.gHZMYf(function12, obj);
                }
            });
        }
    }

    public static final InterfaceC58261yxu sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu gEmmrt(ActivityC21325gxd activityC21325gxd, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return activityC21325gxd.copydefault.EZpvd();
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void EZpvd(C52812wZg c52812wZg, android.view.View view) {
        c52812wZg.KWHzl();
    }

    public static /* synthetic */ void modifyRelatedChainIdAddress$default(ActivityC21325gxd activityC21325gxd, long j, java.lang.String str, int i, C10525bqB c10525bqB, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        activityC21325gxd.copydefault(j, str, i, c10525bqB, z);
    }

    public final void copydefault(long j, final java.lang.String str, final int i, final C10525bqB c10525bqB, final boolean z) {
        final AbstractC12782ctV abstractC12782ctVValues = c10525bqB.values();
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(j));
        if (c10854bwMKWHzl != null) {
            long jFetchVPNInfo = c10854bwMKWHzl.fetchVPNInfo();
            showLoading();
            InterfaceC54823xWq interfaceC54823xWq = (InterfaceC54823xWq) C43251rlk.copydefault(InterfaceC54823xWq.class);
            java.util.ArrayList<ChainAddress> arrayListGGvvIC = abstractC12782ctVValues.gGvvIC();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : arrayListGGvvIC) {
                if (((ChainAddress) obj).getChainId() == jFetchVPNInfo) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ChainAddress) it.next()).getAddress());
            }
            interfaceC54823xWq.AEQbTJ(new xWY(jFetchVPNInfo, str, arrayList2));
            AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = abstractC12782ctVValues.OLrzqt(j, str, i);
            final Function1 function1 = new Function1() { // from class: o.gxu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ActivityC21325gxd.EZpvd(c10525bqB, (java.lang.Integer) obj2);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXCopydefault = abstractC58185ywXOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.gxB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj2) {
                    return ActivityC21325gxd.zsXlph(function1, obj2);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.gxA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ActivityC21325gxd.copydefault(this.KWHzl, str, z, c10525bqB, i, abstractC12782ctVValues, (AbstractC12782ctV) obj2);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gxC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    ActivityC21325gxd.AubY(function12, obj2);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.gxz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return ActivityC21325gxd.AYXKKw(this.OLrzqt, (java.lang.Throwable) obj2);
                }
            };
            addDisposable(abstractC58185ywXCopydefault.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gxD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    ActivityC21325gxd.zLjUOn(function13, obj2);
                }
            }));
        }
    }

    public static final InterfaceC58261yxu zsXlph(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu EZpvd(C10525bqB c10525bqB, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(c10525bqB.values().DbNXlk(), false);
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(ActivityC21325gxd activityC21325gxd, java.lang.String str, boolean z, C10525bqB c10525bqB, int i, AbstractC12782ctV abstractC12782ctV, AbstractC12782ctV abstractC12782ctV2) {
        java.lang.String strCopydefault;
        C10854bwM c10854bwMKWHzl;
        activityC21325gxd.dismissLoading();
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        java.util.ArrayList<ChainAddress> arrayListOBJEWx = abstractC12782ctV2.isConnected();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListOBJEWx, 10));
        java.util.Iterator<T> it = arrayListOBJEWx.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChainAddress) it.next()).getAddress());
        }
        c11205cFp.OLrzqt(arrayList);
        activityC21325gxd.AYXKKw().copydefault(str);
        if (z) {
            strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.isReflectionWorking);
        } else {
            strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.connect, C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainName", c10525bqB.KWHzl().djBIcL()), C56390yDp.OLrzqt("type", C8322bAY.getAddressFormat$default(C8322bAY.KWHzl, i, false, 2, null))));
        }
        C19595gIe.Companion.AEQbTJ(strCopydefault, str).KWHzl(activityC21325gxd);
        C10525bqB c10525bqBOLrzqt = abstractC12782ctV.OLrzqt(c10525bqB.OLrzqt(), str);
        if (c10525bqBOLrzqt == null && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(c10525bqB.OLrzqt()))) != null) {
            C10525bqB.StateListAnimator stateListAnimator = C10525bqB.Companion;
            Intrinsics.copydefault(abstractC12782ctV2);
            c10525bqBOLrzqt = stateListAnimator.AEQbTJ(c10854bwMKWHzl, abstractC12782ctV2, str);
        }
        if (c10525bqBOLrzqt != null) {
            activityC21325gxd.OLrzqt(c10525bqBOLrzqt);
        }
        if (z) {
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC21325gxd.getSupportFragmentManager();
            int size = activityC21325gxd.AYXKKw.size();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("f");
            sb.append(size - 1);
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(sb.toString());
            if (fragmentFindFragmentByTag instanceof CoinDetailFragmentNew) {
                ((CoinDetailFragmentNew) fragmentFindFragmentByTag).OLrzqt(str);
            } else {
                activityC21325gxd.valueOf();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(ActivityC21325gxd activityC21325gxd, java.lang.Throwable th) {
        activityC21325gxd.dismissLoading();
        return Unit.INSTANCE;
    }

    public final void KWHzl(AbstractC12782ctV abstractC12782ctV, final java.util.ArrayList<C10525bqB> arrayList, java.lang.String str) {
        java.lang.Object next;
        java.lang.String strOLrzqt;
        java.lang.String strAwvSrB;
        this.AYXKKw = arrayList;
        int i = 0;
        final boolean z = C33129mqd.copydefault((java.lang.Object) java.lang.Integer.valueOf(arrayList.size()), (java.lang.Object) 2) && C33129mqd.AEQbTJ(C54862xYb.convertToString$default(C33129mqd.EZpvd(arrayList.get(1).fIwbmz()), false, java.lang.Integer.valueOf(arrayList.get(1).KWHzl().fZBcTu()), null, 5, null), 0);
        EZpvd().EZpvd(z);
        if (z) {
            arrayList.add(0, (C10525bqB) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList));
            AEQbTJ().KWHzl(this.fIwbmz, this.getFieldNames);
            AEQbTJ().ejfBZ();
            AEQbTJ().valueOf();
            AEQbTJ().values().observe(this, new Dialog(new Function1() { // from class: o.gxb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC21325gxd.OLrzqt(arrayList, this, (gBU) obj);
                }
            }));
        }
        java.util.Iterator<T> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((C10525bqB) next).AxsJAY()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        boolean z2 = next != null;
        AbstractC16250egQ abstractC16250egQ = this.fetchVPNInfo;
        if (abstractC16250egQ == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ = null;
        }
        abstractC16250egQ.getFieldNames.setOffscreenPageLimit(z ? 2 : 1);
        AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
        if (abstractC16250egQ2 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ2 = null;
        }
        boolean z3 = z2;
        abstractC16250egQ2.getFieldNames.setAdapter(new FragmentManager(z, z2, str, abstractC12782ctV, arrayList, getSupportFragmentManager(), getLifecycle()));
        if (arrayList.size() > 1) {
            AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
            if (abstractC16250egQ3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ3 = null;
            }
            abstractC16250egQ3.ejfBZ.setVisibility(0);
            AbstractC16250egQ abstractC16250egQ4 = this.fetchVPNInfo;
            if (abstractC16250egQ4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ4 = null;
            }
            TabLayout tabLayoutAYXKKw = abstractC16250egQ4.ejfBZ.AYXKKw();
            AbstractC16250egQ abstractC16250egQ5 = this.fetchVPNInfo;
            if (abstractC16250egQ5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ5 = null;
            }
            new TabLayoutMediator(tabLayoutAYXKKw, abstractC16250egQ5.getFieldNames, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.gxo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                    ActivityC21325gxd.AEQbTJ(z, this, arrayList, tab, i2);
                }
            }).attach();
            int iCopydefault = copydefault(abstractC12782ctV, arrayList, z);
            AbstractC16250egQ abstractC16250egQ6 = this.fetchVPNInfo;
            if (abstractC16250egQ6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ6 = null;
            }
            abstractC16250egQ6.getFieldNames.setCurrentItem(iCopydefault, false);
            gBU value = AEQbTJ().values().getValue();
            if (value == null || (strOLrzqt = value.OLrzqt()) == null) {
                strOLrzqt = "0";
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (java.lang.Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C10525bqB c10525bqB = (C10525bqB) obj;
                if (z && i == 0) {
                    strAwvSrB = getString(C13754dXa.FragmentManager.RatingCompatStyle);
                } else {
                    strAwvSrB = c10525bqB.AwvSrB();
                }
                java.lang.String str2 = strAwvSrB;
                Intrinsics.copydefault((java.lang.Object) str2);
                arrayList2.add(new C21261gwS(str2, (z && i == 0) ? Long.MIN_VALUE : c10525bqB.OLrzqt(), (z && i == 0) ? "" : c10525bqB.zuBGHE(), (z && i == 0) ? "" : c10525bqB.KWHzl().AYXKKw(), (z && i == 0) ? strOLrzqt : c10525bqB.OLrzqt(true)));
                i++;
            }
            this.djBIcL = arrayList2;
            copydefault(arrayList2);
        } else {
            AbstractC16250egQ abstractC16250egQ7 = this.fetchVPNInfo;
            if (abstractC16250egQ7 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ7 = null;
            }
            abstractC16250egQ7.ejfBZ.setVisibility(8);
        }
        copydefault(z, z3, arrayList);
        dismissLoading();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(java.util.ArrayList arrayList, ActivityC21325gxd activityC21325gxd, gBU gbu) {
        java.lang.String strAwvSrB;
        java.lang.String strOLrzqt;
        if (gbu != null && (!arrayList.isEmpty())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            int i = 0;
            for (java.lang.Object obj : arrayList) {
                if (i < 0) {
                    yDY.AYXKKw();
                }
                C10525bqB c10525bqB = (C10525bqB) obj;
                if (i == 0) {
                    strAwvSrB = activityC21325gxd.getString(C13754dXa.FragmentManager.RatingCompatStyle);
                } else {
                    strAwvSrB = c10525bqB.AwvSrB();
                }
                java.lang.String str = strAwvSrB;
                Intrinsics.copydefault((java.lang.Object) str);
                if (i == 0) {
                    strOLrzqt = gbu.OLrzqt();
                } else {
                    strOLrzqt = c10525bqB.OLrzqt(true);
                }
                arrayList2.add(new C21261gwS(str, i == 0 ? Long.MIN_VALUE : c10525bqB.OLrzqt(), i == 0 ? "" : c10525bqB.zuBGHE(), i == 0 ? "" : c10525bqB.KWHzl().AYXKKw(), strOLrzqt));
                i++;
            }
            activityC21325gxd.djBIcL = arrayList2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.gxd$FragmentManager */
    public static final class FragmentManager extends FragmentStateAdapter {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ java.util.ArrayList<C10525bqB> OLrzqt;
        public final /* synthetic */ AbstractC12782ctV copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentManager(boolean z, boolean z2, java.lang.String str, AbstractC12782ctV abstractC12782ctV, java.util.ArrayList<C10525bqB> arrayList, androidx.fragment.app.FragmentManager fragmentManager, Lifecycle lifecycle) {
            super(fragmentManager, lifecycle);
            this.AEQbTJ = z;
            this.KWHzl = z2;
            this.EZpvd = str;
            this.copydefault = abstractC12782ctV;
            this.OLrzqt = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return ActivityC21325gxd.this.AYXKKw.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            if (!this.AEQbTJ) {
                java.lang.Object obj = ActivityC21325gxd.this.AYXKKw.get(i);
                Intrinsics.checkNotNullExpressionValue(obj, "");
                return ActivityC21325gxd.this.OLrzqt((C10525bqB) obj, this.copydefault, this.AEQbTJ, this.KWHzl, this.EZpvd);
            }
            if (i != 0) {
                java.lang.Object obj2 = ActivityC21325gxd.this.AYXKKw.get(i);
                Intrinsics.checkNotNullExpressionValue(obj2, "");
                return ActivityC21325gxd.this.OLrzqt((C10525bqB) obj2, this.copydefault, this.AEQbTJ, this.KWHzl, this.EZpvd);
            }
            C19422gBu c19422gBuAEQbTJ = C19422gBu.Companion.AEQbTJ(ActivityC21325gxd.this.fIwbmz, ActivityC21325gxd.this.getFieldNames, this.KWHzl, this.EZpvd);
            final ActivityC21325gxd activityC21325gxd = ActivityC21325gxd.this;
            final boolean z = this.AEQbTJ;
            final java.util.ArrayList<C10525bqB> arrayList = this.OLrzqt;
            c19422gBuAEQbTJ.KWHzl(new Function1() { // from class: o.gxU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return ActivityC21325gxd.FragmentManager.OLrzqt(activityC21325gxd, z, arrayList, (C19419gBr) obj3);
                }
            });
            return c19422gBuAEQbTJ;
        }

        public static final Unit OLrzqt(ActivityC21325gxd activityC21325gxd, boolean z, java.util.ArrayList arrayList, C19419gBr c19419gBr) {
            Intrinsics.checkNotNullParameter(c19419gBr, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C10525bqB c10525bqB = (C10525bqB) it.next();
                arrayList2.add(new C21261gwS(c10525bqB.AwvSrB(), c10525bqB.OLrzqt(), c10525bqB.zuBGHE(), c10525bqB.KWHzl().AYXKKw(), c10525bqB.OLrzqt(true)));
            }
            int iOLrzqt = activityC21325gxd.OLrzqt(z, c19419gBr, arrayList2);
            AbstractC16250egQ abstractC16250egQ = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            abstractC16250egQ.getFieldNames.setCurrentItem(iOLrzqt, true);
            return Unit.INSTANCE;
        }
    }

    public static final void AEQbTJ(boolean z, ActivityC21325gxd activityC21325gxd, java.util.ArrayList arrayList, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        java.lang.String strAwvSrB = (i == 0 && z) ? activityC21325gxd.getString(C13754dXa.FragmentManager.RatingCompatStyle) : ((C10525bqB) arrayList.get(i)).AwvSrB();
        Intrinsics.copydefault((java.lang.Object) strAwvSrB);
        tab.setText(strAwvSrB);
    }

    public final int copydefault(AbstractC12782ctV abstractC12782ctV, java.util.ArrayList<C10525bqB> arrayList, boolean z) {
        C21261gwS c21261gwS;
        java.lang.Object next;
        long jAEQbTJ = AEQbTJ(abstractC12782ctV, arrayList);
        if (z || jAEQbTJ == -1) {
            c21261gwS = new C21261gwS(this.AhwBna, Long.MIN_VALUE, "", null, null, 24, null);
        } else {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C10525bqB) next).OLrzqt() == jAEQbTJ) {
                    break;
                }
            }
            C10525bqB c10525bqB = (C10525bqB) next;
            java.lang.String strZuBGHE = c10525bqB != null ? c10525bqB.zuBGHE() : null;
            if (strZuBGHE == null) {
                strZuBGHE = "";
            }
            c21261gwS = new C21261gwS(this.AhwBna, jAEQbTJ, strZuBGHE, null, null, 24, null);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (C10525bqB c10525bqB2 : arrayList) {
            arrayList2.add(new C21261gwS(c10525bqB2.AwvSrB(), c10525bqB2.OLrzqt(), c10525bqB2.zuBGHE(), c10525bqB2.KWHzl().AYXKKw(), c10525bqB2.OLrzqt(true)));
        }
        return KWHzl(z, c21261gwS, arrayList2);
    }

    public final void copydefault(boolean z, boolean z2, java.util.ArrayList<C10525bqB> arrayList) {
        int iKWHzl = KWHzl(z, C21256gwN.Companion.OLrzqt(this.getFieldNames, this.AhwBna), this.djBIcL);
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(C10953byF.KWHzl.EZpvd(this.fIwbmz)));
        AbstractC16250egQ abstractC16250egQ = null;
        java.lang.Integer numDHguZz = c10854bwMKWHzl != null ? c10854bwMKWHzl.dHguZz() : null;
        if (numDHguZz == null || numDHguZz.intValue() != 0 || !z2) {
            if (numDHguZz != null && numDHguZz.intValue() == 0) {
                boolean z3 = SPUtils.getBoolean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwMKWHzl.AhwBna())), false, "coin_report");
                AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
                if (abstractC16250egQ2 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ2 = null;
                }
                abstractC16250egQ2.AuCTel.setEnabled(!z3);
                AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ3 = null;
                }
                abstractC16250egQ3.AuCTel.setImageTintList(C33070mpX.AEQbTJ(z3 ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl));
                AbstractC16250egQ abstractC16250egQ4 = this.fetchVPNInfo;
                if (abstractC16250egQ4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ4 = null;
                }
                abstractC16250egQ4.AuCTel.setVisibility(0);
                AbstractC16250egQ abstractC16250egQ5 = this.fetchVPNInfo;
                if (abstractC16250egQ5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ5 = null;
                }
                abstractC16250egQ5.djBIcL.setVisibility(8);
                AbstractC16250egQ abstractC16250egQ6 = this.fetchVPNInfo;
                if (abstractC16250egQ6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ6 = null;
                }
                abstractC16250egQ6.EZpvd.setVisibility(8);
                AbstractC16250egQ abstractC16250egQ7 = this.fetchVPNInfo;
                if (abstractC16250egQ7 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ = abstractC16250egQ7;
                }
                android.widget.ImageView imageView = abstractC16250egQ.AuCTel;
                imageView.setOnClickListener(new Fragment(imageView, 1000L, this, c10854bwMKWHzl, iKWHzl));
                return;
            }
            if (!z2) {
                AbstractC16250egQ abstractC16250egQ8 = this.fetchVPNInfo;
                if (abstractC16250egQ8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ8 = null;
                }
                abstractC16250egQ8.EZpvd.setVisibility(8);
                AbstractC16250egQ abstractC16250egQ9 = this.fetchVPNInfo;
                if (abstractC16250egQ9 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ9 = null;
                }
                abstractC16250egQ9.AuCTel.setVisibility(8);
                AbstractC16250egQ abstractC16250egQ10 = this.fetchVPNInfo;
                if (abstractC16250egQ10 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ = abstractC16250egQ10;
                }
                abstractC16250egQ.djBIcL.setVisibility(8);
                return;
            }
            AbstractC16250egQ abstractC16250egQ11 = this.fetchVPNInfo;
            if (abstractC16250egQ11 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ11 = null;
            }
            abstractC16250egQ11.EZpvd.setVisibility(0);
            AbstractC16250egQ abstractC16250egQ12 = this.fetchVPNInfo;
            if (abstractC16250egQ12 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ12 = null;
            }
            abstractC16250egQ12.djBIcL.setVisibility(8);
            AbstractC16250egQ abstractC16250egQ13 = this.fetchVPNInfo;
            if (abstractC16250egQ13 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ13 = null;
            }
            abstractC16250egQ13.AuCTel.setVisibility(8);
            AbstractC16250egQ abstractC16250egQ14 = this.fetchVPNInfo;
            if (abstractC16250egQ14 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16250egQ = abstractC16250egQ14;
            }
            android.widget.ImageView imageView2 = abstractC16250egQ.EZpvd;
            imageView2.setOnClickListener(new PendingIntent(imageView2, 1000L, this));
            return;
        }
        AbstractC16250egQ abstractC16250egQ15 = this.fetchVPNInfo;
        if (abstractC16250egQ15 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ15 = null;
        }
        abstractC16250egQ15.djBIcL.setVisibility(0);
        AbstractC16250egQ abstractC16250egQ16 = this.fetchVPNInfo;
        if (abstractC16250egQ16 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ16 = null;
        }
        abstractC16250egQ16.EZpvd.setVisibility(8);
        AbstractC16250egQ abstractC16250egQ17 = this.fetchVPNInfo;
        if (abstractC16250egQ17 == null) {
            Intrinsics.gEmmrt("");
            abstractC16250egQ17 = null;
        }
        abstractC16250egQ17.AuCTel.setVisibility(8);
        AbstractC16250egQ abstractC16250egQ18 = this.fetchVPNInfo;
        if (abstractC16250egQ18 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ18;
        }
        android.widget.ImageView imageView3 = abstractC16250egQ.djBIcL;
        imageView3.setOnClickListener(new ActionBar(imageView3, 1000L, this, c10854bwMKWHzl, iKWHzl));
    }

    public final void OLrzqt(final C10854bwM c10854bwM, final int i) {
        final C54997xbd c54997xbd = new C54997xbd(getMActivity(), null, 0, 0, 14, null);
        RecyclerView recyclerView = new RecyclerView(getMActivity());
        recyclerView.setHasFixedSize(true);
        recyclerView.setBackgroundResource(C13754dXa.Activity.AEQbTJ);
        AbstractC16250egQ abstractC16250egQ = null;
        recyclerView.setPadding(0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null), 0, C55298xhM.dpInt$default(6.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        C59534zip c59534zip = new C59534zip();
        c59534zip.register(C19414gBm.class, new C19417gBp(new Function1() { // from class: o.gxm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21325gxd.copydefault(this.KWHzl, c54997xbd, c10854bwM, i, (C19414gBm) obj);
            }
        }));
        C33064mpR.OLrzqt(c59534zip, (java.util.List<? extends java.lang.Object>) yDY.gEmmrt(new C19414gBm(C52761wXj.TaskDescription.GGlJim, C13754dXa.FragmentManager.receiveFile, 0, true), new C19414gBm(C52761wXj.TaskDescription.UPzgla, C13754dXa.FragmentManager.requestPostMessageChannelWithExtras, 1, !SPUtils.getBoolean(C33129mqd.gEmmrt(java.lang.Long.valueOf(c10854bwM.AhwBna())), false, "coin_report"))));
        recyclerView.setAdapter(c59534zip);
        c54997xbd.EZpvd(recyclerView);
        AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
        if (abstractC16250egQ2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ2;
        }
        c54997xbd.showAsDropDown(abstractC16250egQ.djBIcL);
    }

    public static final Unit copydefault(ActivityC21325gxd activityC21325gxd, C54997xbd c54997xbd, C10854bwM c10854bwM, int i, C19414gBm c19414gBm) {
        Intrinsics.checkNotNullParameter(c19414gBm, "");
        int iAEQbTJ = c19414gBm.AEQbTJ();
        if (iAEQbTJ == 0) {
            ActivityC9901beN.Companion.OLrzqt(activityC21325gxd.getMActivity(), activityC21325gxd.fIwbmz, activityC21325gxd.getFieldNames, false, activityC21325gxd.AEQbTJ);
            C14494dmX.KWHzl.OLrzqt("tips");
            c54997xbd.dismiss();
        } else if (iAEQbTJ == 1) {
            if (c19414gBm.KWHzl()) {
                activityC21325gxd.AEQbTJ(c10854bwM, i, true);
            }
            c54997xbd.dismiss();
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final C10854bwM c10854bwM, int i, final boolean z) {
        eSZ.ActionBar actionBar = eSZ.Companion;
        java.lang.String str = this.getFieldNames;
        java.lang.String strFJNWhG = c10854bwM.fJNWhG();
        java.lang.String strDbNXlk = c10854bwM.DbNXlk();
        C10525bqB c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.AkhnZx(this.AYXKKw, i);
        eSZ eszEZpvd = actionBar.EZpvd(1, strDbNXlk, strFJNWhG, c10854bwM, str, c10525bqB != null ? c10525bqB.zuBGHE() : null, new Function0() { // from class: o.gxl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC21325gxd.OLrzqt(z, this, c10854bwM);
            }
        });
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        eszEZpvd.show(supportFragmentManager);
    }

    public static final Unit OLrzqt(boolean z, ActivityC21325gxd activityC21325gxd, C10854bwM c10854bwM) {
        if (!z) {
            AbstractC16250egQ abstractC16250egQ = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            abstractC16250egQ.AuCTel.setEnabled(false);
            AbstractC16250egQ abstractC16250egQ2 = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            }
            abstractC16250egQ2.AuCTel.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.UlJrfe));
        }
        SPUtils.put(java.lang.String.valueOf(c10854bwM.AhwBna()), java.lang.Boolean.TRUE, "coin_report");
        C55284xgz.Activity activity = C55284xgz.Companion;
        android.view.View decorView = activityC21325gxd.getWindow().getDecorView();
        Intrinsics.copydefault(decorView, "");
        final C55284xgz c55284xgzAEQbTJ = activity.AEQbTJ(activityC21325gxd, (android.view.ViewGroup) decorView, C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyDayNight));
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.isConnected(3);
            c55284xgzAEQbTJ.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.applyDayNight));
            c55284xgzAEQbTJ.EZpvd(new View.OnClickListener() { // from class: o.gxw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC21325gxd.copydefault(c55284xgzAEQbTJ, view);
                }
            });
        }
        android.view.View viewAkhnZx = c55284xgzAEQbTJ != null ? c55284xgzAEQbTJ.AkhnZx() : null;
        if (viewAkhnZx != null) {
            ViewGroup.LayoutParams layoutParams = viewAkhnZx.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, C55298xhM.OLrzqt(58, (android.content.Context) activityC21325gxd));
            viewAkhnZx.setLayoutParams(marginLayoutParams);
        }
        if (c55284xgzAEQbTJ != null) {
            c55284xgzAEQbTJ.hDKMBd();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C55284xgz c55284xgz, android.view.View view) {
        c55284xgz.copydefault();
    }

    public final AbstractC32996moC OLrzqt(C10525bqB c10525bqB, AbstractC12782ctV abstractC12782ctV, boolean z, boolean z2, java.lang.String str) {
        AbstractC32996moC abstractC32996moCKWHzl;
        boolean zAEQbTJ = C33129mqd.AEQbTJ(c10525bqB.AhwBna(), "1");
        java.lang.String strOLrzqt = c10525bqB.KWHzl().OLrzqt();
        boolean zAuCTel = c10525bqB.KWHzl().AuCTel();
        ChainAddress chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(abstractC12782ctV, c10525bqB.AEQbTJ(), null, 2, null);
        java.lang.String address = chainAddressAddressFromChainId$default != null ? chainAddressAddressFromChainId$default.getAddress() : null;
        if (address == null || address.length() == 0) {
            C21267gwY c21267gwYCopydefault = C21267gwY.Companion.copydefault(c10525bqB.OLrzqt());
            c21267gwYCopydefault.OLrzqt(new Function1() { // from class: o.gxF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC21325gxd.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return c21267gwYCopydefault;
        }
        if (c10525bqB.DTwDnp() || c10525bqB.zuBGHE().length() == 0) {
            abstractC32996moCKWHzl = C21375gya.Companion.KWHzl(c10525bqB.AwvSrB());
        } else {
            if (c10525bqB.KWHzl().OcIXYQ().length() == 0) {
                C10856bwO.EZpvd(getTAG(), new OKWException("metaId is invalid, coinId:" + c10525bqB.KWHzl().AhwBna(), null));
            }
            abstractC32996moCKWHzl = CoinDetailFragmentNew.Companion.AEQbTJ(c10525bqB.KWHzl().OcIXYQ(), abstractC12782ctV.DbNXlk(), C33129mqd.AYXKKw(java.lang.Long.valueOf(c10525bqB.KWHzl().fetchVPNInfo())), strOLrzqt, c10525bqB.zuBGHE(), abstractC12782ctV.QfsBiF(), zAEQbTJ, zAuCTel, !z, z2, str);
        }
        return abstractC32996moCKWHzl;
    }

    public static final Unit copydefault(ActivityC21325gxd activityC21325gxd, boolean z) {
        if (z) {
            activityC21325gxd.valueOf();
        }
        return Unit.INSTANCE;
    }

    public final int OLrzqt(boolean z, C19419gBr c19419gBr, java.util.List<C21261gwS> list) {
        if (c19419gBr.KWHzl() == Long.MIN_VALUE) {
            return 0;
        }
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C21261gwS c21261gwS = (C21261gwS) obj;
            if (!(z && i == 0) && c19419gBr.KWHzl() == c21261gwS.KWHzl() && Intrinsics.EZpvd((java.lang.Object) c19419gBr.copydefault(), (java.lang.Object) c21261gwS.EZpvd())) {
                return i;
            }
            i++;
        }
        return 0;
    }

    public final int KWHzl(boolean z, C21261gwS c21261gwS, java.util.List<C21261gwS> list) {
        if (c21261gwS.KWHzl() == Long.MIN_VALUE) {
            return 0;
        }
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            C21261gwS c21261gwS2 = (C21261gwS) obj;
            if (!(z && i == 0) && c21261gwS.KWHzl() == c21261gwS2.KWHzl() && Intrinsics.EZpvd((java.lang.Object) c21261gwS.EZpvd(), (java.lang.Object) c21261gwS2.EZpvd())) {
                return i;
            }
            i++;
        }
        return 0;
    }

    /* JADX INFO: renamed from: o.gxd$VoiceInteractor */
    public static final class VoiceInteractor implements ViewTreeObserver.OnPreDrawListener {
        public VoiceInteractor() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            android.view.View childAt;
            try {
                AbstractC16250egQ abstractC16250egQ = ActivityC21325gxd.this.fetchVPNInfo;
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
                int iAEQbTJ = C33570myu.AEQbTJ();
                int iDp2px$default = intRef.element + C55298xhM.dp2px$default(48.0f, null, 1, null);
                pUU.EZpvd("CoinDetailChevron", "tabLayoutWidth: " + intRef.element + ", screenWidth: " + iAEQbTJ + ", totalWidth: " + iDp2px$default + ", childCount: " + childCount);
                AbstractC16250egQ abstractC16250egQ3 = ActivityC21325gxd.this.fetchVPNInfo;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ3 = null;
                }
                Group group = abstractC16250egQ3.isConnected;
                if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(iDp2px$default), java.lang.Integer.valueOf(iAEQbTJ))) {
                    i = 8;
                }
                group.setVisibility(i);
                AbstractC16250egQ abstractC16250egQ4 = ActivityC21325gxd.this.fetchVPNInfo;
                if (abstractC16250egQ4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ4 = null;
                }
                android.widget.ImageView imageViewOLrzqt = abstractC16250egQ4.AkhnZx.OLrzqt();
                imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.UrRBLY);
                imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                AbstractC16250egQ abstractC16250egQ5 = ActivityC21325gxd.this.fetchVPNInfo;
                if (abstractC16250egQ5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ5 = null;
                }
                abstractC16250egQ5.ejfBZ.getViewTreeObserver().removeOnPreDrawListener(this);
                if (C55296xhK.OLrzqt(ActivityC21325gxd.this)) {
                    AbstractC16250egQ abstractC16250egQ6 = ActivityC21325gxd.this.fetchVPNInfo;
                    if (abstractC16250egQ6 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC16250egQ6 = null;
                    }
                    if (abstractC16250egQ6.ejfBZ.gEmmrt() == 0) {
                        AbstractC16250egQ abstractC16250egQ7 = ActivityC21325gxd.this.fetchVPNInfo;
                        if (abstractC16250egQ7 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC16250egQ2 = abstractC16250egQ7;
                        }
                        ViewPager2 viewPager2 = abstractC16250egQ2.getFieldNames;
                        final ActivityC21325gxd activityC21325gxd = ActivityC21325gxd.this;
                        viewPager2.postDelayed(new java.lang.Runnable() { // from class: o.gyc
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                ActivityC21325gxd.VoiceInteractor.OLrzqt(activityC21325gxd, intRef);
                            }
                        }, 50L);
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ(ActivityC21325gxd.this.getTAG(), "Error in onPreDraw: " + e.getMessage(), e);
            }
            return true;
        }

        public static final void OLrzqt(ActivityC21325gxd activityC21325gxd, Ref.IntRef intRef) {
            AbstractC16250egQ abstractC16250egQ = activityC21325gxd.fetchVPNInfo;
            if (abstractC16250egQ == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ = null;
            }
            C55244xgL c55244xgL = abstractC16250egQ.ejfBZ;
            int i = intRef.element;
            c55244xgL.scrollTo(i + i, 0);
        }
    }

    public final void copydefault(java.util.List<C21261gwS> list) {
        AbstractC16250egQ abstractC16250egQ = null;
        try {
            AbstractC16250egQ abstractC16250egQ2 = this.fetchVPNInfo;
            if (abstractC16250egQ2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16250egQ2 = null;
            }
            abstractC16250egQ2.ejfBZ.getViewTreeObserver().addOnPreDrawListener(new VoiceInteractor());
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error setting icon more show: " + e.getMessage(), e);
        }
        AbstractC16250egQ abstractC16250egQ3 = this.fetchVPNInfo;
        if (abstractC16250egQ3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16250egQ = abstractC16250egQ3;
        }
        C54989xbV c54989xbV = abstractC16250egQ.AkhnZx;
        c54989xbV.setOnClickListener(new LoaderManager(c54989xbV, 1000L, this, list));
    }

    /* JADX INFO: renamed from: o.gxd$TaskStackBuilder */
    public static final class TaskStackBuilder implements java.lang.Runnable {
        public final /* synthetic */ java.util.List<C21261gwS> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(java.util.List<C21261gwS> list) {
            this.OLrzqt = list;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                AbstractC16250egQ abstractC16250egQ = ActivityC21325gxd.this.fetchVPNInfo;
                AbstractC16250egQ abstractC16250egQ2 = null;
                if (abstractC16250egQ == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ = null;
                }
                int iGEmmrt = abstractC16250egQ.ejfBZ.gEmmrt();
                if (iGEmmrt >= this.OLrzqt.size()) {
                    iGEmmrt = 0;
                }
                int i = iGEmmrt;
                AbstractC16250egQ abstractC16250egQ3 = ActivityC21325gxd.this.fetchVPNInfo;
                if (abstractC16250egQ3 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16250egQ3 = null;
                }
                int height = abstractC16250egQ3.ejfBZ.getHeight();
                C21256gwN c21256gwN = new C21256gwN(ActivityC21325gxd.this);
                AbstractC16250egQ abstractC16250egQ4 = ActivityC21325gxd.this.fetchVPNInfo;
                if (abstractC16250egQ4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16250egQ2 = abstractC16250egQ4;
                }
                C55244xgL c55244xgL = abstractC16250egQ2.ejfBZ;
                java.util.List list = ActivityC21325gxd.this.djBIcL;
                final ActivityC21325gxd activityC21325gxd = ActivityC21325gxd.this;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: o.gxd.TaskStackBuilder.3
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ Unit invoke() {
                        copydefault();
                        return Unit.INSTANCE;
                    }

                    public final void copydefault() {
                        AbstractC16250egQ abstractC16250egQ5 = activityC21325gxd.fetchVPNInfo;
                        if (abstractC16250egQ5 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16250egQ5 = null;
                        }
                        android.widget.ImageView imageViewOLrzqt = abstractC16250egQ5.AkhnZx.OLrzqt();
                        imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.UrRBLY);
                        imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                    }
                };
                final ActivityC21325gxd activityC21325gxd2 = ActivityC21325gxd.this;
                Function0<Unit> function02 = new Function0<Unit>() { // from class: o.gxd.TaskStackBuilder.4
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* synthetic */ Unit invoke() {
                        KWHzl();
                        return Unit.INSTANCE;
                    }

                    public final void KWHzl() {
                        AbstractC16250egQ abstractC16250egQ5 = activityC21325gxd2.fetchVPNInfo;
                        if (abstractC16250egQ5 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16250egQ5 = null;
                        }
                        android.widget.ImageView imageViewOLrzqt = abstractC16250egQ5.AkhnZx.OLrzqt();
                        imageViewOLrzqt.setImageResource(C52761wXj.TaskDescription.QIZEnU);
                        imageViewOLrzqt.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
                    }
                };
                AnonymousClass2 anonymousClass2 = new Function1<java.lang.Integer, Unit>() { // from class: o.gxd.TaskStackBuilder.2
                    public final void copydefault(int i2) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(java.lang.Integer num) {
                        copydefault(num.intValue());
                        return Unit.INSTANCE;
                    }
                };
                final ActivityC21325gxd activityC21325gxd3 = ActivityC21325gxd.this;
                final java.util.List<C21261gwS> list2 = this.OLrzqt;
                c21256gwN.AEQbTJ((64 & 1) != 0 ? null : c55244xgL, (64 & 2) != 0 ? 2 : i, list, height, function0, (64 & 32) != 0 ? null : function02, (64 & 64) != 0 ? null : anonymousClass2, (64 & 128) != 0 ? false : false, new Function1<C21261gwS, Unit>() { // from class: o.gxd.TaskStackBuilder.5
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(C21261gwS c21261gwS) {
                        OLrzqt(c21261gwS);
                        return Unit.INSTANCE;
                    }

                    public final void OLrzqt(C21261gwS c21261gwS) {
                        Intrinsics.checkNotNullParameter(c21261gwS, "");
                        int iKWHzl = activityC21325gxd3.KWHzl(true, c21261gwS, list2);
                        AbstractC16250egQ abstractC16250egQ5 = activityC21325gxd3.fetchVPNInfo;
                        if (abstractC16250egQ5 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC16250egQ5 = null;
                        }
                        abstractC16250egQ5.getFieldNames.setCurrentItem(iKWHzl, true);
                    }
                });
            } catch (java.lang.Exception e) {
                pUU.copydefault(ActivityC21325gxd.this.getTAG(), "Error showing overview popup: " + e.getMessage());
            }
        }
    }

    public final C10854bwM EZpvd(C10525bqB c10525bqB) {
        C10954byG c10954byG = C10954byG.EZpvd;
        java.lang.Object obj = null;
        C10854bwM c10854bwMKWHzl = c10954byG.valueOf().KWHzl(c10525bqB != null ? java.lang.Long.valueOf(c10525bqB.OLrzqt()) : null);
        if (c10854bwMKWHzl == null || !c10854bwMKWHzl.DCUTEIddSDPG() || !c10854bwMKWHzl.dxcTrN() || c10854bwMKWHzl.OLrzqt().length() != 0) {
            return c10854bwMKWHzl;
        }
        java.util.Iterator<T> it = c10954byG.valueOf().AEQbTJ(c10854bwMKWHzl.fJNWhG()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((C10854bwM) next).OLrzqt().length() > 0) {
                obj = next;
                break;
            }
        }
        return (C10854bwM) obj;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OLrzqt = false;
        EZpvd = false;
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).EZpvd(this);
    }

    @Override // com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker.TaskDescription
    public void KWHzl() {
        if (OLrzqt) {
            OLrzqt = false;
            C10854bwM c10854bwMKWHzl = C11627cVg.KWHzl.AEQbTJ(C10953byF.KWHzl.EZpvd(this.fIwbmz), true);
            if (c10854bwMKWHzl == null || !c10854bwMKWHzl.dxcTrN()) {
                return;
            }
            this.AkhnZx.post(new java.lang.Runnable() { // from class: o.gxp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC21325gxd.AhwBna(this.KWHzl);
                }
            });
            AbstractC58185ywX<C10405bno> abstractC58185ywXEZpvd = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(false, (java.lang.Integer) 0);
            final Function1 function1 = new Function1() { // from class: o.gxt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC21325gxd.AEQbTJ(this.copydefault, (C10405bno) obj);
                }
            };
            InterfaceC58227yxM<? super C10405bno> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.gxy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC21325gxd.AuCTelauCTel(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.gxx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC21325gxd.AhwBna(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            };
            addDisposable(abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.gxv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    ActivityC21325gxd.wlaJM(function12, obj);
                }
            }));
        }
    }

    public static final void AhwBna(ActivityC21325gxd activityC21325gxd) {
        activityC21325gxd.showLoadingAtOnceCannotCancel();
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(ActivityC21325gxd activityC21325gxd, C10405bno c10405bno) {
        activityC21325gxd.valueOf();
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(ActivityC21325gxd activityC21325gxd, java.lang.Throwable th) {
        pUU.copydefault(activityC21325gxd.getTAG(), "onSuccess error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.gBT
    public void AkhnZx() {
        C10854bwM c10854bwMKWHzl;
        final C10525bqB c10525bqBEZpvd = EZpvd().EZpvd();
        if (c10525bqBEZpvd == null || (c10854bwMKWHzl = c10525bqBEZpvd.KWHzl().KWHzl()) == null) {
            return;
        }
        final long jAEQbTJ = c10854bwMKWHzl.AEQbTJ();
        java.lang.String strDbNXlk = c10525bqBEZpvd.values().DbNXlk();
        java.lang.String strZuBGHE = c10525bqBEZpvd.zuBGHE();
        long jOLrzqt = c10525bqBEZpvd.OLrzqt();
        if (c10525bqBEZpvd.KWHzl().dxcTrN()) {
            C19429gCa c19429gCaOLrzqt = C19429gCa.Companion.OLrzqt(jOLrzqt, jAEQbTJ, strDbNXlk, strZuBGHE, (16 & 16) != 0 ? false : false);
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C19429gCa.show$default(c19429gCaOLrzqt, supportFragmentManager, getTAG(), new yHO() { // from class: o.gxs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return ActivityC21325gxd.copydefault(this.copydefault, jAEQbTJ, c10525bqBEZpvd, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, null, 8, null);
            return;
        }
        ViewOnClickListenerC19442gCn viewOnClickListenerC19442gCnCopydefault = ViewOnClickListenerC19442gCn.Companion.copydefault(jAEQbTJ, strDbNXlk, strZuBGHE, this.valueOf);
        androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
        viewOnClickListenerC19442gCnCopydefault.AEQbTJ(supportFragmentManager2, getTAG(), new yHO() { // from class: o.gxr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return ActivityC21325gxd.KWHzl(this.KWHzl, jAEQbTJ, c10525bqBEZpvd, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue(), ((java.lang.Boolean) obj3).booleanValue());
            }
        });
    }

    public static final Unit copydefault(ActivityC21325gxd activityC21325gxd, long j, C10525bqB c10525bqB, java.lang.String str, java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        modifyRelatedChainIdAddress$default(activityC21325gxd, j, str, i, c10525bqB, false, 16, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC21325gxd activityC21325gxd, long j, C10525bqB c10525bqB, java.lang.String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC21325gxd.copydefault(j, str, i, c10525bqB, true);
        return Unit.INSTANCE;
    }

    @Override // o.gBT
    public void showGuild(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C10525bqB c10525bqBEZpvd = EZpvd().EZpvd();
        if (c10525bqBEZpvd != null) {
            AEQbTJ(c10525bqBEZpvd, view);
        }
    }

    public final java.util.List<C10525bqB> KWHzl(java.util.List<C10525bqB> list, long j) {
        if (j == Long.MIN_VALUE) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((C10525bqB) obj).AEQbTJ() == j) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final long AEQbTJ(AbstractC12782ctV abstractC12782ctV, java.util.ArrayList<C10525bqB> arrayList) {
        C10854bwM c10854bwMKWHzl;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (C33129mqd.AEQbTJ(((C10525bqB) it.next()).fIwbmz(), 0)) {
                    return -1L;
                }
            }
        }
        C10525bqB c10525bqB = (C10525bqB) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (Intrinsics.EZpvd((java.lang.Object) ((c10525bqB == null || (c10854bwMKWHzl = c10525bqB.KWHzl()) == null) ? null : c10854bwMKWHzl.fJNWhG()), (java.lang.Object) "USDG")) {
            return (abstractC12782ctV.AubY() || abstractC12782ctV.AwvSrB()) ? 25034771L : -1L;
        }
        InterfaceC25424iwU interfaceC25424iwUDbNXlk = DbNXlk();
        if (interfaceC25424iwUDbNXlk == null) {
            return -1L;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((C10525bqB) it2.next()).OLrzqt()));
        }
        DeFiApyDataInfoData deFiApyDataInfoDataOLrzqt = interfaceC25424iwUDbNXlk.OLrzqt(arrayList2);
        if (deFiApyDataInfoDataOLrzqt != null) {
            return deFiApyDataInfoDataOLrzqt.getCoinId();
        }
        return -1L;
    }

    public static final Unit AEQbTJ(android.view.View view, java.util.List list) {
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((AddressData) obj).isSupported()) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final C52812wZg c52812wZg = new C52812wZg(context);
            C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
            if (c52794wYpAkhnZx != null) {
                c52794wYpAkhnZx.setVisibility(8);
            }
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
            stateListAnimator.EZpvd(1);
            stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C13754dXa.FragmentManager.onRepeatModeChanged));
            stateListAnimator.OLrzqt(C33069mpW.copydefault(C13754dXa.FragmentManager.onQueueTitleChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(size)))));
            stateListAnimator.OLrzqt(10);
            c52812wZg.AEQbTJ(stateListAnimator);
            c52812wZg.OLrzqt(1);
            c52812wZg.fARcdN();
            C52794wYp c52794wYpIsConnected = c52812wZg.isConnected();
            if (c52794wYpIsConnected != null) {
                c52794wYpIsConnected.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ITrustedWebActivityService));
            }
            C52794wYp c52794wYpIsConnected2 = c52812wZg.isConnected();
            if (c52794wYpIsConnected2 != null) {
                c52794wYpIsConnected2.setOnClickListener(new View.OnClickListener() { // from class: o.gxq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view2) {
                        ActivityC21325gxd.EZpvd(c52812wZg, view2);
                    }
                });
            }
            gFE.OLrzqt.copydefault(false);
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
