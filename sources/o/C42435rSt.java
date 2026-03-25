package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import com.okinc.assets.api.model.satoshitest.SatoshiTestPageArgs;
import com.okinc.ok_kyc_core_api.ComplianceFlowStatus;
import com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rSt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42435rSt {
    public static ActivityResultLauncher<android.content.Intent> OLrzqt;
    public static final C42435rSt KWHzl = new C42435rSt();
    public static final int copydefault = 8;

    private C42435rSt() {
    }

    public final void EZpvd(android.app.Activity activity, long j, @NotNull CompliancePostOnboardingModel compliancePostOnboardingModel) {
        Intrinsics.checkNotNullParameter(compliancePostOnboardingModel, "");
        if (activity == null) {
            return;
        }
        SatoshiTestPageArgs satoshiTestPageArgs = new SatoshiTestPageArgs(j, compliancePostOnboardingModel.getPlaybook(), compliancePostOnboardingModel.getPlaybookParams(), compliancePostOnboardingModel.getTarget(), compliancePostOnboardingModel.getCtaValue(), compliancePostOnboardingModel.getId());
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = OLrzqt;
        if (activityResultLauncher != null) {
            ((InterfaceC8224ayh) C43248rlh.KWHzl.AEQbTJ(InterfaceC8224ayh.class)).KWHzl(activity, satoshiTestPageArgs, activityResultLauncher);
        }
    }

    public final void KWHzl(@NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        OLrzqt = fragmentActivity.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.rSv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C42435rSt.EZpvd(fragmentActivity, (ActivityResult) obj);
            }
        });
    }

    public static final void EZpvd(FragmentActivity fragmentActivity, ActivityResult activityResult) {
        android.content.Intent data;
        java.io.Serializable serializableExtra;
        if (activityResult.getResultCode() == -1 && (data = activityResult.getData()) != null && (serializableExtra = data.getSerializableExtra("kyc_flow_result_status_data")) != null && (serializableExtra instanceof ComplianceFlowStatus) && serializableExtra == ComplianceFlowStatus.Close) {
            android.content.Intent intent = new android.content.Intent();
            android.content.Intent data2 = activityResult.getData();
            Intrinsics.copydefault(data2);
            intent.putExtras(data2);
            fragmentActivity.setResult(-1, intent);
            fragmentActivity.finish();
        }
    }

    public final void KWHzl() {
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = OLrzqt;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
        }
        OLrzqt = null;
    }
}
