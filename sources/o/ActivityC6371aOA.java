package o;

import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C8206ayP;

/* JADX INFO: renamed from: o.aOA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ActivityC6371aOA extends AbstractActivityC6420aOx {
    public C8277azh OLrzqt;

    @Override // o.AbstractActivityC6420aOx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C55178xez c55178xez;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        C8277azh c8277azhEZpvd = C8277azh.EZpvd(getLayoutInflater());
        this.OLrzqt = c8277azhEZpvd;
        setContentView(c8277azhEZpvd != null ? c8277azhEZpvd.getRoot() : null);
        C8277azh c8277azh = this.OLrzqt;
        if (c8277azh != null && (c55178xez = c8277azh.KWHzl) != null) {
            c55178xez.setStatus(4);
            c55178xez.setTitleText(getString(C8206ayP.Dialog.ODXsMY));
            c55178xez.setSubTitleText(getString(C8206ayP.Dialog.fJNWhG));
            C52794wYp c52794wYpCopydefault = c55178xez.OLrzqt().copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setText(getString(C8206ayP.Dialog.RvdRAu));
            }
            C52794wYp c52794wYpAEQbTJ = c55178xez.OLrzqt().AEQbTJ();
            if (c52794wYpAEQbTJ != null) {
                c52794wYpAEQbTJ.setVisibility(8);
            }
            c55178xez.AEQbTJ().setVisibility(0);
            C52794wYp c52794wYpCopydefault2 = c55178xez.OLrzqt().copydefault();
            if (c52794wYpCopydefault2 != null) {
                c52794wYpCopydefault2.setOnClickListener(new Activity(c52794wYpCopydefault2, 1000L, this));
            }
            android.widget.ImageView imageViewAEQbTJ = c55178xez.AEQbTJ();
            imageViewAEQbTJ.setOnClickListener(new ActionBar(imageViewAEQbTJ, 1000L, this));
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1() { // from class: o.aOB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC6371aOA.KWHzl((OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(OnBackPressedCallback onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractActivityC6420aOx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("PasskeyResetSuccessfully_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public final void KWHzl() {
        setResult(-1);
        finish();
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        this.OLrzqt = null;
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: o.aOA$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ActivityC6371aOA KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC6371aOA activityC6371aOA) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = activityC6371aOA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.KWHzl();
            }
        }
    }

    /* JADX INFO: renamed from: o.aOA$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC6371aOA copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC6371aOA activityC6371aOA) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = activityC6371aOA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.KWHzl();
            }
        }
    }

    @Override // o.AbstractActivityC6420aOx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC6420aOx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC6420aOx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
