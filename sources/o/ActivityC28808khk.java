package o;

import android.view.View;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.khk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC28808khk extends AbstractActivityC28801khd {
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.khm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC28808khk.OLrzqt(this.copydefault);
        }
    });
    public C23386hxJ djBIcL;
    public SimpleExoPlayer valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.khk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.khk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC28808khk.class);
            intent.putExtra("key.twitter_video_url", str);
            context.startActivity(intent);
        }
    }

    public static final java.lang.String OLrzqt(ActivityC28808khk activityC28808khk) {
        java.lang.String stringExtra = activityC28808khk.getIntent().getStringExtra("key.twitter_video_url");
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX DEBUG: Possible override for method o.khd.AEQbTJ()V */
    public final java.lang.String AEQbTJ() {
        return (java.lang.String) this.AhwBna.getValue();
    }

    @Override // o.AbstractActivityC28801khd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C23386hxJ c23386hxJCopydefault = C23386hxJ.copydefault(getLayoutInflater());
        this.djBIcL = c23386hxJCopydefault;
        setContentView(c23386hxJCopydefault != null ? c23386hxJCopydefault.getRoot() : null);
        valueOf();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.khp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC28808khk.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(ActivityC28808khk activityC28808khk) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC28808khk, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void valueOf() {
        C23386hxJ c23386hxJ = this.djBIcL;
        if (c23386hxJ != null) {
            android.widget.ImageView imageView = c23386hxJ.copydefault;
            imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
            if (AEQbTJ().length() > 0) {
                PlayerView playerView = c23386hxJ.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(playerView, "");
                this.valueOf = C28805khh.KWHzl(playerView, AEQbTJ(), true, null);
            }
        }
    }

    @Override // o.AbstractActivityC28801khd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.pause();
        }
    }

    @Override // o.AbstractActivityC28801khd, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        SimpleExoPlayer simpleExoPlayer = this.valueOf;
        if (simpleExoPlayer != null) {
            C28805khh.EZpvd(simpleExoPlayer);
        }
        this.valueOf = null;
        this.djBIcL = null;
    }

    /* JADX INFO: renamed from: o.khk$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ ActivityC28808khk copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, ActivityC28808khk activityC28808khk) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.copydefault = activityC28808khk;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.finish();
            }
        }
    }

    @Override // o.AbstractActivityC28801khd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC28801khd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC28801khd, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
