package o;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class fYV extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public AbstractC16437ejs EZpvd;
    public final InterfaceC56387yDm KWHzl;

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public fYV() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(fYZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.transaction.custom.TransactionAddTokenActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.transaction.custom.TransactionAddTokenActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.transaction.custom.TransactionAddTokenActivity$special$$inlined$viewModels$default$3
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

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fYV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull CustomNetworkInfo customNetworkInfo, java.lang.String str3, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(customNetworkInfo, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, fYV.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("chain_id", str2);
            intent.putExtra("source", i);
            intent.putExtra("custom_network_info", customNetworkInfo);
            intent.putExtra("wc_topic", str3);
            intent.putExtra("wc_id", l);
            return intent;
        }
    }

    public final fYZ copydefault() {
        return (fYZ) this.KWHzl.getValue();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.EZpvd = (AbstractC16437ejs) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.OFhtUX);
        final java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        final java.lang.String stringExtra2 = getIntent().getStringExtra("chain_id");
        final int intExtra = getIntent().getIntExtra("source", 0);
        android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("custom_network_info");
        Intrinsics.copydefault(parcelableExtra);
        final CustomNetworkInfo customNetworkInfo = (CustomNetworkInfo) parcelableExtra;
        final java.lang.String stringExtra3 = getIntent().getStringExtra("wc_topic");
        final long longExtra = getIntent().getLongExtra("wc_id", 0L);
        AbstractC16437ejs abstractC16437ejs = this.EZpvd;
        if (abstractC16437ejs == null) {
            Intrinsics.gEmmrt("");
            abstractC16437ejs = null;
        }
        C55173xeu c55173xeu = abstractC16437ejs.AEQbTJ;
        c55173xeu.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk));
        c55173xeu.setImage(C52761wXj.TaskDescription.getSerial);
        C8003auW.copydefault(c55173xeu.AEQbTJ()).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.fYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                fYV.copydefault(this.OLrzqt, stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, longExtra, obj);
            }
        });
        copydefault().EZpvd().observe(this, new StateListAnimator(new Function1() { // from class: o.fYU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYV.EZpvd(this.copydefault, customNetworkInfo, stringExtra2, (java.lang.Boolean) obj);
            }
        }));
        showLoadingWithLogo();
        copydefault().AEQbTJ(stringExtra, stringExtra2, intExtra, customNetworkInfo, stringExtra3, longExtra);
        copydefault().KWHzl().observe(this, new StateListAnimator(new Function1() { // from class: o.fZc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return fYV.EZpvd(this.AEQbTJ, intExtra, (kotlin.Pair) obj);
            }
        }));
    }

    public static final void copydefault(fYV fyv, java.lang.String str, java.lang.String str2, int i, CustomNetworkInfo customNetworkInfo, java.lang.String str3, long j, java.lang.Object obj) {
        AbstractC16437ejs abstractC16437ejs = fyv.EZpvd;
        if (abstractC16437ejs == null) {
            Intrinsics.gEmmrt("");
            abstractC16437ejs = null;
        }
        abstractC16437ejs.KWHzl.setVisibility(8);
        fyv.showLoadingWithLogo();
        fyv.copydefault().AEQbTJ(str, str2, i, customNetworkInfo, str3, j);
    }

    public static final Unit EZpvd(final fYV fyv, CustomNetworkInfo customNetworkInfo, java.lang.String str, java.lang.Boolean bool) {
        fyv.dismissLoadingWithLogo();
        AbstractC16437ejs abstractC16437ejs = null;
        if (bool.booleanValue()) {
            AbstractC16437ejs abstractC16437ejs2 = fyv.EZpvd;
            if (abstractC16437ejs2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16437ejs = abstractC16437ejs2;
            }
            abstractC16437ejs.gEmmrt.setVisibility(0);
            fyv.KWHzl(customNetworkInfo);
            fyv.OLrzqt(str);
            fyv.EZpvd(customNetworkInfo);
            fyv.EZpvd();
            fyv.getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fYT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    fYV.gEmmrt(this.OLrzqt);
                }
            });
        } else {
            AbstractC16437ejs abstractC16437ejs3 = fyv.EZpvd;
            if (abstractC16437ejs3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC16437ejs = abstractC16437ejs3;
            }
            abstractC16437ejs.KWHzl.setVisibility(0);
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(fYV fyv) {
        rVN.reportFullyDrawn$default((android.app.Activity) fyv, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit EZpvd(fYV fyv, int i, kotlin.Pair pair) {
        fyv.dismissLoading();
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
            fyv.setResult(-1, intent);
            fyv.finish();
        } else {
            java.lang.String str2 = (java.lang.String) pair.getSecond();
            if (str2 != null) {
                C55326xho.toastWithFailedIcon$default(str2, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void KWHzl(CustomNetworkInfo customNetworkInfo) {
        java.lang.String str;
        java.lang.Character chWlaJM;
        java.lang.String string;
        java.lang.String strOLrzqt;
        AbstractC16437ejs abstractC16437ejs;
        AbstractC16437ejs abstractC16437ejs2 = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) customNetworkInfo.getIconUrl())) {
            strOLrzqt = customNetworkInfo.getIconUrl();
        } else {
            java.lang.String symbol = customNetworkInfo.getSymbol();
            if (symbol == null || (chWlaJM = C59454zhO.wlaJM(symbol)) == null || (string = chWlaJM.toString()) == null) {
                str = null;
                abstractC16437ejs = this.EZpvd;
                if (abstractC16437ejs != null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC16437ejs2 = abstractC16437ejs;
                }
                C57422yiC c57422yiC = abstractC16437ejs2.AYXKKw;
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setLocalNightMode);
                android.graphics.drawable.Drawable drawableOLrzqt = C14726dqr.OLrzqt.OLrzqt(this);
                java.lang.String symbol2 = customNetworkInfo.getSymbol();
                java.lang.String str2 = symbol2 != null ? "" : symbol2;
                java.lang.String contractAddress = customNetworkInfo.getContractAddress();
                c57422yiC.setViewDataBean(new TransactionHeaderInfoBean(strAYXKKw, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, str, null, drawableOLrzqt, null, str2, null, false, contractAddress != null ? "" : contractAddress, null, null, 0, null, null, null, null, null, 1046191, null)), false, null, null, null, null, 124, null));
            }
            strOLrzqt = C9700baY.OLrzqt(string);
        }
        str = strOLrzqt;
        abstractC16437ejs = this.EZpvd;
        if (abstractC16437ejs != null) {
        }
        C57422yiC c57422yiC2 = abstractC16437ejs2.AYXKKw;
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setLocalNightMode);
        android.graphics.drawable.Drawable drawableOLrzqt2 = C14726dqr.OLrzqt.OLrzqt(this);
        java.lang.String symbol22 = customNetworkInfo.getSymbol();
        if (symbol22 != null) {
        }
        java.lang.String contractAddress2 = customNetworkInfo.getContractAddress();
        c57422yiC2.setViewDataBean(new TransactionHeaderInfoBean(strAYXKKw2, C56402yEa.EZpvd(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, str, null, drawableOLrzqt2, null, str2, null, false, contractAddress2 != null ? "" : contractAddress2, null, null, 0, null, null, null, null, null, 1046191, null)), false, null, null, null, null, 124, null));
    }

    public final void OLrzqt(java.lang.String str) {
        fYV fyv;
        java.lang.String str2;
        java.lang.String strDjBIcL;
        C10854bwM c10854bwMEZpvd = C11627cVg.KWHzl.EZpvd(C33129mqd.valueOf(str), true);
        if (c10854bwMEZpvd == null || (strDjBIcL = c10854bwMEZpvd.djBIcL()) == null) {
            fyv = this;
            str2 = "";
        } else {
            str2 = strDjBIcL;
            fyv = this;
        }
        AbstractC16437ejs abstractC16437ejs = fyv.EZpvd;
        if (abstractC16437ejs == null) {
            Intrinsics.gEmmrt("");
            abstractC16437ejs = null;
        }
        abstractC16437ejs.djBIcL.setViewDataBean(new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DPHNDa), false, str2, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }

    public final void EZpvd(CustomNetworkInfo customNetworkInfo) {
        AbstractC16437ejs abstractC16437ejs = this.EZpvd;
        if (abstractC16437ejs == null) {
            Intrinsics.gEmmrt("");
            abstractC16437ejs = null;
        }
        abstractC16437ejs.EZpvd.setViewDataBean(new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RqmePg), false, C33129mqd.gEmmrt(java.lang.Integer.valueOf(customNetworkInfo.getDecimals())), null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null));
    }

    private final void EZpvd() {
        AbstractC16437ejs abstractC16437ejs = this.EZpvd;
        if (abstractC16437ejs == null) {
            Intrinsics.gEmmrt("");
            abstractC16437ejs = null;
        }
        abstractC16437ejs.copydefault.setViewDataBean(new TransactionButtonGroupInfoBean(C33070mpX.AYXKKw(C13754dXa.FragmentManager.RZNAhV), C33070mpX.AYXKKw(C13754dXa.FragmentManager.invokespecialRtjmuc), new Function0() { // from class: o.fZb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fYV.KWHzl(this.OLrzqt);
            }
        }, new Function0() { // from class: o.fZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return fYV.EZpvd(this.KWHzl);
            }
        }));
    }

    public static final Unit KWHzl(fYV fyv) {
        fyv.finish();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(fYV fyv) {
        fyv.showLoading();
        fyv.copydefault().valueOf();
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
