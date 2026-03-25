package o;

import androidx.databinding.DataBindingUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20997grT extends AbstractActivityC33013moT {
    public AbstractC16362eiW KWHzl;
    public boolean OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public java.lang.String AYXKKw = "";
    public java.lang.String copydefault = "";
    public java.lang.String EZpvd = "";

    /* JADX INFO: renamed from: o.grT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.grT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ android.content.Intent getStartIntent$default(ActionBar actionBar, android.content.Context context, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 16) != 0) {
                str3 = "";
            }
            return actionBar.AEQbTJ(context, str, str2, z, str3);
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC20997grT.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("coinId", str2);
            intent.putExtra("show", z);
            intent.putExtra("receive_address", str3);
            return intent;
        }
    }

    private final void KWHzl() {
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("wallet_id") : null;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.AYXKKw = stringExtra;
        android.content.Intent intent2 = getIntent();
        java.lang.String stringExtra2 = intent2 != null ? intent2.getStringExtra("coinId") : null;
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.copydefault = stringExtra2;
        android.content.Intent intent3 = getIntent();
        this.OLrzqt = intent3 != null ? intent3.getBooleanExtra("show", false) : false;
        android.content.Intent intent4 = getIntent();
        java.lang.String stringExtra3 = intent4 != null ? intent4.getStringExtra("receive_address") : null;
        this.EZpvd = stringExtra3 != null ? stringExtra3 : "";
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        KWHzl();
        this.KWHzl = (AbstractC16362eiW) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.QkdxfA);
        OLrzqt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.grS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20997grT.AEQbTJ(this.copydefault);
            }
        });
    }

    public static final void AEQbTJ(ActivityC20997grT activityC20997grT) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20997grT, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        if (!this.OLrzqt && this.AYXKKw.length() == 0) {
            C55326xho.toastWithFailedIcon$default("Miss wallet id", 0, 1, (java.lang.Object) null);
            return;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.adjustVolume, ViewOnClickListenerC20995grR.Companion.copydefault(this.AYXKKw, this.copydefault, (1772 & 4) != 0 ? false : false, (1772 & 8) != 0 ? "" : null, (1772 & 16) != 0 ? false : this.OLrzqt, (1772 & 32) != 0 ? false : true, (1772 & 64) != 0 ? -1 : 0, (1772 & 128) != 0 ? -1L : 0L, (1772 & 256) != 0 ? "" : this.EZpvd, (1772 & 512) != 0 ? 1 : 0, (1772 & 1024) != 0 ? null : null));
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        C14494dmX.KWHzl.EZpvd("ReceiveQRCodePage_Btm_Button_Click", "return");
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
