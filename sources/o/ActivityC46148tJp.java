package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.planet.biz_userprofile.AsyncXActivity$async$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: renamed from: o.tJp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC46148tJp extends AbstractActivityC33041mov {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public AbstractC46223tMj AEQbTJ;
    public boolean copydefault;

    /* JADX INFO: renamed from: o.tJp$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tJp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC46223tMj abstractC46223tMjCopydefault = AbstractC46223tMj.copydefault(getLayoutInflater());
        setContentView(abstractC46223tMjCopydefault.getRoot());
        abstractC46223tMjCopydefault.getRoot().post(new java.lang.Runnable() { // from class: o.tJn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC46148tJp.KWHzl(this.KWHzl);
            }
        });
        abstractC46223tMjCopydefault.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.tJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC46148tJp.KWHzl(this.KWHzl, view);
            }
        });
        abstractC46223tMjCopydefault.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.tJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC46148tJp.AEQbTJ(this.AEQbTJ, view);
            }
        });
        this.AEQbTJ = abstractC46223tMjCopydefault;
    }

    public static final void KWHzl(ActivityC46148tJp activityC46148tJp) {
        if (activityC46148tJp.copydefault) {
            return;
        }
        activityC46148tJp.copydefault = true;
        rVN.reportFullyDrawn$default((android.app.Activity) activityC46148tJp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void KWHzl(ActivityC46148tJp activityC46148tJp, android.view.View view) {
        activityC46148tJp.finish();
        C32866mlf.onEvent$default("Twitter_Sync_Skip_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static final void AEQbTJ(ActivityC46148tJp activityC46148tJp, android.view.View view) {
        activityC46148tJp.EZpvd();
        C32866mlf.onEvent$default("Twitter_Sync_Enable_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AsyncXActivity$async$1(this, null), 3, null);
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
