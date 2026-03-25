package com.okinc.ok_kyc_core.impl;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.ok_kyc_core.impl.OKComplianceServiceImpl$showPermissionConsent$1;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o.C54819xWm;
import o.pUU;
import o.rCC;
import o.rCV;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceServiceImpl$showPermissionConsent$1 extends RxBus.EventCallback<String> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ActivityResultLauncher<Intent> $activityResultLauncher;
    final /* synthetic */ rCV this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceServiceImpl$showPermissionConsent$1(rCV rcv, FragmentActivity fragmentActivity, ActivityResultLauncher<Intent> activityResultLauncher) {
        super(rcv);
        this.this$0 = rcv;
        this.$activity = fragmentActivity;
        this.$activityResultLauncher = activityResultLauncher;
    }

    /* JADX DEBUG: Method merged with bridge method: onEvent(Ljava/lang/Object;)V */
    @Override // com.okinc.rxutils.RxBus.EventCallback
    public void onEvent(String str) {
        pUU.KWHzl("OKComplianceServiceImpl", "showPermissionConsent | EVENT_HOME_PAGE_CREATED received");
        final FragmentActivity fragmentActivity = this.$activity;
        if (fragmentActivity == null) {
            Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
            fragmentActivity = activityAEQbTJ instanceof FragmentActivity ? (FragmentActivity) activityAEQbTJ : null;
        }
        if (fragmentActivity != null) {
            rCV rcv = this.this$0;
            final ActivityResultLauncher<Intent> activityResultLauncher = this.$activityResultLauncher;
            rcv.KWHzl.copydefault(fragmentActivity, new Function0() { // from class: o.rDD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKComplianceServiceImpl$showPermissionConsent$1.onEvent$lambda$1$lambda$0(fragmentActivity, activityResultLauncher);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onEvent$lambda$1$lambda$0(FragmentActivity fragmentActivity, ActivityResultLauncher activityResultLauncher) {
        rCC.copydefault.copydefault(fragmentActivity, (ActivityResultLauncher<Intent>) activityResultLauncher);
        return Unit.INSTANCE;
    }
}
