package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.relationlist.model.SelectionActionType;
import com.okinc.im.imui.relationlist.viewmodel.selectrelation.SelectRelationActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ota, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37424ota extends AbstractActivityC37390ost<nIT> {
    public final InterfaceC56387yDm DbNXlk;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.otg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37424ota.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.oti
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37424ota.gEmmrt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.oth
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37424ota.AYXKKw(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.otn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37424ota.AhwBna(this.EZpvd);
        }
    });
    public final int AhwBna = C35399nuc.Dialog.QOLQEE;

    /* JADX INFO: renamed from: o.ota$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AhwBna;
    }

    public ActivityC37424ota() {
        final Function0 function0 = null;
        this.DbNXlk = new ViewModelLazy(C56524yIo.AEQbTJ(SelectRelationActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.relationlist.ui.selectionrelation.SelectRelationActivity$special$$inlined$viewModels$default$3
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

    private final SelectRelationActivityViewModel fetchVPNInfo() {
        return (SelectRelationActivityViewModel) this.DbNXlk.getValue();
    }

    private final java.util.List<java.lang.String> AYXKKw() {
        return (java.util.List) this.valueOf.getValue();
    }

    public static final java.util.ArrayList valueOf(ActivityC37424ota activityC37424ota) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC37424ota.getIntent().getStringArrayListExtra("ARG_COMPLETED_LIST");
        return stringArrayListExtra == null ? new java.util.ArrayList() : stringArrayListExtra;
    }

    private final SelectionActionType valueOf() {
        return (SelectionActionType) this.isConnected.getValue();
    }

    public static final SelectionActionType gEmmrt(ActivityC37424ota activityC37424ota) {
        java.io.Serializable serializableExtra = activityC37424ota.getIntent().getSerializableExtra("ARG_SELECTION_ACTION_TYPE");
        SelectionActionType selectionActionType = serializableExtra instanceof SelectionActionType ? (SelectionActionType) serializableExtra : null;
        return selectionActionType == null ? SelectionActionType.UNKNOWN : selectionActionType;
    }

    private final java.lang.String AhwBna() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    public static final java.lang.String AYXKKw(ActivityC37424ota activityC37424ota) {
        return activityC37424ota.getIntent().getStringExtra("ARG_GROUP_ID");
    }

    private final java.lang.Boolean gEmmrt() {
        return (java.lang.Boolean) this.gEmmrt.getValue();
    }

    public static final java.lang.Boolean AhwBna(ActivityC37424ota activityC37424ota) {
        if (activityC37424ota.getIntent().hasExtra("KEY_ADD_NON_PAYING_MEMBER")) {
            return java.lang.Boolean.valueOf(activityC37424ota.getIntent().getBooleanExtra("KEY_ADD_NON_PAYING_MEMBER", false));
        }
        return null;
    }

    /* JADX INFO: renamed from: o.ota$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ota.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, java.util.List<java.lang.String> list, SelectionActionType selectionActionType, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC37424ota.class);
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_COMPLETED_LIST", list), C56390yDp.OLrzqt("ARG_SELECTION_ACTION_TYPE", selectionActionType), C56390yDp.OLrzqt("ARG_GROUP_ID", str));
            if (bool != null) {
                bundleBundleOf.putBoolean("KEY_ADD_NON_PAYING_MEMBER", bool.booleanValue());
            }
            intent.putExtras(bundleBundleOf);
            return intent;
        }
    }

    @Override // o.AbstractActivityC37390ost, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        DbNXlk();
        fetchVPNInfo().OLrzqt(AhwBna(), AYXKKw());
        isConnected();
        AkhnZx();
        values();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ote
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37424ota.djBIcL(this.copydefault);
            }
        });
    }

    public static final void djBIcL(ActivityC37424ota activityC37424ota) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37424ota, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AkhnZx() {
        fetchVPNInfo().KWHzl().observe(this, new Activity(new Function1() { // from class: o.otj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37424ota.OLrzqt(this.AEQbTJ, (java.lang.Integer) obj);
            }
        }));
        fetchVPNInfo().copydefault().observe(this, new Activity(new Function1() { // from class: o.otf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37424ota.copydefault(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit OLrzqt(ActivityC37424ota activityC37424ota, java.lang.Integer num) {
        Intrinsics.copydefault(num);
        int iIntValue = num.intValue();
        java.lang.Integer value = activityC37424ota.fetchVPNInfo().copydefault().getValue();
        activityC37424ota.KWHzl(iIntValue, value != null ? value.intValue() : 3000);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC37424ota activityC37424ota, java.lang.Integer num) {
        java.lang.Integer value = activityC37424ota.fetchVPNInfo().KWHzl().getValue();
        int iIntValue = value != null ? value.intValue() : 0;
        Intrinsics.copydefault(num);
        activityC37424ota.KWHzl(iIntValue, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(int i, int i2) {
        C38307pTy.Application application = C38307pTy.Companion;
        ((nIT) KWHzl()).djBIcL.setText(pTD.KWHzl(this, C35399nuc.LoaderManager.hgxRZI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i), null, application.EZpvd(0), null, null, 13, null)), C56390yDp.OLrzqt("max", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i2), null, application.EZpvd(0), null, null, 13, null)))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DbNXlk() {
        setSupportActionBar(((nIT) KWHzl()).KWHzl);
        androidx.appcompat.widget.Toolbar toolbar = ((nIT) KWHzl()).KWHzl;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, ((nIT) KWHzl()).EZpvd, C33070mpX.AYXKKw(C35399nuc.LoaderManager.OzhFjl));
        android.widget.TextView textView = ((nIT) KWHzl()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
        }
        wYC wyc = ((nIT) KWHzl()).copydefault;
        wyc.setOnClickListener(new ActionBar(wyc, 1000L, this));
    }

    private final void isConnected() {
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.fXYAwm, C37434otk.Companion.OLrzqt(valueOf(), AhwBna(), gEmmrt())).commit();
    }

    private final void values() {
        getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LIST_CHANGED", this, new FragmentResultListener() { // from class: o.otd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC37424ota.EZpvd(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void EZpvd(ActivityC37424ota activityC37424ota, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("RESULT_KEY_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        activityC37424ota.fetchVPNInfo().OLrzqt(stringArrayList);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        isConnected();
    }

    /* JADX INFO: renamed from: o.ota$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC37424ota EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC37424ota activityC37424ota) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = activityC37424ota;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.finish();
            }
        }
    }

    @Override // o.AbstractActivityC37390ost, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37390ost, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37390ost, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37390ost, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
