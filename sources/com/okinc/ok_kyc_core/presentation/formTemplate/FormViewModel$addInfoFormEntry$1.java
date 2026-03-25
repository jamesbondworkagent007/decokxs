package com.okinc.ok_kyc_core.presentation.formTemplate;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import com.okinc.network.okg.response.ResponseFailedException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.AbstractC43728ruk;
import o.C41957rBa;
import o.C43734ruq;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.rBN;
import o.rGL;
import o.rQZ;

/* JADX INFO: loaded from: classes16.dex */
public final class FormViewModel$addInfoFormEntry$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ C41957rBa $form;
    final /* synthetic */ Map<String, String> $params;
    final /* synthetic */ String $successMessage;
    final /* synthetic */ String $url;
    final /* synthetic */ C52794wYp $view;
    int label;
    final /* synthetic */ rGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormViewModel$addInfoFormEntry$1(rGL rgl, String str, Map<String, String> map, C41957rBa c41957rBa, C52794wYp c52794wYp, FragmentActivity fragmentActivity, String str2, Continuation<? super FormViewModel$addInfoFormEntry$1> continuation) {
        super(2, continuation);
        this.this$0 = rgl;
        this.$url = str;
        this.$params = map;
        this.$form = c41957rBa;
        this.$view = c52794wYp;
        this.$activity = fragmentActivity;
        this.$successMessage = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FormViewModel$addInfoFormEntry$1(this.this$0, this.$url, this.$params, this.$form, this.$view, this.$activity, this.$successMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FormViewModel$addInfoFormEntry$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            rBN rbnKWHzl = this.this$0.QKVWgx().KWHzl();
            String str = this.$url;
            Map<String, String> map = this.$params;
            C41957rBa c41957rBa = this.$form;
            this.label = 1;
            obj = rbnKWHzl.copydefault(str, map, c41957rBa, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) obj;
        rGL rgl = this.this$0;
        C52794wYp c52794wYp = this.$view;
        FragmentActivity fragmentActivity = this.$activity;
        String str2 = this.$successMessage;
        if (abstractC43728ruk instanceof AbstractC43728ruk.ActionBar) {
            ArrayList arrayList = (ArrayList) ((AbstractC43728ruk.ActionBar) abstractC43728ruk).KWHzl();
            AbstractC42074rFj.cancelLoading$default(rgl, c52794wYp, fragmentActivity, false, 4, null);
            if (str2 != null) {
                C55326xho.toastWithSuccessfulIcon$default(str2, 0, 1, (Object) null);
            }
            rgl.zLjUOn.setValue(new C43734ruq(arrayList));
        }
        rGL rgl2 = this.this$0;
        C52794wYp c52794wYp2 = this.$view;
        FragmentActivity fragmentActivity2 = this.$activity;
        if (abstractC43728ruk instanceof AbstractC43728ruk.TaskDescription) {
            ResponseFailedException responseFailedException = (ResponseFailedException) ((AbstractC43728ruk.TaskDescription) abstractC43728ruk).OLrzqt();
            AbstractC42074rFj.cancelLoading$default(rgl2, c52794wYp2, fragmentActivity2, false, 4, null);
            if (responseFailedException.getCode() != 4595) {
                MutableLiveData newProxyInstance = rgl2.getNewProxyInstance();
                String message = responseFailedException.getMessage();
                if (message == null) {
                    message = "";
                }
                newProxyInstance.setValue(new C43734ruq(message));
            } else if (fragmentActivity2 != null) {
                rQZ.KWHzl.copydefault(fragmentActivity2, responseFailedException.getMessage());
            }
        }
        return Unit.INSTANCE;
    }
}
