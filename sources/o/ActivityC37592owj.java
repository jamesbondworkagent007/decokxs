package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.selectgroupvoicecallmember.viewmodel.SelectGroupCallMemberActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C38307pTy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37592owj extends AbstractActivityC37510ovG<nIP> {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.owo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37592owj.copydefault(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.owq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC37592owj.EZpvd(this.EZpvd);
        }
    });
    public final int AYXKKw = C35399nuc.Dialog.DTwDnp;

    /* JADX INFO: renamed from: o.owj$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.AYXKKw;
    }

    public ActivityC37592owj() {
        final Function0 function0 = null;
        this.valueOf = new ViewModelLazy(C56524yIo.AEQbTJ(SelectGroupCallMemberActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.selectgroupvoicecallmember.SelectGroupCallMemberActivity$special$$inlined$viewModels$default$3
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

    private final SelectGroupCallMemberActivityViewModel AYXKKw() {
        return (SelectGroupCallMemberActivityViewModel) this.valueOf.getValue();
    }

    private final java.util.List<java.lang.String> valueOf() {
        return (java.util.List) this.gEmmrt.getValue();
    }

    public static final java.util.ArrayList copydefault(ActivityC37592owj activityC37592owj) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra = activityC37592owj.getIntent().getStringArrayListExtra("ARG_COMPLETED_LIST");
        return stringArrayListExtra == null ? new java.util.ArrayList() : stringArrayListExtra;
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    public static final java.lang.String EZpvd(ActivityC37592owj activityC37592owj) {
        return activityC37592owj.getIntent().getStringExtra("ARG_GROUP_ID");
    }

    /* JADX INFO: renamed from: o.owj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.owj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.owj$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ android.content.Intent createIntent$default(Activity activity, android.content.Context context, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                list = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            return activity.OLrzqt(context, list, str);
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, java.util.List<java.lang.String> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC37592owj.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_COMPLETED_LIST", list), C56390yDp.OLrzqt("ARG_GROUP_ID", str)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC37510ovG, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AhwBna();
        AYXKKw().KWHzl(djBIcL(), valueOf());
        values();
        isConnected();
        AkhnZx();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.owm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37592owj.djBIcL(this.KWHzl);
            }
        });
    }

    public static final void djBIcL(ActivityC37592owj activityC37592owj) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37592owj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void isConnected() {
        AYXKKw().OLrzqt().observe(this, new Application(new Function1() { // from class: o.owp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37592owj.KWHzl(this.OLrzqt, (java.lang.Integer) obj);
            }
        }));
        AYXKKw().copydefault().observe(this, new Application(new Function1() { // from class: o.owr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC37592owj.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        }));
    }

    public static final Unit KWHzl(ActivityC37592owj activityC37592owj, java.lang.Integer num) {
        Intrinsics.copydefault(num);
        int iIntValue = num.intValue();
        java.lang.Integer value = activityC37592owj.AYXKKw().copydefault().getValue();
        activityC37592owj.copydefault(iIntValue, value != null ? value.intValue() : 3000);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(ActivityC37592owj activityC37592owj, java.lang.Integer num) {
        java.lang.Integer value = activityC37592owj.AYXKKw().OLrzqt().getValue();
        int iIntValue = value != null ? value.intValue() : 0;
        Intrinsics.copydefault(num);
        activityC37592owj.copydefault(iIntValue, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(int i, int i2) {
        C38307pTy.Application application = C38307pTy.Companion;
        ((nIP) KWHzl()).valueOf.setText(pTD.KWHzl(this, C35399nuc.LoaderManager.hgxRZI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("count", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i), null, application.EZpvd(0), null, null, 13, null)), C56390yDp.OLrzqt("max", pTB.formatICUNumber$default(java.lang.Integer.valueOf(i2), null, application.EZpvd(0), null, null, 13, null)))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        setSupportActionBar(((nIP) KWHzl()).OLrzqt);
        int i = valueOf().isEmpty() ? C35399nuc.LoaderManager.iKEqwx : C35399nuc.LoaderManager.dhOYXF;
        androidx.appcompat.widget.Toolbar toolbar = ((nIP) KWHzl()).OLrzqt;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, ((nIP) KWHzl()).copydefault, C33070mpX.AYXKKw(i));
        android.widget.TextView textView = ((nIP) KWHzl()).valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(false);
            supportActionBar.setDisplayShowHomeEnabled(false);
        }
        wYC wyc = ((nIP) KWHzl()).EZpvd;
        wyc.setOnClickListener(new TaskDescription(wyc, 1000L, this));
    }

    private final void values() {
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.xxhdY, C37602owt.Companion.copydefault(djBIcL(), valueOf())).commit();
    }

    private final void AkhnZx() {
        getSupportFragmentManager().setFragmentResultListener("REQUEST_KEY_SELECTION_LIST_CHANGED", this, new FragmentResultListener() { // from class: o.ows
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                ActivityC37592owj.OLrzqt(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void OLrzqt(ActivityC37592owj activityC37592owj, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        java.util.List<java.lang.String> stringArrayList = bundle.getStringArrayList("RESULT_KEY_LIST");
        if (stringArrayList == null) {
            stringArrayList = yDY.AhwBna();
        }
        activityC37592owj.AYXKKw().EZpvd(stringArrayList);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        values();
    }

    /* JADX INFO: renamed from: o.owj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ ActivityC37592owj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC37592owj activityC37592owj) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = activityC37592owj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.finish();
            }
        }
    }

    @Override // o.AbstractActivityC37510ovG, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37510ovG, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37510ovG, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37510ovG, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
