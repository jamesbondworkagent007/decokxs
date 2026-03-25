package com.okinc.ok_kyc_core.presentation.processing;

import androidx.lifecycle.MutableLiveData;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43728ruk;
import o.C41957rBa;
import o.C43693ruB;
import o.C43700ruI;
import o.C43734ruq;
import o.C56391yDq;
import o.C56442yFn;
import o.rBJ;
import o.rIM;

/* JADX INFO: loaded from: classes16.dex */
public final class ProcessingViewModel$postProcessing$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $ctaValue;
    final /* synthetic */ String $featureUri;
    final /* synthetic */ String $id;
    final /* synthetic */ HashMap<String, String> $params;
    final /* synthetic */ String $playbook;
    final /* synthetic */ String $target;
    int label;
    final /* synthetic */ rIM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProcessingViewModel$postProcessing$1(rIM rim, String str, String str2, String str3, Map<String, String> map, String str4, HashMap<String, String> map2, Continuation<? super ProcessingViewModel$postProcessing$1> continuation) {
        super(2, continuation);
        this.this$0 = rim;
        this.$playbook = str;
        this.$featureUri = str2;
        this.$target = str3;
        this.$ctaValue = map;
        this.$id = str4;
        this.$params = map2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProcessingViewModel$postProcessing$1(this.this$0, this.$playbook, this.$featureUri, this.$target, this.$ctaValue, this.$id, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProcessingViewModel$postProcessing$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rBJ rbjFARcdN = this.this$0.fARcdN();
            String str = this.$playbook;
            String str2 = this.$featureUri;
            String str3 = this.$target;
            Map<String, String> map = this.$ctaValue;
            String str4 = this.$id;
            C41957rBa c41957rBa = new C41957rBa();
            HashMap<String, String> map2 = this.$params;
            this.label = 1;
            objInvoke$default = rBJ.StateListAnimator.invoke$default(rbjFARcdN, str, str2, str3, map, str4, c41957rBa, map2, null, null, null, null, this, 1920, null);
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
        rIM rim = this.this$0;
        String str5 = this.$playbook;
        HashMap<String, String> map3 = this.$params;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            rim.iwGUEr().setValue(new C43734ruq(new Pair(new C43700ruI((OnDemandKYCAppModel) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl(), str5, null, map3, NavOptions.PopUtilDifferentDestination, null, 32, null), null)));
        }
        rIM rim2 = this.this$0;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            String message = responseFailedException.getMessage();
            if (message == null) {
                message = "";
            }
            C43693ruB.EZpvd("KYC_Onboarding_Processing_Error", message);
            MutableLiveData newProxyInstance = rim2.getNewProxyInstance();
            String message2 = responseFailedException.getMessage();
            newProxyInstance.setValue(new C43734ruq(message2 != null ? message2 : ""));
        }
        return Unit.INSTANCE;
    }
}
