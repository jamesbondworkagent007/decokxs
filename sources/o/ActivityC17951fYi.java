package o;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionReminderInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17951fYi extends AbstractActivityC33013moT {
    public static Function1<? super android.os.Bundle, Unit> AEQbTJ;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public Function1<? super android.os.Bundle, Unit> KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public AbstractC16433ejo copydefault;

    /* JADX INFO: renamed from: o.fYi$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    public ActivityC17951fYi() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(C17954fYl.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.custom.TransactionAddCustomNetworkActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transaction.custom.TransactionAddCustomNetworkActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.custom.TransactionAddCustomNetworkActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.fYi$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fYi.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(Function1<? super android.os.Bundle, Unit> function1) {
            ActivityC17951fYi.AEQbTJ = function1;
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull CustomNetworkInfo customNetworkInfo, java.lang.String str3, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(customNetworkInfo, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC17951fYi.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("chain_id", str2);
            intent.putExtra("source", i);
            intent.putExtra("custom_network_info", customNetworkInfo);
            intent.putExtra("wc_topic", str3);
            intent.putExtra("wc_id", l);
            return intent;
        }
    }

    public final C17954fYl EZpvd() {
        return (C17954fYl) this.OLrzqt.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        final AbstractC16433ejo abstractC16433ejo = (AbstractC16433ejo) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.ODXsMY);
        this.KWHzl = AEQbTJ;
        AEQbTJ = null;
        if (abstractC16433ejo == null) {
            finish();
            return;
        }
        this.copydefault = abstractC16433ejo;
        final java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        final java.lang.String stringExtra2 = getIntent().getStringExtra("chain_id");
        final int intExtra = getIntent().getIntExtra("source", 0);
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("custom_network_info");
        Intrinsics.copydefault(parcelableExtra);
        final CustomNetworkInfo customNetworkInfo = (CustomNetworkInfo) parcelableExtra;
        final java.lang.String stringExtra3 = getIntent().getStringExtra("wc_topic");
        final long longExtra = getIntent().getLongExtra("wc_id", 0L);
        C55173xeu c55173xeu = abstractC16433ejo.valueOf;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setImage(C52761wXj.TaskDescription.getSerial);
        C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC17951fYi.EZpvd(abstractC16433ejo, this, stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, longExtra, obj);
            }
        });
        EZpvd().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.fYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17951fYi.KWHzl(this.KWHzl, abstractC16433ejo, customNetworkInfo, stringExtra2, (java.lang.String) obj);
            }
        }));
        showLoadingWithLogo();
        EZpvd().KWHzl(stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, java.lang.Long.valueOf(longExtra));
        EZpvd().AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.fYj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC17951fYi.AEQbTJ(this.KWHzl, intExtra, (kotlin.Pair) obj);
            }
        }));
    }

    public static final void EZpvd(AbstractC16433ejo abstractC16433ejo, ActivityC17951fYi activityC17951fYi, java.lang.String str, java.lang.String str2, int i, CustomNetworkInfo customNetworkInfo, java.lang.String str3, long j, java.lang.Object obj) {
        abstractC16433ejo.AYXKKw.setVisibility(8);
        activityC17951fYi.showLoadingWithLogo();
        activityC17951fYi.EZpvd().KWHzl(str, str2, i, customNetworkInfo, str3, java.lang.Long.valueOf(j));
    }

    public static final Unit KWHzl(final ActivityC17951fYi activityC17951fYi, AbstractC16433ejo abstractC16433ejo, CustomNetworkInfo customNetworkInfo, java.lang.String str, java.lang.String str2) {
        activityC17951fYi.dismissLoadingWithLogo();
        if (str2 == null) {
            abstractC16433ejo.AYXKKw.setVisibility(0);
        } else {
            abstractC16433ejo.djBIcL.setVisibility(0);
            activityC17951fYi.OLrzqt(customNetworkInfo);
            activityC17951fYi.EZpvd(customNetworkInfo);
            activityC17951fYi.KWHzl(str2);
            activityC17951fYi.EZpvd(str);
            activityC17951fYi.copydefault(customNetworkInfo);
            activityC17951fYi.AEQbTJ(customNetworkInfo);
            activityC17951fYi.copydefault();
            activityC17951fYi.KWHzl();
            activityC17951fYi.getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fYn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC17951fYi.AhwBna(this.copydefault);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(ActivityC17951fYi activityC17951fYi) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17951fYi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(ActivityC17951fYi activityC17951fYi, int i, kotlin.Pair pair) {
        activityC17951fYi.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str != null) {
                C55326xho.toastWithSuccessfulIcon$default(str, 0, 1, (java.lang.Object) null);
            }
            if (activityC17951fYi.KWHzl != null) {
                android.content.Intent intentOLrzqt = activityC17951fYi.OLrzqt(i);
                Function1<? super android.os.Bundle, Unit> function1 = activityC17951fYi.KWHzl;
                if (function1 != null) {
                    function1.invoke(intentOLrzqt.getExtras());
                }
            } else {
                activityC17951fYi.setResult(-1, activityC17951fYi.OLrzqt(i));
            }
            activityC17951fYi.finish();
        } else {
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            if (str2 != null) {
                C55326xho.toastWithFailedIcon$default(str2, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public final android.content.Intent OLrzqt(int i) {
        android.content.Intent intent = new android.content.Intent();
        if (i != 5) {
            intent.putExtra("addCustomNetwork", true);
        }
        intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, EZpvd().copydefault().getValue());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(CustomNetworkInfo customNetworkInfo) {
        java.lang.String strAYXKKw;
        java.lang.String url;
        AbstractC16433ejo abstractC16433ejo;
        java.lang.String iconUrl = customNetworkInfo.getIconUrl();
        AbstractC16433ejo abstractC16433ejo2 = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) customNetworkInfo.getName())) {
            strAYXKKw = customNetworkInfo.getName();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) customNetworkInfo.getUrl())) {
                url = customNetworkInfo.getUrl();
            }
            abstractC16433ejo = this.copydefault;
            if (abstractC16433ejo != null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16433ejo2 = abstractC16433ejo;
            }
            abstractC16433ejo2.gEmmrt.setViewDataBean(new TransactionHeaderInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateNightMode), C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, iconUrl, null, C14726dqr.OLrzqt.KWHzl(this), null, strAYXKKw != null ? "" : strAYXKKw, null, false, url != null ? "" : url, null, null, 0, null, null, null, null, null, 1046191, null)), false, null, null, null, null, 124, null));
        }
        strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.closePanel);
        url = null;
        abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo != null) {
        }
        abstractC16433ejo2.gEmmrt.setViewDataBean(new TransactionHeaderInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.AppCompatDelegateNightMode), C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, iconUrl, null, C14726dqr.OLrzqt.KWHzl(this), null, strAYXKKw != null ? "" : strAYXKKw, null, false, url != null ? "" : url, null, null, 0, null, null, null, null, null, 1046191, null)), false, null, null, null, null, 124, null));
    }

    public final void EZpvd(CustomNetworkInfo customNetworkInfo) {
        AbstractC16433ejo abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo == null) {
            Intrinsics.gEmmrt("");
            abstractC16433ejo = null;
        }
        C57471yiz c57471yiz = abstractC16433ejo.values;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPHNDa);
        java.lang.String chainName = customNetworkInfo.getChainName();
        c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(strAYXKKw, false, chainName == null ? "" : chainName, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }

    public final void KWHzl(java.lang.String str) {
        AbstractC16433ejo abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo == null) {
            Intrinsics.gEmmrt("");
            abstractC16433ejo = null;
        }
        abstractC16433ejo.AhwBna.setViewDataBean(new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrNnAm), false, str, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }

    public final void EZpvd(java.lang.String str) {
        AbstractC16433ejo abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo == null) {
            Intrinsics.gEmmrt("");
            abstractC16433ejo = null;
        }
        abstractC16433ejo.AEQbTJ.setViewDataBean(new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aJZHYI), false, str == null ? "" : str, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }

    public final void copydefault(CustomNetworkInfo customNetworkInfo) {
        AbstractC16433ejo abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo == null) {
            Intrinsics.gEmmrt("");
            abstractC16433ejo = null;
        }
        C57471yiz c57471yiz = abstractC16433ejo.KWHzl;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPHsZd);
        java.lang.String symbol = customNetworkInfo.getSymbol();
        c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(strAYXKKw, false, symbol == null ? "" : symbol, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }

    public final void AEQbTJ(CustomNetworkInfo customNetworkInfo) {
        java.lang.String explorerUrl;
        AbstractC16433ejo abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo == null) {
            Intrinsics.gEmmrt("");
            abstractC16433ejo = null;
        }
        C57471yiz c57471yiz = abstractC16433ejo.copydefault;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPhTBN);
        java.lang.String explorerUrl2 = customNetworkInfo.getExplorerUrl();
        if (explorerUrl2 == null || explorerUrl2.length() == 0) {
            explorerUrl = "--";
        } else {
            explorerUrl = customNetworkInfo.getExplorerUrl();
            Intrinsics.copydefault((java.lang.Object) explorerUrl);
        }
        c57471yiz.setViewDataBean(new TransactionGeneralInfoBean(strAYXKKw, false, explorerUrl, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }

    private final void copydefault() {
        AbstractC16433ejo abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo == null) {
            Intrinsics.gEmmrt("");
            abstractC16433ejo = null;
        }
        abstractC16433ejo.AkhnZx.OLrzqt.setViewDataBean(new TransactionReminderInfoBean(1, C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialaKhcqp), (java.lang.CharSequence) null, (Function0) null, 12, (DefaultConstructorMarker) null));
    }

    private final void KWHzl() {
        AbstractC16433ejo abstractC16433ejo = this.copydefault;
        if (abstractC16433ejo == null) {
            Intrinsics.gEmmrt("");
            abstractC16433ejo = null;
        }
        abstractC16433ejo.OLrzqt.setViewDataBean(new TransactionButtonGroupInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZNAhV), C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialRtjmuc), new Function0() { // from class: o.fYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17951fYi.EZpvd(this.copydefault);
            }
        }, new Function0() { // from class: o.fYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17951fYi.OLrzqt(this.AEQbTJ);
            }
        }));
    }

    public static final Unit EZpvd(ActivityC17951fYi activityC17951fYi) {
        activityC17951fYi.finish();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC17951fYi activityC17951fYi) {
        activityC17951fYi.showLoading();
        activityC17951fYi.EZpvd().djBIcL();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.KWHzl = null;
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
