package o;

import android.view.View;
import com.okinc.components.track.TrackChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.edZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC16100edZ extends AbstractActivityC33013moT {
    public long EZpvd = Long.MIN_VALUE;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.edZ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.edZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, long j) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC16100edZ.class);
            intent.putExtra("chain_id", j);
            context.startActivity(intent);
        }
    }

    private final void OLrzqt() {
        android.content.Intent intent = getIntent();
        this.EZpvd = intent != null ? intent.getLongExtra("chain_id", Long.MIN_VALUE) : Long.MIN_VALUE;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        OLrzqt();
        setContentView(C13754dXa.TaskDescription.ejfBZ);
        C32866mlf.onEvent$default("Web3HomePage_AddMore_CustomToken_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        C16178eey c16178eeyCopydefault = C16178eey.Companion.copydefault(this.EZpvd);
        findViewById(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi212).setOnClickListener(new View.OnClickListener() { // from class: o.edX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC16100edZ.AEQbTJ(this.OLrzqt, view);
            }
        });
        getSupportFragmentManager().beginTransaction().add(C13754dXa.ActionBar.aeJQwa, c16178eeyCopydefault, C56524yIo.AEQbTJ(C16178eey.class).valueOf()).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eea
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC16100edZ.AEQbTJ(this.OLrzqt);
            }
        });
    }

    public static final void AEQbTJ(ActivityC16100edZ activityC16100edZ, android.view.View view) {
        activityC16100edZ.finish();
    }

    public static final void AEQbTJ(ActivityC16100edZ activityC16100edZ) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC16100edZ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
