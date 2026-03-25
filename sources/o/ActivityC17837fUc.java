package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.okinc.business.defi.api.bean.ActivateTeeGuideModel;
import com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.tee.converter.model.SmallAssetHiddenTokenBean;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$10;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$11;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$12;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$13;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$14;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$8;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$onCreate$9;
import com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$txStatusSubListener$1$onSubData$1;
import com.okinc.business.dex.api.bean.OrderListParams;
import com.okinc.business.dex.api.bean.sa_small_assets.CheckRepeatResult;
import com.okinc.business.dex.api.bean.sa_small_assets.SmallAssetQuoteData;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.wallet.api.bean.CurrentWalletSelectMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.wallet.api.bean.CurrentWalletSwitchTeeConfig;
import com.okinc.wallet.api.bean.FunctionConfig;
import com.okinc.wallet.api.bean.WalletRechargeBean;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.ActivityC17792fSl;
import o.ActivityC17827fTt;
import o.C13754dXa;
import o.C52761wXj;
import o.InterfaceC54829xWw;
import o.InterfaceC54855xXv;
import o.dTQ;
import o.fTZ;
import o.fUX;
import o.xWX;
import o.xZF;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fUc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC17837fUc extends AbstractActivityC17836fUb {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final ActivityResultLauncher<ActivateTeeGuideModel> AYXKKw;
    public ViewOnClickListenerC54939xaY AhwBna;
    public final TaskStackBuilder DbNXlk;
    public final C59534zip djBIcL = new C59534zip();
    public final InterfaceC56387yDm fetchVPNInfo;
    public final ActivityResultLauncher<java.lang.String> gEmmrt;
    public C16434ejp valueOf;

    public static final void AEQbTJ(java.lang.Integer num) {
    }

    public static final void copydefault(ActivityResult activityResult) {
    }

    public ActivityC17837fUc() {
        final Function0 function0 = null;
        this.fetchVPNInfo = new ViewModelLazy(C56524yIo.AEQbTJ(fUX.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$special$$inlined$viewModels$default$2
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
        }, new Function0() { // from class: o.fUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17837fUc.fARcdN(this.EZpvd);
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.converter.ui.activity.SmallAssetsConverterActivity$special$$inlined$viewModels$default$3
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
        ActivityResultLauncher<java.lang.String> activityResultLauncherRegisterForActivityResult = registerForActivityResult(ActivityC17827fTt.Application.KWHzl, new ActivityResultCallback() { // from class: o.fUl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC17837fUc.AEQbTJ((java.lang.Integer) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<ActivateTeeGuideModel> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(ActivityC17792fSl.ActionBar.KWHzl, new ActivityResultCallback() { // from class: o.fUr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                ActivityC17837fUc.copydefault((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AYXKKw = activityResultLauncherRegisterForActivityResult2;
        this.DbNXlk = new TaskStackBuilder(toString());
    }

    /* JADX INFO: renamed from: o.fUc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fUc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: android.content.Intent */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Serializable, java.lang.Integer[]] */
        public final void AEQbTJ(@NotNull android.app.Activity activity, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC17837fUc.class);
            if (!z) {
                intent.putExtra("TRANSITION_ANIM", (java.io.Serializable) new java.lang.Integer[]{0, 0});
            }
            activity.startActivity(intent);
        }
    }

    public final fUX AYXKKw() {
        return (fUX) this.fetchVPNInfo.getValue();
    }

    public static final fUX KWHzl(ActivityC17837fUc activityC17837fUc, CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        android.content.Context applicationContext = activityC17837fUc.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        C12827cuN c12827cuNOcIXYQ = C13458dMb.EZpvd(applicationContext).OcIXYQ();
        C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        android.content.Context applicationContext2 = activityC17837fUc.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        return new fUX(c12827cuNOcIXYQ, c10948byAValueOf, io2, new C17862fVa(C13458dMb.EZpvd(applicationContext2).AubY(), Dispatchers.getIO()), new fUY(), (gKO) C43251rlk.copydefault(gKO.class));
    }

    /* JADX INFO: renamed from: o.fUc$TaskStackBuilder */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskStackBuilder extends xZF.TaskDescription<SmallAssetsTxStatusSubManager.SubResponse> {
        public TaskStackBuilder(java.lang.String str) {
            super(str, null, 2, null);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<SmallAssetsTxStatusSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            SmallAssetsTxStatusSubManager.SubResponse subResponse = (SmallAssetsTxStatusSubManager.SubResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
            SmallAssetsTxStatusSubManager.SubResponseData data = subResponse != null ? subResponse.getData() : null;
            if (data != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(ActivityC17837fUc.this), Dispatchers.getMain(), null, new SmallAssetsConverterActivity$txStatusSubListener$1$onSubData$1(ActivityC17837fUc.this, Intrinsics.EZpvd(data.getTotalOrderCount(), data.getFailedOrderCount()), data, null), 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC17837fUc OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC17837fUc activityC17837fUc) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = activityC17837fUc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(this.OLrzqt, new OrderListParams(OrderListParams.Page.Trades, java.lang.String.valueOf(this.OLrzqt.AYXKKw().gEmmrt())));
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC17837fUc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, ActivityC17837fUc activityC17837fUc) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = activityC17837fUc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ ActivityC17837fUc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ActivityC17837fUc activityC17837fUc) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = activityC17837fUc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strDbNXlk;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
                ActivityC17837fUc activityC17837fUc = this.copydefault;
                AbstractC12782ctV value = activityC17837fUc.AYXKKw().fARcdN().getValue();
                if (value == null || (strDbNXlk = value.DbNXlk()) == null) {
                    return;
                }
                dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default(dtq, activityC17837fUc, strDbNXlk, null, "sa_wallet_dustconvert", 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C52794wYp OLrzqt;
        public final /* synthetic */ ActivityC17837fUc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C52794wYp c52794wYp, ActivityC17837fUc activityC17837fUc) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c52794wYp;
            this.copydefault = activityC17837fUc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt(0L);
                this.copydefault.AYXKKw().KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC17837fUc KWHzl;
        public final /* synthetic */ C10854bwM OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, ActivityC17837fUc activityC17837fUc, C10854bwM c10854bwM) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC17837fUc;
            this.OLrzqt = c10854bwM;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ChainAddress chainAddressAddressFromChainId$default;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
                ActivityC17837fUc activityC17837fUc = this.KWHzl;
                java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Long.valueOf(this.OLrzqt.fetchVPNInfo()));
                java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(this.OLrzqt.OLrzqt());
                java.util.ArrayList arrayListCopydefault = yDY.copydefault("dex");
                AbstractC12782ctV value = this.KWHzl.AYXKKw().fARcdN().getValue();
                InterfaceC54829xWw.ActionBar.showRechargeDialog$default(interfaceC54829xWw, activityC17837fUc, new WalletRechargeBean(strGEmmrt, strGEmmrt2, "wallet", "gas", arrayListCopydefault, (java.util.ArrayList) null, false, (java.lang.String) null, (value == null || (chainAddressAddressFromChainId$default = AbstractC12782ctV.addressFromChainId$default(value, this.OLrzqt.AhwBna(), null, 2, null)) == null) ? -1 : chainAddressAddressFromChainId$default.getAddressType(), 224, (DefaultConstructorMarker) null), 0, null, 12, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ ActivityC17837fUc copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ActivityC17837fUc activityC17837fUc) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = activityC17837fUc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ((gKO) C43251rlk.copydefault(gKO.class)).OLrzqt(this.copydefault, new OrderListParams(OrderListParams.Page.Trades, java.lang.String.valueOf(this.copydefault.AYXKKw().gEmmrt())));
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ActivityC17837fUc KWHzl;
        public final /* synthetic */ AbstractC12782ctV OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ActivityC17837fUc activityC17837fUc, AbstractC12782ctV abstractC12782ctV) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = activityC17837fUc;
            this.OLrzqt = abstractC12782ctV;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AEQbTJ(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.fUc$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ActivityC17837fUc AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC17837fUc activityC17837fUc) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = activityC17837fUc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.fetchVPNInfo();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna() {
        C52794wYp c52794wYp;
        C16434ejp c16434ejp;
        AbstractC12782ctV value = AYXKKw().fARcdN().getValue();
        if (value == null) {
            return;
        }
        kotlin.Pair<AbstractC12782ctV, CheckRepeatResult> value2 = AYXKKw().valueOf().getValue();
        C16434ejp c16434ejp2 = null;
        CheckRepeatResult second = value2 != null ? value2.getSecond() : null;
        boolean z = true;
        if (!value.AubY()) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.AhwBna;
            if (viewOnClickListenerC54939xaY == null || !viewOnClickListenerC54939xaY.isShowing()) {
                this.AhwBna = C17877fVp.Companion.OLrzqt().EZpvd(this, new Function0() { // from class: o.fUq
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC17837fUc.fetchVPNInfo(this.AEQbTJ);
                    }
                }, new Function0() { // from class: o.fUe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ActivityC17837fUc.fJNWhG(this.OLrzqt);
                    }
                });
            }
            C16434ejp c16434ejp3 = this.valueOf;
            if (c16434ejp3 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp3 = null;
            }
            c16434ejp3.isConnected.setVisibility(8);
            C16434ejp c16434ejp4 = this.valueOf;
            if (c16434ejp4 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp4 = null;
            }
            c16434ejp4.AkhnZx.AEQbTJ();
            C16434ejp c16434ejp5 = this.valueOf;
            if (c16434ejp5 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp5 = null;
            }
            c16434ejp5.AkhnZx.djBIcL(false);
            C16434ejp c16434ejp6 = this.valueOf;
            if (c16434ejp6 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp6 = null;
            }
            c16434ejp6.fJNWhG.setVisibility(4);
            C16434ejp c16434ejp7 = this.valueOf;
            if (c16434ejp7 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp7 = null;
            }
            c16434ejp7.fetchVPNInfo.setVisibility(0);
            C16434ejp c16434ejp8 = this.valueOf;
            if (c16434ejp8 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp8 = null;
            }
            c16434ejp8.EZpvd.setVisibility(8);
            C33064mpR.OLrzqt(this.djBIcL, (java.util.List<? extends java.lang.Object>) C56402yEa.EZpvd(new fTZ.StateListAnimator(true, 0, 2, null)));
            return;
        }
        if (second != null && !second.getCanOrder()) {
            DbNXlk();
            C16434ejp c16434ejp9 = this.valueOf;
            if (c16434ejp9 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16434ejp2 = c16434ejp9;
            }
            C52794wYp c52794wYp2 = c16434ejp2.EZpvd;
            c52794wYp2.setVisibility(0);
            c52794wYp2.setEnabled(false);
            c52794wYp2.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSessionEvent));
            Intrinsics.copydefault(c52794wYp2);
            return;
        }
        if (!value.RJOkX()) {
            C16434ejp c16434ejp10 = this.valueOf;
            if (c16434ejp10 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16434ejp2 = c16434ejp10;
            }
            C52794wYp c52794wYp3 = c16434ejp2.EZpvd;
            c52794wYp3.setVisibility(0);
            c52794wYp3.setEnabled(true);
            c52794wYp3.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setCallback));
            c52794wYp3.fIwbmz();
            c52794wYp3.setOnClickListener(new PendingIntent(c52794wYp3, 1000L, this, value));
            Intrinsics.copydefault(c52794wYp3);
            return;
        }
        if (!value.DTwDnp()) {
            C16434ejp c16434ejp11 = this.valueOf;
            if (c16434ejp11 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16434ejp2 = c16434ejp11;
            }
            C52794wYp c52794wYp4 = c16434ejp2.EZpvd;
            c52794wYp4.setVisibility(0);
            c52794wYp4.setEnabled(true);
            c52794wYp4.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDefaultNightMode));
            c52794wYp4.fIwbmz();
            c52794wYp4.setOnClickListener(new Dialog(c52794wYp4, 1000L, this));
            Intrinsics.copydefault(c52794wYp4);
            return;
        }
        C16434ejp c16434ejp12 = this.valueOf;
        if (c16434ejp12 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp12 = null;
        }
        c16434ejp12.KWHzl.setVisibility(8);
        AbstractC43419rot<SmallAssetQuoteData, OKServerException> value3 = AYXKKw().values().getValue();
        if (value3 == null) {
            C16434ejp c16434ejp13 = this.valueOf;
            if (c16434ejp13 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16434ejp2 = c16434ejp13;
            }
            c52794wYp = c16434ejp2.EZpvd;
            c52794wYp.setVisibility(0);
            c52794wYp.setEnabled(false);
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSessionEvent));
            c52794wYp.fIwbmz();
        } else if (value3.EZpvd()) {
            SmallAssetQuoteData smallAssetQuoteDataAEQbTJ = value3.AEQbTJ();
            if (C33129mqd.gEmmrt(AYXKKw().EZpvd().getValue(), smallAssetQuoteDataAEQbTJ.getEstimateReserveGasTokenFee())) {
                C10854bwM c10854bwMDjBIcL = AYXKKw().djBIcL();
                if (c10854bwMDjBIcL == null) {
                    return;
                }
                C16434ejp c16434ejp14 = this.valueOf;
                if (c16434ejp14 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16434ejp2 = c16434ejp14;
                }
                c52794wYp = c16434ejp2.EZpvd;
                c52794wYp.setVisibility(0);
                c52794wYp.setEnabled(true);
                c52794wYp.setText(C33069mpW.copydefault(C13754dXa.FragmentManager.release, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c10854bwMDjBIcL.fJNWhG()))));
                c52794wYp.fIwbmz();
                c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this, c10854bwMDjBIcL));
            } else if (smallAssetQuoteDataAEQbTJ.getQuotes().isEmpty()) {
                C16434ejp c16434ejp15 = this.valueOf;
                if (c16434ejp15 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16434ejp2 = c16434ejp15;
                }
                c52794wYp = c16434ejp2.EZpvd;
                c52794wYp.setVisibility(0);
                c52794wYp.setEnabled(false);
                c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSessionEvent));
                c52794wYp.fIwbmz();
            } else {
                java.util.List<fTZ.Application> listKWHzl = AYXKKw().isConnected().getValue().KWHzl();
                if ((listKWHzl instanceof java.util.Collection) && listKWHzl.isEmpty()) {
                    z = false;
                    c16434ejp = this.valueOf;
                    if (c16434ejp != null) {
                    }
                    c52794wYp = c16434ejp2.EZpvd;
                    c52794wYp.setVisibility(0);
                    c52794wYp.setEnabled(z);
                    c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSessionEvent));
                    c52794wYp.fIwbmz();
                    if (z) {
                    }
                } else {
                    java.util.Iterator<T> it = listKWHzl.iterator();
                    while (it.hasNext()) {
                        if (((fTZ.Application) it.next()).copydefault()) {
                            break;
                        }
                    }
                    z = false;
                    c16434ejp = this.valueOf;
                    if (c16434ejp != null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c16434ejp2 = c16434ejp;
                    }
                    c52794wYp = c16434ejp2.EZpvd;
                    c52794wYp.setVisibility(0);
                    c52794wYp.setEnabled(z);
                    c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSessionEvent));
                    c52794wYp.fIwbmz();
                    if (z) {
                        c52794wYp.setOnClickListener(new Fragment(c52794wYp, 1000L, c52794wYp, this));
                    }
                }
            }
        } else {
            C16434ejp c16434ejp16 = this.valueOf;
            if (c16434ejp16 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16434ejp2 = c16434ejp16;
            }
            c52794wYp = c16434ejp2.EZpvd;
            c52794wYp.setVisibility(0);
            c52794wYp.setEnabled(false);
            c52794wYp.setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.sendSessionEvent));
            c52794wYp.fIwbmz();
        }
        Intrinsics.copydefault(c52794wYp);
    }

    public static final Unit fetchVPNInfo(ActivityC17837fUc activityC17837fUc) {
        activityC17837fUc.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(ActivityC17837fUc activityC17837fUc) {
        activityC17837fUc.finish();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        dTQ dtq = (dTQ) C43251rlk.OLrzqt(dTQ.class);
        boolean z = dtq != null && dtq.OLrzqt(abstractC12782ctV.DbNXlk());
        boolean zEZpvd = C17922fXg.EZpvd(this);
        if (!z) {
            this.gEmmrt.launch(abstractC12782ctV.DbNXlk());
            return;
        }
        if (zEZpvd) {
            this.AYXKKw.launch(new ActivateTeeGuideModel(abstractC12782ctV.DbNXlk(), false, false, (java.lang.String) null, 0, 0, 0, "sa_wallet_dustconvert", WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null));
            return;
        }
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("ActivateSAGuideBottomSheet");
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isAdded()) {
            fST.Companion.KWHzl(new ActivateTeeGuideModel(abstractC12782ctV.DbNXlk(), false, false, (java.lang.String) null, 0, 0, 0, "sa_wallet_dustconvert", WebSocketProtocol.PAYLOAD_SHORT, (DefaultConstructorMarker) null)).show(getSupportFragmentManager(), "ActivateSAGuideBottomSheet");
        }
    }

    public final void djBIcL() {
        isConnected();
        C16434ejp c16434ejp = this.valueOf;
        C16434ejp c16434ejp2 = null;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        c16434ejp.fetchVPNInfo.setVisibility(0);
        C16434ejp c16434ejp3 = this.valueOf;
        if (c16434ejp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16434ejp2 = c16434ejp3;
        }
        c16434ejp2.isConnected.setVisibility(8);
        AYXKKw().getNewProxyInstance();
        AYXKKw().AEQbTJ();
    }

    @Override // o.AbstractActivityC17836fUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        C16434ejp c16434ejpOLrzqt = C16434ejp.OLrzqt(getLayoutInflater());
        this.valueOf = c16434ejpOLrzqt;
        if (bundle != null) {
            finish();
            return;
        }
        if (c16434ejpOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16434ejpOLrzqt = null;
        }
        android.widget.LinearLayout root = c16434ejpOLrzqt.getRoot();
        Intrinsics.copydefault(root);
        root.setPadding(root.getPaddingLeft(), C33570myu.gEmmrt(this), root.getPaddingRight(), root.getPaddingBottom());
        setContentView(root);
        AkhnZx();
        C16434ejp c16434ejp = this.valueOf;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        android.widget.ImageView imageView = c16434ejp.values;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        C16434ejp c16434ejp2 = this.valueOf;
        if (c16434ejp2 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp2 = null;
        }
        AppCompatTextView appCompatTextView = c16434ejp2.AuCTel;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this));
        C16434ejp c16434ejp3 = this.valueOf;
        if (c16434ejp3 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp3 = null;
        }
        android.widget.ImageView imageView2 = c16434ejp3.djBIcL;
        imageView2.setOnClickListener(new Activity(imageView2, 1000L, this));
        C16434ejp c16434ejp4 = this.valueOf;
        if (c16434ejp4 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp4 = null;
        }
        android.widget.TextView textView = c16434ejp4.AYXKKw;
        textView.setText(AEQbTJ());
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        C16434ejp c16434ejp5 = this.valueOf;
        if (c16434ejp5 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp5 = null;
        }
        c16434ejp5.AkhnZx.OLrzqt(new InterfaceC57903yrG() { // from class: o.fUh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC17837fUc.KWHzl(this.AEQbTJ, interfaceC57934yrl);
            }
        });
        C16434ejp c16434ejp6 = this.valueOf;
        if (c16434ejp6 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp6 = null;
        }
        c16434ejp6.OLrzqt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.fUj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ActivityC17837fUc.EZpvd(this.AEQbTJ, compoundButton, z);
            }
        });
        C16434ejp c16434ejp7 = this.valueOf;
        if (c16434ejp7 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp7 = null;
        }
        c16434ejp7.fetchVPNInfo.setAdapter(this.djBIcL);
        gEmmrt();
        values();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmallAssetsConverterActivity$onCreate$8(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmallAssetsConverterActivity$onCreate$9(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmallAssetsConverterActivity$onCreate$10(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmallAssetsConverterActivity$onCreate$11(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmallAssetsConverterActivity$onCreate$12(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmallAssetsConverterActivity$onCreate$13(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SmallAssetsConverterActivity$onCreate$14(this, null), 3, null);
    }

    public static final void KWHzl(ActivityC17837fUc activityC17837fUc, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        activityC17837fUc.djBIcL();
    }

    public static final void EZpvd(ActivityC17837fUc activityC17837fUc, android.widget.CompoundButton compoundButton, boolean z) {
        activityC17837fUc.AYXKKw().EZpvd(z);
        activityC17837fUc.djBIcL.notifyDataSetChanged();
        activityC17837fUc.isConnected();
        if (z) {
            return;
        }
        activityC17837fUc.AhwBna();
    }

    public final void gEmmrt() {
        this.djBIcL.register(fTZ.Application.class, new fUO(new Function1() { // from class: o.fUf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(ActivityC17837fUc.AEQbTJ(this.KWHzl, (fTZ.Application) obj));
            }
        }));
        this.djBIcL.register(fTZ.StateListAnimator.class, new fUN(new Function0() { // from class: o.fUg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17837fUc.fIwbmz(this.AEQbTJ);
            }
        }));
        this.djBIcL.register(fTZ.ActionBar.class, new fUV(new Function0() { // from class: o.fUi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17837fUc.ejfBZ(this.copydefault);
            }
        }));
        this.djBIcL.register(fTZ.TaskDescription.class, new fUR(new Function1() { // from class: o.fUk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17837fUc.copydefault(this.EZpvd, (fTZ.TaskDescription) obj);
            }
        }));
    }

    public static final boolean AEQbTJ(ActivityC17837fUc activityC17837fUc, fTZ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        fUX.TaskDescription taskDescriptionHDKMBd = activityC17837fUc.AYXKKw().hDKMBd();
        if (taskDescriptionHDKMBd.AEQbTJ()) {
            activityC17837fUc.AhwBna();
        }
        C16434ejp c16434ejp = activityC17837fUc.valueOf;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        c16434ejp.OLrzqt.setCheckedIgnoreListener(taskDescriptionHDKMBd.copydefault());
        activityC17837fUc.isConnected();
        return taskDescriptionHDKMBd.EZpvd();
    }

    public static final Unit fIwbmz(ActivityC17837fUc activityC17837fUc) {
        activityC17837fUc.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ActivityC17837fUc activityC17837fUc) {
        C16434ejp c16434ejp = activityC17837fUc.valueOf;
        C16434ejp c16434ejp2 = null;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        c16434ejp.fJNWhG.setVisibility(4);
        C16434ejp c16434ejp3 = activityC17837fUc.valueOf;
        if (c16434ejp3 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp3 = null;
        }
        c16434ejp3.isConnected.setVisibility(0);
        C16434ejp c16434ejp4 = activityC17837fUc.valueOf;
        if (c16434ejp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16434ejp2 = c16434ejp4;
        }
        c16434ejp2.fetchVPNInfo.setVisibility(8);
        activityC17837fUc.AYXKKw().getNewProxyInstance();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC17837fUc activityC17837fUc, fTZ.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        activityC17837fUc.valueOf();
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        java.util.List<fTZ.Application> listAhwBna = AYXKKw().AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        for (fTZ.Application application : listAhwBna) {
            arrayList.add(new SmallAssetHiddenTokenBean(application.OLrzqt().DbNXlk(), application.OLrzqt().fJNWhG(), application.AEQbTJ()));
        }
        ActivityC17860fUz.Companion.AEQbTJ(this, new java.util.ArrayList<>(arrayList));
    }

    public final void values() {
        C16434ejp c16434ejp = this.valueOf;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        c16434ejp.AkhnZx.KWHzl(new InterfaceC57900yrD() { // from class: o.fUd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                ActivityC17837fUc.copydefault(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final void copydefault(ActivityC17837fUc activityC17837fUc, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        fTY value = activityC17837fUc.AYXKKw().isConnected().getValue();
        if (!value.AEQbTJ() && value.EZpvd()) {
            activityC17837fUc.AYXKKw().fIwbmz();
            return;
        }
        C16434ejp c16434ejp = activityC17837fUc.valueOf;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        c16434ejp.AkhnZx.valueOf();
    }

    public final void copydefault(fTY fty) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z = (fty.EZpvd() || fty.AEQbTJ()) ? false : true;
        boolean zIsEmpty = fty.KWHzl().isEmpty();
        C16434ejp c16434ejp = null;
        if (z && zIsEmpty && fty.copydefault() > 0) {
            C16434ejp c16434ejp2 = this.valueOf;
            if (c16434ejp2 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp2 = null;
            }
            c16434ejp2.fJNWhG.setVisibility(4);
            arrayList.add(new fTZ.StateListAnimator(fty.OLrzqt().isEmpty(), fty.OLrzqt().size()));
        } else {
            if (!fty.KWHzl().isEmpty()) {
                C16434ejp c16434ejp3 = this.valueOf;
                if (c16434ejp3 == null) {
                    Intrinsics.gEmmrt("");
                    c16434ejp3 = null;
                }
                c16434ejp3.fJNWhG.setVisibility(0);
                isConnected();
            }
            arrayList.addAll(fty.KWHzl());
            if (!fty.OLrzqt().isEmpty()) {
                arrayList.add(new fTZ.TaskDescription(fty.OLrzqt().size()));
            }
        }
        if (!fty.AEQbTJ()) {
            C16434ejp c16434ejp4 = this.valueOf;
            if (c16434ejp4 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp4 = null;
            }
            c16434ejp4.AkhnZx.valueOf();
        }
        if (!fty.EZpvd()) {
            C16434ejp c16434ejp5 = this.valueOf;
            if (c16434ejp5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16434ejp = c16434ejp5;
            }
            c16434ejp.AkhnZx.AYXKKw();
        }
        if ((!arrayList.isEmpty()) || fty.copydefault() > 0) {
            C33064mpR.OLrzqt(this.djBIcL, arrayList);
        }
    }

    public final void isConnected() {
        int i;
        java.lang.String strKWHzl;
        java.util.List<fTZ.Application> listKWHzl = AYXKKw().isConnected().getValue().KWHzl();
        if ((listKWHzl instanceof java.util.Collection) && listKWHzl.isEmpty()) {
            i = 0;
        } else {
            java.util.Iterator<T> it = listKWHzl.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((fTZ.Application) it.next()).copydefault() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        int size = listKWHzl.size();
        C16434ejp c16434ejp = this.valueOf;
        C16434ejp c16434ejp2 = null;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        android.widget.TextView textView = c16434ejp.DbNXlk;
        if (i == 0) {
            C16434ejp c16434ejp3 = this.valueOf;
            if (c16434ejp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16434ejp2 = c16434ejp3;
            }
            c16434ejp2.OLrzqt.setCheckedIgnoreListener(false);
            strKWHzl = getString(C13754dXa.FragmentManager.onPrepareFromUri);
        } else {
            int iMin = java.lang.Math.min(size, 50);
            if (i != iMin || iMin <= 0) {
                C16434ejp c16434ejp4 = this.valueOf;
                if (c16434ejp4 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16434ejp2 = c16434ejp4;
                }
                c16434ejp2.OLrzqt.setCheckedIgnoreListener(false);
                strKWHzl = C33069mpW.KWHzl(this, C13754dXa.FragmentManager.onSeekTo, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
            } else {
                C16434ejp c16434ejp5 = this.valueOf;
                if (c16434ejp5 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c16434ejp2 = c16434ejp5;
                }
                c16434ejp2.OLrzqt.setCheckedIgnoreListener(true);
                if (size > 0 && size < 50) {
                    strKWHzl = C33069mpW.KWHzl(this, C13754dXa.FragmentManager.onSeekTo, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
                } else {
                    strKWHzl = getString(C13754dXa.FragmentManager.setSessionActivity);
                    Intrinsics.copydefault((java.lang.Object) strKWHzl);
                }
            }
        }
        textView.setText(strKWHzl);
    }

    public final void fetchVPNInfo() {
        java.lang.String strDbNXlk;
        AbstractC12782ctV value = AYXKKw().fARcdN().getValue();
        if (value == null || (strDbNXlk = value.DbNXlk()) == null) {
            return;
        }
        C17925fXj.EZpvd.copydefault().KWHzl();
        xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, supportFragmentManager, new CurrentWalletSwitchConfig(new CurrentWalletSelectMode.WalletSelectedById(strDbNXlk), CurrentWalletSwitchNetworkMode.Ignored.OLrzqt, "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.addPreRequisiteCollector), null, 1, new CurrentWalletSwitchTeeConfig(C13754dXa.FragmentManager.Slwtri, "num", "learn", C13754dXa.FragmentManager.RZOtbZ), new FunctionConfig(true, true, true, false, 8, null), 16, null), new Function2() { // from class: o.fUp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(ActivityC17837fUc.OLrzqt((InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new AssistContent(), 8, null);
    }

    public static final boolean OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return interfaceC9738bbJ.AubY();
    }

    /* JADX INFO: renamed from: o.fUc$AssistContent */
    public static final class AssistContent implements InterfaceC54855xXv {
        public AssistContent() {
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
            java.lang.String strDbNXlk = interfaceC9738bbJ.DbNXlk();
            AbstractC12782ctV value = ActivityC17837fUc.this.AYXKKw().fARcdN().getValue();
            if (Intrinsics.EZpvd((java.lang.Object) strDbNXlk, (java.lang.Object) (value != null ? value.DbNXlk() : null))) {
                return;
            }
            C16434ejp c16434ejp = ActivityC17837fUc.this.valueOf;
            if (c16434ejp == null) {
                Intrinsics.gEmmrt("");
                c16434ejp = null;
            }
            c16434ejp.OLrzqt.setCheckedIgnoreListener(false);
            C16434ejp c16434ejp2 = ActivityC17837fUc.this.valueOf;
            if (c16434ejp2 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp2 = null;
            }
            c16434ejp2.isConnected.setVisibility(0);
            C16434ejp c16434ejp3 = ActivityC17837fUc.this.valueOf;
            if (c16434ejp3 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp3 = null;
            }
            c16434ejp3.AkhnZx.AEQbTJ();
            C16434ejp c16434ejp4 = ActivityC17837fUc.this.valueOf;
            if (c16434ejp4 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp4 = null;
            }
            c16434ejp4.AkhnZx.djBIcL(false);
            C16434ejp c16434ejp5 = ActivityC17837fUc.this.valueOf;
            if (c16434ejp5 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp5 = null;
            }
            c16434ejp5.fJNWhG.setVisibility(4);
            C16434ejp c16434ejp6 = ActivityC17837fUc.this.valueOf;
            if (c16434ejp6 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp6 = null;
            }
            c16434ejp6.fetchVPNInfo.setVisibility(8);
            C16434ejp c16434ejp7 = ActivityC17837fUc.this.valueOf;
            if (c16434ejp7 == null) {
                Intrinsics.gEmmrt("");
                c16434ejp7 = null;
            }
            c16434ejp7.EZpvd.setVisibility(8);
            fUX fuxAYXKKw = ActivityC17837fUc.this.AYXKKw();
            AbstractC12782ctV abstractC12782ctV = interfaceC9738bbJ instanceof AbstractC12782ctV ? (AbstractC12782ctV) interfaceC9738bbJ : null;
            if (abstractC12782ctV == null) {
                return;
            }
            fuxAYXKKw.KWHzl(abstractC12782ctV);
        }
    }

    /* JADX DEBUG: Possible override for method o.fUb.AEQbTJ()V */
    public final android.text.Spannable AEQbTJ() {
        return C33069mpW.copydefault(this, C13754dXa.FragmentManager.setSessionImpl, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56423yEv.EZpvd(C56390yDp.OLrzqt("learn", OLrzqt(C13754dXa.FragmentManager.ODWQjV, new Function0() { // from class: o.fUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17837fUc.DbNXlk(this.OLrzqt);
            }
        }))));
    }

    public static final Unit DbNXlk(ActivityC17837fUc activityC17837fUc) {
        WebActivity.TaskDescription.openPage$default(WebActivity.Companion, activityC17837fUc, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDefaultImpl)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fUc$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ ActivityC17837fUc EZpvd;
        public final /* synthetic */ Function0<Unit> KWHzl;

        public ActionBar(Function0<Unit> function0, ActivityC17837fUc activityC17837fUc) {
            this.KWHzl = function0;
            this.EZpvd = activityC17837fUc;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.KWHzl.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(ContextCompat.getColor(this.EZpvd, C52761wXj.Activity.fdOvFl));
        }
    }

    public final void DbNXlk() {
        C16434ejp c16434ejp = this.valueOf;
        android.graphics.drawable.Drawable drawable = null;
        if (c16434ejp == null) {
            Intrinsics.gEmmrt("");
            c16434ejp = null;
        }
        c16434ejp.EZpvd.setEnabled(false);
        C16434ejp c16434ejp2 = this.valueOf;
        if (c16434ejp2 == null) {
            Intrinsics.gEmmrt("");
            c16434ejp2 = null;
        }
        OKAlertBanner oKAlertBanner = c16434ejp2.KWHzl;
        oKAlertBanner.setVisibility(0);
        oKAlertBanner.setTitle(getString(C13754dXa.FragmentManager.asBinder));
        oKAlertBanner.setMessage(getString(C13754dXa.FragmentManager.onMessageChannelReady));
        oKAlertBanner.setStyle(1);
        oKAlertBanner.setType(1);
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(this, C52761wXj.TaskDescription.UhxbNG);
        if (drawable2 != null) {
            DrawableCompat.setTint(drawable2, ContextCompat.getColor(oKAlertBanner.getContext(), C52761wXj.Activity.GLcwwN));
            drawable = drawable2;
        }
        oKAlertBanner.setLeadingIcon(drawable);
        oKAlertBanner.setOnClickListener(new LoaderManager(oKAlertBanner, 1000L, this));
    }

    private final void AkhnZx() {
        C11205cFp.EZpvd.zuBGHE().AEQbTJ(this.DbNXlk);
    }

    private final void ejfBZ() {
        C11205cFp.EZpvd.zuBGHE().OLrzqt(this.DbNXlk);
    }

    public final java.lang.String OLrzqt(int i) {
        return pTD.EZpvd(this, C13754dXa.Dialog.gEmmrt, i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
    }

    public static /* synthetic */ void showNotification$default(ActivityC17837fUc activityC17837fUc, android.content.Context context, int i, java.lang.String str, java.lang.String str2, long j, int i2, java.lang.Object obj) {
        android.content.Context context2 = (i2 & 1) != 0 ? activityC17837fUc : context;
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        java.lang.String str3 = str2;
        if ((i2 & 16) != 0) {
            j = 2000;
        }
        activityC17837fUc.copydefault(context2, i, str, str3, j);
    }

    public final void copydefault(android.content.Context context, int i, java.lang.String str, java.lang.String str2, long j) {
        C55097xdX c55097xdX = new C55097xdX(context, null, 0, 4, null);
        c55097xdX.setState(i);
        c55097xdX.setTitle(str);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setMessage(str2);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, j, 0, 0, 0, 28, null);
    }

    @Override // o.AbstractActivityC17836fUb, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ejfBZ();
    }

    private final android.text.Spannable OLrzqt(int i, Function0<Unit> function0) {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        ActionBar actionBar = new ActionBar(function0, this);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(i));
        spannableStringBuilder.setSpan(actionBar, length, spannableStringBuilder.length(), 17);
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        return spannableStringValueOf;
    }

    public static final ViewModelProvider.Factory fARcdN(final ActivityC17837fUc activityC17837fUc) {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fUX.class), new Function1() { // from class: o.fUn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17837fUc.KWHzl(this.EZpvd, (CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    @Override // o.AbstractActivityC17836fUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17836fUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17836fUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17836fUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
