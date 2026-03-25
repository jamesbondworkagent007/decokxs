package o;

import androidx.core.view.PointerIconCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean;
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

/* JADX INFO: renamed from: o.gix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20550gix extends AbstractActivityC33013moT {
    public AbstractC16354eiO KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gix$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    public ActivityC20550gix() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(fYZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.addcustomchains.OKWAddCustomChainTokensActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.addcustomchains.OKWAddCustomChainTokensActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.ui.ui3.addcustomchains.OKWAddCustomChainTokensActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.gix$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gix.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull CustomNetworkInfo customNetworkInfo, java.lang.String str3, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(customNetworkInfo, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC20550gix.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("chain_id", str2);
            intent.putExtra("source", i);
            intent.putExtra("custom_network_info", customNetworkInfo);
            intent.putExtra("wc_topic", str3);
            intent.putExtra("wc_id", l);
            return intent;
        }
    }

    private final fYZ EZpvd() {
        return (fYZ) this.OLrzqt.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16354eiO) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.DXXBbs);
        final java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        final java.lang.String stringExtra2 = getIntent().getStringExtra("chain_id");
        final int intExtra = getIntent().getIntExtra("source", 0);
        final CustomNetworkInfo customNetworkInfo = (CustomNetworkInfo) getIntent().getParcelableExtra("custom_network_info");
        if (customNetworkInfo == null) {
            finish();
            return;
        }
        final java.lang.String stringExtra3 = getIntent().getStringExtra("wc_topic");
        final long longExtra = getIntent().getLongExtra("wc_id", 0L);
        AbstractC16354eiO abstractC16354eiO = this.KWHzl;
        if (abstractC16354eiO == null) {
            Intrinsics.gEmmrt("");
            abstractC16354eiO = null;
        }
        C55173xeu c55173xeu = abstractC16354eiO.copydefault;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setImage(C52761wXj.TaskDescription.getSerial);
        C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.giy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                ActivityC20550gix.AEQbTJ(this.AEQbTJ, stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, longExtra, obj);
            }
        });
        EZpvd().EZpvd().observe(this, new Application(new Function1() { // from class: o.giz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20550gix.EZpvd(this.OLrzqt, customNetworkInfo, stringExtra2, (java.lang.Boolean) obj);
            }
        }));
        showLoadingWithLogo();
        EZpvd().AEQbTJ(stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, longExtra);
        EZpvd().KWHzl().observe(this, new Application(new Function1() { // from class: o.giD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20550gix.KWHzl(this.KWHzl, intExtra, (kotlin.Pair) obj);
            }
        }));
    }

    public static final void AEQbTJ(ActivityC20550gix activityC20550gix, java.lang.String str, java.lang.String str2, int i, CustomNetworkInfo customNetworkInfo, java.lang.String str3, long j, java.lang.Object obj) {
        AbstractC16354eiO abstractC16354eiO = activityC20550gix.KWHzl;
        if (abstractC16354eiO == null) {
            Intrinsics.gEmmrt("");
            abstractC16354eiO = null;
        }
        abstractC16354eiO.EZpvd.setVisibility(8);
        activityC20550gix.showLoadingWithLogo();
        activityC20550gix.EZpvd().AEQbTJ(str, str2, i, customNetworkInfo, str3, j);
    }

    public static final Unit EZpvd(ActivityC20550gix activityC20550gix, CustomNetworkInfo customNetworkInfo, java.lang.String str, java.lang.Boolean bool) {
        activityC20550gix.dismissLoadingWithLogo();
        AbstractC16354eiO abstractC16354eiO = null;
        if (bool.booleanValue()) {
            AbstractC16354eiO abstractC16354eiO2 = activityC20550gix.KWHzl;
            if (abstractC16354eiO2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16354eiO = abstractC16354eiO2;
            }
            abstractC16354eiO.AYXKKw.setVisibility(0);
            activityC20550gix.KWHzl();
            activityC20550gix.copydefault(customNetworkInfo);
            activityC20550gix.KWHzl(str);
            activityC20550gix.KWHzl(customNetworkInfo);
            activityC20550gix.copydefault();
        } else {
            AbstractC16354eiO abstractC16354eiO3 = activityC20550gix.KWHzl;
            if (abstractC16354eiO3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16354eiO = abstractC16354eiO3;
            }
            abstractC16354eiO.EZpvd.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ActivityC20550gix activityC20550gix, int i, kotlin.Pair pair) {
        activityC20550gix.dismissLoading();
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            java.lang.String str = (java.lang.String) pair.getSecond();
            if (str != null) {
                C55326xho.toastWithSuccessfulIcon$default(str, 0, 1, (java.lang.Object) null);
            }
            android.content.Intent intent = new android.content.Intent();
            if (i != 5) {
                intent.putExtra("addCustomNetwork", true);
            }
            intent.putExtra("custom_coin", "true");
            Unit unit = Unit.INSTANCE;
            activityC20550gix.setResult(-1, intent);
            activityC20550gix.finish();
        } else {
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            if (str2 != null) {
                C55326xho.toastWithFailedIcon$default(str2, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        AbstractC16354eiO abstractC16354eiO = this.KWHzl;
        if (abstractC16354eiO == null) {
            Intrinsics.gEmmrt("");
            abstractC16354eiO = null;
        }
        C57524yjz c57524yjz = abstractC16354eiO.valueOf;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DwQSDd);
        c57524yjz.setData(new C57524yjz.TaskDescription(C56402yEa.EZpvd(new C57524yjz.ActionBar(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C13754dXa.FragmentManager.initializePanelContent, C56423yEv.EZpvd(C56390yDp.OLrzqt("type", strAYXKKw))), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.giC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC20550gix.KWHzl((java.util.List) obj);
            }
        }, 14, null))), "", null, 1));
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.dvKsVJ)));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(CustomNetworkInfo customNetworkInfo) {
        ActivityC20550gix activityC20550gix;
        java.lang.String str;
        java.lang.Character chWlaJM;
        java.lang.String string;
        java.lang.String strOLrzqt;
        AbstractC16354eiO abstractC16354eiO;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) customNetworkInfo.getIconUrl())) {
            strOLrzqt = customNetworkInfo.getIconUrl();
        } else {
            java.lang.String symbol = customNetworkInfo.getSymbol();
            if (symbol == null || (chWlaJM = C59454zhO.wlaJM(symbol)) == null || (string = chWlaJM.toString()) == null) {
                activityC20550gix = this;
                str = null;
                abstractC16354eiO = activityC20550gix.KWHzl;
                if (abstractC16354eiO == null) {
                    Intrinsics.gEmmrt("");
                    abstractC16354eiO = null;
                }
                C57512yjn c57512yjn = abstractC16354eiO.djBIcL;
                C57512yjn.TaskDescription taskDescription = new C57512yjn.TaskDescription(str, null, 0, 0, 14, null);
                java.lang.String symbol2 = customNetworkInfo.getSymbol();
                C57512yjn.StateListAnimator stateListAnimator = new C57512yjn.StateListAnimator(symbol2 != null ? "" : symbol2, null, null, null, null, null, 62, null);
                java.lang.String contractAddress = customNetworkInfo.getContractAddress();
                c57512yjn.setData(new C57512yjn.ActionBar(null, taskDescription, stateListAnimator, contractAddress != null ? contractAddress : ""));
            }
            strOLrzqt = C9700baY.OLrzqt(string);
        }
        str = strOLrzqt;
        activityC20550gix = this;
        abstractC16354eiO = activityC20550gix.KWHzl;
        if (abstractC16354eiO == null) {
        }
        C57512yjn c57512yjn2 = abstractC16354eiO.djBIcL;
        C57512yjn.TaskDescription taskDescription2 = new C57512yjn.TaskDescription(str, null, 0, 0, 14, null);
        java.lang.String symbol22 = customNetworkInfo.getSymbol();
        C57512yjn.StateListAnimator stateListAnimator2 = new C57512yjn.StateListAnimator(symbol22 != null ? "" : symbol22, null, null, null, null, null, 62, null);
        java.lang.String contractAddress2 = customNetworkInfo.getContractAddress();
        c57512yjn2.setData(new C57512yjn.ActionBar(null, taskDescription2, stateListAnimator2, contractAddress2 != null ? contractAddress2 : ""));
    }

    private final void KWHzl(java.lang.String str) {
        java.lang.String strDjBIcL;
        C10854bwM c10854bwMEZpvd = C11627cVg.KWHzl.EZpvd(C33129mqd.valueOf(str), true);
        java.lang.String str2 = (c10854bwMEZpvd == null || (strDjBIcL = c10854bwMEZpvd.djBIcL()) == null) ? "" : strDjBIcL;
        AbstractC16354eiO abstractC16354eiO = this.KWHzl;
        if (abstractC16354eiO == null) {
            Intrinsics.gEmmrt("");
            abstractC16354eiO = null;
        }
        abstractC16354eiO.AhwBna.setData(new C57523yjy.ActionBar(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPHNDa), str2, null, null, false, null, null, null, null, null, PointerIconCompat.TYPE_GRAB, null));
    }

    private final void KWHzl(CustomNetworkInfo customNetworkInfo) {
        AbstractC16354eiO abstractC16354eiO = this.KWHzl;
        if (abstractC16354eiO == null) {
            Intrinsics.gEmmrt("");
            abstractC16354eiO = null;
        }
        abstractC16354eiO.OLrzqt.setData(new C57523yjy.ActionBar(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RqmePg), C33129mqd.gEmmrt(java.lang.Integer.valueOf(customNetworkInfo.getDecimals())), null, null, false, null, null, null, null, null, PointerIconCompat.TYPE_GRAB, null));
    }

    private final void copydefault() {
        AbstractC16354eiO abstractC16354eiO = this.KWHzl;
        if (abstractC16354eiO == null) {
            Intrinsics.gEmmrt("");
            abstractC16354eiO = null;
        }
        abstractC16354eiO.KWHzl.setViewDataBean(new TransactionButtonGroupInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZNAhV), C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialRtjmuc), new Function0() { // from class: o.giB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC20550gix.EZpvd(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.giA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC20550gix.OLrzqt(this.copydefault);
            }
        }));
    }

    public static final Unit EZpvd(ActivityC20550gix activityC20550gix) {
        activityC20550gix.finish();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC20550gix activityC20550gix) {
        activityC20550gix.showLoading();
        activityC20550gix.EZpvd().valueOf();
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
