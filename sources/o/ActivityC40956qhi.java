package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.TradingCalendarMonth;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.TradingCalendarGridVo;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC40956qhi;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC40956qhi extends AbstractActivityC40948qha {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public C42682ray djBIcL;

    /* JADX INFO: renamed from: o.qhi$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qhi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, @NotNull TradingCalendarMonth tradingCalendarMonth, @NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(tradingCalendarMonth, "");
            Intrinsics.checkNotNullParameter(activityResultLauncher, "");
            android.content.Intent intent = new android.content.Intent(fragmentActivity, (java.lang.Class<?>) ActivityC40956qhi.class);
            intent.putExtra("target_trading_calendar_month", tradingCalendarMonth.getIndex());
            activityResultLauncher.launch(intent);
        }

        public final ActivityResultLauncher<android.content.Intent> KWHzl(@NotNull FragmentActivity fragmentActivity, @NotNull final yHO<? super java.lang.Long, ? super TradingCalendarMonth, ? super java.util.List<TradingCalendarGridVo>, Unit> yho) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(yho, "");
            ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = fragmentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.qhj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(java.lang.Object obj) {
                    ActivityC40956qhi.Activity.OLrzqt(yho, (ActivityResult) obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
            return activityResultLauncherRegisterForActivityResult;
        }

        public static final void OLrzqt(yHO yho, ActivityResult activityResult) {
            android.content.Intent data;
            if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
                return;
            }
            long longExtra = data.getLongExtra("selected_day_timestamp", 0L);
            java.io.Serializable serializableExtra = data.getSerializableExtra("selected_trading_calendar_month");
            TradingCalendarMonth tradingCalendarMonth = serializableExtra instanceof TradingCalendarMonth ? (TradingCalendarMonth) serializableExtra : null;
            if (tradingCalendarMonth == null) {
                tradingCalendarMonth = TradingCalendarMonth.CURRENT_MONTH;
            }
            java.util.List parcelableArrayListExtra = data.getParcelableArrayListExtra("trading_calendar_day_list");
            if (parcelableArrayListExtra == null) {
                parcelableArrayListExtra = yDY.AhwBna();
            }
            yho.invoke(java.lang.Long.valueOf(longExtra), tradingCalendarMonth, parcelableArrayListExtra);
        }
    }

    @Override // o.AbstractActivityC40948qha, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C42682ray c42682rayKWHzl = C42682ray.KWHzl(getLayoutInflater());
        this.djBIcL = c42682rayKWHzl;
        if (c42682rayKWHzl == null) {
            Intrinsics.gEmmrt("");
            c42682rayKWHzl = null;
        }
        setContentView(c42682rayKWHzl.getRoot());
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = qZH.StateListAnimator.fXYAwm;
        C40925qhD c40925qhD = new C40925qhD();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putLong("target_trading_calendar_month", getIntent().getLongExtra("target_trading_calendar_month", 0L));
        c40925qhD.setArguments(bundle2);
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(i, c40925qhD).commitAllowingStateLoss();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractActivityC33041mov, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // o.AbstractActivityC40948qha, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC40948qha, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC40948qha, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC40948qha, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
