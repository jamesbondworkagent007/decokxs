package o;

import android.os.Build;
import com.okinc.okimcore.model.other.AffiliateMemberFilter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;

/* JADX INFO: loaded from: classes23.dex */
public final class nRF extends AbstractActivityC33044moy<AbstractC33847nIa> {
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nRG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nRF.OLrzqt(this.copydefault);
        }
    });
    public final int EZpvd = C35399nuc.Dialog.AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33044moy
    public int AEQbTJ() {
        return this.EZpvd;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nRF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.util.ArrayList<AffiliateMemberFilter> OLrzqt() {
        return (java.util.ArrayList) this.KWHzl.getValue();
    }

    public static final java.util.ArrayList OLrzqt(nRF nrf) {
        if (Build.VERSION.SDK_INT >= 33) {
            return nrf.getIntent().getParcelableArrayListExtra("list", AffiliateMemberFilter.class);
        }
        return nrf.getIntent().getParcelableArrayListExtra("list");
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC33847nIa abstractC33847nIaKWHzl = KWHzl();
        androidx.appcompat.widget.Toolbar toolbar = abstractC33847nIaKWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(toolbar, "");
        setupActionBarTitle(toolbar, abstractC33847nIaKWHzl.AEQbTJ, getString(C35399nuc.LoaderManager.openFileOutput));
        setForceDismiss(false);
        setLoadingCancelable(false);
        java.util.ArrayList<AffiliateMemberFilter> arrayListOLrzqt = OLrzqt();
        if (arrayListOLrzqt == null || arrayListOLrzqt.isEmpty()) {
            C55326xho.OLrzqt("memberFilters is empty");
            finish();
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        android.os.Bundle extras = getIntent().getExtras();
        C33062mpP.findOrReplaceFragment$default(C56524yIo.AEQbTJ(nRE.class), supportFragmentManager, C35399nuc.StateListAnimator.DIIpTV, extras, null, null, 24, null);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.nRH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                nRF.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(nRF nrf) {
        rVN.reportFullyDrawn$default((android.app.Activity) nrf, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33044moy, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
