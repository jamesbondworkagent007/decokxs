package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.biz.core.tx.TransactionType;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.grp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class ActivityC21019grp extends AbstractActivityC33007moN implements InterfaceC20523giW {
    public static final Activity Companion = new Activity(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC33007moN
    public java.lang.CharSequence EZpvd() {
        return "";
    }

    /* JADX INFO: renamed from: o.grp$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.grp.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull TransactionType transactionType, java.lang.Integer num, java.lang.Long l, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC21019grp.class);
            intent.putExtra("wallet_id", str);
            intent.putExtra("coinId", str2);
            intent.putExtra("protocol_id", num);
            intent.putExtra("general_chainid", l);
            intent.putExtra(RemoteMessageConst.Notification.TICKER, str5);
            intent.putExtra("from_address", str3);
            intent.putExtra(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str4);
            intent.putExtra("txType", transactionType.ordinal());
            return intent;
        }
    }

    @Override // o.AbstractActivityC33007moN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        djBIcL().EZpvd.setBackgroundResource(C52761wXj.Activity.copydefault);
        setForceDismiss(false);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.grm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC21019grp.KWHzl(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(ActivityC21019grp activityC21019grp) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC21019grp, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33007moN
    public androidx.fragment.app.Fragment copydefault() {
        return C20808gnq.Companion.KWHzl(getIntent().getExtras());
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
