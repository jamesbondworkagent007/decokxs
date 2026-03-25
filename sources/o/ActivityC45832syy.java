package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.biz.bean.ChatBotRequest;
import com.okinc.biz.model.RatingDisplayStatus;
import com.okinc.okex.rating.ui.result.RatingExpiredDialogActivity$onCreate$1$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.syy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC45832syy extends AbstractActivityC33041mov {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.syy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.syy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC45832syy.class);
            intent.putExtra(RatingDisplayStatus.RATING_DISPLAY_STATUS, RatingDisplayStatus.RatingExpired.getValue());
            return intent;
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this);
        viewOnClickListenerC54939xaY.setTitle(C47315tni.PendingIntent.DXXBbs);
        viewOnClickListenerC54939xaY.copydefault(C47315tni.PendingIntent.ODWQjV);
        viewOnClickListenerC54939xaY.EZpvd(C47315tni.PendingIntent.DGgnkA, new View.OnClickListener() { // from class: o.syx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC45832syy.KWHzl(viewOnClickListenerC54939xaY, this, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C47315tni.PendingIntent.OLrzqt, new View.OnClickListener() { // from class: o.syz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC45832syy.KWHzl(this.OLrzqt, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.syA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45832syy.copydefault(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, ActivityC45832syy activityC45832syy, android.view.View view) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewOnClickListenerC54939xaY), null, null, new RatingExpiredDialogActivity$onCreate$1$1$1(activityC45832syy, C6805aWM.OLrzqt(new Function1() { // from class: o.syF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC45832syy.copydefault((ChatBotRequest) obj);
            }
        }), null), 3, null);
    }

    public static final Unit copydefault(ChatBotRequest chatBotRequest) {
        Intrinsics.checkNotNullParameter(chatBotRequest, "");
        chatBotRequest.setOkaFrom("cg_expired-csat-email");
        return Unit.INSTANCE;
    }

    public static final void KWHzl(ActivityC45832syy activityC45832syy, android.view.View view) {
        activityC45832syy.finish();
    }

    public static final void copydefault(ActivityC45832syy activityC45832syy) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45832syy, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.EZpvd, C52761wXj.Application.copydefault);
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
