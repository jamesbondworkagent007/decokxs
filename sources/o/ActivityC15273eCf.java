package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.api.model.tx.signdata.EVMAuthorization;
import com.okinc.business.defi.api.model.tx.signdata.EVMContractSignData;
import com.okinc.business.defi.biz.core.ws.channel.WalletTxHistorySubManager;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702ChainStatus;
import com.okinc.business.defi.wallet.eip7702.ui.activity.EIP7702OnboardingActivity$observeUIState$1;
import com.okinc.business.defi.wallet.eip7702.ui.activity.EIP7702OnboardingActivity$observeUIState$2;
import com.okinc.business.defi.wallet.eip7702.ui.activity.EIP7702OnboardingActivity$observeUIState$3;
import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC54855xXv;
import o.xWX;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC15273eCf extends AbstractActivityC33013moT {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.eCk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC15273eCf.EZpvd();
        }
    });
    public final Fragment KWHzl = new Fragment(new xZA(0, 300, null, 4, null));
    public AbstractC16301ehO OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.eCf$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EIP7702ChainStatus.values().length];
            try {
                iArr[EIP7702ChainStatus.NeedUpgrade.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EIP7702ChainStatus.UpgradedOKX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[EIP7702ChainStatus.UpgradedNonOKX.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public ActivityC15273eCf() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(eCD.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.eip7702.ui.activity.EIP7702OnboardingActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.eCi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15273eCf.valueOf(this.EZpvd);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.eip7702.ui.activity.EIP7702OnboardingActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.eCf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eCf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            context.startActivity(new android.content.Intent(context, (java.lang.Class<?>) ActivityC15273eCf.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C59534zip EZpvd() {
        return new C59534zip();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C59534zip KWHzl() {
        return (C59534zip) this.AEQbTJ.getValue();
    }

    public final eCD copydefault() {
        return (eCD) this.copydefault.getValue();
    }

    public static final eCD EZpvd(ActivityC15273eCf activityC15273eCf, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        android.content.Context applicationContext = activityC15273eCf.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return new eCD(C13458dMb.EZpvd(applicationContext).OcIXYQ(), C10954byG.EZpvd.valueOf(), Dispatchers.getIO(), new C15272eCe(null, 1, null));
    }

    /* JADX INFO: renamed from: o.eCf$Fragment */
    public static final class Fragment extends xZF.TaskDescription<WalletTxHistorySubManager.SubResponse> {
        public Fragment(xZA xza) {
            super("TxHistorySub-eip7702Upgrade", xza);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletTxHistorySubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ActivityC15273eCf activityC15273eCf = ActivityC15273eCf.this;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return;
            }
            for (WalletTxHistorySubManager.SubResponse subResponse : list) {
                eCD ecdCopydefault = activityC15273eCf.copydefault();
                java.lang.String address = subResponse.getAddress();
                if (address == null) {
                    address = "";
                }
                if (ecdCopydefault.AEQbTJ(address) && subResponse.isTxTypeEIP7702Authorization()) {
                    ActivityC15273eCf.this.copydefault().valueOf();
                    return;
                }
            }
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC16301ehO abstractC16301ehOCopydefault = AbstractC16301ehO.copydefault(getLayoutInflater());
        this.OLrzqt = abstractC16301ehOCopydefault;
        if (abstractC16301ehOCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC16301ehOCopydefault = null;
        }
        AEQbTJ(abstractC16301ehOCopydefault);
        gEmmrt();
        copydefault().KWHzl();
        OLrzqt();
        C11205cFp.EZpvd.AxsJAY().AEQbTJ(this.KWHzl);
    }

    public final void AEQbTJ(AbstractC16301ehO abstractC16301ehO) {
        setContentView(abstractC16301ehO.getRoot());
        android.widget.ImageView imageView = abstractC16301ehO.valueOf;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        AppCompatTextView appCompatTextView = abstractC16301ehO.gEmmrt;
        appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, this));
        android.widget.ImageView imageView2 = abstractC16301ehO.KWHzl;
        imageView2.setOnClickListener(new StateListAnimator(imageView2, 1000L, this));
        C16797eqh c16797eqh = abstractC16301ehO.OLrzqt;
        c16797eqh.OLrzqt.setImageResource(C52761wXj.TaskDescription.RjCdvpRjCdvp);
        c16797eqh.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase6));
        c16797eqh.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplApi26));
        C16797eqh c16797eqh2 = abstractC16301ehO.EZpvd;
        c16797eqh2.OLrzqt.setImageResource(C52761wXj.TaskDescription.ZGRCNj);
        c16797eqh2.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection));
        c16797eqh2.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.isCurrent));
        C16797eqh c16797eqh3 = abstractC16301ehO.copydefault;
        c16797eqh3.OLrzqt.setImageResource(C52761wXj.TaskDescription.DDxOgT);
        c16797eqh3.EZpvd.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaBrowserCompatMediaBrowserImplBase4));
        c16797eqh3.KWHzl.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.dump));
        abstractC16301ehO.djBIcL.setAdapter(KWHzl());
    }

    /* JADX INFO: renamed from: o.eCf$FragmentManager */
    public static final class FragmentManager implements Function1<EventParamsList, Unit> {
        public static final FragmentManager KWHzl = new FragmentManager();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            EZpvd(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void EZpvd(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("terminal", "android", true);
        }
    }

    /* JADX INFO: renamed from: o.eCf$Dialog */
    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog OLrzqt = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("terminal", "android", true);
        }
    }

    private final void gEmmrt() {
        KWHzl().register(EIP7702UIState.Activity.class, new eCA(new Function1() { // from class: o.eCq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15273eCf.KWHzl(this.copydefault, (EIP7702UIState.Activity) obj);
            }
        }));
        KWHzl().register(EIP7702UIState.UnavailableWallet.class, new eCB(new Function0() { // from class: o.eCp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15273eCf.AhwBna(this.EZpvd);
            }
        }));
        KWHzl().register(EIP7702UIState.Application.class, new C15291eCx());
        KWHzl().register(EIP7702UIState.StateListAnimator.class, new C15292eCy(new Function0() { // from class: o.eCn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC15273eCf.AYXKKw(this.copydefault);
            }
        }));
    }

    public static final Unit KWHzl(final ActivityC15273eCf activityC15273eCf, final EIP7702UIState.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final EIP7702ChainStatusResp.ChainStatusItem chainStatusItemAEQbTJ = activity.AEQbTJ();
        int i = TaskDescription.EZpvd[EIP7702ChainStatus.Companion.copydefault(java.lang.Integer.valueOf(chainStatusItemAEQbTJ.getStatus())).ordinal()];
        if (i == 1) {
            activityC15273eCf.copydefault(activity.KWHzl(), activity.OLrzqt(), chainStatusItemAEQbTJ.getContractAddress(), chainStatusItemAEQbTJ.getContractData());
            activityC15273eCf.KWHzl("upgrade", activity.KWHzl());
        } else if (i == 2) {
            activityC15273eCf.copydefault(activity.KWHzl(), activity.OLrzqt(), chainStatusItemAEQbTJ.getRevokeContractAddress(), chainStatusItemAEQbTJ.getRevokeContractData());
            activityC15273eCf.KWHzl("revokeokx7702", activity.KWHzl());
        } else if (i == 3) {
            C15287eCt c15287eCtKWHzl = C15287eCt.Companion.KWHzl();
            androidx.fragment.app.FragmentManager supportFragmentManager = activityC15273eCf.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c15287eCtKWHzl.AEQbTJ(supportFragmentManager, new Function1() { // from class: o.eCr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ActivityC15273eCf.KWHzl(this.AEQbTJ, activity, chainStatusItemAEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.eCf$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC15273eCf KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC15273eCf activityC15273eCf) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = activityC15273eCf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AhwBna();
                C32866mlf.onEvent$default("UpgradePage7702_Wallet_AccountModeSwitch_Click", (TrackChannel[]) null, FragmentManager.KWHzl, 1, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.eCf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC15273eCf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC15273eCf activityC15273eCf) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = activityC15273eCf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.eCf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ActivityC15273eCf AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, ActivityC15273eCf activityC15273eCf) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = activityC15273eCf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.AEQbTJ.getMActivity(), BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.isCaptioningEnabled)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
                C32866mlf.onEvent$default("UpgradePage7702_Wallet_Info_Click", (TrackChannel[]) null, Dialog.OLrzqt, 1, (java.lang.Object) null);
            }
        }
    }

    public static final Unit KWHzl(ActivityC15273eCf activityC15273eCf, EIP7702UIState.Activity activity, EIP7702ChainStatusResp.ChainStatusItem chainStatusItem, int i) {
        if (i == 1) {
            activityC15273eCf.copydefault(activity.KWHzl(), activity.OLrzqt(), chainStatusItem.getContractAddress(), chainStatusItem.getContractData());
            activityC15273eCf.KWHzl("applyokx7702", activity.KWHzl());
        } else if (i == 2) {
            activityC15273eCf.copydefault(activity.KWHzl(), activity.OLrzqt(), chainStatusItem.getRevokeContractAddress(), chainStatusItem.getRevokeContractData());
            activityC15273eCf.KWHzl("revokeothers", activity.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(ActivityC15273eCf activityC15273eCf) {
        activityC15273eCf.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ActivityC15273eCf activityC15273eCf) {
        activityC15273eCf.copydefault().valueOf();
        return Unit.INSTANCE;
    }

    private final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EIP7702OnboardingActivity$observeUIState$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EIP7702OnboardingActivity$observeUIState$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EIP7702OnboardingActivity$observeUIState$3(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, supportFragmentManager, new CurrentWalletSwitchConfig(new CurrentWalletSelectMode.WalletSelectedById(copydefault().AEQbTJ()), CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.OnBackPressedCallback), null, 1, null, null, 208, null), new Function2() { // from class: o.eCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(ActivityC15273eCf.OLrzqt((InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new PendingIntent(), 8, null);
    }

    public static final boolean OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return eCC.OLrzqt(interfaceC9738bbJ);
    }

    /* JADX INFO: renamed from: o.eCf$PendingIntent */
    public static final class PendingIntent implements InterfaceC54855xXv {
        public PendingIntent() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            ActivityC15273eCf.this.copydefault().copydefault(interfaceC9738bbJ);
        }
    }

    public final void copydefault(long j, long j2, java.lang.String str, java.lang.String str2) {
        eCG.OLrzqt.KWHzl(this, copydefault().AEQbTJ(), j, new EVMContractSignData(null, null, null, null, copydefault().EZpvd(j), str2, null, null, null, null, null, null, null, C56402yEa.EZpvd(new EVMAuthorization(C33491mxU.copydefault(java.lang.String.valueOf(j2)), str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 60, (DefaultConstructorMarker) null)), 8143, null), null, new Function1() { // from class: o.eCl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15273eCf.EZpvd(this.KWHzl, (android.os.Bundle) obj);
            }
        });
    }

    public static final Unit EZpvd(ActivityC15273eCf activityC15273eCf, android.os.Bundle bundle) {
        if (bundle != null) {
            activityC15273eCf.copydefault().valueOf();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.lang.String str, final long j) {
        C32866mlf.onEvent$default("UpgradePage7702_Wallet_List_Click", (TrackChannel[]) null, new Function1() { // from class: o.eCj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15273eCf.AEQbTJ(str, j, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(java.lang.String str, long j, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("button7702", str, true);
        EventParamsList.put$default(eventParamsList, "network_filter", C33129mqd.gEmmrt(java.lang.Long.valueOf(j)), false, 4, null);
        eventParamsList.put("terminal", "android", true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C11205cFp.EZpvd.AxsJAY().OLrzqt(this.KWHzl);
    }

    public static final ViewModelProvider.Factory valueOf(final ActivityC15273eCf activityC15273eCf) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(eCD.class), new Function1() { // from class: o.eCo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC15273eCf.EZpvd(this.OLrzqt, (CreationExtras) obj);
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
