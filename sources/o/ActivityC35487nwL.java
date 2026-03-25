package o;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.okinc.im.bean.ChatSettingViewComponentScene;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class ActivityC35487nwL extends AbstractActivityC35497nwV<AbstractC33862nIp> {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return C35399nuc.Dialog.AuCTel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC35497nwV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC33862nIp.KWHzl(getLayoutInflater());
        setTitle(getString(C35399nuc.LoaderManager.isElapsedRealtimeNanosAvailable));
        ((AbstractC33862nIp) KWHzl()).EZpvd.getTitle().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        android.widget.ImageView backImage = ((AbstractC33862nIp) KWHzl()).EZpvd.getBackImage();
        if (backImage != null) {
            ViewGroup.LayoutParams layoutParams = backImage.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) (24 * getResources().getDisplayMetrics().density));
                backImage.setLayoutParams(layoutParams2);
            }
        }
        if (bundle == null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            fragmentTransactionBeginTransaction.replace(C35399nuc.StateListAnimator.QVsKAR, C37189opD.Companion.OLrzqt(ChatSettingViewComponentScene.CHAT_SETTINGS));
            fragmentTransactionBeginTransaction.commit();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nwK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC35487nwL.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(ActivityC35487nwL activityC35487nwL) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC35487nwL, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.nwL$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nwL.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return new android.content.Intent(context, (java.lang.Class<?>) ActivityC35487nwL.class);
        }
    }

    @Override // o.AbstractActivityC35497nwV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC35497nwV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC35497nwV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC35497nwV, o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
