package o;

import android.view.View;
import com.okinc.core.util.SPUtils;
import com.okinc.ok_kyc_core.presentation.views.KisaPermissionView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rPA extends AbstractActivityC33041mov {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public C43760rvP AEQbTJ;

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rPA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.util.List<KisaPermissionView.PermissionItem> list) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(list, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) rPA.class);
            intent.putExtra("extra_permissions", new java.util.ArrayList(list));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C43760rvP c43760rvPEZpvd = C43760rvP.EZpvd(getLayoutInflater());
        this.AEQbTJ = c43760rvPEZpvd;
        if (c43760rvPEZpvd == null) {
            Intrinsics.gEmmrt("");
            c43760rvPEZpvd = null;
        }
        setContentView(c43760rvPEZpvd.getRoot());
        AEQbTJ();
    }

    private final void AEQbTJ() {
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra("extra_permissions");
        C43760rvP c43760rvP = null;
        java.util.ArrayList arrayList = serializableExtra instanceof java.util.ArrayList ? (java.util.ArrayList) serializableExtra : null;
        KisaPermissionView kisaPermissionView = new KisaPermissionView(this, null, 0, 6, null);
        if (arrayList != null) {
            kisaPermissionView.setPermissions(arrayList);
        }
        C43760rvP c43760rvP2 = this.AEQbTJ;
        if (c43760rvP2 == null) {
            Intrinsics.gEmmrt("");
            c43760rvP2 = null;
        }
        c43760rvP2.OLrzqt.addView(kisaPermissionView);
        C43760rvP c43760rvP3 = this.AEQbTJ;
        if (c43760rvP3 == null) {
            Intrinsics.gEmmrt("");
            c43760rvP3 = null;
        }
        c43760rvP3.EZpvd.setText(C33070mpX.AYXKKw(C43662rtX.Dialog.gHZMYf));
        C43760rvP c43760rvP4 = this.AEQbTJ;
        if (c43760rvP4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c43760rvP = c43760rvP4;
        }
        C52794wYp c52794wYp = c43760rvP.EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ rPA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, rPA rpa) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = rpa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                SPUtils.put("kisa_permission_consented", java.lang.Boolean.TRUE);
                this.copydefault.setResult(-1);
                this.copydefault.finish();
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
