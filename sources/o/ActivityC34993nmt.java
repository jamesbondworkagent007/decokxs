package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.nmt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC34993nmt extends AbstractActivityC34974nma {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public int AYXKKw;
    public C34998nmy AhwBna = new C34998nmy();
    public java.lang.String djBIcL = "";
    public java.lang.String valueOf = "";

    /* JADX INFO: renamed from: o.nmt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nmt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.AbstractActivityC34974nma, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AYXKKw = getIntent().getIntExtra("ranking_id", 0);
        C41696qvg c41696qvgEZpvd = C41696qvg.Companion.EZpvd();
        this.valueOf = getIntent().getStringExtra("ranking_tab_key");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("ranking_tab_key", C33129mqd.OLrzqt((java.lang.CharSequence) this.valueOf) ? this.valueOf : this.AhwBna.OLrzqt(this.AYXKKw));
        c41696qvgEZpvd.setArguments(bundle2);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, c41696qvgEZpvd, C41696qvg.class.getSimpleName()).commitAllowingStateLoss();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC34974nma, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC34974nma, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC34974nma, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC34974nma, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
