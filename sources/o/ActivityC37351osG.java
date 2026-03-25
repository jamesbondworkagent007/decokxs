package o;

import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationActivityViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.osG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37351osG extends AbstractActivityC37385oso<nIO> {
    public final InterfaceC56387yDm DbNXlk;
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.osH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37351osG.DbNXlk(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.osK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37351osG.AYXKKw(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.osI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37351osG.values(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.osL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37351osG.djBIcL(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.osO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37351osG.valueOf(this.EZpvd);
        }
    });
    public final int gEmmrt = C35399nuc.Dialog.AxsJAY;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    public ActivityC37351osG() {
        final Function0 function0 = null;
        this.DbNXlk = new ViewModelLazy(C56524yIo.AEQbTJ(SelectRelationActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SearchAndSelectRelationActivity$special$$inlined$viewModels$default$3
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

    public final SelectRelationActivityViewModel gEmmrt() {
        return (SelectRelationActivityViewModel) this.DbNXlk.getValue();
    }

    private final java.util.List<java.lang.String> isConnected() {
        return (java.util.List) this.isConnected.getValue();
    }

    public static final java.util.List DbNXlk(ActivityC37351osG activityC37351osG) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC37351osG.getIntent().getStringArrayListExtra("ARG_SELECTED_LIST");
        return stringArrayListExtra != null ? stringArrayListExtra : yDY.AhwBna();
    }

    private final java.util.List<java.lang.String> AYXKKw() {
        return (java.util.List) this.AYXKKw.getValue();
    }

    public static final java.util.List AYXKKw(ActivityC37351osG activityC37351osG) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC37351osG.getIntent().getStringArrayListExtra("ARG_COMPLETED_LIST");
        return stringArrayListExtra != null ? stringArrayListExtra : yDY.AhwBna();
    }

    private final SelectionActionType values() {
        return (SelectionActionType) this.AkhnZx.getValue();
    }

    public static final SelectionActionType values(ActivityC37351osG activityC37351osG) {
        java.io.Serializable serializableExtra = activityC37351osG.getIntent().getSerializableExtra("ARG_SELECTION_ACTION_TYPE");
        SelectionActionType selectionActionType = serializableExtra instanceof SelectionActionType ? (SelectionActionType) serializableExtra : null;
        return selectionActionType == null ? SelectionActionType.UNKNOWN : selectionActionType;
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String djBIcL(ActivityC37351osG activityC37351osG) {
        return activityC37351osG.getIntent().getStringExtra("ARG_GROUP_ID");
    }

    private final java.lang.Boolean AhwBna() {
        return (java.lang.Boolean) this.valueOf.getValue();
    }

    public static final java.lang.Boolean valueOf(ActivityC37351osG activityC37351osG) {
        if (activityC37351osG.getIntent().hasExtra("ARG_ADD_NON_PAYING_MEMBER")) {
            return java.lang.Boolean.valueOf(activityC37351osG.getIntent().getBooleanExtra("ARG_ADD_NON_PAYING_MEMBER", false));
        }
        return null;
    }

    /* JADX INFO: renamed from: o.osG$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.osG.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, SelectionActionType selectionActionType, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC37351osG.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_SELECTED_LIST", list), C56390yDp.OLrzqt("ARG_COMPLETED_LIST", list2), C56390yDp.OLrzqt("ARG_SELECTION_ACTION_TYPE", selectionActionType), C56390yDp.OLrzqt("ARG_GROUP_ID", str)));
            if (bool != null) {
                intent.putExtra("ARG_ADD_NON_PAYING_MEMBER", bool.booleanValue());
            }
            return intent;
        }
    }

    @Override // o.AbstractActivityC37385oso, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        gEmmrt().OLrzqt(valueOf(), AYXKKw());
        fetchVPNInfo();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.osM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37351osG.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public static final void gEmmrt(ActivityC37351osG activityC37351osG) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37351osG, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void fetchVPNInfo() {
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.fXYAwm, C37360osP.Companion.copydefault(isConnected(), values(), valueOf(), AhwBna())).commit();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        fetchVPNInfo();
    }

    @Override // o.AbstractActivityC37385oso, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37385oso, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37385oso, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37385oso, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
