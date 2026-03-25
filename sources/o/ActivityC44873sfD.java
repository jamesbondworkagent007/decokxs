package o;

import androidx.core.os.BundleKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sfD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC44873sfD extends AbstractActivityC44918sfw {
    public static final TaskDescription Companion = new TaskDescription(null);

    @Override // o.AbstractActivityC44918sfw, com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.sfH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC44873sfD.OLrzqt(this.EZpvd);
            }
        });
    }

    public static final void OLrzqt(ActivityC44873sfD activityC44873sfD) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC44873sfD, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.sfD$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sfD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(TaskDescription taskDescription, android.content.Context context, C6807aWO c6807aWO, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                c6807aWO = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return taskDescription.EZpvd(context, c6807aWO, z);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, C6807aWO c6807aWO, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC44873sfD.class);
            intent.putExtra("is_web3_app", z);
            if (c6807aWO != null) {
                intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("type", c6807aWO.EZpvd()), C56390yDp.OLrzqt("meeting_id", c6807aWO.OLrzqt()), C56390yDp.OLrzqt("prelogin_uuid", c6807aWO.djBIcL()), C56390yDp.OLrzqt("source", c6807aWO.copydefault()), C56390yDp.OLrzqt("entrance_id", c6807aWO.AEQbTJ()), C56390yDp.OLrzqt("slug", c6807aWO.KWHzl())));
            }
            return intent;
        }
    }

    @Override // o.AbstractActivityC44918sfw, com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44918sfw, com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44918sfw, com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44918sfw, com.okinc.okex.center.ui.SupportHomeBaseActivity, o.AbstractActivityC44871sfB, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
