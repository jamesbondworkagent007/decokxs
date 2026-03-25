package o;

import androidx.core.content.IntentCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedEvmSettingFragment;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedOtherChainSettingFragment;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSolSettingFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityC30838lih extends AbstractActivityC30851liu implements InterfaceC30853liw {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.lif
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC30838lih.KWHzl(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30853liw
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX DEBUG: Possible override for method o.liu.OLrzqt()V */
    public final AdvancedSettingsContract.Input OLrzqt() {
        return (AdvancedSettingsContract.Input) this.copydefault.getValue();
    }

    public static final AdvancedSettingsContract.Input KWHzl(ActivityC30838lih activityC30838lih) {
        android.content.Intent intent = activityC30838lih.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        return (AdvancedSettingsContract.Input) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "data", AdvancedSettingsContract.Input.class));
    }

    @Override // o.AbstractActivityC30851liu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.Fragment fragmentOLrzqt;
        AdvancedMainConfig config;
        AdvancedMainConfig config2;
        AdvancedSettingsContract.Input inputOLrzqt;
        AdvancedMainConfig config3;
        android.widget.TextView title;
        super.onCreate(bundle);
        setContentView(C23274hvD.Activity.DbNXlk);
        C33537myN c33537myN = (C33537myN) findViewById(C23274hvD.Application.fFgQHt);
        if (c33537myN != null && (title = c33537myN.getTitle()) != null) {
            TextViewCompat.setTextAppearance(title, C52761wXj.LoaderManager.DGOPHZ);
        }
        AdvancedSettingsContract.Input inputOLrzqt2 = OLrzqt();
        if (inputOLrzqt2 != null) {
            AdvancedSettingsContract.Input inputOLrzqt3 = OLrzqt();
            if (inputOLrzqt3 != null && (config2 = inputOLrzqt3.getConfig()) != null && !config2.getSupportCustomGasFee() && (inputOLrzqt = OLrzqt()) != null && (config3 = inputOLrzqt.getConfig()) != null && config3.isOtherChain()) {
                fragmentOLrzqt = AdvancedOtherChainSettingFragment.Companion.OLrzqt(inputOLrzqt2).AEQbTJ(this);
            } else {
                AdvancedSettingsContract.Input inputOLrzqt4 = OLrzqt();
                if (inputOLrzqt4 != null && (config = inputOLrzqt4.getConfig()) != null && config.isSOl()) {
                    fragmentOLrzqt = AdvancedSolSettingFragment.Companion.OLrzqt(inputOLrzqt2).KWHzl(this);
                } else {
                    fragmentOLrzqt = AdvancedEvmSettingFragment.Companion.copydefault(inputOLrzqt2).OLrzqt(this);
                }
            }
            getSupportFragmentManager().beginTransaction().replace(C23274hvD.Application.DcMfJKfwDlxl, fragmentOLrzqt).commitAllowingStateLoss();
        }
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.lii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC30838lih.copydefault(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(ActivityC30838lih activityC30838lih) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC30838lih, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.InterfaceC30853liw
    public void KWHzl(@NotNull AdvancedSettingsContract.Input input) {
        Intrinsics.checkNotNullParameter(input, "");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("result", input);
        pUU.copydefault("updateTransactionSetting", "MemeSettingActivity: slippageValue: >>>" + input.getSlippageValue() + "slippageFeeType >>> " + input.getSlippageFeeType() + "priorityValue >>>" + input.getPriorityValue() + "priorityFeeType >>> " + input.getPriorityFeeType() + "isOpenMev >>>" + input.isOpenMev() + "perTokenUsd >>> " + input.getPerTokenUsd() + "routerModeType >>> " + input.getRouterModeType());
        setResult(-1, intent);
        finish();
    }

    @Override // o.AbstractActivityC30851liu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC30851liu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC30851liu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC30851liu, o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
