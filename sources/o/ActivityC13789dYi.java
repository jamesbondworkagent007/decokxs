package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C13798dYr;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dYi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityC13789dYi extends AbstractActivityC33013moT implements InterfaceC20523giW {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public AbstractC16247egN OLrzqt;

    /* JADX INFO: renamed from: o.dYi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dYi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ android.content.Intent getStartIntent$default(ActionBar actionBar, android.content.Context context, long j, java.lang.String str, TransactionInfo transactionInfo, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                transactionInfo = null;
            }
            return actionBar.OLrzqt(context, j, str, transactionInfo, str2);
        }

        public final android.content.Intent OLrzqt(@NotNull android.content.Context context, long j, @NotNull java.lang.String str, TransactionInfo transactionInfo, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC13789dYi.class);
            intent.putExtra("coin_id", j);
            intent.putExtra("wallet_id", str);
            intent.putExtra("send_scan_info", transactionInfo);
            intent.putExtra("from_address", str2);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.OLrzqt = (AbstractC16247egN) DataBindingUtil.setContentView(this, C13754dXa.TaskDescription.AhwBna);
        KWHzl();
        OLrzqt();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.dYq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC13789dYi.EZpvd(this.OLrzqt);
            }
        });
    }

    public static final void EZpvd(ActivityC13789dYi activityC13789dYi) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC13789dYi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void OLrzqt() {
        AbstractC16247egN abstractC16247egN = this.OLrzqt;
        if (abstractC16247egN == null) {
            Intrinsics.gEmmrt("");
            abstractC16247egN = null;
        }
        abstractC16247egN.copydefault.setTitleVisible(4);
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = C13754dXa.ActionBar.HJWChPRAkuRW;
        C13798dYr.Application application = C13798dYr.Companion;
        long longExtra = getIntent().getLongExtra("coin_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("wallet_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        TransactionInfo transactionInfo = (TransactionInfo) getIntent().getParcelableExtra("send_scan_info");
        java.lang.String stringExtra2 = getIntent().getStringExtra("from_address");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        fragmentTransactionBeginTransaction.add(i, application.EZpvd(longExtra, stringExtra, transactionInfo, stringExtra2, new Function1() { // from class: o.dYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13789dYi.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.dYl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC13789dYi.copydefault(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        })).commitAllowingStateLoss();
    }

    public static final Unit EZpvd(ActivityC13789dYi activityC13789dYi, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC16247egN abstractC16247egN = activityC13789dYi.OLrzqt;
        if (abstractC16247egN == null) {
            Intrinsics.gEmmrt("");
            abstractC16247egN = null;
        }
        abstractC16247egN.copydefault.setTitle(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(ActivityC13789dYi activityC13789dYi, boolean z) {
        AbstractC16247egN abstractC16247egN = activityC13789dYi.OLrzqt;
        if (abstractC16247egN == null) {
            Intrinsics.gEmmrt("");
            abstractC16247egN = null;
        }
        abstractC16247egN.copydefault.setTitleVisible(z ? 0 : 4);
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        AbstractC16247egN abstractC16247egN = this.OLrzqt;
        AbstractC16247egN abstractC16247egN2 = null;
        if (abstractC16247egN == null) {
            Intrinsics.gEmmrt("");
            abstractC16247egN = null;
        }
        abstractC16247egN.copydefault.getTitle().setTextAppearance(C52761wXj.LoaderManager.RKDWNf);
        AbstractC16247egN abstractC16247egN3 = this.OLrzqt;
        if (abstractC16247egN3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC16247egN2 = abstractC16247egN3;
        }
        abstractC16247egN2.copydefault.getTitle().setText(C33070mpX.AYXKKw(C13754dXa.FragmentManager.FQMcgEfQMcgE));
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
