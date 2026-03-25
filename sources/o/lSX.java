package o;

import com.okinc.buysell.api.BuySellOrderHistoryDetailParameters;
import com.okinc.buysell.api.BuySellTradeType;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.lSZ;

/* JADX INFO: loaded from: classes15.dex */
public final class lSX extends AbstractActivityC30305lTl {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ = "";
    public java.lang.String copydefault = "";
    public ChannelCategoryCode KWHzl = ChannelCategoryCode.THIRD_PARTY;

    @Override // o.AbstractActivityC30305lTl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean zAEQbTJ;
        BuySellTradeType buySellTradeTypeCopydefault;
        super.onCreate(bundle);
        setContentView(C31351lsQ.ActionBar.KWHzl);
        BuySellOrderHistoryDetailParameters buySellOrderHistoryDetailParameters = (BuySellOrderHistoryDetailParameters) getIntent().getParcelableExtra("BUY_SELL_ORDER_DETAIL_PARAMS");
        if (buySellOrderHistoryDetailParameters != null) {
            this.AEQbTJ = buySellOrderHistoryDetailParameters.EZpvd();
            zAEQbTJ = buySellOrderHistoryDetailParameters.AEQbTJ();
        } else {
            zAEQbTJ = false;
        }
        if (bundle == null) {
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            int i = C31351lsQ.Application.OxVOHk;
            lSZ.TaskDescription taskDescription = lSZ.Companion;
            java.lang.String str = this.AEQbTJ;
            java.lang.String str2 = this.copydefault;
            if (buySellOrderHistoryDetailParameters == null || (buySellTradeTypeCopydefault = buySellOrderHistoryDetailParameters.copydefault()) == null) {
                buySellTradeTypeCopydefault = BuySellTradeType.BUY;
            }
            fragmentTransactionBeginTransaction.replace(i, taskDescription.EZpvd(str, str2, buySellTradeTypeCopydefault, zAEQbTJ)).commitAllowingStateLoss();
        }
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) "success")) {
            ((InterfaceC31422lti) C43251rlk.copydefault(InterfaceC31422lti.class)).EZpvd(this);
            finish();
        } else {
            finish();
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lSX.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractActivityC30305lTl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC30305lTl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC30305lTl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC30305lTl, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
