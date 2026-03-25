package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.im.imui.messageinfo.MessageInfoViewModel;
import com.okinc.im.message.MessageClusterType;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.onf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC37111onf extends AbstractActivityC37106ona {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public C33851nIe djBIcL;
    public final InterfaceC56387yDm gEmmrt;

    public ActivityC37111onf() {
        final Function0 function0 = null;
        this.gEmmrt = new ViewModelLazy(C56524yIo.AEQbTJ(MessageInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.messageinfo.MessageInfoActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.im.imui.messageinfo.MessageInfoActivity$special$$inlined$viewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.messageinfo.MessageInfoActivity$special$$inlined$viewModels$default$3
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

    /* JADX INFO: renamed from: o.onf$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.onf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(Activity activity, android.content.Context context, java.lang.String str, long j, MessageClusterType messageClusterType, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                messageClusterType = null;
            }
            return activity.AEQbTJ(context, str, j, messageClusterType);
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, long j, MessageClusterType messageClusterType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC37111onf.class);
            intent.putExtra("extra_channel_id", str);
            intent.putExtra("extra_message_seq", j);
            intent.putExtra("extra_message_cluster_type", messageClusterType != null ? messageClusterType.name() : null);
            return intent;
        }

        public static /* synthetic */ android.content.Intent createIntent$default(Activity activity, android.content.Context context, OKMessage oKMessage, MessageClusterType messageClusterType, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                messageClusterType = null;
            }
            return activity.copydefault(context, oKMessage, messageClusterType);
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull OKMessage oKMessage, MessageClusterType messageClusterType) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(oKMessage, "");
            return AEQbTJ(context, oKMessage.getTargetId(), oKMessage.getSeq(), messageClusterType);
        }
    }

    private final MessageInfoViewModel EZpvd() {
        return (MessageInfoViewModel) this.gEmmrt.getValue();
    }

    @Override // o.AbstractActivityC37106ona, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object objM7377constructorimpl;
        MessageClusterType messageClusterType;
        super.onCreate(bundle);
        C33851nIe c33851nIeAEQbTJ = C33851nIe.AEQbTJ(getLayoutInflater());
        this.djBIcL = c33851nIeAEQbTJ;
        if (c33851nIeAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c33851nIeAEQbTJ = null;
        }
        setContentView(c33851nIeAEQbTJ.getRoot());
        java.lang.String stringExtra = getIntent().getStringExtra("extra_channel_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        long longExtra = getIntent().getLongExtra("extra_message_seq", -1L);
        java.lang.String stringExtra2 = getIntent().getStringExtra("extra_message_cluster_type");
        if (stringExtra2 != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(MessageClusterType.valueOf(stringExtra2));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            messageClusterType = (MessageClusterType) objM7377constructorimpl;
        } else {
            messageClusterType = null;
        }
        C33851nIe c33851nIe = this.djBIcL;
        if (c33851nIe == null) {
            Intrinsics.gEmmrt("");
            c33851nIe = null;
        }
        c33851nIe.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.one
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC37111onf.KWHzl(this.OLrzqt, view);
            }
        });
        C33851nIe c33851nIe2 = this.djBIcL;
        if (c33851nIe2 == null) {
            Intrinsics.gEmmrt("");
            c33851nIe2 = null;
        }
        c33851nIe2.copydefault.setText(getString(C35399nuc.LoaderManager.putInt));
        if (bundle == null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("arg_channel_id", stringExtra);
            pairArr[1] = C56390yDp.OLrzqt("arg_message_seq", java.lang.Long.valueOf(longExtra));
            pairArr[2] = C56390yDp.OLrzqt("arg_message_cluster_type", messageClusterType != null ? messageClusterType.name() : null);
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(pairArr);
            fragmentTransactionBeginTransaction.replace(C35399nuc.StateListAnimator.OrsvgJ, C37116onk.class, bundleBundleOf);
            fragmentTransactionBeginTransaction.replace(C35399nuc.StateListAnimator.invokespecialROgMPW, C37109ond.class, bundleBundleOf);
            fragmentTransactionBeginTransaction.commit();
        }
        EZpvd().AEQbTJ(stringExtra, longExtra, messageClusterType);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.onc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC37111onf.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(ActivityC37111onf activityC37111onf, android.view.View view) {
        activityC37111onf.finish();
    }

    public static final void OLrzqt(ActivityC37111onf activityC37111onf) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC37111onf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC37106ona, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC37106ona, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC37106ona, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC37106ona, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
