package o;

import com.okinc.business.market.features.vibes.ui.DiscoverProfileParams;
import com.okinc.dapp.bean.KOLProfileParamsBean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class kAW extends AbstractActivityC33013moT {
    public static final ActionBar Companion = new ActionBar(null);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kAW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.List listKWHzl;
        xWA xwa;
        super.onCreate(bundle);
        DiscoverProfileParams discoverProfileParams = (DiscoverProfileParams) getIntent().getParcelableExtra("discover_profile.params");
        if (bundle == null && (listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(xWA.class))) != null && (xwa = (xWA) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) != null) {
            java.lang.String strAEQbTJ = discoverProfileParams != null ? discoverProfileParams.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            java.lang.String strKWHzl = discoverProfileParams != null ? discoverProfileParams.KWHzl() : null;
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            java.lang.String strOLrzqt = discoverProfileParams != null ? discoverProfileParams.OLrzqt() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            java.lang.String strCopydefault = discoverProfileParams != null ? discoverProfileParams.copydefault() : null;
            getSupportFragmentManager().beginTransaction().replace(android.R.id.content, xwa.EZpvd(new KOLProfileParamsBean(strAEQbTJ, strKWHzl, strOLrzqt, strCopydefault != null ? strCopydefault : ""))).commit();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.kAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                kAW.copydefault(this.KWHzl);
            }
        });
    }

    public static final void copydefault(kAW kaw) {
        rVN.reportFullyDrawn$default((android.app.Activity) kaw, true, (java.lang.String) null, 2, (java.lang.Object) null);
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
