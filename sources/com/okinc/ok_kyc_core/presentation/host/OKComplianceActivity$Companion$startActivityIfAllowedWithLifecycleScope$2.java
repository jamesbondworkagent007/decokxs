package com.okinc.ok_kyc_core.presentation.host;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.ButtonAction;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CtaAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PageComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.PopUpComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradeActionParams;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpgradePopUpAppModel;
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
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC43728ruk;
import o.ActivityC42162rIq;
import o.C33129mqd;
import o.C43693ruB;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.rBG;
import o.rQZ;

/* JADX INFO: loaded from: classes10.dex */
public final class OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $activity;
    final /* synthetic */ ActivityResultLauncher<Intent> $activityResultLauncher;
    final /* synthetic */ Function0<Unit> $dismissLoadingCallback;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ String $playbook;
    final /* synthetic */ HashMap<String, String> $playbookParams;
    final /* synthetic */ rBG $useCase;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2(rBG rbg, String str, String str2, HashMap<String, String> map, Function0<Unit> function0, Context context, ActivityResultLauncher<Intent> activityResultLauncher, Continuation<? super OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2> continuation) {
        super(2, continuation);
        this.$useCase = rbg;
        this.$playbook = str;
        this.$featureUri = str2;
        this.$playbookParams = map;
        this.$dismissLoadingCallback = function0;
        this.$activity = context;
        this.$activityResultLauncher = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2 oKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2 = new OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2(this.$useCase, this.$playbook, this.$featureUri, this.$playbookParams, this.$dismissLoadingCallback, this.$activity, this.$activityResultLauncher, continuation);
        oKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2.L$0 = obj;
        return oKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKComplianceActivity$Companion$startActivityIfAllowedWithLifecycleScope$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objInvoke$default;
        ActionParams actionParams;
        List<UIComponentAppModel> items;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            rBG rbg = this.$useCase;
            String str = this.$playbook;
            String str2 = this.$featureUri;
            HashMap<String, String> map = this.$playbookParams;
            this.L$0 = coroutineScope;
            this.label = 1;
            objInvoke$default = rBG.Activity.invoke$default(rbg, str, str2, map, null, null, this, 24, null);
            if (objInvoke$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope = coroutineScope2;
            objInvoke$default = obj;
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objInvoke$default;
        Function0<Unit> function0 = this.$dismissLoadingCallback;
        Context context = this.$activity;
        String str3 = this.$playbook;
        String strEZpvd = this.$featureUri;
        HashMap<String, String> map2 = this.$playbookParams;
        ActivityResultLauncher<Intent> activityResultLauncher = this.$activityResultLauncher;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            OnDemandKYCAppModel onDemandKYCAppModel = (OnDemandKYCAppModel) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            if (!onDemandKYCAppModel.getOnDemandFeatureFlagEnabled() || onDemandKYCAppModel.getCompliant()) {
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (onDemandKYCAppModel.getViewModel() instanceof PopUpAppModel) {
                if (function0 != null) {
                    function0.invoke();
                }
                PageComponentAppModel viewModel = onDemandKYCAppModel.getViewModel();
                Intrinsics.copydefault(viewModel, "");
                PopUpComponentAppModel popUpComponentAppModel = ((PopUpAppModel) viewModel).getItems().get(0);
                if (popUpComponentAppModel instanceof UpgradePopUpAppModel) {
                    pUU.KWHzl("qjf", "OKComplianceActivity-->UpgradePopUpAppModel----------->");
                    UpgradeActionParams actionParams2 = ((UpgradePopUpAppModel) popUpComponentAppModel).getActionParams();
                    if (actionParams2 != null && (context instanceof FragmentActivity)) {
                        rQZ.KWHzl.OLrzqt((FragmentActivity) context, actionParams2);
                    }
                }
            } else if (onDemandKYCAppModel.getViewModel() instanceof VirtualActionAppModel) {
                PageComponentAppModel viewModel2 = onDemandKYCAppModel.getViewModel();
                Intrinsics.copydefault(viewModel2, "");
                CtaAppModel cta = ((VirtualActionAppModel) viewModel2).getCta();
                UIComponentAppModel uIComponentAppModel = (cta == null || (items = cta.getItems()) == null) ? null : items.get(0);
                CTAButtonAppModel cTAButtonAppModel = uIComponentAppModel instanceof CTAButtonAppModel ? (CTAButtonAppModel) uIComponentAppModel : null;
                if ((cTAButtonAppModel != null ? cTAButtonAppModel.getAction() : null) == ButtonAction.Onboarding) {
                    ActivityC42162rIq.TaskDescription taskDescription = ActivityC42162rIq.Companion;
                    String playbook = cTAButtonAppModel.getPlaybook();
                    if (playbook != null) {
                        str3 = playbook;
                    }
                    if (C33129mqd.OLrzqt((CharSequence) cTAButtonAppModel.getPlaybook())) {
                        String playbook2 = cTAButtonAppModel.getPlaybook();
                        if (playbook2 == null) {
                            playbook2 = "";
                        }
                        strEZpvd = taskDescription.EZpvd(playbook2);
                    }
                    if (C33129mqd.OLrzqt((CharSequence) cTAButtonAppModel.getPlaybook()) && ((actionParams = cTAButtonAppModel.getActionParams()) == null || (map2 = actionParams.getOnboarding()) == null)) {
                        map2 = new HashMap<>();
                    }
                    taskDescription.copydefault(context, str3, strEZpvd, (HashMap<String, String>) map2, (ActivityResultLauncher<Intent>) activityResultLauncher, (Function0<Unit>) ((64 & 32) != 0 ? null : function0), (Function0<Unit>) ((64 & 64) != 0 ? null : null));
                } else {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    ActivityC42162rIq.TaskDescription.goActivity$default(ActivityC42162rIq.Companion, context, str3, strEZpvd, map2, onDemandKYCAppModel, activityResultLauncher, null, 64, null);
                }
            } else {
                if (function0 != null) {
                    function0.invoke();
                }
                ActivityC42162rIq.TaskDescription.goActivity$default(ActivityC42162rIq.Companion, context, str3, strEZpvd, map2, onDemandKYCAppModel, activityResultLauncher, null, 64, null);
            }
        }
        Function0<Unit> function02 = this.$dismissLoadingCallback;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            String message = responseFailedException.getMessage();
            C43693ruB.EZpvd("KYC_Onboarding_Start_Error", message != null ? message : "");
            if (function02 != null) {
                function02.invoke();
            }
            pUU.copydefault("qjf", "OKComplianceActivity--getOnboardingInfo--fail = " + responseFailedException.getMessage() + ",isActive = " + CoroutineScopeKt.isActive(coroutineScope));
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                C55326xho.toast$default(responseFailedException.getMessage(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }
}
