package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.giQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20517giQ extends AbstractActivityC33013moT implements InterfaceC20523giW {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public AbstractC16296ehJ AEQbTJ;

    /* JADX INFO: renamed from: o.giQ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.giQ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC20517giQ.class);
            intent.putExtras(C20557gjD.Companion.KWHzl(str, z));
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.AEQbTJ = (AbstractC16296ehJ) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QfsBiF);
        OLrzqt();
        C20557gjD c20557gjD = new C20557gjD();
        c20557gjD.setArguments(getIntent().getExtras());
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.putInt, c20557gjD).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.giX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20517giQ.copydefault(this.copydefault);
            }
        });
    }

    public static final void copydefault(ActivityC20517giQ activityC20517giQ) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20517giQ, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        AbstractC16296ehJ abstractC16296ehJ = this.AEQbTJ;
        if (abstractC16296ehJ == null) {
            Intrinsics.gEmmrt("");
            abstractC16296ehJ = null;
        }
        abstractC16296ehJ.OLrzqt.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.putInt));
        abstractC16296ehJ.EZpvd.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.giS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20517giQ.KWHzl(this.copydefault, view);
            }
        });
        abstractC16296ehJ.OLrzqt.setExpandedTitleMarginBottom(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        abstractC16296ehJ.OLrzqt.setExpandedTitleMarginTop(C55298xhM.dpInt$default(16, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public static final void KWHzl(ActivityC20517giQ activityC20517giQ, android.view.View view) {
        activityC20517giQ.getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.copydefault);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
