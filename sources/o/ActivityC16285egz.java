package o;

import com.okinc.share.bean.text.TextShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.egz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ActivityC16285egz extends WebActivity {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.egz$Application */
    public static final class Application implements InterfaceC49121uia.Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC49121uia.Activity
        public void EZpvd(SharePlatform sharePlatform, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            Intrinsics.checkNotNullParameter(th, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC49121uia.Activity
        public void KWHzl(SharePlatform sharePlatform) {
            Intrinsics.checkNotNullParameter(sharePlatform, "");
        }
    }

    /* JADX INFO: renamed from: o.egz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.egz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void start$default(TaskDescription taskDescription, android.app.Activity activity, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                str2 = " ";
            }
            taskDescription.KWHzl(activity, str, z, str2);
        }

        public final void KWHzl(@NotNull android.app.Activity activity, @NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC16285egz.class);
            intent.putExtra("url", str);
            intent.putExtra("title", str2);
            intent.putExtra("share", z);
            activity.startActivity(intent);
        }
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.fvQaOB = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("title");
        this.flVtFt = stringExtra2 != null ? stringExtra2 : "";
        this.zsXlph = getIntent().getBooleanExtra("share", false);
        super.onCreate(bundle);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.egw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC16285egz.EZpvd(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(ActivityC16285egz activityC16285egz) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC16285egz, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // com.okinc.web.WebActivity
    public void OLrzqt() {
        TextShareParams textShareParamsCreate$default = TextShareParams.Application.create$default(TextShareParams.Companion, "", C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcNNRp), null, 4, null);
        InterfaceC49121uia interfaceC49121uiaCopydefault = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).copydefault(SharePlatform.TWITTER);
        if (interfaceC49121uiaCopydefault != null) {
            interfaceC49121uiaCopydefault.OLrzqt(getMActivity(), textShareParamsCreate$default, new Application());
        }
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.okinc.web.WebActivity, o.AbstractActivityC57310yfx, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
