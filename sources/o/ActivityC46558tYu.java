package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tYu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ActivityC46558tYu extends AbstractActivityC33041mov {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tYr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(ActivityC46558tYu.KWHzl(this.KWHzl));
        }
    });
    public C46532tXv copydefault;

    /* JADX INFO: renamed from: o.tYu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tYu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC46558tYu.class);
            intent.putExtra(OtcExtraKeys.MODE, i);
            return intent;
        }
    }

    private final int EZpvd() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int KWHzl(ActivityC46558tYu activityC46558tYu) {
        return activityC46558tYu.getIntent().getIntExtra(OtcExtraKeys.MODE, -1);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C46532tXv c46532tXvEZpvd = C46532tXv.EZpvd(getLayoutInflater());
        this.copydefault = c46532tXvEZpvd;
        setContentView(c46532tXvEZpvd != null ? c46532tXvEZpvd.getRoot() : null);
        overridePendingTransition(0, 0);
        showLoading(0L);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        ConstraintLayout root;
        ConstraintLayout root2;
        super.onResume();
        C46532tXv c46532tXv = this.copydefault;
        if (c46532tXv != null && (root2 = c46532tXv.getRoot()) != null) {
            root2.post(new java.lang.Runnable() { // from class: o.tYv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC46558tYu.OLrzqt(this.AEQbTJ);
                }
            });
        }
        C46532tXv c46532tXv2 = this.copydefault;
        if (c46532tXv2 == null || (root = c46532tXv2.getRoot()) == null) {
            return;
        }
        root.postDelayed(new java.lang.Runnable() { // from class: o.tYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC46558tYu.AhwBna(this.AEQbTJ);
            }
        }, 2000L);
    }

    public static final void OLrzqt(ActivityC46558tYu activityC46558tYu) {
        activityC46558tYu.OLrzqt(activityC46558tYu.EZpvd());
        RxBus.KWHzl("day_night_change");
    }

    public static final void AhwBna(ActivityC46558tYu activityC46558tYu) {
        activityC46558tYu.finish();
    }

    public final void OLrzqt(int i) {
        if (i == -1) {
            C33492mxV.djBIcL();
            return;
        }
        if (i == 1) {
            C33492mxV.AEQbTJ();
        } else if (i == 2) {
            C33492mxV.copydefault();
        } else {
            finish();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.copydefault = null;
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
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
    public void onStart() {
        super.onStart();
    }
}
