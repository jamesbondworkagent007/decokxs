package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletResultActivity$observeUIData$1;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.viewmodel.EscapePassKeyWalletResultViewModel;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.InterfaceC54829xWw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fKj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC17574fKj extends fKX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl;
    public C16311ehY OLrzqt;

    public ActivityC17574fKj() {
        final Function0 function0 = null;
        this.KWHzl = new ViewModelLazy(C56524yIo.AEQbTJ(EscapePassKeyWalletResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletResultActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletResultActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.activity.EscapePassKeyWalletResultActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.fKj$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fKj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.util.List<java.lang.Long> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17574fKj.class);
            intent.putExtra("order_id_list", CollectionsKt___CollectionsKt.AuCTel((java.util.Collection<java.lang.Long>) list));
            context.startActivity(intent);
        }
    }

    /* JADX DEBUG: Possible override for method o.fKX.AEQbTJ()V */
    public final EscapePassKeyWalletResultViewModel AEQbTJ() {
        return (EscapePassKeyWalletResultViewModel) this.KWHzl.getValue();
    }

    @Override // o.fKX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        C16311ehY c16311ehYOLrzqt = C16311ehY.OLrzqt(getLayoutInflater());
        this.OLrzqt = c16311ehYOLrzqt;
        if (bundle != null) {
            finish();
            return;
        }
        C16311ehY c16311ehY = null;
        if (c16311ehYOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16311ehYOLrzqt = null;
        }
        setContentView(c16311ehYOLrzqt.getRoot());
        C16311ehY c16311ehY2 = this.OLrzqt;
        if (c16311ehY2 == null) {
            Intrinsics.gEmmrt("");
            c16311ehY2 = null;
        }
        C55178xez c55178xez = c16311ehY2.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55178xez, "");
        ViewGroup.LayoutParams layoutParams = c55178xez.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = C33570myu.OLrzqt();
            c55178xez.setLayoutParams(marginLayoutParams);
            C16311ehY c16311ehY3 = this.OLrzqt;
            if (c16311ehY3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16311ehY = c16311ehY3;
            }
            android.widget.ImageView imageViewAEQbTJ = c16311ehY.EZpvd.AEQbTJ();
            imageViewAEQbTJ.setVisibility(0);
            imageViewAEQbTJ.setOnClickListener(new TaskDescription(imageViewAEQbTJ, 1000L, this));
            djBIcL();
            EZpvd();
            getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fKp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC17574fKj.AEQbTJ(this.OLrzqt);
                }
            });
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void AEQbTJ(ActivityC17574fKj activityC17574fKj) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17574fKj, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void djBIcL() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new EscapePassKeyWalletResultActivity$observeUIData$1(this, null), 3, null);
    }

    public final void EZpvd() {
        setResultPageUI$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.IntDef), C33070mpX.AYXKKw(C13754dXa.FragmentManager.open), 6, null, null, null, null, 120, null);
    }

    public final void KWHzl() {
        setResultPageUI$default(this, C33070mpX.AYXKKw(C13754dXa.FragmentManager.flag), C33070mpX.AYXKKw(C13754dXa.FragmentManager.IntRange), 4, C33070mpX.AYXKKw(C13754dXa.FragmentManager.hasAttributeId), null, new Function0() { // from class: o.fKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ActivityC17574fKj.valueOf(this.KWHzl);
            }
        }, null, 80, null);
    }

    public static final Unit valueOf(ActivityC17574fKj activityC17574fKj) {
        InterfaceC54829xWw.ActionBar.enterWallet$default((InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class), activityC17574fKj, null, false, false, false, 30, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o.fKj */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setResultPageUI$default(ActivityC17574fKj activityC17574fKj, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, Function0 function0, Function0 function02, int i2, java.lang.Object obj) {
        activityC17574fKj.AEQbTJ(str, str2, i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : function0, (i2 & 64) != 0 ? null : function02);
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, Function0<Unit> function0, Function0<Unit> function02) {
        C16311ehY c16311ehY = this.OLrzqt;
        C16311ehY c16311ehY2 = null;
        if (c16311ehY == null) {
            Intrinsics.gEmmrt("");
            c16311ehY = null;
        }
        c16311ehY.EZpvd.setTitleText(str);
        C16311ehY c16311ehY3 = this.OLrzqt;
        if (c16311ehY3 == null) {
            Intrinsics.gEmmrt("");
            c16311ehY3 = null;
        }
        c16311ehY3.EZpvd.setSubTitleText(str2);
        C16311ehY c16311ehY4 = this.OLrzqt;
        if (c16311ehY4 == null) {
            Intrinsics.gEmmrt("");
            c16311ehY4 = null;
        }
        c16311ehY4.EZpvd.setStatus(i);
        C16311ehY c16311ehY5 = this.OLrzqt;
        if (c16311ehY5 == null) {
            Intrinsics.gEmmrt("");
            c16311ehY5 = null;
        }
        C52794wYp c52794wYpCopydefault = c16311ehY5.EZpvd.OLrzqt().copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(function0 != null ? 0 : 8);
            if (function0 != null) {
                c52794wYpCopydefault.setText(str3);
                c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, function0));
            }
        }
        C16311ehY c16311ehY6 = this.OLrzqt;
        if (c16311ehY6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16311ehY2 = c16311ehY6;
        }
        C52794wYp c52794wYpAEQbTJ = c16311ehY2.EZpvd.OLrzqt().AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(function02 == null ? 8 : 0);
            if (function02 != null) {
                c52794wYpAEQbTJ.setText(str4);
                c52794wYpAEQbTJ.setOnClickListener(new ActionBar(c52794wYpAEQbTJ, 1000L, function02));
            }
        }
    }

    /* JADX INFO: renamed from: o.fKj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ Function0 KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, Function0 function0) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.fKj$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.fKj$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ ActivityC17574fKj KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, ActivityC17574fKj activityC17574fKj) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = activityC17574fKj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.finish();
            }
        }
    }

    @Override // o.fKX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.fKX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.fKX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.fKX, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
