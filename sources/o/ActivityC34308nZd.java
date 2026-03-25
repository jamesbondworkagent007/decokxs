package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC34318nZn;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC34308nZd extends nYV<nIG> {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return C35399nuc.Dialog.gHZMYf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long djBIcL() {
        return getIntent().getLongExtra("ARG_GROUP_ID", -1L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.nYV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        nIG.OLrzqt(getLayoutInflater());
        setTitle(getString(C35399nuc.LoaderManager.DcNNRp));
        C33537myN c33537myN = ((nIG) KWHzl()).OLrzqt;
        c33537myN.getTitle().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        android.widget.ImageView backImage = c33537myN.getBackImage();
        if (backImage != null) {
            ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) (24 * c33537myN.getResources().getDisplayMetrics().density));
                backImage.setLayoutParams(layoutParams2);
            }
        }
        c33537myN.getDoImage().setImageTintList(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(c33537myN.getContext(), C52761wXj.Activity.fdOvFl)));
        android.widget.ImageView doImage = c33537myN.getDoImage();
        doImage.setOnClickListener(new Application(doImage, 1000L, c33537myN, this));
        getSupportFragmentManager().beginTransaction().replace(C35399nuc.StateListAnimator.DCUTEIddSDPG, C34307nZc.Companion.EZpvd(djBIcL())).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC34308nZd.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(ActivityC34308nZd activityC34308nZd) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC34308nZd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nZd$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nZd.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, java.lang.Long l) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context.getApplicationContext(), (java.lang.Class<?>) ActivityC34308nZd.class);
            intent.putExtras(BundleKt.bundleOf(C56390yDp.OLrzqt("ARG_GROUP_ID", l)));
            return intent;
        }
    }

    /* JADX INFO: renamed from: o.nZd$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ ActivityC34308nZd EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C33537myN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C33537myN c33537myN, ActivityC34308nZd activityC34308nZd) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.copydefault = c33537myN;
            this.EZpvd = activityC34308nZd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActivityC34318nZn.ActionBar actionBar = ActivityC34318nZn.Companion;
                android.content.Context context = this.copydefault.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                this.EZpvd.startActivity(actionBar.OLrzqt(context, this.EZpvd.djBIcL()));
            }
        }
    }

    @Override // o.nYV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.nYV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.nYV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.nYV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
