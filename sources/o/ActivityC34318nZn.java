package o;

import androidx.core.os.BundleKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC34318nZn extends AbstractActivityC34317nZm<nID> {
    public final int djBIcL = C35399nuc.Dialog.wlaJM;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nZo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(ActivityC34318nZn.copydefault(this.KWHzl));
        }
    });
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.djBIcL;
    }

    private final long AYXKKw() {
        return ((java.lang.Number) this.valueOf.getValue()).longValue();
    }

    public static final long copydefault(ActivityC34318nZn activityC34318nZn) {
        return activityC34318nZn.getIntent().getLongExtra("ARG_GROUP_ID", -1L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC34317nZm, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        nID nid = (nID) KWHzl();
        androidx.appcompat.widget.Toolbar toolbar = nid.EZpvd;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, nid.AEQbTJ, C33070mpX.AYXKKw(C35399nuc.LoaderManager.OeawrHOeawrH));
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.DCUTEIddSDPG, C34323nZs.Companion.EZpvd(AYXKKw())).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nZp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC34318nZn.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(ActivityC34318nZn activityC34318nZn) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC34318nZn, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nZn$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC34318nZn.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_GROUP_ID", java.lang.Long.valueOf(j))));
            return intent;
        }
    }

    @Override // o.AbstractActivityC34317nZm, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34317nZm, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34317nZm, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34317nZm, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
