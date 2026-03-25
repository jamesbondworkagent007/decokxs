package o;

import android.widget.FrameLayout;
import com.okinc.wallet.api.bean.WalletSearchConfiguration;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.ktq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC29450ktq extends AbstractActivityC29445ktl {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.ktq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ktq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractActivityC29445ktl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int iGenerateViewId = android.view.View.generateViewId();
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.setId(iGenerateViewId);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(frameLayout);
        if (bundle == null) {
            getSupportFragmentManager().beginTransaction().replace(iGenerateViewId, ((xWQ) C43251rlk.copydefault(xWQ.class)).EZpvd(new WalletSearchConfiguration(true, "default_trade", new WalletSearchConfiguration.DisplayOptions(null, true))), "wallet_search_fragment").commitAllowingStateLoss();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ktm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC29450ktq.KWHzl(this.AEQbTJ);
            }
        });
    }

    public static final void KWHzl(ActivityC29450ktq activityC29450ktq) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC29450ktq, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC29445ktl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC29445ktl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC29445ktl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC29445ktl, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
