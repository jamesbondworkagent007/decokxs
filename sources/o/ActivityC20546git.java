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
import com.okinc.web3Uilib.bean.TransactionInfoRowBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.C57512yjn;
import o.C57523yjy;
import o.C57524yjz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.git, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20546git extends AbstractActivityC33013moT {
    public static Function1<? super android.os.Bundle, Unit> EZpvd;
    public AbstractC16355eiP AEQbTJ;
    public Function1<? super android.os.Bundle, Unit> OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;

    /* JADX INFO: renamed from: o.git$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public ActivityC20546git() {
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(C17954fYl.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.addcustomchains.OKWAddCustomChainActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.addcustomchains.OKWAddCustomChainActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.addcustomchains.OKWAddCustomChainActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.git$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.git.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(Function1<? super android.os.Bundle, Unit> function1) {
            ActivityC20546git.EZpvd = function1;
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull CustomNetworkInfo customNetworkInfo, java.lang.String str3, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(customNetworkInfo, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC20546git.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("chain_id", str2);
            intent.putExtra("source", i);
            intent.putExtra("custom_network_info", customNetworkInfo);
            intent.putExtra("wc_topic", str3);
            intent.putExtra("wc_id", l);
            return intent;
        }
    }

    private final C17954fYl OLrzqt() {
        return (C17954fYl) this.copydefault.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        final AbstractC16355eiP abstractC16355eiP = (AbstractC16355eiP) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.DCJXGO);
        this.OLrzqt = EZpvd;
        EZpvd = null;
        if (abstractC16355eiP == null) {
            finish();
            return;
        }
        this.AEQbTJ = abstractC16355eiP;
        final java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        final java.lang.String stringExtra2 = getIntent().getStringExtra("chain_id");
        final int intExtra = getIntent().getIntExtra("source", 0);
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("custom_network_info");
        Intrinsics.copydefault(parcelableExtra);
        final CustomNetworkInfo customNetworkInfo = (CustomNetworkInfo) parcelableExtra;
        final java.lang.String stringExtra3 = getIntent().getStringExtra("wc_topic");
        final long longExtra = getIntent().getLongExtra("wc_id", 0L);
        C55173xeu c55173xeu = abstractC16355eiP.AhwBna;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setImage(C52761wXj.TaskDescription.getSerial);
        C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.gis
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC20546git.copydefault(abstractC16355eiP, this, stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, longExtra, obj);
            }
        });
        OLrzqt().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.giq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20546git.OLrzqt(this.KWHzl, abstractC16355eiP, customNetworkInfo, stringExtra2, (java.lang.String) obj);
            }
        }));
        showLoadingWithLogo();
        OLrzqt().KWHzl(stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, java.lang.Long.valueOf(longExtra));
        OLrzqt().AEQbTJ().observe(this, new TaskDescription(new Function1() { // from class: o.gir
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20546git.KWHzl(this.AEQbTJ, intExtra, (kotlin.Pair) obj);
            }
        }));
    }

    public static final void copydefault(AbstractC16355eiP abstractC16355eiP, ActivityC20546git activityC20546git, java.lang.String str, java.lang.String str2, int i, CustomNetworkInfo customNetworkInfo, java.lang.String str3, long j, java.lang.Object obj) {
        abstractC16355eiP.AYXKKw.setVisibility(8);
        activityC20546git.showLoadingWithLogo();
        activityC20546git.OLrzqt().KWHzl(str, str2, i, customNetworkInfo, str3, java.lang.Long.valueOf(j));
    }

    public static final Unit OLrzqt(ActivityC20546git activityC20546git, AbstractC16355eiP abstractC16355eiP, CustomNetworkInfo customNetworkInfo, java.lang.String str, java.lang.String str2) {
        activityC20546git.dismissLoadingWithLogo();
        if (str2 == null) {
            abstractC16355eiP.AYXKKw.setVisibility(0);
        } else {
            abstractC16355eiP.djBIcL.setVisibility(0);
            activityC20546git.KWHzl();
            activityC20546git.KWHzl(customNetworkInfo);
            activityC20546git.copydefault(customNetworkInfo);
            activityC20546git.AEQbTJ(str2);
            activityC20546git.EZpvd(str);
            activityC20546git.EZpvd(customNetworkInfo);
            activityC20546git.OLrzqt(customNetworkInfo);
            activityC20546git.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC20546git activityC20546git, int i, kotlin.Pair pair) {
        activityC20546git.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str != null) {
                C55326xho.toastWithSuccessfulIcon$default(str, 0, 1, (java.lang.Object) null);
            }
            if (activityC20546git.OLrzqt != null) {
                android.content.Intent intentOLrzqt = activityC20546git.OLrzqt(i);
                Function1<? super android.os.Bundle, Unit> function1 = activityC20546git.OLrzqt;
                if (function1 != null) {
                    function1.invoke(intentOLrzqt.getExtras());
                }
            } else {
                activityC20546git.setResult(-1, activityC20546git.OLrzqt(i));
            }
            activityC20546git.finish();
        } else {
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            if (str2 != null) {
                C55326xho.toastWithFailedIcon$default(str2, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private final android.content.Intent OLrzqt(int i) {
        android.content.Intent intent = new android.content.Intent();
        if (i != 5) {
            intent.putExtra("addCustomNetwork", true);
        }
        intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, OLrzqt().copydefault().getValue());
        return intent;
    }

    private final void KWHzl() {
        AbstractC16355eiP abstractC16355eiP = this.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        C57524yjz c57524yjz = abstractC16355eiP.isConnected;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.glVQsU);
        c57524yjz.setData(new C57524yjz.TaskDescription(C56402yEa.EZpvd(new C57524yjz.ActionBar(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.initializePanelContent, C56423yEv.EZpvd(C56390yDp.OLrzqt("type", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.giv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20546git.EZpvd((java.util.List) obj);
            }
        }, 14, null))), "", null, 1));
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)));
        return Unit.INSTANCE;
    }

    public final void KWHzl(CustomNetworkInfo customNetworkInfo) {
        ActivityC20546git activityC20546git;
        java.lang.String strAYXKKw;
        java.lang.String url;
        java.lang.String iconUrl = customNetworkInfo.getIconUrl();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) customNetworkInfo.getName())) {
            activityC20546git = this;
            strAYXKKw = customNetworkInfo.getName();
            url = C33129mqd.OLrzqt((java.lang.CharSequence) customNetworkInfo.getUrl()) ? customNetworkInfo.getUrl() : null;
        } else {
            activityC20546git = this;
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.closePanel);
            url = null;
        }
        AbstractC16355eiP abstractC16355eiP = activityC20546git.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        C57512yjn c57512yjn = abstractC16355eiP.gEmmrt;
        C57512yjn.TaskDescription taskDescription = new C57512yjn.TaskDescription(iconUrl, null, 0, 0, 14, null);
        C57512yjn.StateListAnimator stateListAnimator = new C57512yjn.StateListAnimator(strAYXKKw == null ? "" : strAYXKKw, null, null, null, null, null, 62, null);
        if (url == null) {
            url = "";
        }
        c57512yjn.setData(new C57512yjn.ActionBar(null, taskDescription, stateListAnimator, url));
    }

    public final void copydefault(CustomNetworkInfo customNetworkInfo) {
        AbstractC16355eiP abstractC16355eiP = this.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        C57523yjy c57523yjy = abstractC16355eiP.valueOf;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPHNDa);
        java.lang.String chainName = customNetworkInfo.getChainName();
        java.lang.String str = chainName == null ? "" : chainName;
        java.lang.String chainName2 = customNetworkInfo.getChainName();
        c57523yjy.setData(new C57523yjy.ActionBar(strAYXKKw, str, C9700baY.OLrzqt(java.lang.String.valueOf(chainName2 != null ? C59454zhO.wlaJM(chainName2) : null)), null, false, null, null, null, null, null, 1016, null));
    }

    public final void AEQbTJ(java.lang.String str) {
        AbstractC16355eiP abstractC16355eiP = this.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        abstractC16355eiP.values.setViewDataBean(new TransactionInfoRowBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DrNnAm), null, str, null, null, null, null, false, null, null, null, null, false, null, 16378, null));
    }

    private final void EZpvd(java.lang.String str) {
        AbstractC16355eiP abstractC16355eiP = this.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        abstractC16355eiP.OLrzqt.setViewDataBean(new TransactionInfoRowBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.aJZHYI), null, str == null ? "" : str, null, null, null, null, false, null, null, null, null, false, null, 16378, null));
    }

    private final void EZpvd(CustomNetworkInfo customNetworkInfo) {
        AbstractC16355eiP abstractC16355eiP = this.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        C57518yjt c57518yjt = abstractC16355eiP.copydefault;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPHsZd);
        java.lang.String symbol = customNetworkInfo.getSymbol();
        c57518yjt.setViewDataBean(new TransactionInfoRowBean(strAYXKKw, null, symbol == null ? "" : symbol, null, null, null, null, false, null, null, null, null, false, null, 16378, null));
    }

    private final void OLrzqt(CustomNetworkInfo customNetworkInfo) {
        java.lang.String explorerUrl;
        AbstractC16355eiP abstractC16355eiP = this.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        C57518yjt c57518yjt = abstractC16355eiP.EZpvd;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPhTBN);
        java.lang.String explorerUrl2 = customNetworkInfo.getExplorerUrl();
        if (explorerUrl2 == null || explorerUrl2.length() == 0) {
            explorerUrl = "--";
        } else {
            explorerUrl = customNetworkInfo.getExplorerUrl();
            Intrinsics.copydefault((java.lang.Object) explorerUrl);
        }
        c57518yjt.setViewDataBean(new TransactionInfoRowBean(strAYXKKw, null, explorerUrl, null, null, null, null, false, null, null, null, null, false, null, 16378, null));
    }

    private final void copydefault() {
        AbstractC16355eiP abstractC16355eiP = this.AEQbTJ;
        if (abstractC16355eiP == null) {
            Intrinsics.gEmmrt("");
            abstractC16355eiP = null;
        }
        abstractC16355eiP.AEQbTJ.setViewDataBean(new TransactionButtonGroupInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZNAhV), C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialRtjmuc), new Function0() { // from class: o.giu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC20546git.copydefault(this.OLrzqt);
            }
        }, new Function0() { // from class: o.giw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC20546git.OLrzqt(this.OLrzqt);
            }
        }));
    }

    public static final Unit copydefault(ActivityC20546git activityC20546git) {
        activityC20546git.finish();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC20546git activityC20546git) {
        activityC20546git.showLoading();
        activityC20546git.OLrzqt().djBIcL();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.OLrzqt = null;
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
