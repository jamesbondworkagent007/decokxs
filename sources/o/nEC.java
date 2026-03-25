package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.conversationlist.ConversationListFragment;
import com.okinc.im.imui.conversationlist.model.ConversationListParams;
import com.okinc.im.imui.conversationlist.viewmodel.ConversationListActivityViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.nFM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class nEC extends nFO<AbstractC33864nIr> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final boolean EZpvd;
    public final int KWHzl = C35399nuc.Dialog.iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.EZpvd;
    }

    public nEC() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(ConversationListActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.conversationlist.ConversationListActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.conversationlist.ConversationListActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.conversationlist.ConversationListActivity$special$$inlined$viewModels$default$3
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

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nEC.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) nEC.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("origin", str)));
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.nFO.OLrzqt()V */
    public final ConversationListActivityViewModel OLrzqt() {
        return (ConversationListActivityViewModel) this.AEQbTJ.getValue();
    }

    @Override // o.nFO, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
        valueOf();
        djBIcL();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nEB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nEC.EZpvd(this.AEQbTJ);
            }
        });
    }

    public static final void EZpvd(nEC nec) {
        rVN.reportFullyDrawn$default((android.app.Activity) nec, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void djBIcL() {
        nFM.Activity activity = nFM.Companion;
        if (activity.copydefault()) {
            activity.KWHzl().show(getSupportFragmentManager(), "DisclaimerBottomSheet");
        }
    }

    private final void valueOf() {
        OLrzqt().KWHzl().observe(this, new C32991mny(new Function1() { // from class: o.nED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nEC.copydefault(this.copydefault, (ConversationListActivityViewModel.Activity) obj);
            }
        }));
    }

    public static final Unit copydefault(nEC nec, ConversationListActivityViewModel.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        pUU.KWHzl("ChatActivity", "action event triggered: " + activity);
        nec.KWHzl(activity);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C35399nuc.StateListAnimator.fXYAwm;
        ConversationListFragment.ActionBar actionBar = ConversationListFragment.Companion;
        java.lang.String stringExtra = getIntent().getStringExtra("origin");
        if (stringExtra == null) {
            stringExtra = "im";
        }
        fragmentTransactionBeginTransaction.replace(i, actionBar.copydefault(new ConversationListParams(C35182nqW.KWHzl(stringExtra), false, false, true, 0, true, true, true, false, 278, null))).commit();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        EZpvd();
    }

    public final void KWHzl(ConversationListActivityViewModel.Activity activity) {
        if (!Intrinsics.EZpvd(activity, ConversationListActivityViewModel.Activity.C0408Activity.EZpvd)) {
            throw new NoWhenBranchMatchedException();
        }
        finish();
    }

    @Override // o.nFO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        java.util.List<androidx.fragment.app.Fragment> fragments = getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        for (androidx.fragment.app.Fragment fragment : fragments) {
            if (fragment.isAdded()) {
                try {
                    getSupportFragmentManager().beginTransaction().remove(fragment).commitAllowingStateLoss();
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("ConversationListActivity", "Error removing fragment", e);
                }
            }
        }
        super.onDestroy();
    }

    @Override // o.nFO, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nFO, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nFO, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.nFO, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
