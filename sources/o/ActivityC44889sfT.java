package o;

import android.view.View;
import com.okinc.biz.event.SupportCenterEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC44038sBa;
import o.C45167skg;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sfT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC44889sfT extends AbstractActivityC44917sfv {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.sfY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC44889sfT.KWHzl(this.copydefault);
        }
    });
    public final boolean EZpvd = true;

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean AYXKKw() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public boolean bo_() {
        return this.EZpvd;
    }

    private final AbstractC47295tnO AEQbTJ() {
        return (AbstractC47295tnO) this.OLrzqt.getValue();
    }

    public static final AbstractC47295tnO KWHzl(ActivityC44889sfT activityC44889sfT) {
        return AbstractC47295tnO.EZpvd(activityC44889sfT.getLayoutInflater());
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public android.view.View AkhnZx() {
        android.view.View root = AEQbTJ().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // com.okinc.okex.common.ui.OKSupportBaseActivity
    public void initFrameContent(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        int intExtra = getIntent().getIntExtra("arg_tab_index", 0);
        AEQbTJ();
        KWHzl();
        EZpvd(intExtra);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.sfU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC44889sfT.OLrzqt(this.copydefault);
            }
        });
    }

    public static final void OLrzqt(ActivityC44889sfT activityC44889sfT) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC44889sfT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void KWHzl() {
        KWHzl(C33070mpX.AYXKKw(C47315tni.PendingIntent.OJuSTm));
        EZpvd(C52761wXj.TaskDescription.UJpkuA, C47315tni.Activity.djBIcL, new View.OnClickListener() { // from class: o.sfX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC44889sfT.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void KWHzl(ActivityC44889sfT activityC44889sfT, android.view.View view) {
        activityC44889sfT.startActivity(ActivityC44038sBa.Application.createIntent$default(ActivityC44038sBa.Companion, activityC44889sfT, SupportCenterEvent.ArticlePageParam.ExploreTopics.getValue(), null, 4, null));
    }

    public final void EZpvd(int i) {
        C45167skg.StateListAnimator stateListAnimator = C45167skg.Companion;
        C45167skg c45167skgNewInstance$default = C45167skg.StateListAnimator.newInstance$default(stateListAnimator, i, false, 2, null);
        c45167skgNewInstance$default.OLrzqt(yDY.gEmmrt(new C45167skg.Activity(C33070mpX.AYXKKw(C47315tni.PendingIntent.QVsKAR), C45099sjR.Companion.KWHzl()), new C45167skg.Activity(C33070mpX.AYXKKw(C47315tni.PendingIntent.QSLkRj), C45054siZ.Companion.KWHzl())));
        getSupportFragmentManager().beginTransaction().add(C47315tni.TaskDescription.invokespecialaGOrKO, c45167skgNewInstance$default, stateListAnimator.AEQbTJ()).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.sfT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sfT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(TaskDescription taskDescription, android.content.Context context, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                num = 0;
            }
            return taskDescription.EZpvd(context, num);
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, java.lang.Integer num) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC44889sfT.class);
            intent.putExtra("arg_tab_index", num);
            return intent;
        }
    }

    @Override // o.AbstractActivityC44917sfv, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC44917sfv, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC44917sfv, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC44917sfv, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // o.AbstractActivityC44917sfv, com.okinc.okex.common.ui.OKSupportBaseActivity, o.AbstractActivityC45319snZ, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }
}
