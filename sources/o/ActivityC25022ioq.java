package o;

import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.DeFiPlatformSelectionSource;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionActivity$onCreate$fragment$1;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ioq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC25022ioq extends AbstractActivityC25025iot {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.ioq$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ioq.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final android.content.Intent AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, V6QuoteRequestWrapper v6QuoteRequestWrapper, V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull DeFiPlatformSelectionSource deFiPlatformSelectionSource, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(deFiPlatformSelectionSource, "");
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, ActivityC25022ioq.class);
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putString("selected_de_fi_platform_id", str2);
            bundle.putString("selected_de_fi_platform_name", str3);
            if (v6QuoteRequestWrapper != null) {
                bundle.putParcelable("quote_price_request_object", v6QuoteRequestWrapper);
            }
            if (v6BaseQuoteResponse != null) {
                bundle.putParcelable("quote_price_response_object", v6BaseQuoteResponse);
            }
            bundle.putSerializable("de_fi_platform_selection_source", deFiPlatformSelectionSource);
            bundle.putBoolean("is_using_smart_account", z);
            intent.putExtras(bundle);
            return intent;
        }
    }

    @Override // o.AbstractActivityC25025iot, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C23274hvD.Activity.AEQbTJ);
        getSupportFragmentManager().beginTransaction().replace(C23274hvD.Application.zlzhuY, OneSwapV6DeFiPlatformSelectionFragment.Companion.EZpvd(getIntent().getExtras(), new OneSwapV6DeFiPlatformSelectionActivity$onCreate$fragment$1(this))).commitAllowingStateLoss();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.ioy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC25022ioq.KWHzl(this.KWHzl);
            }
        });
    }

    public static final void KWHzl(ActivityC25022ioq activityC25022ioq) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC25022ioq, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ void onSelectDeFiPlatform$default(ActivityC25022ioq activityC25022ioq, java.lang.String str, java.lang.String str2, V6BaseQuoteResponse v6BaseQuoteResponse, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        activityC25022ioq.OLrzqt(str, str2, v6BaseQuoteResponse, z);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, V6BaseQuoteResponse v6BaseQuoteResponse, boolean z) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("selected_de_fi_platform_id", str);
        intent.putExtra("selected_de_fi_platform_name", str2);
        if (!(v6BaseQuoteResponse instanceof android.os.Parcelable)) {
            v6BaseQuoteResponse = null;
        }
        intent.putExtra("quote_response_from_provider_list", v6BaseQuoteResponse);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        if (z) {
            finish();
        }
    }

    @Override // o.AbstractActivityC25025iot, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC25025iot, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC25025iot, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC25025iot, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
