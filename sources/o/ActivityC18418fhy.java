package o;

import android.view.View;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.widget.TextViewCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$initObserver$3;
import com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$onCreate$5$1;
import com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$onCreate$5$2;
import com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$onCreate$6;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C13754dXa;
import o.C18120fcR;
import o.C52761wXj;
import o.InterfaceC18392fhY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC18418fhy extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static InterfaceC14457dln KWHzl;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public C16292ehF OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.fhy$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    public static final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
    }

    public ActivityC18418fhy() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(C18380fhM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.fhE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18418fhy.isConnected();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$3
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
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(C16102edb.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$5
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
        }, new Function0() { // from class: o.fhC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18418fhy.AEQbTJ();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$6
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
        this.AYXKKw = new ViewModelLazy(C56524yIo.AEQbTJ(C19631gJn.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.imported.DefiWalletSelectNetworkActivity$special$$inlined$viewModels$default$9
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

    /* JADX INFO: renamed from: o.fhy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fhy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void OLrzqt(InterfaceC14457dln interfaceC14457dln) {
            ActivityC18418fhy.KWHzl = interfaceC14457dln;
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, boolean z, boolean z2, InterfaceC14457dln interfaceC14457dln, java.util.List<SupportedNetworkType> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18418fhy.class);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            intent.putExtra("isSmartContract", z);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, str2);
            intent.putExtra(MTAnalysisConstants.Account.KEY_ACCOUNT, str3);
            intent.putExtra(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY, str4);
            intent.putExtra(OtcExtraKeys.MODE, i);
            intent.putExtra("is_near_short_address", z2);
            if (list != null) {
                intent.putExtra("SUPPORTED_NETWORK_TYPES", new java.util.ArrayList(list));
            }
            OLrzqt(interfaceC14457dln);
            context.startActivity(intent);
        }
    }

    public final C18380fhM KWHzl() {
        return (C18380fhM) this.copydefault.getValue();
    }

    public static final C18380fhM copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C18380fhM(new C18374fhG(null, null, null, null, null, null, 63, null), new C18373fhF(null, null, null, 7, null), SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    private final boolean AkhnZx() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isSmartContract", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String AYXKKw() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(Web3SecurityTrackEvent.VALUE_PRIVATE_KEY) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    private final int gEmmrt() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra(OtcExtraKeys.MODE, 1);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String djBIcL() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD) : null;
        return stringExtra == null ? "" : stringExtra;
    }

    public static final ViewModelProvider.Factory AEQbTJ() {
        return C16102edb.Companion.OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C16102edb AhwBna() {
        return (C16102edb) this.AEQbTJ.getValue();
    }

    private final C19631gJn valueOf() {
        return (C19631gJn) this.AYXKKw.getValue();
    }

    public final java.lang.String EZpvd() {
        return AYXKKw().length() == 0 ? "watch_wallet" : Web3SecurityTrackEvent.VALUE_PRIVATE_KEY;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C52794wYp c52794wYp;
        C33537myN c33537myN;
        android.widget.TextView title;
        super.onCreate(bundle);
        C16292ehF c16292ehFKWHzl = C16292ehF.KWHzl(getLayoutInflater());
        this.OLrzqt = c16292ehFKWHzl;
        setContentView(c16292ehFKWHzl != null ? c16292ehFKWHzl.getRoot() : null);
        showLoading();
        C32866mlf.onEvent$default("Web3SelectNetwork_Full_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fhx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18418fhy.KWHzl(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C16292ehF c16292ehF = this.OLrzqt;
        if (c16292ehF != null && (c33537myN = c16292ehF.AEQbTJ) != null && (title = c33537myN.getTitle()) != null) {
            TextViewCompat.setTextAppearance(title, C52761wXj.LoaderManager.OHqIaq);
        }
        C16292ehF c16292ehF2 = this.OLrzqt;
        if (c16292ehF2 != null && (c52794wYp = c16292ehF2.EZpvd) != null) {
            c52794wYp.setOnClickListener(new Application(c52794wYp, 5000L, this));
        }
        DbNXlk();
        C16292ehF c16292ehF3 = this.OLrzqt;
        if (c16292ehF3 != null && (recyclerView2 = c16292ehF3.copydefault) != null) {
            recyclerView2.addItemDecoration(new TaskDescription());
        }
        C16292ehF c16292ehF4 = this.OLrzqt;
        if (c16292ehF4 != null && (recyclerView = c16292ehF4.copydefault) != null) {
            C59534zip c59534zip = new C59534zip();
            c59534zip.register(InterfaceC18392fhY.Application.class, new C18378fhK(new DefiWalletSelectNetworkActivity$onCreate$5$1(KWHzl())));
            c59534zip.register(InterfaceC18392fhY.ActionBar.class, new C18383fhP(new DefiWalletSelectNetworkActivity$onCreate$5$2(KWHzl()), new Function1() { // from class: o.fhw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC18418fhy.EZpvd(this.copydefault, (InterfaceC18392fhY.ActionBar) obj);
                }
            }));
            c59534zip.register(C18375fhH.class, new C18376fhI());
            recyclerView.setAdapter(c59534zip);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletSelectNetworkActivity$onCreate$6(this, null), 3, null);
    }

    public static final Unit KWHzl(ActivityC18418fhy activityC18418fhy, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("wallet_type", activityC18418fhy.EZpvd(), true));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fhy$Activity */
    public static final class Activity implements Function1<EventParamsList, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            AEQbTJ(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.add(new EventParam("wallet_type", ActivityC18418fhy.this.EZpvd(), true));
            eventParamsList.add(new EventParam(EopTrackEvent.KEY_BUTTON_NAME, Web3SecurityTrackEvent.VALUE_CONFIRM, true));
            C14494dmX.addIsExchangeUserParam$default(C14494dmX.KWHzl, eventParamsList, false, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.fhy$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ItemDecoration {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            super.getItemOffsets(rect, view, recyclerView, state);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (recyclerView.getAdapter() == null || childAdapterPosition != r4.getItemCount() - 1) {
                rect.bottom = C55298xhM.OLrzqt(12, (android.content.Context) ActivityC18418fhy.this);
            }
        }
    }

    /* JADX INFO: renamed from: o.fhy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC18418fhy copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC18418fhy activityC18418fhy) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = activityC18418fhy;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3SelectNetwork_Full_Button_Click", (TrackChannel[]) null, this.copydefault.new Activity(), 1, (java.lang.Object) null);
                InterfaceC18392fhY interfaceC18392fhYCopydefault = this.copydefault.KWHzl().copydefault();
                if (interfaceC18392fhYCopydefault == null) {
                    return;
                }
                if (this.copydefault.AYXKKw().length() != 0) {
                    ActivityC18418fhy activityC18418fhy = this.copydefault;
                    activityC18418fhy.OLrzqt(activityC18418fhy.djBIcL(), interfaceC18392fhYCopydefault.EZpvd().KWHzl());
                } else {
                    this.copydefault.showLoading();
                    this.copydefault.AhwBna().OLrzqt(interfaceC18392fhYCopydefault.EZpvd().EZpvd(), interfaceC18392fhYCopydefault.EZpvd().KWHzl());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit EZpvd(ActivityC18418fhy activityC18418fhy, InterfaceC18392fhY.ActionBar actionBar) {
        int i;
        Intrinsics.checkNotNullParameter(actionBar, "");
        C18120fcR.ActionBar actionBar2 = C18120fcR.Companion;
        java.util.List<C10854bwM> listOLrzqt = actionBar.EZpvd().OLrzqt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        for (C10854bwM c10854bwM : listOLrzqt) {
            arrayList.add(new DefiOnboardingTile.TokenGroupTile.TokenInfo(c10854bwM.djBIcL(), C18388fhU.AEQbTJ(c10854bwM)));
        }
        int iAEQbTJ = actionBar.EZpvd().AEQbTJ();
        if (iAEQbTJ == 1) {
            i = C13754dXa.FragmentManager.ColorRes;
        } else if (iAEQbTJ == 4) {
            i = C13754dXa.FragmentManager.preparePanel;
        } else if (iAEQbTJ == 5) {
            i = C13754dXa.FragmentManager.getDefaultCipherSuites;
        }
        C18120fcR c18120fcREZpvd = actionBar2.EZpvd(arrayList, i);
        androidx.fragment.app.FragmentManager supportFragmentManager = activityC18418fhy.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c18120fcREZpvd.show(supportFragmentManager);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str, long j) {
        pUU.copydefault("judgeImportPrivateKeyWallet");
        InterfaceC14457dln interfaceC14457dln = KWHzl;
        if (interfaceC14457dln != null) {
            if (interfaceC14457dln instanceof C14462dls) {
                ((C14462dls) interfaceC14457dln).AEQbTJ(this);
            } else if (interfaceC14457dln instanceof C14456dlm) {
                ((C14456dlm) interfaceC14457dln).AEQbTJ(this);
            }
        }
        InterfaceC14457dln c14458dlo = KWHzl;
        if (c14458dlo == null) {
            if (gEmmrt() == 1) {
                c14458dlo = new C14459dlp(this, false, 2, null);
            } else {
                c14458dlo = new C14458dlo(this);
            }
        }
        valueOf().EZpvd(str, j, AYXKKw(), getSupportFragmentManager(), c14458dlo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(long j, java.lang.String str) {
        valueOf().KWHzl(j, str, AkhnZx(), getSupportFragmentManager());
    }

    private final void DbNXlk() {
        valueOf().EZpvd().observe(this, new Observer() { // from class: o.fhA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ActivityC18418fhy.OLrzqt((AbstractC12782ctV) obj);
            }
        });
        valueOf().copydefault().observe(this, new ActionBar(new Function1() { // from class: o.fhD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18418fhy.AEQbTJ(this.KWHzl, (AbstractC12782ctV) obj);
            }
        }));
        StateFlow<C18377fhJ> stateFlowKWHzl = KWHzl().KWHzl();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowKWHzl, lifecycle, null, 2, null), new DefiWalletSelectNetworkActivity$initObserver$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public static final Unit AEQbTJ(ActivityC18418fhy activityC18418fhy, AbstractC12782ctV abstractC12782ctV) {
        dZK.AEQbTJ.AEQbTJ(activityC18418fhy, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        int color = ContextCompat.getColor(this, C52761wXj.Activity.registerUser);
        boolean z = !C33492mxV.OLrzqt();
        C33567myr.AEQbTJ(this, z);
        getWindow().setNavigationBarColor(color);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory isConnected() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C18380fhM.class), new Function1() { // from class: o.fhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18418fhy.copydefault((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
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
