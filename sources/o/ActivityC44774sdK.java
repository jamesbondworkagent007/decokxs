package o;

import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.campaign.bean.CampaignStatus;
import com.okinc.okex.campaign.ui.CampaignActivity$observeViewModel$1;
import com.okinc.okex.campaign.viewmodel.CampaignActivityViewModel;
import com.okinc.okex.common.ui.OKSupportBaseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C44784sdU;
import o.C45167skg;
import o.C47315tni;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sdK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC44774sdK extends AbstractActivityC44843sea {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sdM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44774sdK.AEQbTJ(this.copydefault);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.sdP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44774sdK.EZpvd();
        }
    });
    public java.lang.String EZpvd = "ongoing";

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    public ActivityC44774sdK() {
        final Function0 function0 = null;
        this.AEQbTJ = new ViewModelLazy(C56524yIo.AEQbTJ(CampaignActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.campaign.ui.CampaignActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.campaign.ui.CampaignActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.campaign.ui.CampaignActivity$special$$inlined$viewModels$default$3
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

    public final CampaignActivityViewModel AhwBna() {
        return (CampaignActivityViewModel) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Possible override for method com.okinc.okex.common.ui.OKSupportBaseActivity.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.sea.AEQbTJ()V */
    /* JADX DEBUG: Possible override for method o.snZ.AEQbTJ()V */
    public final C47318tnl AEQbTJ() {
        return (C47318tnl) this.OLrzqt.getValue();
    }

    public static final C47318tnl AEQbTJ(ActivityC44774sdK activityC44774sdK) {
        return C47318tnl.OLrzqt(activityC44774sdK.getLayoutInflater());
    }

    public final C45167skg gEmmrt() {
        return (C45167skg) this.copydefault.getValue();
    }

    public static final C45167skg EZpvd() {
        return C45167skg.StateListAnimator.newInstance$default(C45167skg.Companion, 0, false, 3, null);
    }

    /* JADX DEBUG: Method merged with bridge method: AkhnZx()Landroid/view/View; */
    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout AkhnZx() {
        android.widget.FrameLayout root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ();
        DbNXlk();
        values();
        java.lang.String string = getString(C47315tni.PendingIntent.QOLQEE);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AEQbTJ(string, new Function0() { // from class: o.sdQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC44774sdK.gEmmrt(this.copydefault);
            }
        });
        OKSupportBaseActivity.setErrorRetryClickListener$default(this, 0, new Function0() { // from class: o.sdO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC44774sdK.AYXKKw(this.EZpvd);
            }
        }, 1, null);
        getSupportFragmentManager().setFragmentResultListener("KEY_PAGE_CHANGED", this, new FragmentResultListener() { // from class: o.sdR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC44774sdK.KWHzl(this.KWHzl, str, bundle);
            }
        });
    }

    public static final Unit gEmmrt(ActivityC44774sdK activityC44774sdK) {
        activityC44774sdK.djBIcL();
        activityC44774sdK.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ActivityC44774sdK activityC44774sdK) {
        activityC44774sdK.AhwBna().copydefault();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC44774sdK activityC44774sdK, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        activityC44774sdK.EZpvd = bundle.getInt("KEY_PAGE_CHANGED", -1) == 0 ? "ongoing" : "ended";
    }

    private final void DbNXlk() {
        java.lang.String string = getString(C47315tni.PendingIntent.RJOkX);
        Intrinsics.checkNotNullExpressionValue(string, "");
        KWHzl(string);
        java.lang.String string2 = getString(C47315tni.PendingIntent.QfsBiF);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        EZpvd(string2);
    }

    private final void values() {
        getSupportFragmentManager().beginTransaction().add(C47315tni.TaskDescription.invokespecialaGOrKO, gEmmrt(), C45167skg.Companion.AEQbTJ()).commitAllowingStateLoss();
    }

    @Override // o.AbstractActivityC44843sea, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        fetchVPNInfo();
        AhwBna().copydefault();
    }

    @Override // o.AbstractActivityC44843sea, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        AhwBna().copydefault();
    }

    private final void fetchVPNInfo() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CampaignActivity$observeViewModel$1(this, null), 3, null);
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            java.lang.String string = getString(C47315tni.PendingIntent.ORxRYg);
            Intrinsics.checkNotNullExpressionValue(string, "");
            java.lang.String string2 = getString(C47315tni.PendingIntent.DTwDnp);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            EZpvd(string, string2, 2, -1);
        }
    }

    public final void AEQbTJ(CampaignActivityViewModel.ActionBar.Application application) {
        java.lang.String string = getString(C47315tni.PendingIntent.fFgQHt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C44784sdU.ActionBar actionBar = C44784sdU.Companion;
        C45167skg.Activity activity = new C45167skg.Activity(string, actionBar.copydefault(CampaignStatus.ONGOING, application.KWHzl()));
        java.lang.String string2 = getString(C47315tni.PendingIntent.dxcTrN);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        gEmmrt().OLrzqt(yDY.gEmmrt(activity, new C45167skg.Activity(string2, actionBar.copydefault(CampaignStatus.ENDED, application.OLrzqt()))));
    }

    /* JADX INFO: renamed from: o.sdK$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sdK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC44774sdK.class);
        }
    }

    public final void djBIcL() {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        java.lang.String string = getString(C47315tni.PendingIntent.QKVWgx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, this, string, null, new Function1() { // from class: o.sdS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC44774sdK.EZpvd((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        C45363soQ.onSessionIdEvent$default("SupportCenter_Campaign_OtherCampaigns_Click", false, new Function1() { // from class: o.sdJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC44774sdK.EZpvd(this.OLrzqt, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(ActivityC44774sdK activityC44774sdK, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", activityC44774sdK.EZpvd, true);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC44843sea, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44843sea, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44843sea, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
