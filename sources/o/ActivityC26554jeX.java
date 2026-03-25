package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32982mnp;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC26554jeX extends AbstractActivityC26546jeP {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final android.util.SparseArray<C33510mxn> AYXKKw = C33503mxg.EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov
    public android.util.SparseArray<C33510mxn> getSwitchThemePairs() {
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.jeX$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jeX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final void copydefault(@NotNull android.app.Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "");
            activity.startActivity(new android.content.Intent(activity, (java.lang.Class<?>) ActivityC26554jeX.class));
        }

        public final void EZpvd(@NotNull android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            Intrinsics.checkNotNullParameter(activity, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC26554jeX.class);
            intent.putExtra("chainId", str2);
            intent.putExtra("searchKey", str);
            intent.putExtra("tagType", str3);
            activity.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC26546jeP, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Integer numKWHzl = C33503mxg.KWHzl(this.AYXKKw);
        if (numKWHzl != null) {
            setTheme(numKWHzl.intValue());
        }
        super.onCreate(bundle);
        setContentView(C32982mnp.Activity.KWHzl);
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        int i = C32982mnp.StateListAnimator.copydefault;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("chainId", getIntent().getStringExtra("chainId"));
        bundle2.putString("searchKey", getIntent().getStringExtra("searchKey"));
        bundle2.putString("tagType", getIntent().getStringExtra("tagType"));
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(i, C26555jeY.class, bundle2, null), "");
        fragmentTransactionBeginTransaction.commit();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        int color = ContextCompat.getColor(this, C52761wXj.Activity.RSmiaq);
        C27569jxf.OLrzqt.OLrzqt(this, color);
        getWindow().setStatusBarColor(color);
    }

    @Override // o.AbstractActivityC26546jeP, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC26546jeP, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC26546jeP, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC26546jeP, o.AbstractActivityC33001moH, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
