package o;

import android.content.Intent;
import android.os.Build;
import androidx.core.content.ContextCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.common.NewWalletType;
import com.okinc.business.defi.wallet.mine.AddWalletActivity$initListeners$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.rxutils.SubHelper;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import com.okinc.wallet.api.bean.SupportedNetworkType;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC18816fpZ;
import o.ActivityC18501fjb;
import o.C18508fji;
import o.C52761wXj;
import o.C57032yak;
import o.InterfaceC9739bbK;
import o.xXH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fjb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18501fjb extends AbstractActivityC33013moT implements C57032yak.TaskDescription {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public C16234egA KWHzl;
    public final InterfaceC56387yDm djBIcL;
    public int EZpvd = 1;
    public java.lang.String AYXKKw = "";
    public final java.lang.Object copydefault = new java.lang.Object();

    /* JADX INFO: renamed from: o.fjb$StateListAnimator */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[NewWalletType.values().length];
            try {
                iArr[NewWalletType.CREATE_WALLET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[NewWalletType.IMPORT_WALLET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void OLrzqt(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        this.AEQbTJ = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C57032yak.TaskDescription
    public void copydefault(@NotNull InterfaceC57036yao interfaceC57036yao) {
        Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
        this.AEQbTJ = true;
    }

    public ActivityC18501fjb() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(C19302fyi.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.AddWalletActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.fjd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18501fjb.AuCTel();
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.AddWalletActivity$special$$inlined$viewModels$default$3
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
        this.AhwBna = new ViewModelLazy(C56524yIo.AEQbTJ(C19629gJl.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.mine.AddWalletActivity$special$$inlined$viewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.mine.AddWalletActivity$special$$inlined$viewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.mine.AddWalletActivity$special$$inlined$viewModels$default$6
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

    public final C19302fyi AEQbTJ() {
        return (C19302fyi) this.djBIcL.getValue();
    }

    public static final C19302fyi copydefault(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new C19302fyi(SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    private final C19629gJl djBIcL() {
        return (C19629gJl) this.AhwBna.getValue();
    }

    private final java.util.List<UnsupportedWalletType> AYXKKw() {
        java.util.ArrayList parcelableArrayList;
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            parcelableArrayList = null;
        } else if (Build.VERSION.SDK_INT >= 33) {
            parcelableArrayList = extras.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES", UnsupportedWalletType.class);
        } else {
            parcelableArrayList = extras.getParcelableArrayList("UNSUPPORTED_WALLET_TYPES");
        }
        return parcelableArrayList == null ? yDY.AhwBna() : parcelableArrayList;
    }

    private final java.util.List<SupportedNetworkType> gEmmrt() {
        android.os.Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            return extras.getParcelableArrayList("SUPPORTED_NETWORK_TYPES", SupportedNetworkType.class);
        }
        return extras.getParcelableArrayList("SUPPORTED_NETWORK_TYPES");
    }

    /* JADX INFO: renamed from: o.fjb$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fjb.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault(@NotNull android.content.Context context, java.lang.String str, java.util.List<SupportedNetworkType> list, @NotNull java.util.List<? extends UnsupportedWalletType> list2, boolean z, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list2, "");
            context.startActivity(OLrzqt(context, str, list, list2, z, i));
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.util.List<SupportedNetworkType> list, @NotNull java.util.List<? extends UnsupportedWalletType> list2, boolean z, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18501fjb.class);
            if (str != null) {
                intent.putExtra("title", str);
            }
            if (list != null) {
                intent.putExtra("SUPPORTED_NETWORK_TYPES", new java.util.ArrayList(list));
            }
            intent.putExtra("UNSUPPORTED_WALLET_TYPES", new java.util.ArrayList(list2));
            intent.putExtra("showWatchOnlyWallet", z);
            intent.putExtra(OtcExtraKeys.MODE, i);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C16234egA c16234egA;
        android.widget.TextView textView;
        super.onCreate(bundle);
        this.KWHzl = C16234egA.EZpvd(getLayoutInflater());
        this.EZpvd = getIntent().getIntExtra(OtcExtraKeys.MODE, 1);
        C16234egA c16234egA2 = this.KWHzl;
        setContentView(c16234egA2 != null ? c16234egA2.getRoot() : null);
        java.lang.String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra != null && stringExtra.length() != 0 && (c16234egA = this.KWHzl) != null && (textView = c16234egA.OLrzqt) != null) {
            textView.setText(stringExtra);
        }
        fetchVPNInfo();
        AkhnZx();
        DbNXlk();
        values();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.AEQbTJ) {
            this.AEQbTJ = false;
            C57032yak.AEQbTJ.KWHzl(this);
            ActivityC15363eFo.Companion.KWHzl(this, this.EZpvd, "from_import");
        }
    }

    private final void AkhnZx() {
        StateFlow<java.util.List<AbstractC18816fpZ>> stateFlowKWHzl = AEQbTJ().KWHzl();
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        FlowKt.launchIn(FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(stateFlowKWHzl, lifecycle, null, 2, null), new AddWalletActivity$initListeners$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void fetchVPNInfo() {
        RecyclerView recyclerView;
        C14780drs c14780drs = new C14780drs(null, new Function1() { // from class: o.fjl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18501fjb.copydefault(this.AEQbTJ, (AbstractC18816fpZ) obj);
            }
        }, 1, 0 == true ? 1 : 0);
        C16234egA c16234egA = this.KWHzl;
        if (c16234egA == null || (recyclerView = c16234egA.EZpvd) == null) {
            return;
        }
        recyclerView.setAdapter(c14780drs);
    }

    public static final Unit copydefault(ActivityC18501fjb activityC18501fjb, AbstractC18816fpZ abstractC18816fpZ) {
        Intrinsics.checkNotNullParameter(abstractC18816fpZ, "");
        if (abstractC18816fpZ instanceof AbstractC18816fpZ.TaskDescription) {
            activityC18501fjb.KWHzl("create");
            activityC18501fjb.OLrzqt();
        } else if (abstractC18816fpZ instanceof AbstractC18816fpZ.Activity) {
            C32866mlf.onEvent$default("app_user_WalletManagement_ImportWallet_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            activityC18501fjb.KWHzl(Web3SecurityTrackEvent.VALUE_IMPORT);
            activityC18501fjb.OLrzqt("", NewWalletType.IMPORT_WALLET);
        } else if (abstractC18816fpZ instanceof AbstractC18816fpZ.ActionBar) {
            C32866mlf.onEvent$default("Web3WalletAddWallet_Full_Button_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            activityC18501fjb.KWHzl("hardware");
            activityC18501fjb.valueOf();
        } else {
            if (!(abstractC18816fpZ instanceof AbstractC18816fpZ.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            C32866mlf.onEvent$default("app_user_WalletManagement_ObserveWallet_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            activityC18501fjb.KWHzl("watch_only");
            ActivityC16031ecJ.Companion.AEQbTJ(activityC18501fjb);
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        dTU.OLrzqt("Web3WalletManagement_AddWalletList_Card_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), new Function1() { // from class: o.fjk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18501fjb.copydefault(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("add_option", str, true));
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str, final NewWalletType newWalletType) {
        showLoading();
        addDisposable(C33024moe.subscribeOnIO$default(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), new Function1() { // from class: o.fjg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18501fjb.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.fje
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18501fjb.copydefault(this.OLrzqt, newWalletType, str, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 2, (java.lang.Object) null));
    }

    public static final Unit copydefault(ActivityC18501fjb activityC18501fjb, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        activityC18501fjb.dismissLoading();
        java.lang.String message = th.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC18501fjb activityC18501fjb, NewWalletType newWalletType, java.lang.String str, boolean z) {
        activityC18501fjb.dismissLoading();
        int i = StateListAnimator.copydefault[newWalletType.ordinal()];
        if (i == 1) {
            if (str == null) {
                str = "";
            }
            activityC18501fjb.AYXKKw = str;
            activityC18501fjb.AhwBna();
        } else if (i == 2) {
            activityC18501fjb.isConnected();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from", "create");
        bundle.putInt(OtcExtraKeys.MODE, this.EZpvd);
        Unit unit = Unit.INSTANCE;
        new C14469dlz(supportFragmentManager, this, bundle, null, new Function1() { // from class: o.fjh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18501fjb.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.fjj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC18501fjb.KWHzl();
            }
        }, null, null, 200, null).EZpvd();
    }

    public static final Unit copydefault(ActivityC18501fjb activityC18501fjb, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18501fjb.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(java.lang.String str) {
        OLrzqt(str, NewWalletType.CREATE_WALLET);
    }

    private final void isConnected() {
        java.util.List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) AYXKKw());
        UnsupportedWalletType unsupportedWalletType = UnsupportedWalletType.HardwareWallet;
        if (!listFJNWhG.contains(unsupportedWalletType)) {
            listFJNWhG.add(unsupportedWalletType);
        }
        C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : this.EZpvd, (226 & 2) != 0 ? false : false, (226 & 4) != 0 ? null : gEmmrt(), (226 & 8) != 0 ? yDY.AhwBna() : listFJNWhG, (226 & 16) == 0 ? false : false, (226 & 32) != 0 ? null : null, (226 & 64) != 0 ? new java.util.ArrayList() : null, (226 & 128) == 0 ? null : null).show(getSupportFragmentManager(), getTAG());
    }

    public final void valueOf() {
        C14541dnR.Companion.copydefault(this.EZpvd).show(getSupportFragmentManager(), getTAG());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gJl.createHDWallet$default(o.gJl, java.lang.String, androidx.fragment.app.FragmentManager, int, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void AhwBna() {
        C19629gJl c19629gJlDjBIcL = djBIcL();
        java.lang.String str = this.AYXKKw;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        C19629gJl.createHDWallet$default(c19629gJlDjBIcL, str, supportFragmentManager, this.EZpvd, null, 8, null);
    }

    private final void DbNXlk() {
        djBIcL().copydefault().observe(this, new C18508fji.TaskDescription(new Function1() { // from class: o.fjf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18501fjb.EZpvd(this.OLrzqt, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit EZpvd(ActivityC18501fjb activityC18501fjb, AbstractC12782ctV abstractC12782ctV) {
        if (activityC18501fjb.EZpvd == 1) {
            activityC18501fjb.setResult(-1);
            activityC18501fjb.finish();
            dZK.AEQbTJ.AEQbTJ(activityC18501fjb, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        }
        return Unit.INSTANCE;
    }

    private final void values() {
        if (this.EZpvd != 1) {
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXH.class, new java.lang.String[0]);
            final java.lang.Object obj = this.copydefault;
            abstractC58185ywXKWHzl.subscribe(new RxBus.EventCallback<xXH>(obj) { // from class: com.okinc.business.defi.wallet.mine.AddWalletActivity$observeWalletAddedEvent$1
                /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
                @Override // com.okinc.rxutils.RxBus.EventCallback
                public void onEvent(xXH xxh) {
                    if (xxh == null || this.this$0.isFinishing()) {
                        return;
                    }
                    int i = Intrinsics.EZpvd((Object) xxh.OLrzqt(), (Object) "from_create") ? 1 : 2;
                    ActivityC18501fjb activityC18501fjb = this.this$0;
                    Intent intent = new Intent();
                    intent.putExtra("walletResultType", i);
                    Unit unit = Unit.INSTANCE;
                    activityC18501fjb.setResult(-1, intent);
                    this.this$0.finish();
                }
            });
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C57032yak.AEQbTJ.KWHzl(this);
        C15714eSo.Companion.AEQbTJ();
        if (this.EZpvd != 1) {
            SubHelper.AEQbTJ(this.copydefault);
        }
    }

    @Override // o.C57032yak.TaskDescription
    public void EZpvd(@NotNull BluetoothDeviceModel bluetoothDeviceModel) {
        Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
        C13992dcz.AEQbTJ.EZpvd(bluetoothDeviceModel);
        this.AEQbTJ = false;
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        int color = ContextCompat.getColor(this, C52761wXj.Activity.copydefault);
        boolean z = !C33492mxV.OLrzqt();
        C33567myr.AEQbTJ(this, z);
        getWindow().setNavigationBarColor(color);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory AuCTel() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(C19302fyi.class), new Function1() { // from class: o.fjc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC18501fjb.copydefault((CreationExtras) obj);
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
    public void onStart() {
        super.onStart();
    }
}
