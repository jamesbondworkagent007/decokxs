package o;

import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C17351fCc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fCd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC17352fCd extends AbstractActivityC17324fBc {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public AbstractC16395ejC AYXKKw;
    public boolean AhwBna;

    /* JADX INFO: renamed from: o.fCd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fCd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void startActivity$default(StateListAnimator stateListAnimator, android.content.Context context, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            stateListAnimator.EZpvd(context, z);
        }

        public final void EZpvd(@NotNull android.content.Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC17352fCd.class);
            intent.putExtra("isHideManageBtn", z);
            context.startActivity(intent);
        }
    }

    private final void AEQbTJ() {
        android.content.Intent intent = getIntent();
        this.AhwBna = intent != null ? intent.getBooleanExtra("isHideManageBtn", false) : false;
    }

    @Override // o.AbstractActivityC17324fBc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AEQbTJ();
        this.AYXKKw = (AbstractC16395ejC) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QwvEab);
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.collapseActionView, C17351fCc.ActionBar.newInstance$default(C17351fCc.Companion, "fromMine", false, 2, null), C17351fCc.class.getName()).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fBZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC17352fCd.KWHzl(this.OLrzqt);
            }
        });
    }

    public static final void KWHzl(ActivityC17352fCd activityC17352fCd) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC17352fCd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC17324fBc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC17324fBc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC17324fBc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC17324fBc, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
