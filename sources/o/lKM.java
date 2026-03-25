package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.data.Icon;
import com.okinc.buysell.view.LegacyBuySellHeader;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.presentation.PaymentMethodParameter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C30077lLa;
import o.C30094lLr;
import o.C30172lOn;
import o.C31351lsQ;
import o.C52761wXj;
import o.lNN;
import o.mDC;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lKM extends lKW<AbstractC31407ltT> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Icon.values().length];
            try {
                iArr[Icon.CLOSE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Icon.FAQ.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Icon.HISTORY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[Icon.NO_ICON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr;
        }
    }

    @Override // o.lzF
    public void EZpvd() {
    }

    public lKM() {
        super(C31351lsQ.ActionBar.gEmmrt);
        final Function0 function0 = null;
        this.copydefault = new ViewModelLazy(C56524yIo.AEQbTJ(lKU.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.paymentmethod.BuySellPaymentMethodListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.paymentmethod.BuySellPaymentMethodListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.paymentmethod.BuySellPaymentMethodListActivity$special$$inlined$viewModels$default$3
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

    private final lKU gEmmrt() {
        return (lKU) this.copydefault.getValue();
    }

    @Override // o.lKW, o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((InterfaceC31670lzr) C43251rlk.copydefault(InterfaceC31670lzr.class)).KWHzl(this, UKBannerType.APPROVED_6OCT23);
    }

    @Override // o.lzF
    public void KWHzl(@NotNull android.content.Intent intent, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "");
        AhwBna();
        if (bundle == null) {
            PaymentMethodParameter paymentMethodParameter = (PaymentMethodParameter) getIntent().getParcelableExtra("PAYMENT_METHOD_PARAMETER");
            if (paymentMethodParameter == null) {
                paymentMethodParameter = new PaymentMethodParameter("USD", "", "BTC", "", TradeType.BUY, 1, 2, false, 0, false, (com.okinc.okpaymentapi.data.remote.model.management.Channel) null, (PaymentMethod) null, Utf8.MASK_2BYTES, (DefaultConstructorMarker) null);
            }
            if (paymentMethodParameter.getTradeType() == TradeType.BUY) {
                if (paymentMethodParameter.isFromBSC()) {
                    androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                    fragmentTransactionBeginTransaction.setReorderingAllowed(true);
                    int i = C31351lsQ.Application.zzQwtT;
                    C30077lLa.TaskDescription taskDescription = C30077lLa.Companion;
                    java.lang.String fiatCurrency = paymentMethodParameter.getFiatCurrency();
                    java.lang.String fiatAmount = paymentMethodParameter.getFiatAmount();
                    java.lang.String cryptoCurrency = paymentMethodParameter.getCryptoCurrency();
                    java.lang.String cryptoAmount = paymentMethodParameter.getCryptoAmount();
                    TradeType tradeType = paymentMethodParameter.getTradeType();
                    int inputType = paymentMethodParameter.getInputType();
                    fragmentTransactionBeginTransaction.add(i, taskDescription.OLrzqt(fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, tradeType, java.lang.Integer.valueOf(inputType), paymentMethodParameter.getCryptoPrecision(), paymentMethodParameter.getCurrencyScale(), paymentMethodParameter.isRecurringFlow(), paymentMethodParameter.getUserSelectedChannel(), paymentMethodParameter.getUserSelectedPaymentMethod()));
                    fragmentTransactionBeginTransaction.commitNow();
                    return;
                }
                androidx.fragment.app.FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction2 = supportFragmentManager2.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "");
                fragmentTransactionBeginTransaction2.setReorderingAllowed(true);
                int i2 = C31351lsQ.Application.zzQwtT;
                C30094lLr.TaskDescription taskDescription2 = C30094lLr.Companion;
                java.lang.String fiatCurrency2 = paymentMethodParameter.getFiatCurrency();
                java.lang.String fiatAmount2 = paymentMethodParameter.getFiatAmount();
                java.lang.String cryptoCurrency2 = paymentMethodParameter.getCryptoCurrency();
                java.lang.String cryptoAmount2 = paymentMethodParameter.getCryptoAmount();
                TradeType tradeType2 = paymentMethodParameter.getTradeType();
                int inputType2 = paymentMethodParameter.getInputType();
                fragmentTransactionBeginTransaction2.add(i2, taskDescription2.KWHzl(fiatCurrency2, fiatAmount2, cryptoCurrency2, cryptoAmount2, tradeType2, java.lang.Integer.valueOf(inputType2), paymentMethodParameter.getCryptoPrecision()));
                fragmentTransactionBeginTransaction2.commitNow();
                return;
            }
            if (paymentMethodParameter.getTradeType() == TradeType.SELL) {
                if (paymentMethodParameter.isFromBSC()) {
                    androidx.fragment.app.FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "");
                    androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction3 = supportFragmentManager3.beginTransaction();
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction3, "");
                    fragmentTransactionBeginTransaction3.setReorderingAllowed(true);
                    int i3 = C31351lsQ.Application.zzQwtT;
                    lNN.TaskDescription taskDescription3 = lNN.Companion;
                    java.lang.String fiatCurrency3 = paymentMethodParameter.getFiatCurrency();
                    java.lang.String fiatAmount3 = paymentMethodParameter.getFiatAmount();
                    java.lang.String cryptoCurrency3 = paymentMethodParameter.getCryptoCurrency();
                    java.lang.String cryptoAmount3 = paymentMethodParameter.getCryptoAmount();
                    TradeType tradeType3 = paymentMethodParameter.getTradeType();
                    int inputType3 = paymentMethodParameter.getInputType();
                    fragmentTransactionBeginTransaction3.add(i3, taskDescription3.AEQbTJ(fiatCurrency3, fiatAmount3, cryptoCurrency3, cryptoAmount3, tradeType3, java.lang.Integer.valueOf(inputType3), paymentMethodParameter.getCryptoPrecision(), paymentMethodParameter.getCurrencyScale()));
                    fragmentTransactionBeginTransaction3.commitNow();
                    return;
                }
                androidx.fragment.app.FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager4, "");
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction4 = supportFragmentManager4.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction4, "");
                fragmentTransactionBeginTransaction4.setReorderingAllowed(true);
                int i4 = C31351lsQ.Application.zzQwtT;
                C30172lOn.ActionBar actionBar = C30172lOn.Companion;
                java.lang.String fiatCurrency4 = paymentMethodParameter.getFiatCurrency();
                java.lang.String fiatAmount4 = paymentMethodParameter.getFiatAmount();
                java.lang.String cryptoCurrency4 = paymentMethodParameter.getCryptoCurrency();
                java.lang.String cryptoAmount4 = paymentMethodParameter.getCryptoAmount();
                TradeType tradeType4 = paymentMethodParameter.getTradeType();
                int inputType4 = paymentMethodParameter.getInputType();
                fragmentTransactionBeginTransaction4.add(i4, actionBar.EZpvd(fiatCurrency4, fiatAmount4, cryptoCurrency4, cryptoAmount4, tradeType4, java.lang.Integer.valueOf(inputType4), paymentMethodParameter.getCryptoPrecision()));
                fragmentTransactionBeginTransaction4.commitNow();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.lzF
    public void KWHzl() {
        OLrzqt(((AbstractC31407ltT) AEQbTJ()).OLrzqt);
    }

    private final void AhwBna() {
        mHA mha = mHA.OLrzqt;
        mha.copydefault(gEmmrt().copydefault(), this, new Function1() { // from class: o.lKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lKM.KWHzl(this.copydefault, (java.lang.String) obj);
            }
        });
        mha.copydefault(gEmmrt().EZpvd(), this, new Function1() { // from class: o.lKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lKM.AEQbTJ(this.KWHzl, (Icon) obj);
            }
        });
        mha.copydefault(gEmmrt().AEQbTJ(), this, new Function1() { // from class: o.lKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lKM.OLrzqt(this.AEQbTJ, (Icon) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(lKM lkm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((AbstractC31407ltT) lkm.AEQbTJ()).OLrzqt.setTitle(str);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final lKM lkm, Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "");
        int i = Application.AEQbTJ[icon.ordinal()];
        if (i == 1) {
            ((AbstractC31407ltT) lkm.AEQbTJ()).OLrzqt.copydefault(C52761wXj.TaskDescription.DztXDE, new Function0() { // from class: o.lKO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return lKM.AYXKKw(this.EZpvd);
                }
            });
        } else if (i == 2) {
            ((AbstractC31407ltT) lkm.AEQbTJ()).OLrzqt.copydefault(C52761wXj.TaskDescription.v, new Function0() { // from class: o.lKQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return lKM.AhwBna(this.copydefault);
                }
            });
        } else if (i == 3) {
            ((AbstractC31407ltT) lkm.AEQbTJ()).OLrzqt.copydefault(mDC.StateListAnimator.AYXKKw, new Function0() { // from class: o.lKR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return lKM.valueOf(this.KWHzl);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(lKM lkm) {
        Function0<Unit> function0KWHzl = lkm.gEmmrt().KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(lKM lkm) {
        Function0<Unit> function0KWHzl = lkm.gEmmrt().KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(lKM lkm) {
        Function0<Unit> function0KWHzl = lkm.gEmmrt().KWHzl();
        if (function0KWHzl != null) {
            function0KWHzl.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.buysell.view.LegacyBuySellHeader.setBackAction$default(com.okinc.buysell.view.LegacyBuySellHeader, int, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final lKM lkm, Icon icon) {
        Intrinsics.checkNotNullParameter(icon, "");
        LegacyBuySellHeader.setBackAction$default(((AbstractC31407ltT) lkm.AEQbTJ()).OLrzqt, 0, new Function0() { // from class: o.lKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return lKM.AEQbTJ(this.EZpvd);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(lKM lkm) {
        Function0<Unit> function0OLrzqt = lkm.gEmmrt().OLrzqt();
        if (function0OLrzqt != null) {
            function0OLrzqt.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lKM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void OLrzqt(@NotNull android.content.Context context, @NotNull PaymentMethodParameter paymentMethodParameter) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(paymentMethodParameter, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) lKM.class);
            C47245tmR.copydefault(intent, paymentMethodParameter);
            context.startActivity(intent);
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull PaymentMethodParameter paymentMethodParameter, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(paymentMethodParameter, "");
            Intrinsics.checkNotNullParameter(activityResultLauncher, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) lKM.class);
            C47245tmR.copydefault(intent, paymentMethodParameter);
            activityResultLauncher.launch(intent);
        }
    }

    @Override // o.lKW, o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lKW, o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lKW, o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.lKW, o.lzF, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
