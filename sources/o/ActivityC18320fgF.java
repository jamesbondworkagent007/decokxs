package o;

import android.os.Build;
import android.view.View;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.autofill.HintConstants;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierType;
import com.okinc.business.defi.biz.core.nostrfix.IdentifierTypeNostrFixStatus;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupAddressBean;
import com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import com.okinc.business.defi.biz.drivers.bean.ICloudNetworkListBean;
import com.okinc.business.defi.wallet.icloud.ICloudNetworkListActivity$onCreate$3;
import com.okinc.components.track.TrackChannel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC18320fgF extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public int AYXKKw;
    public AbstractC16384eis AhwBna;
    public HDWalletCloudBackupBean KWHzl;
    public boolean gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public java.lang.String djBIcL = "";
    public final int copydefault = 100;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fgD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC18320fgF.valueOf();
        }
    });
    public java.lang.String EZpvd = "";

    public ActivityC18320fgF() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(C18396fhc.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.icloud.ICloudNetworkListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.icloud.ICloudNetworkListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.icloud.ICloudNetworkListActivity$special$$inlined$viewModels$default$3
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
    public final C43316rmw AEQbTJ() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw valueOf() {
        return new C43316rmw();
    }

    public final C18396fhc copydefault() {
        return (C18396fhc) this.valueOf.getValue();
    }

    private final int KWHzl() {
        android.content.Intent intent = getIntent();
        if (intent != null) {
            return intent.getIntExtra("cloudType", 1);
        }
        return 1;
    }

    /* JADX INFO: renamed from: o.fgF$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fgF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.fgF$Application */
    public static final class Application extends ActivityResultContract<ICloudNetworkListBean, java.lang.Boolean> {
        /* JADX DEBUG: Method merged with bridge method: createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public android.content.Intent createIntent(@NotNull android.content.Context context, @NotNull ICloudNetworkListBean iCloudNetworkListBean) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(iCloudNetworkListBean, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC18320fgF.class);
            intent.putExtra("walletName", iCloudNetworkListBean.getWalletName());
            intent.putExtra("cloudBackupBean", iCloudNetworkListBean.getBackupBean());
            intent.putExtra("onDevice", iCloudNetworkListBean.getOnDevice());
            intent.putExtra("cloudType", iCloudNetworkListBean.getCloudType());
            if (iCloudNetworkListBean.getNoOnDeviceCount() != null) {
                intent.putExtra("noOnDevice", iCloudNetworkListBean.getNoOnDeviceCount());
            }
            return intent;
        }

        /* JADX DEBUG: Method merged with bridge method: parseResult(ILandroid/content/Intent;)Ljava/lang/Object; */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public java.lang.Boolean parseResult(int i, android.content.Intent intent) {
            return java.lang.Boolean.valueOf(intent != null ? intent.getBooleanExtra("icloud_network_list_result", false) : false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void djBIcL() {
        java.lang.String stringExtra;
        HDWalletCloudBackupBean hDWalletCloudBackupBean;
        android.content.Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("walletName")) == null) {
            stringExtra = "";
        }
        this.djBIcL = stringExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            android.content.Intent intent2 = getIntent();
            hDWalletCloudBackupBean = intent2 != null ? (HDWalletCloudBackupBean) intent2.getParcelableExtra("cloudBackupBean", HDWalletCloudBackupBean.class) : null;
        } else {
            android.content.Intent intent3 = getIntent();
            if (intent3 != null) {
                hDWalletCloudBackupBean = (HDWalletCloudBackupBean) intent3.getParcelableExtra("cloudBackupBean");
            }
        }
        this.KWHzl = hDWalletCloudBackupBean;
        android.content.Intent intent4 = getIntent();
        this.gEmmrt = intent4 != null ? intent4.getBooleanExtra("onDevice", false) : false;
        android.content.Intent intent5 = getIntent();
        this.AYXKKw = intent5 != null ? intent5.getIntExtra("noOnDevice", 0) : 0;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        HDWalletBackupTypeBean backupTypeBean;
        java.util.ArrayList<HDWalletBackupAddressBean> addressList;
        HDWalletBackupTypeBean backupTypeBean2;
        super.onCreate(bundle);
        djBIcL();
        AbstractC16384eis abstractC16384eis = (AbstractC16384eis) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.iRxXKY);
        this.AhwBna = abstractC16384eis;
        if (abstractC16384eis == null) {
            Intrinsics.gEmmrt("");
            abstractC16384eis = null;
        }
        abstractC16384eis.copydefault.setTitle(this.djBIcL);
        if (this.gEmmrt) {
            AbstractC16384eis abstractC16384eis2 = this.AhwBna;
            if (abstractC16384eis2 == null) {
                Intrinsics.gEmmrt("");
                abstractC16384eis2 = null;
            }
            abstractC16384eis2.EZpvd.setVisibility(8);
        } else {
            AbstractC16384eis abstractC16384eis3 = this.AhwBna;
            if (abstractC16384eis3 == null) {
                Intrinsics.gEmmrt("");
                abstractC16384eis3 = null;
            }
            abstractC16384eis3.EZpvd.setVisibility(0);
            AbstractC16384eis abstractC16384eis4 = this.AhwBna;
            if (abstractC16384eis4 == null) {
                Intrinsics.gEmmrt("");
                abstractC16384eis4 = null;
            }
            abstractC16384eis4.EZpvd.setPaddingRelative(C55298xhM.dpInt$default(24.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            AbstractC16384eis abstractC16384eis5 = this.AhwBna;
            if (abstractC16384eis5 == null) {
                Intrinsics.gEmmrt("");
                abstractC16384eis5 = null;
            }
            abstractC16384eis5.EZpvd.setType(5);
            AbstractC16384eis abstractC16384eis6 = this.AhwBna;
            if (abstractC16384eis6 == null) {
                Intrinsics.gEmmrt("");
                abstractC16384eis6 = null;
            }
            wYF wyf = abstractC16384eis6.EZpvd;
            wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
        }
        showLoadingWithLogo();
        C18396fhc c18396fhcCopydefault = copydefault();
        HDWalletCloudBackupBean hDWalletCloudBackupBean = this.KWHzl;
        if (hDWalletCloudBackupBean == null || (backupTypeBean = hDWalletCloudBackupBean.getBackupTypeBean()) == null || (addressList = backupTypeBean.getAddressList()) == null) {
            return;
        }
        c18396fhcCopydefault.EZpvd(addressList);
        AbstractC16384eis abstractC16384eis7 = this.AhwBna;
        if (abstractC16384eis7 == null) {
            Intrinsics.gEmmrt("");
            abstractC16384eis7 = null;
        }
        abstractC16384eis7.KWHzl.setLayoutManager(new LinearLayoutManager(this));
        HDWalletCloudBackupBean hDWalletCloudBackupBean2 = this.KWHzl;
        if (hDWalletCloudBackupBean2 != null && (backupTypeBean2 = hDWalletCloudBackupBean2.getBackupTypeBean()) != null && backupTypeBean2.getAddressList() != null) {
            AbstractC16384eis abstractC16384eis8 = this.AhwBna;
            if (abstractC16384eis8 == null) {
                Intrinsics.gEmmrt("");
                abstractC16384eis8 = null;
            }
            abstractC16384eis8.KWHzl.setAdapter(AEQbTJ());
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ICloudNetworkListActivity$onCreate$3(this, null), 3, null);
        AhwBna();
    }

    /* JADX INFO: renamed from: o.fgF$Activity */
    public static final class Activity implements Function1<java.lang.Boolean, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            OLrzqt(bool);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Boolean bool) {
            java.lang.Object objM7377constructorimpl;
            ActivityC18320fgF.this.dismissLoading();
            if (!bool.booleanValue()) {
                ActivityC18320fgF.this.EZpvd();
                return;
            }
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C55326xho.toast$default(C33069mpW.copydefault(C13754dXa.FragmentManager.MediaBrowserCompatItemCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "100"))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) 17, 0, 0, 27, (java.lang.Object) null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Result.m7376boximpl(objM7377constructorimpl);
        }
    }

    /* JADX INFO: renamed from: o.fgF$LoaderManager */
    public static final class LoaderManager implements Function1<java.lang.Throwable, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            ActivityC18320fgF.this.dismissLoading();
            ActivityC18320fgF.this.EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.fgF$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC18320fgF EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC18320fgF activityC18320fgF) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = activityC18320fgF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                C32866mlf.onEvent$default("Web3CloudBackUp_Btm_RestoreWallet_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.EZpvd.showLoading();
                this.EZpvd.addDisposable(C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null).copydefault(new InterfaceC58229yxO(TaskDescription.AEQbTJ) { // from class: o.fgF.Fragment
                    public final /* synthetic */ Function1 EZpvd;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.EZpvd = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                        return this.EZpvd.invoke(obj);
                    }
                }).AEQbTJ(new InterfaceC58227yxM(this.EZpvd.new Activity()) { // from class: o.fgF.Dialog
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }, new InterfaceC58227yxM(this.EZpvd.new LoaderManager()) { // from class: o.fgF.Dialog
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj) {
                        this.AEQbTJ.invoke(obj);
                    }
                }));
            }
        }
    }

    public final void EZpvd() {
        HDWalletCloudBackupBean hDWalletCloudBackupBean = this.KWHzl;
        if (hDWalletCloudBackupBean != null) {
            C18833fpq c18833fpq = new C18833fpq(this);
            c18833fpq.EZpvd(hDWalletCloudBackupBean);
            c18833fpq.EZpvd(KWHzl());
            c18833fpq.KWHzl(new Function2() { // from class: o.fgE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return ActivityC18320fgF.EZpvd(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
                }
            });
            InterfaceC18801fpK interfaceC18801fpKOLrzqt = c18833fpq.OLrzqt(0);
            C18745foG c18745foG = new C18745foG();
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c18745foG.AEQbTJ(supportFragmentManager, interfaceC18801fpKOLrzqt);
        }
    }

    public static final Unit EZpvd(ActivityC18320fgF activityC18320fgF, boolean z, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18320fgF.EZpvd = str;
        if (z) {
            activityC18320fgF.KWHzl(true);
            if (activityC18320fgF.AYXKKw == 1) {
                dZK.AEQbTJ.AEQbTJ(activityC18320fgF, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
                activityC18320fgF.finish();
            } else {
                activityC18320fgF.finish();
            }
        }
        return Unit.INSTANCE;
    }

    private final void AhwBna() {
        AEQbTJ().register(C18333fgS.class, new C18332fgR());
        AEQbTJ().register(C18339fgY.class, new C18340fgZ());
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, HDWalletCloudBackupBean hDWalletCloudBackupBean) {
        showLoading();
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        if (str2 == null) {
            str2 = "";
        }
        c14392dkb.AEQbTJ(this, str, str2, hDWalletCloudBackupBean, null, this.AYXKKw == 1 ? new C14459dlp(this, false, 2, null) : new C14458dlo(this), KWHzl(), new Function2() { // from class: o.fgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ActivityC18320fgF.EZpvd(this.AEQbTJ, (AbstractC12782ctV) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit EZpvd(ActivityC18320fgF activityC18320fgF, AbstractC12782ctV abstractC12782ctV, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        activityC18320fgF.dismissLoading();
        if (abstractC12782ctV != null) {
            C55326xho.toastWithSuccessfulIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivityExternalSyntheticLambda3), 0, 1, (java.lang.Object) null);
            activityC18320fgF.KWHzl(true);
            if (activityC18320fgF.AYXKKw == 1) {
                dZK.AEQbTJ.AEQbTJ(activityC18320fgF, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
                activityC18320fgF.finish();
            } else {
                activityC18320fgF.finish();
            }
        } else if (str.length() == 0) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.MenuRes), 0, 1, (java.lang.Object) null);
        } else {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        HDWalletCloudBackupBean hDWalletCloudBackupBean;
        super.onActivityResult(i, i2, intent);
        if (i == this.copydefault && i2 == -1 && (hDWalletCloudBackupBean = this.KWHzl) != null) {
            java.lang.String str = this.EZpvd;
            if (str == null) {
                str = "";
            }
            copydefault(str, intent != null ? intent.getStringExtra(HintConstants.AUTOFILL_HINT_PASSWORD) : null, hDWalletCloudBackupBean);
        }
    }

    public final void KWHzl(boolean z) {
        android.content.Intent intentPutExtra = new android.content.Intent().putExtra("icloud_network_list_result", z);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "");
        setResult(-1, intentPutExtra);
    }

    /* JADX INFO: renamed from: o.fgF$TaskDescription */
    public static final class TaskDescription implements Function1<java.util.List<? extends AbstractC12782ctV>, java.lang.Boolean> {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Boolean invoke(java.util.List<? extends AbstractC12782ctV> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
                if (!C14090der.OLrzqt.AEQbTJ(abstractC12782ctV) || abstractC12782ctV.getPostValueLengthLimit() != IdentifierType.IDENTIFIER_TYPE_NOSTR_KEY_WALLET_TYPE || abstractC12782ctV.hBpjJd() != IdentifierTypeNostrFixStatus.IDENTIFIER_TYPE_NOSTR_KEYWALLETTYPEHDEXPORT) {
                    arrayList.add(obj);
                }
            }
            return java.lang.Boolean.valueOf(arrayList.size() >= 100);
        }
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
