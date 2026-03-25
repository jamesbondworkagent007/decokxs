package o;

import android.graphics.drawable.ColorDrawable;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34070nQh;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nQb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC34064nQb extends AbstractActivityC34067nQe {
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.nQg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC34064nQb.gEmmrt(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.nQi
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(ActivityC34064nQb.AYXKKw(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.nQk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(ActivityC34064nQb.OLrzqt(this.copydefault));
        }
    });

    private final GroupInfo isConnected() {
        return (GroupInfo) this.values.getValue();
    }

    public static final GroupInfo gEmmrt(ActivityC34064nQb activityC34064nQb) {
        return (GroupInfo) IntentCompat.getParcelableExtra(activityC34064nQb.getIntent(), "info", GroupInfo.class);
    }

    public final long values() {
        return ((java.lang.Number) this.DbNXlk.getValue()).longValue();
    }

    public static final long AYXKKw(ActivityC34064nQb activityC34064nQb) {
        return activityC34064nQb.getIntent().getLongExtra("id", -1L);
    }

    /* JADX DEBUG: Possible override for method o.nQe.gEmmrt()V */
    public final boolean gEmmrt() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(ActivityC34064nQb activityC34064nQb) {
        return activityC34064nQb.getIntent().getBooleanExtra(BotWebHook.KEY_ACTION, false);
    }

    @Override // o.AbstractActivityC33007moN
    public java.lang.CharSequence EZpvd() {
        java.lang.String string = getString(C35399nuc.LoaderManager.HJWChPOKBmQN);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractActivityC34067nQe, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (isConnected() == null) {
            finish();
            return;
        }
        djBIcL().djBIcL.setTextAppearance(C52761wXj.LoaderManager.dUDNAs);
        djBIcL().djBIcL.setText(getString(C35399nuc.LoaderManager.HJWChPOKBmQN));
        android.view.Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(C33070mpX.copydefault(C52761wXj.Activity.EZpvd)));
        }
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setBackgroundDrawable(new ColorDrawable(C33070mpX.copydefault(C52761wXj.Activity.EZpvd)));
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC34064nQb.djBIcL(this.KWHzl);
            }
        });
    }

    public static final void djBIcL(ActivityC34064nQb activityC34064nQb) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC34064nQb, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33007moN
    public androidx.fragment.app.Fragment copydefault() {
        C34070nQh.ActionBar actionBar = C34070nQh.Companion;
        GroupInfo groupInfoIsConnected = isConnected();
        if (groupInfoIsConnected == null) {
            return new androidx.fragment.app.Fragment();
        }
        java.lang.Long lValueOf = java.lang.Long.valueOf(values());
        if (lValueOf.longValue() == -1) {
            lValueOf = null;
        }
        return actionBar.EZpvd(groupInfoIsConnected, lValueOf, java.lang.Boolean.valueOf(gEmmrt()));
    }

    /* JADX INFO: renamed from: o.nQb$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nQb.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(Application application, android.content.Context context, GroupInfo groupInfo, java.lang.Long l, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            return application.OLrzqt(context, groupInfo, l, bool);
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, GroupInfo groupInfo, java.lang.Long l, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC34064nQb.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("info", groupInfo), C56390yDp.OLrzqt("id", l), C56390yDp.OLrzqt(BotWebHook.KEY_ACTION, bool)));
            return intent;
        }
    }

    @Override // o.AbstractActivityC34067nQe, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34067nQe, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34067nQe, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34067nQe, o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
