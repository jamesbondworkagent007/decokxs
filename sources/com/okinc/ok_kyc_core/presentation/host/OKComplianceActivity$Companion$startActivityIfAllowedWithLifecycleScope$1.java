package com.okinc.ok_kyc_core.presentation.host;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.VirtualActionAppModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43728ruk;
import o.ActivityC42162rIq;
import o.C56391yDq;
import o.C56442yFn;
import o.rBG;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $activity;
    final /* synthetic */ ActivityResultLauncher<Intent> $activityResultLauncher;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ Function0<Unit> $nextActionCallback;
    final /* synthetic */ String $playbook;
    final /* synthetic */ HashMap<String, String> $playbookParams;
    final /* synthetic */ rBG $useCase;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$1(rBG rbg, String str, String str2, HashMap<String, String> map, Function0<Unit> function0, Context context, ActivityResultLauncher<Intent> activityResultLauncher, Continuation<? super OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$1> continuation) {
        super(2, continuation);
        this.$useCase = rbg;
        this.$playbook = str;
        this.$featureUri = str2;
        this.$playbookParams = map;
        this.$nextActionCallback = function0;
        this.$activity = context;
        this.$activityResultLauncher = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$1(this.$useCase, this.$playbook, this.$featureUri, this.$playbookParams, this.$nextActionCallback, this.$activity, this.$activityResultLauncher, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke$default;
        List<UIComponentAppModel> items;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rBG rbg = this.$useCase;
            String str = this.$playbook;
            String str2 = this.$featureUri;
            HashMap<String, String> map = this.$playbookParams;
            this.label = 1;
            objInvoke$default = rBG.Activity.invoke$default(rbg, str, str2, map, null, null, this, 24, null);
            if (objInvoke$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objInvoke$default = obj;
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objInvoke$default;
        Function0<Unit> function0 = this.$nextActionCallback;
        Context context = this.$activity;
        String str3 = this.$playbook;
        String str4 = this.$featureUri;
        HashMap<String, String> map2 = this.$playbookParams;
        ActivityResultLauncher<Intent> activityResultLauncher = this.$activityResultLauncher;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            if (onDemandKYCAppModel.getViewModel() instanceof VirtualActionAppModel) {
                PageComponentAppModel viewModel = onDemandKYCAppModel.getViewModel();
                Intrinsics.copydefault(viewModel, "");
                CtaAppModel cta = ((VirtualActionAppModel) viewModel).getCta();
                UIComponentAppModel uIComponentAppModel = (cta == null || (items = cta.getItems()) == null) ? null : items.get(0);
                CTAButtonAppModel cTAButtonAppModel = uIComponentAppModel instanceof CTAButtonAppModel ? (CTAButtonAppModel) uIComponentAppModel : null;
                if ((cTAButtonAppModel != null ? cTAButtonAppModel.getAction() : null) != ButtonAction.Exit) {
                    ActivityC42162rIq.TaskDescription.goActivity$default(ActivityC42162rIq.Companion, context, str3, str4, map2, onDemandKYCAppModel, activityResultLauncher, null, 64, null);
                } else if (function0 != null) {
                    function0.invoke();
                }
            }
        }
        Context context2 = this.$activity;
        String str5 = this.$playbook;
        String str6 = this.$featureUri;
        HashMap<String, String> map3 = this.$playbookParams;
        ActivityResultLauncher<Intent> activityResultLauncher2 = this.$activityResultLauncher;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ActivityC42162rIq.TaskDescription.goActivity$default(ActivityC42162rIq.Companion, context2, str5, str6, map3, null, activityResultLauncher2, null, 64, null);
        }
        return Unit.INSTANCE;
    }
}
