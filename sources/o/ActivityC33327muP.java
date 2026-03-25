package o;

import android.animation.Animator;
import com.okinc.core.ok_app.ModeManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.muP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class ActivityC33327muP extends AbstractActivityC33326muO implements Animator.AnimatorListener {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AbstractC33296mtl valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(@NotNull android.animation.Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(@NotNull android.animation.Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(@NotNull android.animation.Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "");
    }

    @Override // o.AbstractActivityC33326muO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(C52761wXj.Application.EZpvd, C52761wXj.Application.fetchVPNInfo);
        AbstractC33296mtl abstractC33296mtlOLrzqt = AbstractC33296mtl.OLrzqt(getLayoutInflater());
        this.valueOf = abstractC33296mtlOLrzqt;
        if (abstractC33296mtlOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC33296mtlOLrzqt = null;
        }
        setContentView(abstractC33296mtlOLrzqt.getRoot());
    }

    @Override // o.AbstractActivityC33326muO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        postDelay(new java.lang.Runnable() { // from class: o.muM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC33327muP.copydefault(this.EZpvd);
            }
        }, 200L);
    }

    public static final void copydefault(ActivityC33327muP activityC33327muP) {
        AbstractC33296mtl abstractC33296mtl = activityC33327muP.valueOf;
        AbstractC33296mtl abstractC33296mtl2 = null;
        if (abstractC33296mtl == null) {
            Intrinsics.gEmmrt("");
            abstractC33296mtl = null;
        }
        abstractC33296mtl.KWHzl.addAnimatorListener(activityC33327muP);
        AbstractC33296mtl abstractC33296mtl3 = activityC33327muP.valueOf;
        if (abstractC33296mtl3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC33296mtl2 = abstractC33296mtl3;
        }
        abstractC33296mtl2.KWHzl.playAnimation();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(@NotNull android.animation.Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "");
        final java.lang.String stringExtra = getIntent().getStringExtra("key_callback");
        finish();
        AbstractC33296mtl abstractC33296mtl = this.valueOf;
        if (abstractC33296mtl == null) {
            Intrinsics.gEmmrt("");
            abstractC33296mtl = null;
        }
        abstractC33296mtl.getRoot().post(new java.lang.Runnable() { // from class: o.muS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC33327muP.EZpvd(stringExtra);
            }
        });
    }

    public static final void EZpvd(java.lang.String str) {
        ModeManager.EZpvd.AEQbTJ(str);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(C52761wXj.Application.EZpvd, C52761wXj.Application.fetchVPNInfo);
    }

    @Override // o.AbstractActivityC33326muO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AbstractC33296mtl abstractC33296mtl = this.valueOf;
        AbstractC33296mtl abstractC33296mtl2 = null;
        if (abstractC33296mtl == null) {
            Intrinsics.gEmmrt("");
            abstractC33296mtl = null;
        }
        abstractC33296mtl.KWHzl.removeAnimatorListener(this);
        AbstractC33296mtl abstractC33296mtl3 = this.valueOf;
        if (abstractC33296mtl3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC33296mtl2 = abstractC33296mtl3;
        }
        abstractC33296mtl2.KWHzl.clearAnimation();
    }

    /* JADX INFO: renamed from: o.muP$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.muP.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC33327muP.class);
            intent.putExtra("key_callback", str);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33326muO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33326muO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33326muO, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
