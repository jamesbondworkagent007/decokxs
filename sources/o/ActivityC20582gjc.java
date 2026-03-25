package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gjc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20582gjc extends AbstractActivityC33013moT implements InterfaceC20523giW {
    public AbstractC16246egM KWHzl;
    public C20583gjd OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.gjc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gjc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3, boolean z2, boolean z3, TransactionInfo transactionInfo) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC20582gjc.class);
            intent.putExtra("walletId", str);
            intent.putExtra("chainId", j);
            intent.putExtra("coinId", j2);
            intent.putExtra("from", str2);
            intent.putExtra("isFirstTimeUse", z);
            intent.putExtra("currentAddress", str3);
            intent.putExtra("isSwitchMode", z2);
            intent.putExtra("isCloseGenerateFunction", z3);
            intent.putExtra("scanTransInfo", transactionInfo);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.KWHzl = (AbstractC16246egM) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.valueOf);
        KWHzl();
        copydefault();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gjg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20582gjc.copydefault(this.EZpvd);
            }
        });
    }

    public static final void copydefault(ActivityC20582gjc activityC20582gjc) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20582gjc, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        java.lang.String stringExtra = getIntent().getStringExtra("walletId");
        C20583gjd c20583gjd = null;
        if (stringExtra != null && stringExtra.length() == 0) {
            C55326xho.toastWithFailedIcon$default("Miss wallet id", 0, 1, (java.lang.Object) null);
            return;
        }
        C20583gjd c20583gjd2 = new C20583gjd();
        this.OLrzqt = c20583gjd2;
        c20583gjd2.setArguments(getIntent().getExtras());
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C13754dXa.ActionBar.QKVWgx;
        C20583gjd c20583gjd3 = this.OLrzqt;
        if (c20583gjd3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c20583gjd = c20583gjd3;
        }
        fragmentTransactionBeginTransaction.replace(i, c20583gjd).commitAllowingStateLoss();
    }

    private final void KWHzl() {
        C10854bwM c10854bwMKWHzl;
        AbstractC16246egM abstractC16246egM = this.KWHzl;
        AbstractC16246egM abstractC16246egM2 = null;
        if (abstractC16246egM == null) {
            Intrinsics.gEmmrt("");
            abstractC16246egM = null;
        }
        abstractC16246egM.copydefault.setTitle(C33070mpX.AYXKKw(C13754dXa.FragmentManager.findMenuPanel));
        AbstractC16246egM abstractC16246egM3 = this.KWHzl;
        if (abstractC16246egM3 == null) {
            Intrinsics.gEmmrt("");
            abstractC16246egM3 = null;
        }
        abstractC16246egM3.copydefault.setExpandedTitleMarginBottom(C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null));
        AbstractC16246egM abstractC16246egM4 = this.KWHzl;
        if (abstractC16246egM4 == null) {
            Intrinsics.gEmmrt("");
            abstractC16246egM4 = null;
        }
        abstractC16246egM4.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.gja
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20582gjc.copydefault(this.copydefault, view);
            }
        });
        AbstractC16246egM abstractC16246egM5 = this.KWHzl;
        if (abstractC16246egM5 == null) {
            Intrinsics.gEmmrt("");
            abstractC16246egM5 = null;
        }
        abstractC16246egM5.EZpvd.setColorFilter(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        AbstractC16246egM abstractC16246egM6 = this.KWHzl;
        if (abstractC16246egM6 == null) {
            Intrinsics.gEmmrt("");
            abstractC16246egM6 = null;
        }
        abstractC16246egM6.EZpvd.setVisibility(0);
        C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(getIntent().getLongExtra("coinId", 0L)));
        final java.lang.String strDjBIcL = (c10854bwMKWHzl2 == null || (c10854bwMKWHzl = c10854bwMKWHzl2.KWHzl()) == null) ? null : c10854bwMKWHzl.djBIcL();
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        AbstractC16246egM abstractC16246egM7 = this.KWHzl;
        if (abstractC16246egM7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16246egM2 = abstractC16246egM7;
        }
        abstractC16246egM2.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.gjb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC20582gjc.AEQbTJ(this.AEQbTJ, strDjBIcL, view);
            }
        });
    }

    public static final void copydefault(ActivityC20582gjc activityC20582gjc, android.view.View view) {
        activityC20582gjc.getOnBackPressedDispatcher().onBackPressed();
    }

    public static final void AEQbTJ(ActivityC20582gjc activityC20582gjc, java.lang.String str, android.view.View view) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activityC20582gjc);
        viewOnClickListenerC54939xaY.setTitle(C33069mpW.copydefault(C13754dXa.FragmentManager.getOptionsList, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", str))));
        viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C13754dXa.FragmentManager.putCallback, C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", str))));
        viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DarRvM, new View.OnClickListener() { // from class: o.giY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                ActivityC20582gjc.AEQbTJ(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        super.addConfig();
        C33494mxX.copydefault.EZpvd(this, C52761wXj.Activity.copydefault);
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
