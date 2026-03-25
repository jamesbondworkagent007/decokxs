package o;

import androidx.core.content.IntentCompat;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.TransactionDirection;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.laN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC30394laN extends AbstractActivityC30447lbN {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.laR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC30394laN.EZpvd(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm EZpvd = C31200lpY.getSourceType$default((android.app.Activity) this, false, 1, (java.lang.Object) null);

    /* JADX INFO: renamed from: o.laN$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.laN.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull android.app.Activity activity, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("extra_is_from_market", true);
            bundle.putInt("index", TransactionDirection.TransactionBuy.getValue());
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) ActivityC30394laN.class);
            C31200lpY.EZpvd(intent, str);
            intent.putExtra("trade_data", new TradeParam(C22380heK.OLrzqt.copydefault(str).fARcdN().copydefault(), str, new CoinInfo(str2, str3, false, (java.lang.String) null, 12, (DefaultConstructorMarker) null), new CoinInfo((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 15, (DefaultConstructorMarker) null), (java.lang.String) null, (java.lang.Integer) null, z ? "type_meme" : "", false, (java.lang.String) null, (java.lang.Boolean) null, false, str5, i, str4, 1968, (DefaultConstructorMarker) null));
            intent.putExtra("extra_bundle_common", bundle);
            activity.startActivity(intent);
        }
    }

    /* JADX DEBUG: Possible override for method o.lbN.KWHzl()V */
    public final TradeParam KWHzl() {
        return (TradeParam) this.copydefault.getValue();
    }

    public static final TradeParam EZpvd(ActivityC30394laN activityC30394laN) {
        android.content.Intent intent = activityC30394laN.getIntent();
        if (intent != null) {
            return (TradeParam) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "trade_data", TradeParam.class));
        }
        return null;
    }

    private final java.lang.String djBIcL() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    @Override // o.AbstractActivityC30447lbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C23274hvD.Activity.fARcdN);
        getSupportFragmentManager().beginTransaction().replace(C23274hvD.Application.zpGcln, DexHomeFragment.Companion.KWHzl(djBIcL(), KWHzl(), getIntent().getBundleExtra("extra_bundle_common"), true)).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.laT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC30394laN.OLrzqt(this.OLrzqt);
            }
        });
    }

    public static final void OLrzqt(ActivityC30394laN activityC30394laN) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC30394laN, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC30447lbN, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RxBus.AEQbTJ(new C22001hUf());
    }

    @Override // o.AbstractActivityC30447lbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC30447lbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC30447lbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC30447lbN, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
