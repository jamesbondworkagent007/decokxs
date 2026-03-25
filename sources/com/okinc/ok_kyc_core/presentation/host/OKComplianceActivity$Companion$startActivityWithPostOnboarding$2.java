package com.okinc.ok_kyc_core.presentation.host;

import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.FormAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradeActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradePopUpAppModel;
import com.okinc.ok_kyc_core_api.model.CompliancePostOnboardingModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC43728ruk;
import o.ActivityC42162rIq;
import o.C43693ruB;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.rBJ;
import o.rQZ;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceActivity$Companion$startActivityWithPostOnboarding$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ActivityResultLauncher<Intent> $activityResultLauncher;
    final /* synthetic */ Function0<Unit> $dismissLoadingCallback;
    final /* synthetic */ CompliancePostOnboardingModel $model;
    final /* synthetic */ Map<String, Object> $pageParams;
    final /* synthetic */ Map<String, String> $postMap;
    final /* synthetic */ rBJ $useCase;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceActivity$Companion$startActivityWithPostOnboarding$2(rBJ rbj, CompliancePostOnboardingModel compliancePostOnboardingModel, Map<String, String> map, Map<String, ? extends Object> map2, Function0<Unit> function0, FragmentActivity fragmentActivity, ActivityResultLauncher<Intent> activityResultLauncher, Continuation<? super OKComplianceActivity$Companion$startActivityWithPostOnboarding$2> continuation) {
        super(2, continuation);
        this.$useCase = rbj;
        this.$model = compliancePostOnboardingModel;
        this.$postMap = map;
        this.$pageParams = map2;
        this.$dismissLoadingCallback = function0;
        this.$activity = fragmentActivity;
        this.$activityResultLauncher = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKComplianceActivity$Companion$startActivityWithPostOnboarding$2 oKComplianceActivity$Companion$startActivityWithPostOnboarding$2 = new OKComplianceActivity$Companion$startActivityWithPostOnboarding$2(this.$useCase, this.$model, this.$postMap, this.$pageParams, this.$dismissLoadingCallback, this.$activity, this.$activityResultLauncher, continuation);
        oKComplianceActivity$Companion$startActivityWithPostOnboarding$2.L$0 = obj;
        return oKComplianceActivity$Companion$startActivityWithPostOnboarding$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceActivity$Companion$startActivityWithPostOnboarding$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objInvoke$default;
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            rBJ rbj = this.$useCase;
            String playbook = this.$model.getPlaybook();
            String strEZpvd = ActivityC42162rIq.Companion.EZpvd(this.$model.getPlaybook());
            String target = this.$model.getTarget();
            Map<String, String> map = this.$postMap;
            String id = this.$model.getId();
            Map<String, Object> map2 = this.$pageParams;
            HashMap<String, String> playbookParams = this.$model.getPlaybookParams();
            this.L$0 = coroutineScope2;
            this.label = 1;
            coroutineScope = coroutineScope2;
            objInvoke$default = rBJ.StateListAnimator.invoke$default(rbj, playbook, strEZpvd, target, map, id, map2, playbookParams, null, null, this, MLKEMEngine.KyberPolyBytes, null);
            if (objInvoke$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope = coroutineScope3;
            objInvoke$default = obj;
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objInvoke$default;
        Function0<Unit> function0 = this.$dismissLoadingCallback;
        FragmentActivity fragmentActivity = this.$activity;
        CompliancePostOnboardingModel compliancePostOnboardingModel = this.$model;
        ActivityResultLauncher<Intent> activityResultLauncher = this.$activityResultLauncher;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            if (onDemandKYCAppModel.getOnDemandFeatureFlagEnabled()) {
                if (onDemandKYCAppModel.getViewModel() instanceof PopUpAppModel) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    PageComponentAppModel viewModel = onDemandKYCAppModel.getViewModel();
                    Intrinsics.copydefault(viewModel, "");
                    PopUpComponentAppModel popUpComponentAppModel = ((PopUpAppModel) viewModel).getItems().get(0);
                    if (popUpComponentAppModel instanceof UpgradePopUpAppModel) {
                        pUU.KWHzl("qjf", "OKComplianceActivity-->UpgradePopUpAppModel----------->");
                        UpgradeActionParams actionParams = ((UpgradePopUpAppModel) popUpComponentAppModel).getActionParams();
                        if (actionParams != null) {
                            rQZ.KWHzl.OLrzqt(fragmentActivity, actionParams);
                        }
                    }
                } else {
                    if (onDemandKYCAppModel.getViewModel() instanceof FormAppModel) {
                        PageComponentAppModel viewModel2 = onDemandKYCAppModel.getViewModel();
                        Intrinsics.copydefault(viewModel2, "");
                        if (((FormAppModel) viewModel2).getCanGoBack() == null) {
                            PageComponentAppModel viewModel3 = onDemandKYCAppModel.getViewModel();
                            Intrinsics.copydefault(viewModel3, "");
                            ((FormAppModel) viewModel3).setCanGoBack(C56443yFo.KWHzl(true));
                        }
                    }
                    if (function0 != null) {
                        function0.invoke();
                    }
                    ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                    taskDescription.OLrzqt(fragmentActivity, compliancePostOnboardingModel.getPlaybook(), taskDescription.EZpvd(compliancePostOnboardingModel.getPlaybook()), compliancePostOnboardingModel.getPlaybookParams(), onDemandKYCAppModel, activityResultLauncher, C56443yFo.KWHzl(true));
                }
            } else if (function0 != null) {
                function0.invoke();
            }
        }
        Function0<Unit> function02 = this.$dismissLoadingCallback;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            String message2 = responseFailedException.getMessage();
            C43693ruB.EZpvd("KYC_Onboarding_Start_Error", message2 != null ? message2 : "");
            if (function02 != null) {
                function02.invoke();
            }
            pUU.copydefault("qjf", "OKComplianceActivity--getOnboardingInfo--fail = " + responseFailedException.getMessage() + ",isActive = " + CoroutineScopeKt.isActive(coroutineScope));
            if (CoroutineScopeKt.isActive(coroutineScope) && (message = responseFailedException.getMessage()) != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
