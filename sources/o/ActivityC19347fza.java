package o;

import android.os.Build;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.BindCeFiDeeplinkParams;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C19356fzj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fza, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC19347fza extends AbstractActivityC19311fyr {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public C19356fzj valueOf;

    /* JADX INFO: renamed from: o.fza$ActionBar */
    public static final class ActionBar implements java.lang.Runnable {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C19356fzj c19356fzj = ActivityC19347fza.this.valueOf;
            if (c19356fzj != null) {
                androidx.fragment.app.FragmentManager supportFragmentManager = ActivityC19347fza.this.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c19356fzj.show(supportFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.fza$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fza.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull android.content.Context context, WalletInfo walletInfo, BindCeFiDeeplinkParams bindCeFiDeeplinkParams) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC19347fza.class);
            intent.putExtra("walletInfo", walletInfo);
            intent.putExtra(MetricsSQLiteCacheKt.METRICS_PARAMS, bindCeFiDeeplinkParams);
            if (context instanceof AbstractActivityC33041mov) {
                ((AbstractActivityC33041mov) context).overridePendingTransition(0, 0);
            }
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull android.content.Intent intent) {
        android.os.Parcelable parcelableExtra;
        android.os.Parcelable parcelableExtra2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        C19356fzj c19356fzj = this.valueOf;
        if (c19356fzj != null) {
            c19356fzj.dismiss();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("walletInfo", WalletInfo.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("walletInfo");
        }
        WalletInfo walletInfo = (WalletInfo) parcelableExtra;
        if (i >= 33) {
            parcelableExtra2 = (android.os.Parcelable) intent.getParcelableExtra(MetricsSQLiteCacheKt.METRICS_PARAMS, BindCeFiDeeplinkParams.class);
        } else {
            parcelableExtra2 = intent.getParcelableExtra(MetricsSQLiteCacheKt.METRICS_PARAMS);
        }
        C19356fzj c19356fzjNewInstance$default = C19356fzj.Activity.newInstance$default(C19356fzj.Companion, walletInfo, null, (BindCeFiDeeplinkParams) parcelableExtra2, null, 8, null);
        this.valueOf = c19356fzjNewInstance$default;
        if (c19356fzjNewInstance$default != null) {
            androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            c19356fzjNewInstance$default.show(supportFragmentManager);
        }
    }

    @Override // o.AbstractActivityC19311fyr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.os.Parcelable parcelableExtra;
        android.os.Parcelable parcelableExtra2;
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelableExtra = (android.os.Parcelable) intent.getParcelableExtra("walletInfo", WalletInfo.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("walletInfo");
        }
        WalletInfo walletInfo = (WalletInfo) parcelableExtra;
        android.content.Intent intent2 = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent2, "");
        if (i >= 33) {
            parcelableExtra2 = (android.os.Parcelable) intent2.getParcelableExtra(MetricsSQLiteCacheKt.METRICS_PARAMS, BindCeFiDeeplinkParams.class);
        } else {
            parcelableExtra2 = intent2.getParcelableExtra(MetricsSQLiteCacheKt.METRICS_PARAMS);
        }
        this.valueOf = C19356fzj.Activity.newInstance$default(C19356fzj.Companion, walletInfo, null, (BindCeFiDeeplinkParams) parcelableExtra2, null, 8, null);
        postDelay(new ActionBar(), 300L);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.fzd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC19347fza.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(ActivityC19347fza activityC19347fza) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC19347fza, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // o.AbstractActivityC19311fyr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC19311fyr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC19311fyr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC19311fyr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
