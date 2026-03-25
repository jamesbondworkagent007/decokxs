package o;

import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmEntryType;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kTF extends AbstractActivityC28240kUb {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.kTH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kTF.KWHzl(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kTK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return kTF.djBIcL(this.OLrzqt);
        }
    });

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kTF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ android.content.Intent getStartIntent$default(ActionBar actionBar, android.content.Context context, AutoConfirmEntryType autoConfirmEntryType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            return actionBar.KWHzl(context, autoConfirmEntryType, str);
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull AutoConfirmEntryType autoConfirmEntryType, java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(autoConfirmEntryType, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) kTF.class);
            intent.putExtra("extra_entry_type", autoConfirmEntryType.name());
            if (str != null) {
                intent.putExtra("extra_tracking_module", str);
            }
            return intent;
        }
    }

    /* JADX DEBUG: Possible override for method o.kUb.KWHzl()V */
    public final AutoConfirmEntryType KWHzl() {
        return (AutoConfirmEntryType) this.AEQbTJ.getValue();
    }

    public static final AutoConfirmEntryType KWHzl(kTF ktf) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String stringExtra = ktf.getIntent().getStringExtra("extra_entry_type");
        if (stringExtra != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(AutoConfirmEntryType.valueOf(stringExtra));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            AutoConfirmEntryType autoConfirmEntryType = (AutoConfirmEntryType) objM7377constructorimpl;
            if (autoConfirmEntryType != null) {
                return autoConfirmEntryType;
            }
        }
        return AutoConfirmEntryType.MARKET;
    }

    /* JADX DEBUG: Possible override for method o.kUb.AEQbTJ()V */
    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String djBIcL(kTF ktf) {
        return ktf.getIntent().getStringExtra("extra_tracking_module");
    }

    @Override // o.AbstractActivityC28240kUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C23274hvD.Activity.EZpvd);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.kTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kTF.OLrzqt(this.KWHzl);
            }
        });
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(C23274hvD.Application.dYepVG, kTN.Companion.EZpvd(KWHzl(), AEQbTJ())).commit();
        }
    }

    public static final void OLrzqt(kTF ktf) {
        rVN.reportFullyDrawn$default((android.app.Activity) ktf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC28240kUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC28240kUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC28240kUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC28240kUb, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
