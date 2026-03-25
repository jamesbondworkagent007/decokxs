package o;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C51665vrM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vrh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC51686vrh extends AbstractActivityC51684vrf<AbstractC48310uMt, MyBotPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.DbNXlk;
    }

    /* JADX INFO: renamed from: o.vrh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vrh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void EZpvd(@NotNull android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(str4, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51686vrh.class);
            intent.putExtra(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, str);
            intent.putExtra("bot_total_assets", str2);
            intent.putExtra("location", str3);
            intent.putExtra(AppsFlyerProperties.CHANNEL, str4);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC51684vrf, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            C51665vrM.StateListAnimator stateListAnimator = C51665vrM.Companion;
            java.lang.String stringExtra = getIntent().getStringExtra(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER);
            java.lang.String stringExtra2 = getIntent().getStringExtra("bot_total_assets");
            java.lang.String stringExtra3 = getIntent().getStringExtra("location");
            java.lang.String stringExtra4 = getIntent().getStringExtra(AppsFlyerProperties.CHANNEL);
            if (stringExtra4 == null) {
                stringExtra4 = "";
            }
            getSupportFragmentManager().beginTransaction().replace(C48033uCm.Application.ComponentActivity22, C51665vrM.StateListAnimator.newInstance$default(stateListAnimator, stringExtra, stringExtra2, stringExtra3, stringExtra4, false, 16, null)).commitNow();
        }
    }

    @Override // o.AbstractActivityC51684vrf, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC51684vrf, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC51684vrf, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC51684vrf, o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
