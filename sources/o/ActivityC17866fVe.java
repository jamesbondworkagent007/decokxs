package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$onCreate$2;
import com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$onCreate$3;
import com.okinc.business.defi.wallet.tee.disable.viewmodel.TeeDisableViewModel;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC17866fVe extends AbstractActivityC17870fVi {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.fVb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC17866fVe.KWHzl(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm EZpvd;

    public ActivityC17866fVe() {
        final Function0 function0 = null;
        this.EZpvd = new ViewModelLazy(C56524yIo.AEQbTJ(TeeDisableViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.fVe$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fVe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17866fVe.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("extra_chain_index_list", arrayList);
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.fVi.KWHzl()V */
    public final TeeDisableViewModel KWHzl() {
        return (TeeDisableViewModel) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String valueOf() {
        return (java.lang.String) this.AEQbTJ.getValue();
    }

    public static final java.lang.String KWHzl(ActivityC17866fVe activityC17866fVe) {
        java.lang.String stringExtra = activityC17866fVe.getIntent().getStringExtra("wallet_id");
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // o.AbstractActivityC17870fVi, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16302ehP c16302ehPKWHzl = C16302ehP.KWHzl(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c16302ehPKWHzl, "");
        setContentView(c16302ehPKWHzl.getRoot());
        c16302ehPKWHzl.EZpvd.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        C52794wYp c52794wYp = c16302ehPKWHzl.copydefault;
        c52794wYp.setText(getString(C13754dXa.FragmentManager.OtRJxF));
        c52794wYp.setOnClickListener(new Application(c52794wYp, 1000L, c52794wYp, this));
        showLoadingWithLogo();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DisableActivity$onCreate$2(this, c16302ehPKWHzl, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DisableActivity$onCreate$3(this, c16302ehPKWHzl, null), 3, null);
        C32866mlf.onEvent$default("Web3WalletSmartAccountDisableSAPage_Page_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.fVe$Activity */
    public static final class Activity implements Function1<java.lang.String, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            ActivityC17866fVe.this.KWHzl().copydefault(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            OLrzqt(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fVe$ActionBar */
    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ C52794wYp OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C52794wYp c52794wYp) {
            this.OLrzqt = c52794wYp;
        }

        public final void KWHzl() {
            this.OLrzqt.fIwbmz();
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.fVe$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C52794wYp AEQbTJ;
        public final /* synthetic */ ActivityC17866fVe EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52794wYp c52794wYp, ActivityC17866fVe activityC17866fVe) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c52794wYp;
            this.EZpvd = activityC17866fVe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt(0L);
                androidx.fragment.app.FragmentManager supportFragmentManager = this.EZpvd.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                new C14461dlr(supportFragmentManager, "disableSA", this.EZpvd.new Activity(), new ActionBar(this.AEQbTJ), null, false, 48, null).EZpvd();
            }
        }
    }

    /* JADX DEBUG: Possible override for method o.fVi.EZpvd()V */
    public final boolean EZpvd() {
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        return Intrinsics.EZpvd((java.lang.Object) (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null), (java.lang.Object) valueOf());
    }

    @Override // o.AbstractActivityC17870fVi, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17870fVi, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17870fVi, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17870fVi, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
