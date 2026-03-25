package o;

import com.okinc.business.defi.wallet.tx.send.CeDeFiAAAssetInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.gGY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gGW extends AbstractActivityC33013moT {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public C16408ejP AEQbTJ;

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gGW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull CeDeFiAAAssetInfo ceDeFiAAAssetInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(ceDeFiAAAssetInfo, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) gGW.class);
            intent.putExtra("extra_send_wallet_id", str);
            intent.putExtra("extra_send_asset_info", ceDeFiAAAssetInfo);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C16408ejP c16408ejPAEQbTJ = C16408ejP.AEQbTJ(getLayoutInflater());
        this.AEQbTJ = c16408ejPAEQbTJ;
        if (c16408ejPAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c16408ejPAEQbTJ = null;
        }
        setContentView(c16408ejPAEQbTJ.getRoot());
        OLrzqt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                gGW.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(gGW ggw) {
        rVN.reportFullyDrawn$default((android.app.Activity) ggw, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        gGY.StateListAnimator stateListAnimator = gGY.Companion;
        java.lang.String stringExtra = getIntent().getStringExtra("extra_send_wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        CeDeFiAAAssetInfo ceDeFiAAAssetInfo = (CeDeFiAAAssetInfo) getIntent().getParcelableExtra("extra_send_asset_info");
        if (ceDeFiAAAssetInfo == null) {
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(C13754dXa.ActionBar.RSmiaq, stateListAnimator.KWHzl(stringExtra, ceDeFiAAAssetInfo)).commit();
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
