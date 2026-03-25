package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.recurring.RecurringBuyPlanHostActivityViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C30242lRc;
import o.C31351lsQ;
import o.C52761wXj;
import o.lPM;
import o.lRD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lPJ extends lPE<AbstractC31469luc> {
    public final InterfaceC56387yDm valueOf;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC31906mIh
    public void AEQbTJ(@NotNull android.content.Intent intent, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "");
    }

    public lPJ() {
        super(C31351lsQ.ActionBar.isConnected);
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(RecurringBuyPlanHostActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.recurring.RecurringBuyPlanHostActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.recurring.RecurringBuyPlanHostActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.recurring.RecurringBuyPlanHostActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/mJo; */
    /* JADX DEBUG: Possible override for method o.lPE.gEmmrt()V */
    @Override // o.AbstractActivityC31906mIh
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public RecurringBuyPlanHostActivityViewModel OLrzqt() {
        return (RecurringBuyPlanHostActivityViewModel) this.valueOf.getValue();
    }

    @Override // o.AbstractActivityC31906mIh
    public void KWHzl() {
        androidx.fragment.app.Fragment fragmentEZpvd;
        java.lang.String stringExtra;
        getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: o.lPI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                lPJ.EZpvd(this.AEQbTJ);
            }
        });
        if (getSupportFragmentManager().findFragmentById(C31351lsQ.Application.OAhWiU) == null) {
            android.content.Intent intent = getIntent();
            if (Intrinsics.EZpvd((java.lang.Object) (intent != null ? intent.getStringExtra("extra.entry_point") : null), (java.lang.Object) "detail")) {
                C30242lRc.StateListAnimator stateListAnimator = C30242lRc.Companion;
                android.content.Intent intent2 = getIntent();
                if (intent2 == null || (stringExtra = intent2.getStringExtra("extra.plan_id")) == null) {
                    stringExtra = "";
                }
                fragmentEZpvd = stateListAnimator.OLrzqt(stringExtra, getIntent().getBooleanExtra("extra.is_from_result_page", false));
            } else {
                lRD.ActionBar actionBar = lRD.Companion;
                android.content.Intent intent3 = getIntent();
                java.lang.String stringExtra2 = intent3 != null ? intent3.getStringExtra("extra.base_currency") : null;
                android.content.Intent intent4 = getIntent();
                java.lang.String stringExtra3 = intent4 != null ? intent4.getStringExtra("extra.quote_currency") : null;
                android.content.Intent intent5 = getIntent();
                fragmentEZpvd = actionBar.EZpvd(stringExtra2, stringExtra3, intent5 != null ? intent5.getStringExtra("extra.status") : null);
            }
            getSupportFragmentManager().beginTransaction().replace(C31351lsQ.Application.OAhWiU, fragmentEZpvd).commitAllowingStateLoss();
        }
    }

    public static final void EZpvd(lPJ lpj) {
        ActivityResultCaller activityResultCallerFindFragmentById = lpj.getSupportFragmentManager().findFragmentById(C31351lsQ.Application.OAhWiU);
        if (activityResultCallerFindFragmentById == null || !(activityResultCallerFindFragmentById instanceof InterfaceC31431ltr)) {
            return;
        }
        ((InterfaceC31431ltr) activityResultCallerFindFragmentById).KWHzl();
    }

    @Override // o.AbstractActivityC31906mIh
    public void EZpvd() {
        OLrzqt().KWHzl().observe(this, new TaskDescription(new Function1() { // from class: o.lPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lPJ.copydefault(this.KWHzl, (C32989mnw) obj);
            }
        }));
    }

    public static final Unit copydefault(lPJ lpj, C32989mnw c32989mnw) {
        lPM lpm = (lPM) c32989mnw.KWHzl();
        if (lpm == null) {
            return Unit.INSTANCE;
        }
        if (lpm instanceof lPM.TaskDescription) {
            lpj.getSupportFragmentManager().beginTransaction().setCustomAnimations(C52761wXj.Application.AkhnZx, C52761wXj.Application.values, C52761wXj.Application.DbNXlk, C52761wXj.Application.fARcdN).replace(C31351lsQ.Application.OAhWiU, C30242lRc.Companion.OLrzqt(((lPM.TaskDescription) lpm).EZpvd(), false)).addToBackStack(null).commitAllowingStateLoss();
        } else if (lpm instanceof lPM.Application) {
            lpj.getSupportFragmentManager().beginTransaction().setCustomAnimations(C52761wXj.Application.AkhnZx, C52761wXj.Application.values, C52761wXj.Application.DbNXlk, C52761wXj.Application.fARcdN).replace(C31351lsQ.Application.OAhWiU, lRJ.Companion.OLrzqt(((lPM.Application) lpm).AEQbTJ())).addToBackStack(null).commitAllowingStateLoss();
        } else {
            if (!(lpm instanceof lPM.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (lpj.getSupportFragmentManager().getBackStackEntryCount() > 0) {
                lpj.getSupportFragmentManager().popBackStackImmediate();
                if (((lPM.ActionBar) lpm).AEQbTJ()) {
                    java.util.List<androidx.fragment.app.Fragment> fragments = lpj.getSupportFragmentManager().getFragments();
                    Intrinsics.checkNotNullExpressionValue(fragments, "");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : fragments) {
                        if (obj instanceof lPL) {
                            arrayList.add(obj);
                        }
                    }
                    lPL lpl = (lPL) CollectionsKt___CollectionsKt.wlaJM(arrayList);
                    if (lpl != null) {
                        lpl.OLrzqt();
                    }
                }
            } else {
                lpj.onBackPressed();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lPJ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ void startActivityWithPlanList$default(Application application, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            application.OLrzqt(context, str, str2, str3);
        }

        public final void OLrzqt(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) lPJ.class);
            intent.putExtra("extra.entry_point", "list");
            intent.putExtra("extra.base_currency", str);
            intent.putExtra("extra.quote_currency", str2);
            intent.putExtra("extra.status", str3);
            context.startActivity(intent);
        }
    }

    @Override // o.lPE, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.lPE, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.lPE, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.lPE, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.lPE, o.AbstractActivityC31906mIh, o.AbstractActivityC33009moP, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
