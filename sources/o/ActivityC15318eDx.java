package o;

import com.okinc.wallet.hardware.api.ledger.model.BluetoothDeviceModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C32113mPz;
import o.C52761wXj;
import o.C57032yak;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC15318eDx extends AbstractActivityC33013moT implements InterfaceC57025yad, C57032yak.StateListAnimator {
    public BluetoothDeviceModel KWHzl;
    public boolean OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33041mov, o.InterfaceC33019moZ
    public boolean animOpen() {
        return !this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.eDx$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eDx.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void KWHzl(@NotNull android.app.Activity activity, @NotNull BluetoothDeviceModel bluetoothDeviceModel, boolean z) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(bluetoothDeviceModel, "");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC15318eDx.class);
            intent.putExtra("bluetoothDeviceModel", bluetoothDeviceModel);
            intent.putExtra("startFromDialog", z);
            activity.startActivity(intent);
            if (z) {
                activity.overridePendingTransition(com.google.android.material.R.anim.design_bottom_sheet_slide_in, C52761wXj.Application.fetchVPNInfo);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, android.app.Activity
    public void finish() {
        super.finish();
        if (this.OLrzqt) {
            overridePendingTransition(C52761wXj.Application.fetchVPNInfo, com.google.android.material.R.anim.design_bottom_sheet_slide_out);
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.OLrzqt = getIntent().getBooleanExtra("startFromDialog", false);
        super.onCreate(bundle);
        setContentView(C13754dXa.TaskDescription.fFgQHt);
        this.KWHzl = (BluetoothDeviceModel) getIntent().getParcelableExtra("bluetoothDeviceModel");
        if (this.OLrzqt) {
            ((C33537myN) findViewById(C13754dXa.ActionBar.accept)).setBackImage(C32113mPz.TaskDescription.copydefault);
        }
        if (C57026yae.copydefault.EZpvd(this)) {
            BluetoothDeviceModel bluetoothDeviceModel = this.KWHzl;
            if (bluetoothDeviceModel != null) {
                C57032yak c57032yak = C57032yak.AEQbTJ;
                c57032yak.AEQbTJ((C57032yak.StateListAnimator) this);
                c57032yak.copydefault(this);
                c57032yak.EZpvd(bluetoothDeviceModel);
            } else {
                finish();
            }
        } else {
            eDA.Companion.copydefault(this, 2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, this.OLrzqt);
            finish();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.eDz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC15318eDx.OLrzqt(this.KWHzl);
            }
        });
    }

    public static final void OLrzqt(ActivityC15318eDx activityC15318eDx) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC15318eDx, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C57032yak c57032yak = C57032yak.AEQbTJ;
        c57032yak.EZpvd(this);
        c57032yak.AEQbTJ((InterfaceC57025yad) this);
    }

    @Override // o.InterfaceC57025yad
    public void AEQbTJ(int i) {
        if (isFinishing() || i == 11) {
            return;
        }
        eDA.Companion.copydefault(this, 2, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, false);
        finish();
    }

    @Override // o.C57032yak.StateListAnimator
    public void AEQbTJ() {
        if (isFinishing()) {
            return;
        }
        BluetoothDeviceModel bluetoothDeviceModel = this.KWHzl;
        if (bluetoothDeviceModel != null) {
            C13992dcz.AEQbTJ.OLrzqt(bluetoothDeviceModel);
            eDC.Companion.KWHzl(this, bluetoothDeviceModel, false, false);
        }
        finish();
    }

    @Override // o.C57032yak.StateListAnimator
    public void KWHzl() {
        if (isFinishing()) {
            return;
        }
        eDA.Companion.copydefault(this, 1, (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, false);
        finish();
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
