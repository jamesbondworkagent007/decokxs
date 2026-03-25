package o;

import android.os.Build;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.event.SupportCenterEvent;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.search.ui.SupportSearchActivity$initViewModel$1$1;
import com.okinc.okex.search.viewmodel.SupportSearchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45853szS;
import o.C45857szW;
import o.C47315tni;
import o.sAK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC44038sBa extends AbstractActivityC45848szN {
    public final InterfaceC56387yDm djBIcL;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.sBe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44038sBa.isConnected(this.copydefault);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sBf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44038sBa.AkhnZx(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.sBg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44038sBa.AYXKKw(this.EZpvd);
        }
    });
    public final StateListAnimator copydefault = new StateListAnimator();
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.sBi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44038sBa.fetchVPNInfo(this.EZpvd);
        }
    });

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return false;
    }

    public ActivityC44038sBa() {
        final Function0 function0 = null;
        this.djBIcL = new ViewModelLazy(C56524yIo.AEQbTJ(SupportSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SupportSearchActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SupportSearchActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SupportSearchActivity$special$$inlined$viewModels$default$3
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

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.EZpvd()V */
    /* JADX DEBUG: Possible override for method o.snZ.EZpvd()V */
    /* JADX DEBUG: Possible override for method o.szN.EZpvd()V */
    public final SupportSearchViewModel EZpvd() {
        return (SupportSearchViewModel) this.djBIcL.getValue();
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public java.lang.String AwvSrB() {
        return (java.lang.String) this.gEmmrt.getValue();
    }

    public static final java.lang.String isConnected(ActivityC44038sBa activityC44038sBa) {
        java.lang.String stringExtra = activityC44038sBa.getIntent().getStringExtra("ARG_PAGE_SOURCE");
        return stringExtra == null ? "" : stringExtra;
    }

    private final java.lang.String AhwBna() {
        return (java.lang.String) this.KWHzl.getValue();
    }

    public static final java.lang.String AkhnZx(ActivityC44038sBa activityC44038sBa) {
        return activityC44038sBa.getIntent().getStringExtra("ARG_PAGE_SCENARIO");
    }

    /* JADX INFO: renamed from: o.sBa$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sBa.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(Application application, android.content.Context context, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return application.EZpvd(context, str, str2);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC44038sBa.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_PAGE_SOURCE", str), C56390yDp.OLrzqt("ARG_PAGE_SCENARIO", str2)));
            intent.setFlags(131072);
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.snZ.AEQbTJ()V */
    public final AbstractC47287tnG AEQbTJ() {
        return (AbstractC47287tnG) this.EZpvd.getValue();
    }

    public static final AbstractC47287tnG AYXKKw(ActivityC44038sBa activityC44038sBa) {
        return AbstractC47287tnG.AEQbTJ(activityC44038sBa.getLayoutInflater());
    }

    /* JADX INFO: renamed from: o.sBa$StateListAnimator */
    public static final class StateListAnimator extends OnBackPressedCallback {
        public StateListAnimator() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            if (ActivityC44038sBa.this.EZpvd().valueOf().getValue() instanceof SupportSearchViewModel.StateListAnimator.ActionBar) {
                ActivityC44038sBa.this.EZpvd().gEmmrt();
            } else {
                ActivityC44038sBa.this.finishAfterTransition();
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        android.text.Editable text = AEQbTJ().OLrzqt.KWHzl().getText();
        if (text != null) {
            text.clear();
        }
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public android.view.View AkhnZx() {
        android.view.View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // o.AbstractActivityC45848szN, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl(false);
        getOnBackPressedDispatcher().addCallback(this, this.copydefault);
        djBIcL();
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47287tnG abstractC47287tnGAEQbTJ = AEQbTJ();
        gEmmrt();
        final C55230xfy c55230xfy = abstractC47287tnGAEQbTJ.OLrzqt;
        c55230xfy.KWHzl().addTextChangedListener(KWHzl());
        c55230xfy.KWHzl().setImeOptions(3);
        c55230xfy.KWHzl().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.sAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
                return ActivityC44038sBa.KWHzl(this.copydefault, textView, i, keyEvent);
            }
        });
        c55230xfy.copydefault().setText(C33070mpX.AYXKKw(C47315tni.PendingIntent.hrNTAI));
        c55230xfy.KWHzl().setHint(C33070mpX.AYXKKw(C47315tni.PendingIntent.gUEfcq));
        c55230xfy.setCancelCallback(new Function0() { // from class: o.sAX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC44038sBa.AhwBna(this.EZpvd);
            }
        });
        c55230xfy.KWHzl().post(new java.lang.Runnable() { // from class: o.sBb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC44038sBa.copydefault(c55230xfy, this);
            }
        });
    }

    public static final boolean KWHzl(ActivityC44038sBa activityC44038sBa, android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
        activityC44038sBa.EZpvd().AhwBna();
        activityC44038sBa.AEQbTJ(SupportCenterEvent.TypeAiSearchParam.Enter);
        return true;
    }

    public static final Unit AhwBna(ActivityC44038sBa activityC44038sBa) {
        activityC44038sBa.finishAfterTransition();
        return Unit.INSTANCE;
    }

    public static final void copydefault(C55230xfy c55230xfy, ActivityC44038sBa activityC44038sBa) {
        c55230xfy.KWHzl().requestFocus();
        C33054mpH.EZpvd((android.app.Activity) activityC44038sBa);
    }

    /* JADX INFO: renamed from: o.sBa$Activity */
    public static final class Activity implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Activity() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            ActivityC44038sBa.this.EZpvd().EZpvd(charSequence != null ? charSequence.toString() : null);
        }
    }

    public final Activity KWHzl() {
        return (Activity) this.AhwBna.getValue();
    }

    public static final Activity fetchVPNInfo(ActivityC44038sBa activityC44038sBa) {
        return activityC44038sBa.new Activity();
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        AEQbTJ().OLrzqt.KWHzl().removeTextChangedListener(KWHzl());
        super.onDestroy();
    }

    @Override // o.AbstractActivityC45848szN, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        valueOf();
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void valueOf() {
        C55230xfy c55230xfy = AEQbTJ().OLrzqt;
        C33570myu.AEQbTJ(c55230xfy.getContext(), c55230xfy);
    }

    private final void djBIcL() {
        SupportSearchViewModel supportSearchViewModelEZpvd = EZpvd();
        supportSearchViewModelEZpvd.copydefault(AwvSrB());
        supportSearchViewModelEZpvd.OLrzqt(AhwBna());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SupportSearchActivity$initViewModel$1$1(this, supportSearchViewModelEZpvd, null), 3, null);
    }

    public final void gEmmrt() {
        C45853szS.TaskDescription taskDescription = C45853szS.Companion;
        C45853szS c45853szSOLrzqt = taskDescription.OLrzqt();
        sAK.Application application = sAK.Companion;
        sAK sakOLrzqt = application.OLrzqt();
        C45857szW.ActionBar actionBar = C45857szW.Companion;
        C45857szW c45857szWAEQbTJ = actionBar.AEQbTJ();
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.beginTransaction().add(C47315tni.TaskDescription.Th, c45853szSOLrzqt, taskDescription.EZpvd()).add(C47315tni.TaskDescription.Th, sakOLrzqt, application.EZpvd()).add(C47315tni.TaskDescription.Th, c45857szWAEQbTJ, actionBar.OLrzqt()).hide(sakOLrzqt).hide(c45857szWAEQbTJ).commitAllowingStateLoss();
        supportFragmentManager.setFragmentResultListener("KEY_FRAGMENT_EVENT", this, new FragmentResultListener() { // from class: o.sBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC44038sBa.AEQbTJ(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(ActivityC44038sBa activityC44038sBa, java.lang.String str, android.os.Bundle bundle) {
        SupportCenterEvent.TypeAiSearchParam typeAiSearchParam;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (str.hashCode() == -1718658613 && str.equals("KEY_FRAGMENT_EVENT")) {
            if (Build.VERSION.SDK_INT >= 33) {
                typeAiSearchParam = (SupportCenterEvent.TypeAiSearchParam) bundle.getSerializable("KEY_AISEARCH_TYPE", SupportCenterEvent.TypeAiSearchParam.class);
            } else {
                java.io.Serializable serializable = bundle.getSerializable("KEY_AISEARCH_TYPE");
                typeAiSearchParam = serializable instanceof SupportCenterEvent.TypeAiSearchParam ? (SupportCenterEvent.TypeAiSearchParam) serializable : null;
            }
            if (typeAiSearchParam != null) {
                activityC44038sBa.AEQbTJ(typeAiSearchParam);
            }
        }
    }

    public final void copydefault(java.lang.String str) {
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        java.util.List<androidx.fragment.app.Fragment> fragments = supportFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        for (androidx.fragment.app.Fragment fragment : fragments) {
            if (Intrinsics.EZpvd((java.lang.Object) fragment.getTag(), (java.lang.Object) str)) {
                fragmentTransactionBeginTransaction.show(fragment);
            } else {
                fragmentTransactionBeginTransaction.hide(fragment);
            }
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.soQ.onSessionIdEvent$default(java.lang.String, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void AEQbTJ(final SupportCenterEvent.TypeAiSearchParam typeAiSearchParam) {
        final java.lang.String str = EZpvd().KWHzl() ? "true" : "false";
        C45363soQ.onSessionIdEvent$default("SupportCenterSearch_SearchResult_AISearchRecommendationComplete_Click", false, new Function1() { // from class: o.sBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC44038sBa.KWHzl(str, typeAiSearchParam, this, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(java.lang.String str, SupportCenterEvent.TypeAiSearchParam typeAiSearchParam, ActivityC44038sBa activityC44038sBa, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("has_intent", str, true);
        eventParamsList.put("type_aisearch", typeAiSearchParam.getValue(), true);
        eventParamsList.put("page", activityC44038sBa.AwvSrB(), true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC45848szN, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45848szN, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC45848szN, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
