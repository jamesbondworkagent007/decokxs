package o;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.core.scan.TransactionInfo;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gnd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC20795gnd extends AbstractActivityC33007moN implements InterfaceC20523giW {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33007moN
    public java.lang.CharSequence EZpvd() {
        return "";
    }

    /* JADX INFO: renamed from: o.gnd$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gnd.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final android.content.Intent KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, TransactionInfo transactionInfo, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, int i, TxToastCheckRes txToastCheckRes, @NotNull java.lang.String str8, TransactionType transactionType, boolean z, @NotNull java.lang.String str9, boolean z2, boolean z3, boolean z4, @NotNull java.lang.String str10, java.util.ArrayList<java.lang.Integer> arrayList) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC20795gnd.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("coinId", str2);
            intent.putExtra("data", transactionInfo);
            intent.putExtra("from", str3);
            intent.putExtra(MTAnalysisConstants.Account.KEY_ACCOUNT, str4);
            intent.putExtra("deposit_limit", str5);
            intent.putExtra("exchange_account_name", str6);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str7);
            intent.putExtra("address_group", i);
            intent.putExtra("is_smart_account", z2);
            intent.putExtra("risk_check_result", txToastCheckRes);
            intent.putExtra("ens_domain", str8);
            intent.putExtra("txType", transactionType != null ? java.lang.Integer.valueOf(transactionType.ordinal()) : null);
            intent.putExtra("custom_coin", z);
            intent.putExtra("from_address", str9);
            intent.putExtra("is_aa_wallet", z3);
            intent.putExtra("is_xlayer_prefix_to_address", z4);
            intent.putExtra("exchange_memo", str10);
            intent.putExtra("tx_check_fail_list", arrayList);
            return intent;
        }
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.clear();
        }
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        djBIcL().EZpvd.setBackgroundResource(C52761wXj.Activity.copydefault);
        setForceDismiss(false);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.gnb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC20795gnd.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(ActivityC20795gnd activityC20795gnd) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC20795gnd, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33007moN
    public androidx.fragment.app.Fragment copydefault() {
        if (OLrzqt()) {
            if (AhwBna()) {
                return C21023grt.Companion.KWHzl(getIntent().getExtras());
            }
            return C21020grq.Companion.OLrzqt(getIntent().getExtras());
        }
        if (AhwBna()) {
            return C20816gny.Companion.copydefault(getIntent().getExtras());
        }
        if (getIntent().getBooleanExtra("is_aa_wallet", false)) {
            return C20800gni.Companion.EZpvd(getIntent().getExtras());
        }
        return C20775gnJ.Companion.AEQbTJ(getIntent().getExtras());
    }

    private final boolean AhwBna() {
        return Intrinsics.EZpvd((java.lang.Object) getIntent().getStringExtra("from"), (java.lang.Object) "from_receive");
    }

    public final boolean OLrzqt() {
        return getIntent().getBooleanExtra("custom_coin", false);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        C14494dmX.KWHzl.EZpvd("SendSetAmount_Btm_Button_Click", "return");
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
