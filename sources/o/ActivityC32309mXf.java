package o;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;

/* JADX INFO: renamed from: o.mXf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC32309mXf extends AbstractActivityC32310mXg {
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.mXe
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC32309mXf.OLrzqt(this.OLrzqt);
        }
    });
    public C36056oNq AhwBna;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.mXf$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mXf.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final java.lang.String OLrzqt(ActivityC32309mXf activityC32309mXf) {
        java.lang.String stringExtra = activityC32309mXf.getIntent().getStringExtra("key.token_image_url");
        return stringExtra == null ? "" : stringExtra;
    }

    /* JADX DEBUG: Possible override for method o.mXg.KWHzl()V */
    public final java.lang.String KWHzl() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    @Override // o.AbstractActivityC32310mXg, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C36056oNq c36056oNqCopydefault = C36056oNq.copydefault(getLayoutInflater());
        this.AhwBna = c36056oNqCopydefault;
        setContentView(c36056oNqCopydefault != null ? c36056oNqCopydefault.getRoot() : null);
        AYXKKw();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.mXj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC32309mXf.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(ActivityC32309mXf activityC32309mXf) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC32309mXf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AYXKKw() {
        C36056oNq c36056oNq = this.AhwBna;
        if (c36056oNq != null) {
            C33537myN c33537myN = c36056oNq.EZpvd;
            c33537myN.setBackVisible(0);
            c33537myN.setBackListener(new View.OnClickListener() { // from class: o.mXk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ActivityC32309mXf.AEQbTJ(this.copydefault, view);
                }
            });
            c33537myN.getBackImage().setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.zblBkD)));
            ScaleGestureDetectorOnScaleGestureListenerC7495aks scaleGestureDetectorOnScaleGestureListenerC7495aks = c36056oNq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(scaleGestureDetectorOnScaleGestureListenerC7495aks, "");
            C33054mpH.AEQbTJ(scaleGestureDetectorOnScaleGestureListenerC7495aks, KWHzl());
            C52794wYp c52794wYp = c36056oNq.copydefault;
            c52794wYp.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
            c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
            c52794wYp.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.zblBkD));
        }
    }

    public static final void AEQbTJ(ActivityC32309mXf activityC32309mXf, android.view.View view) {
        activityC32309mXf.finish();
    }

    /* JADX INFO: renamed from: o.mXf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ActivityC32309mXf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, ActivityC32309mXf activityC32309mXf) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = activityC32309mXf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC32309mXf activityC32309mXf = this.copydefault;
                mUO.AEQbTJ(activityC32309mXf, activityC32309mXf.KWHzl());
            }
        }
    }

    @Override // o.AbstractActivityC32310mXg, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC32310mXg, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC32310mXg, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC32310mXg, o.ActivityC36345oYi, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
