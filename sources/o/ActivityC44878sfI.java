package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.okex.center.ui.SupportFullRecentActivitiesActivity$observeViewModel$2;
import com.okinc.okex.center.ui.fragment.SupportRecentActivitiesListFragment;
import com.okinc.okex.center.viewmodel.SupportFullRecentActivitiesViewModel;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC44038sBa;
import o.C45167skg;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sfI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC44878sfI extends AbstractActivityC44920sfy {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.sfO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44878sfI.EZpvd(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm OLrzqt;

    /* JADX INFO: renamed from: o.sfI$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    public ActivityC44878sfI() {
        final Function0 function0 = null;
        this.OLrzqt = new ViewModelLazy(C56524yIo.AEQbTJ(SupportFullRecentActivitiesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.center.ui.SupportFullRecentActivitiesActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.center.ui.SupportFullRecentActivitiesActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.center.ui.SupportFullRecentActivitiesActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method o.sfy.KWHzl()V */
    public final SupportFullRecentActivitiesViewModel KWHzl() {
        return (SupportFullRecentActivitiesViewModel) this.OLrzqt.getValue();
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.snZ.AEQbTJ()V */
    public final AbstractC47295tnO AEQbTJ() {
        return (AbstractC47295tnO) this.AEQbTJ.getValue();
    }

    public static final AbstractC47295tnO EZpvd(ActivityC44878sfI activityC44878sfI) {
        return AbstractC47295tnO.EZpvd(activityC44878sfI.getLayoutInflater());
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public android.view.View AkhnZx() {
        android.view.View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ();
        gEmmrt();
        OKSupportBaseActivity.setErrorRetryClickListener$default(this, 0, new Function0() { // from class: o.sfK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC44878sfI.AEQbTJ(this.copydefault);
            }
        }, 1, null);
    }

    public static final Unit AEQbTJ(ActivityC44878sfI activityC44878sfI) {
        activityC44878sfI.KWHzl().KWHzl();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC44920sfy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
        KWHzl().KWHzl();
    }

    private final void EZpvd() {
        KWHzl().OLrzqt().observe(this, new Application(new Function1() { // from class: o.sfG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC44878sfI.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new SupportFullRecentActivitiesActivity$observeViewModel$2(this, null));
    }

    public static final Unit EZpvd(ActivityC44878sfI activityC44878sfI, java.lang.String str) {
        activityC44878sfI.EZpvd(C33070mpX.AYXKKw(C47315tni.PendingIntent.AuCTel));
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.iwGUEr));
        OLrzqt(C33070mpX.AYXKKw(C47315tni.PendingIntent.OTwTPd));
        EZpvd(C52761wXj.LoaderManager.iwGUEr, C52761wXj.LoaderManager.valueOf);
        EZpvd(C52761wXj.TaskDescription.UJpkuA, C47315tni.Activity.djBIcL, new View.OnClickListener() { // from class: o.sfF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC44878sfI.OLrzqt(this.KWHzl, view);
            }
        });
    }

    public static final void OLrzqt(ActivityC44878sfI activityC44878sfI, android.view.View view) {
        activityC44878sfI.startActivity(ActivityC44038sBa.Application.createIntent$default(ActivityC44038sBa.Companion, activityC44878sfI, "all_activities", null, 4, null));
    }

    public final void AEQbTJ(java.util.List<? extends TransactionType> list) {
        C45167skg c45167skgNewInstance$default = C45167skg.StateListAnimator.newInstance$default(C45167skg.Companion, getIntent().getIntExtra("arg_tab_index", 0), false, 2, null);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (TransactionType transactionType : list) {
            java.lang.Integer displayStringResId = transactionType.getDisplayStringResId();
            java.lang.String strAYXKKw = displayStringResId != null ? C33070mpX.AYXKKw(displayStringResId.intValue()) : null;
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            arrayList.add(new C45167skg.Activity(strAYXKKw, SupportRecentActivitiesListFragment.Companion.OLrzqt(transactionType)));
        }
        c45167skgNewInstance$default.OLrzqt(arrayList);
        getSupportFragmentManager().beginTransaction().add(C47315tni.TaskDescription.invokespecialaGOrKO, c45167skgNewInstance$default, C45167skg.Companion.AEQbTJ()).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.sfI$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sfI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(StateListAnimator stateListAnimator, android.content.Context context, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                num = 0;
            }
            return stateListAnimator.copydefault(context, num);
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC44878sfI.class);
            intent.putExtra("arg_tab_index", num);
            return intent;
        }
    }

    @Override // o.AbstractActivityC44920sfy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44920sfy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44920sfy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44920sfy, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
