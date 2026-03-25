package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.preference.ui.currency.CurrencySettingActivity$observeViewModel$1;
import com.okinc.preference.ui.currency.CurrencySettingActivity$observeViewModel$2;
import com.okinc.preference.ui.currency.CurrencySettingActivity$observeViewModel$3;
import com.okinc.preference.ui.currency.CurrencySettingViewModel;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o.C46526tXp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class tYG extends tYY {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public tXC KWHzl;
    public tYO OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.tYK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(tYG.AEQbTJ(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.tYI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(tYG.djBIcL(this.copydefault));
        }
    });

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tYG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void startActivity$default(Application application, android.content.Context context, boolean z, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                num = 0;
            }
            application.copydefault(context, z, num);
        }

        public final void copydefault(@NotNull android.content.Context context, boolean z, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) tYG.class);
            intent.putExtra("from", num);
            intent.putExtra("ARG_IS_WEB3", z);
            context.startActivity(intent);
        }
    }

    public tYG() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(CurrencySettingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.preference.ui.currency.CurrencySettingActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.preference.ui.currency.CurrencySettingActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.preference.ui.currency.CurrencySettingActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.tYY.OLrzqt()V */
    public final CurrencySettingViewModel OLrzqt() {
        return (CurrencySettingViewModel) this.djBIcL.getValue();
    }

    public final int EZpvd() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int AEQbTJ(tYG tyg) {
        android.content.Intent intent = tyg.getIntent();
        if (intent != null) {
            return intent.getIntExtra("from", 0);
        }
        return 0;
    }

    public static final boolean djBIcL(tYG tyg) {
        android.content.Intent intent = tyg.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("ARG_IS_WEB3", false);
        }
        return false;
    }

    /* JADX DEBUG: Possible override for method o.tYY.AEQbTJ()V */
    public final boolean AEQbTJ() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    @Override // o.tYY, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        tXC txcKWHzl = tXC.KWHzl(getLayoutInflater());
        this.KWHzl = txcKWHzl;
        if (txcKWHzl == null) {
            Intrinsics.gEmmrt("");
            txcKWHzl = null;
        }
        setContentView(txcKWHzl.getRoot());
        valueOf();
        djBIcL();
        AYXKKw();
    }

    private final void valueOf() {
        java.lang.String string;
        tXC txc = this.KWHzl;
        tXC txc2 = null;
        if (txc == null) {
            Intrinsics.gEmmrt("");
            txc = null;
        }
        C33537myN c33537myN = txc.AEQbTJ;
        if (!AEQbTJ()) {
            string = getResources().getString(C46526tXp.TaskDescription.gEmmrt);
        } else {
            string = getResources().getString(C46526tXp.TaskDescription.copydefault);
        }
        c33537myN.setTitle(string);
        tXC txc3 = this.KWHzl;
        if (txc3 == null) {
            Intrinsics.gEmmrt("");
            txc3 = null;
        }
        OKReminder oKReminder = txc3.EZpvd;
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(0);
        oKReminder.KWHzl().setTextAlignment(5);
        oKReminder.setMessage(getString(C46526tXp.TaskDescription.djBIcL));
        tXC txc4 = this.KWHzl;
        if (txc4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            txc2 = txc4;
        }
        C33606mzd.AEQbTJ(txc2.djBIcL.KWHzl(), new Function1() { // from class: o.tYH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tYG.AEQbTJ(this.OLrzqt, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit AEQbTJ(tYG tyg, java.lang.CharSequence charSequence) {
        java.lang.String string;
        CurrencySettingViewModel currencySettingViewModelOLrzqt = tyg.OLrzqt();
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        currencySettingViewModelOLrzqt.KWHzl(string);
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        this.OLrzqt = new tYO(new Function1() { // from class: o.tYJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tYG.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        tXC txc = this.KWHzl;
        tYO tyo = null;
        if (txc == null) {
            Intrinsics.gEmmrt("");
            txc = null;
        }
        RecyclerView recyclerView = txc.OLrzqt;
        tYO tyo2 = this.OLrzqt;
        if (tyo2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            tyo = tyo2;
        }
        recyclerView.setAdapter(tyo);
    }

    public static final Unit AEQbTJ(tYG tyg, int i) {
        tyg.OLrzqt().OLrzqt(i, tyg.EZpvd());
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().AEQbTJ(), new CurrencySettingActivity$observeViewModel$1(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().KWHzl(), new CurrencySettingActivity$observeViewModel$2(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        FlowKt.launchIn(FlowKt.onEach(OLrzqt().OLrzqt(), new CurrencySettingActivity$observeViewModel$3(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
    }

    public final void copydefault(tYL tyl) {
        if (tyl.EZpvd()) {
            showLoadingAtOnce();
        } else {
            dismissLoading();
        }
        java.lang.String strCopydefault = tyl.copydefault();
        if (strCopydefault != null) {
            C55326xho.toastWithFailedIcon$default(strCopydefault, 0, 1, (java.lang.Object) null);
            OLrzqt().EZpvd();
        }
    }

    @Override // o.tYY, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.tYY, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.tYY, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.tYY, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
